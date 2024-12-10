package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.71v  reason: invalid class name and case insensitive filesystem */
public final class C1405271v {
    public final AnonymousClass18K A00;
    public final C218617r A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass00H A03;

    public static void A01(C1405271v r5, AnonymousClass725 r6, long j) {
        AnonymousClass18K r3 = r5.A00;
        C1182062o r2 = new C1182062o();
        r2.A02 = Long.valueOf(r6.A02);
        r2.A00 = 1;
        r2.A01 = Long.valueOf(System.currentTimeMillis() - j);
        r3.CC7(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        X.CDX.A00(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A02(X.AnonymousClass725 r15, java.io.File r16) {
        /*
            r14 = this;
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            X.17r r5 = r14.A01
            java.io.File r0 = r5.A0G()
            boolean r0 = r0.exists()
            r13 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "StickerPackUtils/getInternalStickerPackFile/externalSharedFolder does not exist, cannot create sticker pack file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r13
        L_0x0017:
            long r1 = java.lang.System.currentTimeMillis()
            r4 = r16
            long r6 = r15.A02     // Catch:{ IOException -> 0x0053 }
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
            java.util.List r0 = r15.A07     // Catch:{ IOException -> 0x0053 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ IOException -> 0x0053 }
            r8 = 0
        L_0x002c:
            boolean r0 = r9.hasNext()     // Catch:{ IOException -> 0x0053 }
            if (r0 == 0) goto L_0x0049
            X.77d r3 = X.C108945cZ.A0x(r9)     // Catch:{ IOException -> 0x0053 }
            int r0 = r3.A00     // Catch:{ IOException -> 0x0053 }
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = r3.A0B     // Catch:{ IOException -> 0x0053 }
            if (r0 == 0) goto L_0x002c
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ IOException -> 0x0053 }
            long r6 = r0.length()     // Catch:{ IOException -> 0x0053 }
            int r0 = (int) r6     // Catch:{ IOException -> 0x0053 }
        L_0x0047:
            int r8 = r8 + r0
            goto L_0x002c
        L_0x0049:
            long r6 = r4.length()     // Catch:{ IOException -> 0x0053 }
            int r0 = (int) r6     // Catch:{ IOException -> 0x0053 }
            int r8 = r8 + r0
            long r6 = (long) r8     // Catch:{ IOException -> 0x0053 }
            r15.A02 = r6     // Catch:{ IOException -> 0x0053 }
            goto L_0x0059
        L_0x0053:
            r3 = move-exception
            java.lang.String r0 = "StickerPackUtils/getInternalStickerPackFile/failed to get sticker pack size"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ IOException -> 0x014f }
        L_0x0059:
            java.util.List r0 = r15.A07     // Catch:{ IOException -> 0x014f }
            java.util.ArrayList r7 = X.C108965cb.A0t(r0)     // Catch:{ IOException -> 0x014f }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ IOException -> 0x014f }
        L_0x0063:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x014f }
            if (r0 == 0) goto L_0x0079
            X.77d r0 = X.C108945cZ.A0x(r3)     // Catch:{ IOException -> 0x014f }
            java.lang.String r0 = r0.A0B     // Catch:{ IOException -> 0x014f }
            if (r0 == 0) goto L_0x0063
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ IOException -> 0x014f }
            r7.add(r0)     // Catch:{ IOException -> 0x014f }
            goto L_0x0063
        L_0x0079:
            r7.add(r4)     // Catch:{ IOException -> 0x014f }
            java.lang.String r0 = "sticker_pack"
            java.lang.String r4 = "zip"
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r0)     // Catch:{ IOException -> 0x00ff }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r3)     // Catch:{ IOException -> 0x00ff }
            java.io.File r12 = X.C108945cZ.A17(r0)     // Catch:{ IOException -> 0x00ff }
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r12)     // Catch:{ IOException -> 0x00ff }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00ff }
            r0.<init>(r3)     // Catch:{ IOException -> 0x00ff }
            java.util.zip.ZipOutputStream r6 = new java.util.zip.ZipOutputStream     // Catch:{ IOException -> 0x00ff }
            r6.<init>(r0)     // Catch:{ IOException -> 0x00ff }
            r10 = 16384(0x4000, float:2.2959E-41)
            byte[] r9 = new byte[r10]     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r11 = r7.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x00a4:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x00f5 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ all -> 0x00f5 }
            java.io.FileInputStream r0 = X.C108945cZ.A18(r7)     // Catch:{ IOException -> 0x00df }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00df }
            r8.<init>(r0, r10)     // Catch:{ IOException -> 0x00df }
            java.lang.String r3 = r7.getName()     // Catch:{ all -> 0x00d5 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00d5 }
            r0.<init>(r3)     // Catch:{ all -> 0x00d5 }
            r6.putNextEntry(r0)     // Catch:{ all -> 0x00d5 }
        L_0x00c5:
            r4 = 0
            int r3 = r8.read(r9, r4, r10)     // Catch:{ all -> 0x00d5 }
            r0 = -1
            if (r3 == r0) goto L_0x00d1
            r6.write(r9, r4, r3)     // Catch:{ all -> 0x00d5 }
            goto L_0x00c5
        L_0x00d1:
            r8.close()     // Catch:{ IOException -> 0x00df }
            goto L_0x00a4
        L_0x00d5:
            r3 = move-exception
            r8.close()     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r3, r0)     // Catch:{ IOException -> 0x00df }
        L_0x00de:
            throw r3     // Catch:{ IOException -> 0x00df }
        L_0x00df:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "Cannot zip file to share: "
            r3.append(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x00f5 }
            X.C108985cd.A1M(r0, r3, r4)     // Catch:{ all -> 0x00f5 }
            throw r4     // Catch:{ all -> 0x00f5 }
        L_0x00f1:
            r6.close()     // Catch:{ IOException -> 0x00ff }
            goto L_0x0106
        L_0x00f5:
            r3 = move-exception
            r6.close()     // Catch:{ all -> 0x00fa }
            goto L_0x00fe
        L_0x00fa:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r3, r0)     // Catch:{ IOException -> 0x00ff }
        L_0x00fe:
            throw r3     // Catch:{ IOException -> 0x00ff }
        L_0x00ff:
            r3 = move-exception
            java.lang.String r0 = "StickerPackUtils/createStickerPackZipFile/failed to create zip file"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ IOException -> 0x014f }
            r12 = r13
        L_0x0106:
            if (r12 == 0) goto L_0x0155
            java.io.FileInputStream r4 = X.C108945cZ.A18(r12)     // Catch:{ IOException -> 0x014f }
            java.security.MessageDigest r0 = X.C108945cZ.A1I()     // Catch:{ all -> 0x0148 }
            X.C1402370n.A02(r4, r0)     // Catch:{ all -> 0x0148 }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = X.C108955ca.A14(r0)     // Catch:{ all -> 0x0148 }
            r4.close()     // Catch:{ IOException -> 0x014f }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x014f }
            java.io.File r4 = r5.A0G()     // Catch:{ IOException -> 0x014f }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x014f }
            X.C108995ce.A1N(r3, r0)     // Catch:{ IOException -> 0x014f }
            java.lang.String r0 = ".zip"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ IOException -> 0x014f }
            java.io.File r3 = X.C17880vN.A0e(r4, r0)     // Catch:{ IOException -> 0x014f }
            java.io.FileInputStream r4 = X.C108945cZ.A18(r12)     // Catch:{ IOException -> 0x014f }
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r3)     // Catch:{ all -> 0x0148 }
            X.C64062u9.A00(r4, r0)     // Catch:{ all -> 0x0148 }
            r4.close()     // Catch:{ IOException -> 0x014f }
            A01(r14, r15, r1)
            return r3
        L_0x0148:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            X.CDX.A00(r4, r3)     // Catch:{ IOException -> 0x014f }
            throw r0     // Catch:{ IOException -> 0x014f }
        L_0x014f:
            r3 = move-exception
            java.lang.String r0 = "StickerPackUtils/getInternalStickerPackFile/failed to create internal sticker pack zip"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x0159 }
        L_0x0155:
            A01(r14, r15, r1)
            return r13
        L_0x0159:
            r0 = move-exception
            A01(r14, r15, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1405271v.A02(X.725, java.io.File):java.io.File");
    }

    public final byte[] A03(AnonymousClass725 r10) {
        C136706uF A002;
        Bitmap A003;
        int i = 0;
        ArrayList A16 = C108955ca.A16(r10, 0);
        List list = r10.A07;
        C18070vi.A0X(list);
        Iterator it = C29431cG.A0v(list, 4).iterator();
        while (it.hasNext()) {
            C1418377d A0x = C108945cZ.A0x(it);
            String str = A0x.A0B;
            if (!(str == null || (A002 = C138906xt.A00(A0x, this.A03, C108945cZ.A17(str))) == null || (A003 = A002.A00()) == null)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(A003, AnonymousClass74N.A03, AnonymousClass74N.A03, false);
                C18070vi.A0X(createScaledBitmap);
                A003.recycle();
                A16.add(createScaledBitmap);
            }
        }
        if (A16.isEmpty()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(252, 252, Bitmap.Config.ARGB_8888);
        Canvas A0E = C108955ca.A0E(createBitmap);
        A0E.drawColor(-1);
        int size = A16.size();
        if (size == 1) {
            A0E.drawBitmap((Bitmap) C29431cG.A0b(A16), 72.0f, 72.0f, (Paint) null);
        } else if (size == 2) {
            A00(A0E, A16, 72.0f);
        } else if (size == 3) {
            A00(A0E, A16, 12.0f);
            A0E.drawBitmap((Bitmap) A16.get(2), 72.0f, 132.0f, (Paint) null);
        } else if (size == 4) {
            Iterator it2 = A16.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                i++;
                if (i2 < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                A0E.drawBitmap((Bitmap) next, ((float) ((i2 % 2) * 120)) + 12.0f, ((float) ((i2 / 2) * 120)) + 12.0f, (Paint) null);
                i2 = i;
            }
        }
        return C108955ca.A1a(Bitmap.CompressFormat.JPEG, createBitmap, C108945cZ.A15(), 80);
    }

    public C1405271v(C218617r r1, AnonymousClass11P r2, AnonymousClass18K r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
        this.A03 = r4;
    }

    public static final void A00(Canvas canvas, List list, float f) {
        canvas.drawBitmap((Bitmap) C29431cG.A0b(list), 12.0f, f, (Paint) null);
        canvas.drawBitmap((Bitmap) list.get(1), 132.0f, f, (Paint) null);
    }
}
