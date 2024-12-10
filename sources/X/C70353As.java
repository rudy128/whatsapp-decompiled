package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;

/* renamed from: X.3As  reason: invalid class name and case insensitive filesystem */
public final class C70353As implements AnonymousClass89X {
    public final /* synthetic */ C57632jO A00;

    public C70353As(C57632jO r1) {
        this.A00 = r1;
    }

    public void Bsw(Exception exc) {
        this.A00.A00(exc);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.234, X.241, X.231, X.206] */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C1418477e r10 = (C1418477e) obj;
        C57632jO r0 = this.A00;
        C35121lg r7 = r0.A01;
        DeviceJid deviceJid = r0.A00;
        String str2 = r0.A02;
        ? r5 = new AnonymousClass206(C17880vN.A0Z(AnonymousClass11S.A00(r7.A01), r7.A07), 101, AnonymousClass11P.A01(r7.A05));
        r5.A00 = str2;
        AnonymousClass732 A02 = r7.A04.A02();
        if (A02 == null) {
            str = "WafflePrimaryDeviceManager/sendNonce: waffleUser is null";
        } else if (r10 == null) {
            str = "WafflePrimaryDeviceManager/sendNonce: nonce is null";
        } else {
            r5.A00 = r10;
            r5.A01 = A02.A04;
            r5.A00 = deviceJid;
            if (r7.A06.A01(r5) < 0) {
                str = "WafflePrimaryDeviceManager/sendNonce unable to add a peer message";
            } else {
                C18070vi.A0d(AnonymousClass001.A1E(deviceJid, "WafflePrimaryDeviceManager/sendNonce Sending peer message with nonce to companion: ", AnonymousClass000.A10()), 0);
                r7.A02.A01(new SendPeerMessageJob(deviceJid, r5));
                return;
            }
        }
        C31081ez.A01(str);
    }
}
