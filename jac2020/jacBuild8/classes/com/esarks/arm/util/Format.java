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
public class Format extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Format() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Format(Script aScript) {

    super(aScript);

  }

//$Section=definitions$Preserve=yes
    private Locale m_Locale = Locale.getDefault();

    private NumberFormat m_CurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.getDefault());

    private NumberFormat m_PercentFormatter = NumberFormat.getPercentInstance(Locale.getDefault());

    private SimpleDateFormat m_DateFormatter = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());

    /**
     * Static array containing all titles for assessors
     * TODO: Put this somewhere else
     */
    public static final String[] s_szTitles =
        { "ARNP", "BS", "BSN", "CCRN", "COS-C", "Dr", "MD", "MS", "OT", "OTL",
            "OTR", "PhD", "PT", "RN", "RN, C.N.A.", "RN, C.S.", "DPT",
            "RPT", "SWOSN", "SLP/ST", "WOSN" , "II", "III", "IV", "VI", "VII", "VIII", "IX"};

    public static Hashtable s_Titles = new Hashtable();

    static
    {
        for (int idx = 0; idx < s_szTitles.length; idx++)
        {
            s_Titles.put(s_szTitles[idx].toLowerCase(), s_szTitles[idx]);
        }
    }

    /**
     * Return properly formatted last name that starts with mc e.g. mcdonald -> McDonald
     * @param szString
     * @return Formatted LAst Name
     */
    public static String FormatMc(String szString)
    {
        if (szString.startsWith("Mc") && (szString.length() > 3))
        {
            szString = szString.substring(0, 2) + ("" + szString.charAt(2)).toUpperCase() + szString.substring(3, szString.length());
        }

        return (szString);
    }

    /**
     * Properly formatted last name. De and Mc are formatted properly
     * @param LastName
     * @return Formatted Last Name
     */
    public static String FormatLastName(String LastName)
    {
        int iLastNameLength = LastName.length();

        LastName = CapitalizeWords(LastName);

        if (LastName.startsWith("De") && (iLastNameLength > 3))
        {
            //LastName = LastName.substring(0, 2) + ("" + LastName.charAt(2)).toUpperCase() + LastName.substring(3, LastName.length());
        }

        LastName = FormatMc(LastName);

        if (iLastNameLength > 1)
        {
            LastName = ("" + LastName.charAt(0)).toUpperCase() + LastName.substring(1, LastName.length());
        }
        else
        {
            LastName = LastName.toUpperCase();
        }

        return (LastName);
    }

    /**
     * Formats first name (capitalizes first letter)
     * @param FirstName
     * @return Formatted name
     */
    public static String FormatFirstName(String FirstName)
    {
        int iLastNameLength = FirstName.length();

        FirstName = FirstName.toLowerCase();

        if (iLastNameLength > 1)
        {
            FirstName = ("" + FirstName.charAt(0)).toUpperCase() + FirstName.substring(1, FirstName.length());
        }
        else
        {
            FirstName = FirstName.toUpperCase();
        }

        return (FirstName);
    }

    /**
     * Formats title
     * @param szTitle Title to format
     * @return Formatted title
     * @see #s_szTitles
     */
    public static String FormatTitle(String szTitle)
    {
        if (s_Titles.containsKey(szTitle.toLowerCase().trim()))
        {
            szTitle = s_Titles.get(szTitle.toLowerCase().trim()).toString();
        }

        return (szTitle);
    }

    /**
     * Formats complete name
     * @param LastName
     * @param FirstName
     * @param MiddleInitial
     * @param Title
     * @return Formatted name, first letters are capitalized
     */
    public static String FormatName(String LastName, String FirstName, String MiddleInitial, String Title)
    {
        try
        {
            LastName = LastName.trim();
            FirstName = FirstName.trim();
            MiddleInitial = MiddleInitial.trim();
            Title = Title.trim();

            String szRetVal = LastName;

            if (LastName.length() > 0)
            {
                if ((FirstName.length() > 0) || (MiddleInitial.length() > 0) || (Title.length() > 0))
                {
                    szRetVal += ",";
                }
            }

            if (FirstName.length() > 0)
            {
                if ((szRetVal.length() > 1) && (szRetVal.charAt(szRetVal.length() - 1) != ' '))
                {
                    szRetVal += ' ';
                }

                szRetVal += FirstName;
            }

            if (MiddleInitial.length() > 0)
            {
                if ((szRetVal.length() > 1) && (szRetVal.charAt(szRetVal.length() - 1) != ' '))
                {
                    szRetVal += ' ';
                }

                szRetVal += MiddleInitial + (MiddleInitial.indexOf('.') < 0 ? "." : "");
            }

            if (Title.length() > 0)
            {
                if ((szRetVal.length() > 1) && (szRetVal.charAt(szRetVal.length() - 1) != ' '))
                {
                    szRetVal += ' ';
                }

                szRetVal += Title;
            }

            szRetVal = FormatName(szRetVal);

            return (szRetVal);
        }
        catch (Exception e)
        {
            return (LastName + ", " + FirstName + " " + MiddleInitial + " " + Title);
        }
    }

    /**
     * Capitalizes full name, i.e. peter mcdonald, PHD -> Peter McDonald PhD
     * @param szFullName
     * @return Formatted name
     */
    public static String FormatName(String szFullName)
    {
        try
        {
            String szRetVal = "";
            szFullName = szFullName.trim();
            szFullName = szFullName.replaceAll("  "," ");

            if (szFullName.length() == 0)
            {

            }
            else
            {
                szRetVal = CapitalizeWords(szFullName);

                java.util.StringTokenizer st = new StringTokenizer(szRetVal, " ", true);

                szRetVal = "";

                int idx = 0;

                while (st.hasMoreTokens())
                {
                    String szToken = st.nextToken();

                    java.util.StringTokenizer st2 = new StringTokenizer(szToken, ".,", true);

                    while(st2.hasMoreTokens())
                    {
                        String szToken2 = st2.nextToken();

	                    if (idx == 0)
	                    {
	                        szToken2 = FormatLastName(szToken2);
	                    }

	                    szToken2 = FormatMc(szToken2);

	                    if (s_Titles.containsKey(szToken2.toLowerCase().trim()))
	                    {
	                        szToken2 = s_Titles.get(szToken2.toLowerCase().trim()).toString();
	                    }

	                    szRetVal += szToken2;
                    }

                    idx++;
                }
            }

            return szRetVal;
        }
        catch (Exception e)
        {
            return (szFullName);
        }
    }

    /**
     * Capitalizes words in a sentence
     * @param szString
     * @return Capitalized sentence
     */
    public static String CapitalizeWords(String szString)
    {
        String szOriginal = szString;

        try
        {
            String szRetVal = "";
            szString = szString.toLowerCase();

            char ch; // One of the characters in str.
            char prevCh; // The character that comes before ch
            // in the string.
            int i; // A position in str, from 0 to str.length()-1.
            prevCh = '.'; // Prime the loop with any non-letter character

            for (i = 0; i < szString.length(); i++)
            {
                ch = szString.charAt(i);

                if (Character.isLetter(ch) && !Character.isLetter(prevCh))
                {
                    szRetVal += Character.toUpperCase(ch);
                }
                else
                {
                    szRetVal += ch;
                }

                prevCh = ("" + ch).toLowerCase().charAt(0);
            }

            return (szRetVal);
        }
        catch (Exception e)
        {
            return (szOriginal);
        }
    }

    /**
     * Capitalizes first word in a sentence
     * @param szSentence
     * @return Formatted sentence
     */
    public static String CapitalizeSentence(String szSentence)
    {
        if (szSentence.trim().equals(""))
        {
            return "";
        }

        byte[] baTmp = szSentence.toLowerCase().getBytes();

        if (Character.isLetter((char) baTmp[0]))
        {
            baTmp[0] -= 32;
        }

        return (new String(baTmp));
    }

    /**
     * Formats date for report. Uses specified locale
     * @param szDate Date to format
     * @return Formatted date
     * @see #setLocale(Locale)
     */
    public String formatDateForReport(String szDate)
    {
        String szRetVal;

        if ((szDate == null) || (szDate.trim().equals("")))
        {
            return "";
        }

        try
        {
            szRetVal = m_DateFormatter.format(com.esarks.arm.util.DateTime.GetDate(szDate));
        }
        catch (Exception e)
        {
            szRetVal = szDate;
        }

        return szRetVal;
    }

    /**
     * Formats date for report. Uses specified locale
     * @param dtDate Date to format
     * @return Formatted date
     * @see #setLocale(Locale)
     */
    public String formatDateForReport(java.util.Date dtDate)
    {
        String szRetVal;

        if (dtDate == null)
        {
            return "";
        }

        try
        {
            szRetVal = m_DateFormatter.format(dtDate);
        }
        catch (Exception e)
        {
            szRetVal = dtDate.toString();
        }

        return szRetVal;
    }

    /**
     * Formats date for report. Uses specified locale
     * @param dtDate Date to format
     * @return Formatted date
     * @see #setLocale(Locale)
     */
    public String formatDateForReport(DateTime dtDate)
    {
        String szRetVal;

        if (dtDate == null)
        {
            return "";
        }

        try
        {
            szRetVal = m_DateFormatter.format(dtDate.toDate(getLocale()));
        }
        catch (Exception e)
        {
            szRetVal = dtDate.toString();
        }

        return szRetVal;
    }


    /**
     * Formats ammount for report. Uses specified locale
     * @param dAmmount Ammount to format
     * @return Formatted ammount
     * @see #setLocale(Locale)
     */
    public String formatCurrencyForReport(double dAmmount)
    {
        String szRetVal;

        try
        {
            szRetVal = m_CurrencyFormatter.format(dAmmount);
        }
        catch (Exception e)
        {
            szRetVal = "$" + dAmmount;
        }

        return szRetVal;
    }

    /**
     * Formats percent for report. Uses specified locale
     * @param dPercent Percent to format
     * @return Formatted percent
     * @see #setLocale(Locale)
     */
    public String formatPercentForReport(double dPercent)
    {
        String szRetVal;

        try
        {
            szRetVal = m_PercentFormatter.format(dPercent);
        }
        catch (Exception e)
        {
            szRetVal = dPercent + "%";
        }

        return szRetVal;
    }


    /**
     * Some test cases
     */
    public static void RunTest(String[] args)
    {
        System.out.println("Format:");
        System.out.println(Format.FormatLastName(""));
        System.out.println(Format.FormatLastName("M"));
        System.out.println(Format.FormatLastName("m"));
        System.out.println("" + Format.FormatLastName("Mc"));
        System.out.println("" + Format.FormatLastName("mc"));
        System.out.println("" + Format.FormatLastName("mccormic"));
        System.out.println("-----------------------");
        System.out.println("" + Format.FormatLastName(""));
        System.out.println("" + Format.FormatLastName("D"));
        System.out.println("" + Format.FormatLastName("d"));
        System.out.println("" + Format.FormatLastName("De"));
        System.out.println("" + Format.FormatLastName("de"));
        System.out.println("" + Format.FormatLastName("deniro"));
        System.out.println("" + Format.FormatLastName("de niro"));
        System.out.println("-----------------------");
        System.out.println("" + Format.FormatLastName("smith"));
        System.out.println("-----------------------");
        System.out.println("" + Format.FormatName("smith, jones m. phd"));
        System.out.println("" + Format.FormatName(" jones m. phd"));
        System.out.println("" + Format.FormatName("smith m. phd"));
        System.out.println("" + Format.FormatName("deniro, robert s. md"));
        System.out.println("" + Format.FormatName("deniro s. md"));
        System.out.println("" + Format.FormatName("mcdonald, ronald bs"));
        System.out.println("" + Format.FormatName("dr. michael mcdonald"));
        System.out.println("" + Format.FormatName("dr. mcdonald"));
        System.out.println("" + Format.FormatName("dr. michael "));
        System.out.println("-----------------------");
        System.out.println("" + Format.FormatName("smith", " jones", "m.", "phd"));
        System.out.println("" + Format.FormatName(" ", " jones", "   ", "  "));
        System.out.println("" + Format.FormatName("mcdonald", "", "m.", " md"));
        System.out.println("" + Format.FormatName("mcdonald", "", "  ", " md"));
        System.out.println("" + Format.FormatName("deniro", " robert", " ", ""));

    }

    /**
     * Sets locale
     * @param locale
     */
    public void setLocale(Locale locale)
    {
        m_Locale = locale;
        m_CurrencyFormatter = NumberFormat.getCurrencyInstance(m_Locale);
        m_DateFormatter = new SimpleDateFormat("MM/dd/yyyy", m_Locale);
        m_PercentFormatter = NumberFormat.getPercentInstance(m_Locale);
    }

    /**
     * @return Returns the m_CurrencyFormatter.
     */
    public NumberFormat getCurrencyFormatter()
    {
        return m_CurrencyFormatter;
    }

    /**
     * @return Returns the m_DateFormatter.
     */
    public SimpleDateFormat getDateFormatter()
    {
        return m_DateFormatter;
    }

    /**
     * @return Returns the m_DateFormatter.
     */
    public NumberFormat getPercentFormatter()
    {
        return m_PercentFormatter;
    }

    /**
     * @return Returns the m_Locale.
     */
    public Locale getLocale()
    {
        return m_Locale;
    }
//$Section=definitions$Preserve=no

}
