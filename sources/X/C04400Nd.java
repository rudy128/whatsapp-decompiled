package X;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0Nd  reason: invalid class name and case insensitive filesystem */
public abstract class C04400Nd {
    public static void A00(IOnDoneCallback iOnDoneCallback, C15970rV r2, C23381Fv r3, String str) {
        AnonymousClass0LU.A00(new AnonymousClass0ZX(iOnDoneCallback, r2, r3, str));
    }

    public static void A01(IOnDoneCallback iOnDoneCallback, C15970rV r2, String str) {
        AnonymousClass0LU.A00(new AnonymousClass0ZS(iOnDoneCallback, r2, str));
    }

    public static void A02(IOnDoneCallback iOnDoneCallback, String str, Throwable th) {
        String A0y = AnonymousClass000.A0y(" onFailure", AnonymousClass000.A11(str));
        try {
            if (Log.isLoggable("CarApp", 3)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Dispatching call ");
                A10.append(A0y);
                Log.d("CarApp", AnonymousClass000.A0y(" to host", A10));
            }
            try {
                iOnDoneCallback.onFailure(new AnonymousClass0RM((Object) new FailureResponse(th)));
            } catch (AnonymousClass0CX e) {
                Log.e("CarApp.Dispatch", AnonymousClass001.A1H("Serialization failure in ", str, AnonymousClass000.A10()), e);
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Remote ");
            A102.append(A0y);
            throw new C07170aU(AnonymousClass000.A0y(" call failed", A102), e3);
        } catch (RemoteException e4) {
            Log.e("CarApp.Dispatch", AnonymousClass001.A1H("Host unresponsive when dispatching call ", A0y, AnonymousClass000.A10()), e4);
        }
    }
}
