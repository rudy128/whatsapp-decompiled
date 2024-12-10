package X;

/* renamed from: X.3IQ  reason: invalid class name */
public final class AnonymousClass3IQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C28791au $session;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IQ(C28791au r2) {
        super(1);
        this.$session = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass206 r6 = (AnonymousClass206) obj;
        C18070vi.A0d(r6, 0);
        return Integer.valueOf(((C28801av) this.$session).A02.A04("message", "_id=?", "deleteMessageInBackground/DELETE_MESSAGE", AnonymousClass206.A09(r6)));
    }
}
