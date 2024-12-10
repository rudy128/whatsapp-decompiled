package X;

public enum C08 {
    STATIC("static"),
    ANIMATED("animated"),
    ANIMATED_WHILE_LOADING("animated_while_loading"),
    ANIMATED_WHILE_LOADED("animated_while_loaded"),
    DISABLED("disabled");
    
    public static final C08[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        C08[] c08Arr;
        C19820z3 A002 = C19780yz.A00(c08Arr);
        A01 = A002;
        A00 = (C08[]) A002.toArray(new C08[0]);
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C08(String str) {
        this.value = str;
    }
}
