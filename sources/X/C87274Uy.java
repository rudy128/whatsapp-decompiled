package X;

/* renamed from: X.4Uy  reason: invalid class name and case insensitive filesystem */
public final class C87274Uy {
    public final AnonymousClass4ZN A00;
    public final AnonymousClass4ZN A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87274Uy) {
                C87274Uy r5 = (C87274Uy) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A05 != r5.A05 || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, AnonymousClass0DV.A00((AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A02)) * 31, this.A05)), this.A03), this.A04);
    }

    public C87274Uy(AnonymousClass4ZN r1, AnonymousClass4ZN r2, Integer num, boolean z, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A02 = num;
        this.A05 = z;
        this.A00 = r2;
        this.A03 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioChatCallingBannerViewState(title=");
        A10.append(this.A01);
        A10.append(", participantColorIndex=");
        A10.append(this.A02);
        A10.append(", shouldShowAudioWave=");
        A10.append(this.A05);
        A10.append(", subTitle=");
        A10.append(this.A00);
        A10.append(", isMuted=");
        A10.append(this.A03);
        A10.append(", shouldShowAnimatedWave=");
        return C17900vP.A0F(A10, this.A04);
    }
}
