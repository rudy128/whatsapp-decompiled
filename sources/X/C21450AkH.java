package X;

/* renamed from: X.AkH  reason: case insensitive filesystem */
public class C21450AkH implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21450AkH(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(AnonymousClass1KB r1, Object obj, Object obj2, int i) {
        r1.A0J(new C21450AkH(obj, obj2, i));
    }

    public static void A01(AnonymousClass10I r1, Object obj, Object obj2, int i) {
        r1.CGF(new C21450AkH(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.8sD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.8ru} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v93, resolved type: X.8sD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v94, resolved type: X.8sD} */
    /* JADX WARNING: type inference failed for: r1v126, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x033a, code lost:
        r2.Bso(X.C108945cZ.A0N(X.C17880vN.A0h(), "order is null"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0347, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0b25, code lost:
        r4.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0b28, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0bda, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2.A02, 4893) == false) goto L_0x0bdc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0c93, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0c97, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fc, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0df9, code lost:
        if (X.A78.A00(r2.A01.A01(r1)) != 2) goto L_0x0e10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0dfb, code lost:
        r2 = r2.A02;
        r1 = X.C18040vf.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0e05, code lost:
        if (X.C18020vd.A05(r1, r2, 4893) == false) goto L_0x0e10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0e07, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0e0e, code lost:
        if (X.C18020vd.A05(r1, r2, 5114) != false) goto L_0x0e11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0e10, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x0e11, code lost:
        r0 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0101, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0105, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:47:0x00eb, B:54:0x00f6] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:49:0x00ee, B:63:0x0100] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:712:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r38 = this;
            r2 = r38
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0927;
                case 2: goto L_0x0036;
                case 3: goto L_0x0050;
                case 4: goto L_0x0cad;
                case 5: goto L_0x093e;
                case 6: goto L_0x020c;
                case 7: goto L_0x0a49;
                case 8: goto L_0x0ac7;
                case 9: goto L_0x0cbf;
                case 10: goto L_0x0ad9;
                case 11: goto L_0x0ae5;
                case 12: goto L_0x0ae5;
                case 13: goto L_0x021a;
                case 14: goto L_0x0af5;
                case 15: goto L_0x08c5;
                case 16: goto L_0x0d11;
                case 17: goto L_0x0b05;
                case 18: goto L_0x0b29;
                case 19: goto L_0x0d1f;
                case 20: goto L_0x0b3d;
                case 21: goto L_0x0b5b;
                case 22: goto L_0x0b5b;
                case 23: goto L_0x0b67;
                case 24: goto L_0x02c3;
                case 25: goto L_0x0b67;
                case 26: goto L_0x0317;
                case 27: goto L_0x0b83;
                case 28: goto L_0x0348;
                case 29: goto L_0x0bb6;
                case 30: goto L_0x03a6;
                case 31: goto L_0x0be1;
                case 32: goto L_0x0be1;
                case 33: goto L_0x052b;
                case 34: goto L_0x0546;
                case 35: goto L_0x0dcf;
                case 36: goto L_0x0de2;
                case 37: goto L_0x0e16;
                case 38: goto L_0x0bed;
                case 39: goto L_0x0c01;
                case 40: goto L_0x0c7c;
                case 41: goto L_0x06b6;
                case 42: goto L_0x06e5;
                case 43: goto L_0x0716;
                case 44: goto L_0x079a;
                case 45: goto L_0x07d4;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r2.A01
            X.1ml r3 = (X.C35761ml) r3
            java.lang.Object r1 = r2.A02
            X.63p r1 = (X.C1184763p) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.C35761ml.A00(r3, r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r0 = r2.A01
            X.8hr r0 = (X.C167838hr) r0
            java.lang.Object r3 = r2.A02
            X.B9L r2 = r0.A01
            if (r2 == 0) goto L_0x0016
            if (r3 == 0) goto L_0x033a
            X.Acr r2 = (X.C20999Acr) r2
            int r0 = r2.A00
            java.lang.Object r2 = r2.A01
            X.9yv r2 = (X.C198799yv) r2
            X.10I r1 = r2.A0N
            if (r0 == 0) goto L_0x0034
            r0 = 3
        L_0x0030:
            A01(r1, r2, r3, r0)
            return
        L_0x0034:
            r0 = 2
            goto L_0x0030
        L_0x0036:
            java.lang.Object r3 = r2.A01
            X.9yv r3 = (X.C198799yv) r3
            java.lang.Object r2 = r2.A02
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.A8S r1 = r3.A0E     // Catch:{ Exception -> 0x0016 }
            com.whatsapp.jid.UserJid r0 = r3.A0K     // Catch:{ Exception -> 0x0016 }
            r1.A0C(r0)     // Catch:{ Exception -> 0x0016 }
            X.1DT r0 = r3.A09     // Catch:{ Exception -> 0x0016 }
            if (r0 == 0) goto L_0x0016
            r0.A0E(r2)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0c8f
        L_0x0050:
            java.lang.Object r8 = r2.A01
            X.9yv r8 = (X.C198799yv) r8
            java.lang.Object r1 = r2.A02
            X.9q4 r1 = (X.C193419q4) r1
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.A8S r4 = r8.A0E
            com.whatsapp.jid.UserJid r6 = r8.A0K
            java.util.List r2 = r1.A00
            r5 = 1
            X.C18070vi.A0d(r2, r5)
            X.A8S.A04(r4)
            r17 = 0
            X.9or r0 = r4.A00     // Catch:{ Exception -> 0x0106 }
            X.8ov r0 = r0.A00()     // Catch:{ Exception -> 0x0106 }
            X.1au r9 = r0.A06()     // Catch:{ Exception -> 0x0106 }
            X.1xA r10 = r9.BD0()     // Catch:{ all -> 0x00fe }
            X.1Ug r0 = r4.A08(r6)     // Catch:{ all -> 0x00f4 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x00f4 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x00f4 }
            int r0 = r2.size()     // Catch:{ all -> 0x00f4 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x00f4 }
            r11.<init>(r0)     // Catch:{ all -> 0x00f4 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x0090:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00a0
            X.AEv r1 = X.AnonymousClass8BS.A0B(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r1.A0H     // Catch:{ all -> 0x00f4 }
            r11.put(r0, r1)     // Catch:{ all -> 0x00f4 }
            goto L_0x0090
        L_0x00a0:
            java.util.Iterator r16 = r7.iterator()     // Catch:{ all -> 0x00f4 }
            r15 = 0
        L_0x00a5:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00e8
            X.9rM r0 = X.AnonymousClass8BR.A0J(r16)     // Catch:{ all -> 0x00f2 }
            X.AEv r13 = r0.A01     // Catch:{ all -> 0x00f2 }
            long r0 = r0.A00     // Catch:{ all -> 0x00f2 }
            java.lang.String r7 = r13.A0H     // Catch:{ all -> 0x00f2 }
            java.lang.Object r12 = r11.get(r7)     // Catch:{ all -> 0x00f2 }
            X.AEv r12 = (X.C20287AEv) r12     // Catch:{ all -> 0x00f2 }
            if (r12 == 0) goto L_0x00a5
            X.AEJ r3 = r12.A03     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x00cc
            int r14 = r3.A00     // Catch:{ all -> 0x00f2 }
            r3 = 3
            if (r14 != r3) goto L_0x00cc
        L_0x00c6:
            r4.A0D(r6, r7)     // Catch:{ all -> 0x00f2 }
            int r15 = r15 + 1
            goto L_0x00a5
        L_0x00cc:
            int r3 = r12.A00     // Catch:{ all -> 0x00f2 }
            if (r3 == r5) goto L_0x00c6
            boolean r3 = r12.A0C     // Catch:{ all -> 0x00f2 }
            if (r3 != 0) goto L_0x00c6
            boolean r3 = r13.equals(r12)     // Catch:{ all -> 0x00f2 }
            if (r3 != 0) goto L_0x00a5
            X.1Om r7 = X.C25511Om.A00     // Catch:{ all -> 0x00f2 }
            X.9rM r3 = new X.9rM     // Catch:{ all -> 0x00f2 }
            r3.<init>(r12, r7, r0)     // Catch:{ all -> 0x00f2 }
            int r0 = X.A8S.A00(r4, r3, r9, r6)     // Catch:{ all -> 0x00f2 }
            int r17 = r17 + r0
            goto L_0x00a5
        L_0x00e8:
            r10.A00()     // Catch:{ all -> 0x00f2 }
            r10.close()     // Catch:{ all -> 0x00fc }
            r9.close()     // Catch:{ Exception -> 0x0107 }
            goto L_0x0107
        L_0x00f2:
            r1 = move-exception
            goto L_0x00f6
        L_0x00f4:
            r1 = move-exception
            r15 = 0
        L_0x00f6:
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x00fc }
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r1 = move-exception
            goto L_0x0100
        L_0x00fe:
            r1 = move-exception
            r15 = 0
        L_0x0100:
            throw r1     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ Exception -> 0x0107 }
            throw r0     // Catch:{ Exception -> 0x0107 }
        L_0x0106:
            r15 = 0
        L_0x0107:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            android.util.Pair r1 = X.C108945cZ.A0N(r1, r0)
            java.lang.Object r0 = r1.first
            X.C18070vi.A0W(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            r12 = 1
            if (r0 > 0) goto L_0x0120
            r5 = 0
        L_0x0120:
            java.lang.Object r0 = r1.second
            X.C18070vi.A0W(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            if (r0 > 0) goto L_0x012c
            r12 = 0
        L_0x012c:
            r9 = 1
            java.util.Iterator r11 = r2.iterator()
        L_0x0131:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016d
            X.AEv r7 = X.AnonymousClass8BS.A0B(r11)
            X.A7x r10 = r8.A0H
            java.lang.String r0 = r7.A0H
            X.AEv r3 = r10.A0A(r6, r0)
            if (r3 == 0) goto L_0x0131
            X.AEJ r1 = r7.A03
            if (r1 == 0) goto L_0x0158
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0158
            r3.A03 = r1
        L_0x014f:
            r10.A0I(r3, r6)
            X.1KB r0 = r8.A0B
            A00(r0, r8, r7, r9)
            goto L_0x0131
        L_0x0158:
            java.lang.String r0 = r7.A08
            r3.A08 = r0
            java.math.BigDecimal r0 = r7.A09
            r3.A09 = r0
            X.A6S r0 = r7.A07
            r3.A07 = r0
            X.AE5 r0 = r7.A04
            r3.A04 = r0
            int r0 = r7.A00
            r3.A00 = r0
            goto L_0x014f
        L_0x016d:
            if (r12 == 0) goto L_0x017f
            if (r5 != 0) goto L_0x0184
            X.9Hu r1 = X.C179399Hu.SOME_UNAVAILABLE
        L_0x0173:
            X.1DT r0 = r8.A02
            if (r0 == 0) goto L_0x017a
            r0.A0E(r1)
        L_0x017a:
            X.1Ug r0 = r4.A08(r6)
            goto L_0x0187
        L_0x017f:
            if (r5 != 0) goto L_0x0184
            X.9Hu r1 = X.C179399Hu.NO_CHANGES
            goto L_0x0173
        L_0x0184:
            X.9Hu r1 = X.C179399Hu.AT_LEAST_ONE_UPDATED
            goto L_0x0173
        L_0x0187:
            java.lang.Object r7 = r0.get()     // Catch:{ Exception -> 0x0016 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ Exception -> 0x0016 }
            X.1DT r5 = r8.A01     // Catch:{ Exception -> 0x0016 }
            if (r5 == 0) goto L_0x01fd
            if (r7 == 0) goto L_0x01fa
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ Exception -> 0x0016 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ Exception -> 0x0016 }
        L_0x019b:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0016 }
            if (r0 == 0) goto L_0x01c1
            X.AEv r0 = X.AnonymousClass8BS.A0B(r3)     // Catch:{ Exception -> 0x0016 }
            java.util.List r0 = r0.A0A     // Catch:{ Exception -> 0x0016 }
            java.util.List r0 = X.C29431cG.A0q(r0)     // Catch:{ Exception -> 0x0016 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0016 }
        L_0x01af:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0016 }
            if (r0 == 0) goto L_0x019b
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0016 }
            X.AEI r1 = (X.AEI) r1     // Catch:{ Exception -> 0x0016 }
            java.lang.String r0 = r1.A04     // Catch:{ Exception -> 0x0016 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0016 }
            goto L_0x01af
        L_0x01c1:
            java.util.Iterator r9 = r7.iterator()     // Catch:{ Exception -> 0x0016 }
        L_0x01c5:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0016 }
            if (r0 == 0) goto L_0x01fa
            X.9rM r0 = X.AnonymousClass8BR.A0J(r9)     // Catch:{ Exception -> 0x0016 }
            X.AEv r0 = r0.A01     // Catch:{ Exception -> 0x0016 }
            java.util.List r0 = r0.A0A     // Catch:{ Exception -> 0x0016 }
            java.util.List r0 = X.C29431cG.A0q(r0)     // Catch:{ Exception -> 0x0016 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0016 }
        L_0x01db:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0016 }
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r2 = r3.next()     // Catch:{ Exception -> 0x0016 }
            X.AEI r2 = (X.AEI) r2     // Catch:{ Exception -> 0x0016 }
            java.lang.String r0 = r2.A04     // Catch:{ Exception -> 0x0016 }
            java.lang.Object r1 = r4.get(r0)     // Catch:{ Exception -> 0x0016 }
            X.AEI r1 = (X.AEI) r1     // Catch:{ Exception -> 0x0016 }
            if (r1 == 0) goto L_0x01db
            java.lang.String r0 = r1.A00     // Catch:{ Exception -> 0x0016 }
            r2.A00 = r0     // Catch:{ Exception -> 0x0016 }
            java.lang.String r0 = r1.A01     // Catch:{ Exception -> 0x0016 }
            r2.A01 = r0     // Catch:{ Exception -> 0x0016 }
            goto L_0x01db
        L_0x01fa:
            r5.A0E(r7)     // Catch:{ Exception -> 0x0016 }
        L_0x01fd:
            X.9k1 r1 = r8.A0D     // Catch:{ Exception -> 0x0016 }
            if (r7 == 0) goto L_0x0207
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x0016 }
            if (r0 == 0) goto L_0x0016
        L_0x0207:
            r1.A00(r6)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0c90
        L_0x020c:
            java.lang.Object r0 = r2.A01
            X.ANm r0 = (X.C20501ANm) r0
            java.lang.Object r1 = r2.A02
            X.1DT r0 = r0.A02
            if (r0 == 0) goto L_0x0016
            r0.A0F(r1)
            return
        L_0x021a:
            java.lang.Object r6 = r2.A01
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r6 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r6
            java.lang.Object r5 = r2.A02
            X.AEW r5 = (X.AEW) r5
            X.00H r0 = r6.A0J
            if (r0 == 0) goto L_0x0c91
            java.lang.Object r1 = r0.get()
            X.4S5 r1 = (X.AnonymousClass4S5) r1
            com.whatsapp.jid.UserJid r0 = r6.A4f()
            com.whatsapp.jid.UserJid r9 = r1.A00(r0)
            androidx.recyclerview.widget.RecyclerView r4 = r6.A4b()
            androidx.recyclerview.widget.RecyclerView r3 = r6.A4b()
            X.8i1 r2 = r6.A4d()
            r0 = 0
            X.ALr r1 = new X.ALr
            r1.<init>(r6, r0)
            X.BM2 r0 = new X.BM2
            r0.<init>(r6, r3, r1, r2)
            r4.A0r(r0)
            X.ADr r0 = r5.A03
            r8 = 0
            if (r0 == 0) goto L_0x0297
            java.lang.String r7 = r0.A00
            java.lang.String r4 = r0.A01
            java.lang.String r3 = r0.A02
        L_0x0259:
            X.8i1 r2 = r6.A4d()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.CatalogAdapter"
            X.C18070vi.A0z(r2, r0)
            r2.A01 = r9
            r1 = 1
            if (r7 == 0) goto L_0x0273
            if (r4 == 0) goto L_0x0273
            X.9iO r0 = r2.A0C
            java.lang.String r0 = r0.A00(r7, r3)
            r2.A02 = r0
            r2.A03 = r3
        L_0x0273:
            boolean r0 = r2.A07
            if (r0 == r1) goto L_0x0286
            r2.A07 = r1
            java.util.List r0 = r2.A00
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0286
            com.whatsapp.jid.UserJid r0 = r2.A07
            X.C167938i1.A01(r2, r0)
        L_0x0286:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A4b()
            X.AnonymousClass8ID.A00(r0, r6, r1)
            com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel r3 = r6.A06
            java.lang.String r4 = "postcodeViewModel"
            if (r3 != 0) goto L_0x029b
            X.C18070vi.A11(r4)
            throw r8
        L_0x0297:
            r7 = r8
            r4 = r8
            r3 = r8
            goto L_0x0259
        L_0x029b:
            com.whatsapp.jid.UserJid r2 = r6.A4f()
            X.10I r1 = r3.A0E
            r0 = 30
            X.C21455AkM.A00(r1, r3, r2, r5, r0)
            com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel r3 = r6.A06
            if (r3 != 0) goto L_0x02ae
            X.C18070vi.A11(r4)
            throw r8
        L_0x02ae:
            r3.A00 = r5
            X.A1i r2 = r3.A09
            r1 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = X.C19973A1i.A00(r2, r5, r0, r1)
            if (r0 == 0) goto L_0x0016
            X.10I r1 = r3.A0E
            r0 = 9
            A01(r1, r3, r5, r0)
            return
        L_0x02c3:
            java.lang.Object r1 = r2.A01
            X.6xC r1 = (X.C138506xC) r1
            java.lang.Object r3 = r2.A02
            X.87o r3 = (X.C1602087o) r3
            r2 = 1
            X.C18070vi.A0d(r3, r2)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x02dd
            X.161 r0 = r1.A03
            java.lang.Object r4 = r0.A00
            X.6iO r4 = (X.C129806iO) r4
        L_0x02d9:
            r3.C3h(r4)
            return
        L_0x02dd:
            X.163 r1 = r1.A04
            java.util.Map r0 = r1.A00
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.AnonymousClass8BR.A1Y(r0)
            if (r0 != r2) goto L_0x0016
            java.util.Map r0 = r1.A00
            if (r0 == 0) goto L_0x0315
            java.util.Set r0 = r0.keySet()
            if (r0 == 0) goto L_0x0315
            java.util.Iterator r1 = r0.iterator()
        L_0x02f7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c98
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0315
            int r9 = r0.intValue()
            if (r9 == 0) goto L_0x02f7
        L_0x030b:
            r8 = -1
            r5 = 0
            r7 = r5
            X.6iO r4 = new X.6iO
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x02d9
        L_0x0315:
            r9 = 0
            goto L_0x030b
        L_0x0317:
            java.lang.Object r0 = r2.A01
            X.8hz r0 = (X.C167918hz) r0
            java.lang.Object r3 = r2.A02
            if (r3 == 0) goto L_0x0336
            X.B9L r1 = r0.A01
            if (r1 == 0) goto L_0x0016
            X.Acr r1 = (X.C20999Acr) r1
            int r0 = r1.A00
            java.lang.Object r2 = r1.A01
            X.9yv r2 = (X.C198799yv) r2
            X.10I r1 = r2.A0N
            if (r0 == 0) goto L_0x0334
            r0 = 3
        L_0x0330:
            A01(r1, r2, r3, r0)
            return
        L_0x0334:
            r0 = 2
            goto L_0x0330
        L_0x0336:
            X.B9L r2 = r0.A01
            if (r2 == 0) goto L_0x0016
        L_0x033a:
            java.lang.Integer r1 = X.C17880vN.A0h()
            java.lang.String r0 = "order is null"
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            r2.Bso(r0)
            return
        L_0x0348:
            java.lang.Object r3 = r2.A01
            X.9hn r3 = (X.C188669hn) r3
            java.lang.Object r4 = r2.A02
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            r0 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r0 = r4.get(r0, r2)     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            X.9xF r0 = (X.C197779xF) r0     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            java.lang.Object r2 = r0.A01     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            if (r2 == 0) goto L_0x0378
            X.00H r0 = r3.A0B     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            X.1p0 r0 = (X.C37121p0) r0     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            X.9su r2 = (X.C195169su) r2     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            java.util.Map r1 = r0.A00     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            java.lang.String r0 = r2.A03     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            r1.put(r0, r2)     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            X.1DT r0 = r3.A00     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            if (r0 == 0) goto L_0x0016
            r0.A0E(r2)     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            goto L_0x0ca0
        L_0x0378:
            android.util.Pair r1 = r0.A00     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            X.1DT r0 = r3.A01     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            if (r0 == 0) goto L_0x0016
            r0.A0E(r1)     // Catch:{ ExecutionException -> 0x038b, Exception -> 0x0383 }
            goto L_0x0ca1
        L_0x0383:
            r2 = move-exception
            java.lang.String r0 = "OrderRepository/fetchOrder/fetch-error"
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 1
            goto L_0x0392
        L_0x038b:
            r2 = move-exception
            java.lang.String r0 = "OrderRepository/fetchOrder/delivery-failure"
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 2
        L_0x0392:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.toString()
            android.util.Pair r1 = X.C108945cZ.A0N(r1, r0)
            X.1DT r0 = r3.A01
            if (r0 == 0) goto L_0x0016
            r0.A0E(r1)
            return
        L_0x03a6:
            java.lang.Object r10 = r2.A01
            X.ANg r10 = (X.C20495ANg) r10
            java.lang.Object r1 = r2.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.17r r0 = r10.A01
            X.0yx r1 = X.C20495ANg.A00(r1, r0)
            java.lang.Object r0 = r1.A00
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x03ca
            X.9g3 r0 = r10.A00
            if (r0 == 0) goto L_0x0016
        L_0x03c0:
            X.8G8 r0 = r0.A02
            X.1DT r3 = r0.A0A
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            goto L_0x0e26
        L_0x03ca:
            java.lang.Object r1 = r1.A01
            java.io.File r1 = (java.io.File) r1
            android.net.Uri r3 = android.net.Uri.fromFile(r1)
            X.1Sl r2 = r10.A02     // Catch:{ Exception -> 0x0525 }
            r0 = 200(0xc8, float:2.8E-43)
            android.graphics.Bitmap r18 = r2.A0h(r3, r0, r0)     // Catch:{ Exception -> 0x0525 }
            java.io.ByteArrayOutputStream r17 = X.C108945cZ.A15()     // Catch:{ Exception -> 0x0525 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x051b }
            r3 = 80
            r2 = r18
            r0 = r17
            r2.compress(r4, r3, r0)     // Catch:{ all -> 0x051b }
            byte[] r11 = r17.toByteArray()     // Catch:{ all -> 0x051b }
            X.9g3 r9 = r10.A00     // Catch:{ all -> 0x051b }
            if (r9 == 0) goto L_0x0513
            X.8G8 r8 = r9.A02     // Catch:{ all -> 0x051b }
            X.A2u r4 = r8.A0P     // Catch:{ all -> 0x051b }
            int r0 = r9.A00     // Catch:{ all -> 0x051b }
            r37 = r0
            java.lang.String r3 = java.lang.String.valueOf(r37)     // Catch:{ all -> 0x051b }
            java.lang.String r16 = "order_creates_tag"
            java.lang.String r2 = "ProductsCount"
            r0 = r16
            r4.A04(r0, r2, r3)     // Catch:{ all -> 0x051b }
            X.A8Q r4 = r8.A0J     // Catch:{ all -> 0x051b }
            X.A7D r2 = X.A8Q.A00(r4)     // Catch:{ all -> 0x051b }
            X.A8Q.A04(r2, r4)     // Catch:{ all -> 0x051b }
            X.A8Q.A02(r2, r4)     // Catch:{ all -> 0x051b }
            X.A8Q.A03(r2, r4)     // Catch:{ all -> 0x051b }
            r0 = 34
            X.A7D.A01(r2, r0)     // Catch:{ all -> 0x051b }
            r0 = 56
            X.A7D.A02(r2, r0)     // Catch:{ all -> 0x051b }
            X.1DT r0 = r8.A03     // Catch:{ all -> 0x051b }
            X.A7D.A00(r0, r2)     // Catch:{ all -> 0x051b }
            com.whatsapp.jid.UserJid r12 = r8.A0O     // Catch:{ all -> 0x051b }
            r2.A00 = r12     // Catch:{ all -> 0x051b }
            X.9cu r3 = r9.A03     // Catch:{ all -> 0x051b }
            java.lang.String r13 = r3.A01     // Catch:{ all -> 0x051b }
            r2.A0G = r13     // Catch:{ all -> 0x051b }
            java.lang.String r0 = r9.A04     // Catch:{ all -> 0x051b }
            r36 = r0
            int r0 = r36.length()     // Catch:{ all -> 0x051b }
            r7 = 1
            boolean r0 = X.AnonymousClass000.A1R(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x051b }
            r2.A03 = r0     // Catch:{ all -> 0x051b }
            r4.A09(r2)     // Catch:{ all -> 0x051b }
            X.1DT r0 = r8.A02     // Catch:{ all -> 0x051b }
            java.lang.Object r2 = r0.A06()     // Catch:{ all -> 0x051b }
            X.AEW r2 = (X.AEW) r2     // Catch:{ all -> 0x051b }
            java.lang.String r6 = r3.A02     // Catch:{ all -> 0x051b }
            if (r6 == 0) goto L_0x04f0
            java.lang.String r0 = r9.A05     // Catch:{ all -> 0x051b }
            r35 = r0
            X.1iW r5 = r8.A0F     // Catch:{ all -> 0x051b }
            r4 = 0
            X.9cv r3 = r3.A00     // Catch:{ all -> 0x051b }
            if (r3 == 0) goto L_0x04b8
            X.A6S r0 = r3.A00     // Catch:{ all -> 0x051b }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x051b }
            r34 = r0
            java.math.BigDecimal r4 = r3.A02     // Catch:{ all -> 0x051b }
        L_0x0463:
            java.lang.String r3 = "UNKNOWN"
            if (r2 == 0) goto L_0x0473
            java.lang.String r0 = "smb_meta_catalog"
            java.lang.String r2 = r2.A0E     // Catch:{ all -> 0x051b }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x051b }
            if (r0 == 0) goto L_0x04ad
            java.lang.String r3 = "SMB_META_CATALOG"
        L_0x0473:
            X.2rc r0 = new X.2rc     // Catch:{ all -> 0x051b }
            r0.<init>()     // Catch:{ all -> 0x051b }
            r0.A0G = r1     // Catch:{ all -> 0x051b }
            X.1Sb r1 = r5.A0j     // Catch:{ all -> 0x051b }
            r20 = 0
            r29 = 44
            r2 = 0
            r24 = r20
            r25 = r20
            r26 = r20
            r27 = r20
            r28 = r20
            r31 = r2
            r32 = r2
            r33 = r2
            r19 = r1
            r21 = r0
            r22 = r12
            r23 = r20
            r30 = r2
            X.21V r14 = r19.A03(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x051b }
            X.22U r14 = (X.AnonymousClass22U) r14     // Catch:{ all -> 0x051b }
            X.0ve r0 = r5.A0c     // Catch:{ all -> 0x051b }
            r15 = r0
            r1 = 4893(0x131d, float:6.857E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x051b }
            boolean r0 = X.C18020vd.A05(r0, r15, r1)     // Catch:{ all -> 0x051b }
            goto L_0x04bb
        L_0x04ad:
            java.lang.String r0 = "catalog"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x051b }
            if (r0 == 0) goto L_0x0473
            java.lang.String r3 = "NATIVE"
            goto L_0x0473
        L_0x04b8:
            r34 = r4
            goto L_0x0463
        L_0x04bb:
            int r1 = X.C72453Mb.A03(r0)
            r0 = r37
            r14.A00 = r0     // Catch:{ all -> 0x051b }
            r0 = r36
            r14.A07 = r0     // Catch:{ all -> 0x051b }
            r14.A02 = r7     // Catch:{ all -> 0x051b }
            r14.A08 = r13     // Catch:{ all -> 0x051b }
            r14.A03 = r7     // Catch:{ all -> 0x051b }
            r0 = r35
            r14.A09 = r0     // Catch:{ all -> 0x051b }
            r14.A04 = r12     // Catch:{ all -> 0x051b }
            r14.A0A = r6     // Catch:{ all -> 0x051b }
            r0 = r34
            r14.A06 = r0     // Catch:{ all -> 0x051b }
            r14.A0B = r4     // Catch:{ all -> 0x051b }
            r14.A01 = r1     // Catch:{ all -> 0x051b }
            r14.A05 = r3     // Catch:{ all -> 0x051b }
            if (r11 == 0) goto L_0x04e4
            r14.A0p(r11)     // Catch:{ all -> 0x051b }
        L_0x04e4:
            java.util.List r1 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x051b }
            X.2tS r0 = new X.2tS     // Catch:{ all -> 0x051b }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x051b }
            r5.A0n(r0, r11, r2, r2)     // Catch:{ all -> 0x051b }
        L_0x04f0:
            X.01E r4 = r9.A01     // Catch:{ all -> 0x051b }
            X.11P r3 = r8.A0N     // Catch:{ all -> 0x051b }
            java.lang.String r2 = "CartViewMode:sendCart"
            X.1LU r1 = new X.1LU     // Catch:{ all -> 0x051b }
            r1.<init>()     // Catch:{ all -> 0x051b }
            r0 = 0
            android.content.Intent r0 = r1.A1x(r4, r12, r0)     // Catch:{ all -> 0x051b }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x051b }
            X.C60442o2.A00(r0, r3, r2)     // Catch:{ all -> 0x051b }
            r4.startActivity(r0)     // Catch:{ all -> 0x051b }
            r4.finish()     // Catch:{ all -> 0x051b }
            X.A2u r1 = r8.A0P     // Catch:{ all -> 0x051b }
            r0 = r16
            r1.A06(r0, r7)     // Catch:{ all -> 0x051b }
        L_0x0513:
            r17.close()     // Catch:{ Exception -> 0x0525 }
            r18.recycle()     // Catch:{ Exception -> 0x0525 }
            goto L_0x0ca2
        L_0x051b:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0520 }
            goto L_0x0524
        L_0x0520:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0525 }
        L_0x0524:
            throw r1     // Catch:{ Exception -> 0x0525 }
        L_0x0525:
            X.9g3 r0 = r10.A00
            if (r0 == 0) goto L_0x0016
            goto L_0x03c0
        L_0x052b:
            java.lang.Object r3 = r2.A01
            X.8jP r3 = (X.C168648jP) r3
            java.lang.Object r2 = r2.A02
            X.9gB r2 = (X.C187669gB) r2
            r1 = 0
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = X.AnonymousClass8BW.A0F(r3)
            boolean r0 = r0.A0F(r2)
            if (r0 != 0) goto L_0x0016
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = X.AnonymousClass8BW.A0F(r3)
            r0.A0C(r2, r1)
            return
        L_0x0546:
            java.lang.Object r3 = r2.A01
            X.9g4 r3 = (X.C187599g4) r3
            java.lang.Object r7 = r2.A02
            X.AEv r7 = (X.C20287AEv) r7
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.AE6 r0 = r7.A05
            r6 = -1
            r12 = 0
            r5 = 1
            if (r0 == 0) goto L_0x067c
            X.ADW r0 = r0.A00
            if (r0 == 0) goto L_0x067c
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x067c
            java.util.Iterator r11 = r0.iterator()
            r4 = 0
        L_0x0566:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x067c
            java.lang.Object r0 = r11.next()
            X.ADo r0 = (X.C20256ADo) r0
            java.util.List r2 = r0.A01
            r10 = 0
            if (r2 == 0) goto L_0x0581
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0631
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0631
        L_0x0581:
            r9 = 0
        L_0x0582:
            X.AE6 r0 = r7.A05
            if (r0 == 0) goto L_0x062a
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x062a
            int r0 = r0.size()
            if (r0 <= r5) goto L_0x062a
            if (r2 == 0) goto L_0x059c
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x05e6
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x05e6
        L_0x059c:
            r0 = 0
        L_0x059d:
            if (r9 == 0) goto L_0x05e3
            if (r0 == 0) goto L_0x05e3
        L_0x05a1:
            java.util.HashSet r8 = X.C17880vN.A12()
            X.AE6 r0 = r7.A05
            if (r0 == 0) goto L_0x05b5
            X.ADW r0 = r0.A00
            if (r0 == 0) goto L_0x05b5
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x05b5
            int r12 = r0.size()
        L_0x05b5:
            if (r4 == r6) goto L_0x067f
            if (r12 == 0) goto L_0x067f
            int r5 = r4 + -5
            int r2 = r4 + 5
            if (r5 > r2) goto L_0x067f
        L_0x05bf:
            if (r5 == r4) goto L_0x05de
            X.AE6 r0 = r7.A05
            if (r0 == 0) goto L_0x05de
            X.ADW r0 = r0.A00
            if (r0 == 0) goto L_0x05de
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x05de
            int r0 = r12 * 5
            int r0 = r0 + r5
            int r0 = r0 % r12
            java.lang.Object r0 = r1.get(r0)
            X.ADo r0 = (X.C20256ADo) r0
            if (r0 == 0) goto L_0x05de
            java.lang.String r0 = r0.A00
            r8.add(r0)
        L_0x05de:
            if (r5 == r2) goto L_0x067f
            int r5 = r5 + 1
            goto L_0x05bf
        L_0x05e3:
            int r4 = r4 + 1
            goto L_0x0566
        L_0x05e6:
            java.util.Iterator r8 = r2.iterator()
        L_0x05ea:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x059c
            java.lang.Object r2 = r8.next()
            X.ADd r2 = (X.C20245ADd) r2
            java.lang.String r1 = r2.A01
            X.AE6 r0 = r7.A05
            if (r0 == 0) goto L_0x062f
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x062f
            java.lang.Object r0 = X.C29431cG.A0f(r0, r5)
            X.ADd r0 = (X.C20245ADd) r0
            if (r0 == 0) goto L_0x062f
            java.lang.String r0 = r0.A01
        L_0x060a:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x05ea
            java.lang.String r1 = r2.A00
            X.AE6 r0 = r7.A05
            if (r0 == 0) goto L_0x062d
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x062d
            java.lang.Object r0 = X.C29431cG.A0f(r0, r5)
            X.ADd r0 = (X.C20245ADd) r0
            if (r0 == 0) goto L_0x062d
            java.lang.String r0 = r0.A00
        L_0x0624:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x05ea
        L_0x062a:
            r0 = 1
            goto L_0x059d
        L_0x062d:
            r0 = r10
            goto L_0x0624
        L_0x062f:
            r0 = r10
            goto L_0x060a
        L_0x0631:
            java.util.Iterator r9 = r2.iterator()
        L_0x0635:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0581
            java.lang.Object r8 = r9.next()
            X.ADd r8 = (X.C20245ADd) r8
            java.lang.String r1 = r8.A01
            X.AE6 r0 = r7.A05
            if (r0 == 0) goto L_0x067a
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x067a
            java.lang.Object r0 = X.C29431cG.A0c(r0)
            X.ADd r0 = (X.C20245ADd) r0
            if (r0 == 0) goto L_0x067a
            java.lang.String r0 = r0.A01
        L_0x0655:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0635
            java.lang.String r1 = r8.A00
            X.AE6 r0 = r7.A05
            if (r0 == 0) goto L_0x0678
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x0678
            java.lang.Object r0 = X.C29431cG.A0c(r0)
            X.ADd r0 = (X.C20245ADd) r0
            if (r0 == 0) goto L_0x0678
            java.lang.String r0 = r0.A00
        L_0x066f:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0635
            r9 = 1
            goto L_0x0582
        L_0x0678:
            r0 = r10
            goto L_0x066f
        L_0x067a:
            r0 = r10
            goto L_0x0655
        L_0x067c:
            r4 = -1
            goto L_0x05a1
        L_0x067f:
            boolean r0 = X.C17880vN.A1X(r8)
            if (r0 == 0) goto L_0x0016
            com.whatsapp.jid.UserJid r6 = r3.A00
            if (r6 == 0) goto L_0x0016
            X.9oz r5 = r3.A01
            java.util.List r4 = X.C29431cG.A0t(r8)
            X.118 r0 = r3.A02
            android.content.Context r3 = r0.A00
            android.content.res.Resources r2 = r3.getResources()
            r0 = 2131167707(0x7f0709db, float:1.7949695E38)
            r1 = 2131167707(0x7f0709db, float:1.7949695E38)
            int r0 = r2.getDimensionPixelSize(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.AnonymousClass3MZ.A01(r3, r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.A20 r0 = new X.A20
            r0.<init>(r6, r2, r1, r4)
            r5.A01(r0)
            return
        L_0x06b6:
            java.lang.Object r1 = r2.A01
            X.AVj r1 = (X.C20703AVj) r1
            java.lang.Object r4 = r2.A02
            X.205 r4 = (X.AnonymousClass205) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.1W6 r0 = r1.A02
            X.206 r0 = X.C108945cZ.A0s(r4, r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.AnonymousClass25A.A0e(r0)
            if (r0 == 0) goto L_0x0016
            X.1BI r3 = r4.A00
            if (r3 == 0) goto L_0x0016
            X.A2A r2 = r1.A00
            java.lang.Integer r5 = X.AnonymousClass00R.A01
            r7 = 0
            X.10I r0 = r2.A05
            r6 = 4
            X.Ak4 r1 = new X.Ak4
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.CGF(r1)
            return
        L_0x06e5:
            java.lang.Object r1 = r2.A01
            X.21g r1 = (X.C438721g) r1
            java.lang.Object r3 = r2.A02
            X.9aF r3 = (X.C183999aF) r3
            X.205 r0 = r1.A0v
            X.1BI r2 = r0.A00
            if (r2 == 0) goto L_0x0016
            X.AEb r0 = r1.A00
            if (r0 == 0) goto L_0x0016
            X.AE2 r0 = r0.A01
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0016
            org.json.JSONObject r1 = X.C17880vN.A16(r0)
            X.9iR r0 = X.A2Y.A02
            X.A2Y r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0016
            X.9qI r1 = new X.9qI
            r1.<init>(r0, r2)
            X.96r r0 = r3.A00
            r0.A07(r1)
            return
        L_0x0716:
            java.lang.Object r3 = r2.A01
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r4 = r2.A02
            X.A5M r4 = (X.A5M) r4
            r9 = 0
            X.205 r0 = r3.A0v
            X.1BI r5 = r0.A00
            X.206 r2 = r3.A0K()
            if (r5 == 0) goto L_0x075f
            X.00H r1 = r4.A0H
            X.A8x r0 = X.AnonymousClass8BR.A0K(r1)
            boolean r0 = r0.A0O(r5)
            if (r0 == 0) goto L_0x075f
            X.A8x r0 = X.AnonymousClass8BR.A0K(r1)
            X.1R3 r1 = r0.A06
            r0 = 1
            java.util.ArrayList r1 = r1.A08(r5, r0)
            boolean r0 = X.C17880vN.A1X(r1)
            if (r0 == 0) goto L_0x0798
            java.lang.Object r6 = r1.get(r9)
            X.206 r6 = (X.AnonymousClass206) r6
        L_0x074c:
            if (r2 == 0) goto L_0x0796
            X.00H r0 = r4.A0E
            X.1W6 r1 = X.C17880vN.A0c(r0)
            X.205 r0 = r2.A0v
            X.206 r7 = X.C108945cZ.A0s(r0, r1)
        L_0x075a:
            int r8 = r3.A0u
            X.A5M.A00(r4, r5, r6, r7, r8, r9)
        L_0x075f:
            X.00H r0 = r4.A0D
            java.lang.Object r6 = r0.get()
            X.2dg r6 = (X.C54152dg) r6
            X.0ve r2 = r6.A02
            r1 = 12526(0x30ee, float:1.7553E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0016
            if (r5 == 0) goto L_0x0016
            com.whatsapp.jid.UserJid r5 = X.C22941Dw.A00(r5)
            if (r5 == 0) goto L_0x0016
            X.Abv r0 = X.C60532oB.A00(r3)
            if (r0 == 0) goto L_0x0016
            java.lang.String r4 = r0.A0C
            if (r4 == 0) goto L_0x0016
            X.2Li r3 = r6.A00
            X.11P r0 = r6.A01
            long r1 = X.AnonymousClass11P.A01(r0)
            X.2rP r0 = new X.2rP
            r0.<init>(r5, r4, r1)
            r3.A07(r0)
            return
        L_0x0796:
            r7 = 0
            goto L_0x075a
        L_0x0798:
            r6 = 0
            goto L_0x074c
        L_0x079a:
            java.lang.Object r6 = r2.A01
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.Object r3 = r2.A02
            X.A5M r3 = (X.A5M) r3
            r8 = 1
            X.205 r0 = r6.A0v
            X.1BI r4 = r0.A00
            if (r4 == 0) goto L_0x0016
            X.00H r1 = r3.A0H
            X.A8x r0 = X.AnonymousClass8BR.A0K(r1)
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x0016
            X.A8x r0 = X.AnonymousClass8BR.A0K(r1)
            r2 = 0
            X.1R3 r0 = r0.A06
            java.util.ArrayList r1 = r0.A08(r4, r8)
            boolean r0 = X.C17880vN.A1X(r1)
            if (r0 == 0) goto L_0x07d2
            java.lang.Object r5 = r1.get(r2)
            X.206 r5 = (X.AnonymousClass206) r5
        L_0x07cc:
            int r7 = r6.A0u
            X.A5M.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x07d2:
            r5 = 0
            goto L_0x07cc
        L_0x07d4:
            java.lang.Object r8 = r2.A01
            X.A5M r8 = (X.A5M) r8
            java.lang.Object r5 = r2.A02
            X.9Bw r5 = (X.C178119Bw) r5
            X.1M9 r0 = r8.A02
            X.4cT r7 = r5.A04
            com.whatsapp.jid.UserJid r3 = r7.A01
            X.1E7 r6 = r0.A0E(r3)
            if (r6 == 0) goto L_0x0016
            X.00H r0 = r8.A0H
            int r10 = X.C20136A8x.A01(r6, r0)
            X.A8x r0 = X.AnonymousClass8BR.A0K(r0)
            boolean r0 = r0.A0N(r10)
            if (r0 == 0) goto L_0x0016
            X.00H r0 = r8.A0G
            java.lang.Object r0 = r0.get()
            X.9eK r0 = (X.C186519eK) r0
            X.00H r9 = r0.A03
            X.A8x r1 = X.AnonymousClass8BR.A0K(r9)
            r0 = 3
            if (r10 != r0) goto L_0x085d
            X.0ve r2 = r1.A07
            r1 = 9740(0x260c, float:1.3649E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x085d
            X.8r9 r4 = new X.8r9
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r4.A02 = r0
            X.A8x r0 = X.AnonymousClass8BR.A0K(r9)
            java.lang.String r0 = r0.A0I(r6)
            r4.A04 = r0
            r9.get()
            boolean r1 = r7.A03
            r0 = 1
            if (r1 == r0) goto L_0x0835
            if (r1 != 0) goto L_0x0ca8
            r0 = 0
        L_0x0835:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
            int r0 = r5.A08
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A03 = r0
            r9.get()
            int r2 = r5.A06
            r1 = 2
            if (r2 == r1) goto L_0x0854
            r0 = 4
            r1 = 1
            if (r2 == r0) goto L_0x0854
            r0 = 5
            r1 = 0
            if (r2 == r0) goto L_0x0854
            r1 = 3
        L_0x0854:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.A01 = r0
            X.C20136A8x.A09(r4, r9)
        L_0x085d:
            X.00H r0 = r8.A0F
            java.lang.Object r1 = r0.get()
            X.9g5 r1 = (X.C187609g5) r1
            java.lang.Long r6 = X.C88244Yx.A02(r6)
            X.1M9 r0 = r1.A02
            X.1E7 r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x0016
            X.00H r4 = r1.A05
            int r2 = X.C20136A8x.A01(r0, r4)
            X.A8x r1 = X.AnonymousClass8BR.A0K(r4)
            r0 = 3
            if (r2 != r0) goto L_0x0016
            X.0ve r2 = r1.A07
            r1 = 9687(0x25d7, float:1.3574E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0016
            X.8qx r3 = new X.8qx
            r3.<init>()
            r3.A02 = r6
            r4.get()
            boolean r1 = r7.A03
            r0 = 1
            if (r1 == r0) goto L_0x089c
            if (r1 != 0) goto L_0x0ca3
            r0 = 0
        L_0x089c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A00 = r0
            int r0 = r5.A08
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r3.A03 = r0
            r4.get()
            int r2 = r5.A06
            r1 = 2
            if (r2 == r1) goto L_0x08bb
            r0 = 4
            r1 = 1
            if (r2 == r0) goto L_0x08bb
            r0 = 5
            r1 = 0
            if (r2 == r0) goto L_0x08bb
            r1 = 3
        L_0x08bb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A01 = r0
            X.C20136A8x.A09(r3, r4)
            return
        L_0x08c5:
            java.lang.Object r0 = r2.A01
            X.7CW r0 = (X.AnonymousClass7CW) r0
            java.lang.Object r3 = r2.A02
            r6 = 0
            X.1bI r0 = r0.A08
            if (r0 != 0) goto L_0x08d4
            java.lang.String r0 = "variantChipViewStubHolder"
            goto L_0x0c93
        L_0x08d4:
            android.view.View r1 = r0.A02()
            r0 = 2131436659(0x7f0b2473, float:1.8495195E38)
            android.view.View r5 = r1.findViewById(r0)
            X.C18070vi.A0b(r3)
            r2 = 1
            X.4so r0 = new X.4so
            r0.<init>(r3, r2)
            java.util.Iterator r1 = r0.iterator()
        L_0x08ec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0921
            java.lang.Object r4 = r1.next()
            r0 = r4
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isSelected()
            if (r0 == 0) goto L_0x08ec
        L_0x08ff:
            X.4so r0 = new X.4so
            r0.<init>(r3, r2)
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x0909:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0923
            java.lang.Object r1 = r3.next()
            android.view.View r1 = (android.view.View) r1
            boolean r0 = X.C18070vi.A18(r1, r4)
            if (r0 != 0) goto L_0x0923
            int r0 = r1.getWidth()
            int r2 = r2 + r0
            goto L_0x0909
        L_0x0921:
            r4 = 0
            goto L_0x08ff
        L_0x0923:
            r5.scrollTo(r2, r6)
            return
        L_0x0927:
            java.lang.Object r1 = r2.A01
            X.9yv r1 = (X.C198799yv) r1
            java.lang.Object r0 = r2.A02
            X.AEv r0 = (X.C20287AEv) r0
            r2 = 0
            X.C18070vi.A0d(r1, r2)
            X.8yS r1 = r1.A0G
            java.lang.String r0 = r0.A0H
            X.C18070vi.A0d(r0, r2)
            X.C20738AWt.A00(r1, r0, r2)
            return
        L_0x093e:
            java.lang.Object r3 = r2.A01
            X.A8Q r3 = (X.A8Q) r3
            java.lang.Object r5 = r2.A02
            X.A7D r5 = (X.A7D) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            X.0ve r4 = r3.A08
            X.11S r2 = r3.A06
            X.9jB r7 = r3.A0A
            X.1PM r1 = r3.A07
            r6 = 0
            com.whatsapp.jid.UserJid r0 = r5.A00
            boolean r0 = r2.A0O(r0)
            if (r0 == 0) goto L_0x09ce
            X.8ru r2 = new X.8ru
            r2.<init>()
            java.lang.Integer r0 = r5.A04
            r2.A02 = r0
            java.lang.String r0 = r5.A0B
            r2.A06 = r0
            java.lang.String r0 = r5.A0H
            r2.A0A = r0
            java.lang.Integer r0 = r5.A07
            r2.A04 = r0
            java.lang.Long r0 = r5.A08
            r2.A05 = r0
            java.lang.String r0 = r5.A0G
            r2.A09 = r0
            java.lang.Boolean r0 = r5.A03
            r2.A01 = r0
            java.lang.Boolean r0 = r5.A01
            r2.A00 = r0
            java.lang.String r0 = r5.A0D
            r2.A08 = r0
            java.lang.String r0 = r5.A0I
            r2.A0B = r0
            java.lang.String r0 = r5.A0C
            r2.A07 = r0
            java.lang.Integer r0 = r5.A05
            r2.A03 = r0
        L_0x0990:
            r1 = 4494(0x118e, float:6.297E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x09aa
            boolean r0 = r2 instanceof X.C171748sD
            if (r0 == 0) goto L_0x09aa
            r6 = r2
            X.8sD r6 = (X.C171748sD) r6
            java.lang.String r1 = r6.A0C
            if (r1 != 0) goto L_0x09b0
            java.lang.String r0 = "updateBizCatalogViewConversationInitiated: no catalogOwnerJid in the event"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x09aa:
            X.18K r0 = r3.A09
            r0.CC7(r2)
            return
        L_0x09b0:
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ 11T -> 0x09c7 }
            com.whatsapp.jid.PhoneUserJid r5 = X.C22951Dx.A01(r1)     // Catch:{ 11T -> 0x09c7 }
            X.00H r0 = r3.A0C     // Catch:{ 11T -> 0x09c7 }
            java.lang.Object r4 = r0.get()     // Catch:{ 11T -> 0x09c7 }
            X.2sU r4 = (X.C63092sU) r4     // Catch:{ 11T -> 0x09c7 }
            long r0 = r4.A00     // Catch:{ 11T -> 0x09c7 }
            java.lang.Integer r0 = X.C63092sU.A00(r4, r5, r0)     // Catch:{ 11T -> 0x09c7 }
            r6.A08 = r0     // Catch:{ 11T -> 0x09c7 }
            goto L_0x09aa
        L_0x09c7:
            r1 = move-exception
            java.lang.String r0 = "updateBizCatalogViewConversationInitiated: could not get chat jid from catalogOwnerJid"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x09aa
        L_0x09ce:
            X.8sD r2 = new X.8sD
            r2.<init>()
            java.lang.Long r0 = r5.A09
            r2.A0A = r0
            java.lang.Integer r0 = r5.A06
            r2.A06 = r0
            java.lang.String r0 = r5.A0B
            r2.A0D = r0
            java.lang.String r0 = r5.A0H
            r2.A0J = r0
            java.lang.Integer r0 = r5.A07
            r2.A07 = r0
            com.whatsapp.jid.UserJid r0 = r5.A00
            java.lang.String r0 = r7.A00(r0)
            r2.A0C = r0
            java.lang.Long r0 = r5.A08
            r2.A09 = r0
            java.lang.String r0 = r5.A0G
            r2.A0I = r0
            java.lang.Boolean r0 = r5.A03
            r2.A03 = r0
            java.lang.Boolean r0 = r5.A01
            r2.A00 = r0
            java.lang.String r0 = r5.A0D
            r2.A0F = r0
            java.lang.String r0 = r5.A0I
            r2.A0K = r0
            java.lang.String r0 = r5.A0C
            r2.A0E = r0
            java.lang.Integer r0 = r5.A05
            r2.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.A01 = r0
            com.whatsapp.jid.UserJid r0 = r5.A00
            X.1yf r0 = r1.A02(r0)
            int r0 = X.A78.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
            r1 = 4489(0x1189, float:6.29E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0a37
            java.lang.String r0 = r5.A0F
            r2.A0H = r0
            java.lang.String r0 = r5.A0E
            r2.A0G = r0
        L_0x0a37:
            java.lang.Boolean r0 = r5.A02
            r2.A02 = r0
            java.lang.String r0 = r5.A0J
            r2.A0L = r0
            java.lang.String r0 = r5.A0K
            r2.A0M = r0
            java.lang.String r0 = r5.A0A
            r2.A0B = r0
            goto L_0x0990
        L_0x0a49:
            java.lang.Object r9 = r2.A01
            X.8j2 r9 = (X.C168528j2) r9
            java.lang.Object r2 = r2.A02
            X.9eH r2 = (X.C186489eH) r2
            r8 = 0
            r6 = 1
            X.9hY r7 = r9.A08
            java.lang.String r0 = r7.A09
            if (r0 != 0) goto L_0x0a68
            X.A2u r1 = r9.A0B
            java.lang.String r0 = "catalog_collections_view_tag"
            X.19a r1 = X.C20004A2u.A00(r1, r0)
            if (r1 == 0) goto L_0x0a68
            java.lang.String r0 = "datasource_catalog"
            r1.A06(r0)
        L_0x0a68:
            com.whatsapp.jid.UserJid r12 = r7.A08
            X.AN5 r10 = r2.A00
            X.1Ty r1 = r9.A02
            boolean r0 = r2.A03
            r1.A0I(r12, r0)
            X.A7x r5 = r9.A03
            X.9Hv r0 = r2.A01
            r5.A0H(r0, r12)
            java.lang.String r11 = r2.A02
            monitor-enter(r5)
            X.A76 r4 = X.C20114A7x.A08     // Catch:{ all -> 0x0ac4 }
            X.0ve r3 = r5.A01     // Catch:{ all -> 0x0ac4 }
            X.00H r2 = r5.A03     // Catch:{ all -> 0x0ac4 }
            com.whatsapp.jid.UserJid r0 = X.A76.A01(r4, r3, r12, r2)     // Catch:{ all -> 0x0ac4 }
            java.util.Map r1 = r5.A04     // Catch:{ all -> 0x0ac4 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0ac4 }
            X.9yf r0 = (X.C198639yf) r0     // Catch:{ all -> 0x0ac4 }
            if (r0 == 0) goto L_0x0a93
            r0.A03 = r11     // Catch:{ all -> 0x0ac4 }
        L_0x0a93:
            monitor-exit(r5)
            monitor-enter(r5)
            com.whatsapp.jid.UserJid r0 = X.A76.A01(r4, r3, r12, r2)     // Catch:{ all -> 0x0ac4 }
            r1.get(r0)     // Catch:{ all -> 0x0ac4 }
            monitor-exit(r5)
            monitor-enter(r5)
            com.whatsapp.jid.UserJid r0 = X.A76.A01(r4, r3, r12, r2)     // Catch:{ all -> 0x0ac4 }
            r1.get(r0)     // Catch:{ all -> 0x0ac4 }
            monitor-exit(r5)
            monitor-enter(r5)
            com.whatsapp.jid.UserJid r0 = X.A76.A01(r4, r3, r12, r2)     // Catch:{ all -> 0x0ac4 }
            r1.get(r0)     // Catch:{ all -> 0x0ac4 }
            monitor-exit(r5)
            X.BAM r0 = r9.A05
            if (r10 == 0) goto L_0x0ab7
            r0.C7c(r10, r7)
            return
        L_0x0ab7:
            r0.Btn(r7, r8)
            X.190 r2 = r9.A00
            java.lang.String r1 = "error_code=0"
            java.lang.String r0 = "GetProductCatalogGraphQLService/get product catalog error"
            r2.A0G(r0, r1, r6)
            return
        L_0x0ac4:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0ac7:
            java.lang.Object r4 = r2.A01
            X.8ht r4 = (X.C167858ht) r4
            java.lang.Object r3 = r2.A02
            X.AEW r3 = (X.AEW) r3
            X.A2z r2 = r4.A00
            com.whatsapp.jid.UserJid r1 = r4.A00
            java.lang.String r0 = r4.A06
            r2.A04(r4, r3, r1, r0)
            return
        L_0x0ad9:
            java.lang.Object r1 = r2.A01
            com.whatsapp.biz.catalog.view.AvailabilityStateImageView r1 = (com.whatsapp.biz.catalog.view.AvailabilityStateImageView) r1
            java.lang.Object r0 = r2.A02
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            com.whatsapp.biz.catalog.view.AvailabilityStateImageView.setImageDrawable$lambda$0(r1, r0)
            return
        L_0x0ae5:
            java.lang.Object r0 = r2.A01
            X.ANt r0 = (X.C20508ANt) r0
            java.lang.Object r2 = r2.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1Ty r1 = r0.A0B
            X.AEW r0 = r0.A02
            r1.A0G(r0, r2)
            return
        L_0x0af5:
            java.lang.Object r3 = r2.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Object r1 = r2.A02
            X.1KB r4 = r3.A05
            r0 = 13
            X.AkH r2 = new X.AkH
            r2.<init>(r3, r1, r0)
            goto L_0x0b25
        L_0x0b05:
            java.lang.Object r3 = r2.A01
            X.AR9 r3 = (X.AR9) r3
            java.lang.Object r1 = r2.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.00H r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.A8S r0 = (X.A8S) r0
            r0.A0C(r1)
            X.00H r0 = r3.A03
            X.1KB r4 = X.C108945cZ.A0a(r0)
            r0 = 49
            X.Ajr r2 = new X.Ajr
            r2.<init>(r3, r0)
        L_0x0b25:
            r4.A0J(r2)
            return
        L_0x0b29:
            java.lang.Object r0 = r2.A01
            X.AR9 r0 = (X.AR9) r0
            java.lang.Object r1 = r2.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.9k1 r0 = (X.C189889k1) r0
            r0.A00(r1)
            return
        L_0x0b3d:
            java.lang.Object r3 = r2.A01
            X.9k0 r3 = (X.C189879k0) r3
            java.lang.Object r1 = r2.A02
            X.6xC r1 = (X.C138506xC) r1
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.161 r0 = r1.A03
            java.lang.Object r1 = r0.A00
            X.9Wk r1 = (X.C182969Wk) r1
            if (r1 != 0) goto L_0x0b57
            r0 = 0
            X.9Wk r1 = new X.9Wk
            r1.<init>(r0)
        L_0x0b57:
            r3.A00(r1)
            return
        L_0x0b5b:
            java.lang.Object r1 = r2.A01
            X.87o r1 = (X.C1602087o) r1
            java.lang.Object r0 = r2.A02
            X.6iO r0 = (X.C129806iO) r0
            r1.C3h(r0)
            return
        L_0x0b67:
            java.lang.Object r1 = r2.A01
            X.87o r1 = (X.C1602087o) r1
            java.lang.Object r0 = r2.A02
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r7 = 0
            X.C18070vi.A0d(r1, r7)
            java.lang.String r5 = r0.getMessage()
            r6 = -1
            r3 = 0
            X.6iO r2 = new X.6iO
            r4 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            r1.C3h(r2)
            return
        L_0x0b83:
            java.lang.Object r0 = r2.A01
            X.8hz r0 = (X.C167918hz) r0
            java.lang.Object r2 = r2.A02
            android.util.Pair r2 = (android.util.Pair) r2
            if (r2 == 0) goto L_0x0ba2
            X.B9L r0 = r0.A01
            if (r0 == 0) goto L_0x0b94
            r0.Bso(r2)
        L_0x0b94:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CreateOrderProtocol/onError/"
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
        L_0x0b9e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0ba2:
            X.B9L r2 = r0.A01
            if (r2 == 0) goto L_0x0bb3
            java.lang.Integer r1 = X.C17880vN.A0h()
            java.lang.String r0 = "error code is null"
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            r2.Bso(r0)
        L_0x0bb3:
            java.lang.String r0 = "CreateOrderProtocol/onError/Unknown error"
            goto L_0x0b9e
        L_0x0bb6:
            java.lang.Object r0 = r2.A01
            X.8Fk r0 = (X.C161518Fk) r0
            java.lang.Object r1 = r2.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1DT r3 = r0.A04
            X.9ce r2 = r0.A07
            X.1PM r0 = r2.A01
            X.1yf r0 = r0.A01(r1)
            int r1 = X.A78.A00(r0)
            r0 = 2
            if (r1 != r0) goto L_0x0bdc
            X.0ve r2 = r2.A02
            r1 = 4893(0x131d, float:6.857E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0bdd
        L_0x0bdc:
            r0 = 0
        L_0x0bdd:
            X.AnonymousClass3MY.A1M(r3, r0)
            return
        L_0x0be1:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r2.A02
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = (com.whatsapp.biz.catalog.manager.CatalogManager) r0
            java.util.List r0 = r0.A08
            r0.remove(r1)
            return
        L_0x0bed:
            java.lang.Object r0 = r2.A01
            X.1nX r0 = (X.C36221nX) r0
            java.lang.Object r1 = r2.A02
            X.AEW r1 = (X.AEW) r1
            X.00H r0 = r0.A0H
            java.lang.Object r0 = r0.get()
            X.1tC r0 = (X.C39511tC) r0
            r0.A00(r1)
            return
        L_0x0c01:
            java.lang.Object r0 = r2.A01
            X.1nX r0 = (X.C36221nX) r0
            java.lang.Object r2 = r2.A02
            X.76s r2 = (X.C1417276s) r2
            X.1nV r1 = r0.A0F
            java.lang.String r0 = "business activity report/notify-report-available"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1nU r0 = r1.A03
            r0.A03(r2)
            X.6cX r0 = r1.A00
            if (r0 == 0) goto L_0x0c22
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            X.1DT r1 = r0.A02
            r0 = 2
            X.AnonymousClass3MX.A1J(r1, r0)
            return
        L_0x0c22:
            X.1Vn r5 = r1.A02
            r4 = 32
            X.118 r0 = r1.A01
            android.content.Context r6 = X.C108945cZ.A0E(r0)
            r0 = 2131893432(0x7f121cb8, float:1.942164E38)
            java.lang.String r2 = X.C18070vi.A0F(r6, r0)
            X.73t r3 = X.C217217d.A03(r6)
            java.lang.String r0 = "other_notifications@1"
            r3.A0M = r0
            r3.A0F(r2)
            long r0 = java.lang.System.currentTimeMillis()
            r3.A09(r0)
            r0 = 3
            r3.A06(r0)
            r0 = 1
            r3.A0G(r0)
            r0 = 2131898700(0x7f12314c, float:1.9432325E38)
            java.lang.String r0 = r6.getString(r0)
            r3.A0E(r0)
            r3.A0D(r2)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.report.ReportActivity"
            r2.setClassName(r1, r0)
            r0 = 0
            android.app.PendingIntent r0 = X.C1408573i.A00(r6, r0, r2, r0)
            r3.A0A = r0
            X.C17880vN.A1G(r3)
            android.app.Notification r0 = r3.A05()
            X.C18070vi.A0X(r0)
            r5.BkR(r4, r0)
            return
        L_0x0c7c:
            java.lang.Object r0 = r2.A01
            X.3Am r0 = (X.C70293Am) r0
            java.lang.Object r3 = r2.A02
            X.A5M r2 = r0.A00
            r1 = 45
            X.AkH r0 = new X.AkH
            r0.<init>(r2, r3, r1)
            X.A5M.A01(r2, r0)
            return
        L_0x0c8f:
            return
        L_0x0c90:
            return
        L_0x0c91:
            java.lang.String r0 = "wabme2LidMigrationHelper"
        L_0x0c93:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0c98:
            java.lang.String r1 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0ca0:
            return
        L_0x0ca1:
            return
        L_0x0ca2:
            return
        L_0x0ca3:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0ca8:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0cad:
            java.lang.Object r0 = r2.A01
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r0
            java.lang.Object r1 = r2.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.8G8 r0 = r0.A2K()
            X.1DT r3 = r0.A0E
            X.9ce r2 = r0.A0H
            goto L_0x0dee
        L_0x0cbf:
            java.lang.Object r6 = r2.A01
            com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel r6 = (com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel) r6
            java.lang.Object r5 = r2.A02
            X.AEW r5 = (X.AEW) r5
            X.4S5 r1 = r6.A0C
            com.whatsapp.jid.UserJid r0 = r6.A0B
            com.whatsapp.jid.UserJid r0 = r1.A00(r0)
            X.0z4 r1 = r6.A0A
            java.lang.String r0 = r0.getRawString()
            java.lang.String r4 = r1.A0q(r0)
            r3 = 0
            if (r4 == 0) goto L_0x0ce2
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0cee
        L_0x0ce2:
            if (r5 == 0) goto L_0x0cec
            X.ADr r0 = r5.A03
            if (r0 == 0) goto L_0x0cec
            java.lang.String r4 = r0.A00
            if (r4 != 0) goto L_0x0cee
        L_0x0cec:
            java.lang.String r4 = ""
        L_0x0cee:
            X.1DT r2 = r6.A07
            X.9iO r1 = r6.A08
            if (r5 == 0) goto L_0x0cfa
            X.ADr r0 = r5.A03
            if (r0 == 0) goto L_0x0cfa
            java.lang.String r3 = r0.A02
        L_0x0cfa:
            java.lang.String r0 = r1.A00(r4, r3)
            r2.A0E(r0)
            X.1DT r3 = r6.A05
            if (r5 == 0) goto L_0x0d0d
            X.ADr r0 = r5.A03
            if (r0 == 0) goto L_0x0d0d
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x0e26
        L_0x0d0d:
            java.lang.String r0 = "pincode"
            goto L_0x0e26
        L_0x0d11:
            java.lang.Object r0 = r2.A01
            X.8F8 r0 = (X.AnonymousClass8F8) r0
            java.lang.Object r1 = r2.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1DT r3 = r0.A0C
            X.9ce r2 = r0.A0H
            goto L_0x0dee
        L_0x0d1f:
            java.lang.Object r3 = r2.A01
            com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel r3 = (com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel) r3
            java.lang.Object r1 = r2.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.String r2 = "BusinessComplianceViewModel/loadBusinessComplianceDetails/fetch-error"
            r5 = 1
            X.9a5 r4 = r3.A02
            monitor-enter(r4)
            X.9W7 r0 = r4.A00     // Catch:{ all -> 0x0dcc }
            X.10H r0 = r0.A00     // Catch:{ all -> 0x0dcc }
            X.10E r0 = r0.A00     // Catch:{ all -> 0x0dcc }
            X.1OZ r0 = X.AnonymousClass8BU.A0K(r0)     // Catch:{ all -> 0x0dcc }
            X.AcQ r11 = new X.AcQ     // Catch:{ all -> 0x0dcc }
            r11.<init>(r1, r0)     // Catch:{ all -> 0x0dcc }
            X.1OZ r10 = r11.A01     // Catch:{ all -> 0x0dcc }
            java.lang.String r13 = r10.A0B()     // Catch:{ all -> 0x0dcc }
            X.1MD[] r7 = new X.AnonymousClass1MD[r5]     // Catch:{ all -> 0x0dcc }
            com.whatsapp.jid.UserJid r0 = r11.A00     // Catch:{ all -> 0x0dcc }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0dcc }
            java.lang.String r0 = "jid"
            boolean r6 = X.C17890vO.A1W(r0, r1, r7)     // Catch:{ all -> 0x0dcc }
            java.lang.String r0 = "merchant_info"
            X.1ca r8 = X.AnonymousClass8BR.A0k(r0, r7)     // Catch:{ all -> 0x0dcc }
            r0 = 5
            X.1MD[] r7 = new X.AnonymousClass1MD[r0]     // Catch:{ all -> 0x0dcc }
            java.lang.String r1 = "smax_id"
            java.lang.String r0 = "53"
            X.C17880vN.A1Q(r1, r0, r7, r6)     // Catch:{ all -> 0x0dcc }
            java.lang.String r0 = "id"
            X.C17880vN.A1Q(r0, r13, r7, r5)     // Catch:{ all -> 0x0dcc }
            X.8v4 r9 = X.C173438v4.A00     // Catch:{ all -> 0x0dcc }
            java.lang.String r0 = "to"
            X.1MD r1 = new X.1MD     // Catch:{ all -> 0x0dcc }
            r1.<init>((com.whatsapp.jid.Jid) r9, (java.lang.String) r0)     // Catch:{ all -> 0x0dcc }
            r0 = 2
            r7[r0] = r1     // Catch:{ all -> 0x0dcc }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:biz:merchant_info"
            X.AnonymousClass8BV.A1O(r1, r0, r7)     // Catch:{ all -> 0x0dcc }
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.1MD r0 = X.AnonymousClass8BR.A0h(r1, r0)     // Catch:{ all -> 0x0dcc }
            X.1ca r12 = X.AnonymousClass8BW.A0Q(r8, r0, r7)     // Catch:{ all -> 0x0dcc }
            r15 = 32000(0x7d00, double:1.581E-319)
            r14 = 280(0x118, float:3.92E-43)
            r10.A0J(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0dcc }
            X.1Ug r1 = r11.A02     // Catch:{ all -> 0x0dcc }
            X.10I r0 = r4.A01     // Catch:{ all -> 0x0dcc }
            X.C21445AkC.A01(r0, r1, r6)     // Catch:{ all -> 0x0dcc }
            monitor-exit(r4)
            r4 = 3
            java.lang.Object r0 = r1.get()     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            X.C18070vi.A0X(r0)     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            X.9xF r0 = (X.C197779xF) r0     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            java.lang.Object r1 = r0.A01     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            if (r1 == 0) goto L_0x0db0
            X.1DT r0 = r3.A00     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            r0.A0E(r1)     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            X.1DT r1 = r3.A01     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
        L_0x0dac:
            r1.A0E(r0)     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            goto L_0x0dbc
        L_0x0db0:
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            X.1DT r0 = r3.A01     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            X.AnonymousClass3MX.A1K(r0, r5)     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            X.1DT r1 = r3.A00     // Catch:{ ExecutionException -> 0x0dbf, Exception -> 0x0dbd }
            r0 = 0
            goto L_0x0dac
        L_0x0dbc:
            return
        L_0x0dbd:
            r0 = move-exception
            goto L_0x0dc2
        L_0x0dbf:
            r0 = move-exception
            java.lang.String r2 = "BusinessComplianceViewModel/loadBusinessComplianceDetails/delivery-failure"
        L_0x0dc2:
            com.whatsapp.util.Log.e(r2, r0)
            X.1DT r3 = r3.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0e26
        L_0x0dcc:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0dcf:
            java.lang.Object r0 = r2.A01
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r0 = (com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel) r0
            java.lang.Object r1 = r2.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1DT r3 = r0.A0G
            X.00H r0 = r0.A0M
            java.lang.Object r2 = r0.get()
            X.9ce r2 = (X.C185479ce) r2
            goto L_0x0dee
        L_0x0de2:
            java.lang.Object r0 = r2.A01
            X.8GC r0 = (X.AnonymousClass8GC) r0
            java.lang.Object r1 = r2.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1DT r3 = r0.A0B
            X.9ce r2 = r0.A0F
        L_0x0dee:
            X.1PM r0 = r2.A01
            X.1yf r0 = r0.A01(r1)
            int r1 = X.A78.A00(r0)
            r0 = 2
            if (r1 != r0) goto L_0x0e10
            X.0ve r2 = r2.A02
            r0 = 4893(0x131d, float:6.857E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0e10
            r0 = 5114(0x13fa, float:7.166E-42)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0e11
        L_0x0e10:
            r0 = 0
        L_0x0e11:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0e26
        L_0x0e16:
            java.lang.Object r0 = r2.A01
            X.8GC r0 = (X.AnonymousClass8GC) r0
            java.lang.Object r1 = r2.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            X.1DT r3 = r0.A05
            X.1Me r0 = r0.A0K
            java.lang.String r0 = r0.A0I(r1)
        L_0x0e26:
            r3.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21450AkH.run():void");
    }
}
