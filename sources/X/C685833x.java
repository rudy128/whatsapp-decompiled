package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.33x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C685833x implements AnonymousClass3L9 {
    public final /* synthetic */ C37231pB A00;

    public final void BKo(Set set) {
        C37231pB r3 = this.A00;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            r3.A01.A05(C17880vN.A0v(it));
        }
        C37041os r1 = r3.A03;
        r1.A00.A00.revokeUriPermission(Uri.parse("content://com.whatsapp.provider.instrumentation"), 3);
    }

    public /* synthetic */ C685833x(C37231pB r1) {
        this.A00 = r1;
    }
}
