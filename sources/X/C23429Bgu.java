package X;

/* renamed from: X.Bgu  reason: case insensitive filesystem */
public final class C23429Bgu extends DRT {
    public final Object zza;

    public final boolean equals(Object obj) {
        if (obj instanceof C23429Bgu) {
            return this.zza.equals(((C23429Bgu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return BEA.A0l("Optional.of(", this.zza.toString(), AnonymousClass000.A10());
    }

    public C23429Bgu(Object obj) {
        this.zza = obj;
    }
}
