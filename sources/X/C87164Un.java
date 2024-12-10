package X;

/* renamed from: X.4Un  reason: invalid class name and case insensitive filesystem */
public final class C87164Un {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C18090vk A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87164Un) {
                C87164Un r5 = (C87164Un) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && C18070vi.A18(this.A04, r5.A04) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A04, ((this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public C87164Un(C18090vk r1, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = r1;
        this.A01 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MoreMenuItemUiState(labelResId=");
        A10.append(this.A03);
        A10.append(", iconResId=");
        A10.append(this.A02);
        A10.append(", clickAction=");
        A10.append(this.A04);
        A10.append(", contentDescriptionResId=");
        A10.append(this.A01);
        A10.append(", clickDescriptionResId=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
