package X;

/* renamed from: X.BfO  reason: case insensitive filesystem */
public final class C23336BfO extends DRS {
    public final Object zza;

    public final boolean equals(Object obj) {
        if (obj instanceof C23336BfO) {
            return this.zza.equals(((C23336BfO) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return BEA.A0l("Optional.of(", this.zza.toString(), AnonymousClass000.A10());
    }

    public C23336BfO(Object obj) {
        this.zza = obj;
    }
}
