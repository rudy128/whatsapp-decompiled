package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.util.Log;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1gV  reason: invalid class name and case insensitive filesystem */
public class C32021gV extends C24741Lm {
    public static final BitmapFactory.Options A0E;
    public int A00;
    public final C25131Mz A01;
    public final C18030ve A02;
    public final C32031gW A03;
    public final C32051gY A04;
    public final AnonymousClass10I A05;
    public final HashMap A06 = new HashMap();
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final AnonymousClass1T1 A08;
    public final AnonymousClass1KB A09;
    public final C25351Nw A0A;
    public final C25291Nq A0B;
    public final Object A0C = new Object();
    public final List A0D = Collections.synchronizedList(new ArrayList());

    public static Bitmap A01(Bitmap.Config config, AnonymousClass206 r4, int i, boolean z, boolean z2) {
        AnonymousClass206 r1 = r4;
        byte[] bArr = null;
        if (!(r4 instanceof AnonymousClass215)) {
            if (r4 instanceof AnonymousClass210) {
                bArr = ((AnonymousClass210) r1).A1A();
            } else if (r4.A0O() != null && C18070vi.A09(r4, C693336u.class).A03) {
                bArr = r4.A0O().A01();
            }
        }
        return A02(config, r1, bArr, i, z, z2);
    }

    public static synchronized Bitmap A03(C32021gV r5, String str) {
        Bitmap bitmap;
        synchronized (r5) {
            bitmap = (Bitmap) r5.A01.A0A(str);
            if (bitmap == null || bitmap.isRecycled()) {
                if (bitmap != null && bitmap.isRecycled()) {
                    Log.e("!! recycled message in hard cache");
                }
                HashMap hashMap = r5.A06;
                SoftReference softReference = (SoftReference) hashMap.get(str);
                if (softReference != null) {
                    bitmap = (Bitmap) softReference.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null || bitmap.isRecycled()) {
                    if (softReference != null) {
                        hashMap.remove(str);
                    }
                    bitmap = null;
                }
            }
        }
        return bitmap;
    }

    public static synchronized void A05(Bitmap.Config config, View view, AnonymousClass206 r13, AnonymousClass3M2 r14, C32021gV r15, Object obj, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C32021gV r9 = r15;
        synchronized (r9) {
            View view2 = view;
            Object obj2 = obj;
            view.setTag(obj2);
            if (C22781De.A03()) {
                r15.A0C();
            }
            AnonymousClass206 r7 = r13;
            AnonymousClass3M2 r8 = r14;
            boolean z7 = z3;
            AnonymousClass2P9 r4 = new AnonymousClass2P9(config, view2, r7, r8, r9, obj2, i, z7, z2, z6, z);
            if (z4) {
                if (z6) {
                    Bitmap A032 = A03(r9, A04(r7, AnonymousClass00R.A00));
                    if (A032 != null) {
                        r4.A01(A032);
                        r8.CMa(A032, view2, r7);
                    }
                }
                r9.A05.CGN(new AnonymousClass7RD(r4, new C130446jR(view2, r7, r4, r8, r9, obj2, z5), 38));
            } else {
                A06(view2, r7, (C693536w) null, r4, r8, r9, obj2, z5, z6);
            }
        }
    }

    public static void A06(View view, AnonymousClass206 r12, C693536w r13, AnonymousClass2SA r14, AnonymousClass3M2 r15, C32021gV r16, Object obj, boolean z, boolean z2) {
        Integer num;
        Bitmap A032;
        View view2 = view;
        AnonymousClass206 r6 = r12;
        AnonymousClass2SA r3 = r14;
        AnonymousClass3M2 r8 = r15;
        C32021gV r2 = r16;
        if (z2) {
            if (r13 == null || r13.A0D != C49572Qz.FAVICON) {
                num = AnonymousClass00R.A00;
            } else {
                num = AnonymousClass00R.A01;
            }
            synchronized (r2) {
                A032 = A03(r2, A04(r12, num));
            }
            if (A032 != null) {
                r14.A01(A032);
                r15.CMa(A032, view, r12);
                return;
            }
        }
        Bitmap A002 = r14.A00();
        C693336u A0O = r12.A0O();
        if (A002 != null || A0O == null || ((r13 != null && r13.A0D == C49572Qz.FAVICON) || C18070vi.A09(r12, C693336u.class).A03)) {
            r2.A09.CGP(new C21472Akd(r8, view, A002, r12, r3, r13, 17));
            return;
        }
        r2.A03.A00(r12, new C21464AkV(r2, r3, A0O, view2, r6, obj, r8, 5));
        if (z) {
            r15.CN4(view);
        }
    }

    public static void A07(View view, AnonymousClass206 r8, AnonymousClass3M2 r9, C32021gV r10, Object obj) {
        View view2 = view;
        Object obj2 = obj;
        view2.setTag(obj);
        C32021gV r6 = r10;
        if (C22781De.A03()) {
            r10.A0C();
        }
        AnonymousClass206 r2 = r8;
        AnonymousClass3M2 r5 = r9;
        if ((r8 instanceof AnonymousClass215) || (!(r8 instanceof AnonymousClass210) ? !r8.A16() : ((AnonymousClass210) r2).A1A() == null)) {
            r9.CMa((Bitmap) null, view2, r8);
        } else {
            A06(view2, r2, (C693536w) null, new AnonymousClass2P8(r8, r10), r5, r6, obj2, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap A0B(X.AnonymousClass206 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            X.C17960vV.A01()     // Catch:{ all -> 0x003a }
            r1 = 100
            r4 = 0
            r0 = 0
            android.graphics.Bitmap r0 = A01(r4, r6, r1, r0, r0)     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
            X.36u r3 = r6.A0O()     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.Class<X.36u> r2 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r6, r2)     // Catch:{ all -> 0x003a }
            boolean r0 = r0.A03     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0036
            X.1Nw r1 = r5.A0A     // Catch:{ all -> 0x003a }
            X.25F r0 = X.C18070vi.A09(r6, r2)     // Catch:{ all -> 0x003a }
            r1.Bhl(r0)     // Catch:{ all -> 0x003a }
            byte[] r2 = r3.A01()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x0036
            android.graphics.BitmapFactory$Options r1 = A0E     // Catch:{ all -> 0x003a }
            r0 = 100
            android.graphics.Bitmap r0 = X.C50572Uy.A00(r1, r2, r0)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0036:
            monitor-exit(r5)
            return r4
        L_0x0038:
            monitor-exit(r5)
            return r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32021gV.A0B(X.206):android.graphics.Bitmap");
    }

    public void A0D(View view, AnonymousClass206 r3, AnonymousClass3M2 r4) {
        A0I(view, r3, r4, false);
    }

    public void A0F(View view, AnonymousClass206 r15, AnonymousClass3M2 r16, Object obj, int i, boolean z, boolean z2, boolean z3) {
        A05((Bitmap.Config) null, view, r15, r16, this, obj, i, z, z2, z3, false, true, true);
    }

    public void A0H(View view, AnonymousClass206 r13, AnonymousClass3M2 r14, boolean z) {
        AnonymousClass206 r6 = r13;
        C20941Abv A002 = C60532oB.A00(r13);
        if (A002 != null) {
            view.setTag(A002.A0F);
        }
        synchronized (this) {
            if (C22781De.A03()) {
                A0C();
            }
            C20941Abv A003 = C60532oB.A00(r13);
            if (A003 != null) {
                byte[] bArr = A003.A01;
                String str = A003.A08;
                if (TextUtils.isEmpty(str)) {
                    str = A003.A0F;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                boolean z2 = z;
                sb.append(z);
                String obj = sb.toString();
                if (bArr == null) {
                    bArr = A003.A0N;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append("_micro");
                    obj = sb2.toString();
                }
                Bitmap A032 = A03(this, obj);
                if (A032 == null) {
                    A032 = A02((Bitmap.Config) null, r6, bArr, 2000, z2, false);
                    this.A06.remove(obj);
                    if (A032 != null) {
                        this.A01.A0F(obj, A032);
                    }
                }
                r14.CMa(A032, view, r13);
            }
        }
    }

    public void A0I(View view, AnonymousClass206 r11, AnonymousClass3M2 r12, boolean z) {
        A0F(view, r11, r12, r11.A0v, 100, z, false, true);
    }

    public void C9L(C122516Qr r3, boolean z) {
        synchronized (this) {
            this.A06.clear();
        }
    }

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A0E = options;
        options.inInputShareable = true;
        options.inPurgeable = true;
        options.inDither = true;
    }

    public C32021gV(AnonymousClass1T1 r14, C218617r r15, AnonymousClass1KB r16, C24771Lp r17, AnonymousClass118 r18, C18000vb r19, AnonymousClass11Z r20, AnonymousClass1KW r21, C18030ve r22, C32041gX r23, C32031gW r24, C25351Nw r25, C26421Sb r26, C25291Nq r27, C26631Sw r28, C26611Su r29, C24571Kv r30, AnonymousClass10I r31) {
        super(r30);
        C18030ve r7 = r22;
        this.A02 = r7;
        this.A0A = r25;
        this.A03 = r24;
        this.A05 = r31;
        this.A09 = r16;
        C25291Nq r10 = r27;
        this.A0B = r10;
        this.A08 = r14;
        AnonymousClass118 r3 = r18;
        C218617r r2 = r15;
        C18000vb r4 = r19;
        AnonymousClass11Z r5 = r20;
        AnonymousClass1KW r6 = r21;
        this.A04 = new C32051gY(r14, r2, r3, r4, r5, r6, r7, r23, r26, r10, r28, r29);
        StringBuilder sb = new StringBuilder();
        sb.append("MessageThumbCache/construct ");
        sb.append((int) ((C19620yd.A00 / 1024) / 8));
        Log.i(sb.toString());
        this.A01 = r17.A05();
        r17.A04().A0D(new C66462yD(this, 1));
        A09();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e9, code lost:
        if (r2 > 0.0f) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass21V r5, int r6) {
        /*
            X.2rc r1 = r5.A02
            X.C17960vV.A07(r1)
            int r2 = r1.A08
            if (r2 <= 0) goto L_0x0016
            int r0 = r1.A06
            if (r0 <= 0) goto L_0x0016
            float r1 = (float) r6
            float r0 = (float) r0
            float r1 = r1 * r0
            float r0 = (float) r2
        L_0x0011:
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r0 <= 0) goto L_0x0068
            return r0
        L_0x0016:
            java.io.File r0 = r1.A0G
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0068
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r0 = 1
            r2.inJustDecodeBounds = r0
            java.io.File r0 = r1.A0G
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r0, r2)
            int r0 = r2.outWidth
            if (r0 <= 0) goto L_0x0068
            int r0 = r2.outHeight
            if (r0 <= 0) goto L_0x0068
            java.io.File r0 = r1.A0G     // Catch:{ IOException -> 0x0062 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0062 }
            X.CxM r1 = new X.CxM     // Catch:{ IOException -> 0x0062 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x0062 }
            r0 = 1
            int r1 = r1.A0Z(r0)     // Catch:{ IOException -> 0x0062 }
            r0 = 6
            if (r1 == r0) goto L_0x0059
            r0 = 8
            if (r1 == r0) goto L_0x0059
            float r1 = (float) r6     // Catch:{ IOException -> 0x0062 }
            int r0 = r2.outHeight     // Catch:{ IOException -> 0x0062 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0062 }
            float r1 = r1 * r0
            int r0 = r2.outWidth     // Catch:{ IOException -> 0x0062 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0062 }
            goto L_0x0011
        L_0x0059:
            float r1 = (float) r6     // Catch:{ IOException -> 0x0062 }
            int r0 = r2.outWidth     // Catch:{ IOException -> 0x0062 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0062 }
            float r1 = r1 * r0
            int r0 = r2.outHeight     // Catch:{ IOException -> 0x0062 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x0062 }
            goto L_0x0011
        L_0x0062:
            r1 = move-exception
            java.lang.String r0 = "failure retrieving exif, io exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0068:
            int r0 = r5.A0u
            boolean r4 = X.AnonymousClass25A.A0K(r0)
            if (r4 == 0) goto L_0x00ce
            int r0 = r5.A0B()
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = r5.A0P()
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r5.A0P()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00ce
            java.lang.String r1 = r5.A0P()
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r1, r0)
        L_0x008f:
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r0 = 1
            r2.inJustDecodeBounds = r0
            int r0 = r3.length
            android.graphics.BitmapFactory.decodeByteArray(r3, r1, r0, r2)
            int r1 = r2.outWidth
            if (r1 <= 0) goto L_0x00ec
            int r0 = r2.outHeight
            if (r0 <= 0) goto L_0x00ec
            float r2 = (float) r0
            float r0 = (float) r1
            float r2 = r2 / r0
        L_0x00aa:
            if (r4 == 0) goto L_0x00f5
            X.36u r1 = r5.A0O()
            X.C17960vV.A07(r1)
            java.lang.Float r0 = r1.A00
            if (r0 != 0) goto L_0x00bd
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.A00 = r0
        L_0x00bd:
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x00ef
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00f5
            float r0 = (float) r6
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
        L_0x00ce:
            byte[] r0 = r5.A12()
            if (r0 == 0) goto L_0x00e0
            byte[] r0 = r5.A12()
            int r0 = r0.length
            if (r0 <= 0) goto L_0x00e0
            byte[] r3 = r5.A12()
            goto L_0x008f
        L_0x00e0:
            X.2rc r0 = r5.A02
            if (r0 == 0) goto L_0x00ec
            float r2 = r0.A00
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            goto L_0x00aa
        L_0x00ec:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00aa
        L_0x00ef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32021gV.A00(X.21V, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r0 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A02(android.graphics.Bitmap.Config r3, X.AnonymousClass206 r4, byte[] r5, int r6, boolean r7, boolean r8) {
        /*
            boolean r0 = r4 instanceof X.AnonymousClass215
            r2 = 0
            if (r0 != 0) goto L_0x0059
            if (r5 == 0) goto L_0x0059
            if (r3 != 0) goto L_0x004a
            android.graphics.BitmapFactory$Options r1 = A0E
        L_0x000b:
            android.graphics.Bitmap r3 = X.C50572Uy.A00(r1, r5, r6)
            if (r3 == 0) goto L_0x0059
            if (r7 == 0) goto L_0x0023
            boolean r0 = r4 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0024
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x001c:
            int r0 = r0.intValue()
            com.whatsapp.filter.FilterUtils.A02(r0, r3)
        L_0x0023:
            return r3
        L_0x0024:
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0023
            boolean r0 = r4 instanceof X.C438921i
            r2 = 1
            if (r0 != 0) goto L_0x0037
            if (r8 == 0) goto L_0x0030
            r2 = 2
        L_0x0030:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x0023
            goto L_0x001c
        L_0x0037:
            int r0 = r3.getHeight()
            r1 = 100
            if (r0 >= r1) goto L_0x0023
            int r0 = r3.getWidth()
            if (r0 >= r1) goto L_0x0023
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x001c
        L_0x004a:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r0 = 1
            r1.inInputShareable = r0
            r1.inPurgeable = r0
            r1.inDither = r0
            r1.inPreferredConfig = r3
            goto L_0x000b
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32021gV.A02(android.graphics.Bitmap$Config, X.206, byte[], int, boolean, boolean):android.graphics.Bitmap");
    }

    public static String A04(AnonymousClass206 r4, Integer num) {
        String str;
        String str2;
        StringBuilder sb;
        AnonymousClass205 r0 = r4.A0v;
        if (r0 == null || (str = r0.A01) == null) {
            return "null";
        }
        AnonymousClass1BI r02 = r0.A00;
        if (r02 != null) {
            str2 = r02.toString();
        } else {
            str2 = "";
        }
        if (C20120A8f.A06(r4)) {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(":");
            sb.append(C20120A8f.A02(r4));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            String obj = sb2.toString();
            if (num != AnonymousClass00R.A01) {
                return obj;
            }
            sb = new StringBuilder();
            sb.append(obj);
            sb.append(":favicon");
        }
        return sb.toString();
    }

    public static void A08(C32021gV r3, Runnable runnable) {
        synchronized (r3.A0C) {
            r3.A0D.add(runnable);
        }
        r3.A07.post(new AnonymousClass7RJ(r3, 6));
    }

    public int A0A(Context context) {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167724);
        this.A00 = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public void A0E(View view, AnonymousClass206 r3, AnonymousClass3M2 r4) {
        A07(view, r3, r4, this, r3.A0v);
    }

    public void A0G(View view, AnonymousClass206 r17, AnonymousClass3M2 r18, Object obj, boolean z) {
        View view2 = view;
        Object obj2 = obj;
        view2.setTag(obj2);
        AnonymousClass206 r3 = r17;
        AnonymousClass3M2 r5 = r18;
        this.A05.CGF(new AnonymousClass3CS(this, r3, view2, r5, new C130226j5(view2, r3, C60502o8.A00(r3), r5, this, obj2), obj2, 4, z));
    }

    public void A0J(AnonymousClass206 r3, Integer num) {
        this.A01.A0E(A04(r3, num));
        this.A06.remove(A04(r3, num));
    }

    public String BZc() {
        StringBuilder sb = new StringBuilder();
        sb.append("mtc=");
        sb.append(this.A06.size());
        return sb.toString();
    }

    public void A0C() {
        C17960vV.A02();
        synchronized (this.A0C) {
            List<Runnable> list = this.A0D;
            for (Runnable run : list) {
                run.run();
            }
            list.clear();
        }
    }
}
