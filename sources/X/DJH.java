package X;

import java.io.Serializable;

public final class DJH implements E5L, Serializable {
    public transient Object A00;
    public volatile transient boolean A01;
    public final E5L zza;

    public DJH(E5L e5l) {
        this.zza = e5l;
    }

    public final Object CT0() {
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    Object CT0 = this.zza.CT0();
                    this.A00 = CT0;
                    this.A01 = true;
                    return CT0;
                }
            }
        }
        return this.A00;
    }

    public final String toString() {
        Object obj;
        if (this.A01) {
            String valueOf = String.valueOf(this.A00);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("<supplier that returned ");
            A10.append(valueOf);
            obj = AnonymousClass000.A0y(">", A10);
        } else {
            obj = this.zza;
        }
        return BEA.A0l("Suppliers.memoize(", obj.toString(), AnonymousClass000.A10());
    }
}
