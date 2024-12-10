package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

public final class CNT {
    public final List A00;
    public final PriorityQueue A01;

    public CNT(Collection collection) {
        int size;
        ArrayList A13 = AnonymousClass000.A13();
        A13.addAll(collection);
        this.A00 = A13;
        if (collection.isEmpty()) {
            size = 1;
        } else {
            size = collection.size();
        }
        this.A01 = new PriorityQueue(size, DUL.A00);
    }
}
