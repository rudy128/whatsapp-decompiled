package X;

import java.util.regex.Pattern;

public class A4I {
    public static final String A0A;
    public static final Pattern A0B = Pattern.compile("[#0,.-]+");
    public String A00;
    public String A01;
    public final C185829dD A02;
    public final C199219zd A03;
    public final C199219zd A04;
    public final C199219zd A05;
    public final C199219zd A06;
    public final A2Z A07;
    public final String A08;
    public final String A09;

    public static String A00(C186689eb r5, A4I a4i, String str) {
        String replaceFirst;
        String str2;
        if (r5.A03) {
            replaceFirst = r5.A01;
            str2 = A0B.matcher(r5.A02).replaceFirst(str);
        } else {
            replaceFirst = A0B.matcher(r5.A01).replaceFirst(str);
            str2 = r5.A02;
        }
        if (!replaceFirst.isEmpty() && a4i.A06.A00(replaceFirst.codePointBefore(replaceFirst.length())) && a4i.A05.A00(a4i.A01.codePointAt(0))) {
            replaceFirst = AnonymousClass000.A0y(a4i.A09, AnonymousClass000.A11(replaceFirst));
        }
        if (!str2.isEmpty() && a4i.A04.A00(str2.codePointAt(0))) {
            C199219zd r2 = a4i.A03;
            String str3 = a4i.A01;
            if (r2.A00(str3.codePointBefore(str3.length()))) {
                str2 = AnonymousClass001.A1H(a4i.A08, str2, AnonymousClass000.A10());
            }
        }
        return AnonymousClass001.A1H(a4i.A01, str2, AnonymousClass000.A11(replaceFirst));
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("¤");
        A10.append(C19620yd.A08);
        A0A = AnonymousClass000.A0y("#,##0.00", A10);
    }

    public A4I(C185829dD r3, A2Z a2z, C18000vb r5) {
        this.A02 = r3;
        this.A07 = a2z;
        if (r3.A02) {
            boolean z = C199219zd.A03;
            this.A05 = new C199219zd(r5.A08(9));
            this.A06 = new C199219zd(r5.A08(11));
            this.A09 = r5.A08(10);
            this.A03 = new C199219zd(r5.A08(6));
            this.A04 = new C199219zd(r5.A08(8));
            this.A08 = r5.A08(7);
            return;
        }
        C199219zd r0 = C199219zd.A02;
        this.A04 = r0;
        this.A03 = r0;
        this.A06 = r0;
        this.A05 = r0;
        this.A08 = "";
        this.A09 = "";
    }
}
