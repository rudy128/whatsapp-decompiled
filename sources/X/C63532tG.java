package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2tG  reason: invalid class name and case insensitive filesystem */
public class C63532tG {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C63532tG.class, "_size$volatile");
    public AnonymousClass3KX[] A00;
    public volatile /* synthetic */ int _size$volatile;

    public static int A00(AnonymousClass3KX[] r0, int i, int i2) {
        AnonymousClass3KX r1 = r0[i];
        C18070vi.A0b(r1);
        AnonymousClass3KX r02 = r0[i2];
        C18070vi.A0b(r02);
        return ((Comparable) r1).compareTo(r02);
    }

    public static final void A01(C63532tG r2, int i, int i2) {
        AnonymousClass3KX[] r22 = r2.A00;
        C18070vi.A0b(r22);
        AnonymousClass3KX r1 = r22[i2];
        C18070vi.A0b(r1);
        AnonymousClass3KX r0 = r22[i];
        C18070vi.A0b(r0);
        r22[i] = r1;
        r22[i2] = r0;
        ((C70903Cy) r1).A00 = i;
        ((C70903Cy) r0).A00 = i2;
    }

    public final AnonymousClass3KX A02(int i) {
        AnonymousClass3KX[] r5 = this.A00;
        C18070vi.A0b(r5);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            A01(this, i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0 && A00(r5, i, i2) < 0) {
                A01(this, i, i2);
                while (i2 > 0) {
                    AnonymousClass3KX[] r2 = this.A00;
                    C18070vi.A0b(r2);
                    int i3 = (i2 - 1) / 2;
                    if (A00(r2, i3, i2) <= 0) {
                        break;
                    }
                    A01(this, i2, i3);
                    i2 = i3;
                }
            } else {
                while (true) {
                    int i4 = (i * 2) + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    AnonymousClass3KX[] r22 = this.A00;
                    C18070vi.A0b(r22);
                    if (i4 + 1 < atomicIntegerFieldUpdater.get(this) && A00(r22, i4 + 1, i4) < 0) {
                        i4++;
                    }
                    if (A00(r22, i, i4) <= 0) {
                        break;
                    }
                    A01(this, i, i4);
                    i = i4;
                }
            }
        }
        AnonymousClass3KX r6 = r5[atomicIntegerFieldUpdater.get(this)];
        C18070vi.A0b(r6);
        C70903Cy r23 = (C70903Cy) r6;
        if (r23._heap != AnonymousClass2WX.A01) {
            r23._heap = null;
            r23.A00 = -1;
            r5[atomicIntegerFieldUpdater.get(this)] = null;
            return r6;
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }
}
