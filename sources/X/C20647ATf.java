package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.ATf  reason: case insensitive filesystem */
public class C20647ATf implements C22508BAp {
    public final List A00;
    public final /* synthetic */ C20653ATl A01;

    public C20647ATf(C20653ATl aTl, List list) {
        this.A01 = aTl;
        this.A00 = list;
    }

    public void BtA(C190599lD r3, int i) {
        BAX bax = this.A01.A07;
        if (bax != null) {
            bax.Bmu(this.A00);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Map map = (Map) obj;
        BAX bax = this.A01.A07;
        if (bax != null) {
            bax.Bmv(map);
        }
    }
}
