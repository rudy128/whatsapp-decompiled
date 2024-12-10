package X;

public final class ASV implements B83, B85, C436820m {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.23L, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C18070vi.A0d(a6d, 0);
        if (C181609Rd.A00(a6d) != C179839Kc.INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC) {
            return null;
        }
        ? r1 = new AnonymousClass206(a6d.A0A, 47, a6d.A03);
        C164008Xe r0 = C20077A6d.A00(a6d).initialSecurityNotificationSettingSync_;
        if (r0 == null) {
            r0 = C164008Xe.DEFAULT_INSTANCE;
        }
        r1.A00 = r0.securityNotificationEnabled_;
        return r1;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        C18070vi.A0h(r8, a2m);
        if (r8 instanceof AnonymousClass23L) {
            AnonymousClass8X8 r5 = a2m.A00;
            C163898Wt A01 = AnonymousClass8X8.A01(r5);
            boolean z = ((AnonymousClass23L) r8).A00;
            C164008Xe r0 = ((C166368cm) A01.A00).initialSecurityNotificationSettingSync_;
            if (r0 == null) {
                r0 = C164008Xe.DEFAULT_INSTANCE;
            }
            C23624Bmt A07 = AnonymousClass8BS.A07(r0);
            C164008Xe r1 = (C164008Xe) A07.A00;
            int i = C164008Xe.SECURITY_NOTIFICATION_ENABLED_FIELD_NUMBER;
            r1.bitField0_ |= 1;
            r1.securityNotificationEnabled_ = z;
            A01.A0G(C179839Kc.INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC);
            C166368cm A0H = AnonymousClass8BS.A0H(A01);
            C164008Xe r02 = (C164008Xe) A07.A0C();
            r02.getClass();
            A0H.initialSecurityNotificationSettingSync_ = r02;
            A0H.bitField0_ |= 128;
            r5.A0N(A01);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Message type is not supported ");
        A10.append(r8.getClass());
        throw AnonymousClass000.A0j(A10);
    }
}
