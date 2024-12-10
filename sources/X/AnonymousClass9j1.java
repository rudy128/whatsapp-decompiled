package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9j1  reason: invalid class name */
public class AnonymousClass9j1 {
    public final /* synthetic */ A99 A00;

    public AnonymousClass9j1(A99 a99) {
        this.A00 = a99;
    }

    public void A00(DeviceJid deviceJid) {
        C17900vP.A0Y(deviceJid, "VoiceService/notifyNewSessionEstablished ", AnonymousClass000.A10());
        A99 a99 = this.A00;
        AtomicInteger atomicInteger = A99.A4B;
        a99.A0W.sendPendingCallOfferStanza(deviceJid, Voip.getCurrentCallId(), false);
        a99.A0W.sendOfferRetryRequest(deviceJid);
        a99.A0W.sendPendingRekeyRequest(deviceJid);
    }
}
