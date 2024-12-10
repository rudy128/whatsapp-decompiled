package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4r9  reason: invalid class name */
public final class AnonymousClass4r9 implements C22484B9q {
    public C195409tI A00;
    public UserJid A01;

    public /* synthetic */ void BmW(AnonymousClass5YR r1) {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4r9) {
                AnonymousClass4r9 r5 = (AnonymousClass4r9) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SurveyQuickPromotionsUserFilterContext(userJid=");
        A10.append(this.A01);
        A10.append(", surveyInfo=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
