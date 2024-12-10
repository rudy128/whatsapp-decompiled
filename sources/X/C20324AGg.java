package X;

import android.widget.ImageView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AGg  reason: case insensitive filesystem */
public final class C20324AGg implements AnonymousClass1GC {
    public final AnonymousClass1F9 A00;
    public final C20005A2v A01;

    public C20324AGg(AnonymousClass1F9 r2, C20005A2v a2v) {
        C18070vi.A0d(a2v, 1);
        this.A01 = a2v;
        this.A00 = r2;
        r2.getLifecycle().A05(this);
    }

    public final void A00(AEI aei, UserJid userJid, C18090vk r12, C18090vk r13, C22821Di r14) {
        C183889Zz r5 = new C183889Zz(new C182919Wf(897451484), userJid);
        AEI aei2 = aei;
        this.A01.A03((ImageView) null, aei2, new ANP(r13, 4), r5, new ANT(r12, 1), new ANZ(r14, 4), 2);
    }

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        if (C108955ca.A04(r3, 1) == 5) {
            this.A01.A02();
            this.A00.getLifecycle().A06(this);
        }
    }
}
