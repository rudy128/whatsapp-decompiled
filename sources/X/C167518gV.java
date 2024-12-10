package X;

import android.os.Bundle;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.8gV  reason: invalid class name and case insensitive filesystem */
public class C167518gV extends C66242xr {
    public int A00 = -1;
    public final /* synthetic */ RestoreFromBackupActivity A01;

    public C167518gV(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A01 = restoreFromBackupActivity;
    }

    public void BtL(int i, Bundle bundle) {
        if (i != 10) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("restore>RestoreFromBackupActivity/observer/error during msgstore download: ");
            C17890vO.A1A(A10, C41361wE.A03(i));
        }
        RestoreFromBackupActivity restoreFromBackupActivity = this.A01;
        C21457AkO.A00(restoreFromBackupActivity.A05, this, 49);
        restoreFromBackupActivity.A05.A0J(new C21470Akb((Object) this, i, 19, (Object) bundle));
    }

    public void ByU(boolean z) {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A01;
        int A02 = AnonymousClass8BU.A0B(restoreFromBackupActivity).A02();
        if (z) {
            Log.i("restore>RestoreFromBackupActivity/observer/msgstore download successful");
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("restore>RestoreFromBackupActivity/observer/msgstore download failed with ");
            C17890vO.A19(A10, C41361wE.A03(A02));
        }
        if (A02 == 10) {
            restoreFromBackupActivity.A05.A0J(new AnonymousClass7RK(9, (Object) this, z));
        }
    }

    public void ByV(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        int i = (int) ((100 * j) / j2);
        if (i - this.A00 > 0) {
            this.A00 = i;
            if (i % 10 == 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("restore>RestoreFromBackupActivity/observer/msgstore download progress:");
                A10.append(j);
                A10.append("/");
                A10.append(j2);
                A10.append(" ");
                A10.append(i);
                C17890vO.A1A(A10, "%");
            }
            this.A01.A05.A0J(new C98594rP(this, i, 1, j3, j4));
        }
    }

    public void ByW() {
        C21457AkO.A00(this.A01.A05, this, 48);
    }
}
