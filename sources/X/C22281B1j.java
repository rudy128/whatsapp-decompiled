package X;

/* renamed from: X.B1j  reason: case insensitive filesystem */
public final class C22281B1j extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C19989A2b $directoryQplLogger;
    public final /* synthetic */ boolean $isTypeahead;
    public final /* synthetic */ String $query;
    public final /* synthetic */ C195189sw $searchQueryResult;
    public final /* synthetic */ C198529yU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22281B1j(C198529yU r2, C195189sw r3, C19989A2b a2b, String str, boolean z) {
        super(1);
        this.this$0 = r2;
        this.$searchQueryResult = r3;
        this.$isTypeahead = z;
        this.$directoryQplLogger = a2b;
        this.$query = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x012d, code lost:
        if (r0 != null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x019d, code lost:
        if (X.C108965cb.A1b(r7.A04, 1) != false) goto L_0x019f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r22) {
        /*
            r21 = this;
            r5 = r22
            X.9M5 r5 = (X.AnonymousClass9M5) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            r1 = r21
            X.9yU r8 = r1.this$0
            X.9sw r7 = r1.$searchQueryResult
            boolean r3 = r1.$isTypeahead
            X.A2b r0 = r1.$directoryQplLogger
            java.lang.String r4 = r1.$query
            java.util.Set r2 = r7.A04
            java.lang.Integer r1 = X.C17880vN.A0i()
            r2.add(r1)
            boolean r1 = r5 instanceof X.C169228kZ
            if (r1 == 0) goto L_0x0130
            if (r3 == 0) goto L_0x00d8
            X.8kZ r5 = (X.C169228kZ) r5
            X.00H r1 = r8.A03
            java.lang.Object r1 = r1.get()
            X.9zr r1 = (X.C199359zr) r1
            X.9hi r10 = r5.A00
            r1.A01(r10)
            java.util.List r9 = r10.A0C
            X.C18070vi.A0W(r9)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r9.iterator()
        L_0x003f:
            boolean r1 = r4.hasNext()
            r6 = 1
            if (r1 == 0) goto L_0x005d
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.AF0 r2 = (X.AF0) r2
            X.9qN r1 = r7.A01
            X.C18070vi.A0b(r2)
            boolean r1 = X.C196569vH.A01(r1, r2)
            r6 = r6 ^ r1
            if (r6 == 0) goto L_0x003f
            r5.add(r3)
            goto L_0x003f
        L_0x005d:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r5.iterator()
        L_0x0065:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r2 = r4.next()
            X.9hi r1 = r7.A02
            java.util.List r1 = r1.A0C
            boolean r1 = r1.contains(r2)
            X.AnonymousClass3MZ.A1V(r2, r3, r1)
            goto L_0x0065
        L_0x007b:
            X.9hi r12 = r7.A02
            java.util.List r5 = r12.A0C
            int r2 = r3.size()
            int r1 = r5.size()
            int r1 = 3 - r1
            int r2 = java.lang.Math.min(r2, r1)
            r1 = 0
            java.util.List r1 = r3.subList(r1, r2)
            r5.addAll(r1)
            java.util.List r4 = r10.A09
            X.C18070vi.A0W(r4)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r4.iterator()
        L_0x00a2:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r3 = r13.next()
            r2 = r3
            X.AF0 r2 = (X.AF0) r2
            X.9qN r1 = r7.A01
            X.C18070vi.A0b(r2)
            boolean r1 = X.C196569vH.A01(r1, r2)
            X.AnonymousClass3MZ.A1V(r3, r11, r1)
            goto L_0x00a2
        L_0x00bc:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r11.iterator()
        L_0x00c4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0151
            java.lang.Object r2 = r3.next()
            java.util.List r1 = r12.A09
            boolean r1 = r1.contains(r2)
            X.AnonymousClass3MZ.A1V(r2, r13, r1)
            goto L_0x00c4
        L_0x00d8:
            X.9hi r3 = r7.A02
            java.util.List r15 = r3.A09
            X.8kZ r5 = (X.C169228kZ) r5
            X.9hi r2 = r5.A00
            java.util.List r1 = r2.A09
            X.C18070vi.A0W(r1)
            r15.addAll(r1)
            java.util.List r6 = r3.A0C
            java.util.List r1 = r2.A0C
            X.C18070vi.A0W(r1)
            r6.addAll(r1)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r3 = r8.A00
            if (r3 == 0) goto L_0x012d
            X.0wS r14 = X.C18460wS.A00
            java.util.List r5 = r2.A0B
            X.C18070vi.A0W(r5)
            java.lang.String r10 = r2.A04
            java.lang.String r11 = r2.A07
            java.lang.Double r9 = r2.A02
            java.lang.String r12 = r2.A06
            java.lang.String r13 = r2.A03
            r1 = 0
            X.A1X r8 = new X.A1X
            r8.<init>(r1, r14)
            X.9tl r7 = new X.9tl
            r16 = r6
            r17 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.A1Z r6 = r2.A01
            java.lang.String r5 = r2.A05
            java.lang.String r2 = r2.A08
            X.1KB r1 = r3.A0J
            r15 = 0
            X.Aj9 r8 = new X.Aj9
            r10 = r7
            r12 = r4
            r13 = r5
            r14 = r2
            r9 = r3
            r11 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.A0J(r8)
        L_0x012d:
            if (r0 == 0) goto L_0x01a2
            goto L_0x019f
        L_0x0130:
            boolean r1 = r5 instanceof X.C169218kY
            if (r1 == 0) goto L_0x01a2
            X.8kY r5 = (X.C169218kY) r5
            int r6 = r5.A00
            r7.A00 = r6
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r5 = r8.A00
            if (r5 == 0) goto L_0x014b
            java.lang.String r4 = r7.A03
            X.1KB r3 = r5.A0J
            r2 = 2
            X.AkL r1 = new X.AkL
            r1.<init>(r5, r4, r6, r2)
            r3.A0J(r1)
        L_0x014b:
            if (r0 == 0) goto L_0x01a2
            r0.A00()
            goto L_0x01a2
        L_0x0151:
            int r1 = r5.size()
            int r1 = 3 - r1
            int r11 = java.lang.Math.max(r1, r6)
            java.util.List r3 = r12.A09
            int r2 = r13.size()
            int r1 = r3.size()
            int r11 = r11 - r1
            X.AnonymousClass8BW.A1P(r13, r3, r2, r11)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r11 = r8.A00
            if (r11 == 0) goto L_0x0195
            java.lang.String r14 = r7.A03
            java.util.List r8 = r12.A0A
            X.A1Z r13 = r10.A01
            java.lang.String r15 = r10.A05
            java.lang.String r2 = r10.A08
            X.9qN r12 = r7.A01
            java.util.Set r1 = r7.A04
            boolean r1 = X.C108965cb.A1b(r1, r6)
            r20 = r1 ^ 1
            r9.size()
            r4.size()
            r4.size()
            r18 = r5
            r19 = r3
            r16 = r2
            r17 = r8
            r11.A0V(r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0195:
            if (r0 == 0) goto L_0x01a2
            java.util.Set r1 = r7.A04
            boolean r1 = X.C108965cb.A1b(r1, r6)
            if (r1 == 0) goto L_0x01a2
        L_0x019f:
            r0.A01()
        L_0x01a2:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22281B1j.invoke(java.lang.Object):java.lang.Object");
    }
}
