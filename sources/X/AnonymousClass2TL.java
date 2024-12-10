package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2TL  reason: invalid class name */
public abstract class AnonymousClass2TL {
    public static final List A00(Collection collection) {
        ArrayList A0D = C29351c6.A0D(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0D.add(((A2B) it.next()).A02);
        }
        return A0D;
    }
}
