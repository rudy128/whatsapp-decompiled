package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.3sf  reason: invalid class name and case insensitive filesystem */
public class C78353sf extends AnonymousClass3uP {
    public AnonymousClass1QR A00;
    public AnonymousClass1QS A01;
    public AnonymousClass1R2 A02;
    public boolean A03;
    public final TextView A04 = C17880vN.A0E(this, 2131431625);

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
        AW0 aw0;
        String str;
        TextView textView = this.A04;
        textView.setTextSize(getDividerFontSize());
        Drawable drawable = (Drawable) C72463Mc.A0m(((C93084iP) this.A09).A01);
        C18070vi.A0X(drawable);
        textView.setBackground(drawable);
        AnonymousClass206 fMessage = getFMessage();
        if ((fMessage instanceof AnonymousClass21I) || (fMessage instanceof AnonymousClass21G)) {
            String str2 = ((AnonymousClass21F) fMessage).A00;
            if (!TextUtils.isEmpty(str2)) {
                aw0 = this.A00.A0K(str2);
                if (aw0 != null) {
                    str = this.A02.A0Z(aw0, getFMessage());
                } else {
                    str = null;
                }
            } else {
                aw0 = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C90074dU.A01(textView, this, aw0, 26);
                textView.setText(str);
                AnonymousClass3MX.A1C(getContext(), textView, AnonymousClass1YL.A00(getContext(), 2130968877, 2131099954));
                return;
            }
            textView.setOnClickListener((View.OnClickListener) null);
            return;
        }
        throw AnonymousClass000.A0n("PAY: message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled");
    }

    public void A1M() {
        if (!this.A03) {
            this.A03 = true;
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
            this.A02 = (AnonymousClass1R2) r3.A8L.get();
            this.A00 = (AnonymousClass1QR) r3.A8D.get();
            this.A01 = (AnonymousClass1QS) r3.A8J.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if ((r3 instanceof X.AnonymousClass21I) != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.AnonymousClass206 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.AnonymousClass21G
            if (r0 != 0) goto L_0x0009
            boolean r1 = r3 instanceof X.AnonymousClass21I
            r0 = 0
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            X.C17960vV.A0D(r0)
            r2.A0I = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78353sf.setFMessage(X.206):void");
    }

    public C78353sf(Context context, C108875cR r3, AnonymousClass206 r4) {
        super(context, r3, r4);
        A1M();
        A00();
    }

    public void A1u() {
        A00();
        AnonymousClass3uP.A0h(this, false);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
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
