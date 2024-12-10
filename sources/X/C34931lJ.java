package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1lJ  reason: invalid class name and case insensitive filesystem */
public class C34931lJ {
    public final AnonymousClass11S A00;
    public final C25001Mm A01;
    public final AnonymousClass1TL A02;
    public final C26371Rw A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass1P3 A05;
    public final AnonymousClass1RK A06;
    public final C26391Ry A07;
    public final AnonymousClass1PP A08;
    public final C18030ve A09;

    public void A00(DeviceJid deviceJid, Set set) {
        StringBuilder sb = new StringBuilder();
        sb.append("NonMessageDataRequestSendMethod/sendDataRequestMessage type=");
        sb.append(0);
        sb.append("; size=");
        sb.append(set.size());
        Log.i(sb.toString());
        if (!set.isEmpty()) {
            if (!C18020vd.A05(C18040vf.A02, this.A09, 2155)) {
                Log.w("NonMessageDataRequestSendMethod/sendDataRequestMessage gate is not enabled");
                return;
            }
            AnonymousClass11S r0 = this.A00;
            r0.A0I();
            PhoneUserJid phoneUserJid = r0.A0E;
            AnonymousClass1PP r3 = this.A08;
            AnonymousClass232 r6 = new AnonymousClass232(r3.A01(phoneUserJid, true), AnonymousClass11P.A01(this.A04));
            r6.A00 = deviceJid;
            r6.A00 = 0;
            r6.A01 = set;
            if (this.A07.A01(r6) < 0) {
                Log.e("NonMessageDataRequestSendMethod/sendDataRequestMessage unable to add peer message");
                return;
            }
            this.A01.A01(new SendPeerMessageJob(deviceJid, r6));
            this.A02.A01(0, set.size(), r6.A0v.A01);
        }
    }

    public C34931lJ(AnonymousClass11S r1, C25001Mm r2, AnonymousClass1TL r3, C26371Rw r4, AnonymousClass11P r5, AnonymousClass1P3 r6, AnonymousClass1RK r7, C26391Ry r8, C18030ve r9, AnonymousClass1PP r10) {
        this.A04 = r5;
        this.A09 = r9;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A08 = r10;
        this.A06 = r7;
        this.A02 = r3;
    }
}
