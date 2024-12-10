package X;

/* renamed from: X.5u5  reason: invalid class name and case insensitive filesystem */
public final class C115485u5 extends C123046Sx {
    public final C115495u6 A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115485u5) {
                C115485u5 r5 = (C115485u5) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass001.A0k(this.A00) * 31, this.A01);
    }

    public C115485u5(C115495u6 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarPose(poseData=");
        A10.append(this.A00);
        A10.append(", isSelected=");
        return C17900vP.A0F(A10, this.A01);
    }
}
