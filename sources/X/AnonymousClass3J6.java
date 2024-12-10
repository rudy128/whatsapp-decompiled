package X;

/* renamed from: X.3J6  reason: invalid class name */
public final class AnonymousClass3J6 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C18560wh[] $elements;
    public final /* synthetic */ C98474rD $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3J6(C98474rD r2, C18560wh[] r3) {
        super(2);
        this.$elements = r3;
        this.$index = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C18070vi.A0d(obj2, 1);
        C18560wh[] r3 = this.$elements;
        C98474rD r2 = this.$index;
        int i = r2.element;
        r2.element = i + 1;
        r3[i] = obj2;
        return C27621Wu.A00;
    }
}
