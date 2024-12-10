package X;

import android.content.SharedPreferences;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.199  reason: invalid class name */
public class AnonymousClass199 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AtomicLong A02 = new AtomicLong(-1);

    public long A00() {
        long mostSignificantBits;
        AtomicLong atomicLong = this.A02;
        long j = atomicLong.get();
        if (j == -1) {
            AnonymousClass00H r6 = this.A00;
            j = ((SharedPreferences) ((C19830z4) r6.get()).A00.get()).getLong("qpl_id", -1);
            if (j != -1) {
                atomicLong.set(j);
            } else {
                synchronized (AnonymousClass199.class) {
                    if (atomicLong.get() != -1) {
                        mostSignificantBits = atomicLong.get();
                    } else {
                        mostSignificantBits = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
                        atomicLong.set(mostSignificantBits);
                        C19830z4.A00((C19830z4) r6.get()).putLong("qpl_id", mostSignificantBits).apply();
                    }
                }
                return mostSignificantBits;
            }
        }
        return j;
    }

    public AnonymousClass199(AnonymousClass00H r4, AnonymousClass00H r5) {
        this.A00 = r4;
        this.A01 = r5;
    }
}
