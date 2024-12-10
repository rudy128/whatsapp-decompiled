package X;

import com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.payments.ui.ReTosFragment;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.util.Log;

public class AXN implements C33661jB {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: type inference failed for: r1v24, types: [X.9NW, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        X.AnonymousClass3MX.A1K(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r10 = (X.C176028zf) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01bf, code lost:
        r1 = (X.AnonymousClass1FU) r9.A01;
        X.AnonymousClass3MX.A0L(r1, 2131436509).setText(2131893599);
        X.C72463Mc.A19(r1, 2131436508);
        r1.BhQ(2131893599);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C3Y(X.C186089dd r10) {
        /*
            r9 = this;
            r4 = r9
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0213;
                case 1: goto L_0x01da;
                case 2: goto L_0x017a;
                case 3: goto L_0x0166;
                case 4: goto L_0x00f9;
                case 5: goto L_0x00d5;
                case 6: goto L_0x009e;
                case 7: goto L_0x0020;
                case 8: goto L_0x007f;
                case 9: goto L_0x0074;
                case 10: goto L_0x0058;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.String r0 = "PAY: BusinessHubViewModel unlinkMerchantAccount/onResponseSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r9.A01
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r0
            X.0vl r0 = r0.A08
            X.1DS r3 = X.C108945cZ.A0Q(r0)
            r2 = 0
            r1 = 0
            X.9xu r0 = new X.9xu
            r0.<init>(r2, r2, r1)
            r3.A0E(r0)
        L_0x001f:
            return
        L_0x0020:
            boolean r0 = r10 instanceof X.C176028zf
            if (r0 == 0) goto L_0x022b
            X.8zf r10 = (X.C176028zf) r10
            java.util.List r0 = r10.A01
            if (r0 == 0) goto L_0x022b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x022b
            java.lang.Object r2 = r9.A01
            X.8Gc r2 = (X.C161588Gc) r2
            X.1QE r1 = r2.A0g
            java.lang.String r0 = "BrazilConsumer/getTransactions/onResponseSuccess"
            r1.A04(r0)
            X.ADK r1 = r10.A00
            if (r1 == 0) goto L_0x0223
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001f
            X.1jA r3 = r2.A0d
            X.ADK r0 = r10.A00
            java.lang.String r7 = r0.A00
            r5 = 0
            r8 = r5
            r6 = r5
            r3.A01(r4, r5, r6, r7, r8)
            return
        L_0x0058:
            java.lang.String r0 = "DyiViewModel/delete-report/on-success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r9.A01
            X.96M r2 = (X.AnonymousClass96M) r2
            X.A5B r1 = r2.A06
            java.lang.String r0 = r2.A08
            monitor-enter(r1)
            r1.A04(r0)     // Catch:{ all -> 0x0071 }
            monitor-exit(r1)
            X.1DT r2 = r2.A02
            int r0 = r1.A02(r0)
            goto L_0x007b
        L_0x0071:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0074:
            java.lang.Object r0 = r9.A01
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r0 = (com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel) r0
            X.1DT r2 = r0.A01
            r0 = 3
        L_0x007b:
            X.AnonymousClass3MX.A1K(r2, r0)
            return
        L_0x007f:
            java.lang.Object r3 = r9.A01
            X.8G9 r3 = (X.AnonymousClass8G9) r3
            X.AnonymousClass8G9.A00(r3)
            java.lang.String r0 = "PAY: BrazilMerchantDetailsViewModel removePayment Success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 2131895655(0x7f122567, float:1.942615E38)
            r0 = 6
            X.9NW r1 = new X.9NW
            r1.<init>()
            r1.A01 = r0
            r1.A00 = r2
            X.1wy r0 = r3.A03
            r0.A0F(r1)
            return
        L_0x009e:
            java.lang.Object r3 = r9.A01
            com.whatsapp.payments.ui.ReTosFragment r3 = (com.whatsapp.payments.ui.ReTosFragment) r3
            X.1QE r2 = r3.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "accept-tos/result="
            r1.append(r0)
            boolean r0 = r10.A02
            X.AnonymousClass8BW.A1D(r2, r1, r0)
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00cb
            r0 = 1
            r3.A2D(r0)
            android.widget.Button r1 = r3.A00
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ProgressBar r1 = r3.A01
            r0 = 8
            r1.setVisibility(r0)
            r3.A28()
            return
        L_0x00cb:
            r1 = 0
            X.A7B r0 = new X.A7B
            r0.<init>((int) r1)
            r9.A00(r0)
            return
        L_0x00d5:
            r3 = 0
            X.C18070vi.A0d(r10, r3)
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r2 = r9.A01
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r2 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r2
            X.1QD r0 = r2.A0W
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "has_p2mlite_account"
            X.C17880vN.A1F(r1, r0, r3)
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment.A00(r2)
        L_0x00ef:
            java.lang.Object r0 = r9.A01
            com.whatsapp.payments.ui.PaymentSettingsFragment r0 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r0
            X.1KB r0 = r0.A0B
            r0.A04()
            return
        L_0x00f9:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r4 = r9.A01
            X.91R r4 = (X.AnonymousClass91R) r4
            X.AXS r1 = r4.A0N
            java.lang.String r0 = r1.A0G()
            r5 = 1
            r1.BIG(r0, r5)
            r4.A4o()
            android.content.Intent r3 = X.AnonymousClass8BS.A04(r4)
            com.whatsapp.payments.ui.widget.PaymentView r0 = r4.A0J
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = r0.getPaymentNote()
            r4.A0n = r0
            com.whatsapp.payments.ui.widget.PaymentView r0 = r4.A0J
            X.AEX r0 = r0.getPaymentBackground()
            r4.A0C = r0
            com.whatsapp.payments.ui.widget.PaymentView r1 = r4.A0J
            X.77d r0 = r1.getStickerIfSelected()
            r4.A0a = r0
            java.lang.Integer r0 = r1.getStickerSendOrigin()
            r4.A0j = r0
        L_0x0132:
            r4.A4v(r3)
            java.lang.String r2 = "extra_payments_entry_type"
            java.lang.String r1 = "payment_composer_icon"
            java.lang.String r0 = r4.A0g
            boolean r1 = r1.equals(r0)
            r0 = 3
            if (r1 == 0) goto L_0x0144
            r0 = 10
        L_0x0144:
            r3.putExtra(r2, r0)
            java.lang.String r0 = "extra_is_first_payment_method"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "extra_skip_value_props_display"
            r3.putExtra(r0, r5)
            com.whatsapp.jid.UserJid r0 = r4.A0F
            java.lang.String r1 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "extra_receiver_jid"
            r3.putExtra(r0, r1)
            r4.startActivity(r3)
            r4.finish()
            r4.CEx()
            return
        L_0x0166:
            java.lang.Object r0 = r9.A01
            X.1FP r0 = (X.AnonymousClass1FP) r0
            X.10I r2 = r0.A05
            r0 = 10
            X.9Bd r1 = new X.9Bd
            r1.<init>((java.lang.Object) r9, (int) r0)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r2.CGD(r1, r0)
            return
        L_0x017a:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r3 = r9.A01
            X.933 r3 = (X.AnonymousClass933) r3
            X.AXS r0 = r3.A0N
            X.1QD r2 = r0.A01     // Catch:{ JSONException -> 0x0198 }
            org.json.JSONObject r1 = X.AnonymousClass8BY.A0c(r2)     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r0 = "smsVerifDataSentToPsp"
            r1.remove(r0)     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r0 = "smsVerifData"
            r1.remove(r0)     // Catch:{ JSONException -> 0x0198 }
            X.AnonymousClass8BT.A1G(r2, r1)     // Catch:{ JSONException -> 0x0198 }
            goto L_0x019e
        L_0x0198:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs deleteSmsVerificationData threw: "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x019e:
            r3.A4o()
            r3.CEx()
            android.content.Intent r2 = X.AnonymousClass8BX.A0B(r3)
            java.lang.String r1 = "extra_payments_entry_type"
            r0 = 6
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_is_first_payment_method"
            r0 = 1
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r2.putExtra(r1, r0)
            r0 = 1
            r3.A3q(r2, r0)
            return
        L_0x01bf:
            r2 = 2131893599(0x7f121d5f, float:1.942198E38)
            java.lang.Object r1 = r9.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131436509(0x7f0b23dd, float:1.849489E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r1, r0)
            r0.setText(r2)
            r0 = 2131436508(0x7f0b23dc, float:1.8494888E38)
            X.C72463Mc.A19(r1, r0)
            r1.BhQ(r2)
            return
        L_0x01da:
            java.lang.Object r2 = r9.A01
            X.91L r2 = (X.AnonymousClass91L) r2
            r2.CEx()
            X.8ze r10 = (X.C176018ze) r10
            java.util.List r1 = r10.A00
            if (r1 == 0) goto L_0x0208
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0208
            int r0 = X.A8e.A01(r1)
            X.AEs r0 = X.AnonymousClass8BR.A0Q(r1, r0)
            X.8pb r1 = r0.A08
            boolean r0 = r1 instanceof X.AnonymousClass8pS
            if (r0 == 0) goto L_0x0208
            X.8pS r1 = (X.AnonymousClass8pS) r1
            if (r1 == 0) goto L_0x0208
            X.AXS r0 = r2.A0N
            r0.CRC(r1)
            r2.A51(r1)
            return
        L_0x0208:
            X.1KB r1 = r2.A05
            r0 = 4
            X.AkE r0 = X.C21447AkE.A00(r9, r0)
            r1.A0J(r0)
            return
        L_0x0213:
            java.lang.Object r0 = r9.A01
            X.AbK r0 = (X.C20904AbK) r0
            java.lang.Object r1 = r0.A02
            X.Af0 r1 = (X.C21132Af0) r1
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A0B(r0)
            return
        L_0x0223:
            r0 = 0
            r2.A0q(r0)
            r2.A0r(r0)
            return
        L_0x022b:
            java.lang.Object r0 = r9.A01
            X.8Gc r0 = (X.C161588Gc) r0
            X.1wy r1 = r0.A08
            r0 = 24
            X.9yu r0 = X.C198789yu.A00(r0)
            r1.A0F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXN.C3Y(X.9dd):void");
    }

    public AXN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(A7B a7b) {
        ReTosFragment reTosFragment = (ReTosFragment) this.A01;
        reTosFragment.A2D(true);
        reTosFragment.A00.setVisibility(0);
        reTosFragment.A01.setVisibility(8);
        AnonymousClass1FL A1B = reTosFragment.A1B();
        if (A1B != null) {
            C20160A9w A002 = C20160A9w.A00(this, 29);
            C20156A9s a9s = new C20156A9s(2);
            C010105w A05 = reTosFragment.A05.A05(A1B, A002, a9s, a7b.A00);
            if (A05 == null) {
                A05 = C20110A7s.A00(A1B, a9s, reTosFragment.A1H(2131893867));
            }
            A05.show();
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.9NW, java.lang.Object] */
    public void C3L(A7B a7b) {
        switch (this.A00) {
            case 0:
                ((C21132Af0) ((C20904AbK) this.A01).A02).A0B(AnonymousClass000.A0h());
                return;
            case 1:
                ((AnonymousClass1FU) this.A01).A05.A0J(C21447AkE.A00(this, 5));
                return;
            case 2:
                AnonymousClass933 r1 = (AnonymousClass933) this.A01;
                r1.CEx();
                r1.A5H(r1.A0B);
                return;
            case 3:
                AnonymousClass91M r3 = (AnonymousClass91M) this.A01;
                r3.A03.A0A(AnonymousClass001.A1E(a7b, "incorrect format retry: get-methods request error: ", AnonymousClass000.A10()), (Throwable) null);
                r3.A56();
                return;
            case 4:
                return;
            case 5:
                ((PaymentSettingsFragment) this.A01).A0B.A04();
                return;
            case 6:
                A00(a7b);
                return;
            case 7:
                ((C161588Gc) this.A01).A08.A0F(C198789yu.A00(24));
                return;
            case 8:
                AnonymousClass8G9 r32 = (AnonymousClass8G9) this.A01;
                AnonymousClass8G9.A00(r32);
                C17900vP.A0Z(a7b, "PAY: BrazilMerchantDetailsViewModel removePayment/onRequestError. paymentNetworkError: ", AnonymousClass000.A10());
                ? obj = new Object();
                obj.A01 = 6;
                obj.A00 = 2131895654;
                r32.A03.A0F(obj);
                return;
            case 9:
                AnonymousClass3MX.A1K(((BrazilPixKeySettingViewModel) this.A01).A01, 2);
                AnonymousClass8BS.A1F("BrazilPixKeySettingViewModel", "deleteAccount/onRequestError");
                return;
            case 10:
                Log.i("DyiViewModel/delete-report/on-error");
                if (a7b.A00 == 404) {
                    AnonymousClass96M r12 = (AnonymousClass96M) this.A01;
                    A5B a5b = r12.A06;
                    String str = r12.A08;
                    synchronized (a5b) {
                        a5b.A04(str);
                    }
                    AnonymousClass3MX.A1K(r12.A02, a5b.A02(str));
                    return;
                }
                ((AnonymousClass96M) this.A01).A03.A0E(AnonymousClass8BV.A08(a7b, 1));
                return;
            default:
                StringBuilder A0K = C18070vi.A0K(a7b);
                A0K.append("PAY: BusinessHubViewModel unlinkMerchantAccount/onRequestError paymentNetworkError: [");
                A0K.append(a7b.A00);
                A0K.append("] ");
                C17890vO.A19(A0K, a7b.A06);
                C198179xu.A00(C108945cZ.A0Q(((PaymentMerchantAccountViewModel) this.A01).A08), (Object) null, AnonymousClass8BR.A0w(a7b.A06), 1);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.9NW, java.lang.Object] */
    public void C3X(A7B a7b) {
        switch (this.A00) {
            case 0:
                ((C21132Af0) ((C20904AbK) this.A01).A02).A0B(AnonymousClass000.A0h());
                return;
            case 1:
                ((AnonymousClass1FU) this.A01).A05.A0J(C21447AkE.A00(this, 6));
                return;
            case 2:
                AnonymousClass933 r1 = (AnonymousClass933) this.A01;
                r1.CEx();
                r1.A5H(r1.A0B);
                return;
            case 3:
                AnonymousClass91M r3 = (AnonymousClass91M) this.A01;
                r3.A03.A0A(AnonymousClass001.A1E(a7b, "incorrect format retry: get-methods response error: ", AnonymousClass000.A10()), (Throwable) null);
                r3.A56();
                return;
            case 4:
                ((AnonymousClass1FU) this.A01).CEx();
                return;
            case 5:
                C18070vi.A0d(a7b, 0);
                P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment = (P2mLitePaymentSettingsFragment) this.A01;
                C189619jX r2 = p2mLitePaymentSettingsFragment.A06;
                if (r2 != null) {
                    r2.A00((long) a7b.A00);
                }
                p2mLitePaymentSettingsFragment.A0B.A04();
                return;
            case 6:
                A00(a7b);
                return;
            case 7:
                ((C161588Gc) this.A01).A08.A0F(C198789yu.A00(24));
                return;
            case 8:
                AnonymousClass8G9 r32 = (AnonymousClass8G9) this.A01;
                AnonymousClass8G9.A00(r32);
                C17900vP.A0Y(a7b, "PAY: BrazilMerchantDetailsViewModel removePayment/onResponseError. paymentNetworkError: ", AnonymousClass000.A10());
                ? obj = new Object();
                obj.A01 = 6;
                obj.A00 = 2131895654;
                r32.A03.A0F(obj);
                return;
            case 9:
                C18070vi.A0d(a7b, 0);
                AnonymousClass3MX.A1K(((BrazilPixKeySettingViewModel) this.A01).A01, 2);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("deleteAccount/onRequestError");
                AnonymousClass8BS.A1F("BrazilPixKeySettingViewModel", C17880vN.A0t(A10, a7b.A00));
                return;
            case 10:
                Log.i("DyiViewModel/delete-report/on-error");
                ((AnonymousClass96M) this.A01).A03.A0E(AnonymousClass8BV.A08(a7b, 1));
                return;
            default:
                StringBuilder A0K = C18070vi.A0K(a7b);
                A0K.append("PAY: BusinessHubViewModel unlinkMerchantAccount/onRequestError paymentNetworkError: [");
                A0K.append(a7b.A00);
                A0K.append("] ");
                C17890vO.A19(A0K, a7b.A06);
                C198179xu.A00(C108945cZ.A0Q(((PaymentMerchantAccountViewModel) this.A01).A08), (Object) null, AnonymousClass8BR.A0w(a7b.A06), 1);
                return;
        }
    }
}
