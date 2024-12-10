package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class Bj4 extends Bj5 {
    public final TaskCompletionSource A00;
    public final C25712Cki A01;
    public final /* synthetic */ C25542Chf A02;

    public Bj4(TaskCompletionSource taskCompletionSource, C25542Chf chf) {
        C25712Cki cki = new C25712Cki("OnRequestInstallCallback");
        this.A02 = chf;
        this.A01 = cki;
        this.A00 = taskCompletionSource;
    }

    public final void CTI(Bundle bundle) {
        C25994CqA cqA = this.A02.A00;
        if (cqA != null) {
            TaskCompletionSource taskCompletionSource = this.A00;
            synchronized (cqA.A07) {
                cqA.A0A.remove(taskCompletionSource);
            }
            cqA.A01().post(new Bj6(cqA, 0));
        }
        this.A01.A01("onGetLaunchReviewFlowInfo", BE6.A1Z());
        this.A00.trySetResult(new Bj3((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
