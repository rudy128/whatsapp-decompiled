package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.whatsapp.superpack.WhatsAppObiInputStream;
import com.whatsapp.superpack.WhatsAppOpenboxArchive;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1KW  reason: invalid class name */
public class AnonymousClass1KW {
    public static final Set A0E = new LinkedHashSet();
    public static final String[] A0F = {"➕", "➖", "➗", "✖️", "🟰", "♾️", "💲", "💱", "™️", "©️", "®️", "👁️‍🗨️", "🔚", "🔙", "🔛", "🔝", "🔜", "〰️", "➰", "➿", "✔️"};
    public C18180vt A00 = new C18180vt(1000, 100000, 100000, false);
    public final AnonymousClass190 A01;
    public final AnonymousClass118 A02;
    public final C24541Ks A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;
    public final C24501Ko A06;
    public final C24571Kv A07;
    public final C18100vl A08 = new C18110vm(new C24611Kz(this));
    public final C18100vl A09 = new C18110vm(new C24601Ky(this));
    public final C18100vl A0A = new C18110vm(new C24581Kw(this));
    public final C18100vl A0B = new C18110vm(new C24591Kx(this));
    public final AnonymousClass11P A0C;
    public volatile WhatsAppOpenboxArchive A0D;

    public AnonymousClass1KW(AnonymousClass190 r5, AnonymousClass11P r6, AnonymousClass118 r7, C24541Ks r8, C18030ve r9, AnonymousClass18K r10, C24501Ko r11, C24571Kv r12) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r10, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r12, 7);
        C18070vi.A0d(r11, 8);
        this.A0C = r6;
        this.A04 = r9;
        this.A01 = r5;
        this.A02 = r7;
        this.A05 = r10;
        this.A03 = r8;
        this.A07 = r12;
        this.A06 = r11;
    }

    public static final BitmapDrawable A02(Resources resources, C58852lM r12, AnonymousClass1KW r13) {
        Bitmap BMG;
        BitmapDrawable bitmapDrawable;
        Bitmap BMG2;
        C72253Lf r8 = (C72253Lf) r13.A08.getValue();
        int[] iArr = r12.A00;
        int length = iArr.length;
        if (length == 1) {
            BMG = r8.BMG(r12, r13.A05(r12));
            if (BMG == null) {
                return null;
            }
        } else {
            BMG = r8.BMG(r12, false);
            if (BMG == null) {
                BitmapDrawable[] bitmapDrawableArr = new BitmapDrawable[length];
                for (int i = 0; i < length; i++) {
                    C58852lM r1 = new C58852lM(new int[]{iArr[i]});
                    if (r1.A00.length != 1 || (BMG2 = r8.BMG(r1, r13.A05(r1))) == null) {
                        bitmapDrawable = null;
                    } else {
                        bitmapDrawable = new BitmapDrawable(resources, BMG2);
                    }
                    bitmapDrawableArr[i] = bitmapDrawable;
                    if (bitmapDrawable == null) {
                        return null;
                    }
                }
                BMG = AnonymousClass6WI.A00((Drawable[]) Arrays.copyOf(bitmapDrawableArr, length));
                if (BMG == null) {
                    return null;
                }
                r8.CD0(BMG, r12, false);
            }
        }
        return new BitmapDrawable(resources, BMG);
    }

    public static final C58852lM A03(long j) {
        int[] iArr = new int[5];
        int i = ((int) ((j >> 4) & 4095)) + 1;
        int i2 = 0;
        do {
            iArr[i2] = i;
            i2++;
            i = ((int) ((j >> ((i2 * 12) + 4)) & 4095)) + 1;
            if (i <= 1) {
                break;
            }
        } while (i2 < 5);
        int[] copyOf = Arrays.copyOf(iArr, i2);
        C18070vi.A0X(copyOf);
        return new C58852lM(copyOf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075 A[Catch:{ OutOfMemoryError -> 0x00e6 }, LOOP:0: B:20:0x0077->B:19:0x0075, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3 A[EDGE_INSN: B:44:0x00e3->B:39:0x00e3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.BitmapDrawable A06(android.content.res.Resources r19, X.C72233Ld r20, X.C43271zX r21, long r22) {
        /*
            r18 = this;
            r0 = 0
            r12 = r19
            X.C18070vi.A0d(r12, r0)
            r11 = r18
            r2 = r21
            r0 = r22
            X.2lM r10 = A04(r2, r11, r0)
            r16 = 0
            if (r10 == 0) goto L_0x00f2
            android.graphics.drawable.BitmapDrawable r0 = A02(r12, r10, r11)
            if (r0 == 0) goto L_0x001b
            return r0
        L_0x001b:
            X.0vl r0 = r11.A08     // Catch:{ OutOfMemoryError -> 0x00e6 }
            java.lang.Object r9 = r0.getValue()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.3Lf r9 = (X.C72253Lf) r9     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int[] r14 = r10.A00     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r13 = r14.length     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r8 = 1
            r17 = r20
            if (r13 != r8) goto L_0x0068
            r7 = 0
            boolean r3 = r11.A05(r10)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.graphics.Bitmap r2 = r9.BMG(r10, r3)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r2 != 0) goto L_0x00de
            r0 = 0
            r2 = r14[r0]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.1Ks r1 = r11.A03     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0 = r17
            android.graphics.Bitmap r2 = r1.A0E(r0, r2)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r2 == 0) goto L_0x00e3
            if (r3 == 0) goto L_0x0064
            X.118 r0 = r11.A02     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.content.Context r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0 = 2131166631(0x7f0705a7, float:1.7947513E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            float r1 = (float) r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.0vl r0 = r11.A0A     // Catch:{ OutOfMemoryError -> 0x00e6 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.graphics.ColorFilter r0 = (android.graphics.ColorFilter) r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.graphics.Bitmap r2 = X.AnonymousClass204.A05(r2, r0, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.C18070vi.A0X(r2)     // Catch:{ OutOfMemoryError -> 0x00e6 }
        L_0x0064:
            r9.CD0(r2, r10, r3)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x00de
        L_0x0068:
            r6 = 0
            android.graphics.Bitmap r2 = r9.BMG(r10, r6)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r2 != 0) goto L_0x00de
            android.graphics.drawable.BitmapDrawable[] r5 = new android.graphics.drawable.BitmapDrawable[r13]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r4 = 0
            goto L_0x0077
        L_0x0073:
            if (r0 == 0) goto L_0x00e3
            int r4 = r4 + 1
        L_0x0077:
            r7 = 0
            if (r4 >= r13) goto L_0x00cf
            r1 = r14[r4]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int[] r0 = new int[r8]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0[r6] = r1     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.2lM r3 = new X.2lM     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r3.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int[] r1 = r3.A00     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r0 = r1.length     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r0 != r8) goto L_0x00a3
            boolean r2 = r11.A05(r3)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.graphics.Bitmap r15 = r9.BMG(r3, r2)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r15 != 0) goto L_0x00c7
            r15 = r1[r6]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.1Ks r1 = r11.A03     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0 = r17
            android.graphics.Bitmap r15 = r1.A0E(r0, r15)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r15 == 0) goto L_0x00a3
            if (r2 == 0) goto L_0x00c4
            goto L_0x00a5
        L_0x00a3:
            r0 = r7
            goto L_0x00cc
        L_0x00a5:
            X.118 r0 = r11.A02     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.content.Context r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0 = 2131166631(0x7f0705a7, float:1.7947513E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            float r1 = (float) r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.0vl r0 = r11.A0A     // Catch:{ OutOfMemoryError -> 0x00e6 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.graphics.ColorFilter r0 = (android.graphics.ColorFilter) r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.graphics.Bitmap r15 = X.AnonymousClass204.A05(r15, r0, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.C18070vi.A0X(r15)     // Catch:{ OutOfMemoryError -> 0x00e6 }
        L_0x00c4:
            r9.CD0(r15, r3, r2)     // Catch:{ OutOfMemoryError -> 0x00e6 }
        L_0x00c7:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0.<init>(r12, r15)     // Catch:{ OutOfMemoryError -> 0x00e6 }
        L_0x00cc:
            r5[r4] = r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0073
        L_0x00cf:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r13)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.graphics.drawable.Drawable[] r0 = (android.graphics.drawable.Drawable[]) r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            android.graphics.Bitmap r2 = X.AnonymousClass6WI.A00(r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r2 == 0) goto L_0x00e3
            r9.CD0(r2, r10, r6)     // Catch:{ OutOfMemoryError -> 0x00e6 }
        L_0x00de:
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r7.<init>(r12, r2)     // Catch:{ OutOfMemoryError -> 0x00e6 }
        L_0x00e3:
            r16 = r7
            goto L_0x00ec
        L_0x00e6:
            r1 = move-exception
            java.lang.String r0 = "EmojiLoader/getEmojiHighRes/failed to load emoji"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ec:
            if (r16 != 0) goto L_0x00f2
            android.graphics.drawable.BitmapDrawable r16 = A01(r12, r10, r11)
        L_0x00f2:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KW.A06(android.content.res.Resources, X.3Ld, X.1zX, long):android.graphics.drawable.BitmapDrawable");
    }

    public final BitmapDrawable A07(Resources resources, C43271zX r3, long j) {
        C18070vi.A0d(resources, 0);
        C58852lM A042 = A04(r3, this, j);
        if (A042 == null) {
            return null;
        }
        return A01(resources, A042, this);
    }

    public final Drawable A08(Resources resources, C43271zX r4, float f, long j) {
        C18070vi.A0d(resources, 0);
        C18070vi.A0d(r4, 2);
        BitmapDrawable A072 = A07(resources, r4, j);
        if (A072 == null) {
            return new AnonymousClass26m(r4.A01(), f);
        }
        return A072;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8 A[LOOP:0: B:13:0x0056->B:27:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.drawable.BitmapDrawable A01(android.content.res.Resources r13, X.C58852lM r14, X.AnonymousClass1KW r15) {
        /*
            X.0vl r0 = r15.A09
            java.lang.Object r11 = r0.getValue()
            X.3Lf r11 = (X.C72253Lf) r11
            int[] r12 = r14.A00
            int r10 = r12.length
            r9 = 1
            if (r10 != r9) goto L_0x004c
            r8 = 0
            boolean r3 = r15.A05(r14)
            android.graphics.Bitmap r2 = r11.BMG(r14, r3)
            if (r2 != 0) goto L_0x0046
            r0 = 0
            r0 = r12[r0]
            android.graphics.Bitmap r2 = r15.A00(r13, r0)
            if (r2 == 0) goto L_0x004b
            if (r3 == 0) goto L_0x0043
            X.118 r0 = r15.A02
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166631(0x7f0705a7, float:1.7947513E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            X.0vl r0 = r15.A0A
            java.lang.Object r0 = r0.getValue()
            android.graphics.ColorFilter r0 = (android.graphics.ColorFilter) r0
            android.graphics.Bitmap r2 = X.AnonymousClass204.A05(r2, r0, r1)
            X.C18070vi.A0X(r2)
        L_0x0043:
            r11.CD0(r2, r14, r3)
        L_0x0046:
            android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
            r8.<init>(r13, r2)
        L_0x004b:
            return r8
        L_0x004c:
            r7 = 0
            android.graphics.Bitmap r2 = r11.BMG(r14, r7)
            if (r2 != 0) goto L_0x0046
            android.graphics.drawable.BitmapDrawable[] r6 = new android.graphics.drawable.BitmapDrawable[r10]
            r5 = 0
        L_0x0056:
            r8 = 0
            if (r5 >= r10) goto L_0x00ad
            r1 = r12[r5]
            int[] r0 = new int[r9]
            r0[r7] = r1
            X.2lM r4 = new X.2lM
            r4.<init>(r0)
            int[] r1 = r4.A00
            int r0 = r1.length
            if (r0 != r9) goto L_0x00ab
            boolean r3 = r15.A05(r4)
            android.graphics.Bitmap r2 = r11.BMG(r4, r3)
            if (r2 != 0) goto L_0x009f
            r0 = r1[r7]
            android.graphics.Bitmap r2 = r15.A00(r13, r0)
            if (r2 == 0) goto L_0x00ab
            if (r3 == 0) goto L_0x009c
            X.118 r0 = r15.A02
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166631(0x7f0705a7, float:1.7947513E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            X.0vl r0 = r15.A0A
            java.lang.Object r0 = r0.getValue()
            android.graphics.ColorFilter r0 = (android.graphics.ColorFilter) r0
            android.graphics.Bitmap r2 = X.AnonymousClass204.A05(r2, r0, r1)
            X.C18070vi.A0X(r2)
        L_0x009c:
            r11.CD0(r2, r4, r3)
        L_0x009f:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r13, r2)
        L_0x00a4:
            r6[r5] = r0
            if (r0 == 0) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0056
        L_0x00ab:
            r0 = r8
            goto L_0x00a4
        L_0x00ad:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r10)
            android.graphics.drawable.Drawable[] r0 = (android.graphics.drawable.Drawable[]) r0
            android.graphics.Bitmap r2 = X.AnonymousClass6WI.A00(r0)
            if (r2 == 0) goto L_0x004b
            r11.CD0(r2, r14, r7)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KW.A01(android.content.res.Resources, X.2lM, X.1KW):android.graphics.drawable.BitmapDrawable");
    }

    public static final C58852lM A04(C43271zX r5, AnonymousClass1KW r6, long j) {
        if (j == -1) {
            j = C43291zZ.A00(r5, false);
            if (j == -1) {
                return null;
            }
        }
        Long valueOf = Long.valueOf(j);
        if (valueOf == null) {
            return null;
        }
        C58852lM A032 = A03(valueOf.longValue());
        int[] iArr = A032.A00;
        if (iArr.length != 1 || iArr[0] != 574) {
            return A032;
        }
        if (!C18020vd.A05(C18040vf.A02, r6.A04, 7463)) {
            return A032;
        }
        return new C58852lM(new int[]{3574});
    }

    private final boolean A05(C58852lM r8) {
        if (!C28281Zt.A0B(this.A02.A00)) {
            return false;
        }
        Set set = A0E;
        if (set.isEmpty()) {
            String[] strArr = A0F;
            int i = 0;
            do {
                set.add(A03(C43291zZ.A00(new C43281zY(strArr[i]), false)));
                i++;
            } while (i < 21);
            set.add(new C58852lM(new int[]{3574}));
        }
        return set.contains(r8);
    }

    private final Bitmap A00(Resources resources, int i) {
        IllegalArgumentException th;
        Object obj;
        WhatsAppObiInputStream openOpenboxArchiveFile;
        long uptimeMillis = SystemClock.uptimeMillis();
        Object obj2 = null;
        if (i > 0) {
            try {
                C24501Ko r3 = this.A06;
                if (this.A0D == null) {
                    synchronized (this) {
                        if (this.A0D == null) {
                            AssetFileDescriptor openFd = resources.getAssets().openFd("compressed/emojis/emojis.oba");
                            C18070vi.A0X(openFd);
                            this.A0D = new WhatsAppOpenboxArchive(openFd);
                        }
                    }
                }
                WhatsAppOpenboxArchive whatsAppOpenboxArchive = this.A0D;
                C17960vV.A07(whatsAppOpenboxArchive);
                C18070vi.A0X(whatsAppOpenboxArchive);
                C54542eJ file = whatsAppOpenboxArchive.getFile(i - 1);
                try {
                    C24511Kp r1 = r3.A03;
                    openOpenboxArchiveFile = WhatsAppObiInputStream.openOpenboxArchiveFile(file);
                    obj = C60952os.A00(r1, openOpenboxArchiveFile);
                    openOpenboxArchiveFile.close();
                } catch (IOException e) {
                    String obj3 = e.toString();
                    C46602Fe r2 = new C46602Fe();
                    r2.A02 = obj3;
                    r2.A01 = "regular_emoji";
                    r3.A02.CC6(r2, C24501Ko.A05);
                    obj = null;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
                if (((Boolean) this.A0B.getValue()).booleanValue()) {
                    AnonymousClass18K r5 = this.A05;
                    AnonymousClass1Be BDn = r5.BDn(new AnonymousClass2H8(), this.A00);
                    boolean z = false;
                    if (BDn.A00 != null) {
                        z = true;
                    }
                    if (z) {
                        AnonymousClass2H8 r22 = new AnonymousClass2H8();
                        r22.A05 = 13;
                        r22.A0B = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                        r5.CC8(r22, BDn);
                    }
                }
            } catch (Throwable th3) {
                obj = new AnonymousClass1IU(th3);
            }
            if (!(obj instanceof AnonymousClass1IU)) {
                obj2 = obj;
            }
            return (Bitmap) obj2;
        }
        th = new IllegalArgumentException("Failed requirement.");
        throw th;
        throw th;
    }
}
