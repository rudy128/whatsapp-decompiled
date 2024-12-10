package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B0a  reason: case insensitive filesystem */
public final class C22246B0a extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $localBusinesses;
    public final /* synthetic */ C20135A8w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22246B0a(C20135A8w a8w, List list) {
        super(1);
        this.$localBusinesses = list;
        this.this$0 = a8w;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C195819tx r5 = (C195819tx) obj;
        C18070vi.A0d(r5, 0);
        List list = this.$localBusinesses;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C20135A8w.A09((C39611tM) it.next(), r5.A07)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return C108945cZ.A1A(z);
    }
}
