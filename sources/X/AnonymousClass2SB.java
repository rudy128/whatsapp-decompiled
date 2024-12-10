package X;

/* renamed from: X.2SB  reason: invalid class name */
public final class AnonymousClass2SB {
    public String A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2SB r5 = (AnonymousClass2SB) obj;
            if (!this.A01.equals(r5.A01) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.A01;
        return AnonymousClass000.A0P(this.A00, objArr, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BootstrapId{sessionId=");
        A10.append(this.A01);
        A10.append(", mdRegAttemptId=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
