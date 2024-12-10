package X;

import android.content.SharedPreferences;

/* renamed from: X.2gx  reason: invalid class name and case insensitive filesystem */
public final class C56132gx {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final SharedPreferences A09;
    public final String A0A;
    public final C18100vl A0B;

    public C56132gx(SharedPreferences sharedPreferences, String str) {
        long longValue;
        C18070vi.A0d(str, 1);
        C18070vi.A0d(sharedPreferences, 2);
        this.A0A = str;
        this.A09 = sharedPreferences;
        C18110vm r0 = new C18110vm(new AnonymousClass3HJ(this));
        this.A0B = r0;
        String str2 = "";
        String string = sharedPreferences.getString((String) r0.getValue(), str2);
        String[] strArr = (String[]) AnonymousClass1YF.A0R(string != null ? string : str2, new char[]{','}).toArray(new String[0]);
        Long A052 = C63782tg.A05(strArr, 0);
        long j = 0;
        if (A052 == null) {
            longValue = 0;
        } else {
            longValue = A052.longValue();
        }
        this.A03 = longValue;
        this.A04 = C63782tg.A00(strArr, 1);
        this.A07 = C63782tg.A00(strArr, 2);
        this.A08 = C63782tg.A00(strArr, 3);
        this.A02 = C63782tg.A00(strArr, 4);
        this.A01 = C63782tg.A00(strArr, 5);
        this.A00 = C63782tg.A00(strArr, 6);
        this.A06 = C63782tg.A00(strArr, 7);
        Long A053 = C63782tg.A05(strArr, 8);
        this.A05 = A053 != null ? A053.longValue() : j;
    }
}
