package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.0iB  reason: invalid class name and case insensitive filesystem */
public final class C10340iB extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Collection $elements;
    public final /* synthetic */ int $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10340iB(Collection collection, int i) {
        super(1);
        this.$index = i;
        this.$elements = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((List) obj).addAll(this.$index, this.$elements));
    }
}
