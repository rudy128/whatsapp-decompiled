package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: X.3sT  reason: invalid class name and case insensitive filesystem */
public final class C78243sT extends AnonymousClass3uP {
    public final C19880zA A00;
    public final AnonymousClass206 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78243sT(Context context, C19880zA r7, C108875cR r8, AnonymousClass206 r9) {
        super(context, r8, r9);
        AnonymousClass1E7 r2;
        C18070vi.A0d(context, 1);
        this.A01 = r9;
        this.A00 = r7;
        TextView A0E = AnonymousClass3Ma.A0E(getRootView(), 2131431625);
        AnonymousClass3MX.A1C(getContext(), A0E, getTextColor());
        Drawable drawable = (Drawable) C72463Mc.A0m(((C93084iP) this.A09).A03);
        C18070vi.A0X(drawable);
        A0E.setBackground(drawable);
        AnonymousClass1BI r1 = this.A01.A0v.A00;
        if (r1 != null) {
            r2 = this.A0j.A0E(r1);
        } else {
            r2 = null;
        }
        C19880zA r0 = this.A00;
        if (r0 == null || !r0.A07()) {
            AnonymousClass3MY.A0x(getContext(), A0E, 2131891353);
        } else {
            this.A1X.CGF(new C98714rb(this, r2, A0E, 7));
        }
        C89904dD.A00(A0E, this, 43);
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public final int getTextColor() {
        return AnonymousClass1YL.A00(getContext(), 2130969245, 2131100250);
    }

    public int getCenteredLayoutId() {
        return 2131624845;
    }

    public int getIncomingLayoutId() {
        return 2131624845;
    }

    public int getOutgoingLayoutId() {
        return 2131624845;
    }
}
