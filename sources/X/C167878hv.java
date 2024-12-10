package X;

import com.whatsapp.util.Log;

/* renamed from: X.8hv  reason: invalid class name and case insensitive filesystem */
public final class C167878hv extends C167898hx {
    public final C192019nc A00;
    public final C195539tV A01;
    public final AnonymousClass11E A02;
    public final C18030ve A03;
    public final C19949A0g A04;
    public final AnonymousClass1OZ A05;
    public final C20004A2u A06;
    public final C195049si A07;
    public final AnonymousClass9ZD A08 = new AnonymousClass9ZD();
    public final C20027A3w A09;
    public final C183949aA A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167878hv(C26911Ty r2, C192019nc r3, C195539tV r4, C20027A3w a3w, C183949aA r6, AnonymousClass11E r7, C18030ve r8, C19949A0g a0g, AnonymousClass1OZ r10, C20004A2u a2u, C195049si r12) {
        super(r2, r4.A05);
        C18070vi.A0f(r10, 2, r6);
        C18070vi.A0d(r12, 10);
        this.A06 = a2u;
        this.A05 = r10;
        this.A09 = a3w;
        this.A0A = r6;
        this.A02 = r7;
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = a0g;
        this.A07 = r12;
        this.A03 = r8;
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        this.A08.A00.remove(str);
        A00(this);
        this.A07.A00(str);
        Log.e("GetCollectionsProtocol/onDeliveryFailure/delivery-error");
        this.A00.A01(this.A01, -1);
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.Object, X.9O2] */
    /* JADX WARNING: type inference failed for: r7v9, types: [java.lang.Object, X.9O2] */
    /* JADX WARNING: type inference failed for: r3v39, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r44, java.lang.String r45) {
        /*
            r43 = this;
            r6 = 0
            r13 = r44
            r1 = r45
            boolean r0 = X.C18070vi.A17(r1, r13)
            r5 = r43
            A00(r5)
            X.9si r2 = r5.A07
            r2.A01(r1)
            X.9ZD r2 = r5.A08
            java.util.concurrent.ConcurrentHashMap r2 = r2.A00
            java.lang.Object r9 = r2.get(r1)
            X.A8g r9 = (X.C20121A8g) r9
            X.0ve r7 = r5.A03
            r4 = 5886(0x16fe, float:8.248E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r7, r4)
            if (r3 == 0) goto L_0x0346
            if (r9 == 0) goto L_0x0346
            r8 = 2
            X.1ca r4 = X.C20121A8g.A03(r13, r9)
            X.2rm r12 = X.AnonymousClass8BR.A0s()
            r3 = 4
            java.lang.String[] r9 = new java.lang.String[r3]
            java.lang.String r11 = "collections"
            r9[r6] = r11
            java.lang.String r3 = "paging"
            r9[r0] = r3
            java.lang.String r3 = "after"
            r9[r8] = r3
            r7 = 3
            java.lang.String r3 = "#elementValue"
            r9[r7] = r3
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Long r15 = X.C17890vO.A0L()
            java.lang.Long r16 = X.AnonymousClass8BU.A0j()
            r17 = 0
            r18 = r9
            java.lang.Object r10 = r12.A04(r13, r14, r15, r16, r17, r18)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0341
            X.9wa r7 = X.C197369wa.A00
            r3 = 22
            X.Aha r3 = X.C21289Aha.A00(r4, r7, r3)
            java.lang.Object r3 = r3.BCF(r13, r12)
            if (r3 == 0) goto L_0x033c
            java.lang.String[] r9 = new java.lang.String[r8]
            r9[r6] = r11
            java.lang.String r3 = "catalog_type"
            r9[r0] = r3
            r4 = 36
            X.AhV r3 = new X.AhV
            r3.<init>(r7, r4)
            r12.A02(r13, r3, r9)
            java.lang.String[] r15 = new java.lang.String[r8]
            r15[r6] = r11
            java.lang.String r3 = "collection"
            r15[r0] = r3
            r3 = 37
            X.AhV r14 = new X.AhV
            r14.<init>(r7, r3)
            r16 = 0
            r18 = 20
            java.util.ArrayList r4 = r12.A08(r13, r14, r15, r16, r18)
            if (r4 == 0) goto L_0x0337
            java.lang.String[] r3 = new java.lang.String[r0]
            r3[r6] = r11
            X.9SH r0 = new X.9SH
            r0.<init>()
            X.AnonymousClass8BS.A1A(r13, r3)
            r2.remove(r1)
            X.9aA r12 = r5.A0A
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x03b8
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.Iterator r20 = r4.iterator()
        L_0x00b6:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x039c
            java.lang.Object r2 = r20.next()
            X.9DJ r2 = (X.AnonymousClass9DJ) r2
            java.lang.Object r0 = r2.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r19 = X.AnonymousClass000.A13()
            java.util.Iterator r18 = r0.iterator()
        L_0x00ce:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x02c3
            java.lang.Object r0 = r18.next()
            X.9DP r0 = (X.AnonymousClass9DP) r0
            java.lang.Object r1 = r0.A01
            X.9D4 r1 = (X.AnonymousClass9D4) r1
            X.9Cb r0 = r1.A04
            r7 = 0
            if (r0 == 0) goto L_0x02bf
            java.lang.String r0 = r0.A01
            r34 = r0
        L_0x00e7:
            java.lang.String r0 = r1.A0B
            r28 = r0
            java.lang.String r0 = r1.A0D
            r29 = r0
            X.9Cb r0 = r1.A03
            if (r0 == 0) goto L_0x02bb
            java.lang.String r0 = r0.A01
            r30 = r0
        L_0x00f7:
            X.9Cb r0 = r1.A02
            if (r0 == 0) goto L_0x02b8
            java.lang.String r3 = r0.A01
            X.A6S r0 = new X.A6S
            r0.<init>(r3)
        L_0x0102:
            X.9Cb r3 = r1.A05
            if (r3 == 0) goto L_0x02b5
            java.lang.String r3 = r3.A01
        L_0x0108:
            if (r0 == 0) goto L_0x011d
            if (r3 == 0) goto L_0x011d
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x0115 }
            java.math.BigDecimal r35 = X.C197309wU.A00(r0, r3)     // Catch:{ Exception -> 0x0115 }
            goto L_0x011f
        L_0x0115:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r35 = r7
            r0 = r7
            goto L_0x011f
        L_0x011d:
            r35 = r7
        L_0x011f:
            X.9DM r3 = r1.A08
            if (r3 == 0) goto L_0x015b
            if (r0 == 0) goto L_0x015b
            java.lang.Object r8 = r3.A01
            X.9DI r8 = (X.AnonymousClass9DI) r8
            java.lang.String r3 = r8.A03
            long r3 = java.lang.Long.parseLong(r3)
            java.math.BigDecimal r9 = X.C197309wU.A00(r0, r3)     // Catch:{ IllegalArgumentException -> 0x0158 }
            java.lang.Object r4 = r8.A02     // Catch:{ IllegalArgumentException -> 0x0158 }
            X.9Cb r4 = (X.C178169Cb) r4     // Catch:{ IllegalArgumentException -> 0x0158 }
            java.lang.Object r3 = r8.A00     // Catch:{ IllegalArgumentException -> 0x0158 }
            X.9Cb r3 = (X.C178169Cb) r3     // Catch:{ IllegalArgumentException -> 0x0158 }
            if (r4 == 0) goto L_0x014e
            if (r3 == 0) goto L_0x014e
            java.lang.String r8 = r4.A01     // Catch:{ IllegalArgumentException -> 0x0158 }
            java.lang.String r4 = r3.A01     // Catch:{ IllegalArgumentException -> 0x0158 }
            java.text.DateFormat r3 = r12.A01     // Catch:{ ParseException -> 0x014e }
            java.util.Date r8 = r3.parse(r8)     // Catch:{ ParseException -> 0x014e }
            java.util.Date r4 = r3.parse(r4)     // Catch:{ ParseException -> 0x014e }
            goto L_0x0150
        L_0x014e:
            r4 = r7
            r8 = r7
        L_0x0150:
            X.AE5 r17 = new X.AE5     // Catch:{ IllegalArgumentException -> 0x0158 }
            r3 = r17
            r3.<init>(r0, r9, r8, r4)     // Catch:{ IllegalArgumentException -> 0x0158 }
            goto L_0x015d
        L_0x0158:
            r17 = r7
            goto L_0x015d
        L_0x015b:
            r17 = r7
        L_0x015d:
            X.9Cb r3 = r1.A06
            if (r3 == 0) goto L_0x01c7
            java.lang.String r3 = r3.A01
            r33 = r3
        L_0x0165:
            X.9Cb r3 = r1.A07
            if (r3 == 0) goto L_0x01c4
            java.lang.String r3 = r3.A01
            r31 = r3
        L_0x016d:
            java.lang.String r3 = r1.A0C
            boolean r42 = java.lang.Boolean.parseBoolean(r3)
            java.lang.String r4 = r1.A0A
            java.lang.String r3 = "out of stock"
            boolean r38 = r3.equalsIgnoreCase(r4)
            X.1ca r4 = r1.A03()
            java.lang.String r3 = "compliance_category"
            java.lang.String r7 = r4.A0Q(r3, r7)
            java.util.List r4 = r1.A0E
            boolean r3 = X.AnonymousClass000.A1a(r4)
            if (r3 == 0) goto L_0x02ae
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = r4.iterator()
        L_0x0195:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x01ca
            java.lang.Object r9 = r16.next()
            X.9D1 r9 = (X.AnonymousClass9D1) r9
            if (r9 == 0) goto L_0x0195
            java.lang.String r3 = r9.A04
            r22 = r3
            java.lang.String r15 = r9.A05
            java.lang.String r14 = r9.A06
            long r3 = r9.A01
            int r13 = (int) r3
            long r3 = r9.A00
            int r9 = (int) r3
            X.AEI r3 = new X.AEI
            r21 = r3
            r23 = r15
            r24 = r14
            r25 = r13
            r26 = r9
            r21.<init>(r22, r23, r24, r25, r26)
            r8.add(r3)
            goto L_0x0195
        L_0x01c4:
            r31 = r7
            goto L_0x016d
        L_0x01c7:
            r33 = r7
            goto L_0x0165
        L_0x01ca:
            java.util.ArrayList r36 = X.C17880vN.A10(r8)
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            X.1ca r4 = r1.A03()
            java.lang.String r3 = "media"
            X.1ca r4 = r4.A0K(r3)
            if (r4 == 0) goto L_0x0201
            java.lang.String r3 = "video"
            java.util.List r3 = r4.A0R(r3)
            if (r3 == 0) goto L_0x0201
            java.util.Iterator r4 = r3.iterator()
        L_0x01ea:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0201
            X.1ca r3 = X.C17880vN.A0a(r4)
            X.C18070vi.A0b(r3)
            X.773 r3 = X.AnonymousClass9PT.A00(r3)
            if (r3 == 0) goto L_0x01ea
            r13.add(r3)
            goto L_0x01ea
        L_0x0201:
            X.00H r3 = r12.A00
            r16 = r3
            r16.get()
            X.1ca r4 = r1.A03()
            java.lang.String r3 = "compliance_info"
            X.1ca r3 = r4.A0K(r3)
            X.ADn r4 = X.A6T.A01(r3)
            java.lang.String r3 = "COUNTRY_ORIGIN_EXEMPT"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0226
            r7 = 0
            java.lang.String r3 = "N/A"
            X.ADn r4 = new X.ADn
            r4.<init>(r7, r3, r7)
        L_0x0226:
            java.lang.Long r3 = r1.A09
            if (r3 == 0) goto L_0x02ab
            long r39 = r3.longValue()
        L_0x022e:
            X.9D8 r8 = r1.A00
            r3 = 0
            if (r8 == 0) goto L_0x0264
            java.lang.String r14 = r8.A04
            java.lang.Object r7 = r8.A03
            X.9Cb r7 = (X.C178169Cb) r7
            if (r7 == 0) goto L_0x02a9
            java.lang.String r15 = r7.A01
        L_0x023d:
            java.lang.Object r7 = r8.A01
            X.9Cb r7 = (X.C178169Cb) r7
            if (r7 == 0) goto L_0x02a7
            java.lang.String r9 = r7.A01
        L_0x0245:
            java.lang.Object r7 = r8.A00
            X.9Cb r7 = (X.C178169Cb) r7
            if (r7 == 0) goto L_0x024d
            java.lang.String r3 = r7.A01
        L_0x024d:
            java.lang.String r7 = "true"
            boolean r26 = X.C18070vi.A18(r3, r7)
            int r25 = X.AnonymousClass9PL.A00(r14)
            r24 = 0
            X.AEJ r3 = new X.AEJ
            r21 = r3
            r22 = r15
            r23 = r9
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x0264:
            java.lang.Object r9 = r16.get()
            X.A6T r9 = (X.A6T) r9
            X.1ca r8 = r1.A03()
            java.lang.String r7 = "variant_info"
            X.1ca r7 = r8.A0K(r7)
            X.AE6 r26 = r9.A04(r0, r7)
            r22 = 0
            r41 = 1
            X.AEv r7 = new X.AEv
            r21 = r7
            r23 = r4
            r24 = r3
            r25 = r17
            r27 = r0
            r32 = r31
            r37 = r13
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42)
            X.9Cb r0 = r1.A01
            if (r0 == 0) goto L_0x02a5
            java.lang.String r0 = r0.A01
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            X.8iN r1 = new X.8iN
            r1.<init>(r7, r0)
        L_0x029e:
            r0 = r19
            r0.add(r1)
            goto L_0x00ce
        L_0x02a5:
            r1 = r7
            goto L_0x029e
        L_0x02a7:
            r9 = r3
            goto L_0x0245
        L_0x02a9:
            r15 = r3
            goto L_0x023d
        L_0x02ab:
            r39 = 99
            goto L_0x022e
        L_0x02ae:
            java.lang.String r0 = "Connection/Product/missing required fields."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00ce
        L_0x02b5:
            r3 = r7
            goto L_0x0108
        L_0x02b8:
            r0 = r7
            goto L_0x0102
        L_0x02bb:
            r30 = r7
            goto L_0x00f7
        L_0x02bf:
            r34 = r7
            goto L_0x00e7
        L_0x02c3:
            java.util.ArrayList r18 = X.C29431cG.A0m(r19)
            java.lang.String r4 = r2.A03
            java.lang.String r3 = r2.A04
            java.lang.Object r9 = r2.A00
            X.9D0 r9 = (X.AnonymousClass9D0) r9
            if (r9 != 0) goto L_0x02f0
            r0 = 0
            X.9O2 r7 = new X.9O2
            r7.<init>()
            r7.A00 = r6
            r7.A03 = r6
            r7.A02 = r0
            r7.A01 = r0
        L_0x02df:
            r15 = 0
            X.9sq r0 = new X.9sq
            r13 = r0
            r14 = r7
            r16 = r4
            r17 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            r11.add(r0)
            goto L_0x00b6
        L_0x02f0:
            java.lang.String r1 = r9.A03
            boolean r0 = X.AnonymousClass1EG.A0H(r1)
            if (r0 != 0) goto L_0x0335
            java.lang.String r0 = "APPROVED"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0335
            java.lang.String r0 = "REJECTED"
            boolean r0 = X.C18070vi.A18(r1, r0)
            int r8 = X.C72453Mb.A03(r0)
        L_0x030a:
            X.9Cb r0 = r9.A02
            r7 = 0
            if (r0 == 0) goto L_0x0333
            java.lang.String r2 = r0.A01
        L_0x0311:
            X.9Cb r0 = r9.A01
            if (r0 == 0) goto L_0x0331
            java.lang.String r1 = r0.A01
        L_0x0317:
            X.9Cb r0 = r9.A00
            if (r0 == 0) goto L_0x031d
            java.lang.String r7 = r0.A01
        L_0x031d:
            java.lang.String r0 = "true"
            boolean r0 = X.C18070vi.A18(r7, r0)
            X.9O2 r7 = new X.9O2
            r7.<init>()
            r7.A00 = r8
            r7.A03 = r0
            r7.A02 = r2
            r7.A01 = r1
            goto L_0x02df
        L_0x0331:
            r1 = r7
            goto L_0x0317
        L_0x0333:
            r2 = r7
            goto L_0x0311
        L_0x0335:
            r8 = 0
            goto L_0x030a
        L_0x0337:
            X.1UI r0 = X.AnonymousClass1O9.A00(r12)
            throw r0
        L_0x033c:
            X.1UI r0 = X.AnonymousClass1O9.A00(r12)
            throw r0
        L_0x0341:
            X.1UI r0 = X.AnonymousClass1O9.A00(r12)
            throw r0
        L_0x0346:
            X.A3w r8 = r5.A09
            java.lang.String r0 = "collections"
            X.1ca r7 = r13.A0K(r0)
            r1 = 0
            if (r7 == 0) goto L_0x03b8
            java.lang.String r0 = "catalog_type"
            X.1ca r0 = r7.A0K(r0)
            if (r0 == 0) goto L_0x035d
            java.lang.String r1 = r0.A0M()
        L_0x035d:
            X.9Hv r4 = X.AnonymousClass9PK.A00(r1)
            java.lang.String r0 = "collection"
            java.util.List r0 = r7.A0R(r0)
            java.util.ArrayList r3 = X.C108965cb.A0t(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x036f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x038c
            X.1ca r1 = X.C17880vN.A0a(r2)
            X.C18070vi.A0b(r1)
            X.9sq r0 = X.C20027A3w.A00(r8, r1)
            if (r0 == 0) goto L_0x036f
            X.9sq r0 = X.C20027A3w.A00(r8, r1)
            if (r0 == 0) goto L_0x036f
            r3.add(r0)
            goto L_0x036f
        L_0x038c:
            java.lang.String r0 = "paging"
            X.1ca r0 = r7.A0K(r0)
            X.9q5 r0 = X.A6T.A00(r0)
            X.9rN r2 = new X.9rN
            r2.<init>(r0, r4, r3)
            goto L_0x03b0
        L_0x039c:
            X.9Hv r3 = X.C179409Hv.UNKNOWN
            int r0 = r10.length()
            boolean r1 = X.AnonymousClass000.A1R(r0)
            X.9q5 r0 = new X.9q5
            r0.<init>(r1, r10)
            X.9rN r2 = new X.9rN
            r2.<init>(r0, r3, r11)
        L_0x03b0:
            X.9tV r1 = r5.A01
            X.9nc r0 = r5.A00
            r0.A00(r2, r1)
            return
        L_0x03b8:
            X.9tV r1 = r5.A01
            X.9nc r0 = r5.A00
            r0.A01(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167878hv.C7Z(X.1ca, java.lang.String):void");
    }

    public static final void A00(C167878hv r1) {
        C222119a A002;
        if (r1.A01.A06 == null && (A002 = C20004A2u.A00(r1.A06, "catalog_collections_view_tag")) != null) {
            A002.A06("datasource_collections");
        }
    }
}
