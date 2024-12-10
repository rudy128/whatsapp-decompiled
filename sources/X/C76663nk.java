package X;

/* renamed from: X.3nk  reason: invalid class name and case insensitive filesystem */
public final class C76663nk extends AnonymousClass4EE {
    public final float A00;
    public final int A01;
    public final C107225Yw A02;
    public final AnonymousClass4TC A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76663nk) {
                C76663nk r5 = (C76663nk) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || Float.compare(this.A00, r5.A00) != 0 || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0B((AnonymousClass000.A0L(this.A02) + AnonymousClass001.A0k(this.A03)) * 31, this.A00) + this.A01;
    }

    public C76663nk(C107225Yw r1, AnonymousClass4TC r2, float f, int i) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = f;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Visible(contentUiState=");
        A10.append(this.A02);
        A10.append(", educationFooterUiState=");
        A10.append(this.A03);
        A10.append(", listViewTranslationY=");
        A10.append(this.A00);
        A10.append(", minHeight=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
