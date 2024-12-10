package X;

import android.content.Context;
import com.whatsapp.WaImageButton;

/* renamed from: X.6rx  reason: invalid class name and case insensitive filesystem */
public final class C135286rx {
    public final Context A00;
    public final WaImageButton A01;
    public final C18000vb A02;

    public final void A00() {
        WaImageButton waImageButton = this.A01;
        waImageButton.setImageResource(2131231806);
        AnonymousClass3MY.A0w(waImageButton.getContext(), waImageButton, 2131898925);
    }

    public final void A01(int i) {
        if (i == 0) {
            WaImageButton waImageButton = this.A01;
            AnonymousClass3NL.A01(waImageButton.getContext(), waImageButton, this.A02, 2131232506);
            AnonymousClass3MY.A0w(waImageButton.getContext(), waImageButton, 2131899381);
        } else if (i != 1) {
            WaImageButton waImageButton2 = this.A01;
            waImageButton2.setImageResource(2131231900);
            AnonymousClass3MY.A0w(waImageButton2.getContext(), waImageButton2, 2131899268);
        } else {
            A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r9 == false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(boolean r9, boolean r10) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x0007
            r1 = 2131168774(0x7f070e06, float:1.795186E38)
            if (r9 != 0) goto L_0x000a
        L_0x0007:
            r1 = 2131168779(0x7f070e0b, float:1.795187E38)
        L_0x000a:
            android.content.Context r0 = r8.A00
            int r7 = X.AnonymousClass3MZ.A01(r0, r1)
            com.whatsapp.WaImageButton r2 = r8.A01
            android.view.ViewGroup$MarginLayoutParams r0 = X.C72463Mc.A0P(r2)
            X.0vb r3 = r8.A02
            int r4 = r0.leftMargin
            int r5 = r0.topMargin
            int r6 = r0.rightMargin
            X.C27641Ww.A06(r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L_0x0027
            r8.A00()
            return
        L_0x0027:
            if (r10 == 0) goto L_0x003a
            r0 = 2131231900(0x7f08049c, float:1.8079894E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131899268(0x7f123384, float:1.9433477E38)
            X.AnonymousClass3MY.A0w(r1, r2, r0)
            return
        L_0x003a:
            r1 = 2131232506(0x7f0806fa, float:1.8081123E38)
            android.content.Context r0 = r2.getContext()
            X.AnonymousClass3NL.A01(r0, r2, r3, r1)
            android.content.Context r1 = r2.getContext()
            r0 = 2131899381(0x7f1233f5, float:1.9433706E38)
            X.AnonymousClass3MY.A0w(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135286rx.A02(boolean, boolean):void");
    }

    public C135286rx(WaImageButton waImageButton, C18000vb r3) {
        C18070vi.A0j(r3, waImageButton);
        this.A02 = r3;
        this.A01 = waImageButton;
        this.A00 = AnonymousClass3MY.A04(waImageButton);
    }
}
