package X;

import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

public class DRM implements Closeable, EAI {
    public SharedMemory A00;
    public ByteBuffer A01;
    public final long A02;

    private void A00(EAI eai, int i) {
        if (eai instanceof DRM) {
            C26208Cuj.A05(!isClosed());
            C26208Cuj.A05(!eai.isClosed());
            C26208Cuj.A01(this.A01);
            C26208Cuj.A01(eai.BNu());
            C9D.A00(0, eai.BZK(), 0, i, BZK());
            this.A01.position(0);
            eai.BNu().position(0);
            byte[] bArr = new byte[i];
            this.A01.get(bArr, 0, i);
            eai.BNu().put(bArr, 0, i);
            return;
        }
        throw AnonymousClass000.A0k("Cannot copy two incompatible MemoryChunks");
    }

    public void BFy(EAI eai, int i) {
        C26208Cuj.A01(eai);
        long Baz = eai.Baz();
        long j = this.A02;
        if (Baz == j) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Copying from AshmemMemoryChunk ");
            A10.append(Long.toHexString(j));
            A10.append(" to AshmemMemoryChunk ");
            A10.append(Long.toHexString(Baz));
            BE9.A1H(" which are the same ", "AshmemMemoryChunk", A10);
            C26208Cuj.A04(false);
        }
        if (Baz < j) {
            synchronized (eai) {
                synchronized (this) {
                    A00(eai, i);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (eai) {
                A00(eai, i);
            }
        }
    }

    public synchronized byte CDI(int i) {
        boolean z = true;
        C26208Cuj.A05(!isClosed());
        C26208Cuj.A04(AnonymousClass000.A1Q(i));
        if (i >= BZK()) {
            z = false;
        }
        C26208Cuj.A04(z);
        C26208Cuj.A01(this.A01);
        return this.A01.get(i);
    }

    public synchronized void CDO(int i, byte[] bArr, int i2, int i3) {
        C26208Cuj.A01(bArr);
        C26208Cuj.A01(this.A01);
        int A06 = BE8.A06(0, BZK() - i, i3);
        C9D.A00(i, bArr.length, i2, A06, BZK());
        this.A01.position(i);
        this.A01.get(bArr, i2, A06);
    }

    public synchronized void CSN(int i, byte[] bArr, int i2, int i3) {
        C26208Cuj.A01(bArr);
        C26208Cuj.A01(this.A01);
        int A06 = BE8.A06(0, BZK() - i, i3);
        C9D.A00(i, bArr.length, i2, A06, BZK());
        this.A01.position(i);
        this.A01.put(bArr, i2, A06);
    }

    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory sharedMemory = this.A00;
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            ByteBuffer byteBuffer = this.A01;
            if (byteBuffer != null) {
                SharedMemory.unmap(byteBuffer);
            }
            this.A01 = null;
            this.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.A00 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isClosed() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.nio.ByteBuffer r0 = r2.A01     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            android.os.SharedMemory r1 = r2.A00     // Catch:{ all -> 0x000d }
            r0 = 0
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRM.isClosed():boolean");
    }

    public ByteBuffer BNu() {
        return this.A01;
    }

    public void BVH() {
        throw BE6.A0v("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    public int BZK() {
        C26208Cuj.A01(this.A00);
        return this.A00.getSize();
    }

    public long Baz() {
        return this.A02;
    }

    public DRM(int i) {
        C26208Cuj.A04(AnonymousClass000.A1R(i));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.A00 = create;
            this.A01 = create.mapReadWrite();
            this.A02 = (long) System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw BE6.A0o("Fail to create AshmemMemory", e);
        }
    }

    public DRM() {
        this.A00 = null;
        this.A01 = null;
        this.A02 = (long) System.identityHashCode(this);
    }
}
