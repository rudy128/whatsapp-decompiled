package X;

import java.io.Serializable;

/* renamed from: X.Bfc  reason: case insensitive filesystem */
public final class C23350Bfc extends DUG implements Serializable {
    public final DUG zza;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23350Bfc) {
            return this.zza.equals(((C23350Bfc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    public C23350Bfc(DUG dug) {
        this.zza = dug;
    }
}
