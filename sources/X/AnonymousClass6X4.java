package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.6X4  reason: invalid class name */
public abstract class AnonymousClass6X4 {
    public static final LinkedHashMap A00(Uri uri) {
        C18070vi.A0d(uri, 0);
        String query = uri.getQuery();
        if (query == null) {
            return null;
        }
        List A0S = AnonymousClass1YF.A0S(query, new String[]{"&"}, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A0S));
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            List A0S2 = AnonymousClass1YF.A0S(C17880vN.A0v(it), new String[]{"="}, 0);
            linkedHashMap.put(A0S2.get(0), A0S2.get(1));
        }
        return linkedHashMap;
    }
}
