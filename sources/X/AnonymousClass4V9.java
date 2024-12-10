package X;

/* renamed from: X.4V9  reason: invalid class name */
public final class AnonymousClass4V9 {
    public final AnonymousClass8BG A00;
    public final C692336k A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4V9) {
                AnonymousClass4V9 r5 = (AnonymousClass4V9) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && C18070vi.A18(this.A01, r5.A01) && this.A05 == r5.A05 && this.A06 == r5.A06 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01)) * 31, this.A05), this.A06), this.A02), this.A04), this.A03);
    }

    public AnonymousClass4V9(AnonymousClass8BG r1, C692336k r2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = z;
        this.A06 = z2;
        this.A02 = z3;
        this.A04 = z4;
        this.A03 = z5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageAttachments(reactions=");
        A10.append(this.A00);
        A10.append(", commentMessageInfo=");
        A10.append(this.A01);
        A10.append(", shouldShowQuickForwardingButton=");
        A10.append(this.A05);
        A10.append(", shouldShowReplyButton=");
        A10.append(this.A06);
        A10.append(", isDoubleTapToReactHintEligible=");
        A10.append(this.A02);
        A10.append(", isSwipeToReplyHintEligible=");
        A10.append(this.A04);
        A10.append(", isHoldToReactHintEligible=");
        return C17900vP.A0F(A10, this.A03);
    }
}
