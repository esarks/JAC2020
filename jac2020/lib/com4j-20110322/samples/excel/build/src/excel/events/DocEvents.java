package excel.events;

import com4j.*;

@IID("{00024411-0000-0000-C000-000000000046}")
public abstract class DocEvents {
  // Methods:
  /**
   * @param target Mandatory excel.Range parameter.
   */

  @DISPID(1543)
  public void selectionChange(
    excel.Range target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1537)
  public void beforeDoubleClick(
    excel.Range target,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1534)
  public void beforeRightClick(
    excel.Range target,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(304)
  public void activate() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(1530)
  public void deactivate() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(279)
  public void calculate() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory excel.Range parameter.
   */

  @DISPID(1545)
  public void change(
    excel.Range target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory excel.Hyperlink parameter.
   */

  @DISPID(1470)
  public void followHyperlink(
    excel.Hyperlink target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2156)
  public void pivotTableUpdate(
    excel.PivotTable target) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
