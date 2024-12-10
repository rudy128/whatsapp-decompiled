package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.1Lg  reason: invalid class name and case insensitive filesystem */
public class C24681Lg extends AnonymousClass11D {
    public C24681Lg(AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r2, r3, true);
    }

    public void A00(AnonymousClass1BI r3) {
        notifyAllObservers(new C97014om(r3, 18));
    }

    public void A01(AnonymousClass1BI r3) {
        notifyAllObservers(new C97014om(r3, 19));
    }

    public void A02(AnonymousClass206 r3, int i) {
        notifyAllObservers(new C20739AWu(r3, i, 8));
    }

    public void A03(AnonymousClass206 r3, AnonymousClass206 r4) {
        notifyAllObservers(new AnonymousClass35N(r3, r4, 8));
    }

    public void A05(Collection collection, Map map) {
        notifyAllObservers(new AnonymousClass35N(collection, map, 9));
    }

    public void A04(Collection collection, int i) {
        collection.size();
        notifyAllObservers(new C20739AWu(collection, i, 7));
    }
}
