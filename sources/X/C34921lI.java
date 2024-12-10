package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import java.util.Set;

/* renamed from: X.1lI  reason: invalid class name and case insensitive filesystem */
public final class C34921lI {
    public final AnonymousClass11S A00;
    public final C34911lH A01;
    public final C34901lG A02;
    public final C26311Rq A03;
    public final C34871lD A04;

    public C34921lI(AnonymousClass11S r2, C34911lH r3, C34901lG r4, C34871lD r5, C26311Rq r6) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r5, 5);
        this.A00 = r2;
        this.A03 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r5;
    }

    private final void A00() {
        C34911lH r4 = this.A01;
        C35021lW r3 = C35021lW.A09;
        C18070vi.A0d(r3, 0);
        C34911lH.A00(r4);
        AnonymousClass00H r2 = r4.A00;
        C33631j8 r0 = (C33631j8) r2.get();
        r0.A06();
        Set set = r0.A00;
        if (set != null && set.contains("waffle_companion")) {
            C34911lH.A00(r4);
            ((C33631j8) r2.get()).A07(r3);
        }
    }

    public final void A01() {
        Object value = this.A04.A02.getValue();
        C18070vi.A0X(value);
        ((SharedPreferences) value).edit().putBoolean("is_wfal_paused", true).apply();
        A00();
    }

    public final void A03() {
        String str;
        DeviceJid primaryDevice;
        AnonymousClass11S r0 = this.A00;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        if (phoneUserJid == null || (primaryDevice = phoneUserJid.getPrimaryDevice()) == null) {
            str = "WaffleCompanionDeviceManager/requestAuthorizationNonce primaryDeviceJid or thisDeviceJid is null";
        } else {
            C34901lG r8 = this.A02;
            AnonymousClass1PP r4 = r8.A04;
            long A012 = AnonymousClass11P.A01(r8.A02);
            C25511Om r3 = C25511Om.A00;
            AnonymousClass232 r5 = new AnonymousClass232(r4.A01(phoneUserJid, true), A012);
            r5.A00 = primaryDevice;
            r5.A00 = 5;
            r5.A01 = r3;
            if (r8.A03.A01(r5) < 0) {
                str = "AccessTokenOrchestrator/handleActiveAccountLink unable to add peer message";
            } else {
                r8.A00.A01(new SendPeerMessageJob(primaryDevice, r5));
                r8.A01.A01(5, 0, r5.A0v.A01);
                return;
            }
        }
        C31081ez.A01(str);
    }

    public final void A02() {
        A00();
        Object value = this.A04.A02.getValue();
        C18070vi.A0X(value);
        ((SharedPreferences) value).edit().clear().apply();
    }
}
