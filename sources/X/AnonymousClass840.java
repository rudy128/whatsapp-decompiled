package X;

import java.text.Collator;

/* renamed from: X.840  reason: invalid class name */
public final class AnonymousClass840 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ Collator $collator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass840(Collator collator) {
        super(2);
        this.$collator = collator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C133676pJ r4 = (C133676pJ) obj;
        C133676pJ r5 = (C133676pJ) obj2;
        C18070vi.A0h(r4, r5);
        return Integer.valueOf(this.$collator.compare(r4.A03, r5.A03));
    }
}
