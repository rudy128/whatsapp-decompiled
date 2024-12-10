package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.0V1  reason: invalid class name */
public final class AnonymousClass0V1 implements C17230uK {
    public final C05630Uz A00;
    public final AnonymousClass0V2 A01;
    public final C17080ti A02;
    public final LazyListState A03;

    public Object BTi(int i) {
        Object BTi = this.A02.BTi(i);
        if (BTi != null) {
            return BTi;
        }
        this.A01.A00.A02(i);
        return new AnonymousClass0RK(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0V1)) {
            return false;
        }
        return C18070vi.A18(this.A01, ((AnonymousClass0V1) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public AnonymousClass0V1(C05630Uz r1, AnonymousClass0V2 r2, LazyListState lazyListState, C17080ti r4) {
        this.A03 = lazyListState;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r4;
    }

    public void BAC(C17130tn r9, Object obj, int i, int i2) {
        r9.COC(-462424778);
        Object obj2 = obj;
        C02340Dq.A00(this.A03.A08(), r9, obj2, AnonymousClass0LC.A00(r9, new C13080mn(this, i), -824725566), i, ((i2 << 3) & 112) | 3592);
        C05660Vf BKF = r9.BKF();
        if (BKF != null) {
            BKF.A03(new C12840mP(this, obj, i, i2));
        }
    }
}
