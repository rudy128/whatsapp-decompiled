package X;

import android.os.StrictMode;
import java.io.File;

/* renamed from: X.1AL  reason: invalid class name */
public class AnonymousClass1AL extends AnonymousClass1AC {
    public final /* synthetic */ AnonymousClass198 A00;

    public int A02(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        C18070vi.A0d(str, 0);
        if (AnonymousClass1AN.A01.contains(str)) {
            try {
                this.A00.A01.await();
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread interrupted while waiting on decompression to complete", e);
            }
        }
        return super.A02(threadPolicy, str, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1AL(AnonymousClass198 r3, File file) {
        super(file, new String[0], 1);
        this.A00 = r3;
    }
}
