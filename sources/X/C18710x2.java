package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0x2  reason: invalid class name and case insensitive filesystem */
public class C18710x2 implements C18290w6 {
    public volatile Set A00;
    public volatile Set A01;

    public /* bridge */ /* synthetic */ Object get() {
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    this.A00 = Collections.newSetFromMap(new ConcurrentHashMap());
                    for (C18290w6 r0 : this.A01) {
                        this.A00.add(r0.get());
                    }
                    this.A01 = null;
                }
            }
        }
        return Collections.unmodifiableSet(this.A00);
    }
}
