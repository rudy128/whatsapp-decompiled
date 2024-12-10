package X;

import androidx.compose.foundation.lazy.LazyListState;

public final class Dt4 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C36711oL $scrollPerfLoggerManager;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ int $surface;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dt4(LazyListState lazyListState, C36711oL r3, int i, int i2) {
        super(2);
        this.$state = lazyListState;
        this.$surface = i;
        this.$scrollPerfLoggerManager = r3;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn A0b = AnonymousClass000.A0b(obj, obj2);
        C25350Ce9.A00(this.$state, A0b, this.$scrollPerfLoggerManager, this.$surface, AnonymousClass0L8.A00(this.$$changed));
        return C27621Wu.A00;
    }
}
