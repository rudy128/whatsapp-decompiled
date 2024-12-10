package X;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* renamed from: X.DKc  reason: case insensitive filesystem */
public final /* synthetic */ class C26947DKc implements OnCompleteListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ E2W A01;
    public final /* synthetic */ C54522eH A02;

    public final void onComplete(Task task) {
        zzw zzw;
        E2W e2w = this.A01;
        Activity activity = this.A00;
        C54522eH r4 = this.A02;
        AnonymousClass3Ma.A1O(e2w, 0, task);
        if (task.isSuccessful()) {
            D3I d3i = (D3I) task.getResult();
            if (d3i != null) {
                try {
                    DLN dln = (DLN) e2w;
                    Bj3 bj3 = (Bj3) d3i;
                    if (bj3.A01) {
                        zzw = new zzw();
                        zzw.zzb((Object) null);
                    } else {
                        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
                        intent.putExtra("confirmation_intent", bj3.A00);
                        intent.putExtra("window_flags", AnonymousClass3MZ.A0F(activity).getWindowSystemUiVisibility());
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        intent.putExtra("result_receiver", new BGH(dln.A00, taskCompletionSource));
                        activity.startActivity(intent);
                        zzw = taskCompletionSource.zza;
                    }
                    C18070vi.A0X(zzw);
                    zzw.addOnCompleteListener(new DKY(r4, 3));
                } catch (Exception unused) {
                }
            }
        } else {
            task.getException();
        }
    }

    public /* synthetic */ C26947DKc(Activity activity, E2W e2w, C54522eH r3) {
        this.A01 = e2w;
        this.A00 = activity;
        this.A02 = r3;
    }
}
