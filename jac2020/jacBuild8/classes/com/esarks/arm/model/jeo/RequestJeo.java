//$Section=License$Preserve=no
//  Generated at 2005.12.24 12:42:49.687 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  XML Definition: com.esarks.arm.model.jeo.Service_Jeo
//     Module Name: com.esarks.arm.model.jeo.RequestJeo

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

public class RequestJeo extends com.esarks.jac.Jeo {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes

//SelectClause  Type: string  Size: 0  Nullable: true
    private PropertyValue iSelectClause = new PropertyValue();
    private boolean iSelectClauseIsNullable = true;
    private boolean iSelectClauseUpdate = false;
    private int iSelectClauseSize = 0;
//FieldList  Type: string  Size: 0  Nullable: true
    private PropertyValue iFieldList = new PropertyValue();
    private boolean iFieldListIsNullable = true;
    private boolean iFieldListUpdate = false;
    private int iFieldListSize = 0;
//WhereClause  Type: string  Size: 0  Nullable: true
    private PropertyValue iWhereClause = new PropertyValue();
    private boolean iWhereClauseIsNullable = true;
    private boolean iWhereClauseUpdate = false;
    private int iWhereClauseSize = 0;
//OrderClause  Type: string  Size: 0  Nullable: true
    private PropertyValue iOrderClause = new PropertyValue();
    private boolean iOrderClauseIsNullable = true;
    private boolean iOrderClauseUpdate = false;
    private int iOrderClauseSize = 0;
//WithClause  Type: string  Size: 0  Nullable: true
    private PropertyValue iWithClause = new PropertyValue();
    private boolean iWithClauseIsNullable = true;
    private boolean iWithClauseUpdate = false;
    private int iWithClauseSize = 0;
//Top  Type: string  Size: 0  Nullable: true
    private PropertyValue iTop = new PropertyValue();
    private boolean iTopIsNullable = true;
    private boolean iTopUpdate = false;
    private int iTopSize = 0;

//$Section=CustomClassDeclare$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//ValueList
    private ArrayList iValueList = null;

//$Section=CustomClassDeclare$Preserve=no

//----------------------------------------------------------------------------
// Generated constructors.
//----------------------------------------------------------------------------

/**
 * Default constructor.
 */
    public RequestJeo() {
      iInstanceName = "com.esarks.arm.model.jeo.RequestJeo";
//$Section=DefaultConstructor$Preserve=yes
//$Section=DefaultConstructor$Preserve=no
    }

/**
 *
 */
    public RequestJeo( com.esarks.jac.JeoFactory aJeoFactory ) {
      iInstanceName = "com.esarks.arm.model.jeo.RequestJeo";
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=yes
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=no
    }

/**
 *
 */
    public RequestJeo( Script aScript ) {
      super("", aScript);
      iInstanceName = "com.esarks.arm.model.jeo.RequestJeo";
//$Section=Operation$Jeo( String aScript )$Preserve=yes
//$Section=Operation$Jeo( String aScript )$Preserve=no
    }

/**
 *
 */
    public RequestJeo( String aTypeName ) {
      iInstanceName = "com.esarks.arm.model.jeo.RequestJeo";
      iJeoTypeName = aTypeName;
//$Section=Operation$Jeo( String aTypeName )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName )$Preserve=no
    }

/**
 *
 */
    public RequestJeo( String aTypeName, Script aScript ) {
      super("", aScript);
      iInstanceName = "com.esarks.arm.model.jeo.RequestJeo";
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
    iSelectClause = null;
    iFieldList = null;
    iWhereClause = null;
    iOrderClause = null;
    iWithClause = null;
    iTop = null;
//$Section=DefaultFreeResources$Preserve=yes
    iValueList = null;
//$Section=DefaultFreeResources$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------
//$Section=CustomOperations$Preserve=yes

    public ArrayList getValueList() {
        return iValueList;
    }
    public void setValueList(ArrayList aValue) {
        iValueList = aValue;
    }
    public void addValueList(String aValue) {
        if (iValueList == null) iValueList = new ArrayList();
        iValueList.add(aValue);
    }

//$Section=CustomOperations$Preserve=no

    public void init() {
    	super.init();
//SelectClause
    iSelectClause = new PropertyValue();
    iSelectClauseUpdate = false;
//FieldList
    iFieldList = new PropertyValue();
    iFieldListUpdate = false;
//WhereClause
    iWhereClause = new PropertyValue();
    iWhereClauseUpdate = false;
//OrderClause
    iOrderClause = new PropertyValue();
    iOrderClauseUpdate = false;
//WithClause
    iWithClause = new PropertyValue();
    iWithClauseUpdate = false;
//Top
    iTop = new PropertyValue();
    iTopUpdate = false;
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
// SelectClause
      try {
        lValue = aJeo.getPropertyValueByName("selectClause");
        if (lValue != null) {
          lType = aJeo.getTypeByName("selectClause");
          if (!isSelectClauseNull()) {
            lValue.reset(lType, getSelectClausePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// FieldList
      try {
        lValue = aJeo.getPropertyValueByName("fieldList");
        if (lValue != null) {
          lType = aJeo.getTypeByName("fieldList");
          if (!isFieldListNull()) {
            lValue.reset(lType, getFieldListPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// WhereClause
      try {
        lValue = aJeo.getPropertyValueByName("whereClause");
        if (lValue != null) {
          lType = aJeo.getTypeByName("whereClause");
          if (!isWhereClauseNull()) {
            lValue.reset(lType, getWhereClausePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// OrderClause
      try {
        lValue = aJeo.getPropertyValueByName("orderClause");
        if (lValue != null) {
          lType = aJeo.getTypeByName("orderClause");
          if (!isOrderClauseNull()) {
            lValue.reset(lType, getOrderClausePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// WithClause
      try {
        lValue = aJeo.getPropertyValueByName("withClause");
        if (lValue != null) {
          lType = aJeo.getTypeByName("withClause");
          if (!isWithClauseNull()) {
            lValue.reset(lType, getWithClausePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Top
      try {
        lValue = aJeo.getPropertyValueByName("top");
        if (lValue != null) {
          lType = aJeo.getTypeByName("top");
          if (!isTopNull()) {
            lValue.reset(lType, getTopPropertyValue().toString());
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
// SelectClause
      try {
        lValue = aJeo.getPropertyValueByName("selectClause");
        if (lValue != null) {
          setSelectClause(lValue);
        }
      } catch(Throwable e) {}
// FieldList
      try {
        lValue = aJeo.getPropertyValueByName("fieldList");
        if (lValue != null) {
          setFieldList(lValue);
        }
      } catch(Throwable e) {}
// WhereClause
      try {
        lValue = aJeo.getPropertyValueByName("whereClause");
        if (lValue != null) {
          setWhereClause(lValue);
        }
      } catch(Throwable e) {}
// OrderClause
      try {
        lValue = aJeo.getPropertyValueByName("orderClause");
        if (lValue != null) {
          setOrderClause(lValue);
        }
      } catch(Throwable e) {}
// WithClause
      try {
        lValue = aJeo.getPropertyValueByName("withClause");
        if (lValue != null) {
          setWithClause(lValue);
        }
      } catch(Throwable e) {}
// Top
      try {
        lValue = aJeo.getPropertyValueByName("top");
        if (lValue != null) {
          setTop(lValue);
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
      case 1: return "selectclause";
      case 2: return "fieldlist";
      case 3: return "whereclause";
      case 4: return "orderclause";
      case 5: return "withclause";
      case 6: return "top";
    }
    return null;
//$Section=Operation$getNameByIndex$Preserve=no
  }

  public String getXml ( ) {
//$Section=Operation$getXml$Preserve=no

    StringBuffer lXml = new StringBuffer("<jeo name='com.esarks.arm.model.jeo.RequestJeo'>");
    String lCdataBegin = "<" + "!" + "[CDATA[";
// Field: SelectClause
    lXml.append("<field name='SelectClause' type='string'>");
    lXml.append(lCdataBegin).append(getSelectClausePropertyValue().toString()).append("]]>").append("</field>");
// Field: FieldList
    lXml.append("<field name='FieldList' type='string'>");
    lXml.append(lCdataBegin).append(getFieldListPropertyValue().toString()).append("]]>").append("</field>");
// Field: WhereClause
    lXml.append("<field name='WhereClause' type='string'>");
    lXml.append(lCdataBegin).append(getWhereClausePropertyValue().toString()).append("]]>").append("</field>");
// Field: OrderClause
    lXml.append("<field name='OrderClause' type='string'>");
    lXml.append(lCdataBegin).append(getOrderClausePropertyValue().toString()).append("]]>").append("</field>");
// Field: WithClause
    lXml.append("<field name='WithClause' type='string'>");
    lXml.append(lCdataBegin).append(getWithClausePropertyValue().toString()).append("]]>").append("</field>");
// Field: Top
    lXml.append("<field name='Top' type='string'>");
    lXml.append(lCdataBegin).append(getTopPropertyValue().toString()).append("]]>").append("</field>");
    lXml.append("</jeo>");
    return lXml.toString();

//$Section=Operation$getXml$Preserve=no
  }

  public boolean isJeoEqual ( Jeo aJeo) {
//$Section=Operation$isJeoEqual$Preserve=no

    PropertyValue lThisValue = null;
    PropertyValue lThatValue = null;
    lThisValue = this.getPropertyValueByName("selectclause");
    lThatValue = aJeo.getPropertyValueByName("selectclause");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("fieldlist");
    lThatValue = aJeo.getPropertyValueByName("fieldlist");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("whereclause");
    lThatValue = aJeo.getPropertyValueByName("whereclause");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("orderclause");
    lThatValue = aJeo.getPropertyValueByName("orderclause");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("withclause");
    lThatValue = aJeo.getPropertyValueByName("withclause");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    lThisValue = this.getPropertyValueByName("top");
    lThatValue = aJeo.getPropertyValueByName("top");
    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
    if (lThisValue.compareTo(lThatValue) != 0) return false;
    return true;
//$Section=Operation$isJeoEqual$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
// SelectClause
//----------------------------------------------------------------------------
    public String getSelectClause() {
//$Section=Attribute get$SelectClause$Preserve=no
        return iSelectClause.getValueString();
//$Section=Attribute get$SelectClause$Preserve=no
    }
    public String getSelectClause(String aValue) {
//$Section=Attribute get$SelectClause(String)$Preserve=no
      if (isSelectClauseNull()) return aValue;
      return iSelectClause.getValueString();
//$Section=Attribute get$SelectClause(String)$Preserve=no
    }
    public void setSelectClause(String aValue) {
//$Section=Attribute set$SelectClause$Preserve=no
        iSelectClause.reset(aValue);
//$Section=Attribute set$SelectClause$Preserve=no
    }
    public void setSelectClause(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$SelectClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setSelectClauseNull();
          return;
        }
        setSelectClause(aValue.toString());
//$Section=Attribute setPropertyValue$SelectClause$Preserve=no
    }
    public void setSelectClause(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$SelectClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setSelectClauseNull();
          return;
        }
        setSelectClause(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$SelectClause$Preserve=no
    }
    public void setSelectClause(String aValue, String aType) {
//$Section=Attribute setAsStringType$SelectClause$Preserve=no
        iSelectClause.reset(aType, aValue);
//$Section=Attribute setAsStringType$SelectClause$Preserve=no
    }
    public PropertyValue getSelectClausePropertyValue() {
//$Section=Attribute getPropertyValue$SelectClause$Preserve=no
        return iSelectClause;
//$Section=Attribute getPropertyValue$SelectClause$Preserve=no
    }
    public String getAttributeName_selectclause() {
//$Section=Attribute getAttributeName$selectclause$Preserve=no
        return "SelectClause";
//$Section=Attribute getAttributeName_$selectclause$Preserve=no
    }
    public int sizeSelectClause() {
//$Section=Attribute size$SelectClause$Preserve=no
        return iSelectClauseSize;
//$Section=Attribute size$SelectClause$Preserve=no
    }
    public boolean isSelectClauseNullable() {
//$Section=Attribute isNullable$SelectClause$Preserve=no
        return iSelectClauseIsNullable;
//$Section=Attribute isNullable$SelectClause$Preserve=no
    }
    public boolean isSelectClauseNull() {
//$Section=Attribute isNull$SelectClause$Preserve=no
        if (iSelectClause.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$SelectClause$Preserve=no
    }
    public void setSelectClauseNull() {
//$Section=Attribute setNull$SelectClause$Preserve=no
        iSelectClause.reset();
//$Section=Attribute setNull$SelectClause$Preserve=no
    }
    public void setSelectClauseSpaceToNull() {
//$Section=Attribute setSpaceToNull$SelectClause$Preserve=no
        if (getSelectClausePropertyValue().toString().trim().equals("")) setSelectClauseNull();
//$Section=Attribute setSpaceToNull$SelectClause$Preserve=no
    }
    public void setSelectClauseUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$SelectClause$Preserve=no
        iSelectClauseUpdate = aUpdate;
//$Section=Attribute setUpdate$SelectClause$Preserve=no
    }
    public boolean getSelectClauseUpdate() {
//$Section=Attribute getUpdate$SelectClause$Preserve=no
        return iSelectClauseUpdate;
//$Section=Attribute getUpdate$SelectClause$Preserve=no
    }
    public String getSelectClauseValueType() {
//$Section=Attribute getValueType$SelectClause$Preserve=no
        return "string";
//$Section=Attribute getValueType$SelectClause$Preserve=no
    }
    public String getSelectClauseValueStereotype() {
//$Section=Attribute getValueStereotype$SelectClause$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$SelectClause$Preserve=no
    }

//----------------------------------------------------------------------------
// FieldList
//----------------------------------------------------------------------------
    public String getFieldList() {
//$Section=Attribute get$FieldList$Preserve=no
        return iFieldList.getValueString();
//$Section=Attribute get$FieldList$Preserve=no
    }
    public String getFieldList(String aValue) {
//$Section=Attribute get$FieldList(String)$Preserve=no
      if (isFieldListNull()) return aValue;
      return iFieldList.getValueString();
//$Section=Attribute get$FieldList(String)$Preserve=no
    }
    public void setFieldList(String aValue) {
//$Section=Attribute set$FieldList$Preserve=no
        iFieldList.reset(aValue);
//$Section=Attribute set$FieldList$Preserve=no
    }
    public void setFieldList(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$FieldList$Preserve=no
        if (aValue.getType().equals("null")) {
          setFieldListNull();
          return;
        }
        setFieldList(aValue.toString());
//$Section=Attribute setPropertyValue$FieldList$Preserve=no
    }
    public void setFieldList(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$FieldList$Preserve=no
        if (aValue.getType().equals("null")) {
          setFieldListNull();
          return;
        }
        setFieldList(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$FieldList$Preserve=no
    }
    public void setFieldList(String aValue, String aType) {
//$Section=Attribute setAsStringType$FieldList$Preserve=no
        iFieldList.reset(aType, aValue);
//$Section=Attribute setAsStringType$FieldList$Preserve=no
    }
    public PropertyValue getFieldListPropertyValue() {
//$Section=Attribute getPropertyValue$FieldList$Preserve=no
        return iFieldList;
//$Section=Attribute getPropertyValue$FieldList$Preserve=no
    }
    public String getAttributeName_fieldlist() {
//$Section=Attribute getAttributeName$fieldlist$Preserve=no
        return "FieldList";
//$Section=Attribute getAttributeName_$fieldlist$Preserve=no
    }
    public int sizeFieldList() {
//$Section=Attribute size$FieldList$Preserve=no
        return iFieldListSize;
//$Section=Attribute size$FieldList$Preserve=no
    }
    public boolean isFieldListNullable() {
//$Section=Attribute isNullable$FieldList$Preserve=no
        return iFieldListIsNullable;
//$Section=Attribute isNullable$FieldList$Preserve=no
    }
    public boolean isFieldListNull() {
//$Section=Attribute isNull$FieldList$Preserve=no
        if (iFieldList.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$FieldList$Preserve=no
    }
    public void setFieldListNull() {
//$Section=Attribute setNull$FieldList$Preserve=no
        iFieldList.reset();
//$Section=Attribute setNull$FieldList$Preserve=no
    }
    public void setFieldListSpaceToNull() {
//$Section=Attribute setSpaceToNull$FieldList$Preserve=no
        if (getFieldListPropertyValue().toString().trim().equals("")) setFieldListNull();
//$Section=Attribute setSpaceToNull$FieldList$Preserve=no
    }
    public void setFieldListUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$FieldList$Preserve=no
        iFieldListUpdate = aUpdate;
//$Section=Attribute setUpdate$FieldList$Preserve=no
    }
    public boolean getFieldListUpdate() {
//$Section=Attribute getUpdate$FieldList$Preserve=no
        return iFieldListUpdate;
//$Section=Attribute getUpdate$FieldList$Preserve=no
    }
    public String getFieldListValueType() {
//$Section=Attribute getValueType$FieldList$Preserve=no
        return "string";
//$Section=Attribute getValueType$FieldList$Preserve=no
    }
    public String getFieldListValueStereotype() {
//$Section=Attribute getValueStereotype$FieldList$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$FieldList$Preserve=no
    }

//----------------------------------------------------------------------------
// WhereClause
//----------------------------------------------------------------------------
    public String getWhereClause() {
//$Section=Attribute get$WhereClause$Preserve=no
        return iWhereClause.getValueString();
//$Section=Attribute get$WhereClause$Preserve=no
    }
    public String getWhereClause(String aValue) {
//$Section=Attribute get$WhereClause(String)$Preserve=no
      if (isWhereClauseNull()) return aValue;
      return iWhereClause.getValueString();
//$Section=Attribute get$WhereClause(String)$Preserve=no
    }
    public void setWhereClause(String aValue) {
//$Section=Attribute set$WhereClause$Preserve=no
        iWhereClause.reset(aValue);
//$Section=Attribute set$WhereClause$Preserve=no
    }
    public void setWhereClause(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$WhereClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setWhereClauseNull();
          return;
        }
        setWhereClause(aValue.toString());
//$Section=Attribute setPropertyValue$WhereClause$Preserve=no
    }
    public void setWhereClause(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$WhereClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setWhereClauseNull();
          return;
        }
        setWhereClause(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$WhereClause$Preserve=no
    }
    public void setWhereClause(String aValue, String aType) {
//$Section=Attribute setAsStringType$WhereClause$Preserve=no
        iWhereClause.reset(aType, aValue);
//$Section=Attribute setAsStringType$WhereClause$Preserve=no
    }
    public PropertyValue getWhereClausePropertyValue() {
//$Section=Attribute getPropertyValue$WhereClause$Preserve=no
        return iWhereClause;
//$Section=Attribute getPropertyValue$WhereClause$Preserve=no
    }
    public String getAttributeName_whereclause() {
//$Section=Attribute getAttributeName$whereclause$Preserve=no
        return "WhereClause";
//$Section=Attribute getAttributeName_$whereclause$Preserve=no
    }
    public int sizeWhereClause() {
//$Section=Attribute size$WhereClause$Preserve=no
        return iWhereClauseSize;
//$Section=Attribute size$WhereClause$Preserve=no
    }
    public boolean isWhereClauseNullable() {
//$Section=Attribute isNullable$WhereClause$Preserve=no
        return iWhereClauseIsNullable;
//$Section=Attribute isNullable$WhereClause$Preserve=no
    }
    public boolean isWhereClauseNull() {
//$Section=Attribute isNull$WhereClause$Preserve=no
        if (iWhereClause.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$WhereClause$Preserve=no
    }
    public void setWhereClauseNull() {
//$Section=Attribute setNull$WhereClause$Preserve=no
        iWhereClause.reset();
//$Section=Attribute setNull$WhereClause$Preserve=no
    }
    public void setWhereClauseSpaceToNull() {
//$Section=Attribute setSpaceToNull$WhereClause$Preserve=no
        if (getWhereClausePropertyValue().toString().trim().equals("")) setWhereClauseNull();
//$Section=Attribute setSpaceToNull$WhereClause$Preserve=no
    }
    public void setWhereClauseUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$WhereClause$Preserve=no
        iWhereClauseUpdate = aUpdate;
//$Section=Attribute setUpdate$WhereClause$Preserve=no
    }
    public boolean getWhereClauseUpdate() {
//$Section=Attribute getUpdate$WhereClause$Preserve=no
        return iWhereClauseUpdate;
//$Section=Attribute getUpdate$WhereClause$Preserve=no
    }
    public String getWhereClauseValueType() {
//$Section=Attribute getValueType$WhereClause$Preserve=no
        return "string";
//$Section=Attribute getValueType$WhereClause$Preserve=no
    }
    public String getWhereClauseValueStereotype() {
//$Section=Attribute getValueStereotype$WhereClause$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$WhereClause$Preserve=no
    }

//----------------------------------------------------------------------------
// OrderClause
//----------------------------------------------------------------------------
    public String getOrderClause() {
//$Section=Attribute get$OrderClause$Preserve=no
        return iOrderClause.getValueString();
//$Section=Attribute get$OrderClause$Preserve=no
    }
    public String getOrderClause(String aValue) {
//$Section=Attribute get$OrderClause(String)$Preserve=no
      if (isOrderClauseNull()) return aValue;
      return iOrderClause.getValueString();
//$Section=Attribute get$OrderClause(String)$Preserve=no
    }
    public void setOrderClause(String aValue) {
//$Section=Attribute set$OrderClause$Preserve=no
        iOrderClause.reset(aValue);
//$Section=Attribute set$OrderClause$Preserve=no
    }
    public void setOrderClause(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$OrderClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setOrderClauseNull();
          return;
        }
        setOrderClause(aValue.toString());
//$Section=Attribute setPropertyValue$OrderClause$Preserve=no
    }
    public void setOrderClause(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$OrderClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setOrderClauseNull();
          return;
        }
        setOrderClause(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$OrderClause$Preserve=no
    }
    public void setOrderClause(String aValue, String aType) {
//$Section=Attribute setAsStringType$OrderClause$Preserve=no
        iOrderClause.reset(aType, aValue);
//$Section=Attribute setAsStringType$OrderClause$Preserve=no
    }
    public PropertyValue getOrderClausePropertyValue() {
//$Section=Attribute getPropertyValue$OrderClause$Preserve=no
        return iOrderClause;
//$Section=Attribute getPropertyValue$OrderClause$Preserve=no
    }
    public String getAttributeName_orderclause() {
//$Section=Attribute getAttributeName$orderclause$Preserve=no
        return "OrderClause";
//$Section=Attribute getAttributeName_$orderclause$Preserve=no
    }
    public int sizeOrderClause() {
//$Section=Attribute size$OrderClause$Preserve=no
        return iOrderClauseSize;
//$Section=Attribute size$OrderClause$Preserve=no
    }
    public boolean isOrderClauseNullable() {
//$Section=Attribute isNullable$OrderClause$Preserve=no
        return iOrderClauseIsNullable;
//$Section=Attribute isNullable$OrderClause$Preserve=no
    }
    public boolean isOrderClauseNull() {
//$Section=Attribute isNull$OrderClause$Preserve=no
        if (iOrderClause.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$OrderClause$Preserve=no
    }
    public void setOrderClauseNull() {
//$Section=Attribute setNull$OrderClause$Preserve=no
        iOrderClause.reset();
//$Section=Attribute setNull$OrderClause$Preserve=no
    }
    public void setOrderClauseSpaceToNull() {
//$Section=Attribute setSpaceToNull$OrderClause$Preserve=no
        if (getOrderClausePropertyValue().toString().trim().equals("")) setOrderClauseNull();
//$Section=Attribute setSpaceToNull$OrderClause$Preserve=no
    }
    public void setOrderClauseUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$OrderClause$Preserve=no
        iOrderClauseUpdate = aUpdate;
//$Section=Attribute setUpdate$OrderClause$Preserve=no
    }
    public boolean getOrderClauseUpdate() {
//$Section=Attribute getUpdate$OrderClause$Preserve=no
        return iOrderClauseUpdate;
//$Section=Attribute getUpdate$OrderClause$Preserve=no
    }
    public String getOrderClauseValueType() {
//$Section=Attribute getValueType$OrderClause$Preserve=no
        return "string";
//$Section=Attribute getValueType$OrderClause$Preserve=no
    }
    public String getOrderClauseValueStereotype() {
//$Section=Attribute getValueStereotype$OrderClause$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$OrderClause$Preserve=no
    }

//----------------------------------------------------------------------------
// WithClause
//----------------------------------------------------------------------------
    public String getWithClause() {
//$Section=Attribute get$WithClause$Preserve=no
        return iWithClause.getValueString();
//$Section=Attribute get$WithClause$Preserve=no
    }
    public String getWithClause(String aValue) {
//$Section=Attribute get$WithClause(String)$Preserve=no
      if (isWithClauseNull()) return aValue;
      return iWithClause.getValueString();
//$Section=Attribute get$WithClause(String)$Preserve=no
    }
    public void setWithClause(String aValue) {
//$Section=Attribute set$WithClause$Preserve=no
        iWithClause.reset(aValue);
//$Section=Attribute set$WithClause$Preserve=no
    }
    public void setWithClause(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$WithClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setWithClauseNull();
          return;
        }
        setWithClause(aValue.toString());
//$Section=Attribute setPropertyValue$WithClause$Preserve=no
    }
    public void setWithClause(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$WithClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setWithClauseNull();
          return;
        }
        setWithClause(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$WithClause$Preserve=no
    }
    public void setWithClause(String aValue, String aType) {
//$Section=Attribute setAsStringType$WithClause$Preserve=no
        iWithClause.reset(aType, aValue);
//$Section=Attribute setAsStringType$WithClause$Preserve=no
    }
    public PropertyValue getWithClausePropertyValue() {
//$Section=Attribute getPropertyValue$WithClause$Preserve=no
        return iWithClause;
//$Section=Attribute getPropertyValue$WithClause$Preserve=no
    }
    public String getAttributeName_withclause() {
//$Section=Attribute getAttributeName$withclause$Preserve=no
        return "WithClause";
//$Section=Attribute getAttributeName_$withclause$Preserve=no
    }
    public int sizeWithClause() {
//$Section=Attribute size$WithClause$Preserve=no
        return iWithClauseSize;
//$Section=Attribute size$WithClause$Preserve=no
    }
    public boolean isWithClauseNullable() {
//$Section=Attribute isNullable$WithClause$Preserve=no
        return iWithClauseIsNullable;
//$Section=Attribute isNullable$WithClause$Preserve=no
    }
    public boolean isWithClauseNull() {
//$Section=Attribute isNull$WithClause$Preserve=no
        if (iWithClause.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$WithClause$Preserve=no
    }
    public void setWithClauseNull() {
//$Section=Attribute setNull$WithClause$Preserve=no
        iWithClause.reset();
//$Section=Attribute setNull$WithClause$Preserve=no
    }
    public void setWithClauseSpaceToNull() {
//$Section=Attribute setSpaceToNull$WithClause$Preserve=no
        if (getWithClausePropertyValue().toString().trim().equals("")) setWithClauseNull();
//$Section=Attribute setSpaceToNull$WithClause$Preserve=no
    }
    public void setWithClauseUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$WithClause$Preserve=no
        iWithClauseUpdate = aUpdate;
//$Section=Attribute setUpdate$WithClause$Preserve=no
    }
    public boolean getWithClauseUpdate() {
//$Section=Attribute getUpdate$WithClause$Preserve=no
        return iWithClauseUpdate;
//$Section=Attribute getUpdate$WithClause$Preserve=no
    }
    public String getWithClauseValueType() {
//$Section=Attribute getValueType$WithClause$Preserve=no
        return "string";
//$Section=Attribute getValueType$WithClause$Preserve=no
    }
    public String getWithClauseValueStereotype() {
//$Section=Attribute getValueStereotype$WithClause$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$WithClause$Preserve=no
    }

//----------------------------------------------------------------------------
// Top
//----------------------------------------------------------------------------
    public String getTop() {
//$Section=Attribute get$Top$Preserve=no
        return iTop.getValueString();
//$Section=Attribute get$Top$Preserve=no
    }
    public String getTop(String aValue) {
//$Section=Attribute get$Top(String)$Preserve=no
      if (isTopNull()) return aValue;
      return iTop.getValueString();
//$Section=Attribute get$Top(String)$Preserve=no
    }
    public void setTop(String aValue) {
//$Section=Attribute set$Top$Preserve=no
        iTop.reset(aValue);
//$Section=Attribute set$Top$Preserve=no
    }
    public void setTop(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Top$Preserve=no
        if (aValue.getType().equals("null")) {
          setTopNull();
          return;
        }
        setTop(aValue.toString());
//$Section=Attribute setPropertyValue$Top$Preserve=no
    }
    public void setTop(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Top$Preserve=no
        if (aValue.getType().equals("null")) {
          setTopNull();
          return;
        }
        setTop(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Top$Preserve=no
    }
    public void setTop(String aValue, String aType) {
//$Section=Attribute setAsStringType$Top$Preserve=no
        iTop.reset(aType, aValue);
//$Section=Attribute setAsStringType$Top$Preserve=no
    }
    public PropertyValue getTopPropertyValue() {
//$Section=Attribute getPropertyValue$Top$Preserve=no
        return iTop;
//$Section=Attribute getPropertyValue$Top$Preserve=no
    }
    public String getAttributeName_top() {
//$Section=Attribute getAttributeName$top$Preserve=no
        return "Top";
//$Section=Attribute getAttributeName_$top$Preserve=no
    }
    public int sizeTop() {
//$Section=Attribute size$Top$Preserve=no
        return iTopSize;
//$Section=Attribute size$Top$Preserve=no
    }
    public boolean isTopNullable() {
//$Section=Attribute isNullable$Top$Preserve=no
        return iTopIsNullable;
//$Section=Attribute isNullable$Top$Preserve=no
    }
    public boolean isTopNull() {
//$Section=Attribute isNull$Top$Preserve=no
        if (iTop.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Top$Preserve=no
    }
    public void setTopNull() {
//$Section=Attribute setNull$Top$Preserve=no
        iTop.reset();
//$Section=Attribute setNull$Top$Preserve=no
    }
    public void setTopSpaceToNull() {
//$Section=Attribute setSpaceToNull$Top$Preserve=no
        if (getTopPropertyValue().toString().trim().equals("")) setTopNull();
//$Section=Attribute setSpaceToNull$Top$Preserve=no
    }
    public void setTopUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Top$Preserve=no
        iTopUpdate = aUpdate;
//$Section=Attribute setUpdate$Top$Preserve=no
    }
    public boolean getTopUpdate() {
//$Section=Attribute getUpdate$Top$Preserve=no
        return iTopUpdate;
//$Section=Attribute getUpdate$Top$Preserve=no
    }
    public String getTopValueType() {
//$Section=Attribute getValueType$Top$Preserve=no
        return "string";
//$Section=Attribute getValueType$Top$Preserve=no
    }
    public String getTopValueStereotype() {
//$Section=Attribute getValueStereotype$Top$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Top$Preserve=no
    }


//$Section=Deleted$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$Preserve=no

//End of class---------------
}
