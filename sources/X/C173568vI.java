package X;

/* renamed from: X.8vI  reason: invalid class name and case insensitive filesystem */
public class C173568vI extends C63622tQ {
    public String A00;
    public final String A01;

    public C173568vI(AnonymousClass190 r17, AnonymousClass11P r18, AnonymousClass1CP r19, C18030ve r20, AnonymousClass18K r21, AnonymousClass1N7 r22, Integer num, Integer num2, String str, String str2, long j, long j2) {
        super(r17, r18, r19, r20, r21, r22, num, num2, str, 2, j, j2);
        this.A01 = str2;
    }

    public AnonymousClass184 A03(C57532jE r4, int i) {
        C171288rT r2 = new C171288rT();
        r2.A03 = Long.valueOf(r4.A02);
        Integer num = this.A08;
        if (num != null) {
            r2.A04 = C17890vO.A0N(num);
        }
        r2.A00 = Integer.valueOf(i);
        r2.A06 = this.A01;
        r2.A05 = this.A00;
        r2.A01 = Long.valueOf(r4.A00);
        r2.A02 = Long.valueOf(r4.A01);
        return r2;
    }

    public String A04() {
        return "LoggableNotificationStanza";
    }

    public void A06(AnonymousClass2H4 r3) {
        r3.A03 = C17880vN.A0k();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("/");
        r3.A0A = AnonymousClass000.A0y(this.A00, A10);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoggableNotificationStanza");
        A10.append("(");
        A10.append(super.toString());
        A10.append("; type=");
        A10.append(this.A01);
        A10.append("; subType=");
        A10.append(this.A00);
        return AnonymousClass8BU.A0q(A10);
    }
}
