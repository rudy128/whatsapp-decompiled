package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.9y9  reason: invalid class name and case insensitive filesystem */
public class C198319y9 {
    public final C223819r A00;
    public final A4V A01;
    public final C17930vS A02;
    public final AnonymousClass18K A03;

    public C198319y9(C223819r r1, A4V a4v, AnonymousClass18K r3, C17930vS r4) {
        this.A03 = r3;
        this.A02 = r4;
        this.A00 = r1;
        this.A01 = a4v;
    }

    public static void A00(C198319y9 r5, File file, Map map) {
        int indexOf;
        String substring;
        String A0o;
        String name = file.getName();
        C171618s0 r3 = new C171618s0();
        r3.A02 = AnonymousClass3MY.A0f();
        r3.A03 = C108975cc.A0X();
        r3.A09 = "native";
        int indexOf2 = name.indexOf("_");
        if (indexOf2 > 0 && (A0o = AnonymousClass8BS.A0o(name, indexOf2)) != null) {
            r3.A06 = A0o;
        }
        int i = indexOf2 + 1;
        if (i > 1 && (indexOf = name.indexOf("_", i)) >= 0 && (substring = name.substring(i, indexOf)) != null && map.containsKey(substring)) {
            C198069xj.A00(r3, (File) map.get(substring));
        }
        r5.A03.CC4(r3);
    }
}
