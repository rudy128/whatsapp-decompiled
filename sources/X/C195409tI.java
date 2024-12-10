package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9tI  reason: invalid class name and case insensitive filesystem */
public final class C195409tI {
    public final long A00;
    public final C196009uJ A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195409tI) {
                C195409tI r8 = (C195409tI) obj;
                if (!C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03) || this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0K(this.A00, C17890vO.A02(this.A03, AnonymousClass000.A0N(this.A02, C17890vO.A02(this.A04, C17880vN.A03(this.A05))))));
    }

    public C195409tI(C196009uJ r1, UserJid userJid, String str, String str2, String str3, long j) {
        C18070vi.A0s(str, str2, userJid, str3);
        this.A05 = str;
        this.A04 = str2;
        this.A02 = userJid;
        this.A03 = str3;
        this.A00 = j;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SurveyInfo(surveyType=");
        A10.append(this.A05);
        A10.append(", sessionId=");
        A10.append(this.A04);
        A10.append(", businessJid=");
        A10.append(this.A02);
        A10.append(", businessSessionId=");
        A10.append(this.A03);
        A10.append(", surveyStartTimestamp=");
        A10.append(this.A00);
        A10.append(", conversionInfo=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
