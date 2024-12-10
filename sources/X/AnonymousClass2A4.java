package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.UrlResponse;
import java.io.IOException;

/* renamed from: X.2A4  reason: invalid class name */
public class AnonymousClass2A4 extends C70553Bn {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2A4(DataTask dataTask, NetworkSession networkSession, AnonymousClass71N r4, C23081El r5) {
        super("StreamingUploadDataTask_initial_ask_for_data");
        this.A01 = r4;
        this.A04 = r5;
        this.A03 = networkSession;
        this.A02 = dataTask;
    }

    public void run() {
        switch (this.A00) {
            case 0:
                DataTask dataTask = (DataTask) this.A01;
                ((NetworkSession) this.A02).onDataTaskNewStreamingDataCallback(dataTask.mTaskCategory, dataTask.mTaskIdentifier, (UrlResponse) this.A03, (byte[]) this.A04);
                return;
            case 1:
                DataTask dataTask2 = (DataTask) this.A01;
                ((NetworkSession) this.A03).markDataTaskStreamingCompletedCallback(dataTask2.mTaskCategory, dataTask2.mTaskIdentifier, (UrlResponse) this.A04, (Throwable) this.A02);
                return;
            default:
                ((NetworkSession) this.A03).canHandleStreamingUploadUpdate(((DataTask) this.A02).mTaskIdentifier);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2A4(DataTask dataTask, NetworkSession networkSession, UrlResponse urlResponse, IOException iOException) {
        super("markDataTaskStreamingCompleted");
        this.A01 = dataTask;
        this.A03 = networkSession;
        this.A04 = urlResponse;
        this.A02 = iOException;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2A4(DataTask dataTask, NetworkSession networkSession, UrlResponse urlResponse, byte[] bArr) {
        super("onDataTaskNewStreamingDataArrived");
        this.A01 = dataTask;
        this.A02 = networkSession;
        this.A03 = urlResponse;
        this.A04 = bArr;
    }
}
