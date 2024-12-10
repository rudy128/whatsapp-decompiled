package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.185  reason: invalid class name */
public class AnonymousClass185 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public boolean A0U;
    public final AnonymousClass00H A0V;

    public synchronized void A0c() {
        String str;
        AnonymousClass18H r3 = (AnonymousClass18H) this.A0V.get();
        synchronized (r3) {
            if (AnonymousClass1Es.A00(r3) >= 1) {
                SharedPreferences sharedPreferences = (SharedPreferences) r3.A00.getValue();
                C18070vi.A0X(sharedPreferences);
                str = sharedPreferences.getString("wam_client_errors", (String) null);
            } else {
                SharedPreferences sharedPreferences2 = (SharedPreferences) r3.A01.getValue();
                C18070vi.A0X(sharedPreferences2);
                str = sharedPreferences2.getString("wam_client_errors", (String) null);
            }
        }
        this.A0U = true;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.A0J = A0Z(jSONObject, 2);
                this.A0K = A0Z(jSONObject, 3);
                this.A0G = A0Y(jSONObject, 1);
                this.A01 = A0Y(jSONObject, 4);
                this.A00 = A0Y(jSONObject, 5);
                this.A0B = A0Y(jSONObject, 6);
                this.A0D = A0Y(jSONObject, 7);
                this.A09 = A0Y(jSONObject, 8);
                this.A02 = A0Y(jSONObject, 9);
                this.A0I = A0Y(jSONObject, 10);
                this.A04 = A0Y(jSONObject, 11);
                this.A0C = A0Y(jSONObject, 12);
                this.A0F = A0Y(jSONObject, 13);
                this.A03 = A0Y(jSONObject, 14);
                this.A08 = A0Y(jSONObject, 15);
                this.A07 = A0Y(jSONObject, 16);
                this.A0A = A0Y(jSONObject, 17);
                this.A06 = A0Y(jSONObject, 18);
                this.A05 = A0Y(jSONObject, 19);
                this.A0E = A0Y(jSONObject, 20);
                this.A0P = A0Z(jSONObject, 22);
                this.A0Q = A0Z(jSONObject, 23);
                this.A0L = A0Z(jSONObject, 24);
                this.A0M = A0Z(jSONObject, 25);
                this.A0R = A0Z(jSONObject, 26);
                this.A0T = A0Z(jSONObject, 27);
                this.A0S = A0Z(jSONObject, 28);
                this.A0H = A0Y(jSONObject, 29);
            } catch (JSONException e) {
                Log.e((Throwable) e);
            }
        }
        return;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void A0d() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.A0U     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x000e
            java.lang.String r1 = "WamClientErrors/WamClientErrors should be initialized before persist"
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ all -> 0x013c }
            r4.A0c()     // Catch:{ all -> 0x013c }
        L_0x000e:
            boolean r0 = r4.A0e()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x002d
            java.lang.Long r0 = r4.A0R     // Catch:{ all -> 0x013c }
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            r2 = 1
        L_0x001b:
            java.lang.Long r1 = r4.A0T     // Catch:{ all -> 0x013c }
            r0 = 0
            if (r1 == 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            r2 = r2 | r0
            java.lang.Long r0 = r4.A0S     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x0027
            r3 = 0
        L_0x0027:
            r2 = r2 | r3
            if (r2 != 0) goto L_0x002d
            r3 = 0
            goto L_0x00f3
        L_0x002d:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x013c }
            r2.<init>()     // Catch:{ all -> 0x013c }
            java.lang.Long r1 = r4.A0J     // Catch:{ all -> 0x013c }
            r0 = 2
            A0b(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Long r1 = r4.A0K     // Catch:{ all -> 0x013c }
            r0 = 3
            A0b(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A0G     // Catch:{ all -> 0x013c }
            r0 = 1
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A01     // Catch:{ all -> 0x013c }
            r0 = 4
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A00     // Catch:{ all -> 0x013c }
            r0 = 5
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A0B     // Catch:{ all -> 0x013c }
            r0 = 6
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A0D     // Catch:{ all -> 0x013c }
            r0 = 7
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A09     // Catch:{ all -> 0x013c }
            r0 = 8
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A02     // Catch:{ all -> 0x013c }
            r0 = 9
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A0I     // Catch:{ all -> 0x013c }
            r0 = 10
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A04     // Catch:{ all -> 0x013c }
            r0 = 11
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A0C     // Catch:{ all -> 0x013c }
            r0 = 12
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A0F     // Catch:{ all -> 0x013c }
            r0 = 13
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A03     // Catch:{ all -> 0x013c }
            r0 = 14
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A08     // Catch:{ all -> 0x013c }
            r0 = 15
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A07     // Catch:{ all -> 0x013c }
            r0 = 16
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A0A     // Catch:{ all -> 0x013c }
            r0 = 17
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A06     // Catch:{ all -> 0x013c }
            r0 = 18
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A05     // Catch:{ all -> 0x013c }
            r0 = 19
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A0E     // Catch:{ all -> 0x013c }
            r0 = 20
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Long r1 = r4.A0P     // Catch:{ all -> 0x013c }
            r0 = 22
            A0b(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Long r1 = r4.A0Q     // Catch:{ all -> 0x013c }
            r0 = 23
            A0b(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Long r1 = r4.A0L     // Catch:{ all -> 0x013c }
            r0 = 24
            A0b(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Long r1 = r4.A0M     // Catch:{ all -> 0x013c }
            r0 = 25
            A0b(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Long r1 = r4.A0R     // Catch:{ all -> 0x013c }
            r0 = 26
            A0b(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Long r1 = r4.A0T     // Catch:{ all -> 0x013c }
            r0 = 27
            A0b(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Long r1 = r4.A0S     // Catch:{ all -> 0x013c }
            r0 = 28
            A0b(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.Boolean r1 = r4.A0H     // Catch:{ all -> 0x013c }
            r0 = 29
            A0a(r1, r2, r0)     // Catch:{ all -> 0x013c }
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x013c }
        L_0x00f3:
            X.00H r0 = r4.A0V     // Catch:{ all -> 0x013c }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x013c }
            X.18H r2 = (X.AnonymousClass18H) r2     // Catch:{ all -> 0x013c }
            monitor-enter(r2)     // Catch:{ all -> 0x013c }
            int r1 = X.AnonymousClass1Es.A00(r2)     // Catch:{ all -> 0x0139 }
            r0 = 1
            if (r1 < r0) goto L_0x011d
            X.0vl r0 = r2.A00     // Catch:{ all -> 0x0139 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0139 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0139 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0139 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "wam_client_errors"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r3)     // Catch:{ all -> 0x0139 }
            r0.apply()     // Catch:{ all -> 0x0139 }
            goto L_0x0136
        L_0x011d:
            X.0vl r0 = r2.A01     // Catch:{ all -> 0x0139 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0139 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0139 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0139 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "wam_client_errors"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r3)     // Catch:{ all -> 0x0139 }
            r0.apply()     // Catch:{ all -> 0x0139 }
        L_0x0136:
            monitor-exit(r2)     // Catch:{ all -> 0x013c }
            monitor-exit(r4)
            return
        L_0x0139:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass185.A0d():void");
    }

    public synchronized void serialize(C107425Zq r3) {
        if (!this.A0U) {
            C17960vV.A0F(false, "WamClientErrors/WamClientErrors should be initialized before serialization");
            A0c();
        }
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A0J);
        r3.CHf(3, this.A0K);
        r3.CHf(1, this.A0G);
        r3.CHf(24, this.A0L);
        r3.CHf(25, this.A0M);
        r3.CHf(34, this.A0N);
        r3.CHf(35, this.A0O);
        r3.CHf(22, this.A0P);
        r3.CHf(23, this.A0Q);
        r3.CHf(18, this.A06);
        r3.CHf(16, this.A07);
        r3.CHf(15, this.A08);
        r3.CHf(8, this.A09);
        r3.CHf(17, this.A0A);
        r3.CHf(19, this.A05);
        r3.CHf(11, this.A04);
        r3.CHf(14, this.A03);
        r3.CHf(9, this.A02);
        r3.CHf(10, this.A0I);
        r3.CHf(26, this.A0H);
        r3.CHf(13, this.A0F);
        r3.CHf(20, this.A0E);
        r3.CHf(7, this.A0D);
        r3.CHf(12, this.A0C);
        r3.CHf(6, this.A0B);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A00);
    }

    public static void A0a(Boolean bool, JSONObject jSONObject, int i) {
        if (bool != null) {
            try {
                jSONObject.put(String.valueOf(i), bool.booleanValue());
            } catch (JSONException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public static void A0b(Long l, JSONObject jSONObject, int i) {
        if (l != null) {
            try {
                jSONObject.put(String.valueOf(i), l.longValue());
            } catch (JSONException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public final boolean A0e() {
        if (this.A0J == null && this.A0K == null && this.A0G == null && this.A0L == null && this.A0M == null && this.A0N == null && this.A0O == null && this.A0P == null && this.A0Q == null && this.A06 == null && this.A07 == null && this.A08 == null && this.A09 == null && this.A0A == null && this.A05 == null && this.A04 == null && this.A03 == null && this.A02 == null && this.A0I == null && this.A0H == null && this.A0F == null && this.A0E == null && this.A0D == null && this.A0C == null && this.A0B == null && this.A01 == null && this.A00 == null) {
            return true;
        }
        return false;
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(27, (Object) null);
        linkedHashMap.put(28, (Object) null);
        linkedHashMap.put(29, (Object) null);
        linkedHashMap.put(43, (Object) null);
        linkedHashMap.put(30, (Object) null);
        linkedHashMap.put(42, (Object) null);
        linkedHashMap.put(2, this.A0J);
        linkedHashMap.put(41, (Object) null);
        linkedHashMap.put(3, this.A0K);
        linkedHashMap.put(1, this.A0G);
        linkedHashMap.put(37, (Object) null);
        linkedHashMap.put(38, (Object) null);
        linkedHashMap.put(24, this.A0L);
        linkedHashMap.put(25, this.A0M);
        linkedHashMap.put(34, this.A0N);
        linkedHashMap.put(35, this.A0O);
        linkedHashMap.put(36, (Object) null);
        linkedHashMap.put(31, (Object) null);
        linkedHashMap.put(22, this.A0P);
        linkedHashMap.put(23, this.A0Q);
        linkedHashMap.put(32, (Object) null);
        linkedHashMap.put(33, (Object) null);
        linkedHashMap.put(18, this.A06);
        linkedHashMap.put(16, this.A07);
        linkedHashMap.put(15, this.A08);
        linkedHashMap.put(8, this.A09);
        linkedHashMap.put(17, this.A0A);
        linkedHashMap.put(19, this.A05);
        linkedHashMap.put(11, this.A04);
        linkedHashMap.put(14, this.A03);
        linkedHashMap.put(9, this.A02);
        linkedHashMap.put(10, this.A0I);
        linkedHashMap.put(26, this.A0H);
        linkedHashMap.put(13, this.A0F);
        linkedHashMap.put(20, this.A0E);
        linkedHashMap.put(7, this.A0D);
        linkedHashMap.put(12, this.A0C);
        linkedHashMap.put(6, this.A0B);
        linkedHashMap.put(4, this.A01);
        linkedHashMap.put(5, this.A00);
        linkedHashMap.put(39, (Object) null);
        linkedHashMap.put(40, (Object) null);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WamWamClientErrors {");
        AnonymousClass186.A00(this.A0J, "wamClientDroppedEventCount", sb);
        AnonymousClass186.A00(this.A0K, "wamClientDroppedEventSize", sb);
        AnonymousClass186.A00(this.A0G, "wamClientErrorFlags", sb);
        AnonymousClass186.A00(this.A0L, "wamClientPrivateDroppedEventCount", sb);
        AnonymousClass186.A00(this.A0M, "wamClientPrivateDroppedEventSize", sb);
        AnonymousClass186.A00(this.A0N, "wamClientPrivateRealtimeDroppedEventCount", sb);
        AnonymousClass186.A00(this.A0O, "wamClientPrivateRealtimeDroppedEventSize", sb);
        AnonymousClass186.A00(this.A0P, "wamClientRealtimeDroppedEventCount", sb);
        AnonymousClass186.A00(this.A0Q, "wamClientRealtimeDroppedEventSize", sb);
        AnonymousClass186.A00(this.A06, "wamErrorBadCurrentEventBufferChecksum", sb);
        AnonymousClass186.A00(this.A07, "wamErrorBadEventBuffer", sb);
        AnonymousClass186.A00(this.A08, "wamErrorBadFileHeader", sb);
        AnonymousClass186.A00(this.A09, "wamErrorBadFileSize", sb);
        AnonymousClass186.A00(this.A0A, "wamErrorBadHeaderChecksum", sb);
        AnonymousClass186.A00(this.A05, "wamErrorBadRotatedEventBufferChecksum", sb);
        AnonymousClass186.A00(this.A04, "wamErrorCloseFile", sb);
        AnonymousClass186.A00(this.A03, "wamErrorCreateWamFile", sb);
        AnonymousClass186.A00(this.A02, "wamErrorFseekFile", sb);
        AnonymousClass186.A00(this.A0I, "wamErrorOpenFile", sb);
        AnonymousClass186.A00(this.A0H, "wamErrorOpenPsUploadQueueFile", sb);
        AnonymousClass186.A00(this.A0F, "wamErrorOpenWamFile", sb);
        AnonymousClass186.A00(this.A0E, "wamErrorPersistence", sb);
        AnonymousClass186.A00(this.A0D, "wamErrorReadFile", sb);
        AnonymousClass186.A00(this.A0C, "wamErrorRemoveFile", sb);
        AnonymousClass186.A00(this.A0B, "wamErrorWriteEventBuffer", sb);
        AnonymousClass186.A00(this.A01, "wamErrorWriteFile", sb);
        AnonymousClass186.A00(this.A00, "wamErrorWriteHeader", sb);
        sb.append("}");
        String obj = sb.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public AnonymousClass185(AnonymousClass00H r1) {
        this();
        this.A0V = r1;
    }

    public static Boolean A0Y(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(valueOf));
        } catch (JSONException e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public static Long A0Z(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(valueOf));
        } catch (JSONException e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public AnonymousClass185() {
        super(1144, AnonymousClass184.DEFAULT_SAMPLING_RATE, 0, -1);
    }
}
