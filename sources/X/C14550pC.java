package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;

/* renamed from: X.0pC  reason: invalid class name and case insensitive filesystem */
public final class C14550pC extends AnonymousClass11G implements AnonymousClass1OS {
    public static final C14550pC A00 = new C14550pC();

    public C14550pC() {
        super(2);
    }

    public static final List A00(LazyListState lazyListState) {
        Integer[] numArr = new Integer[2];
        AnonymousClass0OG r1 = lazyListState.A0F;
        AnonymousClass000.A1L(numArr, r1.A03.BT8());
        AnonymousClass000.A1M(numArr, r1.A04.BT8());
        return AnonymousClass1ZU.A08(numArr);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A00((LazyListState) obj2);
    }
}
