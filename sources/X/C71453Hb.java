package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

/* renamed from: X.3Hb  reason: invalid class name and case insensitive filesystem */
public final class C71453Hb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C62582rd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71453Hb(C62582rd r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = ((C63332st) this.this$0.A05.get()).A02().iterator();
        while (it.hasNext()) {
            C59762mq r3 = (C59762mq) it.next();
            String str = r3.A06;
            Object obj = A13.get(str);
            if (obj == null) {
                obj = new PriorityQueue(1);
            }
            PriorityQueue priorityQueue = (PriorityQueue) obj;
            priorityQueue.offer(Integer.valueOf(r3.A00));
            A13.put(str, priorityQueue);
        }
        return A13;
    }
}
