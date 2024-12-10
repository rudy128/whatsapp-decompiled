package X;

/* renamed from: X.ClW  reason: case insensitive filesystem */
public final class C25761ClW {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25761ClW) && this.A00 == ((C25761ClW) obj).A00);
    }

    public C25761ClW(boolean z) {
        this.A00 = z;
    }

    public int hashCode() {
        return C17880vN.A01(38347, this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A15(A10, "AvatarRichMediaViewerModel(forceNoMSAA=");
        A10.append(", isM6Config=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C25761ClW() {
        this.A00 = false;
    }
}
