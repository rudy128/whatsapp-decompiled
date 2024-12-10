package com.whatsapp.calling.views;

import X.AnonymousClass000;
import X.AnonymousClass1DC;
import X.AnonymousClass1LD;
import X.AnonymousClass1M9;
import X.AnonymousClass3MZ;
import X.AnonymousClass7R9;
import X.C107925aq;
import X.C17890vO;
import X.C17960vV;
import X.C19830z4;
import X.C219217x;
import X.C24921Me;
import X.C72473Md;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

public class PermissionDialogFragment extends Hilt_PermissionDialogFragment {
    public int A00;
    public Dialog A01;
    public Button A02;
    public TextView A03;
    public C107925aq A04;
    public AnonymousClass1M9 A05;
    public C24921Me A06;
    public C219217x A07;
    public C19830z4 A08;
    public AnonymousClass1LD A09;
    public AnonymousClass1DC A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public String[] A0E;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.calling.views.PermissionDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.calling.views.Hilt_PermissionDialogFragment] */
    public static PermissionDialogFragment A00(UserJid userJid, int i, boolean z, boolean z2, boolean z3) {
        ? hilt_PermissionDialogFragment = new Hilt_PermissionDialogFragment();
        Bundle A0H = C72473Md.A0H(userJid);
        A0H.putBoolean("microphone", z);
        A0H.putBoolean("camera", z2);
        A0H.putBoolean("phone", z3);
        A0H.putInt("request_code", i);
        hilt_PermissionDialogFragment.A1R(A0H);
        return hilt_PermissionDialogFragment;
    }

    public void A1O(int i, String[] strArr, int[] iArr) {
        boolean z = false;
        if (i != 100) {
            C17960vV.A0F(false, "Unknown request code");
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PermissionDialogFragment/onRequestPermissionsResult permissions: ");
        A10.append(Arrays.toString(strArr));
        A10.append(", grantResults: ");
        C17890vO.A1A(A10, Arrays.toString(iArr));
        int length = iArr.length;
        boolean z2 = false;
        if (length > 0) {
            z2 = true;
            int i2 = 0;
            while (true) {
                if (iArr[i2] == 0) {
                    i2++;
                    if (i2 >= length) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            z = z2;
        }
        C107925aq r1 = this.A04;
        if (r1 != null) {
            int i3 = this.A00;
            if (z) {
                r1.C0T(strArr, i3);
            } else {
                r1.C0S(i3);
            }
        }
    }

    public void A1K() {
        super.A1K();
        this.A04 = null;
    }

    public void A1r() {
        super.A1r();
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void A1u() {
        super.A1u();
        if (this.A0B) {
            String[] strArr = this.A0E;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (this.A07.A02(strArr[i]) != 0) {
                        break;
                    }
                    i++;
                } else {
                    this.A01.dismiss();
                    if (this.A04 != null) {
                        new Handler().post(new AnonymousClass7R9((Object) this, 6));
                    }
                }
            }
            this.A0B = false;
        }
    }

    public void A1v() {
        super.A1v();
        Window window = this.A01.getWindow();
        C17960vV.A07(window);
        window.setLayout(AnonymousClass3MZ.A09(this).getDisplayMetrics().widthPixels, AnonymousClass3MZ.A09(this).getDisplayMetrics().heightPixels);
    }

    public void A1x(Context context) {
        super.A1x(context);
        this.A04 = (C107925aq) context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e9, code lost:
        if (r1 != false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r5 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0200, code lost:
        if (r10.A0D == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0202, code lost:
        r2 = 2131894280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020e, code lost:
        if (r10.A0D != false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0211, code lost:
        r2 = 2131894281;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z(android.os.Bundle r11) {
        /*
            r10 = this;
            super.A1z(r11)
            X.1FL r7 = r10.A1D()
            android.os.Bundle r6 = r10.A15()
            java.lang.String r0 = "microphone"
            boolean r0 = r6.getBoolean(r0)
            r10.A0D = r0
            java.lang.String r0 = "camera"
            boolean r0 = r6.getBoolean(r0)
            r10.A0C = r0
            java.lang.String r0 = "phone"
            boolean r5 = r6.getBoolean(r0)
            java.lang.String r0 = "request_code"
            int r0 = r6.getInt(r0)
            r10.A00 = r0
            boolean r0 = r10.A0D
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0036
            boolean r0 = r10.A0C
            if (r0 != 0) goto L_0x0036
            r1 = 0
            if (r5 == 0) goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            java.lang.String r0 = "either microphone or camera or phone permission should be needed"
            X.C17960vV.A0F(r1, r0)
            boolean r9 = r10.A0C
            java.lang.String r8 = "android.permission.CAMERA"
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            if (r9 == 0) goto L_0x026e
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x026e
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r3] = r8
            r0[r4] = r2
            java.util.ArrayList r1 = X.C220618l.newArrayList((java.lang.Object[]) r0)
        L_0x0053:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r10.A0E = r0
            X.1FL r1 = r10.A1D()
            android.app.Dialog r0 = new android.app.Dialog
            r0.<init>(r1)
            r10.A01 = r0
            r0.requestWindowFeature(r4)
            android.app.Dialog r0 = r10.A01
            android.view.Window r0 = r0.getWindow()
            X.C17960vV.A07(r0)
            X.AnonymousClass3Ma.A1H(r0, r3)
            android.app.Dialog r0 = r10.A01
            r0.setCancelable(r3)
            android.app.Dialog r0 = r10.A01
            r0.setCanceledOnTouchOutside(r3)
            android.app.Dialog r1 = r10.A01
            r0 = 2131626448(0x7f0e09d0, float:1.8880132E38)
            r1.setContentView(r0)
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x022a
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x022a
            android.app.Dialog r1 = r10.A01
            r0 = 2131433767(0x7f0b1927, float:1.8489329E38)
            r2 = 2131433767(0x7f0b1927, float:1.8489329E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131232106(0x7f08056a, float:1.8080312E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r3)
            android.app.Dialog r1 = r10.A01
            r0 = 2131433768(0x7f0b1928, float:1.848933E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131231658(0x7f0803aa, float:1.8079403E38)
            r1.setImageResource(r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131433769(0x7f0b1929, float:1.8489333E38)
            r2 = 2131433769(0x7f0b1929, float:1.8489333E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131232198(0x7f0805c6, float:1.8080498E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r3)
        L_0x00dc:
            android.app.Dialog r1 = r10.A01
            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 26
            X.AnonymousClass48l.A00(r1, r10, r0)
            java.lang.String r0 = "jid"
            java.lang.String r0 = r6.getString(r0)
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A02(r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131435879(0x7f0b2167, float:1.8493613E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.A02 = r0
            android.app.Dialog r1 = r10.A01
            r0 = 2131433770(0x7f0b192a, float:1.8489335E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A03 = r0
            X.1LD r0 = r10.A09
            boolean r1 = r0.A01()
            java.lang.String[] r0 = r10.A0E
            boolean r8 = X.AnonymousClass74O.A0N(r7, r0)
            X.0z4 r2 = r10.A08
            java.lang.String[] r0 = r10.A0E
            boolean r7 = X.AnonymousClass74O.A0S(r2, r0)
            if (r8 != 0) goto L_0x0227
            if (r7 != 0) goto L_0x0227
        L_0x0126:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PermissionDialogFragment/permissions needMicPermission="
            r2.append(r0)
            boolean r0 = r10.A0D
            r2.append(r0)
            java.lang.String r0 = ", needCameraPermission="
            r2.append(r0)
            boolean r0 = r10.A0C
            r2.append(r0)
            java.lang.String r0 = ", needPhonePermission="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = ", isScreenLocked="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", showRational="
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = ", isFistTimeRequest="
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = ", permanentDenial="
            X.C17900vP.A0n(r0, r2, r4)
            if (r6 == 0) goto L_0x0219
            X.1Me r2 = r10.A06
            X.1M9 r0 = r10.A05
            java.lang.String r5 = X.AnonymousClass3MY.A0p(r0, r2, r6)
        L_0x016d:
            r0 = 1
            if (r4 == 0) goto L_0x01bc
            boolean r0 = r10.A0C
            if (r1 == 0) goto L_0x01a2
            boolean r1 = r10.A0D
            if (r0 == 0) goto L_0x01b3
            r0 = 2131894279(0x7f122007, float:1.9423358E38)
            if (r1 == 0) goto L_0x0180
            r0 = 2131894366(0x7f12205e, float:1.9423535E38)
        L_0x0180:
            android.widget.TextView r1 = r10.A03
            java.lang.String r0 = X.AnonymousClass3MY.A0o(r10, r5, r3, r0)
            r1.setText(r0)
            android.widget.Button r1 = r10.A02
            r0 = 2131894393(0x7f122079, float:1.942359E38)
            r1.setText(r0)
        L_0x0191:
            android.widget.Button r2 = r10.A02
            r1 = 2
            X.48Z r0 = new X.48Z
            r0.<init>(r1, r10, r4)
            r2.setOnClickListener(r0)
            android.app.Dialog r0 = r10.A01
            r0.show()
            return
        L_0x01a2:
            boolean r1 = r10.A0D
            if (r0 == 0) goto L_0x01af
            r0 = 2131894278(0x7f122006, float:1.9423356E38)
            if (r1 == 0) goto L_0x0180
            r0 = 2131894365(0x7f12205d, float:1.9423533E38)
            goto L_0x0180
        L_0x01af:
            r0 = 2131894356(0x7f122054, float:1.9423514E38)
            goto L_0x01b6
        L_0x01b3:
            r0 = 2131894357(0x7f122055, float:1.9423516E38)
        L_0x01b6:
            if (r1 != 0) goto L_0x0180
            r0 = 2131894381(0x7f12206d, float:1.9423565E38)
            goto L_0x0180
        L_0x01bc:
            int r2 = r10.A00
            if (r2 == 0) goto L_0x01f5
            if (r2 == r0) goto L_0x01ec
            r0 = 2
            if (r2 == r0) goto L_0x01e9
            r0 = 3
            if (r2 == r0) goto L_0x01e5
            r0 = 4
            if (r2 == r0) goto L_0x01f5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "UNKNOWN REQUEST CODE "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
            X.C17960vV.A0F(r3, r0)
        L_0x01d8:
            r2 = 2131894368(0x7f122060, float:1.9423539E38)
        L_0x01db:
            android.widget.TextView r1 = r10.A03
            java.lang.String r0 = X.AnonymousClass3MY.A0o(r10, r5, r3, r2)
            r1.setText(r0)
            goto L_0x0191
        L_0x01e5:
            r2 = 2131894382(0x7f12206e, float:1.9423567E38)
            goto L_0x01db
        L_0x01e9:
            if (r1 == 0) goto L_0x0211
            goto L_0x0202
        L_0x01ec:
            r2 = 2131894283(0x7f12200b, float:1.9423366E38)
            if (r1 == 0) goto L_0x01db
            r2 = 2131894282(0x7f12200a, float:1.9423364E38)
            goto L_0x01db
        L_0x01f5:
            boolean r0 = r10.A0C
            if (r1 == 0) goto L_0x020a
            if (r0 == 0) goto L_0x0206
            boolean r0 = r10.A0D
            r2 = 2131894367(0x7f12205f, float:1.9423537E38)
            if (r0 != 0) goto L_0x01db
        L_0x0202:
            r2 = 2131894280(0x7f122008, float:1.942336E38)
            goto L_0x01db
        L_0x0206:
            r2 = 2131894358(0x7f122056, float:1.9423519E38)
            goto L_0x01db
        L_0x020a:
            if (r0 == 0) goto L_0x0215
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0211
            goto L_0x01d8
        L_0x0211:
            r2 = 2131894281(0x7f122009, float:1.9423362E38)
            goto L_0x01db
        L_0x0215:
            r2 = 2131894359(0x7f122057, float:1.942352E38)
            goto L_0x01db
        L_0x0219:
            java.lang.String r0 = "PermissionDialogFragment/permissions/jid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r5 = r10.A1H(r0)
            goto L_0x016d
        L_0x0227:
            r4 = 0
            goto L_0x0126
        L_0x022a:
            android.app.Dialog r1 = r10.A01
            r0 = 2131433768(0x7f0b1928, float:1.848933E38)
            android.view.View r8 = r1.findViewById(r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.content.res.Resources r2 = X.AnonymousClass3MZ.A09(r10)
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0263
            r1 = 2131232106(0x7f08056a, float:1.8080312E38)
        L_0x0240:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r1)
            r8.setImageDrawable(r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131433767(0x7f0b1927, float:1.8489329E38)
            android.view.View r0 = r1.findViewById(r0)
            r2 = 8
            r0.setVisibility(r2)
            android.app.Dialog r1 = r10.A01
            r0 = 2131433769(0x7f0b1929, float:1.8489333E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r2)
            goto L_0x00dc
        L_0x0263:
            boolean r0 = r10.A0C
            r1 = 2131231757(0x7f08040d, float:1.8079604E38)
            if (r0 == 0) goto L_0x0240
            r1 = 2131232198(0x7f0805c6, float:1.8080498E38)
            goto L_0x0240
        L_0x026e:
            java.lang.String[] r1 = new java.lang.String[r4]
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x027d
            r8 = r2
        L_0x0275:
            r1[r3] = r8
            java.util.ArrayList r1 = X.C220618l.newArrayList((java.lang.Object[]) r1)
            goto L_0x0053
        L_0x027d:
            if (r9 != 0) goto L_0x0275
            java.lang.String r8 = "android.permission.READ_PHONE_STATE"
            goto L_0x0275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.PermissionDialogFragment.A1z(android.os.Bundle):void");
    }
}
