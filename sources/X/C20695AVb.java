package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptProcessingJob;

/* renamed from: X.AVb  reason: case insensitive filesystem */
public final class C20695AVb implements AnonymousClass3M9 {
    public final int A00;
    public final long A01;
    public final DeviceJid A02;
    public final Jid A03;
    public final C42691ya A04;
    public final C60132nR A05;
    public final AnonymousClass205[] A06;

    public AnonymousClass205 BhG(int i) {
        return this.A06[i];
    }

    public void CGx(C25001Mm r9, int i) {
        AnonymousClass205[] r2 = this.A06;
        int length = r2.length - i;
        AnonymousClass205[] r4 = new AnonymousClass205[length];
        System.arraycopy(r2, i, r4, 0, length);
        Jid jid = this.A03;
        r9.A01(new ReceiptProcessingJob(this.A02, jid, this.A04, r4, this.A00, this.A01));
    }

    public int size() {
        return this.A06.length;
    }

    public C20695AVb(DeviceJid deviceJid, Jid jid, C42691ya r3, C60132nR r4, AnonymousClass205[] r5, int i, long j) {
        this.A06 = r5;
        this.A03 = jid;
        this.A02 = deviceJid;
        this.A00 = i;
        this.A01 = j;
        this.A05 = r4;
        this.A04 = r3;
    }

    public DeviceJid CBI(int i) {
        return this.A02;
    }

    public C42691ya CDV() {
        return this.A04;
    }

    public Jid CES() {
        return this.A03;
    }

    public C60132nR CNb() {
        return this.A05;
    }

    public int COT() {
        return this.A00;
    }

    public long CP8(int i) {
        return this.A01;
    }
}
