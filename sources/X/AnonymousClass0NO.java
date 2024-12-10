package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;

/* renamed from: X.0NO  reason: invalid class name */
public final class AnonymousClass0NO {
    public AnonymousClass0VQ A00;
    public final SubcomposeSlotReusePolicy A01;
    public final AnonymousClass1OS A02;
    public final AnonymousClass1OS A03;
    public final AnonymousClass1OS A04;

    public final AnonymousClass0t7 A00(Object obj, AnonymousClass1OS r3) {
        AnonymousClass0VQ r0 = this.A00;
        if (r0 != null) {
            return r0.A0C(obj, r3);
        }
        throw AnonymousClass000.A0k("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public AnonymousClass0NO(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.A01 = subcomposeSlotReusePolicy;
        this.A04 = new C12720mD(this);
        this.A02 = new C12710mC(this);
        this.A03 = new C13050mk(this);
    }

    public final AnonymousClass1OS A01() {
        return this.A02;
    }

    public final AnonymousClass1OS A02() {
        return this.A03;
    }

    public final AnonymousClass1OS A03() {
        return this.A04;
    }

    public AnonymousClass0NO() {
        this(AnonymousClass0XS.A00);
    }
}
