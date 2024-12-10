package X;

import android.app.Application;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cul  reason: case insensitive filesystem */
public abstract class C26209Cul {
    public static void A02(Context context, CQF cqf, C199029zJ r6, CXY cxy, Map map) {
        C26962DNk dNk = new C26962DNk(new C26235CvV(cqf.A00, new DFL(-1), (String) null), CFu.A00, C25416CfO.A00);
        if (context instanceof Application) {
            C25913CoX.A01("BloksInterpreterHelper", "Creating BloksContext with Application Context. This may break the ability to execute navigation actions correctly");
        }
        DOZ A00 = C26272CwJ.A00(context, BE6.A0Q(), dNk, cxy, cqf.A02);
        dNk.A05(A00, new DNL(), Collections.emptyMap());
        C25974Cph.A00(A00(cqf, A00, map), r6, cqf.A01);
    }

    @Deprecated
    public static void A05(C199029zJ r3, E8A e8a, CXY cxy) {
        C25974Cph.A00(C23736Boh.A01(C26272CwJ.A00(C25995CqB.A00().A00, BE6.A0Q(), (C26962DNk) null, cxy, (String) null), e8a, (List) null), r3, e8a);
    }

    public static C23736Boh A00(CQF cqf, DOZ doz, Map map) {
        C25609Cip cip = cqf.A00;
        C26272CwJ.A01(doz).A08(new C26235CvV(cip, new DFL(-1), (String) null), C26235CvV.A03(cip.A02, map));
        return C23736Boh.A01(doz, cqf.A01, (List) null);
    }

    public static Object A01(DOZ doz, DFL dfl, C199029zJ r2, E8A e8a) {
        return C25681CkC.A03(doz, dfl, r2, e8a);
    }

    public static void A03(DOZ doz, DFL dfl, C20046A4p a4p, E8A e8a) {
        A01(doz, dfl, a4p.A02(), e8a);
    }

    public static void A04(DOZ doz, DFL dfl, C20046A4p a4p, E8A e8a, int i) {
        a4p.A03(doz, i);
        A01(doz, dfl, a4p.A02(), e8a);
    }
}
