package X;

/* renamed from: X.9zk  reason: invalid class name and case insensitive filesystem */
public final class C199289zk {
    public final AnonymousClass8XK A00;
    public final byte[] A01;
    public final int A02;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r6.isMessage_ != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C185169c8 A01(java.util.Map r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            X.C18070vi.A0d(r13, r0)
            X.9c8 r5 = new X.9c8
            r5.<init>()
        L_0x0009:
            if (r14 >= r15) goto L_0x00f8
            X.9rC r0 = r12.A00(r14)
            X.9pl r6 = new X.9pl
            r6.<init>(r0)
            X.9rC r0 = r6.A00
            int r4 = r0.A00
            int r4 = r4 + r14
            int r0 = r0.A01
            r3 = r0 & 7
            r2 = 0
            if (r3 == 0) goto L_0x00e4
            r0 = 1
            if (r3 == r0) goto L_0x00e0
            r0 = 2
            if (r3 == r0) goto L_0x00d6
            r0 = 5
            if (r3 != r0) goto L_0x00ed
            int r4 = r4 + 4
        L_0x002b:
            X.99f r3 = new X.99f
            r3.<init>(r6, r2, r14, r4)
            int r7 = r3.A00
            int r4 = r3.A01
            int r7 = r7 - r4
            int r14 = r14 + r7
            X.9pl r2 = r3.A00
            X.9rC r8 = r2.A00
            int r1 = r8.A01
            int r0 = r1 >>> 3
            java.lang.Object r6 = X.AnonymousClass000.A0w(r13, r0)
            X.8bM r6 = (X.AnonymousClass8bM) r6
            if (r6 == 0) goto L_0x0009
            int r11 = r12.A02
            int r0 = r6.minVersion_
            r10 = 0
            boolean r9 = X.C108975cc.A1C(r11, r0)
            int r0 = r6.maxVersion_
            if (r0 == 0) goto L_0x0057
            if (r0 <= 0) goto L_0x0058
            if (r11 > r0) goto L_0x0058
        L_0x0057:
            r10 = 1
        L_0x0058:
            if (r9 == 0) goto L_0x0009
            if (r10 == 0) goto L_0x0009
            X.Dbz r0 = r6.subfield_
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            X.C18070vi.A0X(r0)
            boolean r0 = X.AnonymousClass8BR.A1Y(r0)
            if (r0 != 0) goto L_0x006f
            boolean r0 = r6.isMessage_
            if (r0 == 0) goto L_0x00a0
        L_0x006f:
            r1 = r1 & 7
            r0 = 2
            if (r1 != r0) goto L_0x0009
            int r0 = r8.A00
            int r1 = r4 + r0
            X.9rC r0 = r3.A02
            if (r0 == 0) goto L_0x00d4
            int r0 = r0.A00
        L_0x007e:
            int r1 = r1 + r0
            int r4 = r4 + r7
            boolean r0 = r6.isMessage_
            if (r0 == 0) goto L_0x00d1
            X.8XK r0 = r12.A00
            X.Dbz r0 = r0.field_
        L_0x0088:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            X.C18070vi.A0b(r0)
            X.9c8 r1 = r12.A01(r0, r1, r4)
            java.util.List r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0009
            X.99e r3 = new X.99e
            r3.<init>(r2, r1)
        L_0x00a0:
            java.util.List r0 = r5.A01
            r0.add(r3)
            int r6 = r5.A00
            boolean r0 = r3 instanceof X.C1775599f
            if (r0 == 0) goto L_0x00b7
            X.99f r3 = (X.C1775599f) r3
            int r4 = r3.A00
            int r0 = r3.A01
            int r4 = r4 - r0
        L_0x00b2:
            int r6 = r6 + r4
            r5.A00 = r6
            goto L_0x0009
        L_0x00b7:
            X.99e r3 = (X.C1775499e) r3
            X.9pl r0 = r3.A00
            X.9rC r0 = r0.A00
            int r4 = r0.A00
            X.9c8 r0 = r3.A00
            int r3 = r0.A00
            r2 = r3
            r1 = 0
        L_0x00c5:
            int r1 = r1 + 1
            r0 = r2 & -128(0xffffffffffffff80, float:NaN)
            if (r0 != 0) goto L_0x00ce
            int r4 = r4 + r1
            int r4 = r4 + r3
            goto L_0x00b2
        L_0x00ce:
            int r2 = r2 >>> 7
            goto L_0x00c5
        L_0x00d1:
            X.Dbz r0 = r6.subfield_
            goto L_0x0088
        L_0x00d4:
            r0 = 0
            goto L_0x007e
        L_0x00d6:
            X.9rC r2 = r12.A00(r4)
            int r1 = r2.A00
            int r0 = r2.A01
            int r1 = r1 + r0
            goto L_0x00ea
        L_0x00e0:
            int r4 = r4 + 8
            goto L_0x002b
        L_0x00e4:
            X.9rC r0 = r12.A00(r4)
            int r1 = r0.A00
        L_0x00ea:
            int r4 = r4 + r1
            goto L_0x002b
        L_0x00ed:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported wire type: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r3)
            throw r0
        L_0x00f8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199289zk.A01(java.util.Map, int, int):X.9c8");
    }

    private final C194119rC A00(int i) {
        byte[] bArr = this.A01;
        int i2 = i + 1;
        byte b = bArr[i];
        byte b2 = b & Byte.MAX_VALUE;
        while (b < 0) {
            int i3 = i2;
            i2++;
            b = bArr[i3];
            b2 = ((b & Byte.MAX_VALUE) << (((i2 - i) - 1) * 7)) | b2;
        }
        return new C194119rC(b2, i2 - i);
    }

    public C199289zk(AnonymousClass8XK r1, byte[] bArr, int i) {
        this.A01 = bArr;
        this.A00 = r1;
        this.A02 = i;
    }
}
