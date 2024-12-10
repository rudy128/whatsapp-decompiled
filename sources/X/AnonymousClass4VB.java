package X;

import java.util.List;

/* renamed from: X.4VB  reason: invalid class name */
public final class AnonymousClass4VB {
    public final int A00;
    public final AnonymousClass4OQ A01;
    public final AnonymousClass4ZN A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VB) {
                AnonymousClass4VB r5 = (AnonymousClass4VB) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && C18070vi.A18(this.A03, r5.A03) && this.A07 == r5.A07 && this.A05 == r5.A05 && C18070vi.A18(this.A02, r5.A02) && this.A04 == r5.A04 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A01)), this.A07), this.A05) + AnonymousClass001.A0k(this.A02)) * 31, this.A04), this.A06);
    }

    public AnonymousClass4VB(AnonymousClass4OQ r2, AnonymousClass4ZN r3, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = r2;
        this.A03 = list;
        this.A07 = z;
        this.A05 = z2;
        this.A02 = r3;
        this.A04 = z3;
        this.A06 = z4;
        this.A00 = r2.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioChatBottomSheetViewState(title=");
        A10.append(this.A01);
        A10.append(", buttonViewStates=");
        A10.append(this.A03);
        A10.append(", shouldShowParticipantList=");
        A10.append(this.A07);
        A10.append(", shouldShowConfirmation=");
        A10.append(this.A05);
        A10.append(", countdownText=");
        A10.append(this.A02);
        A10.append(", isE2EELabelShown=");
        A10.append(this.A04);
        A10.append(", shouldShowNewControlsCard=");
        return C17900vP.A0F(A10, this.A06);
    }
}
