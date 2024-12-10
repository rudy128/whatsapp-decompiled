package X;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DJt  reason: case insensitive filesystem */
public final class C26938DJt implements E26 {
    public Object A00 = null;
    public HashMap A01 = null;
    public final HashMap A02 = new HashMap(16, 1.0f);
    public final AtomicBoolean A03 = new AtomicBoolean();
    public final HashMap A04 = new HashMap(16, 1.0f);
    public final HashMap A05 = new HashMap(16, 1.0f);
    public final HashMap A06 = new HashMap(16, 1.0f);

    public static final void A00(ContentResolver contentResolver, C26938DJt dJt) {
        if (dJt.A01 == null) {
            dJt.A03.set(false);
            dJt.A01 = new HashMap(16, 1.0f);
            dJt.A00 = C17880vN.A0p();
            contentResolver.registerContentObserver(C24732CHu.A00, true, new C22590BEp(dJt));
        } else if (dJt.A03.getAndSet(false)) {
            dJt.A01.clear();
            dJt.A02.clear();
            dJt.A04.clear();
            dJt.A05.clear();
            dJt.A06.clear();
            dJt.A00 = C17880vN.A0p();
        }
    }
}
