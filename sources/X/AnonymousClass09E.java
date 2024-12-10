package X;

/* renamed from: X.09E  reason: invalid class name */
public final class AnonymousClass09E extends AnonymousClass0XW implements C17670v2 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public long A04;
    public long A05;
    public long A06;
    public C16370s9 A07;
    public boolean A08;
    public C22821Di A09 = new C09920hV(this);

    public boolean A0K() {
        return false;
    }

    public final void A0N() {
        C01850Ad A0w = AnonymousClass0QV.A04(this, 2).A0w();
        if (A0w != null) {
            A0w.A1J(this.A09, true);
        }
    }

    public /* synthetic */ int BjB(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A00(r2, r3, this, i);
    }

    public /* synthetic */ int BjE(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A01(r2, r3, this, i);
    }

    public /* synthetic */ int Bjx(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A02(r2, r3, this, i);
    }

    public /* synthetic */ int Bk0(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A03(r2, r3, this, i);
    }

    public AnonymousClass09E(C16370s9 r2, float f, float f2, float f3, float f4, long j, long j2, long j3, boolean z) {
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A01 = f4;
        this.A06 = j;
        this.A07 = r2;
        this.A08 = z;
        this.A04 = j2;
        this.A05 = j3;
    }

    public C16820tH Bja(C17500ul r5, C17530uo r6, long j) {
        AnonymousClass0XJ Bjb = r5.Bjb(j);
        return r6.BhL(AnonymousClass1D7.A0I(), new C11080jS(this, Bjb), Bjb.A01, Bjb.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SimpleGraphicsLayerModifier(scaleX=");
        A10.append(this.A02);
        A10.append(", scaleY=");
        A10.append(this.A03);
        A10.append(", alpha = ");
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
