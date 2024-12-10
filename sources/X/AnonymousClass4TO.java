package X;

/* renamed from: X.4TO  reason: invalid class name */
public final class AnonymousClass4TO {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TO) {
                AnonymousClass4TO r5 = (AnonymousClass4TO) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public AnonymousClass4TO(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommunityData(groupCount=");
        A10.append(this.A00);
        A10.append(", memberCount=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
