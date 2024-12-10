package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.AnonymousClass0CX;
import android.os.RemoteException;
import android.util.Log;
import java.security.InvalidParameterException;

public final class FailureResponse {
    public final int mErrorType;
    public final String mStackTrace;

    public int hashCode() {
        Object[] objArr = new Object[2];
        AnonymousClass000.A1L(objArr, this.mErrorType);
        return AnonymousClass000.A0P(this.mStackTrace, objArr, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FailureResponse)) {
            return false;
        }
        FailureResponse failureResponse = (FailureResponse) obj;
        if (this.mErrorType != failureResponse.mErrorType || !AnonymousClass026.A00(this.mStackTrace, failureResponse.mStackTrace)) {
            return false;
        }
        return true;
    }

    public FailureResponse(Throwable th) {
        int i;
        this.mStackTrace = Log.getStackTraceString(th);
        if (th instanceof AnonymousClass0CX) {
            i = 1;
        } else if (th instanceof IllegalStateException) {
            i = 2;
        } else if (th instanceof InvalidParameterException) {
            i = 3;
        } else if (th instanceof SecurityException) {
            i = 4;
        } else if (th instanceof RuntimeException) {
            i = 5;
        } else {
            i = 0;
            if (th instanceof RemoteException) {
                i = 6;
            }
        }
        this.mErrorType = i;
    }

    public FailureResponse() {
        this.mStackTrace = null;
        this.mErrorType = 0;
    }
}
