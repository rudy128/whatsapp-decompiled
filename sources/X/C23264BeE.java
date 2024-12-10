package X;

/* renamed from: X.BeE  reason: case insensitive filesystem */
public final class C23264BeE extends DRR {
    public final Object zza;

    public final boolean equals(Object obj) {
        if (obj instanceof C23264BeE) {
            return this.zza.equals(((C23264BeE) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return BEA.A0l("Optional.of(", this.zza.toString(), AnonymousClass000.A10());
    }

    public C23264BeE(Object obj) {
        this.zza = obj;
    }
}
