package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.2cD  reason: invalid class name and case insensitive filesystem */
public final class C53242cD {
    public final Collection A00;
    public final Collection A01;

    public C53242cD(String... strArr) {
        Collection emptySet;
        if (r4 == 0) {
            emptySet = Collections.emptySet();
        } else if (r4 == 1) {
            emptySet = Collections.singleton(strArr[0]);
        } else if (r4 == 2 || r4 == 3 || r4 == 4 || r4 == 5) {
            emptySet = Arrays.asList(strArr);
        } else {
            emptySet = new HashSet(Arrays.asList(strArr));
        }
        this.A00 = emptySet;
        this.A01 = C17880vN.A12();
        for (String str : strArr) {
            Collection collection = this.A01;
            Object[] objArr = (Object[]) C62982sJ.A02.A00.get(str);
            C17960vV.A07(objArr);
            Collections.addAll(collection, objArr);
        }
    }
}
