package X;

import android.content.SharedPreferences;

/* renamed from: X.2ga  reason: invalid class name and case insensitive filesystem */
public final class C55922ga {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final SharedPreferences A05;
    public final String A06;
    public final C18100vl A07;

    public C55922ga(SharedPreferences sharedPreferences, String str) {
        long longValue;
        C18070vi.A0d(str, 1);
        C18070vi.A0d(sharedPreferences, 2);
        this.A06 = str;
        this.A05 = sharedPreferences;
        C18110vm r0 = new C18110vm(new AnonymousClass3HI(this));
        this.A07 = r0;
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
        this.A02 = longValue;
        this.A01 = C63782tg.A00(strArr, 1);
        this.A00 = C63782tg.A00(strArr, 2);
        this.A04 = C63782tg.A00(strArr, 3);
        Long A053 = C63782tg.A05(strArr, 4);
        this.A03 = A053 != null ? A053.longValue() : j;
    }
}
