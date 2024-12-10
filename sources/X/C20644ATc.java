package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.ATc  reason: case insensitive filesystem */
public class C20644ATc implements C22508BAp {
    public final /* synthetic */ C20653ATl A00;

    public C20644ATc(C20653ATl aTl) {
        this.A00 = aTl;
    }

    public void BtA(C190599lD r6, int i) {
        AP6 ap6 = this.A00.A0A;
        if (ap6 != null) {
            Map map = ap6.A0B;
            AnonymousClass9ND r2 = (AnonymousClass9ND) AnonymousClass000.A0w(map, 1);
            AnonymousClass9ND r0 = (AnonymousClass9ND) AnonymousClass000.A0w(map, 2);
            if (r2 != null) {
                r2.A00 = 2;
            }
            if (r0 != null) {
                r0.A00 = 2;
            }
            AP6.A05(ap6, r6, i, 0);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        AP6 ap6 = this.A00.A0A;
        if (ap6 != null) {
            synchronized (AP6.class) {
                Map map = ap6.A0B;
                AnonymousClass9ND r7 = (AnonymousClass9ND) AnonymousClass000.A0w(map, 1);
                AnonymousClass9ND r4 = (AnonymousClass9ND) AnonymousClass000.A0w(map, 2);
                if (list.isEmpty()) {
                    C188309hD r3 = ap6.A06;
                    r3.A02 = 4;
                    r3.A00 = 3;
                    r3.A01 = 0;
                    r3.A07 = new C190599lD((Integer) null, (String) null, 7);
                    if (r7 != null) {
                        r7.A00 = 2;
                    }
                    if (r4 != null) {
                        r4.A00 = 2;
                    }
                    Log.e("HomeWidgetsDelegate/onFetchWidgetsSuccess widgets list cannot be empty");
                    ap6.A0A();
                } else {
                    if (r7 != null) {
                        r7.A00 = 1;
                        r7.A01 = list.get(0);
                        AP6.A04(ap6, 1);
                    }
                    if (r4 != null) {
                        r4.A00 = 1;
                        r4.A01 = list.get(1);
                        AP6.A04(ap6, 2);
                    }
                    AP6.A03(ap6);
                }
            }
        }
    }
}
