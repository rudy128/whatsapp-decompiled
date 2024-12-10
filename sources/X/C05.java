package X;

public enum C05 {
    SAME_SIZE("same_size"),
    TOP_ROUNDED("top_rounded");
    
    public static final C05[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        C05[] c05Arr;
        C19820z3 A002 = C19780yz.A00(c05Arr);
        A01 = A002;
        A00 = (C05[]) A002.toArray(new C05[0]);
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C05(String str) {
        this.value = str;
    }
}
