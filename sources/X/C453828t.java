package X;

import android.view.View;
import java.util.AbstractCollection;

/* renamed from: X.28t  reason: invalid class name and case insensitive filesystem */
public class C453828t extends C65142vu {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C453828t(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void C9G(AnonymousClass1LG r4) {
        if (3 - this.A00 == 0) {
            ((C29201bm) this.A02).BxX(35, 9);
            r4.A0O(this);
        }
    }

    public void C9H(AnonymousClass1LG r4) {
        switch (this.A00) {
            case 0:
                C25446Cfx.A02.A04((View) this.A02, 1.0f);
                break;
            case 1:
                ((AbstractCollection) ((AnonymousClass00O) this.A02).get(((C64682vA) this.A01).A00)).remove(r4);
                break;
            case 2:
                ((AnonymousClass1LG) this.A02).A0A();
                break;
            default:
                ((C29201bm) this.A02).BxX(35, 9);
                break;
        }
        r4.A0O(this);
    }
}
