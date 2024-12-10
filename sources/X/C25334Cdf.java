package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cdf  reason: case insensitive filesystem */
public abstract class C25334Cdf {
    public static final ArrayList A00(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle A0D = C17880vN.A0D();
            C23532BjM bjM = (C23532BjM) ((C24439C3v) it.next());
            A0D.putInt("event_type", bjM.A00);
            A0D.putLong("event_timestamp", bjM.A01);
            A13.add(A0D);
        }
        return A13;
    }

    public static void A01(Bundle bundle, ArrayList arrayList, int i) {
        arrayList.add(new C23532BjM(i, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(A00(arrayList)));
    }
}
