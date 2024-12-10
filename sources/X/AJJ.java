package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.tasks.OnSuccessListener;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.util.Log;

public final /* synthetic */ class AJJ implements OnSuccessListener {
    public final /* synthetic */ RegisterPhone A00;
    public final /* synthetic */ Runnable A01;

    public final void onSuccess(Object obj) {
        RegisterPhone registerPhone = this.A00;
        Runnable runnable = this.A01;
        PendingIntent pendingIntent = (PendingIntent) obj;
        try {
            AnonymousClass02n r4 = registerPhone.A19;
            C18070vi.A0d(pendingIntent, 1);
            IntentSender intentSender = pendingIntent.getIntentSender();
            C18070vi.A0X(intentSender);
            r4.A02((C1406772n) null, new AnonymousClass0RL((Intent) null, intentSender, 0, 0));
            C21428Ajv.A00(registerPhone.A05, registerPhone, 40);
        } catch (Exception e) {
            Log.i("RegisterPhone/showGooglePhoneNumberHint/launching the PendingIntent failed", e);
            RegisterPhone.A19(registerPhone);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public /* synthetic */ AJJ(RegisterPhone registerPhone, Runnable runnable) {
        this.A00 = registerPhone;
        this.A01 = runnable;
    }
}
