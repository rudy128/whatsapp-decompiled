package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4TG  reason: invalid class name */
public final class AnonymousClass4TG {
    public final AnonymousClass1EC A00;
    public final UserJid A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TG) {
                AnonymousClass4TG r5 = (AnonymousClass4TG) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public AnonymousClass4TG(AnonymousClass1EC r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ActionContainer(groupJid=");
        A10.append(this.A00);
        A10.append(", creator=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
