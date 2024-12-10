package X;

import android.os.FileObserver;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Bwk  reason: case insensitive filesystem */
public class C24174Bwk extends File {
    public final CountDownLatch mFileCreatedCondition = BE7.A0u();
    public volatile FileObserver mFileObserver;
    public volatile boolean mIsClosed = false;
    public volatile boolean mIsTailing = false;
    public volatile C28430E0w mListener = null;
    public volatile FileObserver mParentFolderObserver;

    public void A00() {
        this.mIsClosed = true;
        synchronized (this) {
            if (this.mFileObserver != null) {
                this.mFileObserver.stopWatching();
                this.mFileObserver = null;
            }
        }
        synchronized (this) {
            if (this.mParentFolderObserver != null) {
                this.mParentFolderObserver.stopWatching();
                this.mParentFolderObserver = null;
            }
        }
    }

    public C24174Bwk(String str, boolean z) {
        super(str);
        this.mIsTailing = z;
    }
}
