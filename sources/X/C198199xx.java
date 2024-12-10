package X;

import java.io.File;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9xx  reason: invalid class name and case insensitive filesystem */
public final class C198199xx {
    public static final Map A03 = C17880vN.A11();
    public FileChannel A00;
    public final File A01;
    public final Lock A02;

    public C198199xx(File file, String str) {
        Lock lock;
        File A0X = AnonymousClass8BW.A0X(file, ".lck", AnonymousClass000.A11(str));
        this.A01 = A0X;
        String absolutePath = A0X.getAbsolutePath();
        C18070vi.A0X(absolutePath);
        Map map = A03;
        synchronized (map) {
            Object obj = map.get(absolutePath);
            if (obj == null) {
                obj = new ReentrantLock();
                map.put(absolutePath, obj);
            }
            lock = (Lock) obj;
        }
        this.A02 = lock;
    }
}
