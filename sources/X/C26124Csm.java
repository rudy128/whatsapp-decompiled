package X;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Csm  reason: case insensitive filesystem */
public class C26124Csm {
    public static final Object A06 = C17880vN.A0p();
    public static final ArrayDeque A07 = new ArrayDeque();
    public Handler A00;
    public boolean A01;
    public final MediaCodec A02;
    public final HandlerThread A03;
    public final C25717Ckn A04;
    public final AtomicReference A05 = new AtomicReference();

    public C26124Csm(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C25717Ckn ckn = new C25717Ckn();
        this.A02 = mediaCodec;
        this.A03 = handlerThread;
        this.A04 = ckn;
    }

    public static CSI A00() {
        CSI csi;
        ArrayDeque arrayDeque = A07;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                csi = new CSI();
            } else {
                csi = (CSI) arrayDeque.removeFirst();
            }
        }
        return csi;
    }

    public static void A01(C26124Csm csm) {
        C25717Ckn ckn = csm.A04;
        ckn.A00();
        Handler handler = csm.A00;
        C26056CrS.A01(handler);
        AnonymousClass8BT.A17(handler, 2);
        synchronized (ckn) {
            while (!ckn.A00) {
                ckn.wait();
            }
        }
    }

    public void A02() {
        if (this.A01) {
            try {
                Handler handler = this.A00;
                C26056CrS.A01(handler);
                handler.removeCallbacksAndMessages((Object) null);
                A01(this);
            } catch (InterruptedException e) {
                AnonymousClass8BS.A0x();
                throw new IllegalStateException(e);
            }
        }
    }

    public void A03(C25016CTs cTs, int i, long j) {
        int length;
        int length2;
        int length3;
        int length4;
        Throwable th = (Throwable) this.A05.getAndSet((Object) null);
        if (th == null) {
            CSI A002 = A00();
            A002.A01 = i;
            A002.A02 = 0;
            A002.A03 = j;
            A002.A00 = 0;
            MediaCodec.CryptoInfo cryptoInfo = A002.A04;
            cryptoInfo.numSubSamples = cTs.A03;
            int[] iArr = cTs.A06;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 == null || iArr2.length < (length4 = iArr.length)) {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                } else {
                    System.arraycopy(iArr, 0, iArr2, 0, length4);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = cTs.A07;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 == null || iArr4.length < (length3 = iArr3.length)) {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                } else {
                    System.arraycopy(iArr3, 0, iArr4, 0, length3);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = cTs.A05;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 == null || bArr2.length < (length2 = bArr.length)) {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, length2);
                }
            }
            C26056CrS.A01(bArr2);
            cryptoInfo.key = bArr2;
            byte[] bArr3 = cTs.A04;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 == null || bArr4.length < (length = bArr3.length)) {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                } else {
                    System.arraycopy(bArr3, 0, bArr4, 0, length);
                }
            }
            C26056CrS.A01(bArr4);
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = cTs.A02;
            if (Util.A00 >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cTs.A01, cTs.A00));
            }
            BE7.A18(this.A00, A002, 1);
            return;
        }
        throw th;
    }
}
