package X;

/* renamed from: X.9R5  reason: invalid class name */
public abstract class AnonymousClass9R5 {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r2 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0121, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r5, X.AnonymousClass1BI r6, X.ALX r7, X.AnonymousClass1QO r8, X.C20279AEn r9, X.AnonymousClass205 r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16, boolean r17) {
        /*
            r1 = r16
            boolean r0 = r8.A02()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r8.A0M(r11)
            if (r0 == 0) goto L_0x0027
            X.1QS r4 = r7.A08
            java.lang.String r0 = "P2M_LITE"
            X.AZ9 r0 = r4.A05(r0)
            if (r0 != 0) goto L_0x011d
        L_0x0018:
            java.lang.String r0 = "GLOBAL_ORDER"
            X.AZ9 r0 = r4.A05(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.Class r0 = r0.BWV()
            if (r0 != 0) goto L_0x0125
        L_0x0026:
            return
        L_0x0027:
            r2 = 1
            if (r1 != r2) goto L_0x0043
            X.1QS r4 = r7.A08
            X.BD1 r0 = r4.A06()
            java.lang.Class r0 = r0.BWt()
            if (r0 == 0) goto L_0x0018
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r5, r0)
            java.lang.String r0 = "extra_is_quick_buy"
            android.content.Intent r2 = r1.putExtra(r0, r2)
            if (r2 != 0) goto L_0x0062
            goto L_0x0018
        L_0x0043:
            r0 = 2
            if (r1 != r0) goto L_0x00fa
            r3 = -1
        L_0x0047:
            r1 = -1
        L_0x0048:
            X.1QS r4 = r7.A08
            X.BD1 r0 = r4.A06()
            java.lang.Class r0 = r0.BWV()
            if (r0 == 0) goto L_0x0018
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r5, r0)
            java.lang.String r0 = "extra_quick_launch_option"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "extra_quick_launch_action"
            r2.putExtra(r0, r1)
        L_0x0062:
            X.AnonymousClass1R2.A0E(r2, r10)
            java.lang.String r0 = "extra_order_id"
            r2.putExtra(r0, r13)
            if (r9 == 0) goto L_0x00ca
            X.AEU r3 = r9.A0D
            java.lang.String r1 = "extra_order_discount_program_name"
            java.lang.String r0 = r3.A07
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_order_type"
            java.lang.String r0 = r9.A0M
            r2.putExtra(r1, r0)
            java.util.List r4 = r9.A0Q
            if (r4 == 0) goto L_0x0089
            java.util.ArrayList r1 = X.C17880vN.A10(r4)
            java.lang.String r0 = "extra_payment_settings"
            r2.putParcelableArrayListExtra(r0, r1)
        L_0x0089:
            X.ADi r0 = r3.A02
            if (r0 == 0) goto L_0x0094
            long r0 = r0.A00
            java.lang.String r3 = "extra_order_expiry_ts_in_sec"
            r2.putExtra(r3, r0)
        L_0x0094:
            boolean r1 = r8.A0O(r4)
            java.lang.String r0 = "extra_checkout_lite_enabled"
            r2.putExtra(r0, r1)
            X.0ve r3 = r8.A02
            r1 = 8583(0x2187, float:1.2027E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x00b0
            java.lang.String r1 = "extra_order_shipping_info"
            X.AES r0 = r9.A0B
            r2.putExtra(r1, r0)
        L_0x00b0:
            boolean r0 = r8.A0L(r9)
            if (r0 == 0) goto L_0x00bd
            java.lang.String r1 = "extra_order_coupon_info"
            X.ADy r0 = r9.A04
            r2.putExtra(r1, r0)
        L_0x00bd:
            java.util.List r0 = r9.A0R
            if (r0 == 0) goto L_0x00ca
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            java.lang.String r0 = "extra_preferred_payment_methods"
            r2.putParcelableArrayListExtra(r0, r1)
        L_0x00ca:
            java.lang.String r1 = "extra_transaction_type"
            java.lang.String r0 = "p2m"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "extra_payment_config_id"
            r2.putExtra(r0, r12)
            X.AnonymousClass8BR.A1D(r2, r14)
            if (r15 <= 0) goto L_0x00e0
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r2.putExtra(r0, r15)
        L_0x00e0:
            java.lang.String r0 = "extra_payment_type"
            r2.putExtra(r0, r11)
            java.lang.String r0 = "extra_is_template_message"
            r1 = r17
            r2.putExtra(r0, r1)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.setFlags(r0)
            java.lang.String r0 = "extra_jid"
            X.AnonymousClass3MY.A12(r2, r6, r0)
            r5.startActivity(r2)
            return
        L_0x00fa:
            r0 = 3
            if (r1 == r0) goto L_0x012b
            r0 = 14
            if (r1 == r0) goto L_0x012b
            r0 = 12
            if (r1 != r0) goto L_0x0108
            r3 = 7
            goto L_0x0047
        L_0x0108:
            r0 = 13
            if (r1 != r0) goto L_0x010f
            r3 = 5
            goto L_0x0047
        L_0x010f:
            r0 = 15
            if (r1 != r0) goto L_0x0117
            r3 = 8
            goto L_0x0047
        L_0x0117:
            X.1QS r4 = r7.A08
            X.BD1 r0 = r4.A06()
        L_0x011d:
            java.lang.Class r0 = r0.BWV()
            if (r0 != 0) goto L_0x0125
            goto L_0x0018
        L_0x0125:
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r5, r0)
            goto L_0x0062
        L_0x012b:
            r3 = 6
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9R5.A00(android.content.Context, X.1BI, X.ALX, X.1QO, X.AEn, X.205, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }
}
