/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2020, Arnaud Roques
 *
 * Project Info:  http://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 * 
 * http://plantuml.com/patreon (only 1$ per month!)
 * http://plantuml.com/paypal
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 *
 * Original Author:  Arnaud Roques
 * 
 *
 */
package net.sourceforge.plantuml.skin.rose;

import net.sourceforge.plantuml.AlignmentParam;
import net.sourceforge.plantuml.ColorParam;
import net.sourceforge.plantuml.CornerParam;
import net.sourceforge.plantuml.FontParam;
import net.sourceforge.plantuml.ISkinParam;
import net.sourceforge.plantuml.LineParam;
import net.sourceforge.plantuml.PaddingParam;
import net.sourceforge.plantuml.SkinParam;
import net.sourceforge.plantuml.SkinParamUtils;
import net.sourceforge.plantuml.cucadiagram.Display;
import net.sourceforge.plantuml.cucadiagram.Stereotype;
import net.sourceforge.plantuml.graphic.FontConfiguration;
import net.sourceforge.plantuml.graphic.HorizontalAlignment;
import net.sourceforge.plantuml.graphic.HtmlColor;
import net.sourceforge.plantuml.graphic.SkinParameter;
import net.sourceforge.plantuml.graphic.SymbolContext;
import net.sourceforge.plantuml.skin.ArrowComponent;
import net.sourceforge.plantuml.skin.ArrowConfiguration;
import net.sourceforge.plantuml.skin.ArrowDirection;
import net.sourceforge.plantuml.skin.Component;
import net.sourceforge.plantuml.skin.ComponentType;
import net.sourceforge.plantuml.style.PName;
import net.sourceforge.plantuml.style.SName;
import net.sourceforge.plantuml.style.Style;
import net.sourceforge.plantuml.style.StyleSignature;
import net.sourceforge.plantuml.ugraphic.UFont;
import net.sourceforge.plantuml.ugraphic.UStroke;

public class Rose {

	final private double paddingX = 5;
	final private double paddingY = 5;

	public HtmlColor getFontColor(ISkinParam skin, FontParam fontParam) {
		return skin.getFontHtmlColor(null, fontParam);
	}

	public HtmlColor getHtmlColor(ISkinParam skin, ColorParam color) {
		return getHtmlColor(skin, null, color);
	}

	public HtmlColor getHtmlColor(ISkinParam skin, Stereotype stereotype, ColorParam... colorParams) {
		for (ColorParam param : colorParams) {
			final HtmlColor result = skin.getHtmlColor(param, stereotype, false);
			if (result != null) {
				return result;
			}
		}
		return colorParams[0].getDefaultValue();
	}

	private FontConfiguration getUFont2(ISkinParam skinParam, FontParam fontParam) {
		return new FontConfiguration(skinParam, fontParam, null);
	}

	public Component createComponent(Style[] styles, ComponentType type, ArrowConfiguration config, ISkinParam param,
			Display stringsToDisplay) {
		final UFont fontGrouping = param.getFont(null, false, FontParam.SEQUENCE_GROUP);

		final UFont newFontForStereotype = param.getFont(null, false, FontParam.SEQUENCE_STEREOTYPE);

		if (type.isArrow()) {
			return createComponentArrow(null, config, param, stringsToDisplay);
		}
		final double padding = param.getPadding(PaddingParam.PARTICIPANT);
		final double roundCorner = param.getRoundCorner(CornerParam.DEFAULT, null);
		if (type == ComponentType.PARTICIPANT_HEAD) {
			return new ComponentRoseParticipant(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.participantBorder), getUFont2(param, FontParam.PARTICIPANT),
					stringsToDisplay, param, roundCorner, newFontForStereotype, getFontColor(param,
							FontParam.SEQUENCE_STEREOTYPE), param.minClassWidth(), false, padding);
		}
		if (type == ComponentType.PARTICIPANT_TAIL) {
			return new ComponentRoseParticipant(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.participantBorder), getUFont2(param, FontParam.PARTICIPANT),
					stringsToDisplay, param, roundCorner, newFontForStereotype, getFontColor(param,
							FontParam.SEQUENCE_STEREOTYPE), param.minClassWidth(), false, padding);
		}
		if (type == ComponentType.COLLECTIONS_HEAD) {
			return new ComponentRoseParticipant(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.collectionsBorder), getUFont2(param, FontParam.PARTICIPANT),
					stringsToDisplay, param, roundCorner, newFontForStereotype, getFontColor(param,
							FontParam.SEQUENCE_STEREOTYPE), param.minClassWidth(), true, padding);
		}
		if (type == ComponentType.COLLECTIONS_TAIL) {
			return new ComponentRoseParticipant(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.collectionsBorder), getUFont2(param, FontParam.PARTICIPANT),
					stringsToDisplay, param, roundCorner, newFontForStereotype, getFontColor(param,
							FontParam.SEQUENCE_STEREOTYPE), param.minClassWidth(), true, padding);
		}
		if (type == ComponentType.PARTICIPANT_LINE) {
			final HtmlColor borderColor = getHtmlColor(param, ColorParam.sequenceLifeLineBorder);
			return new ComponentRoseLine(styles == null ? null : styles[0], borderColor, false, getStroke(param,
					LineParam.sequenceLifeLineBorder, 1), param.getIHtmlColorSet());
		}
		if (type == ComponentType.CONTINUE_LINE) {
			final HtmlColor borderColor = getHtmlColor(param, ColorParam.sequenceLifeLineBorder);
			return new ComponentRoseLine(styles == null ? null : styles[0], borderColor, true, getStroke(param,
					LineParam.sequenceLifeLineBorder, 1.5), param.getIHtmlColorSet());
		}
		if (type == ComponentType.ACTOR_HEAD) {
			return new ComponentRoseActor(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.actorBorder), getUFont2(param, FontParam.ACTOR),
					stringsToDisplay, true, param, newFontForStereotype, getFontColor(param,
							FontParam.SEQUENCE_STEREOTYPE));
		}
		if (type == ComponentType.ACTOR_TAIL) {
			return new ComponentRoseActor(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.actorBorder), getUFont2(param, FontParam.ACTOR),
					stringsToDisplay, false, param, newFontForStereotype, getFontColor(param,
							FontParam.SEQUENCE_STEREOTYPE));
		}
		if (type == ComponentType.BOUNDARY_HEAD) {
			return new ComponentRoseBoundary(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.boundaryBorder), getUFont2(param, FontParam.BOUNDARY),
					stringsToDisplay, true, param, newFontForStereotype, getFontColor(param,
							FontParam.BOUNDARY_STEREOTYPE));
		}
		if (type == ComponentType.BOUNDARY_TAIL) {
			return new ComponentRoseBoundary(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.boundaryBorder), getUFont2(param, FontParam.BOUNDARY),
					stringsToDisplay, false, param, newFontForStereotype, getFontColor(param,
							FontParam.BOUNDARY_STEREOTYPE));
		}
		if (type == ComponentType.CONTROL_HEAD) {
			return new ComponentRoseControl(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.controlBorder), getUFont2(param, FontParam.CONTROL),
					stringsToDisplay, true, param, newFontForStereotype, getFontColor(param,
							FontParam.CONTROL_STEREOTYPE));
		}
		if (type == ComponentType.CONTROL_TAIL) {
			return new ComponentRoseControl(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.controlBorder), getUFont2(param, FontParam.CONTROL),
					stringsToDisplay, false, param, newFontForStereotype, getFontColor(param,
							FontParam.CONTROL_STEREOTYPE));
		}
		if (type == ComponentType.ENTITY_HEAD) {
			return new ComponentRoseEntity(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.entityBorder), getUFont2(param, FontParam.ENTITY),
					stringsToDisplay, true, param, newFontForStereotype, getFontColor(param,
							FontParam.ENTITY_STEREOTYPE));
		}
		if (type == ComponentType.ENTITY_TAIL) {
			return new ComponentRoseEntity(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.entityBorder), getUFont2(param, FontParam.ENTITY),
					stringsToDisplay, false, param, newFontForStereotype, getFontColor(param,
							FontParam.ENTITY_STEREOTYPE));
		}
		if (type == ComponentType.QUEUE_HEAD) {
			return new ComponentRoseQueue(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.entityBorder), getUFont2(param, FontParam.QUEUE),
					stringsToDisplay, true, param, newFontForStereotype,
					getFontColor(param, FontParam.QUEUE_STEREOTYPE));
		}
		if (type == ComponentType.QUEUE_TAIL) {
			return new ComponentRoseQueue(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.entityBorder), getUFont2(param, FontParam.QUEUE),
					stringsToDisplay, false, param, newFontForStereotype, getFontColor(param,
							FontParam.QUEUE_STEREOTYPE));
		}
		if (type == ComponentType.DATABASE_HEAD) {
			return new ComponentRoseDatabase(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.databaseBorder), getUFont2(param, FontParam.DATABASE),
					stringsToDisplay, true, param, newFontForStereotype, getFontColor(param,
							FontParam.DATABASE_STEREOTYPE));
		}
		if (type == ComponentType.DATABASE_TAIL) {
			return new ComponentRoseDatabase(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getSymbolContext(param, ColorParam.databaseBorder), getUFont2(param, FontParam.DATABASE),
					stringsToDisplay, false, param, newFontForStereotype, getFontColor(param,
							FontParam.DATABASE_STEREOTYPE));
		}
		if (type == ComponentType.NOTE) {
			final HorizontalAlignment alignment = param.getHorizontalAlignment(AlignmentParam.noteTextAlignment, null,
					false);
			return new ComponentRoseNote(styles == null ? null : styles[0], getSymbolContext(param,
					ColorParam.noteBorder), getUFont2(param, FontParam.NOTE), stringsToDisplay, paddingX, paddingY,
					param, roundCorner, alignment);
		}
		if (type == ComponentType.NOTE_HEXAGONAL) {
			final HorizontalAlignment alignment = param.getHorizontalAlignment(AlignmentParam.noteTextAlignment, null,
					false);
			return new ComponentRoseNoteHexagonal(styles == null ? null : styles[0], getSymbolContext(param,
					ColorParam.noteBorder), getUFont2(param, FontParam.NOTE), stringsToDisplay, param, alignment);
		}
		if (type == ComponentType.NOTE_BOX) {
			final HorizontalAlignment alignment = param.getHorizontalAlignment(AlignmentParam.noteTextAlignment, null,
					false);
			return new ComponentRoseNoteBox(styles == null ? null : styles[0], getSymbolContext(param,
					ColorParam.noteBorder), getUFont2(param, FontParam.NOTE), stringsToDisplay, param, roundCorner,
					alignment);
		}
		final FontConfiguration bigFont = getUFont2(param, FontParam.SEQUENCE_GROUP_HEADER);
		if (type == ComponentType.GROUPING_HEADER) {
			FontConfiguration smallFont = bigFont.forceFont(fontGrouping, null);
			final HtmlColor smallColor = SkinParamUtils.getFontColor(param, FontParam.SEQUENCE_GROUP, null);
			if (smallColor != null) {
				smallFont = smallFont.changeColor(smallColor);
			}
			return new ComponentRoseGroupingHeader(styles == null ? null : styles[0],
					styles == null ? null : styles[1], param.getBackgroundColor(), getSymbolContext(param,
							ColorParam.sequenceGroupBorder), bigFont, smallFont, stringsToDisplay, param, roundCorner);
		}
		if (type == ComponentType.GROUPING_ELSE) {
			return new ComponentRoseGroupingElse(styles == null ? null : styles[0], getHtmlColor(param,
					ColorParam.sequenceGroupBorder), getUFont2(param, FontParam.SEQUENCE_GROUP),
					stringsToDisplay.get(0), param, param.getBackgroundColor());
		}
		if (type == ComponentType.GROUPING_SPACE) {
			return new ComponentRoseGroupingSpace(7);
		}
		if (type == ComponentType.ALIVE_BOX_CLOSE_CLOSE) {
			return new ComponentRoseActiveLine(styles == null ? null : styles[0], getSymbolContext(param,
					ColorParam.sequenceLifeLineBorder), true, true, param.getIHtmlColorSet());
		}
		if (type == ComponentType.ALIVE_BOX_CLOSE_OPEN) {
			return new ComponentRoseActiveLine(styles == null ? null : styles[0], getSymbolContext(param,
					ColorParam.sequenceLifeLineBorder), true, false, param.getIHtmlColorSet());
		}
		if (type == ComponentType.ALIVE_BOX_OPEN_CLOSE) {
			return new ComponentRoseActiveLine(styles == null ? null : styles[0], getSymbolContext(param,
					ColorParam.sequenceLifeLineBorder), false, true, param.getIHtmlColorSet());
		}
		if (type == ComponentType.ALIVE_BOX_OPEN_OPEN) {
			return new ComponentRoseActiveLine(styles == null ? null : styles[0], getSymbolContext(param,
					ColorParam.sequenceLifeLineBorder), false, false, param.getIHtmlColorSet());
		}
		if (type == ComponentType.DELAY_LINE) {
			return new ComponentRoseDelayLine(null, getHtmlColor(param, ColorParam.sequenceLifeLineBorder));
		}
		if (type == ComponentType.DELAY_TEXT) {
			return new ComponentRoseDelayText(styles == null ? null : styles[0], getUFont2(param,
					FontParam.SEQUENCE_DELAY), stringsToDisplay, param);
		}
		if (type == ComponentType.DESTROY) {
			return new ComponentRoseDestroy(null, getHtmlColor(param, ColorParam.sequenceLifeLineBorder));
		}
		if (type == ComponentType.NEWPAGE) {
			throw new UnsupportedOperationException();
		}
		if (type == ComponentType.DIVIDER) {
			return new ComponentRoseDivider(styles == null ? null : styles[0], getUFont2(param,
					FontParam.SEQUENCE_DIVIDER), getHtmlColor(param, ColorParam.sequenceDividerBackground),
					stringsToDisplay, param, deltaShadow(param, ColorParam.sequenceDividerBackground) > 0, getStroke(
							param, LineParam.sequenceDividerBorder, 2), getHtmlColor(param,
							ColorParam.sequenceDividerBorder));
		}
		if (type == ComponentType.REFERENCE) {
			return new ComponentRoseReference(styles == null ? null : styles[0], styles == null ? null : styles[1],
					getUFont2(param, FontParam.SEQUENCE_REFERENCE), getSymbolContext(param,
							ColorParam.sequenceReferenceBorder), bigFont, stringsToDisplay,
					param.getHorizontalAlignment(AlignmentParam.sequenceReferenceAlignment, null, false), param,
					getHtmlColor(param, ColorParam.sequenceReferenceBackground));
		}
		if (type == ComponentType.ENGLOBER) {
			return new ComponentRoseEnglober(styles == null ? null : styles[0], getSymbolContext(param,
					ColorParam.sequenceBoxBorder), stringsToDisplay, getUFont2(param, FontParam.SEQUENCE_BOX), param,
					roundCorner);
		}

		return null;
	}

	public ComponentRoseNewpage createComponentNewPage(ISkinParam param) {
		return new ComponentRoseNewpage(null, getHtmlColor(param, ColorParam.sequenceNewpageSeparator));
	}

	public ArrowComponent createComponentArrow(Style[] styles, ArrowConfiguration config, ISkinParam param,
			Display stringsToDisplay) {
		final HtmlColor sequenceArrow = config.getColor() == null ? getHtmlColor(param, ColorParam.arrow) : config
				.getColor();
		if (config.getArrowDirection() == ArrowDirection.SELF) {
			return new ComponentRoseSelfArrow(styles == null ? null : styles[0], sequenceArrow, getUFont2(param,
					FontParam.ARROW), stringsToDisplay, config, param, param.maxMessageSize(),
					param.strictUmlStyle() == false);
		}
		HorizontalAlignment messageHorizontalAlignment;
		final HorizontalAlignment textHorizontalAlignment;
		final ArrowDirection arrowDirection = config.getArrowDirection();
		if (SkinParam.USE_STYLES()) {
			final StyleSignature signature = StyleSignature.of(SName.root, SName.element, SName.sequenceDiagram,
					SName.arrow);
			final Style textStyle = signature.getMergedStyle(param.getCurrentStyleBuilder());
			final String value = textStyle.value(PName.HorizontalAlignment).asString();
			messageHorizontalAlignment = textStyle.getHorizontalAlignment();
			textHorizontalAlignment = textStyle.getHorizontalAlignment();
			if ("direction".equalsIgnoreCase(value)) {
				if (arrowDirection == ArrowDirection.LEFT_TO_RIGHT_NORMAL) {
					messageHorizontalAlignment = HorizontalAlignment.LEFT;
				} else if (arrowDirection == ArrowDirection.RIGHT_TO_LEFT_REVERSE) {
					messageHorizontalAlignment = HorizontalAlignment.RIGHT;
				} else if (arrowDirection == ArrowDirection.BOTH_DIRECTION) {
					messageHorizontalAlignment = HorizontalAlignment.CENTER;
				}
			} else if ("reversedirection".equalsIgnoreCase(value)) {
				if (arrowDirection == ArrowDirection.LEFT_TO_RIGHT_NORMAL) {
					messageHorizontalAlignment = HorizontalAlignment.RIGHT;
				} else if (arrowDirection == ArrowDirection.RIGHT_TO_LEFT_REVERSE) {
					messageHorizontalAlignment = HorizontalAlignment.LEFT;
				} else if (arrowDirection == ArrowDirection.BOTH_DIRECTION) {
					messageHorizontalAlignment = HorizontalAlignment.CENTER;
				}
			}
		} else {
			messageHorizontalAlignment = param.getHorizontalAlignment(AlignmentParam.sequenceMessageAlignment,
					arrowDirection, config.isReverseDefine());
			textHorizontalAlignment = param.getHorizontalAlignment(AlignmentParam.sequenceMessageTextAlignment,
					config.getArrowDirection(), false);
		}
		return new ComponentRoseArrow(styles == null ? null : styles[0], sequenceArrow, getUFont2(param,
				FontParam.ARROW), stringsToDisplay, config, messageHorizontalAlignment, param, textHorizontalAlignment,
				param.maxMessageSize(), param.strictUmlStyle() == false, param.responseMessageBelowArrow());
	}

	private double deltaShadow(ISkinParam param, ColorParam color) {
		SkinParameter skinParameter = null;
		if (color == ColorParam.participantBorder) {
			skinParameter = SkinParameter.PARTICIPANT;
		} else if (color == ColorParam.actorBorder) {
			skinParameter = SkinParameter.ACTOR;
		}
		final boolean result = skinParameter == null ? param.shadowing(null) : param.shadowing2(null, skinParameter);
		return result ? 4.0 : 0;
	}

	private SymbolContext getSymbolContext(ISkinParam skin, ColorParam color) {
		if (color == ColorParam.participantBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.participantBackground), getHtmlColor(skin,
					ColorParam.participantBorder))
					.withStroke(getStroke(skin, LineParam.sequenceParticipantBorder, 1.5)).withDeltaShadow(
							deltaShadow(skin, color));
		}
		if (color == ColorParam.actorBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.actorBackground), getHtmlColor(skin,
					ColorParam.actorBorder)).withStroke(getStroke(skin, LineParam.sequenceActorBorder, 2))
					.withDeltaShadow(deltaShadow(skin, color));
		}
		if (color == ColorParam.boundaryBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.boundaryBackground), getHtmlColor(skin,
					ColorParam.boundaryBorder)).withStroke(getStroke(skin, LineParam.sequenceActorBorder, 2))
					.withDeltaShadow(deltaShadow(skin, color));
		}
		if (color == ColorParam.controlBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.controlBackground), getHtmlColor(skin,
					ColorParam.controlBorder)).withStroke(getStroke(skin, LineParam.sequenceActorBorder, 2))
					.withDeltaShadow(deltaShadow(skin, color));
		}
		if (color == ColorParam.collectionsBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.collectionsBackground), getHtmlColor(skin,
					ColorParam.collectionsBorder)).withStroke(getStroke(skin, LineParam.sequenceActorBorder, 1.5))
					.withDeltaShadow(deltaShadow(skin, color));
		}
		if (color == ColorParam.entityBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.entityBackground), getHtmlColor(skin,
					ColorParam.entityBorder)).withStroke(getStroke(skin, LineParam.sequenceActorBorder, 2))
					.withDeltaShadow(deltaShadow(skin, color));
		}
		if (color == ColorParam.databaseBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.databaseBackground), getHtmlColor(skin,
					ColorParam.databaseBorder)).withStroke(getStroke(skin, LineParam.sequenceActorBorder, 2))
					.withDeltaShadow(deltaShadow(skin, color));
		}
		if (color == ColorParam.sequenceLifeLineBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.sequenceLifeLineBackground), getHtmlColor(skin,
					ColorParam.sequenceLifeLineBorder)).withDeltaShadow(deltaShadow(skin, color));
		}
		if (color == ColorParam.noteBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.noteBackground), getHtmlColor(skin,
					ColorParam.noteBorder)).withStroke(getStroke(skin, LineParam.noteBorder, 1)).withDeltaShadow(
					deltaShadow(skin, color));
		}
		if (color == ColorParam.sequenceGroupBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.sequenceGroupBackground), getHtmlColor(skin,
					ColorParam.sequenceGroupBorder)).withStroke(getStroke(skin, LineParam.sequenceGroupBorder, 2))
					.withDeltaShadow(deltaShadow(skin, color));
		}
		if (color == ColorParam.sequenceBoxBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.sequenceBoxBackground), getHtmlColor(skin,
					ColorParam.sequenceBoxBorder));
		}
		if (color == ColorParam.sequenceReferenceBorder) {
			return new SymbolContext(getHtmlColor(skin, ColorParam.sequenceReferenceHeaderBackground), getHtmlColor(
					skin, ColorParam.sequenceReferenceBorder)).withStroke(
					getStroke(skin, LineParam.sequenceReferenceBorder, 2)).withDeltaShadow(deltaShadow(skin, color));
		}
		throw new IllegalArgumentException();
	}

	static public UStroke getStroke(ISkinParam param, LineParam lineParam, double defaultValue) {
		final UStroke result = param.getThickness(lineParam, null);
		if (result == null) {
			return new UStroke(defaultValue);
		}
		return result;
	}

}
