package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.342  reason: invalid class name */
public final /* synthetic */ class AnonymousClass342 implements BC8 {
    public final /* synthetic */ SendPeerMessageJob A00;
    public final /* synthetic */ C166418cr A01;

    public final C194059r6 BDW(DeviceJid deviceJid, int i, boolean z) {
        SendPeerMessageJob sendPeerMessageJob = this.A00;
        C166418cr r0 = this.A01;
        C17960vV.A07(deviceJid);
        byte[] A0M = r0.A0M();
        try {
            if (sendPeerMessageJob.A01.A0Y()) {
                return C198079xk.A00(sendPeerMessageJob.A01.A0B(C63962tz.A02(deviceJid), A0M));
            }
            C25581Ot r2 = sendPeerMessageJob.A02;
            return (C194059r6) r2.A00.submit(new AnonymousClass3DD(deviceJid, sendPeerMessageJob, A0M, 4)).get();
        } catch (Exception unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SendPeerMessageJob/getEncryptedMessage/fail to get the preKey, jid=");
            C17890vO.A19(A10, deviceJid.getRawString());
            return null;
        }
    }

    public /* synthetic */ Map BV7(Collection collection) {
        AnonymousClass1CQ r1 = AnonymousClass1CQ.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r1;
    }

    public /* synthetic */ AnonymousClass342(SendPeerMessageJob sendPeerMessageJob, C166418cr r2) {
        this.A00 = sendPeerMessageJob;
        this.A01 = r2;
    }

    public /* synthetic */ C194609s0 BWN(boolean z, boolean z2, boolean z3) {
        return new C194609s0((List) null, C17880vN.A13(), (Map) null);
    }
}
