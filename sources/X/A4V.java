package X;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class A4V {
    public final AnonymousClass18K A00;
    public final C17930vS A01;
    public final AnonymousClass190 A02;

    public static boolean A01(C17930vS r4, File file, String str, String str2, Map map) {
        try {
            File A05 = C64062u9.A05(file, C17880vN.A0e(r4.A00(), "crash_upload"), file.getName());
            StringBuilder A11 = AnonymousClass000.A11(str2);
            if (A05 == null) {
                C17890vO.A1B(A11, "/compress/empty; exit");
                return false;
            }
            A11.append("/upload/attachment file: ");
            C17890vO.A1A(A11, A05.getAbsolutePath());
            map.put(str, A05.getPath());
            return true;
        } catch (IOException e) {
            C17890vO.A13("/compress/fail; exit", AnonymousClass000.A11(str2), e);
            return false;
        }
    }

    public static void A00(C17930vS r2, String str, String str2, Map map, Map map2) {
        if (str != null && map.containsKey(str)) {
            A01(r2, (File) map.get(str), "tombstone", str2, map2);
        }
    }

    public void A02(HashSet hashSet, Map map, boolean z) {
        this.A02.A0I(hashSet, map, z, false, false, false);
        Iterator A0l = C17890vO.A0l(map);
        while (A0l.hasNext()) {
            C108985cd.A1C(C108945cZ.A17(C17880vN.A0v(A0l)));
        }
    }

    public A4V(AnonymousClass190 r1, AnonymousClass18K r2, C17930vS r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
