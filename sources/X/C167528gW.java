package X;

import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8gW  reason: invalid class name and case insensitive filesystem */
public class C167528gW extends C36821oW {
    public final int A00;
    public final Object A01;

    public C167528gW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean A01() {
        switch (this.A00) {
            case 0:
                C196239ug r4 = (C196239ug) this.A01;
                C36801oU r3 = r4.A07;
                AtomicBoolean atomicBoolean = r3.A0R;
                if (atomicBoolean.get()) {
                    if (!AnonymousClass8BY.A1W(r3, r4.A08, r4.A00()) || !atomicBoolean.get()) {
                        return false;
                    }
                    return true;
                }
                break;
            case 1:
                C196239ug r0 = (C196239ug) this.A01;
                return AnonymousClass8BY.A1W(r0.A07, r0.A08, r0.A00());
            default:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
                if (restoreFromBackupActivity.A13.get()) {
                    Log.i("restore>RestoreFromBackupActivity/one-time-setup-task/cancelled");
                    break;
                } else {
                    return restoreFromBackupActivity.A0B.A0I.A01();
                }
        }
        return false;
    }

    public String toString() {
        switch (this.A00) {
            case 0:
                return "media-restore-condition";
            case 1:
                return "suitable-condition";
            default:
                return "one-time-setup-condition";
        }
    }
}
