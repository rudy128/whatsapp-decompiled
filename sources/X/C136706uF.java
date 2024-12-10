package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: X.6uF  reason: invalid class name and case insensitive filesystem */
public abstract class C136706uF {
    public final File A00;

    public boolean A02(Integer num) {
        return AnonymousClass000.A1W(((AnonymousClass6HI) this).A02);
    }

    public Bitmap A00() {
        if (this instanceof AnonymousClass6HI) {
            AnonymousClass6HI r0 = (AnonymousClass6HI) this;
            C26611Su r3 = r0.A01;
            File file = r0.A03;
            return r3.A06(file, file.getName(), 64, 64);
        }
        AnonymousClass6HJ r02 = (AnonymousClass6HJ) this;
        AnonymousClass72L r5 = r02.A01;
        try {
            C39801tf A0A = r5.A02.A0A(r02.A02, (String) null);
            if (A0A != null) {
                return AnonymousClass72L.A00(r5.A03(A0A), 64, 64);
            }
        } catch (OutOfMemoryError e) {
            Log.w("LottieUtils/getThumbnailBitmap OOM getting thumbnail bitmap", e);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(java.io.File r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass6HI
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = com.whatsapp.stickers.WebpUtils.A01(r6)
            return r0
        L_0x0009:
            r0 = r5
            X.6HJ r0 = (X.AnonymousClass6HJ) r0
            X.72L r0 = r0.A01
            X.6L1 r3 = r0.A02
            java.lang.String r1 = X.AnonymousClass6L1.A02(r3, r6)
            X.00z r0 = r3.A01
            java.lang.Object r2 = r0.A04(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0026
            X.6rS r0 = X.AnonymousClass6L1.A00(r3, r6, r1)
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = r0.A00
        L_0x0026:
            if (r2 != 0) goto L_0x002c
            r0 = 0
            return r0
        L_0x002a:
            r2 = 0
            goto L_0x0026
        L_0x002c:
            java.lang.String r1 = "metadata"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r4 = "([{,])?(\\s*\""
            r0.append(r4)
            r0.append(r1)
            java.lang.String r3 = "\"\\s*:\\s*\\{)"
            java.lang.String r1 = X.AnonymousClass000.A0y(r3, r0)
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r1)
            java.lang.String r2 = X.AnonymousClass72L.A01(r2, r0)
            java.lang.String r0 = "userMetadata"
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r4, r0, r3)
            java.lang.String r1 = r0.toString()
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r1)
            java.lang.String r0 = X.AnonymousClass72L.A01(r2, r0)
            byte[] r0 = X.C108975cc.A1O(r0)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            java.security.MessageDigest r0 = X.C108945cZ.A1I()     // Catch:{ all -> 0x007b }
            X.C1402370n.A02(r2, r0)     // Catch:{ all -> 0x007b }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x007b }
            java.lang.String r0 = X.C108955ca.A14(r0)     // Catch:{ all -> 0x007b }
            r2.close()
            X.C18070vi.A0X(r0)
            return r0
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136706uF.A01(java.io.File):java.lang.String");
    }

    public byte[] A03() {
        StringBuilder sb;
        String str;
        if (this instanceof AnonymousClass6HI) {
            AnonymousClass6HI r0 = (AnonymousClass6HI) this;
            return r0.A00.extractWebpMetadataBytes(r0.A03.getAbsolutePath());
        }
        AnonymousClass6HJ r02 = (AnonymousClass6HJ) this;
        AnonymousClass72L r1 = r02.A01;
        String absolutePath = r02.A02.getAbsolutePath();
        C18070vi.A0X(absolutePath);
        try {
            File A17 = C108945cZ.A17(absolutePath);
            AnonymousClass6L1 r2 = r1.A02;
            String A02 = AnonymousClass6L1.A02(r2, A17);
            String str2 = (String) r2.A02.A04(A02);
            if (str2 == null) {
                C134976rS A002 = AnonymousClass6L1.A00(r2, A17, A02);
                if (A002 != null) {
                    str2 = A002.A01;
                } else {
                    str2 = null;
                }
            }
            if (str2 != null) {
                return C108975cc.A1O(C18070vi.A0H(C17880vN.A16(str2).getJSONObject("customProps")));
            }
        } catch (JSONException e) {
            e = e;
            sb = AnonymousClass000.A10();
            str = "LottieUtils/getMetadataFromPath error getting metadata json ";
            Log.w(C17900vP.A0C(str, sb, e));
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = AnonymousClass000.A10();
            str = "LottieUtils/getMetadataFromPath exception retrieving lottie file ";
            Log.w(C17900vP.A0C(str, sb, e));
            return null;
        }
        return null;
    }

    public C136706uF(File file) {
        this.A00 = file;
    }
}
