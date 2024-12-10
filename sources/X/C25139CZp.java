package X;

/* renamed from: X.CZp  reason: case insensitive filesystem */
public final class C25139CZp {
    public final AnonymousClass1D6 A00;

    public boolean equals(Object obj) {
        AnonymousClass1D6 r1 = this.A00;
        if (!(obj instanceof C25139CZp) || !C18070vi.A18(r1, ((C25139CZp) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        AnonymousClass1D6 r2 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WriteThroughCacheResponse(response=");
        return AnonymousClass001.A1F(r2, A10);
    }

    public /* synthetic */ C25139CZp(AnonymousClass1D6 r1) {
        this.A00 = r1;
    }
}
