package X;

/* renamed from: X.ASp  reason: case insensitive filesystem */
public class C20631ASp implements B83, B85, C436820m {
    public final C19969A1e A00;
    public final C18030ve A01;

    public void BDb(C19998A2m a2m, AnonymousClass206 r5) {
        C17960vV.A0G(r5 instanceof C440922c, AnonymousClass001.A1E(r5, "FMessagePushToVideoProtobuf: message type is not supported ", AnonymousClass000.A10()));
        AnonymousClass8X8 r2 = a2m.A00;
        C163928Ww A03 = AnonymousClass8X8.A03(r2);
        this.A00.A02(a2m, A03, (AnonymousClass21W) r5);
        C166418cr A0M = AnonymousClass8BS.A0M(r2);
        C166248ca r1 = (C166248ca) A03.A0C();
        int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
        r1.getClass();
        A0M.ptvMessage_ = r1;
        A0M.bitField1_ |= 2097152;
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r2 = a6d.A08;
        if ((r2.bitField1_ & 2097152) == 0) {
            return null;
        }
        C166248ca r5 = r2.ptvMessage_;
        if (r5 == null) {
            r5 = C166248ca.DEFAULT_INSTANCE;
        }
        AnonymousClass21X r1 = new AnonymousClass21X(a6d.A0A, 81, a6d.A03);
        C20077A6d.A02(a6d, r5, r1, this.A00);
        return r1;
    }

    public C20631ASp(C18030ve r1, C19969A1e a1e) {
        this.A01 = r1;
        this.A00 = a1e;
    }
}
