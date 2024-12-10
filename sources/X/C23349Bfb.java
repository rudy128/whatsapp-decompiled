package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.Bfb  reason: case insensitive filesystem */
public final class C23349Bfb extends DUG implements Serializable {
    public final Comparator zza;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23349Bfb) {
            return this.zza.equals(((C23349Bfb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public C23349Bfb(Comparator comparator) {
        if (comparator != null) {
            this.zza = comparator;
            return;
        }
        throw null;
    }
}
