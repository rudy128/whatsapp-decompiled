package X;

import android.app.Activity;
import java.util.HashMap;

public class AGW implements AnonymousClass1GV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AGW(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final void accept(Object obj) {
        if (this.A00 != 0) {
            C20554APo aPo = (C20554APo) this.A01;
            AnonymousClass18K r2 = (AnonymousClass18K) this.A02;
            Activity activity = (Activity) this.A03;
            C192929pG r7 = (C192929pG) obj;
            aPo.A02 = r7;
            if (r7 != null) {
                aPo.A06.A00(activity, r7, r2);
            }
            C20554APo.A00(aPo.A01, aPo.A05, aPo);
            C20554APo.A00(aPo.A00, aPo.A04, aPo);
            return;
        }
        DOZ doz = (DOZ) this.A03;
        C20046A4p a4p = new C20046A4p();
        a4p.A03(C196539vE.A01((HashMap) obj), 0);
        C20046A4p.A01(doz, (DFL) this.A01, a4p, (E8A) this.A02);
    }
}
