package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1Y1;
import X.BK2;
import X.BK5;
import X.C17890vO;
import X.C18070vi;
import X.C23131Bbk;
import X.C24738CIa;
import X.C27621Wu;
import X.E7A;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "CreatePassword";
    public E7A callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver = new CredentialProviderCreatePasswordController$resultReceiver$1(this, C17890vO.A0D());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController(Context context2) {
        super(context2);
        C18070vi.A0d(context2, 1);
        this.context = context2;
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context2) {
        C18070vi.A0d(context2, 0);
        return new CredentialProviderCreatePasswordController(context2);
    }

    public C23131Bbk convertRequestToPlayServices(BK2 bk2) {
        throw AnonymousClass000.A0s("getId");
    }

    public C24738CIa convertResponseToCredentialManager(C27621Wu r2) {
        return new BK5();
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2) {
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Returned request code ");
            A10.append(i3);
            Log.w(TAG, AnonymousClass001.A1I(" which does not match what was given ", A10, i));
            return;
        }
        if (!CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new CredentialProviderCreatePasswordController$handleResponse$2(this), this.cancellationSignal)) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePasswordController$handleResponse$3(this, new BK5()));
        }
    }

    public final class Companion {
        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            C18070vi.A0d(context, 0);
            return new CredentialProviderCreatePasswordController(context);
        }

        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }

        public Companion() {
        }
    }

    public void invokePlayServices(BK2 bk2, E7A e7a, Executor executor2, CancellationSignal cancellationSignal2) {
        C18070vi.A0n(bk2, e7a, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = e7a;
        this.executor = executor2;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            convertRequestToPlayServices(bk2);
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ Object convertRequestToPlayServices(Object obj) {
        convertRequestToPlayServices((BK2) null);
        throw null;
    }

    public /* bridge */ /* synthetic */ Object convertResponseToCredentialManager(Object obj) {
        return new BK5();
    }

    public /* bridge */ /* synthetic */ void invokePlayServices(Object obj, E7A e7a, Executor executor2, CancellationSignal cancellationSignal2) {
        invokePlayServices((BK2) null, e7a, executor2, cancellationSignal2);
    }
}
