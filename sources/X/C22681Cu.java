package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Cu  reason: invalid class name and case insensitive filesystem */
public final class C22681Cu extends AnonymousClass184 {
    public Long A00;
    public String A01;
    public String A02;

    public C22681Cu() {
        super(2052, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, this.A00);
        linkedHashMap.put(3, this.A01);
        linkedHashMap.put(2, this.A02);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WamAndroidPerfTimer {");
        AnonymousClass186.A00(this.A00, "androidPerfDuration", sb);
        AnonymousClass186.A00(this.A01, "androidPerfExtraData", sb);
        AnonymousClass186.A00(this.A02, "androidPerfName", sb);
        sb.append("}");
        String obj = sb.toString();
        C18070vi.A0X(obj);
        return obj;
    }
}
