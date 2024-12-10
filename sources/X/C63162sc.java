package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.2sc  reason: invalid class name and case insensitive filesystem */
public final class C63162sc {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1DL A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass22Q r10) {
        /*
            r9 = this;
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            long r1 = r10.A0x
            r7 = 0
            r6 = 0
            r4 = 1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            boolean r2 = X.AnonymousClass000.A1R(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ProductMessageStore/insertProductMessage/message must have row_id set; key="
            r1.append(r0)
            X.205 r3 = r10.A0v
            java.lang.String r0 = X.C17890vO.A0V(r3, r1)
            X.C17960vV.A0G(r2, r0)
            int r0 = r10.A0E()
            boolean r2 = X.AnonymousClass000.A1T(r0, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ProductMessageStore/insertProductMessage/message in main storage; key="
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
            X.C17960vV.A0G(r2, r0)
            X.1Cd r0 = r9.A00
            X.1au r5 = r0.A05()
            android.content.ContentValues r3 = X.C17880vN.A08()     // Catch:{ all -> 0x0063 }
            long r0 = r10.A0x     // Catch:{ all -> 0x0063 }
            A00(r3, r9, r10, r0)     // Catch:{ all -> 0x0063 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0063 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "message_product"
            java.lang.String r0 = "INSERT_MESSAGE_PRODUCT_SQL"
            long r3 = r2.A06(r1, r0, r3)     // Catch:{ all -> 0x0063 }
            long r1 = r10.A0x     // Catch:{ all -> 0x0063 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            r6 = 1
        L_0x005a:
            java.lang.String r0 = "ProductMessageStore/insertProductMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r6, r0)     // Catch:{ all -> 0x0063 }
            r5.close()
            return
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63162sc.A02(X.22Q):void");
    }

    public static final void A00(ContentValues contentValues, C63162sc r4, AnonymousClass22Q r5, long j) {
        BigDecimal bigDecimal;
        C17880vN.A19(contentValues, "message_row_id", j);
        UserJid userJid = r5.A01;
        if (userJid != null) {
            contentValues.put("business_owner_jid", AnonymousClass1DL.A04(r4.A02, userJid));
        }
        C63432t4.A01(contentValues, "product_id", r5.A06);
        C63432t4.A01(contentValues, "title", r5.A0A);
        C63432t4.A01(contentValues, "description", r5.A04);
        String str = r5.A03;
        if (!(str == null || (bigDecimal = r5.A0B) == null)) {
            contentValues.put("currency_code", str);
            BigDecimal bigDecimal2 = C197309wU.A00;
            contentValues.put("amount_1000", Long.valueOf(bigDecimal.multiply(bigDecimal2).longValue()));
            BigDecimal bigDecimal3 = r5.A0C;
            if (bigDecimal3 != null) {
                contentValues.put("sale_amount_1000", Long.valueOf(bigDecimal3.multiply(bigDecimal2).longValue()));
            }
        }
        C63432t4.A01(contentValues, "retailer_id", r5.A08);
        C63432t4.A01(contentValues, "url", r5.A07);
        C63432t4.A01(contentValues, "signed_url", r5.A09);
        contentValues.put("product_image_count", Integer.valueOf(r5.A00));
        C63432t4.A01(contentValues, "body", r5.A02);
        C63432t4.A01(contentValues, "footer", r5.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00de, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C63162sc r7, X.AnonymousClass22Q r8, java.lang.String r9, java.lang.String r10) {
        /*
            long r1 = r8.A0x
            r5 = 0
            r3 = 1
            r4 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            boolean r2 = X.AnonymousClass000.A1R(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ProductMessageStore/fillProductDataIfAvailable/message must have row_id set; key="
            java.lang.String r0 = X.AnonymousClass206.A03(r8, r0, r1)
            X.C17960vV.A0G(r2, r0)
            java.lang.String[] r3 = new java.lang.String[r3]
            long r0 = r8.A0x
            X.C17880vN.A1V(r3, r4, r0)
            X.1Cd r0 = r7.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00db }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x00db }
            android.database.Cursor r3 = r0.A0A(r9, r10, r3)     // Catch:{ all -> 0x00db }
            if (r3 == 0) goto L_0x00d7
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00cc
            X.1DL r5 = r7.A02     // Catch:{ all -> 0x00d0 }
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "business_owner_jid"
            long r0 = X.C17890vO.A06(r3, r0)     // Catch:{ all -> 0x00d0 }
            com.whatsapp.jid.Jid r0 = r5.A0E(r4, r0)     // Catch:{ all -> 0x00d0 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00d0 }
            r8.A01 = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "product_id"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A06 = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "title"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A0A = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "body"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A02 = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "footer"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A05 = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "description"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A04 = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "currency_code"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A03 = r0     // Catch:{ all -> 0x00d0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = r8.A03     // Catch:{ IllegalArgumentException -> 0x00a7 }
            X.A6S r4 = new X.A6S     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r4.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            java.lang.String r0 = "amount_1000"
            long r0 = X.C17890vO.A06(r3, r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            java.math.BigDecimal r0 = X.C197309wU.A00(r4, r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r8.A0B = r0     // Catch:{ IllegalArgumentException -> 0x00a7 }
            java.lang.String r0 = r8.A03     // Catch:{ IllegalArgumentException -> 0x00a7 }
            X.A6S r4 = new X.A6S     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r4.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            java.lang.String r0 = "sale_amount_1000"
            long r0 = X.C17890vO.A06(r3, r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            java.math.BigDecimal r0 = X.C197309wU.A00(r4, r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r8.A0C = r0     // Catch:{ IllegalArgumentException -> 0x00a7 }
            goto L_0x00aa
        L_0x00a7:
            r0 = 0
            r8.A03 = r0     // Catch:{ all -> 0x00d0 }
        L_0x00aa:
            java.lang.String r0 = "retailer_id"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A08 = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "url"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A07 = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "signed_url"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A09 = r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "product_image_count"
            int r0 = X.C17890vO.A01(r3, r0)     // Catch:{ all -> 0x00d0 }
            r8.A00 = r0     // Catch:{ all -> 0x00d0 }
        L_0x00cc:
            r3.close()     // Catch:{ all -> 0x00db }
            goto L_0x00d7
        L_0x00d0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00d7:
            r2.close()
            return
        L_0x00db:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63162sc.A01(X.2sc, X.22Q, java.lang.String, java.lang.String):void");
    }

    public C63162sc(AnonymousClass1LW r1, AnonymousClass1DL r2, AnonymousClass1Cd r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
    }
}
