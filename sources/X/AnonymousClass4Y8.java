package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4Y8  reason: invalid class name */
public final class AnonymousClass4Y8 {
    public final UserJid A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Y8) {
                AnonymousClass4Y8 r5 = (AnonymousClass4Y8) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0k = AnonymousClass001.A0k(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0k + i;
    }

    public AnonymousClass4Y8(UserJid userJid, String str) {
        this.A00 = userJid;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Input(selectedCommunityAdminJid=");
        A10.append(this.A00);
        A10.append(", selectedCommunityAdminName=");
        return C17900vP.A0B(this.A01, A10);
    }

    public AnonymousClass4Y8() {
        this((UserJid) null, (String) null);
    }
}
