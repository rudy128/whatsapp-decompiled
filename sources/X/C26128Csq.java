package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.Csq  reason: case insensitive filesystem */
public final class C26128Csq {
    public double A00;
    public double A01;
    public double A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public C26132Csv A0S;
    public C26132Csv A0T;
    public C26132Csv A0U;
    public C26132Csv A0V;
    public C26132Csv A0W;
    public String A0X;
    public HashMap A0Y = C17880vN.A11();
    public List A0Z;
    public List A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public float[] A1i;
    public int[] A1j;
    public int[] A1k;

    public static void A00(C22908BUt bUt, CKJ ckj, Object obj) {
        bUt.A00.A04(ckj, obj);
        C25093CXe A032 = bUt.A00.A03();
        bUt.A00 = new C26128Csq();
        bUt.A00.A06(A032);
    }

    public C25093CXe A03() {
        if (!this.A1L || !this.A1d) {
            return new C25093CXe(this);
        }
        throw AnonymousClass000.A0n("Unable to build setting modifications, video stabilization will not work correctly if optical stabilization is also enabled, please enable one at a time only.");
    }

    public void A04(CKJ ckj, Object obj) {
        int i = ckj.A00;
        switch (i) {
            case 2:
                this.A1A = AnonymousClass000.A1Y(obj);
                this.A1B = true;
                return;
            case 3:
                this.A1d = AnonymousClass000.A1Y(obj);
                this.A1e = true;
                return;
            case 4:
                this.A1L = AnonymousClass000.A1Y(obj);
                this.A1M = true;
                return;
            case 5:
                this.A0z = AnonymousClass000.A1Y(obj);
                this.A10 = true;
                return;
            case 6:
                this.A0e = AnonymousClass000.A1Y(obj);
                this.A0f = true;
                return;
            case 8:
                this.A1W = AnonymousClass000.A1Y(obj);
                this.A1X = true;
                return;
            case 9:
                this.A0C = AnonymousClass000.A0M(obj);
                this.A0y = true;
                return;
            case 10:
                this.A0B = AnonymousClass000.A0M(obj);
                this.A0w = true;
                return;
            case 11:
                this.A06 = AnonymousClass000.A0M(obj);
                this.A0b = true;
                return;
            case 12:
                this.A08 = AnonymousClass000.A0M(obj);
                this.A0p = true;
                return;
            case 13:
                this.A0A = AnonymousClass000.A0M(obj);
                this.A0s = true;
                return;
            case 14:
                this.A0E = AnonymousClass000.A0M(obj);
                this.A1F = true;
                return;
            case 15:
                this.A0F = AnonymousClass000.A0M(obj);
                this.A1G = true;
                return;
            case 17:
                this.A0I = AnonymousClass000.A0M(obj);
                this.A1O = true;
                return;
            case 18:
                this.A0J = AnonymousClass000.A0M(obj);
                this.A1Q = true;
                return;
            case 19:
                this.A0K = AnonymousClass000.A0M(obj);
                this.A1S = true;
                return;
            case 21:
                this.A0H = AnonymousClass000.A0M(obj);
                this.A1N = true;
                return;
            case 22:
                this.A0D = AnonymousClass000.A0M(obj);
                this.A1E = true;
                return;
            case 23:
                this.A0L = AnonymousClass000.A0M(obj);
                this.A1Y = true;
                return;
            case 24:
                this.A0N = AnonymousClass000.A0M(obj);
                this.A1f = true;
                return;
            case 25:
                this.A0O = AnonymousClass000.A0M(obj);
                this.A1h = true;
                return;
            case 26:
                this.A05 = AnonymousClass000.A04(obj);
                this.A1Z = true;
                return;
            case 27:
                this.A0Q = C17880vN.A05(obj);
                this.A15 = true;
                return;
            case 30:
                this.A00 = AnonymousClass8BR.A00(obj);
                this.A11 = true;
                return;
            case 31:
                this.A02 = AnonymousClass8BR.A00(obj);
                this.A13 = true;
                return;
            case 32:
                this.A01 = AnonymousClass8BR.A00(obj);
                this.A12 = true;
                return;
            case 33:
                this.A0U = (C26132Csv) obj;
                this.A1T = true;
                return;
            case 34:
                this.A0T = (C26132Csv) obj;
                this.A1P = true;
                return;
            case 35:
                this.A0V = (C26132Csv) obj;
                this.A1c = true;
                return;
            case 36:
                this.A0S = (C26132Csv) obj;
                this.A1H = true;
                return;
            case 37:
                this.A0Z = C25390Cer.A00((List) obj);
                this.A0x = true;
                return;
            case 38:
                this.A0a = C25390Cer.A00((List) obj);
                this.A1K = true;
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    this.A1k = new int[]{iArr[0], iArr[1]};
                    this.A1R = true;
                    return;
                }
                return;
            case 42:
                this.A0X = (String) obj;
                this.A14 = true;
                return;
            case 44:
                this.A0t = AnonymousClass000.A1Y(obj);
                this.A0u = true;
                return;
            case 45:
                this.A0g = AnonymousClass000.A1Y(obj);
                this.A0h = true;
                return;
            case 46:
                this.A0P = C17880vN.A05(obj);
                this.A0v = true;
                return;
            case 47:
                this.A09 = AnonymousClass000.A0M(obj);
                this.A0q = true;
                return;
            case 48:
                this.A03 = AnonymousClass000.A04(obj);
                this.A0c = true;
                return;
            case 49:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 4) {
                    this.A1i = fArr;
                    this.A0m = true;
                    return;
                }
                throw AnonymousClass000.A0k("Color Correction Gains invalid length");
            case 50:
                this.A07 = AnonymousClass000.A0M(obj);
                this.A0n = true;
                return;
            case 51:
                int[] iArr2 = (int[]) obj;
                if (iArr2 == null || iArr2.length == 18) {
                    this.A1j = iArr2;
                    this.A0o = true;
                    return;
                }
                throw AnonymousClass000.A0k("Color Correction Transform invalid length");
            case 52:
                this.A0r = true;
                return;
            case 53:
                this.A0i = AnonymousClass000.A1Y(obj);
                this.A0j = true;
                return;
            case 54:
                this.A04 = AnonymousClass000.A04(obj);
                this.A1I = true;
                return;
            case 55:
                this.A0Y = (HashMap) obj;
                this.A0d = true;
                return;
            case 56:
                this.A0k = AnonymousClass000.A1Y(obj);
                this.A0l = true;
                return;
            case 57:
                this.A1C = AnonymousClass000.A1Y(obj);
                this.A1D = true;
                return;
            case 58:
                this.A0W = (C26132Csv) obj;
                this.A1g = true;
                return;
            case 59:
                this.A0M = AnonymousClass000.A0M(obj);
                this.A1b = true;
                return;
            case 60:
                this.A1U = AnonymousClass000.A1Y(obj);
                this.A1V = true;
                return;
            case 62:
                this.A0R = C17880vN.A05(obj);
                this.A1a = true;
                return;
            case 63:
                this.A16 = AnonymousClass000.A1Y(obj);
                this.A17 = true;
                return;
            case 64:
                this.A18 = AnonymousClass000.A1Y(obj);
                this.A19 = true;
                return;
            case 65:
                this.A0G = AnonymousClass000.A0M(obj);
                this.A1J = true;
                return;
            default:
                throw BEA.A0h("Invalid Settings key: ", AnonymousClass000.A10(), i);
        }
    }

    public static void A01(CKJ ckj, C26128Csq csq, int i) {
        csq.A04(ckj, Integer.valueOf(i));
    }

    public static void A02(CKJ ckj, CKK ckk, int i) {
        ckk.A00.A04(ckj, Integer.valueOf(i));
    }
}
