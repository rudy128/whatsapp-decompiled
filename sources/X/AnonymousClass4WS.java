package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.4WS  reason: invalid class name */
public final class AnonymousClass4WS {
    public final List A00 = AnonymousClass000.A13();

    public static C91654g2 A00(AnonymousClass4WS r1, Class cls, C22821Di r3) {
        AnonymousClass20F r0 = new AnonymousClass20F(cls);
        List list = r1.A00;
        list.add(new AnonymousClass4M7(AnonymousClass20W.A00(r0), r3));
        AnonymousClass4M7[] r12 = (AnonymousClass4M7[]) list.toArray(new AnonymousClass4M7[0]);
        return new C91654g2((AnonymousClass4M7[]) Arrays.copyOf(r12, r12.length));
    }
}
