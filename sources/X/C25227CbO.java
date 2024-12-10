package X;

/* renamed from: X.CbO  reason: case insensitive filesystem */
public final class C25227CbO {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final EA0 A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25227CbO) {
                C25227CbO cbO = (C25227CbO) obj;
                if (!(C18070vi.A18(this.A06, cbO.A06) && this.A05 == cbO.A05 && this.A04 == cbO.A04 && this.A03 == cbO.A03 && this.A02 == cbO.A02 && Float.compare(this.A01, cbO.A01) == 0 && Float.compare(this.A00, cbO.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B((((((((AnonymousClass000.A0L(this.A06) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31, this.A01), this.A00);
    }

    public C25227CbO(EA0 ea0, float f, float f2, int i, int i2, int i3, int i4) {
        this.A06 = ea0;
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = f;
        this.A00 = f2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParagraphInfo(paragraph=");
        A10.append(this.A06);
        A10.append(", startIndex=");
        A10.append(this.A05);
        A10.append(", endIndex=");
        A10.append(this.A04);
        A10.append(", startLineIndex=");
        A10.append(this.A03);
        A10.append(", endLineIndex=");
        A10.append(this.A02);
        A10.append(", top=");
        A10.append(this.A01);
        A10.append(", bottom=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
