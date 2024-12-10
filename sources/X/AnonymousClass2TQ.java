package X;

import com.whatsapp.util.Log;
import java.math.BigDecimal;

/* renamed from: X.2TQ  reason: invalid class name */
public abstract class AnonymousClass2TQ {
    public static final AnonymousClass1KN A00(String str, int i) {
        try {
            return new AnonymousClass1KN(new BigDecimal(str), i);
        } catch (NumberFormatException e) {
            Log.i("Pay: PaymentTransactionInfo.MethodInfo createFromParcel threw: ", e);
            return null;
        }
    }
}
