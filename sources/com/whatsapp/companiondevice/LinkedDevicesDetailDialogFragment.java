package com.whatsapp.companiondevice;

import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass129;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1RK;
import X.AnonymousClass1TH;
import X.AnonymousClass1TI;
import X.AnonymousClass4O6;
import X.AnonymousClass4a6;
import X.C73203Rj;
import X.C88344Zh;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LinkedDevicesDetailDialogFragment extends Hilt_LinkedDevicesDetailDialogFragment implements AnonymousClass1TI {
    public DialogInterface.OnDismissListener A00;
    public View A01;
    public AnonymousClass1L9 A02;
    public AnonymousClass1KB A03;
    public LinkedDevicesSharedViewModel A04;
    public AnonymousClass11C A05;
    public AnonymousClass11P A06;
    public C88344Zh A07;
    public AnonymousClass1RK A08;
    public AnonymousClass1TH A09;
    public AnonymousClass4O6 A0A;
    public AnonymousClass129 A0B;
    public Boolean A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        if (r11 <= 3600000) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0116, code lost:
        if (r7 == false) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r25) {
        /*
            r5 = r25
            X.4Zh r1 = r5.A07
            if (r1 == 0) goto L_0x01b7
            X.1RK r0 = r5.A08
            com.whatsapp.jid.DeviceJid r1 = r1.A08
            java.util.Set r0 = r0.A0N
            boolean r21 = r0.contains(r1)
            X.4Zh r3 = r5.A07
            long r1 = r3.A01
            r13 = 0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r0 == 0) goto L_0x01a2
            r0 = 2131891663(0x7f1215cf, float:1.9418052E38)
            java.lang.String r7 = r5.A1H(r0)
        L_0x0025:
            X.4Zh r2 = r5.A07
            X.1FL r1 = r5.A1B()
            X.0ve r0 = r5.A02
            java.lang.String r10 = X.C88344Zh.A01(r1, r2, r0)
            X.4Zh r1 = r5.A07
            int r9 = X.C87404Vl.A00(r1)
            java.lang.String r8 = r1.A04
            r0 = 2
            X.783 r4 = new X.783
            r4.<init>(r5, r0)
            long r0 = r1.A01
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r2)
            if (r0 == 0) goto L_0x0199
            r6 = 0
        L_0x004a:
            X.4Zh r1 = r5.A07
            X.11P r0 = r5.A06
            long r11 = X.AnonymousClass11P.A01(r0)
            long r0 = r1.A01
            long r11 = r11 - r0
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r2)
            if (r0 == 0) goto L_0x0066
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r20 = 1
            if (r0 > 0) goto L_0x0068
        L_0x0066:
            r20 = 0
        L_0x0068:
            android.view.View r1 = r5.A01
            X.C17960vV.A05(r1)
            r0 = 2131429961(0x7f0b0a49, float:1.848161E38)
            android.widget.ImageView r15 = X.AnonymousClass3MW.A0G(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131429966(0x7f0b0a4e, float:1.848162E38)
            android.widget.TextView r14 = X.AnonymousClass3MW.A0J(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131435625(0x7f0b2069, float:1.8493097E38)
            android.view.View r13 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131435646(0x7f0b207e, float:1.849314E38)
            android.view.View r19 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131435709(0x7f0b20bd, float:1.8493268E38)
            android.widget.TextView r18 = X.AnonymousClass3MW.A0J(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131432179(0x7f0b12f3, float:1.8486108E38)
            android.view.View r12 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131432184(0x7f0b12f8, float:1.8486118E38)
            android.view.View r17 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131432195(0x7f0b1303, float:1.848614E38)
            android.widget.TextView r11 = X.AnonymousClass3MW.A0J(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131435970(0x7f0b21c2, float:1.8493797E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r2 = r5.A01
            r0 = 2131432214(0x7f0b1316, float:1.848618E38)
            android.widget.TextView r3 = X.AnonymousClass3MW.A0J(r2, r0)
            android.view.View r2 = r5.A01
            r0 = 2131429149(0x7f0b071d, float:1.8479963E38)
            android.view.View r16 = X.AnonymousClass1HF.A06(r2, r0)
            android.view.View r2 = r5.A01
            r0 = 2131432208(0x7f0b1310, float:1.8486167E38)
            com.whatsapp.TextEmojiLabel r2 = X.AnonymousClass3MX.A0V(r2, r0)
            r14.setText(r10)
            r15.setImageResource(r9)
            java.lang.Boolean r0 = r5.A0C
            r10 = 8
            r9 = 0
            if (r0 == 0) goto L_0x0182
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0182
            r13.setVisibility(r10)
        L_0x00ed:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x017e
            r12.setVisibility(r9)
            r0 = 2131891661(0x7f1215cd, float:1.9418048E38)
            java.lang.String r0 = X.AnonymousClass3MY.A0o(r5, r8, r9, r0)
            r11.setText(r0)
            r7 = 2131232552(0x7f080728, float:1.8081216E38)
            if (r21 == 0) goto L_0x0108
            r7 = 2131232551(0x7f080727, float:1.8081214E38)
        L_0x0108:
            r0 = r17
            r0.setBackgroundResource(r7)
        L_0x010d:
            java.lang.Boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0118
            boolean r7 = r0.booleanValue()
            r0 = 0
            if (r7 != 0) goto L_0x011a
        L_0x0118:
            r0 = 8
        L_0x011a:
            r1.setVisibility(r0)
            int r0 = X.C72453Mb.A0J(r20)
            r2.setVisibility(r0)
            if (r20 == 0) goto L_0x0168
            X.4Zh r0 = r5.A07
            if (r0 == 0) goto L_0x0168
            long r0 = r0.A01
            r11 = 0
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r7)
            if (r0 == 0) goto L_0x0168
            android.content.Context r13 = r5.A14()
            X.0ve r12 = r5.A02
            X.1KB r11 = r5.A03
            X.1L9 r8 = r5.A02
            X.11C r7 = r5.A05
            r14 = 2131891664(0x7f1215d0, float:1.9418054E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r1 = "learn-more"
            java.lang.String r24 = X.C17880vN.A0q(r13, r1, r0, r9, r14)
            X.129 r14 = r5.A0B
            java.lang.String r0 = "seeing-logout-is-pending"
            android.net.Uri r18 = r14.A04(r0)
            r23 = r12
            r25 = r1
            r17 = r13
            r19 = r8
            r20 = r11
            r21 = r2
            r22 = r7
            X.C26302CxJ.A0K(r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0168:
            if (r6 == 0) goto L_0x017a
            r3.setVisibility(r9)
            r3.setText(r6)
            r3.setOnClickListener(r4)
        L_0x0173:
            r1 = 4
            r0 = r16
            X.AnonymousClass3Ma.A1B(r0, r5, r1)
        L_0x0179:
            return
        L_0x017a:
            r3.setVisibility(r10)
            goto L_0x0173
        L_0x017e:
            r12.setVisibility(r10)
            goto L_0x010d
        L_0x0182:
            r13.setVisibility(r9)
            r0 = r18
            r0.setText(r7)
            r7 = 2131232552(0x7f080728, float:1.8081216E38)
            if (r21 == 0) goto L_0x0192
            r7 = 2131232551(0x7f080727, float:1.8081214E38)
        L_0x0192:
            r0 = r19
            r0.setBackgroundResource(r7)
            goto L_0x00ed
        L_0x0199:
            r0 = 2131891819(0x7f12166b, float:1.9418369E38)
            java.lang.String r6 = r5.A1H(r0)
            goto L_0x004a
        L_0x01a2:
            X.0vb r2 = r5.A01
            long r0 = r3.A00
            if (r21 == 0) goto L_0x01b1
            r0 = 2131891651(0x7f1215c3, float:1.9418028E38)
            java.lang.String r7 = r2.A09(r0)
            goto L_0x0025
        L_0x01b1:
            java.lang.String r7 = X.C64052u8.A05(r2, r0)
            goto L_0x0025
        L_0x01b7:
            X.4O6 r0 = r5.A0A
            if (r0 == 0) goto L_0x0179
            android.content.Context r0 = r5.A1n()
            X.C17960vV.A07(r0)
            X.4O6 r0 = r5.A0A
            int r0 = r0.A01
            java.lang.String r10 = r5.A1H(r0)
            X.4O6 r0 = r5.A0A
            int r9 = r0.A00
            X.0vb r8 = r5.A01
            long r6 = r0.A02
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r6
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01f8
            r0 = 2131891651(0x7f1215c3, float:1.9418028E38)
            java.lang.String r7 = r8.A09(r0)
        L_0x01e4:
            r0 = 3
            X.783 r4 = new X.783
            r4.<init>(r5, r0)
            r0 = 2131897318(0x7f122be6, float:1.9429522E38)
            java.lang.String r6 = r5.A1H(r0)
            r20 = 0
            r21 = 1
            r8 = 0
            goto L_0x0068
        L_0x01f8:
            java.lang.String r7 = X.C64052u8.A05(r8, r6)
            goto L_0x01e4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment.A00(com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r1 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r7) {
        /*
            r6 = this;
            java.util.Map r7 = (java.util.Map) r7
            X.4Zh r5 = r6.A07
            if (r5 == 0) goto L_0x002d
            long r3 = r5.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r0 != 0) goto L_0x002d
            com.whatsapp.jid.DeviceJid r0 = r5.A08
            java.lang.Object r0 = r7.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0023
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0C = r0
            A00(r6)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment.accept(java.lang.Object):void");
    }

    public Dialog A27(Bundle bundle) {
        this.A01 = LayoutInflater.from(A1n()).inflate(2131625828, (ViewGroup) null, false);
        this.A0C = null;
        this.A09.A05(this, this.A03.A05);
        A00(this);
        C73203Rj A022 = AnonymousClass4a6.A02(this);
        A022.A0c(this.A01);
        return A022.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.A09.A00.A02(this);
    }
}
