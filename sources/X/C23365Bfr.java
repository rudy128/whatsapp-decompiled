package X;

import java.util.Arrays;

/* renamed from: X.Bfr  reason: case insensitive filesystem */
public final class C23365Bfr extends DSA {
    public final DSS A00;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r4.A00;
        r2 = r1.A03();
        r0 = ((X.C23365Bfr) r5).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r5) {
        /*
            r4 = this;
            X.DSA r5 = (X.DSA) r5
            int r3 = r5.A01()
            r2 = 2
            if (r2 != r3) goto L_0x0028
            X.Bfr r5 = (X.C23365Bfr) r5
            X.DSS r1 = r4.A00
            int r2 = r1.A03()
            X.DSS r0 = r5.A00
            int r3 = r0.A03()
            if (r2 != r3) goto L_0x0028
            byte[] r2 = r1.A04()
            byte[] r1 = r0.A04()
            java.util.Comparator r0 = X.C25403Cf5.A00
            int r2 = r0.compare(r2, r1)
            return r2
        L_0x0028:
            int r2 = r2 - r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23365Bfr.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C23365Bfr) obj).A00);
    }

    public final String toString() {
        C25804CmH cmH;
        int i;
        boolean z;
        C23360Bfm bfm = (C23360Bfm) C25038CUr.A00;
        C25038CUr cUr = bfm.A02;
        if (cUr == null) {
            C25804CmH cmH2 = bfm.A00;
            int i2 = 0;
            while (true) {
                char[] cArr = cmH2.A07;
                int length = cArr.length;
                if (i2 >= length) {
                    cmH = cmH2;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        i = 65;
                        if (i3 >= length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        char[] cArr2 = new char[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            char c3 = cArr[i4];
                            if (c3 >= 'a' && c3 <= 'z') {
                                c3 ^= ' ';
                            }
                            cArr2[i4] = (char) c3;
                        }
                        cmH = new C25804CmH(cmH2.A04.concat(".upperCase()"), cArr2);
                        if (cmH2.A05 && !cmH.A05) {
                            byte[] bArr = cmH.A06;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            do {
                                int i5 = i | 32;
                                byte b = bArr[i];
                                byte b2 = bArr[i5];
                                if (b == -1) {
                                    copyOf[i] = b2;
                                } else {
                                    char c4 = (char) i;
                                    char c5 = (char) i5;
                                    if (b2 == -1) {
                                        copyOf[i5] = b;
                                    } else {
                                        Object[] A1b = AnonymousClass3MW.A1b();
                                        A1b[0] = Character.valueOf(c4);
                                        A1b[1] = Character.valueOf(c5);
                                        throw AnonymousClass000.A0n(CBB.A00("Can't ignoreCase() since '%s' and '%s' encode different values", A1b));
                                    }
                                }
                                i++;
                            } while (i <= 90);
                            String str = cmH.A04;
                            cmH = new C25804CmH(str.concat(".ignoreCase()"), cmH.A07, copyOf, true);
                        }
                    } else {
                        throw AnonymousClass000.A0n("Cannot call upperCase() on a mixed-case alphabet");
                    }
                }
            }
            if (cmH == cmH2) {
                cUr = bfm;
            } else {
                Character ch = bfm.A01;
                if (bfm instanceof C23358Bfk) {
                    cUr = new C23360Bfm(cmH, ch);
                    if (cmH.A07.length != 64) {
                        throw BE6.A0j();
                    }
                } else if (bfm instanceof C23359Bfl) {
                    cUr = new C23359Bfl(cmH);
                } else {
                    cUr = new C23360Bfm(cmH, ch);
                }
            }
            bfm.A02 = cUr;
        }
        String A0g = BE8.A0g(cUr, this.A00);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("h'");
        A10.append(A0g);
        return AnonymousClass000.A0y("'", A10);
    }

    public C23365Bfr(DSS dss) {
        this.A00 = dss;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, 2);
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }
}
