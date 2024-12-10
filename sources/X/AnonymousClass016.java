package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.016  reason: invalid class name */
public final class AnonymousClass016<E> implements Collection<E>, Set<E>, C23161Ex, C23171Ey {
    public int A00;
    public int[] A01;
    public Object[] A02;

    public /* synthetic */ AnonymousClass016(AnonymousClass1Y1 r2, int i, int i2) {
        this(0);
    }

    public final void A06(int[] iArr) {
        C18070vi.A0d(iArr, 0);
        this.A01 = iArr;
    }

    public final void A07(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        this.A02 = objArr;
    }

    public boolean addAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        A03(this.A00 + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public boolean containsAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size()) {
                try {
                    int i = this.A00;
                    int i2 = 0;
                    while (i2 < i) {
                        if (set.contains(this.A02[i2])) {
                            i2++;
                        }
                    }
                    return true;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        boolean z = false;
        for (int i = this.A00 - 1; -1 < i; i--) {
            if (!C29431cG.A18(collection, this.A02[i])) {
                A04(i);
                z = true;
            }
        }
        return z;
    }

    public final Object[] toArray(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        int i = this.A00;
        int length = objArr.length;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (length > i) {
            objArr[i] = null;
        }
        C200310o.A07(this.A02, 0, objArr, 0, this.A00);
        C18070vi.A0X(objArr);
        return objArr;
    }

    public static final int A00(AnonymousClass016 r4, Object obj, int i) {
        int i2 = r4.A00;
        if (i2 == 0) {
            return -1;
        }
        try {
            int A002 = AnonymousClass00Q.A00(r4.A01, i2, i);
            if (A002 < 0 || C18070vi.A18(obj, r4.A02[A002])) {
                return A002;
            }
            int i3 = A002 + 1;
            while (i3 < i2 && r4.A01[i3] == i) {
                if (C18070vi.A18(obj, r4.A02[i3])) {
                    return i3;
                }
                i3++;
            }
            do {
                A002--;
                if (A002 < 0 || r4.A01[A002] != i) {
                    return i3 ^ -1;
                }
            } while (!C18070vi.A18(obj, r4.A02[A002]));
            return A002;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object A02(int i) {
        return this.A02[i];
    }

    public final void A03(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < i) {
            Object[] objArr = this.A02;
            A06(new int[i]);
            A07(new Object[i]);
            int i3 = this.A00;
            if (i3 > 0) {
                C200310o.A04(i3, 6, iArr, this.A01);
                C200310o.A07(objArr, 0, this.A02, 0, this.A00);
            }
        }
        if (this.A00 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A04(int i) {
        int i2 = this.A00;
        Object[] objArr = this.A02;
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.A01;
        int length = iArr.length;
        int i4 = 8;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i5 = i + 1;
                int i6 = i3 + 1;
                C200310o.A02(i, i5, i6, iArr, iArr);
                Object[] objArr2 = this.A02;
                C200310o.A07(objArr2, i, objArr2, i5, i6);
            }
            this.A02[i3] = null;
        } else {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            A06(new int[i4]);
            A07(new Object[i4]);
            if (i > 0) {
                C200310o.A04(i, 6, iArr, this.A01);
                C200310o.A07(objArr, 0, this.A02, 0, i);
            }
            if (i < i3) {
                int i7 = i + 1;
                int i8 = i3 + 1;
                C200310o.A02(i, i7, i8, iArr, this.A01);
                C200310o.A07(objArr, i, this.A02, i7, i8);
            }
        }
        if (i2 == this.A00) {
            this.A00 = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void A05(AnonymousClass016 r4) {
        int i = r4.A00;
        for (int i2 = 0; i2 < i; i2++) {
            remove(r4.A02[i2]);
        }
    }

    public boolean add(Object obj) {
        int hashCode;
        int A002;
        int i = this.A00;
        if (obj == null) {
            A002 = A00(this, (Object) null, 0);
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A002 = A00(this, obj, hashCode);
        }
        if (A002 >= 0) {
            return false;
        }
        int i2 = A002 ^ -1;
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            int i3 = 8;
            if (i >= 8) {
                i3 = (i >> 1) + i;
            } else if (i < 4) {
                i3 = 4;
            }
            Object[] objArr = this.A02;
            A06(new int[i3]);
            A07(new Object[i3]);
            if (i == this.A00) {
                int[] iArr2 = this.A01;
                if (iArr2.length != 0) {
                    C200310o.A04(iArr.length, 6, iArr, iArr2);
                    C200310o.A07(objArr, 0, this.A02, 0, objArr.length);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i2 < i) {
            int[] iArr3 = this.A01;
            int i4 = i2 + 1;
            C200310o.A02(i4, i2, i, iArr3, iArr3);
            Object[] objArr2 = this.A02;
            C200310o.A07(objArr2, i4, objArr2, i2, i);
        }
        int i5 = this.A00;
        if (i == i5) {
            int[] iArr4 = this.A01;
            if (i2 < iArr4.length) {
                iArr4[i2] = hashCode;
                this.A02[i2] = obj;
                this.A00 = i5 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        if (this.A00 != 0) {
            A06(AnonymousClass00Q.A00);
            A07(AnonymousClass00Q.A02);
            this.A00 = 0;
        }
    }

    public boolean contains(Object obj) {
        int A002;
        if (obj == null) {
            A002 = A00(this, (Object) null, 0);
        } else {
            A002 = A00(this, obj, obj.hashCode());
        }
        if (A002 >= 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public boolean isEmpty() {
        if (this.A00 <= 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new AnonymousClass018(this);
    }

    public boolean remove(Object obj) {
        int A002;
        if (obj == null) {
            A002 = A00(this, (Object) null, 0);
        } else {
            A002 = A00(this, obj, obj.hashCode());
        }
        if (A002 < 0) {
            return false;
        }
        A04(A002);
        return true;
    }

    public final int A01() {
        return this.A00;
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i * 14);
        sb.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.A02[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String obj2 = sb.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }

    public AnonymousClass016(int i) {
        this.A01 = AnonymousClass00Q.A00;
        this.A02 = AnonymousClass00Q.A02;
        if (i > 0) {
            A06(new int[i]);
            A07(new Object[i]);
        }
    }

    public final Object[] toArray() {
        return C200310o.A0E(this.A02, 0, this.A00);
    }

    public AnonymousClass016(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    public AnonymousClass016() {
        this(0);
    }
}
