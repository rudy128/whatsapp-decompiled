package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Map;

public final class A4A {
    public Map A00 = C17880vN.A11();
    public final C18010vc A01;
    public final AnonymousClass118 A02;
    public volatile AiK A03;

    public static final AiK A00(A4A a4a) {
        if (a4a.A03 == null) {
            synchronized (a4a) {
                if (a4a.A03 == null) {
                    try {
                        a4a.A03 = AiK.A01((C183489Yl) null, C17880vN.A0e(C108945cZ.A16(a4a.A02), "bk_cache_dir"), 10485760);
                    } catch (IOException unused) {
                        Log.e("BkCacheSaveOnDiskHelper/getCache/unable to initialize disk cache for bk cache");
                    }
                }
            }
        }
        return a4a.A03;
    }

    public static final void A01(A4A a4a) {
        C17880vN.A1E(C108955ca.A0C(a4a.A01, "bloks").edit(), "bk_cache_lookup_map", a4a.A00.values().toString());
    }

    public A4A(AnonymousClass118 r2, C18010vc r3) {
        C18070vi.A0j(r2, r3);
        this.A02 = r2;
        this.A01 = r3;
        Boolean bool = C17960vV.A01;
    }
}
