package excel  ;

import com4j.*;

@IID("{00024455-0001-0000-C000-000000000046}")
public interface ICalculatedMember extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String getName();


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String getFormula();


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String getSourceName();


  /**
   * <p>
   * Getter method for the COM property "SolveOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int getSolveOrder();


  /**
   * <p>
   * Getter method for the COM property "IsValid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean getIsValid();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(15)
  @DefaultMethod
  java.lang.String get_Default();


  /**
   */

  @VTID(16)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type excel.XlCalculatedMemberType
   */

  @VTID(17)
  excel.XlCalculatedMemberType getType();


  // Properties:
}
