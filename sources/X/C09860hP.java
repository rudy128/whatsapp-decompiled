package X;

import java.util.Collection;

/* renamed from: X.0hP  reason: invalid class name and case insensitive filesystem */
public final class C09860hP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Collection $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09860hP(Collection collection) {
        super(1);
        this.$elements = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(this.$elements.contains(obj));
    }
}
