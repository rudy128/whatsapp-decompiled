package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9yn  reason: invalid class name and case insensitive filesystem */
public final class C198719yn {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final C26911Ty A03;
    public final C189889k1 A04;
    public final C189899k2 A05;
    public final C20114A7x A06;
    public final CatalogManager A07;
    public final C19973A1i A08;
    public final UserJid A09;
    public final C41731wy A0A = AnonymousClass3MW.A0o();
    public final C41731wy A0B = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A0C;
    public final AtomicBoolean A0D = new AtomicBoolean();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (java.lang.Long.valueOf(r20) != null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.CDX.A00(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C198719yn r21, boolean r22) {
        /*
            r4 = r21
            X.9k1 r3 = r4.A04
            com.whatsapp.jid.UserJid r2 = r4.A09
            r8 = 0
            X.4S5 r0 = r3.A01
            com.whatsapp.jid.UserJid r7 = r0.A00(r2)
            r11 = 0
            X.9or r0 = r3.A00     // Catch:{ Exception -> 0x00e9 }
            X.8ov r0 = r0.A00()     // Catch:{ Exception -> 0x00e9 }
            X.1at r9 = r0.get()     // Catch:{ Exception -> 0x00e9 }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00e1 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00e1 }
            java.lang.String r5 = "SELECT promotion_id, promotion_name, promotion_discount, promotion_discount_type, promotion_minimum_cart_price, promotion_start_date, promotion_end_date, promotion_description, promotion_more_info FROM cart_applied_promotion WHERE business_id=? LIMIT 1"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00e1 }
            X.C17880vN.A1J(r7, r1, r8)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "cart_applied_promotion.SELECT_APPLIED_PROMOTIONS"
            android.database.Cursor r1 = r6.A0A(r5, r0, r1)     // Catch:{ all -> 0x00e1 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = "promotion_id"
            java.lang.String r12 = X.C17890vO.A0S(r1, r0)     // Catch:{ all -> 0x00da }
            X.C18070vi.A0X(r12)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "promotion_name"
            java.lang.String r13 = X.C17890vO.A0S(r1, r0)     // Catch:{ all -> 0x00da }
            X.C18070vi.A0X(r13)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "promotion_discount"
            java.lang.String r14 = X.C17890vO.A0S(r1, r0)     // Catch:{ all -> 0x00da }
            X.C18070vi.A0X(r14)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "promotion_discount_type"
            int r6 = X.C17890vO.A01(r1, r0)     // Catch:{ all -> 0x00da }
            r0 = 1
            if (r6 == r0) goto L_0x006c
            r0 = 2
            if (r6 == r0) goto L_0x006c
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "Unknown discount type "
            r5.append(r0)     // Catch:{ all -> 0x00da }
            r5.append(r6)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = " is retrieved from db"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r5)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x006c:
            java.lang.String r5 = "promotion_minimum_cart_price"
            int r6 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x00da }
            boolean r5 = r1.isNull(r6)     // Catch:{ all -> 0x00da }
            if (r5 != 0) goto L_0x008f
            long r20 = r1.getLong(r6)     // Catch:{ all -> 0x00da }
            java.lang.Long r5 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x008f
        L_0x0082:
            java.lang.String r5 = "promotion_start_date"
            int r6 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x00da }
            boolean r5 = r1.isNull(r6)     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x0094
            goto L_0x0092
        L_0x008f:
            r20 = 0
            goto L_0x0082
        L_0x0092:
            r8 = 0
            goto L_0x009d
        L_0x0094:
            long r5 = r1.getLong(r6)     // Catch:{ all -> 0x00da }
            java.util.Date r8 = new java.util.Date     // Catch:{ all -> 0x00da }
            r8.<init>(r5)     // Catch:{ all -> 0x00da }
        L_0x009d:
            java.lang.String r5 = "promotion_end_date"
            int r6 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x00da }
            boolean r5 = r1.isNull(r6)     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x00ab
            r5 = 0
            goto L_0x00b4
        L_0x00ab:
            long r6 = r1.getLong(r6)     // Catch:{ all -> 0x00da }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x00da }
            r5.<init>(r6)     // Catch:{ all -> 0x00da }
        L_0x00b4:
            java.lang.String r6 = "promotion_description"
            java.lang.String r15 = X.C17890vO.A0S(r1, r6)     // Catch:{ all -> 0x00da }
            X.C18070vi.A0X(r15)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "promotion_more_info"
            java.lang.String r16 = X.C17890vO.A0S(r1, r6)     // Catch:{ all -> 0x00da }
            X.C18070vi.A0X(r16)     // Catch:{ all -> 0x00da }
            X.9tj r10 = new X.9tj     // Catch:{ all -> 0x00da }
            r18 = r5
            r19 = r0
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00da }
            goto L_0x00d3
        L_0x00d2:
            r10 = r11
        L_0x00d3:
            r1.close()     // Catch:{ all -> 0x00e1 }
            r9.close()     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e8
        L_0x00da:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            X.CDX.A00(r1, r5)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ Exception -> 0x00e9 }
            throw r0     // Catch:{ Exception -> 0x00e9 }
        L_0x00e8:
            r11 = r10
        L_0x00e9:
            if (r11 == 0) goto L_0x015d
            if (r22 == 0) goto L_0x0140
            X.A7x r0 = r4.A06
            X.9yf r0 = X.A76.A00(r0, r2)
            if (r0 == 0) goto L_0x0103
            java.util.List r1 = r0.A04
            if (r1 == 0) goto L_0x0103
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0114
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0114
        L_0x0103:
            X.8i4 r1 = X.C167968i4.A00
        L_0x0105:
            r3.A00(r2)
            X.1wy r0 = r4.A0B
            r0.A0E(r1)
            X.1DT r1 = r4.A00
            r0 = 0
            r1.A0E(r0)
            return
        L_0x0114:
            java.util.Iterator r7 = r1.iterator()
        L_0x0118:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r7.next()
            X.9tj r0 = (X.C195679tj) r0
            java.lang.String r0 = r0.A06
            java.lang.String r6 = r11.A06
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r1 = X.AnonymousClass8BS.A0p(r5, r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r6)
            java.lang.String r0 = X.AnonymousClass8BS.A0p(r5, r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0118
        L_0x0140:
            X.9k2 r5 = r4.A05
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r0 = r11.A08
            if (r0 == 0) goto L_0x0152
            boolean r0 = r0.before(r1)
            if (r0 != 0) goto L_0x0152
            goto L_0x0103
        L_0x0152:
            java.util.Date r0 = r11.A07
            if (r0 == 0) goto L_0x0161
            boolean r0 = r0.after(r1)
            if (r0 != 0) goto L_0x0161
            goto L_0x0103
        L_0x015d:
            X.1DT r0 = r4.A00
            r11 = 0
            goto L_0x0170
        L_0x0161:
            X.8i3 r1 = r5.A00(r11, r2)
            if (r1 != 0) goto L_0x0105
            X.1wy r1 = r4.A0B
            X.8i6 r0 = X.C167988i6.A00
            r1.A0E(r0)
            X.1DT r0 = r4.A00
        L_0x0170:
            r0.A0E(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198719yn.A00(X.9yn, boolean):void");
    }

    public C198719yn(C26911Ty r2, C189889k1 r3, C189899k2 r4, C20114A7x a7x, CatalogManager catalogManager, C19973A1i a1i, UserJid userJid, AnonymousClass10I r9) {
        C18070vi.A0p(a1i, r2, catalogManager);
        C18070vi.A0d(a7x, 5);
        C18070vi.A0l(r9, r3);
        this.A09 = userJid;
        this.A08 = a1i;
        this.A03 = r2;
        this.A07 = catalogManager;
        this.A06 = a7x;
        this.A0C = r9;
        this.A04 = r3;
        this.A05 = r4;
    }
}
