package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.7CM  reason: invalid class name */
public class AnonymousClass7CM implements AnonymousClass191, C108035b1 {
    public final C24681Lg A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass10I A02;
    public final C26301Rp A03;
    public final C18100vl A04 = AnonymousClass7S4.A02(this, 16);
    public final C18030ve A05;

    public /* synthetic */ void Blg() {
    }

    public /* synthetic */ void BwO(AnonymousClass1E1 r1, AnonymousClass1E1 r2, PhoneUserJid phoneUserJid) {
    }

    public void Blf() {
        if (C18020vd.A05(C18040vf.A02, this.A05, 8397)) {
            this.A00.registerObserver(new AnonymousClass7FO(this, 1));
        }
    }

    public void BwN(AnonymousClass1E1 r4, AnonymousClass1E1 r5, PhoneUserJid phoneUserJid) {
        if (r5 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SplitThreadDetection/");
            C26301Rp.A04(this.A03, AnonymousClass000.A0y(phoneUserJid.getRawString(), A10), String.valueOf(true));
        }
    }

    public AnonymousClass7CM(C24681Lg r2, C18030ve r3, AnonymousClass18K r4, AnonymousClass10I r5, C26301Rp r6) {
        C18070vi.A0w(r3, r5, r4, r6, r2);
        this.A05 = r3;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = r2;
    }

    public void Ba9() {
    }
}
