package excel  ;

import com4j.*;

@IID("{00024471-0001-0000-C000-000000000046}")
public interface IListObject extends Com4jObject {
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
   */

  @VTID(10)
  void delete();


  /**
   * @param target Mandatory java.lang.Object parameter.
   * @param linkSource Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String publish(
    @MarshalAs(NativeType.VARIANT) java.lang.Object target,
    boolean linkSource);


  /**
   */

  @VTID(12)
  void refresh();


  /**
   */

  @VTID(13)
  void unlink();


  /**
   */

  @VTID(14)
  void unlist();


  /**
   * @param iConflictType Optional parameter. Default value is 0
   */

  @VTID(15)
  void updateChanges(
    @Optional @DefaultValue("0") excel.XlListConflict iConflictType);


  /**
   * @param range Mandatory excel.Range parameter.
   */

  @VTID(16)
  void resize(
    excel.Range range);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(17)
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean getActive();


  /**
   * <p>
   * Getter method for the COM property "DataBodyRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(19)
  excel.Range getDataBodyRange();


  /**
   * <p>
   * Getter method for the COM property "DisplayRightToLeft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean getDisplayRightToLeft();


  /**
   * <p>
   * Getter method for the COM property "HeaderRowRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(21)
  excel.Range getHeaderRowRange();


  /**
   * <p>
   * Getter method for the COM property "InsertRowRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(22)
  excel.Range getInsertRowRange();


  /**
   * <p>
   * Getter method for the COM property "ListColumns"
   * </p>
   * @return  Returns a value of type excel.ListColumns
   */

  @VTID(23)
  excel.ListColumns getListColumns();


  /**
   * <p>
   * Getter method for the COM property "ListRows"
   * </p>
   * @return  Returns a value of type excel.ListRows
   */

  @VTID(24)
  excel.ListRows getListRows();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "QueryTable"
   * </p>
   * @return  Returns a value of type excel._QueryTable
   */

  @VTID(27)
  excel._QueryTable getQueryTable();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(28)
  excel.Range getRange();


  /**
   * <p>
   * Getter method for the COM property "ShowAutoFilter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(29)
  boolean getShowAutoFilter();


  /**
   * <p>
   * Setter method for the COM property "ShowAutoFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(30)
  void setShowAutoFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTotals"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean getShowTotals();


  /**
   * <p>
   * Setter method for the COM property "ShowTotals"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void setShowTotals(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   * @return  Returns a value of type excel.XlListObjectSourceType
   */

  @VTID(33)
  excel.XlListObjectSourceType getSourceType();


  /**
   * <p>
   * Getter method for the COM property "TotalsRowRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(34)
  excel.Range getTotalsRowRange();


  /**
   * <p>
   * Getter method for the COM property "SharePointURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(35)
  java.lang.String getSharePointURL();


  /**
   * <p>
   * Getter method for the COM property "XmlMap"
   * </p>
   * @return  Returns a value of type excel.XmlMap
   */

  @VTID(36)
  excel.XmlMap getXmlMap();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(37)
  java.lang.String getDisplayName();


  /**
   * <p>
   * Setter method for the COM property "DisplayName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(38)
  void setDisplayName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowHeaders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(39)
  boolean getShowHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(40)
  void setShowHeaders(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFilter"
   * </p>
   * @return  Returns a value of type excel.AutoFilter
   */

  @VTID(41)
  excel.AutoFilter getAutoFilter();


  /**
   * <p>
   * Getter method for the COM property "TableStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getTableStyle();


  /**
   * <p>
   * Setter method for the COM property "TableStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(43)
  void setTableStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleFirstColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(44)
  boolean getShowTableStyleFirstColumn();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleFirstColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(45)
  void setShowTableStyleFirstColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(46)
  boolean getShowTableStyleLastColumn();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(47)
  void setShowTableStyleLastColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(48)
  boolean getShowTableStyleRowStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(49)
  void setShowTableStyleRowStripes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(50)
  boolean getShowTableStyleColumnStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(51)
  void setShowTableStyleColumnStripes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   * @return  Returns a value of type excel.Sort
   */

  @VTID(52)
  excel.Sort getSort();


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(53)
  java.lang.String getComment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(54)
  void setComment(
    java.lang.String rhs);


  /**
   */

  @VTID(55)
  void exportToVisio();


  // Properties:
}
