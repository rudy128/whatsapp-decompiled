package X;

/* renamed from: X.5u4  reason: invalid class name and case insensitive filesystem */
public final class C115475u4 extends C123036Sw {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115475u4) {
                C115475u4 r5 = (C115475u4) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && C18070vi.A18(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, AnonymousClass0DV.A00(((this.A00 * 31) + this.A01) * 31, this.A03));
    }

    public C115475u4(int i, int i2, String str, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarBackground(backgroundColor=");
        A10.append(this.A00);
        A10.append(", ringColor=");
        A10.append(this.A01);
        A10.append(", isSelected=");
        A10.append(this.A03);
        A10.append(", contentDescription=");
        return C17900vP.A0B(this.A02, A10);
    }
}
