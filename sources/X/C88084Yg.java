package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4Yg  reason: invalid class name and case insensitive filesystem */
public final class C88084Yg {
    public final Drawable A00;
    public final AnonymousClass1E7 A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final AnonymousClass1D6 A07;
    public final boolean A08;
    public final boolean A09;

    public C88084Yg() {
        this((Drawable) null, (AnonymousClass1E7) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (AnonymousClass1D6) null, false, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88084Yg) {
                C88084Yg r5 = (C88084Yg) obj;
                if (!C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A09 != r5.A09 || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(((((((((((((((C17900vP.A00(this.A06) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + C17900vP.A00(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01)) * 31, this.A09), this.A08);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DialerNumberDetails(enteredPhoneNumber=");
        A10.append(this.A06);
        A10.append(", contactPhoto=");
        A10.append(this.A00);
        A10.append(", displayName=");
        A10.append(this.A04);
        A10.append(", displayNameOrLabel=");
        A10.append(this.A05);
        A10.append(", displayNameColor=");
        A10.append(this.A07);
        A10.append(", contentDescription=");
        A10.append(this.A03);
        A10.append(", verifiedRes=");
        A10.append(this.A02);
        A10.append(", contact=");
        A10.append(this.A01);
        A10.append(", showSpinner=");
        A10.append(this.A09);
        A10.append(", bypassDebounce=");
        return C17900vP.A0F(A10, this.A08);
    }

    public C88084Yg(Drawable drawable, AnonymousClass1E7 r2, Integer num, String str, String str2, String str3, String str4, AnonymousClass1D6 r8, boolean z, boolean z2) {
        this.A06 = str;
        this.A00 = drawable;
        this.A04 = str2;
        this.A05 = str3;
        this.A07 = r8;
        this.A03 = str4;
        this.A02 = num;
        this.A01 = r2;
        this.A09 = z;
        this.A08 = z2;
    }
}
