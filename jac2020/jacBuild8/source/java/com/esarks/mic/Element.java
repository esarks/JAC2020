//$Section=License$ID=417A4819000F$Preserve=no

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

//  Generated at 2005.01.08 10:34:33.937 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Element.script

//$Section=ChangeLog$ID=417A4819000F$Preserve=yes

 /* ========================================================================= *
    Contributor        Description
    ------------------ ------------------------------------------------------
                       Author

  * ========================================================================= */

//$Section=Class$ID=417A4819000F$Preserve=no

package com.esarks.mic;

//$Section=ClassJavadoc$ID=417A4819000F$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=417A4819000F$Preserve=no
//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import com.esarks.jac.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
// SuperClass

//$Section=CustomDeclare$ID=417A4819000F$Preserve=yes

 //----------------------------------------------------------------------------
 // This section is for custom declarations.
 //----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=417A4819000F$Preserve=no

public class Element extends com.esarks.mic.MicScriptHelper {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A4819000F$Preserve=yes

 //----------------------------------------------------------------------------
 // This section is for custom class declarations.
 //----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A4819000F$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=417A4819000F$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=417A4819000F$Preserve=no
    protected Element() {
//$Section=DefaultConstructor$ID=417A4819000F$Preserve=yes
//$Section=DefaultConstructor$ID=417A4819000F$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=417A4819000F$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=417A4819000F$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=417A4819000F$Preserve=yes
      freeResources();
//$Section=DefaultDestructor$ID=417A4819000F$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=417A4819000F$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=417A4819000F$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=417A4819000F$Preserve=yes
     super.freeResources();
//$Section=DefaultFreeResources$ID=417A4819000F$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=417B9BD100DA$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=417B9BD100DA$Preserve=no
    public Element( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Element.");
//$Section=Operation$ID=417B9BD100DA$Preserve=yes
      super(aScript);
//$Section=Operation$ID=417B9BD100DA$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5BA10290$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5BA10290$Preserve=no
    public String getIcon( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Element.");
//$Section=Operation$ID=417A5BA10290$Preserve=yes
      setContext(iMyHomeScript);
      String lReturn = iSymbolTable.translateProperties("[mic.element:icon]");
      if (lReturn.length() == 0) lReturn = iSymbolTable.translateProperties("[mic.element:type]");
      restoreContext();
      return lReturn;
//$Section=Operation$ID=417A5BA10290$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5C1C005D$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5C1C005D$Preserve=no
    public String getType( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Element.");
//$Section=Operation$ID=417A5C1C005D$Preserve=yes
      setContext(iMyHomeScript);
      String lReturn = iSymbolTable.translateProperties("[mic.element:type]");
      restoreContext();
      return lReturn;
//$Section=Operation$ID=417A5C1C005D$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5C2B02EE$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5C2B02EE$Preserve=no
    public String getTitle( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Element.");
//$Section=Operation$ID=417A5C2B02EE$Preserve=yes
      setContext(iMyHomeScript);
      String lReturn = iSymbolTable.translateProperties("[mic.element:title]");
      restoreContext();
      return lReturn;
//$Section=Operation$ID=417A5C2B02EE$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5CA600DA$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5CA600DA$Preserve=no
    public String getImage( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Element.");
//$Section=Operation$ID=417A5CA600DA$Preserve=yes
      return getImage(getIcon());
//$Section=Operation$ID=417A5CA600DA$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5CB8006D$Preserve=yes
/**
 *
 * @param aType
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5CB8006D$Preserve=no
    public String getImage( String aType ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Element.");
//$Section=Operation$ID=417A5CB8006D$Preserve=yes
      return iScript.getMasterScript().getSymbolTable().translateProperties("[micImages:" + aType + "]");
//$Section=Operation$ID=417A5CB8006D$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5CD20280$Preserve=yes
/**
 *
 * @param aProperty
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5CD20280$Preserve=no
    public String getProperty( String aProperty ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Element.");
//$Section=Operation$ID=417A5CD20280$Preserve=yes
      setContext(iScript.getMasterScript());
      String lReturn = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:" + aProperty + "]");
//      String lReturn = iSymbolTable.translateProperties("[properties:com.esarks.arm.properties.conf.properties:" + aProperty + "]");
      restoreContext();
      return lReturn;
//$Section=Operation$ID=417A5CD20280$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5CF603A9$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5CF603A9$Preserve=no
    public String getPhase( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Element.");
//$Section=Operation$ID=417A5CF603A9$Preserve=yes
      String lPhase = null;
      lPhase = iSymbolTable.translateProperties("[mic.element:phase]");
      if (lPhase.length() > 0) return lPhase;
      setContext(iScript.getMasterScript());
      lPhase = iSymbolTable.translateProperties("[$jac:phase]");
      restoreContext();
      return lPhase;
//$Section=Operation$ID=417A5CF603A9$Preserve=no
    }

//$Section=OperationJavadoc$ID=417A5D050186$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5D050186$Preserve=no
    public String getDocumentLocation( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Element.");
//$Section=Operation$ID=417A5D050186$Preserve=yes
      return iSymbolTable.translateProperties("[mic.element:template:[$mic:state]]");
//$Section=Operation$ID=417A5D050186$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=417A4819000F$Preserve=yes

 //----------------------------------------------------------------------------
 // This section is for custom operations.
 //----------------------------------------------------------------------------

//$Section=Deleted$ID=417A4819000F$Preserve=yes

 //----------------------------------------------------------------------------
 // This section contains orphaned code from deleted operations.
 //----------------------------------------------------------------------------

//$Section=Deleted$ID=417A4819000F$Preserve=no

//End of class---------------
}
