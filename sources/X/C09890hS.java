package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.0hS  reason: invalid class name and case insensitive filesystem */
public final class C09890hS extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Collection $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09890hS(Collection collection) {
        super(1);
        this.$elements = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((List) obj).retainAll(this.$elements));
    }
}
