package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1Kn  reason: invalid class name and case insensitive filesystem */
public class C24491Kn {
    public int A00 = 3;
    public long A01 = 0;
    public C58412ke A02;
    public long A03 = 0;
    public final AnonymousClass190 A04;
    public final AnonymousClass181 A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass118 A07;
    public final C19830z4 A08;
    public final C18000vb A09;
    public final C18030ve A0A;
    public final AnonymousClass1D9 A0B;
    public final C24481Km A0C;
    public final C220418j A0D;
    public final AnonymousClass10I A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass18K A0G;
    public final HashMap A0H = new HashMap();

    public static synchronized int A00(C24491Kn r1) {
        int i;
        synchronized (r1) {
            i = r1.A00;
        }
        return i;
    }

    public static synchronized int A01(C24491Kn r1, int i) {
        synchronized (r1) {
            if (r1.A00 == 0 && i == 0) {
                Log.e("ManifestManager/setState/State change ERROR - loading to loading!");
                i = r1.A00;
            } else {
                r1.A00 = i;
            }
        }
        return i;
    }

    public static synchronized long A02(C24491Kn r6) {
        long j;
        synchronized (r6) {
            j = r6.A03;
            if (j == 0) {
                j = ((SharedPreferences) r6.A08.A00.get()).getLong("downloadable_manifest_last_fetched_time_millis", 0);
                r6.A03 = j;
            }
        }
        return j;
    }

    public static synchronized void A03(C58532kq r3, C24491Kn r4, String str) {
        String str2;
        synchronized (r4) {
            int i = r4.A00;
            if (i == 0) {
                HashMap hashMap = r4.A0H;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null || arrayList.isEmpty()) {
                    hashMap.put(str, new ArrayList(Collections.singletonList(r3)));
                } else {
                    arrayList.add(r3);
                    hashMap.put(str, arrayList);
                }
            } else if (i == 5) {
                C58412ke r0 = r4.A02;
                C17960vV.A07(r0);
                r3.A01((C62612rg) r0.A01.get(str));
            } else if (i == 1) {
                r3.A00();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("ManifestManager/registerCallback/Invalid state encountered when trying to register category : ");
                sb.append(str);
                sb.append(" state : ");
                if (i == 2) {
                    str2 = "MANIFEST_STALE";
                } else if (i != 3) {
                    str2 = "READ_NEEDED";
                } else {
                    str2 = "NO_MANIFEST";
                }
                sb.append(str2);
                Log.e(sb.toString());
            }
        }
    }

    public static synchronized void A06(C24491Kn r2, long j) {
        synchronized (r2) {
            r2.A03 = j;
            C19830z4.A00(r2.A08).putLong("downloadable_manifest_last_fetched_time_millis", j).apply();
        }
    }

    public C24491Kn(AnonymousClass190 r3, AnonymousClass181 r4, AnonymousClass11P r5, AnonymousClass118 r6, C19830z4 r7, C18000vb r8, C18030ve r9, AnonymousClass18K r10, AnonymousClass1D9 r11, C24481Km r12, C220418j r13, AnonymousClass10I r14, AnonymousClass00H r15) {
        this.A07 = r6;
        this.A06 = r5;
        this.A0A = r9;
        this.A04 = r3;
        this.A0E = r14;
        this.A05 = r4;
        this.A0G = r10;
        this.A09 = r8;
        this.A0D = r13;
        this.A0B = r11;
        this.A08 = r7;
        this.A0C = r12;
        this.A0F = r15;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03d7  */
    public static void A04(X.C62612rg r25, X.C24491Kn r26, X.C24451Kj r27, boolean r28) {
        /*
            X.C17960vV.A01()
            r0 = r26
            int r2 = A00(r0)
            r3 = 0
            r10 = 1
            r1 = 0
            if (r2 != 0) goto L_0x000f
            r1 = 1
        L_0x000f:
            X.C17960vV.A0D(r1)
            r20 = r28
            r1 = r28 ^ 1
            r15 = 0
            r17 = r25
            if (r1 != 0) goto L_0x01dd
            if (r25 != 0) goto L_0x007c
            r7 = r15
        L_0x001e:
            X.C17960vV.A01()
            int r2 = A00(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            r1 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r2 != 0) goto L_0x0031
            r1 = 1
        L_0x0031:
            X.C17960vV.A0D(r1)
            X.0vb r1 = r0.A09
            java.util.Locale r1 = r1.A0N()
            java.lang.String r14 = X.AnonymousClass1X0.A04(r1)
            X.00H r1 = r0.A0F
            r1.get()
            X.1Kq r1 = X.C24521Kq.$redex_init_class
            X.0ve r4 = r0.A0A
            X.1Km r2 = r0.A0C
            java.lang.String r12 = "manifest"
            java.lang.String r1 = "wa/static/downloadable"
            android.net.Uri$Builder r2 = X.C88574a9.A00(r4, r2, r1)
            java.lang.String r1 = "category"
            r2.appendQueryParameter(r1, r12)
            java.lang.String r1 = "locale"
            r2.appendQueryParameter(r1, r14)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "existing_id"
            r2.appendQueryParameter(r1, r7)
        L_0x0067:
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = "version"
            r2.appendQueryParameter(r1, r15)
        L_0x0073:
            android.net.Uri r1 = r2.build()
            java.lang.String r4 = r1.toString()
            goto L_0x0081
        L_0x007c:
            java.lang.String r7 = r17.A01()
            goto L_0x001e
        L_0x0081:
            X.1D9 r2 = r0.A0B     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
            X.18j r1 = r0.A0D     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
            X.AUZ r4 = r2.A05(r15, r1, r4, r15)     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
            java.net.HttpURLConnection r2 = r4.A01     // Catch:{ all -> 0x01c7 }
            int r8 = r2.getResponseCode()     // Catch:{ all -> 0x01c7 }
            r1 = 400(0x190, float:5.6E-43)
            if (r8 < r1) goto L_0x00b5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            r6.<init>()     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = "ManifestManager/fetch/Error, code="
            r6.append(r1)     // Catch:{ all -> 0x01c7 }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x01c7 }
            r6.append(r1)     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x01c7 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x01c7 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c7 }
            r2.<init>(r5, r15)     // Catch:{ all -> 0x01c7 }
            r4.close()     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
            goto L_0x01fe
        L_0x00b5:
            r2.getResponseCode()     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = "idhash"
            java.lang.String r13 = r2.getHeaderField(r1)     // Catch:{ all -> 0x01c7 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01c7 }
            if (r1 != 0) goto L_0x01b9
            boolean r1 = X.C88574a9.A04(r13)     // Catch:{ all -> 0x01c7 }
            if (r1 == 0) goto L_0x01b9
            int r2 = r2.getResponseCode()     // Catch:{ all -> 0x01c7 }
            r1 = 304(0x130, float:4.26E-43)
            if (r2 != r1) goto L_0x00ea
            boolean r1 = r13.equals(r7)     // Catch:{ all -> 0x01c7 }
            X.C17960vV.A0D(r1)     // Catch:{ all -> 0x01c7 }
            X.2rg r11 = new X.2rg     // Catch:{ all -> 0x01c7 }
            r16 = r15
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c7 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c7 }
            r2.<init>(r6, r11)     // Catch:{ all -> 0x01c7 }
            r4.close()     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
            goto L_0x01fe
        L_0x00ea:
            boolean r1 = r13.equals(r7)     // Catch:{ all -> 0x01c7 }
            r1 = r1 ^ 1
            X.C17960vV.A0D(r1)     // Catch:{ all -> 0x01c7 }
            X.C17960vV.A01()     // Catch:{ all -> 0x01c7 }
            int r2 = A00(r0)     // Catch:{ all -> 0x01c7 }
            r1 = 0
            if (r2 != 0) goto L_0x00fe
            r1 = 1
        L_0x00fe:
            X.C17960vV.A0D(r1)     // Catch:{ all -> 0x01c7 }
            X.181 r7 = r0.A05     // Catch:{ IOException -> 0x01a5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x01a5 }
            r1 = 22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x01a5 }
            X.9Hb r9 = r4.BMP(r7, r2, r1)     // Catch:{ IOException -> 0x01a5 }
            X.118 r1 = r0.A07     // Catch:{ all -> 0x019b }
            android.content.Context r8 = r1.A00     // Catch:{ all -> 0x019b }
            java.io.File r7 = r8.getFilesDir()     // Catch:{ all -> 0x019b }
            java.lang.String r2 = "downloadable"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x019b }
            r1.<init>(r7, r2)     // Catch:{ all -> 0x019b }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x019b }
            if (r2 != 0) goto L_0x0132
            boolean r1 = r1.mkdirs()     // Catch:{ all -> 0x019b }
            if (r1 != 0) goto L_0x0132
            java.lang.String r1 = "ManifestManager/store/Could not make file subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x019b }
            goto L_0x014e
        L_0x0132:
            java.io.File r7 = r8.getFilesDir()     // Catch:{ all -> 0x019b }
            java.lang.String r2 = "downloadable/manifest.json"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x019b }
            r1.<init>(r7, r2)     // Catch:{ all -> 0x019b }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x019b }
            if (r2 == 0) goto L_0x0152
            boolean r2 = r1.delete()     // Catch:{ all -> 0x019b }
            if (r2 != 0) goto L_0x0152
            java.lang.String r1 = "ManifestManager/store/Could not delete existing manifest!"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x019b }
        L_0x014e:
            r9.close()     // Catch:{ IOException -> 0x01a5 }
            goto L_0x01ab
        L_0x0152:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r2]     // Catch:{ all -> 0x019b }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x019b }
            r7.<init>(r1)     // Catch:{ all -> 0x019b }
        L_0x015b:
            int r2 = r9.read(r8)     // Catch:{ all -> 0x0191 }
            r1 = -1
            if (r2 == r1) goto L_0x0166
            r7.write(r8, r3, r2)     // Catch:{ all -> 0x0191 }
            goto L_0x015b
        L_0x0166:
            r7.close()     // Catch:{ all -> 0x019b }
            r9.close()     // Catch:{ IOException -> 0x01a5 }
            X.0z4 r2 = r0.A08     // Catch:{ all -> 0x01c7 }
            X.2rg r11 = new X.2rg     // Catch:{ all -> 0x01c7 }
            r16 = r15
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = r11.A02()     // Catch:{ all -> 0x01c7 }
            r2.A1s(r12, r1)     // Catch:{ all -> 0x01c7 }
            monitor-enter(r0)     // Catch:{ all -> 0x01c7 }
            r0.A02 = r15     // Catch:{ all -> 0x018e }
            monitor-exit(r0)     // Catch:{ all -> 0x01c7 }
            X.2rg r11 = new X.2rg     // Catch:{ all -> 0x01c7 }
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c7 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c7 }
            r2.<init>(r6, r11)     // Catch:{ all -> 0x01c7 }
            r4.close()     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
            goto L_0x01fe
        L_0x018e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c7 }
            throw r1     // Catch:{ all -> 0x01c7 }
        L_0x0191:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0196 }
            goto L_0x019a
        L_0x0196:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x019b }
        L_0x019a:
            throw r2     // Catch:{ all -> 0x019b }
        L_0x019b:
            r2 = move-exception
            r9.close()     // Catch:{ all -> 0x01a0 }
            goto L_0x01a4
        L_0x01a0:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ IOException -> 0x01a5 }
        L_0x01a4:
            throw r2     // Catch:{ IOException -> 0x01a5 }
        L_0x01a5:
            r2 = move-exception
            java.lang.String r1 = "ManifestManager/store/Failed : "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x01c7 }
        L_0x01ab:
            java.lang.String r1 = "ManifestManager/fetch/Store failed for MANIFEST"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x01c7 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c7 }
            r2.<init>(r5, r15)     // Catch:{ all -> 0x01c7 }
            r4.close()     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
            goto L_0x01fe
        L_0x01b9:
            java.lang.String r1 = "ManifestManager/fetch/Improper manifest hash from server!"
            X.C88574a9.A03(r1)     // Catch:{ all -> 0x01c7 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c7 }
            r2.<init>(r5, r15)     // Catch:{ all -> 0x01c7 }
            r4.close()     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
            goto L_0x01fe
        L_0x01c7:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x01cc }
            goto L_0x01d0
        L_0x01cc:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
        L_0x01d0:
            throw r2     // Catch:{ IOException -> 0x01d1, JSONException -> 0x01e0 }
        L_0x01d1:
            r2 = move-exception
            java.lang.String r1 = "ManifestManager/fetch/Failed! "
            com.whatsapp.util.Log.e(r1, r2)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r5, r15)
            goto L_0x01fe
        L_0x01dd:
            r5 = r17
            goto L_0x0215
        L_0x01e0:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "ManifestManager/fetch/json exception while fetching manifest."
            r2.append(r1)
            java.lang.String r1 = r4.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            X.C88574a9.A03(r1)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r5, r15)
        L_0x01fe:
            java.lang.Object r1 = r2.first
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r5 = r2.second
            X.2rg r5 = (X.C62612rg) r5
            if (r1 == 0) goto L_0x03d7
            X.11P r1 = r0.A06
            long r1 = X.AnonymousClass11P.A01(r1)
            A06(r0, r1)
        L_0x0215:
            X.C17960vV.A07(r5)
            java.lang.String r1 = r5.A00
            X.C17960vV.A07(r1)
            X.118 r1 = r0.A07
            android.content.Context r1 = r1.A00
            java.io.File r2 = r1.getFilesDir()
            java.lang.String r1 = "downloadable/manifest.json"
            java.io.File r4 = new java.io.File
            r4.<init>(r2, r1)
            X.C17960vV.A01()
            int r2 = A00(r0)
            r1 = 0
            if (r2 != 0) goto L_0x0237
            r1 = 1
        L_0x0237:
            X.C17960vV.A0D(r1)
            X.2ke r1 = r0.A02
            if (r1 != 0) goto L_0x0416
            boolean r1 = r4.exists()
            if (r1 != 0) goto L_0x0279
            java.lang.String r1 = "ManifestManager/read/Manifest file doesn't exist, but read called!"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0249:
            java.lang.String r1 = "ManifestManager/fetchWithBackoff/Read failed."
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x024e:
            r18 = r27
            long r1 = r18.A01()
            long r7 = r18.A00()
            r5 = 17
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x03de
            java.lang.String r1 = "ManifestManager/fetchWithBackoff/Load failed on all retries!"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.11P r1 = r0.A06
            long r1 = X.AnonymousClass11P.A01(r1)
            r0.A01 = r1
            X.0z4 r2 = r0.A08
            java.lang.String r1 = "manifest"
            r2.A1s(r1, r15)
            A01(r0, r10)
            r0.A05(r15, r3)
            return
        L_0x0279:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x03cf }
            r2.<init>(r4)     // Catch:{ IOException -> 0x03cf }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x03cf }
            r1.<init>(r2)     // Catch:{ IOException -> 0x03cf }
            android.util.JsonReader r4 = new android.util.JsonReader     // Catch:{ IOException -> 0x03cf }
            r4.<init>(r1)     // Catch:{ IOException -> 0x03cf }
            r4.beginObject()     // Catch:{ all -> 0x03c5 }
        L_0x0290:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x03b2
            java.lang.String r7 = r4.nextName()     // Catch:{ all -> 0x03c5 }
            int r2 = r7.hashCode()     // Catch:{ all -> 0x03c5 }
            r1 = 1296516636(0x4d47461c, float:2.08953792E8)
            java.lang.String r9 = "ManifestManager/read/Skipping unknown field "
            if (r2 != r1) goto L_0x0370
            java.lang.String r1 = "categories"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x0370
            r4.beginObject()     // Catch:{ all -> 0x03c5 }
        L_0x02b0:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x036b
            java.lang.String r8 = r4.nextName()     // Catch:{ all -> 0x03c5 }
            r4.beginObject()     // Catch:{ all -> 0x03c5 }
            r7 = 0
            r25 = r15
            r2 = r15
        L_0x02c1:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x034c
            java.lang.String r11 = r4.nextName()     // Catch:{ all -> 0x03c5 }
            int r1 = r11.hashCode()     // Catch:{ all -> 0x03c5 }
            switch(r1) {
                case 116079: goto L_0x02f0;
                case 235331633: goto L_0x02fe;
                case 1652450738: goto L_0x0332;
                case 1950472728: goto L_0x033f;
                default: goto L_0x02d2;
            }     // Catch:{ all -> 0x03c5 }
        L_0x02d2:
            r4.skipValue()     // Catch:{ all -> 0x03c5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c5 }
            r1.<init>()     // Catch:{ all -> 0x03c5 }
            r1.append(r9)     // Catch:{ all -> 0x03c5 }
            r1.append(r11)     // Catch:{ all -> 0x03c5 }
            java.lang.String r11 = " while reading category "
            r1.append(r11)     // Catch:{ all -> 0x03c5 }
            r1.append(r8)     // Catch:{ all -> 0x03c5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03c5 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x03c5 }
            goto L_0x02c1
        L_0x02f0:
            java.lang.String r1 = "url"
            boolean r1 = r11.equals(r1)     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x02d2
            java.lang.String r25 = r4.nextString()     // Catch:{ all -> 0x03c5 }
            goto L_0x02c1
        L_0x02fe:
            java.lang.String r1 = "bundles"
            boolean r1 = r11.equals(r1)     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x02d2
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x03c5 }
            r2.<init>()     // Catch:{ all -> 0x03c5 }
            r4.beginArray()     // Catch:{ all -> 0x03c5 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03c5 }
        L_0x0312:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x032e
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x03c5 }
            java.lang.String r1 = r4.nextString()     // Catch:{ all -> 0x03c5 }
            r2.put(r11, r1)     // Catch:{ all -> 0x03c5 }
            int r1 = r12.intValue()     // Catch:{ all -> 0x03c5 }
            int r1 = r1 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03c5 }
            goto L_0x0312
        L_0x032e:
            r4.endArray()     // Catch:{ all -> 0x03c5 }
            goto L_0x02c1
        L_0x0332:
            java.lang.String r1 = "id_hash"
            boolean r1 = r11.equals(r1)     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x02d2
            java.lang.String r7 = r4.nextString()     // Catch:{ all -> 0x03c5 }
            goto L_0x02c1
        L_0x033f:
            java.lang.String r1 = "default_locale"
            boolean r1 = r11.equals(r1)     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x02d2
            r4.nextString()     // Catch:{ all -> 0x03c5 }
            goto L_0x02c1
        L_0x034c:
            r4.endObject()     // Catch:{ all -> 0x03c5 }
            if (r7 == 0) goto L_0x038c
            boolean r1 = X.C88574a9.A04(r7)     // Catch:{ all -> 0x03c5 }
            if (r1 == 0) goto L_0x038c
            X.2rg r1 = new X.2rg     // Catch:{ all -> 0x03c5 }
            r26 = r2
            r21 = r1
            r22 = r8
            r23 = r7
            r24 = r15
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x03c5 }
            r6.put(r8, r1)     // Catch:{ all -> 0x03c5 }
            goto L_0x02b0
        L_0x036b:
            r4.endObject()     // Catch:{ all -> 0x03c5 }
            goto L_0x0290
        L_0x0370:
            r4.skipValue()     // Catch:{ all -> 0x03c5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c5 }
            r2.<init>()     // Catch:{ all -> 0x03c5 }
            r2.append(r9)     // Catch:{ all -> 0x03c5 }
            r2.append(r7)     // Catch:{ all -> 0x03c5 }
            java.lang.String r1 = " in MANIFEST"
            r2.append(r1)     // Catch:{ all -> 0x03c5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x03c5 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x03c5 }
            goto L_0x0290
        L_0x038c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c5 }
            r2.<init>()     // Catch:{ all -> 0x03c5 }
            java.lang.String r1 = "ManifestManager/read/Category "
            r2.append(r1)     // Catch:{ all -> 0x03c5 }
            r2.append(r8)     // Catch:{ all -> 0x03c5 }
            java.lang.String r1 = " does not have proper hash : "
            r2.append(r1)     // Catch:{ all -> 0x03c5 }
            r2.append(r7)     // Catch:{ all -> 0x03c5 }
            java.lang.String r1 = " Quitting!"
            r2.append(r1)     // Catch:{ all -> 0x03c5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x03c5 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x03c5 }
            r4.close()     // Catch:{ IOException -> 0x03cf }
            goto L_0x0249
        L_0x03b2:
            r4.endObject()     // Catch:{ all -> 0x03c5 }
            X.2ke r1 = new X.2ke     // Catch:{ all -> 0x03c5 }
            r1.<init>(r5, r6)     // Catch:{ all -> 0x03c5 }
            monitor-enter(r0)     // Catch:{ all -> 0x03c5 }
            r0.A02 = r1     // Catch:{ all -> 0x03c2 }
            monitor-exit(r0)     // Catch:{ all -> 0x03c5 }
            r4.close()     // Catch:{ IOException -> 0x03cf }
            goto L_0x0416
        L_0x03c2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x03c5 }
            throw r1     // Catch:{ all -> 0x03c5 }
        L_0x03c5:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x03ca }
            goto L_0x03ce
        L_0x03ca:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ IOException -> 0x03cf }
        L_0x03ce:
            throw r2     // Catch:{ IOException -> 0x03cf }
        L_0x03cf:
            r2 = move-exception
            java.lang.String r1 = "ManifestManager/read/Failed!"
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x0249
        L_0x03d7:
            java.lang.String r1 = "ManifestManager/fetchWithBackoff/Fetch failed."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x024e
        L_0x03de:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "ManifestManager/fetchWithBackoff/Load failed, will retry after "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r3 = " seconds for the "
            r5.append(r3)
            long r3 = r18.A00()
            r5.append(r3)
            java.lang.String r3 = "th time"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r3)
            X.10I r5 = r0.A0E
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r19 = 28
            X.7RT r15 = new X.7RT
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            r5.CGv(r15, r1)
            return
        L_0x0416:
            X.2ke r5 = r0.A02
            X.C17960vV.A07(r5)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r1 = r5.A01
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r4 = r1.iterator()
        L_0x042a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0457
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            X.2rg r1 = (X.C62612rg) r1
            java.lang.String r12 = r1.A01
            java.lang.String r13 = r1.A01()
            java.lang.String r14 = r1.A00
            java.lang.String r15 = r1.A02
            java.util.Map r1 = r1.A03
            X.2rg r11 = new X.2rg
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r3.put(r2, r11)
            goto L_0x042a
        L_0x0457:
            X.2rg r1 = r5.A00
            java.lang.String r5 = r1.A01
            java.lang.String r6 = r1.A01()
            java.lang.String r7 = r1.A00
            java.lang.String r8 = r1.A02
            java.util.Map r9 = r1.A03
            X.2rg r4 = new X.2rg
            r4.<init>(r5, r6, r7, r8, r9)
            X.2ke r2 = new X.2ke
            r2.<init>(r4, r3)
            r1 = 5
            A01(r0, r1)
            r0.A05(r2, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24491Kn.A04(X.2rg, X.1Kn, X.1Kj, boolean):void");
    }

    private void A05(C58412ke r7, boolean z) {
        ArrayList arrayList;
        C17960vV.A01();
        if (z) {
            C17960vV.A07(r7);
        }
        synchronized (this) {
            HashMap hashMap = this.A0H;
            arrayList = new ArrayList(hashMap.entrySet());
            hashMap.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            Iterator it2 = ((AbstractCollection) entry.getValue()).iterator();
            while (it2.hasNext()) {
                C58532kq r2 = (C58532kq) it2.next();
                if (z) {
                    r2.A01((C62612rg) r7.A01.get(entry.getKey()));
                } else {
                    r2.A00();
                }
            }
        }
    }
}
