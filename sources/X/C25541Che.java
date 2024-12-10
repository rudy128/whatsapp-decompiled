package X;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.Che  reason: case insensitive filesystem */
public final class C25541Che {
    public static final Status A02 = new Status(8, "The connection to Google Play services was lost");
    public final CLF A00 = new CLF(this);
    public final Set A01 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
}
