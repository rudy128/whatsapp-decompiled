package X;

import android.view.View;
import com.whatsapp.waffle.wfac.ui.WfacBanInfoFragment;

/* renamed from: X.78N  reason: invalid class name */
public class AnonymousClass78N implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public AnonymousClass78N(WfacBanInfoFragment wfacBanInfoFragment, int i, int i2, int i3) {
        this.A00 = i3;
        if (1 - i3 != 0) {
            this.A03 = wfacBanInfoFragment;
            this.A01 = i;
        } else {
            this.A03 = wfacBanInfoFragment;
            this.A01 = 1;
        }
        this.A02 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (X.C24211Jh.A00(r4, "com.facebook.wakizashi") != -1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        r0 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r1.A01(r0, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0064;
                case 1: goto L_0x007e;
                case 2: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A03
            com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment r2 = (com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment) r2
            int r6 = r10.A01
            int r5 = r10.A02
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r1 = r2.A01
            if (r1 == 0) goto L_0x00ad
            X.1FL r0 = r2.A1D()
            r1.A0V(r0)
            X.6om r1 = X.C108975cc.A0Q(r2)
            java.lang.String r0 = "account_verification_started"
        L_0x001e:
            r1.A01(r0, r6, r5)
            return
        L_0x0022:
            java.lang.Object r7 = r10.A03
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r7 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r7
            int r6 = r10.A01
            int r5 = r10.A02
            r0 = 3
            X.C18070vi.A0d(r11, r0)
            android.content.Context r4 = X.AnonymousClass3MY.A04(r11)
            java.lang.String r0 = "com.facebook.katana"
            long r1 = X.C24211Jh.A00(r4, r0)
            r8 = -1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "com.facebook.wakizashi"
            long r2 = X.C24211Jh.A00(r4, r0)
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            r2 = 0
            X.1L9 r1 = r7.A00
            if (r1 == 0) goto L_0x00a7
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "fb://feed/"
        L_0x0053:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.CGU(r4, r0, r2)
            X.6om r1 = X.C108975cc.A0Q(r7)
            java.lang.String r0 = "redirect_to_source_app"
            goto L_0x001e
        L_0x0061:
            java.lang.String r0 = "https://m.facebook.com"
            goto L_0x0053
        L_0x0064:
            java.lang.Object r2 = r10.A03
            com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment r2 = (com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment) r2
            int r6 = r10.A01
            int r5 = r10.A02
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r1 = r2.A00
            if (r1 == 0) goto L_0x00ad
            X.1FL r0 = r2.A1D()
            r1.A0V(r0)
            X.6om r1 = X.C108975cc.A0Q(r2)
            java.lang.String r0 = "reg_new_number_started"
            goto L_0x001e
        L_0x007e:
            java.lang.Object r6 = r10.A03
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r6 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r6
            int r5 = r10.A02
            boolean r4 = X.C108975cc.A1K(r11)
            android.content.Context r3 = X.AnonymousClass3MY.A04(r11)
            X.1L9 r2 = r6.A00
            if (r2 == 0) goto L_0x00a4
            java.lang.String r0 = "https://instagram.com"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r2.CGU(r3, r1, r0)
            X.6om r1 = X.C108975cc.A0Q(r6)
            java.lang.String r0 = "redirect_to_source_app"
            r1.A01(r0, r4, r5)
            return
        L_0x00a4:
            java.lang.String r0 = "activityUtils"
            goto L_0x00af
        L_0x00a7:
            java.lang.String r0 = "activityUtils"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00ad:
            java.lang.String r0 = "viewModel"
        L_0x00af:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78N.onClick(android.view.View):void");
    }

    public AnonymousClass78N(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
    }
}
