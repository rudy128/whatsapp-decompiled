package X;

import android.os.Bundle;
import com.whatsapp.integrity.survey.activity.SurveyActivity;

/* renamed from: X.Av8  reason: case insensitive filesystem */
public final class C21944Av8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ SurveyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21944Av8(SurveyActivity surveyActivity) {
        super(0);
        this.this$0 = surveyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle A09 = AnonymousClass3MY.A09(this.this$0);
        if (A09 != null && (string = A09.getString("session_id")) != null) {
            return string;
        }
        throw AnonymousClass000.A0n("Could not retrieve session id from arguments bundle.");
    }
}
