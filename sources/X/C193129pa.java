package X;

/* renamed from: X.9pa  reason: invalid class name and case insensitive filesystem */
public final class C193129pa {
    public final C193149pc A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193129pa) && C18070vi.A18(this.A00, ((C193129pa) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C193129pa(C193149pc r3) {
        this.A00 = r3;
        if (r3.A00.length != 32) {
            throw AnonymousClass000.A0n("Check failed.");
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncryptionKey@");
        return C17880vN.A0t(A10, System.identityHashCode(this));
    }
}
