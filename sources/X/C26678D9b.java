package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D9b  reason: case insensitive filesystem */
public class C26678D9b implements E40 {
    public final /* synthetic */ C26381Cyh A00;
    public final /* synthetic */ C26219Cv7 A01;

    public C26678D9b(C26381Cyh cyh, C26219Cv7 cv7) {
        this.A01 = cv7;
        this.A00 = cyh;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.D3K, java.lang.Object] */
    public void Bqd(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CharSequence charSequence = ((C26009CqQ) it.next()).A05;
                ? obj = new Object();
                obj.A00 = charSequence;
                A13.add(obj);
            }
        }
        this.A00.A0o.Bqd(A13);
    }
}
