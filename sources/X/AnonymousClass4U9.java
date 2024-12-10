package X;

/* renamed from: X.4U9  reason: invalid class name */
public final class AnonymousClass4U9 {
    public final CharSequence A00;
    public final Integer A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U9) {
                AnonymousClass4U9 r5 = (AnonymousClass4U9) obj;
                if (!(this.A01 == r5.A01 && C18070vi.A18(this.A00, r5.A00) && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 0:
                str = "SHOW_DESCRIPTION";
                break;
            case 1:
                str = "ADD_DESCRIPTION";
                break;
            default:
                str = "NONE";
                break;
        }
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, (str.hashCode() + intValue) * 31), this.A02);
    }

    public AnonymousClass4U9(CharSequence charSequence, Integer num, boolean z) {
        this.A01 = num;
        this.A00 = charSequence;
        this.A02 = z;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(action=");
        switch (this.A01.intValue()) {
            case 0:
                str = "SHOW_DESCRIPTION";
                break;
            case 1:
                str = "ADD_DESCRIPTION";
                break;
            default:
                str = "NONE";
                break;
        }
        A10.append(str);
        A10.append(", descriptionText=");
        A10.append(this.A00);
        A10.append(", isEditDescriptionSettingEnabled=");
        return C17900vP.A0F(A10, this.A02);
    }
}
