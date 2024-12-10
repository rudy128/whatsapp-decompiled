package X;

import java.util.Map;

/* renamed from: X.AfN  reason: case insensitive filesystem */
public final class C21152AfN implements BCH {
    public final /* synthetic */ C187519fw A00;

    public void C3l(String str) {
    }

    public C21152AfN(C187519fw r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.9NR] */
    public void C3j(C187029f9 r11) {
        C187519fw r9 = this.A00;
        String str = r9.A03;
        String str2 = r9.A04;
        if (r11 == null || r11.A00 != 5) {
            C191549mm r1 = r9.A00;
            if (r1 != null) {
                C192289o7 r3 = r1.A00.A03;
                if (r3 == null) {
                    C18070vi.A11("fcsLoadingEventManager");
                    throw null;
                } else {
                    r3.A01((C19980A1q) null, "onLoadingFailure", r1.A04, (Map) null);
                }
            }
        } else {
            ADL adl = r9.A02;
            if (adl != null) {
                C195329tA r0 = r9.A01;
                C20000A2o a2o = r0.A00;
                String str3 = adl.A02;
                C18070vi.A0d(str, 0);
                C178139By r6 = new C178139By((C197789xG) r0.A02.get(), str, str2);
                long j = adl.A00;
                boolean z = adl.A03;
                long currentTimeMillis = System.currentTimeMillis();
                ? obj = new Object();
                obj.A02 = r11;
                obj.A01 = j;
                obj.A00 = currentTimeMillis;
                obj.A03 = z;
                a2o.A03(r6, obj, str3);
            }
            C191549mm r02 = r9.A00;
            if (r02 != null) {
                r02.A00();
            }
        }
    }

    public void C3d(CQF cqf) {
        throw AnonymousClass8BY.A0b();
    }
}
