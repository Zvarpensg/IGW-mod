package igwmod.gui;

public interface IWidged{
    public void renderBackground(GuiWiki gui, int mouseX, int mouseY);

    public void renderForeground(GuiWiki gui, int mouseX, int mouseY);

    public void setX(int x);

    public void setY(int y);

    public int getX();

    public int getY();
}
