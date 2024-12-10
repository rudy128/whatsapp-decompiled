package androidx.compose.ui.graphics;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09E;
import X.AnonymousClass0DV;
import X.AnonymousClass0NB;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.C02540Ek;
import X.C05100Qk;
import X.C16370s9;
import X.C18070vi;

public final class GraphicsLayerElement extends AnonymousClass0WA {
    public final float A00;
    public final float A01;
    public final float A02 = 1.0f;
    public final float A03 = 1.0f;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C16370s9 A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphicsLayerElement) {
                GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
                if (Float.compare(this.A02, graphicsLayerElement.A02) == 0 && Float.compare(this.A03, graphicsLayerElement.A03) == 0 && Float.compare(this.A00, graphicsLayerElement.A00) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.A01, graphicsLayerElement.A01) == 0) {
                    long j = this.A06;
                    long j2 = graphicsLayerElement.A06;
                    long j3 = AnonymousClass0NB.A01;
                    if (j == j2 && C18070vi.A18(this.A07, graphicsLayerElement.A07) && this.A08 == graphicsLayerElement.A08) {
                        long j4 = this.A04;
                        long j5 = graphicsLayerElement.A04;
                        C02540Ek r0 = C05100Qk.A06;
                        if (!(j4 == j5 && this.A05 == graphicsLayerElement.A05)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public GraphicsLayerElement(C16370s9 r3, float f, long j, long j2, long j3, boolean z) {
        this.A00 = f;
        this.A01 = 8.0f;
        this.A06 = j;
        this.A07 = r3;
        this.A08 = z;
        this.A04 = j2;
        this.A05 = j3;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        float f = this.A02;
        float f2 = this.A03;
        float f3 = this.A00;
        float f4 = this.A01;
        long j = this.A06;
        return new AnonymousClass09E(this.A07, f, f2, f3, f4, j, this.A04, this.A05, this.A08);
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r3) {
        AnonymousClass09E r32 = (AnonymousClass09E) r3;
        r32.A02 = this.A02;
        r32.A03 = this.A03;
        r32.A00 = this.A00;
        r32.A01 = this.A01;
        r32.A06 = this.A06;
        r32.A07 = this.A07;
        r32.A08 = this.A08;
        r32.A04 = this.A04;
        r32.A05 = this.A05;
        r32.A0N();
    }

    public int hashCode() {
        int A0B = AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A02), this.A03), this.A00);
        int floatToIntBits = Float.floatToIntBits(0.0f);
        int A0B2 = AnonymousClass000.A0B((((((((((((A0B + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31, this.A01);
        long j = this.A06;
        long j2 = AnonymousClass0NB.A01;
        int A002 = AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A07, AnonymousClass001.A0K(j, A0B2)), this.A08) * 31;
        long j3 = this.A04;
        C02540Ek r0 = C05100Qk.A06;
        return AnonymousClass001.A0K(this.A05, AnonymousClass001.A0K(j3, A002));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GraphicsLayerElement(scaleX=");
        A10.append(this.A02);
        A10.append(", scaleY=");
        A10.append(this.A03);
        A10.append(", alpha=");
        A10.append(this.A00);
        AnonymousClass000.A1H(A10, ", translationX=");
        AnonymousClass000.A1H(A10, ", translationY=");
        AnonymousClass000.A1H(A10, ", shadowElevation=");
        AnonymousClass000.A1H(A10, ", rotationX=");
        AnonymousClass000.A1H(A10, ", rotationY=");
        AnonymousClass000.A1H(A10, ", rotationZ=");
        A10.append(", cameraDistance=");
        A10.append(this.A01);
        A10.append(", transformOrigin=");
        long j = this.A06;
        long j2 = AnonymousClass0NB.A01;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("TransformOrigin(packedValue=");
        A102.append(j);
        A10.append(AnonymousClass001.A1J(A102));
        A10.append(", shape=");
        A10.append(this.A07);
        A10.append(", clip=");
        A10.append(this.A08);
        AnonymousClass000.A1G(A10, ", renderEffect=");
        A10.append(", ambientShadowColor=");
        AnonymousClass000.A1F(A10, this.A04);
        A10.append(", spotShadowColor=");
        AnonymousClass000.A1F(A10, this.A05);
        A10.append(", compositingStrategy=");
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("CompositingStrategy(value=");
        return AnonymousClass001.A1F(AnonymousClass001.A1L(A103, 0), A10);
    }
}
