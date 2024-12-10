package X;

/* renamed from: X.2qj  reason: invalid class name and case insensitive filesystem */
public final class C62062qj {
    public static final C62062qj A05 = new C62062qj(false, false, false, false, false);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C62062qj(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = z;
        this.A00 = z2;
        this.A01 = z3;
        this.A02 = z4;
        this.A03 = z5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WriteResult{wasSuccess=");
        A10.append(this.A04);
        A10.append(", chatAdded=");
        A10.append(this.A00);
        A10.append(", chatUnarchived=");
        A10.append(this.A01);
        A10.append(", isDuplicate=");
        A10.append(this.A02);
        A10.append(", isExpired=");
        A10.append(this.A03);
        return C17890vO.A0b(A10);
    }
}
