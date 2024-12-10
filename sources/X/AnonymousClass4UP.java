package X;

/* renamed from: X.4UP  reason: invalid class name */
public final class AnonymousClass4UP {
    public final AnonymousClass206 A00;
    public final C693536w A01;
    public final C693536w A02;

    public AnonymousClass4UP(AnonymousClass206 r2, C693536w r3, C693536w r4) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UP) {
                AnonymousClass4UP r5 = (AnonymousClass4UP) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageWithMMSMetadata(message=");
        A10.append(this.A00);
        A10.append(", previewThumbnailMetadata=");
        A10.append(this.A02);
        A10.append(", faviconMetadata=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
