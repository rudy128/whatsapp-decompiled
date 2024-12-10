package X;

/* renamed from: X.4oL  reason: invalid class name and case insensitive filesystem */
public final class C96744oL implements AnonymousClass5Y4 {
    public final int A00;
    public final Integer A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96744oL) {
                C96744oL r5 = (C96744oL) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && C18070vi.A18(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(this.A00 * 31, this.A02) + AnonymousClass001.A0k(this.A01);
    }

    public C96744oL(Integer num, int i, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("YourListsItem(res=");
        A10.append(this.A00);
        A10.append(", shouldShowSeparator=");
        A10.append(this.A02);
        A10.append(", bottomDescriptionRes=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
