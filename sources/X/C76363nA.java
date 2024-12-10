package X;

/* renamed from: X.3nA  reason: invalid class name and case insensitive filesystem */
public final class C76363nA extends AnonymousClass4EC {
    public final C87264Ux A00;
    public final C87264Ux A01;
    public final AnonymousClass4UW A02;
    public final AnonymousClass1E7 A03;
    public final AnonymousClass4ZN A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76363nA) {
                C76363nA r5 = (C76363nA) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, (AnonymousClass000.A0L(this.A03) + AnonymousClass001.A0k(this.A04)) * 31)));
    }

    public C76363nA(C87264Ux r1, C87264Ux r2, AnonymousClass4UW r3, AnonymousClass1E7 r4, AnonymousClass4ZN r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceChat(titleContact=");
        A10.append(this.A03);
        A10.append(", titleContentDescription=");
        A10.append(this.A04);
        A10.append(", subtitleState=");
        A10.append(this.A02);
        A10.append(", minimizeBtnState=");
        A10.append(this.A00);
        A10.append(", participantsBtnState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
