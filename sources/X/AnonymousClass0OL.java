package X;

/* renamed from: X.0OL  reason: invalid class name */
public final class AnonymousClass0OL {
    public int A00;
    public Object[] A01 = new Object[16];
    public Object[] A02 = new Object[16];

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0OL] */
    public static void A01(AnonymousClass0VT r3) {
        ? obj = new Object();
        obj.A01 = new Object[16];
        obj.A02 = new Object[16];
        r3.A00 = obj;
    }

    public final void A02(Object obj, Object obj2) {
        Object[] objArr = this.A01;
        Object[] objArr2 = this.A02;
        int i = this.A00;
        int A002 = A00(this, obj);
        if (A002 >= 0) {
            objArr2[A002] = obj2;
            return;
        }
        int i2 = -(A002 + 1);
        boolean z = false;
        Object[] objArr3 = objArr;
        if (i == objArr.length) {
            z = true;
            objArr3 = new Object[(i * 2)];
        }
        int i3 = i2 + 1;
        C200310o.A07(objArr, i3, objArr3, i2, i);
        if (z) {
            C200310o.A07(objArr, 0, objArr3, 0, i2);
        }
        objArr3[i2] = obj;
        this.A01 = objArr3;
        Object[] objArr4 = objArr2;
        if (z) {
            objArr4 = new Object[(i * 2)];
        }
        C200310o.A07(objArr2, i3, objArr4, i2, i);
        if (z) {
            C200310o.A07(objArr2, 0, objArr4, 0, i2);
        }
        objArr4[i2] = obj2;
        this.A02 = objArr4;
        this.A00++;
    }

    public static final int A00(AnonymousClass0OL r8, Object obj) {
        int i;
        int identityHashCode = System.identityHashCode(obj);
        int i2 = r8.A00;
        int i3 = i2 - 1;
        Object[] objArr = r8.A01;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            Object obj2 = objArr[i5];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i4 = i5 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i3 = i5 - 1;
            } else if (obj == obj2) {
                return i5;
            } else {
                int i6 = i5 - 1;
                while (-1 < i6) {
                    Object obj3 = objArr[i6];
                    if (obj3 != obj) {
                        if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                        i6--;
                    } else {
                        return i6;
                    }
                }
                while (true) {
                    i5++;
                    if (i5 >= i2) {
                        i = i2 + 1;
                        break;
                    }
                    Object obj4 = objArr[i5];
                    if (obj4 != obj) {
                        if (System.identityHashCode(obj4) != identityHashCode) {
                            i = i5 + 1;
                            break;
                        }
                    } else {
                        return i5;
                    }
                }
                return -i;
            }
        }
        return -(i4 + 1);
    }
}
