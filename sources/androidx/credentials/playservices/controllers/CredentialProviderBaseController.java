package androidx.credentials.playservices.controllers;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.BKE;
import X.BKF;
import X.BKH;
import X.BKJ;
import X.BKK;
import X.BKL;
import X.BKN;
import X.C18070vi;
import X.C200410p;
import X.C24398C1t;
import X.C2O;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;

public class CredentialProviderBaseController {
    public static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    public static final String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";
    public static final int CONTROLLER_REQUEST_CODE = 1;
    public static final String CREATE_CANCELED = "CREATE_CANCELED";
    public static final String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";
    public static final String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";
    public static final String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";
    public static final String CREATE_UNKNOWN = "CREATE_UNKNOWN";
    public static final Companion Companion = new Object();
    public static final String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";
    public static final String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";
    public static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    public static final String GET_CANCELED = "GET_CANCELED_TAG";
    public static final String GET_INTERRUPTED = "GET_INTERRUPTED";
    public static final String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";
    public static final String GET_UNKNOWN = "GET_UNKNOWN";
    public static final String REQUEST_TAG = "REQUEST_TYPE";
    public static final String RESULT_DATA_TAG = "RESULT_DATA";
    public static final String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";
    public static final String SIGN_IN_INTENT_TAG = "SIGN_IN_INTENT";
    public static final String TYPE_TAG = "TYPE";
    public static final Set retryables;
    public final Context context;

    public final class Companion {
        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$annotations() {
        }

        public final C2O createCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (C18070vi.A18(str, CredentialProviderBaseController.CREATE_CANCELED)) {
                return new BKE(str2);
            }
            if (C18070vi.A18(str, CredentialProviderBaseController.CREATE_INTERRUPTED)) {
                return new BKF(str2);
            }
            return new BKH(str2);
        }

        public final int getCONTROLLER_REQUEST_CODE() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        public final C24398C1t getCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals(CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new BKN(str2);
                        }
                    } else if (str.equals(CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new BKK(str2);
                    }
                } else if (str.equals(CredentialProviderBaseController.GET_CANCELED)) {
                    return new BKJ(str2);
                }
            }
            return new BKL(str2);
        }

        public final Set getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        public /* synthetic */ Companion(AnonymousClass1Y1 r1) {
        }

        public Companion() {
        }
    }

    public CredentialProviderBaseController(Context context2) {
        C18070vi.A0d(context2, 1);
        this.context = context2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.credentials.playservices.controllers.CredentialProviderBaseController$Companion, java.lang.Object] */
    static {
        Integer[] numArr = new Integer[2];
        AnonymousClass000.A1L(numArr, 7);
        AnonymousClass000.A1M(numArr, 20);
        retryables = C200410p.A0S(numArr);
    }

    public static final int getCONTROLLER_REQUEST_CODE() {
        return CONTROLLER_REQUEST_CODE;
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent intent, String str) {
        C18070vi.A0n(resultReceiver, intent, str);
        intent.putExtra(TYPE_TAG, str);
        intent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        intent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        intent.setFlags(65536);
    }

    public final ResultReceiver toIpcFriendlyResultReceiver(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        C18070vi.A0X(obtain);
        C18070vi.A0b(resultReceiver);
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}
