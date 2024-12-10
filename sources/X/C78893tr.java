package X;

import android.widget.TextView;

/* renamed from: X.3tr  reason: invalid class name and case insensitive filesystem */
public abstract class C78893tr extends C78123sD {
    public TextView A00;

    public abstract void A2i();

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public void A1u() {
        A2i();
        AnonymousClass3uP.A0h(this, false);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A2i();
        }
    }

    public int getCenteredLayoutId() {
        return 2131624811;
    }

    public int getIncomingLayoutId() {
        return 2131624811;
    }

    public int getOutgoingLayoutId() {
        return 2131624811;
    }
}
