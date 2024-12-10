package androidx.credentials.playservices.controllers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1Y1;
import X.AnonymousClass8BX;
import X.BKE;
import X.BKH;
import X.BKJ;
import X.BKL;
import X.C18070vi;
import X.C18090vk;
import X.C22821Di;
import X.C98494rF;
import X.E7A;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

public abstract class CredentialProviderController extends CredentialProviderBaseController {
    public static final Companion Companion = new Object();
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    public final Context context;

    public final class Companion {
        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, C18090vk r3) {
            C18070vi.A0d(r3, 1);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                r3.invoke();
            }
        }

        public final boolean maybeReportErrorResultCodeCreate(int i, AnonymousClass1OS r6, C22821Di r7, CancellationSignal cancellationSignal) {
            C18070vi.A0e(r6, 1, r7);
            if (i == -1) {
                return false;
            }
            C98494rF A00 = C98494rF.A00();
            A00.element = new BKH(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                A00.element = new BKE("activity is cancelled by the user.");
            }
            r6.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(r7, A00));
            return true;
        }

        public final boolean maybeReportErrorResultCodeGet(int i, AnonymousClass1OS r6, C22821Di r7, CancellationSignal cancellationSignal) {
            C18070vi.A0e(r6, 1, r7);
            if (i == -1) {
                return false;
            }
            C98494rF A00 = C98494rF.A00();
            A00.element = new BKL(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                A00.element = new BKJ("activity is cancelled by the user.");
            }
            r6.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(r7, A00));
            return true;
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("activity with result code: ");
            A10.append(i);
            return AnonymousClass000.A0y(" indicating not RESULT_OK", A10);
        }

        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context2) {
        super(context2);
        C18070vi.A0d(context2, 1);
        this.context = context2;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, C18090vk r2) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, r2);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, AnonymousClass1OS r2, C22821Di r3, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, r2, r3, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, AnonymousClass1OS r2, C22821Di r3, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, r2, r3, cancellationSignal);
    }

    public abstract Object convertRequestToPlayServices(Object obj);

    public abstract Object convertResponseToCredentialManager(Object obj);

    public abstract void invokePlayServices(Object obj, E7A e7a, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle bundle, AnonymousClass1OS r5, Executor executor, E7A e7a, CancellationSignal cancellationSignal) {
        C18070vi.A0d(bundle, 0);
        AnonymousClass8BX.A1J(r5, executor, e7a, 1);
        if (!bundle.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderController$maybeReportErrorFromResultReceiver$1(executor, e7a, r5.invoke(bundle.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), bundle.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
