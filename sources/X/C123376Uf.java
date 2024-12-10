package X;

/* renamed from: X.6Uf  reason: invalid class name and case insensitive filesystem */
public final class C123376Uf {
    public long A00;
    public long A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C123376Uf)) {
            return false;
        }
        C123376Uf r7 = (C123376Uf) obj;
        return this.A00 == r7.A00 && this.A01 == r7.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        long j = this.A00;
        if (j != -1) {
            A10.append(C17890vO.A0a("\"enter_ts\": ", AnonymousClass000.A10(), j));
        }
        long j2 = this.A01;
        if (j2 != -1) {
            A10.append(C17890vO.A0a(",\"exit_ts\": ", AnonymousClass000.A10(), j2));
        }
        return C18070vi.A0H(A10);
    }
}
