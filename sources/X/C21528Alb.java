package X;

/* renamed from: X.Alb  reason: case insensitive filesystem */
public class C21528Alb implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public C21528Alb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C18110vm A00(Object obj, int i) {
        return AnonymousClass1DF.A01(new C21528Alb(obj, i));
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [X.1uf, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0433, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0437, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x044f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 8798) == false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0103, code lost:
        r0 = "contactPhotos";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bd, code lost:
        if (r2 == X.C24360Bzv.A01) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01bf, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c2, code lost:
        if (r2 != X.C24360Bzv.A02) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c4, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c9, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0047;
                case 2: goto L_0x005c;
                case 3: goto L_0x0066;
                case 4: goto L_0x0080;
                case 5: goto L_0x008c;
                case 6: goto L_0x009b;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00e1;
                case 9: goto L_0x040d;
                case 10: goto L_0x00f4;
                case 11: goto L_0x0107;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0149;
                case 15: goto L_0x0167;
                case 16: goto L_0x0185;
                case 17: goto L_0x01a3;
                case 18: goto L_0x01cf;
                case 19: goto L_0x000e;
                case 20: goto L_0x01ed;
                case 21: goto L_0x01f7;
                case 22: goto L_0x0206;
                case 23: goto L_0x0216;
                case 24: goto L_0x0220;
                case 25: goto L_0x0235;
                case 26: goto L_0x024a;
                case 27: goto L_0x0266;
                case 28: goto L_0x02a9;
                case 29: goto L_0x02b6;
                case 30: goto L_0x02c1;
                case 31: goto L_0x032a;
                case 32: goto L_0x0339;
                case 33: goto L_0x0347;
                case 34: goto L_0x035e;
                case 35: goto L_0x0368;
                case 36: goto L_0x0370;
                case 37: goto L_0x037d;
                case 38: goto L_0x03b0;
                case 39: goto L_0x03c0;
                case 40: goto L_0x03ce;
                case 41: goto L_0x03dc;
                case 42: goto L_0x03ea;
                case 43: goto L_0x0460;
                case 44: goto L_0x046f;
                case 45: goto L_0x047f;
                case 46: goto L_0x048e;
                case 47: goto L_0x049e;
                case 48: goto L_0x04b1;
                case 49: goto L_0x04c3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r5 = r0.getContext()
        L_0x000d:
            return r5
        L_0x000e:
            java.lang.Object r0 = r15.A01
            X.9nK r0 = (X.C191869nK) r0
            X.77S r1 = r0.A06
            java.lang.String r0 = "XFAM_WFS"
            java.lang.Object r5 = r1.A00(r0)
            if (r5 != 0) goto L_0x000d
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0021:
            java.lang.Object r1 = r15.A01
            X.A8T r1 = (X.A8T) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.118 r0 = r1.A00
            android.content.Context r1 = r0.A00
            java.lang.String r0 = r1.getPackageName()
            android.content.pm.PackageInfo r0 = X.C24211Jh.A02(r1, r0)
            if (r0 == 0) goto L_0x0040
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L_0x0040
            java.lang.String r5 = r0.dataDir
            if (r5 == 0) goto L_0x0040
            return r5
        L_0x0040:
            java.lang.String r0 = "AccountSwitchingFileManager/getApplicationDataDir/unable to get application path"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0047:
            java.lang.Object r1 = r15.A01
            X.A8T r1 = (X.A8T) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = r1.A08
            java.lang.String r1 = X.AnonymousClass3MW.A0y(r0)
            java.lang.String r0 = "staging"
            java.io.File r5 = X.AnonymousClass8BR.A0u(r1, r0)
            return r5
        L_0x005c:
            java.lang.Object r0 = r15.A01
            X.ALf r0 = (X.C20442ALf) r0
            X.C20442ALf.A01(r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0066:
            java.lang.Object r3 = r15.A01
            X.ALb r3 = (X.C20438ALb) r3
            X.0z4 r0 = r3.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "storage_usage_banner_dismissed"
            X.C17880vN.A1F(r1, r0, r2)
            android.view.View r1 = r3.A00
            r0 = 8
            r1.setVisibility(r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0080:
            java.lang.Object r1 = r15.A01
            X.01E r1 = (X.AnonymousClass01E) r1
            r0 = 2131430083(0x7f0b0ac3, float:1.8481857E38)
            X.1bI r5 = X.AnonymousClass3Ma.A0x(r1, r0)
            return r5
        L_0x008c:
            java.lang.Object r2 = r15.A01
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r2 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r2
            X.1Vd r1 = r2.A02
            if (r1 == 0) goto L_0x0103
            java.lang.String r0 = "product-detail-activity"
            X.1pZ r5 = r1.A06(r2, r0)
            return r5
        L_0x009b:
            java.lang.Object r3 = r15.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            android.view.View r2 = r3.A00
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131892929(0x7f121ac1, float:1.942062E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 4000(0xfa0, float:5.605E-42)
            X.Bik r5 = X.C23520Bik.A02(r2, r1, r0)
            r2 = 2131895332(0x7f122424, float:1.9425494E38)
            r1 = 43
            X.9Aa r0 = new X.9Aa
            r0.<init>(r3, r1)
            r5.A0F(r0, r2)
            return r5
        L_0x00c0:
            java.lang.Object r4 = r15.A01
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r4 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r4
            X.9Up r3 = r4.A00
            if (r3 == 0) goto L_0x00dd
            com.whatsapp.jid.UserJid r2 = r4.A4e()
            r1 = 0
            X.AH2 r0 = new X.AH2
            r0.<init>(r3, r2, r1)
            X.1It r1 = X.AnonymousClass8BR.A0C(r0, r4)
            java.lang.Class<com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel> r0 = com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel.class
            X.1J2 r5 = r1.A00(r0)
            return r5
        L_0x00dd:
            java.lang.String r0 = "postcodeViewModelFactory"
            goto L_0x0433
        L_0x00e1:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.A06
            if (r2 == 0) goto L_0x00f2
            java.lang.String r1 = "extra_business_profile"
            java.lang.Class<X.AEW> r0 = X.AEW.class
            java.lang.Object r5 = X.C24141Ja.A00(r2, r0, r1)
            return r5
        L_0x00f2:
            r5 = 0
            return r5
        L_0x00f4:
            java.lang.Object r2 = r15.A01
            com.whatsapp.blocklist.BlockList r2 = (com.whatsapp.blocklist.BlockList) r2
            X.1Vd r1 = r2.A06
            if (r1 == 0) goto L_0x0103
            java.lang.String r0 = "block-list-activity"
            X.1pZ r5 = r1.A06(r2, r0)
            return r5
        L_0x0103:
            java.lang.String r0 = "contactPhotos"
            goto L_0x0433
        L_0x0107:
            java.lang.Object r6 = r15.A01
            com.whatsapp.blocklist.BlockList r6 = (com.whatsapp.blocklist.BlockList) r6
            X.9Uu r1 = r6.A00
            if (r1 == 0) goto L_0x0145
            java.util.List r13 = r6.A0S
            java.util.Set r14 = r6.A0U
            X.0vl r0 = r6.A0W
            java.lang.Object r11 = X.AnonymousClass3MX.A14(r0)
            X.1pZ r11 = (X.C37451pZ) r11
            X.1K2 r2 = r1.A00
            X.1K1 r1 = r2.A00
            X.00S r0 = r1.A34
            java.lang.Object r7 = r0.get()
            X.9V3 r7 = (X.AnonymousClass9V3) r7
            X.00S r0 = r1.A3F
            java.lang.Object r8 = r0.get()
            X.9VC r8 = (X.AnonymousClass9VC) r8
            X.10E r1 = r2.A01
            X.1VW r10 = X.AnonymousClass3MZ.A0e(r1)
            X.10G r0 = r1.A00
            X.3Kk r9 = X.AnonymousClass3MZ.A0T(r0)
            X.0ve r12 = X.AnonymousClass10E.A8r(r1)
            X.8DA r5 = new X.8DA
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        L_0x0145:
            java.lang.String r0 = "blockListAdapterFactory"
            goto L_0x0433
        L_0x0149:
            java.lang.Object r0 = r15.A01
            X.9nK r0 = (X.C191869nK) r0
            X.9pQ r0 = r0.A00
            if (r0 == 0) goto L_0x0162
            X.77S r1 = r0.A00
            java.lang.String r0 = "XFAM_NTA"
            java.lang.Object r0 = r1.A00(r0)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x0162
            java.lang.Object r2 = r0.first
            if (r2 == 0) goto L_0x0162
            goto L_0x01bb
        L_0x0162:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0167:
            java.lang.Object r0 = r15.A01
            X.9nK r0 = (X.C191869nK) r0
            X.9pQ r0 = r0.A00
            if (r0 == 0) goto L_0x0180
            X.77S r1 = r0.A00
            java.lang.String r0 = "XFAM_NTA"
            java.lang.Object r0 = r1.A00(r0)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x0180
            java.lang.Object r2 = r0.first
            if (r2 == 0) goto L_0x0180
            goto L_0x01bb
        L_0x0180:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0185:
            java.lang.Object r0 = r15.A01
            X.9nK r0 = (X.C191869nK) r0
            X.9pQ r0 = r0.A00
            if (r0 == 0) goto L_0x019e
            X.77S r1 = r0.A00
            java.lang.String r0 = "XFAM_NTA"
            java.lang.Object r0 = r1.A00(r0)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x019e
            java.lang.Object r5 = r0.second
            if (r5 == 0) goto L_0x019e
            return r5
        L_0x019e:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x01a3:
            java.lang.Object r0 = r15.A01
            X.9nK r0 = (X.C191869nK) r0
            X.9pQ r0 = r0.A00
            if (r0 == 0) goto L_0x01ca
            X.77S r1 = r0.A00
            java.lang.String r0 = "XFAM_NTA"
            java.lang.Object r0 = r1.A00(r0)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r2 = r0.first
            if (r2 == 0) goto L_0x01ca
        L_0x01bb:
            X.Bzv r0 = X.C24360Bzv.FACEBOOK
            if (r2 == r0) goto L_0x01c4
            X.Bzv r1 = X.C24360Bzv.FACEBOOK_DEBUG
            r0 = 1
            if (r2 != r1) goto L_0x01c5
        L_0x01c4:
            r0 = 0
        L_0x01c5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x01ca:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x01cf:
            java.lang.Object r0 = r15.A01
            X.9nK r0 = (X.C191869nK) r0
            X.9pQ r0 = r0.A00
            if (r0 == 0) goto L_0x01e8
            X.77S r1 = r0.A00
            java.lang.String r0 = "XFAM_NTA"
            java.lang.Object r0 = r1.A00(r0)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x01e8
            java.lang.Object r5 = r0.second
            if (r5 == 0) goto L_0x01e8
            return r5
        L_0x01e8:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x01ed:
            java.lang.Object r0 = r15.A01
            X.BAc r0 = (X.C22495BAc) r0
            r0.Byj()
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x01f7:
            java.lang.Object r2 = r15.A01
            X.AP5 r2 = (X.AP5) r2
            X.9hx r1 = r2.A09
            r0 = 12
            r1.A03 = r0
            r2.A0B()
            r5 = 0
            return r5
        L_0x0206:
            java.lang.Object r2 = r15.A01
            X.AP6 r2 = (X.AP6) r2
            X.9hD r1 = r2.A06
            r0 = 10
            r1.A02 = r0
            r2.A0A()
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0216:
            java.lang.Object r0 = r15.A01
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r0 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r0
            r0.Bo8()
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0220:
            java.lang.Object r2 = r15.A01
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r2 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r2
            com.whatsapp.jid.UserJid r1 = r2.A27()
            X.B7A r0 = r2.A02
            if (r0 == 0) goto L_0x0231
            X.1J2 r5 = X.AHF.A00(r2, r0, r1)
            return r5
        L_0x0231:
            java.lang.String r0 = "cartMenuViewModelFactory"
            goto L_0x0433
        L_0x0235:
            java.lang.Object r0 = r15.A01
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r0 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r0
            X.B6z r1 = r0.A01
            if (r1 == 0) goto L_0x0246
            com.whatsapp.jid.UserJid r0 = r0.A27()
            X.9p3 r5 = r1.BGF(r0)
            return r5
        L_0x0246:
            java.lang.String r0 = "activeCartRepositoryFactory"
            goto L_0x0433
        L_0x024a:
            java.lang.Object r2 = r15.A01
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r2 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r2
            X.0vl r0 = r2.A0M
            java.lang.Object r1 = r0.getValue()
            X.9p3 r1 = (X.C192829p3) r1
            X.AH0 r0 = new X.AH0
            r0.<init>(r1)
            X.1It r1 = X.AnonymousClass8BR.A0C(r0, r2)
            java.lang.Class<X.8FU> r0 = X.AnonymousClass8FU.class
            X.1J2 r5 = r1.A00(r0)
            return r5
        L_0x0266:
            java.lang.Object r5 = r15.A01
            com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment r5 = (com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment) r5
            X.1FL r0 = r5.A1D()
            android.app.Application r4 = r0.getApplication()
            X.C18070vi.A0X(r4)
            X.00H r0 = r5.A0C
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            com.whatsapp.biz.catalog.manager.CatalogManager r3 = (com.whatsapp.biz.catalog.manager.CatalogManager) r3
            X.00H r0 = r5.A0D
            if (r0 == 0) goto L_0x02a1
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.9lj r2 = (X.C190919lj) r2
            X.0wl r1 = r5.A0H
            if (r1 == 0) goto L_0x029d
            X.AH7 r0 = new X.AH7
            r0.<init>(r4, r2, r3, r1)
            X.1It r1 = X.AnonymousClass8BR.A0C(r0, r5)
            java.lang.Class<X.8Ey> r0 = X.AnonymousClass8Ey.class
            X.1J2 r5 = r1.A00(r0)
            return r5
        L_0x029d:
            java.lang.String r0 = "ioDispatcher"
            goto L_0x0433
        L_0x02a1:
            java.lang.String r0 = "categoriesLogger"
            goto L_0x0433
        L_0x02a5:
            java.lang.String r0 = "catalogManager"
            goto L_0x0433
        L_0x02a9:
            java.lang.Object r0 = r15.A01
            X.APB r0 = (X.APB) r0
            X.APP r0 = r0.A06
            X.9uP r0 = r0.A02
            r0.A02()
            r5 = 0
            return r5
        L_0x02b6:
            java.lang.Object r0 = r15.A01
            X.APB r0 = (X.APB) r0
            X.APP r0 = r0.A06
            r0.A00()
            r5 = 0
            return r5
        L_0x02c1:
            java.lang.Object r2 = r15.A01
            X.AQn r2 = (X.C20577AQn) r2
            long r0 = X.C20577AQn.A05
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.0z4 r6 = r2.A01
            java.lang.String r5 = "privacy_token_batch_offset_sec"
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r6)     // Catch:{ ClassCastException -> 0x02d8 }
            long r0 = X.C17890vO.A04(r0, r5)     // Catch:{ ClassCastException -> 0x02d8 }
            goto L_0x02ef
        L_0x02d8:
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r6)
            int r0 = X.AnonymousClass8BT.A01(r0, r5)
            long r0 = (long) r0
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r6)
            X.C17880vN.A1B(r2, r5)
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r6)
            X.C17880vN.A1D(r2, r5, r0)
        L_0x02ef:
            X.9Io r7 = X.C179589Io.SECONDS
            long r3 = X.C196999vz.A01(r7, r0)
            r0 = 0
            int r0 = X.C21348Aid.A02(r3, r0)
            if (r0 < 0) goto L_0x0305
            long r0 = X.C20577AQn.A05
            int r0 = X.C21348Aid.A02(r3, r0)
            if (r0 < 0) goto L_0x0324
        L_0x0305:
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            long r0 = X.C20577AQn.A05
            long r1 = X.C21348Aid.A06(r7, r0)
            int r0 = (int) r1
            int r0 = r3.nextInt(r0)
            long r3 = X.C196999vz.A00(r7, r0)
            long r1 = X.C21348Aid.A06(r7, r3)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r6)
            X.C17880vN.A1D(r0, r5, r1)
        L_0x0324:
            X.Aid r5 = new X.Aid
            r5.<init>(r3)
            return r5
        L_0x032a:
            java.lang.Object r1 = r15.A01
            X.9ox r1 = (X.C192769ox) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A03
            java.lang.Object r5 = r0.get()
            return r5
        L_0x0339:
            java.lang.Object r1 = r15.A01
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler r1 = (com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.A05()
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0347:
            java.lang.Object r1 = r15.A01
            X.9et r1 = (X.C186869et) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A01
            java.lang.Object r1 = r0.get()
            X.0vc r1 = (X.C18010vc) r1
            java.lang.String r0 = "ohai_key_config"
            android.content.SharedPreferences r5 = r1.A05(r0)
            return r5
        L_0x035e:
            java.lang.Object r0 = r15.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.C72453Mb.A14(r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0368:
            java.lang.Object r0 = r15.A01
            X.AnonymousClass3MW.A1U(r0)
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0370:
            java.lang.Object r2 = r15.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            X.1KB r1 = r2.A05
            r0 = 13
            X.C21426Ajt.A00(r1, r2, r0)
            r5 = 0
            return r5
        L_0x037d:
            java.lang.Object r2 = r15.A01
            X.9ov r2 = (X.C192749ov) r2
            X.10I r6 = r2.A04
            X.1KB r3 = r2.A00
            X.181 r4 = r2.A01
            X.1D9 r5 = r2.A03
            X.118 r0 = r2.A02
            java.io.File r1 = X.C108945cZ.A16(r0)
            boolean r0 = r2 instanceof X.AnonymousClass93W
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = "payment_merchant_image_cache"
        L_0x0395:
            java.io.File r7 = X.C17880vN.A0e(r1, r0)
            java.lang.String r8 = "payments-image"
            X.4Ra r2 = new X.4Ra
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 16777216(0x1000000, double:8.289046E-317)
            r2.A01 = r0
            r0 = 1
            r2.A05 = r0
            X.4VT r5 = r2.A00()
            return r5
        L_0x03ad:
            java.lang.String r0 = "brazilpay_image_cache"
            goto L_0x0395
        L_0x03b0:
            java.lang.Object r0 = r15.A01
            X.ALg r0 = (X.C20443ALg) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            X.10I r0 = r0.A01
            X.10s r5 = new X.10s
            r5.<init>(r0, r1)
            return r5
        L_0x03c0:
            java.lang.Object r0 = r15.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            android.view.View r1 = r0.A00
            r0 = 2131435462(0x7f0b1fc6, float:1.8492767E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r1, r0)
            return r5
        L_0x03ce:
            java.lang.Object r0 = r15.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            android.view.View r1 = r0.A00
            r0 = 2131433924(0x7f0b19c4, float:1.8489647E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r1, r0)
            return r5
        L_0x03dc:
            java.lang.Object r0 = r15.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            android.view.View r1 = r0.A00
            r0 = 2131433925(0x7f0b19c5, float:1.848965E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r1, r0)
            return r5
        L_0x03ea:
            java.lang.Object r0 = r15.A01
            com.whatsapp.polls.creator.PollCreatorActivity r0 = (com.whatsapp.polls.creator.PollCreatorActivity) r0
            X.9V6 r3 = r0.A02
            if (r3 == 0) goto L_0x040a
            X.9V5 r2 = r0.A01
            if (r2 == 0) goto L_0x0407
            X.8HI r1 = new X.8HI
            r1.<init>()
            X.0vl r0 = r0.A0E
            com.whatsapp.polls.creator.PollCreatorViewModel r0 = X.AnonymousClass8BR.A0d(r0)
            X.8HU r5 = new X.8HU
            r5.<init>(r1, r2, r3, r0)
            return r5
        L_0x0407:
            java.lang.String r0 = "pollCreatorOptionViewHolderFactory"
            goto L_0x0433
        L_0x040a:
            java.lang.String r0 = "pollCreatorTitleHolderFactory"
            goto L_0x0433
        L_0x040d:
            java.lang.Object r4 = r15.A01
            com.whatsapp.biz.product.view.fragment.ProductBottomSheet r4 = (com.whatsapp.biz.product.view.fragment.ProductBottomSheet) r4
            X.00H r0 = r4.A0E
            if (r0 == 0) goto L_0x045d
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.11S r3 = (X.AnonymousClass11S) r3
            X.0vl r0 = r4.A0K
            java.lang.Object r2 = r0.getValue()
            X.AEW r2 = (X.AEW) r2
            X.00H r0 = r4.A0D
            if (r0 == 0) goto L_0x045a
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.A7x r1 = (X.C20114A7x) r1
            com.whatsapp.jid.UserJid r0 = r4.A08
            if (r0 != 0) goto L_0x0438
            java.lang.String r0 = "productOwnerJid"
        L_0x0433:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0438:
            boolean r0 = X.AnonymousClass9PM.A00(r3, r1, r2, r0)
            if (r0 == 0) goto L_0x0451
            X.00H r0 = r4.A0B
            if (r0 == 0) goto L_0x0457
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 8798(0x225e, float:1.2329E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0452
        L_0x0451:
            r0 = 0
        L_0x0452:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0457:
            java.lang.String r0 = "abprops"
            goto L_0x0433
        L_0x045a:
            java.lang.String r0 = "catalogCacheManager"
            goto L_0x0433
        L_0x045d:
            java.lang.String r0 = "meManager"
            goto L_0x0433
        L_0x0460:
            java.lang.Object r0 = r15.A01
            X.01C r0 = (X.AnonymousClass01C) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.polls.creator.PollCreatorViewModel> r0 = com.whatsapp.polls.creator.PollCreatorViewModel.class
            X.1J2 r5 = r1.A00(r0)
            return r5
        L_0x046f:
            java.lang.Object r1 = r15.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "vibrator"
            java.lang.Object r5 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.os.Vibrator"
            X.C18070vi.A0z(r5, r0)
            return r5
        L_0x047f:
            java.lang.Object r0 = r15.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = X.C72453Mb.A0u(r0)
            X.1BI r5 = r1.A02(r0)
            return r5
        L_0x048e:
            java.lang.Object r1 = r15.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "input_method"
            java.lang.Object r5 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            X.C18070vi.A0z(r5, r0)
            return r5
        L_0x049e:
            java.lang.Object r0 = r15.A01
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r0 = "quoted_message_row_id"
            long r0 = X.C108975cc.A06(r1, r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x04b1:
            java.lang.Object r0 = r15.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.0ve r0 = r0.A0E
            X.C18070vi.A0W(r0)
            boolean r0 = X.C87544Vz.A00(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x04c3:
            java.lang.Object r1 = r15.A01
            com.whatsapp.polls.creator.PollCreatorViewModel r1 = (com.whatsapp.polls.creator.PollCreatorViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0ve r1 = r1.A08
            r0 = 12363(0x304b, float:1.7324E-41)
            java.lang.Boolean r5 = X.AnonymousClass3MZ.A15(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21528Alb.invoke():java.lang.Object");
    }
}
