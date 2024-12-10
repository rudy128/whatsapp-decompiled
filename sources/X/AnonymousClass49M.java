package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.49M  reason: invalid class name */
public final class AnonymousClass49M extends A34 {
    public final C18030ve A00;
    public final A6O A01;
    public final AnonymousClass44e A02;
    public final UserJid A03;
    public final C36561o6 A04;
    public final WeakReference A05;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4r9, X.B9q, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C195409tI r1;
        try {
            UserJid userJid = this.A03;
            C18070vi.A0d(userJid, 1);
            ? obj = new Object();
            obj.A01 = userJid;
            obj.A00 = null;
            C21319Ai4 A002 = ((C61942qX) this.A04.A05.getValue()).A00(obj, "whatsapp_biz_integrity_survey_notification_load", 11389);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SurveyConversationBanner/GetQuickPromotionsTask/doInBackground chooseBestPromotion qp.isNotNull=");
            boolean z = true;
            A10.append(AnonymousClass000.A1W(A002));
            A10.append(" filterContext.surveyInfo.isNotNull=");
            if (obj.A00 == null) {
                z = false;
            }
            AnonymousClass4GG.A00(this.A00, this.A01, this.A02, userJid, AnonymousClass3MY.A0r(A10, z));
            if (A002 != null) {
                if (obj.A00 == null) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("SurveyConversationBanner/canShow surveyInfo is null when qp=");
                    C17890vO.A19(A102, A002.A0F);
                }
                r1 = obj.A00;
            } else {
                r1 = null;
            }
            return new AnonymousClass4TP(r1, A002);
        } catch (Exception e) {
            A6O a6o = this.A01;
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("SurveyConversationBanner/GetQuickPromotionsTask/doInBackground exception=");
            String A0y = AnonymousClass000.A0y(C25359CeJ.A00(e), A103);
            C18070vi.A0d(A0y, 0);
            a6o.A03((C134696r0) null, (C196009uJ) null, A0y);
            return new AnonymousClass4TP((C195409tI) null, (AnonymousClass5YR) null);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass5YR r2;
        C195409tI r1;
        C77983rv r6;
        AnonymousClass4TP r8 = (AnonymousClass4TP) obj;
        if (r8 != null && (r2 = r8.A00) != null && (r1 = r8.A01) != null && (r6 = (C77983rv) this.A05.get()) != null) {
            r6.A02 = r2;
            r6.A01 = r1;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SurveyConversationBanner/updateQuickPromotionsResult qp.IsNull=");
            A10.append(false);
            A10.append(" surveyInfo.isNull=");
            String A0r = AnonymousClass3MY.A0r(A10, false);
            AnonymousClass4GG.A00(r6.A04, r6.A06, r6.A07, r6.A08, A0r);
            if (r6.A02 == null || r6.A01 == null) {
                r6.A06(true);
            } else {
                r6.A07(false);
            }
        }
    }

    public AnonymousClass49M(C18030ve r1, A6O a6o, AnonymousClass44e r3, UserJid userJid, C36561o6 r5, WeakReference weakReference) {
        this.A03 = userJid;
        this.A04 = r5;
        this.A05 = weakReference;
        this.A02 = r3;
        this.A01 = a6o;
        this.A00 = r1;
    }
}
