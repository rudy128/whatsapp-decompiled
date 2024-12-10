package X;

/* renamed from: X.6ru  reason: invalid class name and case insensitive filesystem */
public final class C135256ru {
    public final int A00;
    public final int A01;
    public final C22821Di A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135256ru) {
                C135256ru r5 = (C135256ru) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && C18070vi.A18(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public C135256ru(C22821Di r1, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GalleryPickerAction(drawableRes=");
        A10.append(this.A00);
        A10.append(", stringRes=");
        A10.append(this.A01);
        A10.append(", clickListener=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
