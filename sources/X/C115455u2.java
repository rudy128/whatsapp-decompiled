package X;

/* renamed from: X.5u2  reason: invalid class name and case insensitive filesystem */
public final class C115455u2 extends C115465u3 {
    public final Integer A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115455u2) {
                C115455u2 r5 = (C115455u2) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C115455u2(Integer num, boolean z) {
        this.A01 = z;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loading(isSelected=");
        A10.append(this.A01);
        A10.append(", ringColor=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C115455u2() {
        this((Integer) null, false);
    }
}
