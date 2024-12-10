package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.350  reason: invalid class name */
public final class AnonymousClass350 implements B5K {
    public final AnonymousClass1BI A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final long A06;

    public AnonymousClass350(AnonymousClass1BI r2, UserJid userJid, String str, String str2, String str3, String str4, long j) {
        C18070vi.A0d(str, 1);
        this.A04 = str;
        this.A01 = userJid;
        this.A00 = r2;
        this.A03 = str2;
        this.A06 = j;
        this.A02 = str3;
        this.A05 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass350) {
                AnonymousClass350 r8 = (AnonymousClass350) obj;
                if (!C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A00, r8.A00) || !C18070vi.A18(this.A03, r8.A03) || this.A06 != r8.A06 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0K = (AnonymousClass001.A0K(this.A06, (((((C17880vN.A03(this.A04) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A02)) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return A0K + i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotMetadata(targetId=");
        A10.append(this.A04);
        A10.append(", targetSenderJid=");
        A10.append(this.A01);
        A10.append(", targetChatJid=");
        A10.append(this.A00);
        A10.append(", editTargetId=");
        A10.append(this.A03);
        A10.append(", senderTimestampMs=");
        A10.append(this.A06);
        A10.append(", edit=");
        A10.append(this.A02);
        A10.append(", type=");
        return C17900vP.A0B(this.A05, A10);
    }
}
