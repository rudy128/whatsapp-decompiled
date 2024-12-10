package X;

import java.util.Map;

/* renamed from: X.8vL  reason: invalid class name and case insensitive filesystem */
public class C173598vL extends C63622tQ {
    public static final Map A01 = new C71233El(0);
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C173598vL(AnonymousClass190 r19, AnonymousClass11P r20, AnonymousClass1CP r21, C18030ve r22, AnonymousClass18K r23, AnonymousClass1N7 r24, Integer num, Integer num2, String str, String str2, long j, long j2) {
        super(r19, r20, r21, r22, r23, r24, num, num2, str, 3, j, j2);
        int i;
        Map map = A01;
        String str3 = str2;
        if (map.containsKey(str3)) {
            Object obj = map.get(str3);
            C17960vV.A07(obj);
            i = AnonymousClass000.A0M(obj);
        } else {
            i = 18;
        }
        this.A00 = i;
    }

    public AnonymousClass184 A03(C57532jE r4, int i) {
        C171128rD r2 = new C171128rD();
        r2.A02 = Long.valueOf(r4.A02);
        r2.A00 = Integer.valueOf(i);
        Integer num = this.A08;
        if (num != null) {
            r2.A03 = C17890vO.A0N(num);
        }
        r2.A01 = Integer.valueOf(this.A00);
        r2.A04 = Long.valueOf(r4.A00);
        r2.A05 = Long.valueOf(r4.A01);
        return r2;
    }

    public String A04() {
        return "LoggableCallStanza";
    }

    public void A06(AnonymousClass2H4 r2) {
        r2.A03 = C17880vN.A0j();
        r2.A00 = Integer.valueOf(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoggableCallStanza");
        A10.append("(");
        A10.append(super.toString());
        A10.append("; type=");
        A10.append(this.A00);
        return AnonymousClass8BU.A0q(A10);
    }
}
