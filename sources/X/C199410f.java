package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: X.10f  reason: invalid class name and case insensitive filesystem */
public abstract class C199410f<E> extends C199310e<E> implements Set<E> {
    public static final long serialVersionUID = 912559;
    public transient AnonymousClass1IX asList;

    public static int chooseTableSize(int i) {
        int i2;
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1) << 1;
            while (((double) i2) * 0.7d < ((double) max)) {
                i2 <<= 1;
            }
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(String.valueOf("collection too large"));
            }
        }
        return i2;
    }

    public static C199410f construct(int i, Object... objArr) {
        Object[] objArr2 = objArr;
        if (i == 0) {
            return of();
        }
        if (i != 1) {
            int chooseTableSize = chooseTableSize(i);
            Object[] objArr3 = new Object[chooseTableSize];
            int i2 = chooseTableSize - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                AnonymousClass1HW.checkElementNotNull(obj, i5);
                int hashCode = obj.hashCode();
                int smear = AnonymousClass111.smear(hashCode);
                while (true) {
                    int i6 = smear & i2;
                    Object obj2 = objArr3[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        smear++;
                    } else {
                        objArr[i4] = obj;
                        objArr3[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new C199510g(obj3);
            } else if (chooseTableSize(i4) < chooseTableSize / 2) {
                return construct(i4, objArr);
            } else {
                if (shouldTrim(i4, objArr.length)) {
                    objArr2 = Arrays.copyOf(objArr, i4);
                }
                return new AnonymousClass1HX(objArr2, i3, objArr3, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return of(obj4);
        }
    }

    public static C199410f copyOf(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return construct(length, (Object[]) objArr.clone());
        }
        return of(objArr[0]);
    }

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public static AnonymousClass1F8 builder() {
        return new AnonymousClass1F8();
    }

    public static AnonymousClass1F8 builderWithExpectedSize(int i) {
        C201310y.checkNonnegative(i, "expectedSize");
        return new AnonymousClass1F8(i);
    }

    public static C199410f of(Object obj) {
        return new C199510g(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public AnonymousClass1IX asList() {
        AnonymousClass1IX r0 = this.asList;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1IX createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C199410f) || !isHashCodeFast() || !((C199410f) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return C63772tf.equalsImpl(this, obj);
        }
        return false;
    }

    public AnonymousClass1IX createAsList() {
        return AnonymousClass1IX.asImmutableList(toArray());
    }

    public int hashCode() {
        return C63772tf.hashCodeImpl(this);
    }

    public Object writeReplace() {
        return new AnonymousClass3BZ(toArray());
    }

    public static C199410f copyOf(Collection collection) {
        if ((collection instanceof C199410f) && !(collection instanceof SortedSet)) {
            C199410f r1 = (C199410f) collection;
            if (!r1.isPartialView()) {
                return r1;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static C199410f of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return construct(5, obj, obj2, obj3, obj4, obj5);
    }

    public static C199410f of(Object obj, Object obj2, Object obj3) {
        return construct(3, obj, obj2, obj3);
    }

    public static C199410f of(Object obj, Object obj2, Object obj3, Object obj4) {
        return construct(4, obj, obj2, obj3, obj4);
    }

    public static C199410f of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return construct(i, objArr2);
    }

    public static C199410f of(Object obj, Object obj2) {
        return construct(2, obj, obj2);
    }

    public static C199410f of() {
        return AnonymousClass1HX.EMPTY;
    }
}
