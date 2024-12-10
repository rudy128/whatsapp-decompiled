package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.Aid  reason: case insensitive filesystem */
public final class C21348Aid implements Comparable {
    public static final long A01 = ((4611686018427387903L << 1) + 1);
    public static final long A02 = ((-4611686018427387903L << 1) + 1);
    public final long A00;

    public static final double A00(long j, long j2) {
        C179589Io r4;
        C179589Io r1;
        if ((((int) j) & 1) == 0) {
            r4 = C179589Io.NANOSECONDS;
        } else {
            r4 = C179589Io.MILLISECONDS;
        }
        if ((((int) j2) & 1) == 0) {
            r1 = C179589Io.NANOSECONDS;
        } else {
            r1 = C179589Io.MILLISECONDS;
        }
        if (r4.compareTo(r1) < 0) {
            r4 = r1;
        }
        return A01(r4, j) / A01(r4, j2);
    }

    public static final double A01(C179589Io r5, long j) {
        C179589Io r0;
        C18070vi.A0d(r5, 1);
        if (j == A01) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == A02) {
            return Double.NEGATIVE_INFINITY;
        }
        double d = (double) (j >> 1);
        if ((((int) j) & 1) == 0) {
            r0 = C179589Io.NANOSECONDS;
        } else {
            r0 = C179589Io.MILLISECONDS;
        }
        return C181869Sd.A00(r0, r5, d);
    }

    public static final long A03(long j) {
        if ((((int) j) & 1) != 1 || !(!A07(j))) {
            return A06(C179589Io.MILLISECONDS, j);
        }
        return j >> 1;
    }

    public static int A02(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return C18070vi.A01(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        if (j < 0) {
            return -i;
        }
        return i;
    }

    public static final long A06(C179589Io r4, long j) {
        C179589Io r0;
        if (j == A01) {
            return Long.MAX_VALUE;
        }
        if (j == A02) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            r0 = C179589Io.NANOSECONDS;
        } else {
            r0 = C179589Io.MILLISECONDS;
        }
        return r4.timeUnit.convert(j2, r0.timeUnit);
    }

    public static final boolean A07(long j) {
        if (j == A01 || j == A02) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return A02(this.A00, ((C21348Aid) obj).A00);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C21348Aid) || j != ((C21348Aid) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r1 != 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r7 == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        if (r12 == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r7 == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r9 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if (r0 <= 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        r8.append(' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ab, code lost:
        if (r2 != 0) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
        if (r12 != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00af, code lost:
        if (r11 != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        if (r10 != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b6, code lost:
        if (r1 < 1000000) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b8, code lost:
        r2 = r1 / 1000000;
        r1 = r1 % 1000000;
        r5 = "ms";
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00be, code lost:
        r8.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c1, code lost:
        if (r1 == 0) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c3, code lost:
        r8.append('.');
        r2 = java.lang.String.valueOf(r1);
        r0 = r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d3, code lost:
        if (r3 > r0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d5, code lost:
        r1 = r2.subSequence(0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d9, code lost:
        r4 = r1.toString();
        r3 = -1;
        r2 = r4.length() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e4, code lost:
        if (r2 < 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e6, code lost:
        r1 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ec, code lost:
        if (r4.charAt(r2) == '0') goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ee, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ef, code lost:
        r0 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f3, code lost:
        if (r0 < 3) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f5, code lost:
        r0 = ((r0 + 2) / 3) * 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fa, code lost:
        r8.append(r4, 0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fd, code lost:
        r8.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0100, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0114, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0115, code lost:
        if (r1 >= 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0118, code lost:
        r1 = new java.lang.StringBuilder(r3);
        r3 = r3 - r0;
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x011f, code lost:
        if (1 > r3) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0121, code lost:
        r1.append('0');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0124, code lost:
        if (r0 == r3) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0126, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0129, code lost:
        r1.append(r2);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x012f, code lost:
        if (r1 < 1000) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0131, code lost:
        r2 = r1 / 1000;
        r1 = r1 % 1000;
        r5 = "us";
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0139, code lost:
        r8.append(r1);
        r8.append("ns");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0142, code lost:
        r5 = "s";
        r3 = 9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            long r6 = r0.A00
            r14 = 0
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "0s"
            return r0
        L_0x000d:
            long r1 = A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "Infinity"
            return r0
        L_0x0016:
            long r1 = A02
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "-Infinity"
            return r0
        L_0x001f:
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            boolean r13 = X.C108975cc.A19(r0)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            if (r13 == 0) goto L_0x0030
            r0 = 45
            r8.append(r0)
        L_0x0030:
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            r4 = 1
            long r0 = r6 >> r4
            long r2 = -r0
            int r0 = (int) r6
            r0 = r0 & 1
            long r2 = r2 << r4
            long r0 = (long) r0
            long r2 = r2 + r0
            r6 = r2
        L_0x003f:
            X.9Io r0 = X.C179589Io.DAYS
            long r4 = A06(r0, r6)
            boolean r0 = A07(r6)
            if (r0 == 0) goto L_0x0148
            r9 = 0
            r3 = 0
            r2 = 0
            r1 = 0
        L_0x004f:
            r0 = 0
            r6 = 1
            int r7 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            boolean r12 = X.AnonymousClass000.A1O(r7)
            boolean r11 = X.AnonymousClass000.A1O(r9)
            boolean r10 = X.AnonymousClass000.A1O(r3)
            if (r2 != 0) goto L_0x0064
            r7 = 0
            if (r1 == 0) goto L_0x0065
        L_0x0064:
            r7 = 1
        L_0x0065:
            if (r12 == 0) goto L_0x0070
            r8.append(r4)
            r0 = 100
            r8.append(r0)
            r0 = 1
        L_0x0070:
            r5 = 32
            if (r11 != 0) goto L_0x007a
            if (r12 == 0) goto L_0x008a
            if (r10 != 0) goto L_0x007a
            if (r7 == 0) goto L_0x0101
        L_0x007a:
            int r4 = r0 + 1
            if (r0 <= 0) goto L_0x0081
            r8.append(r5)
        L_0x0081:
            r8.append(r9)
            r0 = 104(0x68, float:1.46E-43)
            r8.append(r0)
            r0 = r4
        L_0x008a:
            if (r10 != 0) goto L_0x0092
            if (r7 == 0) goto L_0x0101
            if (r11 != 0) goto L_0x0092
            if (r12 == 0) goto L_0x00a4
        L_0x0092:
            int r4 = r0 + 1
            if (r0 <= 0) goto L_0x0099
            r8.append(r5)
        L_0x0099:
            r8.append(r3)
            r0 = 109(0x6d, float:1.53E-43)
            r8.append(r0)
            r0 = r4
            if (r7 == 0) goto L_0x0101
        L_0x00a4:
            int r9 = r0 + 1
            if (r0 <= 0) goto L_0x00ab
            r8.append(r5)
        L_0x00ab:
            if (r2 != 0) goto L_0x0142
            if (r12 != 0) goto L_0x0142
            if (r11 != 0) goto L_0x0142
            if (r10 != 0) goto L_0x0142
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 < r0) goto L_0x012d
            int r2 = r1 / r0
            int r1 = r1 % r0
            java.lang.String r5 = "ms"
            r3 = 6
        L_0x00be:
            r8.append(r2)
            if (r1 == 0) goto L_0x00fd
            r0 = 46
            r8.append(r0)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            r7 = 48
            r1 = 0
            int r0 = r2.length()
            if (r3 > r0) goto L_0x0118
            java.lang.CharSequence r1 = r2.subSequence(r1, r0)
        L_0x00d9:
            java.lang.String r4 = r1.toString()
            int r0 = r4.length()
            r3 = -1
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x00ef
        L_0x00e6:
            int r1 = r2 + -1
            char r0 = r4.charAt(r2)
            if (r0 == r7) goto L_0x0114
            r3 = r2
        L_0x00ef:
            int r0 = r3 + 1
            r2 = 0
            r1 = 3
            if (r0 < r1) goto L_0x00fa
            int r0 = r0 + 2
            int r0 = r0 / r1
            int r0 = r0 * 3
        L_0x00fa:
            r8.append(r4, r2, r0)
        L_0x00fd:
            r8.append(r5)
        L_0x0100:
            r0 = r9
        L_0x0101:
            if (r13 == 0) goto L_0x010f
            if (r0 <= r6) goto L_0x010f
            r0 = 40
            r8.insert(r6, r0)
            r0 = 41
            r8.append(r0)
        L_0x010f:
            java.lang.String r0 = X.C18070vi.A0H(r8)
            return r0
        L_0x0114:
            r2 = r1
            if (r1 >= 0) goto L_0x00e6
            goto L_0x00ef
        L_0x0118:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            int r3 = r3 - r0
            r0 = 1
            if (r6 > r3) goto L_0x0129
        L_0x0121:
            r1.append(r7)
            if (r0 == r3) goto L_0x0129
            int r0 = r0 + 1
            goto L_0x0121
        L_0x0129:
            r1.append(r2)
            goto L_0x00d9
        L_0x012d:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r0) goto L_0x0139
            int r2 = r1 / 1000
            int r1 = r1 % 1000
            java.lang.String r5 = "us"
            r3 = 3
            goto L_0x00be
        L_0x0139:
            r8.append(r1)
            java.lang.String r0 = "ns"
            r8.append(r0)
            goto L_0x0100
        L_0x0142:
            java.lang.String r5 = "s"
            r3 = 9
            goto L_0x00be
        L_0x0148:
            X.9Io r0 = X.C179589Io.HOURS
            long r2 = A06(r0, r6)
            r0 = 24
            long r2 = r2 % r0
            int r9 = (int) r2
            X.9Io r0 = X.C179589Io.MINUTES
            long r0 = A06(r0, r6)
            r2 = 60
            long r0 = r0 % r2
            int r3 = (int) r0
            X.9Io r0 = X.C179589Io.SECONDS
            long r0 = A06(r0, r6)
            r10 = 60
            long r0 = r0 % r10
            int r2 = (int) r0
            int r0 = (int) r6
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x016d
            r1 = 0
        L_0x016d:
            r0 = 1
            long r6 = r6 >> r0
            if (r1 == 0) goto L_0x017b
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 % r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r0
        L_0x0178:
            int r1 = (int) r6
            goto L_0x004f
        L_0x017b:
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r6 = r6 % r0
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21348Aid.toString():java.lang.String");
    }

    public /* synthetic */ C21348Aid(long j) {
        this.A00 = j;
    }

    public static final long A04(long j, long j2) {
        boolean A07 = A07(j);
        boolean A072 = A07(j2);
        if (A07) {
            if ((!A072) || (j2 ^ j) >= 0) {
                return j;
            }
            throw AnonymousClass000.A0k("Summing infinite durations of different signs yields an undefined result.");
        } else if (A072) {
            return j2;
        } else {
            int i = ((int) j) & 1;
            if (i == (((int) j2) & 1)) {
                long j3 = (j >> 1) + (j2 >> 1);
                if (i == 0) {
                    if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                        return ((j3 / SearchActionVerificationClientService.MS_TO_NS) << 1) + 1;
                    }
                    return j3 << 1;
                } else if (-4611686018426L > j3 || j3 >= 4611686018427L) {
                    return AnonymousClass8BY.A06(j3);
                } else {
                    return (j3 * SearchActionVerificationClientService.MS_TO_NS) << 1;
                }
            } else if (i == 1) {
                return A05(j >> 1, j2 >> 1);
            } else {
                return A05(j2 >> 1, j >> 1);
            }
        }
    }

    public static final long A05(long j, long j2) {
        long j3 = j2 / SearchActionVerificationClientService.MS_TO_NS;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return AnonymousClass8BY.A06(j4);
        }
        return ((j4 * SearchActionVerificationClientService.MS_TO_NS) + (j2 - (j3 * SearchActionVerificationClientService.MS_TO_NS))) << 1;
    }
}
