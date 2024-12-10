package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AMp  reason: case insensitive filesystem */
public class C20478AMp implements B77 {
    public final int A00;
    public final Object A01;

    public C20478AMp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C26911Ty r1, UserJid userJid, Object obj, int i) {
        r1.A0D(new C20478AMp(obj, i), userJid);
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bmx(X.AEW r22) {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.A00
            r4 = r22
            switch(r0) {
                case 0: goto L_0x026d;
                case 1: goto L_0x0208;
                case 2: goto L_0x01fc;
                case 3: goto L_0x01f4;
                case 4: goto L_0x01aa;
                case 5: goto L_0x0142;
                case 6: goto L_0x013b;
                case 7: goto L_0x0131;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r1.A01
            com.whatsapp.registration.viewmodel.ProfileCreationViewModel r3 = (com.whatsapp.registration.viewmodel.ProfileCreationViewModel) r3
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            if (r22 == 0) goto L_0x026c
            r3.A00 = r4
            java.util.List r7 = r4.A0P
            X.0ve r5 = r3.A03
            r1 = 1263(0x4ef, float:1.77E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            r6 = 1
            if (r0 == 0) goto L_0x0094
            java.util.Iterator r5 = r7.iterator()
        L_0x0028:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r5.next()
            X.AEQ r0 = (X.AEQ) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "644728732639272"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0028
            r1 = 1
        L_0x003f:
            boolean r0 = r7.isEmpty()
            r6 = r6 ^ r0
            if (r6 == 0) goto L_0x004d
            if (r1 != 0) goto L_0x004d
            X.1G4 r0 = r3.A09
            r0.setValue(r7)
        L_0x004d:
            X.ADs r0 = r4.A04
            if (r0 == 0) goto L_0x0230
            java.util.List r1 = r0.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0230
            java.lang.Object r0 = r1.get(r2)
            X.AE8 r0 = (X.AE8) r0
            int r7 = r0.A01
            java.util.LinkedHashMap r9 = X.C17880vN.A13()
            java.util.Iterator r6 = r1.iterator()
        L_0x0069:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r5 = r6.next()
            X.AE8 r5 = (X.AE8) r5
            int r0 = r5.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.containsKey(r1)
            if (r0 != 0) goto L_0x0088
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r9.put(r1, r0)
        L_0x0088:
            java.lang.Object r0 = r9.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0069
            r0.add(r5)
            goto L_0x0069
        L_0x0094:
            r1 = 0
            goto L_0x003f
        L_0x0096:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            r0 = 7
            int[] r8 = new int[r0]
            r8 = {1, 2, 3, 4, 5, 6, 7} // fill-array
            r6 = 0
        L_0x00a1:
            r10 = 1
            if (r6 >= r0) goto L_0x0218
            r1 = r8[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r9.containsKey(r0)
            if (r0 == 0) goto L_0x011e
            java.lang.Object r12 = X.AnonymousClass8BT.A0r(r9, r1)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x00f1
            int r11 = r12.size()
            r0 = 2
            if (r11 != r0) goto L_0x00f5
            java.lang.Object r0 = r12.get(r2)
            X.AE8 r0 = (X.AE8) r0
            java.lang.Integer r13 = r0.A03
            java.lang.Object r0 = r12.get(r2)
            X.AE8 r0 = (X.AE8) r0
            java.lang.Integer r14 = r0.A02
            java.lang.Object r0 = r12.get(r10)
            X.AE8 r0 = (X.AE8) r0
            java.lang.Integer r15 = r0.A03
            java.lang.Object r0 = r12.get(r10)
            X.AE8 r0 = (X.AE8) r0
            java.lang.Integer r0 = r0.A02
            r19 = r10
            X.9ta r12 = new X.9ta
            r20 = r10
            r18 = r7
            r17 = r1
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00ee:
            r5.add(r12)
        L_0x00f1:
            int r6 = r6 + 1
            r0 = 7
            goto L_0x00a1
        L_0x00f5:
            int r0 = r12.size()
            if (r0 != r10) goto L_0x00f1
            java.lang.Object r0 = r12.get(r2)
            X.AE8 r0 = (X.AE8) r0
            java.lang.Integer r11 = r0.A03
            java.lang.Object r0 = r12.get(r2)
            X.AE8 r0 = (X.AE8) r0
            java.lang.Integer r0 = r0.A02
            r15 = 0
            X.9ta r12 = new X.9ta
            r13 = r11
            r14 = r0
            r16 = r15
            r17 = r1
            r18 = r7
            r19 = r10
            r20 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00ee
        L_0x011e:
            r13 = 0
            r15 = r13
            r16 = r13
            r20 = r2
            X.9ta r12 = new X.9ta
            r14 = r13
            r17 = r1
            r18 = r7
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00ee
        L_0x0131:
            java.lang.Object r0 = r1.A01
            X.8Gc r0 = (X.C161588Gc) r0
            r0.A02 = r4
            X.C161588Gc.A04(r0)
            return
        L_0x013b:
            java.lang.Object r0 = r1.A01
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r0 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r0
            r0.A09 = r4
            return
        L_0x0142:
            java.lang.Object r3 = r1.A01
            com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment r3 = (com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment) r3
            X.8i0 r0 = r3.A26()
            r0.A00 = r4
            X.00H r0 = r3.A0E
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r2 = r0.get()
            X.A7x r2 = (X.C20114A7x) r2
            com.whatsapp.jid.UserJid r1 = r3.A27()
            java.lang.String r0 = r3.A0F
            if (r0 == 0) goto L_0x01a3
            X.9sq r2 = r2.A08(r1, r0)
            java.lang.String r1 = r3.A0F
            if (r1 == 0) goto L_0x01a3
            java.lang.String r0 = "catalog_products_all_items_collection_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x018e
            X.8i0 r2 = r3.A26()
            X.00H r0 = r3.A0E
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r1 = r0.get()
            X.A7x r1 = (X.C20114A7x) r1
            com.whatsapp.jid.UserJid r0 = r3.A27()
            java.util.List r1 = r1.A0D(r0)
            r0 = 0
            r2.A0b(r0, r1)
        L_0x0188:
            X.B7t r0 = r3.A06
            X.C18070vi.A0b(r0)
            return
        L_0x018e:
            if (r2 == 0) goto L_0x0188
            java.util.List r1 = r2.A04
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0188
            X.8i0 r0 = r3.A26()
            r0.A0b(r2, r1)
            goto L_0x0188
        L_0x01a0:
            java.lang.String r0 = "catalogCacheManager"
            goto L_0x01a5
        L_0x01a3:
            java.lang.String r0 = "collectionId"
        L_0x01a5:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01aa:
            java.lang.Object r5 = r1.A01
            X.8kE r5 = (X.C169018kE) r5
            r3 = 0
            java.lang.String r0 = "CollectionProductListBaseActivity handleFetchSuccess, fetched business profile"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8i0 r0 = r5.A0A
            r2 = 0
            if (r0 == 0) goto L_0x01f2
            X.AEW r0 = r0.A00
        L_0x01bb:
            if (r4 == r0) goto L_0x026c
            java.lang.String r0 = "CollectionProductListBaseActivity handleFetchSuccess, business profile changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8i0 r1 = r5.A0A
            if (r1 == 0) goto L_0x01c8
            r1.A00 = r4
        L_0x01c8:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A02
            if (r0 == 0) goto L_0x01d0
            X.1qy r2 = r0.getLayoutManager()
        L_0x01d0:
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x01e9
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r3 = r2.A1O()
            int r0 = r2.A1Q()
            X.8i0 r1 = r5.A0A
            if (r1 == 0) goto L_0x026c
            int r0 = r0 - r3
            int r0 = r0 + 1
        L_0x01e5:
            r1.A0J(r3, r0)
            return
        L_0x01e9:
            if (r1 == 0) goto L_0x026c
            java.util.List r0 = r1.A00
            int r0 = r0.size()
            goto L_0x01e5
        L_0x01f2:
            r0 = r2
            goto L_0x01bb
        L_0x01f4:
            java.lang.Object r0 = r1.A01
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r0 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r0
            com.whatsapp.biz.product.view.activity.ProductDetailActivity.A03(r0, r4)
            return
        L_0x01fc:
            java.lang.Object r0 = r1.A01
            X.9yv r0 = (X.C198799yv) r0
            X.1DT r0 = r0.A00
            if (r0 == 0) goto L_0x026c
            r0.A0E(r4)
            return
        L_0x0208:
            java.lang.Object r0 = r1.A01
            X.9yv r0 = (X.C198799yv) r0
            if (r22 == 0) goto L_0x026c
            X.1DT r1 = r0.A05
            if (r1 == 0) goto L_0x026c
            boolean r0 = r4.A0Z
            X.AnonymousClass3MY.A1M(r1, r0)
            return
        L_0x0218:
            boolean r0 = X.C17880vN.A1X(r5)
            if (r0 == 0) goto L_0x0230
            X.1G4 r1 = r3.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.setValue(r0)
            X.1G4 r1 = r3.A06
            java.util.List r0 = X.C29431cG.A0t(r5)
            r1.setValue(r0)
        L_0x0230:
            X.AEH r0 = r4.A08
            java.lang.String r5 = r0.A03
            if (r5 == 0) goto L_0x0240
            X.1G4 r1 = r3.A04
            X.A1U r0 = new X.A1U
            r0.<init>(r5)
            r1.setValue(r0)
        L_0x0240:
            java.util.List r1 = r4.A0V
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0263
            java.lang.String r0 = X.C17880vN.A0w(r1, r2)
            if (r0 == 0) goto L_0x0263
            X.B0L r5 = new X.B0L
            r5.<init>(r0)
            X.1G4 r2 = r3.A08
        L_0x0255:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r5.invoke(r1)
            boolean r0 = r2.BFK(r1, r0)
            if (r0 == 0) goto L_0x0255
        L_0x0263:
            java.lang.String r1 = r4.A0H
            if (r1 == 0) goto L_0x026c
            X.1G4 r0 = r3.A05
            r0.setValue(r1)
        L_0x026c:
            return
        L_0x026d:
            java.lang.Object r0 = r1.A01
            X.8hx r0 = (X.C167898hx) r0
            if (r22 != 0) goto L_0x0281
            X.1Ty r3 = r0.A01
            com.whatsapp.jid.UserJid r2 = r0.A00
            X.AMy r1 = new X.AMy
            r1.<init>(r0)
            r0 = 0
            r3.A0F(r1, r2, r0)
            return
        L_0x0281:
            r0.A05(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20478AMp.Bmx(X.AEW):void");
    }
}
