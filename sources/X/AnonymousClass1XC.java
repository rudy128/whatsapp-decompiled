package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.1XC  reason: invalid class name */
public class AnonymousClass1XC {
    public static final SparseIntArray A03;
    public static final AnonymousClass00O A04 = new AnonymousClass00O(1);
    public static final Object A05 = new Object();
    public final AnonymousClass1XD A00;
    public final AnonymousClass1XG A01;
    public final Locale A02;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(45);
        A03 = sparseIntArray;
        sparseIntArray.put(2, 5);
        sparseIntArray.put(3, 5);
        sparseIntArray.put(4, 5);
        sparseIntArray.put(243, 241);
        sparseIntArray.put(238, 240);
        sparseIntArray.put(244, 242);
        sparseIntArray.put(239, 242);
        sparseIntArray.put(241, 236);
        sparseIntArray.put(240, 234);
        sparseIntArray.put(242, 237);
        sparseIntArray.put(198, 184);
        sparseIntArray.put(196, 182);
        sparseIntArray.put(200, 186);
        sparseIntArray.put(201, 187);
        sparseIntArray.put(199, 185);
        sparseIntArray.put(195, 181);
        sparseIntArray.put(197, 183);
        sparseIntArray.put(205, 191);
        sparseIntArray.put(203, 189);
        sparseIntArray.put(207, 193);
        sparseIntArray.put(208, 194);
        sparseIntArray.put(206, 192);
        sparseIntArray.put(202, 188);
        sparseIntArray.put(204, 190);
        sparseIntArray.put(261, 249);
        sparseIntArray.put(260, 248);
        sparseIntArray.put(264, 252);
        sparseIntArray.put(257, 245);
        sparseIntArray.put(265, 253);
        sparseIntArray.put(263, 251);
        sparseIntArray.put(262, 250);
        sparseIntArray.put(258, 246);
        sparseIntArray.put(268, 256);
        sparseIntArray.put(267, 255);
        sparseIntArray.put(266, 254);
        sparseIntArray.put(259, 247);
        sparseIntArray.put(296, 297);
        sparseIntArray.put(287, 288);
        sparseIntArray.put(294, 295);
        sparseIntArray.put(275, 277);
        sparseIntArray.put(279, 281);
        sparseIntArray.put(284, 286);
        sparseIntArray.put(290, 292);
        sparseIntArray.put(276, 277);
        sparseIntArray.put(280, 281);
        sparseIntArray.put(285, 286);
        sparseIntArray.put(291, 292);
    }

    public static AnonymousClass1XD A00(Context context, Resources resources, Locale locale) {
        String[] strArr = AnonymousClass1X0.A04;
        String languageTag = locale.toLanguageTag();
        Object obj = A05;
        synchronized (obj) {
            AnonymousClass00O r2 = A04;
            int A022 = r2.A02(languageTag);
            if (A022 >= 0) {
                AnonymousClass1XD r0 = (AnonymousClass1XD) r2.A06(A022);
                return r0;
            }
            AnonymousClass1XD A002 = C22761Dc.A00(context, resources, "cldr_strings", locale, true);
            synchronized (obj) {
                r2.put(languageTag, A002);
            }
            return A002;
        }
    }

    public String A02(Object obj, int i) {
        String format;
        AnonymousClass1XD r1 = this.A00;
        if (r1 == null) {
            format = "translations/getQuantityString: CLDR data not loaded";
        } else {
            String A012 = r1.A01(this.A01, obj, i);
            if (A012 != null) {
                return A012;
            }
            int i2 = A03.get(i, -1);
            if (i2 != -1) {
                return A02(obj, i2);
            }
            format = String.format(Locale.US, "CldrResources/getQuantityString error: could not find CLDR string for id=%d", new Object[]{Integer.valueOf(i)});
        }
        Log.e(format);
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r0 != null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1XC(android.content.Context r6, android.content.res.Resources r7, java.util.Locale r8) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = X.AnonymousClass1X0.A05(r8)
            if (r0 == 0) goto L_0x001b
            X.1XD r1 = A00(r6, r7, r8)
            if (r1 == 0) goto L_0x001b
            X.1XE r0 = r1.A00
            if (r0 == 0) goto L_0x001b
            android.util.SparseIntArray r0 = r0.A02
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0021
        L_0x001b:
            java.util.Locale r8 = java.util.Locale.US
            X.1XD r1 = A00(r6, r7, r8)
        L_0x0021:
            r5.A00 = r1
            java.util.Map r0 = X.AnonymousClass1XG.A00
            java.lang.String r4 = r8.getLanguage()
            java.lang.String r3 = r8.getCountry()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0056
            java.util.Map r2 = X.AnonymousClass1XG.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "_"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.Object r0 = r2.get(r0)
            X.1XG r0 = (X.AnonymousClass1XG) r0
            if (r0 == 0) goto L_0x0056
        L_0x0051:
            r5.A01 = r0
            r5.A02 = r8
            return
        L_0x0056:
            java.util.Map r1 = X.AnonymousClass1XG.A00
            java.lang.Object r0 = r1.get(r4)
            X.1XG r0 = (X.AnonymousClass1XG) r0
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "root"
            java.lang.Object r0 = r1.get(r0)
            X.1XG r0 = (X.AnonymousClass1XG) r0
            if (r0 != 0) goto L_0x0051
            java.lang.String r1 = "No plural rule found for 'root' locale."
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XC.<init>(android.content.Context, android.content.res.Resources, java.util.Locale):void");
    }

    public static String A01(AnonymousClass1XD r3, int i) {
        String A002 = r3.A00(i);
        if (A002 != null) {
            return A002;
        }
        int i2 = A03.get(i, -1);
        if (i2 != -1) {
            return A01(r3, i2);
        }
        Log.e(String.format(Locale.US, "CldrResources/getString error: could not find CLDR string for id=%d", new Object[]{Integer.valueOf(i)}));
        return "";
    }
}
