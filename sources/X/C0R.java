package X;

public enum C0R {
    ;
    
    public final String fileName;

    public static C0R A00(String str, String str2, int i) {
        return new C0R(str, i, str2);
    }

    public static String A01(C0L c0l, String str, StringBuilder sb) {
        sb.append(c0l.id);
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: public */
    static {
        C0R[] c0rArr;
        A00 = C19780yz.A00(c0rArr);
    }

    /* access modifiers changed from: public */
    C0R(String str) {
        this.fileName = str;
    }
}
