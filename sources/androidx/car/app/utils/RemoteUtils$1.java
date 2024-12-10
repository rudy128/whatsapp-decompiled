package androidx.car.app.utils;

import X.AnonymousClass000;
import X.AnonymousClass0RM;
import X.C15340qT;
import androidx.car.app.IOnDoneCallback;

public class RemoteUtils$1 extends IOnDoneCallback.Stub {
    public final /* synthetic */ C15340qT val$callback;

    public RemoteUtils$1(C15340qT r1) {
        this.val$callback = r1;
    }

    public void onFailure(AnonymousClass0RM r2) {
        throw AnonymousClass000.A0s("onFailure");
    }

    public void onSuccess(AnonymousClass0RM r2) {
        throw AnonymousClass000.A0s("onSuccess");
    }
}
