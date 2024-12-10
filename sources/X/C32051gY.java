package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1gY  reason: invalid class name and case insensitive filesystem */
public class C32051gY {
    public AnonymousClass2Q0 A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass1T1 A02;
    public final C218617r A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass11Z A05;
    public final C18030ve A06;
    public final C32041gX A07;
    public final C26421Sb A08;
    public final C25291Nq A09;
    public final C26631Sw A0A;
    public final C32061gZ A0B = new C32061gZ(this);
    public final AtomicInteger A0C = new AtomicInteger();
    public final C18000vb A0D;
    public final AnonymousClass1KW A0E;
    public final C26611Su A0F;

    public static Bitmap A00(C62572rc r19, C58722l9 r20, C32051gY r21, File file, int[] iArr) {
        double sqrt;
        int i;
        InputStream inputStream;
        C56202h4 r0;
        C58722l9 r10 = r20;
        int BZK = r10.A04.BZK();
        float f = r10.A00.getContext().getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            sqrt = 1.0d;
        } else {
            sqrt = Math.sqrt((double) (f - 0.75f)) + 0.5d;
        }
        if (BZK == 0) {
            Log.e("MessageThumbsThread/ getting thumb for 0 size");
            i = Integer.MAX_VALUE;
        } else {
            i = (int) (((double) BZK) / sqrt);
        }
        Bitmap bitmap = null;
        long j = 0;
        boolean z = false;
        int i2 = 4;
        File file2 = file;
        int[] iArr2 = iArr;
        C62572rc r11 = r19;
        if (iArr != null) {
            C26421Sb r02 = r21.A08;
            String str = r11.A0L;
            if (str == null || (r0 = r02.A0I.A03(str, 1)) == null) {
                r0 = null;
            }
            if (r0 != null) {
                long j2 = r0.A0A;
                if (j2 == 0 && file2.length() > 0) {
                    j2 = file2.length();
                }
                for (int i3 = 0; i3 < iArr2.length; i3++) {
                    int i4 = iArr[i3];
                    if (((long) i4) + j >= j2) {
                        break;
                    }
                    j += (long) i4;
                }
                if (j <= ((long) iArr[0])) {
                    if (r10.A06) {
                        i2 = 16;
                    }
                    z = true;
                }
            }
            return bitmap;
        }
        if (iArr == null) {
            try {
                inputStream = new FileInputStream(file2);
            } catch (IOException unused) {
            } catch (OutOfMemoryError e) {
                if (!C24161Jc.A01()) {
                    Log.e("MessageThumbsThread/bitmap-decode/OutOfMemory avoided");
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        } else {
            inputStream = C124336Xy.A00(file2, j);
        }
        AnonymousClass25P A0B2 = AnonymousClass204.A0B(new AnonymousClass25O(i, 2), inputStream);
        bitmap = A0B2.A02;
        if (r11.A06 == 0 && r11.A08 == 0 && A0B2.A00 != 0 && A0B2.A01 != 0) {
            C26511Sk.A0Q(r11, file2);
        }
        if (bitmap != null) {
            Matrix A082 = C26511Sk.A08(new C26303CxM(file2.getAbsolutePath()).A0Z(1));
            if (A082 != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), A082, true);
                if (bitmap != createBitmap) {
                    bitmap.recycle();
                }
                bitmap = createBitmap;
            }
            if (z && bitmap != null) {
                FilterUtils.A02(i2, bitmap);
            }
        }
        inputStream.close();
        return bitmap;
        throw th;
    }

    public synchronized void A01(View view, AnonymousClass206 r15, C693536w r16, C130226j5 r17, AnonymousClass3M2 r18, Object obj, boolean z) {
        View view2;
        C58722l9 r4;
        C693536w r7 = r16;
        AnonymousClass206 r6 = r15;
        synchronized (this) {
            LinkedBlockingDeque linkedBlockingDeque = this.A0B.A00;
            Iterator it = linkedBlockingDeque.iterator();
            while (true) {
                view2 = view;
                if (!it.hasNext()) {
                    break;
                }
                C58722l9 r2 = (C58722l9) it.next();
                if (r2.A00 == view) {
                    linkedBlockingDeque.remove(r2);
                }
            }
            Iterator it2 = linkedBlockingDeque.iterator();
            while (true) {
                Object obj2 = obj;
                if (it2.hasNext()) {
                    C58722l9 r3 = (C58722l9) it2.next();
                    if (r3.A01.A0v.equals(r15.A0v) && r3.A05.equals(obj2) && r3.A00 == view) {
                        break;
                    }
                } else {
                    C130226j5 r8 = r17;
                    AnonymousClass3M2 r9 = r18;
                    boolean z2 = z;
                    if (r15 instanceof AnonymousClass21V) {
                        AnonymousClass21V r62 = (AnonymousClass21V) r6;
                        C62572rc r42 = r62.A02;
                        if (r42 != null) {
                            if (!r42.A0V || r42.A0G == null || r42.A01()) {
                                r42.A0c = false;
                            } else if (!r42.A0c) {
                                r42.A0c = true;
                                Handler handler = this.A01;
                                r8.getClass();
                                handler.post(new AnonymousClass7RJ(r8, 7));
                            }
                            if (r42.A0G != null || (r62 instanceof C441322g) || (r62 instanceof C438421d) || (r62 instanceof C440922c) || (r62 instanceof AnonymousClass21Y) || (r62 instanceof C441522i)) {
                                if (!(r62 instanceof AnonymousClass215)) {
                                    r4 = new C58722l9(view2, r62, C60502o8.A00(r62), r8, r9, this, obj2, z2);
                                }
                            }
                        }
                    } else if ((r15 instanceof AnonymousClass210) && !(r15 instanceof AnonymousClass215)) {
                        if (r16 == null && (r7 = C60502o8.A00(r15)) == null) {
                            if (AnonymousClass2UX.A00(r15) != null) {
                                if (AnonymousClass2UX.A00(r15).A07 == null) {
                                }
                            }
                        }
                        r4 = new C58722l9(view2, r6, r7, r8, r9, this, obj2, z2);
                    }
                    linkedBlockingDeque.offer(r4);
                    if (this.A00 == null) {
                        AnonymousClass2Q0 r5 = new AnonymousClass2Q0(this.A03, this.A0D, this.A0E, this.A0F, this);
                        this.A00 = r5;
                        r5.start();
                    }
                }
            }
        }
    }

    public C32051gY(AnonymousClass1T1 r3, C218617r r4, AnonymousClass118 r5, C18000vb r6, AnonymousClass11Z r7, AnonymousClass1KW r8, C18030ve r9, C32041gX r10, C26421Sb r11, C25291Nq r12, C26631Sw r13, C26611Su r14) {
        this.A06 = r9;
        this.A04 = r5;
        this.A03 = r4;
        this.A0E = r8;
        this.A08 = r11;
        this.A05 = r7;
        this.A0D = r6;
        this.A0F = r14;
        this.A0A = r13;
        this.A07 = r10;
        this.A09 = r12;
        this.A02 = r3;
    }
}
