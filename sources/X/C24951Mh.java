package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Mh  reason: invalid class name and case insensitive filesystem */
public final class C24951Mh extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C24951Mh() {
        super(5418, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, this.A01);
        linkedHashMap.put(2, this.A02);
        linkedHashMap.put(3, this.A03);
        linkedHashMap.put(4, this.A00);
        linkedHashMap.put(5, this.A04);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append("WamAndroidJobManagerUsage {");
        AnonymousClass186.A00(this.A01, "numMaxThreadsUsed", sb);
        AnonymousClass186.A00(this.A02, "numTotalNonPersistantJobs", sb);
        AnonymousClass186.A00(this.A03, "numTotalWaJobs", sb);
        Integer num = this.A00;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        AnonymousClass186.A00(obj, "sessionCategory", sb);
        AnonymousClass186.A00(this.A04, "sessionDuration", sb);
        sb.append("}");
        String obj2 = sb.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }
}
