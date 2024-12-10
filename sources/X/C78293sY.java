package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.3sY  reason: invalid class name and case insensitive filesystem */
public class C78293sY extends AnonymousClass3uP {
    public C32191gn A00;
    public boolean A01;
    public final TextView A02;

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
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = (C32191gn) r3.AAo.get();
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A2i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r5.A0U.A0O(r1) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2i() {
        /*
            r5 = this;
            X.206 r4 = r5.A0I
            X.20i r4 = (X.C436420i) r4
            boolean r0 = r4.A17()
            r2 = 0
            if (r0 == 0) goto L_0x001a
            X.1BI r1 = r4.A0H()
            if (r1 == 0) goto L_0x001a
            X.11S r0 = r5.A0U
            boolean r0 = r0.A0O(r1)
            r3 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            X.1gn r0 = r5.A00
            java.lang.String r0 = r0.A0S(r4, r2)
            android.widget.TextView r2 = r5.A02
            r2.setText(r0)
            r1 = 2
            X.4dL r0 = new X.4dL
            r0.<init>(r1, r5, r3)
            r2.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78293sY.A2i():void");
    }

    public C1770697b getFMessage() {
        return (C1770697b) this.A0I;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C1770697b);
        this.A0I = r2;
    }

    public C78293sY(Context context, C108875cR r4, C436420i r5) {
        super(context, r4, r5);
        A1M();
        setClickable(false);
        setLongClickable(false);
        TextView A0J = AnonymousClass3MW.A0J(this, 2131431625);
        this.A02 = A0J;
        A0J.setBackground(this.A09.BQF());
        A0J.setTextSize(getDividerFontSize());
        A2i();
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
