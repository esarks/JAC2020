//$Section=License$ID=3F9C58B802D4$Preserve=no

/* ========================================================================= *
 *                                                                           *
 *                       The eSarks Software License                         *
 *                                                                           *
 *        Copyright (c) 1998 - 2003 Architects of Software Design, Corp.     *
 *                           All rights reserved.                            *
 *                                                                           *
 * ========================================================================= *
 *                                                                           *
 * Redistribution and use in source and binary forms, with or without        *
 * modification, are permitted provided that the following conditions        *
 * are met:                                                                  *
 *                                                                           *
 * 1. Redistributions of source code must retain the above copyright notice, *
 *    this list of conditions and the following disclaimer.                  *
 *                                                                           *
 * 2. Redistributions in binary form must reproduce the above copyright      *
 *    notice, this list of conditions and the following disclaimer in the    *
 *    documentation and/or other materials provided with the distribution.   *
 *                                                                           *
 * 3. The end-user documentation included with the redistribution, if any,   *
 *    must include the following acknowlegement:                             *
 *                                                                           *
 *       "This product includes software developed by                        *
 *        Architects of Software Design, Corp. <http://www.esarks.com/>."    *
 *                                                                           *
 *    Alternately, this acknowlegement may appear in the software itself, if *
 *    and wherever such third-party acknowlegements normally appear.         *
 *                                                                           *
 * 4. The names "eSarks", "jac" or "Architects of Software Design, Corp."    *
 *    must not be used to endorse or promote products derived from this      *
 *    software without prior written permission.  For written permission,    *
 *    please contact <jac@esarks.com>.                                       *
 *                                                                           *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES *
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY  *
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL   *
 * ARCHITECTS OF SOFTWARE DESIGN, CORP. OR ITS CONTRIBUTORS BE LIABLE FOR    *
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL    *
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS   *
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)     *
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,       *
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN  *
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE           *
 * POSSIBILITY OF SUCH DAMAGE.                                               *
 *                                                                           *
 * ========================================================================= */

//  Generated at 2006.01.15 04:31:58.781 PM EST by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: PropertyCollection.java

//$Section=ChangeLog$ID=3F9C58B802D4$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9C58B802D4$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;

//$Section=CustomDeclare$ID=3F9C58B802D4$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3F9C58B802D4$Preserve=no

//$Section=ClassJavadoc$ID=3F9C58B802D4$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3F9C58B802D4$Preserve=no
public class PropertyCollection {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
//    private Map iProperties = new TreeMap();
    private Map iProperties = new LinkedHashMap();
    private static boolean iLicenseVerified;
    private static boolean iLimitRunningTime;
    private static int iForgiveCounter;
    private static boolean iLoadingXml;
    private boolean iMasterInstance;
    private String iName;

//$Section=CustomClassDeclare$ID=3F9C58B802D4$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9C58B802D4$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9C58B802D4$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9C58B802D4$Preserve=no
    public PropertyCollection() {
//$Section=DefaultConstructor$ID=3F9C58B802D4$Preserve=yes

        iMasterInstance = false;
        if (iForgiveCounter == 0) {
            iLicenseVerified = false;
            iLimitRunningTime = false;
            iForgiveCounter = 100;
            iLoadingXml = false;
            iMasterInstance = true;
        }

//$Section=DefaultConstructor$ID=3F9C58B802D4$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9C58B802D4$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9C58B802D4$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9C58B802D4$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3F9C58B802D4$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9C58B802D4$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9C58B802D4$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9C58B802D4$Preserve=yes

        iProperties = null;

//$Section=DefaultFreeResources$ID=3F9C58B802D4$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3FB4DADE0074$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aXmlSchemaElement
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB4DADE0074$Preserve=no
    public void assignSchema( String aPropertyName, XmlSchemaElement aXmlSchemaElement ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3FB4DADE0074$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.assignSchema!aPropertyName=" + Log.toString(aPropertyName) + "!aXmlSchemaElement=" + Log.toString(aXmlSchemaElement) + "!");

        PropertyValues lPropertyValues = getPropertyValues(aPropertyName, true);
        lPropertyValues.setXmlSchemaElement(aXmlSchemaElement);

//$Section=Operation$ID=3FB4DADE0074$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C817C026C$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C817C026C$Preserve=no
    public PropertyValue addPropertyValue( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3F9C817C026C$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.addPropertyValue!aPropertyName=" + Log.toString(aPropertyName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        PropertyValues lPropertyValues = getPropertyValues(aPropertyName, true);
        return lPropertyValues.set(aPropertyValue);

//$Section=Operation$ID=3F9C817C026C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C817C0280$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C817C0280$Preserve=no
    public PropertyValue resetPropertyValue( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3F9C817C0280$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.resetPropertyValue!aPropertyName=" + Log.toString(aPropertyName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        PropertyValues lPropertyValues = getPropertyValues(aPropertyName, true);
        return lPropertyValues.reset(aPropertyValue);

//$Section=Operation$ID=3F9C817C0280$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C817C0294$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C817C0294$Preserve=no
    public PropertyValue replacePropertyValue( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3F9C817C0294$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.replacePropertyValue!aPropertyName=" + Log.toString(aPropertyName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        PropertyValues lPropertyValues = getPropertyValues(aPropertyName, true);
        return lPropertyValues.replace(aPropertyValue);

//$Section=Operation$ID=3F9C817C0294$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C817C029E$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C817C029E$Preserve=no
    public PropertyValue getPropertyValue( String aPropertyName, int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3F9C817C029E$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.getPropertyValue!aPropertyName=" + Log.toString(aPropertyName) + "!aIndex=" + aIndex + "!");

        PropertyValues lPropertyValues = getPropertyValues(aPropertyName, false);
        if (lPropertyValues == null || lPropertyValues.size() == 0) return new PropertyValue();

// Previously had license verification here, in case user decided not to use Script...

        PropertyValue lReturn = lPropertyValues.get(aIndex);
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyCollection.getPropertyValue!returnPropertyValue=" + Log.toString(lReturn) + "!iForgiveCounter=" + iForgiveCounter + "!");
        return lReturn;

//$Section=Operation$ID=3F9C817C029E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C817C02B2$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C817C02B2$Preserve=no
    public void removePropertyValues( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3F9C817C02B2$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.removePropertyValues!aPropertyName=" + Log.toString(aPropertyName) + "!");

        int lIdx = aPropertyName.indexOf(":");
        String lLeft = aPropertyName;
        String lRight = null;
        if (lIdx > -1) {
            lLeft = aPropertyName.substring(0,lIdx);
            lRight = aPropertyName.substring(lIdx+1);
        }

        PropertyValues lPropertyValues = null;

        if (iProperties.containsKey(lLeft) == true) {
            lPropertyValues = (PropertyValues) iProperties.get(lLeft);
            if (lRight == null) {
                lPropertyValues.remove();
                iProperties.remove(lLeft);
                return;
            }
            lPropertyValues.removePropertyValues(lRight);
        }
    
//$Section=Operation$ID=3F9C817C02B2$Preserve=no
    }

//$Section=OperationJavadoc$ID=40E6DDC602AF$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40E6DDC602AF$Preserve=no
    public void removePropertyValue( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=40E6DDC602AF$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.removePropertyValue!aPropertyName=" + Log.toString(aPropertyName) + "!");

        PropertyValues lPropertyValues = getPropertyValues(aPropertyName, false);
        if (lPropertyValues != null) lPropertyValues.removeAt(0);

//$Section=Operation$ID=40E6DDC602AF$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB64C7102BB$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aAdd
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB64C7102BB$Preserve=no
    public PropertyValues getPropertyValues( String aPropertyName, boolean aAdd ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3FB64C7102BB$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.getPropertyValues!aPropertyName=" + Log.toString(aPropertyName) + "!aAdd=" + aAdd + "!");

        return getPropertyValues(aPropertyName, aAdd, null);

//$Section=Operation$ID=3FB64C7102BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C84A9004E$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aAdd
 *
 * @param aPropertyValues
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C84A9004E$Preserve=no
    protected PropertyValues getPropertyValues( String aPropertyName, boolean aAdd, PropertyValues aPropertyValues ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3F9C84A9004E$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.getPropertyValues!aPropertyName=" + Log.toString(aPropertyName) + "!aAdd=" + aAdd + "!aPropertyValues=" + Log.toString(aPropertyValues) + "!");

        int lIdx = aPropertyName.indexOf(":");
        String lLeft = aPropertyName;
        String lRight = null;
        if (lIdx > -1) {
            lLeft = aPropertyName.substring(0,lIdx);
            lRight = aPropertyName.substring(lIdx+1);
        }

        PropertyValues lPropertyValues = null;

        if (iProperties.containsKey(lLeft) == true) {
            lPropertyValues = (PropertyValues) iProperties.get(lLeft);
        } else {
            if (aAdd == false) {
//                if (iLog.test(iLogClass, Log._DEBUG))
//                    iLog.println(iLogClass, Log._DEBUG, "Exit PropertyCollection.getPropertyValues!aAdd == false, returning null!");
                return null;
            }
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Info PropertyCollection.getPropertyValues!aAdd == true, creating PropertyValues(" + Log.toString(lLeft) + ")!");
            lPropertyValues = new PropertyValues(lLeft);
            if (aPropertyValues != null) {
                XmlSchemaElement lXmlSchemaElement = aPropertyValues.getXmlSchemaElement();
                if (lXmlSchemaElement != null) {
//                    if (iLog.test(iLogClass, Log._DEBUG))
//                        iLog.println(iLogClass, Log._DEBUG, "Info PropertyCollection.getPropertyValues!lXmlSchemaElement=" + Log.toString(lXmlSchemaElement) + "!searching=" + Log.toString(lLeft) + "!");
                    XmlSchemaElement lXmlSchemaElementRight = lXmlSchemaElement.getXmlSchemaElement(lLeft);
//                    if (iLog.test(iLogClass, Log._DEBUG))
//                        iLog.println(iLogClass, Log._DEBUG, "Info PropertyCollection.getPropertyValues!lXmlSchemaElementRight=" + Log.toString(lXmlSchemaElementRight) + "!");
                    lPropertyValues.setXmlSchemaElement(lXmlSchemaElementRight);
                } else {
//                    if (iLog.test(iLogClass, Log._DEBUG))
//                        iLog.println(iLogClass, Log._DEBUG, "Info PropertyCollection.getPropertyValues!lXmlSchemaElement=null!");
                }
            }
            if (lRight != null) lPropertyValues.set(new PropertyValue());
            iProperties.put(lPropertyValues.getName(), lPropertyValues);
        }

        if (lRight != null) {
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyCollection.getPropertyValues!lRight=" + Log.toString(lRight) + "!calling lPropertyValues.getPropertyValues!");
            return lPropertyValues.getPropertyValues(lRight, aAdd);
        }

//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyCollection.getPropertyValues!lPropertyValues=" + Log.toString(lPropertyValues) + "!");
        return lPropertyValues;

//$Section=Operation$ID=3F9C84A9004E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA068380321$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA068380321$Preserve=no
    public boolean findPropertyValue( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3FA068380321$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.findPropertyValue!aPropertyName=" + Log.toString(aPropertyName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        PropertyValues lPropertyValues = getPropertyValues(aPropertyName, false);
        
        boolean lReturn = lPropertyValues.findPropertyValue(null, aPropertyValue);
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyCollection.findPropertyValue!lReturn=" + lReturn + "!");
        return lReturn;

//$Section=Operation$ID=3FA068380321$Preserve=no
    }

//$Section=OperationJavadoc$ID=40ED637102BF$Preserve=yes
/**
 *
 * @param aLeft
 *
 * @param aRight
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40ED637102BF$Preserve=no
    private boolean scanPropertyValue( String aLeft, String aRight, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=40ED637102BF$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.scanPropertyValue!aLeft=" + Log.toString(aLeft) + "!aRight=" + Log.toString(aRight) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        String lLeft, lRight;

        int lIdx = aRight.indexOf(":");
        if (lIdx > -1) {
            lLeft = "";
            if (aLeft.length() > 0) lLeft = aLeft.concat(":");
            lLeft = lLeft.concat(aRight.substring(0, lIdx));
            lRight = aRight.substring(lIdx+1);
        } else {
            if (aLeft.length() > 0) {
                lLeft = aLeft + ":" + aRight;
            } else {
                lLeft = aRight;
            }
            lRight = "";
        }

        PropertyValues lPropertyValues = getPropertyValues(lLeft, false);
        int lSize = 0;
        if (lPropertyValues != null) lSize = lPropertyValues.size();

        for (int lItem=1; lItem <= lSize; lItem++) {
            lPropertyValues.resetIterator(lItem);
            if (lRight.length() > 0) {
                if (scanPropertyValue(lLeft, lRight, aPropertyValue) == true) {
//                    if (iLog.test(iLogClass, Log._DEBUG))
//                        iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.scanPropertyValue!return true!");
                    return true;
                }
            } else {
                boolean lReturn = findPropertyValue(lLeft, aPropertyValue);
//                if (iLog.test(iLogClass, Log._DEBUG))
//                    iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.scanPropertyValue!lReturn=" + lReturn + "!");
                return lReturn;
            }
        }

//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.scanPropertyValue!return false!");
        return false;

//$Section=Operation$ID=40ED637102BF$Preserve=no
    }

//$Section=OperationJavadoc$ID=40ED65770271$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40ED65770271$Preserve=no
    public boolean scanPropertyValue( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=40ED65770271$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.scanPropertyValue!aPropertyName=" + Log.toString(aPropertyName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        boolean lReturn = scanPropertyValue("", aPropertyName, aPropertyValue);

//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyCollection.scanPropertyValue!lReturn=" + lReturn + "!");
        return lReturn;

//$Section=Operation$ID=40ED65770271$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA0ED3E00BB$Preserve=yes
/**
 *
 * @param aAliasName
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA0ED3E00BB$Preserve=no
    public void aliasProperty( String aAliasName, String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3FA0ED3E00BB$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.aliasProperty!aAliasName=" + Log.toString(aAliasName) + "!aPropertyName=" + Log.toString(aPropertyName) + "!");

        PropertyValues lPropertyValues = getPropertyValues(aPropertyName, true);
        if (lPropertyValues != null) {
            PropertyValue lPropertyValue = lPropertyValues.get(0);
            if (lPropertyValue != null) {
                addPropertyValue(aAliasName, lPropertyValue);
                if (lPropertyValues.getXmlSchemaElement() != null) {
                  PropertyValues lAliasPropertyValues = getPropertyValues(aAliasName, true);
                  if (lAliasPropertyValues != null) lAliasPropertyValues.setXmlSchemaElement(lPropertyValues.getXmlSchemaElement());
                }
            }
        }

//$Section=Operation$ID=3FA0ED3E00BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB1620A0132$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB1620A0132$Preserve=no
    public Collection getValues( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.");
//$Section=Operation$ID=3FB1620A0132$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyCollection.getValues!");

        return iProperties.values();

//$Section=Operation$ID=3FB1620A0132$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Properties
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C812C02D5$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C812C02D5$Preserve=no
    public Map getProperties() {
//$Section=Attribute get$ID=3F9C812C02D5$Preserve=no
        return iProperties;
//$Section=Attribute get$ID=3F9C812C02D5$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C812C02D5$Preserve=no
/**
 * Set accessor method.
 *
 * @param Properties the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C812C02D5$Preserve=no
    public void setProperties(Map aValue) {
//$Section=Attribute set$ID=3F9C812C02D5$Preserve=no
        iProperties = aValue;
//$Section=Attribute set$ID=3F9C812C02D5$Preserve=no
    }
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C813E0303$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C813E0303$Preserve=no
    public String getName() {
//$Section=Attribute get$ID=3F9C813E0303$Preserve=no
        return iName;
//$Section=Attribute get$ID=3F9C813E0303$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C813E0303$Preserve=no
/**
 * Set accessor method.
 *
 * @param Name the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C813E0303$Preserve=no
    public void setName(String aValue) {
//$Section=Attribute set$ID=3F9C813E0303$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=3F9C813E0303$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9C58B802D4$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C58B802D4$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C58B802D4$Preserve=no

//End of class---------------
}
