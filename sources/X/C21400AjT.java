package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.AjT  reason: case insensitive filesystem */
public final /* synthetic */ class C21400AjT implements Runnable {
    public final /* synthetic */ C188839i4 A00;
    public final /* synthetic */ C19990A2d A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CountDownLatch A05;
    public final /* synthetic */ AtomicBoolean A06;
    public final /* synthetic */ AtomicReference A07;
    public final /* synthetic */ boolean A08;

    public final void run() {
        C188839i4 r7 = this.A00;
        AtomicBoolean atomicBoolean = this.A06;
        boolean z = this.A08;
        File file = this.A02;
        C19990A2d a2d = this.A01;
        String str = this.A03;
        List list = this.A04;
        AtomicReference atomicReference = this.A07;
        CountDownLatch countDownLatch = this.A05;
        try {
            if (!r7.A08.A01()) {
                atomicBoolean.set(false);
            } else if (z || !file.exists() || file.length() <= 0) {
                String absolutePath = file.getAbsolutePath();
                int A002 = C20127A8m.A00(r7.A02, a2d, r7.A0A, absolutePath);
                if (A002 != 1) {
                    if (A002 == 2) {
                        Log.e(AnonymousClass8BS.A0l(str, "restore>MediaRestoreAction/get-files-to-be-downloaded received '%s' from gdrive file map which does not exist.", new Object[1], 0));
                    } else if (A002 == 3) {
                        C171688s7 r0 = r7.A0F;
                        C17960vV.A07(r0);
                        r0.A01 = false;
                        r7.A0E.A01 = false;
                    }
                }
                list.add(str);
            }
        } catch (C167678gm e) {
            atomicReference.set(e);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ C21400AjT(C188839i4 r1, C19990A2d a2d, File file, String str, List list, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference, boolean z) {
        this.A00 = r1;
        this.A06 = atomicBoolean;
        this.A08 = z;
        this.A02 = file;
        this.A01 = a2d;
        this.A03 = str;
        this.A04 = list;
        this.A07 = atomicReference;
        this.A05 = countDownLatch;
    }
}
