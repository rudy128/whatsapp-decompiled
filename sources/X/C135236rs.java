package X;

/* renamed from: X.6rs  reason: invalid class name and case insensitive filesystem */
public final class C135236rs {
    public final Object A00;
    public final String A01;
    public final String A02;

    public C135236rs(Object obj, String str, String str2) {
        C18070vi.A0d(obj, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135236rs) {
                C135236rs r5 = (C135236rs) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17890vO.A02(this.A02, C17880vN.A03(this.A01)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsInputDialogParams(inputName=");
        A10.append(this.A01);
        A10.append(", inputType=");
        A10.append(this.A02);
        A10.append(", value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
