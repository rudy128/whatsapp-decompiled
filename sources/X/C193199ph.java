package X;

/* renamed from: X.9ph  reason: invalid class name and case insensitive filesystem */
public final class C193199ph {
    public final String A00;

    public C193199ph(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193199ph) && C18070vi.A18(this.A00, ((C193199ph) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0J(-1, (C17880vN.A03(this.A00) + 1231) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PhoenixSessionConfig(sessionId=");
        A10.append(this.A00);
        C108975cc.A16(A10, ", isResumable=");
        A10.append(", ttl=");
        return C17900vP.A0E(A10, -1);
    }
}
