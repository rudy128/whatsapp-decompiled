package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class A8S {
    public final C192719or A00;
    public final AnonymousClass1NG A01;
    public final C26301Rp A02;
    public final AnonymousClass00H A03;
    public final C19830z4 A04;
    public final C18030ve A05;
    public volatile Boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C194209rM A07(com.whatsapp.jid.Jid r8, java.lang.String r9) {
        /*
            r7 = this;
            r6 = 0
            r5 = 1
            X.C18070vi.A0d(r9, r5)
            A04(r7)
            X.9or r0 = r7.A00
            X.8ov r0 = r0.A00()
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0044 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_scaled_image_url, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date, product_max_available, product_variant_props, product_variants_ids FROM cart_item WHERE business_id=? AND product_id=?"
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0044 }
            X.C17880vN.A1J(r8, r1, r6)     // Catch:{ all -> 0x0044 }
            r1[r5] = r9     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "cart_item.SELECT_CART_ITEM"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r2 == 0) goto L_0x0040
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0035
            X.9rM r1 = r7.A02(r2)     // Catch:{ all -> 0x0039 }
        L_0x0035:
            r2.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0040
        L_0x0039:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0040:
            r4.close()
            return r1
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8S.A07(com.whatsapp.jid.Jid, java.lang.String):X.9rM");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fa, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.CDX.A00(r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A09() {
        /*
            r14 = this;
            monitor-enter(r14)
            java.lang.Boolean r0 = r14.A06     // Catch:{ all -> 0x0106 }
            r5 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0106 }
            boolean r0 = X.C18070vi.A18(r0, r4)     // Catch:{ all -> 0x0106 }
            if (r0 != 0) goto L_0x0104
            java.util.LinkedHashSet r3 = X.C17880vN.A14()     // Catch:{ all -> 0x0106 }
            X.9or r7 = r14.A00     // Catch:{ all -> 0x0106 }
            X.8ov r0 = r7.A00()     // Catch:{ all -> 0x0106 }
            X.1at r6 = r0.get()     // Catch:{ all -> 0x0106 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00f8 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = "SELECT business_id, product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_scaled_image_url, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date, product_max_available, product_variant_props, product_variants_ids FROM cart_item"
            java.lang.String r0 = "cart_item.SELECT_ALL_CART_ITEM"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x00f8 }
        L_0x0029:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "business_id"
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x00f1 }
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass8BR.A0X(r0)     // Catch:{ all -> 0x00f1 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0029
            r3.add(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x0029
        L_0x0041:
            r2.close()     // Catch:{ all -> 0x00f8 }
            r6.close()     // Catch:{ all -> 0x0106 }
            r0 = 10
            int r0 = X.C29351c6.A0C(r3, r0)     // Catch:{ all -> 0x0106 }
            int r1 = X.C200610r.A03(r0)     // Catch:{ all -> 0x0106 }
            r0 = 16
            if (r1 >= r0) goto L_0x0057
            r1 = 16
        L_0x0057:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0106 }
            r6.<init>(r1)     // Catch:{ all -> 0x0106 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0106 }
        L_0x0060:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x007a
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0106 }
            r1 = r2
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0106 }
            if (r1 == 0) goto L_0x00ff
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x0076
            X.C42701yb.A01(r1)     // Catch:{ all -> 0x0106 }
        L_0x0076:
            r6.put(r2, r1)     // Catch:{ all -> 0x0106 }
            goto L_0x0060
        L_0x007a:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0106 }
            if (r0 != 0) goto L_0x00e3
            X.8ov r0 = r7.A00()     // Catch:{ all -> 0x0106 }
            X.1au r2 = r0.A06()     // Catch:{ all -> 0x0106 }
            X.1xA r3 = r2.BD0()     // Catch:{ all -> 0x00d9 }
            java.util.Iterator r7 = X.AnonymousClass000.A15(r6)     // Catch:{ all -> 0x00d2 }
        L_0x0090:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00cb
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r7)     // Catch:{ all -> 0x00d2 }
            java.lang.Object r6 = r0.getKey()     // Catch:{ all -> 0x00d2 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x00d2 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00d2 }
            X.1BI r1 = (X.AnonymousClass1BI) r1     // Catch:{ all -> 0x00d2 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00d2 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x00d2 }
            java.lang.String r10 = "cart_item"
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x00d2 }
            android.content.ContentValues r9 = X.C17880vN.A08()     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "business_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r11 = "business_id=?"
            java.lang.String[] r13 = new java.lang.String[r5]     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = r6.getRawString()     // Catch:{ all -> 0x00d2 }
            r0 = 0
            r13[r0] = r1     // Catch:{ all -> 0x00d2 }
            java.lang.String r12 = "cart_item.UPDATE_CART_ITEM"
            r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00d2 }
            goto L_0x0090
        L_0x00cb:
            r3.A00()     // Catch:{ all -> 0x00d2 }
            r3.close()     // Catch:{ all -> 0x00d9 }
            goto L_0x00e0
        L_0x00d2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r1 = move-exception
            X.CDX.A00(r2, r0)     // Catch:{ all -> 0x0106 }
            goto L_0x0103
        L_0x00e0:
            r2.close()     // Catch:{ all -> 0x0106 }
        L_0x00e3:
            r14.A06 = r4     // Catch:{ all -> 0x0106 }
            X.1Rp r2 = r14.A02     // Catch:{ all -> 0x0106 }
            java.lang.String r1 = "pref_lid_migration_for_cart_item_db"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0106 }
            X.C26301Rp.A04(r2, r1, r0)     // Catch:{ all -> 0x0106 }
            goto L_0x0104
        L_0x00f1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00f8 }
            throw r0     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r1 = move-exception
            X.CDX.A00(r6, r0)     // Catch:{ all -> 0x0106 }
            goto L_0x0103
        L_0x00ff:
            java.lang.IllegalArgumentException r1 = X.C17890vO.A0K()     // Catch:{ all -> 0x0106 }
        L_0x0103:
            throw r1     // Catch:{ all -> 0x0106 }
        L_0x0104:
            monitor-exit(r14)
            return
        L_0x0106:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8S.A09():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        X.CDX.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(com.whatsapp.jid.Jid r7) {
        /*
            r6 = this;
            r5 = 0
            A04(r6)
            X.9or r0 = r6.A00
            X.8ov r0 = r0.A00()
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0025 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "DELETE FROM cart_item WHERE business_id=?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0025 }
            X.C17880vN.A1J(r7, r1, r5)     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = "cart_item.DELETE_CART"
            r3.A0F(r2, r0, r1)     // Catch:{ all -> 0x0025 }
            r4.close()
            return
        L_0x0025:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8S.A0C(com.whatsapp.jid.Jid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        X.CDX.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(com.whatsapp.jid.Jid r8, java.lang.String r9) {
        /*
            r7 = this;
            r6 = 0
            r5 = 1
            X.C18070vi.A0d(r9, r5)
            A04(r7)
            X.9or r0 = r7.A00
            X.8ov r0 = r0.A00()
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x002b }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "DELETE FROM cart_item WHERE business_id=? AND product_id=?"
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x002b }
            X.C17880vN.A1J(r8, r1, r6)     // Catch:{ all -> 0x002b }
            r1[r5] = r9     // Catch:{ all -> 0x002b }
            java.lang.String r0 = "cart_item.DELETE_CART_ITEM"
            r3.A0F(r2, r0, r1)     // Catch:{ all -> 0x002b }
            r4.close()
            return
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8S.A0D(com.whatsapp.jid.Jid, java.lang.String):void");
    }

    public static final int A00(A8S a8s, C194209rM r6, C28791au r7, Jid jid) {
        C23141Ev r2 = ((C28801av) r7).A02;
        ContentValues A012 = a8s.A01(r6, jid);
        String[] A1Z = C17880vN.A1Z();
        C17880vN.A1J(jid, A1Z, 0);
        A1Z[1] = r6.A01.A0H;
        return r2.A02(A012, "cart_item", "business_id=?  AND product_id=?", "cart_item.UPDATE_CART_ITEM", A1Z);
    }

    private final ContentValues A01(C194209rM r10, Jid jid) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str;
        String str2;
        List<C20245ADd> list;
        BigDecimal multiply;
        C20287AEv aEv = r10.A01;
        BigDecimal bigDecimal = aEv.A09;
        String str3 = null;
        if (bigDecimal == null || (multiply = bigDecimal.multiply(new BigDecimal(1000.0d))) == null) {
            l = null;
        } else {
            l = AnonymousClass8BT.A0o(multiply);
        }
        AE5 ae5 = aEv.A04;
        if (ae5 != null) {
            l2 = AnonymousClass8BT.A0o(ae5.A00.multiply(new BigDecimal(1000.0d)));
            Date date = ae5.A02;
            if (date != null) {
                l3 = AnonymousClass8BU.A0m(date);
            } else {
                l3 = null;
            }
            Date date2 = ae5.A01;
            if (date2 != null) {
                l4 = AnonymousClass8BU.A0m(date2);
            } else {
                l4 = null;
            }
        } else {
            l2 = null;
            l3 = null;
            l4 = null;
        }
        A6S a6s = aEv.A07;
        if (a6s != null) {
            str3 = a6s.A00;
        }
        ContentValues A08 = C17880vN.A08();
        A08.put("business_id", jid.getRawString());
        A08.put("product_id", aEv.A0H);
        A08.put("product_title", aEv.A08);
        A08.put("product_price_1000", l);
        A08.put("product_currency_code", str3);
        List list2 = aEv.A0A;
        AEI aei = (AEI) C29431cG.A0f(list2, 0);
        if (aei != null) {
            str = aei.A04;
        } else {
            str = "";
        }
        A08.put("product_image_id", str);
        AEI aei2 = (AEI) C29431cG.A0f(list2, 0);
        if (aei2 == null || (str2 = aei2.A01) == null) {
            str2 = "";
        }
        A08.put("product_scaled_image_url", str2);
        A08.put("product_quantity", Long.valueOf(r10.A00));
        A08.put("product_sale_price_1000", l2);
        A08.put("product_sale_start_date", l3);
        A08.put("product_sale_end_date", l4);
        A08.put("product_max_available", Long.valueOf(aEv.A01));
        this.A03.get();
        String str4 = null;
        AE6 ae6 = aEv.A05;
        if (!(ae6 == null || (list = ae6.A02) == null)) {
            JSONArray A1A = AnonymousClass8BR.A1A();
            for (C20245ADd aDd : list) {
                JSONObject A15 = C17880vN.A15();
                A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, aDd.A00);
                A15.put("value", aDd.A01);
                A1A.put(A15);
            }
            str4 = A1A.toString();
        }
        A08.put("product_variant_props", str4);
        return A08;
    }

    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.util.List, X.ADH, X.ADW, X.ADp] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v3 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C194209rM A02(android.database.Cursor r40) {
        /*
            r39 = this;
            java.lang.String r0 = "product_id"
            r3 = r40
            java.lang.String r20 = X.C17890vO.A0S(r3, r0)
            java.lang.String r0 = "product_title"
            java.lang.String r21 = X.C17890vO.A0S(r3, r0)
            java.lang.String r0 = "product_price_1000"
            int r1 = r3.getColumnIndexOrThrow(r0)
            boolean r0 = r3.isNull(r1)
            if (r0 == 0) goto L_0x0106
            r8 = 0
        L_0x001b:
            java.lang.String r0 = "product_currency_code"
            java.lang.String r4 = X.C17890vO.A0S(r3, r0)
            java.lang.String r0 = "product_quantity"
            long r11 = X.C17890vO.A06(r3, r0)
            java.lang.String r0 = "product_image_id"
            java.lang.String r34 = X.C17890vO.A0S(r3, r0)
            java.lang.String r0 = "product_scaled_image_url"
            java.lang.String r36 = X.C17890vO.A0S(r3, r0)
            java.lang.String r0 = "product_sale_price_1000"
            int r1 = r3.getColumnIndexOrThrow(r0)
            boolean r0 = r3.isNull(r1)
            if (r0 == 0) goto L_0x0100
            r7 = 0
        L_0x0040:
            java.lang.String r0 = "product_sale_start_date"
            int r1 = r3.getColumnIndexOrThrow(r0)
            boolean r0 = r3.isNull(r1)
            if (r0 == 0) goto L_0x00fa
            r5 = 0
        L_0x004d:
            java.lang.String r0 = "product_sale_end_date"
            int r1 = r3.getColumnIndexOrThrow(r0)
            boolean r0 = r3.isNull(r1)
            if (r0 == 0) goto L_0x00f4
            r6 = 0
        L_0x005a:
            java.lang.String r0 = "product_max_available"
            int r1 = r3.getColumnIndexOrThrow(r0)
            boolean r0 = r3.isNull(r1)
            if (r0 == 0) goto L_0x00ee
            r31 = 99
        L_0x0068:
            if (r4 == 0) goto L_0x00ec
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00ec
            X.A6S r2 = new X.A6S
            r2.<init>(r4)
        L_0x0075:
            if (r8 == 0) goto L_0x00e9
            if (r2 == 0) goto L_0x00e9
            long r0 = r8.longValue()
            java.math.BigDecimal r27 = X.C197309wU.A00(r2, r0)
        L_0x0081:
            if (r7 == 0) goto L_0x00e6
            if (r2 == 0) goto L_0x00e6
            long r0 = r7.longValue()
            java.math.BigDecimal r4 = X.C197309wU.A00(r2, r0)
            if (r5 == 0) goto L_0x00df
            if (r6 == 0) goto L_0x00df
            long r0 = r5.longValue()
            java.util.Date r5 = new java.util.Date
            r5.<init>(r0)
            long r0 = r6.longValue()
            java.util.Date r6 = new java.util.Date
            r6.<init>(r0)
            X.AE5 r1 = new X.AE5
            r1.<init>(r2, r4, r5, r6)
            r14 = 0
        L_0x00a9:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            if (r34 == 0) goto L_0x00c5
            int r0 = r34.length()
            if (r0 == 0) goto L_0x00c5
            r37 = 0
            java.lang.String r35 = ""
            X.AEI r0 = new X.AEI
            r33 = r0
            r38 = r37
            r33.<init>(r34, r35, r36, r37, r38)
            r10.add(r0)
        L_0x00c5:
            java.lang.String r0 = "product_variant_props"
            java.lang.String r4 = X.C17890vO.A0S(r3, r0)
            r0 = r39
            X.00H r0 = r0.A03
            r0.get()
            if (r4 == 0) goto L_0x0140
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0140
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            goto L_0x010c
        L_0x00df:
            r14 = 0
            X.AE5 r1 = new X.AE5
            r1.<init>(r2, r4, r14, r14)
            goto L_0x00a9
        L_0x00e6:
            r14 = 0
            r1 = r14
            goto L_0x00a9
        L_0x00e9:
            r27 = 0
            goto L_0x0081
        L_0x00ec:
            r2 = 0
            goto L_0x0075
        L_0x00ee:
            long r31 = r3.getLong(r1)
            goto L_0x0068
        L_0x00f4:
            java.lang.Long r6 = X.C17890vO.A0M(r3, r1)
            goto L_0x005a
        L_0x00fa:
            java.lang.Long r5 = X.C17890vO.A0M(r3, r1)
            goto L_0x004d
        L_0x0100:
            java.lang.Long r7 = X.C17890vO.A0M(r3, r1)
            goto L_0x0040
        L_0x0106:
            java.lang.Long r8 = X.C17890vO.A0M(r3, r1)
            goto L_0x001b
        L_0x010c:
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0140 }
            r8.<init>(r4)     // Catch:{ JSONException -> 0x0140 }
            int r7 = r8.length()     // Catch:{ JSONException -> 0x0140 }
            r6 = 0
        L_0x0116:
            if (r6 >= r7) goto L_0x0134
            org.json.JSONObject r5 = r8.getJSONObject(r6)     // Catch:{ JSONException -> 0x0140 }
            java.lang.String r0 = "name"
            java.lang.String r4 = r5.getString(r0)     // Catch:{ JSONException -> 0x0140 }
            java.lang.String r0 = "value"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ JSONException -> 0x0140 }
            X.C18070vi.A0b(r4)     // Catch:{ JSONException -> 0x0140 }
            X.C18070vi.A0b(r0)     // Catch:{ JSONException -> 0x0140 }
            X.AnonymousClass8BT.A1Q(r4, r0, r9)     // Catch:{ JSONException -> 0x0140 }
            int r6 = r6 + 1
            goto L_0x0116
        L_0x0134:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0140
            X.AE6 r5 = new X.AE6
            r5.<init>(r14, r14, r14, r9)
            goto L_0x0141
        L_0x0140:
            r5 = 0
        L_0x0141:
            X.C18070vi.A0b(r20)
            X.C18070vi.A0b(r21)
            java.util.ArrayList r29 = X.AnonymousClass000.A13()
            r4 = 0
            r0 = 1
            X.AEv r13 = new X.AEv
            r16 = r14
            r22 = r14
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r34 = r4
            r15 = r14
            r28 = r10
            r30 = r4
            r33 = r0
            r18 = r5
            r19 = r2
            r17 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34)
            java.lang.String r1 = "product_variants_ids"
            java.lang.String r2 = X.C17890vO.A0S(r3, r1)
            if (r2 == 0) goto L_0x019a
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = ","
            java.util.List r1 = X.C18070vi.A0O(r0, r1, r4)
            X.1ay r0 = new X.1ay
            r0.<init>(r1)
            X.1az r1 = new X.1az
            r1.<init>(r2, r0, r4)
            X.1b0 r0 = new X.1b0
            r0.<init>(r2)
            X.1b3 r0 = X.AnonymousClass1b2.A0C(r0, r1)
            java.util.Set r1 = X.AnonymousClass1b2.A08(r0)
        L_0x0194:
            X.9rM r0 = new X.9rM
            r0.<init>(r13, r1, r11)
            return r0
        L_0x019a:
            X.1Om r1 = X.C25511Om.A00
            goto L_0x0194
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8S.A02(android.database.Cursor):X.9rM");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A03(X.C28781at r5, com.whatsapp.jid.Jid r6) {
        /*
            r4 = this;
            X.1av r5 = (X.C28801av) r5
            X.1Ev r3 = r5.A02
            java.lang.String[] r2 = X.C17880vN.A1Y()
            r0 = 0
            X.C17880vN.A1J(r6, r2, r0)
            java.lang.String r1 = "cart_item.SELECT_CART_ITEMS"
            java.lang.String r0 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_scaled_image_url, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date, product_max_available, product_variant_props, product_variants_ids FROM cart_item WHERE business_id=?"
            android.database.Cursor r2 = r3.A0A(r0, r1, r2)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x001b
            goto L_0x0029
        L_0x001b:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0029
            X.9rM r0 = r4.A02(r2)     // Catch:{ all -> 0x002f }
            r1.add(r0)     // Catch:{ all -> 0x002f }
            goto L_0x001b
        L_0x0029:
            if (r2 == 0) goto L_0x002e
            r2.close()
        L_0x002e:
            return r1
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8S.A03(X.1at, com.whatsapp.jid.Jid):java.util.ArrayList");
    }

    public static final void A05(C28791au r5, Jid jid, String str, Collection collection) {
        C23141Ev r3 = ((C28801av) r5).A02;
        ContentValues contentValues = new ContentValues(1);
        String str2 = null;
        if (!collection.isEmpty()) {
            str2 = C29431cG.A0h(",", collection, (C22821Di) null);
        }
        contentValues.put("product_variants_ids", str2);
        String[] A1Z = C17880vN.A1Z();
        C17880vN.A1J(jid, A1Z, 0);
        A1Z[1] = str;
        r3.A02(contentValues, "cart_item", "business_id=? AND product_id=?", "cart_item.UPDATE_CART_ITEM_VARIANT_IDS", A1Z);
    }

    public static final boolean A06(A8S a8s) {
        boolean booleanValue;
        boolean A052 = C18020vd.A05(C18040vf.A02, a8s.A05, 11180);
        boolean A1W = C17880vN.A1W(C17890vO.A0B(a8s.A04), "global_1to1_lid_chat_migration_done");
        if (A052 && A1W) {
            if (a8s.A06 != null) {
                Boolean bool = a8s.A06;
                C18070vi.A0z(bool, "null cannot be cast to non-null type kotlin.Boolean");
                booleanValue = bool.booleanValue();
            } else {
                synchronized (a8s) {
                    if (a8s.A06 == null) {
                        a8s.A06 = Boolean.valueOf(a8s.A02.A0O("pref_lid_migration_for_cart_item_db"));
                    }
                    Boolean bool2 = a8s.A06;
                    C18070vi.A0z(bool2, "null cannot be cast to non-null type kotlin.Boolean");
                    booleanValue = bool2.booleanValue();
                }
            }
            if (booleanValue) {
                return false;
            }
            return true;
        }
        return false;
    }

    public A8S(C19830z4 r2, C192719or r3, AnonymousClass1NG r4, C18030ve r5, C26301Rp r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r7, r2, r4, r6);
        C18070vi.A0d(r5, 6);
        this.A00 = r3;
        this.A03 = r7;
        this.A04 = r2;
        this.A01 = r4;
        this.A02 = r6;
        this.A05 = r5;
    }

    public static void A04(A8S a8s) {
        if (A06(a8s)) {
            a8s.A09();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C26981Ug A08(com.whatsapp.jid.Jid r5) {
        /*
            r4 = this;
            A04(r4)
            X.1Ug r3 = new X.1Ug
            r3.<init>()
            X.9or r0 = r4.A00     // Catch:{ Exception -> 0x0027 }
            X.8ov r0 = r0.A00()     // Catch:{ Exception -> 0x0027 }
            X.1at r2 = r0.get()     // Catch:{ Exception -> 0x0027 }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0020 }
            java.util.ArrayList r0 = r4.A03(r2, r5)     // Catch:{ all -> 0x0020 }
            r3.BrF(r0)     // Catch:{ all -> 0x0020 }
            r2.close()     // Catch:{ Exception -> 0x0027 }
            return r3
        L_0x0020:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x0027 }
            throw r0     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            r3.BrC(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8S.A08(com.whatsapp.jid.Jid):X.1Ug");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C194209rM r9, com.whatsapp.jid.Jid r10) {
        /*
            r8 = this;
            A04(r8)
            X.9or r0 = r8.A00
            X.8ov r0 = r0.A00()
            X.1au r3 = r0.A06()
            X.1xA r4 = r3.BD0()     // Catch:{ all -> 0x006d }
            X.AEv r0 = r9.A01     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = r0.A0H     // Catch:{ all -> 0x0066 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0066 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0066 }
            java.lang.String[] r2 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0066 }
            r5 = 0
            X.AnonymousClass8BS.A1B(r0, r1, r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "cart_item.SELECT_CART_ITEM_QUANTITY"
            java.lang.String r0 = "SELECT product_quantity FROM cart_item WHERE business_id=? AND product_id=?"
            android.database.Cursor r2 = r7.A0A(r0, r1, r2)     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x0051
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "product_quantity"
            int r5 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x004a }
        L_0x003c:
            r2.close()     // Catch:{ all -> 0x0066 }
            long r1 = (long) r5     // Catch:{ all -> 0x0066 }
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            A00(r8, r9, r3, r10)     // Catch:{ all -> 0x0066 }
            goto L_0x005c
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0051:
            android.content.ContentValues r2 = r8.A01(r9, r10)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "cart_item.INSERT_CART_ITEM"
            java.lang.String r0 = "cart_item"
            r7.A05(r0, r1, r2)     // Catch:{ all -> 0x0066 }
        L_0x005c:
            r4.A00()     // Catch:{ all -> 0x0066 }
            r4.close()     // Catch:{ all -> 0x006d }
            r3.close()
            return
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8S.A0A(X.9rM, com.whatsapp.jid.Jid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C20287AEv r8, com.whatsapp.jid.Jid r9) {
        /*
            r7 = this;
            A04(r7)
            X.9or r0 = r7.A00
            X.8ov r0 = r0.A00()
            X.1au r2 = r0.A06()
            X.1xA r3 = r2.BD0()     // Catch:{ all -> 0x007b }
            java.util.ArrayList r6 = r7.A03(r2, r9)     // Catch:{ all -> 0x0074 }
            X.AE6 r0 = r8.A05     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0067
            X.ADW r0 = r0.A00     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0067
            java.util.List r4 = r0.A00     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0067
            r0 = 4
            X.4so r1 = new X.4so     // Catch:{ all -> 0x0074 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0074 }
            X.B3o r0 = X.C22337B3o.A00     // Catch:{ all -> 0x0074 }
            X.1b3 r0 = X.AnonymousClass1b2.A0C(r0, r1)     // Catch:{ all -> 0x0074 }
            java.util.Set r5 = X.AnonymousClass1b2.A08(r0)     // Catch:{ all -> 0x0074 }
        L_0x0031:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0074 }
        L_0x0035:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x006a
            X.9rM r4 = X.AnonymousClass8BR.A0J(r6)     // Catch:{ all -> 0x0074 }
            X.AEv r0 = r4.A01     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r0.A0H     // Catch:{ all -> 0x0074 }
            boolean r0 = r5.contains(r1)     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0055
            java.util.Set r0 = r4.A02     // Catch:{ all -> 0x0074 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x0035
            A05(r2, r9, r1, r5)     // Catch:{ all -> 0x0074 }
            goto L_0x0035
        L_0x0055:
            java.util.Set r0 = r4.A02     // Catch:{ all -> 0x0074 }
            java.util.Set r0 = X.C29431cG.A13(r0, r5)     // Catch:{ all -> 0x0074 }
            boolean r0 = X.C108945cZ.A1U(r0)     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0035
            X.1Om r0 = X.C25511Om.A00     // Catch:{ all -> 0x0074 }
            A05(r2, r9, r1, r0)     // Catch:{ all -> 0x0074 }
            goto L_0x0035
        L_0x0067:
            X.1Om r5 = X.C25511Om.A00     // Catch:{ all -> 0x0074 }
            goto L_0x0031
        L_0x006a:
            r3.A00()     // Catch:{ all -> 0x0074 }
            r3.close()     // Catch:{ all -> 0x007b }
            r2.close()
            return
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8S.A0B(X.AEv, com.whatsapp.jid.Jid):void");
    }
}
