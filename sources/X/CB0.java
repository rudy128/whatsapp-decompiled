package X;

import java.util.HashMap;
import java.util.Iterator;

public abstract class CB0 {
    public static void A00(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        Iterator A0k = C17890vO.A0k(hashMap);
        boolean z = true;
        while (A0k.hasNext()) {
            String A0v = C17880vN.A0v(A0k);
            if (!z) {
                BE6.A1K(sb);
            }
            String A1G = C108945cZ.A1G(A0v, hashMap);
            sb.append("\"");
            sb.append(A0v);
            sb.append("\":");
            if (A1G == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(A1G);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
