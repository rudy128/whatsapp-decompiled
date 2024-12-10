package X;

/* renamed from: X.4U7  reason: invalid class name */
public final class AnonymousClass4U7 {
    public final Long A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U7) {
                AnonymousClass4U7 r5 = (AnonymousClass4U7) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A00) * 31) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public AnonymousClass4U7(Long l, String str, String str2) {
        this.A00 = l;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TrustSignalData(joinedDate=");
        A10.append(this.A00);
        A10.append(", fbFollowerCount=");
        A10.append(this.A01);
        A10.append(", igFollowerCount=");
        return C17900vP.A0B(this.A02, A10);
    }
}
