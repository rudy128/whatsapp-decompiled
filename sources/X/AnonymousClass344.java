package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import java.util.List;

/* renamed from: X.344  reason: invalid class name */
public final /* synthetic */ class AnonymousClass344 implements BCY {
    public final /* synthetic */ SendPeerMessageJob A00;

    public final C29621ca BHK(C194059r6 r7) {
        SendPeerMessageJob sendPeerMessageJob = this.A00;
        if (r7 == null) {
            return new C29621ca("enc", (AnonymousClass1MD[]) A83.A04((Integer) null, "none", (String) null, (String) null, sendPeerMessageJob.retryCount, false).toArray(A83.A00));
        }
        return A83.A01(r7, sendPeerMessageJob.retryCount);
    }

    public /* synthetic */ AnonymousClass344(SendPeerMessageJob sendPeerMessageJob) {
        this.A00 = sendPeerMessageJob;
    }

    public /* synthetic */ C29621ca BHE(UserJid userJid) {
        return null;
    }

    public /* synthetic */ C29621ca BHp() {
        return null;
    }

    public /* synthetic */ List BHi(Jid jid, C194589ry r3, boolean z) {
        return C18460wS.A00;
    }
}
