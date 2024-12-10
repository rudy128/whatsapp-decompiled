package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6W7  reason: invalid class name */
public abstract class AnonymousClass6W7 {
    public static final Pair A00(C18000vb r10, List list) {
        String A0K;
        String str;
        boolean A17 = C18070vi.A17(list, r10);
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        int size = list.size();
        String str2 = "";
        for (int i = 0; i < size; i++) {
            AnonymousClass1E7 contact = ((C1599786p) list.get(i)).getContact();
            if (!(contact == null || (A0K = contact.A0K()) == null || A0K.length() == 0)) {
                String A0E = AnonymousClass1EG.A0E(A0K, A17 ? 1 : 0);
                if (A0E != null) {
                    Locale A0N = r10.A0N();
                    C18070vi.A0X(A0N);
                    str = A0E.toUpperCase(A0N);
                    C18070vi.A0X(str);
                } else {
                    str = "";
                }
                if (Character.isDigit(str.codePointAt(0)) || "+".equals(str)) {
                    str = "#";
                }
                if (!str2.equals(str)) {
                    A13.add(str);
                    C17890vO.A1D(A132, i);
                    str2 = str;
                }
            }
        }
        return C108945cZ.A0N(A13, A132);
    }
}
