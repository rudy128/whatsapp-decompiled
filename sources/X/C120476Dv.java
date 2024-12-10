package X;

/* renamed from: X.6Dv  reason: invalid class name and case insensitive filesystem */
public final class C120476Dv extends C126206cM {
    public final C123096Tc A00;
    public final Throwable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120476Dv(C123096Tc r2, Throwable th) {
        super(r2);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = th;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C120476Dv) {
                C120476Dv r5 = (C120476Dv) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(searchType=");
        A10.append(this.A00);
        A10.append(", error=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
