package X;

/* renamed from: X.3ID  reason: invalid class name */
public final class AnonymousClass3ID extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ long $childMessage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ID(long j) {
        super(1);
        this.$childMessage = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass206 r6 = (AnonymousClass206) obj;
        C18070vi.A0d(r6, 0);
        return Boolean.valueOf(AnonymousClass000.A1P((r6.A0x > this.$childMessage ? 1 : (r6.A0x == this.$childMessage ? 0 : -1))));
    }
}
