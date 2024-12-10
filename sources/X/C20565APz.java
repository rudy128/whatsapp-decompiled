package X;

import android.util.Pair;

/* renamed from: X.APz  reason: case insensitive filesystem */
public final class C20565APz implements C26791Tm {
    public final /* synthetic */ C179319Hm A00;
    public final /* synthetic */ C66682yZ A01;
    public final /* synthetic */ BCS A02;
    public final /* synthetic */ C31761g5 A03;

    public C20565APz(C179319Hm r1, C66682yZ r2, BCS bcs, C31761g5 r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = bcs;
        this.A03 = r4;
    }

    public void C8E() {
        BCS bcs;
        this.A01.A02.unregisterObserver(this);
        if (this.A00 == C179319Hm.PAIRING && (bcs = this.A02) != null) {
            bcs.Bia(5);
        }
        this.A03.resumeWith(new C184379ar(AnonymousClass9I9.UNKNOWN, true));
    }

    public void C8F(Pair pair) {
        BCS bcs;
        C179319Hm r1 = this.A00;
        this.A01.A02.unregisterObserver(this);
        if (r1 == C179319Hm.PAIRING && (bcs = this.A02) != null) {
            if (pair != null) {
                Object obj = pair.first;
                C18070vi.A0W(obj);
                bcs.BiE(5, AnonymousClass000.A0M(obj), (String) pair.second);
            } else {
                bcs.BiF(5, -12);
            }
        }
        this.A03.resumeWith(new C184379ar(AnonymousClass9I9.SYNCD_DELETION_FAILED, false));
    }

    public void C35() {
    }
}
