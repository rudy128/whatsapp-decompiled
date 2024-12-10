package X;

import com.whatsapp.voipcalling.Voip;
import java.util.Iterator;

public class DTB implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public DTB(Object obj, String str, int i, long j, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = z;
        this.A01 = j;
    }

    public void run() {
        switch (this.A00) {
            case 0:
                Iterator A002 = DGH.A00(this.A02);
                while (A002.hasNext()) {
                    BE6.A0U(A002).Br2(this.A03, this.A04, this.A01);
                }
                return;
            case 1:
                ((C22927BVp) this.A02).A00.Br2(this.A03, this.A04, this.A01);
                return;
            default:
                String str = this.A03;
                boolean z = this.A04;
                long j = this.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("VoiceService/actionEditCallLinkForEvent isVideoCallLink: ");
                A10.append(z);
                A10.append(" eventStartTimeSec ");
                A10.append(j);
                C17900vP.A0f(" token ", str, A10);
                Voip.editCallLink(str, z, j);
                ((A99) this.A02).A0V();
                return;
        }
    }
}
