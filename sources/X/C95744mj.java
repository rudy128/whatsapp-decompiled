package X;

/* renamed from: X.4mj  reason: invalid class name and case insensitive filesystem */
public final class C95744mj implements C108385bc {
    public boolean A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;

    public /* synthetic */ String BPi() {
        throw AnonymousClass04E.createAndThrow();
    }

    public void CKy() {
        this.A00 = true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C95744mj) {
                C95744mj r5 = (C95744mj) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && C18070vi.A18(this.A05, r5.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean BZo() {
        return this.A00;
    }

    public int hashCode() {
        return ((((((C17880vN.A03(this.A01) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + this.A05.hashCode();
    }

    public C95744mj(String str, String str2, int i, int i2, int i3) {
        this.A01 = str;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A05 = str2;
    }

    public String BQI() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n            Surface Name: ");
        A10.append(this.A01);
        A10.append("\n            Total Views: ");
        A10.append(this.A04);
        A10.append("\n            Ghost Views: ");
        A10.append(this.A03);
        A10.append("        \n            Ghost Percent: ");
        A10.append(this.A02);
        A10.append("%\n            Biggest Ghost View: ");
        A10.append(this.A05);
        return AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n        ", A10));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GhostViewEventData(surfaceName=");
        A10.append(this.A01);
        A10.append(", totalViews=");
        A10.append(this.A04);
        A10.append(", ghostViews=");
        A10.append(this.A03);
        A10.append(", ghostPercent=");
        A10.append(this.A02);
        A10.append(", biggestGhostView=");
        return C17900vP.A0B(this.A05, A10);
    }
}
