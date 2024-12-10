package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

/* renamed from: X.9Qx  reason: invalid class name and case insensitive filesystem */
public abstract class C181549Qx {
    public static final String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(System.currentTimeMillis());
        Locale locale = Locale.US;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, new Random().nextInt(SearchActionVerificationClientService.NOTIFICATION_ID));
        String bigInteger = new BigInteger(AnonymousClass000.A0y(C108955ca.A12(locale, "%04d", Arrays.copyOf(A1a, 1)), A10)).toString(36);
        C18070vi.A0X(bigInteger);
        return C108975cc.A0e(bigInteger);
    }
}
