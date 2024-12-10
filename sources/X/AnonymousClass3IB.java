package X;

/* renamed from: X.3IB  reason: invalid class name */
public final class AnonymousClass3IB extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ long $childMessage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IB(long j) {
        super(1);
        this.$childMessage = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(AnonymousClass000.A1P((((AnonymousClass206) obj).A0x > this.$childMessage ? 1 : (((AnonymousClass206) obj).A0x == this.$childMessage ? 0 : -1))));
    }
}
