package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.CbI  reason: case insensitive filesystem */
public final class C25222CbI {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Drawable A03;
    public final C25196Can A04;
    public final Integer A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25222CbI) {
                C25222CbI cbI = (C25222CbI) obj;
                if (!(C18070vi.A18(this.A03, cbI.A03) && this.A02 == cbI.A02 && Float.compare(this.A00, cbI.A00) == 0 && Float.compare(this.A01, cbI.A01) == 0 && this.A05 == cbI.A05 && C18070vi.A18(this.A04, cbI.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A0B = AnonymousClass000.A0B(AnonymousClass000.A0B(((AnonymousClass001.A0k(this.A03) * 31) + this.A02) * 31, this.A00), this.A01);
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = "NONE";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return ((A0B + str.hashCode() + intValue) * 31) + C17880vN.A02(this.A04);
    }

    public C25222CbI(Drawable drawable, C25196Can can, Integer num, float f, float f2, int i) {
        this.A03 = drawable;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = num;
        this.A04 = can;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TooltipAttributes(backgroundDrawable=");
        A10.append(this.A03);
        A10.append(", borderColor=");
        A10.append(this.A02);
        A10.append(", borderWidth=");
        A10.append(this.A00);
        A10.append(", cornerRadius=");
        A10.append(this.A01);
        A10.append(", arrowType=");
        switch (this.A05.intValue()) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = "NONE";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        A10.append(str);
        A10.append(", shadow=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
