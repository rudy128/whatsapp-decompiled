package X;

import android.util.Pair;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.1K3  reason: invalid class name */
public class AnonymousClass1K3 {
    public static final Charset A06 = C19620yd.A0C;
    public static final Pattern A07 = Pattern.compile("\t");
    public AnonymousClass1LB A00 = new AnonymousClass1LB(0);
    public String A01 = "";
    public final AnonymousClass1LA A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass118 A04;
    public final Object A05 = new Object();

    public static String A01(String str, String str2) {
        Pattern pattern;
        try {
            int parseInt = Integer.parseInt(str);
            String str3 = (String) AnonymousClass1K4.A01.get(parseInt);
            if (str3 != null) {
                if (!str3.equals("ZZ")) {
                    return str3;
                }
                List list = (List) AnonymousClass1K4.A02.get(parseInt);
                for (int i = 0; i < list.size(); i++) {
                    Pair pair = (Pair) list.get(i);
                    Object obj = pair.second;
                    if (obj instanceof String) {
                        pattern = Pattern.compile((String) obj);
                        list.set(i, Pair.create(pair.first, pattern));
                    } else {
                        pattern = (Pattern) obj;
                    }
                    if (pattern.matcher(str2).matches()) {
                        return (String) pair.first;
                    }
                }
            }
            return "ZZ";
        } catch (NumberFormatException unused) {
            return "ZZ";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A02(X.AnonymousClass1K3 r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "country_names_"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ".tsv"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r3 = 0
            X.118 r0 = r6.A04     // Catch:{ IOException -> 0x006f }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x006f }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x006f }
            java.io.InputStream r2 = r0.open(r1)     // Catch:{ IOException -> 0x006f }
            java.nio.charset.Charset r1 = A06     // Catch:{ IOException -> 0x006f }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x006f }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x006f }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x006f }
            r7.<init>(r0)     // Catch:{ IOException -> 0x006f }
            r0 = 243(0xf3, float:3.4E-43)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0064 }
            r6.<init>(r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = r7.readLine()     // Catch:{ all -> 0x0062 }
        L_0x003a:
            if (r1 == 0) goto L_0x005e
            java.util.regex.Pattern r0 = A07     // Catch:{ all -> 0x0062 }
            java.lang.String[] r5 = r0.split(r1)     // Catch:{ all -> 0x0062 }
            int r4 = r5.length     // Catch:{ all -> 0x0062 }
            r3 = 1
            r2 = 0
            r1 = 2
            r0 = 0
            if (r4 != r1) goto L_0x004a
            r0 = 1
        L_0x004a:
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x0062 }
            r2 = r5[r2]     // Catch:{ all -> 0x0062 }
            r1 = r5[r3]     // Catch:{ all -> 0x0062 }
            X.2dJ r0 = new X.2dJ     // Catch:{ all -> 0x0062 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0062 }
            r6.add(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = r7.readLine()     // Catch:{ all -> 0x0062 }
            goto L_0x003a
        L_0x005e:
            r7.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0087
        L_0x0062:
            r1 = move-exception
            goto L_0x0066
        L_0x0064:
            r1 = move-exception
            r6 = r3
        L_0x0066:
            r7.close()     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0072 }
        L_0x006e:
            throw r1     // Catch:{ IOException -> 0x0072 }
        L_0x006f:
            r2 = move-exception
            r6 = r3
            goto L_0x0073
        L_0x0072:
            r2 = move-exception
        L_0x0073:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "countryutils/getcountrylist error:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0087:
            if (r6 != 0) goto L_0x008d
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x008d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1K3.A02(X.1K3, java.lang.String):java.util.List");
    }

    public String A03(C18000vb r7, String str) {
        String str2;
        synchronized (this.A05) {
            String A042 = AnonymousClass1X0.A04(r7.A0N());
            if (!A042.equals(this.A01)) {
                List<C53922dJ> A022 = A02(this, A042);
                if (A022.isEmpty()) {
                    A022 = A02(this, "en");
                }
                this.A00 = new AnonymousClass1LB(A022.size());
                for (C53922dJ r0 : A022) {
                    this.A00.A03(r0.A00, r0.A01);
                }
                this.A01 = A042;
            }
            str2 = (String) this.A00.A01(str);
        }
        return str2;
    }

    public boolean A04() {
        AnonymousClass11S r0 = this.A03;
        r0.A0I();
        Me me = r0.A00;
        if (me == null) {
            return false;
        }
        try {
            return "eu".equals(this.A02.A04(me.cc));
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("countryutils/is-eu failed for ");
            sb.append(me.cc);
            Log.e(sb.toString(), e);
            return false;
        }
    }

    public boolean A05(String str) {
        AnonymousClass11S r0 = this.A03;
        r0.A0I();
        Me me = r0.A00;
        if (me == null) {
            return false;
        }
        return str.equals(A01(me.cc, me.number));
    }

    public AnonymousClass1K3(AnonymousClass1LA r3, AnonymousClass11S r4, AnonymousClass118 r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static String A00(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = (String) AnonymousClass1K4.A01.get(parseInt);
            if ("ZZ".equals(str2)) {
                return (String) AnonymousClass1K4.A00.get(parseInt);
            }
            return str2;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
