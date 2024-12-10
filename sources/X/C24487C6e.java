package X;

import java.util.List;

/* renamed from: X.C6e  reason: case insensitive filesystem */
public final class C24487C6e {
    public int A00;
    public int A01;
    public Float A02;
    public List A03;
    public List A04;
    public boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24487C6e) {
                C24487C6e c6e = (C24487C6e) obj;
                if (!C18070vi.A18(this.A02, c6e.A02) || !C18070vi.A18(this.A04, c6e.A04) || !C18070vi.A18(this.A03, c6e.A03) || this.A05 != c6e.A05 || this.A00 != c6e.A00 || this.A01 != c6e.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A03, ((AnonymousClass001.A0k(this.A02) * 31) + C17880vN.A02(this.A04)) * 31), this.A05) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParametricSliderDataModel(sliderValue=");
        A10.append(this.A02);
        A10.append(", gradientColors=");
        A10.append(this.A04);
        A10.append(", choicePaths=");
        A10.append(this.A03);
        A10.append(", passSliderUpdateToBloksOnTouchUpOnly=");
        A10.append(this.A05);
        A10.append(", currentSliderPosition=");
        A10.append(this.A00);
        A10.append(", thumbBorderWidth=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
