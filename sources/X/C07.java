package X;

public enum C07 {
    AUTO("auto"),
    ENABLED("enabled"),
    DISABLED("disabled");
    
    public static final C07[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        C07[] c07Arr;
        C19820z3 A002 = C19780yz.A00(c07Arr);
        A01 = A002;
        A00 = (C07[]) A002.toArray(new C07[0]);
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C07(String str) {
        this.value = str;
    }
}
