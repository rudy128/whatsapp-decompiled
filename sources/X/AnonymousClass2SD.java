package X;

/* renamed from: X.2SD  reason: invalid class name */
public final class AnonymousClass2SD {
    public String A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2SD) {
                AnonymousClass2SD r5 = (AnonymousClass2SD) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A002 = C17900vP.A00(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A002 + i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendJobKey(jid=");
        A10.append(this.A00);
        A10.append(", keyId=");
        return C17900vP.A0B(this.A01, A10);
    }
}
