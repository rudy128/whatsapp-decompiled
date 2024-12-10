package X;

public enum C06 {
    AUTO("auto"),
    ENABLED("enabled");
    
    public static final C06[] A00 = null;
    public final String value;

    /* access modifiers changed from: public */
    static {
        C06[] c06Arr;
        C19820z3 A002 = C19780yz.A00(c06Arr);
        A01 = A002;
        A00 = (C06[]) A002.toArray(new C06[0]);
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C06(String str) {
        this.value = str;
    }
}
