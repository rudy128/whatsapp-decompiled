package X;

/* renamed from: X.9qd  reason: invalid class name and case insensitive filesystem */
public final class C193769qd {
    public final long A00;
    public final C179339Ho A01;

    public C193769qd(C179339Ho r2, long j) {
        C18070vi.A0d(r2, 2);
        this.A00 = j;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193769qd) {
                C193769qd r8 = (C193769qd) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass8BV.A00(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CtwaQualitySurveyActionData(actionTs=");
        A10.append(this.A00);
        A10.append(", actionType=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
