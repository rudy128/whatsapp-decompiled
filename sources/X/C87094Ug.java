package X;

/* renamed from: X.4Ug  reason: invalid class name and case insensitive filesystem */
public final class C87094Ug {
    public final C37451pZ A00;
    public final AnonymousClass1E7 A01;
    public final C22821Di A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87094Ug) {
                C87094Ug r5 = (C87094Ug) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A03 != r5.A03 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01)), this.A03));
    }

    public C87094Ug(C37451pZ r2, AnonymousClass1E7 r3, C22821Di r4, boolean z) {
        C18070vi.A0j(r3, r4);
        C18070vi.A0d(r2, 4);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = z;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(contact=");
        A10.append(this.A01);
        A10.append(", onRemoveClick=");
        A10.append(this.A02);
        A10.append(", optionalParticipants=");
        A10.append(this.A03);
        A10.append(", contactPhotoLoader=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
