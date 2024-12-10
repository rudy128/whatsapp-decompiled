package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6XH  reason: invalid class name */
public abstract class AnonymousClass6XH {
    public static String A00(Map map) {
        StringBuilder sb = new StringBuilder("{\"server_params\":{");
        Iterator A15 = AnonymousClass000.A15(map);
        int i = 0;
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            sb.append("\"");
            sb.append(A0x);
            C17890vO.A10("\":\"", (String) A16.getValue(), "\"", sb);
            if (i < map.size() - 1) {
                sb.append(",");
            }
            i++;
        }
        String A0y = AnonymousClass000.A0y("}}", sb);
        C18070vi.A0X(A0y);
        return A0y;
    }
}
