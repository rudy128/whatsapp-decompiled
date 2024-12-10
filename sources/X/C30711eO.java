package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1eO  reason: invalid class name and case insensitive filesystem */
public final class C30711eO extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public String A02;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A01);
        r3.CHf(5, this.A00);
    }

    public C30711eO() {
        super(2692, new C18180vt(10, 1000, 1000000, false), 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(4, (Object) null);
        linkedHashMap.put(1, this.A02);
        linkedHashMap.put(2, this.A01);
        linkedHashMap.put(5, this.A00);
        linkedHashMap.put(3, (Object) null);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append("WamActivityStats {");
        AnonymousClass186.A00(this.A02, "featureName", sb);
        AnonymousClass186.A00(this.A01, "memoryKbsConsumed", sb);
        Integer num = this.A00;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        AnonymousClass186.A00(obj, "memoryStatStage", sb);
        sb.append("}");
        String obj2 = sb.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }
}
