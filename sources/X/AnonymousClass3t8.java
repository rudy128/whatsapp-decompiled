package X;

import android.content.Context;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.3t8  reason: invalid class name */
public class AnonymousClass3t8 extends C78983u2 {
    public AnonymousClass00H A00;
    public boolean A01;
    public final AnonymousClass1GP A02;
    public final TemplateRowContentLayout A03;

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            AnonymousClass3tU.A08(r1, r4, r2, this);
            AnonymousClass3tM.A00(A0n, r4, r2, this);
            this.A00 = C000200d.A00(A0O.A0l);
        }
    }

    public boolean A1W() {
        Long l = ((C439421n) ((C440021t) ((AnonymousClass21V) this.A0I))).BaE().A00;
        if (l == null || AnonymousClass11P.A01(this.A0u) >= l.longValue()) {
            return false;
        }
        return true;
    }

    public boolean A1X() {
        return C79103uS.A1K(this, (AnonymousClass21V) this.A0I, this.A1h);
    }

    public void A1u() {
        this.A03.A02(this.A02, this, this.A2v);
        super.A1u();
    }

    public void A2V(AnonymousClass206 r4, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r4, (AnonymousClass21V) this.A0I);
        super.A2V(r4, z);
        if (z || A1Z) {
            this.A03.A02(this.A02, this, this.A2v);
        }
    }

    public AnonymousClass3t8(Context context, AnonymousClass1GP r4, C108875cR r5, C440121u r6) {
        super(context, r5, r6);
        A1M();
        TemplateRowContentLayout templateRowContentLayout = (TemplateRowContentLayout) findViewById(2131436035);
        this.A03 = templateRowContentLayout;
        this.A02 = r4;
        templateRowContentLayout.A02(r4, this, this.A2v);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        AnonymousClass3tU.A09(this, this.A00, i);
    }

    public int getCenteredLayoutId() {
        return 2131624934;
    }

    public int getIncomingLayoutId() {
        return 2131624934;
    }

    public int getOutgoingLayoutId() {
        return 2131624935;
    }
}
