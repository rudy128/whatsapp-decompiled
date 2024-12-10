package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4TA  reason: invalid class name */
public final class AnonymousClass4TA {
    public final UserJid A00;
    public final AnonymousClass4ZN A01;

    public AnonymousClass4TA(UserJid userJid, AnonymousClass4ZN r3) {
        C18070vi.A0d(userJid, 3);
        this.A01 = r3;
        this.A00 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TA) {
                AnonymousClass4TA r5 = (AnonymousClass4TA) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, 1663994132));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnblockDialogFragmentUiState(titleResId=");
        A10.append(2131887212);
        A10.append(", message=");
        A10.append(this.A01);
        A10.append(", jid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
