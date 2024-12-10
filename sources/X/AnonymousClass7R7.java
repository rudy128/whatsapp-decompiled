package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.7R7  reason: invalid class name */
public class AnonymousClass7R7 implements Runnable {
    public final int A00 = 0;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public AnonymousClass7R7(AnonymousClass1FU r2, C138636xR r3, AnonymousClass1E7 r4, String str, String str2, int i) {
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = r2;
        this.A01 = i;
        this.A07 = "block_report";
    }

    public final void run() {
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            C133946pl r9 = (C133946pl) obj;
            AnonymousClass1BI r8 = (AnonymousClass1BI) this.A03;
            String str = this.A05;
            String str2 = this.A06;
            int i2 = this.A01;
            Long l = (Long) this.A04;
            String str3 = this.A07;
            C1185763z r1 = new C1185763z();
            if (r8 != null) {
                r1.A09 = r9.A02.A05(r8.getRawString());
                if (r8 instanceof AnonymousClass1EC) {
                    r1.A03 = C17880vN.A0n(C64002u3.A03(r9.A00.A09((AnonymousClass1E9) r8)));
                }
                r1.A02 = Integer.valueOf(((C63152sb) r9.A04.get()).A02(r8));
            }
            r1.A05 = ((C189339iv) r9.A03.get()).A00();
            r1.A08 = str;
            r1.A01 = 10;
            r1.A07 = str2;
            r1.A00 = Integer.valueOf(i2);
            r1.A04 = l;
            r1.A06 = str3;
            r9.A01.CC7(r1);
            return;
        }
        C138636xR r92 = (C138636xR) obj;
        AnonymousClass1E7 r10 = (AnonymousClass1E7) this.A03;
        String str4 = this.A05;
        String str5 = this.A06;
        int i3 = this.A01;
        C18070vi.A0d(str5, 3);
        C87904Xn r12 = r92.A06;
        C22941Dw r0 = UserJid.Companion;
        r12.A01(AnonymousClass3MZ.A0w(r10));
        r92.A00.A0J(new C21452AkJ(32, str5, r92));
        C138636xR.A00((AnonymousClass1FU) this.A04, r92, r10, "block_report", str4, i3);
    }

    public AnonymousClass7R7(C133946pl r2, AnonymousClass1BI r3, Long l, String str, String str2, String str3, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = i;
        this.A04 = l;
        this.A07 = str3;
    }
}
