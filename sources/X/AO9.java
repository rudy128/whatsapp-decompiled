package X;

import android.text.SpannableString;

public final class AO9 implements C22367B4v {
    public final long A00;
    public final long A01;
    public final SpannableString A02;
    public final C20287AEv A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AO9(SpannableString spannableString, C20287AEv aEv, String str, String str2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C18070vi.A0d(str, 1);
        this.A05 = str;
        this.A0A = z;
        this.A02 = spannableString;
        this.A08 = z2;
        this.A04 = str2;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = aEv;
        this.A07 = z3;
        this.A09 = z4;
        this.A06 = z5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AO9) {
                AO9 ao9 = (AO9) obj;
                if (!(C18070vi.A18(this.A05, ao9.A05) && this.A0A == ao9.A0A && C18070vi.A18(this.A02, ao9.A02) && this.A08 == ao9.A08 && C18070vi.A18(this.A04, ao9.A04) && this.A01 == ao9.A01 && this.A00 == ao9.A00 && C18070vi.A18(this.A03, ao9.A03) && this.A07 == ao9.A07 && this.A09 == ao9.A09 && this.A06 == ao9.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass001.A0K(this.A00, AnonymousClass001.A0K(this.A01, C17890vO.A02(this.A04, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A02, AnonymousClass0DV.A00(C17880vN.A03(this.A05), this.A0A)), this.A08)))) + AnonymousClass001.A0k(this.A03)) * 31, this.A07), this.A09), this.A06);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductBottomSheetUiStateProductLoaded(title=");
        A10.append(this.A05);
        A10.append(", useOrderRequestVariant=");
        A10.append(this.A0A);
        A10.append(", price=");
        A10.append(this.A02);
        A10.append(", showCartControls=");
        A10.append(this.A08);
        A10.append(", cartitemQuantityString=");
        A10.append(this.A04);
        A10.append(", maxAvailable=");
        A10.append(this.A01);
        A10.append(", cartItemCount=");
        A10.append(this.A00);
        A10.append(", product=");
        A10.append(this.A03);
        A10.append(", inStock=");
        A10.append(this.A07);
        A10.append(", updateCarousel=");
        A10.append(this.A09);
        A10.append(", hasFullProductInfo=");
        return C17900vP.A0F(A10, this.A06);
    }
}
