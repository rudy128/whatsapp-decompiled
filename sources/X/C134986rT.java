package X;

/* renamed from: X.6rT  reason: invalid class name and case insensitive filesystem */
public final class C134986rT {
    public final C123456Un A00;
    public final AnonymousClass4VT A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134986rT) {
                C134986rT r5 = (C134986rT) obj;
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

    public C134986rT(C123456Un r1, AnonymousClass4VT r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetStickerPackPreviewResult(stickerPreviewState=");
        A10.append(this.A00);
        A10.append(", simpleThumbLoader=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
