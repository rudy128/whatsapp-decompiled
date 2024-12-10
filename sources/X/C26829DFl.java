package X;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.DFl  reason: case insensitive filesystem */
public class C26829DFl implements C16890tO {
    public final DOZ A00;
    public final BV6 A01;

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        BV6 bv6 = this.A01;
        DFL dfl = ((BV6) obj2).A00;
        if (!(bv6 instanceof C23696Bo3)) {
            return null;
        }
        int A0G = C72453Mb.A0G(view, dfl, 0);
        String A0e = BE7.A0e(dfl);
        if (A0e != null) {
            Map map = CEH.A00;
            Queue queue = (Queue) map.get(A0e);
            if (queue == null) {
                queue = AnonymousClass8BR.A14();
                map.put(A0e, queue);
            }
            queue.add(AnonymousClass3MW.A0z(view));
            while (queue.size() > A0G) {
                queue.poll();
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A01.A0N((View) obj, this.A00, ((BV6) obj2).A00);
    }

    public C26829DFl(DOZ doz, BV6 bv6) {
        this.A01 = bv6;
        this.A00 = doz;
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
