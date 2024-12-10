package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.productinfra.biz.wabme2lidmigration.WABME2LidMigrationHelper$maybeTranslateToPhoneUserJidAwait$2;

/* renamed from: X.4S5  reason: invalid class name */
public final class AnonymousClass4S5 {
    public final AnonymousClass190 A00;
    public final AnonymousClass1NG A01;
    public final C24751Ln A02;
    public final C18600wl A03;

    public final UserJid A00(UserJid userJid) {
        PhoneUserJid phoneUserJid;
        C18070vi.A0d(userJid, 0);
        if (this.A01.A04()) {
            if (userJid instanceof AnonymousClass1E1) {
                phoneUserJid = this.A02.A0D((AnonymousClass1E1) userJid);
                if (phoneUserJid == null) {
                    this.A00.A0E("WABME2LidMigrationHelper/reportError", "Converted result is null", new RuntimeException("Converted result is null"));
                }
            } else {
                phoneUserJid = null;
            }
            if (!(userJid instanceof PhoneUserJid)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Do not know how to convert ");
                C17900vP.A0a(userJid, A10);
                String obj = A10.toString();
                this.A00.A0E("WABME2LidMigrationHelper/reportError", obj, new RuntimeException(obj));
            }
            if (phoneUserJid != null) {
                return phoneUserJid;
            }
        }
        return userJid;
    }

    public final Object A01(UserJid userJid, C30391dr r5) {
        return C30451dy.A00(r5, this.A03, new WABME2LidMigrationHelper$maybeTranslateToPhoneUserJidAwait$2(userJid, this, (C30391dr) null));
    }

    public AnonymousClass4S5(AnonymousClass190 r1, C24751Ln r2, AnonymousClass1NG r3, C18600wl r4) {
        C18070vi.A0s(r3, r2, r1, r4);
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = r1;
        this.A03 = r4;
    }
}
