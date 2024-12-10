package X;

/* renamed from: X.8d0  reason: invalid class name and case insensitive filesystem */
public final class C166508d0 extends C182419Uh {
    public final Throwable A00;
    public final C198009xd A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166508d0) {
                C166508d0 r5 = (C166508d0) obj;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166508d0(C198009xd r1, Throwable th) {
        super(r1);
        C18070vi.A0j(th, r1);
        this.A00 = th;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(exception=");
        A10.append(this.A00);
        A10.append(", fetchSummaryData=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
