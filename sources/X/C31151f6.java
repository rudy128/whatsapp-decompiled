package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1f6  reason: invalid class name and case insensitive filesystem */
public final class C31151f6 extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public C31151f6() {
        super(5560, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A02);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(7, this.A02);
        linkedHashMap.put(2, this.A00);
        linkedHashMap.put(3, this.A01);
        linkedHashMap.put(4, this.A03);
        linkedHashMap.put(5, this.A04);
        linkedHashMap.put(6, this.A05);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WamWamValidationErrorEvent {");
        AnonymousClass186.A00(this.A02, "conditions", sb);
        AnonymousClass186.A00(this.A00, "failedEventCode", sb);
        AnonymousClass186.A00(this.A01, "failedEventId", sb);
        AnonymousClass186.A00(this.A03, "failedEventName", sb);
        AnonymousClass186.A00(this.A04, "failedExpression", sb);
        AnonymousClass186.A00(this.A05, "failedFields", sb);
        sb.append("}");
        String obj = sb.toString();
        C18070vi.A0X(obj);
        return obj;
    }
}
