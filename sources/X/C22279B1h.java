package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.B1h  reason: case insensitive filesystem */
public final class C22279B1h extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $isFirstRequest;
    public final /* synthetic */ int $requestPageSize;
    public final /* synthetic */ int $thumbnailSize;
    public final /* synthetic */ UserJid $userJid;
    public final /* synthetic */ CatalogManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22279B1h(CatalogManager catalogManager, UserJid userJid, int i, int i2, boolean z) {
        super(1);
        this.this$0 = catalogManager;
        this.$userJid = userJid;
        this.$thumbnailSize = i;
        this.$requestPageSize = i2;
        this.$isFirstRequest = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b5, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, (X.C18020vd) r1.A0B.getValue(), 1327) != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b7, code lost:
        r1 = (X.A5Q) r4.getValue();
        r7 = (X.C188869i8) r1.A02.get();
        r10 = r7.A0E;
        r16 = new X.C167878hv(r7.A06, r11, r15, new X.C20027A3w(new X.A6T(r7.A0L)), (X.C183949aA) X.C18070vi.A0E(r7.A0K), r7.A08, r7.A09, r7.A0D, (X.AnonymousClass1OZ) X.C18070vi.A0E(r7.A0O), r10, (X.C195049si) X.C18070vi.A0E(r7.A0Q));
        r3 = r7.A01;
        r13 = new X.C186499eI(r7.A07, (X.A0W) X.C18070vi.A0E(r7.A0M));
        r0 = r3.A00.A00;
        r9 = X.AnonymousClass10E.A17(r0);
        r10 = X.AnonymousClass8BU.A0C(r0);
        r24 = X.AnonymousClass10E.AL1(r0);
        r12 = X.AnonymousClass10E.A2k(r0);
        r22 = X.AnonymousClass10E.AHh(r0);
        X.A5Q.A00(new X.C168518j1(r9, r10, r11, r12, r13, (X.C196209ud) r0.A8m.get(), r15, r16, X.AnonymousClass3MZ.A0d(r0), X.AnonymousClass10E.A8r(r0), (X.C131206ki) r0.A4C.get(), X.AnonymousClass8BT.A0W(r0), (X.C199279zj) r0.A1v.get(), r22, (X.AnonymousClass4S5) r0.ABW.get(), r24), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x018a, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, (X.C18020vd) r1.A0B.getValue(), 7331) != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0225, code lost:
        if (r3.A01 != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r29) {
        /*
            r28 = this;
            r7 = r29
            X.9rb r7 = (X.C194359rb) r7
            java.lang.String r0 = "CatalogManager requestCatalogCollections, variants request data available"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = r28
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = r6.this$0
            X.A7x r1 = com.whatsapp.biz.catalog.manager.CatalogManager.A00(r0)
            com.whatsapp.jid.UserJid r0 = r6.$userJid
            X.9q5 r0 = r1.A05(r0)
            r19 = 0
            if (r0 == 0) goto L_0x0229
            java.lang.String r5 = r0.A00
        L_0x001d:
            com.whatsapp.biz.catalog.manager.CatalogManager r3 = r6.this$0
            com.whatsapp.jid.UserJid r1 = r6.$userJid
            X.A7x r0 = com.whatsapp.biz.catalog.manager.CatalogManager.A00(r3)
            X.9q5 r2 = r0.A05(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CatalogManager canFetchCollections() loadingCollections:"
            r1.append(r0)
            boolean r0 = r3.A01
            r1.append(r0)
            java.lang.String r0 = " PageInfo:"
            X.C17900vP.A0Y(r2, r0, r1)
            if (r2 == 0) goto L_0x0222
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0222
        L_0x0042:
            r2 = 0
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CatalogManager canFetchCollections() returns "
            X.C17900vP.A0n(r0, r1, r2)
            if (r2 == 0) goto L_0x0171
            java.lang.String r0 = "CatalogManager requestCatalogCollections->requestCatalogCollectionsPage"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.biz.catalog.manager.CatalogManager r1 = r6.this$0
            r0 = 1
            r1.A01 = r0
            int r4 = r6.$thumbnailSize
            int r3 = r6.$requestPageSize
            X.0vl r0 = r1.A0G
            java.lang.Object r0 = r0.getValue()
            X.A8Q r0 = (X.A8Q) r0
            java.lang.String r2 = r0.A03
            int r0 = r2.length()
            if (r0 == 0) goto L_0x006e
            r19 = r2
        L_0x006e:
            com.whatsapp.jid.UserJid r0 = r6.$userJid
            X.8v4 r17 = X.C173438v4.A00
            X.9tV r15 = new X.9tV
            r22 = r4
            r21 = r4
            r23 = r3
            r16 = r7
            r18 = r0
            r20 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            com.whatsapp.biz.catalog.manager.CatalogManager r4 = r6.this$0
            com.whatsapp.jid.UserJid r3 = r6.$userJid
            boolean r2 = r6.$isFirstRequest
            X.9eF r0 = new X.9eF
            r0.<init>(r4, r3, r5, r2)
            X.9nc r11 = new X.9nc
            r11.<init>(r0)
            X.0vl r4 = r1.A0P
            java.lang.Object r0 = r4.getValue()
            X.A5Q r0 = (X.A5Q) r0
            com.whatsapp.jid.UserJid r5 = r15.A05
            X.11S r0 = r0.A00
            boolean r0 = r0.A0O(r5)
            if (r0 != 0) goto L_0x0174
            X.0vl r0 = r1.A0B
            java.lang.Object r3 = r0.getValue()
            X.0vd r3 = (X.C18020vd) r3
            r2 = 1327(0x52f, float:1.86E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x0174
        L_0x00b7:
            java.lang.Object r1 = r4.getValue()
            X.A5Q r1 = (X.A5Q) r1
            X.00H r0 = r1.A02
            java.lang.Object r7 = r0.get()
            X.9i8 r7 = (X.C188869i8) r7
            X.A2u r10 = r7.A0E
            X.00H r0 = r7.A0O
            java.lang.Object r9 = X.C18070vi.A0E(r0)
            X.1OZ r9 = (X.AnonymousClass1OZ) r9
            X.00H r2 = r7.A0L
            X.A6T r0 = new X.A6T
            r0.<init>(r2)
            X.A3w r8 = new X.A3w
            r8.<init>(r0)
            X.00H r0 = r7.A0K
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.9aA r6 = (X.C183949aA) r6
            X.11E r5 = r7.A08
            X.1Ty r4 = r7.A06
            X.A0g r3 = r7.A0D
            X.00H r0 = r7.A0Q
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.9si r2 = (X.C195049si) r2
            X.0ve r0 = r7.A09
            X.8hv r16 = new X.8hv
            r17 = r4
            r18 = r11
            r19 = r15
            r20 = r8
            r21 = r6
            r22 = r5
            r23 = r0
            r24 = r3
            r25 = r9
            r26 = r10
            r27 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.9Vy r3 = r7.A01
            X.00H r0 = r7.A0M
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.A0W r2 = (X.A0W) r2
            X.9co r0 = r7.A07
            X.9eI r13 = new X.9eI
            r13.<init>(r0, r2)
            X.10F r0 = r3.A00
            X.10E r0 = r0.A00
            X.11S r9 = X.AnonymousClass10E.A17(r0)
            X.A7x r10 = X.AnonymousClass8BU.A0C(r0)
            X.00S r2 = r0.A4C
            java.lang.Object r3 = r2.get()
            X.6ki r3 = (X.C131206ki) r3
            X.10I r24 = X.AnonymousClass10E.AL1(r0)
            X.9co r12 = X.AnonymousClass10E.A2k(r0)
            X.6x9 r22 = X.AnonymousClass10E.AHh(r0)
            X.00S r2 = r0.A1v
            java.lang.Object r2 = r2.get()
            X.9zj r2 = (X.C199279zj) r2
            X.A2u r20 = X.AnonymousClass8BT.A0W(r0)
            X.00S r4 = r0.A8m
            java.lang.Object r14 = r4.get()
            X.9ud r14 = (X.C196209ud) r14
            X.11E r17 = X.AnonymousClass3MZ.A0d(r0)
            X.0ve r18 = X.AnonymousClass10E.A8r(r0)
            X.00S r0 = r0.ABW
            java.lang.Object r0 = r0.get()
            X.4S5 r0 = (X.AnonymousClass4S5) r0
            X.8j1 r8 = new X.8j1
            r21 = r2
            r23 = r0
            r19 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.A5Q.A00(r8, r1)
        L_0x0171:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0174:
            boolean r0 = X.A5Q.A01(r5, r4)
            if (r0 == 0) goto L_0x018e
            X.0vl r0 = r1.A0B
            java.lang.Object r3 = r0.getValue()
            X.0vd r3 = (X.C18020vd) r3
            r2 = 7331(0x1ca3, float:1.0273E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x018e
            goto L_0x00b7
        L_0x018e:
            X.0vl r0 = r1.A0D
            java.lang.Object r9 = r0.getValue()
            X.A2u r9 = (X.C20004A2u) r9
            X.C18070vi.A0X(r9)
            X.0vl r0 = r1.A0R
            java.lang.Object r8 = r0.getValue()
            X.1OZ r8 = (X.AnonymousClass1OZ) r8
            X.C18070vi.A0X(r8)
            X.0vl r0 = r1.A0K
            java.lang.Object r7 = r0.getValue()
            X.A3w r7 = (X.C20027A3w) r7
            X.C18070vi.A0X(r7)
            X.0vl r0 = r1.A0I
            java.lang.Object r6 = r0.getValue()
            X.9aA r6 = (X.C183949aA) r6
            X.C18070vi.A0X(r6)
            X.0vl r0 = r1.A0L
            java.lang.Object r5 = r0.getValue()
            X.11E r5 = (X.AnonymousClass11E) r5
            X.C18070vi.A0X(r5)
            X.0vl r0 = r1.A0E
            java.lang.Object r4 = r0.getValue()
            X.1Ty r4 = (X.C26911Ty) r4
            X.C18070vi.A0X(r4)
            X.0vl r0 = r1.A0M
            java.lang.Object r3 = r0.getValue()
            X.A0g r3 = (X.C19949A0g) r3
            X.C18070vi.A0X(r3)
            X.0vl r0 = r1.A0S
            java.lang.Object r2 = r0.getValue()
            X.9si r2 = (X.C195049si) r2
            X.C18070vi.A0X(r2)
            X.0vl r0 = r1.A0B
            java.lang.Object r0 = r0.getValue()
            X.0ve r0 = (X.C18030ve) r0
            X.C18070vi.A0X(r0)
            X.8hv r1 = new X.8hv
            r12 = r1
            r13 = r4
            r14 = r11
            r16 = r7
            r17 = r6
            r18 = r5
            r19 = r0
            r20 = r3
            r21 = r8
            r22 = r9
            r23 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.11E r0 = r1.A02
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x021b
            X.9nc r2 = r1.A00
            X.9tV r1 = r1.A01
            r0 = -1
            r2.A01(r1, r0)
            goto L_0x0171
        L_0x021b:
            X.1Ty r0 = r1.A01
            X.C20997Acp.A01(r0, r1)
            goto L_0x0171
        L_0x0222:
            boolean r0 = r3.A01
            r2 = 1
            if (r0 == 0) goto L_0x0043
            goto L_0x0042
        L_0x0229:
            r5 = r19
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22279B1h.invoke(java.lang.Object):java.lang.Object");
    }
}
