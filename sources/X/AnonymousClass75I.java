package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.whatsapp.util.Log;

/* renamed from: X.75I  reason: invalid class name */
public class AnonymousClass75I implements ServiceConnection {
    public final C138016wO A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final /* synthetic */ C138566xI A04;

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public AnonymousClass75I(C138566xI r1, C138016wO r2, String str, String str2, boolean z) {
        this.A04 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = r2;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C138566xI r2 = this.A04;
        try {
            if (r2.A03.A01(componentName.getPackageName()).A03 && this.A02.equals(componentName.getPackageName())) {
                r2.A06.execute(new C146507Pj(this, iBinder, 22));
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.e("CallbackServiceProxy/service component mismatch.");
        r2.A00.A00.unbindService(this);
    }
}
