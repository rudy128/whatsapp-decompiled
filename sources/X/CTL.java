package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class CTL {
    public Integer A00;
    public final C26892DHz A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Set A05;
    public final Set A06;

    public CTL(C26892DHz dHz, String str, String str2, Map map, Set set) {
        Set unmodifiableSet = Collections.unmodifiableSet(set);
        this.A05 = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.A04 = map;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = dHz == null ? C26892DHz.A00 : dHz;
        HashSet A12 = AnonymousClass8BR.A12(unmodifiableSet);
        Iterator A0l = C17890vO.A0l(map);
        if (A0l.hasNext()) {
            A0l.next();
            throw AnonymousClass000.A0s("zaa");
        } else {
            this.A06 = Collections.unmodifiableSet(A12);
        }
    }
}
