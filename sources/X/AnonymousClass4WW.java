package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4WW  reason: invalid class name */
public final class AnonymousClass4WW {
    public final /* synthetic */ AnonymousClass440 A00;

    public AnonymousClass4WW(AnonymousClass440 r1) {
        this.A00 = r1;
    }

    public static final void A00(AnonymousClass4WW r5, List list) {
        AnonymousClass440 r1 = r5.A00;
        r1.A03.A0E(list);
        AnonymousClass1DT r52 = r1.A02;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (AnonymousClass000.A1Z(((C135386s7) next).A02.A02, C179509Ig.GUEST)) {
                A13.add(next);
            }
        }
        r52.A0E(A13);
    }
}
