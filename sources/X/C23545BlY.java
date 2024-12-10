package X;

import java.util.Iterator;

/* renamed from: X.BlY  reason: case insensitive filesystem */
public class C23545BlY extends DSM {
    public final /* synthetic */ Iterable val$iterable;
    public final /* synthetic */ int val$size = 200;

    public C23545BlY(Iterable iterable, int i) {
        this.val$iterable = iterable;
    }

    public Iterator iterator() {
        return C23921Id.partition(this.val$iterable.iterator(), this.val$size);
    }
}
