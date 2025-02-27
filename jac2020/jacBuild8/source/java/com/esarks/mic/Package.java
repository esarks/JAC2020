//$Section=License$ID=417A48220000$Preserve=no

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
//  Module Name: Package.script

//$Section=ChangeLog$ID=417A48220000$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=417A48220000$Preserve=no

package com.esarks.mic;

//$Section=ClassJavadoc$ID=417A48220000$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=417A48220000$Preserve=no
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

//$Section=CustomDeclare$ID=417A48220000$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=417A48220000$Preserve=no

public class Package extends com.esarks.mic.Model {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A48220000$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A48220000$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=417A48220000$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=417A48220000$Preserve=no
    public Package() {
//$Section=DefaultConstructor$ID=417A48220000$Preserve=yes
//$Section=DefaultConstructor$ID=417A48220000$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=417A48220000$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=417A48220000$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=417A48220000$Preserve=yes
//$Section=DefaultDestructor$ID=417A48220000$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=417A48220000$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=417A48220000$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=417A48220000$Preserve=yes
//$Section=DefaultFreeResources$ID=417A48220000$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=417E9FE8030D$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=417E9FE8030D$Preserve=no
    public Package( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Package.");
//$Section=Operation$ID=417E9FE8030D$Preserve=yes
        super(aScript);
//$Section=Operation$ID=417E9FE8030D$Preserve=no
    }

//$Section=OperationJavadoc$ID=417E4F150167$Preserve=yes
/**
 *
 * @param aMethod
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417E4F150167$Preserve=no
    public void loadHasElements( String aMethod ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Package.");
//$Section=Operation$ID=417E4F150167$Preserve=yes
  try {
    File lPackageDirectory = new File(path(getScriptPackage()));

    FileFilter lFileFilter = new FileFilter() {
      public boolean accept(File aFile) {
        if (aFile.isFile() && !aFile.isHidden() && aFile.getName().endsWith(".xml")) return true;
        if (aFile.isDirectory() && !aFile.isHidden()) {
          File lFindPackage = new File(path(getScriptPackage() + "." + aFile.getName() + "." + aFile.getName()) + ".xml");
          if (lFindPackage.isFile() && !lFindPackage.isHidden()) return true;
        }
        return false;
      }
    };

    File[] lXmlFiles = lPackageDirectory.listFiles(lFileFilter);
//ScriptWriter~~    <!mic.element:has!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).remove();

    for (int l=0; l < lXmlFiles.length; l++) {
      if (lXmlFiles[l].isDirectory()) {
//ScriptWriter~~        <!mic.element:has!>!set();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).set();
//ScriptWriter~~        <!mic.element:has:element!>!set("." + lXmlFiles[l].getName() + "." + lXmlFiles[l].getName());
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has:element")).set("." + lXmlFiles[l].getName() + "." + lXmlFiles[l].getName());
//ScriptWriter~~        <!mic.element:has:element:package!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has:element:package")).set("true");
        lXmlFiles[l] = null;
      }
    }

    for (int l=0; l < lXmlFiles.length; l++) {
      if (lXmlFiles[l] != null && !lXmlFiles[l].isDirectory()) {
        if (lXmlFiles[l].getName().compareTo(getScriptName() + ".xml") != 0) {
//ScriptWriter~~          <!mic.element:has!>!set();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).set();
//ScriptWriter~~          <!mic.element:has:element!>!set("." + lXmlFiles[l].getName().substring(0, lXmlFiles[l].getName().length() - 4));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has:element")).set("." + lXmlFiles[l].getName().substring(0, lXmlFiles[l].getName().length() - 4));
        }
      }
    }
    } catch (Throwable e) {System.out.println(e);}

    super.loadHasElements(aMethod);
//$Section=Operation$ID=417E4F150167$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=417A48220000$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A48220000$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A48220000$Preserve=no

//End of class---------------
}
