package X;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* renamed from: X.BLe  reason: case insensitive filesystem */
public final class C22701BLe extends C22702BLf implements C28443E1j {
    public final Set A00;
    public final Semaphore A01 = new Semaphore(0);

    public C22701BLe(Context context, Set set) {
        super(context);
        this.A00 = set;
    }
}
