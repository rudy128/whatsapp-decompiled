package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.27K  reason: invalid class name */
public class AnonymousClass27K extends C002100z {
    public final int A00 = 0;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass27K(AnonymousClass1Q7 r2) {
        super(250);
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ void A09(boolean z, Object obj, Object obj2, Object obj3) {
        if (this.A00 != 0) {
            C56202h4 r8 = (C56202h4) obj2;
            if (z) {
                AnonymousClass1SS.A01(r8, (AnonymousClass1SS) this.A01);
            }
        } else if (z) {
            AnonymousClass1Q7 r1 = (AnonymousClass1Q7) this.A01;
            Map map = r1.A02;
            map.put(obj, new WeakReference(obj2));
            int i = r1.A00 + 1;
            r1.A00 = i;
            if (i % 200 == 0) {
                ArrayList A13 = AnonymousClass000.A13();
                Iterator A15 = AnonymousClass000.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    if (((Reference) A16.getValue()).get() == null) {
                        A13.add(A16.getKey());
                    }
                }
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    map.remove(it.next());
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass27K(AnonymousClass1SS r2) {
        super(30);
        this.A01 = r2;
    }
}
