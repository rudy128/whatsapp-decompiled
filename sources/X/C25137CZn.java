package X;

/* renamed from: X.CZn  reason: case insensitive filesystem */
public final class C25137CZn {
    public final C25166CaH A00;

    public boolean equals(Object obj) {
        C25166CaH caH = this.A00;
        if (!(obj instanceof C25137CZn) || !C18070vi.A18(caH, ((C25137CZn) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        C25166CaH caH = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Snapshot(cacheStoreSnapshot=");
        return AnonymousClass001.A1F(caH, A10);
    }

    public /* synthetic */ C25137CZn(C25166CaH caH) {
        this.A00 = caH;
    }
}
