//$Section=License$Preserve=no
//  Generated at 2005.12.24 12:42:49.687 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  XML Definition: com.esarks.arm.model.jeo.Service_Jeo
//     Module Name: com.esarks.arm.model.jeo.ProcessJeo

//$Section=ChangeLog$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$Preserve=no

package com.esarks.arm.model.jeo;

/**
 *
 */

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import com.esarks.jac.*;
import com.esarks.mic.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

//$Section=CustomDeclare$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$Preserve=no

public class ProcessJeo extends com.esarks.jac.Jeo {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes

//EventTime  Type: datetime  Size: 0  Nullable: true
    private PropertyValue iEventTime = new PropertyValue();
    private boolean iEventTimeIsNullable = true;
    private boolean iEventTimeUpdate = false;
    private int iEventTimeSize = 0;
//EventCode  Type: string  Size: 0  Nullable: true
    private PropertyValue iEventCode = new PropertyValue();
    private boolean iEventCodeIsNullable = true;
    private boolean iEventCodeUpdate = false;
    private int iEventCodeSize = 0;
//Description  Type: string  Size: 0  Nullable: true
    private PropertyValue iDescription = new PropertyValue();
    private boolean iDescriptionIsNullable = true;
    private boolean iDescriptionUpdate = false;
    private int iDescriptionSize = 0;
//ScriptName  Type: string  Size: 0  Nullable: true
    private PropertyValue iScriptName = new PropertyValue();
    private boolean iScriptNameIsNullable = true;
    private boolean iScriptNameUpdate = false;
    private int iScriptNameSize = 0;
//Method  Type: string  Size: 0  Nullable: true
    private PropertyValue iMethod = new PropertyValue();
    private boolean iMethodIsNullable = true;
    private boolean iMethodUpdate = false;
    private int iMethodSize = 0;
//Location  Type: string  Size: 0  Nullable: true
    private PropertyValue iLocation = new PropertyValue();
    private boolean iLocationIsNullable = true;
    private boolean iLocationUpdate = false;
    private int iLocationSize = 0;
//Exception  Type: string  Size: 0  Nullable: true
    private PropertyValue iException = new PropertyValue();
    private boolean iExceptionIsNullable = true;
    private boolean iExceptionUpdate = false;
    private int iExceptionSize = 0;

//$Section=CustomClassDeclare$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$Preserve=no

//----------------------------------------------------------------------------
// Generated constructors.
//----------------------------------------------------------------------------

/**
 * Default constructor.
 */
    public ProcessJeo() {
      iInstanceName = "com.esarks.arm.model.jeo.ProcessJeo";
//$Section=DefaultConstructor$Preserve=yes
//$Section=DefaultConstructor$Preserve=no
    }

/**
 *
 */
    public ProcessJeo( com.esarks.jac.JeoFactory aJeoFactory ) {
      iInstanceName = "com.esarks.arm.model.jeo.ProcessJeo";
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=yes
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=no
    }

/**
 *
 */
    public ProcessJeo( Script aScript ) {
      super("", aScript);
      iInstanceName = "com.esarks.arm.model.jeo.ProcessJeo";
//$Section=Operation$Jeo( String aScript )$Preserve=yes
//$Section=Operation$Jeo( String aScript )$Preserve=no
    }

/**
 *
 */
    public ProcessJeo( String aTypeName ) {
      iInstanceName = "com.esarks.arm.model.jeo.ProcessJeo";
      iJeoTypeName = aTypeName;
//$Section=Operation$Jeo( String aTypeName )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName )$Preserve=no
    }

/**
 *
 */
    public ProcessJeo( String aTypeName, Script aScript ) {
      super("", aScript);
      iInstanceName = "com.esarks.arm.model.jeo.ProcessJeo";
      iJeoTypeName = aTypeName;
//$Section=Operation$Jeo( String aTypeName, Script aScript )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName, Script aScript )$Preserve=no
    }

//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

/**
 * Default finalize.
 */
    public void finalize() {
    	freeResources();
//$Section=DefaultDestructor$Preserve=yes
//$Section=DefaultDestructor$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

/**
 * Default freeResources.
 */
    public void freeResources() {
    	super.freeResources();
    iEventTime = null;
    iEventCode = null;
    iDescription = null;
    iScriptName = null;
    iMethod = null;
    iLocation = null;
    iException = null;
//$Section=DefaultFreeResources$Preserve=yes
//$Section=DefaultFreeResources$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------
//$Section=CustomOperations$Preserve=yes
//$Section=CustomOperations$Preserve=no

    public void init() {
    	super.init();
//EventTime
    iEventTime = new PropertyValue();
    iEventTimeUpdate = false;
//EventCode
    iEventCode = new PropertyValue();
    iEventCodeUpdate = false;
//Description
    iDescription = new PropertyValue();
    iDescriptionUpdate = false;
//ScriptName
    iScriptName = new PropertyValue();
    iScriptNameUpdate = false;
//Method
    iMethod = new PropertyValue();
    iMethodUpdate = false;
//Location
    iLocation = new PropertyValue();
    iLocationUpdate = false;
//Exception
    iException = new PropertyValue();
    iExceptionUpdate = false;
    }

//----------------------------------------------------------------------------
// This section is for mapping views to tables.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for mapping from and to Jeo's.
//----------------------------------------------------------------------------

  public void mapToJeo( Jeo aJeo) {
//$Section=Operation$mapFromJeo$Preserve=no
    String lType = null;
    PropertyValue lValue = null;
// EventTime
      try {
        lValue = aJeo.getPropertyValueByName("eventTime");
        if (lValue != null) {
          lType = aJeo.getTypeByName("eventTime");
          if (!isEventTimeNull()) {
            lValue.reset(lType, getEventTimePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// EventCode
      try {
        lValue = aJeo.getPropertyValueByName("eventCode");
        if (lValue != null) {
          lType = aJeo.getTypeByName("eventCode");
          if (!isEventCodeNull()) {
            lValue.reset(lType, getEventCodePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Description
      try {
        lValue = aJeo.getPropertyValueByName("description");
        if (lValue != null) {
          lType = aJeo.getTypeByName("description");
          if (!isDescriptionNull()) {
            lValue.reset(lType, getDescriptionPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// ScriptName
      try {
        lValue = aJeo.getPropertyValueByName("scriptName");
        if (lValue != null) {
          lType = aJeo.getTypeByName("scriptName");
          if (!isScriptNameNull()) {
            lValue.reset(lType, getScriptNamePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Method
      try {
        lValue = aJeo.getPropertyValueByName("method");
        if (lValue != null) {
          lType = aJeo.getTypeByName("method");
          if (!isMethodNull()) {
            lValue.reset(lType, getMethodPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Location
      try {
        lValue = aJeo.getPropertyValueByName("location");
        if (lValue != null) {
          lType = aJeo.getTypeByName("location");
          if (!isLocationNull()) {
            lValue.reset(lType, getLocationPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Exception
      try {
        lValue = aJeo.getPropertyValueByName("exception");
        if (lValue != null) {
          lType = aJeo.getTypeByName("exception");
          if (!isExceptionNull()) {
            lValue.reset(lType, getExceptionPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
//$Section=Operation$mapToJeo$Preserve=no
  }

  public void mapFromJeo( Jeo aJeo) {
//$Section=Operation$mapFromJeo$Preserve=no
    String lType = null;
    PropertyValue lValue = null;
// EventTime
      try {
        lValue = aJeo.getPropertyValueByName("eventTime");
        if (lValue != null) {
          setEventTime(lValue);
        }
      } catch(Throwable e) {}
// EventCode
      try {
        lValue = aJeo.getPropertyValueByName("eventCode");
        if (lValue != null) {
          setEventCode(lValue);
        }
      } catch(Throwable e) {}
// Description
      try {
        lValue = aJeo.getPropertyValueByName("description");
        if (lValue != null) {
          setDescription(lValue);
        }
      } catch(Throwable e) {}
// ScriptName
      try {
        lValue = aJeo.getPropertyValueByName("scriptName");
        if (lValue != null) {
          setScriptName(lValue);
        }
      } catch(Throwable e) {}
// Method
      try {
        lValue = aJeo.getPropertyValueByName("method");
        if (lValue != null) {
          setMethod(lValue);
        }
      } catch(Throwable e) {}
// Location
      try {
        lValue = aJeo.getPropertyValueByName("location");
        if (lValue != null) {
          setLocation(lValue);
        }
      } catch(Throwable e) {}
// Exception
      try {
        lValue = aJeo.getPropertyValueByName("exception");
        if (lValue != null) {
          setException(lValue);
        }
      } catch(Throwable e) {}
//$Section=Operation$mapFromJeo$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for the get by string name related methods.
//----------------------------------------------------------------------------

  public String getCasedName ( String aAttributeName) {
//$Section=Operation$getCasedName$Preserve=no

    try {
        Method lMethod = this.getClass().getMethod("getAttributeName_" + aAttributeName.toLowerCase(), null);
        return (String) lMethod.invoke(this, null);
    } catch (Throwable e) {
        //System.out.println(e);
        return null;
    }

//$Section=Operation$getCasedName$Preserve=no
  }

  public PropertyValue getPropertyValueByName ( String aAttributeName) {
//$Section=Operation$getPropertyValueByName$Preserve=no

    try {
        Method lMethod = this.getClass().getMethod("get" + getCasedName(aAttributeName) + "PropertyValue", null);
        return (PropertyValue) lMethod.invoke(this, null);
    } catch (Throwable e) {
        //System.out.println(e);
        return null;
    }

//$Section=Operation$getPropertyValueByName$Preserve=no
  }

  public void setStringValueByName ( String aAttributeName, String aValue) {
//$Section=Operation$setStringValueByName$Preserve=no

    try {
        Class lClassParams[] = new Class[]{"".getClass()};
        Object lArguments[] = new Object[] {aValue};
        Method lMethod = this.getClass().getMethod("set" + getCasedName(aAttributeName), lClassParams);
        lMethod.invoke(this, lArguments);
    } catch (Throwable e) {
        //System.out.println(e);
    }

//$Section=Operation$setStringValueByName$Preserve=no
  }

  public String getTypeByName ( String aAttributeName) {
//$Section=Operation$getTypeByName$Preserve=no

    try {
        Method lMethod = this.getClass().getMethod("get" + getCasedName(aAttributeName) + "ValueType", null);
        return (String) lMethod.invoke(this, null);
    } catch (Throwable e) {
        //System.out.println(e);
        return null;
    }

//$Section=Operation$getTypeByName$Preserve=no
  }

  public String getStereotypeByName ( String aAttributeName) {
//$Section=Operation$getStereotypeByName$Preserve=no

    try {
        Method lMethod = this.getClass().getMethod("get" + getCasedName(aAttributeName) + "ValueStereotype", null);
        return (String) lMethod.invoke(this, null);
    } catch (Throwable e) {
        //System.out.println(e);
        return null;
    }

//$Section=Operation$getStereotypeByName$Preserve=no
  }

  public String getNameByIndex ( int aIndex) {
//$Section=Operation$getNameByIndex$Preserve=no

    switch(aIndex) {
      case 1: return "eventtime";
      case 2: return "eventcode";
      case 3: return "description";
      case 4: return "scriptname";
      case 5: return "method";
      case 6: return "location";
      case 7: return "exception";
    }
    return null;
//$Section=Operation$getNameByIndex$Preserve=no
  }

  public String getXml ( ) {
//$Section=Operation$getXml$Preserve=no

    StringBuffer lXml = new StringBuffer("<jeo name='com.esarks.arm.model.jeo.ProcessJeo'>");
    String lCdataBegin = "<" + "!" + "[CDATA[";
// Field: EventTime
    lXml.append("<field name='EventTime' type='datetime'>");
    lXml.append(getEventTimePropertyValue().toString()).append("</field>");
// Field: EventCode
    lXml.append("<field name='EventCode' type='string'>");
    lXml.append(lCdataBegin).append(getEventCodePropertyValue().toString()).append("]]>").append("</field>");
// Field: Description
    lXml.append("<field name='Description' type='string'>");
    lXml.append(lCdataBegin).append(getDescriptionPropertyValue().toString()).append("]]>").append("</field>");
// Field: ScriptName
    lXml.append("<field name='ScriptName' type='string'>");
    lXml.append(lCdataBegin).append(getScriptNamePropertyValue().toString()).append("]]>").append("</field>");
// Field: Method
    lXml.append("<field name='Method' type='string'>");
    lXml.append(lCdataBegin).append(getMethodPropertyValue().toString()).append("]]>").append("</field>");
// Field: Location
    lXml.append("<field name='Location' type='string'>");
    lXml.append(lCdataBegin).append(getLocationPropertyValue().toString()).append("]]>").append("</field>");
// Field: Exception
    lXml.append("<field name='Exception' type='string'>");
    lXml.append(lCdataBegin).append(getExceptionPropertyValue().toString()).append("]]>").append("</field>");
    lXml.append("</jeo>");
    return lXml.toString();

//$Section=Operation$getXml$Preserve=no
  }

  public boolean isJeoEqual ( Jeo aJeo) {
//$Section=Operation$isJeoEqual$Preserve=no

    PropertyValue lThisValue = null;
    PropertyValue lThatValue = null;
    lThisValue = this.getPropertyValueByName("eventtime");
    lThatValue = aJeo.getPropertyValueByName("eventtime");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("eventcode");
    lThatValue = aJeo.getPropertyValueByName("eventcode");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("description");
    lThatValue = aJeo.getPropertyValueByName("description");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("scriptname");
    lThatValue = aJeo.getPropertyValueByName("scriptname");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("method");
    lThatValue = aJeo.getPropertyValueByName("method");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("location");
    lThatValue = aJeo.getPropertyValueByName("location");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("exception");
    lThatValue = aJeo.getPropertyValueByName("exception");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    return true;
//$Section=Operation$isJeoEqual$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
// EventTime
//----------------------------------------------------------------------------
    public java.sql.Timestamp getEventTime() {
//$Section=Attribute get$EventTime$Preserve=no
        return iEventTime.getValueTimestamp();
//$Section=Attribute get$EventTime$Preserve=no
    }
    public java.sql.Timestamp getEventTime(java.sql.Timestamp aValue) {
//$Section=Attribute get$EventTime(java.sql.Timestamp)$Preserve=no
      if (isEventTimeNull()) return aValue;
      return iEventTime.getValueTimestamp();
//$Section=Attribute get$EventTime(java.sql.Timestamp)$Preserve=no
    }
    public void setEventTime(java.sql.Timestamp aValue) {
//$Section=Attribute set$EventTime$Preserve=no
        iEventTime.reset(aValue);
//$Section=Attribute set$EventTime$Preserve=no
    }
    public void setEventTime(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$EventTime$Preserve=no
        if (aValue.getType().equals("null")) {
          setEventTimeNull();
          return;
        }
        setEventTime(aValue.toString());
//$Section=Attribute setPropertyValue$EventTime$Preserve=no
    }
    public void setEventTime(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$EventTime$Preserve=no
        if (aValue.getType().equals("null")) {
          setEventTimeNull();
          return;
        }
        setEventTime(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$EventTime$Preserve=no
    }
    public void setEventTime(String aValue) {
//$Section=Attribute setAsString$EventTime$Preserve=no
        iEventTime.reset("timestamp:yyyy-MM-dd HH:mm:ss.S", aValue);
//$Section=Attribute setAsString$EventTime$Preserve=no
    }
    public void setEventTime(String aValue, String aType) {
//$Section=Attribute setAsStringType$EventTime$Preserve=no
        iEventTime.reset(aType, aValue);
//$Section=Attribute setAsStringType$EventTime$Preserve=no
    }
    public PropertyValue getEventTimePropertyValue() {
//$Section=Attribute getPropertyValue$EventTime$Preserve=no
        return iEventTime;
//$Section=Attribute getPropertyValue$EventTime$Preserve=no
    }
    public String getAttributeName_eventtime() {
//$Section=Attribute getAttributeName$eventtime$Preserve=no
        return "EventTime";
//$Section=Attribute getAttributeName_$eventtime$Preserve=no
    }
    public int sizeEventTime() {
//$Section=Attribute size$EventTime$Preserve=no
        return iEventTimeSize;
//$Section=Attribute size$EventTime$Preserve=no
    }
    public boolean isEventTimeNullable() {
//$Section=Attribute isNullable$EventTime$Preserve=no
        return iEventTimeIsNullable;
//$Section=Attribute isNullable$EventTime$Preserve=no
    }
    public boolean isEventTimeNull() {
//$Section=Attribute isNull$EventTime$Preserve=no
        if (iEventTime.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$EventTime$Preserve=no
    }
    public void setEventTimeNull() {
//$Section=Attribute setNull$EventTime$Preserve=no
        iEventTime.reset();
//$Section=Attribute setNull$EventTime$Preserve=no
    }
    public void setEventTimeSpaceToNull() {
//$Section=Attribute setSpaceToNull$EventTime$Preserve=no
        if (getEventTimePropertyValue().toString().trim().equals("")) setEventTimeNull();
//$Section=Attribute setSpaceToNull$EventTime$Preserve=no
    }
    public void setEventTimeUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$EventTime$Preserve=no
        iEventTimeUpdate = aUpdate;
//$Section=Attribute setUpdate$EventTime$Preserve=no
    }
    public boolean getEventTimeUpdate() {
//$Section=Attribute getUpdate$EventTime$Preserve=no
        return iEventTimeUpdate;
//$Section=Attribute getUpdate$EventTime$Preserve=no
    }
    public String getEventTimeValueType() {
//$Section=Attribute getValueType$EventTime$Preserve=no
        return "datetime";
//$Section=Attribute getValueType$EventTime$Preserve=no
    }
    public String getEventTimeValueStereotype() {
//$Section=Attribute getValueStereotype$EventTime$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$EventTime$Preserve=no
    }

//----------------------------------------------------------------------------
// EventCode
//----------------------------------------------------------------------------
    public String getEventCode() {
//$Section=Attribute get$EventCode$Preserve=no
        return iEventCode.getValueString();
//$Section=Attribute get$EventCode$Preserve=no
    }
    public String getEventCode(String aValue) {
//$Section=Attribute get$EventCode(String)$Preserve=no
      if (isEventCodeNull()) return aValue;
      return iEventCode.getValueString();
//$Section=Attribute get$EventCode(String)$Preserve=no
    }
    public void setEventCode(String aValue) {
//$Section=Attribute set$EventCode$Preserve=no
        iEventCode.reset(aValue);
//$Section=Attribute set$EventCode$Preserve=no
    }
    public void setEventCode(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$EventCode$Preserve=no
        if (aValue.getType().equals("null")) {
          setEventCodeNull();
          return;
        }
        setEventCode(aValue.toString());
//$Section=Attribute setPropertyValue$EventCode$Preserve=no
    }
    public void setEventCode(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$EventCode$Preserve=no
        if (aValue.getType().equals("null")) {
          setEventCodeNull();
          return;
        }
        setEventCode(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$EventCode$Preserve=no
    }
    public void setEventCode(String aValue, String aType) {
//$Section=Attribute setAsStringType$EventCode$Preserve=no
        iEventCode.reset(aType, aValue);
//$Section=Attribute setAsStringType$EventCode$Preserve=no
    }
    public PropertyValue getEventCodePropertyValue() {
//$Section=Attribute getPropertyValue$EventCode$Preserve=no
        return iEventCode;
//$Section=Attribute getPropertyValue$EventCode$Preserve=no
    }
    public String getAttributeName_eventcode() {
//$Section=Attribute getAttributeName$eventcode$Preserve=no
        return "EventCode";
//$Section=Attribute getAttributeName_$eventcode$Preserve=no
    }
    public int sizeEventCode() {
//$Section=Attribute size$EventCode$Preserve=no
        return iEventCodeSize;
//$Section=Attribute size$EventCode$Preserve=no
    }
    public boolean isEventCodeNullable() {
//$Section=Attribute isNullable$EventCode$Preserve=no
        return iEventCodeIsNullable;
//$Section=Attribute isNullable$EventCode$Preserve=no
    }
    public boolean isEventCodeNull() {
//$Section=Attribute isNull$EventCode$Preserve=no
        if (iEventCode.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$EventCode$Preserve=no
    }
    public void setEventCodeNull() {
//$Section=Attribute setNull$EventCode$Preserve=no
        iEventCode.reset();
//$Section=Attribute setNull$EventCode$Preserve=no
    }
    public void setEventCodeSpaceToNull() {
//$Section=Attribute setSpaceToNull$EventCode$Preserve=no
        if (getEventCodePropertyValue().toString().trim().equals("")) setEventCodeNull();
//$Section=Attribute setSpaceToNull$EventCode$Preserve=no
    }
    public void setEventCodeUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$EventCode$Preserve=no
        iEventCodeUpdate = aUpdate;
//$Section=Attribute setUpdate$EventCode$Preserve=no
    }
    public boolean getEventCodeUpdate() {
//$Section=Attribute getUpdate$EventCode$Preserve=no
        return iEventCodeUpdate;
//$Section=Attribute getUpdate$EventCode$Preserve=no
    }
    public String getEventCodeValueType() {
//$Section=Attribute getValueType$EventCode$Preserve=no
        return "string";
//$Section=Attribute getValueType$EventCode$Preserve=no
    }
    public String getEventCodeValueStereotype() {
//$Section=Attribute getValueStereotype$EventCode$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$EventCode$Preserve=no
    }

//----------------------------------------------------------------------------
// Description
//----------------------------------------------------------------------------
    public String getDescription() {
//$Section=Attribute get$Description$Preserve=no
        return iDescription.getValueString();
//$Section=Attribute get$Description$Preserve=no
    }
    public String getDescription(String aValue) {
//$Section=Attribute get$Description(String)$Preserve=no
      if (isDescriptionNull()) return aValue;
      return iDescription.getValueString();
//$Section=Attribute get$Description(String)$Preserve=no
    }
    public void setDescription(String aValue) {
//$Section=Attribute set$Description$Preserve=no
        iDescription.reset(aValue);
//$Section=Attribute set$Description$Preserve=no
    }
    public void setDescription(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Description$Preserve=no
        if (aValue.getType().equals("null")) {
          setDescriptionNull();
          return;
        }
        setDescription(aValue.toString());
//$Section=Attribute setPropertyValue$Description$Preserve=no
    }
    public void setDescription(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Description$Preserve=no
        if (aValue.getType().equals("null")) {
          setDescriptionNull();
          return;
        }
        setDescription(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Description$Preserve=no
    }
    public void setDescription(String aValue, String aType) {
//$Section=Attribute setAsStringType$Description$Preserve=no
        iDescription.reset(aType, aValue);
//$Section=Attribute setAsStringType$Description$Preserve=no
    }
    public PropertyValue getDescriptionPropertyValue() {
//$Section=Attribute getPropertyValue$Description$Preserve=no
        return iDescription;
//$Section=Attribute getPropertyValue$Description$Preserve=no
    }
    public String getAttributeName_description() {
//$Section=Attribute getAttributeName$description$Preserve=no
        return "Description";
//$Section=Attribute getAttributeName_$description$Preserve=no
    }
    public int sizeDescription() {
//$Section=Attribute size$Description$Preserve=no
        return iDescriptionSize;
//$Section=Attribute size$Description$Preserve=no
    }
    public boolean isDescriptionNullable() {
//$Section=Attribute isNullable$Description$Preserve=no
        return iDescriptionIsNullable;
//$Section=Attribute isNullable$Description$Preserve=no
    }
    public boolean isDescriptionNull() {
//$Section=Attribute isNull$Description$Preserve=no
        if (iDescription.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Description$Preserve=no
    }
    public void setDescriptionNull() {
//$Section=Attribute setNull$Description$Preserve=no
        iDescription.reset();
//$Section=Attribute setNull$Description$Preserve=no
    }
    public void setDescriptionSpaceToNull() {
//$Section=Attribute setSpaceToNull$Description$Preserve=no
        if (getDescriptionPropertyValue().toString().trim().equals("")) setDescriptionNull();
//$Section=Attribute setSpaceToNull$Description$Preserve=no
    }
    public void setDescriptionUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Description$Preserve=no
        iDescriptionUpdate = aUpdate;
//$Section=Attribute setUpdate$Description$Preserve=no
    }
    public boolean getDescriptionUpdate() {
//$Section=Attribute getUpdate$Description$Preserve=no
        return iDescriptionUpdate;
//$Section=Attribute getUpdate$Description$Preserve=no
    }
    public String getDescriptionValueType() {
//$Section=Attribute getValueType$Description$Preserve=no
        return "string";
//$Section=Attribute getValueType$Description$Preserve=no
    }
    public String getDescriptionValueStereotype() {
//$Section=Attribute getValueStereotype$Description$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Description$Preserve=no
    }

//----------------------------------------------------------------------------
// ScriptName
//----------------------------------------------------------------------------
    public String getScriptName() {
//$Section=Attribute get$ScriptName$Preserve=no
        return iScriptName.getValueString();
//$Section=Attribute get$ScriptName$Preserve=no
    }
    public String getScriptName(String aValue) {
//$Section=Attribute get$ScriptName(String)$Preserve=no
      if (isScriptNameNull()) return aValue;
      return iScriptName.getValueString();
//$Section=Attribute get$ScriptName(String)$Preserve=no
    }
    public void setScriptName(String aValue) {
//$Section=Attribute set$ScriptName$Preserve=no
        iScriptName.reset(aValue);
//$Section=Attribute set$ScriptName$Preserve=no
    }
    public void setScriptName(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$ScriptName$Preserve=no
        if (aValue.getType().equals("null")) {
          setScriptNameNull();
          return;
        }
        setScriptName(aValue.toString());
//$Section=Attribute setPropertyValue$ScriptName$Preserve=no
    }
    public void setScriptName(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$ScriptName$Preserve=no
        if (aValue.getType().equals("null")) {
          setScriptNameNull();
          return;
        }
        setScriptName(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$ScriptName$Preserve=no
    }
    public void setScriptName(String aValue, String aType) {
//$Section=Attribute setAsStringType$ScriptName$Preserve=no
        iScriptName.reset(aType, aValue);
//$Section=Attribute setAsStringType$ScriptName$Preserve=no
    }
    public PropertyValue getScriptNamePropertyValue() {
//$Section=Attribute getPropertyValue$ScriptName$Preserve=no
        return iScriptName;
//$Section=Attribute getPropertyValue$ScriptName$Preserve=no
    }
    public String getAttributeName_scriptname() {
//$Section=Attribute getAttributeName$scriptname$Preserve=no
        return "ScriptName";
//$Section=Attribute getAttributeName_$scriptname$Preserve=no
    }
    public int sizeScriptName() {
//$Section=Attribute size$ScriptName$Preserve=no
        return iScriptNameSize;
//$Section=Attribute size$ScriptName$Preserve=no
    }
    public boolean isScriptNameNullable() {
//$Section=Attribute isNullable$ScriptName$Preserve=no
        return iScriptNameIsNullable;
//$Section=Attribute isNullable$ScriptName$Preserve=no
    }
    public boolean isScriptNameNull() {
//$Section=Attribute isNull$ScriptName$Preserve=no
        if (iScriptName.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$ScriptName$Preserve=no
    }
    public void setScriptNameNull() {
//$Section=Attribute setNull$ScriptName$Preserve=no
        iScriptName.reset();
//$Section=Attribute setNull$ScriptName$Preserve=no
    }
    public void setScriptNameSpaceToNull() {
//$Section=Attribute setSpaceToNull$ScriptName$Preserve=no
        if (getScriptNamePropertyValue().toString().trim().equals("")) setScriptNameNull();
//$Section=Attribute setSpaceToNull$ScriptName$Preserve=no
    }
    public void setScriptNameUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$ScriptName$Preserve=no
        iScriptNameUpdate = aUpdate;
//$Section=Attribute setUpdate$ScriptName$Preserve=no
    }
    public boolean getScriptNameUpdate() {
//$Section=Attribute getUpdate$ScriptName$Preserve=no
        return iScriptNameUpdate;
//$Section=Attribute getUpdate$ScriptName$Preserve=no
    }
    public String getScriptNameValueType() {
//$Section=Attribute getValueType$ScriptName$Preserve=no
        return "string";
//$Section=Attribute getValueType$ScriptName$Preserve=no
    }
    public String getScriptNameValueStereotype() {
//$Section=Attribute getValueStereotype$ScriptName$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$ScriptName$Preserve=no
    }

//----------------------------------------------------------------------------
// Method
//----------------------------------------------------------------------------
    public String getMethod() {
//$Section=Attribute get$Method$Preserve=no
        return iMethod.getValueString();
//$Section=Attribute get$Method$Preserve=no
    }
    public String getMethod(String aValue) {
//$Section=Attribute get$Method(String)$Preserve=no
      if (isMethodNull()) return aValue;
      return iMethod.getValueString();
//$Section=Attribute get$Method(String)$Preserve=no
    }
    public void setMethod(String aValue) {
//$Section=Attribute set$Method$Preserve=no
        iMethod.reset(aValue);
//$Section=Attribute set$Method$Preserve=no
    }
    public void setMethod(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Method$Preserve=no
        if (aValue.getType().equals("null")) {
          setMethodNull();
          return;
        }
        setMethod(aValue.toString());
//$Section=Attribute setPropertyValue$Method$Preserve=no
    }
    public void setMethod(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Method$Preserve=no
        if (aValue.getType().equals("null")) {
          setMethodNull();
          return;
        }
        setMethod(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Method$Preserve=no
    }
    public void setMethod(String aValue, String aType) {
//$Section=Attribute setAsStringType$Method$Preserve=no
        iMethod.reset(aType, aValue);
//$Section=Attribute setAsStringType$Method$Preserve=no
    }
    public PropertyValue getMethodPropertyValue() {
//$Section=Attribute getPropertyValue$Method$Preserve=no
        return iMethod;
//$Section=Attribute getPropertyValue$Method$Preserve=no
    }
    public String getAttributeName_method() {
//$Section=Attribute getAttributeName$method$Preserve=no
        return "Method";
//$Section=Attribute getAttributeName_$method$Preserve=no
    }
    public int sizeMethod() {
//$Section=Attribute size$Method$Preserve=no
        return iMethodSize;
//$Section=Attribute size$Method$Preserve=no
    }
    public boolean isMethodNullable() {
//$Section=Attribute isNullable$Method$Preserve=no
        return iMethodIsNullable;
//$Section=Attribute isNullable$Method$Preserve=no
    }
    public boolean isMethodNull() {
//$Section=Attribute isNull$Method$Preserve=no
        if (iMethod.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Method$Preserve=no
    }
    public void setMethodNull() {
//$Section=Attribute setNull$Method$Preserve=no
        iMethod.reset();
//$Section=Attribute setNull$Method$Preserve=no
    }
    public void setMethodSpaceToNull() {
//$Section=Attribute setSpaceToNull$Method$Preserve=no
        if (getMethodPropertyValue().toString().trim().equals("")) setMethodNull();
//$Section=Attribute setSpaceToNull$Method$Preserve=no
    }
    public void setMethodUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Method$Preserve=no
        iMethodUpdate = aUpdate;
//$Section=Attribute setUpdate$Method$Preserve=no
    }
    public boolean getMethodUpdate() {
//$Section=Attribute getUpdate$Method$Preserve=no
        return iMethodUpdate;
//$Section=Attribute getUpdate$Method$Preserve=no
    }
    public String getMethodValueType() {
//$Section=Attribute getValueType$Method$Preserve=no
        return "string";
//$Section=Attribute getValueType$Method$Preserve=no
    }
    public String getMethodValueStereotype() {
//$Section=Attribute getValueStereotype$Method$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Method$Preserve=no
    }

//----------------------------------------------------------------------------
// Location
//----------------------------------------------------------------------------
    public String getLocation() {
//$Section=Attribute get$Location$Preserve=no
        return iLocation.getValueString();
//$Section=Attribute get$Location$Preserve=no
    }
    public String getLocation(String aValue) {
//$Section=Attribute get$Location(String)$Preserve=no
      if (isLocationNull()) return aValue;
      return iLocation.getValueString();
//$Section=Attribute get$Location(String)$Preserve=no
    }
    public void setLocation(String aValue) {
//$Section=Attribute set$Location$Preserve=no
        iLocation.reset(aValue);
//$Section=Attribute set$Location$Preserve=no
    }
    public void setLocation(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Location$Preserve=no
        if (aValue.getType().equals("null")) {
          setLocationNull();
          return;
        }
        setLocation(aValue.toString());
//$Section=Attribute setPropertyValue$Location$Preserve=no
    }
    public void setLocation(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Location$Preserve=no
        if (aValue.getType().equals("null")) {
          setLocationNull();
          return;
        }
        setLocation(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Location$Preserve=no
    }
    public void setLocation(String aValue, String aType) {
//$Section=Attribute setAsStringType$Location$Preserve=no
        iLocation.reset(aType, aValue);
//$Section=Attribute setAsStringType$Location$Preserve=no
    }
    public PropertyValue getLocationPropertyValue() {
//$Section=Attribute getPropertyValue$Location$Preserve=no
        return iLocation;
//$Section=Attribute getPropertyValue$Location$Preserve=no
    }
    public String getAttributeName_location() {
//$Section=Attribute getAttributeName$location$Preserve=no
        return "Location";
//$Section=Attribute getAttributeName_$location$Preserve=no
    }
    public int sizeLocation() {
//$Section=Attribute size$Location$Preserve=no
        return iLocationSize;
//$Section=Attribute size$Location$Preserve=no
    }
    public boolean isLocationNullable() {
//$Section=Attribute isNullable$Location$Preserve=no
        return iLocationIsNullable;
//$Section=Attribute isNullable$Location$Preserve=no
    }
    public boolean isLocationNull() {
//$Section=Attribute isNull$Location$Preserve=no
        if (iLocation.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Location$Preserve=no
    }
    public void setLocationNull() {
//$Section=Attribute setNull$Location$Preserve=no
        iLocation.reset();
//$Section=Attribute setNull$Location$Preserve=no
    }
    public void setLocationSpaceToNull() {
//$Section=Attribute setSpaceToNull$Location$Preserve=no
        if (getLocationPropertyValue().toString().trim().equals("")) setLocationNull();
//$Section=Attribute setSpaceToNull$Location$Preserve=no
    }
    public void setLocationUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Location$Preserve=no
        iLocationUpdate = aUpdate;
//$Section=Attribute setUpdate$Location$Preserve=no
    }
    public boolean getLocationUpdate() {
//$Section=Attribute getUpdate$Location$Preserve=no
        return iLocationUpdate;
//$Section=Attribute getUpdate$Location$Preserve=no
    }
    public String getLocationValueType() {
//$Section=Attribute getValueType$Location$Preserve=no
        return "string";
//$Section=Attribute getValueType$Location$Preserve=no
    }
    public String getLocationValueStereotype() {
//$Section=Attribute getValueStereotype$Location$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Location$Preserve=no
    }

//----------------------------------------------------------------------------
// Exception
//----------------------------------------------------------------------------
    public String getException() {
//$Section=Attribute get$Exception$Preserve=no
        return iException.getValueString();
//$Section=Attribute get$Exception$Preserve=no
    }
    public String getException(String aValue) {
//$Section=Attribute get$Exception(String)$Preserve=no
      if (isExceptionNull()) return aValue;
      return iException.getValueString();
//$Section=Attribute get$Exception(String)$Preserve=no
    }
    public void setException(String aValue) {
//$Section=Attribute set$Exception$Preserve=no
        iException.reset(aValue);
//$Section=Attribute set$Exception$Preserve=no
    }
    public void setException(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Exception$Preserve=no
        if (aValue.getType().equals("null")) {
          setExceptionNull();
          return;
        }
        setException(aValue.toString());
//$Section=Attribute setPropertyValue$Exception$Preserve=no
    }
    public void setException(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Exception$Preserve=no
        if (aValue.getType().equals("null")) {
          setExceptionNull();
          return;
        }
        setException(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Exception$Preserve=no
    }
    public void setException(String aValue, String aType) {
//$Section=Attribute setAsStringType$Exception$Preserve=no
        iException.reset(aType, aValue);
//$Section=Attribute setAsStringType$Exception$Preserve=no
    }
    public PropertyValue getExceptionPropertyValue() {
//$Section=Attribute getPropertyValue$Exception$Preserve=no
        return iException;
//$Section=Attribute getPropertyValue$Exception$Preserve=no
    }
    public String getAttributeName_exception() {
//$Section=Attribute getAttributeName$exception$Preserve=no
        return "Exception";
//$Section=Attribute getAttributeName_$exception$Preserve=no
    }
    public int sizeException() {
//$Section=Attribute size$Exception$Preserve=no
        return iExceptionSize;
//$Section=Attribute size$Exception$Preserve=no
    }
    public boolean isExceptionNullable() {
//$Section=Attribute isNullable$Exception$Preserve=no
        return iExceptionIsNullable;
//$Section=Attribute isNullable$Exception$Preserve=no
    }
    public boolean isExceptionNull() {
//$Section=Attribute isNull$Exception$Preserve=no
        if (iException.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Exception$Preserve=no
    }
    public void setExceptionNull() {
//$Section=Attribute setNull$Exception$Preserve=no
        iException.reset();
//$Section=Attribute setNull$Exception$Preserve=no
    }
    public void setExceptionSpaceToNull() {
//$Section=Attribute setSpaceToNull$Exception$Preserve=no
        if (getExceptionPropertyValue().toString().trim().equals("")) setExceptionNull();
//$Section=Attribute setSpaceToNull$Exception$Preserve=no
    }
    public void setExceptionUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Exception$Preserve=no
        iExceptionUpdate = aUpdate;
//$Section=Attribute setUpdate$Exception$Preserve=no
    }
    public boolean getExceptionUpdate() {
//$Section=Attribute getUpdate$Exception$Preserve=no
        return iExceptionUpdate;
//$Section=Attribute getUpdate$Exception$Preserve=no
    }
    public String getExceptionValueType() {
//$Section=Attribute getValueType$Exception$Preserve=no
        return "string";
//$Section=Attribute getValueType$Exception$Preserve=no
    }
    public String getExceptionValueStereotype() {
//$Section=Attribute getValueStereotype$Exception$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Exception$Preserve=no
    }


//$Section=Deleted$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$Preserve=no

//End of class---------------
}
