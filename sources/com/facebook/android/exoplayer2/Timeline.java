package com.facebook.android.exoplayer2;

import X.AnonymousClass000;
import X.BOD;
import X.BOE;
import X.BOL;
import X.BOM;
import X.BON;
import X.BOO;
import X.BOP;
import X.BP0;
import X.C25197Cao;
import X.C25497Cgs;
import X.C25746ClG;
import X.C26056CrS;
import android.util.Pair;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

public abstract class Timeline {
    public static final Timeline A00 = new BOL();

    public final int A03(C25197Cao cao, C25746ClG clG, int i, int i2, boolean z) {
        int i3 = A08(cao, i, false).A00;
        if (A09(clG, i3, 0).A01 != i) {
            return i + 1;
        }
        int A02 = A02(i3, i2, z);
        if (A02 == -1) {
            return -1;
        }
        return A09(clG, A02, 0).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r13 = (com.facebook.android.exoplayer2.Timeline) r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r5 = 1
            if (r12 == r13) goto L_0x0080
            boolean r0 = r13 instanceof com.facebook.android.exoplayer2.Timeline
            r4 = 0
            if (r0 == 0) goto L_0x007f
            com.facebook.android.exoplayer2.Timeline r13 = (com.facebook.android.exoplayer2.Timeline) r13
            int r0 = r13.A01()
            int r11 = r12.A01()
            if (r0 != r11) goto L_0x007f
            int r0 = r13.A00()
            int r7 = r12.A00()
            if (r0 != r7) goto L_0x007f
            X.ClG r10 = new X.ClG
            r10.<init>()
            X.Cao r6 = new X.Cao
            r6.<init>()
            X.ClG r9 = new X.ClG
            r9.<init>()
            X.Cao r3 = new X.Cao
            r3.<init>()
            r8 = 0
        L_0x0033:
            if (r8 >= r11) goto L_0x0048
            r0 = 0
            X.ClG r2 = r12.A09(r10, r8, r0)
            X.ClG r0 = r13.A09(r9, r8, r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007f
            int r8 = r8 + 1
            goto L_0x0033
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 >= r7) goto L_0x005c
            X.Cao r1 = r12.A08(r6, r2, r5)
            X.Cao r0 = r13.A08(r3, r2, r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007f
            int r2 = r2 + 1
            goto L_0x0049
        L_0x005c:
            int r3 = r12.A05(r5)
            int r0 = r13.A05(r5)
            if (r3 != r0) goto L_0x007f
            int r2 = r12.A06(r5)
            int r0 = r13.A06(r5)
            if (r2 == r0) goto L_0x0071
            return r4
        L_0x0071:
            if (r3 == r2) goto L_0x0080
            int r1 = r12.A02(r3, r4, r5)
            int r0 = r13.A02(r3, r4, r5)
            if (r1 != r0) goto L_0x007f
            r3 = r1
            goto L_0x0071
        L_0x007f:
            return r4
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.Timeline.equals(java.lang.Object):boolean");
    }

    public int A00() {
        if (this instanceof BOP) {
            return 1;
        }
        if (this instanceof BON) {
            return ((BON) this).A00.A00();
        }
        if (this instanceof BOM) {
            return 1;
        }
        if (this instanceof BOD) {
            BOD bod = (BOD) this;
            return bod.A00 * bod.A02;
        } else if (this instanceof BOE) {
            return ((BOE) this).A00;
        } else {
            return 0;
        }
    }

    public int A01() {
        if (this instanceof BOP) {
            return 1;
        }
        if (this instanceof BON) {
            return ((BON) this).A00.A01();
        }
        if (this instanceof BOM) {
            return 1;
        }
        if (this instanceof BOD) {
            BOD bod = (BOD) this;
            return bod.A01 * bod.A02;
        } else if (this instanceof BOE) {
            return ((BOE) this).A01;
        } else {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.BON
            if (r0 == 0) goto L_0x0019
            r3 = r7
            X.BON r3 = (X.BON) r3
            boolean r2 = r3 instanceof X.C22786BOz
            com.facebook.android.exoplayer2.Timeline r0 = r3.A00
            int r1 = r0.A02(r8, r9, r10)
            if (r2 == 0) goto L_0x0018
            r0 = -1
            if (r1 != r0) goto L_0x0018
            int r1 = r3.A05(r10)
        L_0x0018:
            return r1
        L_0x0019:
            boolean r0 = r7 instanceof X.BOO
            if (r0 == 0) goto L_0x00a0
            r4 = r7
            X.BOO r4 = (X.BOO) r4
            r5 = 0
            r3 = 2
            boolean r0 = r4 instanceof X.BOD
            if (r0 == 0) goto L_0x0073
            r0 = r4
            X.BOD r0 = (X.BOD) r0
            int r0 = r0.A01
            int r6 = r8 / r0
        L_0x002d:
            int r2 = r4.A0A(r6)
            com.facebook.android.exoplayer2.Timeline r0 = r4.A0B(r6)
            int r8 = r8 - r2
            if (r9 == r3) goto L_0x0039
            r5 = r9
        L_0x0039:
            int r0 = r0.A02(r8, r5, r10)
            r5 = -1
            if (r0 != r5) goto L_0x009e
            if (r10 == 0) goto L_0x006a
            X.EA2 r0 = r4.A01
            int r2 = r0.BVN(r6)
        L_0x0048:
            if (r2 == r5) goto L_0x008d
            com.facebook.android.exoplayer2.Timeline r1 = r4.A0B(r2)
            int r0 = r1.A01()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x0096
            if (r10 == 0) goto L_0x0061
            X.EA2 r0 = r4.A01
            int r2 = r0.BVN(r2)
            goto L_0x0048
        L_0x0061:
            int r0 = r4.A00
            int r0 = r0 + -1
            if (r2 >= r0) goto L_0x008d
            int r2 = r2 + 1
            goto L_0x0048
        L_0x006a:
            int r0 = r4.A00
            int r0 = r0 + -1
            if (r6 >= r0) goto L_0x008d
            int r2 = r6 + 1
            goto L_0x0048
        L_0x0073:
            r0 = r4
            X.BOE r0 = (X.BOE) r0
            int[] r2 = r0.A04
            int r1 = r8 + 1
            int r6 = java.util.Arrays.binarySearch(r2, r1)
            if (r6 >= 0) goto L_0x0084
            int r0 = r6 + 2
            int r6 = -r0
            goto L_0x002d
        L_0x0084:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x002d
            r0 = r2[r6]
            if (r0 != r1) goto L_0x002d
            goto L_0x0084
        L_0x008d:
            if (r9 != r3) goto L_0x0094
            int r2 = r4.A05(r10)
            return r2
        L_0x0094:
            r2 = -1
            return r2
        L_0x0096:
            int r2 = r4.A0A(r2)
            int r0 = r1.A05(r10)
        L_0x009e:
            int r2 = r2 + r0
            return r2
        L_0x00a0:
            r0 = 1
            if (r9 == 0) goto L_0x00b8
            if (r9 == r0) goto L_0x00b2
            r0 = 2
            if (r9 != r0) goto L_0x00b3
            int r0 = r7.A06(r10)
            if (r8 != r0) goto L_0x00c0
            int r8 = r7.A05(r10)
        L_0x00b2:
            return r8
        L_0x00b3:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        L_0x00b8:
            int r0 = r7.A06(r10)
            if (r8 != r0) goto L_0x00c0
            r8 = -1
            return r8
        L_0x00c0:
            int r8 = r8 + 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.Timeline.A02(int, int, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.BOP
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = X.BOP.A03
            boolean r1 = r0.equals(r8)
            r0 = -1
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            return r0
        L_0x000f:
            boolean r0 = r7 instanceof X.BOM
            if (r0 == 0) goto L_0x0017
            r0 = -1
            if (r8 != 0) goto L_0x000e
            goto L_0x000d
        L_0x0017:
            boolean r0 = r7 instanceof X.BON
            if (r0 == 0) goto L_0x003c
            r2 = r7
            X.BON r2 = (X.BON) r2
            boolean r0 = r2 instanceof X.BP0
            if (r0 == 0) goto L_0x0035
            X.BP0 r2 = (X.BP0) r2
            com.facebook.android.exoplayer2.Timeline r1 = r2.A00
            java.lang.Object r0 = X.BP0.A02
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0030
            java.lang.Object r8 = r2.A00
        L_0x0030:
            int r0 = r1.A04(r8)
            return r0
        L_0x0035:
            com.facebook.android.exoplayer2.Timeline r0 = r2.A00
            int r0 = r0.A04(r8)
            return r0
        L_0x003c:
            boolean r0 = r7 instanceof X.BOL
            if (r0 == 0) goto L_0x0042
            r0 = -1
            return r0
        L_0x0042:
            r6 = r7
            X.BOO r6 = (X.BOO) r6
            boolean r0 = r8 instanceof android.util.Pair
            r5 = -1
            if (r0 == 0) goto L_0x0071
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r2 = r8.first
            java.lang.Object r4 = r8.second
            boolean r3 = r6 instanceof X.BOD
            if (r3 == 0) goto L_0x0079
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0071
            int r2 = X.AnonymousClass000.A0M(r2)
        L_0x005c:
            if (r2 == r5) goto L_0x0071
            com.facebook.android.exoplayer2.Timeline r0 = r6.A0B(r2)
            int r1 = r0.A04(r4)
            if (r1 == r5) goto L_0x0071
            if (r3 == 0) goto L_0x0072
            X.BOD r6 = (X.BOD) r6
            int r0 = r6.A00
            int r2 = r2 * r0
        L_0x006f:
            int r5 = r2 + r1
        L_0x0071:
            return r5
        L_0x0072:
            X.BOE r6 = (X.BOE) r6
            int[] r0 = r6.A03
            r2 = r0[r2]
            goto L_0x006f
        L_0x0079:
            r1 = r6
            X.BOE r1 = (X.BOE) r1
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0071
            android.util.SparseIntArray r1 = r1.A02
            int r0 = X.AnonymousClass000.A0M(r2)
            int r2 = r1.get(r0, r5)
            if (r2 != r5) goto L_0x005c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.Timeline.A04(java.lang.Object):int");
    }

    public int A05(boolean z) {
        int i;
        if (this instanceof BON) {
            return ((BON) this).A00.A05(z);
        }
        if (this instanceof BOO) {
            BOO boo = (BOO) this;
            int i2 = boo.A00;
            if (i2 == 0) {
                return -1;
            }
            int i3 = 0;
            if (z) {
                i3 = boo.A01.BRm();
            }
            do {
                Timeline A0B = boo.A0B(i);
                if (!AnonymousClass000.A1P(A0B.A01())) {
                    return boo.A0A(i) + A0B.A05(z);
                }
                if (z) {
                    i = boo.A01.BVN(i);
                    continue;
                } else if (i >= i2 - 1) {
                    return -1;
                } else {
                    i++;
                    continue;
                }
            } while (i != -1);
            return -1;
        } else if (AnonymousClass000.A1P(A01())) {
            return -1;
        } else {
            return 0;
        }
    }

    public int A06(boolean z) {
        int i;
        int i2;
        if (this instanceof BON) {
            return ((BON) this).A00.A06(z);
        }
        if (this instanceof BOO) {
            BOO boo = (BOO) this;
            int i3 = boo.A00;
            if (i3 != 0) {
                if (z) {
                    i = boo.A01.BTp();
                } else {
                    i = i3 - 1;
                }
                do {
                    Timeline A0B = boo.A0B(i);
                    if (AnonymousClass000.A1P(A0B.A01())) {
                        if (!z) {
                            if (i <= 0) {
                                break;
                            }
                            i2 = i - 1;
                            continue;
                        } else {
                            i2 = boo.A01.BXY(i);
                            continue;
                        }
                    } else {
                        return boo.A0A(i) + A0B.A06(z);
                    }
                } while (i != -1);
            }
            return -1;
        } else if (AnonymousClass000.A1P(A01())) {
            return -1;
        } else {
            return A01() - 1;
        }
    }

    public C25197Cao A08(C25197Cao cao, int i, boolean z) {
        int binarySearch;
        int i2;
        Integer valueOf;
        Object create;
        Object obj;
        if (this instanceof BOP) {
            BOP bop = (BOP) this;
            C26056CrS.A00(i, 1);
            if (z) {
                obj = BOP.A03;
            } else {
                obj = null;
            }
            long j = bop.A00;
            C25497Cgs cgs = C25497Cgs.A01;
            cao.A03 = obj;
            cao.A00 = 0;
            cao.A01 = j;
            cao.A02 = cgs;
        } else if (this instanceof BOM) {
            C25497Cgs cgs2 = C25497Cgs.A01;
            cao.A03 = null;
            cao.A00 = 0;
            cao.A01 = -9223372036854775807L;
            cao.A02 = cgs2;
            return cao;
        } else {
            if (this instanceof BON) {
                BON bon = (BON) this;
                if (!(bon instanceof BP0)) {
                    return bon.A00.A08(cao, i, z);
                }
                BP0 bp0 = (BP0) bon;
                bp0.A00.A08(cao, i, z);
                if (Util.A0D(cao.A03, bp0.A00)) {
                    create = BP0.A02;
                }
            } else if (this instanceof BOL) {
                throw new IndexOutOfBoundsException();
            } else {
                BOO boo = (BOO) this;
                boolean z2 = boo instanceof BOD;
                if (z2) {
                    binarySearch = i / ((BOD) boo).A00;
                } else {
                    int[] iArr = ((BOE) boo).A03;
                    int i3 = i + 1;
                    binarySearch = Arrays.binarySearch(iArr, i3);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i3);
                    }
                }
                int A0A = boo.A0A(binarySearch);
                if (z2) {
                    i2 = binarySearch * ((BOD) boo).A00;
                } else {
                    i2 = ((BOE) boo).A03[binarySearch];
                }
                boo.A0B(binarySearch).A08(cao, i - i2, z);
                cao.A00 += A0A;
                if (z) {
                    if (z2) {
                        valueOf = Integer.valueOf(binarySearch);
                    } else {
                        valueOf = Integer.valueOf(((BOE) boo).A05[binarySearch]);
                    }
                    Object obj2 = cao.A03;
                    C26056CrS.A01(obj2);
                    create = Pair.create(valueOf, obj2);
                }
            }
            cao.A03 = create;
            return cao;
        }
        return cao;
    }

    public C25746ClG A09(C25746ClG clG, int i, long j) {
        int binarySearch;
        int i2;
        Object valueOf;
        if (this instanceof BOP) {
            BOP bop = (BOP) this;
            C26056CrS.A00(i, 1);
            Object obj = C25746ClG.A0C;
            boolean z = bop.A02;
            long j2 = bop.A01;
            clG.A08 = obj;
            clG.A07 = C25746ClG.A0B;
            clG.A05 = -9223372036854775807L;
            clG.A06 = -9223372036854775807L;
            clG.A04 = -9223372036854775807L;
            clG.A0A = z;
            clG.A09 = false;
            clG.A02 = 0;
            clG.A03 = j2;
            clG.A00 = 0;
            clG.A01 = 0;
            return clG;
        } else if (this instanceof BON) {
            return ((BON) this).A00.A09(clG, i, j);
        } else {
            if (this instanceof BOM) {
                Object obj2 = C25746ClG.A0C;
                long j3 = 0;
                if (j > 0) {
                    j3 = -9223372036854775807L;
                }
                clG.A08 = obj2;
                clG.A07 = C25746ClG.A0B;
                clG.A05 = -9223372036854775807L;
                clG.A06 = -9223372036854775807L;
                clG.A04 = -9223372036854775807L;
                clG.A0A = false;
                clG.A09 = true;
                clG.A02 = j3;
                clG.A03 = -9223372036854775807L;
                clG.A00 = 0;
                clG.A01 = 0;
                return clG;
            } else if (this instanceof BOL) {
                throw new IndexOutOfBoundsException();
            } else {
                BOO boo = (BOO) this;
                boolean z2 = boo instanceof BOD;
                if (z2) {
                    binarySearch = i / ((BOD) boo).A01;
                } else {
                    int[] iArr = ((BOE) boo).A04;
                    int i3 = i + 1;
                    binarySearch = Arrays.binarySearch(iArr, i3);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i3);
                    }
                }
                int A0A = boo.A0A(binarySearch);
                if (z2) {
                    i2 = binarySearch * ((BOD) boo).A00;
                } else {
                    i2 = ((BOE) boo).A03[binarySearch];
                }
                boo.A0B(binarySearch).A09(clG, i - A0A, j);
                if (z2) {
                    valueOf = Integer.valueOf(binarySearch);
                } else {
                    valueOf = Integer.valueOf(((BOE) boo).A05[binarySearch]);
                }
                if (!C25746ClG.A0C.equals(clG.A08)) {
                    valueOf = Pair.create(valueOf, clG.A08);
                }
                clG.A08 = valueOf;
                clG.A00 += i2;
                clG.A01 += i2;
                return clG;
            }
        }
    }

    public int hashCode() {
        int i;
        C25746ClG clG = new C25746ClG();
        C25197Cao cao = new C25197Cao();
        int A01 = A01();
        int i2 = 217 + A01;
        int i3 = 0;
        while (true) {
            i = i2 * 31;
            if (i3 >= A01) {
                break;
            }
            i2 = AnonymousClass000.A0O(A09(clG, i3, 0), i);
            i3++;
        }
        int A002 = A00();
        int i4 = i + A002;
        for (int i5 = 0; i5 < A002; i5++) {
            i4 = AnonymousClass000.A0O(A08(cao, i5, true), i4 * 31);
        }
        int A05 = A05(true);
        while (A05 != -1) {
            i4 = (i4 * 31) + A05;
            A05 = A02(A05, 0, true);
        }
        return i4;
    }

    public final Pair A07(C25197Cao cao, C25746ClG clG, int i, long j, long j2) {
        C26056CrS.A00(i, A01());
        A09(clG, i, j2);
        if (j == -9223372036854775807L) {
            j = clG.A02;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = clG.A00;
        long j3 = 0 + j;
        while (true) {
            long j4 = A08(cao, i2, false).A01;
            if (j4 != -9223372036854775807L && j3 >= j4 && i2 < clG.A01) {
                j3 -= j4;
                i2++;
            }
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }
}
