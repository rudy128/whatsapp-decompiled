package com.whatsapp.biz.catalog.manager;

import X.A0W;
import X.A5Q;
import X.A76;
import X.A7K;
import X.A8Q;
import X.AIj;
import X.AO6;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass10T;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass1OZ;
import X.AnonymousClass1PY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4S5;
import X.AnonymousClass7RF;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass9O1;
import X.AnonymousClass9QG;
import X.B0S;
import X.C108975cc;
import X.C138476x9;
import X.C162478Kx;
import X.C167828hq;
import X.C168498iz;
import X.C168608jI;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C182899Wd;
import X.C183879Zy;
import X.C185579co;
import X.C18600wl;
import X.C186449eD;
import X.C186499eI;
import X.C187669gB;
import X.C188869i8;
import X.C192559ob;
import X.C193429q5;
import X.C193509qD;
import X.C195129sq;
import X.C196209ud;
import X.C198639yf;
import X.C199279zj;
import X.C19949A0g;
import X.C19993A2g;
import X.C20004A2u;
import X.C20009A2z;
import X.C20114A7x;
import X.C20483AMu;
import X.C20498ANj;
import X.C20729AWk;
import X.C22279B1h;
import X.C22280B1i;
import X.C22286B1o;
import X.C22362B4q;
import X.C26911Ty;
import X.C27621Wu;
import X.C30391dr;
import X.C31751g4;
import X.C72453Mb;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.catalog.WhatsappCatalogReportProductResponseImpl;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

public final class CatalogManager {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A05 = AnonymousClass3MW.A0M(false);
    public final C20498ANj A06 = new C20498ANj(this);
    public final AnonymousClass00H A07;
    public final List A08 = AnonymousClass000.A13();
    public final List A09 = AnonymousClass000.A13();
    public final Map A0A = C17880vN.A11();
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;
    public final C18100vl A0R;
    public final C18100vl A0S;
    public final C18100vl A0T;
    public final C18600wl A0U;
    public final C182899Wd A0V = new C182899Wd(this);
    public final AO6 A0W = new AO6(this);
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final AnonymousClass00H A0Z;
    public final C18100vl A0a;

    private final void A03(UserJid userJid, int i, int i2, boolean z) {
        ((C192559ob) this.A0J.getValue()).A01(userJid, AnonymousClass9QG.A00(), new C22280B1i(this, userJid, i2, i, z));
    }

    public final Object A08(UserJid userJid, String str, C30391dr r11, int i, boolean z) {
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid, 0);
        int A032 = C72453Mb.A03(A05(this, userJid) ? 1 : 0) * 9;
        String str2 = str;
        int i2 = i;
        if (C18070vi.A18(str, "catalog_products_all_items_collection_id")) {
            A03(userJid, i, A032, true);
        } else {
            boolean z2 = z;
            if (A0H(userJid, z)) {
                Object A062 = A06(userJid2, str2, r11, i2, A032, z2);
                if (A062 == C31751g4.COROUTINE_SUSPENDED) {
                    return A062;
                }
            } else {
                A04(userJid, str, i, A032, z);
            }
        }
        return C27621Wu.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, (X.C18020vd) r11.A0B.getValue(), 1096) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, (X.C18020vd) r11.A0B.getValue(), 7321) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        com.whatsapp.util.Log.i("CatalogManager requestBusinessProductCatalogPage via GraphQL M1");
        ((X.A5Q) r3.getValue()).A05(r11.A06, r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.BAJ r12, X.C188519hY r13) {
        /*
            r11 = this;
            r7 = r13
            com.whatsapp.jid.UserJid r4 = r13.A08
            X.0vl r3 = r11.A0P
            boolean r0 = X.A5Q.A01(r4, r3)
            if (r0 != 0) goto L_0x001d
            X.0vl r0 = r11.A0B
            java.lang.Object r2 = r0.getValue()
            X.0vd r2 = (X.C18020vd) r2
            r1 = 1096(0x448, float:1.536E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0035
        L_0x001d:
            boolean r0 = X.A5Q.A01(r4, r3)
            if (r0 == 0) goto L_0x004b
            X.0vl r0 = r11.A0B
            java.lang.Object r2 = r0.getValue()
            X.0vd r2 = (X.C18020vd) r2
            r1 = 7321(0x1c99, float:1.0259E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004b
        L_0x0035:
            java.lang.String r0 = "CatalogManager requestBusinessProductCatalogPage via GraphQL M1"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r3.getValue()
            X.A5Q r1 = (X.A5Q) r1
            X.ANj r0 = r11.A06
            r1.A05(r0, r13)
        L_0x0045:
            java.util.Map r0 = r11.A0A
            r0.put(r13, r12)
            return
        L_0x004b:
            X.0vl r0 = r11.A0C
            java.lang.Object r1 = r0.getValue()
            X.9eD r1 = (X.C186449eD) r1
            X.ANj r4 = r11.A06
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.9Ve r0 = r1.A02
            X.10F r0 = r0.A00
            X.10E r1 = r0.A00
            X.190 r2 = X.AnonymousClass3MY.A0N(r1)
            X.A2u r10 = X.AnonymousClass8BT.A0W(r1)
            X.1OZ r9 = X.AnonymousClass8BU.A0K(r1)
            X.00S r0 = r1.A1x
            java.lang.Object r5 = r0.get()
            X.A6T r5 = (X.A6T) r5
            X.11E r6 = X.AnonymousClass3MZ.A0d(r1)
            X.1Ty r3 = X.AnonymousClass8BT.A0D(r1)
            X.00S r0 = r1.A4W
            java.lang.Object r8 = r0.get()
            X.A0g r8 = (X.C19949A0g) r8
            X.8hw r1 = new X.8hw
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r1.A07()
            if (r0 != 0) goto L_0x0045
            r0 = -1
            r12.BuM(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.manager.CatalogManager.A09(X.BAJ, X.9hY):void");
    }

    public final void A0B(C187669gB r4, boolean z) {
        C18070vi.A0d(r4, 0);
        C18100vl r2 = this.A0D;
        ((C20004A2u) r2.getValue()).A02("report_product_tag");
        this.A0V.A00.A0C(r4, z);
        ((C20004A2u) r2.getValue()).A06("report_product_tag", z);
    }

    public final void A0D(UserJid userJid, int i) {
        C18070vi.A0d(userJid, 0);
        int i2 = 1;
        if (A05(this, userJid)) {
            i2 = 4;
        }
        int i3 = i2 * 6;
        A00(this).A0K(userJid, i3);
        if (A00(this).A0P(userJid)) {
            Log.i("CatalogManager requestCatalogProductsFromBeginning-> returning cached catalog products");
            ((AnonymousClass10T) this.A0H.getValue()).notifyAllObservers(new C20729AWk(userJid, 0, true, true));
            i3 *= 2;
        }
        Log.i("CatalogManager requestCatalogProductsFromBeginning-> requestCatalogProducts");
        C20114A7x A002 = A00(this);
        synchronized (A002) {
            AnonymousClass11P.A01(A002.A00);
        }
        A03(userJid, i, i3, false);
    }

    public final void A0E(UserJid userJid, int i) {
        int i2 = 1;
        if (A05(this, userJid)) {
            i2 = 4;
        }
        A03(userJid, i, i2 * 6, false);
    }

    public final boolean A0F(C187669gB r16) {
        C18100vl r4 = this.A0D;
        ((C20004A2u) r4.getValue()).A01(774782053, "report_product_tag", "CatalogManager");
        C18100vl r7 = this.A0B;
        C187669gB r8 = r16;
        if (C18020vd.A05(C18040vf.A02, (C18020vd) r7.getValue(), 7325)) {
            ((C20004A2u) r4.getValue()).A03("report_product_tag");
            if (AnonymousClass8BS.A1N(((C19949A0g) this.A0M.getValue()).A00)) {
                Log.e("reportProduct/onError/451");
                A0B(r8, false);
                return false;
            }
            UserJid userJid = r8.A02;
            String A022 = ((C20009A2z) this.A0X.get()).A02(((AnonymousClass4S5) this.A0Z.get()).A00(userJid));
            A7K A002 = A7K.A00();
            C162478Kx A003 = C162478Kx.A00(GraphQlCallInput.A02, A022, "direct_connection_encrypted_info");
            C162478Kx.A01(A003, r8.A03, "product_id");
            A76 a76 = C20114A7x.A08;
            C18030ve r1 = (C18030ve) r7.getValue();
            C18070vi.A0X(r1);
            UserJid A012 = A76.A01(a76, r1, userJid, this.A0Y);
            C18070vi.A0d(A012, 0);
            String rawString = A012.getRawString();
            C18070vi.A0d(rawString, 0);
            C162478Kx.A01(A003, rawString, "jid");
            C162478Kx.A01(A003, r8.A04, "reason");
            C162478Kx.A01(A003, r8.A05, "catalog_session_id");
            C108975cc.A0z(A003, A002, "request");
            C19993A2g A013 = ((AnonymousClass1PY) this.A0O.getValue()).A01(AIj.A00(A002, WhatsappCatalogReportProductResponseImpl.class, "WhatsappCatalogReportProduct"));
            A013.A01 = true;
            A013.A04(new B0S(this, r8));
            return true;
        }
        C182899Wd r72 = this.A0V;
        C18070vi.A0d(r72, 1);
        AnonymousClass10E r12 = ((C186449eD) this.A0C.getValue()).A03.A00.A00;
        C20004A2u A0W2 = AnonymousClass8BT.A0W(r12);
        AnonymousClass1OZ A0K2 = AnonymousClass8BU.A0K(r12);
        return new C167828hq(AnonymousClass8BT.A0D(r12), r72, r8, AnonymousClass10E.A8r(r12), (C19949A0g) r12.A4W.get(), A0K2, A0W2, (AnonymousClass4S5) r12.ABW.get(), AnonymousClass10E.AL1(r12)).A03();
    }

    public static final C20114A7x A00(CatalogManager catalogManager) {
        return (C20114A7x) catalogManager.A0a.getValue();
    }

    public static final void A01(CatalogManager catalogManager, UserJid userJid) {
        if (!catalogManager.A00) {
            catalogManager.A00 = true;
            ((C26911Ty) catalogManager.A0E.getValue()).A0F(new C20483AMu(catalogManager, 0), userJid, (String) null);
        }
    }

    public static final void A02(CatalogManager catalogManager, UserJid userJid, int i, int i2, boolean z) {
        Log.i("CatalogManager requestCatalogCollections");
        ((C192559ob) catalogManager.A0J.getValue()).A01(userJid, AnonymousClass9QG.A00(), new C22279B1h(catalogManager, userJid, i, i2, z));
    }

    private final void A04(UserJid userJid, String str, int i, int i2, boolean z) {
        String str2;
        Log.i("CatalogManager requestCollectionProductList");
        UserJid userJid2 = userJid;
        String str3 = str;
        C193429q5 A072 = A00(this).A07(userJid, str);
        if (A072 != null) {
            str2 = A072.A00;
        } else {
            str2 = null;
        }
        C193429q5 A073 = A00(this).A07(userJid, str);
        if (A073 == null || A073.A01) {
            AnonymousClass1DT r2 = this.A05;
            Object A062 = r2.A06();
            Boolean A0i = AnonymousClass000.A0i();
            if (!C18070vi.A18(A062, A0i)) {
                r2.A0E(A0i);
                ((C192559ob) this.A0J.getValue()).A01(userJid, AnonymousClass9QG.A00(), new C22286B1o(this, userJid2, str3, str2, i2, i, z));
                return;
            }
        }
        Log.i("CatalogManager requestCollectionProductList can't fetch collection product list");
    }

    public static boolean A05(CatalogManager catalogManager, AnonymousClass1BI r1) {
        return ((AnonymousClass11S) catalogManager.A0Q.getValue()).A0O(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0154 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(com.whatsapp.jid.UserJid r18, java.lang.String r19, X.C30391dr r20, int r21, int r22, boolean r23) {
        /*
            r17 = this;
            r3 = r20
            r13 = r21
            r12 = r22
            r15 = r23
            r8 = r18
            r9 = r19
            boolean r0 = r3 instanceof X.C21712Aof
            r5 = r17
            if (r0 == 0) goto L_0x0155
            r4 = r3
            X.Aof r4 = (X.C21712Aof) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0155
            int r2 = r2 - r1
            r4.label = r2
        L_0x0020:
            java.lang.Object r7 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 2
            r2 = 1
            if (r1 == 0) goto L_0x00b8
            if (r1 == r2) goto L_0x010e
            if (r1 != r0) goto L_0x015c
            java.lang.Object r11 = r4.L$3
            java.lang.Object r9 = r4.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r4.L$1
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r5 = r4.L$0
            com.whatsapp.biz.catalog.manager.CatalogManager r5 = (com.whatsapp.biz.catalog.manager.CatalogManager) r5
            X.C30691eM.A01(r7)
        L_0x003f:
            X.9M2 r7 = (X.AnonymousClass9M2) r7
            boolean r0 = r7 instanceof X.C168418ip
            r3 = 0
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "CatalogManager awaitCollectionProductList,onFetchCollectionProductListSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1DT r0 = r5.A05
            X.AnonymousClass3MY.A1M(r0, r3)
            X.8ip r7 = (X.C168418ip) r7
            java.lang.Object r0 = r7.A00
            X.9tk r0 = (X.C195689tk) r0
            java.lang.String r0 = r0.A05
            if (r0 != 0) goto L_0x005b
            r2 = 0
        L_0x005b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CatalogManager awaitCollectionProductList,onFetchCollectionProductListSuccess, saving collection to cache. isAppend:"
            X.C17900vP.A0n(r0, r1, r2)
            X.A7x r1 = A00(r5)
            java.lang.Object r0 = r7.A01
            X.AN4 r0 = (X.AN4) r0
            r1.A0G(r0, r8, r2)
            X.1DT r4 = r5.A03
            X.9sq r0 = r0.A02
            java.lang.String r2 = r0.A03
            boolean r1 = X.AnonymousClass000.A1X(r11)
            X.8jI r0 = new X.8jI
            r0.<init>(r8, r2, r3, r1)
            r4.A0E(r0)
        L_0x0081:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0084:
            boolean r0 = r7 instanceof X.C168408io
            if (r0 == 0) goto L_0x0081
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CatalogManager awaitCollectionProductList,onFetchCollectionProductListFailure errorCode ="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ".errorCode"
            X.C17890vO.A19(r1, r0)
            X.1DT r0 = r5.A05
            X.AnonymousClass3MY.A1M(r0, r3)
            X.8io r7 = (X.C168408io) r7
            int r3 = r7.A00
            r0 = 404(0x194, float:5.66E-43)
            if (r3 != r0) goto L_0x00ad
            X.A7x r0 = A00(r5)
            r0.A0L(r8, r2)
        L_0x00ad:
            X.1DT r1 = r5.A03
            X.8jH r0 = new X.8jH
            r0.<init>(r8, r3, r9)
            r1.A0E(r0)
            goto L_0x0081
        L_0x00b8:
            X.C30691eM.A01(r7)
            X.A7x r0 = A00(r5)
            X.9q5 r0 = r0.A07(r8, r9)
            if (r0 == 0) goto L_0x00d6
            java.lang.String r11 = r0.A00
        L_0x00c7:
            X.A7x r0 = A00(r5)
            X.9q5 r0 = r0.A07(r8, r9)
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x00d8
            goto L_0x0081
        L_0x00d6:
            r11 = 0
            goto L_0x00c7
        L_0x00d8:
            X.1DT r6 = r5.A05
            java.lang.Object r0 = r6.A06()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 != 0) goto L_0x0081
            r6.A0E(r1)
            java.util.Set r7 = X.AnonymousClass9QG.A00()
            r4.L$0 = r5
            r4.L$1 = r8
            r4.L$2 = r9
            r4.L$3 = r11
            r4.I$0 = r13
            r4.I$1 = r12
            r4.Z$0 = r15
            r4.label = r2
            X.0wl r6 = r5.A0U
            r1 = 0
            com.whatsapp.biz.catalog.manager.CatalogManager$awaitCatalogVariantsRequestData$2 r0 = new com.whatsapp.biz.catalog.manager.CatalogManager$awaitCatalogVariantsRequestData$2
            r0.<init>(r5, r8, r7, r1)
            java.lang.Object r7 = X.C30451dy.A00(r4, r6, r0)
            if (r7 != r3) goto L_0x0127
            return r3
        L_0x010e:
            boolean r15 = r4.Z$0
            int r12 = r4.I$1
            int r13 = r4.I$0
            java.lang.Object r11 = r4.L$3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r9 = r4.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r4.L$1
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r5 = r4.L$0
            com.whatsapp.biz.catalog.manager.CatalogManager r5 = (com.whatsapp.biz.catalog.manager.CatalogManager) r5
            X.C30691eM.A01(r7)
        L_0x0127:
            X.9rb r7 = (X.C194359rb) r7
            X.0vl r0 = r5.A0P
            java.lang.Object r1 = r0.getValue()
            X.A5Q r1 = (X.A5Q) r1
            X.0vl r0 = r5.A0G
            java.lang.Object r0 = r0.getValue()
            X.A8Q r0 = (X.A8Q) r0
            java.lang.String r10 = r0.A03
            r16 = 0
            X.9tk r6 = new X.9tk
            r14 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.L$0 = r5
            r4.L$1 = r8
            r4.L$2 = r9
            r4.L$3 = r11
            r0 = 2
            r4.label = r0
            java.lang.Object r7 = r1.A02(r6, r4)
            if (r7 != r3) goto L_0x003f
            return r3
        L_0x0155:
            X.Aof r4 = new X.Aof
            r4.<init>(r5, r3)
            goto L_0x0020
        L_0x015c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.manager.CatalogManager.A06(com.whatsapp.jid.UserJid, java.lang.String, X.1dr, int, int, boolean):java.lang.Object");
    }

    public final Object A07(UserJid userJid, String str, C30391dr r16, int i, boolean z) {
        AnonymousClass9O1 r2;
        String str2 = str;
        boolean A18 = C18070vi.A18(str, "catalog_products_all_items_collection_id");
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid, 0);
        int A032 = C72453Mb.A03(A05(this, userJid) ? 1 : 0) * 9;
        int i2 = i;
        if (A18) {
            A00(this).A0K(userJid, A032);
            if (A00(this).A0P(userJid)) {
                Log.i("CatalogManager requestCollectionProductListFromBeginning, return cache results first");
                this.A03.A0E(new C168608jI(userJid, str, true, true));
                A032 *= 2;
            }
            Log.i("CatalogManager requestCollectionProductListFromBeginning, allItems requestCatalogProducts");
            A03(userJid, i2, A032, true);
        } else {
            C20114A7x A002 = A00(this);
            C108975cc.A12(userJid, str, 1);
            synchronized (A002) {
                C198639yf A003 = A76.A00(A002, userJid);
                if (!(A003 == null || (r2 = (AnonymousClass9O1) A003.A07.get(str)) == null)) {
                    r2.A00 = new C193429q5(true, (String) null);
                    List list = r2.A01.A04;
                    int size = list.size();
                    if (size > A032) {
                        for (int i3 = A032; i3 < size; i3++) {
                            list.remove(AnonymousClass3MX.A01(list));
                        }
                    }
                }
            }
            C195129sq A082 = A00(this).A08(userJid, str);
            if (A082 != null && AnonymousClass000.A1a(A082.A04)) {
                Log.i("CatalogManager requestCollectionProductListFromBeginning, notAllItems return cache results first");
                this.A03.A0E(new C168608jI(userJid, A082.A03, true, true));
                A032 *= 2;
            }
            boolean z2 = z;
            if (A0H(userJid, z2)) {
                Log.i("CatalogManager requestCollectionProductListFromBeginning, awaitCollectionProductList using coroutines");
                Object A062 = A06(userJid2, str2, r16, i2, A032, z2);
                if (A062 == C31751g4.COROUTINE_SUSPENDED) {
                    return A062;
                }
            } else {
                Log.i("CatalogManager requestCollectionProductListFromBeginning, requestCollectionProductList");
                A04(userJid, str, i2, A032, z2);
            }
        }
        return C27621Wu.A00;
    }

    public final void A0A(C22362B4q b4q, UserJid userJid) {
        A5Q a5q = (A5Q) this.A0P.getValue();
        C193509qD r4 = new C193509qD(userJid, ((A8Q) this.A0G.getValue()).A03);
        C183879Zy r3 = new C183879Zy(b4q, this);
        C188869i8 r2 = (C188869i8) a5q.A02.get();
        AnonymousClass10I r13 = r2.A0H;
        C185579co r5 = r2.A07;
        C186499eI r7 = new C186499eI(r5, (A0W) C18070vi.A0E(r2.A0P));
        C138476x9 r11 = r2.A0G;
        A5Q.A00(new C168498iz(r3, r4, r5, (A0W) C18070vi.A0E(r2.A0M), r7, (C196209ud) C18070vi.A0E(r2.A0N), r2.A08, (C199279zj) AnonymousClass8BS.A0a(r2.A0S), r11, (AnonymousClass4S5) C18070vi.A0E(r2.A0R), r13), a5q);
    }

    public final void A0C(C187669gB r4, boolean z) {
        ((AnonymousClass1KB) this.A0N.getValue()).A0J(new AnonymousClass7RF(this, r4, 9, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, (X.C18020vd) r11.A0B.getValue(), 1096) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        return ((X.A5Q) r3.getValue()).A07(r11.A0W, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, (X.C18020vd) r11.A0B.getValue(), 7324) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0G(X.C195469tO r12) {
        /*
            r11 = this;
            X.0vl r3 = r11.A0P
            java.lang.Object r0 = r3.getValue()
            X.A5Q r0 = (X.A5Q) r0
            r7 = r12
            com.whatsapp.jid.UserJid r4 = r12.A01
            X.11S r0 = r0.A00
            boolean r0 = r0.A0O(r4)
            if (r0 != 0) goto L_0x0032
            X.0vl r0 = r11.A0B
            java.lang.Object r2 = r0.getValue()
            X.0vd r2 = (X.C18020vd) r2
            r1 = 1096(0x448, float:1.536E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0032
        L_0x0025:
            java.lang.Object r1 = r3.getValue()
            X.A5Q r1 = (X.A5Q) r1
            X.AO6 r0 = r11.A0W
            boolean r0 = r1.A07(r0, r12)
            return r0
        L_0x0032:
            boolean r0 = X.A5Q.A01(r4, r3)
            if (r0 == 0) goto L_0x004b
            X.0vl r0 = r11.A0B
            java.lang.Object r2 = r0.getValue()
            X.0vd r2 = (X.C18020vd) r2
            r1 = 7324(0x1c9c, float:1.0263E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004b
            goto L_0x0025
        L_0x004b:
            X.0vl r0 = r11.A0C
            java.lang.Object r1 = r0.getValue()
            X.9eD r1 = (X.C186449eD) r1
            X.AO6 r4 = r11.A0W
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.9Vc r0 = r1.A00
            X.10F r0 = r0.A00
            X.10E r1 = r0.A00
            X.1OZ r9 = X.AnonymousClass8BU.A0K(r1)
            X.A2u r10 = X.AnonymousClass8BT.A0W(r1)
            X.A7x r3 = X.AnonymousClass8BU.A0C(r1)
            X.1Ty r2 = X.AnonymousClass8BT.A0D(r1)
            X.00S r0 = r1.A1x
            java.lang.Object r5 = r0.get()
            X.A6T r5 = (X.A6T) r5
            X.11E r6 = X.AnonymousClass3MZ.A0d(r1)
            X.00S r0 = r1.A4W
            java.lang.Object r8 = r0.get()
            X.A0g r8 = (X.C19949A0g) r8
            X.8hs r1 = new X.8hs
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.11E r0 = r1.A01
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x009a
            X.BAQ r2 = r1.A00
            X.9tO r1 = r1.A02
            r0 = -1
            r2.Bu8(r1, r0)
            r0 = 0
            return r0
        L_0x009a:
            X.1Ty r0 = r1.A01
            X.C20997Acp.A01(r0, r1)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.manager.CatalogManager.A0G(X.9tO):boolean");
    }

    public final boolean A0H(UserJid userJid, boolean z) {
        C18100vl r3 = this.A0B;
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, (C18020vd) r3.getValue(), 7968)) {
            return false;
        }
        if (z || !A5Q.A01(userJid, this.A0P) || C18020vd.A05(r2, (C18020vd) r3.getValue(), 7332)) {
            return true;
        }
        return false;
    }

    public CatalogManager(AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46, AnonymousClass00H r47, AnonymousClass00H r48, AnonymousClass00H r49, AnonymousClass00H r50, C18600wl r51) {
        AnonymousClass00H r24 = r28;
        AnonymousClass00H r23 = r29;
        AnonymousClass00H r22 = r30;
        AnonymousClass00H r21 = r31;
        AnonymousClass00H r25 = r27;
        C18070vi.A0w(r25, r24, r23, r22, r21);
        AnonymousClass00H r20 = r32;
        AnonymousClass00H r19 = r33;
        AnonymousClass00H r18 = r34;
        AnonymousClass00H r17 = r35;
        AnonymousClass00H r16 = r36;
        C18070vi.A0x(r20, r19, r18, r17, r16);
        AnonymousClass00H r10 = r39;
        AnonymousClass00H r9 = r40;
        AnonymousClass00H r8 = r41;
        AnonymousClass00H r12 = r37;
        AnonymousClass00H r11 = r38;
        C18070vi.A0y(r12, r11, r10, r9, r8);
        AnonymousClass00H r7 = r42;
        AnonymousClass00H r6 = r43;
        AnonymousClass00H r5 = r44;
        AnonymousClass00H r4 = r45;
        C18070vi.A0t(r7, r6, r5, r4);
        AnonymousClass00H r3 = r46;
        AnonymousClass00H r15 = r47;
        AnonymousClass00H r14 = r48;
        AnonymousClass00H r13 = r49;
        C18070vi.A0u(r3, r15, r14, r13);
        AnonymousClass00H r1 = r50;
        C18070vi.A0d(r1, 24);
        C18600wl r0 = r51;
        C18070vi.A0d(r0, 25);
        this.A07 = r15;
        this.A0Z = r14;
        this.A0X = r13;
        this.A0Y = r1;
        this.A0U = r0;
        this.A0B = AnonymousClass8BU.A10(r25, 0);
        this.A0N = AnonymousClass8BU.A10(r24, 13);
        this.A0Q = AnonymousClass8BU.A10(r23, 16);
        this.A0D = AnonymousClass8BU.A10(r22, 2);
        this.A0R = AnonymousClass8BU.A10(r21, 17);
        this.A0O = AnonymousClass8BU.A10(r20, 14);
        this.A0H = AnonymousClass8BU.A10(r19, 7);
        this.A0a = AnonymousClass8BU.A10(r18, 6);
        this.A0E = AnonymousClass8BU.A10(r17, 3);
        this.A0G = AnonymousClass8BU.A10(r16, 5);
        this.A0M = AnonymousClass8BU.A10(r12, 12);
        this.A0L = AnonymousClass8BU.A10(r11, 11);
        this.A0P = AnonymousClass8BU.A10(r10, 15);
        this.A0K = AnonymousClass8BU.A10(r9, 10);
        this.A0C = AnonymousClass8BU.A10(r8, 1);
        this.A0S = AnonymousClass8BU.A10(r7, 18);
        this.A0J = AnonymousClass8BU.A10(r6, 9);
        this.A0I = AnonymousClass8BU.A10(r5, 8);
        this.A0T = AnonymousClass8BU.A10(r4, 19);
        this.A0F = AnonymousClass8BU.A10(r3, 4);
    }
}
