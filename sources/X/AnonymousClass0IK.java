package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0IK  reason: invalid class name */
public final class AnonymousClass0IK {
    public int A00;
    public int[] A01 = new int[16];
    public AnonymousClass0aY[] A02 = new AnonymousClass0aY[16];

    public final void A00(Object obj) {
        int i;
        int i2;
        Object obj2;
        Object obj3;
        int i3 = this.A00;
        int identityHashCode = System.identityHashCode(obj);
        if (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = 0;
            while (true) {
                i2 = i5 + 1;
                if (i5 > i4) {
                    break;
                }
                i = (i5 + i4) >>> 1;
                int[] iArr = this.A01;
                int i6 = iArr[i];
                if (i6 < identityHashCode) {
                    i5 = i + 1;
                } else if (i6 > identityHashCode) {
                    i4 = i - 1;
                } else {
                    AnonymousClass0aY[] r3 = this.A02;
                    AnonymousClass0aY r0 = r3[i];
                    if (r0 != null) {
                        obj2 = r0.get();
                    } else {
                        obj2 = null;
                    }
                    if (obj != obj2) {
                        int i7 = i - 1;
                        while (true) {
                            Object obj4 = null;
                            if (-1 < i7 && iArr[i7] == identityHashCode) {
                                AnonymousClass0aY r02 = r3[i7];
                                if (r02 != null) {
                                    obj4 = r02.get();
                                }
                                if (obj4 != obj) {
                                    i7--;
                                } else {
                                    return;
                                }
                            }
                        }
                        while (true) {
                            i++;
                            if (i < i3) {
                                if (iArr[i] != identityHashCode) {
                                    break;
                                }
                                AnonymousClass0aY r03 = r3[i];
                                if (r03 != null) {
                                    obj3 = r03.get();
                                    continue;
                                } else {
                                    obj3 = null;
                                    continue;
                                }
                                if (obj3 == obj) {
                                    break;
                                }
                            } else {
                                i = i3;
                                break;
                            }
                        }
                        i2 = i + 1;
                    }
                }
            }
            i = -i2;
            if (i >= 0) {
                return;
            }
        } else {
            i = -1;
        }
        int i8 = -(i + 1);
        AnonymousClass0aY[] r7 = this.A02;
        int length = r7.length;
        if (i3 == length) {
            int i9 = length * 2;
            AnonymousClass0aY[] r6 = new AnonymousClass0aY[i9];
            int[] iArr2 = new int[i9];
            int i10 = i8 + 1;
            C200310o.A07(r7, i10, r6, i8, i3);
            C200310o.A07(this.A02, 0, r6, 0, i8);
            C200310o.A02(i10, i8, i3, this.A01, iArr2);
            C200310o.A04(i8, 6, this.A01, iArr2);
            this.A02 = r6;
            this.A01 = iArr2;
        } else {
            int i11 = i8 + 1;
            C200310o.A07(r7, i11, r7, i8, i3);
            int[] iArr3 = this.A01;
            C200310o.A02(i11, i8, i3, iArr3, iArr3);
        }
        this.A02[i8] = new WeakReference(obj);
        this.A01[i8] = identityHashCode;
        this.A00++;
    }
}
