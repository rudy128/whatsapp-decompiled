package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.1En  reason: invalid class name and case insensitive filesystem */
public class C23091En implements DataTaskListener {
    public final /* synthetic */ C23081El A00;

    public C23091En(C23081El r1) {
        this.A00 = r1;
    }

    public void onCancelDataTask(String str, NetworkSession networkSession) {
        AnonymousClass71N r3 = (AnonymousClass71N) this.A00.A05.get(str);
        if (r3 != null) {
            AnonymousClass71N.A00(NetworkUtils.newErrorURLResponse(r3.A04), r3, new IOException("Task cancelled."), (byte[]) null);
        }
    }

    public void onNewTask(DataTask dataTask, NetworkSession networkSession) {
        try {
            this.A00.A03.CGF(new C146857Qw(this, dataTask, networkSession, 0));
        } catch (RejectedExecutionException e) {
            Log.e("wa-msys/NetworkSession: DataTask rejected for execution", e);
            throw e;
        }
    }

    public void onUpdateStreamingDataTask(byte[] bArr, String str, NetworkSession networkSession) {
        this.A00.A03.CGF(new C146887Qz(this, bArr, str, 29));
    }
}
