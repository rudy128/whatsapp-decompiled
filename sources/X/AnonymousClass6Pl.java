package X;

/* renamed from: X.6Pl  reason: invalid class name */
public final class AnonymousClass6Pl extends AnonymousClass6U7 {
    public final int A00;
    public final C27881Xz A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6Pl) {
                AnonymousClass6Pl r5 = (AnonymousClass6Pl) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A01 == r5.A01 && C18070vi.A18(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass0DV.A00(this.A00 * 31, this.A03)) + C17900vP.A00(this.A02);
    }

    public AnonymousClass6Pl(C27881Xz r1, String str, int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = r1;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IconButton(icon=");
        A10.append(this.A00);
        A10.append(", isRTLSupported=");
        A10.append(this.A03);
        A10.append(", buttonVariant=");
        A10.append(this.A01);
        A10.append(", label=");
        return C17900vP.A0B(this.A02, A10);
    }

    public AnonymousClass6Pl() {
        this(C27881Xz.TONAL, (String) null, 0, false);
    }
}
