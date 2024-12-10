package X;

import android.content.Intent;
import android.text.TextUtils;

public abstract class A7Z {
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r1.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C20118A8b r5) {
        /*
            r4 = 1
            if (r5 == 0) goto L_0x0033
            java.lang.String r0 = r5.A0O
            boolean r0 = X.C197929xV.A00(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r5.A0B
            java.lang.String r3 = r5.A0A
            if (r0 == 0) goto L_0x0028
            if (r3 == 0) goto L_0x0028
            r2 = 0
            java.lang.Float r0 = X.C20099A7c.A05(r0, r2)
            float r1 = r0.floatValue()
            java.lang.Float r0 = X.C20099A7c.A05(r3, r2)
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0033
        L_0x0028:
            java.lang.String r1 = r5.A0C
            if (r1 == 0) goto L_0x006d
            int r0 = r1.hashCode()
            switch(r0) {
                case 1536: goto L_0x0064;
                case 1537: goto L_0x0061;
                case 1538: goto L_0x005e;
                case 1539: goto L_0x005b;
                case 1540: goto L_0x0058;
                case 1541: goto L_0x0055;
                case 1542: goto L_0x0052;
                case 1543: goto L_0x004f;
                case 1544: goto L_0x004c;
                case 1545: goto L_0x0049;
                case 1567: goto L_0x0046;
                case 1568: goto L_0x0043;
                case 1569: goto L_0x0040;
                case 1570: goto L_0x003d;
                case 1571: goto L_0x003a;
                case 1572: goto L_0x0037;
                case 1603: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            return r4
        L_0x0034:
            java.lang.String r0 = "25"
            goto L_0x0066
        L_0x0037:
            java.lang.String r0 = "15"
            goto L_0x0066
        L_0x003a:
            java.lang.String r0 = "14"
            goto L_0x0066
        L_0x003d:
            java.lang.String r0 = "13"
            goto L_0x0066
        L_0x0040:
            java.lang.String r0 = "12"
            goto L_0x0066
        L_0x0043:
            java.lang.String r0 = "11"
            goto L_0x0066
        L_0x0046:
            java.lang.String r0 = "10"
            goto L_0x0066
        L_0x0049:
            java.lang.String r0 = "09"
            goto L_0x0066
        L_0x004c:
            java.lang.String r0 = "08"
            goto L_0x0066
        L_0x004f:
            java.lang.String r0 = "07"
            goto L_0x0066
        L_0x0052:
            java.lang.String r0 = "06"
            goto L_0x0066
        L_0x0055:
            java.lang.String r0 = "05"
            goto L_0x0066
        L_0x0058:
            java.lang.String r0 = "04"
            goto L_0x0066
        L_0x005b:
            java.lang.String r0 = "03"
            goto L_0x0066
        L_0x005e:
            java.lang.String r0 = "02"
            goto L_0x0066
        L_0x0061:
            java.lang.String r0 = "01"
            goto L_0x0066
        L_0x0064:
            java.lang.String r0 = "00"
        L_0x0066:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006d
            return r4
        L_0x006d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7Z.A04(X.A8b):boolean");
    }

    public static int A00(AnonymousClass18O r2, C20118A8b a8b) {
        AnonymousClass18Q r0;
        String str;
        if (a8b.A0P || (str = a8b.A02) == null || (!str.equals("GALLERY_QR_CODE") && !str.equals("DEEP_LINK"))) {
            r0 = AnonymousClass18O.A1G;
        } else {
            r0 = AnonymousClass18O.A1F;
        }
        return r2.A04(r0);
    }

    public static void A03(Intent intent, C20118A8b a8b, String str) {
        intent.putExtra("extra_new_mandate_transaction", true);
        intent.putExtra("extra_new_mandate_payee_name", a8b.A09);
        intent.putExtra("extra_new_mandate_preset_amount", a8b.A0A);
        intent.putExtra("extra_new_mandate_transaction_ref", a8b.A0K);
        intent.putExtra("extra_new_mandate_merchant_code", a8b.A06);
        intent.putExtra("extra_new_mandate_initiation_mode", a8b.A04);
        intent.putExtra("extra_new_mandate_purpose_code", a8b.A0C);
        intent.putExtra("extra_new_mandate_vpa", a8b.A0O);
        intent.putExtra("extra_new_mandate_sign", a8b.A0I);
        intent.putExtra("extra_new_mandate_amount_rule", a8b.A00);
        intent.putExtra("extra_new_mandate_note", a8b.A07);
        intent.putExtra("extra_new_mandate_mandate_name", a8b.A05);
        intent.putExtra("extra_new_mandate_validity_start", a8b.A0N);
        intent.putExtra("extra_new_mandate_validity_end", a8b.A0M);
        intent.putExtra("extra_new_mandate_frequency", a8b.A03);
        intent.putExtra("extra_new_mandate_recurrence_day", a8b.A0D);
        intent.putExtra("extra_new_mandate_recurrence_rule", a8b.A0E);
        intent.putExtra("extra_new_mandate_rev", a8b.A0G);
        intent.putExtra("extra_new_mandate_share", a8b.A0H);
        intent.putExtra("extra_new_mandate_block", a8b.A01);
        intent.putExtra("extra_new_mandate_unique_mandate_number", a8b.A0L);
        AnonymousClass8BR.A1D(intent, str);
        intent.addFlags(33554432);
    }

    public static boolean A05(String str) {
        if ("photo_received".equals(str) || "photo_received_gallery".equals(str) || "main_qr_code_gallery".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x006c, code lost:
        if (r0 == false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Intent r4, X.AnonymousClass18O r5, X.AnonymousClass1BI r6, X.C20118A8b r7) {
        /*
            X.7Ik r1 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r0 = r7.A0O
            X.77e r1 = X.AnonymousClass8BT.A0L(r1, r0)
            java.lang.String r0 = "extra_payment_handle"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_merchant_code"
            java.lang.String r0 = r7.A06
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_transaction_ref"
            java.lang.String r0 = r7.A0K
            r4.putExtra(r1, r0)
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "accountHolderName"
            X.77e r1 = X.AnonymousClass8BR.A0Y(r2, r3, r1, r0)
            java.lang.String r0 = "extra_payee_name"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_transaction_ref_url"
            java.lang.String r0 = r7.A0F
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_initiation_mode"
            java.lang.String r0 = r7.A04
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_purpose_code"
            java.lang.String r0 = r7.A0C
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_payment_preset_amount"
            java.lang.String r0 = r7.A0A
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_transaction_id"
            java.lang.String r0 = r7.A0J
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_payment_preset_min_amount"
            java.lang.String r0 = r7.A0B
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r4.putExtra(r1, r0)
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = "DEEP_LINK"
            boolean r0 = r1.equals(r0)
            r1 = 9
            if (r0 != 0) goto L_0x0070
        L_0x006e:
            r1 = 8
        L_0x0070:
            java.lang.String r0 = "extra_payments_entry_type"
            r4.putExtra(r0, r1)
            int r0 = A00(r5, r7)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "extra_payment_preset_max_amount"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_is_first_payment_method"
            r0 = 1
            r4.putExtra(r1, r0)
            if (r6 == 0) goto L_0x0094
            java.lang.String r1 = r6.getRawString()
        L_0x008e:
            java.lang.String r0 = "extra_chat_jid"
            r4.putExtra(r0, r1)
            return
        L_0x0094:
            java.lang.String r1 = ""
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7Z.A01(android.content.Intent, X.18O, X.1BI, X.A8b):void");
    }

    public static void A02(Intent intent, AnonymousClass18O r4, AnonymousClass1BI r5, C20118A8b a8b, String str, boolean z) {
        A01(intent, r4, r5, a8b);
        AnonymousClass8BR.A1D(intent, str);
        intent.putExtra("extra_is_pay_money_only", !TextUtils.isEmpty(a8b.A0A));
        intent.putExtra("return-after-pay", "DEEP_LINK".equals(a8b.A02));
        intent.putExtra("verify-vpa-in-background", true);
        if (A05(str)) {
            intent.putExtra("extra_payment_preset_max_amount", String.valueOf(r4.A04(AnonymousClass18O.A1G)));
        }
        if (z) {
            intent.addFlags(33554432);
        }
    }
}
