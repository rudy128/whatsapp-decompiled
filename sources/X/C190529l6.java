package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.9l6  reason: invalid class name and case insensitive filesystem */
public final class C190529l6 {
    public final AnonymousClass11S A00;
    public final C41911xI A01;
    public final AnonymousClass10I A02;

    public final void A00(C178119Bw r4) {
        if (!r4.A04.A03) {
            if (r4.A0B != null) {
                DeviceJid deviceJid = r4.A02;
                AnonymousClass11S r1 = this.A00;
                r1.A0I();
                if ((!C18070vi.A18(deviceJid, r1.A02) && !C18070vi.A18(deviceJid, r1.A08())) || r4.A0B().size() <= 1) {
                    return;
                }
            } else {
                return;
            }
        }
        if (r4.A0E == null) {
            this.A02.CGF(new AnonymousClass7RL(this, r4, 6));
        }
    }

    public C190529l6(AnonymousClass11S r1, C41911xI r2, AnonymousClass10I r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
