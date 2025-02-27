//$Section=License$ID=417A47E60203$Preserve=no

/* ========================================================================= *
 *                                                                           *
 *                       The eSarks Software License                         *
 *                                                                           *
 *           Copyright (c) 2003 Architects of Software Design, Corp.         *
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

//  Generated at 2005.12.11 08:16:25.937 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: MicScriptHelper.script

//$Section=ChangeLog$ID=417A47E60203$Preserve=yes

 /* ========================================================================= *
    Contributor        Description
    ------------------ ------------------------------------------------------
                       Author

  * ========================================================================= */

//$Section=Class$ID=417A47E60203$Preserve=no

package com.esarks.mic;

//$Section=ClassJavadoc$ID=417A47E60203$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=417A47E60203$Preserve=no
//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import com.esarks.jac.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.net.*;
import javax.servlet.*;
// SuperClass
import com.esarks.jac.ScriptHelper;

//$Section=CustomDeclare$ID=417A47E60203$Preserve=yes

 //----------------------------------------------------------------------------
 // This section is for custom declarations.
 //----------------------------------------------------------------------------

import com.esarks.arm.model.jeo.*;

//$Section=CustomDeclare$ID=417A47E60203$Preserve=no

public class MicScriptHelper extends com.esarks.jac.ScriptHelper {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    protected Script iMyHomeScript;
    protected Stack iSavedScript = new Stack();
    protected Stack iSavedSymbolTable = new Stack();
    protected Stack iSavedPropertyHelper = new Stack();
    protected MicScriptHelper iModelingElement;
    protected String iScriptFullName;
    protected String iScriptInstanceName;
    protected String iScriptPackage;
    protected String iScriptName;
    protected String iParentName;
    protected String iParentInstance;
    protected MicScriptHelper iParentObject;
    protected static int iInstanceNumber = 0;
    protected SecurityManager iSecurityManager;
    protected String iState = "";
    protected boolean iExitStatus = false;
    protected Log iMicLog;
    protected ProcessJeo iProcessJeo = new ProcessJeo("process");
    protected boolean iOnloadCalled = false;

//$Section=CustomClassDeclare$ID=417A47E60203$Preserve=yes

 //----------------------------------------------------------------------------
 // This section is for custom class declarations.
 //----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A47E60203$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=417A47E60203$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=417A47E60203$Preserve=no
    protected MicScriptHelper() {
//$Section=DefaultConstructor$ID=417A47E60203$Preserve=yes
//$Section=DefaultConstructor$ID=417A47E60203$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=417A47E60203$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=417A47E60203$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=417A47E60203$Preserve=yes
         freeResources();
//$Section=DefaultDestructor$ID=417A47E60203$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=417A47E60203$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=417A47E60203$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=417A47E60203$Preserve=yes
      iMyHomeScript = null;
      iSavedScript = null;
      iSavedSymbolTable = null;
      iSavedPropertyHelper = null;
      if (iModelingElement != null) iModelingElement.freeResources();
      iModelingElement = null;
      iSecurityManager = null;
      iMicLog = null;
      iProcessJeo = null;
      super.freeResources();
//$Section=DefaultFreeResources$ID=417A47E60203$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=417B94F7034B$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=417B94F7034B$Preserve=no
    public MicScriptHelper( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417B94F7034B$Preserve=yes
      super(aScript);
      iMyHomeScript = aScript;
      setContext(aScript.getMasterScript());
//ScriptWriter~~      String lLogInstance = <![$jac:log:instance]!>;
      String lLogInstance = iSymbolTable.translateProperties("[$jac:log:instance]");
      restoreContext();
//      iMicLog = Log.getInstance("micLog");
      iMicLog = Log.getInstance(lLogInstance);
      iProcessJeo.setEventTime(new PropertyValue( new java.sql.Timestamp(new Date().getTime()) ));
      iProcessJeo.setEventCode("process");
      iProcessJeo.setDescription("No name process.");
//$Section=Operation$ID=417B94F7034B$Preserve=no
    }

//$Section=OperationJavadoc$ID=417B9563036B$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aName
 *
 * @param aInstance
 *
 */
//$Section=OperationJavadoc$ID=417B9563036B$Preserve=no
    public MicScriptHelper( Script aScript, String aName, String aInstance ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417B9563036B$Preserve=yes
      super(aScript, aName, aInstance);
      iMyHomeScript = aScript;
      iProcessJeo.setEventTime(new PropertyValue( new java.sql.Timestamp(new Date().getTime()) ));
      iProcessJeo.setEventCode("process");
      iProcessJeo.setDescription("Process=" + aName + ", Instance=" + aInstance + ".");
//$Section=Operation$ID=417B9563036B$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4E0C0203$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4E0C0203$Preserve=no
    public MicScriptHelper loadScript( String aScriptName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4E0C0203$Preserve=yes
         return loadScript(iScript.getMasterScript(), true, aScriptName, "", true);
//$Section=Operation$ID=417A4E0C0203$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4E300261$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aInstance
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4E300261$Preserve=no
    public MicScriptHelper loadScript( String aScriptName, String aInstance ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4E300261$Preserve=yes
         return loadScript(iScript.getMasterScript(), true, aScriptName, aInstance, true);
//$Section=Operation$ID=417A4E300261$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4E460157$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aLoadHas
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4E460157$Preserve=no
    public MicScriptHelper loadScript( String aScriptName, boolean aLoadHas ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4E460157$Preserve=yes
         return loadScript(iScript.getMasterScript(), true, aScriptName, "", aLoadHas);
//$Section=Operation$ID=417A4E460157$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4E5F0271$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aInstance
 *
 * @param aLoadHas
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4E5F0271$Preserve=no
    public MicScriptHelper loadScript( String aScriptName, String aInstance, boolean aLoadHas ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4E5F0271$Preserve=yes
         return loadScript(iScript.getMasterScript(), true, aScriptName, aInstance, aLoadHas);
//$Section=Operation$ID=417A4E5F0271$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4E900399$Preserve=yes
/**
 *
 * @param aUseScript
 *
 * @param aCreateNewScript
 *
 * @param aScriptName
 *
 * @param aLoadHas
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4E900399$Preserve=no
    public MicScriptHelper loadScript( Script aUseScript, boolean aCreateNewScript, String aScriptName, boolean aLoadHas ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4E900399$Preserve=yes
         return loadScript(aUseScript, aCreateNewScript, aScriptName, "", aLoadHas);
//$Section=Operation$ID=417A4E900399$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4EDC0186$Preserve=yes
/**
 *
 * @param aUseScript
 *
 * @param aCreateNewScript
 *
 * @param aScriptName
 *
 * @param aInstance
 *
 * @param aLoadHas
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4EDC0186$Preserve=no
    public MicScriptHelper loadScript( Script aUseScript, boolean aCreateNewScript, String aScriptName, String aInstance, boolean aLoadHas ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4EDC0186$Preserve=yes
  // This method is called in the context of the object requesting to load
  // a script (i.e. XML file/class pair).  For example, a modeling element may
  // request to load another modeling element.  The caller is a type of ScriptHelper
  // and this method is called by the requesting
  // modeling element to load the requested modeling element.

  // As a result, this method will attempt to find the requested XML already
  // in memory (via the MicScriptHelperFactory).  If the object exists, then
  // a check is performed by the requested modeling element to see if the XML
  // in memory or the associated script class is stale by the requested object.

  // If the XML file does not exist, then it is loaded.  But since the model
  // type is not known (e.g. don't know if the XML file refers to an Actor, or
  // Use Case), then a MicScriptHelper is loaded as a wrapper of the actual
  // model class.  That means that each modeling element loaded has a ScriptHelper
  // object residing in the master Script object, which contains a modeling
  // element ScriptHelper of the specific type, which contains the Script object
  // of context (and the XML state).

  // Master Script contains the list of loaded modeling elements.  Each loaded
  // modeling element is a MicScriptHelper, which contains the base modeling
  // element type class (e.g. Actor), which contains the Script context for
  // its state.

//  System.out.println("> loadScript " + aScriptName);

      // Load XML file if it exists
      File lXmlFile = new File(path(aScriptName) + ".xml");

// Don't require an XML
//      if (!lXmlFile.exists()) {
//  System.out.println("> loadScript " + aScriptName);
//  System.out.println("< loadScript " + aScriptName + "... XML file does not exist... exiting with null");
//        return null;
//      }

      // Check for XmlHelper object in global script.

  //System.out.println("< loadScript " + aScriptName + "... Checking for MicSciptHelper...");

      MicScriptHelperFactory lMicScriptHelperFactory = new MicScriptHelperFactory();
      MicScriptHelper lMicScriptHelper = (MicScriptHelper) ScriptHelper.getScriptHelper(aUseScript, aScriptName, aInstance, aCreateNewScript, lMicScriptHelperFactory);

  //System.out.println("< loadScript " + aScriptName + "... exiting with lMicScriptHelper.loadXml results");

      return lMicScriptHelper.loadXml(aScriptName, aInstance, aLoadHas);
//$Section=Operation$ID=417A4EDC0186$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4F1402DE$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aInstance
 *
 * @param aLoadHas
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4F1402DE$Preserve=no
    public MicScriptHelper loadXml( String aScriptName, String aInstance, boolean aLoadHas ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4F1402DE$Preserve=yes
  // This method is called in the context of the modeling element wrapper.

//  System.out.println("> loadXml " + aScriptName);

      // Load XML file if it exists
      File lXmlFile = new File(path(aScriptName) + ".xml");

// Don't require an XML
//      if (!lXmlFile.exists()) {
//        System.out.println(aScriptName + "... XML file does not exist.");
//  System.out.println("+ loadXml " + aScriptName + "... XML file does not exist");
//  System.out.println("< loadXml... exiting with null");
//        return null;
//      }

      // See if the XML file is already loaded, and check if it's stale.
      if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element")).size() != 0) {

  //System.out.println("+ loadXml... element found... checking stale");

        if (lXmlFile.lastModified() > iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element:lastModified")).getValueLong()) {

          // It is loaded, and it is stale...  Remove it in memory so it can be reloaded.

//  System.out.println("+ loadXml... xml is stale... reload required");

          iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element")).remove();

        } else {

          // It is loaded, but not stale...so don't reload.
  //System.out.println("+ loadXml... xml is not stale");
  //System.out.println("< loadXml... exiting with loadScript results");
          return loadXmlScript(aScriptName, aInstance, aLoadHas);
        }

      } else {

  //System.out.println("+ loadXml... element not found... parsing required");

      }

  //    Object lScriptObject = null;
  //    lScriptObject = (Object) lElementPropertyValue.getPropertyCollection().getPropertyValues("scriptObject", false).get(0).getValueObject();

  //System.out.println("+ loadXml... parsing xml");

      if (lXmlFile.exists()) {
        parseXml(aScriptName);
      }

 //     ParseXmlSchema lParseXmlSchema = new ParseXmlSchema(path(aScriptName) + ".xml", iScript.getMasterScript().getSymbolTable(), iScript.getSymbolTable(), true);
 //     lParseXmlSchema.freeResources();
 //     lParseXmlSchema = null;

      // Check to see if the file loaded contains a <mic.element> root tag.

      if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element")).size() > 0) {

 //       iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element")).alias("element");
  //System.out.println("+ loadXml... found element after parse");
        iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element:lastModified")).set(lXmlFile.lastModified());

      } else {

//  Allow this condition (XML file may be missing)
//  System.out.println("+ loadXml... ELEMENT NOT FOUND AFTER PARSE!!!!  CHECK THIS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//  System.out.println("< loadXml... exiting with null");
//        return null;

      }

      // Check security to see if we are going to allow loading to proceed...
 //     if (iSymbolTable.translateProperties("[mic.element:type]").compareTo("SecurityManager") != 0 && iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element:securityManager")).size() > 0) {
 //       SecurityManager lSecurityManager = (SecurityManager) loadScript(iSymbolTable.translateProperties("[mic.element:securityManager]"), true);
 //       if (lSecurityManager.checkScript(aScriptName) == false) return null;
 //     }
//      if (iSymbolTable.translateProperties("[mic.element:type]").compareTo("SecurityManager") != 0 && iSecurityManager != null) {
//        if (iSecurityManager.checkScript(aScriptName) == false) return null;
//      }

  //System.out.println("< loadXml... exiting with loadScript results");

      MicScriptHelper lMicScriptHelper = loadXmlScript(aScriptName, aInstance, aLoadHas);
      if (!lMicScriptHelper.iOnloadCalled) {
        lMicScriptHelper.iOnloadCalled = true;
        lMicScriptHelper.onLoad();
      }
      return lMicScriptHelper;

//      return loadScript(aScriptName, aInstance, aLoadHas);
//$Section=Operation$ID=417A4F1402DE$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4F52034B$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aInstance
 *
 * @param aLoadHas
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4F52034B$Preserve=no
    public MicScriptHelper loadXmlScript( String aScriptName, String aInstance, boolean aLoadHas ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4F52034B$Preserve=yes
//  System.out.println("> loadXmlScript " + aScriptName);

      if (iModelingElement != null) return iModelingElement;

      if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element:script")).size() > 0) {
        aScriptName = iSymbolTable.translateProperties("[mic.element:script]");
      }

      setContext(iScript.getMasterScript());
      String lCompile = "true";
//ScriptWriter~~      if (<!$jac:compile!>!size() > 0) lCompile = <![$jac:compile]!>;
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:compile")).size() > 0) lCompile = iSymbolTable.translateProperties("[$jac:compile]");
      restoreContext();
      if (lCompile.equals("false")) {
        if (!iSymbolTable.translateProperties("[mic.element:type]").equals("")) {
          iModelingElement = (MicScriptHelper) iScript.getMasterScript().loadScript(aScriptName, "micScript" + iSymbolTable.translateProperties("[mic.element:type]"));
        } else {
          iModelingElement = (MicScriptHelper) iScript.getMasterScript().loadScript(aScriptName, "mic");
        }
        iScript.getMasterScript().execMethod(iModelingElement, "registerXml", new Object[] {aScriptName, aInstance, iScript, new Boolean(aLoadHas)});
  //System.out.println("< loadXmlScript... returning loadScript object of type " + iSymbolTable.translateProperties("[mic.element:type]"));
        return iModelingElement;
      }

      File lXmlFile = new File(path(aScriptName) + ".xml");
      File lMakeFile = new File(path(aScriptName) + ".make");
      File lScriptFile = new File(path(aScriptName) + ".script");
      File lClassFile = new File(workPath(aScriptName) + ".class");

      if (!lXmlFile.exists() || (!lMakeFile.exists() && !lScriptFile.exists())) {
        if (!iSymbolTable.translateProperties("[mic.element:type]").equals("")) {
          iModelingElement = (MicScriptHelper) iScript.getMasterScript().loadScript(aScriptName, "micScript" + iSymbolTable.translateProperties("[mic.element:type]"));
        } else {
          iModelingElement = (MicScriptHelper) iScript.getMasterScript().loadScript(aScriptName, "mic");
        }
        if (iModelingElement != null) {
          iScript.getMasterScript().execMethod(iModelingElement, "registerXml", new Object[] {aScriptName, aInstance, iScript, new Boolean(false)});
          return iModelingElement;
        } else {
          if (!lXmlFile.exists()) System.out.println("MicScriptHelper: !WARNING! " + aScriptName + " XML file does not exist.");
          if (!lMakeFile.exists() && !lScriptFile.exists()) System.out.println("MicScriptHelper: !WARNING! " + aScriptName + " Make or Script file does not exist.");
        }
      }

      if (lClassFile.exists() || lMakeFile.exists() || lScriptFile.exists()) {
  //System.out.println("+ loadXmlScript... either MakeFile or ScriptFile exists... Making script... ");
        if (!iSymbolTable.translateProperties("[mic.element:type]").equals("")) {
          iModelingElement = (MicScriptHelper) iScript.getMasterScript().loadScript(aScriptName, "micScript" + iSymbolTable.translateProperties("[mic.element:type]"));
        } else {
          iModelingElement = (MicScriptHelper) iScript.getMasterScript().loadScript(aScriptName, "mic");
        }
        iScript.getMasterScript().execMethod(iModelingElement, "registerXml", new Object[] {aScriptName, aInstance, iScript, new Boolean(aLoadHas)});
  //System.out.println("< loadXmlScript... returning loadScript object of type " + iSymbolTable.translateProperties("[mic.element:type]"));
        return iModelingElement;
      }

      if (lClassFile.exists() && lScriptFile.exists() && (lXmlFile.lastModified() > lClassFile.lastModified())) {
  //System.out.println("+ loadXmlScript... lXmlFile.lastModified() > lClassFile.lastModified() = true... deleting class file");
        lClassFile.delete();
        iModelingElement = null;
      }

      if (iModelingElement == null) {
  //System.out.println("+ loadXmlScript... making class file from XML of type " + iSymbolTable.translateProperties("[mic.element:type]"));
        if (!iSymbolTable.translateProperties("[mic.element:type]").equals("")) {
          iModelingElement = (MicScriptHelper) iScript.getMasterScript().loadScript("com.esarks.mic." + iSymbolTable.translateProperties("[mic.element:type]"), "micScript" + iSymbolTable.translateProperties("[mic.element:type]"));
        } else {
//?          iModelingElement = (MicScriptHelper) iScript.getMasterScript().loadScript("com.esarks.mic." + iSymbolTable.translateProperties("[mic.element:type]"), "mic"));
        }
        iScript.getMasterScript().execMethod(iModelingElement, "registerXml", new Object[] {aScriptName, aInstance, iScript, new Boolean(aLoadHas)});
      } else {
  //System.out.println("+ loadXmlScript... class already loaded of type " + iSymbolTable.translateProperties("[mic.element:type]"));
      }
      return iModelingElement;
//$Section=Operation$ID=417A4F52034B$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4F700177$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4F700177$Preserve=no
    public void setContext( String aScriptName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4F700177$Preserve=yes
      MicScriptHelper lMicScriptHelper = (MicScriptHelper) loadScript(aScriptName);
      setContext(lMicScriptHelper.iScript);
//$Section=Operation$ID=417A4F700177$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A51B9038A$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aInstanceName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A51B9038A$Preserve=no
    public void setContext( String aScriptName, String aInstanceName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A51B9038A$Preserve=yes
      MicScriptHelper lMicScriptHelper = (MicScriptHelper) loadScript(aScriptName, aInstanceName);
      setContext(lMicScriptHelper.iScript);
//$Section=Operation$ID=417A51B9038A$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4FBA0271$Preserve=yes
/**
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4FBA0271$Preserve=no
    public void setContext( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4FBA0271$Preserve=yes
      iSavedScript.push(iScript);
      iSavedSymbolTable.push(iSymbolTable);
      iSavedPropertyHelper.push(iPropertyHelper);
      iScript = aScript;
      iSymbolTable = aScript.getSymbolTable();
      iPropertyHelper = new PropertyHelper(aScript);
//$Section=Operation$ID=417A4FBA0271$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A4FB202EE$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A4FB202EE$Preserve=no
    public void restoreContext( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A4FB202EE$Preserve=yes
      if (!iSavedScript.empty()) {
        iScript = (Script) iSavedScript.pop();
        iSymbolTable = (SymbolTable) iSavedSymbolTable.pop();
        iPropertyHelper = (PropertyHelper) iSavedPropertyHelper.pop();
      }
//$Section=Operation$ID=417A4FB202EE$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5059033C$Preserve=yes
/**
 *
 * @param aName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5059033C$Preserve=no
    public boolean scriptHelperExists( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A5059033C$Preserve=yes
      if (iScript.getMasterScript().getSymbolTable().getPropertyCollection().getPropertyValues("$jac:scriptHelper:" + aName, false) != null) return true;
      return false;
//$Section=Operation$ID=417A5059033C$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5077007D$Preserve=yes
/**
 *
 * @param aName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5077007D$Preserve=no
    public MicScriptHelper getMicScriptHelper( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A5077007D$Preserve=yes
      if (scriptHelperExists(aName) == true) {
        return (MicScriptHelper) iScript.getMasterScript().getSymbolTable().getPropertyCollection().getPropertyValues("$jac:scriptHelper:" + aName, false).get(0).getValueObject();
      }
      return null;
//$Section=Operation$ID=417A5077007D$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A511800DA$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A511800DA$Preserve=no
    public ServletRequest getServletRequest( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A511800DA$Preserve=yes
      Script lScript = iScript.getMasterScript();
      return (ServletRequest) lScript.getSymbolTable().getPropertyCollection().getPropertyValue("$jac:request", 0).getValueObject();
//$Section=Operation$ID=417A511800DA$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A513101B5$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A513101B5$Preserve=no
    public ServletResponse getServletResponse( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A513101B5$Preserve=yes
      Script lScript = iScript.getMasterScript();
      return (ServletResponse) lScript.getSymbolTable().getPropertyCollection().getPropertyValue("$jac:response", 0).getValueObject();
//$Section=Operation$ID=417A513101B5$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A514202AF$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A514202AF$Preserve=no
    public void execute( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A514202AF$Preserve=yes
//$Section=Operation$ID=417A514202AF$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A515603A9$Preserve=yes
/**
 *
 * @param aMicScriptHelper
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A515603A9$Preserve=no
    public void execute( MicScriptHelper aMicScriptHelper ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A515603A9$Preserve=yes
//$Section=Operation$ID=417A515603A9$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A51F00290$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aScriptFullName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A51F00290$Preserve=no
    public void register( Script aScript, String aScriptFullName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A51F00290$Preserve=yes
      register(aScript, aScriptFullName, null, null);
//$Section=Operation$ID=417A51F00290$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A521400AB$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aScriptFullName
 *
 * @param aScriptInstanceName
 *
 * @param aScriptObject
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A521400AB$Preserve=no
    public void register( Script aScript, String aScriptFullName, String aScriptInstanceName, Object aScriptObject ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A521400AB$Preserve=yes
 //     Script lScript = aScript;

 //NOT appears to set the registry on behalf of the aScript coming in....RATHER than calling a method on aScript.
 //WHY NOT CALL A METHOD ON aScript, and let him take care of his own reigstry??? (IF, that's what is happening???)  ptm 10/24/04

    setContext(aScript);
//ScriptWriter~~    <!$jac:registry:script!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).resetIterator();
//ScriptWriter~~    if (<!$jac:registry!>!scan("script", aScriptFullName) == true) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry")).scan("script", aScriptFullName) == true) {
      if (aScriptObject == null) {
        restoreContext();
        return;
      }
//ScriptWriter~~      <!$jac:registry:script:instance!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).resetIterator();
//ScriptWriter~~      if (<!$jac:registry:script!>!scan("instance", aScriptInstanceName) == true) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).scan("instance", aScriptInstanceName) == true) {
        restoreContext();
        return;
      }
//ScriptWriter~~      <!$jac:registry:script:instance!>!set(aScriptInstanceName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).set(aScriptInstanceName);
//ScriptWriter~~      <!$jac:registry:script:instance:object!>!set(aScriptObject);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance:object")).set(aScriptObject);
      restoreContext();
      return;
    }
//ScriptWriter~~    <!$jac:registry:script!>!set(aScriptFullName);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).set(aScriptFullName);
    if (aScriptObject != null) {
//ScriptWriter~~      <!$jac:registry:script:instance!>!set(aScriptInstanceName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).set(aScriptInstanceName);
//ScriptWriter~~      <!$jac:registry:script:instance:object!>!set(aScriptObject);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance:object")).set(aScriptObject);
    }
    restoreContext();
//$Section=Operation$ID=417A521400AB$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A525F0251$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aScriptFullName
 *
 * @param aScriptInstanceName
 *
 * @param aScriptObject
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A525F0251$Preserve=no
    public void unregister( Script aScript, String aScriptFullName, String aScriptInstanceName, Object aScriptObject ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417A525F0251$Preserve=yes

 //SEE NOTE ON register method
    setContext(aScript);
//ScriptWriter~~    <!$jac:registry:script!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).resetIterator();
//ScriptWriter~~    if (<!$jac:registry!>!scan("script", aScriptFullName) == true) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry")).scan("script", aScriptFullName) == true) {
//ScriptWriter~~      <!$jac:registry:script:object!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:object")).resetIterator();
//ScriptWriter~~      if (<!$jac:registry:script!>!scan("instance", aScriptInstanceName) == true) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).scan("instance", aScriptInstanceName) == true) {
//ScriptWriter~~        <!$jac:registry:script:instance!>!removeValue();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).removeValue();
      }
    }
    restoreContext();

//$Section=Operation$ID=417A525F0251$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA3610128$Preserve=yes
/**
 *
 * @param aScriptFullName
 *
 * @param aInstance
 *
 * @param aScript
 *
 * @param aBooleanLoadHas
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA3610128$Preserve=no
    public void registerXml( String aScriptFullName, String aInstance, Script aScript, Boolean aBooleanLoadHas ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA3610128$Preserve=yes
    boolean aLoadHas = aBooleanLoadHas.booleanValue();

//  System.out.println("> registerXml " + iSymbolTable.translateProperties("[mic.element:title]"));

      iScript = aScript;
      iSymbolTable = iScript.getSymbolTable();
      iPropertyHelper.resetScript(aScript);

      iScriptFullName = aScriptFullName;
      iScriptInstanceName = aInstance;
      iScriptPackage = "";
      iScriptName = aScriptFullName;
 //     iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:scriptFullName")).reset(iScriptFullName);
 //     iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:scriptPackage")).reset(iScriptPackage);
 //     iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:scriptInstanceName")).reset(iScriptInstanceName);

      int lLastDot = -1;
      for (int lIdx = aScriptFullName.length() - 1; lIdx >= 0; lIdx--) {
        if (aScriptFullName.charAt(lIdx) == '.') {
          lLastDot = lIdx;
          break;
        }
      }
      if (lLastDot > -1) {
        iScriptPackage = aScriptFullName.substring(0, lLastDot);
        iScriptName = aScriptFullName.substring(lLastDot + 1);
      }

  //System.out.println("< registerXml " + iScriptPackage + " ... " + iScriptName);

      if (aLoadHas) loadHasElements(null);
//$Section=Operation$ID=417BA3610128$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA474006D$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA474006D$Preserve=no
    public boolean hasOpen( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA474006D$Preserve=yes
//ScriptWriter~~    <!$jac:registry:script!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).resetIterator();
//ScriptWriter~~    while (<!$jac:registry:script!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).next()) {
//ScriptWriter~~      String lContext = <![$jac:registry:script]!>;
      String lContext = iSymbolTable.translateProperties("[$jac:registry:script]");
//ScriptWriter~~      <!$jac:registry:script:instance!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).resetIterator();
//ScriptWriter~~      while (<!$jac:registry:script:instance!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).next()) {
//ScriptWriter~~        MicScriptHelper lContextObject = (MicScriptHelper) <!$jac:registry:script:instance:object!>!getValueObject();
        MicScriptHelper lContextObject = (MicScriptHelper) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance:object")).getValueObject();
        if (lContextObject.getState().compareTo("open") == 0) {
          return true;
        } else {
          if (lContextObject.hasOpen() == true) return true;
        }
      }
    }
    return false;
//$Section=Operation$ID=417BA474006D$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA490009C$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA490009C$Preserve=no
    public boolean hasAny( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA490009C$Preserve=yes
//ScriptWriter~~    if (<!$jac:registry:script!>!size() > 0) return true;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).size() > 0) return true;
    return false;
//$Section=Operation$ID=417BA490009C$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA499035B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA499035B$Preserve=no
    public boolean hasOpenEndNode( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA499035B$Preserve=yes
//ScriptWriter~~    <!$jac:registry:script!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).resetIterator();
//ScriptWriter~~    while (<!$jac:registry:script!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).next()) {
//ScriptWriter~~      String lContext = <![$jac:registry:script]!>;
      String lContext = iSymbolTable.translateProperties("[$jac:registry:script]");
//ScriptWriter~~      <!$jac:registry:script:instance!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).resetIterator();
//ScriptWriter~~      while (<!$jac:registry:script:instance!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).next()) {
//ScriptWriter~~        Element lContextObject = (Element) <!$jac:registry:script:instance:object!>!getValueObject();
        Element lContextObject = (Element) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance:object")).getValueObject();
        if (lContextObject.hasOpen() == true) {
          if (lContextObject.hasOpenEndNode() == true) return true;
        } else {
          if (lContextObject.getState().compareTo("open") == 0) return true;
        }
      }
    }
    return false;
//$Section=Operation$ID=417BA499035B$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA4B80167$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA4B80167$Preserve=no
    public boolean allowHasClose( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA4B80167$Preserve=yes
//ScriptWriter~~    <!$jac:registry:script!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).resetIterator();
//ScriptWriter~~    while (<!$jac:registry:script!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).next()) {
//ScriptWriter~~      <!$jac:registry:script:instance!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).resetIterator();
//ScriptWriter~~      while (<!$jac:registry:script:instance!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).next()) {
//ScriptWriter~~        MicScriptHelper lContextObject = (MicScriptHelper) <!$jac:registry:script:instance:object!>!getValueObject();
        MicScriptHelper lContextObject = (MicScriptHelper) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance:object")).getValueObject();
        if (lContextObject.allowClose() == false) return false;
      }
    }
    return true;
//$Section=Operation$ID=417BA4B80167$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA4D2000F$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA4D2000F$Preserve=no
    public boolean allowClose( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA4D2000F$Preserve=yes
    if (hasOpen() == true) return false;
    return allowHasClose();
//$Section=Operation$ID=417BA4D2000F$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA52201D4$Preserve=yes
/**
 *
 * @param aParentName
 *
 * @param aParentInstance
 *
 * @param aParentObject
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA52201D4$Preserve=no
    public void setParent( String aParentName, String aParentInstance, MicScriptHelper aParentObject ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA52201D4$Preserve=yes
 //     iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:parent")).reset(aParentName);
 //     iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:parent:instance")).reset(aParentInstance);
 //     iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:parent:object")).reset(aParentObject);
         iParentName = aParentName;
         iParentInstance = aParentInstance;
         iParentObject = aParentObject;
//$Section=Operation$ID=417BA52201D4$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA5EA03C8$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA5EA03C8$Preserve=no
    public int getNextInstance( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA5EA03C8$Preserve=yes

     return ++iInstanceNumber;

 //     setContext(iScript.getMasterScript());
 //     if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:instanceNumber")).size() == 0) {
 //       iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:instanceNumber")).set(0);
 //     }
 //     int lInstance = iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:instanceNumber")).getValueInt();
 //     lInstance++;
 //     iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:instanceNumber")).reset(lInstance);
 //     restoreContext();
 //     return lInstance;
//$Section=Operation$ID=417BA5EA03C8$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA60D0186$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA60D0186$Preserve=no
    public MicScriptHelper openNewInstance( String aScriptName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA60D0186$Preserve=yes
      MicScriptHelper lMicScriptHelper = null;
//      if (iSecurityManager != null && iSecurityManager.checkScript(aScriptName) == true) {

        int lInstance = getNextInstance();
        lMicScriptHelper = (MicScriptHelper) loadScript(aScriptName, String.valueOf(lInstance));
        register(iScript, aScriptName, String.valueOf(lInstance), lMicScriptHelper);
        lMicScriptHelper.setLifeCycleState("init");
        lMicScriptHelper.setParent(iScriptFullName, iScriptInstanceName, this);
        lMicScriptHelper.setLifeCycleState("open");
//      }
      return lMicScriptHelper;
//$Section=Operation$ID=417BA60D0186$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA6330290$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA6330290$Preserve=no
    public MicScriptHelper openParentInstance( String aScriptName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA6330290$Preserve=yes
      MicScriptHelper lMicScriptHelper = null;
//      if (iSecurityManager != null && iSecurityManager.checkScript(aScriptName) == true) {
        String lInstanceName = iScriptInstanceName;
        if (lInstanceName == null) lInstanceName = "";
        lMicScriptHelper = (MicScriptHelper) loadScript(aScriptName, lInstanceName);
        register(iScript, aScriptName, lInstanceName, lMicScriptHelper);
        lMicScriptHelper.setLifeCycleState("init");
        lMicScriptHelper.setParent(iScriptFullName, iScriptInstanceName, this);
        lMicScriptHelper.setLifeCycleState("open");
//      }
      return lMicScriptHelper;
//$Section=Operation$ID=417BA6330290$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BA64D0213$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BA64D0213$Preserve=no
    public MicScriptHelper openSingletonInstance( String aScriptName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BA64D0213$Preserve=yes
      MicScriptHelper lMicScriptHelper = null;
//      if (iSecurityManager != null && iSecurityManager.checkScript(aScriptName) == true) {
        String lInstanceName = "";
        lMicScriptHelper = (MicScriptHelper) loadScript(aScriptName, lInstanceName);
        register(iScript, aScriptName, lInstanceName, lMicScriptHelper);
        lMicScriptHelper.setLifeCycleState("init");
        lMicScriptHelper.setParent(iScriptFullName, iScriptInstanceName, this);
        lMicScriptHelper.setLifeCycleState("open");
//      }
      return lMicScriptHelper;
//$Section=Operation$ID=417BA64D0213$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BB2E00280$Preserve=yes
/**
 *
 * @param aMethod
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BB2E00280$Preserve=no
    public void loadHasElements( String aMethod ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BB2E00280$Preserve=yes
//  System.out.println("> loadHasElements " + iScriptFullName + " Title = " + iSymbolTable.translateProperties("[mic.element:title]"));

      if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:loadHas")).size() > 0) return;
      iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:loadHas")).reset("true");

      iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element:has")).resetIterator();
      while (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element:has")).next()) {

        String lHasScriptName;
        if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("mic.element:has:element")).size() > 0) {
          if (iSymbolTable.translateProperties("[mic.element:has:element]").startsWith(".") == true) {
            lHasScriptName = iScriptPackage + iSymbolTable.translateProperties("[mic.element:has:element]");
          } else {
            lHasScriptName = iSymbolTable.translateProperties("[mic.element:has:element]");
          }
  //System.out.println("+ loadHasElements has element -> " + lHasScriptName);
          register(iScript, lHasScriptName);

          if (iSymbolTable.translateProperties("[mic.element:has:action]").compareTo("open") == 0) {
            if (iSymbolTable.translateProperties("[mic.element:has:method]").compareTo("") == 0) {
              openNewInstance(lHasScriptName);
            } else {
              iScript.execMethod(this, iSymbolTable.translateProperties("[mic.element:has:method]"), new Object[] {lHasScriptName});
            }
  //          int lInstance = getNextInstance();
  //          Element lObject = (Element) loadScript(lHasScriptName, iScriptFullName + String.valueOf(lInstance), false);
  //          register(iScript, lHasScriptName, iScriptFullName + String.valueOf(lInstance), lObject);
  //          lObject.execute("init");
  //          lObject.setParent(iScriptFullName, iScriptInstanceName, this);
  //          lObject.execute("open");
          }

  //        if (aMethod != null) iScript.getMasterScript().execMethod(lObject, aMethod);
        }

      }

  //System.out.println("< loadHasElements " + iScriptFullName);
//$Section=Operation$ID=417BB2E00280$Preserve=no
    }

//$Section=OperationJavadoc$ID=417BB5F10186$Preserve=yes
/**
 *
 * @param aState
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417BB5F10186$Preserve=no
    public void setLifeCycleState( String aState ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=417BB5F10186$Preserve=yes
         if (aState.compareTo("init") == 0) {
           iState = aState;
         }
         else if (aState.compareTo("open") == 0) {
           iState = aState;
         }
         else if (aState.compareTo("close") == 0) {
           iState = aState;
         }
//$Section=Operation$ID=417BB5F10186$Preserve=no
    }

//$Section=OperationJavadoc$ID=41EE79040203$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41EE79040203$Preserve=no
    public void setExit( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=41EE79040203$Preserve=yes
        iExitStatus = true;
//$Section=Operation$ID=41EE79040203$Preserve=no
    }

//$Section=OperationJavadoc$ID=41EE7AD7006D$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41EE7AD7006D$Preserve=no
    public void resetExit( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=41EE7AD7006D$Preserve=yes
        iExitStatus = false;
//$Section=Operation$ID=41EE7AD7006D$Preserve=no
    }

//$Section=OperationJavadoc$ID=41EE7AA0001F$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41EE7AA0001F$Preserve=no
    public boolean checkExit( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=41EE7AA0001F$Preserve=yes
        return iExitStatus;
//$Section=Operation$ID=41EE7AA0001F$Preserve=no
    }

//$Section=OperationJavadoc$ID=423ABE150000$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423ABE150000$Preserve=no
    public void processReport( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=423ABE150000$Preserve=yes
      if (iProcessJeo != null) {
        com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
        lServiceJeo.addJeo(iProcessJeo);
        iScript.execMethod("com.esarks.arm.logging.ProcessRpt", "render", new Object[]{"logs.ProcessRpt", lServiceJeo});
      }
//$Section=Operation$ID=423ABE150000$Preserve=no
    }

//$Section=OperationJavadoc$ID=4240415E0290$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4240415E0290$Preserve=no
    public Script getScript( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=4240415E0290$Preserve=yes
      return iScript;
//$Section=Operation$ID=4240415E0290$Preserve=no
    }

//$Section=OperationJavadoc$ID=429A12A7035B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=429A12A7035B$Preserve=no
    public void onLoad( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=429A12A7035B$Preserve=yes
//$Section=Operation$ID=429A12A7035B$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B025C000D6$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B025C000D6$Preserve=no
    public void setMicSecurityManager( SecurityManager aSecurityManager ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=42B025C000D6$Preserve=yes
        iSecurityManager = aSecurityManager;
//$Section=Operation$ID=42B025C000D6$Preserve=no
    }

//$Section=OperationJavadoc$ID=4392E81F02EE$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4392E81F02EE$Preserve=no
    public SecurityManager getMicSecurityManager( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelper.");
//$Section=Operation$ID=4392E81F02EE$Preserve=yes
        return iSecurityManager;
//$Section=Operation$ID=4392E81F02EE$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// ModelingElement
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=417A4C4C004E$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=417A4C4C004E$Preserve=no
    public MicScriptHelper getModelingElement() {
//$Section=Attribute get$ID=417A4C4C004E$Preserve=no
        return iModelingElement;
//$Section=Attribute get$ID=417A4C4C004E$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=417A4C4C004E$Preserve=no
/**
 * Set accessor method.
 *
 * @param ModelingElement the value to be set.
 */
//$Section=Attribute setJavadoc$ID=417A4C4C004E$Preserve=no
    public void setModelingElement(MicScriptHelper aValue) {
//$Section=Attribute set$ID=417A4C4C004E$Preserve=no
        iModelingElement = aValue;
//$Section=Attribute set$ID=417A4C4C004E$Preserve=no
    }
//----------------------------------------------------------------------------
// ScriptFullName
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=417A4C620157$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=417A4C620157$Preserve=no
    public String getScriptFullName() {
//$Section=Attribute get$ID=417A4C620157$Preserve=no
        return iScriptFullName;
//$Section=Attribute get$ID=417A4C620157$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=417A4C620157$Preserve=no
/**
 * Set accessor method.
 *
 * @param ScriptFullName the value to be set.
 */
//$Section=Attribute setJavadoc$ID=417A4C620157$Preserve=no
    public void setScriptFullName(String aValue) {
//$Section=Attribute set$ID=417A4C620157$Preserve=no
        iScriptFullName = aValue;
//$Section=Attribute set$ID=417A4C620157$Preserve=no
    }
//----------------------------------------------------------------------------
// ScriptInstanceName
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=417A4C71037A$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=417A4C71037A$Preserve=no
    public String getScriptInstanceName() {
//$Section=Attribute get$ID=417A4C71037A$Preserve=no
        return iScriptInstanceName;
//$Section=Attribute get$ID=417A4C71037A$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=417A4C71037A$Preserve=no
/**
 * Set accessor method.
 *
 * @param ScriptInstanceName the value to be set.
 */
//$Section=Attribute setJavadoc$ID=417A4C71037A$Preserve=no
    public void setScriptInstanceName(String aValue) {
//$Section=Attribute set$ID=417A4C71037A$Preserve=no
        iScriptInstanceName = aValue;
//$Section=Attribute set$ID=417A4C71037A$Preserve=no
    }
//----------------------------------------------------------------------------
// ScriptPackage
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=417B9480002F$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=417B9480002F$Preserve=no
    public String getScriptPackage() {
//$Section=Attribute get$ID=417B9480002F$Preserve=no
        return iScriptPackage;
//$Section=Attribute get$ID=417B9480002F$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=417B9480002F$Preserve=no
/**
 * Set accessor method.
 *
 * @param ScriptPackage the value to be set.
 */
//$Section=Attribute setJavadoc$ID=417B9480002F$Preserve=no
    public void setScriptPackage(String aValue) {
//$Section=Attribute set$ID=417B9480002F$Preserve=no
        iScriptPackage = aValue;
//$Section=Attribute set$ID=417B9480002F$Preserve=no
    }
//----------------------------------------------------------------------------
// ScriptName
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=417A4C7F0232$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=417A4C7F0232$Preserve=no
    public String getScriptName() {
//$Section=Attribute get$ID=417A4C7F0232$Preserve=no
        return iScriptName;
//$Section=Attribute get$ID=417A4C7F0232$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=417A4C7F0232$Preserve=no
/**
 * Set accessor method.
 *
 * @param ScriptName the value to be set.
 */
//$Section=Attribute setJavadoc$ID=417A4C7F0232$Preserve=no
    public void setScriptName(String aValue) {
//$Section=Attribute set$ID=417A4C7F0232$Preserve=no
        iScriptName = aValue;
//$Section=Attribute set$ID=417A4C7F0232$Preserve=no
    }
//----------------------------------------------------------------------------
// State
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=417C028F034B$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=417C028F034B$Preserve=no
    public String getState() {
//$Section=Attribute get$ID=417C028F034B$Preserve=no
        return iState;
//$Section=Attribute get$ID=417C028F034B$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=417C028F034B$Preserve=no
/**
 * Set accessor method.
 *
 * @param State the value to be set.
 */
//$Section=Attribute setJavadoc$ID=417C028F034B$Preserve=no
    public void setState(String aValue) {
//$Section=Attribute set$ID=417C028F034B$Preserve=no
        iState = aValue;
//$Section=Attribute set$ID=417C028F034B$Preserve=no
    }
//----------------------------------------------------------------------------
// ProcessJeo
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=423A123902EE$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=423A123902EE$Preserve=no
    public ProcessJeo getProcessJeo() {
//$Section=Attribute get$ID=423A123902EE$Preserve=no
        return iProcessJeo;
//$Section=Attribute get$ID=423A123902EE$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=423A123902EE$Preserve=no
/**
 * Set accessor method.
 *
 * @param ProcessJeo the value to be set.
 */
//$Section=Attribute setJavadoc$ID=423A123902EE$Preserve=no
    public void setProcessJeo(ProcessJeo aValue) {
//$Section=Attribute set$ID=423A123902EE$Preserve=no
        iProcessJeo = aValue;
//$Section=Attribute set$ID=423A123902EE$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=417A47E60203$Preserve=yes

 //----------------------------------------------------------------------------
 // This section is for custom operations.
 //----------------------------------------------------------------------------

//$Section=Deleted$ID=417A47E60203$Preserve=yes

 //----------------------------------------------------------------------------
 // This section contains orphaned code from deleted operations.
 //----------------------------------------------------------------------------

//$Section=Deleted$ID=417A47E60203$Preserve=no

//End of class---------------
}
