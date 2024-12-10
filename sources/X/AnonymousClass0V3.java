package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.0V3  reason: invalid class name */
public final class AnonymousClass0V3 implements C16160ro {
    public final int A00;
    public final LazyListState A01;

    public int BTr() {
        C17330uU r1 = this.A01.A0L;
        return Math.min(((AnonymousClass0XG) ((C15700r3) r1.getValue())).A04 - 1, ((AnonymousClass0V0) ((C15690r2) C29431cG.A0d(((AnonymousClass0XG) ((C15700r3) r1.getValue())).A08))).A04 + this.A00);
    }

    public AnonymousClass0V3(LazyListState lazyListState, int i) {
        this.A01 = lazyListState;
        this.A00 = i;
    }
}
