package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.CAy  reason: case insensitive filesystem */
public abstract class C24602CAy {
    public static ApiException A00(Status status) {
        if (status.A01 != null) {
            return new BYr(status);
        }
        return new ApiException(status);
    }
}
