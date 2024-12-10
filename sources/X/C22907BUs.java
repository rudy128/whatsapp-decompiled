package X;

import android.graphics.Rect;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.BUs  reason: case insensitive filesystem */
public final class C22907BUs extends C25971Cpe implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C26132Csv A02;
    public C26132Csv A03;
    public C26132Csv A04;
    public C26132Csv A05;
    public C26132Csv A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Double A0M;
    public Double A0N;
    public Double A0O;
    public Float A0P;
    public Float A0Q;
    public Float A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public Integer A0d;
    public Integer A0e;
    public Integer A0f;
    public Integer A0g;
    public Integer A0h;
    public Integer A0i;
    public Long A0j;
    public Long A0k;
    public Long A0l;
    public String A0m;
    public HashMap A0n;
    public List A0o;
    public List A0p;
    public float[] A0q;
    public int[] A0r;
    public final int[] A0s = C108945cZ.A1W();
    public final C25632CjI A0t;

    public void A05(CKJ ckj, Object obj) {
        int i = ckj.A00;
        Rect rect = null;
        int i2 = 0;
        switch (i) {
            case 2:
                if (BE9.A1T(C25632CjI.A0K, this.A0t)) {
                    C28111Yx.A02(obj);
                    boolean A1Y = AnonymousClass000.A1Y(obj);
                    int i3 = 0;
                    if (A1Y) {
                        i3 = 17;
                    }
                    A00(this, C25971Cpe.A0s, i3);
                    if (A1Y) {
                        A01(this, C25971Cpe.A0r, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A0K = (Boolean) obj;
                return;
            case 4:
                this.A0H = (Boolean) obj;
                return;
            case 5:
                this.A0E = (Boolean) obj;
                return;
            case 6:
                this.A07 = (Boolean) obj;
                return;
            case 8:
                this.A0J = (Boolean) obj;
                return;
            case 9:
                this.A0Y = (Integer) obj;
                return;
            case 10:
                C28111Yx.A02(obj);
                int A0M2 = AnonymousClass000.A0M(obj);
                if (A0M2 != -1) {
                    i2 = A0M2;
                }
                this.A0X = Integer.valueOf(i2);
                return;
            case 11:
                this.A0S = (Integer) obj;
                return;
            case 12:
                this.A0U = (Integer) obj;
                return;
            case 13:
                this.A0W = (Integer) obj;
                return;
            case 14:
                this.A0a = (Integer) obj;
                return;
            case 15:
                this.A0b = (Integer) obj;
                return;
            case 17:
                this.A0e = (Integer) obj;
                return;
            case 18:
            case 52:
                return;
            case 19:
                this.A0f = (Integer) obj;
                return;
            case 21:
                this.A0d = (Integer) obj;
                return;
            case 22:
                this.A0Z = (Integer) obj;
                return;
            case 23:
                this.A0g = (Integer) obj;
                return;
            case 24:
                this.A0h = (Integer) obj;
                return;
            case 25:
                this.A0i = (Integer) obj;
                return;
            case 26:
                this.A0R = (Float) obj;
                return;
            case 27:
                this.A0k = (Long) obj;
                return;
            case 30:
                this.A0M = (Double) obj;
                return;
            case 31:
                this.A0O = (Double) obj;
                return;
            case 32:
                this.A0N = (Double) obj;
                return;
            case 33:
                C26132Csv csv = (C26132Csv) obj;
                this.A04 = csv;
                if (csv != null) {
                    rect = new Rect(0, 0, csv.A02, csv.A01);
                }
                this.A01 = rect;
                return;
            case 34:
                C26132Csv csv2 = (C26132Csv) obj;
                this.A03 = csv2;
                if (csv2 != null) {
                    rect = new Rect(0, 0, csv2.A02, csv2.A01);
                }
                this.A00 = rect;
                return;
            case 35:
                this.A05 = (C26132Csv) obj;
                return;
            case 36:
                this.A02 = (C26132Csv) obj;
                return;
            case 37:
                this.A0o = C25390Cer.A00((List) obj);
                return;
            case 38:
                this.A0p = C25390Cer.A00((List) obj);
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    int[] iArr2 = this.A0s;
                    iArr2[0] = iArr[0];
                    iArr2[1] = iArr[1];
                    return;
                }
                return;
            case 42:
                this.A0m = (String) obj;
                return;
            case 44:
                this.A0D = (Boolean) obj;
                return;
            case 45:
                this.A08 = (Boolean) obj;
                return;
            case 46:
                this.A0j = (Long) obj;
                return;
            case 47:
                this.A0V = (Integer) obj;
                return;
            case 48:
                this.A0P = (Float) obj;
                return;
            case 49:
                this.A0q = (float[]) obj;
                return;
            case 50:
                this.A0T = (Integer) obj;
                return;
            case 51:
                this.A0r = (int[]) obj;
                return;
            case 53:
                this.A09 = (Boolean) obj;
                return;
            case 54:
                this.A0Q = (Float) obj;
                return;
            case 55:
                this.A0n = (HashMap) obj;
                return;
            case 56:
                this.A0B = (Boolean) obj;
                return;
            case 58:
                this.A06 = (C26132Csv) obj;
                return;
            case 60:
                this.A0I = (Boolean) obj;
                return;
            case 62:
                this.A0l = (Long) obj;
                return;
            case 63:
                this.A0F = (Boolean) obj;
                return;
            case 64:
                this.A0G = (Boolean) obj;
                return;
            case 65:
                this.A0c = (Integer) obj;
                return;
            default:
                throw BEA.A0h("Cannot directly set: ", AnonymousClass000.A10(), i);
        }
    }

    public boolean A06(C25093CXe cXe) {
        boolean z;
        if (cXe.A0w) {
            A00(this, C25971Cpe.A0B, cXe.A0B);
            z = true;
        } else {
            z = false;
        }
        if (cXe.A0s) {
            A00(this, C25971Cpe.A09, cXe.A0A);
            z = true;
        }
        if (cXe.A1B) {
            A01(this, C25971Cpe.A0W, cXe.A1A);
            z = true;
        }
        if (cXe.A1e) {
            A01(this, C25971Cpe.A0Z, cXe.A1d);
            z = true;
        }
        if (cXe.A1V) {
            A01(this, C25971Cpe.A0Y, cXe.A1U);
            z = true;
        }
        if (cXe.A1M) {
            A01(this, C25971Cpe.A0X, cXe.A1L);
            z = true;
        }
        if (cXe.A1X) {
            A01(this, C25971Cpe.A0r, cXe.A1W);
            z = true;
        }
        if (cXe.A1S) {
            A00(this, C25971Cpe.A0o, cXe.A0K);
            z = true;
        }
        if (cXe.A1R) {
            A05(C25971Cpe.A0n, cXe.A1k);
            z = true;
        }
        if (cXe.A0y) {
            A00(this, C25971Cpe.A0D, cXe.A0C);
            z = true;
        }
        if (cXe.A0j) {
            A01(this, C25971Cpe.A0O, cXe.A0i);
            z = true;
        }
        if (cXe.A1I) {
            A05(C25971Cpe.A0d, Float.valueOf(cXe.A04));
            z = true;
        }
        if (cXe.A10) {
            A01(this, C25971Cpe.A0U, cXe.A0z);
            z = true;
        }
        if (cXe.A0f) {
            A01(this, C25971Cpe.A0M, cXe.A0e);
            z = true;
        }
        if (cXe.A0d) {
            A05(C25971Cpe.A02, cXe.A0Y);
            z = true;
        }
        if (cXe.A1f) {
            A00(this, C25971Cpe.A0z, cXe.A0N);
            z = true;
        }
        if (cXe.A0b) {
            A00(this, C25971Cpe.A00, cXe.A06);
            z = true;
        }
        if (cXe.A0p) {
            A00(this, C25971Cpe.A07, cXe.A08);
            z = true;
        }
        if (cXe.A1F) {
            A00(this, C25971Cpe.A0a, cXe.A0E);
            z = true;
        }
        if (cXe.A1G) {
            A00(this, C25971Cpe.A0b, cXe.A0F);
            z = true;
        }
        if (cXe.A1H) {
            A05(C25971Cpe.A0c, cXe.A0S);
            z = true;
        }
        if (cXe.A1O) {
            A00(this, C25971Cpe.A0i, cXe.A0I);
            z = true;
        }
        if (cXe.A1N) {
            A00(this, C25971Cpe.A0g, cXe.A0H);
            z = true;
        }
        if (cXe.A1E) {
            A00(this, C25971Cpe.A0L, cXe.A0D);
            z = true;
        }
        if (cXe.A0v) {
            A05(C25971Cpe.A0A, Long.valueOf(cXe.A0P));
            z = true;
        }
        if (cXe.A0q) {
            A00(this, C25971Cpe.A08, cXe.A09);
            z = true;
        }
        if (cXe.A0c) {
            A05(C25971Cpe.A01, Float.valueOf(cXe.A03));
            z = true;
        }
        if (cXe.A0m) {
            A05(C25971Cpe.A04, cXe.A1i);
            z = true;
        }
        if (cXe.A0n) {
            A00(this, C25971Cpe.A05, cXe.A07);
            z = true;
        }
        if (cXe.A0o) {
            A05(C25971Cpe.A06, cXe.A1j);
            z = true;
        }
        if (cXe.A1Y) {
            A00(this, C25971Cpe.A0s, cXe.A0L);
            z = true;
        }
        if (cXe.A1h) {
            A00(this, C25971Cpe.A11, cXe.A0O);
            z = true;
        }
        if (cXe.A1Z) {
            A05(C25971Cpe.A0t, Float.valueOf(cXe.A05));
            z = true;
        }
        if (cXe.A15) {
            A05(C25971Cpe.A0I, Long.valueOf(cXe.A0Q));
            z = true;
        }
        if (cXe.A11) {
            A05(C25971Cpe.A0E, Double.valueOf(cXe.A00));
            z = true;
        }
        if (cXe.A13) {
            A05(C25971Cpe.A0G, Double.valueOf(cXe.A02));
            z = true;
        }
        if (cXe.A12) {
            A05(C25971Cpe.A0F, Double.valueOf(cXe.A01));
            z = true;
        }
        if (cXe.A14) {
            A05(C25971Cpe.A0H, cXe.A0X);
            z = true;
        }
        if (cXe.A0x) {
            A05(C25971Cpe.A0C, cXe.A0Z);
            z = true;
        }
        if (cXe.A1K) {
            A05(C25971Cpe.A0f, cXe.A0a);
            z = true;
        }
        if (cXe.A1T) {
            A05(C25971Cpe.A0q, cXe.A0U);
            z = true;
        }
        if (cXe.A1P) {
            A05(C25971Cpe.A0k, cXe.A0T);
            z = true;
        }
        if (cXe.A1g) {
            A05(C25971Cpe.A10, cXe.A0W);
            z = true;
        }
        if (cXe.A1c) {
            A05(C25971Cpe.A0y, cXe.A0V);
            z = true;
        }
        if (cXe.A0u) {
            A01(this, C25971Cpe.A0S, cXe.A0t);
            z = true;
        }
        if (cXe.A0h) {
            A01(this, C25971Cpe.A0N, cXe.A0g);
            z = true;
        }
        if (cXe.A0r) {
            A05(C25971Cpe.A0l, (Object) null);
            z = true;
        }
        if (cXe.A0l) {
            A01(this, C25971Cpe.A0Q, cXe.A0k);
            z = true;
        }
        if (cXe.A1J) {
            A00(this, C25971Cpe.A0e, cXe.A0G);
            z = true;
        }
        if (cXe.A1a) {
            A05(C25971Cpe.A0v, Long.valueOf(cXe.A0R));
            z = true;
        }
        if (cXe.A17) {
            A01(this, C25971Cpe.A0J, cXe.A16);
            z = true;
        }
        if (!cXe.A19) {
            return z;
        }
        A01(this, C25971Cpe.A0K, cXe.A18);
        return true;
    }

    public C22907BUs(C25632CjI cjI) {
        List list = Collections.EMPTY_LIST;
        this.A0o = list;
        this.A0p = list;
        this.A0X = 0;
        this.A0i = 0;
        this.A0R = Float.valueOf(-1.0f);
        this.A0W = 0;
        this.A0K = false;
        this.A0H = false;
        this.A0I = false;
        this.A0J = false;
        this.A0A = false;
        this.A0L = false;
        this.A0E = false;
        this.A07 = false;
        this.A0n = C17880vN.A11();
        this.A0D = false;
        this.A08 = true;
        this.A0Y = 0;
        this.A0h = BE7.A0Z();
        this.A0S = 0;
        this.A0U = 0;
        this.A0a = 0;
        this.A0b = 0;
        this.A0e = 0;
        this.A0f = 0;
        this.A0d = 0;
        this.A0Z = 0;
        Long A0L2 = C17890vO.A0L();
        this.A0j = A0L2;
        Float A0W2 = BE7.A0W();
        this.A0P = A0W2;
        this.A0T = 1;
        this.A0g = 0;
        this.A0V = 1;
        this.A0k = A0L2;
        Double A0Q2 = AnonymousClass8BV.A0Q();
        this.A0M = A0Q2;
        this.A0O = A0Q2;
        this.A0N = A0Q2;
        this.A0m = "";
        this.A09 = true;
        this.A0Q = A0W2;
        this.A0B = false;
        this.A0c = 0;
        this.A0C = false;
        this.A0t = cjI;
    }

    public static void A00(C22907BUs bUs, CKJ ckj, int i) {
        bUs.A05(ckj, Integer.valueOf(i));
    }

    public static void A01(C22907BUs bUs, CKJ ckj, boolean z) {
        bUs.A05(ckj, Boolean.valueOf(z));
    }

    public Object clone() {
        return super.clone();
    }
}
