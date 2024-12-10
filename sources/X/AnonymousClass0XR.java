package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0XR  reason: invalid class name */
public final class AnonymousClass0XR implements SubcomposeSlotReusePolicy {
    public final AnonymousClass0Jo A00;
    public final Map A01 = new LinkedHashMap();

    public boolean BCa(Object obj, Object obj2) {
        AnonymousClass0Jo r0 = this.A00;
        return C18070vi.A18(r0.A00(obj), r0.A00(obj2));
    }

    public void BZP(C06640Zc r6) {
        int i;
        Map map = this.A01;
        map.clear();
        Iterator it = r6.iterator();
        while (it.hasNext()) {
            Object A002 = this.A00.A00(it.next());
            Number number = (Number) map.get(A002);
            if (number != null) {
                i = number.intValue();
                if (i == 7) {
                    it.remove();
                }
            } else {
                i = 0;
            }
            map.put(A002, Integer.valueOf(i + 1));
        }
    }

    public AnonymousClass0XR(AnonymousClass0Jo r2) {
        this.A00 = r2;
    }
}
