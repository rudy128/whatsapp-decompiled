package X;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.net.ssl.SSLException;

public abstract class C6K {
    public synchronized void A01(byte[] bArr, int i, int i2, byte b) {
        C219718c r0;
        if (bArr == null) {
            r0 = BE9.A0b("Data cannot be null", (byte) 80);
        } else if (!CGJ.A00.contains(Byte.valueOf(b))) {
            r0 = BE9.A0b("Invalid content type", (byte) 80);
        } else {
            while (i2 > 16384) {
                A00(bArr, i, 16384, b);
                i += 16384;
                i2 -= 16384;
            }
            if (i2 > 0) {
                A00(bArr, i, i2, b);
            }
        }
        throw r0;
    }

    /* JADX WARNING: type inference failed for: r0v34, types: [X.18g, java.lang.Object] */
    public void A00(byte[] bArr, int i, int i2, byte b) {
        short s;
        byte b2 = b;
        if (this instanceof C24073Buy) {
            C24073Buy buy = (C24073Buy) this;
            try {
                ByteBuffer allocate = ByteBuffer.allocate(i2 + 5);
                allocate.put(b2);
                if (b2 != 22 || buy.A01) {
                    Set set = CID.A04;
                    s = 771;
                } else {
                    buy.A01 = true;
                    Set set2 = CID.A04;
                    s = 769;
                }
                allocate.putShort(s);
                C26287Cwn.A05(i2, allocate);
                allocate.put(bArr, i, i2);
                buy.A00.write(allocate.array());
            } catch (SocketException | SocketTimeoutException e) {
                throw new C219718c(new SSLException(e), (byte) 80, true);
            } catch (IOException e2) {
                throw BE9.A0d(e2);
            }
        } else {
            C24074Buz buz = (C24074Buz) this;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
            ByteBuffer allocate2 = ByteBuffer.allocate(copyOfRange.length + 1);
            allocate2.put(copyOfRange);
            allocate2.put(b2);
            allocate2.put(new byte[0]);
            byte[] array = allocate2.array();
            ByteBuffer allocate3 = ByteBuffer.allocate(5);
            allocate3.put((byte) 23);
            Set set3 = CID.A04;
            allocate3.putShort(771);
            int length = array.length;
            C28474E2p e2p = buz.A01;
            synchronized (C220118g.class) {
                if (C220118g.A00 == null) {
                    C220118g.A00 = new Object();
                }
            }
            C26287Cwn.A05(length + 16, allocate3);
            long j = buz.A00;
            byte[] array2 = allocate3.array();
            C27005DPb dPb = (C27005DPb) e2p;
            try {
                dPb.A00.init(1, dPb.A01, new GCMParameterSpec(128, C27004DPa.A00(dPb.A02, j)));
                dPb.A00.updateAAD(array2);
                byte[] doFinal = dPb.A00.doFinal(array, 0, length);
                buz.A00++;
                try {
                    ByteBuffer allocate4 = ByteBuffer.allocate(doFinal.length + 5);
                    allocate4.put(allocate3.array());
                    allocate4.put(doFinal);
                    buz.A02.write(allocate4.array());
                } catch (SocketException | SocketTimeoutException e3) {
                    throw new C219718c(new SSLException(e3), (byte) 80, true);
                } catch (IOException e4) {
                    throw BE9.A0d(e4);
                }
            } catch (BadPaddingException e5) {
                throw BE9.A0c("Bad padding", e5, (byte) 80);
            } catch (IllegalBlockSizeException e6) {
                throw BE9.A0c("Illegal block size ", e6, (byte) 80);
            } catch (InvalidAlgorithmParameterException e7) {
                throw BE9.A0c("Invalid Algorithm Params", e7, (byte) 80);
            } catch (InvalidKeyException e8) {
                throw BE9.A0c(" Invalid Key", e8, (byte) 80);
            }
        }
    }
}
