package X;

/* renamed from: X.6JQ  reason: invalid class name */
public final class AnonymousClass6JQ extends AnonymousClass6U0 {
    public final int A00;
    public final C18090vk A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6JQ) {
                AnonymousClass6JQ r5 = (AnonymousClass6JQ) obj;
                if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && C18070vi.A18(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, (AnonymousClass3MX.A03(this.A02) + this.A00) * 31);
    }

    public AnonymousClass6JQ(C18090vk r1, int i, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExpandableItem(isExpand=");
        A10.append(this.A02);
        A10.append(", moreCount=");
        A10.append(this.A00);
        A10.append(", onClick=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
