package X;

import java.util.Arrays;

/* renamed from: X.0nC  reason: invalid class name and case insensitive filesystem */
public final class C13310nC extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ C03230Hd[] $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13310nC(AnonymousClass1OS r2, C03230Hd[] r3, int i) {
        super(2);
        this.$values = r3;
        this.$content = r2;
        this.$$changed = i;
    }

    public final void A00(C17130tn r4) {
        C03230Hd[] r1 = this.$values;
        AnonymousClass0PZ.A04(r4, this.$content, (C03230Hd[]) Arrays.copyOf(r1, r1.length), AnonymousClass0L8.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
