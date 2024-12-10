package X;

import android.content.Context;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.3t4  reason: invalid class name */
public class AnonymousClass3t4 extends AnonymousClass3tw {
    public AnonymousClass1N5 A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final AnonymousClass1GP A03;
    public final TemplateRowContentLayout A04;

    public void A1M() {
        if (!this.A02) {
            this.A02 = true;
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
            C78683tL.A01(r4, A0O, this);
            this.A00 = (AnonymousClass1N5) r4.A9K.get();
            this.A01 = C000200d.A00(A0O.A0l);
        }
    }

    public boolean A1W() {
        Long l = ((C439421n) ((C438921i) ((AnonymousClass21V) this.A0I))).BaE().A00;
        if (l == null || AnonymousClass11P.A01(this.A0u) >= l.longValue()) {
            return false;
        }
        return true;
    }

    public boolean A1X() {
        return C79103uS.A1K(this, (AnonymousClass21V) this.A0I, this.A1h);
    }

    public void A1u() {
        this.A04.A02(this.A03, this, this.A2v);
        super.A1u();
    }

    public void A2V(AnonymousClass206 r4, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r4, (AnonymousClass21V) this.A0I);
        super.A2V(r4, z);
        if (z || A1Z) {
            this.A04.A02(this.A03, this, this.A2v);
        }
    }

    public AnonymousClass3t4(Context context, AnonymousClass1GP r4, C108875cR r5, AnonymousClass222 r6) {
        super(context, r5, r6);
        A1M();
        TemplateRowContentLayout templateRowContentLayout = (TemplateRowContentLayout) findViewById(2131436035);
        this.A04 = templateRowContentLayout;
        this.A03 = r4;
        templateRowContentLayout.A02(r4, this, this.A2v);
    }

    public void A20() {
        super.A20();
        C98814rl.A00(this.A1X, this, (AnonymousClass21V) this.A0I, 6);
    }

    public int getMainChildMaxWidth() {
        return getResources().getDimensionPixelSize(2131166243);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        AnonymousClass3tU.A09(this, this.A01, i);
    }

    public int getCenteredLayoutId() {
        return 2131624932;
    }

    public int getIncomingLayoutId() {
        return 2131624932;
    }

    public int getOutgoingLayoutId() {
        return 2131624933;
    }
}
