package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import java.util.ArrayList;

/* renamed from: X.8zY  reason: invalid class name and case insensitive filesystem */
public class C175958zY extends C175498yo {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175958zY(android.content.Context r13, X.AnonymousClass1KB r14, X.C33711jG r15, X.C196259ui r16, X.A0S r17, X.AZ6 r18, X.AnonymousClass90Z r19, java.lang.String r20, int r21) {
        /*
            r12 = this;
            r2 = r12
            r0 = r21
            r12.A00 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r18
            r8 = r19
            r10 = r20
            r1 = r17
            int r21 = 5 - r21
            if (r21 == 0) goto L_0x0020
            java.lang.String r9 = "upi-get-accounts"
            r11 = 18
        L_0x001a:
            r12.A01 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0020:
            java.lang.String r9 = "upi-bind-device"
            r11 = 20
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175958zY.<init>(android.content.Context, X.1KB, X.1jG, X.9ui, X.A0S, X.AZ6, X.90Z, java.lang.String, int):void");
    }

    public void A04(A7B a7b) {
        switch (this.A00) {
            case 0:
                super.A04(a7b);
                BCB bcb = ((C175718zA) this.A01).A04;
                if (bcb != null) {
                    bcb.BvE(a7b, false);
                    return;
                }
                return;
            case 1:
                super.A04(a7b);
                C22447B8f b8f = ((C175678z6) this.A01).A00;
                if (b8f != null) {
                    b8f.C2B(a7b);
                    return;
                }
                return;
            case 2:
                super.A04(a7b);
                BBA bba = ((C175768zF) this.A01).A00;
                if (bba != null) {
                    bba.BmR(a7b, true, true);
                    return;
                }
                return;
            case 3:
            case 4:
                super.A04(a7b);
                BBA bba2 = ((C175768zF) this.A01).A00;
                if (bba2 != null) {
                    bba2.BmR(a7b, true, false);
                    return;
                }
                return;
            case 5:
                super.A04(a7b);
                C17900vP.A0Y(a7b, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", AnonymousClass000.A10());
                A07(a7b);
                return;
            case 6:
                super.A04(a7b);
                C17900vP.A0Y(a7b, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", AnonymousClass000.A10());
                BBB bbb = ((A0S) this.A01).A01;
                if (bbb != null) {
                    bbb.BmP(a7b, (ArrayList) null);
                    return;
                }
                return;
            case 9:
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this.A01;
                indiaUpiBankAccountDetailsActivity.A0P.A05("onRefreshPaymentMethod/onRequestError");
                indiaUpiBankAccountDetailsActivity.CEx();
                C73193Ri A002 = C73193Ri.A00(indiaUpiBankAccountDetailsActivity);
                A002.A0V(2131894220);
                A002.A0U(2131887941);
                A002.A0X(new A9R(5), 2131899286);
                AnonymousClass3MY.A1G(A002);
                return;
            default:
                super.A04(a7b);
                BBD bbd = ((C175838zM) this.A01).A00;
                if (bbd != null) {
                    bbd.C5K(a7b);
                    return;
                }
                return;
        }
    }

    public void A05(A7B a7b) {
        switch (this.A00) {
            case 0:
                super.A05(a7b);
                BCB bcb = ((C175718zA) this.A01).A04;
                if (bcb != null) {
                    bcb.BvE(a7b, false);
                    return;
                }
                return;
            case 1:
                super.A05(a7b);
                C22447B8f b8f = ((C175678z6) this.A01).A00;
                if (b8f != null) {
                    b8f.C2B(a7b);
                    return;
                }
                return;
            case 2:
                super.A05(a7b);
                BBA bba = ((C175768zF) this.A01).A00;
                if (bba != null) {
                    bba.BmR(a7b, false, true);
                    return;
                }
                return;
            case 3:
            case 4:
                super.A05(a7b);
                BBA bba2 = ((C175768zF) this.A01).A00;
                if (bba2 != null) {
                    bba2.BmR(a7b, false, false);
                    return;
                }
                return;
            case 5:
                super.A05(a7b);
                C17900vP.A0Y(a7b, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", AnonymousClass000.A10());
                A07(a7b);
                return;
            case 6:
                super.A05(a7b);
                C17900vP.A0Y(a7b, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", AnonymousClass000.A10());
                BBB bbb = ((A0S) this.A01).A01;
                if (bbb != null) {
                    bbb.BmP(a7b, (ArrayList) null);
                    return;
                }
                return;
            case 9:
                super.A05(a7b);
                AnonymousClass1FU r0 = (AnonymousClass1FU) this.A01;
                r0.CEx();
                C73193Ri A002 = C73193Ri.A00(r0);
                A002.A0V(2131894220);
                A002.A0U(2131887941);
                A002.A0X(new A9R(4), 2131899286);
                AnonymousClass3MY.A1G(A002);
                return;
            default:
                super.A05(a7b);
                BBD bbd = ((C175838zM) this.A01).A00;
                if (bbd != null) {
                    bbd.C5K(a7b);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ef, code lost:
        if (r2 == null) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C29621ca r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x017a;
                case 1: goto L_0x00c2;
                case 2: goto L_0x0072;
                case 3: goto L_0x0041;
                case 4: goto L_0x0041;
                case 5: goto L_0x0015;
                case 6: goto L_0x01c9;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x01bb;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A06(r13)
            java.lang.Object r0 = r12.A01
            X.8zM r0 = (X.C175838zM) r0
            X.BBD r1 = r0.A00
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.C5K(r0)
        L_0x0014:
            return
        L_0x0015:
            super.A06(r13)
            java.lang.Object r5 = r12.A01
            X.A0S r5 = (X.A0S) r5
            X.A2l r0 = r5.A0H
            java.lang.String r4 = r0.A03()
            X.AXS r0 = r5.A0A
            java.lang.String r3 = r5.A03
            java.lang.String r2 = r5.A04
            r0.A0Q(r3, r2, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: "
            java.lang.String r0 = X.C175498yo.A01(r0, r3, r2, r4, r1)
            X.C17890vO.A1A(r1, r0)
            X.BBB r1 = r5.A01
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.BrM(r0)
            return
        L_0x0041:
            super.A06(r13)
            java.lang.Object r3 = r12.A01
            X.8zF r3 = (X.C175768zF) r3
            X.1QS r0 = r3.A08
            X.AZ9 r0 = X.AnonymousClass8BU.A0U(r0)
            X.B8c r1 = r0.BWK()
            X.C17960vV.A07(r1)
            X.1KI r0 = r3.A03
            java.util.ArrayList r2 = r1.CB8(r0, r13)
            X.A7U r1 = r3.A06
            X.9ui r0 = r3.A00
            X.9NK r0 = r1.A04(r0, r2)
            X.BBA r4 = r3.A00
            if (r4 == 0) goto L_0x0014
            java.util.ArrayList r3 = r0.A01
            java.util.ArrayList r2 = r0.A02
            X.8pH r1 = r0.A00
            r0 = 0
            r4.BmQ(r1, r3, r2, r0)
            return
        L_0x0072:
            super.A06(r13)
            java.lang.Object r2 = r12.A01
            X.8zF r2 = (X.C175768zF) r2
            X.1QS r0 = r2.A08
            X.AZ9 r0 = X.AnonymousClass8BU.A0U(r0)
            X.B8c r1 = r0.BWK()
            X.C17960vV.A07(r1)
            X.1KI r0 = r2.A03
            java.util.ArrayList r1 = r1.CB8(r0, r13)
            X.A7U r0 = r2.A06
            X.9ui r5 = r2.A00
            X.9NK r0 = r0.A04(r5, r1)
            X.BBA r4 = r2.A00
            if (r4 == 0) goto L_0x00a2
            java.util.ArrayList r3 = r0.A01
            java.util.ArrayList r2 = r0.A02
            X.8pH r1 = r0.A00
            r0 = 1
            r4.BmQ(r1, r3, r2, r0)
        L_0x00a2:
            java.lang.String r0 = "upi-batch"
            r5.A03(r0)
            java.lang.String r1 = "upi-list-keys"
            java.util.ArrayList r3 = r5.A05
            boolean r0 = r3.contains(r1)
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 != 0) goto L_0x00b6
            r5.A04(r1, r2)
        L_0x00b6:
            java.lang.String r1 = "upi-get-banks"
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0014
            r5.A04(r1, r2)
            return
        L_0x00c2:
            super.A06(r13)
            java.lang.Object r6 = r12.A01
            X.8z6 r6 = (X.C175678z6) r6
            X.1QS r0 = r6.A07
            X.AZ9 r0 = X.AnonymousClass8BU.A0U(r0)
            X.B8c r1 = r0.BWK()
            X.C17960vV.A07(r1)
            X.1KI r0 = r6.A03
            java.util.ArrayList r0 = r1.CB8(r0, r13)
            X.A7U r1 = r6.A05
            X.9ui r4 = r6.A00
            X.9NK r0 = r1.A04(r4, r0)
            java.util.ArrayList r5 = r0.A02
            X.8pH r2 = r0.A00
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x00f1
            r0 = 1
            if (r2 != 0) goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            java.lang.String r3 = "upi-get-psp-routing-and-list-keys"
            if (r0 == 0) goto L_0x015d
            r1.A05 = r5
            r1.A03 = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: "
            X.C17900vP.A0Y(r5, r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: "
            X.C17900vP.A0Y(r2, r0, r1)
            r4.A03(r3)
            X.B8f r7 = r6.A00
            if (r7 == 0) goto L_0x0131
            X.91L r7 = (X.AnonymousClass91L) r7
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x013f
            if (r2 == 0) goto L_0x013f
            r6 = 0
            X.10I r5 = r7.A05
            X.1QS r2 = r7.A0Q
            X.9YP r0 = new X.9YP
            r0.<init>(r7)
            X.9As r1 = new X.9As
            r1.<init>(r7, r2, r0)
            X.1F9[] r0 = new X.AnonymousClass1F9[r6]
            r5.CGD(r1, r0)
        L_0x0131:
            java.util.ArrayList r0 = r4.A05
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0014
            r0 = 500(0x1f4, float:7.0E-43)
            r4.A04(r3, r0)
            return
        L_0x013f:
            X.1QE r2 = r7.A0q
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onPspRoutingAndListKeys error. showGenericError error: "
            r1.append(r0)
            X.9ui r0 = r7.A01
            java.util.HashMap r0 = r0.A06
            java.lang.Number r0 = X.C108945cZ.A1D(r3, r0)
            int r0 = X.C72463Mc.A0B(r0)
            X.AnonymousClass8BV.A1F(r2, r1, r0)
            r7.A50()
            goto L_0x0131
        L_0x015d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: received invalid data from upi-get-psp-routing-and-list-keys: psps: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " pspRouting: "
            X.C17900vP.A0Z(r2, r0, r1)
            X.B8f r1 = r6.A00
            if (r1 == 0) goto L_0x0131
            X.A7B r0 = X.A7B.A00()
            r1.C2B(r0)
            goto L_0x0131
        L_0x017a:
            super.A06(r13)
            X.1ca r0 = X.AnonymousClass8BR.A0j(r13)
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x01aa
            java.lang.String r11 = "token"
            java.lang.String r9 = r0.A0Q(r11, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x019e
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/token stored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r8 = r12.A01
            X.8zA r8 = (X.C175718zA) r8
            X.AXS r7 = r8.A03
            monitor-enter(r7)
            goto L_0x01dc
        L_0x019e:
            java.lang.Object r0 = r12.A01
            X.8zA r0 = (X.C175718zA) r0
            X.BCB r0 = r0.A04
            if (r0 == 0) goto L_0x0014
            r0.BvE(r4, r5)
            return
        L_0x01aa:
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/token missing account node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r12.A01
            X.8zA r0 = (X.C175718zA) r0
            X.BCB r0 = r0.A04
            if (r0 == 0) goto L_0x0014
            r0.BvE(r4, r5)
            return
        L_0x01bb:
            super.A06(r13)
            java.lang.Object r0 = r12.A01
            X.91y r0 = (X.AnonymousClass91y) r0
            r0.CEx()
            X.10I r2 = r0.A0E
            r1 = 5
            goto L_0x01d3
        L_0x01c9:
            super.A06(r13)
            java.lang.Object r0 = r12.A01
            X.A0S r0 = (X.A0S) r0
            X.10I r2 = r0.A0J
            r1 = 4
        L_0x01d3:
            X.9BR r0 = new X.9BR
            r0.<init>(r13, r12, r1)
            X.C17890vO.A0u(r0, r2)
            return
        L_0x01dc:
            X.1QD r10 = r7.A01     // Catch:{ JSONException -> 0x020a }
            java.lang.String r1 = r10.A06()     // Catch:{ JSONException -> 0x020a }
            X.11P r0 = r7.A00     // Catch:{ JSONException -> 0x020a }
            long r2 = X.AnonymousClass11P.A01(r0)     // Catch:{ JSONException -> 0x020a }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x020a }
            if (r0 == 0) goto L_0x0205
            org.json.JSONObject r6 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x020a }
        L_0x01f2:
            java.lang.String r1 = "v"
            java.lang.String r0 = "2"
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x020a }
            r6.put(r11, r9)     // Catch:{ JSONException -> 0x020a }
            java.lang.String r0 = "tokenTs"
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x020a }
            X.AnonymousClass8BT.A1G(r10, r6)     // Catch:{ JSONException -> 0x020a }
            goto L_0x0210
        L_0x0205:
            org.json.JSONObject r6 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x020a }
            goto L_0x01f2
        L_0x020a:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs storeToken threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0249 }
        L_0x0210:
            monitor-exit(r7)
            android.util.Base64.decode(r9, r5)
            X.BCB r7 = r8.A04
            if (r7 == 0) goto L_0x021c
            r0 = 1
            r7.BvE(r4, r0)
        L_0x021c:
            X.AZC r6 = r8.A07
            java.lang.String r5 = r8.A0B
            X.10I r4 = r8.A0A
            X.1ek r3 = r8.A09
            java.lang.Class<X.9nB> r2 = X.C191789nB.class
            monitor-enter(r2)
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0246 }
            r1 = 0
            r0 = r0 ^ 1
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x0246 }
            boolean r0 = X.AnonymousClass8BR.A1S(r5)     // Catch:{ all -> 0x0246 }
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x0246 }
            X.9B6 r0 = new X.9B6     // Catch:{ all -> 0x0246 }
            r0.<init>(r7, r6, r3, r5)     // Catch:{ all -> 0x0246 }
            X.C191789nB.A0A = r0     // Catch:{ all -> 0x0246 }
            X.AnonymousClass3MW.A1T(r0, r4, r1)     // Catch:{ all -> 0x0246 }
            monitor-exit(r2)
            return
        L_0x0246:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0249:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175958zY.A06(X.1ca):void");
    }

    public void A07(A7B a7b) {
        A0S a0s = (A0S) this.A01;
        if (a0s.A01 != null) {
            if (a7b.A00 == 11453) {
                String A03 = a0s.A0H.A03();
                AXS axs = a0s.A0A;
                String str = a0s.A03;
                String str2 = a0s.A04;
                axs.A0Q(str, str2, A03);
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A1A(A10, C175498yo.A01("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ", str, str2, A03, A10));
            }
            a0s.A01.BrM(a7b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175958zY(Context context, AnonymousClass1KB r11, C175718zA r12, C33711jG r13, C196259ui r14, AZ6 az6) {
        super(context, r11, r13, r14, az6, "upi-get-token", 2);
        this.A00 = 0;
        this.A01 = r12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175958zY(android.content.Context r9, X.AnonymousClass1KB r10, X.C33711jG r11, X.C196259ui r12, X.C175838zM r13, X.AZ6 r14, int r15) {
        /*
            r8 = this;
            r0 = r8
            r8.A00 = r15
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            int r15 = 7 - r15
            if (r15 == 0) goto L_0x0015
            java.lang.String r6 = "upi-change-mpin"
            r7 = 7
        L_0x000f:
            r8.A01 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0015:
            java.lang.String r6 = "upi-set-mpin"
            r7 = 6
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175958zY.<init>(android.content.Context, X.1KB, X.1jG, X.9ui, X.8zM, X.AZ6, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175958zY(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C175678z6 r12) {
        super(context, r9, r10, r11, "upi-get-psp-routing-and-list-keys");
        this.A00 = 1;
        this.A01 = r12;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175958zY(Context context, AnonymousClass1KB r13, C33711jG r14, AZ6 az6, IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity) {
        super(context, r13, r14, (C196259ui) null, az6, (AnonymousClass90Z) null, "upi-get-accounts", "in_upi_get_accounts_tag", 18);
        this.A00 = 9;
        this.A01 = indiaUpiBankAccountDetailsActivity;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175958zY(android.content.Context r13, X.AnonymousClass1KB r14, X.C33711jG r15, X.C196259ui r16, X.C175768zF r17, X.AZ6 r18, X.AnonymousClass90Z r19, java.lang.String r20, int r21) {
        /*
            r12 = this;
            r2 = r12
            r0 = r21
            r12.A00 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r18
            r8 = r19
            r10 = r20
            r1 = r17
            int r21 = 2 - r21
            if (r21 == 0) goto L_0x001f
            java.lang.String r9 = "upi-get-banks"
            r11 = 4
        L_0x0019:
            r12.A01 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x001f:
            java.lang.String r9 = "upi-batch"
            r11 = 3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175958zY.<init>(android.content.Context, X.1KB, X.1jG, X.9ui, X.8zF, X.AZ6, X.90Z, java.lang.String, int):void");
    }
}
