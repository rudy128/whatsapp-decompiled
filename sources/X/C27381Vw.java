package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Vw  reason: invalid class name and case insensitive filesystem */
public final class C27381Vw extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;

    public C27381Vw() {
        super(2054, new C18180vt(1, 1, 1, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(15, this.A00);
        r3.CHf(3, (Object) null);
        r3.CHf(4, this.A04);
        r3.CHf(9, this.A05);
        r3.CHf(8, this.A06);
        r3.CHf(1, this.A09);
        r3.CHf(2, this.A02);
        r3.CHf(11, this.A01);
        r3.CHf(14, this.A0A);
        r3.CHf(5, this.A07);
        r3.CHf(7, this.A03);
        r3.CHf(6, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(13, (Object) null);
        linkedHashMap.put(15, this.A00);
        linkedHashMap.put(17, (Object) null);
        linkedHashMap.put(3, (Object) null);
        linkedHashMap.put(4, this.A04);
        linkedHashMap.put(10, (Object) null);
        linkedHashMap.put(9, this.A05);
        linkedHashMap.put(8, this.A06);
        linkedHashMap.put(1, this.A09);
        linkedHashMap.put(16, (Object) null);
        linkedHashMap.put(2, this.A02);
        linkedHashMap.put(12, (Object) null);
        linkedHashMap.put(11, this.A01);
        linkedHashMap.put(14, this.A0A);
        linkedHashMap.put(5, this.A07);
        linkedHashMap.put(7, this.A03);
        linkedHashMap.put(6, this.A08);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        StringBuilder sb = new StringBuilder();
        sb.append("WamAndroidRegDirectMigrationFlow {");
        AnonymousClass186.A00(this.A00, "didReceiveRcFromConsumer", sb);
        Integer num = this.A04;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        AnonymousClass186.A00(obj, "firstMigrationFailureReason", sb);
        Integer num2 = this.A05;
        if (num2 == null) {
            obj2 = null;
        } else {
            obj2 = num2.toString();
        }
        AnonymousClass186.A00(obj2, "migrateMediaResult", sb);
        Integer num3 = this.A06;
        if (num3 == null) {
            obj3 = null;
        } else {
            obj3 = num3.toString();
        }
        AnonymousClass186.A00(obj3, "migratePhoneNumberScreenAction", sb);
        AnonymousClass186.A00(this.A09, "migrationDurationT", sb);
        AnonymousClass186.A00(this.A02, "migrationTotalSize", sb);
        AnonymousClass186.A00(this.A01, "otherFilesMigrationFailed", sb);
        AnonymousClass186.A00(this.A0A, "providerAppVersionCode", sb);
        Integer num4 = this.A07;
        if (num4 == null) {
            obj4 = null;
        } else {
            obj4 = num4.toString();
        }
        AnonymousClass186.A00(obj4, "secondMigrationFailureReason", sb);
        AnonymousClass186.A00(this.A03, "spacePredictedToNeed", sb);
        Integer num5 = this.A08;
        if (num5 == null) {
            obj5 = null;
        } else {
            obj5 = num5.toString();
        }
        AnonymousClass186.A00(obj5, "thirdMigrationFailureReason", sb);
        sb.append("}");
        String obj6 = sb.toString();
        C18070vi.A0X(obj6);
        return obj6;
    }
}
