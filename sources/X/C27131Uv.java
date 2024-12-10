package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.location.FinalLiveLocationBroadcastReceiver;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Uv  reason: invalid class name and case insensitive filesystem */
public class C27131Uv {
    public int A00 = 0;
    public long A01 = 0;
    public Long A02 = null;
    public Map A03;
    public Map A04;
    public C60072nL A05;
    public final Handler A06 = new Handler(Looper.getMainLooper());
    public final AnonymousClass195 A07;
    public final AnonymousClass11S A08;
    public final C25001Mm A09;
    public final AnonymousClass1M9 A0A;
    public final AnonymousClass1R8 A0B;
    public final AnonymousClass11C A0C;
    public final AnonymousClass11P A0D;
    public final AnonymousClass118 A0E;
    public final C219217x A0F;
    public final AnonymousClass1P3 A0G;
    public final AnonymousClass1NN A0H;
    public final AnonymousClass1LU A0I;
    public final C27091Ur A0J;
    public final C27121Uu A0K;
    public final C27101Us A0L;
    public final AnonymousClass10I A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final Object A0S = new Object();
    public final Object A0T = new Object();
    public final Object A0U = new Object();
    public final HashSet A0V = new HashSet();
    public final List A0W = new ArrayList();
    public final List A0X = new ArrayList();
    public final Map A0Y = new HashMap();
    public final Map A0Z = new HashMap();
    public final Map A0a = new HashMap();
    public final Map A0b = new HashMap();
    public final Map A0c = new HashMap();
    public final AnonymousClass190 A0d;
    public final AnonymousClass00H A0e;
    public final Runnable A0f = new C449025f((Object) this, 45);
    public final Runnable A0g = new C449025f((Object) this, 46);

    public static boolean A0G(long j, long j2) {
        return j == 0 || j > j2;
    }

    public void A0T() {
        C60072nL r3;
        int i;
        synchronized (this) {
            r3 = this.A05;
        }
        if (!C18020vd.A05(C18040vf.A02, ((C61972qa) this.A0Q.get()).A01, 4718)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this.A0U) {
                for (Map.Entry entry : A06(this).entrySet()) {
                    Iterator it = ((C54882er) entry.getValue()).A03.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C22971Dz.A0T((UserJid) it.next())) {
                                arrayList.add((AnonymousClass1BI) entry.getKey());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1BI r2 = (AnonymousClass1BI) it2.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append("LocationSharingManager/checkLidRollback rolling back ");
                    sb.append(r2);
                    Log.i(sb.toString());
                    A0V(r2);
                }
            }
        }
        if (r3 != null) {
            if (A0a()) {
                synchronized (this.A0U) {
                    boolean z = false;
                    for (C54882er r11 : A06(this).values()) {
                        long j = r11.A01;
                        AnonymousClass205 r6 = r11.A02;
                        AnonymousClass219 A032 = A03(this, r6);
                        if (!(A032 == null || j == 0)) {
                            C60072nL r9 = r11.A00;
                            if (r9 == null) {
                                r9 = A032.A02;
                                if (r9 != null) {
                                    r11.A00 = r9;
                                    z = true;
                                } else {
                                    long j2 = r3.A05;
                                    if (j >= j2 && j <= j2 + 240000) {
                                        r9 = new C60072nL(r3.A06);
                                        r11.A00 = r9;
                                        r9.A00(r3);
                                        this.A09.A01(new SendFinalLiveLocationNotificationJob(r6, r3, (int) ((r3.A05 - A032.A0I) / 1000)));
                                        z = true;
                                    }
                                }
                            }
                            if (r9.A05 + C20113A7w.A0L < j) {
                                long j3 = r3.A05;
                                if (j >= j3 && j <= j3 + C20113A7w.A0L) {
                                    r9.A00(r3);
                                    this.A09.A01(new SendFinalLiveLocationNotificationJob(r6, r3, (int) ((r3.A05 - A032.A0I) / 1000)));
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        A0C(this);
                    }
                }
                if (!A0a()) {
                    synchronized (this.A0S) {
                        i = -2 & this.A00;
                        this.A00 = i;
                    }
                    if (i == 0) {
                        LocationSharingService.A00(this.A0E.A00);
                    }
                }
            }
            this.A0M.CGF(new C146507Pj(this, r3, 47));
            return;
        }
        Log.w("LocationSharingManager/sendLatestLocation/try to send location, but no location available");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        r2 = r9.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r7 = X.AnonymousClass11P.A01(r9.A0D);
        r6 = (android.util.Pair) r2.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r6 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        r0 = r7 - ((java.lang.Long) r6.first).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r0 >= 60000) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        if (((java.lang.Integer) r6.second).intValue() < r12) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource=");
        r4.append(r10);
        r4.append("; timeElapsed=");
        r4.append(r0);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource=");
        r1.append(r10);
        r1.append("; retryCount=");
        r1.append(r12);
        com.whatsapp.util.Log.i(r1.toString());
        r2.put(r10, android.util.Pair.create(java.lang.Long.valueOf(r7), java.lang.Integer.valueOf(r12)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ec, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        r4 = r9.A0L.A02;
        ((X.AnonymousClass1OZ) r4.get()).A0O(new X.C29621ca(new X.C29621ca("encrypt", (X.AnonymousClass1MD[]) null, new X.C29621ca[]{new X.C29621ca("request", new X.AnonymousClass1MD[]{new X.AnonymousClass1MD("retry", java.lang.String.valueOf(r12))}), new X.C29621ca("registration", r11, (X.AnonymousClass1MD[]) null)}), "notification", new X.AnonymousClass1MD[]{new X.AnonymousClass1MD((java.lang.String) androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID, ((X.AnonymousClass1OZ) r4.get()).A0B()), new X.AnonymousClass1MD((com.whatsapp.jid.Jid) r10, "to"), new X.AnonymousClass1MD((java.lang.String) androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location")}), 125);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Y(com.whatsapp.jid.UserJid r10, byte[] r11, int r12) {
        /*
            r9 = this;
            r0 = 4
            if (r12 <= r0) goto L_0x0020
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/reached max retry; remote_resource="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; retryCount="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0020:
            java.lang.Object r2 = r9.A0T
            monitor-enter(r2)
            java.util.Map r0 = A05(r9)     // Catch:{ all -> 0x0161 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0161 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0161 }
            r3 = 0
        L_0x0030:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0161 }
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0161 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0161 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0161 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0161 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0161 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0161 }
        L_0x004a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0161 }
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0161 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0161 }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0161 }
            if (r0 == 0) goto L_0x004a
            r3 = 1
            goto L_0x0030
        L_0x005e:
            if (r3 != 0) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0161 }
            r1.<init>()     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/should not receive location updates from this user; jid="
            r1.append(r0)     // Catch:{ all -> 0x0161 }
            r1.append(r10)     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0161 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0161 }
            monitor-exit(r2)     // Catch:{ all -> 0x0161 }
            return
        L_0x0076:
            monitor-exit(r2)     // Catch:{ all -> 0x0161 }
            java.util.Map r2 = r9.A0Y
            monitor-enter(r2)
            X.11P r0 = r9.A0D     // Catch:{ all -> 0x015e }
            long r7 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x015e }
            java.lang.Object r6 = r2.get(r10)     // Catch:{ all -> 0x015e }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ all -> 0x015e }
            if (r6 == 0) goto L_0x00c1
            java.lang.Object r0 = r6.first     // Catch:{ all -> 0x015e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x015e }
            long r3 = r0.longValue()     // Catch:{ all -> 0x015e }
            long r0 = r7 - r3
            r4 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x00c1
            java.lang.Object r3 = r6.second     // Catch:{ all -> 0x015e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x015e }
            int r3 = r3.intValue()     // Catch:{ all -> 0x015e }
            if (r3 < r12) goto L_0x00c1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            r4.<init>()     // Catch:{ all -> 0x015e }
            java.lang.String r3 = "LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource="
            r4.append(r3)     // Catch:{ all -> 0x015e }
            r4.append(r10)     // Catch:{ all -> 0x015e }
            java.lang.String r3 = "; timeElapsed="
            r4.append(r3)     // Catch:{ all -> 0x015e }
            r4.append(r0)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x015e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015e }
            monitor-exit(r2)     // Catch:{ all -> 0x015e }
            return
        L_0x00c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            r1.<init>()     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource="
            r1.append(r0)     // Catch:{ all -> 0x015e }
            r1.append(r10)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "; retryCount="
            r1.append(r0)     // Catch:{ all -> 0x015e }
            r1.append(r12)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x015e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015e }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x015e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x015e }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x015e }
            r2.put(r10, r0)     // Catch:{ all -> 0x015e }
            monitor-exit(r2)     // Catch:{ all -> 0x015e }
            X.1Us r0 = r9.A0L
            X.00H r4 = r0.A02
            java.lang.Object r0 = r4.get()
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            java.lang.String r2 = r0.A0B()
            r0 = 3
            X.1MD[] r3 = new X.AnonymousClass1MD[r0]
            java.lang.String r1 = "id"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r8 = 0
            r3[r8] = r0
            java.lang.String r1 = "to"
            X.1MD r0 = new X.1MD
            r0.<init>((com.whatsapp.jid.Jid) r10, (java.lang.String) r1)
            r7 = 1
            r3[r7] = r0
            java.lang.String r2 = "type"
            java.lang.String r0 = "location"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 2
            r3[r0] = r1
            X.1ca[] r5 = new X.C29621ca[r0]
            X.1MD[] r6 = new X.AnonymousClass1MD[r7]
            java.lang.String r2 = "retry"
            java.lang.String r1 = java.lang.String.valueOf(r12)
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r6[r8] = r0
            java.lang.String r1 = "request"
            X.1ca r0 = new X.1ca
            r0.<init>(r1, r6)
            r5[r8] = r0
            java.lang.String r1 = "registration"
            r2 = 0
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r1, (byte[]) r11, (X.AnonymousClass1MD[]) r2)
            r5[r7] = r0
            java.lang.String r0 = "encrypt"
            X.1ca r1 = new X.1ca
            r1.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r2, (X.C29621ca[]) r5)
            java.lang.String r0 = "notification"
            X.1ca r2 = new X.1ca
            r2.<init>((X.C29621ca) r1, (java.lang.String) r0, (X.AnonymousClass1MD[]) r3)
            java.lang.Object r1 = r4.get()
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            r0 = 125(0x7d, float:1.75E-43)
            r1.A0O(r2, r0)
            return
        L_0x015e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x015e }
            throw r0
        L_0x0161:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0161 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Uv.A0Y(com.whatsapp.jid.UserJid, byte[], int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0e(com.whatsapp.jid.UserJid r9, int r10) {
        /*
            r8 = this;
            r0 = 4
            r7 = 0
            if (r10 <= r0) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationSharingManager/shouldUserGetLocationKeyRetry/reached max retry; remote_resource="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "; retryCount="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x0021:
            java.lang.Object r4 = r8.A0U
            monitor-enter(r4)
            java.util.HashSet r0 = A04(r8)     // Catch:{ all -> 0x0079 }
            boolean r0 = r0.contains(r9)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0074
            X.11P r0 = r8.A0D     // Catch:{ all -> 0x007b }
            long r1 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x007b }
            java.util.Map r0 = r8.A0Z     // Catch:{ all -> 0x007b }
            java.lang.Object r3 = r0.get(r9)     // Catch:{ all -> 0x007b }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x0076
            java.lang.Object r0 = r3.first     // Catch:{ all -> 0x007b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x007b }
            long r5 = r0.longValue()     // Catch:{ all -> 0x007b }
            long r1 = r1 - r5
            r5 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            java.lang.Object r0 = r3.second     // Catch:{ all -> 0x007b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x007b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x007b }
            if (r0 < r10) goto L_0x0076
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r3.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "LocationSharingManager/shouldUserGetLocationKeyRetry/retry too soon; remote_resource="
            r3.append(r0)     // Catch:{ all -> 0x007b }
            r3.append(r9)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "; timeElapsed="
            r3.append(r0)     // Catch:{ all -> 0x007b }
            r3.append(r1)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x007b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x007b }
        L_0x0074:
            monitor-exit(r4)     // Catch:{ all -> 0x007b }
            return r7
        L_0x0076:
            monitor-exit(r4)     // Catch:{ all -> 0x007b }
            r0 = 1
            return r0
        L_0x0079:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x007b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Uv.A0e(com.whatsapp.jid.UserJid, int):boolean");
    }

    public static long A00(C27131Uv r10) {
        long j;
        synchronized (r10.A0U) {
            AnonymousClass00H r9 = r10.A0e;
            long j2 = ((SharedPreferences) ((C19830z4) r9.get()).A00.get()).getLong("live_location_sequence_number", -1);
            long A052 = r10.A0D.A05() * 1000;
            if (A052 > j2) {
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingManager/getNextSequenceNumber; got a new sequence number; currentSequenceNumber=");
                sb.append(A052);
                Log.i(sb.toString());
                j2 = A052;
            }
            j = j2 + 1;
            C19830z4.A00((C19830z4) r9.get()).putLong("live_location_sequence_number", j).apply();
        }
        return j;
    }

    public static C60072nL A02(UserJid userJid, C166418cr r6, AnonymousClass219 r7) {
        C165968c8 r3 = r6.liveLocationMessage_;
        if (r3 == null) {
            r3 = C165968c8.DEFAULT_INSTANCE;
        }
        C60072nL r62 = new C60072nL(userJid);
        r62.A00 = r3.degreesLatitude_;
        r62.A01 = r3.degreesLongitude_;
        r62.A03 = r3.accuracyInMeters_;
        int i = r3.bitField0_;
        if ((i & 8) != 0) {
            float f = r3.speedInMps_;
            if (!Float.isNaN(f)) {
                r62.A02 = f;
            }
        }
        r62.A04 = r3.degreesClockwiseFromMagneticNorth_;
        if (!((i & 128) == 0 || r7 == null)) {
            r62.A05 = r7.A0I + (((long) r3.timeOffset_) * 1000);
        }
        return r62;
    }

    public static AnonymousClass219 A03(C27131Uv r1, AnonymousClass205 r2) {
        AnonymousClass206 A052 = ((AnonymousClass1W6) r1.A0P.get()).A01.A05(r2);
        if (!(A052 instanceof AnonymousClass219) || A052.A0z) {
            return null;
        }
        return (AnonymousClass219) A052;
    }

    public static Map A05(C27131Uv r11) {
        Map map;
        Cursor A0A2;
        boolean z;
        synchronized (r11.A0T) {
            if (r11.A03 == null) {
                Map map2 = r11.A0c;
                C27121Uu r8 = r11.A0K;
                C60072nL r6 = null;
                long currentTimeMillis = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                try {
                    C28781at A052 = r8.A00.get();
                    try {
                        A0A2 = ((C28801av) A052).A02.A0A(C50662Vh.A00, "getAllUserLocations/QUERY_LOCATION_CACHE", (String[]) null);
                        while (A0A2.moveToNext()) {
                            UserJid A042 = UserJid.Companion.A04(A0A2.getString(0));
                            if (A042 == null) {
                                z = false;
                            } else {
                                C17960vV.A07(A042);
                                r6 = new C60072nL(A042);
                                r6.A00 = A0A2.getDouble(1);
                                r6.A01 = A0A2.getDouble(2);
                                r6.A03 = A0A2.getInt(3);
                                r6.A02 = A0A2.getFloat(4);
                                r6.A04 = A0A2.getInt(5);
                                r6.A05 = A0A2.getLong(6);
                                z = true;
                            }
                            if (z) {
                                hashMap.put(r6.A06, r6);
                            }
                        }
                        A0A2.close();
                        A052.close();
                        StringBuilder sb = new StringBuilder();
                        sb.append("LocationSharingStore/getAllUserLocations/returned ");
                        sb.append(hashMap.size());
                        sb.append(" user locations sharer | time: ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        Log.i(sb.toString());
                        map2.putAll(hashMap);
                        HashSet hashSet = new HashSet(map2.keySet());
                        r11.A03 = new HashMap();
                        C27121Uu.A02(r8, AnonymousClass11P.A01(r11.A0D), false);
                        ArrayList A002 = C27121Uu.A00(r8, 0, false);
                        HashMap hashMap2 = new HashMap();
                        Iterator it = A002.iterator();
                        while (it.hasNext()) {
                            C61582pv r3 = (C61582pv) it.next();
                            AnonymousClass1BI r1 = r3.A01;
                            if (!hashMap2.containsKey(r1)) {
                                hashMap2.put(r1, new HashMap());
                            }
                            UserJid userJid = r3.A02;
                            ((Map) hashMap2.get(r1)).put(userJid, new C54392e4(userJid, r3.A03, r3.A00));
                        }
                        HashSet hashSet2 = new HashSet();
                        for (AnonymousClass1BI r32 : hashMap2.keySet()) {
                            if (r11.A0A.A0G(r32) != null) {
                                if (!r11.A03.containsKey(r32)) {
                                    r11.A03.put(r32, new HashMap());
                                }
                                Map map3 = (Map) hashMap2.get(r32);
                                C17960vV.A07(map3);
                                Map map4 = (Map) r11.A03.get(r32);
                                C17960vV.A07(map4);
                                for (UserJid userJid2 : map3.keySet()) {
                                    map4.put(userJid2, (C54392e4) map3.get(userJid2));
                                    hashSet.remove(userJid2);
                                }
                            } else {
                                hashSet2.add(r32);
                            }
                        }
                        if (!hashSet2.isEmpty()) {
                            C27121Uu.A03(r8, hashSet2, false);
                        }
                        if (!hashSet.isEmpty()) {
                            r8.A06(hashSet);
                        }
                        A0B(r11);
                    } catch (Throwable th) {
                        A052.close();
                        throw th;
                    }
                } catch (Exception e) {
                    Log.e("LocationSharingStore/getAllUserLocations/error getting user locations", e);
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            }
            map = r11.A03;
        }
        return map;
        throw th;
    }

    public static Map A06(C27131Uv r11) {
        Map map;
        synchronized (r11.A0U) {
            if (r11.A04 == null) {
                r11.A04 = new HashMap();
                AnonymousClass11P r7 = r11.A0D;
                long A012 = AnonymousClass11P.A01(r7);
                C27121Uu r6 = r11.A0K;
                C27121Uu.A02(r6, A012 - 604800000, true);
                ArrayList A002 = C27121Uu.A00(r6, AnonymousClass11P.A01(r7), true);
                HashMap hashMap = new HashMap(A002.size());
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    C61582pv r8 = (C61582pv) it.next();
                    AnonymousClass1BI r9 = r8.A01;
                    if (!hashMap.containsKey(r9)) {
                        hashMap.put(r9, new C54882er(r8.A03, (List) null, r8.A00));
                    }
                    Object obj = hashMap.get(r9);
                    C17960vV.A07(obj);
                    if (r8.A03.equals(((C54882er) obj).A02)) {
                        ((C54882er) hashMap.get(r9)).A03.add(r8.A02);
                    }
                }
                HashSet hashSet = new HashSet();
                for (AnonymousClass1BI r2 : hashMap.keySet()) {
                    if (r11.A0A.A0G(r2) != null) {
                        r11.A04.put(r2, (C54882er) hashMap.get(r2));
                    } else {
                        hashSet.add(r2);
                    }
                }
                if (!hashSet.isEmpty()) {
                    C27121Uu.A03(r6, hashSet, true);
                }
                HashSet hashSet2 = r11.A0V;
                hashSet2.addAll(r6.A04());
                HashSet hashSet3 = new HashSet(hashSet2);
                hashSet3.removeAll(A04(r11));
                if (!hashSet3.isEmpty()) {
                    r11.A0S();
                }
                A0C(r11);
            }
            map = r11.A04;
        }
        return map;
    }

    private void A07() {
        Context context = this.A0E.A00;
        PendingIntent A012 = C1408573i.A01(context, 0, new Intent(context, FinalLiveLocationBroadcastReceiver.class), 536870912);
        if (A012 != null) {
            AlarmManager A052 = this.A0C.A05();
            if (A052 != null) {
                A052.cancel(A012);
            } else {
                Log.w("LocationSharingManager/cancelFinalLiveLocationUpdateAlarm/AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public static void A08(AnonymousClass1BI r6, UserJid userJid, C27131Uv r8) {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingManager/onReceiveStopSharing; jid=");
        sb.append(r6);
        sb.append("; participant=");
        sb.append(userJid);
        Log.i(sb.toString());
        synchronized (r8.A0T) {
            Map A052 = A05(r8);
            Map map = (Map) A052.get(r6);
            if (map != null) {
                UserJid userJid2 = userJid;
                if (userJid == null) {
                    userJid2 = r6;
                }
                A0D(r8, (C54392e4) map.remove(userJid2));
                C27121Uu r2 = r8.A0K;
                C17960vV.A07(r6);
                if (userJid != null) {
                    C27121Uu.A01(r6, r2, Collections.singletonList(userJid), false);
                } else {
                    C27121Uu.A03(r2, Collections.singletonList(r6), false);
                }
                if (map.isEmpty()) {
                    A052.remove(r6);
                }
            }
            A0F(r8, A052);
        }
        for (C72393Lt C2g : r8.A0X) {
            C2g.C2g(r6, userJid);
        }
        A0B(r8);
        r8.A06.post(new C146507Pj(r8, r6, 48));
    }

    public static void A09(C27131Uv r13) {
        ArrayList arrayList = new ArrayList();
        synchronized (r13.A0T) {
            Map A052 = A05(r13);
            A052.size();
            long A012 = AnonymousClass11P.A01(r13.A0D);
            for (Map.Entry entry : A052.entrySet()) {
                for (C54392e4 r5 : ((Map) entry.getValue()).values()) {
                    long j = r5.A00;
                    if (j != 0 && j <= A012) {
                        arrayList.add(Pair.create((AnonymousClass1BI) entry.getKey(), r5.A01));
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            A08((AnonymousClass1BI) pair.first, (UserJid) pair.second, r13);
        }
        A0B(r13);
    }

    public static void A0A(C27131Uv r4) {
        synchronized (r4.A0U) {
            HashSet A042 = A04(r4);
            HashSet hashSet = new HashSet(r4.A0V);
            hashSet.removeAll(A042);
            if (!hashSet.isEmpty()) {
                r4.A0S();
            }
        }
    }

    public static void A0B(C27131Uv r12) {
        Long l;
        Handler handler = r12.A06;
        Runnable runnable = r12.A0f;
        handler.removeCallbacks(runnable);
        synchronized (r12.A0T) {
            l = null;
            for (Map values : A05(r12).values()) {
                for (C54392e4 r7 : values.values()) {
                    if (l == null || r7.A00 < l.longValue()) {
                        l = Long.valueOf(r7.A00);
                    }
                }
            }
        }
        if (l != null) {
            long A012 = AnonymousClass11P.A01(r12.A0D);
            long longValue = l.longValue();
            if (longValue > A012) {
                handler.postDelayed(runnable, longValue - A012);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008e, code lost:
        if (r0 < r21.longValue()) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.C27131Uv r31) {
        /*
            r12 = r31
            android.os.Handler r0 = r12.A06
            r31 = r0
            java.lang.Runnable r0 = r12.A0g
            r30 = r0
            r1 = r31
            r1.removeCallbacks(r0)
            X.11P r0 = r12.A0D
            r29 = r0
            long r8 = X.AnonymousClass11P.A01(r29)
            X.00H r0 = r12.A0e
            r28 = r0
            java.lang.Object r0 = r28.get()
            X.0z4 r0 = (X.C19830z4) r0
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r27 = "live_location_sharing_session_total_time"
            r6 = 0
            r0 = r27
            long r25 = r1.getLong(r0, r6)
            java.lang.Object r0 = r28.get()
            X.0z4 r0 = (X.C19830z4) r0
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r24 = "live_location_sharing_session_start_time"
            r0 = r24
            long r13 = r1.getLong(r0, r6)
            java.lang.Object r0 = r28.get()
            X.0z4 r0 = (X.C19830z4) r0
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r23 = "live_location_sharing_session_end_time"
            r0 = r23
            long r19 = r1.getLong(r0, r6)
            java.lang.Object r0 = r12.A0U
            r22 = r0
            monitor-enter(r22)
            java.util.Map r0 = A06(r12)     // Catch:{ all -> 0x01af }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x01af }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x01af }
            r17 = 0
            r21 = r17
            r4 = 0
            r2 = 0
        L_0x0078:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r11 = r18.next()     // Catch:{ all -> 0x01af }
            X.2er r11 = (X.C54882er) r11     // Catch:{ all -> 0x01af }
            if (r21 == 0) goto L_0x0090
            long r0 = r11.A01     // Catch:{ all -> 0x01af }
            long r15 = r21.longValue()     // Catch:{ all -> 0x01af }
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x0096
        L_0x0090:
            long r0 = r11.A01     // Catch:{ all -> 0x01af }
            java.lang.Long r21 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01af }
        L_0x0096:
            if (r17 == 0) goto L_0x00a0
            long r15 = r17.longValue()     // Catch:{ all -> 0x01af }
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a4
        L_0x00a0:
            java.lang.Long r17 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01af }
        L_0x00a4:
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0078
            X.2nL r10 = r11.A00     // Catch:{ all -> 0x01af }
            if (r10 != 0) goto L_0x00b4
            boolean r10 = A0G(r2, r0)     // Catch:{ all -> 0x01af }
            if (r10 == 0) goto L_0x0078
            r2 = r0
            goto L_0x0078
        L_0x00b4:
            long r10 = r10.A05     // Catch:{ all -> 0x01af }
            r15 = 30000(0x7530, double:1.4822E-319)
            long r10 = r10 + r15
            int r15 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x0078
            boolean r10 = A0G(r4, r0)     // Catch:{ all -> 0x01af }
            if (r10 == 0) goto L_0x0078
            r4 = r0
            goto L_0x0078
        L_0x00c5:
            if (r17 == 0) goto L_0x00d5
            long r0 = r17.longValue()     // Catch:{ all -> 0x01af }
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d5
            int r10 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00e5
            r13 = r8
            goto L_0x00e5
        L_0x00d5:
            r0 = r19
            long r6 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x01af }
            long r6 = r6 - r13
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            long r25 = r25 + r6
            r13 = 0
            r0 = 0
        L_0x00e5:
            long r19 = X.AnonymousClass11P.A01(r29)     // Catch:{ all -> 0x01af }
            r6 = 0
            int r10 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x00ff
            int r10 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x00ff
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01ad }
            r12.A02 = r2     // Catch:{ all -> 0x01ad }
            r12.A01 = r6     // Catch:{ all -> 0x01ad }
            r12.A07()     // Catch:{ all -> 0x01ad }
            goto L_0x0133
        L_0x00ff:
            r17 = 30000(0x7530, double:1.4822E-319)
            int r10 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x0106
            goto L_0x0129
        L_0x0106:
            r15 = 180000(0x2bf20, double:8.8932E-319)
            int r10 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x0115
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01ad }
            r12.A02 = r4     // Catch:{ all -> 0x01ad }
            long r2 = r2 - r15
            goto L_0x0126
        L_0x0115:
            long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x01ad }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01ad }
            r12.A02 = r10     // Catch:{ all -> 0x01ad }
            long r2 = r2 - r15
            long r4 = r4 - r17
            long r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x01ad }
        L_0x0126:
            r12.A01 = r2     // Catch:{ all -> 0x01ad }
            goto L_0x0133
        L_0x0129:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01ad }
            r12.A02 = r2     // Catch:{ all -> 0x01ad }
            long r4 = r4 - r17
            r12.A01 = r4     // Catch:{ all -> 0x01ad }
        L_0x0133:
            long r4 = r12.A01     // Catch:{ all -> 0x01ad }
            long r4 = r4 - r19
            java.lang.Long r2 = r12.A02     // Catch:{ all -> 0x01ad }
            long r10 = r2.longValue()     // Catch:{ all -> 0x01ad }
            int r2 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r2 >= 0) goto L_0x0145
            r12.A07()     // Catch:{ all -> 0x01ad }
            goto L_0x0178
        L_0x0145:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x014d
            r12.A0P()     // Catch:{ all -> 0x01ad }
            goto L_0x0178
        L_0x014d:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ad }
            long r2 = r2 + r4
            X.11C r4 = r12.A0C     // Catch:{ all -> 0x01ad }
            android.app.AlarmManager r4 = r4.A05()     // Catch:{ all -> 0x01ad }
            if (r4 == 0) goto L_0x0173
            X.118 r4 = r12.A0E     // Catch:{ all -> 0x01ad }
            android.content.Context r7 = r4.A00     // Catch:{ all -> 0x01ad }
            java.lang.Class<com.whatsapp.location.FinalLiveLocationBroadcastReceiver> r4 = com.whatsapp.location.FinalLiveLocationBroadcastReceiver.class
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x01ad }
            r6.<init>(r7, r4)     // Catch:{ all -> 0x01ad }
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r4 = 0
            android.app.PendingIntent r6 = X.C1408573i.A01(r7, r4, r6, r5)     // Catch:{ all -> 0x01ad }
            X.1R8 r5 = r12.A0B     // Catch:{ all -> 0x01ad }
            r4 = 2
            r5.A00(r6, r4, r2)     // Catch:{ all -> 0x01ad }
            goto L_0x0178
        L_0x0173:
            java.lang.String r2 = "LocationSharingManager/startFinalLiveLocationUpdateAlarm/AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x01ad }
        L_0x0178:
            java.lang.Object r2 = r28.get()     // Catch:{ all -> 0x01af }
            X.0z4 r2 = (X.C19830z4) r2     // Catch:{ all -> 0x01af }
            android.content.SharedPreferences$Editor r5 = X.C19830z4.A00(r2)     // Catch:{ all -> 0x01af }
            r4 = r27
            r2 = r25
            android.content.SharedPreferences$Editor r3 = r5.putLong(r4, r2)     // Catch:{ all -> 0x01af }
            r2 = r24
            android.content.SharedPreferences$Editor r3 = r3.putLong(r2, r13)     // Catch:{ all -> 0x01af }
            r2 = r23
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)     // Catch:{ all -> 0x01af }
            r0.apply()     // Catch:{ all -> 0x01af }
            monitor-exit(r22)     // Catch:{ all -> 0x01af }
            if (r21 == 0) goto L_0x01ac
            long r2 = r21.longValue()
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ac
            long r2 = r2 - r8
            r1 = r31
            r0 = r30
            r1.postDelayed(r0, r2)
        L_0x01ac:
            return
        L_0x01ad:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01af }
        L_0x01af:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x01af }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Uv.A0C(X.1Uv):void");
    }

    public static void A0D(C27131Uv r1, C54392e4 r2) {
        AnonymousClass219 A032;
        if (r2 != null && (A032 = A03(r1, r2.A02)) != null) {
            A0E(r1, A032);
        }
    }

    public static void A0E(C27131Uv r4, AnonymousClass219 r5) {
        int A012 = (int) ((AnonymousClass11P.A01(r4.A0D) - r5.A0I) / 1000);
        if (A012 < r5.A00) {
            r5.A00 = A012;
            if (r5.A02 == 1) {
                r5.A02 = 0;
            }
            ((AnonymousClass121) r4.A0O.get()).CQx(r5, 19);
        }
    }

    public static void A0F(C27131Uv r4, Map map) {
        HashSet hashSet = new HashSet(r4.A0c.keySet());
        for (Map values : map.values()) {
            for (C54392e4 r0 : values.values()) {
                hashSet.remove(r0.A01);
            }
        }
        if (!hashSet.isEmpty()) {
            r4.A0K.A06(hashSet);
        }
    }

    public long A0H(AnonymousClass1BI r4) {
        synchronized (this.A0U) {
            C54882er r0 = (C54882er) A06(this).get(r4);
            if (r0 == null) {
                return -1;
            }
            long j = r0.A01;
            return j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0I(X.AnonymousClass219 r7) {
        /*
            r6 = this;
            java.lang.Object r4 = r6.A0T
            monitor-enter(r4)
            java.util.Map r1 = A05(r6)     // Catch:{ all -> 0x0045 }
            X.205 r5 = r7.A0v     // Catch:{ all -> 0x0045 }
            X.1BI r0 = r5.A00     // Catch:{ all -> 0x0045 }
            java.lang.Object r3 = r1.get(r0)     // Catch:{ all -> 0x0045 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x0041
            com.whatsapp.jid.UserJid r2 = r7.A0I()     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r3.get(r2)     // Catch:{ all -> 0x0045 }
            X.2e4 r1 = (X.C54392e4) r1     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0035
            X.00H r0 = r6.A0Q     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0045 }
            X.2qa r0 = (X.C61972qa) r0     // Catch:{ all -> 0x0045 }
            X.1Ln r0 = r0.A00     // Catch:{ all -> 0x0045 }
            com.whatsapp.jid.UserJid r0 = r0.A0F(r2)     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r3.get(r0)     // Catch:{ all -> 0x0045 }
            X.2e4 r1 = (X.C54392e4) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0041
        L_0x0035:
            X.205 r0 = r1.A02     // Catch:{ all -> 0x0045 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0041
            long r0 = r1.A00     // Catch:{ all -> 0x0045 }
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
            return r0
        L_0x0041:
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
            r0 = -1
            return r0
        L_0x0045:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Uv.A0I(X.219):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0J(X.AnonymousClass219 r5) {
        /*
            r4 = this;
            X.205 r3 = r5.A0v
            X.1BI r1 = r3.A00
            X.C17960vV.A07(r1)
            java.lang.Object r2 = r4.A0U
            monitor-enter(r2)
            java.util.Map r0 = A06(r4)     // Catch:{ all -> 0x0026 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0026 }
            X.2er r1 = (X.C54882er) r1     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0022
            X.205 r0 = r1.A02     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0022
            long r0 = r1.A01     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            return r0
        L_0x0022:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            r0 = -1
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Uv.A0J(X.219):long");
    }

    public DeviceJid A0L() {
        boolean A052;
        DeviceJid deviceJid;
        C61972qa r1 = (C61972qa) this.A0Q.get();
        if (C61972qa.A00(r1)) {
            A052 = false;
        } else {
            A052 = C18020vd.A05(C18040vf.A02, r1.A01, 4718);
        }
        AnonymousClass11S r0 = this.A08;
        if (A052) {
            deviceJid = r0.A08();
        } else {
            r0.A0I();
            deviceJid = r0.A02;
        }
        C17960vV.A07(deviceJid);
        return deviceJid;
    }

    public ArrayList A0M() {
        ArrayList arrayList;
        synchronized (this.A0U) {
            A06(this);
            HashSet A042 = A04(this);
            A042.removeAll(this.A0V);
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingManager/getJidsNeedingSenderKey; jids.size=");
            sb.append(A042.size());
            Log.i(sb.toString());
            arrayList = new ArrayList(A042);
        }
        return arrayList;
    }

    public ArrayList A0N(AnonymousClass1BI r9) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0T) {
            Map map = (Map) A05(this).get(r9);
            long A012 = AnonymousClass11P.A01(this.A0D);
            if (map != null) {
                for (C54392e4 r4 : map.values()) {
                    if (A0G(r4.A00, A012)) {
                        arrayList.add(r4.A01);
                    }
                }
            }
        }
        return arrayList;
    }

    public void A0O() {
        Log.i("LocationSharingManager/cancelShareLocation");
        synchronized (this.A0U) {
            Iterator it = new ArrayList(A06(this).keySet()).iterator();
            while (it.hasNext()) {
                A0V((AnonymousClass1BI) it.next());
            }
        }
    }

    public void A0Q() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0U) {
            Map A062 = A06(this);
            A062.size();
            long A012 = AnonymousClass11P.A01(this.A0D);
            for (Map.Entry entry : A062.entrySet()) {
                long j = ((C54882er) entry.getValue()).A01;
                if (j != 0 && j <= A012) {
                    arrayList.add((AnonymousClass1BI) entry.getKey());
                }
            }
        }
        this.A0M.CGF(new C146807Qr(this, arrayList, 1));
        A0C(this);
    }

    public void A0R() {
        Log.i("LocationSharingManager/onStopLocationReporting");
        synchronized (this.A0S) {
            this.A00 = -3 & this.A00;
        }
        LocationSharingService.A00(this.A0E.A00);
    }

    public void A0S() {
        C28791au A062;
        Log.i("LocationSharingManager/removeMyLocationSenderKey");
        DeviceJid A0L2 = A0L();
        C17960vV.A07(A0L2);
        C60002nE A022 = C63962tz.A02(A0L2);
        synchronized (this.A0U) {
            if (this.A0G.A0Y()) {
                this.A0M.CGF(new C146807Qr(this, A022, 4));
            } else {
                ((C25581Ot) this.A0R.get()).A02(new C146807Qr(this, A022, 5));
            }
            this.A0V.clear();
            this.A0b.clear();
            try {
                A062 = this.A0K.A00.A06();
                int A042 = ((C28801av) A062).A02.A04("location_key_distribution", (String) null, "deleteAllLocationReceiverHasKey/DELETE_LOCATION_KEY_DISTRIBUTION", (String[]) null);
                A062.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/deleteAllLocationReceiverHasKey/deleted ");
                sb.append(A042);
                sb.append(" rows");
                Log.i(sb.toString());
            } catch (Exception e) {
                Log.e("LocationSharingStore/deleteAllLocationReceiverHasKey/delete failed", e);
                throw new RuntimeException(e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        new Object();
        ((C25611Ow) this.A0N.get()).A00.A00();
        return;
        throw th;
    }

    public void A0U(Location location) {
        C27091Ur r2 = this.A0J;
        AnonymousClass11S r0 = r2.A02;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        C17960vV.A07(phoneUserJid);
        C60072nL r6 = new C60072nL(phoneUserJid);
        r6.A00 = ((double) Math.round(location.getLatitude() * 1000000.0d)) / 1000000.0d;
        r6.A01 = ((double) Math.round(location.getLongitude() * 1000000.0d)) / 1000000.0d;
        if (location.hasAccuracy()) {
            r6.A03 = (int) location.getAccuracy();
        }
        if (location.hasSpeed()) {
            r6.A02 = ((float) ((int) (location.getSpeed() * 100.0f))) / 100.0f;
        }
        if (location.hasBearing()) {
            r6.A04 = (int) location.getBearing();
        }
        long time = location.getTime();
        r6.A05 = time;
        AnonymousClass11P r3 = r2.A03;
        if (time > AnonymousClass11P.A01(r3)) {
            r6.A05 = AnonymousClass11P.A01(r3);
        }
        synchronized (this) {
            C60072nL r02 = this.A05;
            if (r02 == null || r6.A05 > r02.A05) {
                this.A05 = r6;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A01, 4718) == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r3 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r5 = r6.A00.A0A((com.whatsapp.jid.PhoneUserJid) r5);
        X.C17960vV.A07(r5);
        X.C18070vi.A0b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        r1 = r7.A0W.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if (r1.hasNext() == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        ((X.C72273Lh) r1.next()).C76(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        A0C(r7);
        r7.A06.post(new X.C146807Qr(r7, r8, 6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e8, code lost:
        if (A0b() != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        A0R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ed, code lost:
        r7.A09.A01(new com.whatsapp.jobqueue.job.SendDisableLiveLocationJob(r5, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(X.AnonymousClass1BI r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationSharingManager/cancelShareLocation; jid="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r7.A0Q
            java.lang.Object r6 = r0.get()
            X.2qa r6 = (X.C61972qa) r6
            java.lang.Object r4 = r7.A0U
            monitor-enter(r4)
            java.util.Map r0 = A06(r7)     // Catch:{ all -> 0x00fb }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x00fb }
            X.2er r0 = (X.C54882er) r0     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x0046
            java.util.List r0 = r0.A03     // Catch:{ all -> 0x00fb }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00fb }
        L_0x0031:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00fb }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00fb }
            boolean r0 = X.C22971Dz.A0T(r0)     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x0031
            monitor-exit(r4)     // Catch:{ all -> 0x00fb }
            r3 = 1
            goto L_0x0048
        L_0x0046:
            monitor-exit(r4)     // Catch:{ all -> 0x00fb }
            r3 = 0
        L_0x0048:
            r5 = r8
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            boolean r0 = r8 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0073
            boolean r0 = X.C61972qa.A00(r6)
            if (r0 != 0) goto L_0x0063
            X.0ve r2 = r6.A01
            r1 = 4718(0x126e, float:6.611E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0065
        L_0x0063:
            if (r3 == 0) goto L_0x0073
        L_0x0065:
            X.1Ln r0 = r6.A00
            com.whatsapp.jid.PhoneUserJid r5 = (com.whatsapp.jid.PhoneUserJid) r5
            X.1E1 r5 = r0.A0A(r5)
            X.C17960vV.A07(r5)
            X.C18070vi.A0b(r5)
        L_0x0073:
            monitor-enter(r4)
            java.util.Map r0 = A06(r7)     // Catch:{ all -> 0x00f8 }
            java.lang.Object r6 = r0.remove(r8)     // Catch:{ all -> 0x00f8 }
            X.2er r6 = (X.C54882er) r6     // Catch:{ all -> 0x00f8 }
            if (r6 != 0) goto L_0x0082
            monitor-exit(r4)     // Catch:{ all -> 0x00f8 }
            return
        L_0x0082:
            X.205 r0 = r6.A02     // Catch:{ all -> 0x00f8 }
            X.219 r0 = A03(r7, r0)     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x008d
            A0E(r7, r0)     // Catch:{ all -> 0x00f8 }
        L_0x008d:
            X.1Uu r3 = r7.A0K     // Catch:{ all -> 0x00f8 }
            java.util.List r2 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x00f8 }
            X.11P r0 = r7.A0D     // Catch:{ all -> 0x00f8 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x00f8 }
            r3.A07(r2, r0)     // Catch:{ all -> 0x00f8 }
            java.util.HashSet r2 = A04(r7)     // Catch:{ all -> 0x00f8 }
            java.util.List r0 = r6.A03     // Catch:{ all -> 0x00f8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00f8 }
        L_0x00a6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f8 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00f8 }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x00f8 }
            if (r0 != 0) goto L_0x00a6
            r7.A0S()     // Catch:{ all -> 0x00f8 }
        L_0x00bb:
            long r2 = A00(r7)     // Catch:{ all -> 0x00f8 }
            monitor-exit(r4)     // Catch:{ all -> 0x00f8 }
            java.util.List r0 = r7.A0W
            java.util.Iterator r1 = r0.iterator()
        L_0x00c6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r0 = r1.next()
            X.3Lh r0 = (X.C72273Lh) r0
            r0.C76(r8)
            goto L_0x00c6
        L_0x00d6:
            A0C(r7)
            android.os.Handler r4 = r7.A06
            r1 = 6
            X.7Qr r0 = new X.7Qr
            r0.<init>(r7, r8, r1)
            r4.post(r0)
            boolean r0 = r7.A0b()
            if (r0 != 0) goto L_0x00ed
            r7.A0R()
        L_0x00ed:
            X.1Mm r1 = r7.A09
            com.whatsapp.jobqueue.job.SendDisableLiveLocationJob r0 = new com.whatsapp.jobqueue.job.SendDisableLiveLocationJob
            r0.<init>(r5, r2)
            r1.A01(r0)
            return
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f8 }
            throw r0
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00fb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Uv.A0V(X.1BI):void");
    }

    public void A0W(AnonymousClass1BI r9, List list) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingManager/onParticipantsLeftGroup; gjid=");
        sb.append(r9);
        sb.append("; participants.size=");
        sb.append(list.size());
        Log.i(sb.toString());
        synchronized (this.A0U) {
            Map A062 = A06(this);
            C54882er r6 = (C54882er) A062.get(r9);
            z = false;
            if (r6 != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UserJid userJid = (UserJid) it.next();
                    List list2 = r6.A03;
                    if (list2.contains(userJid)) {
                        list2.remove(userJid);
                        z = true;
                    }
                }
                if (r6.A03.isEmpty()) {
                    C54882er r0 = (C54882er) A062.remove(r9);
                    C17960vV.A07(r0);
                    AnonymousClass219 A032 = A03(this, r0.A02);
                    if (A032 != null) {
                        A0E(this, A032);
                    }
                }
                C27121Uu.A01(r9, this.A0K, list, true);
                A0A(this);
            }
        }
        if (z) {
            A0C(this);
            this.A06.post(new C146807Qr(this, r9, 0));
        }
        synchronized (this.A0T) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A08(r9, (UserJid) it2.next(), this);
            }
        }
    }

    public void A0X(AnonymousClass1EC r3) {
        Map map;
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingManager/onMeLeftGroup; gjid=");
        sb.append(r3);
        Log.i(sb.toString());
        A0V(r3);
        synchronized (this.A0T) {
            map = (Map) A05(this).remove(r3);
        }
        if (map != null) {
            for (C54392e4 r0 : map.values()) {
                A08(r3, r0.A01, this);
            }
        }
    }

    public void A0Z(C60072nL r7, AnonymousClass219 r8) {
        UserJid A012;
        AnonymousClass205 r2 = r8.A0v;
        AnonymousClass1BI r5 = r2.A00;
        boolean z = r2.A02;
        if (z) {
            A012 = null;
        } else if (C22971Dz.A0e(r5)) {
            AnonymousClass1BI A0H2 = r8.A0H();
            C22941Dw r0 = UserJid.Companion;
            A012 = C22941Dw.A01(A0H2);
        } else {
            C22941Dw r02 = UserJid.Companion;
            A012 = C22941Dw.A01(r5);
        }
        String str = r2.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingManager/storeFinalLiveLocation/jid=");
        sb.append(r5);
        sb.append("; fromMe=");
        sb.append(z);
        sb.append("; msgId=");
        sb.append(str);
        sb.append("; participant=");
        sb.append(A012);
        sb.append("; location.time=");
        sb.append(r7.A05);
        Log.i(sb.toString());
        r8.A02 = r7;
        ((AnonymousClass121) this.A0O.get()).CQx(r8, 18);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r5 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r3 <= r7) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0a() {
        /*
            r9 = this;
            X.11P r0 = r9.A0D
            long r7 = X.AnonymousClass11P.A01(r0)
            java.lang.Object r6 = r9.A0U
            monitor-enter(r6)
            java.lang.Long r5 = r9.A02     // Catch:{ all -> 0x003d }
            monitor-exit(r6)     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x001c
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0026
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0026
        L_0x001c:
            java.lang.String r0 = "LocationSharingManager/hasExpiringLocationReceivers/triggered clearing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A0Q()
            if (r5 == 0) goto L_0x003b
        L_0x0026:
            long r1 = r5.longValue()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            monitor-enter(r6)
            long r2 = r9.A01     // Catch:{ all -> 0x0033 }
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Uv.A0a():boolean");
    }

    public boolean A0b() {
        synchronized (this.A0U) {
            Map A062 = A06(this);
            long A012 = AnonymousClass11P.A01(this.A0D);
            for (C54882er r0 : A062.values()) {
                if (A0G(r0.A01, A012)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean A0c() {
        synchronized (this.A0U) {
            ArrayList A0M2 = A0M();
            Map map = this.A0b;
            A0M2.removeAll(map.keySet());
            if (A0M2.isEmpty()) {
                return false;
            }
            Iterator it = A0M2.iterator();
            while (it.hasNext()) {
                map.put((UserJid) it.next(), 0);
            }
            this.A09.A01(new SendLiveLocationKeyJob(A0M2));
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0d(X.AnonymousClass1BI r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A0U
            monitor-enter(r4)
            java.util.Map r2 = A06(r5)     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x0045 }
            X.2er r0 = (X.C54882er) r0     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x002e
            boolean r0 = X.C22971Dz.A0d(r6)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0042
            X.00H r0 = r5.A0Q     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0045 }
            X.2qa r0 = (X.C61972qa) r0     // Catch:{ all -> 0x0045 }
            r1 = r6
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0045 }
            X.1Ln r0 = r0.A00     // Catch:{ all -> 0x0045 }
            com.whatsapp.jid.UserJid r0 = r0.A0F(r1)     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x0045 }
            X.2er r0 = (X.C54882er) r0     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0042
        L_0x002e:
            long r2 = r0.A01     // Catch:{ all -> 0x0045 }
            X.11P r0 = r5.A0D     // Catch:{ all -> 0x0045 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0045 }
            boolean r0 = A0G(r2, r0)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x003f
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
            r0 = 1
            return r0
        L_0x003f:
            r5.A0V(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
            r0 = 0
            return r0
        L_0x0045:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Uv.A0d(X.1BI):boolean");
    }

    public boolean A0f(C60072nL r13) {
        boolean z;
        AnonymousClass219 A032;
        synchronized (this.A0T) {
            Map map = this.A0c;
            UserJid userJid = r13.A06;
            C60072nL r4 = (C60072nL) map.get(userJid);
            z = false;
            if (r4 == null || r4.A05 <= r13.A05) {
                for (Map map2 : A05(this).values()) {
                    C54392e4 r9 = (C54392e4) map2.get(userJid);
                    if (!(r9 == null || r13.A05 > r9.A00 || (A032 = A03(this, r9.A02)) == null)) {
                        A0Z(r13, A032);
                        z = true;
                    }
                }
                if (z) {
                    if (r4 == null) {
                        map.put(userJid, r13);
                    } else {
                        r4.A00(r13);
                    }
                    this.A0K.A05(r13);
                }
            }
        }
        return z;
    }

    public C27131Uv(AnonymousClass195 r3, AnonymousClass190 r4, AnonymousClass11S r5, C25001Mm r6, AnonymousClass1M9 r7, AnonymousClass1R8 r8, AnonymousClass11C r9, AnonymousClass11P r10, AnonymousClass118 r11, C219217x r12, AnonymousClass1P3 r13, AnonymousClass1NN r14, AnonymousClass1LU r15, C27091Ur r16, C27121Uu r17, C27101Us r18, AnonymousClass10I r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25) {
        this.A0E = r11;
        this.A0D = r10;
        this.A0B = r8;
        this.A0d = r4;
        this.A08 = r5;
        this.A0I = r15;
        this.A0M = r19;
        this.A09 = r6;
        this.A0A = r7;
        this.A0R = r20;
        this.A0C = r9;
        this.A0J = r16;
        this.A0G = r13;
        this.A0N = r21;
        this.A0Q = r22;
        this.A0L = r18;
        this.A0F = r12;
        this.A0e = r24;
        this.A0K = r17;
        this.A0H = r14;
        this.A07 = r3;
        this.A0P = r23;
        this.A0O = r25;
        Boolean bool = C17960vV.A01;
    }

    public static C194059r6 A01(C27131Uv r3, C166418cr r4) {
        DeviceJid A0L2 = r3.A0L();
        C17960vV.A07(A0L2);
        return new C194059r6(r3.A0G.A0C(new C59982nC(C63962tz.A02(A0L2), C173408v1.A00.getRawString()), r4.A0M()).A02, 3);
    }

    public static HashSet A04(C27131Uv r7) {
        Map A062 = A06(r7);
        HashSet hashSet = new HashSet();
        long A012 = AnonymousClass11P.A01(r7.A0D);
        for (C54882er r2 : A062.values()) {
            if (A0G(r2.A01, A012)) {
                hashSet.addAll(r2.A03);
            }
        }
        return hashSet;
    }

    public AnonymousClass1BI A0K(AnonymousClass1BI r4) {
        boolean z;
        if (C22971Dz.A0d(r4)) {
            synchronized (this.A0T) {
                Map map = (Map) A05(this).get(r4);
                if (map != null) {
                    Iterator it = map.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C22971Dz.A0T((UserJid) it.next())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
            }
            C61972qa r1 = (C61972qa) this.A0Q.get();
            C18070vi.A0d(r4, 0);
            if ((r4 instanceof PhoneUserJid) && z) {
                AnonymousClass1E1 A0A2 = r1.A00.A0A((PhoneUserJid) r4);
                C17960vV.A07(A0A2);
                C18070vi.A0b(A0A2);
                return A0A2;
            }
        }
        return r4;
    }

    public void A0P() {
        if (A0a()) {
            boolean z = true;
            Object obj = this.A0S;
            synchronized (obj) {
                if ((this.A00 & 1) != 1) {
                    z = false;
                }
            }
            if (!z) {
                LocationSharingService.A02(this.A0E.A00, this.A07, this.A0F, 40000, false);
                synchronized (obj) {
                    this.A00 = 1 | this.A00;
                }
            }
        }
    }
}
