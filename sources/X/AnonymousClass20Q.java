package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.20Q  reason: invalid class name */
public final class AnonymousClass20Q {
    public final UserJid A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass20Q) {
                AnonymousClass20Q r5 = (AnonymousClass20Q) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A01;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bot(jid=");
        sb.append(this.A00);
        sb.append(", personaId=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass20Q(UserJid userJid, String str) {
        this.A00 = userJid;
        this.A01 = str;
    }
}
