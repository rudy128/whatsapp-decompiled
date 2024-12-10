package X;

import android.os.Bundle;
import com.whatsapp.integrity.survey.activity.SurveyActivity;

/* renamed from: X.Av7  reason: case insensitive filesystem */
public final class C21943Av7 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ SurveyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21943Av7(SurveyActivity surveyActivity) {
        super(0);
        this.this$0 = surveyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle A09 = AnonymousClass3MY.A09(this.this$0);
        if (A09 != null && (string = A09.getString("business_session_id")) != null) {
            return string;
        }
        throw AnonymousClass000.A0n("Could not retrieve business session id from arguments bundle.");
    }
}
