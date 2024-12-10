package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: X.An3  reason: case insensitive filesystem */
public final class C21614An3<T> extends C19800z1<T> implements RandomAccess {
    public int A00;
    public int A01;
    public final int A02;
    public final Object[] A03;

    public Object[] toArray(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            C18070vi.A0X(objArr);
        }
        int size = size();
        int i = this.A01;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.A02) {
            objArr[i3] = this.A03[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = this.A03[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    public final void A0C(int i) {
        if (i < 0) {
            throw AnonymousClass001.A13("n shouldn't be negative but it is ", AnonymousClass000.A10(), i);
        } else if (i > size()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("n shouldn't be greater than the buffer size: n = ");
            A10.append(i);
            A10.append(", size = ");
            A10.append(size());
            throw AnonymousClass000.A0j(A10);
        } else if (i > 0) {
            int i2 = this.A01;
            int i3 = this.A02;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.A03;
            if (i2 > i4) {
                C200310o.A06(objArr, i2, i3);
                C200310o.A06(objArr, 0, i4);
            } else {
                C200310o.A06(objArr, i2, i4);
            }
            this.A01 = i4;
            this.A00 = size() - i;
        }
    }

    public Iterator iterator() {
        return new C21612An1(this);
    }

    public C21614An3(Object[] objArr, int i) {
        this.A03 = objArr;
        if (i >= 0) {
            int length = objArr.length;
            if (i <= length) {
                this.A02 = length;
                this.A00 = i;
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ring buffer filled size: ");
            A10.append(i);
            throw AnonymousClass001.A13(" cannot be larger than the buffer size: ", A10, length);
        }
        throw AnonymousClass001.A13("ring buffer filled size should not be negative but it is ", AnonymousClass000.A10(), i);
    }

    public int A0B() {
        return this.A00;
    }

    public Object get(int i) {
        C29761cp.A02(i, size());
        return this.A03[(this.A01 + i) % this.A02];
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
