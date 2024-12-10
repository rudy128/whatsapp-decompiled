package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.24V  reason: invalid class name */
public final class AnonymousClass24V extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass24T this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass24V(AnonymousClass24T r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.this$0.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r1 = (AnonymousClass1D6) it.next();
            linkedHashMap.put(r1.second, Integer.valueOf(((Number) r1.first).intValue()));
        }
        return linkedHashMap;
    }
}
