package X;

import com.whatsapp.media.WamediaManager;
import java.io.File;

/* renamed from: X.DTk  reason: case insensitive filesystem */
public final class C27085DTk implements Runnable, C107095Yj {
    public final WamediaManager A00;
    public final C24927CQa A01;
    public volatile boolean A02;

    public C27085DTk(WamediaManager wamediaManager, C24927CQa cQa) {
        C18070vi.A0d(wamediaManager, 1);
        this.A00 = wamediaManager;
        this.A01 = cQa;
    }

    public synchronized void cancel() {
        this.A02 = true;
    }

    public void run() {
        C55362fe r5;
        C24927CQa cQa = this.A01;
        File file = cQa.A02;
        try {
            this.A00.check(file, false);
            r5 = new C55362fe(file, (Integer) null, (String) null, (byte[]) null, !this.A02);
        } catch (AnonymousClass2RS e) {
            this.A00.uploadMp4FailureLogs(file, e, "process video document", false);
            if (!this.A02) {
                cQa.A01.BJ0(2131889962);
            }
            r5 = new C55362fe(file, (Integer) null, (String) null, (byte[]) null, false);
        }
        cQa.A00.Bud(r5);
    }
}
