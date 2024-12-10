package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import java.util.List;

/* renamed from: X.AVa  reason: case insensitive filesystem */
public final class C20694AVa implements AnonymousClass3M9 {
    public final int A00;
    public final Jid A01;
    public final AnonymousClass205 A02;
    public final C42691ya A03;
    public final C60132nR A04;
    public final List A05;

    public DeviceJid CBI(int i) {
        return (DeviceJid) ((Pair) this.A05.get(i)).first;
    }

    public void CGx(C25001Mm r7, int i) {
        List list = this.A05;
        List subList = list.subList(i, list.size());
        AnonymousClass205 r2 = this.A02;
        r7.A01(new ReceiptMultiTargetProcessingJob(this.A01, r2, this.A03, subList, this.A00));
    }

    public long CP8(int i) {
        return C17880vN.A05(((Pair) this.A05.get(i)).second);
    }

    public int size() {
        return this.A05.size();
    }

    public C20694AVa(Jid jid, AnonymousClass205 r2, C42691ya r3, C60132nR r4, List list, int i) {
        this.A02 = r2;
        this.A01 = jid;
        this.A00 = i;
        this.A05 = list;
        this.A04 = r4;
        this.A03 = r3;
    }

    public AnonymousClass205 BhG(int i) {
        return this.A02;
    }

    public C42691ya CDV() {
        return this.A03;
    }

    public Jid CES() {
        return this.A01;
    }

    public C60132nR CNb() {
        return this.A04;
    }

    public int COT() {
        return this.A00;
    }
}
