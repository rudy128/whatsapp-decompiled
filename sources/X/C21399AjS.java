package X;

/* renamed from: X.AjS  reason: case insensitive filesystem */
public class C21399AjS implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;

    public C21399AjS(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A07 = str;
        this.A08 = str2;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = obj6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.1ca[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x028f, code lost:
        r5 = r10.A07;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r0 = r26
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0258;
                case 2: goto L_0x030e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r8 = r0.A02
            X.1ca r8 = (X.C29621ca) r8
            java.lang.Object r1 = r0.A03
            X.9F6 r1 = (X.AnonymousClass9F6) r1
            java.lang.Object r11 = r0.A04
            X.A8q r11 = (X.C20130A8q) r11
            java.lang.String r9 = r0.A08
            java.lang.Object r6 = r0.A05
            java.lang.Object r5 = r0.A06
            X.BBN r5 = (X.BBN) r5
            r10 = 0
            r7 = 1
            r0 = 3
            X.AnonymousClass8BT.A1I(r8, r1, r0)
            java.lang.Object r4 = r1.A00
            X.2rm r3 = X.AnonymousClass8BR.A0s()
            X.A6w r2 = X.A6w.A00
            r0 = 7
            X.AhU r1 = new X.AhU
            r1.<init>(r2, r0)
            java.lang.String[] r0 = X.AnonymousClass8BS.A1b(r7, r10)
            java.lang.Object r7 = r3.A03(r8, r1, r0)
            X.9Cr r7 = (X.C178329Cr) r7
            if (r7 == 0) goto L_0x0048
            r0 = 36
            java.lang.Object r0 = X.C21290Ahb.A02(r8, r3, r4, r2, r0)
            if (r0 != 0) goto L_0x034f
            X.1UI r0 = X.AnonymousClass1O9.A00(r3)
            throw r0
        L_0x0048:
            X.1UI r0 = X.AnonymousClass1O9.A00(r3)
            throw r0
        L_0x004d:
            java.lang.Object r10 = r0.A01
            com.whatsapp.labelitem.view.AddToListViewModel r10 = (com.whatsapp.labelitem.view.AddToListViewModel) r10
            java.lang.Object r3 = r0.A02
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r2 = r0.A03
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.String r1 = r0.A07
            java.lang.Object r14 = r0.A04
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Object r9 = r0.A05
            X.1OS r9 = (X.AnonymousClass1OS) r9
            java.lang.Object r0 = r0.A06
            r25 = r0
            X.C18070vi.A0j(r3, r2)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            r0.A04(r1)
            r8 = 1
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            X.00H r0 = r10.A0E
            X.0vd r1 = X.C17880vN.A0P(r0)
            r0 = 11205(0x2bc5, float:1.5702E-41)
            r1.A0N(r0)
            java.util.ArrayList r0 = X.C29431cG.A0j(r2, r3)
            java.util.Iterator r16 = r0.iterator()
        L_0x008b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0216
            java.lang.Object r1 = r16.next()
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            int r0 = X.AnonymousClass3MZ.A04(r1)
            java.lang.Object r4 = r1.second
            X.4TZ r4 = (X.AnonymousClass4TZ) r4
            int r2 = r4.A00
            if (r0 == r2) goto L_0x008b
            if (r0 == 0) goto L_0x00b1
            if (r0 == r8) goto L_0x013c
            java.lang.String r1 = "label-item-ui/on-click-positive-button/invalid checked state: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0k(r1, r0, r2)
            goto L_0x008b
        L_0x00b1:
            X.1x1 r2 = r4.A01
            r1 = 0
            com.whatsapp.labelitem.view.AddToListViewModel$getJidsForList$1 r0 = new com.whatsapp.labelitem.view.AddToListViewModel$getJidsForList$1
            r0.<init>(r2, r10, r1)
            X.1OR r3 = X.AnonymousClass1OR.A00
            java.lang.Object r2 = X.AnonymousClass4GT.A00(r3, r0)
            java.util.List r2 = (java.util.List) r2
            X.6is r11 = r10.A00
            if (r11 == 0) goto L_0x0118
            X.1x1 r7 = r4.A01
            X.00H r0 = r11.A04
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x010e
            X.00H r0 = r11.A03
            java.lang.Object r5 = r0.get()
            com.whatsapp.lists.ListsRepository r5 = (com.whatsapp.lists.ListsRepository) r5
            java.util.Collection r6 = r11.A05
            X.C18070vi.A0d(r6, r8)
            int r1 = r7.A02
            r0 = 4
            if (r1 != r0) goto L_0x0100
            X.00H r0 = r5.A04
            java.lang.Object r11 = r0.get()
            com.whatsapp.favorite.FavoriteManager r11 = (com.whatsapp.favorite.FavoriteManager) r11
            java.util.List r5 = X.C29431cG.A0t(r6)
            r1 = 3
            r0 = 0
            r11.A05(r0, r5, r1)
            r6.size()
        L_0x00fb:
            r12.add(r7)
            goto L_0x0189
        L_0x0100:
            X.00H r0 = r5.A06
            java.lang.Object r5 = r0.get()
            X.2nH r5 = (X.C60032nH) r5
            long r0 = r7.A03
            r5.A01(r6, r0)
            goto L_0x00fb
        L_0x010e:
            X.2nH r6 = r11.A02
            long r0 = r7.A03
            java.util.Collection r5 = r11.A05
            r6.A01(r5, r0)
            goto L_0x00fb
        L_0x0118:
            java.lang.String r0 = "addToListManager"
            X.C18070vi.A11(r0)
            goto L_0x013a
        L_0x011e:
            java.util.Iterator r3 = r2.iterator()
            r5 = 0
        L_0x0123:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01a3
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r3)
            int r0 = r0.getType()
            if (r0 != r8) goto L_0x0123
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x0123
        L_0x0137:
            X.AnonymousClass1ZU.A0A()
        L_0x013a:
            r0 = 0
            throw r0
        L_0x013c:
            X.1x1 r2 = r4.A01
            r1 = 0
            com.whatsapp.labelitem.view.AddToListViewModel$getJidsForList$1 r0 = new com.whatsapp.labelitem.view.AddToListViewModel$getJidsForList$1
            r0.<init>(r2, r10, r1)
            X.1OR r3 = X.AnonymousClass1OR.A00
            java.lang.Object r2 = X.AnonymousClass4GT.A00(r3, r0)
            java.util.List r2 = (java.util.List) r2
            X.6is r11 = r10.A00
            if (r11 == 0) goto L_0x0118
            X.1x1 r7 = r4.A01
            X.00H r0 = r11.A04
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x020b
            X.00H r0 = r11.A03
            java.lang.Object r5 = r0.get()
            com.whatsapp.lists.ListsRepository r5 = (com.whatsapp.lists.ListsRepository) r5
            java.util.Collection r6 = r11.A05
            X.C18070vi.A0d(r6, r8)
            int r1 = r7.A02
            r0 = 4
            if (r1 != r0) goto L_0x01fc
            X.00H r0 = r5.A04
            java.lang.Object r11 = X.C18070vi.A0E(r0)
            com.whatsapp.favorite.FavoriteManager r11 = (com.whatsapp.favorite.FavoriteManager) r11
            java.util.List r5 = X.C29431cG.A0t(r6)
            r1 = 0
            r0 = 3
            r11.A06(r1, r1, r5, r0)
            r6.size()
        L_0x0186:
            r13.add(r7)
        L_0x0189:
            X.1x1 r15 = r4.A01
            r1 = 0
            com.whatsapp.labelitem.view.AddToListViewModel$getJidsForList$1 r0 = new com.whatsapp.labelitem.view.AddToListViewModel$getJidsForList$1
            r0.<init>(r15, r10, r1)
            java.lang.Object r1 = X.AnonymousClass4GT.A00(r3, r0)
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r2 instanceof java.util.Collection
            r4 = 0
            if (r0 == 0) goto L_0x011e
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x011e
            r5 = 0
        L_0x01a3:
            long r6 = (long) r5
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01e2
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01e2
        L_0x01ae:
            long r4 = (long) r4
            int r0 = r2.size()
            long r2 = (long) r0
            long r2 = r2 - r6
            int r0 = r1.size()
            long r0 = (long) r0
            long r0 = r0 - r4
            X.00H r11 = r10.A0I
            java.lang.Object r11 = r11.get()
            X.4Pp r11 = (X.C85964Pp) r11
            java.lang.Integer r19 = X.C17880vN.A0l()
            java.lang.Long r21 = java.lang.Long.valueOf(r6)
            java.lang.Long r22 = java.lang.Long.valueOf(r4)
            java.lang.Long r23 = java.lang.Long.valueOf(r2)
            java.lang.Long r24 = java.lang.Long.valueOf(r0)
            r17 = r11
            r18 = r15
            r20 = r14
            r17.A00(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x008b
        L_0x01e2:
            java.util.Iterator r3 = r1.iterator()
        L_0x01e6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ae
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r3)
            int r0 = r0.getType()
            if (r0 != r8) goto L_0x01e6
            int r4 = r4 + 1
            if (r4 >= 0) goto L_0x01e6
            goto L_0x0137
        L_0x01fc:
            X.00H r0 = r5.A06
            java.lang.Object r5 = r0.get()
            X.2nH r5 = (X.C60032nH) r5
            long r0 = r7.A03
            r5.A00(r6, r0)
            goto L_0x0186
        L_0x020b:
            X.2nH r6 = r11.A02
            long r0 = r7.A03
            java.util.Collection r5 = r11.A05
            r6.A00(r5, r0)
            goto L_0x0186
        L_0x0216:
            boolean r0 = X.C17880vN.A1X(r13)
            if (r0 != 0) goto L_0x0222
            boolean r0 = X.C17880vN.A1X(r12)
            if (r0 == 0) goto L_0x0233
        L_0x0222:
            X.00H r1 = r10.A0K
            java.lang.Object r0 = r1.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x0252
            r1.get()
        L_0x0233:
            int r0 = r13.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r12.size()
            X.1D6 r4 = X.AnonymousClass1D6.A00(r1, r0)
            X.1KB r3 = r10.A04
            r2 = 8
            X.7R0 r1 = new X.7R0
            r0 = r25
            r1.<init>(r4, r10, r0, r2)
            r3.A0J(r1)
            return
        L_0x0252:
            if (r9 == 0) goto L_0x0233
            r9.invoke(r13, r12)
            goto L_0x0233
        L_0x0258:
            java.lang.Object r10 = r0.A01
            X.8zB r10 = (X.C175728zB) r10
            java.lang.String r5 = r0.A07
            java.lang.Object r6 = r0.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r3 = r0.A03
            X.1KN r3 = (X.AnonymousClass1KN) r3
            java.lang.String r2 = r0.A08
            java.lang.Object r11 = r0.A04
            X.2r1 r11 = (X.C62212r1) r11
            java.lang.Object r12 = r0.A05
            X.9jW r12 = (X.C189609jW) r12
            java.lang.Object r7 = r0.A06
            java.lang.String r0 = "PAY: IndiaUpiPayPrecheckAction sendPrecheck called"
            java.util.ArrayList r8 = X.AnonymousClass8BU.A0w(r0)
            java.lang.String r0 = "action"
            java.lang.String r4 = "pay-precheck"
            X.C17890vO.A11(r0, r4, r8)
            X.2tK r0 = X.C63572tK.A0E
            java.lang.String r1 = "IN"
            java.lang.String r0 = "country"
            X.C17890vO.A11(r0, r1, r8)
            java.lang.String r0 = "credential-id"
            X.C17890vO.A11(r0, r5, r8)
            if (r6 == 0) goto L_0x02a0
            X.0ve r5 = r10.A07
            X.1Ln r1 = r10.A05
            X.190 r0 = r10.A01
            com.whatsapp.jid.UserJid r1 = X.C60432o1.A01(r0, r1, r5, r6, r4)
            if (r1 == 0) goto L_0x02a0
            java.lang.String r0 = "receiver"
            X.C17890vO.A0n(r1, r0, r8)
        L_0x02a0:
            java.lang.String r0 = "version"
            r6 = 1
            X.AnonymousClass8BT.A1T(r0, r8, r6)
            java.lang.String r9 = "nonce"
            X.11P r1 = r10.A04
            X.11S r0 = r10.A03
            r5 = 0
            java.lang.String r0 = X.AnonymousClass1PP.A00(r0, r1, r5)
            X.C17890vO.A11(r9, r0, r8)
            X.1ek r0 = r10.A0E
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "device-id"
            X.C17890vO.A11(r0, r1, r8)
            java.lang.String r0 = "transaction-type"
            X.C17890vO.A11(r0, r2, r8)
            if (r11 == 0) goto L_0x02cd
            java.lang.String r2 = "offer_id"
            long r0 = r11.A01
            X.AnonymousClass8BT.A1U(r2, r8, r0)
        L_0x02cd:
            if (r3 == 0) goto L_0x030c
            X.1ex r2 = r10.A0A
            java.lang.String r1 = "amount"
            X.1KJ r0 = X.AnonymousClass1KL.A0B
            X.1ca r3 = r2.A04(r0, r3, r1)
        L_0x02d9:
            X.9ui r9 = X.C197889xR.A04(r10, r4)
            X.1MD[] r2 = X.AnonymousClass8BT.A1b(r8, r5)
            r0 = 2
            X.1ca[] r1 = new X.C29621ca[r0]
            r1[r5] = r7
            r1[r6] = r3
            java.lang.String r0 = "account"
            X.1ca r16 = X.AnonymousClass8BR.A0l(r0, r2, r1)
            X.90Z r0 = r10.A0D
            X.9r1 r0 = r0.A02
            java.lang.Integer r13 = r0.A00(r4)
            X.1ex r14 = r10.A0A
            android.content.Context r6 = r10.A00
            X.1KB r7 = r10.A02
            X.1jG r8 = r10.A09
            X.8zX r5 = new X.8zX
            r5.<init>((android.content.Context) r6, (X.AnonymousClass1KB) r7, (X.C33711jG) r8, (X.C196259ui) r9, (X.C175728zB) r10, (X.C62212r1) r11, (X.C189609jW) r12, (java.lang.Integer) r13)
            java.lang.String r17 = "set"
            r18 = 30000(0x7530, double:1.4822E-319)
            r15 = r5
            r14.A0I(r15, r16, r17, r18)
            return
        L_0x030c:
            r3 = 0
            goto L_0x02d9
        L_0x030e:
            java.lang.Object r8 = r0.A02
            X.1ca r8 = (X.C29621ca) r8
            java.lang.Object r1 = r0.A03
            X.9F6 r1 = (X.AnonymousClass9F6) r1
            java.lang.Object r11 = r0.A04
            X.A8q r11 = (X.C20130A8q) r11
            java.lang.String r9 = r0.A08
            java.lang.Object r6 = r0.A05
            java.lang.Object r5 = r0.A06
            X.BBN r5 = (X.BBN) r5
            r10 = 0
            r7 = 1
            r0 = 3
            X.AnonymousClass8BT.A1I(r8, r1, r0)
            java.lang.Object r4 = r1.A00
            X.2rm r3 = X.AnonymousClass8BR.A0s()
            X.A6w r2 = X.A6w.A00
            r0 = 6
            X.AhU r1 = new X.AhU
            r1.<init>(r2, r0)
            java.lang.String[] r0 = X.AnonymousClass8BS.A1b(r7, r10)
            java.lang.Object r7 = r3.A03(r8, r1, r0)
            X.9Cr r7 = (X.C178329Cr) r7
            if (r7 == 0) goto L_0x03b5
            r0 = 34
            java.lang.Object r0 = X.C21290Ahb.A02(r8, r3, r4, r2, r0)
            if (r0 != 0) goto L_0x034f
            X.1UI r0 = X.AnonymousClass1O9.A00(r3)
            throw r0
        L_0x034f:
            java.util.Map r1 = r11.A0K
            java.util.Map r0 = r11.A0J
            java.lang.Object r0 = r0.get(r9)
            java.lang.Object r2 = r1.get(r0)
            X.9bU r2 = (X.C184769bU) r2
            if (r2 == 0) goto L_0x03b3
            long r0 = r7.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.C18070vi.A0d(r1, r10)
            X.A27 r0 = r2.A01
            java.lang.String r4 = r0.A03(r1)
        L_0x036e:
            long r0 = r7.A00
            r3 = 0
            X.A1m r2 = new X.A1m
            r2.<init>(r4, r3, r0)
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x0391
            X.Cjk r3 = X.C25489Cgk.A00(r0)
            X.E6J[] r1 = new X.E6J[r10]
            java.lang.String r0 = "$"
            java.lang.Object r4 = r3.A01(r0, r1)
            java.util.Map r4 = (java.util.Map) r4
            long r0 = r2.A00
            java.lang.String r3 = r2.A01
            X.A1m r2 = new X.A1m
            r2.<init>(r3, r4, r0)
        L_0x0391:
            int r15 = r6.hashCode()
            java.lang.String r13 = "iqResponse"
            long r0 = r2.A00
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            X.8zt r10 = r11.A08
            java.lang.String r14 = "error_code"
            X.C20130A8q.A03(r10, r11, r12, r13, r14, r15)
            int r3 = r6.hashCode()
            r1 = 467(0x1d3, float:6.54E-43)
            X.19a r0 = r10.A01
            r0.A04(r3, r1)
            r5.Bu4(r2)
            return
        L_0x03b3:
            r4 = 0
            goto L_0x036e
        L_0x03b5:
            X.1UI r0 = X.AnonymousClass1O9.A00(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21399AjS.run():void");
    }
}
