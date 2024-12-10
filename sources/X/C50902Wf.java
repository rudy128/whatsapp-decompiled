package X;

/* renamed from: X.2Wf  reason: invalid class name and case insensitive filesystem */
public abstract class C50902Wf {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String[] strArr = C50772Vs.A00;
        A10.append(C43501zu.A00(", ", strArr));
        A10.append(" FROM ");
        String A0Y = C17890vO.A0Y("methods", A10);
        A00 = AnonymousClass000.A0y("credential_id = ?", A10);
        StringBuilder A11 = AnonymousClass000.A11("SELECT ");
        C17890vO.A10(C43501zu.A00(", ", strArr), " FROM ", "methods", A11);
        A11.append(" ORDER BY ");
        A03 = AnonymousClass000.A0y("debit_mode DESC", A11);
        StringBuilder A112 = AnonymousClass000.A11("SELECT ");
        C17900vP.A0c(C43501zu.A00(", ", strArr), " FROM ", "methods", A0Y, A112);
        C17890vO.A10("type != ? AND type != ?", " ORDER BY ", "debit_mode DESC", A112);
        A02 = A112.toString();
        StringBuilder A113 = AnonymousClass000.A11("SELECT ");
        C17900vP.A0c(C43501zu.A00(", ", strArr), " FROM ", "methods", A0Y, A113);
        A01 = AnonymousClass000.A0y("type = ?", A113);
    }
}
