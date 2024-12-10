package X;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.0ec  reason: invalid class name and case insensitive filesystem */
public final class C08140ec extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C03620Iz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08140ec(C03620Iz r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object valueOf;
        HashMap hashMap = new HashMap();
        C03620Iz r6 = this.this$0;
        int size = r6.A03.size();
        for (int i = 0; i < size; i++) {
            C03290Hk r3 = (C03290Hk) r6.A03.get(i);
            Object obj = r3.A03;
            int i2 = r3.A00;
            if (obj != null) {
                valueOf = new C03640Jd(Integer.valueOf(i2), obj);
            } else {
                valueOf = Integer.valueOf(i2);
            }
            Object obj2 = hashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new LinkedHashSet();
                hashMap.put(valueOf, obj2);
            }
            ((AbstractCollection) obj2).add(r3);
        }
        return hashMap;
    }
}
