package X;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.Cc5  reason: case insensitive filesystem */
public abstract class C25264Cc5 {
    public final int A00;
    public final int A01;
    public final Bundle A02;
    public final TaskCompletionSource A03 = new TaskCompletionSource();

    public abstract void A00(Bundle bundle);

    public final void A01(C1U c1u) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String obj2 = c1u.toString();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Failing ");
            A10.append(obj);
            Log.d("MessengerIpcClient", AnonymousClass001.A1H(" with ", obj2, A10));
        }
        this.A03.setException(c1u);
    }

    public final void A02(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj2 = toString();
            String valueOf = String.valueOf(obj);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Finishing ");
            A10.append(obj2);
            Log.d("MessengerIpcClient", AnonymousClass001.A1H(" with ", valueOf, A10));
        }
        this.A03.setResult(obj);
    }

    public boolean A03() {
        return true;
    }

    public C25264Cc5(Bundle bundle, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bundle;
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Request { what=");
        A10.append(this.A01);
        A10.append(" id=");
        A10.append(this.A00);
        A10.append(" oneWay=");
        A10.append(A03());
        return AnonymousClass000.A0y("}", A10);
    }
}
