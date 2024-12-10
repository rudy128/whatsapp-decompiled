package X;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Cko  reason: case insensitive filesystem */
public final class C25718Cko {
    public Map A00 = null;
    public final String A01;

    public static C25775Clm A00(C25718Cko cko, C24244By2 by2, int i) {
        cko.A02(new DN6(by2, i));
        return cko.A01();
    }

    public C25775Clm A01() {
        Map unmodifiableMap;
        String str = this.A01;
        Map map = this.A00;
        if (map == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(BE6.A10(map));
        }
        return new C25775Clm(str, unmodifiableMap);
    }

    public void A02(Annotation annotation) {
        Map map = this.A00;
        if (map == null) {
            map = C17880vN.A11();
            this.A00 = map;
        }
        map.put(annotation.annotationType(), annotation);
    }

    public C25718Cko(String str) {
        this.A01 = str;
    }
}
