package X;

/* renamed from: X.2AI  reason: invalid class name */
public final class AnonymousClass2AI extends AnonymousClass1F7 {
    public AnonymousClass2AI(int i) {
        super(4);
    }

    public AnonymousClass1IX build() {
        this.forceCopy = true;
        return AnonymousClass1IX.asImmutableList(this.contents, this.size);
    }

    public AnonymousClass2AI addAll(Iterable iterable) {
        super.addAll(iterable);
        return this;
    }

    public AnonymousClass2AI() {
        this(4);
    }

    public AnonymousClass2AI add(Object obj) {
        super.add(obj);
        return this;
    }
}
