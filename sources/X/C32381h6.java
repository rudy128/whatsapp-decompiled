package X;

import com.whatsapp.util.Log;

/* renamed from: X.1h6  reason: invalid class name and case insensitive filesystem */
public class C32381h6 {
    public final AnonymousClass11E A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final C32361h4 A03;
    public final AnonymousClass1SU A04;
    public final C200710s A05;
    public final AnonymousClass00H A06;

    public int A01(String str, String str2) {
        String str3;
        if (str == null) {
            if (AnonymousClass1RO.A02(str2)) {
                return 4;
            }
            if (str2 != null && (str2.contains("static.whatsapp.net") || str2.contains("wa/static"))) {
                return 5;
            }
            str3 = "messagelogging/getBackendStoreType Unknown backend store type, both direct path and url are null";
            Log.e(str3);
            return 0;
        } else if (str.startsWith("/o")) {
            return 3;
        } else {
            if (str.startsWith("/v")) {
                return 2;
            }
            if (str2 == null || (!str2.contains("static.whatsapp.net") && !str2.contains("wa/static"))) {
                str3 = "messagelogging/getBackendStoreType Unknown backend store type";
                Log.e(str3);
                return 0;
            }
        }
        return 5;
    }

    public static int A00(C18030ve r3, C1409173o r4, Boolean bool) {
        int i;
        if (r4 == null) {
            i = -1;
        } else {
            i = r4.A01;
        }
        int A002 = C1409973w.A00(i);
        if (A002 != 11 || bool == null || !C18020vd.A05(C18040vf.A02, r3, 8457)) {
            return A002;
        }
        if (bool.booleanValue()) {
            return 11;
        }
        return 16;
    }

    public void A02(Long l, int[] iArr, int i, long j, boolean z) {
        C46942Gm r2 = new C46942Gm();
        r2.A02 = Integer.valueOf(i);
        r2.A00 = Boolean.valueOf(z);
        r2.A07 = l;
        if (iArr != null) {
            int length = iArr.length;
            r2.A08 = Long.valueOf((long) length);
            if (length >= 1) {
                r2.A03 = Long.valueOf((long) iArr[0]);
                if (length >= 2) {
                    r2.A04 = Long.valueOf((long) iArr[1]);
                    if (length >= 3) {
                        r2.A05 = Long.valueOf((long) iArr[2]);
                        if (length >= 4) {
                            r2.A06 = Long.valueOf((long) iArr[3]);
                        }
                    }
                }
            }
        }
        r2.A01 = Double.valueOf((double) j);
        this.A02.CC4(r2);
    }

    public C32381h6(AnonymousClass11E r3, C18030ve r4, AnonymousClass18K r5, C32361h4 r6, AnonymousClass1SU r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        this.A01 = r4;
        this.A02 = r5;
        this.A06 = r9;
        this.A04 = r7;
        this.A00 = r3;
        this.A03 = r6;
        this.A05 = new C200710s(r8, false);
    }
}
