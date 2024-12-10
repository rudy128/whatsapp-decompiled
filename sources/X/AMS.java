package X;

import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;

public class AMS implements B72 {
    public final int A00;
    public final Object A01;

    public AMS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bt2(String str, int i, int i2) {
        int i3 = this.A00;
        Object obj = this.A01;
        if (i3 != 0) {
            AnonymousClass8g4 r0 = (AnonymousClass8g4) obj;
            AnonymousClass9WV r1 = r0.A09;
            synchronized (r0.A0B) {
            }
            EncBackupViewModel.A00(r1.A00, i);
            return;
        }
        C167358g3 r02 = (C167358g3) obj;
        B71 b71 = r02.A08;
        synchronized (r02.A0B) {
        }
        b71.BtE(i, -1, i2);
    }
}
