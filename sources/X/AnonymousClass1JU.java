package X;

import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.1JU  reason: invalid class name */
public abstract class AnonymousClass1JU {
    public static final AnonymousClass1JV A00 = new Object();
    public static final AnonymousClass1JU A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.1JY} */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.1JV] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.1JU] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            X.1JV r0 = new X.1JV
            r0.<init>()
            A00 = r0
            r1 = 34
            java.lang.Integer r0 = X.AnonymousClass1JW.A00
            if (r0 == 0) goto L_0x001b
            int r0 = r0.intValue()
            if (r0 >= r1) goto L_0x001b
            X.1JY r0 = new X.1JY
            r0.<init>()
        L_0x0018:
            A01 = r0
            return
        L_0x001b:
            X.3JA r0 = new X.3JA
            r0.<init>()
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1JU.<clinit>():void");
    }

    public int A00() {
        if (this instanceof AnonymousClass1JV) {
            return A01.A00();
        }
        return ((AnonymousClass1JX) this).A09().nextInt();
    }

    public int A01() {
        if (this instanceof AnonymousClass1JV) {
            return A01.A01();
        }
        return ((AnonymousClass1JX) this).A09().nextInt(2147418112);
    }

    public int A02(int i) {
        if (this instanceof AnonymousClass1JV) {
            return A01.A02(i);
        }
        return (((AnonymousClass1JX) this).A09().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    public int A03(int i, int i2) {
        int A002;
        int i3;
        if (this instanceof AnonymousClass3JA) {
            return ThreadLocalRandom.current().nextInt(i, i2);
        }
        if (this instanceof AnonymousClass1JV) {
            return A01.A03(i, i2);
        }
        if (i2 > i) {
            int i4 = i2 - i;
            if (i4 <= 0) {
                if (i4 != Integer.MIN_VALUE) {
                    while (true) {
                        int A003 = A00();
                        if (i <= A003 && A003 < i2) {
                            return A003;
                        }
                    }
                }
            } else if (((-i4) & i4) != i4) {
                do {
                    A002 = A00() >>> 1;
                    i3 = A002 % i4;
                } while ((A002 - i3) + (i4 - 1) < 0);
                return i + i3;
            }
            i3 = A02(31 - Integer.numberOfLeadingZeros(i4));
            return i + i3;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        StringBuilder sb = new StringBuilder();
        sb.append("Random range is empty: [");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(").");
        throw new IllegalArgumentException(sb.toString());
    }

    public long A04() {
        if (this instanceof AnonymousClass1JV) {
            return A01.A04();
        }
        return ((AnonymousClass1JX) this).A09().nextLong();
    }

    public long A05() {
        if (this instanceof AnonymousClass3JA) {
            return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
        }
        if (this instanceof AnonymousClass1JV) {
            return A01.A05();
        }
        return A06();
    }

    public long A06() {
        long A04;
        long j;
        if (this instanceof AnonymousClass3JA) {
            return ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE);
        }
        if (this instanceof AnonymousClass1JV) {
            return A01.A06();
        }
        do {
            A04 = A04() >>> 1;
            j = A04 % Long.MAX_VALUE;
        } while ((A04 - j) + 9223372036854775806L < 0);
        return 0 + j;
    }

    public byte[] A07(int i) {
        if (this instanceof AnonymousClass1JV) {
            return A01.A07(i);
        }
        return A08(new byte[i]);
    }

    public byte[] A08(byte[] bArr) {
        if (this instanceof AnonymousClass1JV) {
            return A01.A08(bArr);
        }
        ((AnonymousClass1JX) this).A09().nextBytes(bArr);
        return bArr;
    }
}
