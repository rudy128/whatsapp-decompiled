package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1ng  reason: invalid class name and case insensitive filesystem */
public final class C36311ng implements Comparable {
    public final long A00;
    public final AnonymousClass1BI A01;

    public C36311ng(AnonymousClass1BI r2, long j) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C36311ng) {
                C36311ng r8 = (C36311ng) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConversationInfo(jid=");
        sb.append(this.A01);
        sb.append(", timestampMillis=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C36311ng r6 = (C36311ng) obj;
        C18070vi.A0d(r6, 0);
        long j = this.A00;
        long j2 = r6.A00;
        if (j == j2) {
            return this.A01.compareTo((Jid) r6.A01);
        }
        if (j < j2) {
            return 1;
        }
        return -1;
    }

    public int hashCode() {
        long j = this.A00;
        return (this.A01.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }
}
