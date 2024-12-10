package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import java.util.TimerTask;

/* renamed from: X.Ams  reason: case insensitive filesystem */
public class C21603Ams extends TimerTask {
    public final /* synthetic */ BusinessDirectoryActivity A00;

    public C21603Ams(BusinessDirectoryActivity businessDirectoryActivity) {
        this.A00 = businessDirectoryActivity;
    }

    public void run() {
        this.A00.runOnUiThread(new C21446AkD(this, 18));
    }
}
