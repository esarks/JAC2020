package excel  ;

import com4j.*;

@IID("{000C0398-0000-0000-C000-000000000046}")
public interface TextFrame2 extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "MarginBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  float getMarginBottom();


  /**
   * <p>
   * Setter method for the COM property "MarginBottom"
   * </p>
   * @param marginBottom Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void setMarginBottom(
    float marginBottom);


  /**
   * <p>
   * Getter method for the COM property "MarginLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  float getMarginLeft();


  /**
   * <p>
   * Setter method for the COM property "MarginLeft"
   * </p>
   * @param marginLeft Mandatory float parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void setMarginLeft(
    float marginLeft);


  /**
   * <p>
   * Getter method for the COM property "MarginRight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  float getMarginRight();


  /**
   * <p>
   * Setter method for the COM property "MarginRight"
   * </p>
   * @param marginRight Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void setMarginRight(
    float marginRight);


  /**
   * <p>
   * Getter method for the COM property "MarginTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  float getMarginTop();


  /**
   * <p>
   * Setter method for the COM property "MarginTop"
   * </p>
   * @param marginTop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void setMarginTop(
    float marginTop);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type office.MsoTextOrientation
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoTextOrientation getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param orientation Mandatory office.MsoTextOrientation parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void setOrientation(
    office.MsoTextOrientation orientation);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAnchor"
   * </p>
   * @return  Returns a value of type office.MsoHorizontalAnchor
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoHorizontalAnchor getHorizontalAnchor();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAnchor"
   * </p>
   * @param horizontalAnchor Mandatory office.MsoHorizontalAnchor parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void setHorizontalAnchor(
    office.MsoHorizontalAnchor horizontalAnchor);


  /**
   * <p>
   * Getter method for the COM property "VerticalAnchor"
   * </p>
   * @return  Returns a value of type office.MsoVerticalAnchor
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  office.MsoVerticalAnchor getVerticalAnchor();


  /**
   * <p>
   * Setter method for the COM property "VerticalAnchor"
   * </p>
   * @param verticalAnchor Mandatory office.MsoVerticalAnchor parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  void setVerticalAnchor(
    office.MsoVerticalAnchor verticalAnchor);


  /**
   * <p>
   * Getter method for the COM property "PathFormat"
   * </p>
   * @return  Returns a value of type office.MsoPathFormat
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoPathFormat getPathFormat();


  /**
   * <p>
   * Setter method for the COM property "PathFormat"
   * </p>
   * @param pathFormat Mandatory office.MsoPathFormat parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  void setPathFormat(
    office.MsoPathFormat pathFormat);


  /**
   * <p>
   * Getter method for the COM property "WarpFormat"
   * </p>
   * @return  Returns a value of type office.MsoWarpFormat
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoWarpFormat getWarpFormat();


  /**
   * <p>
   * Setter method for the COM property "WarpFormat"
   * </p>
   * @param warpFormat Mandatory office.MsoWarpFormat parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void setWarpFormat(
    office.MsoWarpFormat warpFormat);


  /**
   * <p>
   * Getter method for the COM property "WordArtformat"
   * </p>
   * @return  Returns a value of type office.MsoPresetTextEffect
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(28)
  office.MsoPresetTextEffect getWordArtformat();


  /**
   * <p>
   * Setter method for the COM property "WordArtformat"
   * </p>
   * @param wordArtformat Mandatory office.MsoPresetTextEffect parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  void setWordArtformat(
    office.MsoPresetTextEffect wordArtformat);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(30)
  office.MsoTriState getWordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param wordWrap Mandatory office.MsoTriState parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  void setWordWrap(
    office.MsoTriState wordWrap);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type office.MsoAutoSize
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  office.MsoAutoSize getAutoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param autoSize Mandatory office.MsoAutoSize parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  void setAutoSize(
    office.MsoAutoSize autoSize);


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type excel.ThreeDFormat
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(34)
  excel.ThreeDFormat getThreeD();


  /**
   * <p>
   * Getter method for the COM property "HasText"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(35)
  office.MsoTriState getHasText();


  /**
   * <p>
   * Getter method for the COM property "TextRange"
   * </p>
   * @return  Returns a value of type office.TextRange2
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(36)
  office.TextRange2 getTextRange();


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type office.TextColumn2
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(37)
  office.TextColumn2 getColumn();


  /**
   * <p>
   * Getter method for the COM property "Ruler"
   * </p>
   * @return  Returns a value of type office.Ruler2
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(38)
  office.Ruler2 getRuler();


  /**
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(39)
  void deleteText();


  // Properties:
}
