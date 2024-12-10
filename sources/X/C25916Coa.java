package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Coa  reason: case insensitive filesystem */
public abstract class C25916Coa {
    public static final Object[] A00 = BE6.A1Z();

    public static final Object[] A01(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int i = 0;
        if (objArr != null) {
            int size = collection.size();
            int i2 = 0;
            if (size != 0) {
                Iterator it = collection.iterator();
                if (it.hasNext()) {
                    if (size <= objArr.length) {
                        objArr2 = objArr;
                    } else {
                        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                        C18070vi.A0z(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArr2 = (Object[]) newInstance;
                    }
                    while (true) {
                        i++;
                        objArr2[i2] = it.next();
                        int length = objArr2.length;
                        boolean hasNext = it.hasNext();
                        if (i >= length) {
                            if (!hasNext) {
                                return objArr2;
                            }
                            int i3 = ((i * 3) + 1) >>> 1;
                            if (i3 <= i) {
                                i3 = 2147483645;
                                if (i >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i3);
                            C18070vi.A0X(objArr2);
                        } else if (!hasNext) {
                            if (objArr2 != objArr) {
                                Object[] copyOf = Arrays.copyOf(objArr2, i);
                                C18070vi.A0X(copyOf);
                                return copyOf;
                            }
                        }
                        i2 = i;
                    }
                    objArr[i] = null;
                    return objArr;
                }
            }
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[i] = null;
            return objArr;
        }
        throw BE6.A0m();
    }

    public static final Object[] A00(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    int length = objArr.length;
                    boolean hasNext = it.hasNext();
                    if (i2 >= length) {
                        if (!hasNext) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        C18070vi.A0X(objArr);
                    } else if (!hasNext) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        C18070vi.A0X(copyOf);
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return A00;
    }
}
