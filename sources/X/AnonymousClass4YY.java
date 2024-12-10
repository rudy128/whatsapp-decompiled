package X;

import com.whatsapp.location.PlaceInfo;

/* renamed from: X.4YY  reason: invalid class name */
public final class AnonymousClass4YY {
    public final C445823z A00;
    public final C445823z A01;
    public final PlaceInfo A02;
    public final Integer A03;
    public final boolean A04;

    public AnonymousClass4YY() {
        this((C445823z) null, (C445823z) null, (PlaceInfo) null, AnonymousClass00R.A00, true);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YY) {
                AnonymousClass4YY r5 = (AnonymousClass4YY) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A0k = ((((AnonymousClass001.A0k(this.A02) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00)) * 31;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "EDITED";
                break;
            case 2:
                str = "DELETED";
                break;
            default:
                str = "ORIGINAL";
                break;
        }
        return C17880vN.A01((A0k + str.hashCode() + intValue) * 31, this.A04);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UIState(selectedPlace=");
        A10.append(this.A02);
        A10.append(", originalMessage=");
        A10.append(this.A01);
        A10.append(", editedMessage=");
        A10.append(this.A00);
        A10.append(", messageState=");
        switch (this.A03.intValue()) {
            case 1:
                str = "EDITED";
                break;
            case 2:
                str = "DELETED";
                break;
            default:
                str = "ORIGINAL";
                break;
        }
        A10.append(str);
        A10.append(", isAllowGuestToggleEnabled=");
        return C17900vP.A0F(A10, this.A04);
    }

    public AnonymousClass4YY(C445823z r1, C445823z r2, PlaceInfo placeInfo, Integer num, boolean z) {
        this.A02 = placeInfo;
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = num;
        this.A04 = z;
    }
}
