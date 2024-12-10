package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallParticipantJid;
import java.util.Map;

/* renamed from: X.9sy  reason: invalid class name and case insensitive filesystem */
public final class C195209sy {
    public final UserJid A00;
    public final CallParticipantJid A01;
    public final Integer A02;
    public final String A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195209sy) {
                C195209sy r5 = (C195209sy) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A02, C17880vN.A03(this.A03));
        return AnonymousClass000.A0N(this.A00, (AnonymousClass000.A0N(this.A01, A0N) + 1231) * 31) + AnonymousClass001.A0k(this.A04);
    }

    public C195209sy(UserJid userJid, CallParticipantJid callParticipantJid, Integer num, String str, Map map) {
        this.A03 = str;
        this.A02 = num;
        this.A01 = callParticipantJid;
        this.A00 = userJid;
        this.A04 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StartBotCallCommand(callId=");
        A10.append(this.A03);
        A10.append(", callFromUi=");
        A10.append(this.A02);
        A10.append(", peer=");
        A10.append(this.A01);
        C108975cc.A16(A10, ", isLidCall=");
        A10.append(", agentJid=");
        A10.append(this.A00);
        A10.append(", botOptions=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
