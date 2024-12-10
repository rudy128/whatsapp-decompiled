package X;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cre  reason: case insensitive filesystem */
public abstract class C26064Cre {
    public static Object[] newArray(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static Object[] copy(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static Set preservesInsertionOrderOnAddsSet() {
        return C27308Dbf.create();
    }

    public static Map preservesInsertionOrderOnPutsMap() {
        return C27301DbX.create();
    }
}
