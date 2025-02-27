//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.util;

import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.sql.*;
//import java.net.*;
//import javax.net.ssl.*;
//import java.security.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.awt.*;
//import javax.swing.*;

import com.esarks.jac.*;
import com.esarks.mic.*;

import  java.util.*;
//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class DateTime extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected DateTime() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public DateTime(Script aScript) {

    super(aScript);

  }

//$Section=definitions$Preserve=yes
    /**
     * Creates a date represented by the given year, month and day.
     *
     * @param year The year of the date to create
     * @param month The month of the date to create (1 = January, 12 = December)
     * @param dayOfMonth The day of the month of the date to create.
     * @throws IllegalArgumentException if the year, month and dayOfMonth
     * combination are not valid in a Gregorian calendar.
     */
    public DateTime(int year, int month, int dayOfMonth)
    {
        this(year, month, dayOfMonth, false);
    }

    /**
     * Creates a DateTime representing the date in the given timezone
     * at the given instant in time.
     * <p>
     * <b>Think carefully about what timezone to use!</b>  Often you will
     * want to use the timezone of the 'user' - which is not always represented
     * by <code>TimeZone.getDefault()</code>
     *
     * @param tzone The timezone to be considered
     * @param instantInTime The instant in time to be considered
     * @throws IllegalArgumentException if the instant in time is out of range
     *   in the given timezone
     * @see #isOutsideRange(TimeZone, Date)
     */
    public DateTime(TimeZone tzone, java.util.Date instantInTime)
    {
        GregorianCalendar cal = new GregorianCalendar(tzone);
        cal.setTime(instantInTime);
        init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
    }

    public DateTime(java.util.Date instantInTime, Locale locale)
    {
        GregorianCalendar cal = new GregorianCalendar(locale);
        cal.setTime(instantInTime);
        init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
    }

    public DateTime(java.util.Date instantInTime)
    {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(instantInTime);
        init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
    }

    public DateTime(long lMillisOffsetFromNOW)
    {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis((new java.util.Date()).getTime() + lMillisOffsetFromNOW);
        init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
    }

    /**
     *
     * @param year
     * @param month
     * @param dayOfMonth
     * @param lenient
     */
    private DateTime(int year, int month, int dayOfMonth, boolean lenient)
    {
        if (!lenient)
        {
            checkValidYearMonthDay(year, month, dayOfMonth);
        }
        init(year, month, dayOfMonth);
    }

    /**
     * Creates a DateTime representing the current date in the given
     * timezone. Equivalent to <code>DateTime(tzone, new Date())</code>
     * @param tzone The timezone to be considered

     */
    public DateTime(TimeZone tzone)
    {
        this(tzone, new java.util.Date());
    }

    public static final long MILLIS_IN_DAY = 1000 * 60 * 60 * 24;

    public static final long MILLIS_IN_HOUR = 1000 * 60 * 60;

    public static final long MILLIS_IN_MINUTE = 1000 * 60;

    /** The value returned by getDayOfWeek() representing Sunday */
    public static final int SUNDAY = 1;

    /** The value returned by getDayOfWeek() representing Monday */
    public static final int MONDAY = 2;

    /** The value returned by getDayOfWeek() representing Tuesday */
    public static final int TUESDAY = 3;

    /** The value returned by getDayOfWeek() representing Wednesday */
    public static final int WEDNESDAY = 4;

    /** The value returned by getDayOfWeek() representing Thursday */
    public static final int THURSDAY = 5;

    /** The value returned by getDayOfWeek() representing Friday */
    public static final int FRIDAY = 6;

    /** The value returned by getDayOfWeek() representing Saturday */
    public static final int SATURDAY = 7;

    /** The value returned by getMonth() representing January */
    public static final int JANUARY = 1;

    /** The value returned by getMonth() representing February */
    public static final int FEBRUARY = 2;

    /** The value returned by getMonth() representing March */
    public static final int MARCH = 3;

    /** The value returned by getMonth() representing April */
    public static final int APRIL = 4;

    /** The value returned by getMonth() representing May */
    public static final int MAY = 5;

    /** The value returned by getMonth() representing June */
    public static final int JUNE = 6;

    /** The value returned by getMonth() representing July */
    public static final int JULY = 7;

    /** The value returned by getMonth() representing August */
    public static final int AUGUST = 8;

    /** The value returned by getMonth() representing September */
    public static final int SEPTEMBER = 9;

    /** The value returned by getMonth() representing October */
    public static final int OCTOBER = 10;

    /** The value returned by getMonth() representing November */
    public static final int NOVEMBER = 11;

    /** The value returned by getMonth() representing December */
    public static final int DECEMBER = 12;

    /** Days since 1 Jan, 1 A.D., or -1 if not calculated yet */
    private transient int daysSinceEpoch = -1;

    /**
     * The calendar holding year, month and day values.
     * Other properties of this class aren't used
     */
    private transient GregorianCalendar calendar;

    /**
     * The number of days in the year up to (but not including) a month.
     */
    private static final int[] cumulDaysToMonth =
        { 0, // Jan
                31, // Feb
                59, // Mar
                90, // Apr
                120, // May
                151, // Jun
                181, // Jul
                212, // Aug
                243, // Sep
                273, // Oct
                304, // Nov
                334 // Dec
        };

    private static final int[] daysInMonth =
        { 31, // Jan
                28, // Feb
                31, // Mar
                30, // Apr
                31, // May
                30, // Jun
                31, // Jul
                31, // Aug
                30, // Sep
                31, // Oct
                30, // Nov
                31, // Dec
        };

    public static final DateTime EARLIEST = new DateTime(1600, 1, 1);

    public static final DateTime LATEST = new DateTime(2999, 12, 31);

    /**
     * @param szDate
     * @return
     */
    public static java.util.Date GetDate(String szDate)
    {
        return GetDate(szDate , new java.util.Date(0));
    }

    /**
     * @param szDate
     * @param szFormat
     * @param dtDefaultDate
     * @return
     */
    public static java.util.Date GetDate(String szDate, String szFormat, java.util.Date dtDefaultDate)
    {
        DateFormat dtFormat = new SimpleDateFormat(szFormat);
        java.util.Date newDate = null;
        try
        {
             newDate = dtFormat.parse(szDate);
        }
        catch (java.text.ParseException e)
        {
             newDate = dtDefaultDate;
        }

        return newDate;
    }

    /**
     * @param szDate
     * @param szFormat
     * @param dtDefaultDate
     * @return
     */
    public static DateTime GetDateTime(String szDate, String szFormat, java.util.Date dtDefaultDate)
    {
        java.util.Date tmpDate = GetDate(szDate,szFormat,dtDefaultDate);

        DateTime retVal = null;

        if (tmpDate != null)
        {
            retVal = new DateTime(tmpDate);
        }

        return retVal;
    }

    /**
     * @param szDate
     * @param dtDefaultDate
     * @return
     */
    public static java.util.Date GetDate(String szDate, java.util.Date dtDefaultDate)
    {
        PropertyValue objDateProp = null;

        try
        {
            objDateProp = new PropertyValue("date:yyyyMMdd", szDate);
            java.util.Date tmpDate = objDateProp.getValueDate();
            return tmpDate;
        }
        catch (Exception e)
        {
            return dtDefaultDate;
        }
    }

    /**
     * @param szDate
     * @return
     */
    public static DateTime GetDateTime(String szDate)
    {
        return GetDateTime(szDate , new DateTime(0));
    }

    /**
     * @param szDate
     * @param dtDefaultDate
     * @return
     */
    public static DateTime GetDateTime(String szDate , DateTime dtDefaultDate)
    {
        PropertyValue objDateProp = null;

        try
        {
            objDateProp = new PropertyValue("date:yyyyMMdd", szDate);
            java.util.Date tmpDate = objDateProp.getValueDate();
            return new DateTime(tmpDate);
        }
        catch (Exception e)
        {
            return dtDefaultDate;
        }
    }

    /**
     * Compares if date is inbetween two dates,including those dates
     * @param testDate
     * @param intervalBegin
     * @param intervalEnd
     * @return True/False
     */
    public static boolean IsDateBetween(String testDate, java.util.Date intervalBegin, java.util.Date intervalEnd) throws Exception
    {
        return IsDateBetween(GetDate(testDate), intervalBegin, intervalEnd);
    }

    /**
     * @param testDate
     * @param intervalBegin
     * @param intervalEnd
     * @return
     */
    public static boolean IsDateBetween(java.util.Date testDate, java.util.Date intervalBegin, java.util.Date intervalEnd)
    {
        return ((testDate.compareTo(intervalBegin) >= 0) && (testDate.compareTo(intervalEnd) <= 0));
    }

    /**
     * @param testDate
     * @param intervalBegin
     * @param intervalLengthDays
     * @param bUseWholeDays
     * @return
     */
    public static boolean IsDateBetween(java.util.Date testDate, java.util.Date intervalBegin, int intervalLengthDays, boolean bUseWholeDays)
    {
        java.util.Date intervalEnd = AddDays(intervalBegin, intervalLengthDays, bUseWholeDays);

        return ((testDate.compareTo(intervalBegin) >= 0) && (testDate.compareTo(intervalEnd) <= 0));
    }

    /**
     * @param testDate
     * @param intervalBegin
     * @param intervalLengthDays
     * @param bUseWholeDays
     * @return
     * @throws Exception
     */
    public static boolean IsDateBetween(String testDate, java.util.Date intervalBegin, int intervalLengthDays, boolean bUseWholeDays) throws Exception
    {
        return IsDateBetween(GetDate(testDate), intervalBegin, intervalLengthDays, bUseWholeDays);
    }

    /**
     * @param testDate
     * @param intervalBegin
     * @param intervalEnd
     * @return
     */
    public static boolean IsDateBetween(String testDate, DateTime intervalBegin, DateTime intervalEnd)
    {
        return IsDateBetween(GetDateTime(testDate), intervalBegin, intervalEnd);
    }

    /**
     * @param testDate
     * @param intervalBegin
     * @param intervalEnd
     * @return
     */
    public static boolean IsDateBetween(DateTime testDate,  DateTime intervalBegin,  DateTime intervalEnd)
    {
        return ((testDate.compareTo(intervalBegin) >= 0) && (testDate.compareTo(intervalEnd) <= 0));
    }

    /**
     * @param testDate
     * @param intervalBegin
     * @param intervalLengthDays
     * @return
     */
    public static boolean IsDateBetween(DateTime testDate, DateTime intervalBegin, int intervalLengthDays)
    {
        DateTime intervalEnd = intervalBegin.addDays(intervalLengthDays);

        return ((testDate.compareTo(intervalBegin) >= 0) && (testDate.compareTo(intervalEnd) <= 0));
    }

    /**
     * @param testDate
     * @param intervalBegin
     * @param intervalLengthDays
     * @return
     */
    public static boolean IsDateBetween(String testDate,  DateTime intervalBegin, int intervalLengthDays)
    {
        return IsDateBetween(GetDateTime(testDate), intervalBegin, intervalLengthDays);
    }

    /**
     * @param startDate
     * @param iDaysToAdd
     * @param bUseWholeDays
     * @return
     */
    public static java.util.Date AddDays(java.util.Date startDate, int iDaysToAdd, boolean bUseWholeDays)
    {
        Calendar lCalendar = GregorianCalendar.getInstance();

        if (bUseWholeDays)
        {
            lCalendar.set(startDate.getYear() + 1900, startDate.getMonth(), startDate.getDate(), 0, 0, 0);
        }
        else
        {
            lCalendar.setTime(startDate);
        }

        lCalendar.add(Calendar.DATE, iDaysToAdd);

        return lCalendar.getTime();
    }

    /**
     * Returns true if the given instant in time is before EARLIEST or after LATEST in the
     * given timezone.
     */
    public static boolean isOutsideRange(TimeZone tzone, java.util.Date instantInTime)
    {
        GregorianCalendar cal = new GregorianCalendar(tzone);
        cal.setTime(instantInTime);
        return yearOutOfRange(cal.get(Calendar.YEAR));
    }

    /**
     * @param year
     * @param month
     * @param dayOfMonth
     */
    private void init(int year, int month, int dayOfMonth)
    {
        calendar = new GregorianCalendar(year, month - 1, dayOfMonth);
        if (yearOutOfRange(getYear()))
        {
            throw new IllegalArgumentException("Date year out of range: " + year);
        }
    }

    /**
     * @param year
     * @return
     */
    private static boolean yearOutOfRange(int year)
    {
        return (year < 1600) || (year >= 3000);
    }

    /**
     * Throws an exception if the input isn't a valid day in the Gregorian
     * Calendar
     */
    private void checkValidYearMonthDay(int year, int month, int dayOfMonth)
    {
        if ((dayOfMonth == 29) && (month == 2) && isLeapYear(year))
        {
            return;
        }
        if ((month <= 0) || (month > 12))
        {
            throw new IllegalArgumentException("Invalid month: " + month);
        }
        if ((dayOfMonth <= 0) || (dayOfMonth > daysInMonth[month - 1]))
        {
            throw new IllegalArgumentException("Year/month/day combination " + " is invalid: " + year + "/" + month + "/" + dayOfMonth);
        }
    }

    /**
     * The day of the month
     * @return The day of the month (in range 1 to 31)
     */
    public synchronized int getDayOfMonth()
    {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * The day of the week for this date
     * @return Day of week in range 1 (Sunday) to 7 (Saturday)
     */
    public synchronized int getDayOfWeek()
    {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * The month of this date
     * @return Month in range 1 to 12
     */
    public synchronized int getMonth()
    {
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * The year of this date
     * @return The year
     */
    public synchronized int getYear()
    {
        return calendar.get(Calendar.YEAR);
    }

    /**
     * Returns a new date which is this date offset by numDays.
     * @param numDays the number of days to be added to this date
     * (can be negative)
     * @return A new date offset by numDays
     * @throws IllegalArgumentException if the resulting day would be before
     * EARLIEST or after LATEST.  That is,
     * if numDays &lt; this.daysUntil(EARLIEST)
     * or numDays &gt; this.daysUntil(LATEST)
     */
    public DateTime addDays(int numDays)
    {
        return new DateTime(getYear(), getMonth(), getDayOfMonth() + numDays, true);
    }

    /**
     * Returns the number of days until the given date
     * @param otherDay The date to compare to
     * @return The number of days until otherDay (can be negative)
     */
    public int daysUntil(DateTime otherDay)
    {
        return otherDay.getDaysSinceEpoch() - this.getDaysSinceEpoch();
    }

    /**
     * Returns the number of days until the given date
     * @param otherDay The date to compare to
     * @return The number of days until otherDay (can be negative)
     */
    public int daysUntil(java.util.Date otherDay)
    {
        return (new DateTime(otherDay)).getDaysSinceEpoch() - this.getDaysSinceEpoch();
    }

    /**
     * Returns the number of month changes until the given day.  Note that
     * this means there is just one 'month' between 1 November
     * and 31 December.
     *
     * @param otherDay The date to compare to
     * @return The number of month changes until the given day
     */
    public int monthsUntil(DateTime otherDay)
    {
        return (otherDay.getMonth() - this.getMonth()) + (12 * (otherDay.getYear() - this.getYear()));
    }

    /**
     * Days since epoch (1 Jan, 1 A.D.)
     */
    private synchronized int getDaysSinceEpoch()
    {
        if (daysSinceEpoch == -1)
        {
            int year = getYear();
            int month = getMonth();
            int daysThisYear = cumulDaysToMonth[month - 1] + getDayOfMonth() - 1;
            if ((month > 2) && isLeapYear(year))
            {
                daysThisYear++;
            }

            daysSinceEpoch = daysToYear(year) + daysThisYear;
        }
        return daysSinceEpoch;
    }

    /**
     * Number of days up to, but not including, the given year since epoch.
     * @param year
     * @return
     */
    static int daysToYear(int year)
    {
        return (365 * year) + numLeapsToYear(year);
    }

    /**
     * Returns the number of leap years from the epoch until (but not including)
     * the given year. The epoch begins on 1 Jan, 1AD
     *
     * @param year
     * @return The number of leap years
     */
    static int numLeapsToYear(int year)
    {
        int num4y = (year - 1) / 4;
        int num100y = (year - 1) / 100;
        int num400y = (year - 1) / 400;
        int numLeaps = num4y - num100y + num400y;
        return numLeaps;
    }

    /**
     * Returns true if the year is a leap year in the Gregorian calendar
     * @param year The year to consider
     * @return True if <code>year</code> is a leap year
     */
    public static boolean isLeapYear(int year)
    {
        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
    }

    /**
     * If the given object is a DateTime:
     * <ol>
     * <li>returns less than 0 if this date is before the given date
     * <li>returns 0 if this date is equal to the given date
     * <li>returns more than 0 if this date is after the given date
     * </ol>
     * @param other the date to compare this one to
     * @throws ClassCastException if <code>other</code> is not an instance of
     * DateTime
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Object other)
    {
        return this.getDaysSinceEpoch() - ((DateTime) other).getDaysSinceEpoch();
    }

    /**
     * Returns true if this date is before the given date
     * @param other The date to consider
     * @return true if this date is before the given date
     */
    public boolean isBefore(DateTime other)
    {
        return compareTo(other) < 0;
    }

    /**
     * Returns true if this date is after the given date
     * @param other The date to consider
     * @return true if this date is after the given date
     */
    public boolean isAfter(DateTime other)
    {
        return compareTo(other) > 0;
    }

    /**
     * Returns true if the given object is a DateTime representing the
     * same date as this object
     * @param other The date to test against
     * @return true if this is the same date as <code>other</code>
     */
    public boolean equals(Object other)
    {
        if (other instanceof DateTime)
        {
            return (this.compareTo(other) == 0);
        }
        return false;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode()
    {
        return (375 * getYear()) + (35 * getMonth()) + getDayOfMonth();
    }

    /**
     * Returns a string form of this date in the form "2004-9-23"
     * @return A string form of this date
     */
    public String toString()
    {
        return new StringBuffer().append(getYear()).append("-").append(getMonth()).append("-").append(getDayOfMonth()).toString();
    }

    /**
     * @param out
     * @throws IOException
     */
    private void writeObject(java.io.ObjectOutputStream out) throws IOException
    {
        out.writeInt(getYear());
        out.writeInt(getMonth());
        out.writeInt(getDayOfMonth());
        out.writeInt(daysSinceEpoch);
    }

    /**
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        init(in.readInt(), in.readInt(), in.readInt());
        daysSinceEpoch = in.readInt();
    }

    /**
     * Returns the instant in time when this day begins in the given timezone.
     * @param timezone The timezone to consider
     * @return the instant in time when this day begins
     */
    public java.util.Date toDate(TimeZone timezone)
    {
        return toDate(timezone, 0, 0, 0);
    }

    /**
     * @return
     */
    public java.util.Date toDate()
    {
        return toDate(0, 0, 0);
    }

    /**
     * @param locale
     * @return
     */
    public java.util.Date toDate(Locale locale)
    {
        return toDate(locale, 0, 0, 0);
    }

    /**
     * Returns the instant in time when the given time of day is reached in
     * the given timezone.  If the time occurs twice on this date (as
     * may happen when coming out of daylight savings time) the second
     * occurrence will be returned.
     *
     * @param timezone The timezone to for which the date applies
     * @param hour The hour of the day in range 0 - 23
     * @param min The minute of the day in range 0 - 59
     * @param sec The second of the day in range 0 - 60 (60 is for leap-seconds)
     * @return The instant in time when the given time of day is reached in
     * the given timezone
     * @throws IllegalArgumentException if the bounds of the above
     */
    public java.util.Date toDate(TimeZone timezone, int hour, int min, int sec)
    {
        checkHourMinSec(hour, min, sec);
        GregorianCalendar cal = new GregorianCalendar(timezone);
        cal.clear();
        cal.set(getYear(), getMonth() - 1, getDayOfMonth(), hour, min, sec);
        return cal.getTime();
    }

    /**
     * @param hour
     * @param min
     * @param sec
     * @return
     */
    public java.util.Date toDate(int hour, int min, int sec)
    {
        checkHourMinSec(hour, min, sec);
        GregorianCalendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(getYear(), getMonth() - 1, getDayOfMonth(), hour, min, sec);
        return cal.getTime();
    }

    /**
     * @param locale
     * @param hour
     * @param min
     * @param sec
     * @return
     */
    public java.util.Date toDate(Locale locale, int hour, int min, int sec)
    {
        checkHourMinSec(hour, min, sec);
        GregorianCalendar cal = new GregorianCalendar(locale);
        cal.clear();
        cal.set(getYear(), getMonth() - 1, getDayOfMonth(), hour, min, sec);
        return cal.getTime();
    }

    /**
     * @param hour
     * @param min
     * @param sec
     */
    private void checkHourMinSec(int hour, int min, int sec)
    {
        if ((hour < 0) || (hour >= 24))
        {
            throw new IllegalArgumentException("Hour out of range: " + hour);
        }
        if ((min < 0) || (min >= 60))
        {
            throw new IllegalArgumentException("Minute out of range: " + min);
        }
        // Leap seconds mean some minutes are 61 seconds long!
        if ((sec < 0) || (sec >= 61))
        {
            throw new IllegalArgumentException("Second out of range: " + hour);
        }
    }
//$Section=definitions$Preserve=no

}
