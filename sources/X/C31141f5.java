package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1f5  reason: invalid class name and case insensitive filesystem */
public abstract class C31141f5 {
    public static long A00 = 500000000;

    public static C128726ga A03(AnonymousClass1W6 r6, C32021gV r7, Integer num, Long l, List list) {
        if (!(num == null || l == null)) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass206 A03 = r6.A01.A03(((Number) it.next()).longValue());
                    if (A03 instanceof AnonymousClass21V) {
                        AnonymousClass21V r1 = (AnonymousClass21V) A03;
                        if (r1.A1E()) {
                            arrayList.add(C137216v6.A00(r1, r7));
                        }
                    }
                }
            }
            return new C128726ga(arrayList, num.intValue(), l.longValue());
        }
        return null;
    }

    public static void A05(Activity activity, AnonymousClass1FR r7, AnonymousClass18K r8, int i) {
        r7.BhT(new C142967Bm(activity, C83974Hj.A00(r8, i), i), (Object[]) null, 2131891427, 2131891426, 2131891847);
    }

    public static long A01(AnonymousClass11Z r2, C18030ve r3) {
        if (r3 == null) {
            return 10000000;
        }
        int A002 = C18020vd.A00(C18040vf.A02, r3, 224);
        if (A002 == -1) {
            return Math.min(r2.A04() / 100, 50000000);
        }
        return ((long) A002) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public static Cursor A02(AnonymousClass1ST r7, AnonymousClass1BI r8, int i, int i2) {
        C28781at r5;
        Cursor cursor;
        String str;
        if (i != 0) {
            if (i == 1) {
                if (i2 == 0) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDDescCursor");
                    String str2 = C50942Wj.A04;
                    String[] strArr = {String.valueOf(5)};
                    r5 = r7.A08.get();
                    cursor = ((C28801av) r5).A02.A0A(str2, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_SORT_ID_DESC", strArr);
                } else if (i2 == 1) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDAscCursor");
                    String str3 = C50942Wj.A03;
                    String[] strArr2 = {String.valueOf(5)};
                    r5 = r7.A08.get();
                    cursor = ((C28801av) r5).A02.A0A(str3, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_SORT_ID_ASC", strArr2);
                } else if (i2 == 2) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedBySizeCursor");
                    r5 = r7.A08.get();
                    if (C18020vd.A05(C18040vf.A02, r7.A0A, 6261)) {
                        str = C50942Wj.A02;
                    } else {
                        str = C50942Wj.A01;
                    }
                    cursor = ((C28801av) r5).A02.A0A(str, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_SIZE", new String[]{String.valueOf(5)});
                } else if (i2 == 3) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByForwardingScoreCursor_INTERNAL_ONLY");
                    String str4 = C50942Wj.A00;
                    String[] strArr3 = {String.valueOf(3)};
                    r5 = r7.A08.get();
                    try {
                        cursor = ((C28801av) r5).A02.A0A(str4, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_FORWARDING_SCORE", strArr3);
                    } catch (Throwable th) {
                        AnonymousClass0DT.A00(th, th);
                        throw th;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown sort type: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                r5.close();
                return cursor;
            } else if (i != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown gallery type: ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i2 == 0) {
                return r7.A07((AnonymousClass1BI) null, 5000000);
            } else {
                if (i2 == 1) {
                    return r7.A06((AnonymousClass1BI) null, 5000000);
                }
                if (i2 == 2) {
                    return r7.A05((AnonymousClass1BI) null, 5000000);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown sort type: ");
                sb3.append(i2);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else if (i2 == 0) {
            return r7.A07(r8, -1);
        } else {
            if (i2 == 1) {
                return r7.A06(r8, -1);
            }
            if (i2 == 2) {
                return r7.A05(r8, -1);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown sort type: ");
            sb4.append(i2);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public static boolean A06(C19830z4 r6, C18030ve r7, long j, long j2) {
        Boolean bool = C17970vW.A03;
        long A002 = ((long) C18020vd.A00(C18040vf.A02, r7, 10509)) * SearchActionVerificationClientService.MS_TO_NS;
        A00 = A002;
        if (j <= 5000000000L) {
            A002 = (long) (((float) (j * ((long) ((int) ((((float) A002) * 100.0f) / 5.0E9f))))) / 100.0f);
        }
        boolean z = false;
        if (j2 <= A002) {
            z = true;
        }
        AnonymousClass00H r2 = r6.A00;
        if (((SharedPreferences) r2.get()).getBoolean("storage_usage_banner_dismissed", false)) {
            if (!z) {
                C19830z4.A00(r6).putBoolean("storage_usage_banner_dismissed", false).apply();
                return false;
            }
        } else if (!z) {
            return false;
        }
        if (!((SharedPreferences) r2.get()).getBoolean("storage_usage_banner_dismissed", false)) {
            return true;
        }
        return false;
    }

    public static long A00(C218617r r4, C1403671d r5) {
        long A01 = C64062u9.A01((C42621yT) null, r4.A0J());
        C26301Rp.A04(r5.A00, "STORAGE_USAGE_MEDIA_SIZE", String.valueOf(A01));
        C1403671d.A00(r5, "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME");
        return A01;
    }

    public static String A04(Context context, C18000vb r10) {
        return context.getString(2131896557, new Object[]{r10.A0J(new Object[]{String.format(context.getResources().getConfiguration().locale, "%d", new Object[]{5L})}, 283, 5)});
    }
}
