package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2iS  reason: invalid class name and case insensitive filesystem */
public final class C57052iS {
    public static volatile C191869nK A01;
    public static volatile boolean A02;
    public final Map A00;

    public C57052iS(Map map) {
        C18070vi.A0d(map, 1);
        this.A00 = map;
    }

    public final C191869nK A00() {
        if (!A02) {
            A02 = true;
            if (A01 == null) {
                try {
                    C51682Zf r0 = (C51682Zf) AnonymousClass000.A0w(this.A00, 0);
                    if (r0 != null) {
                        A01 = r0.A00;
                    }
                } catch (Exception e) {
                    Log.e("wfs-bridge-factory", e);
                    return null;
                }
            }
        }
        return A01;
    }
}
