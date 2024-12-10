package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.670  reason: invalid class name */
public abstract class AnonymousClass670 extends AnonymousClass163 {
    public /* bridge */ /* synthetic */ Object A01(Object obj, Map map) {
        C18070vi.A0d(map, 0);
        if (!(!map.isEmpty())) {
            return new Object();
        }
        int size = map.size();
        Collection<C1404571m> values = map.values();
        if (size <= 1) {
            return new AnonymousClass6D2(A03((C1404571m) C29431cG.A0X(values)));
        }
        ArrayList A0D = C29351c6.A0D(values);
        for (C1404571m A03 : values) {
            A0D.add(A03(A03));
        }
        return new AnonymousClass6D3(A0D);
    }

    public Object A03(C1404571m r6) {
        if (this instanceof AnonymousClass6D7) {
            AnonymousClass6D7 r2 = (AnonymousClass6D7) this;
            C18070vi.A0d(r6, 0);
            int i = r6.A01;
            if (i == -20) {
                return new AnonymousClass6DY(AnonymousClass000.A0n(r6.A03));
            }
            switch (i) {
                case 3847001:
                    return C120336Dh.A00;
                case 3847002:
                    return C120296Dd.A00;
                case 3847003:
                    return C120316Df.A00;
                default:
                    switch (i) {
                        case 3847006:
                            return C120286Dc.A00;
                        case 3847007:
                            return C120306De.A00;
                        case 3847008:
                            String str = r6.A05;
                            if (str == null) {
                                str = "unknown";
                            }
                            return new AnonymousClass6DZ(str);
                        case 3847009:
                            boolean A1I = C108975cc.A1I(r2.A01);
                            boolean z = false;
                            if (r2.A00.A00.A06((AnonymousClass89P) null, "meta-avatar", false, false) != null) {
                                z = true;
                            }
                            return new C120276Db(A1I, z);
                        case 3847010:
                            return C120326Dg.A00;
                        default:
                            return new C120266Da(i);
                    }
            }
        } else {
            boolean z2 = this instanceof AnonymousClass6D6;
            C18070vi.A0d(r6, 0);
            int i2 = r6.A01;
            if (z2) {
                switch (i2) {
                    case 3847001:
                        return AnonymousClass6DR.A00;
                    case 3847002:
                        return AnonymousClass6DQ.A00;
                    default:
                        return new AnonymousClass6DN(i2);
                }
            } else {
                switch (i2) {
                    case 3847001:
                        return AnonymousClass6DH.A00;
                    case 3847002:
                        return AnonymousClass6DF.A00;
                    case 3847004:
                        return AnonymousClass6DE.A00;
                    case 3847005:
                        return AnonymousClass6DD.A00;
                    default:
                        return new AnonymousClass6DC(i2);
                }
            }
        }
    }
}
