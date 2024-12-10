package X;

/* renamed from: X.5zO  reason: invalid class name and case insensitive filesystem */
public final class C117205zO extends C125876bp {
    public final AnonymousClass77J A00;
    public final AnonymousClass1BI A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117205zO(AnonymousClass77J r2, AnonymousClass1BI r3, boolean z, boolean z2) {
        super(r3);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117205zO) {
                C117205zO r5 = (C117205zO) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || this.A03 != r5.A03 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A02), this.A03) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnGifSelected(result=");
        A10.append(this.A00);
        A10.append(", isSearchScreen=");
        A10.append(this.A02);
        A10.append(", sendWithoutPreview=");
        A10.append(this.A03);
        A10.append(", chatJid=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
