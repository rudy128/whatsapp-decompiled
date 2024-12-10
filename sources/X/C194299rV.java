package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.9rV  reason: invalid class name and case insensitive filesystem */
public final class C194299rV {
    public final long A00;
    public final GroupJid A01;
    public final String A02;

    public C194299rV(String str, GroupJid groupJid, long j) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = groupJid;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194299rV) {
                C194299rV r8 = (C194299rV) obj;
                if (!C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0N(this.A01, C17880vN.A03(this.A02)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScheduledCallReminderCommand(scheduledId=");
        A10.append(this.A02);
        A10.append(", groupJid=");
        A10.append(this.A01);
        A10.append(", scheduledTimestampSec=");
        return C17900vP.A0E(A10, this.A00);
    }
}
