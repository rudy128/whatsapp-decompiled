package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1hC  reason: invalid class name and case insensitive filesystem */
public class C32441hC extends HashMap<AnonymousClass205, AnonymousClass21V> {
    public final /* synthetic */ C32431hB this$0;

    public C32441hC(C32431hB r1) {
        this.this$0 = r1;
    }

    /* renamed from: A00 */
    public AnonymousClass21V remove(Object obj) {
        C62572rc r0;
        C115295ti A00;
        AnonymousClass21V r2 = (AnonymousClass21V) super.get(obj);
        if (!(r2 == null || (r0 = r2.A02) == null)) {
            C32431hB r6 = this.this$0;
            C17960vV.A07(r0);
            AnonymousClass00H r3 = r6.A0J;
            C115295ti A002 = ((AnonymousClass168) r3.get()).A00(r2.A02);
            if (A002 != null) {
                A002.A16 = false;
                HashMap hashMap = r6.A0M;
                synchronized (hashMap) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        r6.A0E((BC9) null, (AnonymousClass21V) entry.getKey(), 1, ((Long) entry.getValue()).longValue(), true, true);
                    }
                    hashMap.clear();
                }
                synchronized (r6.A0C) {
                    Iterator it = r6.A0B().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            r6.A02.open();
                            break;
                        }
                        AnonymousClass21V r22 = (AnonymousClass21V) it.next();
                        if (r22.A02 != null && (A00 = ((AnonymousClass168) r3.get()).A00(r22.A02)) != null && A00.A16) {
                            break;
                        }
                    }
                }
            }
        }
        return (AnonymousClass21V) super.remove(obj);
    }
}
