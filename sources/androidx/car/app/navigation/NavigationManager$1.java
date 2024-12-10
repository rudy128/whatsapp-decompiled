package androidx.car.app.navigation;

import X.AnonymousClass000;
import X.AnonymousClass0Td;
import X.C01960Cc;
import X.C04400Nd;
import X.C23381Fv;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;

public class NavigationManager$1 extends INavigationManager.Stub {
    public final /* synthetic */ C01960Cc this$0;
    public final /* synthetic */ C23381Fv val$lifecycle;

    public NavigationManager$1(C01960Cc r1, C23381Fv r2) {
        this.this$0 = r1;
        this.val$lifecycle = r2;
    }

    /* renamed from: lambda$onStopNavigation$0$androidx-car-app-navigation-NavigationManager$1  reason: not valid java name */
    public /* synthetic */ Object m20lambda$onStopNavigation$0$androidxcarappnavigationNavigationManager$1() {
        throw AnonymousClass000.A0s("onStopNavigation");
    }

    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Td(this, 7), this.val$lifecycle, "onStopNavigation");
    }
}
