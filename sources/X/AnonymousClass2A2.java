package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.UrlResponse;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2A2  reason: invalid class name */
public class AnonymousClass2A2 extends C70553Bn {
    public final /* synthetic */ DataTask A00;
    public final /* synthetic */ NetworkSession A01;
    public final /* synthetic */ UrlResponse A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2A2(DataTask dataTask, NetworkSession networkSession, UrlResponse urlResponse, String str, byte[] bArr, File file, IOException iOException) {
        super("markDataTaskCompleted");
        this.A00 = dataTask;
        this.A01 = networkSession;
        this.A02 = urlResponse;
        this.A06 = bArr;
        this.A03 = file;
        this.A04 = iOException;
        this.A05 = str;
    }

    public void run() {
        File file;
        String str;
        DataTask dataTask = this.A00;
        String str2 = dataTask.mTaskCategory;
        String str3 = dataTask.mTaskIdentifier;
        int i = dataTask.mTaskType;
        try {
            NetworkSession networkSession = this.A01;
            UrlResponse urlResponse = this.A02;
            byte[] bArr = this.A06;
            file = this.A03;
            if (file != null) {
                str = file.getCanonicalPath();
            } else {
                str = null;
            }
            networkSession.markDataTaskAsCompletedCallback(str2, str3, i, urlResponse, bArr, str, this.A04);
        } catch (IOException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.A05);
            A10.append("IOException while executing markDataTaskCompleted");
            C17880vN.A1M(A10, e);
            this.A01.markDataTaskAsCompletedCallback(str2, str3, i, this.A02, this.A06, (String) null, e);
            file = this.A03;
        } catch (Throwable th) {
            File file2 = this.A03;
            if (file2 != null) {
                file2.delete();
            }
            throw th;
        }
        if (file != null) {
            file.delete();
        }
    }
}
