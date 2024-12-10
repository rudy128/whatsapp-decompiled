package X;

/* renamed from: X.4jN  reason: invalid class name and case insensitive filesystem */
public final class C93684jN implements C107225Yw {
    public final float A00;
    public final Integer A01;
    public final boolean A02;

    public C93684jN(Integer num, float f, boolean z) {
        C18070vi.A0d(num, 1);
        this.A01 = num;
        this.A00 = f;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93684jN) {
                C93684jN r5 = (C93684jN) obj;
                if (!(this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public float Bam() {
        return this.A00;
    }

    public int hashCode() {
        Integer num = this.A01;
        return C17880vN.A01(AnonymousClass000.A0B(C72453Mb.A0E(num, A00(num)) * 31, this.A00), this.A02);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "HIDDEN";
            case 1:
                return "SHOWN_IN_OVERSCROLL";
            case 2:
                return "SETTLING";
            case 3:
                return "SETTLED";
            default:
                return "SHOWN";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MiniPlayerUiState(state=");
        A10.append(A00(this.A01));
        A10.append(", translationY=");
        A10.append(this.A00);
        A10.append(", isAtBottom=");
        return C17900vP.A0F(A10, this.A02);
    }
}
