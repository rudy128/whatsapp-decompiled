package X;

import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.Image;
import android.util.Pair;
import com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1;
import com.facebook.smartcapture.camera.LiteCameraFragment;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.DAa  reason: case insensitive filesystem */
public class C26702DAa implements E48 {
    public final int A00;
    public final Object A01;

    public C26702DAa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C1e(CUB cub) {
        E48 e48;
        byte[] bArr;
        float[] fArr;
        Pair pair;
        Long l;
        Float f;
        Long l2;
        long j;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        CUB cub2 = cub;
        switch (this.A00) {
            case 0:
                C25687CkI ckI = (C25687CkI) this.A01;
                if (!ckI.A04) {
                    e48 = ckI.A03;
                    break;
                } else {
                    DAS das = ckI.A01;
                    if (das != null && !das.A01) {
                        das.A01 = true;
                        C25687CkI ckI2 = das.A04;
                        C24347Bzi bzi = C24347Bzi.AUTOGEN_FINISHED;
                        COL col = ckI2.A07;
                        String str = bzi.key;
                        C18070vi.A0d(str, 0);
                        CCY.A00(col.A00, col.A01, str, 38);
                        C28416E0h[] e0hArr = cub2.A0C;
                        int i5 = cub2.A01;
                        int i6 = i5;
                        if (i5 != 35 || e0hArr == null) {
                            bArr = cub2.A0A;
                            if (bArr == null) {
                                if (e0hArr == null || e0hArr.length != 3) {
                                    bArr = null;
                                } else {
                                    int i7 = cub2.A03;
                                    int i8 = cub2.A00;
                                    C28416E0h e0h = e0hArr[0];
                                    C28416E0h e0h2 = e0hArr[1];
                                    C28416E0h e0h3 = e0hArr[2];
                                    C18070vi.A0b(e0h);
                                    C18070vi.A0b(e0h2);
                                    C18070vi.A0b(e0h3);
                                    DAZ daz = (DAZ) e0h;
                                    ByteBuffer byteBuffer = daz.A02;
                                    DAZ daz2 = (DAZ) e0h2;
                                    ByteBuffer byteBuffer2 = daz2.A02;
                                    DAZ daz3 = (DAZ) e0h3;
                                    ByteBuffer byteBuffer3 = daz3.A02;
                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(i6);
                                    int i9 = bitsPerPixel / 8;
                                    int i10 = i7 * i8;
                                    bArr = new byte[((i10 * bitsPerPixel) / 8)];
                                    int i11 = daz2.A01;
                                    int i12 = i11;
                                    byte[] bArr2 = new byte[i11];
                                    byte[] bArr3 = new byte[daz3.A01];
                                    int i13 = i10 * i9;
                                    int i14 = i13 / 4;
                                    int i15 = 0;
                                    for (int i16 = 0; i16 < i8; i16++) {
                                        int i17 = i9 * i7;
                                        byteBuffer.get(bArr, i15, i17);
                                        if (i8 - i16 != 1) {
                                            byteBuffer.position((byteBuffer.position() + daz.A01) - i17);
                                        }
                                        i15 += i17;
                                        int i18 = i8 / 2;
                                        if (i16 < i18) {
                                            if (i18 - i16 == 1) {
                                                i4 = ((i7 / 2) - daz2.A00) + 1;
                                            } else {
                                                i4 = i12;
                                            }
                                            byteBuffer2.get(bArr2, 0, i4);
                                            byteBuffer3.get(bArr3, 0, i4);
                                            int i19 = i7 / 2;
                                            for (int i20 = 0; i20 < i19; i20++) {
                                                int i21 = (i16 * i7) / 2;
                                                int i22 = i21;
                                                byte[] bArr4 = bArr2;
                                                BE6.A1P(bArr4, bArr, daz2.A00 * i20, i21 + i13 + i20);
                                                byte[] bArr5 = bArr3;
                                                BE6.A1P(bArr5, bArr, daz3.A00 * i20, i13 + i14 + i22 + i20);
                                            }
                                        }
                                    }
                                }
                            }
                            fArr = cub2.A0B;
                            pair = cub2.A05;
                            l = cub2.A08;
                            f = cub2.A06;
                            l2 = cub2.A07;
                            j = cub2.A04;
                            z = cub2.A09;
                            i = cub2.A03;
                            i2 = cub2.A00;
                            i3 = cub2.A02;
                        } else {
                            ByteBuffer byteBuffer4 = ((DAZ) e0hArr[0]).A02;
                            ByteBuffer byteBuffer5 = ((DAZ) e0hArr[2]).A02;
                            int remaining = byteBuffer4.remaining();
                            int remaining2 = byteBuffer5.remaining();
                            bArr = new byte[(remaining + remaining2)];
                            byteBuffer4.get(bArr, 0, remaining);
                            byteBuffer5.get(bArr, remaining, remaining2);
                            fArr = cub2.A0B;
                            pair = cub2.A05;
                            l = cub2.A08;
                            f = cub2.A06;
                            l2 = cub2.A07;
                            j = cub2.A04;
                            z = cub2.A09;
                            i = cub2.A03;
                            i2 = cub2.A00;
                            i3 = cub2.A02;
                            i6 = 17;
                        }
                        byte[] bArr6 = new CUB(pair, f, l, l2, bArr, fArr, e0hArr, i6, i, i2, i3, j, z).A0A;
                        if (bArr6 != null) {
                            Rect rect = new Rect(0, 0, i, i2);
                            AnonymousClass3MW.A1X(C23871Hy.A01, new AECapturePresenter$saveImage$1(rect, das, (C30391dr) null, bArr6, i, i2, i3), das.A05);
                            return;
                        }
                        return;
                    }
                    return;
                }
                break;
            case 1:
                LiteCameraFragment liteCameraFragment = (LiteCameraFragment) this.A01;
                liteCameraFragment.A03.get();
                int i23 = liteCameraFragment.A01;
                int i24 = cub2.A03;
                if (!(i23 == i24 && liteCameraFragment.A00 == cub2.A00)) {
                    liteCameraFragment.A01 = i24;
                    liteCameraFragment.A00 = cub2.A00;
                    liteCameraFragment.A05 = false;
                }
                if (!liteCameraFragment.A05) {
                    liteCameraFragment.A1D().runOnUiThread(new C27076DTa(cub2, liteCameraFragment, 19));
                }
                e48 = (E48) liteCameraFragment.A04.get();
                break;
            case 2:
                C25688CkJ ckJ = (C25688CkJ) this.A01;
                if (ckJ.A07) {
                    Object obj = ckJ.A05;
                    synchronized (obj) {
                        if (ckJ.A06) {
                            C24958CRi cRi = ckJ.A02;
                            byte[] bArr7 = cub2.A0A;
                            C28416E0h[] e0hArr2 = cub2.A0C;
                            int i25 = cub2.A03;
                            int i26 = cub2.A00;
                            cRi.A02 = bArr7;
                            cRi.A03 = e0hArr2;
                            cRi.A01 = i25;
                            cRi.A00 = i26;
                            ckJ.A08 = true;
                            obj.notify();
                            while (ckJ.A06 && ckJ.A07) {
                                try {
                                    obj.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            ckJ.A08 = false;
                        }
                    }
                    return;
                }
                return;
            default:
                C28416E0h[] e0hArr3 = cub2.A0C;
                VoipLiteCamera voipLiteCamera = (VoipLiteCamera) this.A01;
                ReentrantLock reentrantLock = voipLiteCamera.cachedImageLock;
                reentrantLock.lock();
                try {
                    Image image = voipLiteCamera.cachedImage;
                    if (image != null) {
                        image.close();
                    }
                    voipLiteCamera.cachedImage = null;
                    if (e0hArr3 != null) {
                        voipLiteCamera.frameCallbackInternal(new DRC(cub2, e0hArr3));
                        return;
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
        }
        if (e48 != null) {
            e48.C1e(cub2);
        }
    }
}
