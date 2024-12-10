package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1Y1;
import X.BKC;
import X.BKJ;
import X.BKK;
import X.BKL;
import X.BKM;
import X.BZ5;
import X.C108965cb;
import X.C17890vO;
import X.C18070vi;
import X.C18090vk;
import X.C18210vx;
import X.C23137Bbq;
import X.C23142Bbv;
import X.C24398C1t;
import X.C24740CIc;
import X.C24741CId;
import X.C26890DHx;
import X.C98494rF;
import X.E7A;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import java.util.List;
import java.util.concurrent.Executor;

public final class CredentialProviderGetSignInIntentController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "GetSignInIntent";
    public E7A callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver = new CredentialProviderGetSignInIntentController$resultReceiver$1(this, C17890vO.A0D());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController(Context context2) {
        super(context2);
        C18070vi.A0d(context2, 1);
        this.context = context2;
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context2) {
        C18070vi.A0d(context2, 0);
        return new CredentialProviderGetSignInIntentController(context2);
    }

    public C23137Bbq convertRequestToPlayServices(C24740CIc cIc) {
        C18070vi.A0d(cIc, 0);
        List list = cIc.A00;
        if (list.size() == 1) {
            C18070vi.A0z(list.get(0), "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
            throw AnonymousClass000.A0s("getServerClientId");
        }
        throw new BKM("GetSignInWithGoogleOption cannot be combined with other options.");
    }

    public C24741CId convertResponseToCredentialManager(C23142Bbv bbv) {
        C18070vi.A0d(bbv, 0);
        if (bbv.A07 != null) {
            return new C24741CId(createGoogleIdCredential(bbv));
        }
        Log.w(TAG, "Credential returned but no google Id found");
        throw new BKL("When attempting to convert get response, null credential found");
    }

    public final BKC createGoogleIdCredential(C23142Bbv bbv) {
        C18070vi.A0d(bbv, 0);
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = bbv.A02;
        C18070vi.A0X(str5);
        try {
            String str6 = bbv.A07;
            C18070vi.A0b(str6);
            C18070vi.A0d(str6, 0);
            String str7 = bbv.A03;
            if (str7 != null) {
                str = str7;
            }
            String str8 = bbv.A04;
            if (str8 != null) {
                str3 = str8;
            }
            String str9 = bbv.A05;
            if (str9 != null) {
                str2 = str9;
            }
            String str10 = bbv.A08;
            if (str10 != null) {
                str4 = str10;
            }
            Uri uri2 = bbv.A00;
            if (uri2 != null) {
                uri = uri2;
            }
            return new BKC(uri, str5, str6, str, str2, str3, str4);
        } catch (Exception unused) {
            throw new BKL("When attempting to convert get response, null Google ID Token found");
        }
    }

    public final void setCallback(E7A e7a) {
        C18070vi.A0d(e7a, 0);
        this.callback = e7a;
    }

    public final void setExecutor(Executor executor2) {
        C18070vi.A0d(executor2, 0);
        this.executor = executor2;
    }

    public final E7A getCallback() {
        E7A e7a = this.callback;
        if (e7a != null) {
            return e7a;
        }
        C18070vi.A11("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor2 = this.executor;
        if (executor2 != null) {
            return executor2;
        }
        C18070vi.A11("executor");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [X.DHx, java.lang.Object] */
    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        Object bkk;
        CancellationSignal cancellationSignal2;
        C18090vk r1;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Returned request code ");
            A10.append(i3);
            Log.w(TAG, AnonymousClass001.A1I(" which  does not match what was given ", A10, i));
            return;
        }
        if (!CredentialProviderController.Companion.maybeReportErrorResultCodeGet(i2, CredentialProviderGetSignInIntentController$handleResponse$1.INSTANCE, new CredentialProviderGetSignInIntentController$handleResponse$2(this), this.cancellationSignal)) {
            try {
                Context context2 = this.context;
                C18210vx.A00(context2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$3(this, convertResponseToCredentialManager(new BZ5(context2, (C26890DHx) new Object()).A06(intent))));
            } catch (ApiException e) {
                C98494rF A00 = C98494rF.A00();
                A00.element = new BKL(e.getMessage());
                int i4 = e.mStatus.A00;
                if (i4 == 16) {
                    bkk = new BKJ(e.getMessage());
                } else {
                    if (C108965cb.A1b(CredentialProviderBaseController.retryables, i4)) {
                        bkk = new BKK(e.getMessage());
                    }
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, A00));
                }
                A00.element = bkk;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, A00));
            } catch (C24398C1t e2) {
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderGetSignInIntentController$handleResponse$5(this, e2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            } catch (Throwable th) {
                BKL bkl = new BKL(th.getMessage());
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderGetSignInIntentController$handleResponse$6(this, bkl);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            }
        }
    }

    public final class Companion {
        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            C18070vi.A0d(context, 0);
            return new CredentialProviderGetSignInIntentController(context);
        }

        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }

        public Companion() {
        }
    }

    public void invokePlayServices(C24740CIc cIc, E7A e7a, Executor executor2, CancellationSignal cancellationSignal2) {
        C18090vk credentialProviderGetSignInIntentController$invokePlayServices$2;
        C18070vi.A0n(cIc, e7a, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = e7a;
        this.executor = executor2;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            try {
                convertRequestToPlayServices(cIc);
                throw null;
            } catch (Exception e) {
                if (e instanceof BKM) {
                    credentialProviderGetSignInIntentController$invokePlayServices$2 = new CredentialProviderGetSignInIntentController$invokePlayServices$1(this, e);
                } else {
                    credentialProviderGetSignInIntentController$invokePlayServices$2 = new CredentialProviderGetSignInIntentController$invokePlayServices$2(this);
                }
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, credentialProviderGetSignInIntentController$invokePlayServices$2);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object convertRequestToPlayServices(Object obj) {
        convertRequestToPlayServices((C24740CIc) obj);
        throw null;
    }
}
