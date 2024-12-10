package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.CYx  reason: case insensitive filesystem */
public final class C25124CYx {
    public Map A00 = null;
    public C25776Cln[] A01;
    public final String A02;
    public final byte[] A03;

    public void A00(C24277Bya bya, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = new EnumMap(C24277Bya.class);
            this.A00 = map;
        }
        map.put(bya, obj);
    }

    public String toString() {
        return this.A02;
    }

    public C25124CYx(String str, byte[] bArr, C25776Cln[] clnArr) {
        System.currentTimeMillis();
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = clnArr;
    }
}
