package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.98u  reason: invalid class name and case insensitive filesystem */
public final class C1774898u extends C180619Ng {
    public final AnonymousClass1BI A00;
    public final AnonymousClass1BI A01;
    public final GroupJid A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1774898u) {
                C1774898u r5 = (C1774898u) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0N(this.A00, (C17880vN.A03(this.A03) + C17900vP.A00(this.A04)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17900vP.A00(this.A05)) * 31) + C17880vN.A02(this.A01);
    }

    public C1774898u(AnonymousClass1BI r1, AnonymousClass1BI r2, GroupJid groupJid, String str, String str2, String str3) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A02 = groupJid;
        this.A05 = str3;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessagePushPayload(dataNotificationType=");
        A10.append(this.A03);
        A10.append(", dataToLid=");
        A10.append(this.A04);
        A10.append(", senderJid=");
        A10.append(this.A00);
        A10.append(", groupJid=");
        A10.append(this.A02);
        A10.append(", displayName=");
        A10.append(this.A05);
        A10.append(", senderPnJid=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
