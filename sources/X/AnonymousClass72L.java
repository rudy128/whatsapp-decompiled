package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.json.JSONException;

/* renamed from: X.72L  reason: invalid class name */
public final class AnonymousClass72L {
    public Random A00;
    public final C218617r A01;
    public final AnonymousClass6L1 A02;
    public final AnonymousClass00H A03;
    public final C19880zA A04;
    public final AnonymousClass00H A05;

    public final Bitmap A02(String str, byte[] bArr, int i, int i2) {
        try {
            C38631rd A042 = A04(str, bArr);
            if (A042 == null) {
                return null;
            }
            return A00(A042, i, i2);
        } catch (OutOfMemoryError e) {
            Log.w("LottieUtils/getResizedLottieBitmapFromData OOM getting thumbnail bitmap", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C38631rd A04(java.lang.String r8, byte[] r9) {
        /*
            r7 = this;
            r6 = 0
            X.6L1 r5 = r7.A02     // Catch:{ OutOfMemoryError -> 0x006f }
            X.0ve r2 = r5.A04     // Catch:{ OutOfMemoryError -> 0x006f }
            r1 = 8743(0x2227, float:1.2252E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ OutOfMemoryError -> 0x006f }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ OutOfMemoryError -> 0x006f }
            if (r0 != 0) goto L_0x0075
            if (r8 != 0) goto L_0x002b
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ OutOfMemoryError -> 0x006f }
            r4.<init>(r9)     // Catch:{ OutOfMemoryError -> 0x006f }
            java.security.MessageDigest r0 = X.C108945cZ.A1I()     // Catch:{ all -> 0x0056 }
            X.C1402370n.A02(r4, r0)     // Catch:{ all -> 0x0056 }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x0056 }
            java.lang.String r8 = X.C108955ca.A14(r0)     // Catch:{ all -> 0x0056 }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x0056 }
            r4.close()     // Catch:{ OutOfMemoryError -> 0x006f }
        L_0x002b:
            X.00z r3 = r5.A00     // Catch:{ OutOfMemoryError -> 0x006f }
            java.lang.Object r0 = r3.A04(r8)     // Catch:{ OutOfMemoryError -> 0x006f }
            X.1tf r0 = (X.C39801tf) r0     // Catch:{ OutOfMemoryError -> 0x006f }
            if (r0 != 0) goto L_0x006a
            int r0 = r9.length     // Catch:{ OutOfMemoryError -> 0x006f }
            long r1 = (long) r0     // Catch:{ OutOfMemoryError -> 0x006f }
            X.00z r0 = r5.A01     // Catch:{ OutOfMemoryError -> 0x006f }
            java.lang.Object r0 = r0.A04(r8)     // Catch:{ OutOfMemoryError -> 0x006f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ OutOfMemoryError -> 0x006f }
            if (r0 != 0) goto L_0x005d
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ OutOfMemoryError -> 0x006f }
            r4.<init>(r9)     // Catch:{ OutOfMemoryError -> 0x006f }
            X.6rS r0 = X.AnonymousClass6L1.A01(r5, r4, r8, r1)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0056 }
            goto L_0x0050
        L_0x004f:
            r0 = r6
        L_0x0050:
            r4.close()     // Catch:{ OutOfMemoryError -> 0x006f }
            if (r0 == 0) goto L_0x0075
            goto L_0x005d
        L_0x0056:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ OutOfMemoryError -> 0x006f }
            throw r0     // Catch:{ OutOfMemoryError -> 0x006f }
        L_0x005d:
            X.1yu r0 = X.C39771tc.A05(r0)     // Catch:{ OutOfMemoryError -> 0x006f }
            java.lang.Object r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x006f }
            X.1tf r0 = (X.C39801tf) r0     // Catch:{ OutOfMemoryError -> 0x006f }
            if (r0 == 0) goto L_0x0075
            r3.A08(r8, r0)     // Catch:{ OutOfMemoryError -> 0x006f }
        L_0x006a:
            X.1rd r6 = r7.A03(r0)     // Catch:{ OutOfMemoryError -> 0x006f }
            return r6
        L_0x006f:
            r1 = move-exception
            java.lang.String r0 = "LottieUtils/getFullLottieDrawable OOM getting thumbnail bitmap"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0075:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72L.A04(java.lang.String, byte[]):X.1rd");
    }

    public final AnonymousClass73B A05(String str) {
        StringBuilder sb;
        String str2;
        C134976rS A002;
        try {
            File A17 = C108945cZ.A17(str);
            AnonymousClass6L1 r2 = this.A02;
            String A022 = AnonymousClass6L1.A02(r2, A17);
            String str3 = (String) r2.A02.A04(A022);
            if (str3 == null && ((A002 = AnonymousClass6L1.A00(r2, A17, A022)) == null || (str3 = A002.A01) == null)) {
                return null;
            }
            return AnonymousClass73B.A00(C17880vN.A16(str3).getJSONObject("customProps"));
        } catch (JSONException e) {
            e = e;
            sb = AnonymousClass000.A10();
            str2 = "LottieUtils/getMetadataFromPath error getting metadata json ";
            Log.w(C17900vP.A0C(str2, sb, e));
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = AnonymousClass000.A10();
            str2 = "LottieUtils/getMetadataFromPath exception retrieving lottie file ";
            Log.w(C17900vP.A0C(str2, sb, e));
            return null;
        }
    }

    public static final Bitmap A00(Drawable drawable, int i, int i2) {
        C38631rd r1;
        if ((drawable instanceof C38631rd) && (r1 = (C38631rd) drawable) != null) {
            r1.setBounds(r1.A0G.A04);
        }
        Bitmap A0H = C108945cZ.A0H(i, i2);
        Canvas A0E = C108955ca.A0E(A0H);
        Paint A06 = AnonymousClass3MW.A06();
        A06.setColor(0);
        float f = (float) i;
        float f2 = (float) i2;
        A0E.drawRect(0.0f, 0.0f, f, f2, A06);
        A0E.save();
        A0E.scale(f / ((float) Math.max(drawable.getIntrinsicWidth(), 1)), f2 / ((float) Math.max(drawable.getIntrinsicHeight(), 1)));
        drawable.draw(A0E);
        A0E.restore();
        return A0H;
    }

    public static final String A01(String str, C41661wr r8) {
        int i;
        CharSequence charSequence;
        String A0o = C108985cd.A0o(str, "\\s");
        int i2 = 0;
        int i3 = 2;
        String str2 = null;
        C133636pE A022 = r8.A02(A0o, 0);
        if (A022 != null) {
            AnonymousClass7TC r1 = A022.A01;
            int i4 = 1;
            C135126rh A0C = r1.A0C(1);
            if (A0C != null) {
                str2 = A0C.A00;
            }
            boolean A18 = C18070vi.A18(str2, "{");
            if (!A18) {
                i3 = 0;
            }
            C135126rh A0C2 = r1.A0C(i3);
            if (A0C2 != null) {
                C25411Oc r0 = A0C2.A01;
                i = r0.A00;
                i2 = r0.A01;
            } else {
                i = 0;
            }
            int i5 = i2 + 1;
            do {
                char charAt = A0o.charAt(i5);
                if (charAt == '{') {
                    i4++;
                } else if (charAt == '}') {
                    i4--;
                }
                i5++;
            } while (i4 != 0);
            if (A18 && A0o.charAt(i5) == ',') {
                i5++;
            }
            C25411Oc A08 = C28851b7.A08(i, i5);
            int i6 = A08.A00;
            int i7 = A08.A01 + 1;
            if (i7 >= i6) {
                if (i7 == i6) {
                    charSequence = A0o.subSequence(0, A0o.length());
                } else {
                    int length = A0o.length();
                    StringBuilder sb = new StringBuilder(length - (i7 - i6));
                    sb.append(A0o, 0, i6);
                    sb.append(A0o, i7, length);
                    charSequence = sb;
                }
                String obj = charSequence.toString();
                if (obj != null) {
                    return obj;
                }
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("End index (");
                A10.append(i7);
                A10.append(") is less than start index (");
                A10.append(i6);
                throw new IndexOutOfBoundsException(AnonymousClass000.A0y(").", A10));
            }
        }
        return A0o;
    }

    public final C38631rd A03(C39801tf r4) {
        C38661rg r0;
        C38631rd r2 = new C38631rd();
        r2.A0D = C49342Qc.ENABLED;
        if (AnonymousClass112.A05()) {
            r0 = C38661rg.HARDWARE;
        } else {
            r0 = C38661rg.SOFTWARE;
        }
        r2.A0H = r0;
        C38631rd.A04(r2);
        if (!r2.A0S) {
            r2.A0S = true;
            if (r2.A0G != null) {
                C38631rd.A03(r2);
            }
        }
        r2.A0K(r4);
        return r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.zip.ZipOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dc, code lost:
        if (r3 <= 1048576) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.CDX.A00(r7, r1);
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fe, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0101, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0104, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0108, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(java.io.File r14, byte[] r15) {
        /*
            r13 = this;
            X.6L1 r2 = r13.A02
            java.lang.String r1 = X.AnonymousClass6L1.A02(r2, r14)
            X.00z r0 = r2.A02
            r0.A05(r1)
            X.00z r1 = r2.A03
            java.lang.String r0 = r14.getAbsolutePath()
            X.C18070vi.A0X(r0)
            r1.A05(r0)
            X.00H r0 = r13.A05
            java.lang.Object r1 = r0.get()
            X.6cx r1 = (X.C126576cx) r1
            r2 = 0
            if (r15 == 0) goto L_0x011d
            boolean r0 = r14.exists()
            if (r0 == 0) goto L_0x011d
            monitor-enter(r14)
            java.nio.charset.Charset r8 = X.C26571Sq.A05     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            r0.<init>(r15, r8)     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            org.json.JSONObject r12 = X.C17880vN.A16(r0)     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            X.00H r0 = r1.A00     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            X.17y r0 = (X.C219317y) r0     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            X.17z r1 = r0.A00     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            java.lang.String r0 = ""
            java.io.File r1 = r1.A01(r0)     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            java.io.FileInputStream r6 = X.C108945cZ.A18(r14)     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r1)     // Catch:{ all -> 0x0102 }
            X.C64062u9.A00(r6, r3)     // Catch:{ all -> 0x00fb }
            r3.close()     // Catch:{ all -> 0x0102 }
            r6.close()     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r14)     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            java.util.zip.ZipOutputStream r6 = new java.util.zip.ZipOutputStream     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            java.io.FileInputStream r0 = X.C108945cZ.A18(r1)     // Catch:{ all -> 0x0102 }
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0102 }
            r7.<init>(r0)     // Catch:{ all -> 0x0102 }
            java.util.zip.ZipEntry r3 = r7.getNextEntry()     // Catch:{ all -> 0x00f4 }
            r9 = 1
        L_0x006c:
            if (r3 == 0) goto L_0x00b2
            java.lang.String r1 = r3.getName()     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "animation/animation.json.overridden_metadata"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00b2
            r0 = 20
            if (r9 >= r0) goto L_0x00b2
            java.lang.String r1 = r3.getName()     // Catch:{ all -> 0x00f4 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f4 }
            r6.putNextEntry(r0)     // Catch:{ all -> 0x00f4 }
            r10 = 5000000(0x4c4b40, double:2.470328E-317)
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x00f4 }
            int r1 = r7.read(r5)     // Catch:{ all -> 0x00f4 }
            r3 = 0
            goto L_0x009c
        L_0x0098:
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x00a8
        L_0x009c:
            if (r1 < 0) goto L_0x00a8
            r6.write(r5, r2, r1)     // Catch:{ all -> 0x00f4 }
            long r0 = (long) r1     // Catch:{ all -> 0x00f4 }
            long r3 = r3 + r0
            int r1 = r7.read(r5)     // Catch:{ all -> 0x00f4 }
            goto L_0x0098
        L_0x00a8:
            r6.closeEntry()     // Catch:{ all -> 0x00f4 }
            java.util.zip.ZipEntry r3 = r7.getNextEntry()     // Catch:{ all -> 0x00f4 }
            int r9 = r9 + 1
            goto L_0x006c
        L_0x00b2:
            r7.close()     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = X.C18070vi.A0H(r12)     // Catch:{ all -> 0x0102 }
            byte[] r3 = X.C18070vi.A1A(r0, r8)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "animation/animation.json.overridden_metadata"
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0102 }
            r0.<init>(r1)     // Catch:{ all -> 0x0102 }
            r6.putNextEntry(r0)     // Catch:{ all -> 0x0102 }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0102 }
            r7.<init>(r3)     // Catch:{ all -> 0x0102 }
            r8 = 1048576(0x100000, double:5.180654E-318)
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x00f4 }
            int r1 = r7.read(r5)     // Catch:{ all -> 0x00f4 }
            r3 = 0
            goto L_0x00de
        L_0x00da:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00ea
        L_0x00de:
            if (r1 < 0) goto L_0x00ea
            r6.write(r5, r2, r1)     // Catch:{ all -> 0x00f4 }
            long r0 = (long) r1     // Catch:{ all -> 0x00f4 }
            long r3 = r3 + r0
            int r1 = r7.read(r5)     // Catch:{ all -> 0x00f4 }
            goto L_0x00da
        L_0x00ea:
            r7.close()     // Catch:{ all -> 0x0102 }
            r6.closeEntry()     // Catch:{ all -> 0x0102 }
            r6.close()     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            goto L_0x0117
        L_0x00f4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0102 }
            goto L_0x0101
        L_0x00fb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0102 }
        L_0x0101:
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
            throw r0     // Catch:{ IOException -> 0x0110, JSONException -> 0x0109 }
        L_0x0109:
            r1 = move-exception
            java.lang.String r0 = "LottieMetadataWriter/insertMetadata error modifying metadata"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x011a }
            goto L_0x0118
        L_0x0110:
            r1 = move-exception
            java.lang.String r0 = "LottieMetadataWriter/insertMetadata failed to insert metadata"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x011a }
            goto L_0x0118
        L_0x0117:
            r2 = 1
        L_0x0118:
            monitor-exit(r14)
            return r2
        L_0x011a:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x011d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72L.A06(java.io.File, byte[]):boolean");
    }

    public AnonymousClass72L(C19880zA r1, C218617r r2, AnonymousClass6L1 r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r3, r2, r4, r1, r5);
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r4;
        this.A04 = r1;
        this.A03 = r5;
    }
}
