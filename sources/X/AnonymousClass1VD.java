package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet;

/* renamed from: X.1VD  reason: invalid class name */
public final class AnonymousClass1VD {
    public final AnonymousClass1VC A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1VB A02;
    public final AnonymousClass00H A03;

    public AnonymousClass1VD(AnonymousClass11S r2, AnonymousClass1VC r3, AnonymousClass1VB r4, AnonymousClass00H r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r3, 4);
        this.A01 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r3;
    }

    public final ReachoutTimelockInfoBottomSheet A00() {
        boolean z;
        AnonymousClass1VC r2 = this.A00;
        C17960vV.A0F(r2.A02(), "Reachout timelock is not active but trying to open bottom sheet");
        if (r2.A03()) {
            z = false;
        } else {
            this.A02.A00();
            AnonymousClass2HX r1 = new AnonymousClass2HX();
            z = true;
            r1.A00 = true;
            ((AnonymousClass18K) this.A03.get()).CC7(r1);
        }
        return AnonymousClass4HZ.A00(z);
    }

    public final boolean A01(AnonymousClass1E7 r5, boolean z) {
        C42741yf r0;
        if (r5 != null) {
            AnonymousClass1VC r2 = this.A00;
            if (r2.A02()) {
                AnonymousClass1BI r3 = r5.A0J;
                if (C22971Dz.A0d(r3)) {
                    C25111Mx r1 = r2.A00;
                    C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    UserJid userJid = (UserJid) r3;
                    C18070vi.A0d(userJid, 0);
                    C54192dk A012 = C25111Mx.A01(r1, userJid);
                    if ((A012 == null || A012.A01 != AnonymousClass00R.A0C) && (((r0 = r5.A0G) == null || !r0.A02()) && !this.A01.A0O(r5.A0J) && ((!z || r2.A03()) && !C42701yb.A01(r5.A0J)))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
