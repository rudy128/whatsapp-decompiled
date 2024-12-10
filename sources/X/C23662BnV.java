package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.BnV  reason: case insensitive filesystem */
public class C23662BnV extends C27298DbT<FieldDescriptorType, Object> {
    public void A05() {
        Iterable entrySet;
        if (!this.A02) {
            if (0 < this.A00.size()) {
                ((Map.Entry) this.A00.get(0)).getKey();
                throw AnonymousClass000.A0s("isRepeated");
            }
            if (this.A01.isEmpty()) {
                entrySet = CHS.A00;
            } else {
                entrySet = this.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                AnonymousClass000.A16(it).getKey();
                throw AnonymousClass000.A0s("isRepeated");
            }
        }
        super.A05();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Comparable) obj, obj2);
    }

    public C23662BnV(int i) {
        super(i);
    }
}
