package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4Ww  reason: invalid class name and case insensitive filesystem */
public final class C87764Ww {
    public C23381Fv A00;
    public UserJid A01;
    public boolean A02;
    public final C39511tC A03;
    public final C91404fd A04 = new C91404fd(this);
    public final C187909gZ A05;

    public C87764Ww(C39511tC r2, C187909gZ r3) {
        C18070vi.A0d(r2, 1);
        this.A03 = r2;
        this.A05 = r3;
    }

    public static final void A00(C87764Ww r5) {
        UserJid userJid;
        if (!r5.A02 && (userJid = r5.A01) != null) {
            C187909gZ r3 = r5.A05;
            r3.A06.CGF(new C21451AkI(r3, userJid, 47));
        }
    }
}
