package X;

/* renamed from: X.6sC  reason: invalid class name and case insensitive filesystem */
public final class C135436sC {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135436sC) {
                C135436sC r5 = (C135436sC) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A00) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public C135436sC(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarProfilePose(url=");
        C108965cb.A1U(A10, this.A00);
        A10.append(this.A01);
        A10.append(", picdHandleHash=");
        return C17900vP.A0B(this.A02, A10);
    }
}
