package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.3Bk  reason: invalid class name and case insensitive filesystem */
public class C70523Bk implements Iterable {
    public final Map A00 = new TreeMap(Collections.reverseOrder());

    public Long A00() {
        Map map = this.A00;
        if (map.isEmpty()) {
            return null;
        }
        return (Long) C17890vO.A0P(AnonymousClass000.A15(map));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AnonymousClass026.A00(this.A00, ((C70523Bk) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Iterator iterator() {
        return C17890vO.A0l(this.A00);
    }
}
