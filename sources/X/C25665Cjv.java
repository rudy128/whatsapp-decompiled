package X;

import java.io.File;
import java.util.List;

/* renamed from: X.Cjv  reason: case insensitive filesystem */
public class C25665Cjv {
    public static final File A03 = C108945cZ.A17("/sys/kernel/debug/tracing/trace");
    public boolean A00;
    public final Object A01 = BE6.A1Z();
    public final List A02 = AnonymousClass000.A13();

    public void A00() {
        synchronized (this.A01) {
            this.A00 = true;
            int i = 0;
            while (true) {
                List list = this.A02;
                if (i < list.size()) {
                    list.get(i);
                    C25324CdV.A00();
                    i++;
                }
            }
        }
    }
}
