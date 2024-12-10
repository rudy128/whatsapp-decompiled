package X;

/* renamed from: X.2lm  reason: invalid class name and case insensitive filesystem */
public final class C59112lm {
    public final AnonymousClass206 A00;
    public final C49572Qz A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59112lm) {
                C59112lm r5 = (C59112lm) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public C59112lm(AnonymousClass206 r1, C49572Qz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ThumbnailDownloadQueueKey(message=");
        A10.append(this.A00);
        A10.append(", mmsMetadataType=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
