package X;

import android.view.View;

public class AFR implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AFR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AFR(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v53, resolved type: X.9yu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: X.9by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity} */
    /* JADX WARNING: type inference failed for: r1v35, types: [X.9NW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v42, types: [X.9NW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v14, types: [X.9NW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v18, types: [java.lang.Object, X.9NM] */
    /* JADX WARNING: type inference failed for: r4v19, types: [java.lang.Object, X.9NM] */
    /* JADX WARNING: type inference failed for: r4v20, types: [java.lang.Object, X.9NM] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02fa, code lost:
        r1 = new X.C198789yu(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0314, code lost:
        r1 = new java.lang.Object();
        r1.A01 = r0;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x031b, code lost:
        r2.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x031e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0070, code lost:
        if (r2 == (r6 - 1)) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0072, code lost:
        r7.append(" OR ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        X.C17880vN.A1S(r5, r9[r2], r2);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03c0, code lost:
        com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet.A01(r3, java.lang.Integer.valueOf(r0), r3.A06, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03ca, code lost:
        r3.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007d, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("type=?");
        X.C17880vN.A1S(r5, 40, r6);
        r1 = X.AnonymousClass000.A10();
        r1.append("((");
        r1.append(r7);
        r1.append(") AND (");
        r1.append(r2);
        r0 = android.util.Pair.create(r5, X.AnonymousClass000.A0y("))", r1));
        r4.A00 = new X.C20249ADh((java.lang.String) r0.second, (java.lang.String[]) r0.first);
        r0 = r3.A02;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x046a, code lost:
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x046d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x048b, code lost:
        r0 = "fieldStatsLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x048e, code lost:
        r0 = "indiaUpiFieldStatsLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0490, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0494, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04bf, code lost:
        r3.A05 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04ce, code lost:
        r0 = r0.A01;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04dc, code lost:
        r0 = r1.A08;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04de, code lost:
        r0.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0127, code lost:
        r0.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005a, code lost:
        r7 = X.AnonymousClass000.A10();
        r6 = r9.length;
        r5 = new java.lang.String[(r6 + 1)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021f, code lost:
        r1 = new X.A09(r13, r2, (java.lang.Integer) null);
        r1.A02 = X.AnonymousClass1Xr.A02(r3.A05);
        r1.A01(X.AnonymousClass3Ma.A05(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0234, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x029e, code lost:
        r1.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a0, code lost:
        r2.A07.A00.A0E(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (r2 >= r6) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        r7.append("status=?");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x046e;
                case 1: goto L_0x044e;
                case 2: goto L_0x0431;
                case 3: goto L_0x040a;
                case 4: goto L_0x03ce;
                case 5: goto L_0x0176;
                case 6: goto L_0x03bb;
                case 7: goto L_0x03ac;
                case 8: goto L_0x039b;
                case 9: goto L_0x038e;
                case 10: goto L_0x0384;
                case 11: goto L_0x0372;
                case 12: goto L_0x0366;
                case 13: goto L_0x0356;
                case 14: goto L_0x033d;
                case 15: goto L_0x0331;
                case 16: goto L_0x031f;
                case 17: goto L_0x0153;
                case 18: goto L_0x04c2;
                case 19: goto L_0x012b;
                case 20: goto L_0x030d;
                case 21: goto L_0x0305;
                case 22: goto L_0x00ff;
                case 23: goto L_0x04c2;
                case 24: goto L_0x0045;
                case 25: goto L_0x002f;
                case 26: goto L_0x0019;
                case 27: goto L_0x02d8;
                case 28: goto L_0x02bf;
                case 29: goto L_0x04d1;
                case 30: goto L_0x00dc;
                case 31: goto L_0x04b0;
                case 32: goto L_0x02b7;
                case 33: goto L_0x04a3;
                case 34: goto L_0x02b1;
                case 35: goto L_0x0495;
                case 36: goto L_0x02a8;
                case 37: goto L_0x0294;
                case 38: goto L_0x0282;
                case 39: goto L_0x0277;
                case 40: goto L_0x0250;
                case 41: goto L_0x00d0;
                case 42: goto L_0x00d0;
                case 43: goto L_0x0242;
                case 44: goto L_0x0235;
                case 45: goto L_0x00b9;
                case 46: goto L_0x0217;
                case 47: goto L_0x020e;
                case 48: goto L_0x01b5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r2 = r0.getContext()
            java.lang.String r0 = "market://details?id=com.whatsapp"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            X.AnonymousClass8BT.A14(r2, r1, r0)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r3 = r12.A01
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r3 = (com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel) r3
            r2 = 0
            X.9NM r4 = new X.9NM
            r4.<init>()
            r0 = 1
            r4.A01 = r0
            r4.A02 = r2
            int[] r9 = new int[r0]
            r0 = 415(0x19f, float:5.82E-43)
            r9[r2] = r0
            goto L_0x005a
        L_0x002f:
            java.lang.Object r3 = r12.A01
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r3 = (com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel) r3
            r2 = 0
            X.9NM r4 = new X.9NM
            r4.<init>()
            r0 = 1
            r4.A01 = r0
            r4.A02 = r0
            r0 = 2
            int[] r9 = new int[r0]
            r9 = {20, 401} // fill-array
            goto L_0x005a
        L_0x0045:
            java.lang.Object r3 = r12.A01
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r3 = (com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel) r3
            r2 = 0
            X.9NM r4 = new X.9NM
            r4.<init>()
            r0 = 1
            r4.A01 = r0
            r4.A02 = r2
            r0 = 2
            int[] r9 = new int[r0]
            r9 = {417, 418} // fill-array
        L_0x005a:
            r8 = 40
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            int r6 = r9.length
            int r0 = r6 + 1
            java.lang.String[] r5 = new java.lang.String[r0]
        L_0x0065:
            java.lang.String r1 = " OR "
            if (r2 >= r6) goto L_0x007d
            java.lang.String r0 = "status=?"
            r7.append(r0)
            int r0 = r6 + -1
            if (r2 == r0) goto L_0x0075
            r7.append(r1)
        L_0x0075:
            r0 = r9[r2]
            X.C17880vN.A1S(r5, r0, r2)
            int r2 = r2 + 1
            goto L_0x0065
        L_0x007d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "type=?"
            r2.append(r0)
            X.C17880vN.A1S(r5, r8, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "(("
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ") AND ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "))"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Pair r0 = android.util.Pair.create(r5, r0)
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.first
            java.lang.String[] r1 = (java.lang.String[]) r1
            X.ADh r0 = new X.ADh
            r0.<init>(r2, r1)
            r4.A00 = r0
            X.1wy r0 = r3.A02
            goto L_0x0127
        L_0x00b9:
            java.lang.Object r1 = r12.A01
            com.whatsapp.payments.ui.widget.PaymentView r1 = (com.whatsapp.payments.ui.widget.PaymentView) r1
            X.BDw r0 = r1.A0n
            r0.C0K()
            boolean r0 = com.whatsapp.payments.ui.widget.PaymentView.A06(r1)
            if (r0 == 0) goto L_0x0018
            X.74J r0 = X.AnonymousClass96c.A07(r1)
            r0.A0F()
            return
        L_0x00d0:
            java.lang.Object r0 = r12.A01
            X.AQ3 r0 = (X.AQ3) r0
            android.view.View$OnClickListener r0 = r0.A00
            if (r0 == 0) goto L_0x0018
            r0.onClick(r13)
            return
        L_0x00dc:
            java.lang.Object r4 = r12.A01
            X.96K r4 = (X.AnonymousClass96K) r4
            r0 = 1
            r4.A0q(r0)
            X.AQF r3 = r4.A09
            X.9NU r0 = r4.A06
            X.AW0 r0 = r0.A01
            java.lang.String r2 = r0.A0K
            X.AZH r1 = new X.AZH
            r1.<init>(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0018
            java.util.ArrayList r0 = X.C108965cb.A0s(r2)
            X.AQF.A01(r1, r3, r0)
            return
        L_0x00ff:
            java.lang.Object r3 = r12.A01
            X.8G9 r3 = (X.AnonymousClass8G9) r3
            X.8pO r0 = r3.A01
            X.8pb r1 = r0.A08
            X.8pX r1 = (X.AnonymousClass8pX) r1
            java.lang.String r0 = r1.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0018
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
        L_0x0127:
            r0.A0F(r4)
            return
        L_0x012b:
            java.lang.Object r2 = r12.A01
            X.8G9 r2 = (X.AnonymousClass8G9) r2
            X.8pO r0 = r2.A01
            X.8pb r1 = r0.A08
            X.8pX r1 = (X.AnonymousClass8pX) r1
            if (r1 == 0) goto L_0x0018
            java.lang.String r0 = r1.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0018
            r0 = 2
            X.9NW r3 = new X.9NW
            r3.<init>()
            r3.A01 = r0
            java.lang.String r0 = r1.A06
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r3.A03 = r0
            X.1wy r0 = r2.A03
            goto L_0x04de
        L_0x0153:
            java.lang.Object r2 = r12.A01
            X.95E r2 = (X.AnonymousClass95E) r2
            r0 = 8
            r13.setVisibility(r0)
            android.widget.ListView r1 = r2.A03
            r0 = 0
            r1.setVisibility(r0)
            r0 = 1
            r2.A00 = r0
            X.BD4 r3 = r2.A04
            if (r3 == 0) goto L_0x0018
            r0 = 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "payment_transaction_details"
            X.AnonymousClass8BU.A1C(r3, r2, r0, r1)
            return
        L_0x0176:
            java.lang.Object r4 = r12.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity r4 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity) r4
            X.AZ6 r5 = r4.A02
            if (r5 == 0) goto L_0x048b
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = X.AnonymousClass8BX.A0Y(r4)
            r1 = 1
            java.lang.String r0 = "alias_intro"
            r5.BiL(r3, r0, r2, r1)
            X.A2y r0 = r4.A03
            if (r0 == 0) goto L_0x0488
            X.AEC r0 = r0.A01()
            if (r0 == 0) goto L_0x0018
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r3 = "extra_payment_name"
            android.os.Parcelable r1 = r0.getParcelableExtra(r3)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r4, r0)
            r2.putExtra(r3, r1)
            java.lang.String r1 = "extra_mapper_recover_alias"
            r0 = 1
            r2.putExtra(r1, r0)
            r4.A3q(r2, r0)
            return
        L_0x01b5:
            java.lang.Object r6 = r12.A01
            X.96T r6 = (X.AnonymousClass96T) r6
            X.AW0 r2 = r6.A0N
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x01fb
            X.1QS r1 = r6.A0U
            java.lang.String r0 = "P2M_LITE"
            X.AZ9 r5 = r1.A05(r0)
            if (r5 == 0) goto L_0x01fb
        L_0x01ca:
            android.content.Context r4 = r6.getContext()
            X.AW0 r3 = r6.A0N
            java.lang.String r8 = r6.A0Z
            int r2 = r6.A00
            r11 = 1
            boolean r1 = r3.A0K()
            r0 = 44
            if (r1 == 0) goto L_0x01df
            r0 = 43
        L_0x01df:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A03
            r0 = 40
            if (r1 == r0) goto L_0x01ea
            r11 = 0
        L_0x01ea:
            if (r5 == 0) goto L_0x01f7
            X.BD4 r6 = r5.BRb()
            if (r6 == 0) goto L_0x01f7
            r10 = 1
            r9 = 0
            r6.BiI(r7, r8, r9, r10, r11)
        L_0x01f7:
            X.AnonymousClass9RS.A00(r4, r3, r5, r8, r2)
            return
        L_0x01fb:
            X.1QS r1 = r6.A0U
            java.lang.String r0 = r2.A0G
            X.2is r1 = r1.A04(r0)
            if (r1 == 0) goto L_0x020c
            java.lang.String r0 = r2.A0I
            X.BD1 r5 = r1.A00(r0)
            goto L_0x01ca
        L_0x020c:
            r5 = 0
            goto L_0x01ca
        L_0x020e:
            java.lang.Object r3 = r12.A01
            X.96T r3 = (X.AnonymousClass96T) r3
            X.AW0 r0 = r3.A0N
            com.whatsapp.jid.UserJid r2 = r0.A0E
            goto L_0x021f
        L_0x0217:
            java.lang.Object r3 = r12.A01
            X.96T r3 = (X.AnonymousClass96T) r3
            X.AW0 r0 = r3.A0N
            com.whatsapp.jid.UserJid r2 = r0.A0D
        L_0x021f:
            r0 = 0
            X.A09 r1 = new X.A09
            r1.<init>(r13, r2, r0)
            android.widget.ImageView r0 = r3.A05
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r0)
            r1.A02 = r0
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r3)
            r1.A01(r0)
            return
        L_0x0235:
            java.lang.Object r1 = r12.A01
            com.whatsapp.payments.ui.widget.PaymentView r1 = (com.whatsapp.payments.ui.widget.PaymentView) r1
            X.BDw r0 = r1.A0n
            r0.C58()
            r1.A0B()
            return
        L_0x0242:
            java.lang.Object r0 = r12.A01
            com.whatsapp.payments.ui.widget.PaymentView r0 = (com.whatsapp.payments.ui.widget.PaymentView) r0
            X.AnonymousClass96c.A09(r0)
            X.9p9 r1 = r0.A0r
            r0 = 1
            r1.A01(r0)
            return
        L_0x0250:
            java.lang.Object r2 = r12.A01
            com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow r2 = (com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow) r2
            X.1QS r1 = r2.A01
            X.AW0 r0 = r2.A00
            java.lang.String r0 = r0.A0G
            X.2is r1 = r1.A04(r0)
            if (r1 == 0) goto L_0x0275
            X.AW0 r0 = r2.A00
            java.lang.String r0 = r0.A0I
            X.BD1 r4 = r1.A00(r0)
        L_0x0268:
            android.content.Context r3 = r2.getContext()
            X.AW0 r2 = r2.A00
            java.lang.String r1 = "payment_home"
            r0 = 0
            X.AnonymousClass9RS.A00(r3, r2, r4, r1, r0)
            return
        L_0x0275:
            r4 = 0
            goto L_0x0268
        L_0x0277:
            java.lang.Object r2 = r12.A01
            com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment r2 = (com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment) r2
            X.9bq r1 = new X.9bq
            r1.<init>()
            r0 = 3
            goto L_0x029e
        L_0x0282:
            java.lang.Object r2 = r12.A01
            com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment r2 = (com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment) r2
            X.9bq r1 = new X.9bq
            r1.<init>()
            r0 = 2
            r1.A01 = r0
            r0 = 2131897575(0x7f122ce7, float:1.9430043E38)
            r1.A00 = r0
            goto L_0x02a0
        L_0x0294:
            java.lang.Object r2 = r12.A01
            com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment r2 = (com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment) r2
            X.9bq r1 = new X.9bq
            r1.<init>()
            r0 = 1
        L_0x029e:
            r1.A01 = r0
        L_0x02a0:
            X.8FM r0 = r2.A07
            X.1DT r0 = r0.A00
            r0.A0E(r1)
            return
        L_0x02a8:
            java.lang.Object r1 = r12.A01
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r1 = (com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel) r1
            r0 = -1
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel.A00(r1, r0)
            return
        L_0x02b1:
            java.lang.Object r0 = r12.A01
            X.C108945cZ.A1P(r0)
            return
        L_0x02b7:
            java.lang.Object r0 = r12.A01
            X.8Gc r0 = (X.C161588Gc) r0
            r0.A0Z()
            return
        L_0x02bf:
            java.lang.Object r5 = r12.A01
            X.96K r5 = (X.AnonymousClass96K) r5
            X.BD4 r4 = r5.A0f
            r0 = 199(0xc7, float:2.79E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "payment_transaction_details"
            java.lang.String r1 = r5.A00
            r0 = 1
            r4.BiL(r3, r2, r1, r0)
            X.1wy r2 = r5.A08
            r0 = 29
            goto L_0x02fa
        L_0x02d8:
            java.lang.Object r3 = r12.A01
            X.8Gc r3 = (X.C161588Gc) r3
            X.9NU r0 = r3.A06
            if (r0 == 0) goto L_0x0300
            X.1R2 r1 = r3.A0k
            X.AW0 r0 = r0.A01
            boolean r0 = r1.A0j(r0)
            if (r0 == 0) goto L_0x0300
            X.0ve r2 = r1.A07
            r1 = 11295(0x2c1f, float:1.5828E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0300
            X.1wy r2 = r3.A08
            r0 = 30
        L_0x02fa:
            X.96D r1 = new X.96D
            r1.<init>(r0)
            goto L_0x031b
        L_0x0300:
            X.1wy r2 = r3.A08
            r0 = 24
            goto L_0x02fa
        L_0x0305:
            java.lang.Object r0 = r12.A01
            X.8G9 r0 = (X.AnonymousClass8G9) r0
            X.1wy r2 = r0.A03
            r0 = 0
            goto L_0x0314
        L_0x030d:
            java.lang.Object r0 = r12.A01
            X.8G9 r0 = (X.AnonymousClass8G9) r0
            X.1wy r2 = r0.A03
            r0 = 1
        L_0x0314:
            X.9NW r1 = new X.9NW
            r1.<init>()
            r1.A01 = r0
        L_0x031b:
            r2.A0F(r1)
            return
        L_0x031f:
            java.lang.Object r3 = r12.A01
            X.94D r3 = (X.AnonymousClass94D) r3
            java.util.List r0 = X.C42011xT.A0I
            X.BD6 r2 = r3.A02
            X.AES r1 = r3.A01
            X.9b1 r0 = r3.A00
            java.lang.String r0 = r0.A01
            r2.C5T(r1, r0)
            return
        L_0x0331:
            java.lang.Object r1 = r12.A01
            X.94F r1 = (X.AnonymousClass94F) r1
            java.util.List r0 = X.C42011xT.A0I
            X.BD6 r0 = r1.A02
            r0.C32()
            return
        L_0x033d:
            java.lang.Object r1 = r12.A01
            X.94J r1 = (X.AnonymousClass94J) r1
            java.util.List r0 = X.C42011xT.A0I
            X.BD6 r4 = r1.A05
            X.21K r3 = r1.A06
            X.9b1 r0 = r1.A02
            if (r0 == 0) goto L_0x0353
            X.1BI r2 = r0.A00
        L_0x034d:
            long r0 = r1.A00
            r4.ByJ(r2, r3, r0)
            return
        L_0x0353:
            X.1BI r2 = r1.A04
            goto L_0x034d
        L_0x0356:
            java.lang.Object r3 = r12.A01
            X.94J r3 = (X.AnonymousClass94J) r3
            java.util.List r0 = X.C42011xT.A0I
            X.BD6 r2 = r3.A05
            X.21K r1 = r3.A06
            java.lang.String r0 = r3.A08
            r2.Bzc(r1, r0)
            return
        L_0x0366:
            java.lang.Object r1 = r12.A01
            X.94J r1 = (X.AnonymousClass94J) r1
            java.util.List r0 = X.C42011xT.A0I
            X.BD6 r0 = r1.A05
            r0.Bza()
            return
        L_0x0372:
            java.lang.Object r3 = r12.A01
            X.9Yc r3 = (X.C183399Yc) r3
            java.util.List r0 = X.C42011xT.A0I
            X.949 r3 = (X.AnonymousClass949) r3
            X.BD6 r2 = r3.A01
            X.21K r1 = r3.A02
            X.1DT r0 = r3.A00
            r2.CA9(r0, r1)
            return
        L_0x0384:
            java.lang.Object r1 = r12.A01
            X.BD6 r1 = (X.BD6) r1
            java.util.List r0 = X.C42011xT.A0I
            r1.CAA()
            return
        L_0x038e:
            java.lang.Object r0 = r12.A01
            X.944 r0 = (X.AnonymousClass944) r0
            X.AnonymousClass3MX.A1O(r0)
            X.BD6 r0 = r0.A00
            r0.BlW()
            return
        L_0x039b:
            java.lang.Object r0 = r12.A01
            X.948 r0 = (X.AnonymousClass948) r0
            X.AnonymousClass3MX.A1O(r0)
            X.BD6 r1 = r0.A01
            X.9b1 r0 = r0.A00
            java.lang.String r0 = r0.A01
            r1.Bl6(r0)
            return
        L_0x03ac:
            java.lang.Object r3 = r12.A01
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r3 = (com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet) r3
            X.B98 r1 = r3.A05
            if (r1 == 0) goto L_0x03ca
            java.lang.String r0 = r3.A06
            r1.BAD(r0)
            r0 = 5
            goto L_0x03c0
        L_0x03bb:
            java.lang.Object r3 = r12.A01
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r3 = (com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet) r3
            r0 = 3
        L_0x03c0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r3.A06
            r0 = 1
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet.A01(r3, r2, r1, r0)
        L_0x03ca:
            r3.A28()
            return
        L_0x03ce:
            java.lang.Object r5 = r12.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity) r5
            X.AZ6 r4 = r5.A02
            if (r4 == 0) goto L_0x048b
            r0 = 167(0xa7, float:2.34E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = X.AnonymousClass8BX.A0Y(r5)
            r1 = 1
            java.lang.String r0 = "alias_intro"
            r4.BiL(r3, r0, r2, r1)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r3 = "extra_referral_screen"
            java.lang.String r1 = r0.getStringExtra(r3)
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r5, r0)
            r2.putExtra(r3, r1)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "extra_payment_name"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            r2.putExtra(r1, r0)
            r5.startActivity(r2)
            return
        L_0x040a:
            java.lang.Object r5 = r12.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity) r5
            X.AZ6 r4 = r5.A00
            if (r4 == 0) goto L_0x048e
            r0 = 129(0x81, float:1.81E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.AnonymousClass8BX.A0Y(r5)
            r2 = 1
            java.lang.String r0 = "pending_alias_setup"
            r4.BiL(r3, r0, r1, r2)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.class
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r5, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r0)
            r5.A3q(r1, r2)
            return
        L_0x0431:
            java.lang.Object r5 = r12.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity) r5
            X.AZ6 r4 = r5.A00
            if (r4 == 0) goto L_0x048e
            r0 = 121(0x79, float:1.7E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = X.AnonymousClass8BX.A0Y(r5)
            r1 = 1
            java.lang.String r0 = "pending_alias_setup"
            r4.BiL(r3, r0, r2, r1)
            r0 = -1
            r5.setResult(r0)
            goto L_0x046a
        L_0x044e:
            java.lang.Object r5 = r12.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity) r5
            r0 = -1
            r5.setResult(r0)
            X.AZ6 r4 = r5.A03
            if (r4 == 0) goto L_0x048e
            r0 = 85
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = X.AnonymousClass8BX.A0Y(r5)
            r1 = 1
            java.lang.String r0 = "alias_complete"
            r4.BiL(r3, r0, r2, r1)
        L_0x046a:
            r5.finish()
            return
        L_0x046e:
            java.lang.Object r5 = r12.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity) r5
            X.AZ6 r4 = r5.A05
            if (r4 == 0) goto L_0x048b
            java.lang.Integer r3 = X.C17880vN.A0l()
            java.lang.String r2 = X.AnonymousClass8BX.A0Y(r5)
            r1 = 1
            java.lang.String r0 = "create_numeric_upi_alias"
            r4.BiL(r3, r0, r2, r1)
            com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity.A03(r5)
            return
        L_0x0488:
            java.lang.String r0 = "indiaUpiMapperAliasManager"
            goto L_0x0490
        L_0x048b:
            java.lang.String r0 = "fieldStatsLogger"
            goto L_0x0490
        L_0x048e:
            java.lang.String r0 = "indiaUpiFieldStatsLogger"
        L_0x0490:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0495:
            java.lang.Object r2 = r12.A01
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r2 = (com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel) r2
            r1 = -1
            r0 = 1
            X.9by r3 = new X.9by
            r3.<init>(r0, r1)
            X.1Dg r0 = r2.A01
            goto L_0x04de
        L_0x04a3:
            java.lang.Object r1 = r12.A01
            X.8Gc r1 = (X.C161588Gc) r1
            r0 = 17
            X.9yu r3 = X.C198789yu.A00(r0)
            X.AW0 r0 = r1.A03
            goto L_0x04bf
        L_0x04b0:
            java.lang.Object r1 = r12.A01
            X.8Gc r1 = (X.C161588Gc) r1
            r0 = 28
            X.9yu r3 = X.C198789yu.A00(r0)
            X.9NU r0 = r1.A06
            if (r0 != 0) goto L_0x04ce
            r0 = 0
        L_0x04bf:
            r3.A05 = r0
            goto L_0x04dc
        L_0x04c2:
            java.lang.Object r1 = r12.A01
            X.8Gc r1 = (X.C161588Gc) r1
            r0 = 201(0xc9, float:2.82E-43)
            X.9yu r3 = X.C198789yu.A00(r0)
            X.9NU r0 = r1.A06
        L_0x04ce:
            X.AW0 r0 = r0.A01
            goto L_0x04bf
        L_0x04d1:
            java.lang.Object r1 = r12.A01
            X.8Gc r1 = (X.C161588Gc) r1
            r0 = 107(0x6b, float:1.5E-43)
            X.96D r3 = new X.96D
            r3.<init>(r0)
        L_0x04dc:
            X.1wy r0 = r1.A08
        L_0x04de:
            r0.A0F(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFR.onClick(android.view.View):void");
    }
}
