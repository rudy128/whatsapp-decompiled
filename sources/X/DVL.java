package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class DVL implements Map, Serializable {
    public static final Map.Entry[] A01 = new Map.Entry[0];
    public transient C23341BfT A00;

    public final boolean containsValue(Object obj) {
        return ((C23346BfY) this).A00.contains(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r1 < 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = r4
            X.BfY r3 = (X.C23346BfY) r3
            X.BfS r0 = r3.A01
            r2 = -1
            if (r5 == 0) goto L_0x0012
            X.BfX r1 = r0.A01     // Catch:{ ClassCastException -> 0x0012 }
            java.util.Comparator r0 = r0.A02     // Catch:{ ClassCastException -> 0x0012 }
            int r1 = java.util.Collections.binarySearch(r1, r5, r0)     // Catch:{ ClassCastException -> 0x0012 }
            if (r1 >= 0) goto L_0x0013
        L_0x0012:
            r1 = -1
        L_0x0013:
            if (r1 != r2) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            X.BfX r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DVL.get(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return ((C23346BfY) this).A01;
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return ((C23346BfY) this).A00;
    }

    /* renamed from: A02 */
    public final C23341BfT entrySet() {
        C23341BfT bfT = this.A00;
        if (bfT == null) {
            C23346BfY bfY = (C23346BfY) this;
            if (bfY.isEmpty()) {
                bfT = C23348Bfa.A05;
            } else {
                bfT = new C23347BfZ(bfY);
            }
            this.A00 = bfT;
        }
        return bfT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Deprecated
    public final void clear() {
        throw C17880vN.A0y();
    }

    public final boolean containsKey(Object obj) {
        return AnonymousClass000.A1W(get(obj));
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        int i = 0;
        for (Object A0l : entrySet()) {
            i += AnonymousClass001.A0l(A0l);
        }
        return i;
    }

    public final boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw C17880vN.A0y();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder A0t = BE6.A0t((int) Math.min(((long) size) * 8, 1073741824));
            A0t.append('{');
            Iterator it = entrySet().iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(it);
                if (!z) {
                    A0t.append(", ");
                }
                A0t.append(A16.getKey());
                A0t.append('=');
                A0t.append(A16.getValue());
                z = false;
            }
            return C17890vO.A0b(A0t);
        }
        throw AnonymousClass001.A13("size cannot be negative but was: ", AnonymousClass000.A10(), size);
    }
}
