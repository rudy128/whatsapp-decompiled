package X;

import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;

/* renamed from: X.7Cu  reason: invalid class name and case insensitive filesystem */
public final class C143287Cu implements AnonymousClass8B7 {
    public final AiHomeBot A00;
    public final AnonymousClass1BI A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143287Cu) {
                C143287Cu r5 = (C143287Cu) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A00);
        return C17890vO.A02(this.A02, (C17890vO.A02(this.A03, A0L) + AnonymousClass001.A0k(this.A01)) * 31) * 31;
    }

    public /* synthetic */ C143287Cu(AiHomeBot aiHomeBot, AnonymousClass1BI r2, String str, String str2) {
        this.A00 = aiHomeBot;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChatHistory(aiHomeBot=");
        A10.append(this.A00);
        A10.append(", sectionName=");
        A10.append(this.A03);
        A10.append(", jid=");
        A10.append(this.A01);
        A10.append(", lastActiveTime=");
        A10.append(this.A02);
        AnonymousClass000.A1G(A10, ", bot=");
        A10.append(", botProfile=");
        return AnonymousClass001.A1F((Object) null, A10);
    }
}
