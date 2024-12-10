package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.22M  reason: invalid class name */
public final class AnonymousClass22M extends AnonymousClass206 {
    public final AnonymousClass25F A00;

    public void A0a(int i) {
        super.A0a(6);
    }

    public AnonymousClass22M(AnonymousClass205 r3, C178119Bw r4) {
        this(r3, r4.A01);
        UserJid userJid;
        this.A00.A02(r4);
        C89444cT r1 = r4.A04;
        if (r1.A03) {
            DeviceJid deviceJid = r4.A02;
            if (deviceJid != null) {
                userJid = deviceJid.userJid;
            } else {
                return;
            }
        } else {
            userJid = r1.A01;
        }
        A0d(userJid);
    }

    public AnonymousClass22M(AnonymousClass205 r2, long j) {
        super(r2, 90, j);
        this.A00 = A0N(C178119Bw.class);
        A0a(6);
    }
}
