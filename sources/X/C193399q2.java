package X;

/* renamed from: X.9q2  reason: invalid class name and case insensitive filesystem */
public final class C193399q2 {
    public final C193129pa A00;
    public final C193139pb A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193399q2) {
                C193399q2 r5 = (C193399q2) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C193399q2(C193129pa r1, C193139pb r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PasskeyBackupEnabledResult(credentialId=");
        A10.append(this.A01);
        A10.append(", encapsulationKey=");
        C193129pa r2 = this.A00;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("BackupEncapsulationKey(encapsulationKey=");
        return AnonymousClass001.A1F(AnonymousClass001.A1F(r2, A102), A10);
    }
}
