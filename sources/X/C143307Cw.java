package X;

import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;

/* renamed from: X.7Cw  reason: invalid class name and case insensitive filesystem */
public final class C143307Cw implements AnonymousClass8B7 {
    public final AiHomeBot A00;
    public final AnonymousClass1BI A01;
    public final String A02;
    public final String A03;

    public /* synthetic */ C143307Cw(AiHomeBot aiHomeBot, AnonymousClass1BI r4, String str, String str2, int i) {
        String str3 = null;
        aiHomeBot = (i & 8) != 0 ? null : aiHomeBot;
        r4 = (i & 16) != 0 ? null : r4;
        str = (i & 32) != 0 ? null : str;
        str3 = (i & 64) == 0 ? str2 : str3;
        this.A00 = aiHomeBot;
        this.A01 = r4;
        this.A03 = str;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143307Cw) {
                C143307Cw r5 = (C143307Cw) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17900vP.A00(this.A03)) * 31) + C108955ca.A06(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass000.A1G(A10, "LoadedBot(bot=");
        AnonymousClass000.A1G(A10, ", botProfile=");
        AnonymousClass000.A1G(A10, ", waContact=");
        A10.append(", aiHomeBot=");
        A10.append(this.A00);
        A10.append(", jid=");
        A10.append(this.A01);
        A10.append(", suggestedSectionLabel=");
        A10.append(this.A03);
        A10.append(", sectionName=");
        return C17900vP.A0B(this.A02, A10);
    }

    public C143307Cw() {
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }
}
