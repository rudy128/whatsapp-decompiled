package X;

/* renamed from: X.Dr5  reason: case insensitive filesystem */
public final class C28091Dr5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C17330uU $drawArea;
    public final /* synthetic */ C17330uU $frameTime;
    public final /* synthetic */ C17330uU $particles;
    public final /* synthetic */ C98494rF $partySystems;
    public final /* synthetic */ E33 $updateListener = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28091Dr5(C17330uU r2, C17330uU r3, C17330uU r4, C98494rF r5) {
        super(1);
        this.$frameTime = r2;
        this.$particles = r3;
        this.$partySystems = r5;
        this.$drawArea = r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: X.CaX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: X.CaX} */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v101, types: [java.lang.Object, X.CaX] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
        if (r11 >= r13) goto L_0x00be;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r40) {
        /*
            r39 = this;
            long r6 = X.C17880vN.A05(r40)
            r5 = r39
            X.0uU r0 = r5.$frameTime
            java.lang.Object r0 = r0.getValue()
            long r1 = X.C17880vN.A05(r0)
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            X.0uU r0 = r5.$frameTime
            java.lang.Object r0 = r0.getValue()
            long r0 = X.C17880vN.A05(r0)
            long r3 = r6 - r0
        L_0x0022:
            X.0uU r1 = r5.$frameTime
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.setValue(r0)
            X.0uU r0 = r5.$particles
            r38 = r0
            X.4rF r0 = r5.$partySystems
            java.lang.Object r1 = r0.element
            java.lang.String r0 = "partySystems"
            if (r1 != 0) goto L_0x003c
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x003c:
            java.util.List r1 = (java.util.List) r1
            X.0uU r0 = r5.$drawArea
            r37 = r0
            java.util.ArrayList r25 = X.C29351c6.A0D(r1)
            java.util.Iterator r24 = r1.iterator()
        L_0x004a:
            boolean r0 = r24.hasNext()
            if (r0 == 0) goto L_0x031b
            java.lang.Object r2 = r24.next()
            X.CRv r2 = (X.C24971CRv) r2
            long r0 = r2.A01
            long r5 = X.AnonymousClass8BR.A04(r0)
            r16 = 0
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            X.0wS r11 = X.C18460wS.A00
        L_0x0064:
            r0 = r25
            r0.add(r11)
            goto L_0x004a
        L_0x006a:
            X.Cib r10 = r2.A00
            X.C5L r9 = r10.A05
            long r0 = r9.A01
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0080
            float r6 = r10.A01
            float r5 = (float) r0
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0080
            java.util.List r0 = r2.A02
            r0.size()
        L_0x0080:
            float r8 = (float) r3
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 / r0
            java.lang.Object r7 = r37.getValue()
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            java.util.List r0 = r2.A02
            r36 = r0
            X.CbN r6 = r2.A03
            float r12 = r10.A00
            float r12 = r12 + r8
            r10.A00 = r12
            long r0 = r9.A01
            float r13 = (float) r0
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r13 / r2
            float r11 = r10.A01
            r2 = 0
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00ae
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ae
            r10.A00 = r5
            r12 = r5
        L_0x00ae:
            X.0wS r5 = X.C18460wS.A00
            float r2 = r9.A00
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 < 0) goto L_0x00be
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x01a5
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x01a5
        L_0x00be:
            float r1 = r10.A01
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r8 * r0
            float r1 = r1 + r6
            r10.A01 = r1
            r0 = r36
            r0.addAll(r5)
            java.util.Iterator r14 = r36.iterator()
        L_0x00d0:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r5 = r14.next()
            X.CUO r5 = (X.CUO) r5
            X.CaX r10 = r5.A08
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            X.CaX r2 = r5.A07
            r9 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A0C
            float r9 = r9 / r0
            float r1 = r2.A00
            float r0 = r10.A00
            float r0 = r0 * r9
            float r1 = r1 + r0
            r2.A00 = r1
            float r1 = r2.A01
            float r0 = r10.A01
            float r0 = r0 * r9
            float r1 = r1 + r0
            r2.A01 = r1
            r13 = 0
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            r0 = 1114636288(0x42700000, float:60.0)
            if (r1 <= 0) goto L_0x0103
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r8
        L_0x0103:
            r5.A00 = r0
            X.CaX r10 = r5.A09
            float r1 = r10.A01
            int r0 = r7.height()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0116
            r0 = 0
            r5.A04 = r0
            goto L_0x00d0
        L_0x0116:
            X.CaX r1 = r5.A0A
            float r11 = r1.A00
            float r0 = r2.A00
            float r11 = r11 + r0
            r1.A00 = r11
            float r9 = r1.A01
            float r0 = r2.A01
            float r9 = r9 + r0
            r1.A01 = r9
            r0 = 1063675494(0x3f666666, float:0.9)
            float r11 = r11 * r0
            r1.A00 = r11
            float r9 = r9 * r0
            r1.A01 = r9
            float r2 = r5.A00
            float r1 = r2 * r8
            float r0 = r5.A0D
            float r1 = r1 * r0
            float r12 = r10.A00
            float r11 = r11 * r1
            float r12 = r12 + r11
            r10.A00 = r12
            float r11 = r10.A01
            float r9 = r9 * r1
            float r11 = r11 + r9
            r10.A01 = r11
            long r9 = r5.A06
            long r0 = (long) r6
            long r9 = r9 - r0
            r5.A06 = r9
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x015a
            r0 = 1084227584(0x40a00000, float:5.0)
            float r0 = r0 * r8
            float r0 = r0 * r2
            int r1 = r5.A04
            int r0 = (int) r0
            int r1 = r1 - r0
            r0 = 0
            if (r1 >= r0) goto L_0x0158
            r1 = 0
        L_0x0158:
            r5.A04 = r1
        L_0x015a:
            float r1 = r5.A01
            float r0 = r5.A0E
            float r0 = r0 * r8
            float r0 = r0 * r2
            float r1 = r1 + r0
            r5.A01 = r1
            r0 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x016b
            r5.A01 = r13
        L_0x016b:
            float r1 = r5.A02
            float r0 = r5.A0F
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 * r8
            float r0 = r0 * r2
            float r1 = r1 - r0
            r5.A02 = r1
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0180
            float r1 = r5.A0G
            r5.A02 = r1
        L_0x0180:
            float r0 = r5.A0G
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = X.C108945cZ.A00(r1, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            r5.A03 = r1
            int r0 = r5.A04
            int r2 = r0 << 24
            int r1 = r5.A0H
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r2 = r2 | r1
            r5.A05 = r2
            int r1 = (int) r12
            int r0 = (int) r11
            boolean r0 = r7.contains(r1, r0)
            r5.A0B = r0
            goto L_0x00d0
        L_0x01a5:
            float r12 = r12 / r2
            int r2 = (int) r12
            r1 = 1
            X.1Oc r0 = new X.1Oc
            r0.<init>(r1, r2)
            java.util.ArrayList r5 = X.C29351c6.A0D(r0)
            java.util.Iterator r23 = r0.iterator()
        L_0x01b5:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x02aa
            r0 = r23
            X.20T r0 = (X.AnonymousClass20T) r0
            r0.A00()
            int r0 = r10.A02
            int r0 = r0 + 1
            r10.A02 = r0
            java.util.List r1 = r6.A02
            java.util.Random r13 = r10.A04
            int r0 = r1.size()
            int r0 = r13.nextInt(r0)
            java.lang.Object r1 = r1.get(r0)
            X.Cly r1 = (X.C25787Cly) r1
            float r11 = X.BE6.A02(r7)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r0
            int r0 = r7.height()
            float r2 = (float) r0
            r0 = 1039516303(0x3df5c28f, float:0.12)
            float r2 = r2 * r0
            X.DuN r0 = new X.DuN
            r0.<init>(r11, r2)
            float r11 = r0.A00
            float r2 = r0.A01
            X.CaX r22 = new X.CaX
            r22.<init>()
            r0 = r22
            r0.A00 = r11
            r0.A01 = r2
            int r0 = r1.A01
            float r0 = (float) r0
            r21 = r0
            float r0 = r10.A03
            r20 = r0
            float r21 = r21 * r0
            float r12 = r1.A00
            float r1 = r13.nextFloat()
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            float r0 = r12 * r1
            float r12 = r12 + r0
            java.util.List r1 = r6.A01
            int r0 = r1.size()
            int r0 = r13.nextInt(r0)
            java.lang.Object r15 = r1.get(r0)
            X.E34 r15 = (X.E34) r15
            java.util.List r1 = r6.A00
            int r0 = r1.size()
            int r0 = r13.nextInt(r0)
            int r35 = X.AnonymousClass001.A0n(r1, r0)
            r1 = 1102053376(0x41b00000, float:22.0)
            r0 = 0
            r11 = 0
            float r1 = r1 - r0
            float r0 = r13.nextFloat()
            float r1 = r1 * r0
            float r11 = r11 + r1
            r18 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = r13.nextDouble()
            double r18 = r18 * r0
            r0 = -4582834833314545664(0xc066800000000000, double:-180.0)
            double r18 = r18 + r0
            double r18 = java.lang.Math.toRadians(r18)
            double r0 = java.lang.Math.cos(r18)
            float r2 = (float) r0
            float r2 = r2 * r11
            double r0 = java.lang.Math.sin(r18)
            float r14 = (float) r0
            float r11 = r11 * r14
            X.CaX r0 = new X.CaX
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r11
            float r11 = r13.nextFloat()
            r1 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r1
            r33 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 - r33
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r33 * r1
            float r1 = r2 * r11
            float r33 = r33 + r1
            r1 = 1090519040(0x41000000, float:8.0)
            float r33 = r33 * r1
            float r11 = r13.nextFloat()
            r1 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r32 = X.C17880vN.A00(r11, r1, r2)
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r32 = r32 * r1
            X.CUO r1 = new X.CUO
            r26 = r1
            r27 = r15
            r28 = r22
            r29 = r0
            r30 = r21
            r31 = r12
            r34 = r20
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r5.add(r1)
            goto L_0x01b5
        L_0x02aa:
            float r1 = r10.A00
            float r0 = r9.A00
            float r1 = r1 % r0
            r10.A00 = r1
            goto L_0x00be
        L_0x02b3:
            X.DsF r1 = X.C28155DsF.A00
            r0 = r36
            X.C29401cD.A0N(r0, r1)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r36.iterator()
        L_0x02c2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02d7
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.CUO r0 = (X.CUO) r0
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x02c2
            r5.add(r1)
            goto L_0x02c2
        L_0x02d7:
            java.util.ArrayList r11 = X.C29351c6.A0D(r5)
            java.util.Iterator r12 = r5.iterator()
        L_0x02df:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r1 = r12.next()
            X.CUO r1 = (X.CUO) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.CaX r0 = r1.A09
            float r10 = r0.A00
            float r9 = r0.A01
            float r8 = r1.A0G
            int r7 = r1.A05
            float r6 = r1.A01
            float r5 = r1.A03
            X.E34 r2 = r1.A0I
            int r1 = r1.A04
            X.CbW r0 = new X.CbW
            r18 = r8
            r13 = r0
            r14 = r2
            r15 = r10
            r16 = r9
            r17 = r8
            r19 = r6
            r20 = r5
            r21 = r7
            r22 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r11.add(r0)
            goto L_0x02df
        L_0x031b:
            java.util.ArrayList r1 = X.C29351c6.A0F(r25)
            r0 = r38
            r0.setValue(r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28091Dr5.invoke(java.lang.Object):java.lang.Object");
    }
}
