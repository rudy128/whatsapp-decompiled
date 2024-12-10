package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1Y1;
import X.BE6;
import X.BK3;
import X.BZ5;
import X.BZB;
import X.C108985cd;
import X.C17880vN;
import X.C18070vi;
import X.C18090vk;
import X.C18210vx;
import X.C22530BBn;
import X.C22821Di;
import X.C23191Bcl;
import X.C23203Bcx;
import X.C24420C2u;
import X.C24421C2v;
import X.C24740CIc;
import X.C24898COr;
import X.C25069CWc;
import X.C25260Cbz;
import X.C25558Chw;
import X.C26126Cso;
import X.C26377Cyd;
import X.C26890DHx;
import X.C41381wH;
import X.CIJ;
import X.DIJ;
import X.E7A;
import X.EA7;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import com.google.android.gms.tasks.zzw;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl implements C22530BBn {
    public static final Companion Companion = new Object();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final String TAG = "PlayServicesImpl";
    public final Context context;
    public C41381wH googleApiAvailability;

    public final class Companion {
        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, C18090vk r3) {
            C18070vi.A0d(r3, 1);
            if (!cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                r3.invoke();
            }
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(C24740CIc cIc) {
            C18070vi.A0d(cIc, 0);
            Iterator it = cIc.A00.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return false;
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            } else if (!cancellationSignal.isCanceled()) {
                return false;
            } else {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
                return true;
            }
        }

        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }

        public Companion() {
        }
    }

    public CredentialProviderPlayServicesImpl(Context context2) {
        C18070vi.A0d(context2, 1);
        this.context = context2;
        C41381wH r0 = C41381wH.A00;
        C18070vi.A0X(r0);
        this.googleApiAvailability = r0;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    public static final void onClearCredential$lambda$0(C22821Di r1, Object obj) {
        C18070vi.A0d(r1, 0);
        r1.invoke(obj);
    }

    public /* synthetic */ void onGetCredential(Context context2, C24421C2v c2v, CancellationSignal cancellationSignal, Executor executor, E7A e7a) {
    }

    public /* synthetic */ void onPrepareCredential(C24740CIc cIc, CancellationSignal cancellationSignal, Executor executor, E7A e7a) {
    }

    public final void setGoogleApiAvailability(C41381wH r2) {
        C18070vi.A0d(r2, 0);
        this.googleApiAvailability = r2;
    }

    private final int isGooglePlayServicesAvailable(Context context2) {
        return this.googleApiAvailability.A02(context2, MIN_GMS_APK_VERSION);
    }

    public final C41381wH getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public boolean isAvailableOnDevice() {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        Log.w(TAG, AnonymousClass001.A1E(new C23203Bcx(isGooglePlayServicesAvailable), "Connection with Google Play Services was not successful. Connection result is: ", AnonymousClass000.A10()));
        return false;
    }

    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, E7A e7a, Exception exc) {
        C18070vi.A0p(executor, e7a, exc);
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(exc, executor, e7a));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.DHx, java.lang.Object] */
    public void onClearCredential(C24420C2u c2u, CancellationSignal cancellationSignal, Executor executor, E7A e7a) {
        C18070vi.A0k(executor, e7a);
        if (!Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            Context context2 = this.context;
            C18210vx.A00(context2);
            BZ5 bz5 = new BZ5(context2, (C26890DHx) new Object());
            bz5.A01.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
            Set<C25260Cbz> set = C25260Cbz.A00;
            synchronized (set) {
            }
            for (C25260Cbz cbz : set) {
                if (cbz instanceof BZB) {
                    EA7 ea7 = ((BZB) cbz).A01;
                    if (ea7 != null) {
                        ea7.CSv();
                    }
                } else {
                    throw C17880vN.A0y();
                }
            }
            C26377Cyd.A03();
            C25069CWc A00 = C25558Chw.A00();
            A00.A03 = new C23191Bcl[]{CIJ.A01};
            A00.A01 = new DIJ(bz5);
            A00.A02 = false;
            A00.A00 = 1554;
            zzw A02 = C26126Cso.A02(bz5, A00.A00(), 1);
            A02.addOnSuccessListener(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(new CredentialProviderPlayServicesImpl$onClearCredential$1(cancellationSignal, executor, e7a)));
            A02.addOnFailureListener(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1(this, cancellationSignal, executor, e7a));
        }
    }

    public void onCreateCredential(Context context2, C24898COr cOr, CancellationSignal cancellationSignal, Executor executor, E7A e7a) {
        C18070vi.A0h(context2, cOr);
        C108985cd.A1D(executor, e7a);
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (cOr instanceof BK3) {
            new CredentialProviderCreatePublicKeyCredentialController(context2).invokePlayServices((BK3) cOr, e7a, executor, cancellationSignal);
            return;
        }
        throw BE6.A0v("Create Credential request is unsupported, not password or publickeycredential");
    }

    public void onGetCredential(Context context2, C24740CIc cIc, CancellationSignal cancellationSignal, Executor executor, E7A e7a) {
        C18070vi.A0h(context2, cIc);
        C108985cd.A1D(executor, e7a);
        Companion companion = Companion;
        if (!companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            companion.isGetSignInIntentRequest$credentials_play_services_auth_release(cIc);
            new CredentialProviderBeginSignInController(context2).invokePlayServices(cIc, e7a, executor, cancellationSignal);
        }
    }
}
