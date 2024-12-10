package X;

import androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Ye  reason: invalid class name and case insensitive filesystem */
public final class C06400Ye implements Iterable, C18450wR {
    public static final C06400Ye A04 = new C06400Ye((int[]) null, 0, 0, 0);
    public final int A00;
    public final long A01;
    public final long A02;
    public final int[] A03;

    public static final int A00(long j) {
        int i = 0;
        if ((4294967295L & j) == 0) {
            i = 32;
            j >>= 32;
        }
        if ((65535 & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i;
        }
        if ((2 & j) != 0) {
            return i + 1;
        }
        if ((4 & j) != 0) {
            return i + 2;
        }
        if ((j & 8) != 0) {
            return i + 3;
        }
        return -1;
    }

    public static final int A02(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i >= i4) {
                return i3;
            } else {
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final C06400Ye A0B(C06400Ye r10) {
        int[] iArr;
        C06400Ye r2 = r10;
        C06400Ye r0 = A04;
        if (r10 == r0) {
            return this;
        }
        if (this == r0) {
            return r2;
        }
        int i = r10.A00;
        int i2 = this.A00;
        if (i == i2 && r10.A03 == (iArr = this.A03)) {
            return new C06400Ye(iArr, i2, r10.A02 | this.A02, r10.A01 | this.A01);
        } else if (this.A03 == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                r2 = r2.A09(AnonymousClass000.A0M(it.next()));
            }
            return r2;
        } else {
            Iterator it2 = r10.iterator();
            C06400Ye r22 = this;
            while (it2.hasNext()) {
                r22 = r22.A09(AnonymousClass000.A0M(it2.next()));
            }
            return r22;
        }
    }

    public Iterator iterator() {
        return AnonymousClass1JM.A00(new SnapshotIdSet$iterator$1(this, (C30391dr) null)).iterator();
    }

    public final int A07(int i) {
        int[] iArr = this.A03;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.A01;
        if (j != 0) {
            return this.A00 + A00(j);
        }
        long j2 = this.A02;
        if (j2 != 0) {
            return this.A00 + 64 + A00(j2);
        }
        return i;
    }

    public final C06400Ye A08(int i) {
        int A022;
        int[] iArr;
        long j;
        long j2;
        int i2 = this.A00;
        int i3 = i - i2;
        if (i3 >= 0) {
            if (i3 < 64) {
                long j3 = 1 << i3;
                long j4 = this.A01;
                if ((j4 & j3) != 0) {
                    j = this.A02;
                    j2 = j4 & (j3 ^ -1);
                }
                return this;
            }
            if (i3 < 128) {
                long j5 = 1 << (i3 - 64);
                long j6 = this.A02;
                if ((j6 & j5) != 0) {
                    j = j6 & (j5 ^ -1);
                    j2 = this.A01;
                }
            }
            return this;
            iArr = this.A03;
        } else {
            int[] iArr2 = this.A03;
            if (iArr2 != null && (A022 = A02(iArr2, i)) >= 0) {
                int length = iArr2.length - 1;
                if (length == 0) {
                    j = this.A02;
                    j2 = this.A01;
                    iArr = null;
                } else {
                    iArr = new int[length];
                    if (A022 > 0) {
                        C200310o.A02(0, 0, A022, iArr2, iArr);
                    }
                    if (A022 < length) {
                        C200310o.A02(A022, A022 + 1, length + 1, iArr2, iArr);
                    }
                    j = this.A02;
                    j2 = this.A01;
                }
            }
            return this;
        }
        return new C06400Ye(iArr, i2, j, j2);
    }

    public final C06400Ye A09(int i) {
        int[] iArr;
        long j;
        long j2;
        int i2 = this.A00;
        int i3 = i;
        int i4 = i - i2;
        if (i4 >= 0) {
            if (i4 < 64) {
                long j3 = 1 << i4;
                long j4 = this.A01;
                if ((j4 & j3) != 0) {
                    return this;
                }
                j = this.A02;
                j2 = j4 | j3;
            } else if (i4 < 128) {
                long j5 = 1 << (i4 - 64);
                long j6 = this.A02;
                if ((j6 & j5) != 0) {
                    return this;
                }
                j = j6 | j5;
                j2 = this.A01;
            } else if (A0C(i3)) {
                return this;
            } else {
                long j7 = this.A02;
                long j8 = this.A01;
                int i5 = ((i + 1) / 64) * 64;
                ArrayList arrayList = null;
                while (true) {
                    if (i2 >= i5) {
                        i5 = i2;
                        break;
                    }
                    if (j8 != 0) {
                        if (arrayList == null) {
                            arrayList = AnonymousClass000.A13();
                            int[] iArr2 = this.A03;
                            if (iArr2 != null) {
                                for (int valueOf : iArr2) {
                                    arrayList.add(Integer.valueOf(valueOf));
                                }
                            }
                        }
                        int i6 = 0;
                        do {
                            if (((1 << i6) & j8) != 0) {
                                arrayList.add(Integer.valueOf(i6 + i2));
                            }
                            i6++;
                        } while (i6 < 64);
                    }
                    if (j7 == 0) {
                        j8 = 0;
                        break;
                    }
                    i2 += 64;
                    j8 = j7;
                    j7 = 0;
                }
                if (arrayList != null) {
                    iArr = C29431cG.A1B(arrayList);
                } else {
                    iArr = this.A03;
                }
                return new C06400Ye(iArr, i5, j7, j8).A09(i3);
            }
            return new C06400Ye(this.A03, i2, j, j2);
        }
        int[] iArr3 = this.A03;
        if (iArr3 == null) {
            return new C06400Ye(new int[]{i}, i2, this.A02, this.A01);
        }
        int A022 = A02(iArr3, i3);
        if (A022 >= 0) {
            return this;
        }
        int i7 = -(A022 + 1);
        int length = iArr3.length + 1;
        int[] iArr4 = new int[length];
        C200310o.A02(0, 0, i7, iArr3, iArr4);
        C200310o.A02(i7 + 1, i7, length - 1, iArr3, iArr4);
        iArr4[i7] = i;
        return new C06400Ye(iArr4, i2, this.A02, this.A01);
    }

    public final C06400Ye A0A(C06400Ye r11) {
        int[] iArr;
        C06400Ye r3 = A04;
        if (r11 == r3) {
            return this;
        }
        if (this == r3) {
            return r3;
        }
        int i = r11.A00;
        int i2 = this.A00;
        if (i == i2 && r11.A03 == (iArr = this.A03)) {
            return new C06400Ye(iArr, i2, (r11.A02 ^ -1) & this.A02, (-1 ^ r11.A01) & this.A01);
        }
        Iterator it = r11.iterator();
        C06400Ye r32 = this;
        while (it.hasNext()) {
            r32 = r32.A08(AnonymousClass000.A0M(it.next()));
        }
        return r32;
    }

    public final boolean A0C(int i) {
        long j;
        long j2;
        int i2 = i - this.A00;
        if (i2 >= 0) {
            if (i2 < 64) {
                j = 1 << i2;
                j2 = this.A01;
            } else if (i2 < 128) {
                j = 1 << (i2 - 64);
                j2 = this.A02;
            }
            if ((j & j2) == 0) {
                return false;
            }
            return true;
        }
        int[] iArr = this.A03;
        if (iArr == null || A02(iArr, i) < 0) {
            return false;
        }
        return true;
        return false;
    }

    public C06400Ye(int[] iArr, int i, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A03 = iArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.toString());
        A10.append(" [");
        ArrayList arrayList = new ArrayList(C29351c6.A0C(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(AnonymousClass000.A0M(it.next())));
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                A102.append(", ");
            }
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    A102.append(((Character) obj).charValue());
                } else {
                    obj = String.valueOf(obj);
                }
            }
            A102.append((CharSequence) obj);
        }
        A102.append("");
        A10.append(A102.toString());
        A10.append(']');
        return A10.toString();
    }
}
