package X;

import java.util.Map;

/* renamed from: X.9tB  reason: invalid class name and case insensitive filesystem */
public final class C195339tB {
    public C193289pq A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;
    public Map A05;

    public AnonymousClass8R7 A00() {
        String str = this.A04;
        String str2 = "";
        if (str == null) {
            str2 = AnonymousClass000.A0y(" transportName", AnonymousClass000.A11(str2));
        }
        C193289pq r5 = this.A00;
        if (r5 == null) {
            str2 = AnonymousClass000.A0y(" encodedPayload", AnonymousClass000.A11(str2));
        }
        Long l = this.A02;
        if (l == null) {
            str2 = AnonymousClass000.A0y(" eventMillis", AnonymousClass000.A11(str2));
        }
        Long l2 = this.A03;
        if (l2 == null) {
            str2 = AnonymousClass000.A0y(" uptimeMillis", AnonymousClass000.A11(str2));
        }
        Map map = this.A05;
        if (map == null) {
            str2 = AnonymousClass000.A0y(" autoMetadata", AnonymousClass000.A11(str2));
        }
        if (str2.isEmpty()) {
            return new AnonymousClass8R7(r5, this.A01, str, map, l.longValue(), l2.longValue());
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Missing required properties:");
        throw AnonymousClass000.A0o(str2, A10);
    }

    public final void A01(String str, int i) {
        Map map = this.A05;
        if (map != null) {
            map.put(str, String.valueOf(i));
            return;
        }
        throw AnonymousClass000.A0n("Property \"autoMetadata\" has not been set");
    }

    public final void A02(String str, String str2) {
        Map map = this.A05;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw AnonymousClass000.A0n("Property \"autoMetadata\" has not been set");
    }
}
