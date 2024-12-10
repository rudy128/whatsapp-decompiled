package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9sV  reason: invalid class name and case insensitive filesystem */
public final class C194919sV {
    public final long A00;
    public final UserJid A01;
    public final String A02;
    public final List A03;

    public C194919sV(UserJid userJid, String str, List list, long j) {
        C18070vi.A0d(str, 2);
        this.A01 = userJid;
        this.A02 = str;
        this.A00 = j;
        this.A03 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194919sV) {
                C194919sV r8 = (C194919sV) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A02, r8.A02) || this.A00 != r8.A00 || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass001.A0K(this.A00, C17890vO.A02(this.A02, AnonymousClass000.A0L(this.A01))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CtwaQualitySurveyPromotionData(userJid=");
        A10.append(this.A01);
        A10.append(", promotionId=");
        A10.append(this.A02);
        A10.append(", lastImpressionTs=");
        A10.append(this.A00);
        A10.append(", actionList=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
