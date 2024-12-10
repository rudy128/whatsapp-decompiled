package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.9oh  reason: invalid class name and case insensitive filesystem */
public final class C192619oh {
    public C194269rS A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass00H A02;
    public final C200710s A03;
    public final AnonymousClass00H A04;

    public final void A00() {
        AnonymousClass00H r2;
        String str;
        C194269rS r0 = this.A00;
        String A0Q = C17890vO.A0Q();
        if (r0 == null) {
            r2 = this.A02;
            str = C108985cd.A0f();
        } else {
            r2 = r0.A00;
            str = r0.A02;
        }
        this.A00 = new C194269rS(r2, str, A0Q);
    }

    public final void A01(GroupJid groupJid, Boolean bool, Integer num, Integer num2) {
        Integer num3;
        C194269rS r1 = this.A00;
        if (r1 != null) {
            C171318rW r2 = new C171318rW();
            r2.A06 = r1.A02;
            r2.A07 = r1.A01;
            r2.A05 = AnonymousClass3MW.A0y(((C189339iv) r1.A00.get()).A00);
            r2.A04 = AnonymousClass8BT.A0m();
            if (groupJid != null) {
                int A0A = ((AnonymousClass1MZ) this.A04.get()).A08.A0A(groupJid);
                int i = null;
                if (A0A >= 2) {
                    int i2 = 1;
                    if (A0A >= 9) {
                        if (A0A < 17) {
                            i = 2;
                        } else {
                            i2 = 4;
                            if (A0A < 33) {
                                i2 = 3;
                            }
                        }
                    }
                    i = Integer.valueOf(i2);
                }
                r2.A00 = i;
            }
            r2.A03 = num2;
            int i3 = 1;
            if (!C18070vi.A19(bool, true)) {
                if (C18070vi.A19(bool, false)) {
                    i3 = 2;
                } else {
                    num3 = null;
                    r2.A02 = num3;
                    r2.A01 = num;
                    C21431Ajy.A00(this.A03, this, r2, 24);
                }
            }
            num3 = Integer.valueOf(i3);
            r2.A02 = num3;
            r2.A01 = num;
            C21431Ajy.A00(this.A03, this, r2, 24);
        }
    }

    public C192619oh(AnonymousClass18K r2, AnonymousClass10I r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r3, r2, r4, r5);
        this.A01 = r2;
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = C200710s.A00(r3);
    }
}
