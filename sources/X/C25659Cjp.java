package X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Cjp  reason: case insensitive filesystem */
public final class C25659Cjp {
    public static final C25659Cjp A02 = new C25659Cjp();
    public final E22 A00;
    public final ConcurrentMap A01 = AnonymousClass8BR.A17();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.DJe} */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.DJd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.EAC A00(java.lang.Class r39) {
        /*
            r38 = this;
            java.lang.String r1 = "messageType"
            java.nio.charset.Charset r0 = X.C25461CgE.A04
            r7 = r39
            if (r39 == 0) goto L_0x022f
            r0 = r38
            java.util.concurrent.ConcurrentMap r15 = r0.A01
            java.lang.Object r4 = r15.get(r7)
            X.EAC r4 = (X.EAC) r4
            if (r4 != 0) goto L_0x022e
            X.E22 r1 = r0.A00
            X.DJf r1 = (X.C26924DJf) r1
            java.lang.Class r0 = X.C26297CxA.A03
            java.lang.Class<X.Beh> r2 = X.C23293Beh.class
            boolean r0 = r2.isAssignableFrom(r7)
            if (r0 != 0) goto L_0x0033
            java.lang.Class r0 = X.C26297CxA.A03
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0033:
            X.E80 r0 = r1.A00
            X.E1z r3 = r0.CTF(r7)
            r10 = r3
            X.DJW r10 = (X.DJW) r10
            X.CkY r6 = r10.A01
            int r4 = r6.A0I
            r1 = 2
            r0 = r4 & 2
            if (r0 != r1) goto L_0x006c
            boolean r0 = r2.isAssignableFrom(r7)
            if (r0 == 0) goto L_0x005f
            X.CB8 r2 = X.C26297CxA.A02
            X.CB7 r1 = X.CH7.A00
        L_0x004f:
            X.EDY r0 = r10.A00
            X.DJd r4 = new X.DJd
            r4.<init>(r1, r0, r2)
        L_0x0056:
            java.lang.Object r0 = r15.putIfAbsent(r7, r4)
            X.EAC r0 = (X.EAC) r0
            if (r0 == 0) goto L_0x022e
            return r0
        L_0x005f:
            X.CB8 r2 = X.C26297CxA.A00
            X.CB7 r1 = X.CH7.A01
            if (r1 != 0) goto L_0x004f
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x006c:
            boolean r2 = r2.isAssignableFrom(r7)
            r1 = 1
            r5 = r4 & 1
            boolean r0 = X.AnonymousClass000.A1T(r5, r1)
            if (r2 == 0) goto L_0x01e7
            X.E20 r27 = X.CHB.A01
            X.CH9 r24 = X.CH9.A01
            X.CB8 r28 = X.C26297CxA.A02
            if (r0 == 0) goto L_0x01e1
            X.CB7 r23 = X.CH7.A00
            X.E1y r25 = X.CHA.A01
        L_0x0085:
            sun.misc.Unsafe r0 = X.C26923DJe.A0F
            boolean r0 = r3 instanceof X.DJW
            if (r0 == 0) goto L_0x0220
            if (r5 == r1) goto L_0x008e
            r1 = 2
        L_0x008e:
            r0 = 2
            r4 = 1
            boolean r37 = X.AnonymousClass000.A1T(r1, r0)
            int r0 = r6.A0M
            if (r0 != 0) goto L_0x01d7
            r0 = 0
            r14 = 0
            r16 = 0
        L_0x009c:
            int r1 = r0 << 2
            int[] r3 = new int[r1]
            int r0 = r0 << 1
            java.lang.Object[] r13 = new java.lang.Object[r0]
            int r0 = r6.A0O
            r12 = 0
            if (r0 <= 0) goto L_0x01d3
            int[] r0 = new int[r0]
            r22 = r0
        L_0x00ad:
            int r0 = r6.A0Q
            if (r0 <= 0) goto L_0x00b3
            int[] r12 = new int[r0]
        L_0x00b3:
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x01ff
            int r8 = r6.A01
            r2 = 0
            r21 = 0
            r20 = 0
        L_0x00c0:
            int r0 = r6.A0L
            if (r8 >= r0) goto L_0x00d6
            int r0 = r8 - r14
            int r0 = r0 << 2
            if (r2 >= r0) goto L_0x00d6
            r1 = 0
        L_0x00cb:
            int r9 = r2 + r1
            r0 = -1
            r3[r9] = r0
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x015f
            goto L_0x00cb
        L_0x00d6:
            int r1 = r6.A03
            X.C02 r19 = X.C02.A09
            r0 = r19
            int r0 = r0.id
            if (r1 <= r0) goto L_0x0192
            int r0 = r6.A04
            int r8 = r0 << 1
            java.lang.Object[] r9 = r6.A0S
            r0 = r9[r8]
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0186
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L_0x00ee:
            X.CnI r8 = X.C26267CwC.A02
            long r0 = r8.A06(r0)
            int r11 = (int) r0
            int r0 = r6.A04
            int r0 = r0 << 1
            int r17 = r0 + 1
            r1 = r9[r17]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x017a
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0103:
            long r0 = r8.A06(r1)
            int r8 = (int) r0
            r9 = 0
        L_0x0109:
            int r0 = r6.A01
            r3[r2] = r0
            int r18 = r2 + 1
            int r1 = r6.A02
            r0 = r1 & 512(0x200, float:7.175E-43)
            r17 = 0
            if (r0 == 0) goto L_0x0119
            r17 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0119:
            r0 = r1 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L_0x0120
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0120:
            r17 = r17 | r1
            int r0 = r6.A03
            int r1 = r0 << 20
            r17 = r17 | r1
            r17 = r17 | r11
            r3[r18] = r17
            int r11 = r2 + 2
            int r1 = r9 << 20
            r1 = r1 | r8
            r3[r11] = r1
            java.lang.Object r8 = r6.A09
            if (r8 == 0) goto L_0x013c
            int r1 = r2 / 4
            int r1 = r1 << r4
            r13[r1] = r8
        L_0x013c:
            java.lang.Object r8 = r6.A07
            if (r8 != 0) goto L_0x0144
            java.lang.Object r8 = r6.A08
            if (r8 == 0) goto L_0x014b
        L_0x0144:
            int r1 = r2 / 4
            int r1 = r1 << r4
            int r1 = r1 + 1
            r13[r1] = r8
        L_0x014b:
            int r1 = r19.ordinal()
            if (r0 != r1) goto L_0x0163
            int r0 = r21 + 1
            r22[r21] = r2
            r21 = r0
        L_0x0157:
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x01ff
            int r8 = r6.A01
        L_0x015f:
            int r2 = r2 + 4
            goto L_0x00c0
        L_0x0163:
            r1 = 18
            if (r0 < r1) goto L_0x0157
            r1 = 49
            if (r0 > r1) goto L_0x0157
            int r8 = r20 + 1
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            r12[r20] = r1
            r20 = r8
            goto L_0x0157
        L_0x017a:
            java.lang.Class r0 = r6.A06
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = X.C25703CkY.A00(r0, r1)
            r9[r17] = r1
            goto L_0x0103
        L_0x0186:
            java.lang.Class r1 = r6.A06
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = X.C25703CkY.A00(r1, r0)
            r9[r8] = r0
            goto L_0x00ee
        L_0x0192:
            java.lang.reflect.Field r0 = r6.A0A
            X.CnI r8 = X.C26267CwC.A02
            long r0 = r8.A06(r0)
            int r11 = (int) r0
            if (r5 != r4) goto L_0x01cf
            int r1 = r6.A03
            X.C02 r0 = X.C02.A03
            int r0 = r0.id
            if (r1 > r0) goto L_0x01cf
            int r0 = r6.A0N
            int r17 = r0 << 1
            int r0 = r6.A05
            int r0 = r0 / 32
            int r17 = r17 + r0
            java.lang.Object[] r9 = r6.A0S
            r1 = r9[r17]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01c4
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01b9:
            long r0 = r8.A06(r1)
            int r8 = (int) r0
            int r0 = r6.A05
            int r9 = r0 % 32
            goto L_0x0109
        L_0x01c4:
            java.lang.Class r0 = r6.A06
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = X.C25703CkY.A00(r0, r1)
            r9[r17] = r1
            goto L_0x01b9
        L_0x01cf:
            r9 = 0
            r8 = 0
            goto L_0x0109
        L_0x01d3:
            r22 = r12
            goto L_0x00ad
        L_0x01d7:
            int r14 = r6.A0J
            int r0 = r6.A0K
            r16 = r0
            int r0 = r6.A0P
            goto L_0x009c
        L_0x01e1:
            r23 = 0
            X.E1y r25 = X.CHA.A01
            goto L_0x0085
        L_0x01e7:
            X.E20 r27 = X.CHB.A00
            X.CH9 r24 = X.CH9.A00
            if (r0 == 0) goto L_0x01f7
            X.CB8 r28 = X.C26297CxA.A00
            X.CB7 r23 = X.CH7.A01
            if (r23 == 0) goto L_0x0227
            X.E1y r25 = X.CHA.A00
            goto L_0x0085
        L_0x01f7:
            X.CB8 r28 = X.C26297CxA.A01
            r23 = 0
            X.E1y r25 = X.CHA.A00
            goto L_0x0085
        L_0x01ff:
            int r1 = r6.A0L
            X.EDY r2 = r10.A00
            int[] r0 = r6.A0R
            X.DJe r4 = new X.DJe
            r26 = r2
            r29 = r3
            r30 = r0
            r31 = r22
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r16
            r36 = r1
            r22 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0056
        L_0x0220:
            java.lang.String r0 = "zzcf"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0227:
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x022e:
            return r4
        L_0x022f:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25659Cjp.A00(java.lang.Class):X.EAC");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25659Cjp() {
        /*
            r3 = this;
            r3.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass8BR.A17()
            r3.A01 = r0
            java.lang.String[] r2 = X.C17880vN.A1Y()
            java.lang.String r1 = "com.google.protobuf.AndroidProto3SchemaFactory"
            r0 = 0
            r2[r0] = r1
            r0 = r2[r0]
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = X.BEA.A0d(r0)     // Catch:{ all -> 0x0020 }
            X.E22 r0 = (X.E22) r0     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x0025
        L_0x0020:
            X.DJf r0 = new X.DJf
            r0.<init>()
        L_0x0025:
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25659Cjp.<init>():void");
    }
}
