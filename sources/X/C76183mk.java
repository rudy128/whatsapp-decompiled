package X;

/* renamed from: X.3mk  reason: invalid class name and case insensitive filesystem */
public final class C76183mk extends AnonymousClass4E9 {
    public final float A00;
    public final C106735Wz A01;
    public final AnonymousClass5X1 A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76183mk) {
                C76183mk r5 = (C76183mk) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || Float.compare(this.A00, r5.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0B(AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01)), this.A00) + 2131231174) * 31) + 2131165614;
    }

    public C76183mk(C106735Wz r1, AnonymousClass5X1 r2, float f) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallOnHoldUiState(leaveJoinButtonGroup=");
        A10.append(this.A01);
        A10.append(", headerState=");
        A10.append(this.A02);
        A10.append(", backgroundAlpha=");
        A10.append(this.A00);
        A10.append(", backgroundResId=");
        A10.append(2131231174);
        A10.append(", maxWidth=");
        return AnonymousClass001.A1L(A10, 2131165614);
    }
}
