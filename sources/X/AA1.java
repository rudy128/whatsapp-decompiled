package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import org.npci.upi.security.services.CLRemoteService;

public class AA1 implements ServiceConnection {
    public final int A00;
    public final Object A01;

    public AA1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.AmD] */
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CLRemoteService cLRemoteService;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                C167498gR r2 = (C167498gR) obj;
                r2.A0N.set(true);
                C36861oa r1 = r2.A04;
                if (!r1.A02) {
                    r1.A05();
                }
                r2.A0L.open();
                break;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) obj;
                restoreFromBackupActivity.A14.set(true);
                restoreFromBackupActivity.A0w.open();
                restoreFromBackupActivity.A0D.A01(restoreFromBackupActivity.A0y);
                return;
            case 2:
                SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = (SettingsGoogleDriveViewModel) obj;
                settingsGoogleDriveViewModel.A0f.set(true);
                C36861oa r12 = settingsGoogleDriveViewModel.A0U;
                if (!r12.A02) {
                    r12.A05();
                }
                C21424Ajr.A00(settingsGoogleDriveViewModel.A0c, this, 12);
                settingsGoogleDriveViewModel.A01.open();
                settingsGoogleDriveViewModel.A0U();
                break;
            default:
                C187079fE r22 = (C187079fE) obj;
                if (iBinder == null) {
                    cLRemoteService = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("org.npci.upi.security.services.CLRemoteService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof CLRemoteService)) {
                        ? obj2 = new Object();
                        obj2.A00 = iBinder;
                        cLRemoteService = obj2;
                    } else {
                        cLRemoteService = (CLRemoteService) queryLocalInterface;
                    }
                }
                r22.A03 = cLRemoteService;
                AnonymousClass9YG r0 = r22.A02;
                C17890vO.A0D().post(new C21432Ajz(r0.A00, C187079fE.A04, 5));
                Log.d("Remote Service", "Service Connected");
                return;
        }
        com.whatsapp.util.Log.i("settings-gdrive/service-connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ConditionVariable conditionVariable;
        switch (this.A00) {
            case 0:
                C167498gR r2 = (C167498gR) this.A01;
                r2.A0N.set(false);
                conditionVariable = r2.A0L;
                break;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
                restoreFromBackupActivity.A0n = false;
                if (!restoreFromBackupActivity.A14.compareAndSet(true, false)) {
                    restoreFromBackupActivity.A0D.A02(restoreFromBackupActivity.A0y);
                    restoreFromBackupActivity.A0w.close();
                    return;
                }
                return;
            case 2:
                SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = (SettingsGoogleDriveViewModel) this.A01;
                settingsGoogleDriveViewModel.A0f.set(false);
                conditionVariable = settingsGoogleDriveViewModel.A01;
                break;
            default:
                C187079fE r1 = (C187079fE) this.A01;
                r1.A03 = null;
                r1.A02.A00.A02.A0G("payments/indiaupi", "CL service disconnected", true);
                com.whatsapp.util.Log.e("CLServices serviceDisconnected");
                Log.d("Remote Service", "Service Disconnected");
                return;
        }
        conditionVariable.close();
        com.whatsapp.util.Log.i("settings-gdrive/service-disconnected");
    }
}
