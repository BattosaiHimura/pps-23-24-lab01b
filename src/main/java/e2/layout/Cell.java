package e2.layout;

import e2.Pair;

public interface Cell {

    public boolean isEnabled();

    public void setEnabled(boolean enabled);

    public boolean isMarked();

    public void setMarked(boolean marked);

    public String getText();

    public void setText(String text);

    public Pair<Integer, Integer> getPosition();
}
