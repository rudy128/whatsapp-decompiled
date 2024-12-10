package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.1Kr  reason: invalid class name and case insensitive filesystem */
public abstract class C24531Kr {
    public static final HashMap A0J = new C24551Kt();
    public C62612rg A00 = null;
    public final SparseArray A01 = new SparseArray();
    public final SparseArray A02 = new SparseArray();
    public final AnonymousClass190 A03;
    public final AnonymousClass181 A04;
    public final AnonymousClass11E A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass118 A07;
    public final C19830z4 A08;
    public final C24491Kn A09;
    public final C18030ve A0A;
    public final AnonymousClass1D9 A0B;
    public final C24481Km A0C;
    public final C220418j A0D;
    public final AnonymousClass10I A0E;
    public final SparseIntArray A0F = new SparseIntArray();
    public final C24521Kq A0G;
    public final AnonymousClass18K A0H;
    public final List A0I = new ArrayList();

    public static synchronized void A00(C24531Kr r3, int i) {
        synchronized (r3) {
            r3.A01.put(i, Long.valueOf(AnonymousClass11P.A01(r3.A06)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r3.A07() == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2.hasNext() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        ((X.C72233Ld) r2.next()).C2Y(r3.A07());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r1.hasNext() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        ((X.C72233Ld) r1.next()).Bsl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r4 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C24531Kr r3, java.lang.String r4) {
        /*
            monitor-enter(r3)
            java.util.List r2 = r3.A0I     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            return
        L_0x000b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            r2.clear()     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0034
            java.lang.Object r0 = r3.A07()
            if (r0 == 0) goto L_0x0034
            java.util.Iterator r2 = r1.iterator()
        L_0x0020:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()
            X.3Ld r1 = (X.C72233Ld) r1
            java.lang.Object r0 = r3.A07()
            r1.C2Y(r0)
            goto L_0x0020
        L_0x0034:
            java.util.Iterator r1 = r1.iterator()
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.next()
            X.3Ld r0 = (X.C72233Ld) r0
            r0.Bsl()
            goto L_0x0038
        L_0x0048:
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24531Kr.A02(X.1Kr, java.lang.String):void");
    }

    public synchronized int A05(int i) {
        return this.A0F.get(i, 0);
    }

    public synchronized C62612rg A06() {
        C62612rg r3;
        String str;
        String str2;
        r3 = this.A00;
        if (r3 == null) {
            r3 = null;
            try {
                C19830z4 r1 = this.A08;
                if (this instanceof AnonymousClass2E5) {
                    str2 = "filter";
                } else {
                    str2 = "doodle_emoji";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("downloadable_category_local_info_json_");
                sb.append(str2);
                String string = ((SharedPreferences) r1.A00.get()).getString(sb.toString(), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    C62612rg A002 = C62612rg.A00(string);
                    this.A00 = A002;
                    return A002;
                }
            } catch (JSONException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CategoryManager/getLocalIdHash/json exception while getting local category info for ");
                if (this instanceof AnonymousClass2E5) {
                    str = "filter";
                } else {
                    str = "doodle_emoji";
                }
                sb2.append(str);
                sb2.append(e.getMessage());
                C88574a9.A03(sb2.toString());
            }
        }
        return r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A07() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.AnonymousClass2E5
            if (r0 == 0) goto L_0x0015
            r0 = r3
            X.2E5 r0 = (X.AnonymousClass2E5) r0
            monitor-enter(r2)
            java.util.HashMap r1 = r0.A0E()     // Catch:{ all -> 0x0024 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0023
            goto L_0x0022
        L_0x0015:
            r0 = r3
            X.1Ks r0 = (X.C24541Ks) r0
            monitor-enter(r2)
            android.util.SparseArray r1 = r0.A00     // Catch:{ all -> 0x0024 }
            int r0 = r1.size()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            return r1
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24531Kr.A07():java.lang.Object");
    }

    public synchronized void A08() {
        String str;
        if (this instanceof AnonymousClass2E5) {
            str = "filter";
        } else {
            str = "doodle_emoji";
        }
        this.A08.A1s(str, (String) null);
        this.A00 = null;
    }

    public synchronized void A0A(int i, int i2) {
        SparseIntArray sparseIntArray = this.A0F;
        int i3 = sparseIntArray.get(i2, 0);
        if (!(i3 == 3 && i == 3)) {
            if (i3 == 1) {
                if (i != 1) {
                }
            } else if (i3 == 3 && i == 1) {
            }
            HashMap hashMap = A0J;
            hashMap.get(Integer.valueOf(i3));
            hashMap.get(Integer.valueOf(i));
            sparseIntArray.put(i2, i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CategoryManager/setState/State change ERROR - ");
        HashMap hashMap2 = A0J;
        sb.append((String) hashMap2.get(Integer.valueOf(i3)));
        sb.append(" to ");
        sb.append((String) hashMap2.get(Integer.valueOf(i)));
        sb.append("!");
        Log.e(sb.toString());
    }

    public synchronized void A0B(C72233Ld r5, int i) {
        int A052 = A05(i);
        if (A052 == 3 || A052 == 1) {
            this.A0I.add(r5);
        } else {
            if (!(A052 == 4 || A052 == 2)) {
                if (A052 != 5 || A07() == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CategoryManager/registerCallback/Unexpected state encountered - ");
                    sb.append((String) A0J.get(Integer.valueOf(A052)));
                    Log.e(sb.toString());
                } else {
                    Object A072 = A07();
                    C17960vV.A07(A072);
                    r5.C2Y(A072);
                }
            }
            r5.Bsl();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(int r13, int r14) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass2E5
            if (r0 == 0) goto L_0x0066
            java.lang.String r7 = "filter"
        L_0x0006:
            X.2rg r5 = r12.A06()
            r6 = 0
            if (r5 == 0) goto L_0x0020
            java.lang.String r0 = r5.A00
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0020
        L_0x0017:
            X.2kq r9 = new X.2kq
            r9.<init>(r12, r14, r13)
            X.1Kn r3 = r12.A09
            monitor-enter(r3)
            goto L_0x0069
        L_0x0020:
            if (r13 != 0) goto L_0x0017
            r1 = r12
            monitor-enter(r1)
            android.util.SparseArray r0 = r12.A01     // Catch:{ all -> 0x01d7 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ all -> 0x01d7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x002f
            goto L_0x0035
        L_0x002f:
            long r3 = r0.longValue()     // Catch:{ all -> 0x01d7 }
            monitor-exit(r1)
            goto L_0x0038
        L_0x0035:
            monitor-exit(r1)
            r3 = 0
        L_0x0038:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 + r0
            X.11P r0 = r12.A06
            long r1 = X.AnonymousClass11P.A01(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            boolean r0 = r12.A0C(r14)
            if (r0 != 0) goto L_0x0064
            r12.A08()
            java.lang.String r0 = "CategoryManager/state is up-to-date but files are not present!"
            X.C88574a9.A03(r0)
            r0 = 0
        L_0x0055:
            r12.A0A(r0, r14)
            if (r5 != 0) goto L_0x005f
            r0 = 0
        L_0x005b:
            A02(r12, r0)
            return
        L_0x005f:
            java.lang.String r0 = r5.A03(r14)
            goto L_0x005b
        L_0x0064:
            r0 = 5
            goto L_0x0055
        L_0x0066:
            java.lang.String r7 = "doodle_emoji"
            goto L_0x0006
        L_0x0069:
            java.lang.String r5 = "manifest"
            r8 = 0
            X.2ke r0 = r3.A02     // Catch:{ JSONException -> 0x00d4 }
            if (r0 == 0) goto L_0x0073
            X.2rg r8 = r0.A00     // Catch:{ JSONException -> 0x00d4 }
            goto L_0x00ed
        L_0x0073:
            X.0z4 r4 = r3.A08     // Catch:{ JSONException -> 0x00d4 }
            X.00H r0 = r4.A00     // Catch:{ JSONException -> 0x00d4 }
            java.lang.Object r2 = r0.get()     // Catch:{ JSONException -> 0x00d4 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ JSONException -> 0x00d4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00d4 }
            r1.<init>()     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r0 = "downloadable_category_local_info_json_"
            r1.append(r0)     // Catch:{ JSONException -> 0x00d4 }
            r1.append(r5)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r0 = r1.toString()     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r1 = r2.getString(r0, r6)     // Catch:{ JSONException -> 0x00d4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00d4 }
            if (r0 != 0) goto L_0x00ed
            X.2rg r10 = X.C62612rg.A00(r1)     // Catch:{ JSONException -> 0x00d4 }
            if (r10 == 0) goto L_0x00d2
            r10.A01()     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r0 = r10.A01()     // Catch:{ JSONException -> 0x00d4 }
            boolean r0 = X.C88574a9.A04(r0)     // Catch:{ JSONException -> 0x00d4 }
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "ManifestManager/getLocalManifestHash/Local manifest hash is not base64-urlsafe!"
            X.C88574a9.A03(r0)     // Catch:{ JSONException -> 0x00d4 }
            r4.A1s(r5, r6)     // Catch:{ JSONException -> 0x00d4 }
            goto L_0x00ed
        L_0x00b4:
            X.118 r0 = r3.A07     // Catch:{ JSONException -> 0x00d4 }
            android.content.Context r0 = r0.A00     // Catch:{ JSONException -> 0x00d4 }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r1 = "downloadable/manifest.json"
            java.io.File r0 = new java.io.File     // Catch:{ JSONException -> 0x00d4 }
            r0.<init>(r2, r1)     // Catch:{ JSONException -> 0x00d4 }
            boolean r0 = r0.exists()     // Catch:{ JSONException -> 0x00d4 }
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = "ManifestManager/getLocalManifestInfo/Local manifest hash is ok but manifest file is not present!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x00d4 }
            r4.A1s(r5, r6)     // Catch:{ JSONException -> 0x00d4 }
            goto L_0x00ed
        L_0x00d2:
            r8 = r10
            goto L_0x00ed
        L_0x00d4:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d4 }
            r1.<init>()     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "ManifestManager/getLocalManifestInfo/error while getting local manifest info. FIX ASAP"
            r1.append(r0)     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x01d4 }
            r1.append(r0)     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d4 }
            X.C88574a9.A03(r0)     // Catch:{ all -> 0x01d4 }
        L_0x00ed:
            int r0 = r3.A00     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01cd
            r4 = 2
            if (r0 == r4) goto L_0x0151
            r6 = 4
            if (r0 == r6) goto L_0x0151
            if (r8 == 0) goto L_0x00fa
            goto L_0x010d
        L_0x00fa:
            X.11P r5 = r3.A06     // Catch:{ all -> 0x01d2 }
            long r10 = X.AnonymousClass11P.A01(r5)     // Catch:{ all -> 0x01d2 }
            long r0 = X.C24491Kn.A02(r3)     // Catch:{ all -> 0x01d2 }
            long r10 = r10 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0129
            goto L_0x012e
        L_0x010d:
            java.lang.String r1 = r8.A00     // Catch:{ all -> 0x01d2 }
            if (r1 == 0) goto L_0x00fa
            X.0vb r0 = r3.A09     // Catch:{ all -> 0x01d2 }
            java.util.Locale r0 = r0.A0N()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = X.AnonymousClass1X0.A04(r0)     // Catch:{ all -> 0x01d2 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01d2 }
            if (r0 != 0) goto L_0x00fa
            X.11P r0 = r3.A06     // Catch:{ all -> 0x01d2 }
            X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x01d2 }
            X.C24491Kn.A02(r3)     // Catch:{ all -> 0x01d2 }
        L_0x0129:
            int r2 = X.C24491Kn.A01(r3, r4)     // Catch:{ all -> 0x01d2 }
            goto L_0x0158
        L_0x012e:
            r0 = 1
            if (r13 != r0) goto L_0x013a
            if (r8 != 0) goto L_0x0142
            X.AnonymousClass11P.A01(r5)     // Catch:{ all -> 0x01d2 }
            X.C24491Kn.A02(r3)     // Catch:{ all -> 0x01d2 }
            goto L_0x019a
        L_0x013a:
            if (r8 != 0) goto L_0x0142
            r0 = 3
            int r2 = X.C24491Kn.A01(r3, r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x0158
        L_0x0142:
            X.2ke r0 = r3.A02     // Catch:{ all -> 0x01d2 }
            if (r0 != 0) goto L_0x014b
            int r2 = X.C24491Kn.A01(r3, r6)     // Catch:{ all -> 0x01d2 }
            goto L_0x0158
        L_0x014b:
            r0 = 5
            int r2 = X.C24491Kn.A01(r3, r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x0158
        L_0x0151:
            java.lang.String r0 = "ManifestManager/computeState/Unexpected state encountered!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01d2 }
            int r2 = r3.A00     // Catch:{ all -> 0x01d2 }
        L_0x0158:
            if (r2 == 0) goto L_0x01cd
            if (r2 == r4) goto L_0x019a
            r0 = 3
            if (r2 == r0) goto L_0x0187
            r0 = 4
            if (r2 == r0) goto L_0x019c
            r0 = 5
            if (r2 == r0) goto L_0x0176
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "ManifestManager/getCategoryFromState/Unexpected state : "
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            r0 = 1
            if (r2 == r0) goto L_0x0173
            goto L_0x018a
        L_0x0173:
            java.lang.String r0 = "LOADING_FAILED"
            goto L_0x018c
        L_0x0176:
            X.2ke r0 = r3.A02     // Catch:{ all -> 0x01d2 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x01d2 }
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x01d2 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x01d2 }
            X.2rg r0 = (X.C62612rg) r0     // Catch:{ all -> 0x01d2 }
            r9.A01(r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x01d0
        L_0x0187:
            java.lang.String r0 = "ManifestManager/getCategoryFromState/no local manifest hash found and it's too soon for a server fetch, cannot get category info!"
            goto L_0x0193
        L_0x018a:
            java.lang.String r0 = "UP_TO_DATE"
        L_0x018c:
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d2 }
        L_0x0193:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01d2 }
            r9.A00()     // Catch:{ all -> 0x01d2 }
            goto L_0x01d0
        L_0x019a:
            r6 = 1
            goto L_0x019d
        L_0x019c:
            r6 = 0
        L_0x019d:
            r0 = 0
            X.C24491Kn.A01(r3, r0)     // Catch:{ all -> 0x01cb }
            if (r13 != 0) goto L_0x01bb
            long r4 = r3.A01     // Catch:{ all -> 0x01cb }
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 + r0
            X.11P r0 = r3.A06     // Catch:{ all -> 0x01cb }
            long r1 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x01cb }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01bb
            r0 = 1
            X.C24491Kn.A01(r3, r0)     // Catch:{ all -> 0x01cb }
            r9.A00()     // Catch:{ all -> 0x01cb }
            goto L_0x01d0
        L_0x01bb:
            X.C24491Kn.A03(r9, r3, r7)     // Catch:{ all -> 0x01cb }
            X.10I r2 = r3.A0E     // Catch:{ all -> 0x01cb }
            r1 = 46
            X.7RF r0 = new X.7RF     // Catch:{ all -> 0x01cb }
            r0.<init>(r3, r8, r1, r6)     // Catch:{ all -> 0x01cb }
            r2.CGF(r0)     // Catch:{ all -> 0x01cb }
            goto L_0x01d0
        L_0x01cb:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01d2 }
        L_0x01cd:
            X.C24491Kn.A03(r9, r3, r7)     // Catch:{ all -> 0x01d2 }
        L_0x01d0:
            monitor-exit(r3)
            return
        L_0x01d2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01d4 }
        L_0x01d4:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01d7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24531Kr.A09(int, int):void");
    }

    public boolean A0C(int i) {
        boolean contains;
        if (this instanceof AnonymousClass2E5) {
            AnonymousClass2E5 r2 = (AnonymousClass2E5) this;
            boolean z = false;
            if (i == -1) {
                z = true;
            }
            C17960vV.A0C(z);
            return r2.A0G();
        }
        C24541Ks r22 = (C24541Ks) this;
        synchronized (r22) {
            r22.A0F(i);
            contains = r22.A03.contains(Integer.valueOf(i));
        }
        return contains;
    }

    public Map A0D(String str, String str2, String str3, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("category", str);
        if (str2 != null) {
            hashMap.put("locale", str2);
        }
        if (str3 != null) {
            hashMap.put("existing_id", str3);
        }
        return hashMap;
    }

    public C24531Kr(AnonymousClass190 r2, AnonymousClass181 r3, AnonymousClass11E r4, AnonymousClass11P r5, AnonymousClass118 r6, C24521Kq r7, C19830z4 r8, C24491Kn r9, C18030ve r10, AnonymousClass18K r11, AnonymousClass1D9 r12, C24481Km r13, C220418j r14, AnonymousClass10I r15) {
        this.A07 = r6;
        this.A06 = r5;
        this.A0A = r10;
        this.A03 = r2;
        this.A0E = r15;
        this.A04 = r3;
        this.A0H = r11;
        this.A09 = r9;
        this.A0D = r14;
        this.A0B = r12;
        this.A08 = r8;
        this.A05 = r4;
        this.A0C = r13;
        this.A0G = r7;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void A01(X.C24531Kr r17, X.C62612rg r18, X.C24451Kj r19, java.lang.String r20, int r21) {
        /*
            X.C17960vV.A01()
            r7 = r17
            r5 = r21
            int r1 = r7.A05(r5)
            r12 = 3
            r0 = 0
            if (r1 != r12) goto L_0x0010
            r0 = 1
        L_0x0010:
            X.C17960vV.A0D(r0)
            X.C17960vV.A01()
            int r2 = r7.A05(r5)
            r1 = 1
            r0 = 0
            if (r2 != r12) goto L_0x001f
            r0 = 1
        L_0x001f:
            X.C17960vV.A0D(r0)
            r6 = r18
            java.lang.String r10 = r6.A01
            X.2rg r0 = r7.A06()
            r8 = 0
            if (r0 != 0) goto L_0x0058
            r3 = r8
        L_0x002e:
            java.lang.String r0 = r6.A03(r5)
            boolean r0 = r0.equals(r3)
            r1 = r1 ^ r0
            X.C17960vV.A0D(r1)
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            java.lang.String r2 = r6.A02
            r18 = r20
            if (r2 != 0) goto L_0x005d
            X.0ve r4 = r7.A0A
            X.1Km r2 = r7.A0C
            r0 = r18
            java.util.Map r1 = r7.A0D(r10, r0, r3, r5)
            java.lang.String r0 = "wa/static/downloadable"
            android.net.Uri$Builder r0 = X.C88574a9.A00(r4, r2, r0)
            java.lang.String r2 = X.C88574a9.A02(r0, r1)
            goto L_0x005d
        L_0x0058:
            java.lang.String r3 = r0.A03(r5)
            goto L_0x002e
        L_0x005d:
            X.1D9 r1 = r7.A0B     // Catch:{ IOException -> 0x03db }
            X.18j r0 = r7.A0D     // Catch:{ IOException -> 0x03db }
            X.AUZ r2 = r1.A05(r8, r0, r2, r8)     // Catch:{ IOException -> 0x03db }
            java.net.HttpURLConnection r11 = r2.A01     // Catch:{ all -> 0x03d1 }
            int r1 = r11.getResponseCode()     // Catch:{ all -> 0x03d1 }
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L_0x008c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d1 }
            r1.<init>()     // Catch:{ all -> 0x03d1 }
            java.lang.String r0 = "CategoryManager/fetch/Error, code="
            r1.append(r0)     // Catch:{ all -> 0x03d1 }
            int r0 = r11.getResponseCode()     // Catch:{ all -> 0x03d1 }
            r1.append(r0)     // Catch:{ all -> 0x03d1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03d1 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03d1 }
            r2.close()     // Catch:{ IOException -> 0x03db }
            goto L_0x03e1
        L_0x008c:
            r11.getResponseCode()     // Catch:{ all -> 0x03d1 }
            java.lang.String r0 = "idhash"
            java.lang.String r9 = r11.getHeaderField(r0)     // Catch:{ all -> 0x03d1 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x03d1 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "CategoryManager/fetch/Server did not return an idhash."
            X.C88574a9.A03(r0)     // Catch:{ all -> 0x03d1 }
            java.lang.String r4 = r6.A03(r5)     // Catch:{ all -> 0x03d1 }
        L_0x00a4:
            int r1 = r11.getResponseCode()     // Catch:{ all -> 0x03d1 }
            goto L_0x00e0
        L_0x00a9:
            java.lang.String r0 = r6.A03(r5)     // Catch:{ all -> 0x03d1 }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x03d1 }
            if (r0 != 0) goto L_0x00de
            r6.A03(r5)     // Catch:{ all -> 0x03d1 }
            X.1Kn r4 = r7.A09     // Catch:{ all -> 0x03d1 }
            monitor-enter(r4)     // Catch:{ all -> 0x03d1 }
            int r0 = X.C24491Kn.A00(r4)     // Catch:{ all -> 0x03ce }
            if (r0 == 0) goto L_0x00dd
            X.2ke r0 = r4.A02     // Catch:{ all -> 0x03ce }
            if (r0 == 0) goto L_0x00dd
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x03ce }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x03ce }
            X.2rg r0 = (X.C62612rg) r0     // Catch:{ all -> 0x03ce }
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = r0.A01()     // Catch:{ all -> 0x03ce }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x03ce }
            if (r0 == 0) goto L_0x00d8
            goto L_0x00dd
        L_0x00d8:
            r0 = 0
            X.C24491Kn.A06(r4, r0)     // Catch:{ all -> 0x03ce }
        L_0x00dd:
            monitor-exit(r4)     // Catch:{ all -> 0x03d1 }
        L_0x00de:
            r4 = r9
            goto L_0x00a4
        L_0x00e0:
            r0 = 304(0x130, float:4.26E-43)
            if (r1 != r0) goto L_0x0112
            if (r9 == 0) goto L_0x00f1
            boolean r0 = r9.equals(r3)     // Catch:{ all -> 0x03d1 }
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "CategoryManager/fetch/Server's hash doesn't match manifest's even though server returned not-modified!"
            X.C88574a9.A03(r0)     // Catch:{ all -> 0x03d1 }
        L_0x00f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d1 }
            r1.<init>()     // Catch:{ all -> 0x03d1 }
            java.lang.String r0 = "CategoryManager/fetch/Unnecessary http request made. Category "
            r1.append(r0)     // Catch:{ all -> 0x03d1 }
            r1.append(r10)     // Catch:{ all -> 0x03d1 }
            java.lang.String r0 = " is already up-to-date. Local idhash was "
            r1.append(r0)     // Catch:{ all -> 0x03d1 }
            r1.append(r3)     // Catch:{ all -> 0x03d1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03d1 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03d1 }
            r2.close()     // Catch:{ IOException -> 0x03db }
            goto L_0x03bb
        L_0x0112:
            if (r9 == 0) goto L_0x011f
            boolean r0 = r9.equals(r3)     // Catch:{ all -> 0x03d1 }
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "CategoryManager/fetch/Server's hash matches manifest's even though server didn't return not-modified!"
            X.C88574a9.A03(r0)     // Catch:{ all -> 0x03d1 }
        L_0x011f:
            boolean r9 = r7 instanceof X.AnonymousClass2E5     // Catch:{ all -> 0x03d1 }
            if (r9 == 0) goto L_0x0236
            r13 = -1
            r0 = 0
            if (r5 != r13) goto L_0x0128
            r0 = 1
        L_0x0128:
            X.C17960vV.A0C(r0)     // Catch:{ all -> 0x03d1 }
            X.C17960vV.A01()     // Catch:{ all -> 0x03d1 }
            monitor-enter(r7)     // Catch:{ all -> 0x03d1 }
            int r3 = r7.A05(r13)     // Catch:{ all -> 0x03cb }
            monitor-exit(r7)     // Catch:{ all -> 0x03d1 }
            r1 = 0
            r0 = 0
            if (r3 != r12) goto L_0x0139
            r0 = 1
        L_0x0139:
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x03d1 }
            X.181 r11 = r7.A04     // Catch:{ IOException -> 0x022d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x022d }
            r0 = 21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x022d }
            X.9Hb r0 = r2.BMP(r11, r3, r0)     // Catch:{ IOException -> 0x022d }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x022d }
            r3.<init>(r0)     // Catch:{ IOException -> 0x022d }
            java.lang.String r11 = "downloadable/filter_"
            X.118 r0 = r7.A07     // Catch:{ all -> 0x0223 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0223 }
            r17 = r0
            java.io.File r14 = r17.getCacheDir()     // Catch:{ all -> 0x0223 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            r12.<init>()     // Catch:{ all -> 0x0223 }
            r12.append(r11)     // Catch:{ all -> 0x0223 }
            r12.append(r4)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "_tmp"
            r12.append(r0)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0223 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x0223 }
            r12.<init>(r14, r0)     // Catch:{ all -> 0x0223 }
            boolean r0 = X.C64062u9.A0S(r12)     // Catch:{ all -> 0x0223 }
            if (r0 != 0) goto L_0x0183
            java.lang.String r0 = "FilterManager/store/Could not prepare temporary cache subdirectory"
        L_0x017e:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0223 }
            goto L_0x0211
        L_0x0183:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r0]     // Catch:{ all -> 0x0223 }
        L_0x0187:
            java.util.zip.ZipEntry r16 = r3.getNextEntry()     // Catch:{ all -> 0x0223 }
            if (r16 == 0) goto L_0x01cb
            java.lang.String r14 = r12.getCanonicalPath()     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = r16.getName()     // Catch:{ all -> 0x0223 }
            java.io.File r0 = X.C64062u9.A06(r14, r0)     // Catch:{ all -> 0x0223 }
            if (r0 != 0) goto L_0x01b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            r1.<init>()     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "FilterManager/store/malicious zip file:"
            r1.append(r0)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = r16.getName()     // Catch:{ all -> 0x0223 }
            r1.append(r0)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0223 }
            goto L_0x017e
        L_0x01b1:
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch:{ all -> 0x0223 }
            r14.<init>(r0)     // Catch:{ all -> 0x0223 }
        L_0x01b6:
            int r0 = r3.read(r15)     // Catch:{ all -> 0x01c4 }
            if (r0 == r13) goto L_0x01c0
            r14.write(r15, r1, r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x01b6
        L_0x01c0:
            r14.close()     // Catch:{ all -> 0x0223 }
            goto L_0x0187
        L_0x01c4:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x01c9 }
            goto L_0x0222
        L_0x01c9:
            r0 = move-exception
            goto L_0x021f
        L_0x01cb:
            monitor-enter(r7)     // Catch:{ all -> 0x0223 }
            java.io.File r1 = r17.getFilesDir()     // Catch:{ all -> 0x021c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x021c }
            r0.<init>()     // Catch:{ all -> 0x021c }
            r0.append(r11)     // Catch:{ all -> 0x021c }
            r0.append(r4)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x021c }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x021c }
            r11.<init>(r1, r0)     // Catch:{ all -> 0x021c }
            boolean r0 = X.C64062u9.A0S(r11)     // Catch:{ all -> 0x021c }
            if (r0 != 0) goto L_0x01f1
            java.lang.String r0 = "FilterManager/store/Could not prepare filters subdirectory"
        L_0x01ec:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x021c }
            monitor-exit(r7)     // Catch:{ all -> 0x021c }
            goto L_0x0211
        L_0x01f1:
            boolean r0 = r12.renameTo(r11)     // Catch:{ all -> 0x021c }
            if (r0 != 0) goto L_0x0216
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021c }
            r1.<init>()     // Catch:{ all -> 0x021c }
            java.lang.String r0 = "FilterManager/store : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x021c }
            r1.append(r12)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x021c }
            r1.append(r11)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x021c }
            goto L_0x01ec
        L_0x0211:
            r3.close()     // Catch:{ IOException -> 0x022d }
            goto L_0x030d
        L_0x0216:
            monitor-exit(r7)     // Catch:{ all -> 0x021c }
            r3.close()     // Catch:{ IOException -> 0x022d }
            goto L_0x030f
        L_0x021c:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x021c }
            goto L_0x0222
        L_0x021f:
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0223 }
        L_0x0222:
            throw r1     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0228 }
            goto L_0x022c
        L_0x0228:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x022d }
        L_0x022c:
            throw r1     // Catch:{ IOException -> 0x022d }
        L_0x022d:
            r1 = move-exception
            java.lang.String r0 = "FilterManager/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03d1 }
            r0 = 0
            goto L_0x0310
        L_0x0236:
            r3 = r7
            X.1Ks r3 = (X.C24541Ks) r3     // Catch:{ all -> 0x03d1 }
            monitor-enter(r7)     // Catch:{ all -> 0x03d1 }
            X.C17960vV.A01()     // Catch:{ all -> 0x03cb }
            int r1 = r3.A05(r5)     // Catch:{ all -> 0x03cb }
            r13 = 1
            r11 = 0
            r0 = 0
            if (r1 != r12) goto L_0x0247
            r0 = 1
        L_0x0247:
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x03cb }
            X.181 r12 = r3.A04     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
            X.9Hb r0 = r2.BMP(r12, r1, r0)     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
            java.util.zip.ZipInputStream r12 = new java.util.zip.ZipInputStream     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
            r12.<init>(r0)     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
            java.io.File r14 = X.C24541Ks.A03(r3, r4, r5, r13)     // Catch:{ all -> 0x02d6 }
            boolean r0 = X.C64062u9.A0S(r14)     // Catch:{ all -> 0x02d6 }
            if (r0 != 0) goto L_0x026f
            java.lang.String r0 = "DoodleEmojiManager/store/Could not prepare temporary cache subdirectory"
        L_0x026b:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02d6 }
            goto L_0x02ca
        L_0x026f:
            java.lang.String r1 = r14.getCanonicalPath()     // Catch:{ all -> 0x02d6 }
        L_0x0273:
            java.util.zip.ZipEntry r13 = r12.getNextEntry()     // Catch:{ all -> 0x02d6 }
            if (r13 == 0) goto L_0x029d
            java.lang.String r0 = r13.getName()     // Catch:{ all -> 0x02d6 }
            java.io.File r0 = X.C64062u9.A06(r1, r0)     // Catch:{ all -> 0x02d6 }
            if (r0 == 0) goto L_0x0287
            X.C64062u9.A0T(r0, r12)     // Catch:{ all -> 0x02d6 }
            goto L_0x0273
        L_0x0287:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d6 }
            r1.<init>()     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = "DoodleEmojiManager/store/Potentially malicious file:"
            r1.append(r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = r13.getName()     // Catch:{ all -> 0x02d6 }
            r1.append(r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02d6 }
            goto L_0x026b
        L_0x029d:
            java.io.File r13 = X.C24541Ks.A03(r3, r4, r5, r11)     // Catch:{ all -> 0x02d6 }
            boolean r0 = X.C64062u9.A0S(r13)     // Catch:{ all -> 0x02d6 }
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = "DoodleEmojiManager/store/Could not prepare emoji subdirectory"
            goto L_0x026b
        L_0x02aa:
            boolean r0 = r14.renameTo(r13)     // Catch:{ all -> 0x02d6 }
            if (r0 != 0) goto L_0x02ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d6 }
            r1.<init>()     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = "DoodleEmojiManager/store : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x02d6 }
            r1.append(r14)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x02d6 }
            r1.append(r13)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02d6 }
            goto L_0x026b
        L_0x02ca:
            r12.close()     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
            goto L_0x030c
        L_0x02ce:
            X.C24541Ks.A04(r3, r4, r5)     // Catch:{ all -> 0x02d6 }
            r12.close()     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
            monitor-exit(r7)     // Catch:{ all -> 0x03d1 }
            goto L_0x030f
        L_0x02d6:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x02db }
            goto L_0x02df
        L_0x02db:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
        L_0x02df:
            throw r1     // Catch:{ IOException | ArrayIndexOutOfBoundsException -> 0x02e0 }
        L_0x02e0:
            r12 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03cb }
            r1.<init>()     // Catch:{ all -> 0x03cb }
            java.lang.String r0 = "DoodleEmojiManager/store/Failed for bundle number: "
            r1.append(r0)     // Catch:{ all -> 0x03cb }
            r1.append(r5)     // Catch:{ all -> 0x03cb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03cb }
            com.whatsapp.util.Log.e(r0, r12)     // Catch:{ all -> 0x03cb }
            boolean r0 = r12 instanceof java.lang.ArrayIndexOutOfBoundsException     // Catch:{ all -> 0x03cb }
            if (r0 == 0) goto L_0x030c
            X.0vt r0 = r3.A01     // Catch:{ all -> 0x03cb }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x03cb }
            if (r0 == 0) goto L_0x030c
            X.190 r3 = r3.A03     // Catch:{ all -> 0x03cb }
            java.lang.String r1 = "DoodleEmojiManager/store/Failed/ArrayIndexOutOfBoundsException"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x03cb }
            r3.A0G(r1, r0, r11)     // Catch:{ all -> 0x03cb }
        L_0x030c:
            monitor-exit(r7)     // Catch:{ all -> 0x03d1 }
        L_0x030d:
            r0 = 0
            goto L_0x0310
        L_0x030f:
            r0 = 1
        L_0x0310:
            java.lang.String r3 = "!"
            if (r0 != 0) goto L_0x0330
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d1 }
            r1.<init>()     // Catch:{ all -> 0x03d1 }
            java.lang.String r0 = "CategoryManager/fetch/Store failed for "
            r1.append(r0)     // Catch:{ all -> 0x03d1 }
            r1.append(r10)     // Catch:{ all -> 0x03d1 }
            r1.append(r3)     // Catch:{ all -> 0x03d1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03d1 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03d1 }
            r2.close()     // Catch:{ IOException -> 0x03db }
            goto L_0x03e1
        L_0x0330:
            if (r9 == 0) goto L_0x0340
            r0 = r7
            X.2E5 r0 = (X.AnonymousClass2E5) r0     // Catch:{ all -> 0x03d1 }
            monitor-enter(r7)     // Catch:{ all -> 0x03d1 }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x033c }
            r0.clear()     // Catch:{ all -> 0x033c }
            goto L_0x033f
        L_0x033c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x03d1 }
            throw r0     // Catch:{ all -> 0x03d1 }
        L_0x033f:
            monitor-exit(r7)     // Catch:{ all -> 0x03d1 }
        L_0x0340:
            java.lang.String r1 = r6.A01()     // Catch:{ all -> 0x03d1 }
            monitor-enter(r7)     // Catch:{ all -> 0x03d1 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x03c8 }
            r0 = r0 ^ 1
            X.C17960vV.A0C(r0)     // Catch:{ all -> 0x03c8 }
            X.2rg r0 = r7.A06()     // Catch:{ all -> 0x03c8 }
            r7.A00 = r0     // Catch:{ all -> 0x03c8 }
            if (r0 == 0) goto L_0x0360
            java.lang.String r0 = r0.A01()     // Catch:{ all -> 0x03c8 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x03c8 }
            if (r0 != 0) goto L_0x0374
        L_0x0360:
            if (r9 == 0) goto L_0x0365
            java.lang.String r11 = "filter"
            goto L_0x0367
        L_0x0365:
            java.lang.String r11 = "doodle_emoji"
        L_0x0367:
            X.2rg r0 = new X.2rg     // Catch:{ all -> 0x03c8 }
            r15 = r8
            r10 = r0
            r12 = r1
            r13 = r18
            r14 = r8
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03c8 }
            r7.A00 = r0     // Catch:{ all -> 0x03c8 }
        L_0x0374:
            X.2rg r0 = r7.A00     // Catch:{ all -> 0x03c8 }
            java.util.Map r1 = r0.A03     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x03c8 }
            r1.put(r0, r4)     // Catch:{ all -> 0x03c8 }
            X.0z4 r3 = r7.A08     // Catch:{ JSONException -> 0x0392 }
            if (r9 == 0) goto L_0x038f
            java.lang.String r1 = "filter"
        L_0x0385:
            X.2rg r0 = r7.A00     // Catch:{ JSONException -> 0x0392 }
            java.lang.String r0 = r0.A02()     // Catch:{ JSONException -> 0x0392 }
            r3.A1s(r1, r0)     // Catch:{ JSONException -> 0x0392 }
            goto L_0x03b5
        L_0x038f:
            java.lang.String r1 = "doodle_emoji"
            goto L_0x0385
        L_0x0392:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c8 }
            r1.<init>()     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = "CategoryManager/setLocalIdHash/json exception while setting local category info for "
            r1.append(r0)     // Catch:{ all -> 0x03c8 }
            if (r9 == 0) goto L_0x03a2
            java.lang.String r0 = "filter"
            goto L_0x03a4
        L_0x03a2:
            java.lang.String r0 = "doodle_emoji"
        L_0x03a4:
            r1.append(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x03c8 }
            r1.append(r0)     // Catch:{ all -> 0x03c8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03c8 }
            X.C88574a9.A03(r0)     // Catch:{ all -> 0x03c8 }
        L_0x03b5:
            monitor-exit(r7)     // Catch:{ all -> 0x03d1 }
            r2.close()     // Catch:{ IOException -> 0x03db }
            r3 = r4
            goto L_0x03bd
        L_0x03bb:
            if (r3 == 0) goto L_0x03e1
        L_0x03bd:
            r0 = 5
            r7.A0A(r0, r5)
            A00(r7, r5)
            A02(r7, r3)
            return
        L_0x03c8:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x03d1 }
            throw r0     // Catch:{ all -> 0x03d1 }
        L_0x03cb:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x03d1 }
            throw r0     // Catch:{ all -> 0x03d1 }
        L_0x03ce:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03d1 }
            throw r0     // Catch:{ all -> 0x03d1 }
        L_0x03d1:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x03d6 }
            goto L_0x03da
        L_0x03d6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x03db }
        L_0x03da:
            throw r1     // Catch:{ IOException -> 0x03db }
        L_0x03db:
            r1 = move-exception
            java.lang.String r0 = "CategoryManager/fetch/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03e1:
            r11 = r19
            long r3 = r11.A01()
            long r9 = r11.A00()
            r1 = 17
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0412
            java.lang.String r0 = "CategoryManager/fetchWithBackoff/Load failed on all retries!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            monitor-enter(r7)
            android.util.SparseArray r2 = r7.A02     // Catch:{ all -> 0x040f }
            X.11P r0 = r7.A06     // Catch:{ all -> 0x040f }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x040f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x040f }
            r2.put(r5, r0)     // Catch:{ all -> 0x040f }
            monitor-exit(r7)
            r0 = 4
            r7.A0A(r0, r5)
            A02(r7, r8)
            return
        L_0x040f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0412:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "CategoryManager/fetchWithBackoff/Load failed, will retry after "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " seconds for the "
            r2.append(r0)
            long r0 = r11.A00()
            r2.append(r0)
            java.lang.String r0 = "th time"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.10I r2 = r7.A0E
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            r14 = 7
            X.4rm r0 = new X.4rm
            r12 = r18
            r13 = r5
            r8 = r0
            r9 = r7
            r10 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.CGv(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24531Kr.A01(X.1Kr, X.2rg, X.1Kj, java.lang.String, int):void");
    }
}
