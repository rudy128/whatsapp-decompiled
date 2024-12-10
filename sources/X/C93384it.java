package X;

/* renamed from: X.4it  reason: invalid class name and case insensitive filesystem */
public final class C93384it implements C106725Wy {
    public final int A00;
    public final int A01;
    public final Integer A02;

    public C93384it() {
        this((Integer) null, 2131169416, 2130969386);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93384it) {
                C93384it r5 = (C93384it) obj;
                if (!(this.A01 == r5.A01 && C18070vi.A18(this.A02, r5.A02) && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + AnonymousClass001.A0k(this.A02)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DividerItem(heightRes=");
        A10.append(this.A01);
        A10.append(", marginTopRes=");
        A10.append(this.A02);
        A10.append(", backgroundAttrResId=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public C93384it(Integer num, int i, int i2) {
        this.A01 = i;
        this.A02 = num;
        this.A00 = i2;
    }
}
