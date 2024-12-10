package X;

import java.util.Collections;
import java.util.Map;

public class CNX {
    public final Map A00;
    public final Map A01;

    public CNX(C24784CKd cKd) {
        Map map = cKd.A00;
        this.A00 = map == null ? Collections.emptyMap() : map;
        this.A01 = Collections.emptyMap();
    }
}
