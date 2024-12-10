package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Locale;
import java.util.Map;

public abstract class C2X extends Exception {
    public final int mErrorCode;
    public Map mExtras;

    public C2X(String str, Throwable th, int i) {
        super(str, th);
        this.mErrorCode = i;
    }

    public final String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.mErrorCode);
        return String.format((Locale) null, "[ErrorCode=%d]", A1a);
    }

    public C2X(String str) {
        super(str);
        this.mErrorCode = SearchActionVerificationClientService.NOTIFICATION_ID;
    }

    public C2X(int i, Throwable th) {
        super(th.getMessage(), th);
        this.mErrorCode = i;
    }
}
