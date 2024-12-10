package X;

/* renamed from: X.4oE  reason: invalid class name and case insensitive filesystem */
public final class C96674oE implements AnonymousClass5Y3 {
    public final AnonymousClass1E7 A00;
    public final C18090vk A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96674oE) {
                C96674oE r5 = (C96674oE) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A02));
    }

    public C96674oE(AnonymousClass1E7 r1, C18090vk r2, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Contact(waContact=");
        A10.append(this.A00);
        A10.append(", editMode=");
        A10.append(this.A02);
        A10.append(", onDelete=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
