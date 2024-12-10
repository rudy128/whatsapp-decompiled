package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9xz  reason: invalid class name and case insensitive filesystem */
public final class C198219xz {
    public static volatile C198219xz A03;
    public final Context A00;
    public final AtomicInteger A01;
    public final AtomicReference A02;

    public C198219xz(Context context) {
        this.A01 = new AtomicInteger(1);
        this.A02 = new AtomicReference();
        this.A00 = context.getApplicationContext();
    }

    public C198219xz() {
    }
}
