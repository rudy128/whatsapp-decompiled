package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class BGH extends ResultReceiver {
    public final /* synthetic */ TaskCompletionSource A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BGH(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.A00 = taskCompletionSource;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.A00.trySetResult((Object) null);
    }
}
