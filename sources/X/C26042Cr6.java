package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;

/* renamed from: X.Cr6  reason: case insensitive filesystem */
public final class C26042Cr6 {
    public static final C26042Cr6 A04;
    public int A00 = -1;
    public boolean A01 = true;
    public int[] A02 = new int[8];
    public Object[] A03 = new Object[8];
    public int count = 0;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Cr6] */
    static {
        ? obj = new Object();
        obj.A00 = -1;
        obj.count = 0;
        obj.A02 = new int[0];
        obj.A03 = new Object[0];
        obj.A01 = false;
        A04 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C26042Cr6)) {
                C26042Cr6 cr6 = (C26042Cr6) obj;
                int i = this.count;
                if (i == cr6.count) {
                    int[] iArr = this.A02;
                    int[] iArr2 = cr6.A02;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A03;
                            Object[] objArr2 = cr6.A03;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C26042Cr6 cr6, int i) {
        int[] iArr = cr6.A02;
        if (i > iArr.length) {
            int i2 = cr6.count;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            cr6.A02 = Arrays.copyOf(iArr, i);
            cr6.A03 = Arrays.copyOf(cr6.A03, i);
        }
    }

    public int A01() {
        int i;
        int i2;
        int i3;
        int i4 = this.A00;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            int i7 = this.A02[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                long A0I = BE8.A0I(this.A03, i6);
                i = C25878Cnp.A05(i8);
                i2 = CodedOutputStream.A03(A0I);
                i3 = i + i2;
            } else if (i9 != 1) {
                if (i9 == 2) {
                    boolean z = CodedOutputStream.A01;
                    i = C25878Cnp.A05(i8);
                    int A022 = ((DSQ) this.A03[i6]).A02();
                    i2 = BEB.A02(A022) + A022;
                } else if (i9 == 3) {
                    i = C25878Cnp.A05(i8) * 2;
                    i2 = ((C26042Cr6) this.A03[i6]).A01();
                } else if (i9 == 5) {
                    i3 = C25878Cnp.A05(i8) + 4;
                } else {
                    throw new IllegalStateException(new C23659BnS());
                }
                i3 = i + i2;
            } else {
                i3 = C25878Cnp.A05(i8) + 8;
            }
            i5 += i3;
        }
        this.A00 = i5;
        return i5;
    }

    public void A02(int i, Object obj) {
        if (this.A01) {
            A00(this, this.count + 1);
            int[] iArr = this.A02;
            int i2 = this.count;
            iArr[i2] = i;
            this.A03[i2] = obj;
            this.count = i2 + 1;
            return;
        }
        throw C17880vN.A0y();
    }

    public void A03(CVN cvn) {
        if (this.count != 0) {
            for (int i = 0; i < this.count; i++) {
                int i2 = this.A02[i];
                Object obj = this.A03[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    cvn.A00.A0D(i3, C17880vN.A05(obj));
                } else if (i4 == 1) {
                    cvn.A00.A0C(i3, C17880vN.A05(obj));
                } else if (i4 == 2) {
                    CodedOutputStream codedOutputStream = cvn.A00;
                    C25878Cnp.A07(codedOutputStream, i3);
                    codedOutputStream.A0H((DSQ) obj);
                } else if (i4 == 3) {
                    CodedOutputStream codedOutputStream2 = cvn.A00;
                    int i5 = i3 << 3;
                    codedOutputStream2.A08(i5 | 3);
                    ((C26042Cr6) obj).A03(cvn);
                    codedOutputStream2.A08(i5 | 4);
                } else if (i4 == 5) {
                    cvn.A00.A09(i3, AnonymousClass000.A0M(obj));
                } else {
                    throw AnonymousClass8BR.A0x(new C23659BnS());
                }
            }
        }
    }

    public int hashCode() {
        int i = this.count;
        int i2 = (527 + i) * 31;
        int[] iArr = this.A02;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.A03;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = AnonymousClass000.A0O(objArr[i7], i6 * 31);
        }
        return i5 + i6;
    }
}
