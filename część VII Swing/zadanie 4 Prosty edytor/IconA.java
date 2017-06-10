package zad4;

import javax.swing.*;
import java.awt.*;

public class IconA implements Icon {
    private int width = 10;
    private int height = 10;
    private Color color;

    public IconA(Color color) {
        this.color = color;
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Color temp = g.getColor();
        g.setColor(color);
        g.fillOval(x, y, getIconWidth(), getIconHeight());
        g.setColor(temp);
    }
    @Override
    public int getIconWidth() {
        return width;
    }
    @Override
    public int getIconHeight() {
        return height;
    }
}
