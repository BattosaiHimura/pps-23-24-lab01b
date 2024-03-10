package e2.layout;

import e2.Pair;

public class CellImpl implements Cell {

    private boolean isEnabled;
    private boolean isMarked;
    private String text;
    private Pair<Integer, Integer> position;

    public CellImpl(Pair<Integer, Integer> position) {
        this.isEnabled = true;
        this.isMarked = false;
        this.text = "";
        this.position = position;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }

    @Override
    public boolean isMarked() {
        return this.isMarked;
    }

    @Override
    public void setMarked(boolean marked) {
        this.isMarked = marked;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Pair<Integer, Integer> getPosition() {
        return this.position;
    }

}
