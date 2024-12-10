package X;

import android.util.Pair;
import java.util.Locale;

public class CXX {
    public int A00;
    public int A01;
    public long A02 = -1;
    public long A03 = Long.MAX_VALUE;
    public Pair A04;
    public Long A05;
    public Long A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final CZH A0A;
    public final String A0B;

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        AnonymousClass000.A1N(objArr, this.A09);
        AnonymousClass000.A1M(objArr, this.A01);
        AnonymousClass3Ma.A1S(objArr, this.A00);
        objArr[3] = this.A06;
        objArr[4] = this.A05;
        objArr[5] = Pair.create(Long.valueOf(this.A03), Long.valueOf(this.A02));
        return String.format(locale, "isKeyCached=%s, mNetworkRequests=%d, mCacheRequests=%d, mRequestedRange=[%d,%d], mDynamicRange=%s", objArr);
    }

    public CXX(CZH czh, String str) {
        this.A0A = czh;
        this.A0B = str;
    }
}
