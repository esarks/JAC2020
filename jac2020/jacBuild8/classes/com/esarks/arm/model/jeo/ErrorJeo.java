//$Section=License$Preserve=no
//  Generated at 2005.12.24 12:42:49.687 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  XML Definition: com.esarks.arm.model.jeo.Service_Jeo
//     Module Name: com.esarks.arm.model.jeo.ErrorJeo

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

public class ErrorJeo extends com.esarks.jac.Jeo {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes

//Id  Type: string  Size: 0  Nullable: true
    private PropertyValue iId = new PropertyValue();
    private boolean iIdIsNullable = true;
    private boolean iIdUpdate = false;
    private int iIdSize = 0;
//Location  Type: string  Size: 0  Nullable: true
    private PropertyValue iLocation = new PropertyValue();
    private boolean iLocationIsNullable = true;
    private boolean iLocationUpdate = false;
    private int iLocationSize = 0;
//Title  Type: string  Size: 0  Nullable: true
    private PropertyValue iTitle = new PropertyValue();
    private boolean iTitleIsNullable = true;
    private boolean iTitleUpdate = false;
    private int iTitleSize = 0;
//Text  Type: string  Size: 0  Nullable: true
    private PropertyValue iText = new PropertyValue();
    private boolean iTextIsNullable = true;
    private boolean iTextUpdate = false;
    private int iTextSize = 0;
//Resolution  Type: string  Size: 0  Nullable: true
    private PropertyValue iResolution = new PropertyValue();
    private boolean iResolutionIsNullable = true;
    private boolean iResolutionUpdate = false;
    private int iResolutionSize = 0;
//Severity  Type: int  Size: 0  Nullable: true
    private PropertyValue iSeverity = new PropertyValue();
    private boolean iSeverityIsNullable = true;
    private boolean iSeverityUpdate = false;
    private int iSeveritySize = 0;

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
    public ErrorJeo() {
      iInstanceName = "com.esarks.arm.model.jeo.ErrorJeo";
//$Section=DefaultConstructor$Preserve=yes
//$Section=DefaultConstructor$Preserve=no
    }

/**
 *
 */
    public ErrorJeo( com.esarks.jac.JeoFactory aJeoFactory ) {
      iInstanceName = "com.esarks.arm.model.jeo.ErrorJeo";
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=yes
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=no
    }

/**
 *
 */
    public ErrorJeo( Script aScript ) {
      super("", aScript);
      iInstanceName = "com.esarks.arm.model.jeo.ErrorJeo";
//$Section=Operation$Jeo( String aScript )$Preserve=yes
//$Section=Operation$Jeo( String aScript )$Preserve=no
    }

/**
 *
 */
    public ErrorJeo( String aTypeName ) {
      iInstanceName = "com.esarks.arm.model.jeo.ErrorJeo";
      iJeoTypeName = aTypeName;
//$Section=Operation$Jeo( String aTypeName )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName )$Preserve=no
    }

/**
 *
 */
    public ErrorJeo( String aTypeName, Script aScript ) {
      super("", aScript);
      iInstanceName = "com.esarks.arm.model.jeo.ErrorJeo";
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
    iId = null;
    iLocation = null;
    iTitle = null;
    iText = null;
    iResolution = null;
    iSeverity = null;
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
//Id
    iId = new PropertyValue();
    iIdUpdate = false;
//Location
    iLocation = new PropertyValue();
    iLocationUpdate = false;
//Title
    iTitle = new PropertyValue();
    iTitleUpdate = false;
//Text
    iText = new PropertyValue();
    iTextUpdate = false;
//Resolution
    iResolution = new PropertyValue();
    iResolutionUpdate = false;
//Severity
    iSeverity = new PropertyValue();
    iSeverityUpdate = false;
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
// Id
      try {
        lValue = aJeo.getPropertyValueByName("id");
        if (lValue != null) {
          lType = aJeo.getTypeByName("id");
          if (!isIdNull()) {
            lValue.reset(lType, getIdPropertyValue().toString());
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
// Title
      try {
        lValue = aJeo.getPropertyValueByName("title");
        if (lValue != null) {
          lType = aJeo.getTypeByName("title");
          if (!isTitleNull()) {
            lValue.reset(lType, getTitlePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Text
      try {
        lValue = aJeo.getPropertyValueByName("text");
        if (lValue != null) {
          lType = aJeo.getTypeByName("text");
          if (!isTextNull()) {
            lValue.reset(lType, getTextPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Resolution
      try {
        lValue = aJeo.getPropertyValueByName("resolution");
        if (lValue != null) {
          lType = aJeo.getTypeByName("resolution");
          if (!isResolutionNull()) {
            lValue.reset(lType, getResolutionPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Severity
      try {
        lValue = aJeo.getPropertyValueByName("severity");
        if (lValue != null) {
          lType = aJeo.getTypeByName("severity");
          if (!isSeverityNull()) {
            lValue.reset(lType, getSeverityPropertyValue().toString());
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
// Id
      try {
        lValue = aJeo.getPropertyValueByName("id");
        if (lValue != null) {
          setId(lValue);
        }
      } catch(Throwable e) {}
// Location
      try {
        lValue = aJeo.getPropertyValueByName("location");
        if (lValue != null) {
          setLocation(lValue);
        }
      } catch(Throwable e) {}
// Title
      try {
        lValue = aJeo.getPropertyValueByName("title");
        if (lValue != null) {
          setTitle(lValue);
        }
      } catch(Throwable e) {}
// Text
      try {
        lValue = aJeo.getPropertyValueByName("text");
        if (lValue != null) {
          setText(lValue);
        }
      } catch(Throwable e) {}
// Resolution
      try {
        lValue = aJeo.getPropertyValueByName("resolution");
        if (lValue != null) {
          setResolution(lValue);
        }
      } catch(Throwable e) {}
// Severity
      try {
        lValue = aJeo.getPropertyValueByName("severity");
        if (lValue != null) {
          setSeverity(lValue);
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
      case 1: return "id";
      case 2: return "location";
      case 3: return "title";
      case 4: return "text";
      case 5: return "resolution";
      case 6: return "severity";
    }
    return null;
//$Section=Operation$getNameByIndex$Preserve=no
  }

  public String getXml ( ) {
//$Section=Operation$getXml$Preserve=no

    StringBuffer lXml = new StringBuffer("<jeo name='com.esarks.arm.model.jeo.ErrorJeo'>");
    String lCdataBegin = "<" + "!" + "[CDATA[";
// Field: Id
    lXml.append("<field name='Id' type='string'>");
    lXml.append(lCdataBegin).append(getIdPropertyValue().toString()).append("]]>").append("</field>");
// Field: Location
    lXml.append("<field name='Location' type='string'>");
    lXml.append(lCdataBegin).append(getLocationPropertyValue().toString()).append("]]>").append("</field>");
// Field: Title
    lXml.append("<field name='Title' type='string'>");
    lXml.append(lCdataBegin).append(getTitlePropertyValue().toString()).append("]]>").append("</field>");
// Field: Text
    lXml.append("<field name='Text' type='string'>");
    lXml.append(lCdataBegin).append(getTextPropertyValue().toString()).append("]]>").append("</field>");
// Field: Resolution
    lXml.append("<field name='Resolution' type='string'>");
    lXml.append(lCdataBegin).append(getResolutionPropertyValue().toString()).append("]]>").append("</field>");
// Field: Severity
    lXml.append("<field name='Severity' type='int'>");
    lXml.append(getSeverityPropertyValue().toString()).append("</field>");
    lXml.append("</jeo>");
    return lXml.toString();

//$Section=Operation$getXml$Preserve=no
  }

  public boolean isJeoEqual ( Jeo aJeo) {
//$Section=Operation$isJeoEqual$Preserve=no

    PropertyValue lThisValue = null;
    PropertyValue lThatValue = null;
    lThisValue = this.getPropertyValueByName("id");
    lThatValue = aJeo.getPropertyValueByName("id");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("location");
    lThatValue = aJeo.getPropertyValueByName("location");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("title");
    lThatValue = aJeo.getPropertyValueByName("title");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("text");
    lThatValue = aJeo.getPropertyValueByName("text");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("resolution");
    lThatValue = aJeo.getPropertyValueByName("resolution");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("severity");
    lThatValue = aJeo.getPropertyValueByName("severity");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    return true;
//$Section=Operation$isJeoEqual$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
// Id
//----------------------------------------------------------------------------
    public String getId() {
//$Section=Attribute get$Id$Preserve=no
        return iId.getValueString();
//$Section=Attribute get$Id$Preserve=no
    }
    public String getId(String aValue) {
//$Section=Attribute get$Id(String)$Preserve=no
      if (isIdNull()) return aValue;
      return iId.getValueString();
//$Section=Attribute get$Id(String)$Preserve=no
    }
    public void setId(String aValue) {
//$Section=Attribute set$Id$Preserve=no
        iId.reset(aValue);
//$Section=Attribute set$Id$Preserve=no
    }
    public void setId(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Id$Preserve=no
        if (aValue.getType().equals("null")) {
          setIdNull();
          return;
        }
        setId(aValue.toString());
//$Section=Attribute setPropertyValue$Id$Preserve=no
    }
    public void setId(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Id$Preserve=no
        if (aValue.getType().equals("null")) {
          setIdNull();
          return;
        }
        setId(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Id$Preserve=no
    }
    public void setId(String aValue, String aType) {
//$Section=Attribute setAsStringType$Id$Preserve=no
        iId.reset(aType, aValue);
//$Section=Attribute setAsStringType$Id$Preserve=no
    }
    public PropertyValue getIdPropertyValue() {
//$Section=Attribute getPropertyValue$Id$Preserve=no
        return iId;
//$Section=Attribute getPropertyValue$Id$Preserve=no
    }
    public String getAttributeName_id() {
//$Section=Attribute getAttributeName$id$Preserve=no
        return "Id";
//$Section=Attribute getAttributeName_$id$Preserve=no
    }
    public int sizeId() {
//$Section=Attribute size$Id$Preserve=no
        return iIdSize;
//$Section=Attribute size$Id$Preserve=no
    }
    public boolean isIdNullable() {
//$Section=Attribute isNullable$Id$Preserve=no
        return iIdIsNullable;
//$Section=Attribute isNullable$Id$Preserve=no
    }
    public boolean isIdNull() {
//$Section=Attribute isNull$Id$Preserve=no
        if (iId.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Id$Preserve=no
    }
    public void setIdNull() {
//$Section=Attribute setNull$Id$Preserve=no
        iId.reset();
//$Section=Attribute setNull$Id$Preserve=no
    }
    public void setIdSpaceToNull() {
//$Section=Attribute setSpaceToNull$Id$Preserve=no
        if (getIdPropertyValue().toString().trim().equals("")) setIdNull();
//$Section=Attribute setSpaceToNull$Id$Preserve=no
    }
    public void setIdUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Id$Preserve=no
        iIdUpdate = aUpdate;
//$Section=Attribute setUpdate$Id$Preserve=no
    }
    public boolean getIdUpdate() {
//$Section=Attribute getUpdate$Id$Preserve=no
        return iIdUpdate;
//$Section=Attribute getUpdate$Id$Preserve=no
    }
    public String getIdValueType() {
//$Section=Attribute getValueType$Id$Preserve=no
        return "string";
//$Section=Attribute getValueType$Id$Preserve=no
    }
    public String getIdValueStereotype() {
//$Section=Attribute getValueStereotype$Id$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Id$Preserve=no
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
// Title
//----------------------------------------------------------------------------
    public String getTitle() {
//$Section=Attribute get$Title$Preserve=no
        return iTitle.getValueString();
//$Section=Attribute get$Title$Preserve=no
    }
    public String getTitle(String aValue) {
//$Section=Attribute get$Title(String)$Preserve=no
      if (isTitleNull()) return aValue;
      return iTitle.getValueString();
//$Section=Attribute get$Title(String)$Preserve=no
    }
    public void setTitle(String aValue) {
//$Section=Attribute set$Title$Preserve=no
        iTitle.reset(aValue);
//$Section=Attribute set$Title$Preserve=no
    }
    public void setTitle(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Title$Preserve=no
        if (aValue.getType().equals("null")) {
          setTitleNull();
          return;
        }
        setTitle(aValue.toString());
//$Section=Attribute setPropertyValue$Title$Preserve=no
    }
    public void setTitle(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Title$Preserve=no
        if (aValue.getType().equals("null")) {
          setTitleNull();
          return;
        }
        setTitle(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Title$Preserve=no
    }
    public void setTitle(String aValue, String aType) {
//$Section=Attribute setAsStringType$Title$Preserve=no
        iTitle.reset(aType, aValue);
//$Section=Attribute setAsStringType$Title$Preserve=no
    }
    public PropertyValue getTitlePropertyValue() {
//$Section=Attribute getPropertyValue$Title$Preserve=no
        return iTitle;
//$Section=Attribute getPropertyValue$Title$Preserve=no
    }
    public String getAttributeName_title() {
//$Section=Attribute getAttributeName$title$Preserve=no
        return "Title";
//$Section=Attribute getAttributeName_$title$Preserve=no
    }
    public int sizeTitle() {
//$Section=Attribute size$Title$Preserve=no
        return iTitleSize;
//$Section=Attribute size$Title$Preserve=no
    }
    public boolean isTitleNullable() {
//$Section=Attribute isNullable$Title$Preserve=no
        return iTitleIsNullable;
//$Section=Attribute isNullable$Title$Preserve=no
    }
    public boolean isTitleNull() {
//$Section=Attribute isNull$Title$Preserve=no
        if (iTitle.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Title$Preserve=no
    }
    public void setTitleNull() {
//$Section=Attribute setNull$Title$Preserve=no
        iTitle.reset();
//$Section=Attribute setNull$Title$Preserve=no
    }
    public void setTitleSpaceToNull() {
//$Section=Attribute setSpaceToNull$Title$Preserve=no
        if (getTitlePropertyValue().toString().trim().equals("")) setTitleNull();
//$Section=Attribute setSpaceToNull$Title$Preserve=no
    }
    public void setTitleUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Title$Preserve=no
        iTitleUpdate = aUpdate;
//$Section=Attribute setUpdate$Title$Preserve=no
    }
    public boolean getTitleUpdate() {
//$Section=Attribute getUpdate$Title$Preserve=no
        return iTitleUpdate;
//$Section=Attribute getUpdate$Title$Preserve=no
    }
    public String getTitleValueType() {
//$Section=Attribute getValueType$Title$Preserve=no
        return "string";
//$Section=Attribute getValueType$Title$Preserve=no
    }
    public String getTitleValueStereotype() {
//$Section=Attribute getValueStereotype$Title$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Title$Preserve=no
    }

//----------------------------------------------------------------------------
// Text
//----------------------------------------------------------------------------
    public String getText() {
//$Section=Attribute get$Text$Preserve=no
        return iText.getValueString();
//$Section=Attribute get$Text$Preserve=no
    }
    public String getText(String aValue) {
//$Section=Attribute get$Text(String)$Preserve=no
      if (isTextNull()) return aValue;
      return iText.getValueString();
//$Section=Attribute get$Text(String)$Preserve=no
    }
    public void setText(String aValue) {
//$Section=Attribute set$Text$Preserve=no
        iText.reset(aValue);
//$Section=Attribute set$Text$Preserve=no
    }
    public void setText(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Text$Preserve=no
        if (aValue.getType().equals("null")) {
          setTextNull();
          return;
        }
        setText(aValue.toString());
//$Section=Attribute setPropertyValue$Text$Preserve=no
    }
    public void setText(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Text$Preserve=no
        if (aValue.getType().equals("null")) {
          setTextNull();
          return;
        }
        setText(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Text$Preserve=no
    }
    public void setText(String aValue, String aType) {
//$Section=Attribute setAsStringType$Text$Preserve=no
        iText.reset(aType, aValue);
//$Section=Attribute setAsStringType$Text$Preserve=no
    }
    public PropertyValue getTextPropertyValue() {
//$Section=Attribute getPropertyValue$Text$Preserve=no
        return iText;
//$Section=Attribute getPropertyValue$Text$Preserve=no
    }
    public String getAttributeName_text() {
//$Section=Attribute getAttributeName$text$Preserve=no
        return "Text";
//$Section=Attribute getAttributeName_$text$Preserve=no
    }
    public int sizeText() {
//$Section=Attribute size$Text$Preserve=no
        return iTextSize;
//$Section=Attribute size$Text$Preserve=no
    }
    public boolean isTextNullable() {
//$Section=Attribute isNullable$Text$Preserve=no
        return iTextIsNullable;
//$Section=Attribute isNullable$Text$Preserve=no
    }
    public boolean isTextNull() {
//$Section=Attribute isNull$Text$Preserve=no
        if (iText.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Text$Preserve=no
    }
    public void setTextNull() {
//$Section=Attribute setNull$Text$Preserve=no
        iText.reset();
//$Section=Attribute setNull$Text$Preserve=no
    }
    public void setTextSpaceToNull() {
//$Section=Attribute setSpaceToNull$Text$Preserve=no
        if (getTextPropertyValue().toString().trim().equals("")) setTextNull();
//$Section=Attribute setSpaceToNull$Text$Preserve=no
    }
    public void setTextUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Text$Preserve=no
        iTextUpdate = aUpdate;
//$Section=Attribute setUpdate$Text$Preserve=no
    }
    public boolean getTextUpdate() {
//$Section=Attribute getUpdate$Text$Preserve=no
        return iTextUpdate;
//$Section=Attribute getUpdate$Text$Preserve=no
    }
    public String getTextValueType() {
//$Section=Attribute getValueType$Text$Preserve=no
        return "string";
//$Section=Attribute getValueType$Text$Preserve=no
    }
    public String getTextValueStereotype() {
//$Section=Attribute getValueStereotype$Text$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Text$Preserve=no
    }

//----------------------------------------------------------------------------
// Resolution
//----------------------------------------------------------------------------
    public String getResolution() {
//$Section=Attribute get$Resolution$Preserve=no
        return iResolution.getValueString();
//$Section=Attribute get$Resolution$Preserve=no
    }
    public String getResolution(String aValue) {
//$Section=Attribute get$Resolution(String)$Preserve=no
      if (isResolutionNull()) return aValue;
      return iResolution.getValueString();
//$Section=Attribute get$Resolution(String)$Preserve=no
    }
    public void setResolution(String aValue) {
//$Section=Attribute set$Resolution$Preserve=no
        iResolution.reset(aValue);
//$Section=Attribute set$Resolution$Preserve=no
    }
    public void setResolution(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Resolution$Preserve=no
        if (aValue.getType().equals("null")) {
          setResolutionNull();
          return;
        }
        setResolution(aValue.toString());
//$Section=Attribute setPropertyValue$Resolution$Preserve=no
    }
    public void setResolution(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Resolution$Preserve=no
        if (aValue.getType().equals("null")) {
          setResolutionNull();
          return;
        }
        setResolution(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Resolution$Preserve=no
    }
    public void setResolution(String aValue, String aType) {
//$Section=Attribute setAsStringType$Resolution$Preserve=no
        iResolution.reset(aType, aValue);
//$Section=Attribute setAsStringType$Resolution$Preserve=no
    }
    public PropertyValue getResolutionPropertyValue() {
//$Section=Attribute getPropertyValue$Resolution$Preserve=no
        return iResolution;
//$Section=Attribute getPropertyValue$Resolution$Preserve=no
    }
    public String getAttributeName_resolution() {
//$Section=Attribute getAttributeName$resolution$Preserve=no
        return "Resolution";
//$Section=Attribute getAttributeName_$resolution$Preserve=no
    }
    public int sizeResolution() {
//$Section=Attribute size$Resolution$Preserve=no
        return iResolutionSize;
//$Section=Attribute size$Resolution$Preserve=no
    }
    public boolean isResolutionNullable() {
//$Section=Attribute isNullable$Resolution$Preserve=no
        return iResolutionIsNullable;
//$Section=Attribute isNullable$Resolution$Preserve=no
    }
    public boolean isResolutionNull() {
//$Section=Attribute isNull$Resolution$Preserve=no
        if (iResolution.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Resolution$Preserve=no
    }
    public void setResolutionNull() {
//$Section=Attribute setNull$Resolution$Preserve=no
        iResolution.reset();
//$Section=Attribute setNull$Resolution$Preserve=no
    }
    public void setResolutionSpaceToNull() {
//$Section=Attribute setSpaceToNull$Resolution$Preserve=no
        if (getResolutionPropertyValue().toString().trim().equals("")) setResolutionNull();
//$Section=Attribute setSpaceToNull$Resolution$Preserve=no
    }
    public void setResolutionUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Resolution$Preserve=no
        iResolutionUpdate = aUpdate;
//$Section=Attribute setUpdate$Resolution$Preserve=no
    }
    public boolean getResolutionUpdate() {
//$Section=Attribute getUpdate$Resolution$Preserve=no
        return iResolutionUpdate;
//$Section=Attribute getUpdate$Resolution$Preserve=no
    }
    public String getResolutionValueType() {
//$Section=Attribute getValueType$Resolution$Preserve=no
        return "string";
//$Section=Attribute getValueType$Resolution$Preserve=no
    }
    public String getResolutionValueStereotype() {
//$Section=Attribute getValueStereotype$Resolution$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Resolution$Preserve=no
    }

//----------------------------------------------------------------------------
// Severity
//----------------------------------------------------------------------------
    public int getSeverity() {
//$Section=Attribute get$Severity$Preserve=no
        return iSeverity.getValueInt();
//$Section=Attribute get$Severity$Preserve=no
    }
    public int getSeverity(int aValue) {
//$Section=Attribute get$Severity(int)$Preserve=no
      if (isSeverityNull()) return aValue;
      return iSeverity.getValueInt();
//$Section=Attribute get$Severity(int)$Preserve=no
    }
    public void setSeverity(int aValue) {
//$Section=Attribute set$Severity$Preserve=no
        iSeverity.reset(aValue);
//$Section=Attribute set$Severity$Preserve=no
    }
    public void setSeverity(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Severity$Preserve=no
        if (aValue.getType().equals("null")) {
          setSeverityNull();
          return;
        }
        setSeverity(aValue.toString());
//$Section=Attribute setPropertyValue$Severity$Preserve=no
    }
    public void setSeverity(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Severity$Preserve=no
        if (aValue.getType().equals("null")) {
          setSeverityNull();
          return;
        }
        setSeverity(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Severity$Preserve=no
    }
    public void setSeverity(String aValue) {
//$Section=Attribute setAsString$Severity$Preserve=no
        iSeverity.reset("int", aValue);
//$Section=Attribute setAsString$Severity$Preserve=no
    }
    public void setSeverity(String aValue, String aType) {
//$Section=Attribute setAsStringType$Severity$Preserve=no
        iSeverity.reset(aType, aValue);
//$Section=Attribute setAsStringType$Severity$Preserve=no
    }
    public PropertyValue getSeverityPropertyValue() {
//$Section=Attribute getPropertyValue$Severity$Preserve=no
        return iSeverity;
//$Section=Attribute getPropertyValue$Severity$Preserve=no
    }
    public String getAttributeName_severity() {
//$Section=Attribute getAttributeName$severity$Preserve=no
        return "Severity";
//$Section=Attribute getAttributeName_$severity$Preserve=no
    }
    public int sizeSeverity() {
//$Section=Attribute size$Severity$Preserve=no
        return iSeveritySize;
//$Section=Attribute size$Severity$Preserve=no
    }
    public boolean isSeverityNullable() {
//$Section=Attribute isNullable$Severity$Preserve=no
        return iSeverityIsNullable;
//$Section=Attribute isNullable$Severity$Preserve=no
    }
    public boolean isSeverityNull() {
//$Section=Attribute isNull$Severity$Preserve=no
        if (iSeverity.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Severity$Preserve=no
    }
    public void setSeverityNull() {
//$Section=Attribute setNull$Severity$Preserve=no
        iSeverity.reset();
//$Section=Attribute setNull$Severity$Preserve=no
    }
    public void setSeveritySpaceToNull() {
//$Section=Attribute setSpaceToNull$Severity$Preserve=no
        if (getSeverityPropertyValue().toString().trim().equals("")) setSeverityNull();
//$Section=Attribute setSpaceToNull$Severity$Preserve=no
    }
    public void setSeverityUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Severity$Preserve=no
        iSeverityUpdate = aUpdate;
//$Section=Attribute setUpdate$Severity$Preserve=no
    }
    public boolean getSeverityUpdate() {
//$Section=Attribute getUpdate$Severity$Preserve=no
        return iSeverityUpdate;
//$Section=Attribute getUpdate$Severity$Preserve=no
    }
    public String getSeverityValueType() {
//$Section=Attribute getValueType$Severity$Preserve=no
        return "int";
//$Section=Attribute getValueType$Severity$Preserve=no
    }
    public String getSeverityValueStereotype() {
//$Section=Attribute getValueStereotype$Severity$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Severity$Preserve=no
    }


//$Section=Deleted$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$Preserve=no

//End of class---------------
}
