package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2nW  reason: invalid class name and case insensitive filesystem */
public class C60182nW {
    public AnonymousClass206 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass18O A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final AnonymousClass118 A05;
    public final C18000vb A06;
    public final C18030ve A07;
    public final C217217d A08;
    public final AnonymousClass190 A09;
    public final AnonymousClass11C A0A;
    public final C32211gp A0B;
    public final AnonymousClass1LU A0C;
    public final AnonymousClass72L A0D;

    /* JADX WARNING: type inference failed for: r5v2, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.core.app.NotificationCompat$BigPictureStyle, X.72G] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
        r9 = r11 * 3;
        r1 = r9 / 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C1409673t r18, X.AnonymousClass1E7 r19, java.lang.StringBuilder r20, boolean r21) {
        /*
            r17 = this;
            r8 = 0
            r6 = 1
            r4 = r17
            if (r21 == 0) goto L_0x0032
            r0 = r19
            java.lang.CharSequence r3 = r4.A05(r0, r8)
        L_0x000c:
            X.206 r1 = r4.A00
            boolean r0 = r1 instanceof X.C438421d
            r7 = r18
            r5 = r20
            if (r0 == 0) goto L_0x006e
            r0 = r1
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r10 = r0.A02
            if (r10 == 0) goto L_0x006e
            X.17d r11 = r4.A08
            X.C17960vV.A07(r10)
            boolean r0 = r10.A0V
            r2 = 0
            if (r0 == 0) goto L_0x0148
            java.io.File r0 = r10.A0G
            if (r0 == 0) goto L_0x0148
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0148
            goto L_0x0043
        L_0x0032:
            X.0vb r5 = r4.A06
            r3 = 2131755286(0x7f100116, float:1.9141447E38)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C17880vN.A1T(r0, r6, r8)
            java.lang.String r3 = r5.A0K(r0, r3, r1)
            goto L_0x000c
        L_0x0043:
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x012a }
            r9.<init>()     // Catch:{ OutOfMemoryError -> 0x012a }
            r9.inJustDecodeBounds = r6     // Catch:{ OutOfMemoryError -> 0x012a }
            java.io.File r0 = r10.A0G     // Catch:{ OutOfMemoryError -> 0x012a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x012a }
            android.graphics.BitmapFactory.decodeFile(r0, r9)     // Catch:{ OutOfMemoryError -> 0x012a }
            int r1 = r9.outWidth     // Catch:{ OutOfMemoryError -> 0x012a }
            int r0 = r9.outHeight     // Catch:{ OutOfMemoryError -> 0x012a }
            int r1 = r11.A0E(r1, r0)     // Catch:{ OutOfMemoryError -> 0x012a }
            r9.inSampleSize = r1     // Catch:{ OutOfMemoryError -> 0x012a }
            r0 = -1
            if (r1 == r0) goto L_0x0148
            r9.inJustDecodeBounds = r8     // Catch:{ OutOfMemoryError -> 0x012a }
            java.io.File r0 = r10.A0G     // Catch:{ OutOfMemoryError -> 0x012a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x012a }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0, r9)     // Catch:{ OutOfMemoryError -> 0x012a }
            goto L_0x012a
        L_0x006e:
            boolean r0 = r1 instanceof X.C441322g
            if (r0 == 0) goto L_0x010a
            X.AW0 r0 = X.AnonymousClass25B.A00(r1)
            if (r0 != 0) goto L_0x010a
            X.17d r10 = r4.A08
            X.206 r1 = r4.A00
            X.22g r1 = (X.C441322g) r1
            X.00H r0 = r10.A0H
            java.lang.Object r0 = r0.get()
            X.70H r0 = (X.AnonymousClass70H) r0
            X.77d r13 = r0.A01(r1)
            X.118 r0 = r10.A07
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168921(0x7f070e99, float:1.7952157E38)
            int r11 = r1.getDimensionPixelSize(r0)
            r14 = 0
            X.00H r0 = r10.A0F     // Catch:{ OutOfMemoryError -> 0x0148 }
            java.lang.Object r12 = r0.get()     // Catch:{ OutOfMemoryError -> 0x0148 }
            X.72L r12 = (X.AnonymousClass72L) r12     // Catch:{ OutOfMemoryError -> 0x0148 }
            X.11C r15 = r10.A05     // Catch:{ OutOfMemoryError -> 0x0148 }
            com.whatsapp.media.WamediaManager r1 = r10.A0B     // Catch:{ OutOfMemoryError -> 0x0148 }
            X.1Su r9 = r10.A0E     // Catch:{ OutOfMemoryError -> 0x0148 }
            X.17r r0 = r10.A01     // Catch:{ OutOfMemoryError -> 0x0148 }
            X.C18070vi.A0d(r12, r6)     // Catch:{ OutOfMemoryError -> 0x0148 }
            X.C18070vi.A0p(r15, r1, r9)     // Catch:{ OutOfMemoryError -> 0x0148 }
            r2 = 7
            X.C18070vi.A0d(r0, r2)     // Catch:{ OutOfMemoryError -> 0x0148 }
            java.lang.String r2 = X.C60582oG.A00(r13, r11, r11, r8)     // Catch:{ OutOfMemoryError -> 0x0148 }
            byte[] r1 = X.C60582oG.A01(r0, r15, r1, r13)     // Catch:{ OutOfMemoryError -> 0x0148 }
            if (r1 == 0) goto L_0x0148
            boolean r0 = r13.A02()     // Catch:{ OutOfMemoryError -> 0x0148 }
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r13.A0F     // Catch:{ OutOfMemoryError -> 0x0148 }
            android.graphics.Bitmap r13 = r12.A02(r0, r1, r11, r11)     // Catch:{ OutOfMemoryError -> 0x0148 }
            goto L_0x00cf
        L_0x00cb:
            android.graphics.Bitmap r13 = r9.A07(r2, r1, r11, r11)     // Catch:{ OutOfMemoryError -> 0x0148 }
        L_0x00cf:
            if (r13 == 0) goto L_0x0148
            int r9 = r11 * 3
            int r1 = r9 / 2
            int r2 = r10.A0E(r9, r1)     // Catch:{ OutOfMemoryError -> 0x0148 }
            r0 = -1
            if (r2 == r0) goto L_0x0148
            int r9 = r9 / r2
            int r1 = r1 / r2
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0148 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r1, r0)     // Catch:{ OutOfMemoryError -> 0x0148 }
            android.graphics.Canvas r12 = new android.graphics.Canvas     // Catch:{ OutOfMemoryError -> 0x0148 }
            r12.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x0148 }
            float r15 = (float) r9     // Catch:{ OutOfMemoryError -> 0x0148 }
            r16 = 1077936128(0x40400000, float:3.0)
            float r11 = r15 / r16
            float r10 = (float) r1     // Catch:{ OutOfMemoryError -> 0x0148 }
            r1 = 1086324736(0x40c00000, float:6.0)
            float r9 = r10 / r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 * r0
            float r15 = r15 / r16
            r0 = 1084227584(0x40a00000, float:5.0)
            float r10 = r10 * r0
            float r10 = r10 / r1
            android.graphics.RectF r1 = new android.graphics.RectF     // Catch:{ OutOfMemoryError -> 0x0148 }
            r1.<init>(r11, r9, r15, r10)     // Catch:{ OutOfMemoryError -> 0x0148 }
            android.graphics.Paint r0 = new android.graphics.Paint     // Catch:{ OutOfMemoryError -> 0x0148 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x0148 }
            r12.drawBitmap(r13, r14, r1, r0)     // Catch:{ OutOfMemoryError -> 0x0148 }
            goto L_0x012a
        L_0x010a:
            X.206 r1 = r4.A00
            boolean r0 = r1 instanceof X.C441522i
            if (r0 == 0) goto L_0x0148
            r2 = 0
            X.36u r0 = r1.A0O()     // Catch:{ OutOfMemoryError -> 0x012a }
            if (r0 == 0) goto L_0x0148
            byte[] r9 = r0.A01()     // Catch:{ OutOfMemoryError -> 0x012a }
            if (r9 == 0) goto L_0x0148
            r1 = 8000(0x1f40, float:1.121E-41)
            X.25O r0 = new X.25O     // Catch:{ OutOfMemoryError -> 0x012a }
            r0.<init>(r1, r1)     // Catch:{ OutOfMemoryError -> 0x012a }
            X.25P r0 = X.AnonymousClass204.A0C(r0, r9)     // Catch:{ OutOfMemoryError -> 0x012a }
            android.graphics.Bitmap r2 = r0.A02     // Catch:{ OutOfMemoryError -> 0x012a }
        L_0x012a:
            if (r2 == 0) goto L_0x0148
            java.lang.String r0 = " bigpicture"
            r5.append(r0)
            androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r1.<init>()
            java.lang.CharSequence r0 = X.C1409673t.A04(r3)
            r1.A01 = r0
            r1.A02 = r6
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r2)
            r1.A00 = r0
            r7.A0B(r1)
            return
        L_0x0148:
            java.lang.String r0 = " bigtext:"
            r5.append(r0)
            int r0 = r3.length()
            r5.append(r0)
            androidx.core.app.NotificationCompat$BigTextStyle r5 = new androidx.core.app.NotificationCompat$BigTextStyle
            r5.<init>()
            r5.A07(r3)
            X.0vb r4 = r4.A06
            r3 = 2131755286(0x7f100116, float:1.9141447E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            X.C17880vN.A1T(r2, r6, r8)
            r0 = 1
            java.lang.String r0 = r4.A0K(r2, r3, r0)
            java.lang.CharSequence r0 = X.C1409673t.A04(r0)
            r5.A01 = r0
            r5.A02 = r6
            r7.A0B(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60182nW.A07(X.73t, X.1E7, java.lang.StringBuilder, boolean):void");
    }

    public long A02() {
        AnonymousClass206 r0;
        if (this instanceof AnonymousClass2KX) {
            r0 = ((AnonymousClass2KX) this).A00.A00;
        } else if (this instanceof AnonymousClass2KY) {
            return ((AnonymousClass2KY) this).A00.A02;
        } else {
            if (this instanceof AnonymousClass2KZ) {
                r0 = ((AnonymousClass2KZ) this).A00.A01;
            } else {
                r0 = this.A00;
            }
        }
        return r0.A0x;
    }

    public AnonymousClass1E7 A03() {
        AnonymousClass1BI A0I = this.A00.A0I();
        if (A0I == null) {
            A0I = this.A00.A0v.A00;
        }
        C17960vV.A07(A0I);
        return this.A03.A0H(A0I);
    }

    public C53642cr A04(AnonymousClass1E7 r11) {
        if (this instanceof AnonymousClass2KX) {
            AnonymousClass2KX r7 = (AnonymousClass2KX) this;
            C54502eF r5 = r7.A00;
            AnonymousClass22A r1 = r5.A01;
            int i = 2;
            if (C22971Dz.A0f(r1)) {
                i = 1;
            }
            AnonymousClass1BI A0H = r1.A0H();
            C24921Me r2 = r7.A04;
            String A0U = r2.A0U(r11, i, false);
            if (r11.A0F() && A0H != null) {
                A0U = AnonymousClass001.A1H(" @ ", A0U, AnonymousClass000.A11(r2.A0U(r7.A03.A0H(A0H), i, false)));
            }
            C17960vV.A07(A0U);
            return new C53642cr(A0U, r7.A01.A00.getString(2131891562, AnonymousClass000.A1b(r7.A08.A0J(r5.A00), 1)));
        } else if (this instanceof AnonymousClass2KY) {
            AnonymousClass2KY r8 = (AnonymousClass2KY) this;
            C24921Me r4 = r8.A04;
            int A092 = r4.A09((AnonymousClass1E7) null, r8.A00.A04.A00);
            UserJid A0I = r8.A00.A03.A0I();
            String A0U2 = r4.A0U(r11, A092, false);
            if (r11.A0F() && A0I != null) {
                Integer num = r8.A00.A01;
                if (num == null) {
                    A0U2 = "";
                    return new C53642cr(A0U2, AnonymousClass2KY.A00(r8));
                }
                String A0U3 = r4.A0U(r8.A03.A0H(A0I), A092, false);
                int intValue = num.intValue() - 1;
                if (intValue > 0) {
                    Resources resources = r8.A05.A00.getResources();
                    Object[] objArr = new Object[3];
                    objArr[0] = A0U3;
                    C17880vN.A1T(objArr, intValue, 1);
                    objArr[2] = A0U2;
                    A0U2 = resources.getQuantityString(2131755351, intValue, objArr);
                } else {
                    A0U2 = AnonymousClass001.A1H(" @ ", A0U2, AnonymousClass000.A11(A0U3));
                }
            }
            C17960vV.A07(A0U2);
            return new C53642cr(A0U2, AnonymousClass2KY.A00(r8));
        } else if (!(this instanceof AnonymousClass2KZ)) {
            return this.A08.A0H(r11, this.A00);
        } else {
            AnonymousClass2KZ r72 = (AnonymousClass2KZ) this;
            C24921Me r3 = r72.A04;
            int A093 = r3.A09((AnonymousClass1E7) null, r72.A00.A02.A0v.A00);
            AnonymousClass1BI A0H2 = r72.A00.A02.A0H();
            String A0U4 = r3.A0U(r11, A093, false);
            if (r11.A0F() && A0H2 != null) {
                String A0U5 = r3.A0U(r72.A03.A0H(A0H2), A093, false);
                int i2 = r72.A00.A00 - 1;
                if (i2 != 0) {
                    Resources resources2 = r72.A01.A00.getResources();
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = A0U5;
                    C17880vN.A1T(objArr2, i2, 1);
                    objArr2[2] = A0U4;
                    A0U4 = resources2.getQuantityString(2131755351, i2, objArr2);
                } else {
                    A0U4 = AnonymousClass001.A1H(" @ ", A0U4, AnonymousClass000.A11(A0U5));
                }
            }
            C17960vV.A07(A0U4);
            return new C53642cr(A0U4, AnonymousClass2KZ.A00(r72));
        }
    }

    public CharSequence A05(AnonymousClass1E7 r16, boolean z) {
        StringBuilder A10;
        CharSequence charSequence;
        StringBuilder A102;
        CharSequence A1H;
        StringBuilder A103;
        CharSequence A0y;
        AnonymousClass1E7 r10 = r16;
        boolean z2 = z;
        if (this instanceof AnonymousClass2KX) {
            AnonymousClass2KX r2 = (AnonymousClass2KX) this;
            CharSequence[] charSequenceArr = new CharSequence[2];
            C54502eF r6 = r2.A00;
            AnonymousClass1BI r9 = r6.A01.A0v.A00;
            C24921Me r8 = r2.A04;
            int A092 = r8.A09(r10, r9);
            if (r10.A0F()) {
                String A0L = r2.A08.A0L(r2.A00.A0H(), r9);
                boolean z3 = r2.A00.A0v.A02;
                if (z) {
                    if (!z3) {
                        A103 = C17890vO.A0f(A0L);
                        A103.append(" @ ");
                    }
                } else if (!z3) {
                    A0y = C217217d.A01(AnonymousClass000.A0y(": ", C17890vO.A0f(A0L)));
                    charSequenceArr[0] = A0y;
                    charSequenceArr[1] = C17890vO.A0R(r2.A01.A00, r2.A08.A0J(r6.A00), 1, 0, 2131891562);
                    return TextUtils.concat(charSequenceArr);
                }
                A103 = AnonymousClass000.A10();
            } else {
                String A0U = r8.A0U(r10, A092, false);
                C17960vV.A07(A0U);
                if (z) {
                    A0y = AnonymousClass000.A0y(": ", C17890vO.A0f(A0U));
                    charSequenceArr[0] = A0y;
                    charSequenceArr[1] = C17890vO.A0R(r2.A01.A00, r2.A08.A0J(r6.A00), 1, 0, 2131891562);
                    return TextUtils.concat(charSequenceArr);
                }
                A103 = AnonymousClass000.A10();
            }
            A0y = AnonymousClass001.A1H(r8.A0U(r10, A092, false), ": ", A103);
            charSequenceArr[0] = A0y;
            charSequenceArr[1] = C17890vO.A0R(r2.A01.A00, r2.A08.A0J(r6.A00), 1, 0, 2131891562);
            return TextUtils.concat(charSequenceArr);
        } else if (this instanceof AnonymousClass2KY) {
            AnonymousClass2KY r4 = (AnonymousClass2KY) this;
            CharSequence[] charSequenceArr2 = new CharSequence[2];
            AnonymousClass1BI r82 = r4.A00.A04.A00;
            if (r82 == null) {
                A1H = "";
            } else {
                C24921Me r7 = r4.A04;
                int A093 = r7.A09((AnonymousClass1E7) null, r82);
                if (r10.A0F()) {
                    AnonymousClass206 r92 = r4.A00;
                    boolean z4 = r92.A0v.A02;
                    if (z) {
                        if (!z4) {
                            A102 = AnonymousClass000.A11(AnonymousClass2KY.A01(r4, r4.A08.A0L(r92.A0H(), r82)));
                            A102.append(" @ ");
                            A1H = AnonymousClass001.A1H(r7.A0U(r10, A093, false), ": ", A102);
                        }
                    } else if (!z4) {
                        A1H = C217217d.A01(AnonymousClass000.A0y(": ", C17890vO.A0f(AnonymousClass2KY.A01(r4, r4.A08.A0L(r92.A0H(), r82)))));
                    }
                }
                A102 = AnonymousClass000.A10();
                A1H = AnonymousClass001.A1H(r7.A0U(r10, A093, false), ": ", A102);
            }
            charSequenceArr2[0] = A1H;
            charSequenceArr2[1] = AnonymousClass2KY.A00(r4);
            return TextUtils.concat(charSequenceArr2);
        } else if (!(this instanceof AnonymousClass2KZ)) {
            return this.A08.A0I(r10, this.A00, z2, false, true);
        } else {
            AnonymousClass2KZ r3 = (AnonymousClass2KZ) this;
            CharSequence[] charSequenceArr3 = new CharSequence[2];
            AnonymousClass1BI r83 = r3.A00.A02.A0v.A00;
            C24921Me r72 = r3.A04;
            int A094 = r72.A09((AnonymousClass1E7) null, r83);
            if (r10.A0F()) {
                AnonymousClass206 r93 = r3.A00;
                boolean z5 = r93.A0v.A02;
                if (z) {
                    if (!z5) {
                        A10 = C17890vO.A0f(AnonymousClass2KZ.A01(r3, r3.A08.A0L(r93.A0H(), r83)));
                        A10.append(" @ ");
                    }
                } else if (!z5) {
                    charSequence = C217217d.A01(AnonymousClass000.A0y(": ", C17890vO.A0f(AnonymousClass2KZ.A01(r3, r3.A08.A0L(r93.A0H(), r83)))));
                    charSequenceArr3[0] = charSequence;
                    charSequenceArr3[1] = AnonymousClass2KZ.A00(r3);
                    return TextUtils.concat(charSequenceArr3);
                }
                A10 = AnonymousClass000.A10();
            } else {
                if (z) {
                    String A0U2 = r72.A0U(r10, A094, false);
                    C17960vV.A07(A0U2);
                    A10 = C17890vO.A0f(AnonymousClass2KZ.A01(r3, A0U2));
                    charSequence = AnonymousClass000.A0y(": ", A10);
                    charSequenceArr3[0] = charSequence;
                    charSequenceArr3[1] = AnonymousClass2KZ.A00(r3);
                    return TextUtils.concat(charSequenceArr3);
                }
                A10 = AnonymousClass000.A10();
            }
            A10.append(r72.A0U(r10, A094, false));
            charSequence = AnonymousClass000.A0y(": ", A10);
            charSequenceArr3[0] = charSequence;
            charSequenceArr3[1] = AnonymousClass2KZ.A00(r3);
            return TextUtils.concat(charSequenceArr3);
        }
    }

    public String A06() {
        AnonymousClass11B A0O = this.A0A.A0O();
        if (A0O == null) {
            Log.w("messagenotification cr=null");
        } else {
            Uri A092 = this.A03.A09(A03(), A0O);
            if (A092 != null) {
                return A092.toString();
            }
        }
        return null;
    }

    public boolean A08(Context context, C1409673t r7, AnonymousClass1E7 r8) {
        C62572rc r1;
        File file;
        AnonymousClass206 r12 = this.A00;
        if ((!(r12 instanceof C441822l) && !(r12 instanceof C438421d)) || (r1 = ((AnonymousClass21V) r12).A02) == null || !r1.A0V || (file = r1.A0G) == null || !file.exists()) {
            return false;
        }
        Intent action = this.A0C.A1w(context, r8.A0J, 0).setAction(AnonymousClass2WR.A01);
        C60442o2.A01(action, "UpdateMessageNotificationRunnable");
        AnonymousClass4aU.A00(action, this.A00.A0v);
        PendingIntent A072 = C17880vN.A07(context, action, 4);
        AnonymousClass206 r13 = this.A00;
        int i = 2131232220;
        if (r13 instanceof C438421d) {
            i = 2131231994;
        }
        int i2 = 2131899314;
        if (r13.A0u == 1) {
            i2 = 2131897860;
        }
        r7.A08(i, context.getString(i2), A072);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0110, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C1409673t r13, androidx.core.app.NotificationCompat$MessagingStyle r14, X.AnonymousClass1E7 r15) {
        /*
            r12 = this;
            X.206 r1 = r12.A00
            boolean r0 = r1 instanceof X.AnonymousClass21L
            if (r0 != 0) goto L_0x01d9
            boolean r0 = r1 instanceof X.AnonymousClass22Q
            if (r0 != 0) goto L_0x01d9
            r0 = 8
            boolean r0 = r1.A0z(r0)
            if (r0 != 0) goto L_0x01d9
        L_0x0012:
            X.2cr r0 = r12.A04(r15)
            X.6uT r7 = r12.A09()
            java.lang.CharSequence r2 = r0.A00
            X.206 r0 = r12.A00
            long r0 = r0.A0I
            X.6yJ r4 = new X.6yJ
            r4.<init>(r7, r2, r0)
            X.206 r2 = r12.A00
            X.18O r1 = r12.A02
            int r0 = r2.A0u
            boolean r0 = X.AnonymousClass25A.A0I(r0)
            if (r0 != 0) goto L_0x007f
            boolean r0 = r2 instanceof X.C438421d
            if (r0 != 0) goto L_0x0053
            boolean r0 = r2 instanceof X.C441822l
            if (r0 == 0) goto L_0x0041
            X.18R r0 = X.AnonymousClass18O.A0e
            boolean r0 = r1.A09(r0)
            if (r0 != 0) goto L_0x0053
        L_0x0041:
            boolean r0 = r2 instanceof X.C441322g
            if (r0 == 0) goto L_0x007f
            X.AW0 r0 = X.AnonymousClass25B.A00(r2)
            if (r0 != 0) goto L_0x007f
            X.22g r2 = (X.C441322g) r2
            boolean r0 = r2.A1I()
            if (r0 != 0) goto L_0x007f
        L_0x0053:
            X.206 r2 = r12.A00
            boolean r0 = r2 instanceof X.AnonymousClass22Q
            if (r0 != 0) goto L_0x007f
            X.21V r2 = (X.AnonymousClass21V) r2
            X.2rc r1 = r2.A02
            if (r1 == 0) goto L_0x007b
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x007b
            java.io.File r0 = r1.A0G
            if (r0 == 0) goto L_0x007b
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x007b
            X.190 r1 = r12.A09
            X.1gp r0 = r12.A0B
            android.net.Uri r1 = com.whatsapp.contentprovider.MediaProvider.A04(r1, r0, r2)
            java.lang.String r0 = r2.A06
        L_0x0077:
            r4.A02 = r0
            r4.A00 = r1
        L_0x007b:
            r14.A07(r4)
            return
        L_0x007f:
            X.206 r1 = r12.A00
            boolean r0 = r1 instanceof X.C441322g
            if (r0 == 0) goto L_0x011a
            X.21V r1 = (X.AnonymousClass21V) r1
            X.2rc r2 = r1.A02
            if (r2 == 0) goto L_0x007b
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x007b
            java.io.File r0 = r2.A0G
            if (r0 == 0) goto L_0x007b
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x007b
            X.72L r11 = r12.A0D
            X.1gp r8 = r12.A0B
            X.2rc r0 = X.AnonymousClass206.A00(r1)
            java.io.File r2 = r0.A0G
            X.C17960vV.A07(r2)
            java.lang.String r5 = X.C17890vO.A0Q()
            java.lang.String r7 = r2.getName()
            java.lang.String r10 = r1.A05
            java.lang.String r6 = "LottieUtils/getStickerAsWebPForNotification error getting png sticker "
            r3 = 0
            boolean r0 = r2.exists()     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            if (r0 == 0) goto L_0x0115
            X.6L1 r0 = r11.A02     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            X.1tf r0 = r0.A0A(r2, r10)     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            if (r0 == 0) goto L_0x0115
            X.1rd r2 = r11.A03(r0)     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            int r1 = r2.getIntrinsicWidth()     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            int r0 = r2.getIntrinsicHeight()     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            android.graphics.Bitmap r9 = X.AnonymousClass72L.A00(r2, r1, r0)     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            X.17r r0 = r11.A01     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            java.io.File r1 = r0.A0G()     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            java.lang.String r0 = ".thumb.lottie.tmp"
            java.io.File r3 = X.C218617r.A03(r1, r10, r3, r0)     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            if (r3 == 0) goto L_0x0115
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x010a }
            r0 = 100
            r9.compress(r1, r0, r2)     // Catch:{ all -> 0x010a }
            r2.close()     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            java.lang.String r1 = r3.getAbsolutePath()
            java.lang.String r0 = "image/png"
            r8.A01(r5, r1, r0, r7)
            android.net.Uri$Builder r1 = X.C19680yj.A00()
            java.lang.String r0 = "item"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r5)
            android.net.Uri r1 = r0.build()
            goto L_0x0116
        L_0x010a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
            throw r0     // Catch:{ FileNotFoundException | OutOfMemoryError -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            com.whatsapp.util.Log.w(r6, r0)
        L_0x0115:
            r1 = 0
        L_0x0116:
            java.lang.String r0 = "image/webp"
            goto L_0x0077
        L_0x011a:
            boolean r0 = r1 instanceof X.AnonymousClass21L
            if (r0 == 0) goto L_0x0163
            r0 = r1
            X.21L r0 = (X.AnonymousClass21L) r0
            X.AEt r0 = r0.A00
            if (r0 == 0) goto L_0x007b
            byte[] r0 = r0.A05()
            if (r0 == 0) goto L_0x007b
            long r0 = r1.A0x
            X.1gp r3 = r12.A0B
            java.lang.String r2 = X.C17890vO.A0Q()
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r6 = "image/jpeg"
            java.lang.String r5 = ""
            r3.A01(r2, r0, r6, r5)
            android.net.Uri$Builder r1 = X.C19680yj.A00()
            java.lang.String r0 = "thumbnail"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r2)
            android.net.Uri r3 = r0.build()
            X.206 r0 = r12.A00
            long r1 = r0.A0I
            X.6yJ r0 = new X.6yJ
            r0.<init>(r7, r5, r1)
            r0.A02 = r6
            r0.A00 = r3
            r14.A07(r0)
            goto L_0x007b
        L_0x0163:
            boolean r0 = r1 instanceof X.C441522i
            if (r0 == 0) goto L_0x007b
            X.17d r3 = r12.A08
            r5 = 0
            X.36u r0 = r1.A0O()     // Catch:{ OutOfMemoryError -> 0x0183 }
            if (r0 == 0) goto L_0x0183
            byte[] r2 = r0.A01()     // Catch:{ OutOfMemoryError -> 0x0183 }
            if (r2 == 0) goto L_0x0183
            r1 = 8000(0x1f40, float:1.121E-41)
            X.25O r0 = new X.25O     // Catch:{ OutOfMemoryError -> 0x0183 }
            r0.<init>(r1, r1)     // Catch:{ OutOfMemoryError -> 0x0183 }
            X.25P r0 = X.AnonymousClass204.A0C(r0, r2)     // Catch:{ OutOfMemoryError -> 0x0183 }
            android.graphics.Bitmap r5 = r0.A02     // Catch:{ OutOfMemoryError -> 0x0183 }
        L_0x0183:
            X.206 r0 = r12.A00
            long r1 = r0.A0x
            if (r5 == 0) goto L_0x007b
            X.17y r6 = r3.A09     // Catch:{ IOException -> 0x007b }
            X.17z r0 = r6.A00     // Catch:{ IOException -> 0x007b }
            X.C219417z.A00(r0)     // Catch:{ IOException -> 0x007b }
            java.io.File r3 = r0.A04     // Catch:{ IOException -> 0x007b }
            java.lang.String r0 = "notification_thumbs"
            java.io.File r0 = X.C17880vN.A0e(r3, r0)     // Catch:{ IOException -> 0x007b }
            r0.mkdirs()     // Catch:{ IOException -> 0x007b }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x007b }
            java.lang.String r0 = "notification_thumbs/"
            r3.append(r0)     // Catch:{ IOException -> 0x007b }
            r3.append(r1)     // Catch:{ IOException -> 0x007b }
            java.lang.String r0 = ".jpg"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ IOException -> 0x007b }
            java.io.File r3 = r6.A00(r0)     // Catch:{ IOException -> 0x007b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x007b }
            r2.<init>(r3)     // Catch:{ IOException -> 0x007b }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x01cf }
            r0 = 100
            r5.compress(r1, r0, r2)     // Catch:{ all -> 0x01cf }
            r2.flush()     // Catch:{ all -> 0x01cf }
            r2.close()     // Catch:{ IOException -> 0x007b }
            X.118 r0 = r12.A05
            android.content.Context r0 = r0.A00
            android.net.Uri r1 = X.C64062u9.A02(r0, r3)
            java.lang.String r0 = "image/jpg"
            goto L_0x0077
        L_0x01cf:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01d4 }
            goto L_0x01d8
        L_0x01d4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x007b }
        L_0x01d8:
            throw r1     // Catch:{ IOException -> 0x007b }
        L_0x01d9:
            r0 = 0
            r13.A0U = r0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60182nW.A0A(X.73t, androidx.core.app.NotificationCompat$MessagingStyle, X.1E7):void");
    }

    public C60182nW(AnonymousClass190 r1, AnonymousClass11S r2, AnonymousClass18O r3, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass11C r6, AnonymousClass118 r7, C18000vb r8, C32211gp r9, C18030ve r10, AnonymousClass1LU r11, C217217d r12, AnonymousClass206 r13, AnonymousClass72L r14) {
        this.A07 = r10;
        this.A09 = r1;
        this.A01 = r2;
        this.A05 = r7;
        this.A0C = r11;
        this.A02 = r3;
        this.A0D = r14;
        this.A03 = r4;
        this.A0A = r6;
        this.A04 = r5;
        this.A06 = r8;
        this.A08 = r12;
        this.A0B = r9;
        this.A00 = r13;
    }

    public C136826uT A09() {
        boolean z;
        String A0U;
        AnonymousClass206 A0K;
        AnonymousClass118 r1;
        int i;
        AnonymousClass1E7 A032 = A03();
        AnonymousClass206 r3 = this.A00;
        if ((r3 instanceof C48392Mh) && ((C436420i) r3).A00 == 143) {
            A032 = this.A03.A0H(AnonymousClass205.A00(r3));
        }
        String A062 = A06();
        AnonymousClass1BI r0 = this.A00.A0v.A00;
        C24921Me r4 = this.A04;
        int A092 = r4.A09(A032, r0);
        AnonymousClass206 r5 = this.A00;
        if (!this.A02.A09(AnonymousClass18O.A0B) || (!(r5 instanceof C48392Mh) && !(r5 instanceof C436420i))) {
            z = r5.A0v.A02;
        } else {
            z = this.A01.A0O(A032.A0J);
        }
        if (z) {
            return this.A08.A0G();
        }
        if (AnonymousClass4aJ.A05(this.A01, this.A00.A0h)) {
            r1 = this.A05;
            i = 2131891984;
        } else {
            AnonymousClass206 r12 = this.A00;
            if (!C22971Dz.A0f(r12) || (A0K = r12.A0K()) == null || !A0K.A0v.A02) {
                A0U = r4.A0U(A032, A092, false);
                return new C136826uT(IconCompat.A03(this.A08.A0F(A032)), A0U, (String) null, A062, false, false);
            }
            r1 = this.A05;
            i = 2131895157;
        }
        A0U = r1.A01(i);
        return new C136826uT(IconCompat.A03(this.A08.A0F(A032)), A0U, (String) null, A062, false, false);
    }
}
