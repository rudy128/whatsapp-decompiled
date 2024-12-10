package X;

public final class AST implements B83, B85, C436820m {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.23F, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C18070vi.A0d(a6d, 0);
        if (C181609Rd.A00(a6d) != C179839Kc.APP_STATE_SYNC_KEY_SHARE) {
            return null;
        }
        ? r1 = new AnonymousClass206(a6d.A0A, 38, a6d.A03);
        r1.A01 = false;
        AnonymousClass2B3 r0 = C20077A6d.A00(a6d).appStateSyncKeyShare_;
        if (r0 == null) {
            r0 = AnonymousClass2B3.DEFAULT_INSTANCE;
        }
        r1.A00 = r0;
        return r1;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r5) {
        C18070vi.A0h(r5, a2m);
        AnonymousClass8BY.A1G(r5, "Unexpected message type ", AnonymousClass000.A10(), r5 instanceof AnonymousClass23F);
        C163898Wt r2 = (C163898Wt) C166368cm.DEFAULT_INSTANCE.A0N();
        r2.A0G(C179839Kc.APP_STATE_SYNC_KEY_SHARE);
        AnonymousClass2B3 r0 = ((AnonymousClass23F) r5).A00;
        C166368cm A0H = AnonymousClass8BS.A0H(r2);
        r0.getClass();
        A0H.appStateSyncKeyShare_ = r0;
        A0H.bitField0_ |= 32;
        a2m.A00.A0O((C166368cm) r2.A0C());
    }
}
