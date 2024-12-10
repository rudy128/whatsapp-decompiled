package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.7l2  reason: invalid class name and case insensitive filesystem */
public final class C150657l2 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C129696iD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150657l2(C129696iD r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = this.this$0.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r0 = (AnonymousClass1D6) it.next();
            int A04 = AnonymousClass3MZ.A04(r0);
            Object obj = r0.second;
            Object obj2 = A13.get(obj);
            if (obj2 == null) {
                obj2 = C17880vN.A14();
                A13.put(obj, obj2);
            }
            ((Set) obj2).add(Integer.valueOf(A04));
        }
        return A13;
    }
}
