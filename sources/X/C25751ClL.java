package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: X.ClL  reason: case insensitive filesystem */
public class C25751ClL {
    public static final CKN A0K = new CKN(6);
    public static final CKN A0L = new CKN(5);
    public static final CKN A0M = new CKN(4);
    public static final CKN A0N = new CKN(3);
    public static final CKO A0O = new CKO(9);
    public static final CKO A0P = new CKO(10);
    public static final CKO A0Q = new CKO(14);
    public static final CKO A0R = new CKO(13);
    public static final CKO A0S = new CKO(17);
    public static final CKO A0T = new CKO(7);
    public static final CKO A0U = new CKO(20);
    public static final CKO A0V = new CKO(11);
    public static final CKO A0W = new CKO(21);
    public static final CKO A0X = new CKO(0);
    public static final CKO A0Y = new CKO(1);
    public static final CKO A0Z = new CKO(8);
    public static final CKO A0a = new CKO(15);
    public static final CKO A0b = new CKO(19);
    public static final CKO A0c = new CKO(18);
    public static final CKO A0d = new CKO(2);
    public static final CKO A0e = new CKO(16);
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final Rect A03;
    public final Rect A04;
    public final Rect A05;
    public final C25089CXa A06;
    public final C25751ClL A07;
    public final Boolean A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Long A0H;
    public final byte[] A0I;
    public final byte[] A0J;

    public Object A00(CKN ckn) {
        int i;
        int i2 = ckn.A00;
        if (i2 == 3) {
            return this.A04;
        }
        if (i2 == 4) {
            return this.A03;
        }
        if (i2 != 5) {
            i = this.A00;
        } else {
            i = this.A01;
        }
        return Integer.valueOf(i);
    }

    public Object A01(CKO cko) {
        int i = cko.A00;
        switch (i) {
            case 0:
                return this.A0I;
            case 1:
                return this.A06;
            case 2:
                return this.A05;
            case 3:
                return this.A04;
            case 7:
                return this.A0H;
            case 8:
                return this.A0D;
            case 9:
                return this.A09;
            case 10:
                return this.A0B;
            case 11:
                return this.A0A;
            case 13:
                return null;
            case 14:
                return this.A07;
            case 15:
                return this.A0E;
            case 16:
                return this.A0G;
            case 17:
                return this.A08;
            case 18:
                return this.A0F;
            case 19:
                return this.A0J;
            case 20:
                return this.A0C;
            case 21:
                return this.A02;
            default:
                throw BEA.A0h("Invalid photo capture result key: ", AnonymousClass000.A10(), i);
        }
    }

    public C25751ClL(CZR czr) {
        this.A03 = czr.A01;
        this.A04 = czr.A0J;
        this.A01 = czr.A0I;
        this.A00 = czr.A0H;
        this.A0I = czr.A0F;
        this.A0J = czr.A0G;
        this.A06 = czr.A03;
        this.A05 = czr.A02;
        this.A0H = czr.A0E;
        this.A0D = czr.A0A;
        this.A09 = czr.A06;
        this.A0B = czr.A08;
        this.A0A = czr.A07;
        this.A07 = czr.A04;
        this.A0E = czr.A0B;
        this.A0G = czr.A0D;
        this.A08 = czr.A05;
        this.A0F = czr.A0C;
        this.A0C = czr.A09;
        this.A02 = czr.A00;
    }
}
