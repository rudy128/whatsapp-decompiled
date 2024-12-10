package X;

/* renamed from: X.2R1  reason: invalid class name */
public enum AnonymousClass2R1 {
    A0M(r20, "REGISTRATION_FULL", 0, 0),
    A0D(r7, "INTERACTIVE_FULL", 1, 1),
    A0B(r7, "INTERACTIVE_DELTA", 2, 2),
    A03(r7, "BACKGROUND_FULL", 3, 3),
    A02(r20, "BACKGROUND_DELTA", 4, 4),
    A0J(r29, "NOTIFICATION_CONTACT", 5, 5),
    A0F(r29, "INTERACTIVE_QUERY", 6, 6),
    A0L(r33, "NOTIFICATION_SIDELIST", 7, 7),
    A0C(r33, "INTERACTIVE_DELTA_SIDELIST", 8, 8),
    A01(r29, "ADD_QUERY", 9, 9),
    A06(r44, "BACKGROUND_QUERY_PICTURES", 10, 16),
    A07(r44, "BACKGROUND_QUERY_PICTURES_PREVIEW", 11, 17),
    A05(r44, "BACKGROUND_MULTI_PROTOCOL_QUERY", 12, 21),
    A04(r44, "BACKGROUND_FULL_MULTI_PROTOCOL_QUERY", 13, 22),
    A0N(r44, "REGISTRATION_FULL_MULTI_PROTOCOL_QUERY", 14, 23),
    A0E(r48, "INTERACTIVE_MULTI_PROTOCOL_QUERY", 15, 24),
    A0I(r48, "MESSAGE_MULTI_PROTOCOL_QUERY", 16, 25),
    A0O(r50, "VOIP_MULTI_PROTOCOL_QUERY", 17, 26),
    A0K(r50, "NOTIFICATION_MULTI_PROTOCOL_QUERY", 18, 27),
    A0H(r50, "LID_MIGRATION_NOTIFICATION_MULTI_PROTOCOL_QUERY", 19, 28),
    A0G(r44, "LID_MIGRATION_MESSAGE_MULTI_PROTOCOL_QUERY", 20, 29),
    A08(r29, "CONTACT_DONWLOAD", 21, 30),
    A09(r20, "CONTACT_FORCE_UPLOAD", 22, 31),
    A0A(r29, "CONTACT_UPLOAD", 23, 32);
    
    public final int code;
    public final C49562Qy context;
    public final C49542Qw mode;
    public final C49362Qe scope;

    public boolean A00() {
        return AnonymousClass000.A1Z(this.mode, C49542Qw.DELTA);
    }

    /* access modifiers changed from: public */
    AnonymousClass2R1(C49362Qe r3, String str, int i, int i2) {
        this.context = r1;
        this.mode = r2;
        this.scope = r3;
        this.code = i2;
    }
}
