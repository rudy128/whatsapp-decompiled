package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.DNq  reason: case insensitive filesystem */
public class C26968DNq implements C28581E8s {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public void BlG(C199029zJ r3, E8A e8a, Object obj) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C28581E8s) it.next()).BlG(r3, e8a, obj);
            }
        }
    }

    public void BmZ(C199029zJ r3, E8A e8a) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C28581E8s) it.next()).BmZ(r3, e8a);
            }
        }
    }

    public void C4Z(C27230Da9 da9, E8A e8a) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((C28581E8s) it.next()).C4Z(da9, e8a);
            }
        }
    }
}
