package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2rP  reason: invalid class name and case insensitive filesystem */
public final class C62442rP {
    public static final long A03 = TimeUnit.DAYS.toMillis(30);
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public C62442rP(UserJid userJid, String str, long j) {
        C18070vi.A0d(str, 3);
        this.A01 = userJid;
        this.A00 = j;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62442rP) {
                C62442rP r8 = (C62442rP) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A00, AnonymousClass000.A0L(this.A01)) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BizIntegrityCTWAAdIDParams(userJid=");
        A10.append(this.A01);
        A10.append(", recordCreationTS=");
        A10.append(this.A00);
        A10.append(", adID=");
        return C17900vP.A0B(this.A02, A10);
    }
}
