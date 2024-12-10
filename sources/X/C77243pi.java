package X;

/* renamed from: X.3pi  reason: invalid class name and case insensitive filesystem */
public final class C77243pi extends AnonymousClass4EM {
    public final int A00;
    public final int A01;
    public final C82904Cp A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77243pi) {
                C77243pi r5 = (C77243pi) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public C77243pi(C82904Cp r1, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommunityAlmostFull(requestedCount=");
        A10.append(this.A01);
        A10.append(", actualCount=");
        A10.append(this.A00);
        A10.append(", attemptedAction=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
