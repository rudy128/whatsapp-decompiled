package X;

import java.io.Serializable;

/* renamed from: X.DJq  reason: case insensitive filesystem */
public final class C26935DJq implements E5Q, Serializable {
    public final Object zza;

    public C26935DJq(Object obj) {
        this.zza = obj;
    }

    public final void CTC() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C26935DJq) {
            return CBA.A00(this.zza, ((C26935DJq) obj).zza);
        }
        return false;
    }

    public final String toString() {
        return BEA.A0l("Suppliers.ofInstance(", this.zza.toString(), AnonymousClass000.A10());
    }

    public final int hashCode() {
        return AnonymousClass000.A0P(this.zza, AnonymousClass3MW.A1a(), 0);
    }
}
