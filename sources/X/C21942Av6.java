package X;

import android.os.Bundle;
import com.whatsapp.integrity.survey.activity.SurveyActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Av6  reason: case insensitive filesystem */
public final class C21942Av6 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ SurveyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21942Av6(SurveyActivity surveyActivity) {
        super(0);
        this.this$0 = surveyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C22941Dw r2 = UserJid.Companion;
        Bundle A09 = AnonymousClass3MY.A09(this.this$0);
        if (A09 != null) {
            str = A09.getString("chat_jid");
        } else {
            str = null;
        }
        UserJid A04 = r2.A04(str);
        if (A04 != null) {
            return A04;
        }
        throw AnonymousClass000.A0n("Could not retrieve chat jid from arguments bundle.");
    }
}
