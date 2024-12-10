package X;

/* renamed from: X.9tD  reason: invalid class name and case insensitive filesystem */
public final class C195359tD {
    public final C193539qG A00;
    public final AnonymousClass4ZN A01;
    public final AnonymousClass4ZN A02;
    public final AnonymousClass4ZN A03;
    public final String A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195359tD) {
                C195359tD r5 = (C195359tD) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || this.A05 != r5.A05 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A00, AnonymousClass0DV.A00((C17880vN.A03(this.A04) + 1237) * 31, this.A05)))));
    }

    public C195359tD(C193539qG r1, AnonymousClass4ZN r2, AnonymousClass4ZN r3, AnonymousClass4ZN r4, String str, boolean z) {
        this.A04 = str;
        this.A05 = z;
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PostcodeChangeBottomSheetUiState(postcode=");
        A10.append(this.A04);
        C108975cc.A15(A10, ", selectAllText=");
        A10.append(", hasError=");
        A10.append(this.A05);
        A10.append(", privacyMessage=");
        A10.append(this.A00);
        A10.append(", headerText=");
        A10.append(this.A02);
        A10.append(", messageText=");
        A10.append(this.A03);
        A10.append(", errorText=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
