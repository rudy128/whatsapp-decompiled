package X;

/* renamed from: X.CmF  reason: case insensitive filesystem */
public final class C25802CmF {
    public final AnonymousClass6TT A00;
    public final AnonymousClass205 A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C25802CmF(AnonymousClass6TT r2, AnonymousClass205 r3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A02 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A03 = z4;
        this.A05 = z5;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25802CmF) {
                C25802CmF cmF = (C25802CmF) obj;
                if (!(C18070vi.A18(this.A00, cmF.A00) && this.A02 == cmF.A02 && this.A06 == cmF.A06 && this.A04 == cmF.A04 && this.A03 == cmF.A03 && this.A05 == cmF.A05 && C18070vi.A18(this.A01, cmF.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A02), this.A06), this.A04), this.A03), this.A05) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SharedTranscriptionState(modelDownloadStatus=");
        A10.append(this.A00);
        A10.append(", isGlobalLanguageSelectionRequired=");
        A10.append(this.A02);
        A10.append(", userSettingIsEnabled=");
        A10.append(this.A06);
        A10.append(", isUpsellEnabled=");
        A10.append(this.A04);
        A10.append(", isManualMessageButtonEnabled=");
        A10.append(this.A03);
        A10.append(", shouldUseDynamicTimestampPositioning=");
        A10.append(this.A05);
        A10.append(", statusLineCandidateMessageKey=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public C25802CmF() {
        this(C119926Al.A00, (AnonymousClass205) null, false, false, false, false, false);
    }
}
