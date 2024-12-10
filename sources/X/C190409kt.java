package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.9kt  reason: invalid class name and case insensitive filesystem */
public class C190409kt {
    public final BDh A00;
    public final Map A01;
    public final Map A02;

    public C190409kt(BDh bDh, Map map, Map map2) {
        this.A01 = map;
        this.A02 = map2;
        this.A00 = bDh;
    }

    public byte[] A00(Object obj) {
        ByteArrayOutputStream A15 = C108945cZ.A15();
        try {
            DN3 dn3 = new DN3(this.A00, A15, this.A01, this.A02);
            Map map = dn3.A02;
            Class<?> cls = obj.getClass();
            E65 e65 = (E65) map.get(cls);
            if (e65 != null) {
                e65.BK0(obj, dn3);
                return A15.toByteArray();
            }
            throw new C21580AmU(AnonymousClass001.A1E(cls, "No encoder for ", AnonymousClass000.A10()));
        } catch (IOException unused) {
        }
    }
}
