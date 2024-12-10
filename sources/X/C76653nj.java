package X;

import java.util.List;

/* renamed from: X.3nj  reason: invalid class name and case insensitive filesystem */
public final class C76653nj extends AnonymousClass4ED {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass4N3 A03;
    public final AnonymousClass4ZN A04;
    public final Integer A05;
    public final Integer A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76653nj) {
                C76653nj r5 = (C76653nj) obj;
                if (!(C18070vi.A18(this.A07, r5.A07) && C18070vi.A18(this.A03, r5.A03) && this.A06 == r5.A06 && this.A09 == r5.A09 && this.A02 == r5.A02 && this.A01 == r5.A01 && C18070vi.A18(this.A04, r5.A04) && this.A0A == r5.A0A && this.A00 == r5.A00 && this.A05 == r5.A05 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A0N = AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A07));
        Integer num = this.A06;
        int A002 = (AnonymousClass0DV.A00((((((AnonymousClass0DV.A00((A0N + C72453Mb.A0E(num, A00(num))) * 31, this.A09) + this.A02) * 31) + this.A01) * 31) + AnonymousClass001.A0k(this.A04)) * 31, this.A0A) + this.A00) * 31;
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "EXPAND";
                break;
            case 2:
                str = "COLLAPSE";
                break;
            default:
                str = "NONE";
                break;
        }
        return C17880vN.A01((A002 + str.hashCode() + intValue) * 31, this.A08);
    }

    public C76653nj(AnonymousClass4N3 r1, AnonymousClass4ZN r2, Integer num, Integer num2, List list, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A07 = list;
        this.A03 = r1;
        this.A06 = num;
        this.A09 = z;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = r2;
        this.A0A = z2;
        this.A00 = i3;
        this.A05 = num2;
        this.A08 = z3;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "OVERSCROLLING";
            case 1:
                return "REJOINING";
            case 2:
                return "COMPACT";
            default:
                return "EXPANDED";
        }
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Visible(peerAvatarItems=");
        A10.append(this.A07);
        A10.append(", pillButton=");
        A10.append(this.A03);
        A10.append(", mode=");
        A10.append(A00(this.A06));
        A10.append(", isSelfMuted=");
        A10.append(this.A09);
        A10.append(", peerAvatarSizeRes=");
        A10.append(this.A02);
        A10.append(", minWidthRes=");
        A10.append(this.A01);
        A10.append(", statusText=");
        A10.append(this.A04);
        A10.append(", shouldShowWaveAllButton=");
        A10.append(this.A0A);
        A10.append(", bodyRowTopMarginRes=");
        A10.append(this.A00);
        A10.append(", animation=");
        switch (this.A05.intValue()) {
            case 1:
                str = "EXPAND";
                break;
            case 2:
                str = "COLLAPSE";
                break;
            default:
                str = "NONE";
                break;
        }
        A10.append(str);
        A10.append(", isAtBottom=");
        return C17900vP.A0F(A10, this.A08);
    }
}
