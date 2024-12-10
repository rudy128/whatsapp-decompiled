package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;

/* renamed from: X.CtA  reason: case insensitive filesystem */
public final class C26146CtA {
    public static boolean A0C = true;
    public static Bitmap.Config A0D = Bitmap.Config.ARGB_8888;
    public static BitmapFactory.Options A0E;
    public static final Bitmap A0F = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public static final C25782Clt A0G = new C25782Clt(20);
    public static final C25782Clt A0H = new C25782Clt(32);
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public Bitmap A05;
    public C26146CtA A06 = null;
    public C26146CtA A07 = null;
    public BitmapFactory.Options A08;
    public final C26146CtA[] A09 = new C26146CtA[4];
    public final C27087DTm A0A = new C22791BPe(this);
    public volatile int A0B = 0;

    public static C26146CtA A00(byte[] bArr, int i) {
        Bitmap bitmap;
        C26146CtA ctA = new C26146CtA(-1, -1);
        if (A0C) {
            BitmapFactory.Options options = ctA.A08;
            if (options.inBitmap == null) {
                options.inBitmap = (Bitmap) A0H.A00();
            }
        }
        try {
            BitmapFactory.Options options2 = ctA.A08;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i, options2);
            ctA.A05 = bitmap;
            if (A0C) {
                options2.inBitmap = null;
            }
        } catch (IllegalArgumentException unused) {
            C26138Ct1.A06.A02();
            A0C = false;
            BitmapFactory.Options options3 = ctA.A08;
            options3.inBitmap.recycle();
            options3.inBitmap = null;
            A0H.A01();
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, i, options3);
            ctA.A05 = bitmap;
        }
        if (bitmap == null) {
            ctA.A03();
            return null;
        }
        ctA.A01 = bitmap.getWidth();
        ctA.A00 = ctA.A05.getHeight();
        return ctA;
    }

    public static synchronized void A01(C26146CtA ctA) {
        synchronized (ctA) {
            Bitmap bitmap = ctA.A05;
            if (!(bitmap == null || bitmap == A0F)) {
                if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    A0G.A02(ctA.A05);
                } else if (A0C) {
                    A0H.A02(ctA.A05);
                } else {
                    ctA.A05.recycle();
                }
            }
            ctA.A05 = null;
        }
    }

    public synchronized Bitmap A02() {
        return this.A05;
    }

    public void A03() {
        this.A01 = -1;
        this.A00 = -1;
        for (int i = 0; i < 4; i++) {
            this.A09[i] = null;
        }
        A01(this);
        this.A0B = 0;
        this.A06 = null;
        this.A07 = null;
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
    }

    public synchronized String toString() {
        StringBuilder A10;
        String str;
        A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        A10.append(" {x=");
        A10.append(this.A02);
        A10.append(", y=");
        A10.append(this.A03);
        A10.append(", zoom=");
        A10.append(this.A04);
        A10.append(", status=");
        A10.append(this.A0B);
        A10.append("}");
        if (this.A05 == null) {
            str = "x";
        } else {
            str = "o";
        }
        return AnonymousClass000.A0y(str, A10);
    }

    public C26146CtA(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (!A0C) {
            BitmapFactory.Options options = A0E;
            if (options == null) {
                options = new BitmapFactory.Options();
                A0E = options;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            this.A08 = options;
            return;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        this.A08 = options2;
        options2.inSampleSize = 1;
        options2.inPreferredConfig = A0D;
        options2.inMutable = true;
    }

    public void A04() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.A0B = 0;
            if (this.A06 == null && this.A07 == null) {
                A03();
                return;
            }
            return;
        }
        C26096CsG.A01.post(this.A0A);
    }
}
