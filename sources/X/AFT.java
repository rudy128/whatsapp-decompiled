package X;

import android.view.View;

public class AFT implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AFT(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AFT(obj, obj2, i));
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [X.9yu, X.96D] */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.9yu, X.96D] */
    /* JADX WARNING: type inference failed for: r1v68, types: [X.9mV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v41, types: [X.9NW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v192, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        if (r0.length() == 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0b04, code lost:
        r5.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0b07, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0b13, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0b17, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0bce, code lost:
        r4 = new X.C198789yu(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0be2, code lost:
        r4.A05 = r1;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0bf5, code lost:
        r0 = r2.A08;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0bf7, code lost:
        r0.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0bfa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r24) {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A00
            r7 = r24
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0438;
                case 2: goto L_0x0072;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00ff;
                case 7: goto L_0x0113;
                case 8: goto L_0x0138;
                case 9: goto L_0x055e;
                case 10: goto L_0x056c;
                case 11: goto L_0x059a;
                case 12: goto L_0x062c;
                case 13: goto L_0x063c;
                case 14: goto L_0x06c6;
                case 15: goto L_0x03f8;
                case 16: goto L_0x06f6;
                case 17: goto L_0x070b;
                case 18: goto L_0x017e;
                case 19: goto L_0x071f;
                case 20: goto L_0x07ff;
                case 21: goto L_0x080b;
                case 22: goto L_0x0880;
                case 23: goto L_0x0910;
                case 24: goto L_0x01a7;
                case 25: goto L_0x01cf;
                case 26: goto L_0x0adc;
                case 27: goto L_0x0961;
                case 28: goto L_0x0992;
                case 29: goto L_0x0009;
                case 30: goto L_0x0009;
                case 31: goto L_0x09b2;
                case 32: goto L_0x09f7;
                case 33: goto L_0x0230;
                case 34: goto L_0x0b18;
                case 35: goto L_0x0b30;
                case 36: goto L_0x0b45;
                case 37: goto L_0x0bb9;
                case 38: goto L_0x0bc4;
                case 39: goto L_0x0bd4;
                case 40: goto L_0x0be5;
                case 41: goto L_0x0258;
                case 42: goto L_0x030d;
                case 43: goto L_0x0350;
                case 44: goto L_0x035c;
                case 45: goto L_0x0a5d;
                case 46: goto L_0x0a73;
                case 47: goto L_0x0a85;
                case 48: goto L_0x03cc;
                case 49: goto L_0x0a9d;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r6 = r1.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity r6 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity) r6
            java.lang.Object r5 = r1.A02
            android.content.Intent r5 = (android.content.Intent) r5
            r4 = 1
            X.C18070vi.A0d(r5, r4)
            X.AZ6 r3 = r6.A02
            if (r3 == 0) goto L_0x0b11
            java.lang.Integer r2 = X.C17880vN.A0l()
            java.lang.String r1 = X.AnonymousClass8BX.A0Y(r6)
            java.lang.String r0 = "alias_intro"
            r3.BiL(r2, r0, r1, r4)
            r6.A3q(r5, r4)
        L_0x0029:
            return
        L_0x002a:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r6 = r1.A01
            X.1f4 r6 = (X.C31131f4) r6
            X.22l r2 = r6.A01()
            if (r2 == 0) goto L_0x0029
            X.205 r0 = r2.A0v
            X.1BI r5 = r0.A00
            if (r5 == 0) goto L_0x0029
            java.lang.Object r0 = r1.A02
            X.00H r0 = (X.AnonymousClass00H) r0
            java.lang.Object r0 = r0.get()
            X.1f7 r0 = (X.C31161f7) r0
            r0.A00 = r2
            r0.A02(r5)
            android.content.Context r4 = X.AnonymousClass3MY.A04(r7)
            X.1LU r1 = new X.1LU
            r1.<init>()
            long r2 = r2.A0x
            r0 = 0
            android.content.Intent r1 = r1.A1x(r4, r5, r0)
            java.lang.String r0 = "row_id"
            r1.putExtra(r0, r2)
            r4.startActivity(r1)
            X.7Mo r1 = r6.A00()
            if (r1 == 0) goto L_0x0029
            int r0 = r1.A03
            int r0 = r0 + 1
            r1.A03 = r0
            return
        L_0x0072:
            java.lang.Object r6 = r1.A01
            X.8pD r6 = (X.AnonymousClass8pD) r6
            java.lang.Object r5 = r1.A02
            com.whatsapp.payments.ui.BusinessHubActivity r5 = (com.whatsapp.payments.ui.BusinessHubActivity) r5
            r4 = 0
            java.lang.String r0 = r6.A01()
            if (r0 == 0) goto L_0x0089
            int r0 = r0.length()
            r3 = 109(0x6d, float:1.53E-43)
            if (r0 != 0) goto L_0x008b
        L_0x0089:
            r3 = 110(0x6e, float:1.54E-43)
        L_0x008b:
            X.0vl r1 = r5.A0E
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r0
            r2 = 0
            r0.A0T(r3)
            r1.getValue()
            java.lang.String r0 = r6.A01()
            if (r0 != 0) goto L_0x00b4
            X.AEs r0 = r6.A00
            if (r0 == 0) goto L_0x0029
            X.8pb r1 = r0.A08
            if (r1 == 0) goto L_0x0029
            boolean r0 = r1 instanceof X.AnonymousClass8pX
            if (r0 == 0) goto L_0x0029
            X.8pX r1 = (X.AnonymousClass8pX) r1
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = r1.A0B
            if (r0 == 0) goto L_0x0029
        L_0x00b4:
            android.content.Intent r0 = X.AnonymousClass1LU.A1c(r5, r0, r2, r2, r4)
            r5.startActivity(r0)
            return
        L_0x00bc:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r1 = r1.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = (com.whatsapp.payments.ui.PaymentBottomSheet) r1
            if (r1 == 0) goto L_0x0029
            X.BCz r0 = r0.A0H
            if (r0 == 0) goto L_0x0029
            r0.C0G(r1)
            return
        L_0x00ce:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.ConfirmPaymentFragment r3 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r3
            java.lang.Object r2 = r1.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = (com.whatsapp.payments.ui.PaymentBottomSheet) r2
            if (r2 == 0) goto L_0x0029
            X.BCz r0 = r3.A0H
            if (r0 == 0) goto L_0x0029
            r0 = 2131433527(0x7f0b1837, float:1.8488842E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r7, r0)
            com.whatsapp.payments.ui.widget.PaymentDescriptionRow r1 = (com.whatsapp.payments.ui.widget.PaymentDescriptionRow) r1
            X.BCz r0 = r3.A0H
            r0.C95(r2, r1)
            return
        L_0x00eb:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r2 = r1.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = (com.whatsapp.payments.ui.PaymentBottomSheet) r2
            if (r2 == 0) goto L_0x0029
            X.BCz r1 = r0.A0H
            if (r1 == 0) goto L_0x0029
            int r0 = r0.A01
            r1.C0O(r2, r0)
            return
        L_0x00ff:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r2 = r1.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = (com.whatsapp.payments.ui.PaymentBottomSheet) r2
            if (r2 == 0) goto L_0x0029
            X.BCz r1 = r0.A0H
            if (r1 == 0) goto L_0x0029
            int r0 = r0.A00
            r1.C0M(r2, r0)
            return
        L_0x0113:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.ConfirmPaymentFragment r2 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r2
            java.lang.Object r4 = r1.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            if (r4 == 0) goto L_0x0029
            X.BCz r3 = r2.A0H
            if (r3 == 0) goto L_0x0029
            java.lang.Integer r1 = r2.A0O
            if (r1 == 0) goto L_0x0029
            X.ADQ r0 = r2.A0J
            if (r0 == 0) goto L_0x0029
            java.util.List r2 = r2.A0R
            X.C17960vV.A07(r2)
            int r1 = r1.intValue()
            int r0 = r0.A00
            r3.Bw1(r4, r2, r1, r0)
            return
        L_0x0138:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.ConfirmPaymentFragment r5 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r5
            java.lang.Object r11 = r1.A02
            X.AEs r11 = (X.C20284AEs) r11
            X.BCz r6 = r5.A0H
            if (r6 == 0) goto L_0x0029
            X.8pI r10 = r5.A0B
            if (r10 == 0) goto L_0x014d
            int r0 = r5.A01
            r10.A0A(r0)
        L_0x014d:
            android.widget.ProgressBar r8 = r5.A06
            java.lang.Integer r2 = r5.A0O
            if (r2 == 0) goto L_0x017c
            java.util.List r1 = r5.A0R
            if (r1 == 0) goto L_0x017c
            X.ADQ r0 = r5.A0J
            if (r0 == 0) goto L_0x017c
            int r0 = r2.intValue()
            java.lang.Object r4 = r1.get(r0)
            X.ADw r4 = (X.C20264ADw) r4
            X.ADQ r0 = r5.A0J
            int r3 = r0.A00
            int r2 = r4.A00
            X.ARR r1 = r4.A01
            X.ARR r0 = r4.A02
            X.AEh r9 = new X.AEh
            r9.<init>(r1, r0, r3, r2)
        L_0x0174:
            androidx.fragment.app.Fragment r12 = r5.A0E
            com.whatsapp.payments.ui.PaymentBottomSheet r12 = (com.whatsapp.payments.ui.PaymentBottomSheet) r12
            r6.BpZ(r7, r8, r9, r10, r11, r12)
            return
        L_0x017c:
            r9 = 0
            goto L_0x0174
        L_0x017e:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r3
            java.lang.Object r2 = r1.A02
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            r1 = r2
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            r1.setOnDismissListener(r0)
            r2.dismiss()
            X.96K r3 = r3.A08
            X.9NU r0 = r3.A06
            if (r0 == 0) goto L_0x0029
            java.lang.String r2 = r3.A0B
            X.205 r0 = r3.A07
            X.9BU r1 = new X.9BU
            r1.<init>(r3, r0, r2)
            r3.A04 = r1
            X.10I r0 = r3.A0l
            X.C17890vO.A0u(r1, r0)
            return
        L_0x01a7:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment r4 = (com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment) r4
            java.lang.Object r5 = r1.A02
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            android.widget.ProgressBar r0 = r4.A00
            if (r0 == 0) goto L_0x0b0e
            int r0 = r0.getVisibility()
            java.lang.String r3 = "enter_dob"
            java.lang.Integer r2 = X.C17880vN.A0j()
            r1 = 1
            if (r0 != 0) goto L_0x01c9
            java.lang.String r0 = "confirm_dob_in_progress_prompt"
            r4.A26(r2, r0, r3, r1)
        L_0x01c5:
            if (r5 == 0) goto L_0x0029
            goto L_0x0b04
        L_0x01c9:
            java.lang.String r0 = "confirm_legal_name_in_progress_prompt"
            r4.A26(r2, r3, r0, r1)
            goto L_0x01c5
        L_0x01cf:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment r3 = (com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment) r3
            java.lang.Object r5 = r1.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r5 = (com.whatsapp.payments.ui.PaymentBottomSheet) r5
            r6 = 0
            r4 = 1
            X.C18070vi.A0d(r5, r4)
            X.1FL r1 = r3.A1B()
            if (r1 == 0) goto L_0x022e
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r0)
        L_0x01e8:
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            if (r1 == 0) goto L_0x01f7
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0E
            if (r0 == 0) goto L_0x0ad0
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r6)
        L_0x01f7:
            java.lang.String r1 = "confirm_legal_name_in_progress_prompt"
            java.lang.String r2 = "enter_name"
            r0 = 0
            r3.A27(r0, r1, r2, r6)
            r3.A28(r6)
            android.widget.LinearLayout r1 = r3.A01
            if (r1 == 0) goto L_0x0acd
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ProgressBar r0 = r3.A02
            if (r0 == 0) goto L_0x0b0e
            r0.setVisibility(r6)
            X.BBU r1 = r3.A0A
            if (r1 == 0) goto L_0x0220
            com.whatsapp.WaEditText r0 = r3.A05
            if (r0 == 0) goto L_0x0aca
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            r1.Bq9(r5, r0)
        L_0x0220:
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.BrazilHostedPaymentPageLegalNameBottomSheetFragment
            if (r0 == 0) goto L_0x0029
            java.lang.Integer r1 = X.C17880vN.A0l()
            java.lang.String r0 = "order_details"
            r3.A27(r1, r2, r0, r4)
            return
        L_0x022e:
            r1 = 0
            goto L_0x01e8
        L_0x0230:
            java.lang.Object r3 = r1.A01
            X.8G9 r3 = (X.AnonymousClass8G9) r3
            java.lang.Object r1 = r1.A02
            X.8pX r1 = (X.AnonymousClass8pX) r1
            java.lang.String r0 = r1.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0029
            r0 = 3
            X.9NW r4 = new X.9NW
            r4.<init>()
            r4.A01 = r0
            java.lang.String r2 = r1.A0C
            java.lang.String r1 = "[^\\d]"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.replaceAll(r1, r0)
            r4.A04 = r0
            X.1wy r0 = r3.A03
            goto L_0x0bf7
        L_0x0258:
            java.lang.Object r2 = r1.A01
            X.9bh r2 = (X.C184899bh) r2
            java.lang.Object r6 = r1.A02
            X.A5C r6 = (X.A5C) r6
            int r1 = r6.A01
            r0 = 1
            if (r1 != r0) goto L_0x02b4
            com.whatsapp.payments.ui.PaymentSettingsFragment r4 = r2.A00
            X.1QS r0 = r4.A0a
            X.9uQ r3 = X.AnonymousClass8BU.A0O(r0)
            if (r3 == 0) goto L_0x028e
            X.0ve r2 = r3.A07
            r1 = 979(0x3d3, float:1.372E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x028e
            X.1FL r0 = r4.A1D()
            X.05w r0 = r3.A02(r0)
            r0.show()
        L_0x0286:
            X.BBb r0 = r6.A09
            if (r0 == 0) goto L_0x0029
            r0.Bqc()
            return
        L_0x028e:
            X.8GH r0 = r4.A0h
            java.lang.String r1 = "incentive_banner"
            if (r0 == 0) goto L_0x029e
            boolean r0 = r0.A0b()
            if (r0 != 0) goto L_0x029e
            r4.A2M(r1)
            goto L_0x0286
        L_0x029e:
            X.00H r0 = r4.A0o
            boolean r0 = X.C72463Mc.A1W(r0)
            if (r0 != 0) goto L_0x02b0
            r1 = 2131894319(0x7f12202f, float:1.942344E38)
            r0 = 2131894318(0x7f12202e, float:1.9423437E38)
            X.AnonymousClass74O.A0F(r4, r1, r0)
            goto L_0x0286
        L_0x02b0:
            r4.A2N(r1)
            goto L_0x0286
        L_0x02b4:
            if (r1 != 0) goto L_0x02c0
            com.whatsapp.payments.ui.PaymentSettingsFragment r1 = r2.A00
            java.lang.String r0 = r1.A2H()
            r1.A2M(r0)
            goto L_0x0286
        L_0x02c0:
            r0 = 2
            if (r1 != r0) goto L_0x0306
            X.5YR r5 = r6.A0D
            if (r5 == 0) goto L_0x0306
            com.whatsapp.payments.ui.PaymentSettingsFragment r4 = r2.A00
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x0286
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r4 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r4
            X.Ai4 r5 = (X.C21319Ai4) r5
            X.9gz r0 = r5.A07
            if (r0 == 0) goto L_0x0286
            X.9fz r3 = r0.A01
            if (r3 == 0) goto L_0x0286
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0286
            X.1i4 r1 = r4.A0E
            android.net.Uri r0 = android.net.Uri.parse(r0)
            int r0 = r1.A0E(r0)
            switch(r0) {
                case 119: goto L_0x0302;
                case 120: goto L_0x0302;
                case 121: goto L_0x0302;
                case 122: goto L_0x0302;
                case 123: goto L_0x0302;
                case 124: goto L_0x0302;
                case 125: goto L_0x0302;
                case 126: goto L_0x0302;
                case 127: goto L_0x0302;
                case 128: goto L_0x02ea;
                case 129: goto L_0x02ea;
                case 130: goto L_0x02ea;
                case 131: goto L_0x02ea;
                case 132: goto L_0x0302;
                case 133: goto L_0x0302;
                case 134: goto L_0x0302;
                case 135: goto L_0x0302;
                case 136: goto L_0x0302;
                default: goto L_0x02ea;
            }
        L_0x02ea:
            X.00H r0 = r4.A0b
            java.lang.Object r2 = r0.get()
            X.9iw r2 = (X.C189349iw) r2
            android.content.Context r1 = r4.A14()
            X.9ZF r0 = r5.A06
            if (r0 == 0) goto L_0x0300
            java.util.Map r0 = r0.A00
        L_0x02fc:
            r2.A00(r1, r3, r0)
            goto L_0x0286
        L_0x0300:
            r0 = 0
            goto L_0x02fc
        L_0x0302:
            r4.A2J(r0)
            goto L_0x0286
        L_0x0306:
            java.lang.String r0 = "PAY: banner configuration not supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0286
        L_0x030d:
            java.lang.Object r2 = r1.A01
            X.9bh r2 = (X.C184899bh) r2
            java.lang.Object r0 = r1.A02
            X.A5C r0 = (X.A5C) r0
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0ad3
            com.whatsapp.payments.ui.PaymentSettingsFragment r3 = r2.A00
            r3.A2H()
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x0029
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r3
            X.0ve r2 = r3.A02
            r1 = 7964(0x1f1c, float:1.116E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x033d
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r0 = r3.A0Y
            X.C17960vV.A07(r0)
            int r1 = r0.A0c()
            r0 = 9
            if (r1 != r0) goto L_0x0029
        L_0x033d:
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r1 = com.whatsapp.languageselector.LanguageSelectorBottomSheet.A00()
            X.9bd r0 = new X.9bd
            r0.<init>(r1, r3)
            r1.A08 = r0
            X.1GP r0 = r3.A1E()
            X.C20098A7b.A01(r1, r0)
            return
        L_0x0350:
            java.lang.Object r0 = r1.A01
            X.A5C r0 = (X.A5C) r0
            X.BBb r0 = r0.A09
            if (r0 == 0) goto L_0x0029
            r0.Bp8()
            return
        L_0x035c:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.widget.PaymentView r3 = (com.whatsapp.payments.ui.widget.PaymentView) r3
            java.lang.Object r2 = r1.A02
            X.5ai r2 = (X.C107845ai) r2
            X.9p9 r0 = r3.A0r
            r0.A00()
            X.74J r0 = X.AnonymousClass96c.A07(r3)
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r0.A0E
            if (r0 == 0) goto L_0x037e
            r2 = 0
            X.74J r1 = X.AnonymousClass96c.A07(r3)
            java.lang.Integer r0 = X.C108955ca.A0h()
            r1.A0O(r0, r2)
            return
        L_0x037e:
            android.widget.LinearLayout r0 = r3.A0D
            int r1 = r0.getHeight()
            android.widget.LinearLayout r0 = r3.A0B
            int r1 = X.AnonymousClass3MW.A02(r0, r1)
            com.google.android.material.tabs.TabLayout r0 = r3.A0M
            int r1 = X.AnonymousClass3MW.A02(r0, r1)
            X.AQ4 r0 = r3.A0m
            android.view.View r0 = r0.A01
            int r1 = X.AnonymousClass3MW.A02(r0, r1)
            X.74J r0 = X.AnonymousClass96c.A07(r3)
            r0.A0K(r1)
            X.74J r0 = X.AnonymousClass96c.A07(r3)
            r0.A0N(r2)
            X.74J r1 = X.AnonymousClass96c.A07(r3)
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r1.A0E
            if (r0 == 0) goto L_0x03b0
            r0.A0M = r3
        L_0x03b0:
            r1.A0H = r3
            X.74J r1 = X.AnonymousClass96c.A07(r3)
            X.ARx r0 = new X.ARx
            r0.<init>(r3)
            r1.A0C = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = r3.A0K
            if (r2 == 0) goto L_0x0029
            r1 = 8
            X.AkF r0 = new X.AkF
            r0.<init>(r3, r1)
            r2.post(r0)
            return
        L_0x03cc:
            java.lang.Object r2 = r1.A01
            X.8J1 r2 = (X.AnonymousClass8J1) r2
            java.lang.Object r1 = r1.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            java.util.List r0 = X.C42011xT.A0I
            X.B5k r3 = r2.A0A
            com.whatsapp.polls.results.PollResultsActivity r3 = (com.whatsapp.polls.results.PollResultsActivity) r3
            X.1BI r2 = r1.A0J
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0029
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            if (r2 == 0) goto L_0x0029
            X.00H r0 = r3.A0F
            if (r0 == 0) goto L_0x0ad9
            r0.get()
            java.lang.Integer r1 = X.C17880vN.A0j()
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass1LU.A1D(r3, r2, r1, r0, r0)
            r3.startActivity(r0)
            return
        L_0x03f8:
            java.lang.Object r6 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPayNumberContactPickerFragment r6 = (com.whatsapp.payments.ui.IndiaUpiPayNumberContactPickerFragment) r6
            java.lang.Object r5 = r1.A02
            X.9hR r5 = (X.C188449hR) r5
            r4 = 1
            X.C18070vi.A0d(r5, r4)
            X.AZ6 r3 = r6.A02
            r0 = 202(0xca, float:2.83E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "pay_number_contact_picker"
            java.lang.String r0 = r6.A07
            r3.BiL(r2, r1, r0, r4)
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0434
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPayNumberContactPickerViewModel r1 = r6.A00
            if (r1 != 0) goto L_0x041f
            java.lang.String r0 = "viewModel"
            goto L_0x0b13
        L_0x041f:
            X.1FL r3 = r6.A1D()
            r7 = 0
            X.9mR r2 = r1.A04
            X.77e r6 = r5.A03
            r0 = 5
            X.AOI r4 = new X.AOI
            r4.<init>(r1, r5, r0)
            r5 = 0
            r8 = r7
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x0434:
            com.whatsapp.payments.ui.IndiaUpiPayNumberContactPickerFragment.A00(r6, r5)
            return
        L_0x0438:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet r0 = (com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet) r0
            java.lang.Object r2 = r1.A02
            X.1OS r2 = (X.AnonymousClass1OS) r2
            r3 = 0
            r5 = 1
            X.C18070vi.A0d(r2, r5)
            X.1FL r1 = r0.A1B()
            boolean r1 = r1 instanceof X.B5P
            r12 = 0
            if (r1 == 0) goto L_0x0452
            X.A9t r1 = r0.A05
            r1.A00 = r12
        L_0x0452:
            X.8Gd r8 = r0.A06
            if (r8 == 0) goto L_0x04c8
            X.A6X r9 = r0.A08
            if (r9 == 0) goto L_0x0558
            X.1BI r10 = r0.A04
            java.lang.String r14 = "hpp"
            X.0ve r6 = r8.A06
            r4 = 8038(0x1f66, float:1.1264E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r6, r4)
            if (r1 == 0) goto L_0x04c8
            X.1DS r1 = r8.A03
            java.lang.Object r1 = r1.A06()
            X.9xu r1 = (X.C198179xu) r1
            r7 = 0
            if (r1 == 0) goto L_0x04d2
            java.lang.Object r1 = r1.A01
            X.A2J r1 = (X.A2J) r1
            if (r1 == 0) goto L_0x04d2
            X.21K r6 = r1.A05
            if (r6 == 0) goto L_0x04d3
            r1 = r6
            X.206 r1 = (X.AnonymousClass206) r1
            int r4 = r1.A0u
            X.AEt r1 = r6.BPK()
            if (r1 == 0) goto L_0x048c
            X.AEn r7 = r1.A02
        L_0x048c:
            if (r10 == 0) goto L_0x04c8
            if (r7 == 0) goto L_0x04c8
            java.lang.String r1 = r7.A05
            if (r1 == 0) goto L_0x049a
            int r1 = r1.length()
            if (r1 != 0) goto L_0x04b0
        L_0x049a:
            java.lang.String r1 = X.C17890vO.A0Q()
            r7.A05 = r1
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.protocol.FMessage"
            X.C18070vi.A0z(r6, r1)
            r1 = r6
            X.206 r1 = (X.AnonymousClass206) r1
            X.205 r1 = r1.A0v
            X.C18070vi.A0X(r1)
            r8.CQb(r7, r1, r6)
        L_0x04b0:
            X.AEt r11 = r6.BPK()
            java.lang.String r13 = r7.A05
            r16 = 5
            r21 = r5
            r18 = r5
            r19 = r3
            r15 = r12
            r20 = r5
            r22 = r3
            r17 = r4
            r9.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x04c8:
            com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel r11 = r0.A07
            if (r11 != 0) goto L_0x04d5
            java.lang.String r0 = "brazilHostedPaymentPageViewModel"
            X.C18070vi.A11(r0)
            throw r12
        L_0x04d2:
            r6 = r7
        L_0x04d3:
            r4 = -1
            goto L_0x048c
        L_0x04d5:
            X.1BI r10 = r0.A04
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r10, r1)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            X.ARR r9 = r0.A02
            X.C17960vV.A07(r9)
            X.C18070vi.A0X(r9)
            java.lang.String r7 = r0.A0C
            X.C17960vV.A07(r7)
            X.C18070vi.A0X(r7)
            java.lang.String r6 = r0.A0B
            X.C17960vV.A07(r6)
            X.C18070vi.A0X(r6)
            java.lang.String r5 = r0.A0D
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x0500
            java.lang.Long r12 = X.C108965cb.A0m(r0)
        L_0x0500:
            X.C18070vi.A0d(r10, r3)
            r1 = 1
            X.1DT r0 = r11.A00
            X.AnonymousClass3MX.A1J(r0, r1)
            X.AXR r0 = r11.A04
            X.9kd r4 = r0.A00
            monitor-enter(r4)
            android.content.SharedPreferences r1 = r4.A00     // Catch:{ all -> 0x0555 }
            if (r1 != 0) goto L_0x051c
            X.0vc r1 = r4.A01     // Catch:{ all -> 0x0555 }
            java.lang.String r0 = "com.whatsapp_br_payment_preferences"
            android.content.SharedPreferences r1 = r1.A05(r0)     // Catch:{ all -> 0x0555 }
            r4.A00 = r1     // Catch:{ all -> 0x0555 }
        L_0x051c:
            monitor-exit(r4)
            java.lang.String r0 = "br_p2m_hpp_tos_accepted"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0535
            X.A2C r0 = r11.A06
            X.AYp r8 = new X.AYp
            r13 = r7
            r14 = r6
            r15 = r5
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.A01(r8)
            return
        L_0x0535:
            X.1ex r4 = r11.A05
            java.lang.String r1 = "br_pay_tos"
            X.9Ec r0 = new X.9Ec
            r0.<init>(r1, r3)
            java.util.List r1 = X.C18070vi.A0M(r0)
            X.9Eo r0 = new X.9Eo
            r0.<init>(r1, r3)
            X.AXM r8 = new X.AXM
            r13 = r7
            r14 = r6
            r15 = r5
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A0F(r8, r0)
            return
        L_0x0555:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0558:
            java.lang.String r0 = "orderDetailsMessageLogging"
            X.C18070vi.A11(r0)
            throw r12
        L_0x055e:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.ConfirmReceivePaymentFragment r3 = (com.whatsapp.payments.ui.ConfirmReceivePaymentFragment) r3
            java.lang.Object r2 = r1.A02
            X.Af0 r1 = r3.A00
            r0 = 13
            X.C21133Af1.A00(r1, r2, r3, r0)
            return
        L_0x056c:
            java.lang.Object r4 = r1.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            java.lang.Object r3 = r1.A02
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            X.1FL r0 = r4.A1B()
            android.content.Intent r2 = X.AnonymousClass8BS.A03(r0)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_add_card"
            r2.putExtra(r1, r0)
            java.util.HashMap r1 = X.C17880vN.A11()
            java.lang.String r0 = "screen_params"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "p2p_context"
            X.AnonymousClass8k7.A03(r2, r1, r0)
            r4.A1k(r2)
            r3.A28()
            return
        L_0x059a:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.ConfirmReceivePaymentFragment r3 = (com.whatsapp.payments.ui.ConfirmReceivePaymentFragment) r3
            java.lang.Object r0 = r1.A02
            X.AEs r0 = (X.C20284AEs) r0
            androidx.fragment.app.Fragment r4 = r3.A0E
            com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment r3 = (com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment) r3
            java.lang.String r2 = r0.A0A
            X.1KB r5 = r3.A00
            r1 = 0
            r0 = 2131893634(0x7f121d82, float:1.942205E38)
            r5.A07(r1, r0)
            X.1QO r0 = r3.A0A
            X.0ve r5 = r0.A02
            r1 = 2984(0xba8, float:4.181E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x05f5
            X.1KB r0 = r3.A00
            r0.A04()
            X.1QS r0 = r3.A02
            X.1KH r0 = X.AnonymousClass8BR.A0R(r0)
            X.AEs r0 = r0.A08(r2)
            X.C17960vV.A07(r0)
            X.8pb r5 = r0.A08
            X.8pY r5 = (X.AnonymousClass8pY) r5
            if (r5 == 0) goto L_0x05f5
            java.lang.String r1 = r5.A0F
            java.lang.String r0 = "NEEDS_RETOKENIZATION"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x05e9
            java.lang.String r0 = "NEEDS_RETOKENIZATION_DELETED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05f5
        L_0x05e9:
            android.content.Context r0 = r3.A1n()
            android.content.Intent r0 = X.C170278pb.A01(r0, r5, r2)
            r3.A1k(r0)
            return
        L_0x05f5:
            X.11P r9 = r3.A02
            android.content.Context r6 = r3.A1n()
            X.1KB r7 = r3.A00
            X.11S r8 = r3.A01
            X.00H r0 = r3.A0G
            X.1OZ r11 = X.C17880vN.A0U(r0)
            X.1ek r1 = r3.A0F
            X.1QS r15 = r3.A02
            X.1ex r14 = r3.A09
            X.9mW r0 = r3.A0C
            X.1KI r10 = r3.A04
            X.A6a r12 = r3.A08
            X.00H r5 = r3.A0H
            X.1jG r13 = X.AnonymousClass8BR.A0a(r5)
            X.9nO r5 = new X.9nO
            r17 = r1
            r18 = r2
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = 0
            X.AY6 r0 = new X.AY6
            r0.<init>(r4, r3, r2, r1)
            r5.A00(r0)
            return
        L_0x062c:
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r1.A02
            X.9uQ r0 = (X.C196079uQ) r0
            X.05w r0 = r0.A02(r2)
            r0.show()
            return
        L_0x063c:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            java.lang.Object r3 = r1.A02
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            r2 = r3
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1 = 0
            r2.setOnDismissListener(r1)
            r3.dismiss()
            X.8GL r4 = r0.A03
            X.1KB r3 = r4.A0B
            r2 = 0
            r1 = 2131895077(0x7f122325, float:1.9424977E38)
            r3.A07(r2, r1)
            X.AW0 r7 = r4.A07
            X.8pG r2 = r7.A0A
            boolean r1 = r2 instanceof X.C170318pf
            if (r1 == 0) goto L_0x06c4
            X.8pf r2 = (X.C170318pf) r2
            X.9ue r1 = r2.A0H
            if (r1 == 0) goto L_0x06c4
            X.9O4 r6 = r1.A0C
            if (r6 == 0) goto L_0x06c4
        L_0x066b:
            X.8zN r11 = r4.A08
            r12 = 1
            X.AXT r8 = new X.AXT
            r8.<init>(r4, r12)
            java.lang.String r1 = "PAY: rejectPayeeMandate called"
            java.util.ArrayList r5 = X.AnonymousClass8BU.A0w(r1)
            java.lang.String r1 = "action"
            java.lang.String r4 = "upi-reject-mandate-request"
            X.C17890vO.A11(r1, r4, r5)
            X.C175848zN.A01(r7, r11, r5)
            X.8pG r3 = r7.A0A
            X.8pf r3 = (X.C170318pf) r3
            r2 = 0
            r1 = 0
            X.C175848zN.A02(r6, r3, r1, r5, r2)
            X.9ui r10 = X.C197889xR.A04(r11, r4)
            X.1ca[] r3 = X.C175848zN.A03(r7, r11)
            X.1ex r13 = r11.A01
            X.1MD[] r2 = X.AnonymousClass8BT.A1b(r5, r2)
            java.lang.String r1 = "account"
            X.1ca r15 = X.AnonymousClass8BR.A0l(r1, r2, r3)
            android.content.Context r6 = r11.A00
            X.1KB r7 = r11.A02
            X.1jG r9 = r11.A06
            X.8za r5 = new X.8za
            r5.<init>((android.content.Context) r6, (X.AnonymousClass1KB) r7, (X.B8Z) r8, (X.C33711jG) r9, (X.C196259ui) r10, (X.C175848zN) r11)
            r17 = 0
            java.lang.String r16 = "set"
            r14 = r5
            r13.A0I(r14, r15, r16, r17)
            X.AZ6 r8 = r0.A0S
            r1 = 105(0x69, float:1.47E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r11 = r0.A04
            java.lang.String r10 = "decline_mandate_dialogue"
            r13 = r12
            r8.BiI(r9, r10, r11, r12, r13)
            return
        L_0x06c4:
            r6 = 0
            goto L_0x066b
        L_0x06c6:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r5 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r5
            java.lang.Object r2 = r1.A02
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            r1 = r2
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            r1.setOnDismissListener(r0)
            r2.dismiss()
            X.AEs r1 = r5.A03
            if (r1 != 0) goto L_0x06f0
            r0 = 31
            X.AkE r4 = X.C21447AkE.A00(r5, r0)
            r3 = 0
            X.10I r2 = r5.A05
            r1 = 8
            X.7Qx r0 = new X.7Qx
            r0.<init>(r5, r4, r1, r3)
            r2.CGF(r0)
            return
        L_0x06f0:
            X.8GL r0 = r5.A03
            r0.A0T(r1)
            return
        L_0x06f6:
            java.lang.Object r0 = r1.A01
            X.AZh r0 = (X.C20804AZh) r0
            java.lang.Object r4 = r1.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            X.91R r3 = r0.A06
            java.lang.String r2 = "add_credential_prompt"
            r1 = 0
            r0 = 3
            r3.A5X(r1, r2, r0)
            r4.A2K()
            return
        L_0x070b:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r2 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r2
            java.lang.Object r0 = r1.A02
            android.view.View r0 = (android.view.View) r0
            X.1L9 r2 = r2.A05
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/about-payments-data"
            X.AnonymousClass8BV.A13(r1, r2, r0)
            return
        L_0x071f:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r5 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r5
            java.lang.Object r4 = r1.A02
            android.view.View r4 = (android.view.View) r4
            X.0ve r3 = r5.A0E
            X.18K r2 = r5.A0C
            X.19T r1 = r5.A03
            java.lang.String r0 = "onboarding"
            boolean r0 = X.C137346vJ.A00(r3, r2, r1, r0)
            r8 = 0
            if (r0 == 0) goto L_0x0742
            r2 = 2131895369(0x7f122449, float:1.942557E38)
            r1 = 2131895368(0x7f122448, float:1.9425567E38)
        L_0x073c:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r5.BhU(r0, r2, r1)
            return
        L_0x0742:
            boolean r0 = X.AnonymousClass9R8.A00()
            r3 = 0
            if (r0 == 0) goto L_0x0759
            X.AZ6 r2 = r5.A0S
            java.lang.String r1 = "upi_payments_unavailable_on_legacy_android_dialog"
            java.lang.String r0 = "tos_page"
            r2.BiL(r3, r1, r0, r8)
            r2 = 2131897417(0x7f122c49, float:1.9429723E38)
            r1 = 2131897416(0x7f122c48, float:1.942972E38)
            goto L_0x073c
        L_0x0759:
            X.94h r0 = r5.A02
            java.lang.String r1 = "tosAccepted"
            X.19a r0 = r0.A00
            r0.A08(r1)
            X.AZ6 r0 = r5.A0S
            r0.COK()
            X.A4a r0 = r5.A01
            r0.A02()
            r0 = 8
            r4.setVisibility(r0)
            r0 = 2131434180(0x7f0b1ac4, float:1.8490167E38)
            X.AnonymousClass3MX.A1H(r5, r0, r8)
            X.0ve r1 = r5.A0E
            r0 = 12214(0x2fb6, float:1.7115E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x07b0
            X.00H r0 = r5.A04
            java.lang.Object r3 = r0.get()
            X.1lS r3 = (X.C34991lS) r3
            X.1lW r2 = X.C35021lW.A06
            r1 = 1
            X.ARz r0 = new X.ARz
            r0.<init>(r5, r1)
            r3.A03(r0, r2)
        L_0x0796:
            X.8sO r1 = r5.A09
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A07 = r0
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A08 = r0
            java.lang.String r0 = r5.A0c
            r1.A0Y = r0
            java.lang.String r0 = r5.A0f
            r1.A0a = r0
            X.AZ6.A02(r1, r5)
            return
        L_0x07b0:
            X.1ex r6 = r5.A0N
            X.00H r2 = r6.A0H
            java.lang.String r12 = X.C17890vO.A0T(r2)
            X.9F3 r7 = new X.9F3
            r7.<init>(r12)
            X.0ve r1 = r6.A05
            r0 = 11243(0x2beb, float:1.5755E-41)
            boolean r1 = X.C18020vd.A05(r3, r1, r0)
            X.1OZ r9 = X.C17880vN.A0U(r2)
            java.lang.Object r11 = r7.A04
            X.1ca r11 = (X.C29621ca) r11
            X.118 r0 = r6.A02
            android.content.Context r2 = r0.A00
            X.1KB r4 = r6.A00
            X.00H r0 = r6.A0I
            X.1jG r3 = X.AnonymousClass8BR.A0a(r0)
            if (r1 == 0) goto L_0x07f5
            X.8yn r1 = new X.8yn
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14 = 0
            r13 = 204(0xcc, float:2.86E-43)
            r10 = r1
            boolean r0 = r9.A0N(r10, r11, r12, r13, r14)
            if (r0 != 0) goto L_0x0796
            r1 = 7
            X.A7B r0 = new X.A7B
            r0.<init>((int) r1)
            r5.C3L(r0)
            goto L_0x0796
        L_0x07f5:
            r8 = 1
            X.8yn r1 = new X.8yn
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.AnonymousClass8BW.A1B(r9, r1, r11, r12)
            goto L_0x0796
        L_0x07ff:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment r2 = (com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment) r2
            java.lang.Object r0 = r1.A02
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r2.A2H(r0)
            return
        L_0x080b:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet r3 = (com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet) r3
            java.lang.Object r5 = r1.A02
            android.content.Context r5 = (android.content.Context) r5
            r2 = 1
            X.1oP r1 = r3.A01
            if (r1 == 0) goto L_0x087c
            int r0 = r3.A00
            r1.A00(r0)
            r0 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A00
            java.lang.String r4 = "merchant_payment_upsell_prompt"
            com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet.A00(r3, r1, r2, r0)
            int r2 = r3.A00
            r1 = 0
            if (r2 == 0) goto L_0x0864
            r0 = 6
            if (r2 == r0) goto L_0x0844
            java.lang.String r0 = "Unsupported action"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0837:
            r3.A28()
            X.1oP r1 = r3.A01
            if (r1 == 0) goto L_0x087c
            int r0 = r3.A00
            r1.A00(r0)
            return
        L_0x0844:
            X.1QS r0 = r3.A04
            if (r0 == 0) goto L_0x0876
            X.BD1 r0 = r0.A06()
            X.A5D r0 = r0.BUf()
            if (r0 == 0) goto L_0x0837
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet r2 = X.AnonymousClass9RG.A00(r1, r0, r4, r1, r1)
            X.1GP r1 = r3.A1F()
            java.lang.String r0 = "PaymentMethodAddPixBottomSheet"
            X.C20098A7b.A03(r2, r1, r0)
            goto L_0x0837
        L_0x0864:
            X.1QS r0 = r3.A04
            if (r0 == 0) goto L_0x0876
            X.BD1 r0 = r0.A06()
            X.A5D r0 = r0.BUf()
            if (r0 == 0) goto L_0x0837
            r0.A01(r5, r4)
            goto L_0x0837
        L_0x0876:
            java.lang.String r0 = "paymentsManager"
            X.C18070vi.A11(r0)
            throw r1
        L_0x087c:
            java.lang.String r0 = "merchantEducationManager"
            goto L_0x0b13
        L_0x0880:
            java.lang.Object r0 = r1.A01
            X.8Hx r0 = (X.C161828Hx) r0
            java.lang.Object r3 = r1.A02
            X.AW0 r3 = (X.AW0) r3
            X.9YJ r0 = r0.A00
            com.whatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity r2 = r0.A00
            boolean r0 = X.A4C.A01(r3)
            if (r0 == 0) goto L_0x0906
            X.9mV r1 = new X.9mV
            r1.<init>()
            java.lang.String r0 = "wa_payment_hub_support"
            r1.A04 = r0
            r1.A02 = r3
            X.1R2 r0 = r2.A0F
            r1.A03 = r0
            X.1M9 r0 = r2.A02
            r1.A00 = r0
            X.0vb r0 = r2.A04
            r1.A01 = r0
            r1.A00(r2)
        L_0x08ac:
            r0 = 0
            X.A7u[] r0 = new X.C20112A7u[r0]
            r7 = 0
            X.A7u r4 = X.C20112A7u.A03(r0)
            boolean r0 = X.A4C.A01(r3)
            if (r0 == 0) goto L_0x0903
            java.lang.String r1 = "p2m"
        L_0x08bc:
            java.lang.String r0 = "product_flow"
            r4.A07(r0, r1)
            java.lang.String r1 = "transaction_id"
            java.lang.String r0 = r3.A0K
            r4.A07(r1, r0)
            int r1 = r3.A03
            int r0 = r3.A02
            java.lang.String r1 = X.C20128A8n.A04(r1, r0)
            java.lang.String r0 = "transaction_status"
            r4.A07(r0, r1)
            X.0vb r1 = r2.A04
            X.1R2 r0 = r2.A0F
            int r0 = r0.A0G(r3)
            java.lang.String r1 = r1.A0A(r0)
            java.lang.String r0 = "transaction_status_name"
            r4.A07(r0, r1)
            java.lang.String r1 = "hc_entrypoint"
            java.lang.String r0 = "wa_payment_hub_support"
            r4.A07(r1, r0)
            java.lang.String r1 = "app_type"
            java.lang.String r0 = "consumer"
            r4.A07(r1, r0)
            X.BD4 r3 = r2.A06
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = "payment_home"
            r8 = 1
            r3.BiM(r4, r5, r6, r7, r8)
            return
        L_0x0903:
            java.lang.String r1 = "p2p"
            goto L_0x08bc
        L_0x0906:
            X.10I r1 = r2.A05
            X.6MW r0 = com.whatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity.A0Q(r2)
            X.C17890vO.A0u(r0, r1)
            goto L_0x08ac
        L_0x0910:
            java.lang.Object r7 = r1.A01
            com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet r7 = (com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet) r7
            java.lang.Object r1 = r1.A02
            android.widget.DatePicker r1 = (android.widget.DatePicker) r1
            r8 = 0
            r0 = 1
            long r4 = X.AnonymousClass8BY.A07(r1)
            android.content.Context r6 = r7.A14()
            r3 = 2131888678(0x7f120a26, float:1.9411998E38)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.0vl r0 = r7.A03
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            java.text.Format r1 = (java.text.Format) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = r1.format(r0)
            java.lang.String r0 = X.AnonymousClass3Ma.A10(r6, r0, r2, r8, r3)
            X.3Rj r3 = X.AnonymousClass4a6.A03(r7)
            r3.A0S(r0)
            r3.A0T(r8)
            r1 = 2131888676(0x7f120a24, float:1.9411994E38)
            X.A9S r0 = new X.A9S
            r0.<init>(r7, r4)
            r3.A0Z(r0, r1)
            r2 = 2131888677(0x7f120a25, float:1.9411996E38)
            r1 = 8
            X.A9R r0 = new X.A9R
            r0.<init>(r1)
            r3.A0X(r0, r2)
            r3.A0C()
            return
        L_0x0961:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity r0 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity) r0
            java.lang.Object r6 = r1.A02
            android.app.Dialog r6 = (android.app.Dialog) r6
            r5 = 1
            X.C18070vi.A0d(r6, r5)
            java.lang.String r4 = r0.A0f
            if (r4 == 0) goto L_0x098e
            X.0vl r0 = r0.A0D
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel r1 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel) r1
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.AZ6 r2 = r1.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "international_payment_prompt"
            X.8sO r0 = r2.A07(r1, r3, r0, r4)
            r2.BiH(r0)
        L_0x098e:
            r6.show()
            return
        L_0x0992:
            java.lang.Object r2 = r1.A01
            X.4k3 r2 = (X.C94104k3) r2
            java.lang.Object r0 = r1.A02
            java.util.List r0 = (java.util.List) r0
            com.whatsapp.payments.ui.invites.PaymentInviteFragment r2 = r2.A04
            r0.size()
            X.8FO r0 = r2.A02
            r1 = 3
            X.1DT r0 = r0.A00
            X.AnonymousClass3MX.A1J(r0, r1)
            java.util.List r0 = r2.A04
            int r1 = r0.size()
            r0 = 0
            r2.A27(r1, r0)
            return
        L_0x09b2:
            java.lang.Object r2 = r1.A01
            X.9NL r2 = (X.AnonymousClass9NL) r2
            java.lang.Object r1 = r1.A02
            X.1xT r1 = (X.C42011xT) r1
            java.util.List r0 = X.C42011xT.A0I
            X.9bl r6 = r2.A00
            int r5 = r1.A05()
            X.8Hd r4 = r6.A01
            int r2 = r4.A00
            java.util.List r3 = r4.A03
            java.lang.Object r1 = r3.get(r2)
            X.9NL r1 = (X.AnonymousClass9NL) r1
            r0 = 0
            r1.A02 = r0
            r4.A0G(r2)
            r4.A00 = r5
            java.lang.Object r1 = r3.get(r5)
            X.9NL r1 = (X.AnonymousClass9NL) r1
            r0 = 1
            r1.A02 = r0
            r4.A0G(r5)
            com.whatsapp.payments.ui.InstallmentBottomSheetFragment r2 = r6.A00
            java.lang.Object r1 = r3.get(r5)
            X.9NL r1 = (X.AnonymousClass9NL) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A04 = r0
            r2.A03 = r1
            return
        L_0x09f7:
            java.lang.Object r2 = r1.A01
            X.1xT r2 = (X.C42011xT) r2
            java.lang.Object r0 = r1.A02
            X.9fo r0 = (X.C187439fo) r0
            X.9bm r0 = r0.A04
            int r4 = r2.A05()
            X.8Hj r3 = r0.A01
            X.9Yb r2 = r0.A00
            r6 = 0
        L_0x0a0a:
            java.util.List r5 = r3.A03
            int r0 = r5.size()
            if (r6 >= r0) goto L_0x0a27
            java.lang.Object r0 = r5.get(r6)
            X.9fo r0 = (X.C187439fo) r0
            X.AEZ r0 = r0.A03
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = r3.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0a28
            int r6 = r6 + 1
            goto L_0x0a0a
        L_0x0a27:
            r6 = -1
        L_0x0a28:
            java.lang.Object r1 = r5.get(r6)
            X.9fo r1 = (X.C187439fo) r1
            r0 = 0
            r1.A00 = r0
            r3.A0G(r6)
            java.lang.Object r0 = r5.get(r4)
            X.9fo r0 = (X.C187439fo) r0
            X.AEZ r0 = r0.A03
            java.lang.String r0 = r0.A0A
            r3.A00 = r0
            java.lang.Object r1 = r5.get(r4)
            X.9fo r1 = (X.C187439fo) r1
            r0 = 1
            r1.A00 = r0
            r3.A0G(r4)
            java.lang.String r3 = r3.A00
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r2 = r2.A00
            r2.A06 = r3
            r0 = 84
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet.A01(r2, r1, r3, r0)
            return
        L_0x0a5d:
            java.lang.Object r3 = r1.A01
            X.8Iy r3 = (X.C162098Iy) r3
            java.lang.Object r2 = r1.A02
            android.net.Uri r2 = (android.net.Uri) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1L9 r1 = r3.A02
            android.view.View r0 = r3.A00
            android.content.Context r0 = r0.getContext()
            r1.A0C(r0, r2)
            return
        L_0x0a73:
            java.lang.Object r2 = r1.A01
            X.6Ct r2 = (X.C120196Ct) r2
            java.lang.Object r0 = r1.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = X.C120196Ct.A00(r2, r0)
            X.22H r0 = r2.A01
            r2.A04(r0, r1)
            return
        L_0x0a85:
            java.lang.Object r3 = r1.A01
            X.8GV r3 = (X.AnonymousClass8GV) r3
            java.lang.Object r1 = r1.A02
            X.8Ik r1 = (X.C161958Ik) r1
            java.util.List r0 = X.C42011xT.A0I
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            long r1 = r1.A00
            X.A2j r0 = r3.A03
            r0.A01 = r1
            r0.A04(r1)
            return
        L_0x0a9d:
            java.lang.Object r4 = r1.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r0 = X.AnonymousClass9T6.A00     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            android.content.Intent r3 = X.C108945cZ.A0G(r0)     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            java.lang.String r2 = X.C24717CHe.A00     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            java.lang.String r1 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            r0.<init>(r2, r1)     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            r3.setComponent(r0)     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            java.lang.String r1 = "package_name"
            java.lang.String r0 = r4.getPackageName()     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            r3.putExtra(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            X.C181759Rs.A00(r4, r3)     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            r4.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x0ac3 }
            return
        L_0x0ac3:
            r1 = move-exception
            java.lang.String r0 = "Failed to launch App-Update-Settings activity within AppManager"
            X.C17960vV.A09(r0, r1)
            return
        L_0x0aca:
            java.lang.String r0 = "nameEditText"
            goto L_0x0b13
        L_0x0acd:
            java.lang.String r0 = "inputContainer"
            goto L_0x0b13
        L_0x0ad0:
            java.lang.String r0 = "continueButton"
            goto L_0x0b13
        L_0x0ad3:
            java.lang.String r0 = "PAY: banner configuration not supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0ad9:
            java.lang.String r0 = "waIntents"
            goto L_0x0b13
        L_0x0adc:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment r4 = (com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment) r4
            java.lang.Object r5 = r1.A02
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            r3 = 1
            X.C18070vi.A0d(r5, r3)
            android.widget.ProgressBar r0 = r4.A02
            if (r0 == 0) goto L_0x0b0e
            int r0 = r0.getVisibility()
            java.lang.String r2 = "enter_name"
            java.lang.Integer r1 = X.C17880vN.A0j()
            if (r0 != 0) goto L_0x0b08
            java.lang.String r0 = "confirm_legal_name_in_progress_prompt"
            r4.A27(r1, r0, r2, r3)
        L_0x0afd:
            X.BBU r0 = r4.A0A
            if (r0 == 0) goto L_0x0b04
            r0.Bnj()
        L_0x0b04:
            r5.A28()
            return
        L_0x0b08:
            java.lang.String r0 = "order_details"
            r4.A27(r1, r2, r0, r3)
            goto L_0x0afd
        L_0x0b0e:
            java.lang.String r0 = "progressBar"
            goto L_0x0b13
        L_0x0b11:
            java.lang.String r0 = "fieldStatsLogger"
        L_0x0b13:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0b18:
            java.lang.Object r3 = r1.A01
            X.8Gc r3 = (X.C161588Gc) r3
            java.lang.Object r2 = r1.A02
            X.AW0 r2 = (X.AW0) r2
            r1 = 0
            r0 = 103(0x67, float:1.44E-43)
            X.96D r4 = new X.96D
            r4.<init>(r0)
            r4.A05 = r2
            r4.A0L = r1
            X.1wy r0 = r3.A08
            goto L_0x0bf7
        L_0x0b30:
            java.lang.Object r2 = r1.A01
            X.8Gc r2 = (X.C161588Gc) r2
            java.lang.Object r1 = r1.A02
            X.8pf r1 = (X.C170318pf) r1
            r0 = 102(0x66, float:1.43E-43)
            X.96D r4 = new X.96D
            r4.<init>(r0)
            java.lang.String r0 = r1.A0Y
            r4.A07 = r0
            goto L_0x0bf5
        L_0x0b45:
            java.lang.Object r3 = r1.A01
            X.8Gc r3 = (X.C161588Gc) r3
            java.lang.Object r1 = r1.A02
            X.8pf r1 = (X.C170318pf) r1
            r0 = 113(0x71, float:1.58E-43)
            X.96D r4 = new X.96D
            r4.<init>(r0)
            X.9ue r0 = r1.A0H
            X.9Nk[] r8 = r0.A0P
            if (r8 == 0) goto L_0x0bb6
            int r7 = r8.length
            if (r7 == 0) goto L_0x0bb6
            java.lang.String[] r6 = new java.lang.String[r7]
            r5 = 0
            r2 = 0
        L_0x0b61:
            r0 = r8[r5]
            int r1 = r2 + 1
            X.77e r0 = r0.A00
            java.lang.Object r0 = r0.A00
            r6[r2] = r0
            int r5 = r5 + 1
            r2 = r1
            if (r5 < r7) goto L_0x0b61
            java.lang.String[] r5 = new java.lang.String[r7]
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            r1 = 0
        L_0x0b77:
            java.lang.String r0 = "id=?"
            r2.append(r0)
            int r0 = r7 + -1
            if (r1 == r0) goto L_0x0b85
            java.lang.String r0 = " OR "
            r2.append(r0)
        L_0x0b85:
            r0 = r6[r1]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r1] = r0
            int r1 = r1 + 1
            if (r1 < r7) goto L_0x0b77
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.AnonymousClass8BU.A0q(r1)
            android.util.Pair r0 = android.util.Pair.create(r5, r0)
            if (r0 == 0) goto L_0x0bb6
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.first
            java.lang.String[] r1 = (java.lang.String[]) r1
            X.ADh r0 = new X.ADh
            r0.<init>(r2, r1)
            r4.A02 = r0
        L_0x0bb6:
            X.1wy r0 = r3.A08
            goto L_0x0bf7
        L_0x0bb9:
            java.lang.Object r2 = r1.A01
            X.8Gc r2 = (X.C161588Gc) r2
            java.lang.Object r1 = r1.A02
            X.AW0 r1 = (X.AW0) r1
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x0bce
        L_0x0bc4:
            java.lang.Object r2 = r1.A01
            X.8Gc r2 = (X.C161588Gc) r2
            java.lang.Object r1 = r1.A02
            X.AW0 r1 = (X.AW0) r1
            r0 = 112(0x70, float:1.57E-43)
        L_0x0bce:
            X.96D r4 = new X.96D
            r4.<init>(r0)
            goto L_0x0be2
        L_0x0bd4:
            java.lang.Object r2 = r1.A01
            X.8Gc r2 = (X.C161588Gc) r2
            java.lang.Object r1 = r1.A02
            X.AW0 r1 = (X.AW0) r1
            r0 = 23
            X.9yu r4 = X.C198789yu.A00(r0)
        L_0x0be2:
            r4.A05 = r1
            goto L_0x0bf5
        L_0x0be5:
            java.lang.Object r2 = r1.A01
            X.8Gc r2 = (X.C161588Gc) r2
            java.lang.Object r1 = r1.A02
            X.AEs r1 = (X.C20284AEs) r1
            r0 = 9
            X.9yu r4 = X.C198789yu.A00(r0)
            r4.A04 = r1
        L_0x0bf5:
            X.1wy r0 = r2.A08
        L_0x0bf7:
            r0.A0F(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFT.onClick(android.view.View):void");
    }
}
