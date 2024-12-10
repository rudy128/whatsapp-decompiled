package X;

/* renamed from: X.3n5  reason: invalid class name and case insensitive filesystem */
public final class C76313n5 extends C76333n7 {
    public final C87264Ux A00;
    public final C87264Ux A01;
    public final C87264Ux A02;
    public final C87264Ux A03;
    public final AnonymousClass4UW A04;
    public final AnonymousClass1E7 A05;
    public final AnonymousClass4ZN A06;
    public final C86544Sb A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76313n5) {
                C76313n5 r5 = (C76313n5) obj;
                if (!C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass4UW r0 = this.A04;
        return AnonymousClass000.A0N(this.A07, (((((((AnonymousClass000.A0N(r0, ((AnonymousClass001.A0k(this.A05) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00)) * 31) + 1237;
    }

    public C76313n5(C87264Ux r1, C87264Ux r2, C87264Ux r3, C87264Ux r4, C86544Sb r5, AnonymousClass4UW r6, AnonymousClass1E7 r7, AnonymousClass4ZN r8) {
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = r4;
        this.A07 = r5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LGCOrOneToOne(titleContact=");
        A10.append(this.A05);
        A10.append(", titleContentDescription=");
        A10.append(this.A06);
        A10.append(", subtitleState=");
        A10.append(this.A04);
        A10.append(", minimizeBtnState=");
        A10.append(this.A02);
        A10.append(", participantsBtnState=");
        A10.append(this.A03);
        A10.append(", cameraSwitchBtnState=");
        A10.append(this.A01);
        A10.append(", arEffectsBtnState=");
        A10.append(this.A00);
        A10.append(", extendedParticipantsViewState=");
        A10.append(this.A07);
        A10.append(", showPhoto=");
        return C17900vP.A0F(A10, false);
    }
}
