package X;

import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.6Vt  reason: invalid class name and case insensitive filesystem */
public abstract class C123766Vt {
    public static final C143307Cw A00(AiHomeBot aiHomeBot, String str, String str2) {
        AiHomeBot aiHomeBot2 = aiHomeBot;
        C18070vi.A0d(aiHomeBot, 0);
        C20125A8k a8k = (C20125A8k) aiHomeBot2;
        AnonymousClass1BI A04 = PhoneUserJid.Companion.A04(a8k.A0F("phone_number_jid"));
        if (A04 == null) {
            A04 = C42711yc.A01.A02(a8k.A0F("jid"));
        }
        return new C143307Cw(aiHomeBot2, A04, str, str2, 7);
    }
}
