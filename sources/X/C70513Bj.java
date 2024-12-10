package X;

/* renamed from: X.3Bj  reason: invalid class name and case insensitive filesystem */
public final class C70513Bj implements Comparable {
    public boolean A00 = true;
    public final int A01;
    public final C62372rI A02;
    public final ADT A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public C70513Bj(C62372rI r3, ADT adt, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C18070vi.A0d(str, 1);
        C18070vi.A0p(str2, str3, str4);
        C18070vi.A0d(str5, 5);
        this.A06 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A07 = str5;
        this.A01 = i;
        this.A09 = z;
        this.A02 = r3;
        this.A03 = adt;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70513Bj) {
                C70513Bj r5 = (C70513Bj) obj;
                if (!C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A07, r5.A07) || this.A01 != r5.A01 || this.A09 != r5.A09 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C70513Bj r3 = (C70513Bj) obj;
        C18070vi.A0d(r3, 0);
        return this.A01 - r3.A01;
    }

    public int hashCode() {
        return C17880vN.A01((((AnonymousClass0DV.A00((C17890vO.A02(this.A07, C17890vO.A02(this.A04, C17890vO.A02(this.A05, C17890vO.A02(this.A08, C17880vN.A03(this.A06))))) + this.A01) * 31, this.A09) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03)) * 31, this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AlertInfo(id=");
        A10.append(this.A06);
        A10.append(", title=");
        A10.append(this.A08);
        A10.append(", description=");
        A10.append(this.A05);
        A10.append(", ctaText=");
        A10.append(this.A04);
        A10.append(", scope=");
        A10.append(this.A07);
        A10.append(", type=");
        A10.append(this.A01);
        A10.append(", isCancelable=");
        A10.append(this.A09);
        A10.append(", phoenix=");
        A10.append(this.A02);
        A10.append(", legacyPaymentStepUpInfo=");
        A10.append(this.A03);
        A10.append(", shouldShowNotification=");
        return C17900vP.A0F(A10, this.A00);
    }
}
