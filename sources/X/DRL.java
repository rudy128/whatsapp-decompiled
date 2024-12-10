package X;

import java.io.Closeable;
import java.nio.ByteBuffer;

public class DRL implements Closeable, EAI {
    public ByteBuffer A00;
    public final long A01 = ((long) System.identityHashCode(this));
    public final int A02;

    private void A00(EAI eai, int i) {
        if (eai instanceof DRL) {
            C26208Cuj.A05(!isClosed());
            C26208Cuj.A05(!eai.isClosed());
            C26208Cuj.A01(this.A00);
            C9D.A00(0, eai.BZK(), 0, i, this.A02);
            this.A00.position(0);
            ByteBuffer BNu = eai.BNu();
            C26208Cuj.A01(BNu);
            BNu.position(0);
            byte[] bArr = new byte[i];
            this.A00.get(bArr, 0, i);
            BNu.put(bArr, 0, i);
            return;
        }
        throw AnonymousClass000.A0k("Cannot copy two incompatible MemoryChunks");
    }

    public void BFy(EAI eai, int i) {
        C26208Cuj.A01(eai);
        long Baz = eai.Baz();
        long j = this.A01;
        if (Baz == j) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Copying from BufferMemoryChunk ");
            A10.append(Long.toHexString(j));
            A10.append(" to BufferMemoryChunk ");
            A10.append(Long.toHexString(Baz));
            BE9.A1H(" which are the same ", "BufferMemoryChunk", A10);
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

    public synchronized ByteBuffer BNu() {
        return this.A00;
    }

    public synchronized byte CDI(int i) {
        boolean z = true;
        C26208Cuj.A05(!isClosed());
        C26208Cuj.A04(AnonymousClass000.A1Q(i));
        if (i >= this.A02) {
            z = false;
        }
        C26208Cuj.A04(z);
        C26208Cuj.A01(this.A00);
        return this.A00.get(i);
    }

    public synchronized void CDO(int i, byte[] bArr, int i2, int i3) {
        C26208Cuj.A01(bArr);
        C26208Cuj.A05(!isClosed());
        C26208Cuj.A01(this.A00);
        int i4 = this.A02;
        int A06 = BE8.A06(0, i4 - i, i3);
        C9D.A00(i, bArr.length, i2, A06, i4);
        this.A00.position(i);
        this.A00.get(bArr, i2, A06);
    }

    public synchronized void CSN(int i, byte[] bArr, int i2, int i3) {
        C26208Cuj.A01(bArr);
        C26208Cuj.A05(!isClosed());
        C26208Cuj.A01(this.A00);
        int i4 = this.A02;
        int A06 = BE8.A06(0, i4 - i, i3);
        C9D.A00(i, bArr.length, i2, A06, i4);
        this.A00.position(i);
        this.A00.put(bArr, i2, A06);
    }

    public synchronized void close() {
        this.A00 = null;
    }

    public synchronized boolean isClosed() {
        return AnonymousClass000.A1X(this.A00);
    }

    public void BVH() {
        throw BE6.A0v("Cannot get the pointer of a BufferMemoryChunk");
    }

    public int BZK() {
        return this.A02;
    }

    public long Baz() {
        return this.A01;
    }

    public DRL(int i) {
        this.A00 = ByteBuffer.allocateDirect(i);
        this.A02 = i;
    }
}
