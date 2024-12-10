package X;

/* renamed from: X.3mn  reason: invalid class name and case insensitive filesystem */
public final class C76213mn extends AnonymousClass4E9 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final AnonymousClass5X0 A03;
    public final AnonymousClass5X0 A04;
    public final AnonymousClass5X0 A05;
    public final AnonymousClass5X0 A06;
    public final AnonymousClass5X0 A07;
    public final AnonymousClass5X0 A08;
    public final AnonymousClass5X1 A09;
    public final AnonymousClass5X0 A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76213mn) {
                C76213mn r5 = (C76213mn) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A09, r5.A09) || this.A02 != r5.A02 || Float.compare(this.A01, r5.A01) != 0 || Float.compare(this.A00, r5.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76213mn() {
        /*
            r12 = this;
            X.4j0 r1 = X.C93454j0.A00
            X.4j3 r8 = X.C93484j3.A00
            r11 = 2131231174(0x7f0801c6, float:1.8078422E38)
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76213mn.<init>():void");
    }

    public int hashCode() {
        return AnonymousClass000.A0B(AnonymousClass000.A0B((AnonymousClass000.A0N(this.A09, AnonymousClass000.A0N(this.A0A, AnonymousClass000.A0N(this.A06, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A08, AnonymousClass000.A0N(this.A07, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0L(this.A03)))))))) + this.A02) * 31, this.A01), this.A00) + 2131165614;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InCallControlUiState(audioRouteButtonState=");
        A10.append(this.A03);
        A10.append(", dialpadButtonState=");
        A10.append(this.A05);
        A10.append(", moreButtonState=");
        A10.append(this.A07);
        A10.append(", muteButtonState=");
        A10.append(this.A08);
        A10.append(", cameraButtonState=");
        A10.append(this.A04);
        A10.append(", endCallButtonState=");
        A10.append(this.A06);
        A10.append(", screenShareButtonState=");
        A10.append(this.A0A);
        A10.append(", headerState=");
        A10.append(this.A09);
        A10.append(", backgroundResId=");
        A10.append(this.A02);
        A10.append(", buttonRotationDegrees=");
        A10.append(this.A01);
        A10.append(", backgroundAlpha=");
        A10.append(this.A00);
        A10.append(", maxWidth=");
        return AnonymousClass001.A1L(A10, 2131165614);
    }

    public C76213mn(AnonymousClass5X0 r1, AnonymousClass5X0 r2, AnonymousClass5X0 r3, AnonymousClass5X0 r4, AnonymousClass5X0 r5, AnonymousClass5X0 r6, AnonymousClass5X0 r7, AnonymousClass5X1 r8, float f, float f2, int i) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0q(r6, r7, r8);
        this.A03 = r1;
        this.A05 = r2;
        this.A07 = r3;
        this.A08 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A0A = r7;
        this.A09 = r8;
        this.A02 = i;
        this.A01 = f;
        this.A00 = f2;
    }
}
