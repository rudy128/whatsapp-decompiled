package X;

/* renamed from: X.9pk  reason: invalid class name and case insensitive filesystem */
public final class C193229pk {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193229pk) && C18070vi.A18(this.A00, ((C193229pk) obj).A00));
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + 1;
    }

    public C193229pk(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerifyDeviceSwitchingParams(code=");
        A10.append(this.A00);
        A10.append(", codeEntryMethod=");
        return AnonymousClass001.A1L(A10, 1);
    }
}
