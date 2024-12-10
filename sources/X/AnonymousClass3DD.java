package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.3DD  reason: invalid class name */
public class AnonymousClass3DD implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass3DD(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final Object call() {
        DeviceJid deviceJid;
        switch (this.A00) {
            case 0:
                return C20111A7t.A03((C20111A7t) this.A01, (DeviceJid) this.A02, (C166418cr) this.A03);
            case 1:
                return Boolean.valueOf(((C203711w) this.A01).A0X.A0a((C58252kO) this.A03, C63962tz.A02(((DeviceJid) this.A02).userJid.getPrimaryDevice())));
            case 2:
                AnonymousClass122 r5 = (AnonymousClass122) this.A01;
                AnonymousClass21V r4 = (AnonymousClass21V) this.A03;
                C25311Ns r3 = r5.A07;
                File file = ((C62572rc) this.A02).A0G;
                int i = r4.A0u;
                Log.i("ReferenceCountedFileManager/deleteManagedFile actually deleting file");
                C25291Nq r0 = r3.A03;
                C64062u9.A0Q(file);
                r0.A0B(file, i);
                C25321Nt r32 = r5.A0Q;
                C62572rc r2 = r4.A02;
                if (!(r2 == null || r2.A0G == null)) {
                    r2.A0A = 0;
                    r2.A0G = null;
                    r2.A0U = false;
                    r2.A0V = false;
                    r32.A05(r4);
                }
                return AnonymousClass000.A0i();
            case 3:
                SendLiveLocationKeyJob sendLiveLocationKeyJob = (SendLiveLocationKeyJob) this.A01;
                C166418cr r33 = (C166418cr) this.A02;
                UserJid userJid = (UserJid) this.A03;
                AnonymousClass1E0 r02 = DeviceJid.Companion;
                if (userJid != null) {
                    deviceJid = userJid.getPrimaryDevice();
                } else {
                    deviceJid = null;
                }
                return C198079xk.A00(sendLiveLocationKeyJob.A00.A0B(C63962tz.A02(deviceJid), r33.A0M()));
            default:
                C60002nE A022 = C63962tz.A02((DeviceJid) this.A02);
                return C198079xk.A00(((SendPeerMessageJob) this.A01).A01.A0B(A022, (byte[]) this.A03));
        }
    }
}
