package X;

/* renamed from: X.3ml  reason: invalid class name and case insensitive filesystem */
public final class C76193ml extends AnonymousClass4E9 {
    public final float A00;
    public final int A01;
    public final C106735Wz A02;
    public final AnonymousClass5X1 A03;

    public C76193ml(C106735Wz r2, AnonymousClass5X1 r3, float f, int i) {
        C18070vi.A0d(r3, 2);
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = f;
        this.A01 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76193ml) {
                C76193ml r5 = (C76193ml) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || Float.compare(this.A00, r5.A00) != 0 || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0B(AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A02)), this.A00) + this.A01) * 31) + 2131165614;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallUpgradeRequestedUiState(acceptDeclineButtonGroup=");
        A10.append(this.A02);
        A10.append(", headerState=");
        A10.append(this.A03);
        A10.append(", backgroundAlpha=");
        A10.append(this.A00);
        A10.append(", backgroundResId=");
        A10.append(this.A01);
        A10.append(", maxWidth=");
        return AnonymousClass001.A1L(A10, 2131165614);
    }
}
