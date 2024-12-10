package X;

/* renamed from: X.8wV  reason: invalid class name and case insensitive filesystem */
public final class C174268wV extends C174358we {
    public final int A00;
    public final C20079A6f A01;
    public final C18090vk A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C174268wV) {
                C174268wV r5 = (C174268wV) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, this.A00 * 31));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174268wV(C20079A6f a6f, C18090vk r3, int i) {
        super(43);
        C18070vi.A0k(a6f, r3);
        this.A00 = i;
        this.A01 = a6f;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HeaderWithLocationListItemData(title=");
        A10.append(this.A00);
        A10.append(", searchLocation=");
        A10.append(this.A01);
        A10.append(", onLocationClickListener=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
