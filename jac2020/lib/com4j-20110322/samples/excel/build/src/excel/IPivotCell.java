package excel  ;

import com4j.*;

@IID("{00024458-0001-0000-C000-000000000046}")
public interface IPivotCell extends Com4jObject {
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
   * Getter method for the COM property "PivotCellType"
   * </p>
   * @return  Returns a value of type excel.XlPivotCellType
   */

  @VTID(10)
  excel.XlPivotCellType getPivotCellType();


  /**
   * <p>
   * Getter method for the COM property "PivotTable"
   * </p>
   * @return  Returns a value of type excel.PivotTable
   */

  @VTID(11)
  excel.PivotTable getPivotTable();


  /**
   * <p>
   * Getter method for the COM property "DataField"
   * </p>
   * @return  Returns a value of type excel.PivotField
   */

  @VTID(12)
  excel.PivotField getDataField();


  /**
   * <p>
   * Getter method for the COM property "PivotField"
   * </p>
   * @return  Returns a value of type excel.PivotField
   */

  @VTID(13)
  excel.PivotField getPivotField();


  /**
   * <p>
   * Getter method for the COM property "PivotItem"
   * </p>
   * @return  Returns a value of type excel.PivotItem
   */

  @VTID(14)
  excel.PivotItem getPivotItem();


  /**
   * <p>
   * Getter method for the COM property "RowItems"
   * </p>
   * @return  Returns a value of type excel.PivotItemList
   */

  @VTID(15)
  excel.PivotItemList getRowItems();


  /**
   * <p>
   * Getter method for the COM property "ColumnItems"
   * </p>
   * @return  Returns a value of type excel.PivotItemList
   */

  @VTID(16)
  excel.PivotItemList getColumnItems();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(17)
  excel.Range getRange();


  /**
   * <p>
   * Getter method for the COM property "Dummy18"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(18)
  java.lang.String getDummy18();


  /**
   * <p>
   * Getter method for the COM property "CustomSubtotalFunction"
   * </p>
   * @return  Returns a value of type excel.XlConsolidationFunction
   */

  @VTID(19)
  excel.XlConsolidationFunction getCustomSubtotalFunction();


  /**
   * <p>
   * Getter method for the COM property "PivotRowLine"
   * </p>
   * @return  Returns a value of type excel.PivotLine
   */

  @VTID(20)
  excel.PivotLine getPivotRowLine();


  /**
   * <p>
   * Getter method for the COM property "PivotColumnLine"
   * </p>
   * @return  Returns a value of type excel.PivotLine
   */

  @VTID(21)
  excel.PivotLine getPivotColumnLine();


  // Properties:
}
