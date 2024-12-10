package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.4aW  reason: invalid class name */
public class AnonymousClass4aW {
    public static final C85344Na A0L = new C85344Na(AnonymousClass3MY.A0f(), "DEFAULT", (String) null);
    public Drawable A00;
    public boolean A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0M(AnonymousClass3MY.A0f());
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass1NT A05;
    public final AnonymousClass1L7 A06;
    public final AnonymousClass1NM A07;
    public final AnonymousClass118 A08;
    public final C27351Vt A09;
    public final C18030ve A0A;
    public final C219317y A0B;
    public final C25291Nq A0C;
    public final AnonymousClass1NR A0D;
    public final C25141Na A0E;
    public final C57372iy A0F;
    public final C20036A4f A0G;
    public final AnonymousClass10I A0H;
    public final C19880zA A0I;
    public final C218617r A0J;
    public final AnonymousClass11P A0K;

    public AnonymousClass4SC A0D(Context context, Uri uri, AnonymousClass1BI r9, boolean z) {
        InputStream inputStream;
        boolean z2 = false;
        BitmapDrawable bitmapDrawable = null;
        try {
            uri.getClass();
            if (z) {
                inputStream = this.A0C.A0A(uri, true);
            } else {
                inputStream = new FileInputStream(C64062u9.A04(uri));
            }
            Bitmap A0O = C72453Mb.A0O(A00(context), inputStream, false);
            if (A0O != null) {
                bitmapDrawable = new BitmapDrawable(context.getResources(), A0O);
            } else {
                this.A03.A05(2131889983);
            }
            inputStream.close();
        } catch (IOException unused) {
            this.A03.A05(2131889983);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        if (bitmapDrawable == null) {
            return A0E(context, r9);
        }
        if (r9 == null) {
            z2 = true;
        }
        return A05(context, A06(context, bitmapDrawable, r9, this), this, z2);
        throw th;
    }

    public void A0F() {
        this.A01 = true;
    }

    public static Point A00(Context context) {
        int i;
        int i2;
        Point point = new Point();
        AnonymousClass11C.A01(context).getDefaultDisplay().getSize(point);
        if (C72453Mb.A08(context) == 2 && (i = point.x) < (i2 = point.y)) {
            point.y = i;
            point.x = i2;
        }
        point.y -= AnonymousClass3MW.A01(context.getResources(), 2131165186) + C87344Vf.A01(context, AnonymousClass11C.A01(context));
        return point;
    }

    public static AnonymousClass25O A04(Point point, boolean z) {
        int i = point.x;
        int i2 = point.y;
        Long valueOf = Long.valueOf(C19620yd.A00 / 32);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = z;
        return new AnonymousClass25O(options, valueOf, i, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r0 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r1 = java.lang.Integer.parseInt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r0 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r4 = java.lang.Integer.parseInt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r6.equals(r0) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r7 = android.net.Uri.parse(r9.A02).getPath();
        X.C17960vV.A07(r7);
        r4 = A02(r8, r1, new java.io.File(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        switch(r4) {
            case 0: goto L_0x0022;
            case 1: goto L_0x008a;
            case 2: goto L_0x0037;
            case 3: goto L_0x008a;
            case 4: goto L_0x0029;
            default: goto L_0x0018;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r4 = X.C88594aB.A02(r8, r1, r10.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4SC A05(android.content.Context r8, X.C85344Na r9, X.AnonymousClass4aW r10, boolean r11) {
        /*
            java.lang.String r6 = r9.A01
            X.C17960vV.A07(r6)
            android.content.res.Resources r1 = r8.getResources()
            int r0 = r6.hashCode()
            r3 = 2
            r2 = 1
            r5 = 0
            r4 = -1
            switch(r0) {
                case -2032180703: goto L_0x00a2;
                case -1770733785: goto L_0x0081;
                case -899329064: goto L_0x0077;
                case 175331287: goto L_0x0074;
                case 1804184360: goto L_0x006a;
                default: goto L_0x0014;
            }
        L_0x0014:
            r7 = 0
            switch(r4) {
                case 0: goto L_0x0022;
                case 1: goto L_0x008a;
                case 2: goto L_0x0037;
                case 3: goto L_0x008a;
                case 4: goto L_0x0029;
                default: goto L_0x0018;
            }
        L_0x0018:
            r4 = r7
        L_0x0019:
            java.lang.Integer r5 = r9.A00
            X.4SC r3 = new X.4SC
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x0022:
            X.0ve r0 = r10.A0A
            android.graphics.drawable.Drawable r4 = X.C88594aB.A02(r8, r1, r0)
            goto L_0x0019
        L_0x0029:
            r1 = 0
            java.lang.String r0 = r9.A02     // Catch:{ NumberFormatException -> 0x0032 }
            if (r0 == 0) goto L_0x0032
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0032 }
        L_0x0032:
            android.graphics.drawable.BitmapDrawable r4 = A01(r8, r1, r2)
            goto L_0x0019
        L_0x0037:
            r4 = 0
            java.lang.String r0 = r9.A02     // Catch:{ NumberFormatException -> 0x0040 }
            if (r0 == 0) goto L_0x0040
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0040 }
        L_0x0040:
            r1 = 0
            java.lang.String r0 = r9.A02     // Catch:{ NumberFormatException -> 0x0049 }
            if (r0 == 0) goto L_0x0049
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0049 }
        L_0x0049:
            android.graphics.drawable.BitmapDrawable r0 = A01(r8, r1, r2)
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r3]
            r1[r5] = r0
            android.graphics.drawable.Drawable r0 = X.C88594aB.A01(r8, r4)
            r1[r2] = r0
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r0.<init>(r1)
            android.graphics.Bitmap r1 = X.AnonymousClass4aX.A00(r0)
            android.content.res.Resources r0 = r8.getResources()
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r0, r1)
            goto L_0x0019
        L_0x006a:
            java.lang.String r0 = "COLOR_ONLY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            r4 = 4
            goto L_0x0014
        L_0x0074:
            java.lang.String r0 = "USER_PROVIDED"
            goto L_0x0083
        L_0x0077:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            r4 = 2
            goto L_0x0014
        L_0x0081:
            java.lang.String r0 = "DOWNLOADED"
        L_0x0083:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x008a
            goto L_0x0014
        L_0x008a:
            java.lang.String r0 = r9.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r7 = r0.getPath()
            X.C17960vV.A07(r7)
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            android.graphics.drawable.BitmapDrawable r4 = A02(r8, r1, r0)
            goto L_0x0019
        L_0x00a2:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            r4 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aW.A05(android.content.Context, X.4Na, X.4aW, boolean):X.4SC");
    }

    public static C85344Na A06(Context context, BitmapDrawable bitmapDrawable, AnonymousClass1BI r6, AnonymousClass4aW r7) {
        String A042 = C17970vW.A04(String.valueOf(System.currentTimeMillis()));
        if (A042 == null) {
            A042 = String.valueOf(System.currentTimeMillis());
        }
        C85344Na r2 = new C85344Na(25, "USER_PROVIDED", Uri.fromFile(A08(context, bitmapDrawable, A042)).toString());
        A09(r6, r2, r7, C28281Zt.A0B(context), true);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r2 = new X.C85344Na(0, r9, r1);
        A09((X.AnonymousClass1BI) null, r2, r11, X.C28281Zt.A0B(r12), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r9.equals(r0) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r1 != null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r6 = r12.getResources().getIntArray(2130903071)[r2];
        r4 = r12.getResources().getIntArray(2130903072);
        r3 = r4.length;
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r2 >= r3) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        if (r4[r2] == r6) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ce, code lost:
        r1 = r1 + 1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        r2 = r1.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r9.equals(r0) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r1 = X.C17880vN.A0e(r12.getFilesDir(), "wallpaper.jpg");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
        if (r1.exists() == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        r1 = android.net.Uri.fromFile(r1).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C85344Na A07(android.content.Context r12, boolean r13) {
        /*
            r11 = this;
            X.1Na r0 = r11.A0E
            r5 = 0
            X.4Na r2 = r0.Bbh(r5, r13)
            if (r2 != 0) goto L_0x009b
            X.C28281Zt.A0B(r12)
            r11.A00 = r5
            r8 = 5
            r7 = 4
            r6 = 1
            r10 = 0
            r4 = 2
            android.content.res.Resources r9 = r12.getResources()
            java.io.File r0 = r12.getFilesDir()
            java.lang.String r3 = "wallpaper.jpg"
            java.io.File r0 = X.C17880vN.A0e(r0, r3)
            android.graphics.drawable.BitmapDrawable r0 = A02(r12, r9, r0)
            r11.A00 = r0
            r2 = 2
            if (r0 == 0) goto L_0x010d
            r2 = 5
        L_0x002b:
            android.graphics.drawable.Drawable r1 = r11.A00
            if (r1 == 0) goto L_0x0109
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "wallpaper/get "
            r9.append(r0)
            int r0 = r1.getIntrinsicWidth()
            r9.append(r0)
            java.lang.String r0 = "x"
            r9.append(r0)
            android.graphics.drawable.Drawable r0 = r11.A00
            int r0 = r0.getIntrinsicHeight()
            r9.append(r0)
            java.lang.String r0 = " "
            r9.append(r0)
            android.graphics.drawable.Drawable r1 = r11.A00
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0105
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r0 = r1.getBitmap()
            int r0 = r0.getByteCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0066:
            java.lang.String r0 = X.C17890vO.A0V(r0, r9)
        L_0x006a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r9 = "DEFAULT"
            if (r2 == r6) goto L_0x007d
            if (r2 == r4) goto L_0x007d
            if (r2 == r7) goto L_0x0101
            if (r2 == r8) goto L_0x00fd
            android.graphics.drawable.Drawable r0 = r11.A00
            if (r0 != 0) goto L_0x007d
            java.lang.String r9 = "NONE"
        L_0x007d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            int r0 = r9.hashCode()
            r7 = 0
            switch(r0) {
                case -1770733785: goto L_0x00de;
                case -899329064: goto L_0x00a2;
                case 175331287: goto L_0x009f;
                case 1804184360: goto L_0x009c;
                default: goto L_0x0089;
            }
        L_0x0089:
            r1 = 0
        L_0x008a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            X.4Na r2 = new X.4Na
            r2.<init>(r0, r9, r1)
            boolean r1 = X.C28281Zt.A0B(r12)
            r0 = 1
            A09(r5, r2, r11, r1, r0)
        L_0x009b:
            return r2
        L_0x009c:
            java.lang.String r0 = "COLOR_ONLY"
            goto L_0x00a4
        L_0x009f:
            java.lang.String r0 = "USER_PROVIDED"
            goto L_0x00e0
        L_0x00a2:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
        L_0x00a4:
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0089
            if (r1 != 0) goto L_0x00d3
            r2 = 0
        L_0x00ad:
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2130903071(0x7f03001f, float:1.741295E38)
            int[] r0 = r1.getIntArray(r0)
            r6 = r0[r2]
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2130903072(0x7f030020, float:1.7412952E38)
            int[] r4 = r1.getIntArray(r0)
            int r3 = r4.length
            r2 = 0
            r1 = 0
        L_0x00c8:
            if (r2 >= r3) goto L_0x00d8
            r0 = r4[r2]
            if (r0 == r6) goto L_0x00d9
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L_0x00c8
        L_0x00d3:
            int r2 = r1.intValue()
            goto L_0x00ad
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x008a
        L_0x00de:
            java.lang.String r0 = "DOWNLOADED"
        L_0x00e0:
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.io.File r0 = r12.getFilesDir()
            java.io.File r1 = X.C17880vN.A0e(r0, r3)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0089
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            java.lang.String r1 = r0.toString()
            goto L_0x008a
        L_0x00fd:
            java.lang.String r9 = "DOWNLOADED"
            goto L_0x007d
        L_0x0101:
            java.lang.String r9 = "COLOR_ONLY"
            goto L_0x007d
        L_0x0105:
            java.lang.String r0 = ""
            goto L_0x0066
        L_0x0109:
            java.lang.String r0 = "wallpaper/get null"
            goto L_0x006a
        L_0x010d:
            java.io.FileInputStream r0 = r12.openFileInput(r3)     // Catch:{ IOException -> 0x012f, OutOfMemoryError -> 0x0131 }
            int r2 = r0.read()     // Catch:{ all -> 0x0123 }
            if (r2 != r7) goto L_0x011c
            int r1 = r0.read()     // Catch:{ all -> 0x0123 }
            goto L_0x011d
        L_0x011c:
            r1 = 0
        L_0x011d:
            r0.close()     // Catch:{ IOException -> 0x0136, OutOfMemoryError -> 0x0121 }
            goto L_0x0136
        L_0x0121:
            r0 = move-exception
            goto L_0x0133
        L_0x0123:
            r1 = move-exception
            if (r0 == 0) goto L_0x012e
            r0.close()     // Catch:{ all -> 0x012a }
            goto L_0x012e
        L_0x012a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x012f, OutOfMemoryError -> 0x0131 }
        L_0x012e:
            throw r1     // Catch:{ IOException -> 0x012f, OutOfMemoryError -> 0x0131 }
        L_0x012f:
            r1 = 0
            goto L_0x0136
        L_0x0131:
            r0 = move-exception
            r1 = 0
        L_0x0133:
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
        L_0x0136:
            if (r2 == r4) goto L_0x0148
            if (r2 == r6) goto L_0x0148
            if (r2 != r7) goto L_0x0145
            android.graphics.drawable.BitmapDrawable r0 = A01(r12, r1, r10)
        L_0x0140:
            r11.A00 = r0
            X.C28281Zt.A0B(r12)
        L_0x0145:
            r10 = r1
            goto L_0x002b
        L_0x0148:
            X.0ve r0 = r11.A0A
            android.graphics.drawable.Drawable r0 = X.C88594aB.A02(r12, r9, r0)
            goto L_0x0140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aW.A07(android.content.Context, boolean):X.4Na");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1.equalsIgnoreCase(r7.A02) == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r5 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r5.A01) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r2 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r1 = android.net.Uri.parse(r5.A02).getPath();
        X.C17960vV.A07(r1);
        new java.io.File(r1).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r7.A01) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(X.AnonymousClass1BI r6, X.C85344Na r7, X.AnonymousClass4aW r8, boolean r9, boolean r10) {
        /*
            X.1Na r3 = r8.A0E
            X.4Na r5 = r3.Bbh(r6, r9)
            if (r7 == 0) goto L_0x0013
            java.lang.String r1 = "USER_PROVIDED"
            java.lang.String r0 = r7.A01
            boolean r1 = r1.equalsIgnoreCase(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r4 = 1
            if (r0 == 0) goto L_0x0026
            if (r5 == 0) goto L_0x004a
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r7.A02
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0026:
            r2 = 0
            if (r5 == 0) goto L_0x004a
        L_0x0029:
            java.lang.String r1 = "USER_PROVIDED"
            java.lang.String r0 = r5.A01
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x004a
            if (r2 != 0) goto L_0x004a
            java.lang.String r0 = r5.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getPath()
            X.C17960vV.A07(r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.delete()
        L_0x004a:
            r8.A01 = r4
            r3.CGo(r6, r7, r9)
            if (r10 == 0) goto L_0x0058
            if (r6 == 0) goto L_0x0058
            r0 = r9 ^ 1
            r3.CGo(r6, r7, r0)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aW.A09(X.1BI, X.4Na, X.4aW, boolean, boolean):void");
    }

    public static void A0A(AnonymousClass4aW r5) {
        File[] listFiles;
        AnonymousClass1Nb r4 = (AnonymousClass1Nb) r5.A0E;
        C28791au A062 = r4.A0U().A06();
        try {
            C23141Ev r2 = ((C28801av) A062).A02;
            r2.A0E("UPDATE settings SET wallpaper_light_type = NULL, wallpaper_light_value = NULL, wallpaper_dark_type = NULL, wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid != 'individual_chat_defaults'", "RESET_ALL_CUSTOM_WALLPAPERS");
            r2.A0E("UPDATE settings SET wallpaper_light_type = 'DEFAULT', wallpaper_light_value = NULL, wallpaper_dark_type = 'DEFAULT', wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid = 'individual_chat_defaults'", "RESET_GLOBAL_WALLPAPER_TO_DEFAULT");
            A062.close();
            r4.A0Q.clear();
            File A0e = C17880vN.A0e(r5.A08.A00.getFilesDir(), "Wallpapers");
            if (A0e.exists() && (listFiles = A0e.listFiles()) != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Drawable A0B(AnonymousClass4SC r6) {
        if (r6 == null) {
            return null;
        }
        Drawable drawable = r6.A00;
        Integer num = r6.A01;
        if (num == null || drawable == null) {
            return drawable;
        }
        drawable.setColorFilter(new PorterDuffColorFilter(C72473Md.A01(num.intValue(), AnonymousClass3Ma.A00(this.A08.A00, 2130968798, 2131099872)), PorterDuff.Mode.DARKEN));
        return drawable;
    }

    public Uri A0C() {
        PhoneUserJid A012 = AnonymousClass11S.A01(this.A04);
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(A012.getRawString());
        A102.append(System.currentTimeMillis());
        A10.append(C17970vW.A04(A102.toString()));
        String A0y = AnonymousClass000.A0y(".jpg", A10);
        File file = this.A0J.A08().A0S;
        C218617r.A07(file, false);
        return Uri.fromFile(C17880vN.A0e(file, A0y));
    }

    public AnonymousClass4aW(C19880zA r2, C218617r r3, AnonymousClass1KB r4, AnonymousClass11S r5, AnonymousClass1NT r6, AnonymousClass1L7 r7, AnonymousClass1NM r8, AnonymousClass11P r9, AnonymousClass118 r10, C27351Vt r11, C18030ve r12, C219317y r13, C25291Nq r14, AnonymousClass1NR r15, C25141Na r16, C57372iy r17, C20036A4f a4f, AnonymousClass10I r19) {
        this.A08 = r10;
        this.A0G = a4f;
        this.A04 = r5;
        this.A06 = r7;
        this.A09 = r11;
        this.A05 = r6;
        this.A07 = r8;
        this.A0E = r16;
        this.A0F = r17;
        this.A0B = r13;
        this.A0K = r9;
        this.A0A = r12;
        this.A03 = r4;
        this.A0J = r3;
        this.A0C = r14;
        this.A0H = r19;
        this.A0I = r2;
        this.A0D = r15;
    }

    public static BitmapDrawable A01(Context context, int i, boolean z) {
        Resources resources = context.getResources();
        int i2 = 2130903071;
        if (z) {
            i2 = 2130903072;
        }
        int[] intArray = resources.getIntArray(i2);
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        createBitmap.setPixel(0, 0, intArray[i]);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    public static BitmapDrawable A02(Context context, Resources resources, File file) {
        if (file.exists()) {
            try {
                Bitmap bitmap = AnonymousClass204.A0A(A04(A00(context), true), file).A02;
                if (bitmap != null) {
                    return new BitmapDrawable(resources, bitmap);
                }
            } catch (OutOfMemoryError e) {
                Log.e((Throwable) e);
            }
        }
        return null;
    }

    private C19760yx A03(Context context, AnonymousClass1BI r8) {
        C85344Na Bbh;
        boolean A0B2 = C28281Zt.A0B(context);
        boolean z = true;
        boolean A1X = AnonymousClass000.A1X(r8);
        C19880zA r1 = this.A0I;
        if (r1.A07() && ((C25811Ps) r1.A03()).A0D(r8)) {
            Bbh = A0L;
        } else if (r8 == null) {
            Bbh = A07(context, A0B2);
        } else {
            Bbh = this.A0E.Bbh(r8, A0B2);
            if (Bbh == null) {
                Bbh = A07(context, A0B2);
            } else {
                z = A1X;
            }
            A1X = z;
        }
        return new C19760yx(Bbh, Boolean.valueOf(A1X));
    }

    public static File A08(Context context, BitmapDrawable bitmapDrawable, String str) {
        FileOutputStream fileOutputStream;
        File A0e = C17880vN.A0e(context.getFilesDir(), "Wallpapers");
        A0e.mkdirs();
        File A0e2 = C17880vN.A0e(A0e, str);
        if (!A0e2.exists()) {
            try {
                fileOutputStream = new FileOutputStream(A0e2);
                bitmapDrawable.getBitmap().compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.close();
                return A0e2;
            } catch (IOException e) {
                Log.e("wallpaper/v2/save-wallpaper-file/failed to save wallpaper", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return A0e2;
        throw th;
    }

    public AnonymousClass4SC A0E(Context context, AnonymousClass1BI r4) {
        C19760yx A032 = A03(context, r4);
        Object obj = A032.A00;
        C17960vV.A07(obj);
        Object obj2 = A032.A01;
        C17960vV.A07(obj2);
        return A05(context, (C85344Na) obj, this, AnonymousClass000.A1Y(obj2));
    }

    public void A0G(Context context, AnonymousClass1BI r6, int i) {
        Object obj = A03(context, r6).A00;
        C17960vV.A07(obj);
        C85344Na r0 = (C85344Na) obj;
        A09(r6, new C85344Na(Integer.valueOf(i), r0.A01, r0.A02), this, C28281Zt.A0B(context), true);
    }
}
