package X;

import android.os.Handler;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class DTS implements Runnable {
    public static final DTS A00 = new DTS();

    public final void run() {
        Date date = new Date(System.currentTimeMillis() - 10000);
        ConcurrentHashMap concurrentHashMap = Ci6.A03;
        synchronized (concurrentHashMap) {
            LinkedHashMap A13 = C17880vN.A13();
            Iterator A0i = C17890vO.A0i(concurrentHashMap);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                if (((CND) A16.getValue()).A01.compareTo(date) < 0) {
                    C108985cd.A1T(A16, A13);
                }
            }
            Iterator A15 = AnonymousClass000.A15(A13);
            while (A15.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A15);
                C25993Cq8 cq8 = ((CND) A162.getValue()).A00;
                ConcurrentHashMap concurrentHashMap2 = cq8.A08;
                Collection<CNB> values = concurrentHashMap2.values();
                C18070vi.A0X(values);
                for (CNB cnb : values) {
                    cnb.A01.close();
                }
                concurrentHashMap2.clear();
                cq8.A00 = -1;
                concurrentHashMap.remove(A162.getKey());
            }
        }
        ((Handler) C25466CgL.A06.getValue()).postDelayed(C25466CgL.A01, 10000);
    }
}
