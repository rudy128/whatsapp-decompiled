package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3pN  reason: invalid class name and case insensitive filesystem */
public final class C77103pN extends AnonymousClass4EK {
    public final UserJid A00;
    public final C18090vk A01;
    public final C22821Di A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77103pN) {
                C77103pN r5 = (C77103pN) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00)));
    }

    public C77103pN(UserJid userJid, C18090vk r2, C22821Di r3) {
        this.A00 = userJid;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserConfirmationRequired(userJid=");
        A10.append(this.A00);
        A10.append(", onUserConfirmationGranted=");
        A10.append(this.A02);
        A10.append(", onUserConfirmationDenied=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
