package com.gkmohit.unknown.gameofchoice.Model;

/**
 * Created by gkmohit on 15-08-03.
 */
public class Page {

    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice1, Choice choice2) {
        this.mImageId = imageId;
        this.mText = text;
        this.mChoice1 = choice1;
        this.mChoice2 = choice2;
    }


    public Page(int imageId, String text) {
        this.mImageId = imageId;
        this.mText = text;
        this.mChoice1 = null;
        this.mChoice2 = null;
        this.mIsFinal = true;

    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.mIsFinal = isFinal;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
