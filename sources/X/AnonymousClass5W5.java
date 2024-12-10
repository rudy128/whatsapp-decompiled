package X;

import java.text.Collator;

/* renamed from: X.5W5  reason: invalid class name */
public final class AnonymousClass5W5 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ Collator $collator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5W5(Collator collator) {
        super(2);
        this.$collator = collator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(this.$collator.compare(((AEL) obj).A02, ((AEL) obj2).A02));
    }
}
