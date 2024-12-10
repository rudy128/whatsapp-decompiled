package X;

import java.util.NoSuchElementException;

/* renamed from: X.07z  reason: invalid class name and case insensitive filesystem */
public final class C013107z extends C06910a3 {
    public int A00;
    public boolean A01;
    public Object[] A02;

    private final void A01(int i, int i2) {
        int i3 = (this.A00 - i2) * 5;
        while (i2 < this.A00) {
            Object[] objArr = this.A02;
            Object[] objArr2 = objArr[i2 - 1];
            C18070vi.A0z(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    public C013107z(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.A00 = i3;
        Object[] objArr2 = new Object[i3];
        this.A02 = objArr2;
        boolean A1T = AnonymousClass000.A1T(i, i2);
        this.A01 = A1T;
        objArr2[0] = objArr;
        A01(i - (A1T ? 1 : 0), 1);
    }

    private final Object A00() {
        int A022 = A02() & 31;
        Object obj = this.A02[this.A00 - 1];
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[A022];
    }

    public final void A08(Object[] objArr, int i, int i2, int i3) {
        A06(i);
        A07(i2);
        this.A00 = i3;
        Object[] objArr2 = this.A02;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            this.A02 = objArr2;
        }
        boolean z = false;
        objArr2[0] = objArr;
        if (i == i2) {
            z = true;
        }
        this.A01 = z;
        A01(i - (z ? 1 : 0), 1);
    }

    public Object next() {
        if (hasNext()) {
            Object A002 = A00();
            A06(A02() + 1);
            int A022 = A02();
            if (A022 == A03()) {
                this.A01 = true;
            } else {
                int i = 0;
                while (((A022 >> i) & 31) == 0) {
                    i += 5;
                }
                if (i > 0) {
                    A01(A022, ((this.A00 - 1) - (i / 5)) + 1);
                    return A002;
                }
            }
            return A002;
        }
        throw new NoSuchElementException();
    }

    public Object previous() {
        int A022;
        if (hasPrevious()) {
            A06(A02() - 1);
            if (this.A01) {
                this.A01 = false;
            } else {
                int i = 0;
                while (true) {
                    A022 = A02();
                    if (((A022 >> i) & 31) != 31) {
                        break;
                    }
                    i += 5;
                }
                if (i > 0) {
                    A01(A022, ((this.A00 - 1) - (i / 5)) + 1);
                }
            }
            return A00();
        }
        throw new NoSuchElementException();
    }
}
