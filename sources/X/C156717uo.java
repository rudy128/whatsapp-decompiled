package X;

/* renamed from: X.7uo  reason: invalid class name and case insensitive filesystem */
public final class C156717uo extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C144937Jg $observer;
    public final /* synthetic */ C24561Ku $this_trimMemoryEvent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156717uo(C24561Ku r2, C144937Jg r3) {
        super(0);
        this.$this_trimMemoryEvent = r2;
        this.$observer = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$this_trimMemoryEvent.unregisterObserver(this.$observer);
        return C27621Wu.A00;
    }
}
