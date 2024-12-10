package X;

import androidx.car.app.CarAppBinder;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.OnContentRefreshDelegateImpl;
import androidx.car.app.navigation.NavigationManager$1;

/* renamed from: X.0Td  reason: invalid class name */
public class AnonymousClass0Td implements C15970rV {
    public final int A00;
    public final Object A01;

    public AnonymousClass0Td(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BIx() {
        switch (this.A00) {
            case 0:
                ((CarAppBinder) this.A01).m2lambda$onAppPause$3$androidxcarappCarAppBinder();
                break;
            case 1:
                ((CarAppBinder) this.A01).m4lambda$onAppStart$1$androidxcarappCarAppBinder();
                break;
            case 2:
                ((CarAppBinder) this.A01).m5lambda$onAppStop$4$androidxcarappCarAppBinder();
                break;
            case 3:
                ((CarAppBinder) this.A01).m3lambda$onAppResume$2$androidxcarappCarAppBinder();
                break;
            case 4:
                ((AlertCallbackDelegateImpl.AlertCallbackStub) this.A01).m9lambda$onAlertDismissed$1$androidxcarappmodelAlertCallbackDelegateImpl$AlertCallbackStub();
                break;
            case 5:
                ((OnClickDelegateImpl.OnClickListenerStub) this.A01).m13lambda$onClick$0$androidxcarappmodelOnClickDelegateImpl$OnClickListenerStub();
                break;
            case 6:
                ((OnContentRefreshDelegateImpl.OnContentRefreshListenerStub) this.A01).m14lambda$onContentRefreshRequested$0$androidxcarappmodelOnContentRefreshDelegateImpl$OnContentRefreshListenerStub();
                break;
            case 7:
                ((NavigationManager$1) this.A01).m20lambda$onStopNavigation$0$androidxcarappnavigationNavigationManager$1();
                break;
            default:
                throw AnonymousClass000.A0s("onScale");
        }
        throw null;
    }
}
