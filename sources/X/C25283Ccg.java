package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Ccg  reason: case insensitive filesystem */
public final class C25283Ccg {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C27069DRu A03;
    public final C26251Cvq A04;
    public final E3V A05;
    public final C28644ECa A06;
    public final C24246By4 A07;
    public final List A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25283Ccg) {
                C25283Ccg ccg = (C25283Ccg) obj;
                if (!C18070vi.A18(this.A03, ccg.A03) || !C18070vi.A18(this.A04, ccg.A04) || !C18070vi.A18(this.A08, ccg.A08) || this.A00 != ccg.A00 || this.A09 != ccg.A09 || this.A01 != ccg.A01 || !C18070vi.A18(this.A06, ccg.A06) || this.A07 != ccg.A07 || !C18070vi.A18(this.A05, ccg.A05) || this.A02 != ccg.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final C27069DRu A03() {
        return this.A03;
    }

    public final C26251Cvq A04() {
        return this.A04;
    }

    public final E3V A05() {
        return this.A05;
    }

    public final C28644ECa A06() {
        return this.A06;
    }

    public final C24246By4 A07() {
        return this.A07;
    }

    public final List A08() {
        return this.A08;
    }

    public final boolean A09() {
        return this.A09;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A04, AnonymousClass000.A0L(this.A03));
        return AnonymousClass001.A0J(this.A02, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A07, AnonymousClass000.A0N(this.A06, (AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A08, A0N) + this.A00) * 31, this.A09) + this.A01) * 31))));
    }

    public /* synthetic */ C25283Ccg(C27069DRu dRu, C26251Cvq cvq, E3V e3v, C28644ECa eCa, C24246By4 by4, List list, int i, int i2, long j, boolean z) {
        this.A03 = dRu;
        this.A04 = cvq;
        this.A08 = list;
        this.A00 = i;
        this.A09 = z;
        this.A01 = i2;
        this.A06 = eCa;
        this.A07 = by4;
        this.A05 = e3v;
        this.A02 = j;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextLayoutInput(text=");
        A10.append(this.A03);
        A10.append(", style=");
        A10.append(this.A04);
        A10.append(", placeholders=");
        A10.append(this.A08);
        A10.append(", maxLines=");
        A10.append(this.A00);
        A10.append(", softWrap=");
        A10.append(this.A09);
        A10.append(", overflow=");
        int i = this.A01;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = "Invalid";
        }
        A10.append(str);
        A10.append(", density=");
        A10.append(this.A06);
        A10.append(", layoutDirection=");
        A10.append(this.A07);
        A10.append(", fontFamilyResolver=");
        A10.append(this.A05);
        A10.append(", constraints=");
        return AnonymousClass001.A1F(Constraints.A06(this.A02), A10);
    }
}
