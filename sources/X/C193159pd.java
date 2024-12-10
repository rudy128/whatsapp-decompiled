package X;

/* renamed from: X.9pd  reason: invalid class name and case insensitive filesystem */
public final class C193159pd {
    public final C193129pa A00;

    public boolean equals(Object obj) {
        C193129pa r1 = this.A00;
        if (!(obj instanceof C193159pd) || !C18070vi.A18(r1, ((C193159pd) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        C193129pa r2 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackupEncapsulationKey(encapsulationKey=");
        return AnonymousClass001.A1F(r2, A10);
    }

    public /* synthetic */ C193159pd(C193129pa r1) {
        this.A00 = r1;
    }
}
