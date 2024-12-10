package X;

import java.util.List;

/* renamed from: X.2kH  reason: invalid class name and case insensitive filesystem */
public class C58182kH {
    public int A00;
    public int A01;
    public int A02;
    public C59372mC A03;
    public C19999A2n A04;
    public C165718be A05;
    public Integer A06;
    public Long A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public byte[] A0B = null;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E;
    public final String A0F;
    public final List A0G;
    public final byte[] A0H;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.2n3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r13v1, types: [X.2n3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C187659gA A00() {
        /*
            r29 = this;
            r2 = r29
            java.util.List r0 = r2.A09
            if (r0 != 0) goto L_0x0019
            X.8be r0 = r2.A05
            if (r0 != 0) goto L_0x0019
            java.lang.String r3 = r2.A0F
            java.util.List r4 = r2.A0G
            byte[] r6 = r2.A0H
            r1 = 0
            X.9gA r0 = new X.9gA
            r5 = r1
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0019:
            X.2BT r0 = X.AnonymousClass2BT.DEFAULT_INSTANCE
            X.Bmt r4 = r0.A0N()
            java.util.List r5 = r2.A09
            if (r5 == 0) goto L_0x0257
            X.Bm6 r3 = X.C17880vN.A0G(r4)
            X.2BT r3 = (X.AnonymousClass2BT) r3
            X.EE9 r1 = r3.mutations_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0038
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r3.mutations_ = r1
        L_0x0038:
            X.DND.A09(r5, r1)
        L_0x003b:
            X.A2n r0 = r2.A04
            if (r0 == 0) goto L_0x0070
            X.8Xs r0 = X.C164148Xs.DEFAULT_INSTANCE
            X.Bmt r5 = r0.A0N()
            X.A2n r0 = r2.A04
            byte[] r0 = r0.A00
            X.BmB r3 = X.C17900vP.A03(r5, r0)
            X.Bm6 r1 = r5.A00
            X.8Xs r1 = (X.C164148Xs) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.id_ = r3
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.2BT r1 = (X.AnonymousClass2BT) r1
            X.Bm6 r0 = r5.A0C()
            X.8Xs r0 = (X.C164148Xs) r0
            r0.getClass()
            r1.keyId_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
        L_0x0070:
            byte[] r0 = r2.A0E
            if (r0 == 0) goto L_0x0084
            X.BmB r3 = X.C17900vP.A03(r4, r0)
            X.Bm6 r1 = r4.A00
            X.2BT r1 = (X.AnonymousClass2BT) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.snapshotMac_ = r3
        L_0x0084:
            byte[] r0 = r2.A0D
            if (r0 == 0) goto L_0x0098
            X.BmB r3 = X.C17900vP.A03(r4, r0)
            X.Bm6 r1 = r4.A00
            X.2BT r1 = (X.AnonymousClass2BT) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.patchMac_ = r3
        L_0x0098:
            java.lang.Integer r0 = r2.A06
            if (r0 == 0) goto L_0x00ae
            int r3 = r0.intValue()
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.2BT r1 = (X.AnonymousClass2BT) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.deviceIndex_ = r3
        L_0x00ae:
            byte[] r0 = r2.A0B
            if (r0 == 0) goto L_0x0199
            java.lang.Long r0 = r2.A07
            if (r0 == 0) goto L_0x0199
            byte[] r6 = r2.A0H
            if (r6 == 0) goto L_0x0199
            X.2BU r0 = X.AnonymousClass2BU.DEFAULT_INSTANCE
            X.Bmt r5 = r0.A0N()
            byte[] r0 = r2.A0B
            X.BmB r3 = X.C17900vP.A03(r5, r0)
            X.Bm6 r1 = r5.A00
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.currentLthash_ = r3
            X.BmB r3 = X.C17900vP.A03(r5, r6)
            X.Bm6 r1 = r5.A00
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.newLthash_ = r3
            java.lang.Long r0 = r2.A07
            long r6 = r0.longValue()
            r0 = 8
            byte[] r3 = new byte[r0]
            r0 = 0
            X.A8G.A02(r3, r0, r6)
            r1 = 0
            r0 = 8
            X.BmB r3 = X.DSQ.A01(r3, r1, r0)
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.patchVersion_ = r3
            java.lang.String r1 = r2.A0F
            java.nio.charset.Charset r0 = X.C19620yd.A0C
            byte[] r0 = r1.getBytes(r0)
            X.BmB r3 = X.C17900vP.A03(r5, r0)
            X.Bm6 r1 = r5.A00
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.collectionName_ = r3
            byte[] r0 = r2.A0C
            if (r0 == 0) goto L_0x0131
            X.BmB r3 = X.C17900vP.A03(r5, r0)
            X.Bm6 r1 = r5.A00
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.newLthashSubtract_ = r3
        L_0x0131:
            int r3 = r2.A00
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.numberAdd_ = r3
            int r3 = r2.A02
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.numberRemove_ = r3
            int r3 = r2.A01
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.numberOverride_ = r3
            X.2RF r0 = X.AnonymousClass2RF.Android
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r0.value
            r1.senderPlatform_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            boolean r3 = r2.A0A
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.2BU r1 = (X.AnonymousClass2BU) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.isSenderPrimary_ = r3
            X.Bm6 r0 = r5.A0C()
            X.BmB r3 = r0.A0K()
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.2BT r1 = (X.AnonymousClass2BT) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.clientDebugData_ = r3
        L_0x0199:
            X.Bm6 r3 = r4.A0C()
            X.2BT r3 = (X.AnonymousClass2BT) r3
            java.lang.String r1 = r2.A0F
            java.util.List r12 = r2.A0G
            byte[] r10 = r2.A0H
            if (r3 == 0) goto L_0x0254
            r0 = 0
            int r0 = r3.A0J(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x01b0:
            java.util.List r5 = r2.A08
            r16 = 0
            if (r5 == 0) goto L_0x01e5
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L_0x01e5
            X.A2n r15 = r2.A04
            X.2mC r14 = r2.A03
            if (r4 == 0) goto L_0x01c6
            java.lang.Long r16 = X.C17890vO.A0N(r4)
        L_0x01c6:
            byte[] r4 = r2.A0D
            byte[] r0 = r2.A0E
            r17 = 0
            r25 = 1
            X.2n3 r13 = new X.2n3
            r20 = r17
            r23 = r17
            r18 = r17
            r26 = r25
            r19 = r1
            r21 = r4
            r22 = r0
            r24 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r16 = r13
        L_0x01e5:
            r19 = 0
            if (r5 == 0) goto L_0x026d
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L_0x026d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x026d
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r12.iterator()
        L_0x01fd:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x026b
            java.lang.Object r11 = r13.next()
            X.A8l r11 = (X.C20126A8l) r11
            java.lang.String r8 = r11.A06
            X.A2n r7 = r11.A00
            X.2rJ r6 = r11.A05
            java.lang.String r24 = r11.A0B()
            byte[] r5 = r11.A01
            byte[] r0 = r11.A0E()
            if (r0 != 0) goto L_0x024a
            r22 = r19
        L_0x021d:
            byte[] r4 = r2.A0D
            boolean r0 = r11 instanceof X.C170598qH
            if (r0 == 0) goto L_0x0248
            X.8qH r11 = (X.C170598qH) r11
            X.1BI r0 = r11.getChatJid()
            boolean r0 = r0 instanceof X.AnonymousClass1E2
        L_0x022b:
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r0)
            r27 = 1
            X.2n0 r0 = new X.2n0
            r18 = r6
            r20 = r7
            r23 = r8
            r25 = r5
            r26 = r4
            r28 = r27
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r9.add(r0)
            goto L_0x01fd
        L_0x0248:
            r0 = 0
            goto L_0x022b
        L_0x024a:
            byte[] r0 = r11.A0E()
            int r0 = r0.length
            java.lang.Long r22 = X.C17880vN.A0n(r0)
            goto L_0x021d
        L_0x0254:
            r4 = 0
            goto L_0x01b0
        L_0x0257:
            X.8be r0 = r2.A05
            if (r0 == 0) goto L_0x003b
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.2BT r1 = (X.AnonymousClass2BT) r1
            r1.externalMutations_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            goto L_0x003b
        L_0x026b:
            r19 = r9
        L_0x026d:
            X.9gA r0 = new X.9gA
            r4 = r0
            r5 = r16
            r6 = r3
            r7 = r1
            r8 = r12
            r9 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58182kH.A00():X.9gA");
    }

    public C58182kH(String str, List list, List list2, byte[] bArr) {
        this.A0F = str;
        this.A0G = list;
        this.A0H = bArr;
        this.A08 = list2;
    }
}
