package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2n2  reason: invalid class name and case insensitive filesystem */
public final class C59882n2 {
    public final int A00;
    public final int A01;
    public final AnonymousClass205 A02;
    public final C60132nR A03;
    public final String A04;
    public final List A05;
    public final Map A06;
    public final Set A07;
    public final DeviceJid A08;
    public final Jid A09;
    public final UserJid A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59882n2) {
                C59882n2 r5 = (C59882n2) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A09, r5.A09) || this.A01 != r5.A01 || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || this.A00 != r5.A00 || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C59882n2(DeviceJid deviceJid, Jid jid, UserJid userJid, AnonymousClass205 r5, C60132nR r6, String str, List list, Map map, Set set, int i, int i2) {
        C18070vi.A0d(list, 8);
        C18070vi.A0d(map, 10);
        C18070vi.A0d(set, 11);
        this.A03 = r6;
        this.A02 = r5;
        this.A09 = jid;
        this.A01 = i;
        this.A08 = deviceJid;
        this.A0A = userJid;
        this.A04 = str;
        this.A05 = list;
        this.A00 = i2;
        this.A06 = map;
        this.A07 = set;
    }

    public int hashCode() {
        int i = 0;
        int A0N = (((((AnonymousClass000.A0N(this.A09, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A03))) + this.A01) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + AnonymousClass001.A0k(this.A0A)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        List list = this.A05;
        return AnonymousClass000.A0O(this.A07, AnonymousClass000.A0N(this.A06, (AnonymousClass000.A0N(list, (A0N + i) * 31) + this.A00) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendMessageEncryptedParams(stanzaKey=");
        A10.append(this.A03);
        A10.append(", key=");
        A10.append(this.A02);
        A10.append(", remoteJid=");
        A10.append(this.A09);
        A10.append(", retryCount=");
        A10.append(this.A01);
        A10.append(", participant=");
        A10.append(this.A08);
        A10.append(", recipientJid=");
        A10.append(this.A0A);
        A10.append(", mediaType=");
        A10.append(this.A04);
        A10.append(", messageStanzaChildren=");
        A10.append(this.A05);
        A10.append(", editVersion=");
        A10.append(this.A00);
        A10.append(", messageAttrsMap=");
        A10.append(this.A06);
        A10.append(", broadcastListParticipants=");
        return AnonymousClass001.A1F(this.A07, A10);
    }
}
