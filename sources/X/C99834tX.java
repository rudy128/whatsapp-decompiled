package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4tX  reason: invalid class name and case insensitive filesystem */
public abstract class C99834tX extends C99844tY {
    public static final List A0L(Map map) {
        if (map.size() != 0) {
            Iterator A15 = AnonymousClass000.A15(map);
            if (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (!A15.hasNext()) {
                    return C18070vi.A0M(AnonymousClass1D6.A01(A16.getKey(), A16.getValue()));
                }
                ArrayList A11 = C72453Mb.A11(map);
                AnonymousClass1D6.A02(A16.getKey(), A16.getValue(), A11);
                do {
                    Map.Entry A162 = AnonymousClass000.A16(A15);
                    AnonymousClass1D6.A02(A162.getKey(), A162.getValue(), A11);
                } while (A15.hasNext());
                return A11;
            }
        }
        return C18460wS.A00;
    }
}
