package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Ub  reason: invalid class name and case insensitive filesystem */
public abstract class C50342Ub {
    public static C63362sw A00(AnonymousClass1BI r20, Jid jid, Jid jid2, AnonymousClass1E2 r23, AnonymousClass1E2 r24, AnonymousClass1E2 r25, PhoneUserJid phoneUserJid, PhoneUserJid phoneUserJid2, PhoneUserJid phoneUserJid3, UserJid userJid, Boolean bool, Long l, String str) {
        AnonymousClass205 r16;
        Jid jid3 = jid2;
        C17960vV.A08(jid3, "remoteJid must be provided");
        C18070vi.A0X(jid3);
        String str2 = str;
        C17960vV.A08(str2, "id must be provided");
        Long l2 = l;
        C17960vV.A08(l2, "timestampMillis must be provided");
        long longValue = l2.longValue();
        Boolean bool2 = bool;
        C17960vV.A08(bool2, "fromMe must be provided");
        boolean booleanValue = bool2.booleanValue();
        AnonymousClass1BI A00 = C22971Dz.A00(jid3);
        C17960vV.A07(A00);
        C18070vi.A0X(A00);
        AnonymousClass205 A01 = AnonymousClass205.A01(A00, str2, booleanValue);
        boolean z = true;
        AnonymousClass1BI r5 = r20;
        UserJid userJid2 = userJid;
        if (r20 != null && !r5.equals(A00)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("IncomingMessageStanza/IncomingMessageStanza remoteChatJid=");
            A10.append(A00);
            C17900vP.A0Y(r5, "; normalizedChatJid=", A10);
            if (userJid == null) {
                z = false;
            }
            r16 = AnonymousClass205.A01(r5, str2, z);
        } else if (userJid != null) {
            r16 = AnonymousClass205.A01(userJid2, str2, true);
        } else {
            r16 = A01;
        }
        return new C63362sw(jid3, jid, r25, r24, r23, phoneUserJid3, phoneUserJid2, phoneUserJid, userJid2, A01, r16, str2, longValue);
    }
}
