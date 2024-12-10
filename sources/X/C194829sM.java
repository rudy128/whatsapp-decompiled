package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.9sM  reason: invalid class name and case insensitive filesystem */
public final class C194829sM {
    public final UserJid A00;
    public final String A01;
    public final Collection A02;
    public final Date A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194829sM) {
                C194829sM r5 = (C194829sM) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00))) + C17900vP.A00(this.A01);
    }

    public C194829sM(UserJid userJid, String str, Collection collection, Date date) {
        this.A00 = userJid;
        this.A02 = collection;
        this.A03 = date;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CreateOrderRequest(bizJid=");
        A10.append(this.A00);
        A10.append(", products=");
        A10.append(this.A02);
        A10.append(", date=");
        A10.append(this.A03);
        A10.append(", promotionId=");
        return C17900vP.A0B(this.A01, A10);
    }
}
