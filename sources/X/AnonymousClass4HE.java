package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4HE  reason: invalid class name */
public abstract class AnonymousClass4HE {
    public static final List A00(Integer num, Collection collection) {
        C18070vi.A0d(collection, 0);
        ArrayList A0D = C29351c6.A0D(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            C18070vi.A0d(A0Y, 1);
            A0D.add(new AnonymousClass4YP(A0Y, (AnonymousClass205) null, num));
        }
        return A0D;
    }
}
