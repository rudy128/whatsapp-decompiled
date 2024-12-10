package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: X.3sg  reason: invalid class name and case insensitive filesystem */
public class C78363sg extends AnonymousClass3uP {
    public C32191gn A00;
    public AnonymousClass4Q5 A01;
    public boolean A02;
    public final TextView A03;

    public boolean A1b() {
        return true;
    }

    public boolean A2Z() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    private void A00() {
        AnonymousClass1BI r3;
        C442822v r5 = (C442822v) this.A0I;
        C32191gn r4 = this.A00;
        AnonymousClass205 r1 = r5.A0v;
        if (r1.A02) {
            AnonymousClass11S r0 = this.A0U;
            r0.A0I();
            r3 = r0.A0E;
        } else {
            r3 = r1.A00;
        }
        String A0M = r4.A0M(r3, r5.A00, r5.A04, true);
        Drawable A0m = AnonymousClass3uQ.A0m(this);
        TextView textView = this.A03;
        AnonymousClass3uQ.A0q(A0m, textView, A0M);
        C89904dD.A00(textView, this, 33);
    }

    public void A1M() {
        if (!this.A02) {
            this.A02 = true;
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
            this.A01 = (AnonymousClass4Q5) A0n.A0o.get();
            this.A00 = (C32191gn) r3.AAo.get();
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public C442822v getFMessage() {
        return (C442822v) this.A0I;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C442822v);
        this.A0I = r2;
    }

    public C78363sg(Context context, C108875cR r3, C442822v r4) {
        super(context, r3, r4);
        A1M();
        setClickable(false);
        setLongClickable(false);
        TextView A0E = C17880vN.A0E(this, 2131431625);
        this.A03 = A0E;
        AnonymousClass3uQ.A0p(context, A0E, this);
        A00();
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
