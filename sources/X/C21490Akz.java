package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: X.Akz  reason: case insensitive filesystem */
public class C21490Akz implements Callable {
    public final int A00;
    public final Object A01;

    public C21490Akz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object call() {
        switch (this.A00) {
            case 0:
                ArrayList A13 = AnonymousClass000.A13();
                Iterator A0l = C17890vO.A0l(((ShortcutInfoCompatSaverImpl) this.A01).A04);
                while (A0l.hasNext()) {
                    A13.add(new AnonymousClass71Y(((C185309cN) A0l.next()).A00).A00());
                }
                return A13;
            case 1:
                AnonymousClass9UM r1 = (AnonymousClass9UM) this.A01;
                C18070vi.A0d(r1, 0);
                return Integer.valueOf(AnonymousClass9ON.A00(r1.A00, "next_alarm_manager_id"));
            case 2:
                return new C42891yu(this.A01);
            case 3:
                C21334AiJ aiJ = (C21334AiJ) this.A01;
                synchronized (aiJ) {
                    if (aiJ.A03 != null) {
                        while (aiJ.A02 > aiJ.A01) {
                            aiJ.A08(C17880vN.A0x(AnonymousClass000.A16(C17890vO.A0i(aiJ.A09))));
                        }
                        if (C21334AiJ.A07(aiJ)) {
                            C21334AiJ.A02(aiJ);
                            aiJ.A00 = 0;
                        }
                    }
                }
                return null;
            case 4:
                return ((AnonymousClass1P3) this.A01).A01.A03();
            case 5:
                return ((C167258fi) this.A01).A0E();
            case 6:
                AiK aiK = (AiK) this.A01;
                synchronized (aiK) {
                    Charset charset = AiK.A0E;
                    if (aiK.A02 != null) {
                        AiK.A04(aiK);
                        if (AiK.A0A(aiK)) {
                            AiK.A05(aiK);
                            aiK.A00 = 0;
                        }
                    }
                }
                return null;
            case 7:
                return C20111A7t.A00((C20111A7t) this.A01);
            case 8:
                return ((AnonymousClass1P3) this.A01).A0J();
            case 9:
                return Integer.valueOf(((AnonymousClass1P3) this.A01).A06());
            case 10:
                return ((RotateSignedPreKeyJob) this.A01).A00.A0J();
            case 11:
                return SendRetryReceiptJob.A00((SendRetryReceiptJob) this.A01);
            default:
                return ((AnonymousClass9HQ) this.A01).A00();
        }
    }
}
