package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6hy  reason: invalid class name and case insensitive filesystem */
public final class C129546hy {
    public final Bitmap.Config A00;
    public final SparseArray A01 = new SparseArray();
    public final C25082CWs A02;
    public final C25026CUc A03;
    public final ExecutorService A04;

    public C129546hy(Bitmap.Config config, C25082CWs cWs, C25026CUc cUc, ExecutorService executorService) {
        C18070vi.A0d(cUc, 1);
        this.A03 = cUc;
        this.A02 = cWs;
        this.A00 = config;
        this.A04 = executorService;
    }
}
