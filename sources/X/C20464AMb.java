package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.workers.GoogleBackupWorker;

/* renamed from: X.AMb  reason: case insensitive filesystem */
public class C20464AMb implements B76 {
    public final int A00;
    public final Object A01;

    public C20464AMb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onError(int i) {
        if (this.A00 != 0) {
            GoogleBackupWorker.A02((GoogleBackupWorker) this.A01, i);
        } else {
            ((GoogleBackupService) this.A01).A07.A05(i);
        }
    }
}
