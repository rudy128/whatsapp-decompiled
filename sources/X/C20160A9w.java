package X;

import android.content.DialogInterface;

/* renamed from: X.A9w  reason: case insensitive filesystem */
public class C20160A9w implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public C20160A9w(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C20160A9w A00(Object obj, int i) {
        return new C20160A9w(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        r1.overridePendingTransition(0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        r2.BiI(r3, r4, r5, r6 ? 1 : 0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDismiss(android.content.DialogInterface r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0112;
                case 1: goto L_0x0005;
                case 2: goto L_0x010a;
                case 3: goto L_0x000c;
                case 4: goto L_0x00ff;
                case 5: goto L_0x00f7;
                case 6: goto L_0x0022;
                case 7: goto L_0x0005;
                case 8: goto L_0x00ef;
                case 9: goto L_0x0014;
                case 10: goto L_0x00ef;
                case 11: goto L_0x00ef;
                case 12: goto L_0x00e4;
                case 13: goto L_0x00da;
                case 14: goto L_0x00da;
                case 15: goto L_0x0005;
                case 16: goto L_0x00c3;
                case 17: goto L_0x00b9;
                case 18: goto L_0x0005;
                case 19: goto L_0x00a0;
                case 20: goto L_0x008b;
                case 21: goto L_0x007f;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x006b;
                case 25: goto L_0x005a;
                case 26: goto L_0x005f;
                case 27: goto L_0x005a;
                case 28: goto L_0x000d;
                case 29: goto L_0x0050;
                case 30: goto L_0x00ef;
                case 31: goto L_0x00e4;
                case 32: goto L_0x0048;
                case 33: goto L_0x0040;
                case 34: goto L_0x0038;
                case 35: goto L_0x0030;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0009:
            r0.finish()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r8.A01
            X.Aa6 r0 = (X.C20828Aa6) r0
            X.1FY r0 = r0.A01
            goto L_0x0009
        L_0x0014:
            java.lang.Object r1 = r8.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A1b()
            if (r0 == 0) goto L_0x000c
            r1.A29()
            return
        L_0x0022:
            java.lang.Object r0 = r8.A01
            X.9YW r0 = (X.AnonymousClass9YW) r0
            if (r0 == 0) goto L_0x000c
            com.whatsapp.payments.ui.IndiaUpiQrTabActivity r0 = r0.A00
            com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment r1 = r0.A0B
            r0 = 1
            r1.A0E = r0
            return
        L_0x0030:
            java.lang.Object r0 = r8.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1i(r0)
            return
        L_0x0038:
            java.lang.Object r1 = r8.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r1 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r1
            r0 = 0
            r1.A09 = r0
            return
        L_0x0040:
            java.lang.Object r1 = r8.A01
            com.whatsapp.registration.phonenumberentry.RegisterPhone r1 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r1
            r0 = 0
            r1.A0A = r0
            return
        L_0x0048:
            java.lang.Object r0 = r8.A01
            X.990 r0 = (X.AnonymousClass990) r0
            r0.C2J()
            return
        L_0x0050:
            java.lang.Object r0 = r8.A01
            X.AXN r0 = (X.AXN) r0
            java.lang.Object r0 = r0.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x005a:
            java.lang.Object r1 = r8.A01
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x0066
        L_0x005f:
            java.lang.Object r1 = r8.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
        L_0x0066:
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x006b:
            java.lang.Object r0 = r8.A01
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.8GO r2 = r0.A06
            boolean r0 = r2.A02
            r1 = 0
            if (r0 != 0) goto L_0x007c
            X.1wy r0 = r2.A00
            X.C187449fp.A00(r0, r1)
            return
        L_0x007c:
            r2.A02 = r1
            return
        L_0x007f:
            java.lang.Object r1 = r8.A01
            X.91U r1 = (X.AnonymousClass91U) r1
            r0 = 7
            r1.A01 = r0
            r0 = 0
            r1.A4l(r0)
            return
        L_0x008b:
            java.lang.Object r1 = r8.A01
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.8GL r0 = r1.A03
            X.AnonymousClass8GL.A03(r0)
            X.AZ6 r2 = r1.A0S
            java.lang.Integer r3 = X.C17880vN.A0j()
            java.lang.String r5 = r1.A04
            r6 = 1
            java.lang.String r4 = "decline_mandate_dialogue"
            goto L_0x00d5
        L_0x00a0:
            java.lang.Object r1 = r8.A01
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.8GL r0 = r1.A03
            X.AnonymousClass8GL.A03(r0)
            X.AZ6 r0 = r1.A0S
            java.lang.Integer r1 = X.C17880vN.A0j()
            java.lang.String r3 = "payment_transaction_details"
            r4 = 1
            java.lang.String r2 = "approve_mandate_update_request_prompt"
            r5 = r4
            r0.BiI(r1, r2, r3, r4, r5)
            return
        L_0x00b9:
            java.lang.Object r0 = r8.A01
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            X.8GL r0 = r0.A03
            X.AnonymousClass8GL.A03(r0)
            return
        L_0x00c3:
            java.lang.Object r0 = r8.A01
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            r0.finish()
            X.AZ6 r2 = r0.A0S
            java.lang.Integer r3 = X.C17880vN.A0j()
            java.lang.String r5 = r0.A04
            r6 = 1
            java.lang.String r4 = "approve_mandate_prompt"
        L_0x00d5:
            r7 = r6
            r2.BiI(r3, r4, r5, r6, r7)
            return
        L_0x00da:
            java.lang.Object r1 = r8.A01
            X.933 r1 = (X.AnonymousClass933) r1
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r1.A0B
            r1.A5H(r0)
            return
        L_0x00e4:
            java.lang.Object r0 = r8.A01
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r0 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r0
            com.whatsapp.CodeInputField r1 = r0.A04
            r0 = 0
            r1.setText(r0)
            return
        L_0x00ef:
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x00f7:
            java.lang.Object r0 = r8.A01
            com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity r0 = (com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity) r0
            r0.A5D()
            return
        L_0x00ff:
            java.lang.Object r0 = r8.A01
            com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity r0 = (com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity) r0
            com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity.A03(r0)
            r0.finish()
            return
        L_0x010a:
            java.lang.Object r0 = r8.A01
            X.8kf r0 = (X.C169258kf) r0
            r0.A4b()
            return
        L_0x0112:
            java.lang.Object r1 = r8.A01
            X.9sN r1 = (X.C194839sN) r1
            java.lang.String r0 = "on_dismiss"
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20160A9w.onDismiss(android.content.DialogInterface):void");
    }
}
