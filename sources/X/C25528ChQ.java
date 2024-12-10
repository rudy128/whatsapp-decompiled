package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.ChQ  reason: case insensitive filesystem */
public final class C25528ChQ {
    public final Map A00 = Collections.synchronizedMap(new WeakHashMap());
    public final Map A01 = Collections.synchronizedMap(new WeakHashMap());

    public static final void A00(Status status, C25528ChQ chQ, boolean z) {
        HashMap A10;
        HashMap A102;
        Map map = chQ.A00;
        synchronized (map) {
            A10 = BE6.A10(map);
        }
        Map map2 = chQ.A01;
        synchronized (map2) {
            A102 = BE6.A10(map2);
        }
        Iterator A0i = C17890vO.A0i(A10);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            if (z || AnonymousClass000.A1Y(A16.getValue())) {
                ((BasePendingResult) A16.getKey()).A07(status);
            }
        }
        Iterator A0i2 = C17890vO.A0i(A102);
        while (A0i2.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A0i2);
            if (z || AnonymousClass000.A1Y(A162.getValue())) {
                ((TaskCompletionSource) A162.getKey()).trySetException(new ApiException(status));
            }
        }
    }
}
