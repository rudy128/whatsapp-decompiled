package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Bg  reason: invalid class name */
public final class AnonymousClass1Bg extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public AnonymousClass1Bg() {
        super(1094, new C18180vt(1, 200, 1000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A02);
        r3.CHf(7, this.A00);
        r3.CHf(1, this.A03);
        r3.CHf(5, this.A01);
        r3.CHf(10, this.A04);
        r3.CHf(8, this.A05);
        r3.CHf(9, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(2, this.A02);
        linkedHashMap.put(7, this.A00);
        linkedHashMap.put(3, (Object) null);
        linkedHashMap.put(4, (Object) null);
        linkedHashMap.put(1, this.A03);
        linkedHashMap.put(5, this.A01);
        linkedHashMap.put(17, (Object) null);
        linkedHashMap.put(18, (Object) null);
        linkedHashMap.put(10, this.A04);
        linkedHashMap.put(19, (Object) null);
        linkedHashMap.put(20, (Object) null);
        linkedHashMap.put(8, this.A05);
        linkedHashMap.put(9, this.A06);
        linkedHashMap.put(12, (Object) null);
        linkedHashMap.put(16, (Object) null);
        linkedHashMap.put(15, (Object) null);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        String obj2;
        StringBuilder sb = new StringBuilder();
        sb.append("WamAppLaunch {");
        AnonymousClass186.A00(this.A02, "appLaunchCpuT", sb);
        Integer num = this.A00;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        AnonymousClass186.A00(obj, "appLaunchDestination", sb);
        AnonymousClass186.A00(this.A03, "appLaunchT", sb);
        Integer num2 = this.A01;
        if (num2 == null) {
            obj2 = null;
        } else {
            obj2 = num2.toString();
        }
        AnonymousClass186.A00(obj2, "appLaunchTypeT", sb);
        AnonymousClass186.A00(this.A04, "dbMainThreadCount", sb);
        AnonymousClass186.A00(this.A05, "dbReadsCount", sb);
        AnonymousClass186.A00(this.A06, "dbWritesCount", sb);
        sb.append("}");
        String obj3 = sb.toString();
        C18070vi.A0X(obj3);
        return obj3;
    }
}
