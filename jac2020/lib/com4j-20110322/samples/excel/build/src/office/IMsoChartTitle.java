package office  ;

import com4j.*;

@IID("{000C170F-0000-0000-C000-000000000046}")
public interface IMsoChartTitle extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void setCaption(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String getCaption();


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.IMsoCharacters
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  office.IMsoCharacters getCharacters(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type office.ChartFont
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  office.ChartFont getFont();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void setHorizontalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object val);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHorizontalAlignment();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  double getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void setLeft(
    double pval);


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void setOrientation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object val);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getOrientation();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  boolean getShadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  void setShadow(
    boolean pval);


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  void setText(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String getText();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param pval Mandatory double parameter.
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(22)
  void setTop(
    double pval);


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  void setVerticalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object val);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getVerticalAlignment();


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  int getReadingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param pval Mandatory int parameter.
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(26)
  void setReadingOrder(
    int pval);


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  void setAutoScaleFont(
    @MarshalAs(NativeType.VARIANT) java.lang.Object val);


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getAutoScaleFont();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type office.IMsoInterior
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(29)
  office.IMsoInterior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type office.ChartFillFormat
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(30)
  office.ChartFillFormat getFill();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type office.IMsoBorder
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  office.IMsoBorder getBorder();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String getName();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "IncludeInLayout"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2418) //= 0x972. The runtime will prefer the VTID if present
  @VTID(36)
  boolean getIncludeInLayout();


  /**
   * <p>
   * Setter method for the COM property "IncludeInLayout"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2418) //= 0x972. The runtime will prefer the VTID if present
  @VTID(37)
  void setIncludeInLayout(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type office.XlChartElementPosition
   */

  @DISPID(1671) //= 0x687. The runtime will prefer the VTID if present
  @VTID(38)
  office.XlChartElementPosition getPosition();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param pval Mandatory office.XlChartElementPosition parameter.
   */

  @DISPID(1671) //= 0x687. The runtime will prefer the VTID if present
  @VTID(39)
  void setPosition(
    office.XlChartElementPosition pval);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type office.IMsoChartFormat
   */

  @DISPID(1610743841) //= 0x60020021. The runtime will prefer the VTID if present
  @VTID(40)
  office.IMsoChartFormat getFormat();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743842) //= 0x60020022. The runtime will prefer the VTID if present
  @VTID(41)
  double getHeight();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(43)
  int getCreator();


  // Properties:
}
