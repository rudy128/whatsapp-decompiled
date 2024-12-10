package X;

import android.content.Context;

public final class AIt implements C16890tO {
    public final /* synthetic */ DOZ A00;
    public final /* synthetic */ DFL A01;
    public final /* synthetic */ E8A A02;
    public final /* synthetic */ E8A A03;

    public /* synthetic */ String BQX() {
        return C02730Fd.A00(this);
    }

    public AIt(DOZ doz, DFL dfl, E8A e8a, E8A e8a2) {
        this.A00 = doz;
        this.A02 = e8a;
        this.A01 = dfl;
        this.A03 = e8a2;
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        DOZ doz = this.A00;
        C22566BDb bDb = (C22566BDb) doz.A01.get(2131428192);
        if (bDb == null) {
            return null;
        }
        bDb.CJb(new C186379e6(doz, this.A01, this.A02, this.A03));
        return null;
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C22566BDb bDb = (C22566BDb) this.A00.A01.get(2131428192);
        if (bDb != null) {
            bDb.CJb((C186379e6) null);
        }
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
