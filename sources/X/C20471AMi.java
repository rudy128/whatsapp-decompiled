package X;

/* renamed from: X.AMi  reason: case insensitive filesystem */
public class C20471AMi implements B77 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20471AMi(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027c, code lost:
        if (r0 != null) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x029e, code lost:
        if (r14 != null) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d6, code lost:
        r2.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0313, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A03, 3400) == false) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0344, code lost:
        r0 = "bizQPLManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0349, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x034d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f8, code lost:
        if (r2.A4e().A02 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0200, code lost:
        if (r2.A4e().A03 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0202, code lost:
        r1 = r2.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0204, code lost:
        if (r1 == null) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0206, code lost:
        r1.A06("catalog_collections_view_tag", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bmx(X.AEW r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x02da;
                case 1: goto L_0x02c0;
                case 2: goto L_0x02ad;
                case 3: goto L_0x027f;
                case 4: goto L_0x0199;
                case 5: goto L_0x0173;
                case 6: goto L_0x00f7;
                case 7: goto L_0x009d;
                case 8: goto L_0x0077;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r13.A01
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r6 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r6
            java.lang.Object r1 = r13.A02
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.8i0 r0 = r6.A26()
            r0.A00 = r14
            X.8i0 r8 = r6.A26()
            boolean r0 = r8 instanceof X.AnonymousClass8l7
            if (r0 == 0) goto L_0x002b
            java.util.List r7 = r8.A00
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0047
            r0 = 0
            r8.A0b(r0, r1)
        L_0x002b:
            X.0vl r0 = r6.A0K
            java.lang.Object r0 = r0.getValue()
            X.8FU r0 = (X.AnonymousClass8FU) r0
            X.9p3 r0 = r0.A02
            r0.A00()
            androidx.recyclerview.widget.RecyclerView r2 = r6.A00
            if (r2 == 0) goto L_0x0046
            r1 = 34
            X.7R9 r0 = new X.7R9
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.post(r0)
        L_0x0046:
            return
        L_0x0047:
            java.util.Iterator r5 = r1.iterator()
        L_0x004b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x002b
            X.AEv r4 = X.AnonymousClass8BS.A0B(r5)
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x004b
            int r3 = X.AnonymousClass3MX.A01(r7)
            long r1 = r8.A0U(r4)
            X.8jb r0 = new X.8jb
            r0.<init>(r4, r1)
            r7.add(r3, r0)
            int r0 = X.AnonymousClass3MX.A01(r7)
            r8.A0H(r0)
            goto L_0x004b
        L_0x0077:
            java.lang.Object r2 = r13.A01
            X.8FD r2 = (X.AnonymousClass8FD) r2
            java.lang.Object r5 = r13.A02
            X.9l3 r5 = (X.C190499l3) r5
            if (r14 == 0) goto L_0x0046
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.List r0 = r14.A0P
            java.util.Iterator r1 = r0.iterator()
        L_0x008b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02f2
            java.lang.Object r0 = r1.next()
            X.AEQ r0 = (X.AEQ) r0
            java.lang.String r0 = r0.A00
            r3.add(r0)
            goto L_0x008b
        L_0x009d:
            java.lang.Object r4 = r13.A01
            X.8iH r4 = (X.C168098iH) r4
            java.lang.Object r3 = r13.A02
            X.ADV r3 = (X.ADV) r3
            X.A1i r2 = r4.A09
            com.whatsapp.jid.UserJid r1 = r4.A0C
            if (r1 == 0) goto L_0x00f5
            X.A7x r0 = r4.A07
            X.9Hv r0 = r0.A09(r1)
        L_0x00b1:
            boolean r0 = r2.A01(r0, r14)
            if (r0 == 0) goto L_0x0333
            X.AE6 r2 = r3.A04
            if (r2 == 0) goto L_0x0333
            java.util.List r0 = r2.A02
            if (r0 == 0) goto L_0x0333
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0333
            com.whatsapp.TextEmojiLabel r1 = r4.A04
            r3 = 0
            r1.setVisibility(r3)
            X.9k4 r0 = r4.A0A
            java.util.List r2 = r0.A00(r2)
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00e1
            r1.setVisibility(r3)
            java.lang.Object r0 = r2.get(r3)
            X.AnonymousClass8BR.A1E(r1, r0)
        L_0x00e1:
            int r1 = r2.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0046
            com.whatsapp.TextEmojiLabel r1 = r4.A05
            r1.setVisibility(r3)
            java.lang.Object r0 = r2.get(r0)
            X.AnonymousClass8BR.A1E(r1, r0)
            return
        L_0x00f5:
            r0 = 0
            goto L_0x00b1
        L_0x00f7:
            java.lang.Object r5 = r13.A01
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r5 = (com.whatsapp.biz.catalog.view.activity.ProductListActivity) r5
            java.lang.Object r2 = r13.A02
            java.util.List r2 = (java.util.List) r2
            r4 = 1
            X.8I0 r6 = r5.A0E
            java.lang.String r1 = "productSectionsListAdapter"
            if (r6 == 0) goto L_0x0340
            r6.A01 = r14
            java.util.List r3 = r6.A05
            X.8HF r0 = new X.8HF
            r0.<init>(r3, r2)
            X.Cl4 r1 = X.C25367CeS.A00(r0)
            r3.clear()
            r3.addAll(r2)
            X.AHM r0 = r6.A00
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = "productListUpdateCallback"
            goto L_0x0349
        L_0x0121:
            r1.A01(r0)
            boolean r0 = X.AnonymousClass000.A1a(r2)
            if (r0 == 0) goto L_0x0137
            android.view.View r1 = r5.A00
            if (r1 != 0) goto L_0x0132
            java.lang.String r0 = "noInternetConnectionView"
            goto L_0x0349
        L_0x0132:
            r0 = 8
            r1.setVisibility(r0)
        L_0x0137:
            X.8F5 r0 = r5.A0F
            java.lang.String r1 = "productListViewModel"
            if (r0 == 0) goto L_0x0340
            X.1Dg r0 = r0.A01
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x0046
            X.8F5 r0 = r5.A0F
            if (r0 == 0) goto L_0x0340
            X.1Dg r0 = r0.A01
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 == 0) goto L_0x0046
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x0046
            X.A2u r3 = r5.A0J
            if (r3 == 0) goto L_0x0344
            int r0 = r2.size()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "plm_details_view_tag"
            java.lang.String r0 = "ProductsCount"
            r3.A04(r1, r0, r2)
            X.A2u r0 = r5.A0J
            if (r0 == 0) goto L_0x0344
            r0.A06(r1, r4)
            return
        L_0x0173:
            java.lang.Object r2 = r13.A01
            X.8j9 r2 = (X.C168578j9) r2
            java.lang.Object r1 = r13.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r3 = 1
            java.lang.String r0 = "CatalogListBaseActivity onFetchCatalogSuccess business profile fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8i1 r0 = r2.A4d()
            r0.A00 = r14
            java.lang.String r0 = "CatalogListBaseActivity onCatalogFound"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A0Q = r3
            r2.invalidateOptionsMenu()
            X.8i1 r0 = r2.A4d()
            X.C167938i1.A01(r0, r1)
            goto L_0x01f2
        L_0x0199:
            java.lang.Object r2 = r13.A01
            X.8j9 r2 = (X.C168578j9) r2
            java.lang.Object r3 = r13.A02
            X.9Wi r3 = (X.C182949Wi) r3
            java.lang.String r0 = "CatalogListBaseActivity handleFetchCollectionsResult, business profile fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8i1 r0 = r2.A4d()
            r0.A00 = r14
            boolean r0 = r3 instanceof X.C168588jG
            if (r0 == 0) goto L_0x020c
            X.8jG r3 = (X.C168588jG) r3
            java.lang.String r0 = "CatalogListBaseActivity handleFetchCollectionsSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.UserJid r1 = r3.A00
            com.whatsapp.jid.UserJid r0 = r2.A4f()
            boolean r0 = X.C42171xk.A00(r1, r0)
            if (r0 != 0) goto L_0x01c9
            java.lang.String r0 = "CatalogListBaseActivity handleFetchCollectionsSuccess, different jid"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01c9:
            X.9cr r1 = r3.A00
            boolean r0 = r1.A02
            r3 = 1
            if (r0 == 0) goto L_0x01da
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x01da
            X.8F8 r0 = r2.A4e()
            r0.A03 = r3
        L_0x01da:
            r2.A4e()
            java.lang.String r0 = "CatalogListBaseActivity onCatalogFound"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A0Q = r3
            r2.invalidateOptionsMenu()
            X.8i1 r1 = r2.A4d()
            com.whatsapp.jid.UserJid r0 = r2.A4f()
            X.C167938i1.A01(r1, r0)
        L_0x01f2:
            X.8F8 r0 = r2.A4e()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0046
            X.8F8 r0 = r2.A4e()
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0046
            X.A2u r1 = r2.A0E
            if (r1 == 0) goto L_0x0344
            java.lang.String r0 = "catalog_collections_view_tag"
            r1.A06(r0, r3)
            return
        L_0x020c:
            boolean r0 = r3 instanceof X.AnonymousClass8jF
            if (r0 == 0) goto L_0x0046
            com.whatsapp.jid.UserJid r1 = r3.A00
            com.whatsapp.jid.UserJid r0 = r2.A4f()
            boolean r0 = X.C42171xk.A00(r1, r0)
            if (r0 == 0) goto L_0x0046
            X.8F8 r0 = r2.A4e()
            r5 = 1
            r0.A03 = r5
            r2.A4e()
            X.8F8 r0 = r2.A4e()
            java.lang.Integer r4 = r0.A01
            java.lang.String r3 = "catalog_collections_view_tag"
            if (r4 == 0) goto L_0x0257
            r1 = 404(0x194, float:5.66E-43)
            int r0 = r4.intValue()
            if (r0 != r1) goto L_0x0243
            java.lang.String r0 = "CatalogListBaseActivity onCatalogMissing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r2.A0Q = r0
            r2.invalidateOptionsMenu()
        L_0x0243:
            X.8i1 r1 = r2.A4d()
            int r0 = r4.intValue()
            r1.A0b(r0)
            X.A2u r0 = r2.A0E
            if (r0 == 0) goto L_0x0344
            r5 = 0
        L_0x0253:
            r0.A06(r3, r5)
            return
        L_0x0257:
            X.00H r0 = r2.A0K
            if (r0 == 0) goto L_0x0347
            java.lang.Object r0 = r0.get()
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = (com.whatsapp.biz.catalog.manager.CatalogManager) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "CatalogListBaseActivity onCatalogFound"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A0Q = r5
            r2.invalidateOptionsMenu()
            X.8i1 r1 = r2.A4d()
            com.whatsapp.jid.UserJid r0 = r2.A4f()
            X.C167938i1.A01(r1, r0)
            X.A2u r0 = r2.A0E
            if (r0 == 0) goto L_0x0344
            goto L_0x0253
        L_0x027f:
            java.lang.Object r3 = r13.A01
            com.whatsapp.biz.catalog.view.CatalogHeader r3 = (com.whatsapp.biz.catalog.view.CatalogHeader) r3
            java.lang.Object r2 = r13.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            boolean r0 = r3.A0C
            if (r0 != 0) goto L_0x029e
            if (r14 != 0) goto L_0x02a0
            X.1Ty r1 = r3.A04
            r0 = 0
            r1.A0F(r3, r2, r0)
            r0 = 1
            r3.A0C = r0
        L_0x0296:
            com.whatsapp.TextEmojiLabel r1 = r3.A02
            r0 = 8
        L_0x029a:
            r1.setVisibility(r0)
            return
        L_0x029e:
            if (r14 == 0) goto L_0x0296
        L_0x02a0:
            com.whatsapp.TextEmojiLabel r1 = r3.A02
            if (r1 == 0) goto L_0x0296
            java.lang.String r0 = r14.A0H
            r1.A0R(r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A02
            r0 = 0
            goto L_0x029a
        L_0x02ad:
            java.lang.Object r2 = r13.A01
            X.Af0 r2 = (X.C21132Af0) r2
            java.lang.Object r1 = r13.A02
            X.9tU r1 = (X.C195529tU) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.9uX r0 = r1.A03
            java.lang.String r0 = r0.A00(r14)
            goto L_0x02d6
        L_0x02c0:
            java.lang.Object r2 = r13.A01
            X.Af0 r2 = (X.C21132Af0) r2
            java.lang.Object r1 = r13.A02
            X.9tU r1 = (X.C195529tU) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.9uX r0 = r1.A03
            boolean r0 = r0.A04(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x02d6:
            r2.A0B(r0)
            return
        L_0x02da:
            java.lang.Object r0 = r13.A01
            X.1Ty r0 = (X.C26911Ty) r0
            java.lang.Object r1 = r13.A02
            X.BAE r1 = (X.BAE) r1
            if (r14 == 0) goto L_0x02ee
            boolean r0 = X.C26911Ty.A03(r0, r14)
            if (r0 == 0) goto L_0x02ee
            r1.Brc(r14)
            return
        L_0x02ee:
            r1.BzH(r14)
            return
        L_0x02f2:
            X.ATl r7 = r2.A0F
            com.whatsapp.jid.Jid r11 = r2.A04
            X.AOq r0 = r2.A0N
            X.8FJ r4 = r0.A00
            X.A6f r10 = r4.A01
            X.AP5 r0 = r2.A0J
            java.lang.String r12 = r0.A0K
            X.1XN r1 = r2.A0O
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0315
            X.0ve r6 = r1.A03
            r1 = 3400(0xd48, float:4.764E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r6, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0316
        L_0x0315:
            r0 = 0
        L_0x0316:
            r8 = 0
            if (r0 == 0) goto L_0x031a
            r3 = r8
        L_0x031a:
            java.lang.Integer r1 = r5.A00
            boolean r0 = r5.A02
            X.9l3 r9 = new X.9l3
            r9.<init>(r1, r3, r0)
            X.A6f r0 = r4.A01
            boolean r0 = X.C197639x1.A00(r0)
            if (r0 == 0) goto L_0x032f
            X.9aY r8 = X.AnonymousClass8FD.A00(r2)
        L_0x032f:
            r7.A02(r8, r9, r10, r11, r12)
            return
        L_0x0333:
            com.whatsapp.TextEmojiLabel r0 = r4.A04
            r1 = 8
            r0.setVisibility(r1)
            com.whatsapp.TextEmojiLabel r0 = r4.A05
            r0.setVisibility(r1)
            return
        L_0x0340:
            X.C18070vi.A11(r1)
            goto L_0x034c
        L_0x0344:
            java.lang.String r0 = "bizQPLManager"
            goto L_0x0349
        L_0x0347:
            java.lang.String r0 = "catalogManager"
        L_0x0349:
            X.C18070vi.A11(r0)
        L_0x034c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20471AMi.Bmx(X.AEW):void");
    }
}
