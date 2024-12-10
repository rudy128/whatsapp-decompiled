package X;

public enum C04 {
    TOP_LEFT("top_left"),
    TOP_RIGHT("top_right"),
    BOTTOM_LEFT("bottom_left"),
    BOTTOM_RIGHT("bottom_right");
    
    public final String mString;

    public String toString() {
        return this.mString;
    }

    /* access modifiers changed from: public */
    C04(String str) {
        this.mString = str;
    }
}
