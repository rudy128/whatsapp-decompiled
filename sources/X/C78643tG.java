package X;

import android.content.Context;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.3tG  reason: invalid class name and case insensitive filesystem */
public class C78643tG extends AnonymousClass3uE {
    public AnonymousClass00H A00;
    public boolean A01;
    public final AnonymousClass1GP A02;
    public final TemplateRowContentLayout A03 = ((TemplateRowContentLayout) findViewById(2131436035));

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
            C78233sS.A00(r1, A0n, r2, this);
            this.A00 = C000200d.A00(A0O.A0l);
        }
    }

    public void A1u() {
        this.A03.A02(this.A02, this, this.A2v);
        super.A1u();
    }

    public C78643tG(Context context, AnonymousClass1GP r7, C108875cR r8, AnonymousClass220 r9) {
        super(context, r8, r9);
        A1M();
        this.A02 = r7;
        findViewById(2131431007).setBackground(this.A01.BS0(AnonymousClass00R.A01, C72453Mb.A05(r9.A0v.A02 ? 1 : 0), false));
        this.A03.A02(this.A02, this, this.A2v);
    }

    public boolean A1W() {
        Long l = ((C439421n) getFMessage()).BaE().A00;
        if (l == null || AnonymousClass11P.A01(this.A0u) >= l.longValue()) {
            return false;
        }
        return true;
    }

    public void A2V(AnonymousClass206 r4, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r4, getFMessage());
        super.A2V(r4, z);
        if (z || A1Z) {
            this.A03.A02(this.A02, this, this.A2v);
        }
    }

    public int getMainChildMaxWidth() {
        return getResources().getDimensionPixelSize(2131166243);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ((C57802jf) this.A00.get()).A00(getFMessage(), i);
    }

    public int getCenteredLayoutId() {
        return 2131624938;
    }

    public int getIncomingLayoutId() {
        return 2131624938;
    }

    public int getOutgoingLayoutId() {
        return 2131624939;
    }
}
