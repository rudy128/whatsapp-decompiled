package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1LZ  reason: invalid class name */
public final class AnonymousClass1LZ extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A04);
        r3.CHf(7, this.A03);
        r3.CHf(3, this.A00);
        r3.CHf(8, this.A01);
    }

    public AnonymousClass1LZ() {
        super(2450, new C18180vt(1000, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false), 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, this.A02);
        linkedHashMap.put(2, this.A04);
        linkedHashMap.put(7, this.A03);
        linkedHashMap.put(6, (Object) null);
        linkedHashMap.put(5, (Object) null);
        linkedHashMap.put(3, this.A00);
        linkedHashMap.put(4, (Object) null);
        linkedHashMap.put(8, this.A01);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append("WamDbPerf {");
        AnonymousClass186.A00(this.A02, "androidPerfDuration", sb);
        AnonymousClass186.A00(this.A04, "androidPerfName", sb);
        AnonymousClass186.A00(this.A03, "dbSizeInMb", sb);
        AnonymousClass186.A00(this.A00, "onMainThread", sb);
        Integer num = this.A01;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        AnonymousClass186.A00(obj, "startupStage", sb);
        sb.append("}");
        String obj2 = sb.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }
}
