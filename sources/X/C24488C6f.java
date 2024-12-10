package X;

import java.util.Arrays;

/* renamed from: X.C6f  reason: case insensitive filesystem */
public final class C24488C6f {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C3L A04;
    public boolean A05;
    public boolean A06;
    public float[] A07;
    public float[] A08;
    public float[] A09;
    public float[] A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24488C6f) {
                C24488C6f c6f = (C24488C6f) obj;
                if (!(this.A00 == c6f.A00 && this.A01 == c6f.A01 && this.A05 == c6f.A05 && this.A06 == c6f.A06 && this.A03 == c6f.A03 && this.A02 == c6f.A02 && C18070vi.A18(this.A0A, c6f.A0A) && C18070vi.A18(this.A08, c6f.A08) && C18070vi.A18(this.A09, c6f.A09) && C18070vi.A18(this.A07, c6f.A07))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BE6.A06((((((((((((((AnonymousClass0DV.A00(AnonymousClass0DV.A00(((((this.A00 * 31) + this.A01) * 31) + 1231) * 31, this.A05), this.A06) + 1237) * 31) + 1237) * 31) + this.A03) * 31) + this.A02) * 31) + Arrays.hashCode(this.A0A)) * 31) + Arrays.hashCode(this.A08)) * 31) + Arrays.hashCode(this.A09)) * 31, Arrays.hashCode(this.A07));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RenderParameters(colorTransfer=");
        A10.append(this.A00);
        A10.append(", outputColorTransfer=");
        A10.append(this.A01);
        C108975cc.A16(A10, ", isClearEnabled=");
        A10.append(", isDisplayEnabled=");
        A10.append(this.A05);
        A10.append(", isOpaque=");
        A10.append(this.A06);
        C108975cc.A15(A10, ", isTransparent=");
        C108975cc.A15(A10, ", isBlendEnabled=");
        A10.append(", outputViewportWidth=");
        A10.append(this.A03);
        A10.append(", outputViewportHeight=");
        A10.append(this.A02);
        A10.append(", textureTransformMatrix=");
        A10.append(Arrays.toString(this.A0A));
        A10.append(", cropTransformMatrix=");
        A10.append(Arrays.toString(this.A08));
        A10.append(", inContentTransformMatrix=");
        A10.append(Arrays.toString(this.A09));
        A10.append(", contentTransformMatrix=");
        A10.append(Arrays.toString(this.A07));
        AnonymousClass000.A1G(A10, ", hdrMetadata=");
        A10.append(", backgroundRenderer=");
        return AnonymousClass001.A1F((Object) null, A10);
    }
}
