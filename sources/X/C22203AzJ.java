package X;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.whatsapp.util.Log;

/* renamed from: X.AzJ  reason: case insensitive filesystem */
public final class C22203AzJ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C192869p7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22203AzJ(C192869p7 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RecaptchaTasksClient recaptchaTasksClient = (RecaptchaTasksClient) obj;
        C192869p7 r0 = this.this$0;
        boolean A1W = AnonymousClass8BU.A1W(recaptchaTasksClient);
        r0.A01 = recaptchaTasksClient;
        C192869p7 r1 = this.this$0;
        r1.A02 = AnonymousClass9IK.INIT_SUCCEEDED;
        AnonymousClass8BR.A0W(r1.A09).A01("RECAPTCHA_INIT_", "SUCCESS");
        this.this$0.A04.set(A1W);
        C192869p7 r6 = this.this$0;
        if (!r6.A01()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("RecaptchaClientHandler/Cannot fetch token - not enabled for this user: ");
            C17900vP.A0o(A10, r6.A00);
        } else if (r6.A01 == null) {
            Log.e("RecaptchaClientHandler/callExecute/client is not registered, cancelling");
            r6.A08.A00(AnonymousClass8oE.A00, "executeCalledPreInitFinish");
        } else {
            r6.A02 = AnonymousClass9IK.FETCH_STARTED;
            AnonymousClass00H r5 = r6.A09;
            AnonymousClass8BR.A0W(r5).A00("RECAPTCHA_EXECUTE_");
            try {
                RecaptchaTasksClient recaptchaTasksClient2 = r6.A01;
                if (recaptchaTasksClient2 != null) {
                    Task executeTask = recaptchaTasksClient2.executeTask(RecaptchaAction.SIGNUP, 10000);
                    AJM.A00(executeTask, new C22202AzI(r6), 2);
                    AJI.A00(executeTask, r6, 3);
                } else {
                    C18070vi.A11("recaptchaClient");
                    throw null;
                }
            } catch (Exception e) {
                r6.A08.A01(AnonymousClass8oE.A00, "exceptionThrown", e);
                C17900vP.A0X(e, "RecaptchaClientHandler/execute exception caught: ", AnonymousClass000.A10());
                r6.A03 = e;
                r6.A02 = AnonymousClass9IK.FETCH_FAILED;
                AnonymousClass8BR.A0W(r5).A01("RECAPTCHA_EXECUTE_", "EXCEPTION");
            }
        }
        return C27621Wu.A00;
    }
}
