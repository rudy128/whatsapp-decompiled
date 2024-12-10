package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.0a9  reason: invalid class name and case insensitive filesystem */
public final class C06970a9 implements RandomAccess {
    public int A00 = 0;
    public Object[] A01;
    public List A02;

    public C06970a9(Object[] objArr) {
        this.A01 = objArr;
    }

    public static AnonymousClass0XW A03(C06970a9 r1, int i) {
        return (AnonymousClass0XW) r1.A06(i - 1);
    }

    public static C06970a9 A01() {
        return new C06970a9(new AnonymousClass0XW[16]);
    }

    public static C06970a9 A02(Object[] objArr) {
        return new C06970a9(objArr);
    }

    public final int A04(Object obj) {
        int i = this.A00;
        if (i <= 0) {
            return -1;
        }
        Object[] objArr = this.A01;
        int i2 = 0;
        while (!C18070vi.A18(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final int A05(Object obj) {
        int i = this.A00;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        while (!C18070vi.A18(obj, objArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    public final Object A06(int i) {
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        int i2 = this.A00;
        if (i != i2 - 1) {
            C200310o.A07(objArr, i, objArr, i + 1, i2);
        }
        int i3 = this.A00 - 1;
        this.A00 = i3;
        objArr[i3] = null;
        return obj;
    }

    public final List A07() {
        List list = this.A02;
        if (list != null) {
            return list;
        }
        C06860Zy r0 = new C06860Zy(this);
        this.A02 = r0;
        return r0;
    }

    public final void A08() {
        Object[] objArr = this.A01;
        int i = this.A00;
        while (true) {
            i--;
            if (-1 < i) {
                objArr[i] = null;
            } else {
                this.A00 = 0;
                return;
            }
        }
    }

    public final void A09(int i) {
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, length * 2));
            C18070vi.A0X(copyOf);
            this.A01 = copyOf;
        }
    }

    public final void A0A(int i, int i2) {
        if (i2 > i) {
            int i3 = this.A00;
            if (i2 < i3) {
                Object[] objArr = this.A01;
                C200310o.A07(objArr, i, objArr, i2, i3);
            }
            int i4 = this.A00;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.A01[i7] = null;
                    if (i7 == i6) {
                        break;
                    }
                    i7++;
                }
            }
            this.A00 = i5;
        }
    }

    public final void A0B(int i, Object obj) {
        A09(this.A00 + 1);
        Object[] objArr = this.A01;
        int i2 = this.A00;
        if (i != i2) {
            C200310o.A07(objArr, i + 1, objArr, i, i2);
        }
        objArr[i] = obj;
        this.A00++;
    }

    public final void A0C(C06970a9 r5, int i) {
        int i2 = r5.A00;
        if (i2 != 0) {
            A09(this.A00 + i2);
            Object[] objArr = this.A01;
            int i3 = this.A00;
            if (i != i3) {
                C200310o.A07(objArr, r5.A00 + i, objArr, i, i3);
            }
            C200310o.A07(r5.A01, i, objArr, 0, r5.A00);
            this.A00 += r5.A00;
        }
    }

    public final void A0D(Comparator comparator) {
        Arrays.sort(this.A01, 0, this.A00, comparator);
    }

    public final boolean A0F(Object obj) {
        A09(this.A00 + 1);
        Object[] objArr = this.A01;
        int i = this.A00;
        objArr[i] = obj;
        this.A00 = i + 1;
        return true;
    }

    public final boolean A0G(Object obj) {
        int i = this.A00 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (!C18070vi.A18(this.A01[i2], obj)) {
                if (i2 != i) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public static int A00(C06970a9 r0) {
        return r0.A07().size();
    }

    public final boolean A0E(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        A09(this.A00 + collection.size());
        Object[] objArr = this.A01;
        if (i != this.A00) {
            C200310o.A07(objArr, collection.size() + i, objArr, i, this.A00);
        }
        for (Object next : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            objArr[i2 + i] = next;
            i2 = i3;
        }
        this.A00 += collection.size();
        return true;
    }

    public final boolean A0H(Object obj) {
        int A04 = A04(obj);
        if (A04 < 0) {
            return false;
        }
        A06(A04);
        return true;
    }
}
