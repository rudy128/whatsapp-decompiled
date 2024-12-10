package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1J2  reason: invalid class name */
public abstract class AnonymousClass1J2 {
    public final Map A00 = new HashMap();
    public final Set A01 = new LinkedHashSet();
    public volatile boolean A02 = false;

    public void A0S() {
    }

    public static void A01(CallsHistoryFragmentViewModel callsHistoryFragmentViewModel, A34 a34) {
        a34.A02.executeOnExecutor(callsHistoryFragmentViewModel.A0D, new Void[0]);
    }

    public static void A02(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object A0Q(Object obj, String str) {
        Object obj2;
        Map map = this.A00;
        synchronized (map) {
            obj2 = map.get(str);
            if (obj2 == null) {
                map.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.A02) {
            A02(obj);
        }
        return obj;
    }

    public void A0R(Closeable closeable) {
        if (this.A02) {
            A02(closeable);
            return;
        }
        Set set = this.A01;
        synchronized (set) {
            set.add(closeable);
        }
    }
}
