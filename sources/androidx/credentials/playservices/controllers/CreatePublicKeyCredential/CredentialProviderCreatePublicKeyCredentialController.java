package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1Y1;
import X.AnonymousClass8EQ;
import X.BK3;
import X.BK6;
import X.BKH;
import X.BKS;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C18090vk;
import X.C18210vx;
import X.C22691BKo;
import X.C23204Bcy;
import X.C23232Bdi;
import X.C24738CIa;
import X.C2O;
import X.E7A;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.Executor;
import org.json.JSONException;

public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "CreatePublicKey";
    public E7A callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1(this, C17890vO.A0D());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController(Context context2) {
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

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context2) {
        C18070vi.A0d(context2, 0);
        return new CredentialProviderCreatePublicKeyCredentialController(context2);
    }

    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        C18070vi.A0d(credentialProviderCreatePublicKeyCredentialController, 0);
        E7A e7a = credentialProviderCreatePublicKeyCredentialController.callback;
        if (e7a == null) {
            C18070vi.A11("callback");
            throw null;
        } else {
            e7a.Bsz(C2O.A00(new C22691BKo(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        }
    }

    public C23232Bdi convertRequestToPlayServices(BK3 bk3) {
        C18070vi.A0d(bk3, 0);
        return PublicKeyCredentialControllerUtility.Companion.convert(bk3, this.context);
    }

    public C24738CIa convertResponseToCredentialManager(C23204Bcy bcy) {
        C18070vi.A0d(bcy, 0);
        try {
            String A02 = bcy.A02();
            C18070vi.A0X(A02);
            Bundle A0D = C17880vN.A0D();
            A0D.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", A02);
            return new BK6(A02, A0D);
        } catch (Throwable th) {
            throw new BKH(C17900vP.A0C("The PublicKeyCredential response json had an unexpected exception when parsing: ", AnonymousClass000.A10(), th));
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        CancellationSignal cancellationSignal2;
        C18090vk r1;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Returned request code ");
            A10.append(i3);
            Log.w(TAG, AnonymousClass001.A1I(" does not match what was given ", A10, i));
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA")) != null) {
            Parcelable.Creator creator = C23204Bcy.CREATOR;
            C18210vx.A00(creator);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            obtain.recycle();
            C23204Bcy bcy = (C23204Bcy) ((SafeParcelable) creator.createFromParcel(obtain));
            C18070vi.A0X(bcy);
            C2O publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(bcy);
            if (publicKeyCredentialResponseContainsError != null) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, publicKeyCredentialResponseContainsError));
                return;
            }
            try {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(bcy)));
            } catch (JSONException e) {
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            } catch (Throwable th) {
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            }
        } else if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
            Executor executor2 = this.executor;
            if (executor2 == null) {
                C18070vi.A11("executor");
                throw null;
            } else {
                executor2.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0(this));
            }
        }
    }

    public final class Companion {
        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            C18070vi.A0d(context, 0);
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }

        public Companion() {
        }
    }

    /* access modifiers changed from: private */
    public final AnonymousClass8EQ JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        if (message == null || message.length() <= 0) {
            return C2O.A00(new BKS(), "Unknown error");
        }
        return C2O.A00(new BKS(), message);
    }

    public void invokePlayServices(BK3 bk3, E7A e7a, Executor executor2, CancellationSignal cancellationSignal2) {
        C18090vk r1;
        C18070vi.A0n(bk3, e7a, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = e7a;
        this.executor = executor2;
        try {
            C23232Bdi convertRequestToPlayServices = convertRequestToPlayServices(bk3);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
                Intent intent = new Intent(this.context, HiddenActivity.class);
                intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
                generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
                try {
                    this.context.startActivity(intent);
                } catch (Exception unused) {
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(this));
                }
            }
        } catch (JSONException e) {
            r1 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(this, e);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
        } catch (Throwable th) {
            r1 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(this, th);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
        }
    }
}
