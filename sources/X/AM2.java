package X;

import android.content.Intent;

public class AM2 implements C107045Ye {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AM2(AnonymousClass1FY r1, AnonymousClass86X r2, AOX aox, Object obj, int i) {
        this.A00 = i;
        this.A01 = aox;
        this.A03 = obj;
        this.A02 = r2;
        this.A04 = r1;
    }

    public boolean Bky(Intent intent, int i, int i2) {
        AnonymousClass1KB r4;
        Object obj;
        Object obj2;
        int i3;
        int i4 = this.A00;
        AOX aox = (AOX) this.A01;
        if (i4 != 0) {
            if (i != 1002) {
                return false;
            }
            r4 = aox.A00;
            obj = this.A03;
            obj2 = this.A02;
            i3 = 46;
        } else if (i != 1001) {
            return false;
        } else {
            r4 = aox.A00;
            obj = this.A03;
            obj2 = this.A02;
            i3 = 42;
        }
        r4.CGP(new C70653Bz(obj, obj2, i3));
        ((AnonymousClass1FY) this.A04).A4Q(this);
        return true;
    }
}
