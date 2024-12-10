package X;

import android.view.View;

public class AFQ implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AFQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AFQ(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.whatsapp.payments.ui.IndiaUpiSendPayContactPickerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: com.whatsapp.payments.ui.IndiaUpiSendPayContactPickerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: com.whatsapp.payments.ui.PaymentSettingsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: com.whatsapp.payments.ui.PaymentSettingsFragment} */
    /* JADX WARNING: type inference failed for: r1v15, types: [X.9mV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v25, types: [X.21D, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03aa, code lost:
        r2 = r4.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03ac, code lost:
        if (r2 == null) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ae, code lost:
        r1 = r4.A0d;
        r0 = 45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03b2, code lost:
        if (r3 == false) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03b4, code lost:
        r0 = 46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03b6, code lost:
        X.C20087A6p.A04(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03b9, code lost:
        r1 = r4.A1D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03bf, code lost:
        if ((r4 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) == false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03c1, code lost:
        r0 = com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03c3, code lost:
        r2 = X.AnonymousClass8BR.A07(r1, r0);
        r2.putExtra("extra_show_requests", r3);
        r1 = "extra_payment_service_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03d0, code lost:
        if ((r4 instanceof com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03d2, code lost:
        r0 = "P2M_LITE";
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d6, code lost:
        r0 = com.whatsapp.payments.ui.PaymentTransactionHistoryActivity.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d9, code lost:
        r0 = null;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0533, code lost:
        r2.putExtra(r1, r0);
        r4.A1k(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0539, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0589, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x058d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x059a, code lost:
        r0.A2K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x059d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (r0 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        r0.A26(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        r0 = r2.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        r2 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) androidx.fragment.app.Fragment.A0L(r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b1, code lost:
        if (r2 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        r2.A00 = r3;
        r1 = r2.A08;
        r0 = 2131893704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        if (r3 != 0) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        r0 = 2131893702;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bf, code lost:
        r1.setText(r0);
        r1 = r2.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        if ((r1 instanceof X.AnonymousClass8pK) == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c8, code lost:
        r0 = (X.AnonymousClass8pY) r1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        if (r0 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        r0.A03 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d0, code lost:
        r0 = r4.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d2, code lost:
        r0 = (com.whatsapp.payments.ui.PaymentBottomSheet) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d4, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012a, code lost:
        r1.A2K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012d, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0519;
                case 1: goto L_0x04dd;
                case 2: goto L_0x0596;
                case 3: goto L_0x00f9;
                case 4: goto L_0x04cd;
                case 5: goto L_0x0007;
                case 6: goto L_0x04b1;
                case 7: goto L_0x04a5;
                case 8: goto L_0x049d;
                case 9: goto L_0x00d8;
                case 10: goto L_0x042e;
                case 11: goto L_0x040d;
                case 12: goto L_0x0405;
                case 13: goto L_0x0405;
                case 14: goto L_0x03e6;
                case 15: goto L_0x03dc;
                case 16: goto L_0x011b;
                case 17: goto L_0x00a5;
                case 18: goto L_0x009f;
                case 19: goto L_0x0098;
                case 20: goto L_0x03a5;
                case 21: goto L_0x039f;
                case 22: goto L_0x037c;
                case 23: goto L_0x034f;
                case 24: goto L_0x0085;
                case 25: goto L_0x007a;
                case 26: goto L_0x0098;
                case 27: goto L_0x0344;
                case 28: goto L_0x0325;
                case 29: goto L_0x0007;
                case 30: goto L_0x031d;
                case 31: goto L_0x0317;
                case 32: goto L_0x02d4;
                case 33: goto L_0x0250;
                case 34: goto L_0x0243;
                case 35: goto L_0x023a;
                case 36: goto L_0x022e;
                case 37: goto L_0x021c;
                case 38: goto L_0x0066;
                case 39: goto L_0x004d;
                case 40: goto L_0x022e;
                case 41: goto L_0x000f;
                case 42: goto L_0x0546;
                case 43: goto L_0x0007;
                case 44: goto L_0x0007;
                case 45: goto L_0x0211;
                case 46: goto L_0x0147;
                case 47: goto L_0x012e;
                case 48: goto L_0x0147;
                case 49: goto L_0x0211;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
        L_0x000b:
            r0.A28()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment r5 = (com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment) r5
            r4 = 1
            r3 = 0
            java.lang.String r1 = "confirm_dob_in_progress_prompt"
            java.lang.String r2 = "enter_dob"
            r0 = 0
            r5.A26(r0, r1, r2, r3)
            r5.A27(r3)
            com.whatsapp.WaEditText r0 = r5.A02
            if (r0 == 0) goto L_0x0543
            r1 = 4
            r0.setVisibility(r1)
            com.whatsapp.TextEmojiLabel r0 = r5.A01
            if (r0 == 0) goto L_0x0540
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r5.A00
            if (r0 == 0) goto L_0x053d
            r0.setVisibility(r3)
            X.B97 r1 = r5.A07
            if (r1 == 0) goto L_0x003f
            java.util.Calendar r0 = r5.A0A
            r1.BqA(r0)
        L_0x003f:
            boolean r0 = r5 instanceof com.whatsapp.payments.ui.BrazilHostedPaymentPageDateOfBirthBottomSheetFragment
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r1 = X.C17880vN.A0l()
            java.lang.String r0 = "confirm_legal_name_in_progress_prompt"
            r5.A26(r1, r2, r0, r4)
            return
        L_0x004d:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet r0 = (com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet) r0
            X.9ey r1 = r0.A00
            if (r1 == 0) goto L_0x000e
            com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet r0 = r1.A02
            r0.A28()
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r1 = r1.A01
            boolean r0 = r1.Bg0()
            if (r0 == 0) goto L_0x000e
            X.C108965cb.A0y(r1)
            return
        L_0x0066:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet r0 = (com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet) r0
            X.9ey r3 = r0.A00
            if (r3 == 0) goto L_0x000e
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r2 = r3.A01
            X.ARR r1 = r3.A00
            X.AEn r0 = r3.A03
            r2.A5o(r1, r0)
            com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet r0 = r3.A02
            goto L_0x000b
        L_0x007a:
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r1 = 0
            r0 = 1
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.Fragment.A0L(r2, r0)
            goto L_0x008e
        L_0x0085:
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r1 = 1
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.Fragment.A0L(r2, r1)
        L_0x008e:
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            if (r0 == 0) goto L_0x0095
            r0.A26(r1)
        L_0x0095:
            androidx.fragment.app.Fragment r0 = r2.A0E
            goto L_0x00d2
        L_0x0098:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r0 = r0.A0E
            goto L_0x00d2
        L_0x009f:
            java.lang.Object r4 = r1.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r3 = 1
            goto L_0x00aa
        L_0x00a5:
            java.lang.Object r4 = r1.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r3 = 0
        L_0x00aa:
            r0 = 1
            androidx.fragment.app.Fragment r2 = androidx.fragment.app.Fragment.A0L(r4, r0)
            com.whatsapp.payments.ui.ConfirmPaymentFragment r2 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r2
            if (r2 == 0) goto L_0x00d0
            r2.A00 = r3
            android.widget.TextView r1 = r2.A08
            r0 = 2131893704(0x7f121dc8, float:1.9422192E38)
            if (r3 != 0) goto L_0x00bf
            r0 = 2131893702(0x7f121dc6, float:1.9422188E38)
        L_0x00bf:
            r1.setText(r0)
            X.AEs r1 = r2.A0C
            boolean r0 = r1 instanceof X.AnonymousClass8pK
            if (r0 == 0) goto L_0x00d0
            X.8pb r0 = r1.A08
            X.8pY r0 = (X.AnonymousClass8pY) r0
            if (r0 == 0) goto L_0x00d0
            r0.A03 = r3
        L_0x00d0:
            androidx.fragment.app.Fragment r0 = r4.A0E
        L_0x00d2:
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = (com.whatsapp.payments.ui.PaymentBottomSheet) r0
            if (r0 == 0) goto L_0x000e
            goto L_0x059a
        L_0x00d8:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.PaymentSettingsFragment r4 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r4
            android.content.Context r3 = r4.A1n()
            if (r3 == 0) goto L_0x000e
            X.1QS r1 = r4.A0a
            java.lang.String r0 = "P2M_LITE"
            X.AZ9 r2 = r1.A05(r0)
            if (r2 == 0) goto L_0x000e
            java.lang.String r1 = "personal"
            r0 = 0
            android.content.Intent r0 = r2.BR2(r3, r1, r0)
            if (r0 == 0) goto L_0x000e
            r4.A1k(r0)
            return
        L_0x00f9:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r5 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r5
            X.AZ6 r4 = r5.A0F
            r3 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "enter_user_payment_id"
            java.lang.String r0 = r5.A0P
            r4.BiL(r2, r1, r0, r3)
            X.9n8 r0 = r5.A0G
            if (r0 == 0) goto L_0x000e
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = r0.A01
            if (r1 == 0) goto L_0x000e
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x012a
            r1.A28()
            return
        L_0x011b:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r0 = (com.whatsapp.payments.ui.PaymentMethodsListPickerFragment) r0
            androidx.fragment.app.Fragment r1 = r0.A0E
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = (com.whatsapp.payments.ui.PaymentBottomSheet) r1
            if (r1 == 0) goto L_0x000e
            X.BDA r0 = r0.A05
            r0.Bm8()
        L_0x012a:
            r1.A2K()
            return
        L_0x012e:
            java.lang.Object r0 = r1.A01
            X.4k3 r0 = (X.C94104k3) r0
            com.whatsapp.payments.ui.invites.PaymentInviteFragment r2 = r0.A04
            X.8FO r0 = r2.A02
            r1 = 3
            X.1DT r0 = r0.A00
            X.AnonymousClass3MX.A1J(r0, r1)
            java.util.List r0 = r2.A04
            int r1 = r0.size()
            r0 = 0
            r2.A27(r1, r0)
            return
        L_0x0147:
            java.lang.Object r0 = r1.A01
            X.4k3 r0 = (X.C94104k3) r0
            com.whatsapp.payments.ui.invites.PaymentInviteFragment r8 = r0.A04
            X.1ik r10 = r8.A00
            java.util.List r2 = r8.A04
            android.os.Bundle r1 = r8.A15()
            java.lang.String r0 = "payment_service"
            int r9 = r1.getInt(r0)
            java.util.Iterator r12 = r2.iterator()
        L_0x015f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01fe
            X.1BI r6 = X.C17880vN.A0Q(r12)
            X.11P r0 = r10.A00
            long r3 = X.AnonymousClass11P.A01(r0)
            r0 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r3 = r3 + r0
            X.1QD r11 = r10.A03
            android.content.SharedPreferences r1 = r11.A03()
            java.lang.String r7 = "payments_invitee_jids_with_expiry"
            java.lang.String r0 = ""
            java.lang.String r0 = r1.getString(r7, r0)
            java.util.HashMap r5 = X.AnonymousClass1QD.A02(r11, r0)
            java.lang.Number r0 = X.C108945cZ.A1D(r6, r5)
            if (r0 == 0) goto L_0x0195
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a7
        L_0x0195:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.put(r6, r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r11)
            java.lang.String r0 = X.AnonymousClass1QD.A01(r5)
            X.C17880vN.A1E(r1, r7, r0)
        L_0x01a7:
            X.1ex r11 = r10.A04
            X.1NG r0 = r10.A02
            X.1BI r6 = r0.A00(r6)
            X.C17960vV.A07(r6)
            X.1QE r1 = r11.A0D
            java.lang.String r0 = "userActionSendPaymentInvite"
            r1.A06(r0)
            X.1PP r0 = r11.A0F
            X.205 r7 = X.C17880vN.A0Z(r6, r0)
            X.11P r0 = r11.A01
            long r0 = X.AnonymousClass11P.A01(r0)
            r5 = 51
            X.21D r2 = new X.21D
            r2.<init>(r7, r5, r0)
            r2.A00 = r9
            r2.A01 = r3
            r0 = 8192(0x2000, double:4.0474E-320)
            r2.A0b(r0)
            X.121 r0 = r11.A03
            r0.BBM(r2)
            X.1ev r0 = r11.A0C
            X.1es r7 = r0.A02
            java.lang.String r6 = r6.getRawString()
            monitor-enter(r7)
            X.1er r5 = r7.A01     // Catch:{ all -> 0x01fb }
            X.2tF r4 = r5.A00()     // Catch:{ all -> 0x01fb }
            long r2 = r4.A01     // Catch:{ all -> 0x01fb }
            r0 = 1
            long r2 = r2 + r0
            r4.A01 = r2     // Catch:{ all -> 0x01fb }
            java.util.Set r0 = r4.A0D     // Catch:{ all -> 0x01fb }
            r0.add(r6)     // Catch:{ all -> 0x01fb }
            r5.A01(r4)     // Catch:{ all -> 0x01fb }
            monitor-exit(r7)
            goto L_0x015f
        L_0x01fb:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x01fe:
            X.8FO r0 = r8.A02
            r1 = 2
            X.1DT r0 = r0.A00
            X.AnonymousClass3MX.A1J(r0, r1)
            java.util.List r0 = r8.A04
            int r1 = r0.size()
            r0 = 1
            r8.A27(r1, r0)
            return
        L_0x0211:
            java.lang.Object r0 = r1.A01
            X.4k3 r0 = (X.C94104k3) r0
            com.whatsapp.payments.ui.invites.PaymentInviteFragment r1 = r0.A04
            r0 = 0
            r1.A28(r0)
            return
        L_0x021c:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.bottomsheet.IndiaUpiMapperRegisterUserNuxBottomSheet r2 = (com.whatsapp.payments.ui.bottomsheet.IndiaUpiMapperRegisterUserNuxBottomSheet) r2
            r0 = 47
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            com.whatsapp.payments.ui.bottomsheet.IndiaUpiMapperRegisterUserNuxBottomSheet.A00(r2, r1, r0)
            r2.A28()
            return
        L_0x022e:
            java.lang.Object r1 = r1.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.show()
            return
        L_0x023a:
            java.lang.Object r1 = r1.A01
            X.5ra r1 = (X.C114665ra) r1
            r0 = 1
            X.C114665ra.A03(r1, r0)
            return
        L_0x0243:
            java.lang.Object r0 = r1.A01
            X.5ra r0 = (X.C114665ra) r0
            r0.dismiss()
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = r0.A0G
            r0.callOnClick()
            return
        L_0x0250:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.ViralityLinkVerifierActivity r5 = (com.whatsapp.payments.ui.ViralityLinkVerifierActivity) r5
            int r6 = r5.A01
            int r2 = r5.A00
            if (r2 == 0) goto L_0x0278
            r0 = 405(0x195, float:5.68E-43)
            if (r2 == r0) goto L_0x026f
            r0 = 443(0x1bb, float:6.21E-43)
            if (r2 == r0) goto L_0x02ba
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY ViralityLinkViewModel onPrimaryButtonClicked default run with errorCode : "
            X.C17900vP.A0i(r0, r1, r2)
        L_0x026b:
            r5.finish()
            return
        L_0x026f:
            X.9jn r1 = r5.A0F
            java.lang.String r0 = "smb_linking_back2wa"
            android.content.Intent r0 = r1.A00(r0)
            goto L_0x02d0
        L_0x0278:
            X.8GX r4 = r5.A0D
            X.1QS r0 = r4.A06
            X.BD1 r2 = r0.A06()
            java.lang.String r1 = "alt_virality"
            r3 = 1
            if (r6 != r3) goto L_0x02b3
            X.A5D r0 = r2.BUf()
            if (r0 == 0) goto L_0x02b3
            X.1QO r0 = r4.A05
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x02b3
            java.util.HashMap r2 = X.C17880vN.A11()
            java.lang.String r1 = "campaign_id"
            java.lang.String r0 = r4.A09
            r2.put(r1, r0)
            java.lang.String r1 = "skip_value_prop"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.put(r1, r0)
            X.0zA r0 = r4.A01
            r0.A03()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02b3:
            java.lang.String r0 = "p2p_context"
            android.content.Intent r0 = r2.BWz(r5, r0, r1)
            goto L_0x02d0
        L_0x02ba:
            X.1vD r1 = r5.A06
            X.00H r0 = r5.A0I
            X.1o3 r0 = X.AnonymousClass3MW.A0a(r0)
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r0 = r1.A03()
            X.C18070vi.A0X(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
        L_0x02d0:
            r5.startActivity(r0)
            goto L_0x026b
        L_0x02d4:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.ViralityLinkVerifierActivity r4 = (com.whatsapp.payments.ui.ViralityLinkVerifierActivity) r4
            int r2 = r4.A01
            X.8GX r3 = r4.A0D
            X.1QS r0 = r3.A06
            X.BD1 r1 = r0.A06()
            r0 = 1
            if (r2 != r0) goto L_0x0313
            X.A5D r0 = r1.BUf()
            if (r0 == 0) goto L_0x0313
            X.1QO r0 = r3.A05
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0313
            java.util.HashMap r2 = X.C17880vN.A11()
            java.lang.String r1 = "campaign_id"
            java.lang.String r0 = r3.A09
            r2.put(r1, r0)
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()
            java.lang.String r0 = "skip_value_prop"
            r2.put(r0, r1)
            X.0zA r0 = r3.A01
            r0.A03()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0313:
            r4.finish()
            return
        L_0x0317:
            java.lang.Object r0 = r1.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x031d:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.ReTosFragment r0 = (com.whatsapp.payments.ui.ReTosFragment) r0
            r0.A2N()
            return
        L_0x0325:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity r2 = (com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity) r2
            X.1vD r1 = r2.A00
            X.00H r0 = r2.A01
            X.1o3 r0 = X.AnonymousClass3MW.A0a(r0)
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r1 = r1.A03()
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "android.intent.action.VIEW"
            X.AnonymousClass8BT.A14(r2, r1, r0)
            r2.finish()
            return
        L_0x0344:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.PaymentWebViewActivity r0 = (com.whatsapp.payments.ui.PaymentWebViewActivity) r0
            X.C18070vi.A0b(r17)
            r0.A4l()
            return
        L_0x034f:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r4 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r4
            X.4VZ r1 = r4.A0G
            r0 = 1
            r1.A05(r0)
            com.whatsapp.payments.ui.widget.MultiExclusionChipGroup r3 = r4.A0E
            if (r3 == 0) goto L_0x0378
            r2 = 0
            r1 = 0
        L_0x035f:
            int r0 = r3.getChildCount()
            if (r1 >= r0) goto L_0x0371
            android.view.View r0 = r3.getChildAt(r1)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r2)
            int r1 = r1 + 1
            goto L_0x035f
        L_0x0371:
            com.whatsapp.payments.ui.widget.MultiExclusionChipGroup r1 = r4.A0E
            r0 = 8
            r1.setVisibility(r0)
        L_0x0378:
            r4.A4b()
            return
        L_0x037c:
            java.lang.Object r3 = r1.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.Context r1 = r3.A1n()
            java.lang.Class<com.whatsapp.payments.ui.PaymentInvitePickerActivity> r0 = com.whatsapp.payments.ui.PaymentInvitePickerActivity.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r1, r0)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "payment_invite_others"
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_multi_invite_picker_title"
            r0 = 2131893907(0x7f121e93, float:1.9422604E38)
            r2.putExtra(r1, r0)
            r0 = 501(0x1f5, float:7.02E-43)
            r3.startActivityForResult(r2, r0)
            return
        L_0x039f:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.PaymentSettingsFragment r4 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r4
            r3 = 1
            goto L_0x03aa
        L_0x03a5:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.PaymentSettingsFragment r4 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r4
            r3 = 0
        L_0x03aa:
            X.8GH r2 = r4.A0h
            if (r2 == 0) goto L_0x03b9
            X.A0v r1 = r4.A0d
            r0 = 45
            if (r3 == 0) goto L_0x03b6
            r0 = 46
        L_0x03b6:
            X.C20087A6p.A04(r1, r2, r0)
        L_0x03b9:
            X.1FL r1 = r4.A1D()
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x03d6
            java.lang.Class<com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity> r0 = com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity.class
        L_0x03c3:
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r1, r0)
            java.lang.String r0 = "extra_show_requests"
            r2.putExtra(r0, r3)
            java.lang.String r1 = "extra_payment_service_name"
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment
            if (r0 == 0) goto L_0x03d9
            java.lang.String r0 = "P2M_LITE"
            goto L_0x0533
        L_0x03d6:
            java.lang.Class<com.whatsapp.payments.ui.PaymentTransactionHistoryActivity> r0 = com.whatsapp.payments.ui.PaymentTransactionHistoryActivity.class
            goto L_0x03c3
        L_0x03d9:
            r0 = 0
            goto L_0x0533
        L_0x03dc:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r0 = (com.whatsapp.payments.ui.PaymentMethodsListPickerFragment) r0
            X.BDA r0 = r0.A05
            r0.Bl9()
            return
        L_0x03e6:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet r3 = (com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet) r3
            java.lang.Integer r2 = X.AnonymousClass8BS.A0U()
            int r1 = r3.A00
            r0 = 1
            com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet.A00(r3, r2, r0, r1)
            r3.A28()
            X.1oP r1 = r3.A01
            if (r1 == 0) goto L_0x0401
            int r0 = r3.A00
            r1.A00(r0)
            return
        L_0x0401:
            java.lang.String r0 = "merchantEducationManager"
            goto L_0x0589
        L_0x0405:
            java.lang.Object r0 = r1.A01
            X.91y r0 = (X.AnonymousClass91y) r0
            r0.A4b()
            return
        L_0x040d:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.PaymentSettingsFragment r2 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r2
            X.9mV r1 = new X.9mV
            r1.<init>()
            X.0vb r0 = r2.A01
            r1.A01 = r0
            X.1R2 r0 = r2.A0l
            r1.A03 = r0
            X.1M9 r0 = r2.A0H
            r1.A00 = r0
            java.lang.String r0 = "wa_p2m_lite_receipt_support"
            r1.A04 = r0
            android.content.Context r0 = r2.A1n()
            r1.A00(r0)
            return
        L_0x042e:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r5 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r5
            r15 = 0
            X.00H r0 = r5.A09
            if (r0 == 0) goto L_0x0499
            java.lang.Object r6 = r0.get()
            X.AZ4 r6 = (X.AZ4) r6
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            X.A7u[] r0 = new X.C20112A7u[r15]
            r12 = 0
            X.A7u r7 = X.C20112A7u.A03(r0)
            java.lang.String r3 = "p2m_type"
            java.lang.String r2 = "p2m_lite"
            r7.A07(r3, r2)
            r11 = 1
            java.lang.String r9 = "payment_home"
            java.lang.String r10 = "chat"
            r6.BiM(r7, r8, r9, r10, r11)
            X.3Rj r4 = X.AnonymousClass4a6.A04(r5)
            r0 = 2131893735(0x7f121de7, float:1.9422255E38)
            r4.A0E(r0)
            r0 = 2131893734(0x7f121de6, float:1.9422253E38)
            r4.A0D(r0)
            r4.A0T(r11)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 20
            X.C20155A9r.A00(r4, r5, r0, r1)
            r1 = 2131893733(0x7f121de5, float:1.942225E38)
            r0 = 21
            X.C20155A9r.A01(r4, r5, r0, r1)
            X.00H r0 = r5.A09
            if (r0 == 0) goto L_0x0499
            java.lang.Object r10 = r0.get()
            X.AZ4 r10 = (X.AZ4) r10
            X.A7u[] r0 = new X.C20112A7u[r15]
            X.A7u r11 = X.C20112A7u.A03(r0)
            r11.A07(r3, r2)
            java.lang.String r13 = "remove_payments_info_dialogue"
            r14 = r9
            r10.BiM(r11, r12, r13, r14, r15)
            r4.A0C()
            return
        L_0x0499:
            java.lang.String r0 = "p2mLiteEventLogger"
            goto L_0x0589
        L_0x049d:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.InstallmentBottomSheetFragment r0 = (com.whatsapp.payments.ui.InstallmentBottomSheetFragment) r0
            com.whatsapp.payments.ui.InstallmentBottomSheetFragment.A00(r0)
            return
        L_0x04a5:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.InstallmentBottomSheetFragment r1 = (com.whatsapp.payments.ui.InstallmentBottomSheetFragment) r1
            r0 = 1
            com.whatsapp.payments.ui.InstallmentBottomSheetFragment.A01(r1, r0)
            com.whatsapp.payments.ui.InstallmentBottomSheetFragment.A00(r1)
            return
        L_0x04b1:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity) r0
            com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.A0Q(r0)
            X.AZ6 r1 = r0.A0S
            java.lang.Integer r3 = X.C17880vN.A0h()
            java.lang.Integer r4 = X.C17880vN.A0l()
            java.lang.String r5 = r0.A0c
            java.lang.String r7 = r0.A0f
            r2 = 0
            java.lang.String r6 = "verify_number"
            r1.A0B(r2, r3, r4, r5, r6, r7)
            return
        L_0x04cd:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r1 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r1
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x04d9
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment.A02(r1)
            return
        L_0x04d9:
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment.A01(r1)
            return
        L_0x04dd:
            java.lang.Object r5 = r1.A01
            X.91T r5 = (X.AnonymousClass91T) r5
            r0 = 185(0xb9, float:2.59E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3 = 0
            X.AZ6 r2 = r5.A0S
            java.lang.String r1 = "new_payment"
            r0 = 1
            X.C17960vV.A07(r2)
            r2.BiL(r4, r1, r3, r0)
            X.AEP r0 = r5.A0U
            X.C17960vV.A07(r0)
            java.lang.String r3 = r0.A01
            X.C17960vV.A07(r0)
            java.lang.String r2 = r0.A03
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "extra_base_currency"
            r1.putString(r0, r3)
            java.lang.String r0 = "extra_exchange_rate"
            r1.putString(r0, r2)
            com.whatsapp.payments.ui.international.IndiaUpiInternationalExchangeDialogFragment r0 = new com.whatsapp.payments.ui.international.IndiaUpiInternationalExchangeDialogFragment
            r0.<init>()
            r0.A1R(r1)
            r5.CMl(r0)
            return
        L_0x0519:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiSendPayContactPickerFragment r4 = (com.whatsapp.payments.ui.IndiaUpiSendPayContactPickerFragment) r4
            X.1LU r0 = r4.A00
            if (r0 == 0) goto L_0x053a
            android.content.Context r0 = r4.A14()
            android.content.Intent r2 = X.AnonymousClass1LU.A08(r0)
            java.lang.String r1 = "for_payment_to_number"
            r0 = 1
            r2.putExtra(r1, r0)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "payment_contact_picker"
        L_0x0533:
            r2.putExtra(r1, r0)
            r4.A1k(r2)
            return
        L_0x053a:
            java.lang.String r0 = "waIntents"
            goto L_0x0589
        L_0x053d:
            java.lang.String r0 = "progressBar"
            goto L_0x0589
        L_0x0540:
            java.lang.String r0 = "descText"
            goto L_0x0589
        L_0x0543:
            java.lang.String r0 = "dobEditText"
            goto L_0x0589
        L_0x0546:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity r5 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity) r5
            java.lang.String r7 = r5.A0f
            if (r7 == 0) goto L_0x0583
            X.0vl r0 = r5.A0D
            java.lang.Object r6 = r0.getValue()
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel r6 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel) r6
            X.1DT r4 = r6.A00
            java.lang.Object r0 = r4.A06()
            X.A1l r0 = (X.A1l) r0
            if (r0 == 0) goto L_0x058e
            r3 = 1
            X.9ru r2 = r0.A00
            X.AEd r1 = r0.A01
            X.A1l r0 = new X.A1l
            r0.<init>(r2, r1, r3)
        L_0x056a:
            r4.A0F(r0)
            r0 = 183(0xb7, float:2.56E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1
            X.AZ6 r2 = r6.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "international_payment_prompt"
            X.8sO r0 = r2.A07(r1, r3, r0, r7)
            r2.BiH(r0)
        L_0x0583:
            X.8pN r0 = r5.A05
            if (r0 != 0) goto L_0x0590
            java.lang.String r0 = "paymentBankAccount"
        L_0x0589:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x058e:
            r0 = 0
            goto L_0x056a
        L_0x0590:
            X.8pb r0 = r0.A08
            r5.A5A(r0)
            return
        L_0x0596:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = (com.whatsapp.payments.ui.PaymentBottomSheet) r0
        L_0x059a:
            r0.A2K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFQ.onClick(android.view.View):void");
    }
}
