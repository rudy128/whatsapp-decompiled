package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8F8  reason: invalid class name */
public final class AnonymousClass8F8 extends AnonymousClass8FK implements BAE {
    public AEW A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A07 = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A08 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A09 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0A = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A0B = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0C = AnonymousClass3MW.A0L();
    public final AnonymousClass11S A0D;
    public final C192829p3 A0E;
    public final C26911Ty A0F;
    public final C192179nw A0G;
    public final C185479ce A0H;
    public final C20114A7x A0I;
    public final C190919lj A0J;
    public final A8Q A0K;
    public final CatalogManager A0L;
    public final C19973A1i A0M;
    public final C19988A2a A0N;
    public final UserJid A0O;
    public final C20004A2u A0P;
    public final C41731wy A0Q = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A0R;
    public final AnonymousClass00H A0S;
    public final C19880zA A0T;
    public final C196149uX A0U;
    public final C196469v7 A0V;
    public final AnonymousClass11P A0W;
    public final AnonymousClass2UJ A0X;

    public final void A0T(UserJid userJid) {
        if (this.A0M.A03(this.A00, userJid)) {
            Log.i("CatalogViewModel fetchCatalogCollectionsFromStart->requestCatalogCollectionsFromBeginning");
            CatalogManager catalogManager = this.A0L;
            int i = this.A05;
            int A032 = C72453Mb.A03(CatalogManager.A05(catalogManager, userJid) ? 1 : 0) * 4;
            C20114A7x A002 = CatalogManager.A00(catalogManager);
            synchronized (A002) {
                C198639yf A003 = A76.A00(A002, userJid);
                if (A003 != null) {
                    A003.A00 = new C193429q5(true, (String) null);
                    List list = A003.A05;
                    int size = list.size();
                    if (size > A032) {
                        for (int i2 = A032; i2 < size; i2++) {
                            list.remove(AnonymousClass3MX.A01(list));
                        }
                    }
                }
            }
            ArrayList A0C2 = CatalogManager.A00(catalogManager).A0C(userJid);
            if (!A0C2.isEmpty()) {
                Log.i("CatalogManager requestCatalogCollectionsFromBeginning-> returning cached collections");
                catalogManager.A04.A0E(new C168588jG(new C185609cr(A0C2, true, true), userJid));
                A032 *= 2;
            }
            Log.i("CatalogManager requestCatalogCollectionsFromBeginning-> requestCatalogCollections");
            C20114A7x A004 = CatalogManager.A00(catalogManager);
            synchronized (A004) {
                AnonymousClass11P.A01(A004.A00);
            }
            CatalogManager.A02(catalogManager, userJid, i, A032, true);
            return;
        }
        Log.i("CatalogViewModel fetchCatalogCollectionsFromStart, collections are not enabled. Clean cache");
        this.A0I.A0L(userJid, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8F8(android.app.Application r23, X.C19880zA r24, X.AnonymousClass11S r25, X.C192829p3 r26, X.C196149uX r27, X.C26911Ty r28, X.C192179nw r29, X.C196469v7 r30, X.C185479ce r31, X.C20114A7x r32, X.C190919lj r33, X.A8Q r34, com.whatsapp.biz.catalog.manager.CatalogManager r35, X.C19973A1i r36, X.C19988A2a r37, X.AnonymousClass11P r38, com.whatsapp.jid.UserJid r39, X.AnonymousClass2UJ r40, X.C20004A2u r41, X.AnonymousClass10I r42, X.AnonymousClass00H r43) {
        /*
            r22 = this;
            r8 = r35
            r15 = r38
            r4 = r41
            r21 = r23
            r19 = r25
            r1 = r19
            r0 = r21
            X.C18070vi.A0w(r15, r1, r0, r4, r8)
            r7 = r36
            r6 = r37
            r14 = r32
            r13 = r33
            r9 = r34
            X.C18070vi.A0x(r14, r6, r9, r13, r7)
            r20 = r24
            r16 = r28
            r1 = r20
            r0 = r16
            X.C72473Md.A1L(r0, r1)
            r1 = 14
            r18 = r26
            r0 = r18
            X.C18070vi.A0d(r0, r1)
            r0 = 15
            r5 = r40
            X.C18070vi.A0d(r5, r0)
            r12 = r29
            r11 = r30
            r10 = r31
            r17 = r27
            r0 = r17
            X.C18070vi.A0t(r12, r0, r11, r10)
            r3 = r42
            r2 = r43
            X.AnonymousClass8BW.A1J(r3, r2)
            r1 = r22
            r0 = r21
            r1.<init>(r0)
            r1.A0W = r15
            r0 = r19
            r1.A0D = r0
            r1.A0P = r4
            r1.A0L = r8
            r1.A0I = r14
            r1.A0N = r6
            r1.A0K = r9
            r1.A0J = r13
            r1.A0M = r7
            r0 = r16
            r1.A0F = r0
            r0 = r20
            r1.A0T = r0
            r0 = r39
            r1.A0O = r0
            r0 = r18
            r1.A0E = r0
            r1.A0X = r5
            r1.A0G = r12
            r0 = r17
            r1.A0U = r0
            r1.A0V = r11
            r1.A0H = r10
            r1.A0R = r3
            r1.A0S = r2
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A09 = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r1.A0Q = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A0B = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r1.A07 = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r1.A0A = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A08 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A06 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A0C = r0
            android.content.res.Resources r2 = r21.getResources()
            r0 = 2131168326(0x7f070c46, float:1.795095E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.A05 = r0
            android.content.res.Resources r2 = r21.getResources()
            r0 = 2131165795(0x7f070263, float:1.7945817E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8F8.<init>(android.app.Application, X.0zA, X.11S, X.9p3, X.9uX, X.1Ty, X.9nw, X.9v7, X.9ce, X.A7x, X.9lj, X.A8Q, com.whatsapp.biz.catalog.manager.CatalogManager, X.A1i, X.A2a, X.11P, com.whatsapp.jid.UserJid, X.2UJ, X.A2u, X.10I, X.00H):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Brc(X.AEW r12) {
        /*
            r11 = this;
            r11.A00 = r12
            X.1DT r1 = r11.A08
            X.A1i r4 = r11.A0M
            com.whatsapp.jid.UserJid r6 = r11.A0O
            boolean r0 = r4.A03(r12, r6)
            X.AnonymousClass3MY.A1L(r1, r0)
            X.AEW r3 = r11.A00
            X.0ve r2 = r4.A00
            r1 = 1514(0x5ea, float:2.122E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            java.lang.String r0 = "categories"
            boolean r0 = X.C19973A1i.A00(r4, r3, r0, r1)
            X.A2a r3 = r11.A0N
            if (r0 != 0) goto L_0x00d6
            r3.A03(r6)
            X.1DT r2 = r11.A0B
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
        L_0x002e:
            r2.A0F(r0)
        L_0x0031:
            java.lang.String r0 = "CatalogViewModel fetchCatalogCollectionsFromStart , fetchCatalogProductsFromStart"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.A0T(r6)
            com.whatsapp.biz.catalog.manager.CatalogManager r1 = r11.A0L
            int r0 = r11.A05
            r1.A0D(r6, r0)
            r1 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = X.C19973A1i.A00(r4, r12, r0, r1)
            if (r0 == 0) goto L_0x009d
            X.1wy r0 = r11.A0Q
            r0.A0F(r12)
            X.9nw r0 = r11.A0G
            boolean r0 = r0.A01()
            r3 = 0
            if (r0 == 0) goto L_0x00ce
            r0 = 2131888092(0x7f1207dc, float:1.941081E38)
            r5 = 2131888092(0x7f1207dc, float:1.941081E38)
            X.6IR r4 = X.AnonymousClass3MX.A0t(r0)
            X.ADr r0 = r12.A03
            if (r0 == 0) goto L_0x008b
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x008b
            int r1 = r2.hashCode()
            r0 = -2053263135(0xffffffff859db0e1, float:-1.4829184E-35)
            if (r1 == r0) goto L_0x00bd
            r0 = -129639349(0xfffffffff845dc4b, float:-1.6052352E34)
            if (r1 == r0) goto L_0x00b1
            r0 = 98382(0x1804e, float:1.37863E-40)
            if (r1 != r0) goto L_0x00c9
            java.lang.String r0 = "cep"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c9
            r0 = 2131888091(0x7f1207db, float:1.9410808E38)
        L_0x0087:
            X.6IR r4 = X.AnonymousClass3MX.A0t(r0)
        L_0x008b:
            X.1DT r2 = r11.A0A
            r1 = 2131897372(0x7f122c1c, float:1.9429632E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            r0[r3] = r4
        L_0x0096:
            X.6IR r0 = X.C1402670q.A02(r0, r1)
            r2.A0F(r0)
        L_0x009d:
            X.9uX r0 = r11.A0U
            java.lang.String r1 = r0.A00(r12)
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b0
            X.1DT r0 = r11.A06
            r0.A0F(r1)
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.String r0 = "zip_code"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c9
            r0 = 2131888094(0x7f1207de, float:1.9410814E38)
            goto L_0x0087
        L_0x00bd:
            java.lang.String r0 = "postal_code"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c9
            r0 = 2131888093(0x7f1207dd, float:1.9410812E38)
            goto L_0x0087
        L_0x00c9:
            X.6IR r4 = X.AnonymousClass3MX.A0t(r5)
            goto L_0x008b
        L_0x00ce:
            X.1DT r2 = r11.A0A
            r1 = 2131897373(0x7f122c1d, float:1.9429634E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            goto L_0x0096
        L_0x00d6:
            java.lang.String r1 = "catalog_category_dummy_root_id"
            boolean r0 = r3.A04(r6, r1)
            if (r0 == 0) goto L_0x00e6
            X.1DT r2 = r11.A0B
            java.util.ArrayList r0 = r3.A01(r6, r1)
            goto L_0x002e
        L_0x00e6:
            java.util.HashSet r8 = X.C17880vN.A12()
            X.A8Q r0 = r11.A0K
            java.lang.String r7 = r0.A03
            com.whatsapp.biz.catalog.manager.CatalogManager r3 = r11.A0L
            int r9 = r11.A04
            X.9ss r5 = new X.9ss
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 0
            X.AN9 r2 = new X.AN9
            r2.<init>(r6, r11, r0)
            r0 = 1
            X.ANN r1 = new X.ANN
            r1.<init>(r2, r3, r0)
            X.0vl r0 = r3.A0P
            java.lang.Object r0 = r0.getValue()
            X.A5Q r0 = (X.A5Q) r0
            r0.A03(r5, r1)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8F8.Brc(X.AEW):void");
    }

    public void BzH(AEW aew) {
        this.A00 = aew;
        AnonymousClass1DT r1 = this.A08;
        C19973A1i a1i = this.A0M;
        UserJid userJid = this.A0O;
        AnonymousClass3MY.A1L(r1, a1i.A03(aew, userJid));
        Log.i("CatalogViewModel fetchCatalogCollectionsFromStart , fetchCatalogProductsFromStart");
        A0T(userJid);
        this.A0L.A0D(userJid, this.A05);
    }
}
