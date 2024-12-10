package X;

import java.util.List;

public class DS2 implements Cloneable {
    public long A00 = 0;
    public C5W A01;
    public C22747BNk A02;
    public DS0 A03;
    public DS0 A04;
    public DS0 A05;
    public C27070DRv A06;
    public C27070DRv A07;
    public C27070DRv A08;
    public C27070DRv A09;
    public C27070DRv A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Float A0E;
    public Float A0F;
    public Float A0G;
    public Float A0H;
    public Float A0I;
    public Float A0J;
    public Float A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public List A0b;
    public DS0[] A0c;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.DS0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.DS0, java.lang.Object] */
    public static DS2 A00() {
        DS2 ds2 = new DS2();
        ds2.A00 = -1;
        C22747BNk bNk = C22747BNk.A01;
        ds2.A06 = bNk;
        Integer num = AnonymousClass00R.A00;
        ds2.A0N = num;
        Float valueOf = Float.valueOf(1.0f);
        ds2.A0E = valueOf;
        ds2.A09 = null;
        ds2.A0J = valueOf;
        ? obj = new Object();
        obj.A00 = 1.0f;
        obj.A01 = num;
        ds2.A05 = obj;
        ds2.A0R = num;
        ds2.A0S = num;
        ds2.A0I = Float.valueOf(4.0f);
        ds2.A0c = null;
        ? obj2 = new Object();
        obj2.A00 = 0.0f;
        obj2.A01 = num;
        ds2.A04 = obj2;
        ds2.A0F = valueOf;
        ds2.A02 = bNk;
        ds2.A0b = null;
        ds2.A03 = new DS0(AnonymousClass00R.A0u, 12.0f);
        ds2.A0P = 400;
        ds2.A0O = num;
        ds2.A0U = num;
        ds2.A0M = num;
        ds2.A0T = num;
        ds2.A0C = AnonymousClass000.A0i();
        ds2.A01 = null;
        ds2.A0Z = null;
        ds2.A0Y = null;
        ds2.A0X = null;
        Boolean bool = Boolean.TRUE;
        ds2.A0B = bool;
        ds2.A0D = bool;
        ds2.A08 = bNk;
        ds2.A0H = valueOf;
        ds2.A0W = null;
        ds2.A0L = num;
        ds2.A0a = null;
        ds2.A07 = null;
        ds2.A0G = valueOf;
        ds2.A0A = null;
        ds2.A0K = valueOf;
        ds2.A0V = num;
        ds2.A0Q = num;
        return ds2;
    }

    public Object clone() {
        DS2 ds2 = (DS2) super.clone();
        DS0[] ds0Arr = this.A0c;
        if (ds0Arr != null) {
            ds2.A0c = (DS0[]) ds0Arr.clone();
        }
        return ds2;
    }
}
