package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class CXM {
    public final /* synthetic */ CX0 A00;
    public final /* synthetic */ CO6 A01;
    public final /* synthetic */ C25206Caz A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Executor A05;
    public final /* synthetic */ C22821Di A06;
    public final /* synthetic */ boolean A07;

    public CXM(CX0 cx0, CO6 co6, C25206Caz caz, String str, String str2, Executor executor, C22821Di r7, boolean z) {
        this.A01 = co6;
        this.A00 = cx0;
        this.A04 = str;
        this.A02 = caz;
        this.A07 = z;
        this.A06 = r7;
        this.A03 = str2;
        this.A05 = executor;
    }

    public void A00(CO7 co7, Throwable th) {
        CX0 cx0 = this.A00;
        Map map = cx0.A02;
        String str = this.A04;
        Object obj = map.get(str);
        if (obj != null) {
            Set set = (Set) obj;
            map.remove(str);
            C25206Caz caz = this.A02;
            C24285Byi byi = caz.A01;
            C24285Byi byi2 = C24285Byi.FETCH;
            if (byi == byi2 || !set.contains(byi2)) {
                this.A06.invoke(new C23726BoX(co7, str, th));
                return;
            }
            String str2 = this.A03;
            cx0.A00(new C25206Caz(byi2, caz.A02, caz.A03, caz.A00), str, str2, this.A05, this.A06, this.A07);
            return;
        }
        throw AnonymousClass000.A0n("Invalid state: Active queries have been cleaned up, but requests still in flight");
    }
}
