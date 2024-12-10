package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;

/* renamed from: X.081  reason: invalid class name */
public final class AnonymousClass081<E> extends C07330al<E> implements C17810vG<E> {
    public static final AnonymousClass081 A01 = new AnonymousClass081(new Object[0]);
    public final Object[] A00;

    public int A0B() {
        return this.A00.length;
    }

    public C07360ao BDf() {
        return new C07360ao(this, (Object[]) null, this.A00, 0);
    }

    public C17800vF CEZ(C22821Di r10) {
        Object[] objArr = this.A00;
        Object[] objArr2 = objArr;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr2[i];
            if (AnonymousClass000.A1Y(r10.invoke(obj))) {
                if (!z) {
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    C18070vi.A0X(objArr);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return A01;
        }
        return new AnonymousClass081(C200310o.A0E(objArr, 0, size));
    }

    public int indexOf(Object obj) {
        return C200410p.A0H(this.A00, obj);
    }

    public int lastIndexOf(Object obj) {
        int i;
        int i2;
        Object[] objArr = this.A00;
        int length = objArr.length - 1;
        if (obj == null) {
            if (length >= 0) {
                do {
                    i2 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    length = i2;
                } while (i2 >= 0);
            }
        } else if (length >= 0) {
            do {
                i = length - 1;
                if (obj.equals(objArr[length])) {
                    return length;
                }
                length = i;
            } while (i >= 0);
        }
        return -1;
    }

    public AnonymousClass081(Object[] objArr) {
        this.A00 = objArr;
    }

    public C17800vF BAl(Object obj) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.A00, size() + 1);
            C18070vi.A0X(copyOf);
            copyOf[size()] = obj;
            return new AnonymousClass081(copyOf);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return new AnonymousClass082(this.A00, objArr, size() + 1, 0);
    }

    public C17800vF BAp(Object obj, int i) {
        AnonymousClass0LB.A01(i, size());
        if (i == size()) {
            return BAl(obj);
        }
        if (size() < 32) {
            Object[] objArr = new Object[(size() + 1)];
            Object[] objArr2 = this.A00;
            C200310o.A07(objArr2, 0, objArr, 0, i);
            C200310o.A07(objArr2, i + 1, objArr, i, size());
            objArr[i] = obj;
            return new AnonymousClass081(objArr);
        }
        Object[] objArr3 = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr3, objArr3.length);
        C18070vi.A0X(copyOf);
        C200310o.A07(objArr3, i + 1, copyOf, i, size() - 1);
        copyOf[i] = obj;
        Object obj2 = objArr3[31];
        Object[] objArr4 = new Object[32];
        objArr4[0] = obj2;
        return new AnonymousClass082(copyOf, objArr4, size() + 1, 0);
    }

    public C17800vF BAx(Collection collection) {
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.A00, size() + collection.size());
            C18070vi.A0X(copyOf);
            int size = size();
            for (Object obj : collection) {
                copyOf[size] = obj;
                size++;
            }
            return new AnonymousClass081(copyOf);
        }
        C07360ao BDf = BDf();
        BDf.addAll(collection);
        return BDf.A0V();
    }

    public C17800vF CEb(int i) {
        AnonymousClass0LB.A00(i, size());
        if (size() == 1) {
            return A01;
        }
        Object[] objArr = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr, size() - 1);
        C18070vi.A0X(copyOf);
        C200310o.A07(objArr, i, copyOf, i + 1, size());
        return new AnonymousClass081(copyOf);
    }

    public C17800vF CHk(Object obj, int i) {
        AnonymousClass0LB.A00(i, size());
        Object[] objArr = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C18070vi.A0X(copyOf);
        copyOf[i] = obj;
        return new AnonymousClass081(copyOf);
    }

    public Object get(int i) {
        AnonymousClass0LB.A00(i, size());
        return this.A00[i];
    }

    public ListIterator listIterator(int i) {
        AnonymousClass0LB.A01(i, size());
        return new C012807w(this.A00, i, size());
    }
}
