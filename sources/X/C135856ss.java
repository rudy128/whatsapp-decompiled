package X;

/* renamed from: X.6ss  reason: invalid class name and case insensitive filesystem */
public final class C135856ss {
    public final C135436sC A00;
    public final C135436sC A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135856ss) {
                C135856ss r5 = (C135856ss) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, C17890vO.A02(this.A03, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01))));
    }

    public C135856ss(C135436sC r1, C135436sC r2, String str, String str2) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarCoinFlipGetPoseEntity(pose=");
        A10.append(this.A01);
        A10.append(", background=");
        A10.append(this.A00);
        A10.append(", passiveAnimation=");
        A10.append(this.A03);
        A10.append(", activeAnimation=");
        return C17900vP.A0B(this.A02, A10);
    }
}
