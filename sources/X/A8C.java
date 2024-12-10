package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class A8C {
    public final AnonymousClass11P A00;
    public final AnonymousClass118 A01;
    public final C18000vb A02;
    public final AnonymousClass1QR A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass1KB A05;
    public final AZ6 A06;

    public void A0A(Context context, C20118A8b a8b, C1601587i r14, String str, boolean z) {
        String str2;
        Context context2 = context;
        C20118A8b a8b2 = a8b;
        C1601587i r7 = r14;
        String str3 = str;
        boolean z2 = z;
        if (a8b == null) {
            str2 = "isValidMandateMetadata: Unable to parse ";
        } else if (a8b.A0L != null && z) {
            str2 = "isValidMandateMetadata: Update mandate is only supported through deeplink URL";
        } else if (!C50922Wh.A02.contains(a8b.A0C) || !C197929xV.A00(a8b.A0O)) {
            Log.w("isValidMandateMetadata: Purpose code invalid");
            A02(context, r14, this, str, z2);
        } else {
            String str4 = a8b.A0N;
            String str5 = a8b.A0M;
            if (!(str4 == null || str5 == null)) {
                SimpleDateFormat A0q = AnonymousClass8BS.A0q("ddMMyyyy");
                try {
                    Date parse = A0q.parse(str4);
                    Date parse2 = A0q.parse(str5);
                    if (!(parse == null || parse2 == null || parse.after(parse2))) {
                        Object[] A1a = AnonymousClass8BR.A1a();
                        A1a[0] = a8b.A0A;
                        A1a[1] = a8b.A03;
                        A1a[2] = a8b.A0K;
                        int i = 0;
                        while (A1a[i] != null) {
                            i++;
                            if (i >= 3) {
                                C17960vV.A07(a8b);
                                String str6 = a8b.A0L;
                                C130146ix r4 = new C130146ix(context2, a8b2, r7, this, str3, z2);
                                if (TextUtils.isEmpty(str6)) {
                                    Context context3 = r4.A00;
                                    Intent A07 = AnonymousClass8BR.A07(context3, IndiaUpiPaymentTransactionDetailsActivity.class);
                                    A07.setFlags(268435456);
                                    A7Z.A03(A07, r4.A01, r4.A04);
                                    context3.startActivity(A07);
                                    r4.A02.Buc();
                                    return;
                                }
                                AnonymousClass8BU.A1E(this.A04, this, r4, str6, 7);
                                return;
                            }
                        }
                        str2 = "isValidMandateMetadata: missing mandatory fields";
                    }
                } catch (ParseException unused) {
                }
            }
            str2 = "isValidMandateMetadata: start and end date invalid";
        }
        Log.w(str2);
        A02(context, r14, this, str, z2);
    }

    public static long A00(AnonymousClass11P r2, long j) {
        return r2.A09(j - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset()));
    }

    public static String A01(AnonymousClass11P r2, C18000vb r3, long j) {
        return AnonymousClass11X.A00.A0B(r3, r2.A09(j - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset())));
    }

    public static void A02(Context context, C1601587i r5, A8C a8c, String str, boolean z) {
        a8c.A06.BiL((Integer) null, "qr_code_scan_error", str, 0);
        a8c.A05.CGP(new C146867Qx(context, r5, 10, z));
    }

    public static boolean A03(C18030ve r2, C20118A8b a8b, String str) {
        boolean A052;
        int i;
        if (a8b != null) {
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 2211)) {
                if (!A05(a8b.A03)) {
                    A052 = C18020vd.A05(r1, r2, 1231);
                    i = 2835;
                } else {
                    A052 = C18020vd.A05(r1, r2, 1433);
                    i = 2834;
                }
                if (A052) {
                    String A0I = r2.A0I(i);
                    if (TextUtils.isEmpty(A0I) || TextUtils.isEmpty(str) || !A0I.contains(str)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A04(C18030ve r2, String str) {
        if (C18020vd.A05(C18040vf.A02, r2, 1433)) {
            String A0I = r2.A0I(2834);
            if (TextUtils.isEmpty(A0I) || TextUtils.isEmpty(str) || !A0I.contains(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A05(String str) {
        if (str == null || str.equals("ONETIME") || str.equals("UNKNOWN")) {
            return false;
        }
        return true;
    }

    public long A06(String str, boolean z) {
        SimpleDateFormat A0q = AnonymousClass8BS.A0q("ddMMyyyy");
        A0q.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        try {
            Date parse = A0q.parse(str);
            if (parse != null) {
                if (!z) {
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                    instance.setTime(parse);
                    instance.set(11, 23);
                    AnonymousClass8BV.A1Q(instance, 12, 59);
                    instance.set(14, 999);
                    parse = instance.getTime();
                }
                return parse.getTime();
            }
        } catch (ParseException unused) {
        }
        Log.e("PAY: IndiaMandateUtils/getTimestamp, unexpected date format");
        return 0;
    }

    public String A07(long j) {
        Context context = this.A01.A00;
        Object[] A1a = AnonymousClass3MW.A1a();
        long A002 = A00(this.A00, j);
        return C108975cc.A0b(context, AnonymousClass11X.A00.A0B(this.A02, A002), A1a, 2131897545);
    }

    public String A08(AnonymousClass1KN r4, String str) {
        String BLc = AnonymousClass1KL.A0B.BLc(this.A02, r4);
        if ("MAX".equals(str)) {
            return C72473Md.A0j(this.A01.A00, BLc, 2131897491);
        }
        return BLc;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A09(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0009
            int r0 = r3.hashCode()
            switch(r0) {
                case -1738378111: goto L_0x00a7;
                case -1681232246: goto L_0x0096;
                case -602281453: goto L_0x0085;
                case 64808441: goto L_0x0075;
                case 1134556285: goto L_0x0065;
                case 1271097434: goto L_0x0055;
                case 1297843654: goto L_0x0045;
                case 1720567065: goto L_0x0035;
                case 1896178312: goto L_0x0025;
                case 1954618349: goto L_0x0015;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
        L_0x0010:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0015:
            java.lang.String r0 = "MONTHLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897498(0x7f122c9a, float:1.9429887E38)
            goto L_0x0010
        L_0x0025:
            java.lang.String r0 = "ASPRESENTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897493(0x7f122c95, float:1.9429877E38)
            goto L_0x0010
        L_0x0035:
            java.lang.String r0 = "QUARTERLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897500(0x7f122c9c, float:1.9429891E38)
            goto L_0x0010
        L_0x0045:
            java.lang.String r0 = "BIMONTHLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897494(0x7f122c96, float:1.942988E38)
            goto L_0x0010
        L_0x0055:
            java.lang.String r0 = "FORTNIGHTLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897496(0x7f122c98, float:1.9429883E38)
            goto L_0x0010
        L_0x0065:
            java.lang.String r0 = "HALFYEARLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897497(0x7f122c99, float:1.9429885E38)
            goto L_0x0010
        L_0x0075:
            java.lang.String r0 = "DAILY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897495(0x7f122c97, float:1.9429881E38)
            goto L_0x0010
        L_0x0085:
            java.lang.String r0 = "ONETIME"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897499(0x7f122c9b, float:1.942989E38)
            goto L_0x0010
        L_0x0096:
            java.lang.String r0 = "YEARLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897502(0x7f122c9e, float:1.9429895E38)
            goto L_0x0010
        L_0x00a7:
            java.lang.String r0 = "WEEKLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.118 r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897501(0x7f122c9d, float:1.9429893E38)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8C.A09(java.lang.String):java.lang.String");
    }

    public A8C(AnonymousClass1KB r1, AnonymousClass11P r2, AnonymousClass118 r3, C18000vb r4, AnonymousClass1QR r5, AZ6 az6, AnonymousClass10I r7) {
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r1;
        this.A04 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = az6;
    }
}
