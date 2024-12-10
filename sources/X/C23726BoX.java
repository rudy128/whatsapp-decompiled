package X;

/* renamed from: X.BoX  reason: case insensitive filesystem */
public final class C23726BoX extends CO8 {
    public final Throwable A00;
    public final CO7 A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23726BoX) {
                C23726BoX boX = (C23726BoX) obj;
                if (!C18070vi.A18(this.A02, boX.A02) || !C18070vi.A18(this.A00, boX.A00) || !C18070vi.A18(this.A01, boX.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A02)));
    }

    public C23726BoX(CO7 co7, String str, Throwable th) {
        super(co7, str);
        this.A02 = str;
        this.A00 = th;
        this.A01 = co7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(key=");
        A10.append(this.A02);
        A10.append(", exception=");
        A10.append(this.A00);
        A10.append(", summary=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
