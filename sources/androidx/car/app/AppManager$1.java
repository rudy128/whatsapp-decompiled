package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass04N;
import X.C01950Cb;
import androidx.car.app.IAppManager;

public class AppManager$1 extends IAppManager.Stub {
    public final /* synthetic */ C01950Cb this$0;
    public final /* synthetic */ AnonymousClass04N val$carContext;

    public AppManager$1(C01950Cb r1, AnonymousClass04N r2) {
        this.this$0 = r1;
        this.val$carContext = r2;
    }

    public static /* synthetic */ Object lambda$onBackPressed$0(AnonymousClass04N r0) {
        throw AnonymousClass000.A0s("getOnBackPressedDispatcher");
    }

    public static /* synthetic */ Object lambda$startLocationUpdates$1(AnonymousClass04N r0) {
        throw AnonymousClass000.A0s("getCarService");
    }

    public static /* synthetic */ Object lambda$stopLocationUpdates$2(AnonymousClass04N r0) {
        throw AnonymousClass000.A0s("getCarService");
    }

    public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass000.A0s("getLifecycle");
    }

    public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass000.A0s("getLifecycle");
    }

    public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass000.A0s("getPackageManager");
    }

    public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass000.A0s("getLifecycle");
    }
}
