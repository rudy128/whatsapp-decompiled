package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4FP  reason: invalid class name */
public final class AnonymousClass4FP {
    public AnonymousClass1E2 A00;
    public UserJid A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4FP) {
                AnonymousClass4FP r5 = (AnonymousClass4FP) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A0B != r5.A0B || this.A0C != r5.A0C || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((((((((C17890vO.A02(this.A07, C17890vO.A02(this.A06, AnonymousClass000.A0L(this.A01))) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A09)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A0A)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A03)) * 31, this.A0B), this.A0C) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A04);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CTWAFlowContext(userJid=");
        A10.append(this.A01);
        A10.append(", ctwaContextPhoneNumber=");
        A10.append(this.A06);
        A10.append(", flowCta=");
        A10.append(this.A07);
        A10.append(", flowId=");
        A10.append(this.A08);
        A10.append(", flowStartScreen=");
        A10.append(this.A09);
        A10.append(", ctwaCode=");
        A10.append(this.A05);
        A10.append(", sourceUrl=");
        A10.append(this.A0A);
        A10.append(", hasIceBreakers=");
        A10.append(this.A02);
        A10.append(", hasWelcomeMessage=");
        A10.append(this.A03);
        A10.append(", hasLoggedForAnalytics=");
        A10.append(this.A0B);
        A10.append(", isFlowCompleted=");
        A10.append(this.A0C);
        A10.append(", userLid=");
        A10.append(this.A00);
        A10.append(", showAutomatedGreetingMessage=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
