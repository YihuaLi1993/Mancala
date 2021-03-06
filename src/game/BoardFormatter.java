package game;

import java.awt.*;

public interface BoardFormatter {
    Shape formatPitShape();

    Shape formatMancalaShape();

    Shape formatStoneShape(int stoneNum, int stoneIndex);

    Color formatBoardColor();

    Color formatPitColor();

    Color formatStoneColor();

    int formatMancalaHeight();

    int formatMancalaWidth();

    int formatPitHeight();

    int formatPitWdith();
}