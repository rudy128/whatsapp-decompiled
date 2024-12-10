package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.9yP  reason: invalid class name and case insensitive filesystem */
public final class C198479yP {
    public final C18030ve A00;
    public final AnonymousClass10I A01;
    public final C22821Di A02;
    public final AnonymousClass1HQ A03;
    public final C188609hh A04;

    public static final int A00(C198479yP r17) {
        C188609hh r0 = r17.A04;
        return Voip.startCall(r0.A02, r0.A0C, r0.A05, r0.A01, r0.A0B, r0.A04, r0.A06, r0.A09, r0.A03, r0.A00, r0.A0A, r0.A08, r0.A07, false, (String[]) null, (String[]) null, (UserJid) null);
    }

    public C198479yP(AnonymousClass1HQ r1, C188609hh r2, C18030ve r3, AnonymousClass10I r4, C22821Di r5) {
        C18070vi.A0o(r3, r4, r1);
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r1;
        this.A04 = r2;
        this.A02 = r5;
    }
}
