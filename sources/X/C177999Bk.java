package X;

import android.graphics.Bitmap;
import android.os.Process;
import android.util.Pair;
import java.util.Stack;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.9Bk  reason: invalid class name and case insensitive filesystem */
public class C177999Bk extends C201010v {
    public final /* synthetic */ A2k A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177999Bk(A2k a2k, String str) {
        super(AnonymousClass001.A1H("PhotosNetwork-", str, AnonymousClass000.A10()));
        this.A00 = a2k;
    }

    public void run() {
        C188219h4 r6;
        Bitmap bitmap;
        Process.setThreadPriority(10);
        do {
            A2k a2k = this.A00;
            Stack stack = a2k.A0B;
            synchronized (stack) {
                try {
                    if (stack.size() == 0) {
                        stack.wait();
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            if (stack.size() != 0) {
                Object obj = a2k.A05;
                synchronized (obj) {
                    try {
                        if (stack.size() != 0) {
                            r6 = (C188219h4) stack.pop();
                        } else {
                            r6 = null;
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                if (r6 != null) {
                    ConcurrentMap concurrentMap = r6.A05;
                    if (concurrentMap.size() != 0 && AnonymousClass8BV.A1Z(r6.A06)) {
                        Pair A01 = a2k.A01(r6);
                        synchronized (obj) {
                            try {
                                if (!AnonymousClass000.A1Y(A01.first)) {
                                    concurrentMap.clear();
                                    a2k.A09.remove(r6.A03);
                                } else {
                                    Bitmap bitmap2 = (Bitmap) A01.second;
                                    A5O a5o = a2k.A03;
                                    String str = r6.A03;
                                    if (bitmap2 != null) {
                                        bitmap = bitmap2;
                                    } else {
                                        bitmap = A5O.A07;
                                    }
                                    a5o.A03(bitmap, str);
                                    A2k.A00(a2k, str, bitmap2, concurrentMap);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                    }
                }
            }
            try {
            } catch (InterruptedException unused) {
                return;
            }
        } while (!Thread.interrupted());
    }
}
