package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1e6  reason: invalid class name and case insensitive filesystem */
public final class C30531e6 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;

    public C30531e6() {
        super(4334, new C18180vt(1, 1, 1, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(19, this.A0F);
        r3.CHf(23, this.A05);
        r3.CHf(24, this.A0G);
        r3.CHf(25, this.A0H);
        r3.CHf(1, this.A0B);
        r3.CHf(29, this.A00);
        r3.CHf(26, this.A01);
        r3.CHf(30, this.A02);
        r3.CHf(27, this.A03);
        r3.CHf(28, this.A04);
        r3.CHf(2, this.A06);
        r3.CHf(3, this.A07);
        r3.CHf(31, this.A08);
        r3.CHf(4, this.A0C);
        r3.CHf(7, this.A09);
        r3.CHf(5, this.A0D);
        r3.CHf(32, this.A0E);
        r3.CHf(6, this.A0A);
        r3.CHf(33, this.A0I);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(19, this.A0F);
        linkedHashMap.put(23, this.A05);
        linkedHashMap.put(24, this.A0G);
        linkedHashMap.put(25, this.A0H);
        linkedHashMap.put(1, this.A0B);
        linkedHashMap.put(29, this.A00);
        linkedHashMap.put(26, this.A01);
        linkedHashMap.put(30, this.A02);
        linkedHashMap.put(27, this.A03);
        linkedHashMap.put(28, this.A04);
        linkedHashMap.put(2, this.A06);
        linkedHashMap.put(3, this.A07);
        linkedHashMap.put(31, this.A08);
        linkedHashMap.put(4, this.A0C);
        linkedHashMap.put(20, (Object) null);
        linkedHashMap.put(21, (Object) null);
        linkedHashMap.put(22, (Object) null);
        linkedHashMap.put(7, this.A09);
        linkedHashMap.put(5, this.A0D);
        linkedHashMap.put(32, this.A0E);
        linkedHashMap.put(6, this.A0A);
        linkedHashMap.put(33, this.A0I);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        String obj6;
        StringBuilder sb = new StringBuilder();
        sb.append("WamTsNavigation {");
        AnonymousClass186.A00(this.A0F, "cid", sb);
        Integer num = this.A05;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        AnonymousClass186.A00(obj, "entryPointConversationInitiated", sb);
        AnonymousClass186.A00(this.A0G, "entryPointConversionApp", sb);
        AnonymousClass186.A00(this.A0H, "entryPointConversionSource", sb);
        AnonymousClass186.A00(this.A0B, "groupSize", sb);
        AnonymousClass186.A00(this.A00, "isCatalogVisible", sb);
        AnonymousClass186.A00(this.A01, "isCloudapi", sb);
        AnonymousClass186.A00(this.A02, "isMetaAiThread", sb);
        AnonymousClass186.A00(this.A03, "isOnpremises", sb);
        AnonymousClass186.A00(this.A04, "isSmb", sb);
        Integer num2 = this.A06;
        if (num2 == null) {
            obj2 = null;
        } else {
            obj2 = num2.toString();
        }
        AnonymousClass186.A00(obj2, "navigationDestination", sb);
        Integer num3 = this.A07;
        if (num3 == null) {
            obj3 = null;
        } else {
            obj3 = num3.toString();
        }
        AnonymousClass186.A00(obj3, "navigationSource", sb);
        Integer num4 = this.A08;
        if (num4 == null) {
            obj4 = null;
        } else {
            obj4 = num4.toString();
        }
        AnonymousClass186.A00(obj4, "referrerAction", sb);
        AnonymousClass186.A00(this.A0C, "relativeTimestampMs", sb);
        Integer num5 = this.A09;
        if (num5 == null) {
            obj5 = null;
        } else {
            obj5 = num5.toString();
        }
        AnonymousClass186.A00(obj5, "threadType", sb);
        AnonymousClass186.A00(this.A0D, "tsSessionId", sb);
        AnonymousClass186.A00(this.A0E, "tsTimestampMs", sb);
        Integer num6 = this.A0A;
        if (num6 == null) {
            obj6 = null;
        } else {
            obj6 = num6.toString();
        }
        AnonymousClass186.A00(obj6, "typeOfGroup", sb);
        AnonymousClass186.A00(this.A0I, "unifiedSessionId", sb);
        sb.append("}");
        String obj7 = sb.toString();
        C18070vi.A0X(obj7);
        return obj7;
    }
}
