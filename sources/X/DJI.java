package X;

import java.io.Serializable;

public final class DJI implements E5L, Serializable {
    public final Object zza;

    public DJI(Object obj) {
        this.zza = obj;
    }

    public final Object CT0() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (!(obj instanceof DJI) || ((obj2 = this.zza) != (obj3 = ((DJI) obj).zza) && !obj2.equals(obj3))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return BEA.A0l("Suppliers.ofInstance(", this.zza.toString(), AnonymousClass000.A10());
    }

    public final int hashCode() {
        return AnonymousClass000.A0P(this.zza, AnonymousClass3MW.A1a(), 0);
    }
}
