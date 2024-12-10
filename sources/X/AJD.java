package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class AJD implements OnCompleteListener {
    public final /* synthetic */ AnonymousClass02n A00;
    public final /* synthetic */ C20321AGd A01;
    public final /* synthetic */ C18090vk A02;
    public final /* synthetic */ C18090vk A03;

    public final void onComplete(Task task) {
        C1406772n r2;
        AnonymousClass0RL r1;
        C18090vk r12 = this.A02;
        AnonymousClass02n r5 = this.A00;
        C18090vk r4 = this.A03;
        C18070vi.A0d(r12, 0);
        C108985cd.A1D(r4, task);
        try {
            task.getResult(ApiException.class);
            r12.invoke();
        } catch (ApiException e) {
            Status status = e.mStatus;
            if (status.A00 == 6) {
                try {
                    if (e instanceof BYr) {
                        PendingIntent pendingIntent = ((BYr) e).mStatus.A01;
                        C18070vi.A0X(pendingIntent);
                        r2 = null;
                        IntentSender intentSender = pendingIntent.getIntentSender();
                        C18070vi.A0X(intentSender);
                        r1 = new AnonymousClass0RL((Intent) null, intentSender, 0, 0);
                    } else {
                        PendingIntent pendingIntent2 = status.A01;
                        if (pendingIntent2 != null) {
                            C17960vV.A07(pendingIntent2);
                            r2 = null;
                            IntentSender intentSender2 = pendingIntent2.getIntentSender();
                            C18070vi.A0X(intentSender2);
                            r1 = new AnonymousClass0RL((Intent) null, intentSender2, 0, 0);
                        } else {
                            return;
                        }
                    }
                    r5.A02(r2, r1);
                } catch (Exception unused) {
                    r4.invoke();
                }
            } else {
                r4.invoke();
            }
        }
    }

    public /* synthetic */ AJD(AnonymousClass02n r1, C20321AGd aGd, C18090vk r3, C18090vk r4) {
        this.A02 = r3;
        this.A01 = aGd;
        this.A00 = r1;
        this.A03 = r4;
    }
}
