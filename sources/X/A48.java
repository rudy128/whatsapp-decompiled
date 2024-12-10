package X;

import com.whatsapp.instrumentation.service.InstrumentationFGService;
import java.util.Set;

public class A48 {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;
    public final Set A02 = C17880vN.A12();

    public static synchronized void A00(A48 a48, int i) {
        synchronized (a48) {
            a48.A02.add(Integer.valueOf(i));
            ((C139916ze) a48.A01.get()).A02(a48.A00.A00, C17880vN.A0A(), InstrumentationFGService.class);
        }
    }

    public static synchronized void A01(A48 a48, int i) {
        synchronized (a48) {
            Set set = a48.A02;
            set.remove(Integer.valueOf(i));
            if (set.isEmpty()) {
                ((C139916ze) a48.A01.get()).A03(a48.A00.A00, InstrumentationFGService.class);
            }
        }
    }

    public A48(AnonymousClass118 r2, AnonymousClass00H r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
