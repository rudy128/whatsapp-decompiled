package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.2jk  reason: invalid class name and case insensitive filesystem */
public final class C57852jk {
    public final WamediaManager A00;
    public final C138906xt A01;
    public final C62272r8 A02;
    public final C1408873l A03;
    public final AnonymousClass190 A04;

    public final C54912eu A00(C54902et r8) {
        byte[] bArr;
        byte[] bArr2;
        Pair pair;
        byte[] bArr3;
        int i;
        int i2;
        byte[] bArr4;
        byte[] bArr5;
        Object obj;
        C26551So r1 = r8.A00;
        if (C63972u0.A04(r1)) {
            if (!r8.A03) {
                bArr5 = this.A03.A05(Uri.fromFile(r8.A01), 100, 100, 0);
            } else {
                bArr5 = null;
            }
            File file = r8.A01;
            Pair A0C = C26511Sk.A0C(file);
            try {
                Object obj2 = A0C.second;
                C18070vi.A0W(obj2);
                int A0M = AnonymousClass000.A0M(obj2);
                Object obj3 = A0C.first;
                C18070vi.A0W(obj3);
                if (A0M > AnonymousClass000.A0M(obj3)) {
                    obj = C50552Uw.A00(file);
                } else {
                    obj = null;
                }
            } catch (Throwable th) {
                obj = new AnonymousClass1IU(th);
            }
            if (obj instanceof AnonymousClass1IU) {
                obj = null;
            }
            return new C54912eu(A0C, (Pair) obj, bArr5, (byte[]) null);
        } else if (r1 == C26551So.A0C || r1 == C26551So.A0F || r1 == C26551So.A0r || r1 == C26551So.A0D || r1 == C26551So.A0L || r1 == C26551So.A0l || r1 == C26551So.A0Z || r1 == C26551So.A0c || r1 == C26551So.A0a || r1 == C26551So.A0b) {
            try {
                FileInputStream fileInputStream = new FileInputStream(r8.A01);
                try {
                    AnonymousClass2QP r3 = new AnonymousClass2QP(fileInputStream.available());
                    byte[] bArr6 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                    while (true) {
                        int read = fileInputStream.read(bArr6);
                        if (read == -1) {
                            break;
                        }
                        r3.write(bArr6, 0, read);
                    }
                    bArr = r3.toByteArray();
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e = e;
                    }
                    return new C54912eu((Pair) null, (Pair) null, bArr, (byte[]) null);
                } catch (Throwable th2) {
                    CDX.A00(fileInputStream, th);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
                bArr = null;
                Log.e("ThumbnailGenerator/createThumbnailForThumbnailDownload/failed", e);
                return new C54912eu((Pair) null, (Pair) null, bArr, (byte[]) null);
            }
        } else if (C25291Nq.A06(r1)) {
            if (!r8.A03) {
                C62272r8 r5 = this.A02;
                bArr4 = r5.A01(r8.A01, r8.A02, 1.0f, C18020vd.A00(C18040vf.A02, r5.A01, 6249));
            } else {
                bArr4 = null;
            }
            return new C54912eu((Pair) null, (Pair) null, bArr4, (byte[]) null);
        } else if (C63972u0.A0A(r1)) {
            try {
                C1405471x r12 = new C1405471x(this.A00, r8.A01);
                if (r12.A02()) {
                    i = r12.A00;
                    i2 = r12.A02;
                } else {
                    i = r12.A02;
                    i2 = r12.A00;
                }
                pair = C17890vO.A0F(Integer.valueOf(i), i2);
            } catch (C26451Se e3) {
                Log.w("thumbnailgenerator/video/unable to get video meta", e3);
                pair = null;
            }
            if (!r8.A03) {
                bArr3 = C1408873l.A04(r8.A01);
            } else {
                bArr3 = null;
            }
            return new C54912eu(pair, (Pair) null, bArr3, (byte[]) null);
        } else if (!C63972u0.A07(r1)) {
            return null;
        } else {
            C136706uF A012 = this.A01.A01(r8.A01, r8.A02);
            if (r8.A03) {
                if (A012 != null) {
                    bArr2 = A012.A03();
                } else {
                    bArr2 = null;
                }
                return new C54912eu((Pair) null, (Pair) null, (byte[]) null, bArr2);
            }
            if (A012 != null) {
                try {
                    Bitmap A002 = A012.A00();
                    if (A002 != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        A002.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        A002.recycle();
                        return new C54912eu(new Pair(64, 64), (Pair) null, byteArray, (byte[]) null);
                    }
                } catch (OutOfMemoryError e4) {
                    Log.e("ThumbnailGenerator/createThumbnailForSticker/failed", e4);
                }
            }
            return new C54912eu((Pair) null, (Pair) null, (byte[]) null, (byte[]) null);
        }
    }

    public C57852jk(AnonymousClass190 r1, WamediaManager wamediaManager, C138906xt r3, C62272r8 r4, C1408873l r5) {
        C18070vi.A0w(r1, r5, wamediaManager, r4, r3);
        this.A04 = r1;
        this.A03 = r5;
        this.A00 = wamediaManager;
        this.A02 = r4;
        this.A01 = r3;
    }
}
