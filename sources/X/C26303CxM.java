package X;

import android.content.res.AssetManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.CxM  reason: case insensitive filesystem */
public class C26303CxM {
    public static SimpleDateFormat A0J;
    public static SimpleDateFormat A0K;
    public static final Charset A0L;
    public static final boolean A0M = Log.isLoggable("ExifInterface", 3);
    public static final byte[] A0N = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A0O = {104, 101, 105, 99};
    public static final byte[] A0P = {109, 105, 102, 49};
    public static final byte[] A0Q = {102, 116, 121, 112};
    public static final byte[] A0R;
    public static final byte[] A0S = {-1, -40, -1};
    public static final byte[] A0T = {79, 76, 89, 77, 80, 0};
    public static final byte[] A0U = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] A0V = {101, 88, 73, 102};
    public static final byte[] A0W = {73, 69, 78, 68};
    public static final byte[] A0X = {73, 72, 68, 82};
    public static final byte[] A0Y = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] A0Z = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] A0a = "ANMF".getBytes(Charset.defaultCharset());
    public static final byte[] A0b = {69, 88, 73, 70};
    public static final byte[] A0c = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] A0d = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] A0e = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] A0f = {82, 73, 70, 70};
    public static final byte[] A0g = {87, 69, 66, 80};
    public static final byte[] A0h = {-99, 1, 42};
    public static final int[] A0i = {8};
    public static final int[] A0j = {8, 8, 8};
    public static final int[] A0k = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final String[] A0l = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final C25570Ci9[][] A0m;
    public static final HashMap A0n = C17880vN.A11();
    public static final HashSet A0o;
    public static final List A0p;
    public static final List A0q;
    public static final Pattern A0r = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0s = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0t = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0u = Pattern.compile(".*[1-9].*");
    public static final byte[] A0v;
    public static final C25570Ci9[] A0w;
    public static final C25570Ci9[] A0x;
    public static final C25570Ci9[] A0y;
    public static final C25570Ci9[] A0z;
    public static final C25570Ci9[] A10;
    public static final C25570Ci9[] A11;
    public static final C25570Ci9[] A12;
    public static final C25570Ci9[] A13;
    public static final C25570Ci9[] A14;
    public static final C25570Ci9[] A15;
    public static final HashMap[] A16 = new HashMap[10];
    public static final HashMap[] A17 = new HashMap[10];
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public AssetManager.AssetInputStream A06;
    public FileDescriptor A07;
    public String A08;
    public ByteOrder A09;
    public Set A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public byte[] A0F;
    public int A0G;
    public int A0H;
    public final HashMap[] A0I;

    public static C26195CuQ A02(C26303CxM cxM, int i) {
        return C26195CuQ.A01(cxM.A09, new int[]{i});
    }

    public static C26195CuQ A03(C26303CxM cxM, int i) {
        return C26195CuQ.A02(cxM.A09, new long[]{(long) i});
    }

    private void A09() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.A0I;
            if (i < 10) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("The size of tag group[");
                A102.append(i);
                A102.append("]: ");
                Log.d("ExifInterface", C17880vN.A0t(A102, hashMapArr[i].size()));
                Iterator A0i2 = C17890vO.A0i(hashMapArr[i]);
                while (A0i2.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(A0i2);
                    C26195CuQ cuQ = (C26195CuQ) A162.getValue();
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("tagName: ");
                    A103.append(C17880vN.A0x(A162));
                    A103.append(", tagType: ");
                    AnonymousClass8BS.A1D(cuQ, A103);
                    A103.append(", tagValue: '");
                    A103.append(cuQ.A05(this.A09));
                    Log.d("ExifInterface", AnonymousClass000.A0y("'", A103));
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A0A() {
        A0B(0, 5);
        A0B(0, 4);
        A0B(5, 4);
        HashMap[] hashMapArr = this.A0I;
        Object obj = hashMapArr[1].get("PixelXDimension");
        Object obj2 = hashMapArr[1].get("PixelYDimension");
        if (!(obj == null || obj2 == null)) {
            hashMapArr[0].put("ImageWidth", obj);
            hashMapArr[0].put("ImageLength", obj2);
        }
        if (hashMapArr[4].isEmpty() && A0Y(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = C17880vN.A11();
        }
        if (!A0Y(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A0C(0, "ThumbnailOrientation", "Orientation");
        A0C(0, "ThumbnailImageLength", "ImageLength");
        A0C(0, "ThumbnailImageWidth", "ImageWidth");
        A0C(5, "ThumbnailOrientation", "Orientation");
        A0C(5, "ThumbnailImageLength", "ImageLength");
        A0C(5, "ThumbnailImageWidth", "ImageWidth");
        A0C(4, "Orientation", "ThumbnailOrientation");
        A0C(4, "ImageLength", "ThumbnailImageLength");
        A0C(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void A0G(C24224Bxc bxc, C24180Bwq bwq, byte[] bArr, byte[] bArr2) {
        String A0y2;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bxc.read(bArr3) != 4) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = A0L;
                A102.append(BE6.A0q(charset, bArr));
                if (bArr2 == null) {
                    A0y2 = "";
                } else {
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append(" or ");
                    A0y2 = AnonymousClass000.A0y(BE6.A0q(charset, bArr2), A103);
                }
                throw BE9.A0e(A0y2, A102);
            }
            int readInt = bxc.readInt();
            bwq.write(bArr3);
            bwq.A00(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            A0S(bxc, bwq, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static void A0L(C26303CxM cxM, Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, C26195CuQ.A02(cxM.A09, new long[]{0}));
    }

    public static void A0M(C26303CxM cxM, String str) {
        if (cxM.A0a(str) == null) {
            cxM.A0I[0].put(str, C26195CuQ.A02(cxM.A09, new long[]{0}));
        }
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [X.BLH, X.Bxc, java.lang.Object, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v15, types: [X.BLH, X.Bxc] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x012e, code lost:
        if (r1 != r0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0130, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0131, code lost:
        r3 = A0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0134, code lost:
        if (r4 < 4) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x013a, code lost:
        if (r6[r4] == r3[r4]) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x013c, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x013f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0140, code lost:
        r3 = A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0143, code lost:
        if (r4 < 4) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r4 = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x014d, code lost:
        if (r6[(r4 + 4) + 4] == r3[r4]) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x014f, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0152, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0154, code lost:
        r1 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0157, code lost:
        r1 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x015a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x015d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x015e, code lost:
        if (r8 == null) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0165, code lost:
        r1 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r3 >= r4.length) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r6[r3] == r4[r3]) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4 = new X.C24224Bxc(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0 = (long) r4.readInt();
        r10 = new byte[4];
        r4.read(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (java.util.Arrays.equals(r10, A0Q) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x046f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r0 != 1) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        r0 = r4.readLong();
        r12 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        r0 = X.C17880vN.A0f("Encountered corrupt PNG file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r0 >= 16) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        r12 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r0 <= 5000) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0684, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0685, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        r0 = 5000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0691, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:?, code lost:
        r2 = A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0694, code lost:
        if (r2 != false) goto L_0x0696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0696, code lost:
        android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x069d, code lost:
        A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06a0, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r0 = r0 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r0 < 8) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r10 = new byte[4];
        r15 = 0;
        r14 = false;
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
        if (r15 >= (r0 / 4)) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        if (r4.read(r10) != 4) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        if (r15 == 1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (java.util.Arrays.equals(r10, A0P) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (java.util.Arrays.equals(r10, A0O) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        if (r14 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b6, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b7, code lost:
        if (r13 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ba, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r4.close();
        r1 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c4, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cc, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cd, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cf, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d2, code lost:
        if (A0M != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d4, code lost:
        android.util.Log.d("ExifInterface", "Exception parsing HEIF file type box.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00db, code lost:
        if (r8 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e0, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r4 = new X.C24224Bxc(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r0 = A07(r4);
        r5.A09 = r0;
        r4.A01 = r0;
        r1 = r4.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fa, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fe, code lost:
        if (r3 != false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0100, code lost:
        r1 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0102, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r4 = new X.C24224Bxc(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r0 = A07(r4);
        r5.A09 = r0;
        r4.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0116, code lost:
        if (r4.readShort() == 85) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0118, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x011c, code lost:
        if (r3 == false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x011e, code lost:
        r1 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0121, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r3 = A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0126, code lost:
        if (r4 < 8) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0128, code lost:
        r1 = r6[r4];
        r0 = r3[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x00fb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0119 */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:70:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017a A[Catch:{ IOException | UnsupportedOperationException -> 0x0691 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x021c A[Catch:{ RuntimeException -> 0x02b5, all -> 0x02bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x024c A[Catch:{ RuntimeException -> 0x02b5, all -> 0x02bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02a7 A[Catch:{ RuntimeException -> 0x02b5, all -> 0x02bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x034b A[Catch:{ IOException | UnsupportedOperationException -> 0x0691 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0411 A[Catch:{ IOException | UnsupportedOperationException -> 0x0691 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0684 A[Catch:{ IOException | UnsupportedOperationException -> 0x0691 }, ExcHandler: all (th java.lang.Throwable), PHI: r4 
      PHI: (r4v9 X.Bxc) = (r4v19 X.Bxc), (r4v20 X.Bxc) binds: [B:86:0x0108, B:72:0x00e6] A[DONT_GENERATE, DONT_INLINE], Splitter:B:72:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0691 A[ExcHandler: IOException | UnsupportedOperationException (r3v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:376:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d4 A[Catch:{ all -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd A[SYNTHETIC, Splitter:B:67:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0121  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:119:0x0160=Splitter:B:119:0x0160, B:96:0x0122=Splitter:B:96:0x0122, B:176:0x0294=Splitter:B:176:0x0294, B:248:0x0444=Splitter:B:248:0x0444, B:90:0x0119=Splitter:B:90:0x0119, B:78:0x00fb=Splitter:B:78:0x00fb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q(java.io.InputStream r20) {
        /*
            r19 = this;
            r7 = 0
            r1 = 0
        L_0x0002:
            r5 = r19
            java.util.HashMap[] r9 = r5.A0I     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r9[r1] = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r1 = r1 + 1
            r0 = 10
            if (r1 < r0) goto L_0x0002
            r0 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = r20
            r2.<init>(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r2.mark(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte[] r6 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r2.read(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r2.reset()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4 = 0
        L_0x0027:
            byte[] r3 = A0S     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 3
            if (r4 >= r0) goto L_0x0168
            byte r1 = r6[r4]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte r0 = r3[r4]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r1 == r0) goto L_0x004a
            java.lang.String r1 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte[] r4 = r1.getBytes(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r3 = 0
        L_0x003d:
            int r0 = r4.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r3 >= r0) goto L_0x0165
            byte r1 = r6[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte r0 = r4[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r1 == r0) goto L_0x0047
            goto L_0x004d
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x003d
        L_0x004a:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x004d:
            r8 = 0
            X.Bxc r4 = new X.Bxc     // Catch:{ Exception -> 0x00cf }
            r4.<init>(r6)     // Catch:{ Exception -> 0x00cf }
            int r0 = r4.readInt()     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r8 = 4
            byte[] r10 = new byte[r8]     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r4.read(r10)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            byte[] r3 = A0Q     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            boolean r3 = java.util.Arrays.equals(r10, r3)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r3 == 0) goto L_0x00c4
            r17 = 1
            r14 = 8
            int r3 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x0079
            long r0 = r4.readLong()     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r12 = 16
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x007b
            goto L_0x00c4
        L_0x0079:
            r12 = 8
        L_0x007b:
            r10 = 5000(0x1388, double:2.4703E-320)
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0083
            r0 = 5000(0x1388, double:2.4703E-320)
        L_0x0083:
            long r0 = r0 - r12
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x00c4
            byte[] r10 = new byte[r8]     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r15 = 0
            r14 = 0
            r13 = 0
        L_0x008e:
            r11 = 4
            long r11 = r0 / r11
            int r3 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x00c4
            int r8 = r4.read(r10)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r3 = 4
            if (r8 != r3) goto L_0x00c4
            int r3 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x00ba
            byte[] r3 = A0P     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            boolean r3 = java.util.Arrays.equals(r10, r3)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r3 == 0) goto L_0x00aa
            goto L_0x00b6
        L_0x00aa:
            byte[] r3 = A0O     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            boolean r3 = java.util.Arrays.equals(r10, r3)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r3 == 0) goto L_0x00b3
            r13 = 1
        L_0x00b3:
            if (r14 == 0) goto L_0x00ba
            goto L_0x00b7
        L_0x00b6:
            r14 = 1
        L_0x00b7:
            if (r13 == 0) goto L_0x00ba
            goto L_0x00bd
        L_0x00ba:
            long r15 = r15 + r17
            goto L_0x008e
        L_0x00bd:
            r4.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = 12
            goto L_0x0169
        L_0x00c4:
            r4.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x00e0
        L_0x00c8:
            r0 = move-exception
            r8 = r4
            goto L_0x0160
        L_0x00cc:
            r3 = move-exception
            r8 = r4
            goto L_0x00d0
        L_0x00cf:
            r3 = move-exception
        L_0x00d0:
            boolean r0 = A0M     // Catch:{ all -> 0x015d }
            if (r0 == 0) goto L_0x00db
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Exception parsing HEIF file type box."
            android.util.Log.d(r1, r0, r3)     // Catch:{ all -> 0x015d }
        L_0x00db:
            if (r8 == 0) goto L_0x00e0
            r8.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x00e0:
            r3 = 0
            X.Bxc r4 = new X.Bxc     // Catch:{ Exception -> 0x00fe, all -> 0x015a }
            r4.<init>(r6)     // Catch:{ Exception -> 0x00fe, all -> 0x015a }
            java.nio.ByteOrder r0 = A07(r4)     // Catch:{ Exception -> 0x00fb, all -> 0x0684 }
            r5.A09 = r0     // Catch:{ Exception -> 0x00fb, all -> 0x0684 }
            r4.A01 = r0     // Catch:{ Exception -> 0x00fb, all -> 0x0684 }
            short r1 = r4.readShort()     // Catch:{ Exception -> 0x00fb, all -> 0x0684 }
            r0 = 20306(0x4f52, float:2.8455E-41)
            if (r1 == r0) goto L_0x00fa
            r0 = 21330(0x5352, float:2.989E-41)
            if (r1 != r0) goto L_0x00fb
        L_0x00fa:
            r3 = 1
        L_0x00fb:
            r4.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x00fe:
            if (r3 == 0) goto L_0x0102
            r1 = 7
            goto L_0x0169
        L_0x0102:
            r3 = 0
            X.Bxc r4 = new X.Bxc     // Catch:{ Exception -> 0x011c, all -> 0x015a }
            r4.<init>(r6)     // Catch:{ Exception -> 0x011c, all -> 0x015a }
            java.nio.ByteOrder r0 = A07(r4)     // Catch:{ Exception -> 0x0119, all -> 0x0684 }
            r5.A09 = r0     // Catch:{ Exception -> 0x0119, all -> 0x0684 }
            r4.A01 = r0     // Catch:{ Exception -> 0x0119, all -> 0x0684 }
            short r1 = r4.readShort()     // Catch:{ Exception -> 0x0119, all -> 0x0684 }
            r0 = 85
            if (r1 != r0) goto L_0x0119
            r3 = 1
        L_0x0119:
            r4.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x011c:
            if (r3 == 0) goto L_0x0121
            r1 = 10
            goto L_0x0169
        L_0x0121:
            r4 = 0
        L_0x0122:
            byte[] r3 = A0Y     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 8
            if (r4 >= r0) goto L_0x0157
            byte r1 = r6[r4]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte r0 = r3[r4]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r4 = r4 + 1
            if (r1 == r0) goto L_0x0122
            r4 = 0
        L_0x0131:
            byte[] r3 = A0f     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 4
            if (r4 >= r0) goto L_0x013f
            byte r1 = r6[r4]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte r0 = r3[r4]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r1 != r0) goto L_0x0152
            int r4 = r4 + 1
            goto L_0x0131
        L_0x013f:
            r4 = 0
        L_0x0140:
            byte[] r3 = A0g     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 4
            if (r4 >= r0) goto L_0x0154
            int r0 = r4 + 4
            int r0 = r0 + 4
            byte r1 = r6[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte r0 = r3[r4]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r1 != r0) goto L_0x0152
            int r4 = r4 + 1
            goto L_0x0140
        L_0x0152:
            r1 = 0
            goto L_0x0169
        L_0x0154:
            r1 = 14
            goto L_0x0169
        L_0x0157:
            r1 = 13
            goto L_0x0169
        L_0x015a:
            r0 = move-exception
            goto L_0x0688
        L_0x015d:
            r0 = move-exception
            if (r8 == 0) goto L_0x0688
        L_0x0160:
            r8.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0688
        L_0x0165:
            r1 = 9
            goto L_0x0169
        L_0x0168:
            r1 = 4
        L_0x0169:
            r5.A00 = r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 4
            if (r1 == r0) goto L_0x0411
            r0 = 9
            if (r1 == r0) goto L_0x0411
            r0 = 13
            if (r1 == r0) goto L_0x0411
            r0 = 14
            if (r1 == r0) goto L_0x0411
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.BLH r4 = new X.BLH     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.<init>(r2, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            boolean r0 = r2.markSupported()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 == 0) goto L_0x0409
            java.io.DataInputStream r1 = r4.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.mark(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r1 = r5.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 12
            if (r1 != r0) goto L_0x02ca
            java.lang.String r6 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 28
            if (r1 < r0) goto L_0x02c2
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.BFT r0 = new X.BFT     // Catch:{ RuntimeException -> 0x02b5 }
            r0.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x02b5 }
            X.C7S.A00(r0, r1)     // Catch:{ RuntimeException -> 0x02b5 }
            r0 = 33
            java.lang.String r13 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r0 = 34
            java.lang.String r11 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r0 = 26
            java.lang.String r3 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r0 = 17
            java.lang.String r2 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            boolean r0 = r6.equals(r3)     // Catch:{ RuntimeException -> 0x02b5 }
            if (r0 == 0) goto L_0x01db
            r0 = 29
            java.lang.String r10 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r0 = 30
            java.lang.String r8 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r0 = 31
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            goto L_0x01f3
        L_0x01db:
            boolean r0 = r6.equals(r2)     // Catch:{ RuntimeException -> 0x02b5 }
            if (r0 == 0) goto L_0x0216
            r0 = 18
            java.lang.String r10 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r0 = 19
            java.lang.String r8 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r0 = 24
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b5 }
        L_0x01f3:
            if (r10 == 0) goto L_0x0204
            r3 = r9[r7]     // Catch:{ RuntimeException -> 0x02b5 }
            java.lang.String r2 = "ImageWidth"
            int r0 = java.lang.Integer.parseInt(r10)     // Catch:{ RuntimeException -> 0x02b5 }
            X.CuQ r0 = A02(r5, r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r3.put(r2, r0)     // Catch:{ RuntimeException -> 0x02b5 }
        L_0x0204:
            if (r8 == 0) goto L_0x0219
            r3 = r9[r7]     // Catch:{ RuntimeException -> 0x02b5 }
            java.lang.String r2 = "ImageLength"
            int r0 = java.lang.Integer.parseInt(r8)     // Catch:{ RuntimeException -> 0x02b5 }
            X.CuQ r0 = A02(r5, r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r3.put(r2, r0)     // Catch:{ RuntimeException -> 0x02b5 }
            goto L_0x0219
        L_0x0216:
            r10 = 0
            r8 = r10
            r6 = r10
        L_0x0219:
            r12 = 6
            if (r6 == 0) goto L_0x023e
            int r3 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x02b5 }
            r0 = 90
            if (r3 == r0) goto L_0x0232
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 == r0) goto L_0x0230
            r2 = 270(0x10e, float:3.78E-43)
            r0 = 8
            if (r3 == r2) goto L_0x0233
            r0 = 1
            goto L_0x0233
        L_0x0230:
            r0 = 3
            goto L_0x0233
        L_0x0232:
            r0 = 6
        L_0x0233:
            r3 = r9[r7]     // Catch:{ RuntimeException -> 0x02b5 }
            java.lang.String r2 = "Orientation"
            X.CuQ r0 = A02(r5, r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r3.put(r2, r0)     // Catch:{ RuntimeException -> 0x02b5 }
        L_0x023e:
            if (r13 == 0) goto L_0x0271
            if (r11 == 0) goto L_0x0271
            int r9 = java.lang.Integer.parseInt(r13)     // Catch:{ RuntimeException -> 0x02b5 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ RuntimeException -> 0x02b5 }
            if (r11 <= r12) goto L_0x02a7
            long r2 = (long) r9     // Catch:{ RuntimeException -> 0x02b5 }
            r4.A01(r2)     // Catch:{ RuntimeException -> 0x02b5 }
            byte[] r2 = new byte[r12]     // Catch:{ RuntimeException -> 0x02b5 }
            int r0 = r4.read(r2)     // Catch:{ RuntimeException -> 0x02b5 }
            if (r0 != r12) goto L_0x02a0
            int r9 = r9 + 6
            int r3 = r11 + -6
            byte[] r0 = A0R     // Catch:{ RuntimeException -> 0x02b5 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ RuntimeException -> 0x02b5 }
            if (r0 == 0) goto L_0x02ae
            byte[] r2 = new byte[r3]     // Catch:{ RuntimeException -> 0x02b5 }
            int r0 = r4.read(r2)     // Catch:{ RuntimeException -> 0x02b5 }
            if (r0 != r3) goto L_0x0299
            r5.A01 = r9     // Catch:{ RuntimeException -> 0x02b5 }
            r5.A0X(r2, r7)     // Catch:{ RuntimeException -> 0x02b5 }
        L_0x0271:
            boolean r0 = A0M     // Catch:{ RuntimeException -> 0x02b5 }
            if (r0 == 0) goto L_0x0294
            java.lang.String r3 = "ExifInterface"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x02b5 }
            java.lang.String r0 = "Heif meta: "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r2.append(r10)     // Catch:{ RuntimeException -> 0x02b5 }
            java.lang.String r0 = "x"
            r2.append(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            r2.append(r8)     // Catch:{ RuntimeException -> 0x02b5 }
            java.lang.String r0 = ", rotation "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r2)     // Catch:{ RuntimeException -> 0x02b5 }
            android.util.Log.d(r3, r0)     // Catch:{ RuntimeException -> 0x02b5 }
        L_0x0294:
            r1.release()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x03fe
        L_0x0299:
            java.lang.String r0 = "Can't read exif"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            goto L_0x02b4
        L_0x02a0:
            java.lang.String r0 = "Can't read identifier"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            goto L_0x02b4
        L_0x02a7:
            java.lang.String r0 = "Invalid exif length"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ RuntimeException -> 0x02b5 }
            goto L_0x02b4
        L_0x02ae:
            java.lang.String r0 = "Invalid identifier"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ RuntimeException -> 0x02b5 }
        L_0x02b4:
            throw r0     // Catch:{ RuntimeException -> 0x02b5 }
        L_0x02b5:
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)     // Catch:{ all -> 0x02bc }
            throw r0     // Catch:{ all -> 0x02bc }
        L_0x02bc:
            r0 = move-exception
            r1.release()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0688
        L_0x02c2:
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0688
        L_0x02ca:
            r2 = 7
            if (r1 != r2) goto L_0x038b
            r5.A0I(r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r6 = 1
            r1 = r9[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "MakerNote"
            X.CuQ r0 = A04(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 == 0) goto L_0x03fe
            byte[] r0 = r0.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.BLH r3 = new X.BLH     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r3.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.io.DataInputStream r1 = r3.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.mark(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.nio.ByteOrder r0 = r5.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r3.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte[] r11 = A0T     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 6
            byte[] r10 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r3.readFully(r10)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 0
            r3.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte[] r8 = A0U     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 10
            byte[] r1 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r3.readFully(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            boolean r0 = java.util.Arrays.equals(r10, r11)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 == 0) goto L_0x030d
            r0 = 8
            goto L_0x0315
        L_0x030d:
            boolean r0 = java.util.Arrays.equals(r1, r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 == 0) goto L_0x0318
            r0 = 12
        L_0x0315:
            r3.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x0318:
            r0 = 6
            r5.A0J(r3, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = r9[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "PreviewImageStart"
            java.lang.Object r8 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = r9[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "PreviewImageLength"
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r8 == 0) goto L_0x033f
            if (r3 == 0) goto L_0x033f
            r2 = 5
            r1 = r9[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "JPEGInterchangeFormat"
            r1.put(r0, r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = r9[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "JPEGInterchangeFormatLength"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x033f:
            r0 = 8
            r1 = r9[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "AspectFrame"
            X.CuQ r1 = A04(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r1 == 0) goto L_0x03fe
            java.nio.ByteOrder r0 = r5.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.Object r8 = r1.A04(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int[] r8 = (int[]) r8     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r8 == 0) goto L_0x0374
            int r1 = r8.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 4
            if (r1 != r0) goto L_0x0374
            r0 = 2
            r3 = r8[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r2 = r8[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r3 <= r2) goto L_0x03fe
            r0 = 3
            r1 = r8[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = r8[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r1 <= r0) goto L_0x03fe
            int r3 = r3 - r2
            int r3 = r3 + 1
            int r1 = r1 - r0
            int r2 = r1 + 1
            if (r3 >= r2) goto L_0x03dc
            int r3 = r3 + r2
            int r2 = r3 - r2
            int r3 = r3 - r2
            goto L_0x03dc
        L_0x0374:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "Invalid aspect frame values. frame="
            r1.append(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = java.util.Arrays.toString(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x03fe
        L_0x038b:
            r0 = 10
            if (r1 != r0) goto L_0x03d8
            boolean r0 = A0M     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 == 0) goto L_0x03a2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "getRw2Attributes starting with: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x03a2:
            r5.A0I(r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = r9[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "JpgFromRaw"
            X.CuQ r1 = A04(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r1 == 0) goto L_0x03bd
            byte[] r0 = r1.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.Bxc r6 = new X.Bxc     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r6.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            long r2 = r1.A02     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r1 = (int) r2     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 5
            r5.A0F(r6, r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x03bd:
            r1 = r9[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "ISO"
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r2 = 1
            r0 = r9[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r1 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r3 == 0) goto L_0x03fe
            if (r0 != 0) goto L_0x03fe
            r0 = r9[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0.put(r1, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x03fe
        L_0x03d8:
            r5.A0I(r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x03fe
        L_0x03dc:
            java.nio.ByteOrder r1 = r5.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int[] r0 = new int[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0[r7] = r3     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.CuQ r3 = X.C26195CuQ.A01(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.nio.ByteOrder r1 = r5.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int[] r0 = new int[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0[r7] = r2     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.CuQ r2 = X.C26195CuQ.A01(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = r9[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = r9[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x03fe:
            int r0 = r5.A01     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            long r0 = (long) r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r5.A0E(r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0689
        L_0x0409:
            java.lang.String r0 = "Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0688
        L_0x0411:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.Bxc r4 = new X.Bxc     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.<init>(r2, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r1 = r5.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 4
            if (r1 != r0) goto L_0x0422
            r5.A0F(r4, r7, r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0689
        L_0x0422:
            r0 = 13
            if (r1 != r0) goto L_0x050e
            boolean r0 = A0M     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 == 0) goto L_0x0439
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "getPngAttributes starting with: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x0439:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 8
            r4.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r10 = 8
        L_0x0444:
            int r1 = r4.readInt()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r9 = 4
            int r2 = r10 + 4
            byte[] r6 = new byte[r9]     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            int r0 = r4.read(r6)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 != r9) goto L_0x045a
            int r10 = r2 + 4
            r0 = 16
            if (r10 != r0) goto L_0x0470
            goto L_0x0461
        L_0x045a:
            java.lang.String r0 = "Encountered invalid length while parsing PNG chunktype"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x046f
        L_0x0461:
            byte[] r0 = A0X     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            boolean r0 = java.util.Arrays.equals(r6, r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 != 0) goto L_0x0470
            java.lang.String r0 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
        L_0x046f:
            throw r0     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
        L_0x0470:
            byte[] r0 = A0W     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            boolean r0 = java.util.Arrays.equals(r6, r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 != 0) goto L_0x0689
            byte[] r0 = A0V     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            boolean r0 = java.util.Arrays.equals(r6, r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 == 0) goto L_0x04fe
            byte[] r8 = new byte[r1]     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            int r0 = r4.read(r8)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 != r1) goto L_0x04ce
            int r4 = r4.readInt()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r3.<init>()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r3.update(r6)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r3.update(r8)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            long r1 = r3.getValue()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            int r0 = (int) r1     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 != r4) goto L_0x04b0
            r5.A01 = r10     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r5.A0X(r8, r7)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r5.A0A()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            X.Bxc r0 = new X.Bxc     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r0.<init>(r8)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r5.A0E(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0689
        L_0x04b0:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r2.append(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r2.append(r4)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = ", calculated CRC value: "
            r2.append(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            long r0 = r3.getValue()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = X.C17880vN.A0u(r2, r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x046f
        L_0x04ce:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "Failed to read given length for given PNG chunk type: "
            r4.append(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 8
            java.lang.StringBuilder r3 = X.BE6.A0t(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r2 = 0
        L_0x04de:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            byte r0 = r6[r2]     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            X.BE6.A1S(r1, r0, r7)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "%02x"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            r3.append(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x04de
            java.lang.String r0 = r3.toString()     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            java.io.IOException r0 = X.BE9.A0e(r0, r4)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x046f
        L_0x04fe:
            int r0 = r1 + 4
            r4.A00(r0)     // Catch:{ EOFException -> 0x0506, IOException | UnsupportedOperationException -> 0x0691 }
            int r10 = r10 + r0
            goto L_0x0444
        L_0x0506:
            java.lang.String r0 = "Encountered corrupt PNG file."
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0688
        L_0x050e:
            r0 = 9
            if (r1 != r0) goto L_0x05d1
            boolean r10 = A0M     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r8 = "ExifInterface"
            if (r10 == 0) goto L_0x0525
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "getRafAttributes starting with: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            android.util.Log.d(r8, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x0525:
            r0 = 84
            r4.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r2 = 4
            byte[] r0 = new byte[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte[] r1 = new byte[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte[] r2 = new byte[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.read(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.read(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.read(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r6 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r1 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r3 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            byte[] r2 = new byte[r1]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r0 = r4.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r0 = r6 - r0
            r4.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.read(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.Bxc r1 = new X.Bxc     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1.<init>(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 5
            r5.A0F(r1, r6, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r0 = r4.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r3 = r3 - r0
            r4.A00(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r6 = r4.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r10 == 0) goto L_0x0584
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "numberOfDirectoryEntry: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            android.util.Log.d(r8, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x0584:
            r3 = 0
        L_0x0585:
            if (r3 >= r6) goto L_0x0689
            int r2 = r4.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r1 = r4.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 273(0x111, float:3.83E-43)
            if (r2 != r0) goto L_0x05b2
            short r6 = r4.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            short r4 = r4.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.CuQ r3 = A02(r5, r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            X.CuQ r2 = A02(r5, r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = r9[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1 = r9[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x05b8
        L_0x05b2:
            r4.A00(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r3 = r3 + 1
            goto L_0x0585
        L_0x05b8:
            if (r10 == 0) goto L_0x0689
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "Updated to length: "
            r1.append(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r1.append(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = ", width: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            android.util.Log.d(r8, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0689
        L_0x05d1:
            r0 = 14
            if (r1 != r0) goto L_0x0689
            boolean r0 = A0M     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 == 0) goto L_0x05e8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "getWebpAttributes starting with: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x05e8:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r4.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r0 = 4
            r4.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r0 = r4.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            int r6 = r0 + 8
            r0 = 4
            r4.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            r2 = 12
        L_0x05fc:
            r1 = 4
            byte[] r8 = new byte[r1]     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            int r0 = r4.read(r8)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 != r1) goto L_0x066f
            int r0 = r2 + 4
            int r3 = r4.readInt()     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            int r2 = r0 + 4
            byte[] r0 = A0b     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            boolean r0 = java.util.Arrays.equals(r0, r8)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 == 0) goto L_0x062b
            byte[] r1 = new byte[r3]     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            int r0 = r4.read(r1)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            if (r0 != r3) goto L_0x063f
            r5.A01 = r2     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            r5.A0X(r1, r7)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            X.Bxc r0 = new X.Bxc     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            r0.<init>(r1)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            r5.A0E(r0)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0689
        L_0x062b:
            int r1 = r3 % 2
            r0 = 1
            if (r1 != r0) goto L_0x0632
            int r3 = r3 + 1
        L_0x0632:
            int r0 = r2 + r3
            if (r0 == r6) goto L_0x0689
            int r0 = r2 + r3
            if (r0 > r6) goto L_0x0676
            r4.A00(r3)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            int r2 = r2 + r3
            goto L_0x05fc
        L_0x063f:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "Failed to read given length for given PNG chunk type: "
            r6.append(r0)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            r4 = 4
            r0 = 8
            java.lang.StringBuilder r3 = X.BE6.A0t(r0)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            r2 = 0
        L_0x0650:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            byte r0 = r8[r2]     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            X.BE6.A1S(r1, r0, r7)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            java.lang.String r0 = "%02x"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            r3.append(r0)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x0650
            java.lang.String r0 = r3.toString()     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            java.io.IOException r0 = X.BE9.A0e(r0, r6)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x067c
        L_0x066f:
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunktype"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x067c
        L_0x0676:
            java.lang.String r0 = "Encountered WebP file with invalid chunk size"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
        L_0x067c:
            throw r0     // Catch:{ EOFException -> 0x067d, IOException | UnsupportedOperationException -> 0x0691 }
        L_0x067d:
            java.lang.String r0 = "Encountered corrupt WebP file."
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
            goto L_0x0688
        L_0x0684:
            r0 = move-exception
            r4.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x0688:
            throw r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0691 }
        L_0x0689:
            r5.A08()
            boolean r0 = A0M
            if (r0 == 0) goto L_0x06a5
            goto L_0x06a2
        L_0x0691:
            r3 = move-exception
            boolean r2 = A0M     // Catch:{ all -> 0x06a6 }
            if (r2 == 0) goto L_0x069d
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r0, r3)     // Catch:{ all -> 0x06a6 }
        L_0x069d:
            r5.A08()
            if (r2 == 0) goto L_0x06a5
        L_0x06a2:
            r5.A09()
        L_0x06a5:
            return
        L_0x06a6:
            r1 = move-exception
            r5.A08()
            boolean r0 = A0M
            if (r0 == 0) goto L_0x06b1
            r5.A09()
        L_0x06b1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26303CxM.A0Q(java.io.InputStream):void");
    }

    private void A0U(String str) {
        int i = 0;
        do {
            this.A0I[i].remove(str);
            i++;
        } while (i < 10);
    }

    public String A0a(String str) {
        C26195CuQ A042;
        NumberFormatException numberFormatException;
        double d;
        StringBuilder A102;
        String str2 = str;
        if ("ISOSpeedRatings".equals(str)) {
            if (A0M) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str2 = "PhotographicSensitivity";
        }
        int i = 0;
        while (true) {
            A042 = A04(str2, this.A0I[i]);
            if (A042 == null) {
                i++;
                if (i >= 10) {
                    A042 = null;
                    break;
                }
            } else {
                break;
            }
        }
        if (A042 != null) {
            if (!A0o.contains(str)) {
                return A042.A05(this.A09);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = A042.A00;
                if (i2 == 5 || i2 == 10) {
                    CVY[] cvyArr = (CVY[]) A042.A04(this.A09);
                    if (cvyArr == null || cvyArr.length != 3) {
                        A102 = AnonymousClass000.A10();
                        A102.append("Invalid GPS Timestamp array. array=");
                        BE6.A1L(A102, cvyArr);
                    } else {
                        Object[] objArr = new Object[3];
                        CVY cvy = cvyArr[0];
                        C17880vN.A1T(objArr, (int) (((float) cvy.A01) / ((float) cvy.A00)), 0);
                        CVY cvy2 = cvyArr[1];
                        C17880vN.A1T(objArr, (int) (((float) cvy2.A01) / ((float) cvy2.A00)), 1);
                        CVY cvy3 = cvyArr[2];
                        C17880vN.A1T(objArr, (int) (((float) cvy3.A01) / ((float) cvy3.A00)), 2);
                        return String.format("%02d:%02d:%02d", objArr);
                    }
                } else {
                    A102 = AnonymousClass000.A10();
                    A102.append("GPS Timestamp format is not rational. format=");
                    A102.append(i2);
                }
                Log.w("ExifInterface", A102.toString());
                return null;
            }
            try {
                Object A043 = A042.A04(this.A09);
                if (A043 != null) {
                    if (A043 instanceof String) {
                        d = Double.parseDouble((String) A043);
                    } else if (A043 instanceof long[]) {
                        long[] jArr = (long[]) A043;
                        if (jArr.length == 1) {
                            d = (double) jArr[0];
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else if (A043 instanceof int[]) {
                        int[] iArr = (int[]) A043;
                        if (iArr.length == 1) {
                            d = (double) iArr[0];
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else if (A043 instanceof double[]) {
                        double[] dArr = (double[]) A043;
                        if (dArr.length == 1) {
                            d = dArr[0];
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else if (A043 instanceof CVY[]) {
                        CVY[] cvyArr2 = (CVY[]) A043;
                        if (cvyArr2.length == 1) {
                            CVY cvy4 = cvyArr2[0];
                            d = ((double) cvy4.A01) / ((double) cvy4.A00);
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else {
                        numberFormatException = new NumberFormatException("Couldn't find a double value");
                    }
                    return Double.toString(d);
                }
                numberFormatException = new NumberFormatException("NULL can't be converted to a double value");
                throw numberFormatException;
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    static {
        Integer[] numArr = new Integer[4];
        numArr[0] = 1;
        C17880vN.A1T(numArr, 6, 1);
        numArr[2] = 3;
        A0q = AnonymousClass8BR.A15(8, numArr, 3);
        Integer[] numArr2 = new Integer[4];
        numArr2[0] = 2;
        Integer A0e2 = C108955ca.A0e();
        BE8.A1A(A0e2, numArr2, 1, 4, 2);
        A0p = AnonymousClass8BR.A15(5, numArr2, 3);
        C25570Ci9[] ci9Arr = new C25570Ci9[42];
        A0W("NewSubfileType", ci9Arr, 254, 4, 0);
        A0W("SubfileType", ci9Arr, 255, 4, 1);
        ci9Arr[2] = new C25570Ci9(256, 3, "ImageWidth", 4);
        ci9Arr[3] = new C25570Ci9(257, 3, "ImageLength", 4);
        A0W("BitsPerSample", ci9Arr, 258, 3, 4);
        A0W("Compression", ci9Arr, 259, 3, 5);
        ci9Arr[6] = A05("PhotometricInterpretation", 262, 3);
        A0W("ImageDescription", ci9Arr, 270, 2, 7);
        ci9Arr[8] = A05("Make", 271, 2);
        ci9Arr[9] = A05("Model", 272, 2);
        ci9Arr[10] = new C25570Ci9(273, 3, "StripOffsets", 4);
        ci9Arr[11] = A05("Orientation", 274, 3);
        ci9Arr[12] = A05("SamplesPerPixel", 277, 3);
        ci9Arr[13] = new C25570Ci9(278, 3, "RowsPerStrip", 4);
        ci9Arr[14] = new C25570Ci9(279, 3, "StripByteCounts", 4);
        ci9Arr[15] = A05("XResolution", 282, 5);
        ci9Arr[16] = A05("YResolution", 283, 5);
        ci9Arr[17] = A05("PlanarConfiguration", 284, 3);
        ci9Arr[18] = A05("ResolutionUnit", 296, 3);
        ci9Arr[19] = A05("TransferFunction", 301, 3);
        ci9Arr[20] = A05("Software", 305, 2);
        ci9Arr[21] = A05("DateTime", 306, 2);
        ci9Arr[22] = A05("Artist", 315, 2);
        ci9Arr[23] = A05("WhitePoint", 318, 5);
        ci9Arr[24] = A05("PrimaryChromaticities", 319, 5);
        ci9Arr[25] = A05("SubIFDPointer", 330, 4);
        ci9Arr[26] = A05("JPEGInterchangeFormat", 513, 4);
        ci9Arr[27] = A05("JPEGInterchangeFormatLength", 514, 4);
        ci9Arr[28] = A05("YCbCrCoefficients", 529, 5);
        ci9Arr[29] = A05("YCbCrSubSampling", 530, 3);
        ci9Arr[30] = A05("YCbCrPositioning", 531, 3);
        ci9Arr[31] = A05("ReferenceBlackWhite", 532, 5);
        ci9Arr[32] = A05("Copyright", 33432, 2);
        ci9Arr[33] = A05("ExifIFDPointer", 34665, 4);
        ci9Arr[34] = A05("GPSInfoIFDPointer", 34853, 4);
        ci9Arr[35] = new C25570Ci9("SensorTopBorder", 4, 4);
        ci9Arr[36] = A05("SensorLeftBorder", 5, 4);
        ci9Arr[37] = A05("SensorBottomBorder", 6, 4);
        ci9Arr[38] = A05("SensorRightBorder", 7, 4);
        ci9Arr[39] = A05("ISO", 23, 3);
        ci9Arr[40] = A05("JpgFromRaw", 46, 7);
        ci9Arr[41] = A05("Xmp", 700, 1);
        A11 = ci9Arr;
        C25570Ci9[] ci9Arr2 = new C25570Ci9[74];
        ci9Arr2[0] = A05("ExposureTime", 33434, 5);
        A0W("FNumber", ci9Arr2, 33437, 5, 1);
        A0W("ExposureProgram", ci9Arr2, 34850, 3, 2);
        A0W("SpectralSensitivity", ci9Arr2, 34852, 2, 3);
        A0W("PhotographicSensitivity", ci9Arr2, 34855, 3, 4);
        A0W("OECF", ci9Arr2, 34856, 7, 5);
        ci9Arr2[6] = A05("SensitivityType", 34864, 3);
        A0W("StandardOutputSensitivity", ci9Arr2, 34865, 4, 7);
        ci9Arr2[8] = A05("RecommendedExposureIndex", 34866, 4);
        ci9Arr2[9] = A05("ISOSpeed", 34867, 4);
        A0W("ISOSpeedLatitudeyyy", ci9Arr2, 34868, 4, 10);
        ci9Arr2[11] = A05("ISOSpeedLatitudezzz", 34869, 4);
        ci9Arr2[12] = A05("ExifVersion", 36864, 2);
        ci9Arr2[13] = A05("DateTimeOriginal", 36867, 2);
        ci9Arr2[14] = A05("DateTimeDigitized", 36868, 2);
        ci9Arr2[15] = A05("OffsetTime", 36880, 2);
        ci9Arr2[16] = A05("OffsetTimeOriginal", 36881, 2);
        ci9Arr2[17] = A05("OffsetTimeDigitized", 36882, 2);
        ci9Arr2[18] = A05("ComponentsConfiguration", 37121, 7);
        ci9Arr2[19] = A05("CompressedBitsPerPixel", 37122, 5);
        ci9Arr2[20] = A05("ShutterSpeedValue", 37377, 10);
        ci9Arr2[21] = A05("ApertureValue", 37378, 5);
        ci9Arr2[22] = A05("BrightnessValue", 37379, 10);
        A0W("ExposureBiasValue", ci9Arr2, 37380, 10, 23);
        ci9Arr2[24] = A05("MaxApertureValue", 37381, 5);
        ci9Arr2[25] = A05("SubjectDistance", 37382, 5);
        ci9Arr2[26] = A05("MeteringMode", 37383, 3);
        ci9Arr2[27] = A05("LightSource", 37384, 3);
        ci9Arr2[28] = A05("Flash", 37385, 3);
        ci9Arr2[29] = A05("FocalLength", 37386, 5);
        ci9Arr2[30] = A05("SubjectArea", 37396, 3);
        ci9Arr2[31] = A05("MakerNote", 37500, 7);
        ci9Arr2[32] = A05("UserComment", 37510, 7);
        ci9Arr2[33] = A05("SubSecTime", 37520, 2);
        ci9Arr2[34] = A05("SubSecTimeOriginal", 37521, 2);
        ci9Arr2[35] = A05("SubSecTimeDigitized", 37522, 2);
        ci9Arr2[36] = A05("FlashpixVersion", 40960, 7);
        ci9Arr2[37] = A05("ColorSpace", 40961, 3);
        ci9Arr2[38] = new C25570Ci9(40962, 3, "PixelXDimension", 4);
        ci9Arr2[39] = new C25570Ci9(40963, 3, "PixelYDimension", 4);
        ci9Arr2[40] = A05("RelatedSoundFile", 40964, 2);
        ci9Arr2[41] = A05("InteroperabilityIFDPointer", 40965, 4);
        ci9Arr2[42] = A05("FlashEnergy", 41483, 5);
        ci9Arr2[43] = A05("SpatialFrequencyResponse", 41484, 7);
        ci9Arr2[44] = A05("FocalPlaneXResolution", 41486, 5);
        ci9Arr2[45] = A05("FocalPlaneYResolution", 41487, 5);
        ci9Arr2[46] = A05("FocalPlaneResolutionUnit", 41488, 3);
        ci9Arr2[47] = A05("SubjectLocation", 41492, 3);
        ci9Arr2[48] = A05("ExposureIndex", 41493, 5);
        ci9Arr2[49] = A05("SensingMethod", 41495, 3);
        ci9Arr2[50] = A05("FileSource", 41728, 7);
        ci9Arr2[51] = A05("SceneType", 41729, 7);
        ci9Arr2[52] = A05("CFAPattern", 41730, 7);
        ci9Arr2[53] = A05("CustomRendered", 41985, 3);
        ci9Arr2[54] = A05("ExposureMode", 41986, 3);
        ci9Arr2[55] = A05("WhiteBalance", 41987, 3);
        ci9Arr2[56] = A05("DigitalZoomRatio", 41988, 5);
        ci9Arr2[57] = A05("FocalLengthIn35mmFilm", 41989, 3);
        ci9Arr2[58] = A05("SceneCaptureType", 41990, 3);
        ci9Arr2[59] = A05("GainControl", 41991, 3);
        ci9Arr2[60] = A05("Contrast", 41992, 3);
        ci9Arr2[61] = A05("Saturation", 41993, 3);
        ci9Arr2[62] = A05("Sharpness", 41994, 3);
        ci9Arr2[63] = A05("DeviceSettingDescription", 41995, 7);
        ci9Arr2[64] = A05("SubjectDistanceRange", 41996, 3);
        ci9Arr2[65] = A05("ImageUniqueID", 42016, 2);
        ci9Arr2[66] = A05("CameraOwnerName", 42032, 2);
        ci9Arr2[67] = A05("BodySerialNumber", 42033, 2);
        ci9Arr2[68] = A05("LensSpecification", 42034, 5);
        ci9Arr2[69] = A05("LensMake", 42035, 2);
        ci9Arr2[70] = A05("LensModel", 42036, 2);
        ci9Arr2[71] = A05("Gamma", 42240, 5);
        ci9Arr2[72] = A05("DNGVersion", 50706, 1);
        ci9Arr2[73] = new C25570Ci9(50720, 3, "DefaultCropSize", 4);
        A0x = ci9Arr2;
        C25570Ci9[] ci9Arr3 = new C25570Ci9[32];
        A0V("GPSVersionID", ci9Arr3, 0, 1);
        A0V("GPSLatitudeRef", ci9Arr3, 1, 2);
        ci9Arr3[2] = new C25570Ci9(2, 5, "GPSLatitude", 10);
        A0V("GPSLongitudeRef", ci9Arr3, 3, 2);
        ci9Arr3[4] = new C25570Ci9(4, 5, "GPSLongitude", 10);
        A0V("GPSAltitudeRef", ci9Arr3, 5, 1);
        A0V("GPSAltitude", ci9Arr3, 6, 5);
        A0V("GPSTimeStamp", ci9Arr3, 7, 5);
        A0V("GPSSatellites", ci9Arr3, 8, 2);
        A0V("GPSStatus", ci9Arr3, 9, 2);
        A0V("GPSMeasureMode", ci9Arr3, 10, 2);
        A0V("GPSDOP", ci9Arr3, 11, 5);
        A0V("GPSSpeedRef", ci9Arr3, 12, 2);
        A0V("GPSSpeed", ci9Arr3, 13, 5);
        A0V("GPSTrackRef", ci9Arr3, 14, 2);
        A0V("GPSTrack", ci9Arr3, 15, 5);
        A0V("GPSImgDirectionRef", ci9Arr3, 16, 2);
        A0V("GPSImgDirection", ci9Arr3, 17, 5);
        A0V("GPSMapDatum", ci9Arr3, 18, 2);
        A0V("GPSDestLatitudeRef", ci9Arr3, 19, 2);
        A0V("GPSDestLatitude", ci9Arr3, 20, 5);
        A0V("GPSDestLongitudeRef", ci9Arr3, 21, 2);
        A0V("GPSDestLongitude", ci9Arr3, 22, 5);
        A0V("GPSDestBearingRef", ci9Arr3, 23, 2);
        A0V("GPSDestBearing", ci9Arr3, 24, 5);
        A0V("GPSDestDistanceRef", ci9Arr3, 25, 2);
        A0V("GPSDestDistance", ci9Arr3, 26, 5);
        A0V("GPSProcessingMethod", ci9Arr3, 27, 7);
        A0V("GPSAreaInformation", ci9Arr3, 28, 7);
        A0V("GPSDateStamp", ci9Arr3, 29, 2);
        A0V("GPSDifferential", ci9Arr3, 30, 3);
        A0V("GPSHPositioningError", ci9Arr3, 31, 5);
        A0y = ci9Arr3;
        C25570Ci9[] ci9Arr4 = {A05("InteroperabilityIndex", 1, 2)};
        A0z = ci9Arr4;
        C25570Ci9[] ci9Arr5 = new C25570Ci9[38];
        A0W("NewSubfileType", ci9Arr5, 254, 4, 0);
        ci9Arr5[1] = A05("SubfileType", 255, 4);
        ci9Arr5[2] = new C25570Ci9(256, 3, "ThumbnailImageWidth", 4);
        ci9Arr5[3] = new C25570Ci9(257, 3, "ThumbnailImageLength", 4);
        A0W("BitsPerSample", ci9Arr5, 258, 3, 4);
        ci9Arr5[5] = A05("Compression", 259, 3);
        ci9Arr5[6] = A05("PhotometricInterpretation", 262, 3);
        A0W("ImageDescription", ci9Arr5, 270, 2, 7);
        ci9Arr5[8] = A05("Make", 271, 2);
        ci9Arr5[9] = A05("Model", 272, 2);
        ci9Arr5[10] = new C25570Ci9(273, 3, "StripOffsets", 4);
        ci9Arr5[11] = A05("ThumbnailOrientation", 274, 3);
        ci9Arr5[12] = A05("SamplesPerPixel", 277, 3);
        ci9Arr5[13] = new C25570Ci9(278, 3, "RowsPerStrip", 4);
        ci9Arr5[14] = new C25570Ci9(279, 3, "StripByteCounts", 4);
        ci9Arr5[15] = A05("XResolution", 282, 5);
        ci9Arr5[16] = A05("YResolution", 283, 5);
        ci9Arr5[17] = A05("PlanarConfiguration", 284, 3);
        ci9Arr5[18] = A05("ResolutionUnit", 296, 3);
        ci9Arr5[19] = A05("TransferFunction", 301, 3);
        ci9Arr5[20] = A05("Software", 305, 2);
        ci9Arr5[21] = A05("DateTime", 306, 2);
        ci9Arr5[22] = A05("Artist", 315, 2);
        ci9Arr5[23] = A05("WhitePoint", 318, 5);
        ci9Arr5[24] = A05("PrimaryChromaticities", 319, 5);
        ci9Arr5[25] = A05("SubIFDPointer", 330, 4);
        ci9Arr5[26] = A05("JPEGInterchangeFormat", 513, 4);
        ci9Arr5[27] = A05("JPEGInterchangeFormatLength", 514, 4);
        ci9Arr5[28] = A05("YCbCrCoefficients", 529, 5);
        ci9Arr5[29] = A05("YCbCrSubSampling", 530, 3);
        ci9Arr5[30] = A05("YCbCrPositioning", 531, 3);
        ci9Arr5[31] = A05("ReferenceBlackWhite", 532, 5);
        ci9Arr5[32] = A05("Xmp", 700, 1);
        ci9Arr5[33] = A05("Copyright", 33432, 2);
        ci9Arr5[34] = A05("ExifIFDPointer", 34665, 4);
        ci9Arr5[35] = A05("GPSInfoIFDPointer", 34853, 4);
        ci9Arr5[36] = A05("DNGVersion", 50706, 1);
        ci9Arr5[37] = new C25570Ci9(50720, 3, "DefaultCropSize", 4);
        A10 = ci9Arr5;
        C25570Ci9[] ci9Arr6 = new C25570Ci9[3];
        A0W("ThumbnailImage", ci9Arr6, 256, 7, 0);
        ci9Arr6[1] = A05("CameraSettingsIFDPointer", 8224, 4);
        ci9Arr6[2] = A05("ImageProcessingIFDPointer", 8256, 4);
        A14 = ci9Arr6;
        C25570Ci9[] ci9Arr7 = new C25570Ci9[2];
        A0W("PreviewImageStart", ci9Arr7, 257, 4, 0);
        ci9Arr7[1] = A05("PreviewImageLength", 258, 4);
        A12 = ci9Arr7;
        C25570Ci9[] ci9Arr8 = {A05("AspectFrame", 4371, 3)};
        A13 = ci9Arr8;
        C25570Ci9[] ci9Arr9 = new C25570Ci9[1];
        A0W("ColorSpace", ci9Arr9, 55, 3, 0);
        A15 = ci9Arr9;
        C25570Ci9[][] ci9Arr10 = new C25570Ci9[10][];
        AnonymousClass8BS.A1B(ci9Arr, ci9Arr2, ci9Arr10);
        ci9Arr10[2] = ci9Arr3;
        ci9Arr10[3] = ci9Arr4;
        ci9Arr10[4] = ci9Arr5;
        ci9Arr10[5] = ci9Arr;
        ci9Arr10[6] = ci9Arr6;
        ci9Arr10[7] = ci9Arr7;
        C17890vO.A0x(ci9Arr8, ci9Arr9, ci9Arr10);
        A0m = ci9Arr10;
        C25570Ci9[] ci9Arr11 = new C25570Ci9[6];
        A0W("SubIFDPointer", ci9Arr11, 330, 4, 0);
        ci9Arr11[1] = A05("ExifIFDPointer", 34665, 4);
        ci9Arr11[2] = A05("GPSInfoIFDPointer", 34853, 4);
        A0W("InteroperabilityIFDPointer", ci9Arr11, 40965, 4, 3);
        A0W("CameraSettingsIFDPointer", ci9Arr11, 8224, 1, 4);
        ci9Arr11[5] = A05("ImageProcessingIFDPointer", 8256, 1);
        A0w = ci9Arr11;
        String[] A1b = C17880vN.A1b("FNumber", "DigitalZoomRatio", 5, 1);
        A1b[2] = "ExposureTime";
        A1b[3] = "SubjectDistance";
        A0o = C17900vP.A0I("GPSTimeStamp", A1b, 4);
        Charset forName = Charset.forName("US-ASCII");
        A0L = forName;
        A0R = "Exif\u0000\u0000".getBytes(forName);
        A0v = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        A0J = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        A0K = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C25570Ci9[][] ci9Arr12 = A0m;
            if (i < 10) {
                A16[i] = C17880vN.A11();
                A17[i] = C17880vN.A11();
                for (C25570Ci9 ci9 : ci9Arr12[i]) {
                    C108955ca.A1V(ci9, A16[i], ci9.A00);
                    A17[i].put(ci9.A03, ci9);
                }
                i++;
            } else {
                HashMap hashMap = A0n;
                C25570Ci9[] ci9Arr13 = A0w;
                C108955ca.A1V(5, hashMap, ci9Arr13[0].A00);
                C108955ca.A1V(1, hashMap, ci9Arr13[1].A00);
                C108955ca.A1V(2, hashMap, ci9Arr13[2].A00);
                C108955ca.A1V(3, hashMap, ci9Arr13[3].A00);
                C108955ca.A1V(A0e2, hashMap, ci9Arr13[4].A00);
                C108955ca.A1V(8, hashMap, ci9Arr13[5].A00);
                return;
            }
        }
    }

    public static int A00(C26195CuQ cuQ, C26303CxM cxM) {
        Object A042 = cuQ.A04(cxM.A09);
        if (A042 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (A042 instanceof String) {
            return Integer.parseInt((String) A042);
        } else {
            if (A042 instanceof long[]) {
                long[] jArr = (long[]) A042;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (A042 instanceof int[]) {
                int[] iArr = (int[]) A042;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:63|64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        java.lang.Double.parseDouble(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0111, code lost:
        return X.C108945cZ.A0N(12, -1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0104 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(java.lang.String r13) {
        /*
            java.lang.String r1 = ","
            boolean r0 = r13.contains(r1)
            r8 = 0
            r6 = 1
            r9 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x0083
            java.lang.String[] r7 = r13.split(r1, r4)
            r0 = r7[r8]
            android.util.Pair r8 = A01(r0)
            int r0 = X.C108965cb.A01(r8)
            if (r0 != r9) goto L_0x0025
        L_0x0024:
            return r8
        L_0x0025:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x0024
            r0 = r7[r6]
            android.util.Pair r9 = A01(r0)
            java.lang.Object r10 = r9.first
            java.lang.Object r0 = r8.first
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r8.first
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007e
            r2 = -1
        L_0x0043:
            int r0 = X.C108965cb.A00(r8)
            if (r0 == r4) goto L_0x007c
            java.lang.Object r0 = r8.second
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r8.second
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007c
        L_0x005b:
            int r0 = X.C108965cb.A00(r8)
        L_0x005f:
            if (r2 != r4) goto L_0x0068
            if (r0 != r4) goto L_0x0068
            android.util.Pair r0 = X.C108945cZ.A0N(r5, r3)
            return r0
        L_0x0068:
            if (r2 != r4) goto L_0x0075
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x006e:
            android.util.Pair r8 = X.C108945cZ.A0N(r0, r3)
        L_0x0072:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x0075:
            if (r0 != r4) goto L_0x0072
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x006e
        L_0x007c:
            r0 = -1
            goto L_0x005f
        L_0x007e:
            int r2 = X.C108965cb.A01(r8)
            goto L_0x0043
        L_0x0083:
            java.lang.String r1 = "/"
            boolean r0 = r13.contains(r1)
            r11 = 0
            if (r0 == 0) goto L_0x00d3
            java.lang.String[] r2 = r13.split(r1, r4)
            int r0 = r2.length
            if (r0 != r9) goto L_0x0112
            r0 = r2[r8]     // Catch:{ NumberFormatException -> 0x0112 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0112 }
            long r7 = (long) r0     // Catch:{ NumberFormatException -> 0x0112 }
            r0 = r2[r6]     // Catch:{ NumberFormatException -> 0x0112 }
            double r9 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0112 }
            long r1 = (long) r9     // Catch:{ NumberFormatException -> 0x0112 }
            r6 = 10
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00ca
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00ca
            r4 = 5
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00c1
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00c1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0112 }
            android.util.Pair r8 = X.C17890vO.A0E(r0, r4)     // Catch:{ NumberFormatException -> 0x0112 }
            return r8
        L_0x00c1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0112 }
            android.util.Pair r0 = X.C108945cZ.A0N(r0, r3)     // Catch:{ NumberFormatException -> 0x0112 }
            return r0
        L_0x00ca:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0112 }
            android.util.Pair r8 = X.C108945cZ.A0N(r0, r3)     // Catch:{ NumberFormatException -> 0x0112 }
            return r8
        L_0x00d3:
            long r6 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x0104 }
            r4 = 4
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00ec
            r1 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ec
            java.lang.Integer r0 = X.C17880vN.A0j()     // Catch:{ NumberFormatException -> 0x0104 }
            android.util.Pair r8 = X.C17890vO.A0E(r0, r4)     // Catch:{ NumberFormatException -> 0x0104 }
            return r8
        L_0x00ec:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fb
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0104 }
            android.util.Pair r8 = X.C108945cZ.A0N(r0, r3)     // Catch:{ NumberFormatException -> 0x0104 }
            return r8
        L_0x00fb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0104 }
            android.util.Pair r8 = X.C108945cZ.A0N(r0, r3)     // Catch:{ NumberFormatException -> 0x0104 }
            return r8
        L_0x0104:
            java.lang.Double.parseDouble(r13)     // Catch:{ NumberFormatException -> 0x0112 }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0112 }
            android.util.Pair r0 = X.C108945cZ.A0N(r0, r3)     // Catch:{ NumberFormatException -> 0x0112 }
            return r0
        L_0x0112:
            android.util.Pair r0 = X.C108945cZ.A0N(r5, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26303CxM.A01(java.lang.String):android.util.Pair");
    }

    public static C25570Ci9 A05(String str, int i, int i2) {
        return new C25570Ci9(str, i, i2);
    }

    private void A08() {
        String A0a2 = A0a("DateTimeOriginal");
        if (A0a2 != null && A0a("DateTime") == null) {
            this.A0I[0].put("DateTime", C26195CuQ.A00(A0a2));
        }
        A0M(this, "ImageWidth");
        A0M(this, "ImageLength");
        A0M(this, "Orientation");
        if (A0a("LightSource") == null) {
            A0L(this, "LightSource", this.A0I[1]);
        }
    }

    private void A0B(int i, int i2) {
        String str;
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && !hashMapArr[i2].isEmpty()) {
            C26195CuQ A042 = A04("ImageLength", hashMap);
            C26195CuQ A043 = A04("ImageWidth", hashMapArr[i]);
            C26195CuQ A044 = A04("ImageLength", hashMapArr[i2]);
            C26195CuQ A045 = A04("ImageWidth", hashMapArr[i2]);
            if (A042 == null || A043 == null) {
                if (A0M) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (A044 != null && A045 != null) {
                int A002 = A00(A042, this);
                int A003 = A00(A043, this);
                int A004 = A00(A044, this);
                int A005 = A00(A045, this);
                if (A002 < A004 && A003 < A005) {
                    HashMap hashMap2 = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap2;
                    return;
                }
                return;
            } else if (A0M) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
        } else if (A0M) {
            str = "Cannot perform swap since only one image data exists";
        } else {
            return;
        }
        Log.d("ExifInterface", str);
    }

    private void A0C(int i, String str, String str2) {
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && hashMap.get(str) != null) {
            HashMap hashMap2 = hashMapArr[i];
            hashMap2.put(str2, hashMap2.get(str));
            hashMapArr[i].remove(str);
        }
    }

    private void A0E(C24224Bxc bxc) {
        long[] jArr;
        long[] jArr2;
        String str;
        int length;
        int length2;
        String str2;
        StringBuilder A102;
        long[] jArr3;
        long[] jArr4;
        C26195CuQ A042;
        int A002;
        HashMap hashMap = this.A0I[4];
        C26195CuQ A043 = A04("Compression", hashMap);
        C24224Bxc bxc2 = bxc;
        if (A043 != null) {
            int A003 = A00(A043, this);
            this.A03 = A003;
            if (A003 != 1) {
                if (A003 != 6) {
                    if (A003 != 7) {
                        return;
                    }
                }
            }
            C26195CuQ A044 = A04("BitsPerSample", hashMap);
            if (A044 != null) {
                int[] iArr = (int[]) A044.A04(this.A09);
                int[] iArr2 = A0j;
                if (Arrays.equals(iArr2, iArr) || (this.A00 == 3 && (A042 = A04("PhotometricInterpretation", hashMap)) != null && ((A002 = A00(A042, this)) != 1 ? !(A002 != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, A0i)))) {
                    C26195CuQ A045 = A04("StripOffsets", hashMap);
                    C26195CuQ A046 = A04("StripByteCounts", hashMap);
                    if (A045 != null && A046 != null) {
                        Object A047 = A045.A04(this.A09);
                        if (A047 instanceof int[]) {
                            int[] iArr3 = (int[]) A047;
                            int length3 = iArr3.length;
                            jArr = new long[length3];
                            for (int i = 0; i < length3; i++) {
                                jArr[i] = (long) iArr3[i];
                            }
                        } else {
                            if (A047 instanceof long[]) {
                                jArr4 = (long[]) A047;
                            } else {
                                jArr4 = null;
                            }
                            jArr = jArr4;
                        }
                        Object A048 = A046.A04(this.A09);
                        if (A048 instanceof int[]) {
                            int[] iArr4 = (int[]) A048;
                            int length4 = iArr4.length;
                            jArr2 = new long[length4];
                            for (int i2 = 0; i2 < length4; i2++) {
                                jArr2[i2] = (long) iArr4[i2];
                            }
                        } else {
                            if (A048 instanceof long[]) {
                                jArr3 = (long[]) A048;
                            } else {
                                jArr3 = null;
                            }
                            jArr2 = jArr3;
                        }
                        if (jArr == null || (length = jArr.length) == 0) {
                            str = "stripOffsets should not be null or have zero length.";
                        } else if (jArr2 == null || (length2 = jArr2.length) == 0) {
                            str = "stripByteCounts should not be null or have zero length.";
                        } else if (length != length2) {
                            str = "stripOffsets and stripByteCounts should have same length.";
                        } else {
                            boolean z = false;
                            long j = 0;
                            int i3 = 0;
                            do {
                                j += jArr2[i3];
                                i3++;
                            } while (i3 < length2);
                            int i4 = (int) j;
                            byte[] bArr = new byte[i4];
                            int i5 = 1;
                            this.A0B = true;
                            this.A0D = true;
                            this.A0C = true;
                            int i6 = 0;
                            int i7 = 0;
                            int i8 = 0;
                            do {
                                int i9 = (int) jArr[i6];
                                int i10 = (int) jArr2[i6];
                                if (i6 < length - i5 && ((long) (i9 + i10)) != jArr[i6 + 1]) {
                                    this.A0B = z;
                                }
                                int i11 = i9 - i7;
                                if (i11 < 0) {
                                    str2 = "Invalid strip offset value";
                                } else {
                                    long j2 = (long) i11;
                                    if (bxc2.skip(j2) != j2) {
                                        A102 = AnonymousClass000.A10();
                                        A102.append("Failed to skip ");
                                        A102.append(i11);
                                    } else {
                                        int i12 = i7 + i11;
                                        byte[] bArr2 = new byte[i10];
                                        if (bxc2.read(bArr2) != i10) {
                                            A102 = AnonymousClass000.A10();
                                            A102.append("Failed to read ");
                                            A102.append(i10);
                                        } else {
                                            i7 = i12 + i10;
                                            System.arraycopy(bArr2, 0, bArr, i8, i10);
                                            i8 += i10;
                                            i6++;
                                            z = false;
                                            i5 = 1;
                                        }
                                    }
                                    str2 = AnonymousClass000.A0y(" bytes.", A102);
                                }
                                Log.d("ExifInterface", str2);
                                return;
                            } while (i6 < length);
                            this.A0F = bArr;
                            if (this.A0B) {
                                this.A05 = (int) jArr[0];
                                this.A04 = i4;
                                return;
                            }
                            return;
                        }
                        Log.w("ExifInterface", str);
                        return;
                    }
                    return;
                }
            }
            if (A0M) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        this.A03 = 6;
        C26195CuQ A049 = A04("JPEGInterchangeFormat", hashMap);
        C26195CuQ A0410 = A04("JPEGInterchangeFormatLength", hashMap);
        if (A049 != null && A0410 != null) {
            int A004 = A00(A049, this);
            int A005 = A00(A0410, this);
            if (this.A00 == 7) {
                A004 += this.A02;
            }
            if (A004 > 0 && A005 > 0) {
                this.A0C = true;
                if (this.A08 == null && this.A06 == null && this.A07 == null) {
                    byte[] bArr3 = new byte[A005];
                    bxc2.skip((long) A004);
                    bxc2.read(bArr3);
                    this.A0F = bArr3;
                }
                this.A05 = A004;
                this.A04 = A005;
            }
            if (A0M) {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("Setting thumbnail attributes with offset: ");
                A103.append(A004);
                Log.d("ExifInterface", AnonymousClass001.A1I(", length: ", A103, A005));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(X.C24224Bxc r25, int r26, int r27) {
        /*
            r24 = this;
            boolean r17 = A0M
            java.lang.String r6 = "ExifInterface"
            r7 = r25
            if (r17 == 0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "getJpegAttributes starting with: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)
            android.util.Log.d(r6, r0)
        L_0x0015:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r7.A01 = r0
            byte r0 = r7.readByte()
            java.lang.String r2 = "Invalid marker: "
            r3 = -1
            if (r0 != r3) goto L_0x01a7
            r5 = 1
            byte r1 = r7.readByte()
            r0 = -40
            if (r1 != r0) goto L_0x0198
            r9 = 2
        L_0x002c:
            byte r2 = r7.readByte()
            if (r2 != r3) goto L_0x0184
            int r3 = r9 + 1
            byte r1 = r7.readByte()
            if (r17 == 0) goto L_0x0050
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Found JPEG segment indicator: "
            r2.append(r0)
            r0 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            android.util.Log.d(r6, r0)
        L_0x0050:
            int r2 = r3 + 1
            r0 = -39
            r4 = r24
            if (r1 == r0) goto L_0x017f
            r0 = -38
            if (r1 == r0) goto L_0x017f
            int r0 = r7.readUnsignedShort()
            int r8 = r0 + -2
            int r9 = r2 + 2
            if (r17 == 0) goto L_0x0085
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "JPEG segment: "
            r2.append(r0)
            r0 = r1 & 255(0xff, float:3.57E-43)
            X.BE7.A10(r0, r2)
            java.lang.String r0 = " (length: "
            r2.append(r0)
            int r0 = r8 + 2
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass8BU.A0q(r2)
            android.util.Log.d(r6, r0)
        L_0x0085:
            java.lang.String r16 = "Invalid length"
            if (r8 < 0) goto L_0x017a
            r0 = -31
            r14 = 0
            r10 = r27
            if (r1 == r0) goto L_0x00e4
            r0 = -2
            if (r1 == r0) goto L_0x014f
            switch(r1) {
                case -64: goto L_0x00a5;
                case -63: goto L_0x00a5;
                case -62: goto L_0x00a5;
                case -61: goto L_0x00a5;
                default: goto L_0x0096;
            }
        L_0x0096:
            switch(r1) {
                case -59: goto L_0x00a5;
                case -58: goto L_0x00a5;
                case -57: goto L_0x00a5;
                default: goto L_0x0099;
            }
        L_0x0099:
            switch(r1) {
                case -55: goto L_0x00a5;
                case -54: goto L_0x00a5;
                case -53: goto L_0x00a5;
                default: goto L_0x009c;
            }
        L_0x009c:
            switch(r1) {
                case -51: goto L_0x00a5;
                case -50: goto L_0x00a5;
                case -49: goto L_0x00a5;
                default: goto L_0x009f;
            }
        L_0x009f:
            r7.A00(r8)
            int r9 = r9 + r8
            r3 = -1
            goto L_0x002c
        L_0x00a5:
            r7.A00(r5)
            java.util.HashMap[] r13 = r4.A0I
            r12 = r13[r27]
            r11 = 4
            if (r10 == r11) goto L_0x00e1
            java.lang.String r3 = "ImageLength"
        L_0x00b1:
            int r0 = r7.readUnsignedShort()
            long r0 = (long) r0
            java.nio.ByteOrder r14 = r4.A09
            long[] r2 = new long[r5]
            r15 = 0
            r2[r15] = r0
            X.CuQ r0 = X.C26195CuQ.A02(r14, r2)
            r12.put(r3, r0)
            r2 = r13[r27]
            if (r10 == r11) goto L_0x00de
            java.lang.String r1 = "ImageWidth"
        L_0x00ca:
            int r0 = r7.readUnsignedShort()
            X.CuQ r0 = A03(r4, r0)
            r2.put(r1, r0)
            int r8 = r8 + -5
            if (r8 >= 0) goto L_0x009f
            java.io.IOException r0 = X.C17880vN.A0f(r16)
            throw r0
        L_0x00de:
            java.lang.String r1 = "ThumbnailImageWidth"
            goto L_0x00ca
        L_0x00e1:
            java.lang.String r3 = "ThumbnailImageLength"
            goto L_0x00b1
        L_0x00e4:
            byte[] r11 = new byte[r8]
            r7.readFully(r11)
            int r13 = r8 + r9
            byte[] r12 = A0R
            if (r12 == 0) goto L_0x0113
            int r3 = r12.length
            if (r8 < r3) goto L_0x0113
            r2 = 0
        L_0x00f3:
            if (r2 >= r3) goto L_0x00fe
            byte r1 = r11[r2]
            byte r0 = r12[r2]
            if (r1 != r0) goto L_0x0113
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x00fe:
            byte[] r1 = java.util.Arrays.copyOfRange(r11, r3, r8)
            int r0 = r26 + r9
            int r0 = r0 + r3
            r4.A01 = r0
            r4.A0X(r1, r10)
            X.Bxc r0 = new X.Bxc
            r0.<init>(r1)
            r4.A0E(r0)
            goto L_0x014d
        L_0x0113:
            byte[] r10 = A0v
            if (r10 == 0) goto L_0x014d
            int r3 = r10.length
            if (r8 < r3) goto L_0x014d
            r2 = 0
        L_0x011b:
            if (r2 >= r3) goto L_0x0126
            byte r1 = r11[r2]
            byte r0 = r10[r2]
            if (r1 != r0) goto L_0x014d
            int r2 = r2 + 1
            goto L_0x011b
        L_0x0126:
            int r9 = r9 + r3
            byte[] r11 = java.util.Arrays.copyOfRange(r11, r3, r8)
            java.lang.String r10 = "Xmp"
            java.lang.String r0 = r4.A0a(r10)
            if (r0 != 0) goto L_0x014d
            java.util.HashMap[] r0 = r4.A0I
            r8 = r0[r14]
            int r3 = r11.length
            long r1 = (long) r9
            X.CuQ r0 = new X.CuQ
            r19 = r1
            r21 = r11
            r22 = r5
            r23 = r3
            r18 = r0
            r18.<init>(r19, r21, r22, r23)
            r8.put(r10, r0)
            r4.A0E = r5
        L_0x014d:
            r9 = r13
            goto L_0x0170
        L_0x014f:
            byte[] r3 = new byte[r8]
            int r0 = r7.read(r3)
            if (r0 != r8) goto L_0x0173
            java.lang.String r2 = "UserComment"
            java.lang.String r0 = r4.A0a(r2)
            if (r0 != 0) goto L_0x0170
            java.util.HashMap[] r0 = r4.A0I
            r1 = r0[r5]
            java.nio.charset.Charset r0 = A0L
            java.lang.String r0 = X.BE6.A0q(r0, r3)
            X.CuQ r0 = X.C26195CuQ.A00(r0)
            r1.put(r2, r0)
        L_0x0170:
            r8 = 0
            goto L_0x009f
        L_0x0173:
            java.lang.String r0 = "Invalid exif"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x017a:
            java.io.IOException r0 = X.C17880vN.A0f(r16)
            throw r0
        L_0x017f:
            java.nio.ByteOrder r0 = r4.A09
            r7.A01 = r0
            return
        L_0x0184:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid marker:"
            r1.append(r0)
            r0 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.io.IOException r0 = X.BE9.A0e(r0, r1)
            throw r0
        L_0x0198:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.io.IOException r0 = X.BE9.A0e(r0, r1)
            throw r0
        L_0x01a7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.io.IOException r0 = X.BE9.A0e(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26303CxM.A0F(X.Bxc, int, int):void");
    }

    private void A0H(C24180Bwq bwq) {
        HashMap[] hashMapArr;
        byte[] bArr;
        long j;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        C25570Ci9[] ci9Arr = A0w;
        int i = 0;
        do {
            A0U(ci9Arr[i].A03);
            i++;
        } while (i < 6);
        if (this.A0C) {
            if (this.A0D) {
                A0U("StripOffsets");
                A0U("StripByteCounts");
            } else {
                A0U("JPEGInterchangeFormat");
                A0U("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        do {
            hashMapArr = this.A0I;
            for (Object obj : hashMapArr[i2].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    hashMapArr[i2].remove(entry.getKey());
                }
            }
            i2++;
        } while (i2 < 10);
        if (!hashMapArr[1].isEmpty()) {
            A0L(this, ci9Arr[1].A03, hashMapArr[0]);
        }
        if (!hashMapArr[2].isEmpty()) {
            A0L(this, ci9Arr[2].A03, hashMapArr[0]);
        }
        if (!hashMapArr[3].isEmpty()) {
            A0L(this, ci9Arr[3].A03, hashMapArr[1]);
        }
        if (this.A0C) {
            boolean z = this.A0D;
            HashMap hashMap = hashMapArr[4];
            if (z) {
                hashMap.put("StripOffsets", C26195CuQ.A01(this.A09, new int[]{0}));
                hashMapArr[4].put("StripByteCounts", C26195CuQ.A01(this.A09, new int[]{this.A04}));
            } else {
                A0L(this, "JPEGInterchangeFormat", hashMap);
                hashMapArr[4].put("JPEGInterchangeFormatLength", A03(this, this.A04));
            }
        }
        int i3 = 0;
        do {
            Iterator A0i2 = C17890vO.A0i(hashMapArr[i3]);
            int i4 = 0;
            while (A0i2.hasNext()) {
                C26195CuQ cuQ = (C26195CuQ) C17890vO.A0P(A0i2);
                int i5 = A0k[cuQ.A00] * cuQ.A01;
                if (i5 > 4) {
                    i4 += i5;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
            i3++;
        } while (i3 < 10);
        int i6 = 8;
        int i7 = 0;
        do {
            if (!hashMapArr[i7].isEmpty()) {
                iArr[i7] = i6;
                i6 = BE6.A0J(iArr2, i7, (hashMapArr[i7].size() * 12) + 2 + 4, i6);
            }
            i7++;
        } while (i7 < 10);
        if (this.A0C) {
            boolean z2 = this.A0D;
            HashMap hashMap2 = hashMapArr[4];
            if (z2) {
                hashMap2.put("StripOffsets", C26195CuQ.A01(this.A09, new int[]{i6}));
            } else {
                hashMap2.put("JPEGInterchangeFormat", A03(this, i6));
            }
            this.A05 = i6;
            i6 += this.A04;
        }
        if (this.A00 == 4) {
            i6 += 8;
        }
        if (A0M) {
            int i8 = 0;
            do {
                Object[] objArr = new Object[5];
                C17880vN.A1T(objArr, i8, 0);
                C17880vN.A1T(objArr, iArr[i8], 1);
                C17880vN.A1T(objArr, hashMapArr[i8].size(), 2);
                C17890vO.A1G(objArr, iArr2[i8]);
                C17880vN.A1T(objArr, i6, 4);
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", objArr));
                i8++;
            } while (i8 < 10);
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(ci9Arr[1].A03, A03(this, iArr[1]));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(ci9Arr[2].A03, A03(this, iArr[2]));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(ci9Arr[3].A03, A03(this, iArr[3]));
        }
        int i9 = this.A00;
        C24180Bwq bwq2 = bwq;
        if (i9 == 4) {
            bwq2.A01((short) i6);
            bArr = A0R;
            bwq2.write(bArr);
        } else if (i9 == 13) {
            bwq2.A00(i6);
            bArr = A0V;
            bwq2.write(bArr);
        } else if (i9 == 14) {
            bwq2.write(A0b);
            bwq2.A00(i6);
        }
        ByteOrder byteOrder = this.A09;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        short s = 18761;
        if (byteOrder == byteOrder2) {
            s = 19789;
        }
        bwq2.A01(s);
        bwq2.A00 = this.A09;
        bwq2.A01(42);
        bwq2.A00(8);
        int i10 = 0;
        do {
            if (!hashMapArr[i10].isEmpty()) {
                bwq2.A01((short) hashMapArr[i10].size());
                HashMap hashMap3 = hashMapArr[i10];
                int size = iArr[i10] + 2 + (hashMap3.size() * 12) + 4;
                Iterator A0i3 = C17890vO.A0i(hashMap3);
                while (A0i3.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(A0i3);
                    int i11 = ((C25570Ci9) A17[i10].get(A162.getKey())).A00;
                    C26195CuQ cuQ2 = (C26195CuQ) A162.getValue();
                    int[] iArr3 = A0k;
                    int i12 = cuQ2.A00;
                    int i13 = iArr3[i12];
                    int i14 = cuQ2.A01;
                    int i15 = i13 * i14;
                    bwq2.A01((short) i11);
                    bwq2.A01((short) i12);
                    bwq2.A00(i14);
                    if (i15 > 4) {
                        bwq2.A00((int) ((long) size));
                        size += i15;
                    } else {
                        bwq2.write(cuQ2.A03);
                        while (i15 < 4) {
                            bwq2.A01.write(0);
                            i15++;
                        }
                    }
                }
                if (i10 != 0 || hashMapArr[4].isEmpty()) {
                    j = 0;
                } else {
                    j = (long) iArr[4];
                }
                bwq2.A00((int) j);
                Iterator A0i4 = C17890vO.A0i(hashMapArr[i10]);
                while (A0i4.hasNext()) {
                    byte[] bArr2 = ((C26195CuQ) C17890vO.A0P(A0i4)).A03;
                    int length = bArr2.length;
                    if (length > 4) {
                        bwq2.write(bArr2, 0, length);
                    }
                }
            }
            i10++;
        } while (i10 < 10);
        if (this.A0C) {
            bwq2.write(A0d());
        }
        if (this.A00 == 14 && i6 % 2 == 1) {
            bwq2.A01.write(0);
        }
        bwq2.A00 = byteOrder2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d3, code lost:
        if (r12 == 7) goto L_0x01d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0J(X.BLH r26, int r27) {
        /*
            r25 = this;
            r9 = r25
            java.util.Set r0 = r9.A0A
            r24 = r0
            r10 = r26
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r24
            r0.add(r1)
            short r23 = r10.readShort()
            boolean r22 = A0M
            java.lang.String r8 = "ExifInterface"
            if (r22 == 0) goto L_0x002c
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "numberOfDirectoryEntry: "
            r0 = r23
            java.lang.String r0 = X.AnonymousClass001.A1I(r1, r2, r0)
            android.util.Log.d(r8, r0)
        L_0x002c:
            if (r23 <= 0) goto L_0x0307
            r2 = 0
            r21 = 0
        L_0x0031:
            r4 = 5
            r1 = r21
            r0 = r23
            if (r1 >= r0) goto L_0x02b0
            int r13 = r10.readUnsignedShort()
            int r12 = r10.readUnsignedShort()
            int r11 = r10.readInt()
            int r0 = r10.A00
            long r2 = (long) r0
            r15 = 4
            long r2 = r2 + r15
            java.util.HashMap[] r0 = A16
            r0 = r0[r27]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            java.lang.Object r6 = r0.get(r7)
            X.Ci9 r6 = (X.C25570Ci9) r6
            r5 = 3
            if (r22 == 0) goto L_0x0074
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            X.AnonymousClass8BS.A1B(r0, r7, r4)
            if (r6 == 0) goto L_0x02ad
            java.lang.String r1 = r6.A03
        L_0x0068:
            r0 = 2
            X.BE8.A1A(r1, r4, r0, r12, r5)
            X.AnonymousClass3Ma.A1T(r4, r11)
            java.lang.String r0 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            X.BE7.A1L(r0, r8, r4)
        L_0x0074:
            r14 = 7
            if (r6 != 0) goto L_0x0096
            if (r22 == 0) goto L_0x008c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skip the tag entry since tag number is not defined: "
            r1.append(r0)
            r1.append(r13)
        L_0x0085:
            java.lang.String r0 = r1.toString()
        L_0x0089:
            android.util.Log.d(r8, r0)
        L_0x008c:
            r10.A01(r2)
        L_0x008f:
            int r0 = r21 + 1
            short r0 = (short) r0
            r21 = r0
            r2 = 0
            goto L_0x0031
        L_0x0096:
            if (r12 <= 0) goto L_0x029d
            int[] r13 = A0k
            r0 = 14
            if (r12 >= r0) goto L_0x029d
            int r4 = r6.A01
            if (r4 == r14) goto L_0x01d3
            if (r12 == r14) goto L_0x01d5
            if (r4 == r12) goto L_0x01d3
            int r1 = r6.A02
            if (r1 == r12) goto L_0x01d3
            r0 = 4
            if (r4 == r0) goto L_0x00af
            if (r1 != r0) goto L_0x01c7
        L_0x00af:
            if (r12 != r5) goto L_0x01c7
        L_0x00b1:
            long r4 = (long) r11
            r0 = r13[r12]
            long r0 = (long) r0
            long r4 = r4 * r0
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x026f
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x026f
            java.lang.String r20 = "Compression"
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f1
            int r13 = r10.readInt()
            if (r22 == 0) goto L_0x00dc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "seek to data offset: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r13)
            android.util.Log.d(r8, r0)
        L_0x00dc:
            int r1 = r9.A00
            r0 = 7
            if (r1 != r0) goto L_0x00ed
            java.lang.String r0 = "MakerNote"
            java.lang.String r1 = r6.A03
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x016b
            r9.A02 = r13
        L_0x00ed:
            long r0 = (long) r13
            r10.A01(r0)
        L_0x00f1:
            java.util.HashMap r0 = A0n
            java.lang.Number r13 = X.C108945cZ.A1D(r7, r0)
            if (r22 == 0) goto L_0x010e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "nextIfdType: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " byteCount: "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r4)
            android.util.Log.d(r8, r0)
        L_0x010e:
            r7 = 8
            if (r13 == 0) goto L_0x0208
            r0 = 3
            if (r12 == r0) goto L_0x0160
            r0 = 4
            if (r12 == r0) goto L_0x0157
            if (r12 == r7) goto L_0x0152
            r0 = 9
            if (r12 == r0) goto L_0x0165
            r0 = 13
            if (r12 == r0) goto L_0x0165
            r0 = -1
        L_0x0124:
            if (r22 == 0) goto L_0x0137
            java.lang.Object[] r7 = X.AnonymousClass3MW.A1b()
            X.C17890vO.A1L(r7, r0)
            java.lang.String r5 = r6.A03
            r4 = 1
            r7[r4] = r5
            java.lang.String r4 = "Offset: %d, tagName: %s"
            X.BE7.A1L(r4, r8, r7)
        L_0x0137:
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x01d8
            int r5 = (int) r0
            r4 = r24
            boolean r4 = X.C108965cb.A1b(r4, r5)
            if (r4 != 0) goto L_0x01e7
            r10.A01(r0)
            int r0 = r13.intValue()
            r9.A0J(r10, r0)
            goto L_0x008c
        L_0x0152:
            short r0 = r10.readShort()
            goto L_0x0169
        L_0x0157:
            int r0 = r10.readInt()
            long r0 = X.BE7.A0C(r0)
            goto L_0x0124
        L_0x0160:
            int r0 = r10.readUnsignedShort()
            goto L_0x0169
        L_0x0165:
            int r0 = r10.readInt()
        L_0x0169:
            long r0 = (long) r0
            goto L_0x0124
        L_0x016b:
            r14 = 6
            r0 = r27
            if (r0 != r14) goto L_0x00ed
            java.lang.String r0 = "ThumbnailImage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r9.A0H = r13
            r9.A0G = r11
            java.nio.ByteOrder r1 = r9.A09
            int[] r0 = X.BE6.A1X()
            r16 = 0
            r0[r16] = r14
            X.CuQ r19 = X.C26195CuQ.A01(r1, r0)
            int r0 = r9.A0H
            long r0 = (long) r0
            java.nio.ByteOrder r15 = r9.A09
            r14 = 1
            long[] r14 = new long[r14]
            r14[r16] = r0
            X.CuQ r18 = X.C26195CuQ.A02(r15, r14)
            int r0 = r9.A0G
            long r0 = (long) r0
            java.nio.ByteOrder r15 = r9.A09
            r14 = 1
            long[] r14 = new long[r14]
            r14[r16] = r0
            X.CuQ r17 = X.C26195CuQ.A02(r15, r14)
            java.util.HashMap[] r14 = r9.A0I
            r16 = 4
            r15 = r14[r16]
            r1 = r20
            r0 = r19
            r15.put(r1, r0)
            r15 = r14[r16]
            java.lang.String r1 = "JPEGInterchangeFormat"
            r0 = r18
            r15.put(r1, r0)
            r14 = r14[r16]
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            r0 = r17
            r14.put(r1, r0)
            goto L_0x00ed
        L_0x01c7:
            r0 = 9
            if (r4 == r0) goto L_0x01cd
            if (r1 != r0) goto L_0x027f
        L_0x01cd:
            r0 = 8
            if (r12 != r0) goto L_0x027f
            goto L_0x00b1
        L_0x01d3:
            if (r12 != r14) goto L_0x00b1
        L_0x01d5:
            r12 = r4
            goto L_0x00b1
        L_0x01d8:
            if (r22 == 0) goto L_0x008c
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "Skip jump into the IFD since its offset is invalid: "
            r5.append(r4)
            r5.append(r0)
            goto L_0x0202
        L_0x01e7:
            if (r22 == 0) goto L_0x008c
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r5.append(r4)
            r5.append(r13)
            java.lang.String r4 = " (at "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ")"
            r5.append(r0)
        L_0x0202:
            java.lang.String r0 = r5.toString()
            goto L_0x0089
        L_0x0208:
            int r1 = r10.A00
            int r0 = r9.A01
            int r1 = r1 + r0
            int r0 = (int) r4
            byte[] r5 = new byte[r0]
            r10.readFully(r5)
            long r0 = (long) r1
            X.CuQ r4 = new X.CuQ
            r13 = r4
            r14 = r0
            r16 = r5
            r17 = r12
            r18 = r11
            r13.<init>(r14, r16, r17, r18)
            java.util.HashMap[] r0 = r9.A0I
            r0 = r0[r27]
            java.lang.String r5 = r6.A03
            r0.put(r5, r4)
            java.lang.String r0 = "DNGVersion"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0235
            r0 = 3
            r9.A00 = r0
        L_0x0235:
            java.lang.String r0 = "Make"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0245
            java.lang.String r0 = "Model"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0253
        L_0x0245:
            java.nio.ByteOrder r0 = r9.A09
            java.lang.String r1 = r4.A05(r0)
            java.lang.String r0 = "PENTAX"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0264
        L_0x0253:
            r0 = r20
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0266
            int r1 = A00(r4, r9)
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L_0x0266
        L_0x0264:
            r9.A00 = r7
        L_0x0266:
            int r0 = r10.A00
            long r0 = (long) r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x008f
            goto L_0x008c
        L_0x026f:
            if (r22 == 0) goto L_0x008c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skip the tag entry since the number of components is invalid: "
            r1.append(r0)
            r1.append(r11)
            goto L_0x0085
        L_0x027f:
            if (r22 == 0) goto L_0x008c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skip the tag entry since data format ("
            r1.append(r0)
            java.lang.String[] r0 = A0l
            r0 = r0[r12]
            r1.append(r0)
            java.lang.String r0 = ") is unexpected for tag: "
            r1.append(r0)
            java.lang.String r0 = r6.A03
            r1.append(r0)
            goto L_0x0085
        L_0x029d:
            if (r22 == 0) goto L_0x008c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skip the tag entry since data format is invalid: "
            r1.append(r0)
            r1.append(r12)
            goto L_0x0085
        L_0x02ad:
            r1 = 0
            goto L_0x0068
        L_0x02b0:
            int r3 = r10.readInt()
            if (r22 == 0) goto L_0x02c2
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            X.C17880vN.A1T(r1, r3, r2)
            java.lang.String r0 = "nextIfdOffset: %d"
            X.BE7.A1L(r0, r8, r1)
        L_0x02c2:
            long r1 = (long) r3
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ef
            r0 = r24
            boolean r0 = X.C108965cb.A1b(r0, r3)
            if (r0 != 0) goto L_0x02f8
            r10.A01(r1)
            java.util.HashMap[] r2 = r9.A0I
            r1 = 4
            r0 = r2[r1]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02e3
            r9.A0J(r10, r1)
            return
        L_0x02e3:
            r0 = r2[r4]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0307
            r9.A0J(r10, r4)
            return
        L_0x02ef:
            if (r22 == 0) goto L_0x0307
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Stop reading file since a wrong offset may cause an infinite loop: "
            goto L_0x0300
        L_0x02f8:
            if (r22 == 0) goto L_0x0307
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
        L_0x0300:
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            android.util.Log.d(r8, r0)
        L_0x0307:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26303CxM.A0J(X.BLH, int):void");
    }

    private void A0K(BLH blh, int i) {
        StringBuilder sb;
        String str;
        C26195CuQ A012;
        C26195CuQ A013;
        HashMap[] hashMapArr = this.A0I;
        C26195CuQ A042 = A04("DefaultCropSize", hashMapArr[i]);
        C26195CuQ A043 = A04("SensorTopBorder", hashMapArr[i]);
        C26195CuQ A044 = A04("SensorLeftBorder", hashMapArr[i]);
        C26195CuQ A045 = A04("SensorBottomBorder", hashMapArr[i]);
        C26195CuQ A046 = A04("SensorRightBorder", hashMapArr[i]);
        if (A042 != null) {
            int i2 = A042.A00;
            Object A047 = A042.A04(this.A09);
            if (i2 == 5) {
                CVY[] cvyArr = (CVY[]) A047;
                if (cvyArr == null || cvyArr.length != 2) {
                    sb = AnonymousClass000.A11("Invalid crop size values. cropSize=");
                    str = Arrays.toString(cvyArr);
                    BE9.A1H(str, "ExifInterface", sb);
                    return;
                }
                CVY cvy = cvyArr[0];
                A012 = C26195CuQ.A03(this.A09, new CVY[]{cvy});
                CVY cvy2 = cvyArr[1];
                A013 = C26195CuQ.A03(this.A09, new CVY[]{cvy2});
            } else {
                int[] iArr = (int[]) A047;
                if (iArr == null || iArr.length != 2) {
                    sb = AnonymousClass000.A11("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    BE9.A1H(str, "ExifInterface", sb);
                    return;
                }
                int i3 = iArr[0];
                A012 = C26195CuQ.A01(this.A09, new int[]{i3});
                int i4 = iArr[1];
                A013 = C26195CuQ.A01(this.A09, new int[]{i4});
            }
            hashMapArr[i].put("ImageWidth", A012);
            hashMapArr[i].put("ImageLength", A013);
        } else if (A043 == null || A044 == null || A045 == null || A046 == null) {
            Object obj = hashMapArr[i].get("ImageLength");
            Object obj2 = hashMapArr[i].get("ImageWidth");
            if (obj == null || obj2 == null) {
                C26195CuQ A048 = A04("JPEGInterchangeFormat", hashMapArr[i]);
                Object obj3 = hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (A048 != null && obj3 != null) {
                    int A002 = A00(A048, this);
                    int A003 = A00(A048, this);
                    blh.A01((long) A002);
                    byte[] bArr = new byte[A003];
                    blh.read(bArr);
                    A0F(new C24224Bxc(bArr), A002, i);
                }
            }
        } else {
            int A004 = A00(A043, this);
            int A005 = A00(A045, this);
            int A006 = A00(A046, this);
            int A007 = A00(A044, this);
            if (A005 > A004 && A006 > A007) {
                int i5 = A005 - A004;
                ByteOrder byteOrder = this.A09;
                int[] A1X = BE6.A1X();
                A1X[0] = i5;
                C26195CuQ A014 = C26195CuQ.A01(byteOrder, A1X);
                C26195CuQ A022 = A02(this, A006 - A007);
                hashMapArr[i].put("ImageLength", A014);
                hashMapArr[i].put("ImageWidth", A022);
            }
        }
    }

    public static void A0N(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A0P(FileDescriptor fileDescriptor, int i) {
        Os.lseek(fileDescriptor, 0, i);
    }

    public static void A0R(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void A0S(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (i > 0) {
            int min = Math.min(i, DefaultCrypto.BUFFER_SIZE);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw C17880vN.A0f("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:4|5|6|7|8|9|(1:11)|12|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r4.A07 = r2.getFD();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a A[Catch:{ all -> 0x0033 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0T(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0039
            r3 = 0
            r4.A06 = r3
            r4.A08 = r5
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0031 }
            r2.<init>(r5)     // Catch:{ all -> 0x0031 }
            java.io.FileDescriptor r1 = r2.getFD()     // Catch:{ all -> 0x0033 }
            int r0 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0016 }
            A0P(r1, r0)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0024
        L_0x0016:
            boolean r0 = A0M     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0033 }
        L_0x0021:
            r4.A07 = r3     // Catch:{ all -> 0x0033 }
            goto L_0x002a
        L_0x0024:
            java.io.FileDescriptor r0 = r2.getFD()     // Catch:{ all -> 0x0033 }
            r4.A07 = r0     // Catch:{ all -> 0x0033 }
        L_0x002a:
            r4.A0Q(r2)     // Catch:{ all -> 0x0033 }
            A0N(r2)
            return
        L_0x0031:
            r0 = move-exception
            goto L_0x0035
        L_0x0033:
            r0 = move-exception
            r3 = r2
        L_0x0035:
            A0N(r3)
            throw r0
        L_0x0039:
            java.lang.String r0 = "filename cannot be null"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26303CxM.A0T(java.lang.String):void");
    }

    public static void A0V(String str, Object[] objArr, int i, int i2) {
        objArr[i] = new C25570Ci9(str, i, i2);
    }

    public static void A0W(String str, Object[] objArr, int i, int i2, int i3) {
        objArr[i3] = new C25570Ci9(str, i, i2);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.BLH, X.Bxc] */
    private void A0X(byte[] bArr, int i) {
        ? bxc = new C24224Bxc(bArr);
        bxc.A03.mark(Integer.MAX_VALUE);
        A0D(bxc);
        A0J(bxc, i);
    }

    private boolean A0Y(HashMap hashMap) {
        C26195CuQ A042 = A04("ImageLength", hashMap);
        C26195CuQ A043 = A04("ImageWidth", hashMap);
        if (!(A042 == null || A043 == null)) {
            int A002 = A00(A042, this);
            int A003 = A00(A043, this);
            if (A002 > 512 || A003 > 512) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int A0Z(int i) {
        int i2 = 0;
        do {
            C26195CuQ A042 = A04("Orientation", this.A0I[i2]);
            if (A042 != null) {
                try {
                    return A00(A042, this);
                } catch (NumberFormatException unused) {
                    return i;
                }
            } else {
                i2++;
            }
        } while (i2 < 10);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:216:0x048c, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x048d, code lost:
        r3 = null;
        r6 = r23;
        r2 = null;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0492, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0493, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0499, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x049a, code lost:
        r2 = null;
        r3 = null;
        r6 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04a7, code lost:
        A0P(r7.A07, android.system.OsConstants.SEEK_SET);
        r0 = new java.io.FileOutputStream(r7.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04ba, code lost:
        r0 = new java.io.FileOutputStream(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04fc, code lost:
        r24.delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0492 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:43:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04a7 A[Catch:{ Exception -> 0x04c2, all -> 0x04c0, all -> 0x04d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04ba A[Catch:{ Exception -> 0x04c2, all -> 0x04c0, all -> 0x04d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0b() {
        /*
            r26 = this;
            r7 = r26
            int r1 = r7.A00
            r0 = 4
            if (r1 == r0) goto L_0x001b
            r0 = 13
            if (r1 == r0) goto L_0x001b
            r0 = 14
            if (r1 == r0) goto L_0x001b
            r0 = 3
            if (r1 == r0) goto L_0x001b
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats."
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x001b:
            java.io.FileDescriptor r0 = r7.A07
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r7.A08
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "ExifInterface does not support saving attributes for the current input."
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x002a:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x003d
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x003d
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x003d:
            int r1 = r7.A03
            r0 = 6
            if (r1 == r0) goto L_0x004a
            r0 = 7
            if (r1 == r0) goto L_0x004a
            r0 = 0
        L_0x0046:
            r7.A0F = r0
            r6 = 0
            goto L_0x004f
        L_0x004a:
            byte[] r0 = r7.A0d()
            goto L_0x0046
        L_0x004f:
            java.lang.String r1 = "temp"
            java.lang.String r0 = "tmp"
            java.io.File r24 = java.io.File.createTempFile(r1, r0)     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
            java.lang.String r0 = r7.A08     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
            if (r0 == 0) goto L_0x0061
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
            goto L_0x006f
        L_0x0061:
            java.io.FileDescriptor r1 = r7.A07     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
            A0P(r1, r0)     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
            java.io.FileDescriptor r0 = r7.A07     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x050c, all -> 0x0509 }
        L_0x006f:
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r24)     // Catch:{ Exception -> 0x0503, all -> 0x0500 }
            A0R(r1, r3)     // Catch:{ Exception -> 0x0506, all -> 0x0518 }
            A0N(r1)
            A0N(r3)
            r5 = 0
            java.io.FileInputStream r23 = X.C108945cZ.A18(r24)     // Catch:{ Exception -> 0x0495, all -> 0x0492 }
            java.lang.String r0 = r7.A08     // Catch:{ Exception -> 0x0499, all -> 0x0492 }
            if (r0 == 0) goto L_0x008b
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0499, all -> 0x0492 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0499, all -> 0x0492 }
            goto L_0x0099
        L_0x008b:
            java.io.FileDescriptor r1 = r7.A07     // Catch:{ Exception -> 0x0499, all -> 0x0492 }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0499, all -> 0x0492 }
            A0P(r1, r0)     // Catch:{ Exception -> 0x0499, all -> 0x0492 }
            java.io.FileDescriptor r0 = r7.A07     // Catch:{ Exception -> 0x0499, all -> 0x0492 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0499, all -> 0x0492 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0499, all -> 0x0492 }
        L_0x0099:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x048c, all -> 0x0492 }
            r0 = r23
            r2.<init>(r0)     // Catch:{ Exception -> 0x048c, all -> 0x0492 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0487, all -> 0x04f1 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0487, all -> 0x04f1 }
            int r1 = r7.A00     // Catch:{ Exception -> 0x0485 }
            r0 = 4
            if (r1 != r0) goto L_0x01ce
            boolean r0 = A0M     // Catch:{ Exception -> 0x0485 }
            if (r0 == 0) goto L_0x00cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0485 }
            java.lang.String r0 = "saveJpegAttributes starting with (inputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0485 }
            r1.append(r2)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r0 = ", outputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0485 }
            r1.append(r3)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r1 = X.AnonymousClass8BU.A0q(r1)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x0485 }
        L_0x00cb:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0485 }
            X.Bxc r13 = new X.Bxc     // Catch:{ Exception -> 0x0485 }
            r13.<init>(r2, r0)     // Catch:{ Exception -> 0x0485 }
            X.Bwq r12 = new X.Bwq     // Catch:{ Exception -> 0x0485 }
            r12.<init>(r3, r0)     // Catch:{ Exception -> 0x0485 }
            byte r0 = r13.readByte()     // Catch:{ Exception -> 0x0485 }
            java.lang.String r16 = "Invalid marker"
            r11 = -1
            if (r0 != r11) goto L_0x01c8
            java.io.OutputStream r10 = r12.A01     // Catch:{ Exception -> 0x0485 }
            r10.write(r11)     // Catch:{ Exception -> 0x0485 }
            byte r1 = r13.readByte()     // Catch:{ Exception -> 0x0485 }
            r0 = -40
            if (r1 != r0) goto L_0x01c2
            r10.write(r0)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r8 = "Xmp"
            java.lang.String r0 = r7.A0a(r8)     // Catch:{ Exception -> 0x0485 }
            if (r0 == 0) goto L_0x0110
            boolean r0 = r7.A0E     // Catch:{ Exception -> 0x0485 }
            if (r0 == 0) goto L_0x0110
            java.util.HashMap[] r0 = r7.A0I     // Catch:{ Exception -> 0x0485 }
            r0 = r0[r5]     // Catch:{ Exception -> 0x0485 }
            java.lang.Object r1 = r0.remove(r8)     // Catch:{ Exception -> 0x0485 }
        L_0x0104:
            r10.write(r11)     // Catch:{ Exception -> 0x0485 }
            r9 = -31
            r10.write(r9)     // Catch:{ Exception -> 0x0485 }
            r7.A0H(r12)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0112
        L_0x0110:
            r1 = 0
            goto L_0x0104
        L_0x0112:
            if (r1 == 0) goto L_0x011b
            java.util.HashMap[] r0 = r7.A0I     // Catch:{ Exception -> 0x0485 }
            r0 = r0[r5]     // Catch:{ Exception -> 0x0485 }
            r0.put(r8, r1)     // Catch:{ Exception -> 0x0485 }
        L_0x011b:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r0]     // Catch:{ Exception -> 0x0485 }
        L_0x011f:
            byte r0 = r13.readByte()     // Catch:{ Exception -> 0x0485 }
            if (r0 != r11) goto L_0x01bc
            byte r1 = r13.readByte()     // Catch:{ Exception -> 0x0485 }
            r0 = -39
            if (r1 == r0) goto L_0x01b1
            r0 = -38
            if (r1 == r0) goto L_0x01b1
            java.lang.String r14 = "Invalid length"
            if (r1 == r9) goto L_0x015c
            r10.write(r11)     // Catch:{ Exception -> 0x0485 }
            r10.write(r1)     // Catch:{ Exception -> 0x0485 }
            int r1 = r13.readUnsignedShort()     // Catch:{ Exception -> 0x0485 }
            short r0 = (short) r1     // Catch:{ Exception -> 0x0485 }
            r12.A01(r0)     // Catch:{ Exception -> 0x0485 }
            int r1 = r1 + -2
            if (r1 >= 0) goto L_0x0149
            goto L_0x0465
        L_0x0149:
            if (r1 <= 0) goto L_0x011f
            r0 = 4096(0x1000, float:5.74E-42)
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ Exception -> 0x0485 }
            int r0 = r13.read(r8, r5, r0)     // Catch:{ Exception -> 0x0485 }
            if (r0 < 0) goto L_0x011f
            r12.write(r8, r5, r0)     // Catch:{ Exception -> 0x0485 }
            int r1 = r1 - r0
            goto L_0x0149
        L_0x015c:
            int r0 = r13.readUnsignedShort()     // Catch:{ Exception -> 0x0485 }
            int r1 = r0 + -2
            if (r1 < 0) goto L_0x01ab
            r15 = 6
            byte[] r14 = new byte[r15]     // Catch:{ Exception -> 0x0485 }
            if (r1 < r15) goto L_0x017d
            int r0 = r13.read(r14)     // Catch:{ Exception -> 0x0485 }
            if (r0 != r15) goto L_0x01a3
            byte[] r0 = A0R     // Catch:{ Exception -> 0x0485 }
            boolean r0 = java.util.Arrays.equals(r14, r0)     // Catch:{ Exception -> 0x0485 }
            if (r0 == 0) goto L_0x017d
            int r0 = r1 + -6
            r13.A00(r0)     // Catch:{ Exception -> 0x0485 }
            goto L_0x011f
        L_0x017d:
            r10.write(r11)     // Catch:{ Exception -> 0x0485 }
            r10.write(r9)     // Catch:{ Exception -> 0x0485 }
            int r0 = r1 + 2
            short r0 = (short) r0     // Catch:{ Exception -> 0x0485 }
            r12.A01(r0)     // Catch:{ Exception -> 0x0485 }
            if (r1 < r15) goto L_0x0190
            int r1 = r1 + -6
            r12.write(r14)     // Catch:{ Exception -> 0x0485 }
        L_0x0190:
            if (r1 <= 0) goto L_0x011f
            r0 = 4096(0x1000, float:5.74E-42)
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ Exception -> 0x0485 }
            int r0 = r13.read(r8, r5, r0)     // Catch:{ Exception -> 0x0485 }
            if (r0 < 0) goto L_0x011f
            r12.write(r8, r5, r0)     // Catch:{ Exception -> 0x0485 }
            int r1 = r1 - r0
            goto L_0x0190
        L_0x01a3:
            java.lang.String r0 = "Invalid exif"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0469
        L_0x01ab:
            java.io.IOException r0 = X.C17880vN.A0f(r14)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0469
        L_0x01b1:
            r10.write(r11)     // Catch:{ Exception -> 0x0485 }
            r10.write(r1)     // Catch:{ Exception -> 0x0485 }
            A0R(r13, r12)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0479
        L_0x01bc:
            java.io.IOException r0 = X.C17880vN.A0f(r16)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0469
        L_0x01c2:
            java.io.IOException r0 = X.C17880vN.A0f(r16)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0469
        L_0x01c8:
            java.io.IOException r0 = X.C17880vN.A0f(r16)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0469
        L_0x01ce:
            r0 = 13
            if (r1 != r0) goto L_0x0263
            boolean r0 = A0M     // Catch:{ Exception -> 0x0485 }
            if (r0 == 0) goto L_0x01f3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0485 }
            java.lang.String r0 = "savePngAttributes starting with (inputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0485 }
            r1.append(r2)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r0 = ", outputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0485 }
            r1.append(r3)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r1 = X.AnonymousClass8BU.A0q(r1)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x0485 }
        L_0x01f3:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0485 }
            X.Bxc r11 = new X.Bxc     // Catch:{ Exception -> 0x0485 }
            r11.<init>(r2, r1)     // Catch:{ Exception -> 0x0485 }
            X.Bwq r10 = new X.Bwq     // Catch:{ Exception -> 0x0485 }
            r10.<init>(r3, r1)     // Catch:{ Exception -> 0x0485 }
            r0 = 8
            r8 = 8
            A0S(r11, r10, r0)     // Catch:{ Exception -> 0x0485 }
            int r0 = r7.A01     // Catch:{ Exception -> 0x0485 }
            r12 = 4
            if (r0 != 0) goto L_0x021a
            int r0 = r11.readInt()     // Catch:{ Exception -> 0x0485 }
            r10.A00(r0)     // Catch:{ Exception -> 0x0485 }
            int r0 = r0 + 4
            int r0 = r0 + 4
            A0S(r11, r10, r0)     // Catch:{ Exception -> 0x0485 }
            goto L_0x022b
        L_0x021a:
            int r0 = r0 - r8
            int r0 = r0 - r12
            int r0 = r0 - r12
            A0S(r11, r10, r0)     // Catch:{ Exception -> 0x0485 }
            int r0 = r11.readInt()     // Catch:{ Exception -> 0x0485 }
            int r0 = r0 + 4
            int r0 = r0 + 4
            r11.A00(r0)     // Catch:{ Exception -> 0x0485 }
        L_0x022b:
            r9 = 0
            java.io.ByteArrayOutputStream r9 = X.C108945cZ.A15()     // Catch:{ all -> 0x025d }
            X.Bwq r0 = new X.Bwq     // Catch:{ all -> 0x025d }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x025d }
            r7.A0H(r0)     // Catch:{ all -> 0x025d }
            java.io.OutputStream r0 = r0.A01     // Catch:{ all -> 0x025d }
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch:{ all -> 0x025d }
            byte[] r8 = r0.toByteArray()     // Catch:{ all -> 0x025d }
            r10.write(r8)     // Catch:{ all -> 0x025d }
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch:{ all -> 0x025d }
            r1.<init>()     // Catch:{ all -> 0x025d }
            int r0 = r8.length     // Catch:{ all -> 0x025d }
            int r0 = r0 - r12
            r1.update(r8, r12, r0)     // Catch:{ all -> 0x025d }
            long r0 = r1.getValue()     // Catch:{ all -> 0x025d }
            int r8 = (int) r0     // Catch:{ all -> 0x025d }
            r10.A00(r8)     // Catch:{ all -> 0x025d }
            A0N(r9)     // Catch:{ Exception -> 0x0485 }
            A0R(r11, r10)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0479
        L_0x025d:
            r0 = move-exception
            A0N(r9)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0469
        L_0x0263:
            r0 = 14
            if (r1 != r0) goto L_0x046a
            boolean r0 = A0M     // Catch:{ Exception -> 0x0485 }
            if (r0 == 0) goto L_0x0288
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0485 }
            java.lang.String r0 = "saveWebpAttributes starting with (inputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0485 }
            r1.append(r2)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r0 = ", outputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0485 }
            r1.append(r3)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r1 = X.AnonymousClass8BU.A0q(r1)     // Catch:{ Exception -> 0x0485 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x0485 }
        L_0x0288:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x0485 }
            X.Bxc r10 = new X.Bxc     // Catch:{ Exception -> 0x0485 }
            r10.<init>(r2, r0)     // Catch:{ Exception -> 0x0485 }
            X.Bwq r9 = new X.Bwq     // Catch:{ Exception -> 0x0485 }
            r9.<init>(r3, r0)     // Catch:{ Exception -> 0x0485 }
            r0 = 4
            A0S(r10, r9, r0)     // Catch:{ Exception -> 0x0485 }
            byte[] r22 = A0g     // Catch:{ Exception -> 0x0485 }
            r12 = 4
            r0 = 8
            r10.A00(r0)     // Catch:{ Exception -> 0x0485 }
            r21 = 0
            java.io.ByteArrayOutputStream r21 = X.C108945cZ.A15()     // Catch:{ Exception -> 0x0457 }
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x0457 }
            X.Bwq r1 = new X.Bwq     // Catch:{ Exception -> 0x0457 }
            r0 = r21
            r1.<init>(r0, r8)     // Catch:{ Exception -> 0x0457 }
            int r8 = r7.A01     // Catch:{ Exception -> 0x0457 }
            if (r8 == 0) goto L_0x02e0
            r0 = 12
            int r8 = r8 - r0
            int r8 = r8 - r12
            int r8 = r8 - r12
            A0S(r10, r1, r8)     // Catch:{ Exception -> 0x0457 }
            r10.A00(r12)     // Catch:{ Exception -> 0x0457 }
            int r0 = r10.readInt()     // Catch:{ Exception -> 0x0457 }
            r10.A00(r0)     // Catch:{ Exception -> 0x0457 }
        L_0x02c5:
            r7.A0H(r1)     // Catch:{ Exception -> 0x0457 }
        L_0x02c8:
            A0R(r10, r1)     // Catch:{ Exception -> 0x0457 }
            int r0 = r21.size()     // Catch:{ Exception -> 0x0457 }
            int r0 = r0 + 4
            r9.A00(r0)     // Catch:{ Exception -> 0x0457 }
            r0 = r22
            r9.write(r0)     // Catch:{ Exception -> 0x0457 }
            r0 = r21
            r0.writeTo(r9)     // Catch:{ Exception -> 0x0457 }
            goto L_0x043e
        L_0x02e0:
            byte[] r13 = new byte[r12]     // Catch:{ Exception -> 0x0457 }
            int r0 = r10.read(r13)     // Catch:{ Exception -> 0x0457 }
            if (r0 != r12) goto L_0x0449
            byte[] r8 = A0e     // Catch:{ Exception -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r13, r8)     // Catch:{ Exception -> 0x0457 }
            r15 = 8
            r11 = 0
            r14 = 1
            if (r0 == 0) goto L_0x034e
            int r13 = r10.readInt()     // Catch:{ Exception -> 0x0457 }
            int r0 = r13 % 2
            r16 = r13
            if (r0 != r14) goto L_0x0300
            int r16 = r13 + 1
        L_0x0300:
            r0 = r16
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0457 }
            r10.read(r0)     // Catch:{ Exception -> 0x0457 }
            byte r16 = r0[r5]     // Catch:{ Exception -> 0x0457 }
            r15 = r15 | r16
            byte r15 = (byte) r15     // Catch:{ Exception -> 0x0457 }
            r0[r5] = r15     // Catch:{ Exception -> 0x0457 }
            int r15 = r15 >> r14
            r15 = r15 & 1
            if (r15 != r14) goto L_0x0314
            r11 = 1
        L_0x0314:
            r1.write(r8)     // Catch:{ Exception -> 0x0457 }
            r1.A00(r13)     // Catch:{ Exception -> 0x0457 }
            r1.write(r0)     // Catch:{ Exception -> 0x0457 }
            if (r11 == 0) goto L_0x0345
            byte[] r0 = A0Z     // Catch:{ Exception -> 0x0457 }
            r7.A0G(r10, r1, r0, r6)     // Catch:{ Exception -> 0x0457 }
        L_0x0324:
            byte[] r11 = new byte[r12]     // Catch:{ Exception -> 0x0457 }
            r2.read(r11)     // Catch:{ Exception -> 0x0457 }
            byte[] r0 = A0a     // Catch:{ Exception -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r11, r0)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x02c5
            int r8 = r10.readInt()     // Catch:{ Exception -> 0x0457 }
            r1.write(r11)     // Catch:{ Exception -> 0x0457 }
            r1.A00(r8)     // Catch:{ Exception -> 0x0457 }
            int r0 = r8 % 2
            if (r0 != r14) goto L_0x0341
            int r8 = r8 + 1
        L_0x0341:
            A0S(r10, r1, r8)     // Catch:{ Exception -> 0x0457 }
            goto L_0x0324
        L_0x0345:
            byte[] r8 = A0c     // Catch:{ Exception -> 0x0457 }
            byte[] r0 = A0d     // Catch:{ Exception -> 0x0457 }
            r7.A0G(r10, r1, r8, r0)     // Catch:{ Exception -> 0x0457 }
            goto L_0x02c5
        L_0x034e:
            byte[] r20 = A0c     // Catch:{ Exception -> 0x0457 }
            r0 = r20
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch:{ Exception -> 0x0457 }
            if (r0 != 0) goto L_0x0360
            byte[] r0 = A0d     // Catch:{ Exception -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x02c8
        L_0x0360:
            int r19 = r10.readInt()     // Catch:{ Exception -> 0x0457 }
            int r0 = r19 % 2
            r12 = r19
            if (r0 != r14) goto L_0x036c
            int r12 = r19 + 1
        L_0x036c:
            r14 = 3
            byte[] r0 = new byte[r14]     // Catch:{ Exception -> 0x0457 }
            r25 = r0
            r0 = r20
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0411
            r0 = r25
            r10.read(r0)     // Catch:{ Exception -> 0x0457 }
            byte[] r14 = new byte[r14]     // Catch:{ Exception -> 0x0457 }
            int r11 = r10.read(r14)     // Catch:{ Exception -> 0x0457 }
            r0 = 3
            if (r11 != r0) goto L_0x0450
            byte[] r0 = A0h     // Catch:{ Exception -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0450
            int r11 = r10.readInt()     // Catch:{ Exception -> 0x0457 }
            int r0 = r11 << 18
            int r18 = r0 >> 18
            int r0 = r11 << 2
            int r17 = r0 >> 18
            r0 = 10
            int r12 = r12 - r0
            r14 = 0
        L_0x039f:
            r1.write(r8)     // Catch:{ Exception -> 0x0457 }
            r0 = 10
            r1.A00(r0)     // Catch:{ Exception -> 0x0457 }
            byte[] r15 = new byte[r0]     // Catch:{ Exception -> 0x0457 }
            byte r0 = r15[r5]     // Catch:{ Exception -> 0x0457 }
            r0 = r0 | 8
            byte r8 = (byte) r0     // Catch:{ Exception -> 0x0457 }
            r15[r5] = r8     // Catch:{ Exception -> 0x0457 }
            r16 = 4
            int r0 = r14 << 4
            X.BE6.A1N(r15, r8, r0, r5)     // Catch:{ Exception -> 0x0457 }
            int r14 = r18 + -1
            int r8 = r17 + -1
            byte r0 = (byte) r14     // Catch:{ Exception -> 0x0457 }
            r15[r16] = r0     // Catch:{ Exception -> 0x0457 }
            int r0 = r14 >> 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0457 }
            r16 = r0
            r0 = 5
            r15[r0] = r16     // Catch:{ Exception -> 0x0457 }
            int r0 = r14 >> 16
            byte r14 = (byte) r0     // Catch:{ Exception -> 0x0457 }
            r0 = 6
            r15[r0] = r14     // Catch:{ Exception -> 0x0457 }
            r14 = 7
            byte r0 = (byte) r8     // Catch:{ Exception -> 0x0457 }
            r15[r14] = r0     // Catch:{ Exception -> 0x0457 }
            int r0 = r8 >> 8
            byte r14 = (byte) r0     // Catch:{ Exception -> 0x0457 }
            r0 = 8
            r15[r0] = r14     // Catch:{ Exception -> 0x0457 }
            int r0 = r8 >> 16
            byte r8 = (byte) r0     // Catch:{ Exception -> 0x0457 }
            r0 = 9
            r15[r0] = r8     // Catch:{ Exception -> 0x0457 }
            r1.write(r15)     // Catch:{ Exception -> 0x0457 }
            r1.write(r13)     // Catch:{ Exception -> 0x0457 }
            r0 = r19
            r1.A00(r0)     // Catch:{ Exception -> 0x0457 }
            r0 = r20
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0403
            r0 = r25
            r1.write(r0)     // Catch:{ Exception -> 0x0457 }
            byte[] r0 = A0h     // Catch:{ Exception -> 0x0457 }
            r1.write(r0)     // Catch:{ Exception -> 0x0457 }
        L_0x03fb:
            r1.A00(r11)     // Catch:{ Exception -> 0x0457 }
        L_0x03fe:
            A0S(r10, r1, r12)     // Catch:{ Exception -> 0x0457 }
            goto L_0x02c5
        L_0x0403:
            byte[] r0 = A0d     // Catch:{ Exception -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x03fe
            r0 = 47
            r1.write(r0)     // Catch:{ Exception -> 0x0457 }
            goto L_0x03fb
        L_0x0411:
            byte[] r0 = A0d     // Catch:{ Exception -> 0x0457 }
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0437
            byte r11 = r10.readByte()     // Catch:{ Exception -> 0x0457 }
            r0 = 47
            if (r11 != r0) goto L_0x0442
            int r11 = r10.readInt()     // Catch:{ Exception -> 0x0457 }
            int r0 = r11 << 18
            int r0 = r0 >> 18
            int r18 = r0 + 1
            int r0 = r11 << 4
            int r0 = r0 >> 18
            int r17 = r0 + 1
            r14 = r11 & 8
            int r12 = r12 + -5
            goto L_0x039f
        L_0x0437:
            r14 = 0
            r18 = 0
            r17 = 0
            goto L_0x039f
        L_0x043e:
            A0N(r21)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0479
        L_0x0442:
            java.lang.String r0 = "Encountered error while checking VP8L signature"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ Exception -> 0x0457 }
            goto L_0x0456
        L_0x0449:
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunk type"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ Exception -> 0x0457 }
            goto L_0x0456
        L_0x0450:
            java.lang.String r0 = "Encountered error while checking VP8 signature"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ Exception -> 0x0457 }
        L_0x0456:
            throw r0     // Catch:{ Exception -> 0x0457 }
        L_0x0457:
            r6 = move-exception
            java.lang.String r1 = "Failed to save WebP file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0460 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0460 }
            throw r0     // Catch:{ all -> 0x0460 }
        L_0x0460:
            r0 = move-exception
            A0N(r21)     // Catch:{ Exception -> 0x0485 }
            goto L_0x0469
        L_0x0465:
            java.io.IOException r0 = X.C17880vN.A0f(r14)     // Catch:{ Exception -> 0x0485 }
        L_0x0469:
            throw r0     // Catch:{ Exception -> 0x0485 }
        L_0x046a:
            r0 = 3
            if (r1 == r0) goto L_0x046f
            if (r1 != 0) goto L_0x0479
        L_0x046f:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0485 }
            X.Bwq r0 = new X.Bwq     // Catch:{ Exception -> 0x0485 }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0485 }
            r7.A0H(r0)     // Catch:{ Exception -> 0x0485 }
        L_0x0479:
            A0N(r2)
            A0N(r3)
            r24.delete()
            r7.A0F = r6
            return
        L_0x0485:
            r8 = move-exception
            goto L_0x0489
        L_0x0487:
            r8 = move-exception
            r3 = r6
        L_0x0489:
            r6 = r23
            goto L_0x049f
        L_0x048c:
            r8 = move-exception
            r3 = r6
            r6 = r23
            r2 = r3
            goto L_0x049f
        L_0x0492:
            r0 = move-exception
            r3 = r6
            goto L_0x04f4
        L_0x0495:
            r8 = move-exception
            r2 = r6
            r3 = r6
            goto L_0x049e
        L_0x0499:
            r8 = move-exception
            r2 = r6
            r3 = r6
            r6 = r23
        L_0x049e:
            r4 = r2
        L_0x049f:
            java.io.FileInputStream r6 = X.C108945cZ.A18(r24)     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            java.lang.String r1 = r7.A08     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            if (r1 != 0) goto L_0x04ba
            java.io.FileDescriptor r1 = r7.A07     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            A0P(r1, r0)     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            java.io.FileDescriptor r1 = r7.A07     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
        L_0x04b5:
            r4 = r0
            A0R(r6, r0)     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            goto L_0x04e1
        L_0x04ba:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04c2, all -> 0x04c0 }
            goto L_0x04b5
        L_0x04c0:
            r0 = move-exception
            goto L_0x04da
        L_0x04c2:
            r7 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04d8 }
            java.lang.String r1 = "Failed to save new file. Original file is stored in "
            r0 = r24
            X.C17900vP.A0N(r0, r1, r5)     // Catch:{ all -> 0x04d8 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x04d8 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x04d8 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x04d8 }
            throw r0     // Catch:{ all -> 0x04d8 }
        L_0x04d8:
            r0 = move-exception
            r5 = 1
        L_0x04da:
            A0N(r6)     // Catch:{ all -> 0x04ef }
            A0N(r4)     // Catch:{ all -> 0x04ef }
            goto L_0x04ee
        L_0x04e1:
            A0N(r6)     // Catch:{ all -> 0x04ef }
            A0N(r0)     // Catch:{ all -> 0x04ef }
            java.lang.String r1 = "Failed to save new file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x04ef }
            r0.<init>(r1, r8)     // Catch:{ all -> 0x04ef }
        L_0x04ee:
            throw r0     // Catch:{ all -> 0x04ef }
        L_0x04ef:
            r0 = move-exception
            goto L_0x04f3
        L_0x04f1:
            r0 = move-exception
            r3 = r6
        L_0x04f3:
            r6 = r2
        L_0x04f4:
            A0N(r6)
            A0N(r3)
            if (r5 != 0) goto L_0x04ff
            r24.delete()
        L_0x04ff:
            throw r0
        L_0x0500:
            r0 = move-exception
            r3 = r6
            goto L_0x0519
        L_0x0503:
            r2 = move-exception
            r3 = r6
            goto L_0x0507
        L_0x0506:
            r2 = move-exception
        L_0x0507:
            r6 = r1
            goto L_0x050e
        L_0x0509:
            r0 = move-exception
            r3 = r6
            goto L_0x051a
        L_0x050c:
            r2 = move-exception
            r3 = r6
        L_0x050e:
            java.lang.String r1 = "Failed to copy original file to temp file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0516 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0516 }
            throw r0     // Catch:{ all -> 0x0516 }
        L_0x0516:
            r0 = move-exception
            goto L_0x051a
        L_0x0518:
            r0 = move-exception
        L_0x0519:
            r6 = r1
        L_0x051a:
            A0N(r6)
            A0N(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26303CxM.A0b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02d9, code lost:
        r5.put(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r4 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (r4 != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x004d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r3 = r19
            r2 = r20
            java.lang.String r0 = "DateTime"
            boolean r0 = r0.equals(r3)
            java.lang.String r10 = " : "
            java.lang.String r9 = "Invalid value for "
            java.lang.String r17 = "ExifInterface"
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "DateTimeOriginal"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "DateTimeDigitized"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0058
        L_0x0022:
            if (r20 == 0) goto L_0x0058
            java.util.regex.Pattern r0 = A0r
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r5 = r0.find()
            java.util.regex.Pattern r0 = A0s
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r4 = r0.find()
            int r1 = r2.length()
            r0 = 19
            if (r1 != r0) goto L_0x0044
            if (r5 != 0) goto L_0x004e
            if (r4 != 0) goto L_0x0050
        L_0x0044:
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r9, r3, r10)
            r0 = r17
            X.BE9.A1H(r2, r0, r1)
        L_0x004d:
            return
        L_0x004e:
            if (r4 == 0) goto L_0x0058
        L_0x0050:
            java.lang.String r1 = "-"
            java.lang.String r0 = ":"
            java.lang.String r2 = r2.replaceAll(r1, r0)
        L_0x0058:
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006d
            boolean r0 = A0M
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            r0 = r17
            android.util.Log.d(r0, r1)
        L_0x006b:
            java.lang.String r3 = "PhotographicSensitivity"
        L_0x006d:
            r7 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00b5
            java.util.HashSet r0 = A0o
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "GPSTimeStamp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02de
            java.util.regex.Pattern r0 = A0t
            java.util.regex.Matcher r4 = r0.matcher(r2)
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x0044
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            int r0 = X.BE8.A0D(r4, r6)
            r2.append(r0)
            java.lang.String r1 = "/1,"
            r2.append(r1)
            int r0 = X.BE8.A0D(r4, r7)
            r2.append(r0)
            r2.append(r1)
            r0 = 3
            int r0 = X.BE8.A0D(r4, r0)
            r2.append(r0)
            java.lang.String r0 = "/1"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)
        L_0x00b5:
            r14 = 0
            r1 = 0
        L_0x00b7:
            java.util.HashMap[] r0 = A17
            r0 = r0[r1]
            java.lang.Object r10 = r0.get(r3)
            X.Ci9 r10 = (X.C25570Ci9) r10
            r0 = r18
            if (r10 == 0) goto L_0x00ce
            if (r2 != 0) goto L_0x00de
            java.util.HashMap[] r4 = r0.A0I
            r4 = r4[r1]
            r4.remove(r3)
        L_0x00ce:
            int r1 = r1 + 1
            r7 = 2
            r6 = 1
            r4 = 10
            if (r1 >= r4) goto L_0x004d
            r4 = 4
            if (r1 != r4) goto L_0x00b7
            boolean r4 = r0.A0C
            if (r4 != 0) goto L_0x00b7
            goto L_0x00ce
        L_0x00de:
            android.util.Pair r4 = A01(r2)
            int r5 = r10.A01
            int r11 = X.C108965cb.A01(r4)
            r9 = -1
            if (r5 == r11) goto L_0x00fa
            int r8 = X.C108965cb.A00(r4)
            if (r5 == r8) goto L_0x00fa
            int r13 = r10.A02
            if (r13 == r9) goto L_0x0115
            if (r13 == r11) goto L_0x00f9
            if (r13 != r8) goto L_0x0115
        L_0x00f9:
            r5 = r13
        L_0x00fa:
            java.lang.String r16 = "/"
            java.lang.String r4 = ","
            switch(r5) {
                case 1: goto L_0x016b;
                case 2: goto L_0x01b0;
                case 3: goto L_0x01ba;
                case 4: goto L_0x01db;
                case 5: goto L_0x01fc;
                case 6: goto L_0x0101;
                case 7: goto L_0x01b0;
                case 8: goto L_0x0101;
                case 9: goto L_0x0234;
                case 10: goto L_0x0277;
                default: goto L_0x0101;
            }
        L_0x0101:
            boolean r4 = A0M
            if (r4 == 0) goto L_0x00ce
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r4 = "Data format isn't one of expected formats: "
            java.lang.String r5 = X.AnonymousClass001.A1I(r4, r6, r5)
        L_0x010f:
            r4 = r17
            android.util.Log.d(r4, r5)
            goto L_0x00ce
        L_0x0115:
            if (r5 == r6) goto L_0x00fa
            r4 = 7
            if (r5 == r4) goto L_0x00fa
            if (r5 == r7) goto L_0x00fa
            boolean r4 = A0M
            if (r4 == 0) goto L_0x00ce
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r4 = "Given tag ("
            r7.append(r4)
            r7.append(r3)
            java.lang.String r4 = ") value didn't match with one of expected formats: "
            r7.append(r4)
            java.lang.String[] r12 = A0l
            r4 = r12[r5]
            r7.append(r4)
            java.lang.String r10 = ""
            java.lang.String r6 = ", "
            if (r13 != r9) goto L_0x0160
            r4 = r10
        L_0x013f:
            r7.append(r4)
            java.lang.String r4 = " (guess: "
            r7.append(r4)
            r4 = r12[r11]
            r7.append(r4)
            if (r8 == r9) goto L_0x0158
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r6)
            r4 = r12[r8]
            java.lang.String r10 = X.AnonymousClass000.A0y(r4, r5)
        L_0x0158:
            r7.append(r10)
            java.lang.String r5 = X.AnonymousClass8BU.A0q(r7)
            goto L_0x010f
        L_0x0160:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r6)
            r4 = r12[r13]
            java.lang.String r4 = X.AnonymousClass000.A0y(r4, r5)
            goto L_0x013f
        L_0x016b:
            java.util.HashMap[] r4 = r0.A0I
            r5 = r4[r1]
            int r4 = r2.length()
            if (r4 != r6) goto L_0x019c
            char r4 = r2.charAt(r14)
            r8 = 48
            if (r4 < r8) goto L_0x019c
            char r7 = r2.charAt(r14)
            r4 = 49
            if (r7 > r4) goto L_0x019c
            byte[] r7 = new byte[r6]
            char r4 = r2.charAt(r14)
            int r4 = r4 - r8
            byte r4 = (byte) r4
            r7[r14] = r4
            r8 = -1
            X.CuQ r4 = new X.CuQ
            r12 = r6
            r10 = r7
            r11 = r6
            r7 = r4
            r7.<init>(r8, r10, r11, r12)
            goto L_0x02d9
        L_0x019c:
            java.nio.charset.Charset r4 = A0L
            byte[] r8 = r2.getBytes(r4)
            int r7 = r8.length
            r9 = -1
            X.CuQ r4 = new X.CuQ
            r11 = r8
            r12 = r6
            r13 = r7
            r8 = r4
            r8.<init>(r9, r11, r12, r13)
            goto L_0x02d9
        L_0x01b0:
            java.util.HashMap[] r4 = r0.A0I
            r5 = r4[r1]
            X.CuQ r4 = X.C26195CuQ.A00(r2)
            goto L_0x02d9
        L_0x01ba:
            java.lang.String[] r8 = r2.split(r4, r9)
            int r7 = r8.length
            int[] r6 = new int[r7]
            r5 = 0
        L_0x01c2:
            if (r5 >= r7) goto L_0x01cf
            r4 = r8[r5]
            int r4 = java.lang.Integer.parseInt(r4)
            r6[r5] = r4
            int r5 = r5 + 1
            goto L_0x01c2
        L_0x01cf:
            java.util.HashMap[] r4 = r0.A0I
            r5 = r4[r1]
            java.nio.ByteOrder r4 = r0.A09
            X.CuQ r4 = X.C26195CuQ.A01(r4, r6)
            goto L_0x02d9
        L_0x01db:
            java.lang.String[] r9 = r2.split(r4, r9)
            int r8 = r9.length
            long[] r7 = new long[r8]
            r6 = 0
        L_0x01e3:
            if (r6 >= r8) goto L_0x01f0
            r4 = r9[r6]
            long r4 = java.lang.Long.parseLong(r4)
            r7[r6] = r4
            int r6 = r6 + 1
            goto L_0x01e3
        L_0x01f0:
            java.util.HashMap[] r4 = r0.A0I
            r5 = r4[r1]
            java.nio.ByteOrder r4 = r0.A09
            X.CuQ r4 = X.C26195CuQ.A02(r4, r7)
            goto L_0x02d9
        L_0x01fc:
            java.lang.String[] r13 = r2.split(r4, r9)
            int r12 = r13.length
            X.CVY[] r11 = new X.CVY[r12]
            r10 = 0
        L_0x0204:
            if (r10 >= r12) goto L_0x0228
            r5 = r13[r10]
            r4 = r16
            java.lang.String[] r6 = r5.split(r4, r9)
            r4 = r6[r14]
            double r4 = java.lang.Double.parseDouble(r4)
            long r8 = (long) r4
            r4 = 1
            r4 = r6[r4]
            double r6 = java.lang.Double.parseDouble(r4)
            long r4 = (long) r6
            X.CVY r6 = new X.CVY
            r6.<init>(r8, r4)
            r11[r10] = r6
            int r10 = r10 + 1
            r9 = -1
            goto L_0x0204
        L_0x0228:
            java.util.HashMap[] r4 = r0.A0I
            r5 = r4[r1]
            java.nio.ByteOrder r4 = r0.A09
            X.CuQ r4 = X.C26195CuQ.A03(r4, r11)
            goto L_0x02d9
        L_0x0234:
            java.lang.String[] r6 = r2.split(r4, r9)
            int r11 = r6.length
            int[] r8 = new int[r11]
            r5 = 0
        L_0x023c:
            if (r5 >= r11) goto L_0x0249
            r4 = r6[r5]
            int r4 = java.lang.Integer.parseInt(r4)
            r8[r5] = r4
            int r5 = r5 + 1
            goto L_0x023c
        L_0x0249:
            java.util.HashMap[] r4 = r0.A0I
            r5 = r4[r1]
            java.nio.ByteOrder r6 = r0.A09
            int[] r4 = A0k
            r10 = 9
            r4 = r4[r10]
            int r4 = r4 * r11
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r4)
            r7.order(r6)
            r6 = 0
        L_0x0260:
            if (r6 >= r11) goto L_0x026a
            r4 = r8[r6]
            r7.putInt(r4)
            int r6 = r6 + 1
            goto L_0x0260
        L_0x026a:
            byte[] r9 = r7.array()
            r7 = -1
            X.CuQ r4 = new X.CuQ
            r6 = r4
            r6.<init>(r7, r9, r10, r11)
            goto L_0x02d9
        L_0x0277:
            java.lang.String[] r11 = r2.split(r4, r9)
            int r8 = r11.length
            X.CVY[] r15 = new X.CVY[r8]
            r10 = 0
        L_0x027f:
            if (r10 >= r8) goto L_0x02a2
            r5 = r11[r10]
            r4 = r16
            java.lang.String[] r7 = r5.split(r4, r9)
            r4 = r7[r14]
            double r4 = java.lang.Double.parseDouble(r4)
            long r12 = (long) r4
            r4 = r7[r6]
            double r6 = java.lang.Double.parseDouble(r4)
            long r4 = (long) r6
            X.CVY r6 = new X.CVY
            r6.<init>(r12, r4)
            r15[r10] = r6
            int r10 = r10 + 1
            r6 = 1
            goto L_0x027f
        L_0x02a2:
            java.util.HashMap[] r4 = r0.A0I
            r5 = r4[r1]
            java.nio.ByteOrder r6 = r0.A09
            int[] r4 = A0k
            r12 = 10
            r4 = r4[r12]
            int r4 = r4 * r8
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r4)
            r10.order(r6)
            r9 = 0
        L_0x02b9:
            if (r9 >= r8) goto L_0x02cc
            r11 = r15[r9]
            long r6 = r11.A01
            int r4 = (int) r6
            r10.putInt(r4)
            long r6 = r11.A00
            int r4 = (int) r6
            r10.putInt(r4)
            int r9 = r9 + 1
            goto L_0x02b9
        L_0x02cc:
            byte[] r11 = r10.array()
            r9 = -1
            X.CuQ r4 = new X.CuQ
            r13 = r8
            r8 = r4
            r8.<init>(r9, r11, r12, r13)
        L_0x02d9:
            r5.put(r3, r4)
            goto L_0x00ce
        L_0x02de:
            double r0 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x02f6 }
            r4 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r0 = r0 * r4
            long r4 = (long) r0     // Catch:{ NumberFormatException -> 0x02f6 }
            r0 = 10000(0x2710, double:4.9407E-320)
            X.CVY r8 = new X.CVY     // Catch:{ NumberFormatException -> 0x02f6 }
            r8.<init>(r4, r0)     // Catch:{ NumberFormatException -> 0x02f6 }
            java.lang.String r2 = r8.toString()     // Catch:{ NumberFormatException -> 0x02f6 }
            goto L_0x00b5
        L_0x02f6:
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r9, r3, r10)
            r0 = r17
            X.BE9.A1H(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26303CxM.A0c(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c A[SYNTHETIC, Splitter:B:32:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080 A[Catch:{ Exception -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A0d() {
        /*
            r10 = this;
            java.lang.String r6 = "ExifInterface"
            boolean r0 = r10.A0C
            r9 = 0
            if (r0 != 0) goto L_0x0008
            return r9
        L_0x0008:
            byte[] r0 = r10.A0F
            if (r0 == 0) goto L_0x000d
            return r0
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r5 = r10.A06     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r5 == 0) goto L_0x002b
            boolean r0 = r5.markSupported()     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            r5.reset()     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            goto L_0x0034
        L_0x001b:
            java.lang.String r0 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r6, r0)     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            A0N(r5)
            return r9
        L_0x0024:
            r2 = move-exception
            r4 = r9
            goto L_0x00a7
        L_0x0028:
            r1 = move-exception
            r4 = r9
            goto L_0x0090
        L_0x002b:
            java.lang.String r0 = r10.A08     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r0 == 0) goto L_0x0036
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
        L_0x0034:
            r4 = r9
            goto L_0x0046
        L_0x0036:
            java.io.FileDescriptor r0 = r10.A07     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            java.io.FileDescriptor r4 = A06(r0)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0087, all -> 0x00a9 }
            A0P(r4, r0)     // Catch:{ Exception -> 0x0087, all -> 0x00a9 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0087, all -> 0x00a9 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0087, all -> 0x00a9 }
        L_0x0046:
            int r1 = r10.A05     // Catch:{ Exception -> 0x0085 }
            int r0 = r10.A01     // Catch:{ Exception -> 0x0085 }
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch:{ Exception -> 0x0085 }
            long r7 = r5.skip(r0)     // Catch:{ Exception -> 0x0085 }
            int r1 = r10.A05     // Catch:{ Exception -> 0x0085 }
            int r0 = r10.A01     // Catch:{ Exception -> 0x0085 }
            int r1 = r1 + r0
            long r1 = (long) r1
            java.lang.String r3 = "Corrupted image"
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            int r0 = r10.A04     // Catch:{ Exception -> 0x0085 }
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x0085 }
            int r1 = r5.read(r2)     // Catch:{ Exception -> 0x0085 }
            int r0 = r10.A04     // Catch:{ Exception -> 0x0085 }
            if (r1 != r0) goto L_0x007b
            r10.A0F = r2     // Catch:{ Exception -> 0x0085 }
            A0N(r5)
            if (r4 == 0) goto L_0x007a
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r4)     // Catch:{ Exception -> 0x0075 }
            return r2
        L_0x0075:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x007a:
            return r2
        L_0x007b:
            java.io.IOException r0 = X.C17880vN.A0f(r3)     // Catch:{ Exception -> 0x0085 }
            throw r0     // Catch:{ Exception -> 0x0085 }
        L_0x0080:
            java.io.IOException r0 = X.C17880vN.A0f(r3)     // Catch:{ Exception -> 0x0085 }
            throw r0     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            r1 = move-exception
            goto L_0x0090
        L_0x0087:
            r1 = move-exception
            r5 = r9
            goto L_0x0090
        L_0x008a:
            r2 = move-exception
            r4 = r9
            goto L_0x00aa
        L_0x008d:
            r1 = move-exception
            r5 = r9
            r4 = r9
        L_0x0090:
            java.lang.String r0 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r6, r0, r1)     // Catch:{ all -> 0x00a6 }
            A0N(r5)
            if (r4 == 0) goto L_0x00a5
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r4)     // Catch:{ Exception -> 0x00a0 }
            return r9
        L_0x00a0:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x00a5:
            return r9
        L_0x00a6:
            r2 = move-exception
        L_0x00a7:
            r9 = r5
            goto L_0x00aa
        L_0x00a9:
            r2 = move-exception
        L_0x00aa:
            A0N(r9)
            if (r4 == 0) goto L_0x00ba
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r4)     // Catch:{ Exception -> 0x00b5 }
            throw r2
        L_0x00b5:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x00ba:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26303CxM.A0d():byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26303CxM(java.io.FileDescriptor r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 10
            r1 = 10
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            r4.A0I = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r4.A0A = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.A09 = r0
            if (r5 == 0) goto L_0x006f
            r3 = 0
            r4.A06 = r3
            r4.A08 = r3
            int r0 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0033 }
            A0P(r5, r0)     // Catch:{ Exception -> 0x0033 }
            r4.A07 = r5
            java.io.FileDescriptor r5 = A06(r5)     // Catch:{ Exception -> 0x002a }
            r1 = 1
            goto L_0x0041
        L_0x002a:
            r2 = move-exception
            java.lang.String r1 = "Failed to duplicate file descriptor"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0033:
            boolean r0 = A0M
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r1, r0)
        L_0x003e:
            r4.A07 = r3
            r1 = 0
        L_0x0041:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x005c }
            r0.<init>(r5)     // Catch:{ all -> 0x005c }
            r4.A0Q(r0)     // Catch:{ all -> 0x005a }
            A0N(r0)
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r5)     // Catch:{ Exception -> 0x0054 }
            return
        L_0x0054:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x0059:
            return
        L_0x005a:
            r2 = move-exception
            goto L_0x005e
        L_0x005c:
            r2 = move-exception
            r0 = r3
        L_0x005e:
            A0N(r0)
            if (r1 == 0) goto L_0x0075
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r5)     // Catch:{ Exception -> 0x0069 }
            throw r2
        L_0x0069:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
            throw r2
        L_0x006f:
            java.lang.String r0 = "fileDescriptor cannot be null"
            java.lang.NullPointerException r2 = X.AnonymousClass000.A0s(r0)
        L_0x0075:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26303CxM.<init>(java.io.FileDescriptor):void");
    }

    public static C26195CuQ A04(Object obj, AbstractMap abstractMap) {
        return (C26195CuQ) abstractMap.get(obj);
    }

    public static FileDescriptor A06(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static ByteOrder A07(C24224Bxc bxc) {
        short readShort = bxc.readShort();
        if (readShort == 18761) {
            if (A0M) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (A0M) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            BE9.A1J("Invalid byte order: ", A102, readShort);
            throw C17880vN.A0f(A102.toString());
        }
    }

    private void A0D(C24224Bxc bxc) {
        ByteOrder A072 = A07(bxc);
        this.A09 = A072;
        bxc.A01 = A072;
        int readUnsignedShort = bxc.readUnsignedShort();
        int i = this.A00;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = bxc.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    bxc.A00(i2);
                    return;
                }
                return;
            }
            throw C17880vN.A0f(AnonymousClass001.A1I("Invalid first Ifd offset: ", AnonymousClass000.A10(), readInt));
        }
        StringBuilder A102 = AnonymousClass000.A10();
        BE9.A1J("Invalid start code: ", A102, readUnsignedShort);
        throw C17880vN.A0f(A102.toString());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.BLH, X.Bxc] */
    private void A0I(BLH blh) {
        A0D(blh);
        A0J(blh, 0);
        A0K(blh, 0);
        A0K(blh, 5);
        A0K(blh, 4);
        A0A();
        if (this.A00 == 8) {
            HashMap[] hashMapArr = this.A0I;
            C26195CuQ A042 = A04("MakerNote", hashMapArr[1]);
            if (A042 != null) {
                ? bxc = new C24224Bxc(A042.A03);
                bxc.A03.mark(Integer.MAX_VALUE);
                bxc.A01 = this.A09;
                bxc.A00(6);
                A0J(bxc, 9);
                Object obj = hashMapArr[9].get("ColorSpace");
                if (obj != null) {
                    hashMapArr[1].put("ColorSpace", obj);
                }
            }
        }
    }

    public static void A0O(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public C26303CxM(InputStream inputStream) {
        this.A0I = new HashMap[10];
        this.A0A = new HashSet(10);
        this.A09 = ByteOrder.BIG_ENDIAN;
        this.A08 = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.A06 = (AssetManager.AssetInputStream) inputStream;
            this.A07 = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    A0P(fileInputStream.getFD(), OsConstants.SEEK_CUR);
                    this.A06 = null;
                    this.A07 = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (A0M) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.A06 = null;
            this.A07 = null;
        }
        A0Q(inputStream);
    }

    public C26303CxM(File file) {
        this.A0I = new HashMap[10];
        this.A0A = new HashSet(10);
        this.A09 = ByteOrder.BIG_ENDIAN;
        A0T(file.getAbsolutePath());
    }

    public C26303CxM(String str) {
        this.A0I = new HashMap[10];
        this.A0A = new HashSet(10);
        this.A09 = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            A0T(str);
            return;
        }
        throw AnonymousClass000.A0s("filename cannot be null");
    }
}
