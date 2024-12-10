package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1Ku  reason: invalid class name and case insensitive filesystem */
public class C24561Ku extends AnonymousClass10T implements ComponentCallbacks2 {
    public long A00;
    public long A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass11N A04;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        boolean z;
        if (i >= 60) {
            if (SystemClock.uptimeMillis() > this.A00 + 60000) {
                this.A00 = SystemClock.uptimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append("OnTrimMemory/level: ");
                sb.append(i);
                sb.append(", trimming memory, app in background");
                Log.i(sb.toString());
                z = false;
            } else {
                return;
            }
        } else if (i >= 15 && i < 20 && SystemClock.uptimeMillis() > this.A01 + C20113A7w.A0L) {
            this.A01 = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("OnTrimMemory/level: ");
            sb2.append(i);
            sb2.append(", trimming memory, app in foreground");
            Log.i(sb2.toString());
            z = true;
        } else {
            return;
        }
        this.A02.CGF(new C146837Qu(this, i, 5, z));
    }

    public C24561Ku(AnonymousClass11N r2, AnonymousClass118 r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        this.A02 = r4;
        this.A04 = r2;
        this.A03 = r5;
        r3.A00.registerComponentCallbacks(this);
    }
}
