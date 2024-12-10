package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2mp  reason: invalid class name and case insensitive filesystem */
public final class C59752mp {
    public final int A00;
    public final long A01;
    public final Jid A02;
    public final Jid A03;
    public final UserJid A04;
    public final String A05;

    public C59752mp(Jid jid, Jid jid2, UserJid userJid, String str, int i, long j) {
        C18070vi.A0f(str, 1, jid);
        this.A05 = str;
        this.A00 = i;
        this.A04 = userJid;
        this.A02 = jid;
        this.A03 = jid2;
        this.A01 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59752mp) {
                C59752mp r8 = (C59752mp) obj;
                if (!C18070vi.A18(this.A05, r8.A05) || this.A00 != r8.A00 || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03) || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Jid jid = this.A02;
        return AnonymousClass001.A0J(this.A01, (AnonymousClass000.A0N(jid, (((C17880vN.A03(this.A05) + this.A00) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + C17880vN.A02(this.A03)) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HighRetryCountLoggingParams(id=");
        A10.append(this.A05);
        A10.append(", retryCount=");
        A10.append(this.A00);
        A10.append(", recipient=");
        A10.append(this.A04);
        A10.append(", jid=");
        A10.append(this.A02);
        A10.append(", participant=");
        A10.append(this.A03);
        A10.append(", loggableStanzaId=");
        return C17900vP.A0E(A10, this.A01);
    }
}
