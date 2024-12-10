package X;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0W2  reason: invalid class name */
public final class AnonymousClass0W2 implements AnonymousClass0tC, C16670so {
    public final C17330uU A00 = AnonymousClass0Q9.A02((Object) null);
    public final AnonymousClass0tC A01;
    public final Set A02 = new LinkedHashSet();

    public boolean BE7(Object obj) {
        return this.A01.BE7(obj);
    }

    public Object BFi(String str) {
        return this.A01.BFi(str);
    }

    public C16310s3 CE3(String str, C18090vk r3) {
        return this.A01.CE3(str, r3);
    }

    public AnonymousClass0W2(AnonymousClass0tC r2, Map map) {
        this.A01 = C04100Lv.A00(map, new AnonymousClass0h0(r2));
    }

    public Map CBf() {
        C16670so r2 = (C16670so) this.A00.getValue();
        if (r2 != null) {
            for (Object CF2 : this.A02) {
                r2.CF2(CF2);
            }
        }
        return this.A01.CBf();
    }

    public void CF2(Object obj) {
        C16670so r0 = (C16670so) this.A00.getValue();
        if (r0 != null) {
            r0.CF2(obj);
            return;
        }
        throw AnonymousClass000.A0k("null wrappedHolder");
    }

    public void BAG(C17130tn r3, Object obj, AnonymousClass1OS r5, int i) {
        r3.COC(-697180401);
        C16670so r1 = (C16670so) this.A00.getValue();
        if (r1 != null) {
            r1.BAG(r3, obj, r5, (i & 112) | 520);
            AnonymousClass0QC.A03(r3, obj, new C10260i3(this, obj));
            C05660Vf BKF = r3.BKF();
            if (BKF != null) {
                BKF.A03(new C13350nG(this, obj, r5, i));
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k("null wrappedHolder");
    }
}
