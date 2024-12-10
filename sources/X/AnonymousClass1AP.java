package X;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1AP  reason: invalid class name */
public abstract class AnonymousClass1AP extends AnonymousClass1AO {
    public static final HashSet A01(Object... objArr) {
        HashSet hashSet = new HashSet(C200610r.A03(objArr.length));
        C200410p.A0T(hashSet, objArr);
        return hashSet;
    }

    public static final LinkedHashSet A02(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C200610r.A03(objArr.length));
        C200410p.A0T(linkedHashSet, objArr);
        return linkedHashSet;
    }

    public static final Set A03(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C200610r.A03(objArr.length));
        C200410p.A0T(linkedHashSet, objArr);
        return linkedHashSet;
    }
}
