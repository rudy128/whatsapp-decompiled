package X;

import com.whatsapp.jid.UserJid;
import java.util.LinkedHashMap;

/* renamed from: X.9ms  reason: invalid class name and case insensitive filesystem */
public final class C191609ms {
    public C20130A8q A00;
    public final AnonymousClass118 A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final C56582hh A04;
    public final AnonymousClass1KB A05;
    public final AnonymousClass1M9 A06;

    public final void A00(AnonymousClass1FR r17, C183159Xe r18, C195409tI r19, int i) {
        String str;
        AnonymousClass1M9 r0 = this.A06;
        C195409tI r14 = r19;
        UserJid userJid = r14.A02;
        AnonymousClass1E7 A0E = r0.A0E(userJid);
        if (A0E != null) {
            C42741yf r02 = A0E.A0G;
            if (r02 == null || (str = r02.A08) == null) {
                str = "";
            }
            String str2 = r14.A04;
            C193199ph r4 = new C193199ph(str2);
            AnonymousClass1D6[] r3 = new AnonymousClass1D6[5];
            AnonymousClass1D6.A03("survey_type", r14.A05, r3, 0);
            C108985cd.A1G("survey_session_id", str2, r3);
            C72463Mc.A1I("business_jid", userJid.user, r3);
            C72463Mc.A1J("business_survey_session_id", r14.A03, r3);
            AnonymousClass8BW.A1L("business_name", str, r3);
            LinkedHashMap A0B = AnonymousClass1D7.A0B(r3);
            C20130A8q A002 = this.A04.A00(r4);
            this.A00 = A002;
            AnonymousClass1D6[] r1 = new AnonymousClass1D6[1];
            AnonymousClass1D6.A03("action", (Object) null, r1, 0);
            int i2 = i;
            A002.A0B(new C20902AbI(this, r14, i2), new C20906AbM(r17, r18, this, r14, i2), new C194579rx("biz_survey", (String) null, AnonymousClass1D7.A0C(r1)), "biz_survey", (String) null, A0B);
        }
    }

    public C191609ms(C56582hh r2, AnonymousClass1KB r3, AnonymousClass1M9 r4, AnonymousClass118 r5, C18030ve r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r6, r3, r7, r4);
        C18070vi.A0d(r2, 6);
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r3;
        this.A03 = r7;
        this.A06 = r4;
        this.A04 = r2;
    }
}
