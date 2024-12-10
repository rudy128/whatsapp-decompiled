package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2yM  reason: invalid class name and case insensitive filesystem */
public final class C66552yM implements C41121vq {
    public final UserJid A00;
    public final List A01;
    public final boolean A02;
    public final int A03;

    public int BTW() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66552yM) {
                C66552yM r5 = (C66552yM) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03 || !C18070vi.A18(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((((AnonymousClass000.A0L(this.A00) + this.A03) * 31) + AnonymousClass001.A0k(this.A01)) * 31, this.A02);
    }

    public C66552yM(UserJid userJid, List list, int i, boolean z) {
        this.A00 = userJid;
        this.A03 = i;
        this.A01 = list;
        this.A02 = z;
    }

    public /* synthetic */ C70483Bg BO2() {
        return null;
    }

    public /* bridge */ /* synthetic */ AnonymousClass1BI BTb() {
        return this.A00;
    }

    public int BYi() {
        return this.A03;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallsHistoryContactItem(userJid=");
        A10.append(this.A00);
        A10.append(", resultPosition=");
        A10.append(this.A03);
        A10.append(", terms=");
        A10.append(this.A01);
        A10.append(", isFavorite=");
        return C17900vP.A0F(A10, this.A02);
    }
}
