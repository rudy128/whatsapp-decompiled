package X;

import android.app.KeyguardManager;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.5d3  reason: invalid class name and case insensitive filesystem */
public class C109245d3 extends KeyguardManager.KeyguardDismissCallback {
    public final /* synthetic */ VoipActivityV2 A00;
    public final /* synthetic */ Runnable A01;

    public C109245d3(VoipActivityV2 voipActivityV2, Runnable runnable) {
        this.A00 = voipActivityV2;
        this.A01 = runnable;
    }

    public void onDismissSucceeded() {
        this.A01.run();
    }
}
