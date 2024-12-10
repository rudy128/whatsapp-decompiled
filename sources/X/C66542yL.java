package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2yL  reason: invalid class name and case insensitive filesystem */
public final class C66542yL implements C41121vq {
    public final AnonymousClass1E7 A00;
    public final UserJid A01;
    public final List A02;

    public int BTW() {
        return 11;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66542yL) {
                C66542yL r5 = (C66542yL) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01)));
    }

    public C66542yL(AnonymousClass1E7 r1, UserJid userJid, List list) {
        this.A01 = userJid;
        this.A00 = r1;
        this.A02 = list;
    }

    public /* synthetic */ C70483Bg BO2() {
        return null;
    }

    public /* bridge */ /* synthetic */ AnonymousClass1BI BTb() {
        return this.A01;
    }

    public /* synthetic */ int BYi() {
        return -1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallHistoryInviteContactItem(userJid=");
        A10.append(this.A01);
        A10.append(", contact=");
        A10.append(this.A00);
        A10.append(", allContacts=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
