package X;

import com.whatsapp.util.Log;

/* renamed from: X.9QP  reason: invalid class name */
public abstract class AnonymousClass9QP {
    public static final long A00(long j, long j2) {
        if (j2 > 0 && j / 10 > j2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MessageRangeUtil/convertTheTimestampIfTooLarge DeleteMessageForMeMutation message timestamp is too large, timestampToConvert=");
            A10.append(j);
            Log.w(C17890vO.A0a("; validTimestamp=", A10, j2));
            while (j / 10 > j2) {
                j = C17880vN.A04(j);
            }
        }
        return j;
    }
}
