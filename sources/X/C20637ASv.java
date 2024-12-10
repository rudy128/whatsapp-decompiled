package X;

/* renamed from: X.ASv  reason: case insensitive filesystem */
public final class C20637ASv implements B83, B85, C436820m {
    public final C18030ve A00;
    public final C32011gU A01;

    public void BDb(C19998A2m a2m, AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        if (!(r4 instanceof AnonymousClass216)) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass206.A07(r4, "FMessageViewOnceTextProtobuf not support message:", A10);
            throw AnonymousClass000.A0j(A10);
        }
    }

    public C20637ASv(C18030ve r1, C32011gU r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.210, X.216, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr A012 = C20077A6d.A01(a6d);
        if ((A012.bitField0_ & 32) == 0) {
            return null;
        }
        C166258cb r2 = A012.extendedTextMessage_;
        C166258cb r5 = r2;
        if (r2 == null) {
            r2 = C166258cb.DEFAULT_INSTANCE;
        }
        if ((r2.bitField0_ & 8388608) == 0 || !r2.viewOnce_) {
            return null;
        }
        if (r5 == null) {
            r5 = C166258cb.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r5);
        ? r22 = new AnonymousClass210(a6d.A0A, 78, a6d.A03);
        r22.A00 = 0;
        ATC.A02(this.A00, this.A01, r5, r22);
        return r22;
    }
}
