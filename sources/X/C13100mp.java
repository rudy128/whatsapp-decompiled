package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0mp  reason: invalid class name and case insensitive filesystem */
public final class C13100mp extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Jo $itemContentFactory;
    public final /* synthetic */ AnonymousClass1OS $measurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13100mp(AnonymousClass0Jo r2, AnonymousClass1OS r3) {
        super(2);
        this.$itemContentFactory = r2;
        this.$measurePolicy = r3;
    }

    public final C16820tH A00(C17520un r4, long j) {
        return (C16820tH) this.$measurePolicy.invoke(new AnonymousClass0XH(this.$itemContentFactory, r4), Constraints.A05(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A00((C17520un) obj, ((Constraints) obj2).A0B());
    }
}
