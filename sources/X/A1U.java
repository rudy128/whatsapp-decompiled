package X;

public final class A1U {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof A1U) && C18070vi.A18(this.A00, ((A1U) obj).A00));
    }

    public A1U(String str) {
        this.A00 = str;
    }

    public int hashCode() {
        return C17890vO.A02(this.A00, 38161) * 31;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A16(A10, "ProfileBizAddress(hasPhysicalAddress=");
        A10.append(", bizAddress=");
        A10.append(this.A00);
        AnonymousClass000.A1G(A10, ", latitude=");
        A10.append(", longitude=");
        return AnonymousClass001.A1F((Object) null, A10);
    }

    public A1U() {
        this.A00 = "";
    }
}
