package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.BZ3;
import X.BZ5;
import X.C108965cb;
import X.C17880vN;
import X.C17900vP;
import X.C18070vi;
import X.C18210vx;
import X.C22821Di;
import X.C22999BYz;
import X.C23111BbQ;
import X.C23125Bbe;
import X.C23130Bbj;
import X.C23131Bbk;
import X.C23137Bbq;
import X.C23139Bbs;
import X.C23140Bbt;
import X.C23191Bcl;
import X.C23232Bdi;
import X.C24924CPx;
import X.C25069CWc;
import X.C25540Chd;
import X.C25558Chw;
import X.C26126Cso;
import X.C26888DHv;
import X.C26890DHx;
import X.C28622EAu;
import X.CIJ;
import X.DIP;
import X.DIQ;
import X.DIS;
import X.DIT;
import X.DJ0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.zzw;
import java.util.List;

public class HiddenActivity extends Activity {
    public static final Companion Companion = new Object();
    public static final int DEFAULT_VALUE = 1;
    public static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    public static final String TAG = "HiddenActivity";
    public boolean mWaitingForActivityResult;
    public ResultReceiver resultReceiver;

    public static final void handleBeginSignIn$lambda$10$lambda$8(C22821Di r1, Object obj) {
        C18070vi.A0d(r1, 0);
        r1.invoke(obj);
    }

    public static final void handleCreatePassword$lambda$14$lambda$12(C22821Di r1, Object obj) {
        C18070vi.A0d(r1, 0);
        r1.invoke(obj);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.E1k, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.BYz, X.Cso] */
    private final void handleCreatePublicKeyCredential() {
        C23232Bdi bdi = (C23232Bdi) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (bdi != null) {
            C24924CPx cPx = C22999BYz.A00;
            C26888DHv dHv = C28622EAu.A00;
            ? obj = new Object();
            Looper mainLooper = getMainLooper();
            C18210vx.A02(mainLooper, "Looper must not be null.");
            if (mainLooper == null) {
                mainLooper = Looper.getMainLooper();
            }
            ? cso = new C26126Cso(this, this, dHv, cPx, new C25540Chd(mainLooper, obj));
            C25069CWc A00 = C25558Chw.A00();
            A00.A01 = new DIP(cso, bdi);
            A00.A00 = 5407;
            zzw A02 = C26126Cso.A02(cso, A00.A00(), 0);
            A02.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda0(new HiddenActivity$handleCreatePublicKeyCredential$1$1(this, intExtra)));
            A02.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda1(this));
            return;
        }
        Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
        finish();
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(C22821Di r1, Object obj) {
        C18070vi.A0d(r1, 0);
        r1.invoke(obj);
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$4(C22821Di r1, Object obj) {
        C18070vi.A0d(r1, 0);
        r1.invoke(obj);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.DHx, java.lang.Object] */
    private final void handleBeginSignIn() {
        C23140Bbt bbt = (C23140Bbt) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (bbt != null) {
            BZ5 bz5 = new BZ5((Activity) this, (C26890DHx) new Object());
            new C23139Bbs((String) null, (String) null, (String) null, (List) null, false, true, false);
            new C23130Bbj((byte[]) null, (String) null, false);
            new C23125Bbe(false, (String) null);
            C23139Bbs bbs = bbt.A01;
            C18210vx.A00(bbs);
            C23111BbQ bbQ = bbt.A04;
            C18210vx.A00(bbQ);
            C23130Bbj bbj = bbt.A03;
            C18210vx.A00(bbj);
            C23125Bbe bbe = bbt.A02;
            C18210vx.A00(bbe);
            boolean z = bbt.A06;
            boolean z2 = z;
            C23140Bbt bbt2 = new C23140Bbt(bbs, bbe, bbj, bbQ, bz5.A00, bbt.A00, z2, bbt.A07);
            C25069CWc A00 = C25558Chw.A00();
            A00.A03 = new C23191Bcl[]{DJ0.A07("auth_api_credentials_begin_sign_in", 8)};
            A00.A01 = new DIS(bbt2, bz5);
            A00.A02 = false;
            A00.A00 = 1553;
            zzw A02 = C26126Cso.A02(bz5, A00.A00(), 0);
            A02.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda6(new HiddenActivity$handleBeginSignIn$1$1(this, intExtra)));
            A02.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda7(this));
            return;
        }
        Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
        finish();
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }

        public Companion() {
        }
    }

    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C18070vi.A0h(hiddenActivity, exc);
        if (!(exc instanceof ApiException) || !C108965cb.A1b(CredentialProviderBaseController.retryables, ((ApiException) exc).mStatus.A00)) {
            str = CredentialProviderBaseController.GET_NO_CREDENTIALS;
        } else {
            str = CredentialProviderBaseController.GET_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        C18070vi.A0b(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, C17900vP.A0C("During begin sign in, failure response from one tap: ", AnonymousClass000.A10(), exc));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.DHw, java.lang.Object] */
    private final void handleCreatePassword() {
        C23131Bbk bbk = (C23131Bbk) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (bbk != null) {
            BZ3 bz3 = new BZ3(this, new Object());
            C23131Bbk bbk2 = new C23131Bbk(bbk.A01, bz3.A00, bbk.A00);
            C25069CWc A00 = C25558Chw.A00();
            A00.A03 = new C23191Bcl[]{CIJ.A04};
            A00.A01 = new DIQ(bbk2, bz3);
            A00.A02 = false;
            A00.A00 = 1536;
            zzw A02 = C26126Cso.A02(bz3, A00.A00(), 0);
            A02.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda2(new HiddenActivity$handleCreatePassword$1$1(this, intExtra)));
            A02.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda3(this));
            return;
        }
        Log.i(TAG, "During save password, params is null, nothing to launch for create password");
        finish();
    }

    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C18070vi.A0h(hiddenActivity, exc);
        if (!(exc instanceof ApiException) || !C108965cb.A1b(CredentialProviderBaseController.retryables, ((ApiException) exc).mStatus.A00)) {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        } else {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        C18070vi.A0b(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, C17900vP.A0C("During save password, found password failure response from one tap ", AnonymousClass000.A10(), exc));
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C18070vi.A0h(hiddenActivity, exc);
        if (!(exc instanceof ApiException) || !C108965cb.A1b(CredentialProviderBaseController.retryables, ((ApiException) exc).mStatus.A00)) {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        } else {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        C18070vi.A0b(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, C17900vP.A0C("During create public key credential, fido registration failure: ", AnonymousClass000.A10(), exc));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.DHx, java.lang.Object] */
    private final void handleGetSignInIntent() {
        C23137Bbq bbq = (C23137Bbq) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (bbq != null) {
            BZ5 bz5 = new BZ5((Activity) this, (C26890DHx) new Object());
            String str = bbq.A01;
            C18210vx.A00(str);
            String str2 = bbq.A04;
            String str3 = bbq.A02;
            boolean z = bbq.A05;
            C23137Bbq bbq2 = new C23137Bbq(str, str3, bz5.A00, str2, bbq.A00, z);
            C25069CWc A00 = C25558Chw.A00();
            A00.A03 = new C23191Bcl[]{CIJ.A05};
            A00.A01 = new DIT(bbq2, bz5);
            A00.A00 = 1555;
            zzw A02 = C26126Cso.A02(bz5, A00.A00(), 0);
            A02.addOnSuccessListener(new HiddenActivity$$ExternalSyntheticLambda4(new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra)));
            A02.addOnFailureListener(new HiddenActivity$$ExternalSyntheticLambda5(this));
            return;
        }
        Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
        finish();
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C18070vi.A0h(hiddenActivity, exc);
        if (!(exc instanceof ApiException) || !C108965cb.A1b(CredentialProviderBaseController.retryables, ((ApiException) exc).mStatus.A00)) {
            str = CredentialProviderBaseController.GET_NO_CREDENTIALS;
        } else {
            str = CredentialProviderBaseController.GET_INTERRUPTED;
        }
        ResultReceiver resultReceiver2 = hiddenActivity.resultReceiver;
        C18070vi.A0b(resultReceiver2);
        hiddenActivity.setupFailure(resultReceiver2, str, C17900vP.A0C("During get sign-in intent, failure response from one tap: ", AnonymousClass000.A10(), exc));
    }

    /* access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver2, String str, String str2) {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        A0D.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
        A0D.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
        resultReceiver2.send(Integer.MAX_VALUE, A0D);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        A0D.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i);
        A0D.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
        ResultReceiver resultReceiver2 = this.resultReceiver;
        if (resultReceiver2 != null) {
            resultReceiver2.send(i2, A0D);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver2 = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver2;
        if (resultReceiver2 == null) {
            finish();
        }
        restoreState(bundle);
        if (!this.mWaitingForActivityResult) {
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                            handleBeginSignIn();
                            return;
                        }
                        break;
                    case 15545322:
                        if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                            handleCreatePublicKeyCredential();
                            return;
                        }
                        break;
                    case 1246634622:
                        if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                            handleCreatePassword();
                            return;
                        }
                        break;
                    case 1980564212:
                        if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                            handleGetSignInIntent();
                            return;
                        }
                        break;
                }
            }
            Log.w(TAG, "Activity handed an unsupported type");
            finish();
        }
    }
}
