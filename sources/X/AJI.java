package X;

import android.content.SharedPreferences;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.whatsapp.registration.verifyphone.SMSRetrieverAppInactiveReceiver;
import com.whatsapp.util.Log;

public class AJI implements OnFailureListener {
    public final int A00;
    public final Object A01;

    public AJI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Task task, Object obj, int i) {
        task.addOnFailureListener(new AJI(obj, i));
    }

    public final void onFailure(Exception exc) {
        int i;
        SharedPreferences.Editor editor;
        String str;
        int i2;
        switch (this.A00) {
            case 0:
                C20321AGd.A02((C20321AGd) this.A01, "Unable to fetch last known location from FusedLocationProviderClient");
                return;
            case 1:
                C20321AGd.A02((C20321AGd) this.A01, C17900vP.A0C("Location services unavailable ", AnonymousClass3MZ.A19(exc, 1), exc));
                return;
            case 2:
                C192869p7 r4 = (C192869p7) this.A01;
                boolean A1Z = C72453Mb.A1Z(exc);
                C17900vP.A0X(exc, "RecaptchaClientHandler/OnFailureListener/", AnonymousClass000.A10());
                r4.A08.A01(AnonymousClass8oE.A01, "onFailure", exc);
                r4.A03 = exc;
                r4.A02 = AnonymousClass9IK.INIT_FAILED;
                AnonymousClass8BR.A0W(r4.A09).A01("RECAPTCHA_INIT_", "ERROR");
                r4.A04.set(A1Z);
                return;
            case 3:
                C192869p7 r3 = (C192869p7) this.A01;
                C17900vP.A0Y(exc, "RecaptchaClientHandler/execute failed with exception: ", AnonymousClass3MZ.A19(exc, 1));
                r3.A08.A01(AnonymousClass8oE.A00, "onFailure", exc);
                r3.A03 = exc;
                r3.A02 = AnonymousClass9IK.FETCH_FAILED;
                AnonymousClass8BR.A0W(r3.A09).A01("RECAPTCHA_EXECUTE_", "ERROR");
                return;
            case 4:
                C57342iv r1 = (C57342iv) this.A01;
                Log.e("BackupTokenUtils/setBlockStoreBytes/exception determining E2EE", exc);
                if (r1 != null) {
                    r1.A00((Boolean) null, exc);
                    return;
                }
                return;
            case 5:
                Log.e("SMSRetrieverAppInactiveReceiver/onReceive/failure registering sms retriever client/ ", exc);
                C19830z4 r0 = ((SMSRetrieverAppInactiveReceiver) this.A01).A01;
                if (r0 != null) {
                    i = 0;
                    editor = C19830z4.A00(r0);
                    str = "sms_retriever_app_inactive_retry_count";
                    break;
                } else {
                    C18070vi.A11("waSharedPreferences");
                    throw null;
                }
            case 6:
                Log.e("SMSRetrieverReceiver/onReceive/failure registering sms retriever client after timeout/ ", exc);
                C19830z4 r12 = ((AnonymousClass8C5) this.A01).A01;
                A9B.A0U(r12, "timeout-waiting-for-sms");
                i = 0;
                editor = C19830z4.A00(r12);
                str = "sms_retriever_retry_count";
                break;
            default:
                C33931jc r32 = (C33931jc) this.A01;
                Log.e("requestHarmfulApps/onError", exc);
                String message = exc.getMessage();
                if (exc instanceof ApiException) {
                    i2 = ((ApiException) exc).mStatus.A00;
                } else {
                    i2 = 500;
                }
                r32.A03.A00(message, i2);
                return;
        }
        C17880vN.A1C(editor, str, i);
    }
}
