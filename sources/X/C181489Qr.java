package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.9Qr  reason: invalid class name and case insensitive filesystem */
public abstract class C181489Qr {
    public static final ArrayList A00(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C195269t4 r4 = (C195269t4) it.next();
            JSONObject A15 = C17880vN.A15();
            JSONObject A0x = C108965cb.A0x(r4.A04, "module", A15);
            String str = r4.A00;
            if (str != null) {
                A0x.put(r4.A01, str);
            }
            String str2 = r4.A02;
            if (str2 != null) {
                A0x.put("ranking_logic_ver", str2);
            }
            String str3 = r4.A03;
            if (str3 != null) {
                A0x.put("source", str3);
            }
            A15.put("config", A0x);
            A13.add(A15);
        }
        return A13;
    }
}
