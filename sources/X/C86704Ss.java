package X;

/* renamed from: X.4Ss  reason: invalid class name and case insensitive filesystem */
public final class C86704Ss {
    public final int A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86704Ss) {
                C86704Ss r5 = (C86704Ss) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass001.A0k(this.A01);
    }

    public C86704Ss(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ButtonAccessibilityConfiguration(labelRes=");
        A10.append(this.A00);
        A10.append(", hintRes=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
