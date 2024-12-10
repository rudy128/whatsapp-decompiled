package X;

import android.widget.ImageView;

/* renamed from: X.2my  reason: invalid class name and case insensitive filesystem */
public final class C59842my {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final ImageView A04;
    public final C1418377d A05;
    public final AnonymousClass889 A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C59842my(ImageView imageView, C1418377d r3, AnonymousClass889 r4, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        C18070vi.A0d(r3, 1);
        this.A05 = r3;
        this.A04 = imageView;
        this.A03 = i;
        this.A00 = i2;
        this.A07 = z;
        this.A09 = z2;
        this.A06 = r4;
        this.A02 = i3;
        this.A01 = i4;
        this.A08 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59842my) {
                C59842my r5 = (C59842my) obj;
                if (!(C18070vi.A18(this.A05, r5.A05) && C18070vi.A18(this.A04, r5.A04) && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A07 == r5.A07 && this.A09 == r5.A09 && C18070vi.A18(this.A06, r5.A06) && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((((((AnonymousClass0DV.A00(AnonymousClass0DV.A00((((AnonymousClass000.A0N(this.A04, AnonymousClass000.A0L(this.A05)) + this.A03) * 31) + this.A00) * 31, this.A07), this.A09) + AnonymousClass001.A0k(this.A06)) * 31) + this.A02) * 31) + this.A01) * 31, this.A08);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerLoaderData(sticker=");
        A10.append(this.A05);
        A10.append(", imageView=");
        A10.append(this.A04);
        A10.append(", width=");
        A10.append(this.A03);
        A10.append(", height=");
        A10.append(this.A00);
        A10.append(", animatable=");
        A10.append(this.A07);
        A10.append(", shrinkable=");
        A10.append(this.A09);
        A10.append(", onStickerLoad=");
        A10.append(this.A06);
        A10.append(", priority=");
        A10.append(this.A02);
        A10.append(", position=");
        A10.append(this.A01);
        A10.append(", shouldDownloadInTemporalStorage=");
        return C17900vP.A0F(A10, this.A08);
    }
}
