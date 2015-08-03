package com.gkmohit.unknown.gameofchoice.Model;

/**
 * Created by gkmohit on 15-08-03.
 */
public class Choice {

    private String mText;
    private int mNextIndex;

    public Choice(String text, int nextIndex) {
        this.mText = text;
        this.mNextIndex = nextIndex;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextIndex() {
        return mNextIndex;
    }

    public void setNextIndex(int nextIndex) {
        mNextIndex = nextIndex;
    }
}
