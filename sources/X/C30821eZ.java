package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1eZ  reason: invalid class name and case insensitive filesystem */
public final class C30821eZ implements C30721eP {
    public final C26911Ty A00;
    public final AnonymousClass1PM A01;
    public final C30801eX A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public C30821eZ(C26911Ty r2, AnonymousClass1PM r3, C30801eX r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r8, 7);
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r6;
        this.A02 = r4;
        this.A04 = r7;
        this.A06 = r8;
    }

    public void BBP(C30531e6 r4, AnonymousClass1BI r5) {
        C446324e A002;
        C22941Dw r0 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(r5);
        if (A012 != null) {
            UserJid A003 = ((AnonymousClass4S5) this.A06.get()).A00(A012);
            AEW A08 = this.A00.A08(A003);
            if (A08 != null) {
                r4.A00 = Boolean.valueOf(A08.A0Z);
                C42741yf A013 = this.A01.A01(A003);
                if (A013 != null) {
                    r4.A04 = Boolean.valueOf(A013.A03());
                    r4.A01 = Boolean.valueOf(A013.A01());
                    boolean z = true;
                    if (A013.A01 != 1) {
                        z = false;
                    }
                    r4.A03 = Boolean.valueOf(z);
                }
                r4.A05 = ((C192229o1) this.A05.get()).A00(A003);
                C60082nM A032 = this.A02.A03(A003);
                if (A032 != null) {
                    r4.A0H = A032.A08;
                    r4.A0G = A032.A05;
                }
            }
            if (C42701yb.A01(A003) && (A002 = ((C25741Pl) this.A04.get()).A00(A003)) != null) {
                r4.A09 = 9;
                r4.A02 = Boolean.valueOf(A002.A0I);
            }
        }
    }

    public boolean CM3(AnonymousClass1BI r4) {
        return C18020vd.A05(C18040vf.A02, this.A03, 6715);
    }
}
