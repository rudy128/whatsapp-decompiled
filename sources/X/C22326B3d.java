package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.B3d  reason: case insensitive filesystem */
public final class C22326B3d extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C195819tx $businessProfile;
    public final /* synthetic */ int $type;
    public final /* synthetic */ String $useCase;
    public final /* synthetic */ C20135A8w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22326B3d(C20135A8w a8w, C195819tx r3, String str, int i) {
        super(2);
        this.this$0 = a8w;
        this.$businessProfile = r3;
        this.$useCase = str;
        this.$type = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Integer num;
        AnonymousClass1BI r3 = (AnonymousClass1BI) obj;
        int A05 = AnonymousClass8BX.A05(obj2, r3);
        C20135A8w.A04(this.this$0, r3, this.$businessProfile.A06);
        String str = this.$useCase;
        if (C18070vi.A18(str, "business_search")) {
            C20135A8w a8w = this.this$0;
            C195819tx r1 = this.$businessProfile;
            String str2 = r1.A06;
            Integer num2 = r1.A04;
            int i = this.$type;
            C20135A8w a8w2 = a8w;
            AnonymousClass1BI r12 = r3;
            Integer num3 = num2;
            a8w2.A0B(r12, num3, str2, i, AnonymousClass000.A1T(i, 41));
        } else if (C18070vi.A18(str, "global_search")) {
            C20135A8w a8w3 = this.this$0;
            C195819tx r13 = this.$businessProfile;
            String str3 = r13.A06;
            Integer num4 = r13.A04;
            C20045A4o a4o = C20135A8w.A0R;
            C18030ve r6 = a8w3.A0E;
            if (a4o.A03(r6) && C18020vd.A05(C18040vf.A02, r6, 6165)) {
                ((AM6) C18070vi.A0E(a8w3.A0H)).A04((Boolean) null, C17880vN.A0i(), a8w3.A0F.A02(), str3, (String) null, (Map) null, 1, 0);
            }
            AM6 A0G = AnonymousClass8BT.A0G(a8w3);
            int A03 = C108955ca.A03(a8w3.A0F);
            String A0A = a8w3.A0A();
            Long l = a8w3.A02;
            if (C20045A4o.A01(A0G.A00)) {
                C171228rN r122 = new C171228rN();
                AnonymousClass8BT.A1C(r122, 2, 0);
                r122.A02 = 2;
                AM6.A01(A0G, r122);
                int i2 = A05 + 1;
                if (l != null) {
                    num = Integer.valueOf((int) TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - l.longValue()));
                } else {
                    num = null;
                }
                AM6.A02(A0G, r122, (Boolean) null, Integer.valueOf(A03), Integer.valueOf(i2), (Integer) null, (Integer) null, (Integer) null, num4, num, (Long) null, A0A, (List) null);
                A0G.A01.CC7(r122);
            }
        }
        this.this$0.A0M.invoke(r3, Integer.valueOf(A05));
        return C27621Wu.A00;
    }
}
