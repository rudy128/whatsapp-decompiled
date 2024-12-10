package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.9QA  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass9QA {
    public static LinkedHashMap A00(C19830z4 r7) {
        C19770yy r0;
        Number valueOf;
        Object obj;
        SharedPreferences A0B = C17890vO.A0B(r7);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = r7.A0s().iterator();
        while (it.hasNext()) {
            C19760yx r1 = (C19760yx) it.next();
            String str = (String) r1.A00;
            if (A0B.contains(str) && (r0 = (C19770yy) r1.A01) != null) {
                int ordinal = r0.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        C18070vi.A0b(str);
                        obj = new AQW(A0B.getBoolean(str, false));
                    } else if (ordinal == 2) {
                        String string = A0B.getString(str, (String) null);
                        if (string != null) {
                            C18070vi.A0b(str);
                            obj = new AQV(string);
                        }
                    } else if (ordinal == 3) {
                        Set<String> stringSet = A0B.getStringSet(str, (Set) null);
                        if (stringSet != null && C108945cZ.A1U(stringSet)) {
                            C18070vi.A0b(str);
                            ArrayList A0D = C29351c6.A0D(stringSet);
                            Iterator<String> it2 = stringSet.iterator();
                            while (it2.hasNext()) {
                                String A0v = C17880vN.A0v(it2);
                                C72453Mb.A1R(A0v);
                                A0D.add(new AQV(A0v));
                            }
                            obj = new AQT(A0D);
                        }
                    } else if (ordinal == 4) {
                        C18070vi.A0b(str);
                        valueOf = Long.valueOf(C17890vO.A05(A0B, str));
                    }
                    A13.put(str, obj);
                } else {
                    C18070vi.A0b(str);
                    valueOf = Integer.valueOf(A0B.getInt(str, 0));
                }
                obj = new AQU(valueOf);
                A13.put(str, obj);
            }
        }
        return A13;
    }
}
