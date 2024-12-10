package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.List;

/* renamed from: X.9ro  reason: invalid class name and case insensitive filesystem */
public final class C194489ro {
    public final C29681ch A00;
    public final PhoneUserJid A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194489ro) {
                C194489ro r5 = (C194489ro) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)));
    }

    public C194489ro(C29681ch r1, PhoneUserJid phoneUserJid, List list) {
        this.A00 = r1;
        this.A01 = phoneUserJid;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterNotificationInfo(newsletterJid=");
        A10.append(this.A00);
        A10.append(", adminJid=");
        A10.append(this.A01);
        A10.append(", metadataUpdateTypes=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
