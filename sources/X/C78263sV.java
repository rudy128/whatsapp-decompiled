package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: X.3sV  reason: invalid class name and case insensitive filesystem */
public class C78263sV extends AnonymousClass3uP {
    public boolean A00;
    public final TextView A01;

    public boolean A1b() {
        return true;
    }

    public boolean A2Z() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public void A1M() {
        if (!this.A00) {
            this.A00 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
        }
    }

    public void A2V(AnonymousClass206 r4, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r4, this.A0I);
        super.A2V(r4, z);
        if (z || A1Z) {
            String string = getContext().getString(2131889913);
            Drawable A0m = AnonymousClass3uQ.A0m(this);
            TextView textView = this.A01;
            AnonymousClass3uQ.A0q(A0m, textView, string);
            C89904dD.A00(textView, this, 32);
        }
    }

    public C436420i getFMessage() {
        return (C436420i) this.A0I;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C436420i);
        this.A0I = r2;
    }

    public C78263sV(Context context, C108875cR r5, C436420i r6) {
        super(context, r5, r6);
        A1M();
        setClickable(false);
        setLongClickable(false);
        TextView A0J = AnonymousClass3MW.A0J(getRootView(), 2131431625);
        this.A01 = A0J;
        AnonymousClass3uQ.A0p(context, A0J, this);
        String string = getContext().getString(2131889913);
        Drawable A0m = AnonymousClass3uQ.A0m(this);
        TextView textView = this.A01;
        AnonymousClass3uQ.A0q(A0m, textView, string);
        C89904dD.A00(textView, this, 32);
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
