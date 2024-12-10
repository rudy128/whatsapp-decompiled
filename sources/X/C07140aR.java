package X;

/* renamed from: X.0aR  reason: invalid class name and case insensitive filesystem */
public class C07140aR implements AnonymousClass1G2 {
    public final int A00;
    public final Object A01;

    public C07140aR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object A00(float f) {
        ((AnonymousClass0WE) this.A01).A00(f);
        return C27621Wu.A00;
    }

    public final Object A01(C15670r0 r3) {
        C06820Zu r1;
        Object obj;
        if (!(r3 instanceof C05430Ue)) {
            if (r3 instanceof C05470Ui) {
                r1 = (C06820Zu) this.A01;
                obj = ((C05470Ui) r3).A00;
            } else if (!(r3 instanceof C05420Ud)) {
                if (r3 instanceof C05460Uh) {
                    r1 = (C06820Zu) this.A01;
                    obj = ((C05460Uh) r3).A00;
                } else if (!(r3 instanceof AnonymousClass0Uk)) {
                    if (r3 instanceof C05490Ul) {
                        r1 = (C06820Zu) this.A01;
                        obj = ((C05490Ul) r3).A00;
                    } else {
                        if (r3 instanceof C05480Uj) {
                            r1 = (C06820Zu) this.A01;
                            obj = ((C05480Uj) r3).A00;
                        }
                        return C27621Wu.A00;
                    }
                }
            }
            r1.remove(obj);
            return C27621Wu.A00;
        }
        ((C06820Zu) this.A01).add(r3);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object BJt(Object obj, C30391dr r3) {
        if (this.A00 != 0) {
            return A00(AnonymousClass000.A04(obj));
        }
        return A01((C15670r0) obj);
    }
}
