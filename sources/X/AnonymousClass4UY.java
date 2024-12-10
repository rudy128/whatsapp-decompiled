package X;

/* renamed from: X.4UY  reason: invalid class name */
public final class AnonymousClass4UY {
    public final int A00;
    public final long A01;
    public final AnonymousClass4CU A02;
    public final Integer A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UY) {
                AnonymousClass4UY r8 = (AnonymousClass4UY) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00 && C18070vi.A18(this.A03, r8.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A02, AnonymousClass000.A0I(this.A01) * 31) + this.A00) * 31) + AnonymousClass001.A0k(this.A03);
    }

    public AnonymousClass4UY(AnonymousClass4CU r1, Integer num, int i, long j) {
        this.A01 = j;
        this.A02 = r1;
        this.A00 = i;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PopupMenuListItem(id=");
        A10.append(this.A01);
        A10.append(", type=");
        A10.append(this.A02);
        A10.append(", textId=");
        A10.append(this.A00);
        A10.append(", iconResourceId=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
