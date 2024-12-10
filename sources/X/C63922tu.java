package X;

import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2tu  reason: invalid class name and case insensitive filesystem */
public final class C63922tu {
    public static final Map A0K = AnonymousClass1D7.A0B(AnonymousClass1D6.A00(400, 64), AnonymousClass1D6.A00(404, 65), AnonymousClass1D6.A00(405, 66), AnonymousClass1D6.A00(406, 67));
    public final AnonymousClass11S A00;
    public final A5M A01;
    public final C26681Tb A02;
    public final C26741Th A03;
    public final C51772Zo A04;
    public final C26371Rw A05;
    public final C25851Pw A06;
    public final AnonymousClass1S3 A07;
    public final AnonymousClass1TR A08;
    public final AnonymousClass1S0 A09;
    public final AnonymousClass11Q A0A;
    public final AnonymousClass11P A0B;
    public final AnonymousClass1TT A0C;
    public final C25551Oq A0D;
    public final AnonymousClass1RK A0E;
    public final AnonymousClass1TS A0F;
    public final C26331Rs A0G;
    public final C18030ve A0H;
    public final AnonymousClass1NV A0I;
    public final AnonymousClass190 A0J;

    public void A07(Throwable th) {
        C18070vi.A0d(th, 0);
        if (th instanceof C26831Tq) {
            C26831Tq r5 = (C26831Tq) th;
            A06(Integer.valueOf(r5.errorCode), r5.collectionName);
        } else if (th instanceof AnonymousClass2E0) {
            A00();
        } else if (th instanceof AnonymousClass2E1) {
            boolean z = ((AnonymousClass2E1) th).isServerTransient;
            A01(this, this.A0I.A01(), z, !z);
        } else {
            boolean z2 = th instanceof SQLiteFullException;
            Long A012 = this.A0I.A01();
            if (z2) {
                A01(this, A012, false, true);
            } else {
                A01(this, A012, true, false);
            }
        }
    }

    public C63922tu(AnonymousClass190 r20, AnonymousClass11S r21, A5M a5m, C26681Tb r23, C26741Th r24, C51772Zo r25, C26371Rw r26, C25851Pw r27, AnonymousClass1S3 r28, AnonymousClass1TR r29, AnonymousClass1S0 r30, AnonymousClass11Q r31, AnonymousClass11P r32, AnonymousClass1TT r33, C25551Oq r34, AnonymousClass1RK r35, AnonymousClass1TS r36, C26331Rs r37, C18030ve r38, AnonymousClass1NV r39) {
        C25551Oq r5 = r34;
        C18030ve r0 = r38;
        AnonymousClass11P r15 = r32;
        AnonymousClass190 r18 = r20;
        AnonymousClass11S r17 = r21;
        C18070vi.A0w(r15, r0, r18, r17, r5);
        C26331Rs r2 = r37;
        AnonymousClass1S0 r8 = r30;
        C26371Rw r14 = r26;
        AnonymousClass1S3 r10 = r28;
        A5M a5m2 = a5m;
        C18070vi.A0x(r8, r10, r14, a5m2, r2);
        AnonymousClass1RK r4 = r35;
        AnonymousClass1TS r3 = r36;
        AnonymousClass1TR r9 = r29;
        AnonymousClass1TT r6 = r33;
        C25851Pw r11 = r27;
        C18070vi.A0y(r9, r3, r4, r6, r11);
        C26741Th r12 = r24;
        C26681Tb r13 = r23;
        C18070vi.A0m(r13, r12);
        AnonymousClass11Q r7 = r31;
        C18070vi.A0d(r7, 18);
        this.A0B = r15;
        this.A0H = r0;
        this.A0J = r18;
        this.A00 = r17;
        this.A0D = r5;
        this.A09 = r8;
        this.A07 = r10;
        this.A05 = r14;
        this.A01 = a5m2;
        this.A0G = r2;
        this.A08 = r9;
        this.A0F = r3;
        this.A0E = r4;
        this.A0C = r6;
        this.A06 = r11;
        this.A02 = r13;
        this.A03 = r12;
        this.A0A = r7;
        this.A0I = r39;
        this.A04 = r25;
    }

    private final void A00() {
        this.A0I.A02();
        C51772Zo r0 = this.A04;
        Log.i("sync-manager/onFailed");
        C26811To r1 = r0.A00;
        C26811To.A02(r1, false);
        if (r1.A0S()) {
            C17890vO.A0r(r1.A09, new Exception("sync-manager/onFailed"), 5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        if (r10 != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C63922tu r7, java.lang.Long r8, boolean r9, boolean r10) {
        /*
            if (r9 == 0) goto L_0x006a
            X.1Pw r6 = r7.A06
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r6)
            java.lang.String r5 = "first_transient_server_failure_timestamp"
            r3 = 0
            long r1 = r0.getLong(r5, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r6)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C17880vN.A1D(r0, r5, r1)
        L_0x0023:
            if (r8 == 0) goto L_0x008b
            X.2Zo r2 = r7.A04
            long r3 = r8.longValue()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r1 = "sync-manager/onRetryNeeded "
            X.C17900vP.A0m(r1, r0, r3)
            X.1To r5 = r2.A00
            r0 = 0
            X.C26811To.A02(r5, r0)
            boolean r0 = r5.A0S()
            if (r0 == 0) goto L_0x006d
            X.1Ta r2 = r5.A09
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = X.C17880vN.A0u(r0, r3)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r0 = 5
            X.C17890vO.A0r(r2, r1, r0)
            return
        L_0x0055:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0023
            java.lang.Integer r1 = X.C17880vN.A0h()
            r0 = 0
            r7.A06(r1, r0)
            return
        L_0x006a:
            if (r10 == 0) goto L_0x008b
            goto L_0x0023
        L_0x006d:
            monitor-enter(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "sync-manager/scheduleSync with delay "
            X.C17900vP.A0m(r0, r1, r3)     // Catch:{ all -> 0x0088 }
            X.10I r2 = r5.A0W     // Catch:{ all -> 0x0088 }
            r1 = 0
            X.2PE r0 = new X.2PE     // Catch:{ all -> 0x0088 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x0088 }
            X.25d r0 = r2.CGv(r0, r3)     // Catch:{ all -> 0x0088 }
            r5.A02 = r0     // Catch:{ all -> 0x0088 }
            monitor-exit(r5)     // Catch:{ all -> 0x0088 }
            return
        L_0x0088:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0088 }
            throw r0
        L_0x008b:
            r7.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63922tu.A01(X.2tu, java.lang.Long, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r4.contains(r5.A01) == true) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C63922tu r25, java.util.List r26) {
        /*
            r3 = r25
            X.0ve r2 = r3.A0H
            r1 = 11821(0x2e2d, float:1.6565E-41)
            X.0vf r0 = X.C18040vf.A02
            org.json.JSONObject r1 = X.C18020vd.A02(r0, r2, r1)
            java.lang.String r0 = "allowlist"
            org.json.JSONArray r5 = r1.optJSONArray(r0)
            if (r5 == 0) goto L_0x0032
            int r2 = r5.length()
            java.util.ArrayList r4 = X.C17880vN.A0z(r2)
            r1 = 0
        L_0x001d:
            if (r1 >= r2) goto L_0x0033
            java.lang.Object r0 = r5.get(r1)
            if (r0 == 0) goto L_0x002b
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x001d
        L_0x002b:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0032:
            r4 = 0
        L_0x0033:
            java.util.Iterator r17 = r26.iterator()
        L_0x0037:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x02c6
            java.lang.Object r5 = r17.next()
            X.2ec r5 = (X.C54732ec) r5
            if (r4 == 0) goto L_0x0265
            java.lang.String r0 = r5.A01
            boolean r0 = r4.contains(r0)
            r12 = 1
            if (r0 != r12) goto L_0x0265
        L_0x004e:
            r7 = 0
            X.C18070vi.A0d(r5, r7)
            java.lang.String r0 = r5.A01
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "SyncResponseHandler/handleIncomingPatches for collection="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "; size="
            r2.append(r1)
            java.util.List r6 = r5.A02
            int r1 = r6.size()
            r2.append(r1)
            java.lang.String r1 = "; hasMorePatch="
            r2.append(r1)
            boolean r10 = r5.A03
            X.C17900vP.A0r(r2, r10)
            X.11S r2 = r3.A00
            boolean r1 = r2.A0N()
            r25 = 0
            if (r1 == 0) goto L_0x009e
            X.1TS r1 = r3.A0F
            java.lang.Long r9 = r1.A01(r0)
            X.11Q r1 = r3.A0A
            android.content.SharedPreferences r8 = X.AnonymousClass11Q.A01(r1)
            java.lang.String r1 = "companion_syncd_critical_bootstrap_state"
            int r8 = r8.getInt(r1, r7)
            r1 = 1
            if (r8 == r1) goto L_0x0257
            r1 = 2
            if (r8 == r1) goto L_0x0257
            if (r9 != 0) goto L_0x009e
        L_0x009c:
            r25 = 1
        L_0x009e:
            X.8be r11 = r5.A00
            java.lang.String r9 = " with version: "
            if (r11 == 0) goto L_0x0191
            X.1TS r1 = r3.A0F
            java.lang.Long r1 = r1.A01(r0)
            r15 = 0
            if (r1 != 0) goto L_0x00b2
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
        L_0x00b2:
            long r13 = r1.longValue()
            boolean r1 = r2.A0N()
            if (r1 == 0) goto L_0x0293
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 != 0) goto L_0x0293
            X.11P r1 = r3.A0B
            long r22 = X.AnonymousClass11P.A01(r1)
            X.1Th r1 = r3.A03     // Catch:{ Exception -> 0x0284 }
            X.2KP r8 = new X.2KP     // Catch:{ Exception -> 0x0284 }
            r8.<init>(r1, r11, r0)     // Catch:{ Exception -> 0x0284 }
            r1 = 1
            X.C26741Th.A00(r8, r0, r1)     // Catch:{ Exception -> 0x0284 }
            java.io.File r2 = r8.A00     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
            byte[] r5 = X.AnonymousClass1EW.A00(r2)     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
            X.2BK r1 = X.AnonymousClass2BK.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
            X.Bm6 r5 = X.C23577Bm6.A07(r1, r5)     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
            X.2BK r5 = (X.AnonymousClass2BK) r5     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
            java.io.File r1 = r8.A01     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
            boolean r1 = r1.delete()     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
            if (r1 == 0) goto L_0x00ea
            r2.delete()     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
        L_0x00ea:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
            java.lang.String r1 = "external-mutations-downloader: downloaded snapshot= "
            X.C17900vP.A0Y(r5, r1, r2)     // Catch:{ 1PN -> 0x0268, IOException -> 0x0276 }
            X.C18070vi.A0X(r5)     // Catch:{ Exception -> 0x0284 }
            if (r25 == 0) goto L_0x0107
            X.1Tb r1 = r3.A02     // Catch:{ Exception -> 0x0284 }
            r20 = 0
            r24 = 1
            r18 = r1
            r19 = r11
            r21 = r0
            r18.A01(r19, r20, r21, r22, r24)     // Catch:{ Exception -> 0x0284 }
        L_0x0107:
            int r1 = r5.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x018c
            X.8Xv r1 = r5.version_
            r2 = r1
            if (r1 != 0) goto L_0x0114
            X.8Xv r1 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x0114:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x018c
            if (r2 != 0) goto L_0x011e
            X.8Xv r2 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x011e:
            long r1 = r2.version_
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r8 = "SyncResponseHandler/handleIncomingPatches applying snapshot for collection "
            r11.append(r8)
            r11.append(r0)
            X.C17900vP.A0m(r9, r11, r1)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            X.EE9 r8 = r5.records_
            java.util.Iterator r16 = r8.iterator()
        L_0x0139:
            boolean r8 = r16.hasNext()
            if (r8 == 0) goto L_0x0176
            java.lang.Object r14 = r16.next()
            X.2BG r14 = (X.AnonymousClass2BG) r14
            X.2B8 r8 = X.AnonymousClass2B8.DEFAULT_INSTANCE
            X.Bmt r15 = r8.A0N()
            X.2R4 r8 = X.AnonymousClass2R4.SET
            X.Bm6 r13 = X.C17880vN.A0G(r15)
            X.2B8 r13 = (X.AnonymousClass2B8) r13
            int r8 = r8.value
            r13.operation_ = r8
            int r8 = r13.bitField0_
            r8 = r8 | 1
            r13.bitField0_ = r8
            X.Bm6 r13 = X.C17880vN.A0G(r15)
            X.2B8 r13 = (X.AnonymousClass2B8) r13
            r14.getClass()
            r13.record_ = r14
            int r8 = r13.bitField0_
            r8 = r8 | 2
            r13.bitField0_ = r8
            X.Bm6 r8 = r15.A0C()
            r11.add(r8)
            goto L_0x0139
        L_0x0176:
            r19 = 0
            r23 = r1
            r26 = r12
            r20 = r5
            r21 = r0
            r22 = r11
            r18 = r3
            boolean r1 = r18.A05(r19, r20, r21, r22, r23, r25, r26)
            if (r1 != 0) goto L_0x0191
            goto L_0x0037
        L_0x018c:
            java.lang.String r1 = "SyncResponseHandler/handleIncomingPatches snapshot has no version, cannot apply"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0191:
            java.util.Iterator r15 = r6.iterator()
        L_0x0195:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x024e
            java.lang.Object r8 = r15.next()
            X.2BT r8 = (X.AnonymousClass2BT) r8
            int r1 = r8.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0247
            X.8Xv r1 = r8.version_
            r2 = r1
            if (r1 != 0) goto L_0x01ae
            X.8Xv r1 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x01ae:
            int r1 = r1.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0247
            if (r2 != 0) goto L_0x01b8
            X.8Xv r2 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x01b8:
            long r5 = r2.version_
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "SyncResponseHandler/handleIncomingPatches applying patch for collection "
            r2.append(r1)
            r2.append(r0)
            X.C17900vP.A0m(r9, r2, r5)
            X.11P r1 = r3.A0B
            long r22 = X.AnonymousClass11P.A01(r1)
            int r1 = r8.bitField0_     // Catch:{ Exception -> 0x02b6 }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x020d
            X.1Th r2 = r3.A03     // Catch:{ Exception -> 0x02b6 }
            X.8be r1 = r8.externalMutations_     // Catch:{ Exception -> 0x02b6 }
            if (r1 != 0) goto L_0x01dd
            X.8be r1 = X.C165718be.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x02b6 }
        L_0x01dd:
            X.2KP r11 = new X.2KP     // Catch:{ Exception -> 0x02b6 }
            r11.<init>(r2, r1, r0)     // Catch:{ Exception -> 0x02b6 }
            X.C26741Th.A00(r11, r0, r7)     // Catch:{ Exception -> 0x02b6 }
            java.io.File r13 = r11.A00     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
            byte[] r2 = X.AnonymousClass1EW.A00(r13)     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
            X.2B4 r1 = X.AnonymousClass2B4.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
            X.Bm6 r1 = X.C23577Bm6.A07(r1, r2)     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
            X.2B4 r1 = (X.AnonymousClass2B4) r1     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
            java.io.File r2 = r11.A01     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
            boolean r2 = r2.delete()     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
            if (r2 == 0) goto L_0x01fe
            r13.delete()     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
        L_0x01fe:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
            java.lang.String r2 = "external-mutations-downloader: downloaded mutations= "
            X.C17900vP.A0Y(r1, r2, r11)     // Catch:{ 1PN -> 0x029a, IOException -> 0x02a8 }
            X.EE9 r11 = r1.mutations_     // Catch:{ Exception -> 0x02b6 }
            X.C18070vi.A0b(r11)     // Catch:{ Exception -> 0x02b6 }
            goto L_0x0212
        L_0x020d:
            X.EE9 r11 = r8.mutations_     // Catch:{ Exception -> 0x02b6 }
            X.C18070vi.A0b(r11)     // Catch:{ Exception -> 0x02b6 }
        L_0x0212:
            if (r25 == 0) goto L_0x0223
            X.1Tb r1 = r3.A02     // Catch:{ Exception -> 0x02b6 }
            r24 = 1
            r19 = 0
            r18 = r1
            r20 = r8
            r21 = r0
            r18.A01(r19, r20, r21, r22, r24)     // Catch:{ Exception -> 0x02b6 }
        L_0x0223:
            X.1Rw r13 = r3.A05
            int r1 = r11.size()
            long r1 = (long) r1
            X.1Pw r14 = r13.A03
            java.lang.String r13 = "mutation_counter"
            r14.A06(r13, r1)
            r20 = 0
            r23 = r5
            r26 = r12
            r21 = r0
            r22 = r11
            r18 = r3
            r19 = r8
            boolean r1 = r18.A05(r19, r20, r21, r22, r23, r25, r26)
            if (r1 != 0) goto L_0x0195
            goto L_0x0037
        L_0x0247:
            java.lang.String r1 = "SyncResponseHandler/handleIncomingPatches incoming patch has no version. Cannot apply."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0195
        L_0x024e:
            if (r10 != 0) goto L_0x0037
            X.1TS r1 = r3.A0F
            r1.A03(r0)
            goto L_0x0037
        L_0x0257:
            if (r9 == 0) goto L_0x009c
            r13 = 0
            long r8 = r9.longValue()
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x009e
            goto L_0x009c
        L_0x0265:
            r12 = 0
            goto L_0x004e
        L_0x0268:
            r2 = move-exception
            java.lang.String r1 = "external-mutations-downloader/failed to parse snapshot into ProtoBuf"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x0284 }
            r1 = 70
            X.1Tq r2 = new X.1Tq     // Catch:{ Exception -> 0x0284 }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x0284 }
            goto L_0x0283
        L_0x0276:
            r4 = move-exception
            java.lang.String r1 = "external-mutations-downloader/failed to read snapshot"
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ Exception -> 0x0284 }
            java.lang.String r1 = "Failed to read snapshot from file"
            X.2E0 r2 = new X.2E0     // Catch:{ Exception -> 0x0284 }
            r2.<init>(r1, r4)     // Catch:{ Exception -> 0x0284 }
        L_0x0283:
            throw r2     // Catch:{ Exception -> 0x0284 }
        L_0x0284:
            r2 = move-exception
            if (r25 == 0) goto L_0x02c5
            X.1Tb r10 = r3.A02
            r12 = 0
            r14 = r22
            r16 = r7
            r13 = r0
            r10.A01(r11, r12, r13, r14, r16)
            throw r2
        L_0x0293:
            java.lang.String r0 = "Only companion devices that are undergoing bootstrap should receive and handle snapshots."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x029a:
            r2 = move-exception
            java.lang.String r1 = "external-mutations-downloader/failed to parse mutations into ProtoBuf"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x02b6 }
            r1 = 26
            X.1Tq r2 = new X.1Tq     // Catch:{ Exception -> 0x02b6 }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x02b6 }
            goto L_0x02b5
        L_0x02a8:
            r4 = move-exception
            java.lang.String r1 = "external-mutations-downloader/failed to read mutations"
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r1 = "Failed to read mutations from file"
            X.2E0 r2 = new X.2E0     // Catch:{ Exception -> 0x02b6 }
            r2.<init>(r1, r4)     // Catch:{ Exception -> 0x02b6 }
        L_0x02b5:
            throw r2     // Catch:{ Exception -> 0x02b6 }
        L_0x02b6:
            r2 = move-exception
            if (r25 == 0) goto L_0x02c5
            X.1Tb r1 = r3.A02
            r10 = 0
            r9 = r1
            r11 = r8
            r12 = r0
            r13 = r22
            r15 = r7
            r9.A01(r10, r11, r12, r13, r15)
        L_0x02c5:
            throw r2
        L_0x02c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63922tu.A02(X.2tu, java.util.List):void");
    }

    private final void A04(AnonymousClass2E2 r10, String str, int i) {
        this.A0J.A0G("malformed_syncd_mutation", r10.getMessage(), false);
        this.A05.A03.A06("invalid_action_counter", 1);
        throw new C26831Tq((C59372mC) null, (C19999A2n) null, str, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, i);
    }

    private final void A03(AnonymousClass2E2 r8, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncResponseHandler/handleMutationException failed with MutationException, collectionName: ");
        A10.append(str);
        A10.append(", reason: ");
        A10.append(r8.reason);
        C17880vN.A1M(A10, r8);
        int i = r8.reason;
        if (i == 0) {
            A04(r8, str, 19);
        } else if (i == 1) {
            A04(r8, str, 21);
        } else if (i == 2) {
            A04(r8, str, 23);
        } else if (i == 3) {
            A04(r8, str, 24);
        } else if (i == 4) {
            A04(r8, str, 22);
        } else if (i == 6) {
            this.A05.A03.A06("unsupported_action_counter", 1);
            return;
        } else if (i == 7) {
            A04(r8, str, 25);
        } else {
            throw AnonymousClass000.A0n(AnonymousClass001.A1I("Unhandled MutationException with reason: ", AnonymousClass000.A10(), i));
        }
        throw null;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.231, X.23H, X.206] */
    public final void A06(Integer num, String str) {
        String str2;
        String str3;
        String str4;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncResponseHandler/fatalFailure reason: ");
        if (num != null) {
            str2 = C17900vP.A08(Integer.valueOf(num.intValue()));
        } else {
            str2 = null;
        }
        C17890vO.A19(A10, str2);
        AnonymousClass190 r3 = this.A0J;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("errorCode:");
        A102.append(num);
        r3.A0G("app-sate-sync-handle-fatal-exception", AnonymousClass001.A1H("; collectionName:", str, A102), false);
        if (num != null) {
            C26371Rw r32 = this.A05;
            int intValue = num.intValue();
            AnonymousClass2FU r1 = new AnonymousClass2FU();
            r1.A02 = Integer.valueOf(intValue);
            r1.A01 = C26371Rw.A03(str);
            r1.A00 = true;
            r32.A08.CC7(r1);
        }
        this.A0I.A02();
        C17880vN.A1B(C25851Pw.A00(this.A06).edit(), "first_transient_server_failure_timestamp");
        C51772Zo r2 = this.A04;
        C17900vP.A0f("sync-manager/onFatalFailure for collection ", str, AnonymousClass000.A10());
        C26811To r33 = r2.A00;
        C17890vO.A0r(r33.A09, new Exception(AnonymousClass001.A1H("Fatal Exception: ", str, AnonymousClass000.A10())), 5);
        C26811To.A02(r33, false);
        C17880vN.A0V(r33.A0b).notifyAllObservers(new C20735AWq(22));
        synchronized (r33) {
            r33.A01 = null;
        }
        if (!r33.A07.A0N()) {
            r33.A0K(1);
            return;
        }
        C26731Tg r4 = r33.A0B;
        AnonymousClass11S r22 = r4.A00;
        C17960vV.A0G(r22.A0N(), "method should only be called by a device in companion mode");
        AnonymousClass11Q r7 = r4.A03;
        C17880vN.A1F(AnonymousClass11Q.A00(r7), "companion_syncd_dirty", true);
        PhoneUserJid A002 = AnonymousClass11S.A00(r22);
        if (A002 == null) {
            str4 = "CompanionSyncdFatalHandler/my user jid is null.";
        } else {
            try {
                DeviceJid A032 = DeviceJid.Companion.A03(A002, 0);
                AnonymousClass205 A012 = r4.A06.A01(A002, true);
                AnonymousClass11P r23 = r4.A04;
                long A013 = AnonymousClass11P.A01(r23);
                Set singleton = Collections.singleton(str);
                long A014 = AnonymousClass11P.A01(r23);
                ? r8 = new AnonymousClass206(A012, 50, A013);
                r8.A01 = singleton;
                r8.A00 = A014;
                r8.A00 = A032;
                if (r4.A05.A01(r8) < 0) {
                    str4 = "CompanionSyncdFatalHandler/failed to add peer message";
                } else {
                    r4.A01.A01(new SendPeerMessageJob(A032, r8));
                    SystemClock.sleep(5000);
                    int A003 = C17890vO.A00(AnonymousClass11Q.A01(r7), "companion_syncd_critical_bootstrap_state");
                    boolean z = true;
                    if (!(A003 == 1 || A003 == 2)) {
                        z = false;
                    }
                    C26721Tf r12 = r4.A02;
                    if (z) {
                        str3 = "syncd_error_during_bootstrap";
                    } else {
                        str3 = "syncd_failure";
                    }
                    r12.A02(str3, true, true);
                    return;
                }
            } catch (AnonymousClass11T unused) {
                Log.e("CompanionSyncdFatalHandler/cannot get primary device jid.");
                return;
            }
        }
        Log.e(str4);
    }

    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r12v2, types: [X.EAO, byte[], java.lang.Object, X.1Di] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r48v0, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ba, code lost:
        if ((r0.bitField0_ & 1) == 0) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01bd, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations missing patch key");
        r7 = new X.C26831Tq((X.C59372mC) null, (X.C19999A2n) null, r57, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 56);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d2, code lost:
        if (r60 == null) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d8, code lost:
        if ((r4.bitField0_ & 4) == 0) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01da, code lost:
        r0 = r4.keyId_;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01dd, code lost:
        if (r0 != null) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01df, code lost:
        r0 = X.C164148Xs.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e5, code lost:
        if ((r0.bitField0_ & 1) == 0) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e7, code lost:
        if (r1 != null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ea, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations missing snapshot key");
        r7 = new X.C26831Tq((X.C59372mC) null, (X.C19999A2n) null, r57, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 59);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ff, code lost:
        r24 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0202, code lost:
        r1 = X.C164148Xs.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0204, code lost:
        r0 = r1.id_.A06();
        X.C18070vi.A0X(r0);
        r1 = new X.C19999A2n(r0);
        r10.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0217, code lost:
        r25 = r5.A09.A07(r57, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0225, code lost:
        if (r25.containsValue((java.lang.Object) null) == false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0227, code lost:
        com.whatsapp.util.Log.i("SyncResponseHandler/applyMutations keyMap contains null value, retry");
        r44 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022e, code lost:
        if (r60 == null) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0230, code lost:
        r44 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0232, code lost:
        if (r59 == null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0234, code lost:
        r34 = X.C17880vN.A0n(r2.A0J((X.EAO) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x023d, code lost:
        r34 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023f, code lost:
        if (r60 == null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0241, code lost:
        r35 = X.C17880vN.A0n(r4.A0J((X.EAO) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x024a, code lost:
        r35 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x024c, code lost:
        if (r59 == null) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x024e, code lost:
        r0 = r2.patchMac_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0250, code lost:
        if (r0 == null) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0252, code lost:
        r39 = r0.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0257, code lost:
        r39 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0259, code lost:
        if (r60 == null) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x025b, code lost:
        r0 = r4.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x025d, code lost:
        if (r0 != null) goto L_0x0b74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x025f, code lost:
        r0 = X.C164178Xv.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0261, code lost:
        if (r0 == null) goto L_0x0b7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0265, code lost:
        if (r59 == null) goto L_0x0b7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0269, code lost:
        r0 = r25.get(r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0273, code lost:
        if (r0 == null) goto L_0x0ca7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0275, code lost:
        r0 = (X.C59062lh) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0277, code lost:
        if (r59 == null) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0279, code lost:
        r11 = r5.A08;
        X.C18070vi.A0d(r0, 2);
        r1 = r2.bitField0_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0285, code lost:
        if ((r1 & 8) == 0) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0289, code lost:
        if ((r1 & 4) == 0) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r1 = r2.patchMac_.A06();
        r39 = r2.snapshotMac_.A06();
        r8 = new X.AnonymousClass1b4(X.AnonymousClass1b2.A0C(X.C71923Iw.A00, X.AnonymousClass1b2.A0B(X.C29431cG.A0V(r34))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02ae, code lost:
        if (r8.hasNext() != false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02b0, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02b2, code lost:
        r10 = r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02ba, code lost:
        if (r8.hasNext() == false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02bc, code lost:
        r10 = X.C200310o.A0A((byte[]) r10, (byte[]) r8.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02c9, code lost:
        r10 = (byte[]) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02cb, code lost:
        if (r10 != null) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02cd, code lost:
        r10 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02cf, code lost:
        r13 = r11.A08;
        r7 = r2.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02d3, code lost:
        if (r7 != null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02d5, code lost:
        r7 = X.C164178Xv.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02d7, code lost:
        r7 = r7.version_;
        X.C18070vi.A0b(r39);
        r7 = r13.BDu(r0, r57, r10, r39, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ee, code lost:
        if (java.util.Arrays.equals(r1, r7) == false) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02f0, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validatePatchMac/patch mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02f7, code lost:
        r8 = r2.clientDebugData_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02f9, code lost:
        if (r8 == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r10 = (X.AnonymousClass2BU) X.C23577Bm6.A02(r8, X.AnonymousClass2BU.DEFAULT_INSTANCE);
        X.C18070vi.A0X(r10);
        r8 = new java.io.Serializable[4];
        r8[0] = r10.collectionName_;
        r8[1] = java.lang.Boolean.valueOf(r10.isSenderPrimary_);
        r13 = X.AnonymousClass2RF.A00(r10.senderPlatform_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x031b, code lost:
        if (r13 != null) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x031d, code lost:
        r13 = X.AnonymousClass2RF.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x031f, code lost:
        r8[2] = r13;
        r10 = X.C18070vi.A0O(r10.patchVersion_, r8, 3);
        r8 = X.AnonymousClass000.A10();
        r8.append("D:");
        r10 = X.AnonymousClass000.A0y(X.C29431cG.A0h(";", r10, (X.C22821Di) null), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x033d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/getLoggingStringForPatch: ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0343, code lost:
        r10 = "D:null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0345, code lost:
        X.C17900vP.A0e("SyncEncryptionHelper/validatePatchMac/patch mac mismatch: ", r10, X.AnonymousClass000.A10());
        r11.A00.A0G("mac-mismatch-patch", r10, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036e, code lost:
        throw new X.C26831Tq(r0.A00, r0.A01, r57, (byte[]) null, r7, (byte[]) null, r1, 34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x036f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchIntegrity: ", r1);
        r7 = new X.C26831Tq(r0.A00, r0.A01, r57, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0387, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0388, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchIntegrity: ", r1);
        r7 = new X.C26831Tq(r0.A00, r0.A01, r57, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x039f, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/No snapshot mac");
        r7 = new X.C26831Tq(r0.A00, r0.A01, r57, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b8, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/No patch mac");
        r7 = new X.C26831Tq(r0.A00, r0.A01, r57, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03d1, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03d4, code lost:
        r8 = r2.patchMac_.A06();
        X.C18070vi.A0X(r8);
        r1 = new X.C59322m7(r8, r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03e4, code lost:
        r8 = X.C17880vN.A14();
        r36 = X.C17880vN.A14();
        r7 = X.C17880vN.A14();
        r35 = X.AnonymousClass000.A13();
        r32 = X.AnonymousClass000.A13();
        r31 = X.AnonymousClass000.A13();
        r33 = X.AnonymousClass000.A13();
        r14 = X.C17880vN.A13();
        r16 = r34.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0463, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x047e, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04e3, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04e5, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04ea, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04f9, code lost:
        r8.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations", r0);
        r31 = new X.C26831Tq(r1.A00, r15, r57, r12, r12, r12, r12, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x051d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations", r0);
        r31 = new X.C26831Tq(r1.A00, r15, r57, r12, r12, r12, r12, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x053c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations", r0);
        r31 = new X.C26831Tq(r1.A00, r15, r57, r12, r12, r12, r12, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x055b, code lost:
        r6 = r5.A0H;
        r1 = X.C18040vf.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0565, code lost:
        if (X.C18020vd.A05(r1, r6, 624) == false) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0567, code lost:
        r13 = X.AnonymousClass000.A10();
        r13.append("SyncResponseHandler/applyMutations:\n             REMOVE mutations: \n             ");
        r13.append(X.C29431cG.A0g("\n", "", "", r32, r12));
        r13.append("\n             ");
        r13.append(X.C29431cG.A0g("\n", "", "", r31, r12));
        r13.append("\n             SET mutations: \n             ");
        r13.append(X.C29431cG.A0g("\n", "", "", r35, r12));
        X.AnonymousClass1Y7.A01(X.AnonymousClass000.A0y("\n          ", r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a2, code lost:
        r11 = X.AnonymousClass000.A13();
        r11.addAll(r8);
        r11.addAll(r36);
        r11.addAll(r7);
        r8.size();
        r36.size();
        r7.size();
        r10 = r5.A08;
        r8 = X.C17890vO.A1b(r11, 0);
        X.C18070vi.A0d(r8, 2);
        r7 = X.AnonymousClass000.A13();
        r14 = X.AnonymousClass000.A13();
        r13 = new X.C147047Rp(X.AnonymousClass1b2.A09(X.C71903Iu.A00, X.AnonymousClass1b2.A0B(new X.C99434so(r34, 4))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05e9, code lost:
        if (r13.hasNext() == false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05eb, code lost:
        r11 = (X.C55322fa) r13.next();
        r7.add(r11.A04);
        r14.add(r11.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05fc, code lost:
        r6 = r57;
        r13 = r10.A09.A07(r6);
        r11 = r10.A0A.A0E(r6, r8);
        r6 = r10.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0610, code lost:
        if (X.C18020vd.A05(r1, r6, 624) == false) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0612, code lost:
        X.C18070vi.A0X(java.util.Arrays.toString(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0619, code lost:
        new java.util.LinkedHashSet();
        r8 = X.C29431cG.A0t(r11.values());
        r9 = X.AnonymousClass1TR.A0E;
        r11 = X.AnonymousClass2TC.A00(r8, r13, r9, false);
        X.C18070vi.A0X(r11);
        r42 = X.AnonymousClass2TC.A00(r7, r11, r9, true);
        X.C18070vi.A0X(r42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0638, code lost:
        if (r59 == null) goto L_0x071b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x063a, code lost:
        X.C18070vi.A0d(r0, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0644, code lost:
        if ((r2.bitField0_ & 4) == 0) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0646, code lost:
        r8 = r2.snapshotMac_.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        r11 = r10.A08;
        r7 = r2.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0650, code lost:
        if (r7 != null) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0652, code lost:
        r7 = X.C164178Xv.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0654, code lost:
        r7 = r11.BDz(r0, r57, r42, r7.version_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0668, code lost:
        if (java.util.Arrays.equals(r8, r7) != false) goto L_0x06dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x066a, code lost:
        com.whatsapp.util.Log.w("SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch but do not throw fatal");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0675, code lost:
        if (X.C18020vd.A05(r1, r6, 1783) == false) goto L_0x067e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0677, code lost:
        X.AnonymousClass1TR.A01(r10, r57, 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x067e, code lost:
        r10 = r10.A05;
        r11 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0694, code lost:
        if (((1 << X.AnonymousClass1TV.A00(r57)) & X.C25851Pw.A00(r11).getInt("syncd_has_logged_snapshot_mac_mismatch_in_patch", 0)) != 0) goto L_0x06d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0696, code lost:
        X.C17880vN.A1C(X.C25851Pw.A00(r11).edit(), "syncd_has_logged_snapshot_mac_mismatch_in_patch", (1 << X.AnonymousClass1TV.A00(r57)) | X.C25851Pw.A00(r11).getInt("syncd_has_logged_snapshot_mac_mismatch_in_patch", 0));
        r10 = r10.A00;
        r6 = new X.AnonymousClass2FU();
        r6.A02 = 60;
        r6.A01 = X.C26371Rw.A03(r57);
        r6.A00 = false;
        r10.A08.CC7(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06d0, code lost:
        X.C18070vi.A0b(r8);
        r1 = new X.C59322m7(r8, r7, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06dc, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        X.C18070vi.A0b(r8);
        r1 = new X.C59322m7(r8, r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06ec, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r0);
        r7 = new X.C26831Tq(r12, r12, r57, r12, r12, r12, r12, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0700, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r0);
        r7 = new X.C26831Tq(r12, r12, r57, r12, r12, r12, r12, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0713, code lost:
        r1 = X.AnonymousClass000.A0n("Check failed.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x071b, code lost:
        if (r60 == null) goto L_0x07ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x071d, code lost:
        X.C18070vi.A0d(r0, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0727, code lost:
        if ((r4.bitField0_ & 2) == 0) goto L_0x07a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0729, code lost:
        r6 = r4.mac_.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        r9 = r10.A08;
        r7 = r4.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0733, code lost:
        if (r7 != null) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0735, code lost:
        r7 = X.C164178Xv.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0737, code lost:
        r7 = r9.BDz(r0, r57, r42, r7.version_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x074b, code lost:
        if (java.util.Arrays.equals(r6, r7) == false) goto L_0x0753;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x074d, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0753, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0771, code lost:
        throw new X.C26831Tq(r0.A00, r0.A01, r57, r42, r12, r7, r6, 61);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0772, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r3);
        r7 = new X.C26831Tq(r0.A00, r0.A01, r57, r42, r12, r12, r6, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x078b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x078c, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r3);
        r7 = new X.C26831Tq(r0.A00, r0.A01, r57, r42, r12, r12, r6, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x07a4, code lost:
        r1 = X.AnonymousClass000.A0n("Check failed.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x07ac, code lost:
        r1 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x07ae, code lost:
        X.C18070vi.A0b(r6);
        r1 = new X.C59322m7(r6, r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x07ba, code lost:
        if (X.C17880vN.A1X(r32) == false) goto L_0x080c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x07bc, code lost:
        r11 = r5.A0G.A00.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        r10 = r11.BD0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:?, code lost:
        r8 = ((X.C28801av) r11).A02;
        r7 = X.C17880vN.A14();
        r9 = r32.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07d9, code lost:
        if (r9.hasNext() == false) goto L_0x07e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07db, code lost:
        r7.add(((X.A6U) r9.next()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07e7, code lost:
        X.C26331Rs.A07(r8, (java.lang.String[]) r7.toArray(X.C20068A5s.A00));
        r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07f9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0803, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x080c, code lost:
        r34 = X.AnonymousClass000.A13();
        r9 = r31.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0818, code lost:
        if (r9.hasNext() == false) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x081a, code lost:
        r8 = (X.A6U) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0828, code lost:
        if (r36.contains(r8.A04) != false) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x082a, code lost:
        r34.add(r19.A02(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0836, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:?, code lost:
        A03(r7, r57);
        r33.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0842, code lost:
        r8 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x084a, code lost:
        if (r8.hasNext() == false) goto L_0x086a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        r34.add(r19.A02((X.A6U) r8.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x085e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        A03(r7, r57);
        r33.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        r35 = r5.A05;
        r6 = X.C61082p6.A00;
        r11 = new X.C61882qR();
        r9 = r34.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x087d, code lost:
        if (r9.hasNext() == false) goto L_0x088f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x087f, code lost:
        r7 = r9.next();
        r6 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0889, code lost:
        if (r6.containsKey(r7) != false) goto L_0x0879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x088b, code lost:
        r6.put(r7, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x088f, code lost:
        r32 = r34.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0897, code lost:
        if (r32.hasNext() == false) goto L_0x092f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0899, code lost:
        r10 = (X.C20126A8l) r32.next();
        r9 = (java.util.List) X.C61082p6.A00.get(r10.A0B());
        r8 = (java.util.List) X.C61082p6.A01.get(r10.A0B());
        r31 = r34.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08bf, code lost:
        if (r31.hasNext() == false) goto L_0x0893;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08c1, code lost:
        r7 = (X.C20126A8l) r31.next();
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08c9, code lost:
        if (r9 == null) goto L_0x08f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08d3, code lost:
        if (r9.contains(r7.A0B()) == false) goto L_0x08f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08d5, code lost:
        r6 = X.C61082p6.A00(r7);
        r15 = r6.first;
        r6 = (X.AnonymousClass205) r6.second;
        r13 = X.C61082p6.A00(r10);
        r14 = r13.first;
        r13 = r13.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08eb, code lost:
        if (X.C42171xk.A00(r15, r14) == false) goto L_0x08f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08ed, code lost:
        if (r6 == null) goto L_0x08fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x08ef, code lost:
        if (r13 == null) goto L_0x08fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x08f5, code lost:
        if (r6.equals(r13) == false) goto L_0x08f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08f8, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x08fa, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x08fb, code lost:
        if (r8 == null) goto L_0x0908;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0905, code lost:
        if (r8.contains(r7.A0B()) == false) goto L_0x0908;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0908, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x090a, code lost:
        if (r7 == r10) goto L_0x08bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x090c, code lost:
        if (r13 != false) goto L_0x0910;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x090e, code lost:
        if (r16 == false) goto L_0x08bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0916, code lost:
        if (r7.A04 >= r10.A04) goto L_0x091d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0918, code lost:
        r6 = r11.A01(r10, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x091d, code lost:
        r6 = r11.A01(r7, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0921, code lost:
        if (r6 == false) goto L_0x08bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0923, code lost:
        r35.A03.A06("cross_index_conflict_counter", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x092f, code lost:
        r13 = X.AnonymousClass000.A13();
        r10 = X.C17880vN.A12();
        r9 = r11.A00;
        r8 = r9.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x093e, code lost:
        if (r7 >= r8) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0940, code lost:
        X.C61882qR.A00(r11, r9.A04(r7), r13, r10);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x094a, code lost:
        r13 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0952, code lost:
        if (r13.hasNext() == false) goto L_0x0a39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:?, code lost:
        r6 = (X.C20126A8l) r13.next();
        X.C18070vi.A0b(r6);
        X.C18070vi.A0d(r6, 0);
        r8 = ((X.C58862lN) r19.A03.get()).A00(r6.A0B());
        X.C17960vV.A07(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0975, code lost:
        if (r8 == null) goto L_0x0986;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:?, code lost:
        r8.A0I(r6, r19.A01.A09(r6.A0A()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:?, code lost:
        r19.A04(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x098b, code lost:
        if (r59 == null) goto L_0x0991;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x098d, code lost:
        r55 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x098f, code lost:
        if (r60 == null) goto L_0x0993;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0991, code lost:
        r55 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0993, code lost:
        r8 = r6.A00;
        r7 = (X.C59062lh) r25.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x099d, code lost:
        if (r7 == null) goto L_0x09a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        r11 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x09a2, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:?, code lost:
        r10 = r6.A05;
        r51 = r6.A0B();
        r9 = r6.A01;
        r7 = r6.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x09af, code lost:
        if (r7 == null) goto L_0x09b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:?, code lost:
        r49 = X.C17880vN.A0n(r7.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x09b7, code lost:
        r49 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x09b9, code lost:
        if (r55 == 0) goto L_0x09be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x09bb, code lost:
        if (r59 == null) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x09be, code lost:
        if (r60 == null) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x09c0, code lost:
        r7 = r4.mac_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x09c2, code lost:
        if (r7 == null) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x09c5, code lost:
        r7 = r2.patchMac_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x09c7, code lost:
        if (r7 == null) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x09c9, code lost:
        r53 = r7.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x09ce, code lost:
        r53 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:?, code lost:
        r48 = r12;
        r30.add(new X.C59862n0(r10, r11, r8, r48, r49, r57, r51, r9, r53, 0, r55));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x09ec, code lost:
        if ((r6 instanceof X.AnonymousClass8q1) == false) goto L_0x09fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x09ee, code lost:
        r6 = (X.AnonymousClass8q1) r6;
        r8 = r6.A00;
        r7 = r5.A01;
        r45 = r6.getChatJid();
        r50 = r8 ^ 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x09fd, code lost:
        if ((r6 instanceof X.C170458pt) == false) goto L_0x0a12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x09ff, code lost:
        r6 = (X.C170458pt) r6;
        r8 = r6.A01;
        r7 = r5.A01;
        r45 = r6.getChatJid();
        r50 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a0b, code lost:
        if (r8 == false) goto L_0x0a0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a0d, code lost:
        r50 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0a0f, code lost:
        r49 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0a14, code lost:
        if ((r6 instanceof X.C170518pz) == false) goto L_0x094e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0a16, code lost:
        r7 = r5.A01;
        r45 = ((X.C170598qH) r6).getChatJid();
        r49 = 5;
        r50 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0a22, code lost:
        r7.A03(r45, r12, r12, r48, r49, r50, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0a33, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a36, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:?, code lost:
        r25 = r33.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0a41, code lost:
        if (r25.hasNext() == false) goto L_0x0afa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0a43, code lost:
        r9 = (X.AnonymousClass2E2) r25.next();
        r6 = r9.reason;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0a4c, code lost:
        if (6 != r6) goto L_0x0ae9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0a4e, code lost:
        r8 = r5.A0G;
        r14 = r9.version;
        r10 = r9.operation;
        r7 = r9.index;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0a56, code lost:
        if (r7 == null) goto L_0x0ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0a58, code lost:
        r13 = r9.mutationMac;
        r6 = r9.syncdKeyId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0a5c, code lost:
        if (r6 == null) goto L_0x0add;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0a5e, code lost:
        r11 = r9.syncActionValue;
        r16 = r8.A00.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:?, code lost:
        r15 = r16.BD0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0a6c, code lost:
        if (r10 != X.C62382rJ.A02) goto L_0x0a94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a6e, code lost:
        r9 = ((X.C28801av) r16).A02;
        r8 = X.AnonymousClass000.A10();
        r8.append("DELETE FROM syncd_mutations WHERE mutation_index IN ");
        r9.A0F(X.AnonymousClass000.A0y(X.AnonymousClass1H2.A00(1), r8), "SyncdMutationsStore.addUnsupportedMutation", new java.lang.String[]{r7});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a90, code lost:
        r15.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a96, code lost:
        if (r10 != X.C62382rJ.A03) goto L_0x0a90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0a98, code lost:
        r9 = ((X.C28801av) r16).A02;
        X.C17960vV.A07(r11);
        X.C26331Rs.A04(r9, r8, r6, r12, r7, r57, X.A4M.A00(r7), r11.A0M(), r13, r14, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0ac7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0acc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0ad1, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0ad7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0add, code lost:
        r1 = X.AnonymousClass000.A0n("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0ae3, code lost:
        r1 = X.AnonymousClass000.A0n("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0ae9, code lost:
        r1 = X.AnonymousClass000.A0n(X.AnonymousClass001.A1I("unexpected reason=", X.AnonymousClass000.A10(), r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0afa, code lost:
        r9 = r0.A00;
        r44 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0afe, code lost:
        if (r60 == null) goto L_0x0b02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0b00, code lost:
        r44 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0b02, code lost:
        if (r59 == null) goto L_0x0b0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0b04, code lost:
        r34 = X.C17880vN.A0n(r2.A0J(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0b0d, code lost:
        r34 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0b0f, code lost:
        if (r60 == null) goto L_0x0b1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0b11, code lost:
        r35 = X.C17880vN.A0n(r4.A0J(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0b1a, code lost:
        r35 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0b1c, code lost:
        if (r20 == null) goto L_0x0b23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0b1e, code lost:
        r8 = r20.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0b23, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0b24, code lost:
        if (r1 == null) goto L_0x0b2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0b26, code lost:
        r3 = r1.A01;
        r0 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0b2b, code lost:
        r3 = r12;
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0b2d, code lost:
        if (r60 == null) goto L_0x0b38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0b2f, code lost:
        r6 = r4.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0b31, code lost:
        if (r6 != null) goto L_0x0b42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b33, code lost:
        r6 = X.C164178Xv.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0b35, code lost:
        if (r6 == null) goto L_0x0b49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0b38, code lost:
        if (r59 == null) goto L_0x0b49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b3a, code lost:
        r6 = r2.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0b3c, code lost:
        if (r6 != null) goto L_0x0b42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b3e, code lost:
        r6 = X.C164178Xv.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b40, code lost:
        if (r6 == null) goto L_0x0b49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b42, code lost:
        r36 = java.lang.Long.valueOf(r6.version_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0b49, code lost:
        r36 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b4b, code lost:
        if (r1 == null) goto L_0x0b55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b51, code lost:
        if (r1.A00 != true) goto L_0x0b55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b53, code lost:
        r12 = "error: client_error message: 60 snapshot_mac_mismatch_in_patch";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b55, code lost:
        r1 = false;
        r31 = new X.C59892n3(r9, r24, r34, r35, r36, r57, r12, r8, r3, r0, r42, 0, r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b6c, code lost:
        r0 = r2.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0b6e, code lost:
        if (r0 != null) goto L_0x0b74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0b70, code lost:
        r0 = X.C164178Xv.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b72, code lost:
        if (r0 == null) goto L_0x0b7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0b74, code lost:
        r12 = java.lang.Long.valueOf(r0.version_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0b7a, code lost:
        r1 = false;
        r31 = new X.C59892n3((X.C59372mC) null, r24, r34, r35, r12, r57, "error: client_error message: keyMap contains null value, retry", r39, (byte[]) null, (byte[]) null, (byte[]) null, 0, r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b94, code lost:
        r8 = r6.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0b96, code lost:
        if (r8 != null) goto L_0x0ba3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0b98, code lost:
        r28.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:?, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:?, code lost:
        r29.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0ba2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0ba3, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:?, code lost:
        r56.A05(r57, r8, r26);
        r28.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0bb0, code lost:
        if (r65 == false) goto L_0x0c4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0bb2, code lost:
        r3 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0bb4, code lost:
        if (r60 == null) goto L_0x0bb7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0bb6, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0bb7, code lost:
        r1 = new X.AnonymousClass2H1();
        r8 = 1;
        r1.A05 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0bcb, code lost:
        if (X.C20126A8l.A09.contains(r57) != false) goto L_0x0bce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0bcd, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0bce, code lost:
        r1.A04 = java.lang.Integer.valueOf(r8);
        r1.A0A = X.C26681Tb.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0bde, code lost:
        switch(r57.hashCode()) {
            case -849492943: goto L_0x0c15;
            case -564602779: goto L_0x0c0a;
            case -498584183: goto L_0x0bff;
            case 207170541: goto L_0x0bf4;
            case 1086463900: goto L_0x0be9;
            default: goto L_0x0be1;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0be1, code lost:
        r1 = X.AnonymousClass000.A0k("CompanionSyncStatsLogger/convertToWamCollection received undefined collection name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0bf1, code lost:
        if (r57.equals("regular") == false) goto L_0x0be1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0bfc, code lost:
        if (r57.equals("critical_block") == false) goto L_0x0be1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c07, code lost:
        if (r57.equals("critical_unblock_low") == false) goto L_0x0be1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c12, code lost:
        if (r57.equals("regular_high") == false) goto L_0x0be1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0c1d, code lost:
        if (r57.equals("regular_low") == false) goto L_0x0be1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0c20, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0c22, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0c24, code lost:
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0c26, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0c28, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0c29, code lost:
        r1.A02 = java.lang.Integer.valueOf(r0);
        r7 = X.AnonymousClass11P.A01(r3.A01);
        r1.A09 = java.lang.Long.valueOf(r7);
        r1.A08 = java.lang.Long.valueOf(r7 - r21);
        r1.A01 = java.lang.Boolean.valueOf(r9);
        r3.A02.CC7(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:?, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:?, code lost:
        r29.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0c54, code lost:
        if (r66 == false) goto L_0x0c60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0c56, code lost:
        r1 = r5.A05;
        r1.A0H(r30);
        r1.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0c61, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0c62, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:?, code lost:
        X.C17900vP.A0X(r7, "SyncResponseHandler/applyMutations cyclic mutation e=", X.AnonymousClass000.A10());
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0c6e, code lost:
        if (r20 == null) goto L_0x0c75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0c70, code lost:
        r3 = r20.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0c75, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0c76, code lost:
        if (r1 == null) goto L_0x0c79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0c79, code lost:
        r1 = r12;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0c7b, code lost:
        r12 = r1.A01;
        r1 = r1.A02;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0c7f, code lost:
        r31 = new X.C26831Tq(r0, r24, r57, r42, r3, r12, r1, 39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r60 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0ca7, code lost:
        r1 = X.AnonymousClass000.A0n("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0cba, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:?, code lost:
        X.CDX.A00(r28, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0cc0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x0cc3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:?, code lost:
        X.CDX.A00(r29, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0cc9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0408, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0408, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0162, code lost:
        r7 = new X.C26831Tq((X.C59372mC) null, (X.C19999A2n) null, r57, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0173, code lost:
        r7 = new X.C26831Tq((X.C59372mC) null, (X.C19999A2n) null, r57, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, 17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a6, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a7, code lost:
        if (r59 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ad, code lost:
        if ((r2.bitField0_ & 16) == 0) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01af, code lost:
        r0 = r2.keyId_;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b2, code lost:
        if (r0 != null) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b4, code lost:
        r0 = X.C164148Xs.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04f9 A[Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04fe A[ExcHandler: 2E3 (r0v90 'e' X.2E3 A[CUSTOM_DECLARE]), Splitter:B:196:0x0420] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x051d A[ExcHandler: 2Dz (r0v88 'e' X.2Dz A[CUSTOM_DECLARE]), Splitter:B:196:0x0420] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x053c A[ExcHandler: ParseException (r0v86 'e' java.text.ParseException A[CUSTOM_DECLARE]), Splitter:B:196:0x0420] */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0c70 A[Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:592:0x0c75 A[Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x0c78 A[Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0c79 A[Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:666:0x0408 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A05(X.AnonymousClass2BT r59, X.AnonymousClass2BK r60, java.lang.String r61, java.util.List r62, long r63, boolean r65, boolean r66) {
        /*
            r58 = this;
            r18 = 1
            r2 = r59
            boolean r1 = X.AnonymousClass000.A1W(r2)
            r4 = r60
            boolean r0 = X.AnonymousClass000.A1W(r4)
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x0d79
            r5 = r58
            X.11P r0 = r5.A0B
            long r21 = X.AnonymousClass11P.A01(r0)
            if (r59 != 0) goto L_0x001f
            r17 = 1
            if (r60 != 0) goto L_0x0021
        L_0x001f:
            r17 = 0
        L_0x0021:
            java.util.ArrayList r30 = X.AnonymousClass000.A13()
            X.1S3 r0 = r5.A07
            r19 = r0
            monitor-enter(r19)
            r57 = r61
            r26 = r63
            X.1Oq r0 = r5.A0D     // Catch:{ 1Tq -> 0x0cca }
            X.1au r29 = r0.A06()     // Catch:{ 1Tq -> 0x0cca }
            X.1xA r28 = r29.BD0()     // Catch:{ all -> 0x0cc1 }
            X.1TS r0 = r5.A0F     // Catch:{ all -> 0x0cb8 }
            r56 = r0
            r1 = r0
            r0 = r57
            java.lang.Long r0 = r1.A01(r0)     // Catch:{ all -> 0x0cb8 }
            if (r0 != 0) goto L_0x0049
            java.lang.Long r0 = X.C17890vO.A0L()     // Catch:{ all -> 0x0cb8 }
        L_0x0049:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0cb8 }
            r8 = 1
            long r6 = r63 - r8
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0084
            if (r17 != 0) goto L_0x0084
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cb8 }
            java.lang.String r6 = "SyncResponseHandler/verifyCollectionVersion fail for incoming patch, currentVersion="
            r3.append(r6)     // Catch:{ all -> 0x0cb8 }
            r3.append(r0)     // Catch:{ all -> 0x0cb8 }
            java.lang.String r0 = "; newVersion="
            r3.append(r0)     // Catch:{ all -> 0x0cb8 }
            r0 = r26
            r3.append(r0)     // Catch:{ all -> 0x0cb8 }
            java.lang.String r1 = "; collection="
            r0 = r57
            X.C17900vP.A0e(r1, r0, r3)     // Catch:{ all -> 0x0cb8 }
            r8 = 0
            r15 = 73
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r9 = r8
            r10 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x0084:
            java.lang.String r6 = "SyncResponseHandler/applyMutations"
            r3 = 0
            boolean r1 = X.AnonymousClass000.A1W(r2)
            boolean r0 = X.AnonymousClass000.A1W(r4)
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x0cac
            java.util.ArrayList r34 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0cb8 }
            java.util.LinkedHashSet r10 = X.C17880vN.A14()     // Catch:{ all -> 0x0cb8 }
            java.util.Iterator r12 = r62.iterator()     // Catch:{ all -> 0x0cb8 }
        L_0x009e:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0cb8 }
            X.2B8 r11 = (X.AnonymousClass2B8) r11     // Catch:{ all -> 0x0cb8 }
            X.C18070vi.A0d(r11, r3)     // Catch:{ all -> 0x0cb8 }
            int r0 = r11.bitField0_     // Catch:{ all -> 0x0cb8 }
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0195
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0184
            X.2BG r9 = r11.record_     // Catch:{ all -> 0x0cb8 }
            if (r9 != 0) goto L_0x00bf
            X.2BG r9 = X.AnonymousClass2BG.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
            if (r9 == 0) goto L_0x0184
        L_0x00bf:
            int r8 = r9.bitField0_     // Catch:{ all -> 0x0cb8 }
            r0 = r8 & 4
            if (r0 == 0) goto L_0x0173
            X.8Xs r7 = r9.keyId_     // Catch:{ all -> 0x0cb8 }
            if (r7 != 0) goto L_0x00d4
            X.8Xs r0 = X.C164148Xs.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0173
        L_0x00cd:
            int r0 = r0.bitField0_     // Catch:{ all -> 0x0cb8 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0173
            goto L_0x00d6
        L_0x00d4:
            r0 = r7
            goto L_0x00cd
        L_0x00d6:
            r0 = r8 & 1
            if (r0 == 0) goto L_0x0162
            X.8Xt r0 = r9.index_     // Catch:{ all -> 0x0cb8 }
            r1 = r0
            if (r0 != 0) goto L_0x00e1
            X.8Xt r0 = X.C164158Xt.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x00e1:
            int r0 = r0.bitField0_     // Catch:{ all -> 0x0cb8 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0162
            if (r1 != 0) goto L_0x00eb
            X.8Xt r1 = X.C164158Xt.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x00eb:
            X.DSQ r0 = r1.blob_     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0162
            r0 = r8 & 2
            if (r0 == 0) goto L_0x0c97
            X.8Xu r0 = r9.value_     // Catch:{ all -> 0x0cb8 }
            r1 = r0
            if (r0 != 0) goto L_0x00fa
            X.8Xu r0 = X.C164168Xu.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x00fa:
            int r0 = r0.bitField0_     // Catch:{ all -> 0x0cb8 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0c97
            if (r1 != 0) goto L_0x0104
            X.8Xu r1 = X.C164168Xu.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x0104:
            X.DSQ r0 = r1.blob_     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0c97
            if (r7 != 0) goto L_0x010c
            X.8Xs r7 = X.C164148Xs.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x010c:
            X.DSQ r0 = r7.id_     // Catch:{ all -> 0x0cb8 }
            byte[] r0 = r0.A06()     // Catch:{ all -> 0x0cb8 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0cb8 }
            X.A2n r7 = new X.A2n     // Catch:{ all -> 0x0cb8 }
            r7.<init>(r0)     // Catch:{ all -> 0x0cb8 }
            X.8Xt r0 = r9.index_     // Catch:{ all -> 0x0cb8 }
            if (r0 != 0) goto L_0x0120
            X.8Xt r0 = X.C164158Xt.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x0120:
            X.DSQ r0 = r0.blob_     // Catch:{ all -> 0x0cb8 }
            byte[] r1 = r0.A06()     // Catch:{ all -> 0x0cb8 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0cb8 }
            int r8 = r11.operation_     // Catch:{ all -> 0x0cb8 }
            if (r8 == 0) goto L_0x0132
            r0 = r18
            if (r8 != r0) goto L_0x0132
            goto L_0x0135
        L_0x0132:
            X.2R4 r0 = X.AnonymousClass2R4.SET     // Catch:{ all -> 0x0cb8 }
            goto L_0x0137
        L_0x0135:
            X.2R4 r0 = X.AnonymousClass2R4.REMOVE     // Catch:{ all -> 0x0cb8 }
        L_0x0137:
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0cb8 }
            if (r0 == r3) goto L_0x015f
            X.2rJ r8 = X.C62382rJ.A02     // Catch:{ all -> 0x0cb8 }
        L_0x013f:
            X.8Xu r0 = r9.value_     // Catch:{ all -> 0x0cb8 }
            if (r0 != 0) goto L_0x0145
            X.8Xu r0 = X.C164168Xu.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x0145:
            X.DSQ r0 = r0.blob_     // Catch:{ all -> 0x0cb8 }
            byte[] r9 = r0.A06()     // Catch:{ all -> 0x0cb8 }
            X.C18070vi.A0X(r9)     // Catch:{ all -> 0x0cb8 }
            X.2fa r0 = new X.2fa     // Catch:{ all -> 0x0cb8 }
            r0.<init>(r8, r7, r1, r9)     // Catch:{ all -> 0x0cb8 }
            r1 = r34
            r1.add(r0)     // Catch:{ all -> 0x0cb8 }
            X.A2n r0 = r0.A01     // Catch:{ all -> 0x0cb8 }
            r10.add(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x009e
        L_0x015f:
            X.2rJ r8 = X.C62382rJ.A03     // Catch:{ all -> 0x0cb8 }
            goto L_0x013f
        L_0x0162:
            r8 = 0
            r15 = 20
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r9 = r8
            r10 = r57
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x0173:
            r8 = 0
            r15 = 17
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r9 = r8
            r10 = r57
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x0184:
            r8 = 0
            r15 = 16
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r9 = r8
            r10 = r57
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x0195:
            r8 = 0
            r15 = 15
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r9 = r8
            r10 = r57
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x01a6:
            r12 = 0
            if (r59 == 0) goto L_0x01d2
            int r0 = r2.bitField0_     // Catch:{ all -> 0x0cb8 }
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01bd
            X.8Xs r0 = r2.keyId_     // Catch:{ all -> 0x0cb8 }
            r1 = r0
            if (r0 != 0) goto L_0x01b6
            X.8Xs r0 = X.C164148Xs.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x01b6:
            int r0 = r0.bitField0_     // Catch:{ all -> 0x0cb8 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01bd
            goto L_0x01e7
        L_0x01bd:
            java.lang.String r0 = "SyncResponseHandler/applyMutations missing patch key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0cb8 }
            r15 = 56
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r9 = r12
            r11 = r12
            r14 = r12
            r8 = r12
            r10 = r57
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x01d2:
            if (r60 == 0) goto L_0x01ff
            int r0 = r4.bitField0_     // Catch:{ all -> 0x0cb8 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01ea
            X.8Xs r0 = r4.keyId_     // Catch:{ all -> 0x0cb8 }
            r1 = r0
            if (r0 != 0) goto L_0x01e1
            X.8Xs r0 = X.C164148Xs.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x01e1:
            int r0 = r0.bitField0_     // Catch:{ all -> 0x0cb8 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01ea
        L_0x01e7:
            if (r1 != 0) goto L_0x0204
            goto L_0x0202
        L_0x01ea:
            java.lang.String r0 = "SyncResponseHandler/applyMutations missing snapshot key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0cb8 }
            r15 = 59
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r9 = r12
            r11 = r12
            r14 = r12
            r8 = r12
            r10 = r57
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x01ff:
            r24 = r12
            goto L_0x0217
        L_0x0202:
            X.8Xs r1 = X.C164148Xs.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
        L_0x0204:
            X.DSQ r0 = r1.id_     // Catch:{ all -> 0x0cb8 }
            byte[] r0 = r0.A06()     // Catch:{ all -> 0x0cb8 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0cb8 }
            X.A2n r24 = new X.A2n     // Catch:{ all -> 0x0cb8 }
            r1 = r24
            r1.<init>(r0)     // Catch:{ all -> 0x0cb8 }
            r10.add(r1)     // Catch:{ all -> 0x0cb8 }
        L_0x0217:
            X.1S0 r1 = r5.A09     // Catch:{ all -> 0x0cb8 }
            r0 = r57
            java.util.LinkedHashMap r25 = r1.A07(r0, r10)     // Catch:{ all -> 0x0cb8 }
            r0 = r25
            boolean r0 = r0.containsValue(r12)     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0269
            java.lang.String r0 = "SyncResponseHandler/applyMutations keyMap contains null value, retry"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cb8 }
            r44 = 1
            if (r60 == 0) goto L_0x0232
            r44 = 0
        L_0x0232:
            if (r59 == 0) goto L_0x023d
            int r0 = r2.A0J(r12)     // Catch:{ all -> 0x0cb8 }
            java.lang.Long r34 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x023f
        L_0x023d:
            r34 = r12
        L_0x023f:
            if (r60 == 0) goto L_0x024a
            int r0 = r4.A0J(r12)     // Catch:{ all -> 0x0cb8 }
            java.lang.Long r35 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x024c
        L_0x024a:
            r35 = r12
        L_0x024c:
            if (r59 == 0) goto L_0x0257
            X.DSQ r0 = r2.patchMac_     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0257
            byte[] r39 = r0.A06()     // Catch:{ all -> 0x0cb8 }
            goto L_0x0259
        L_0x0257:
            r39 = r12
        L_0x0259:
            if (r60 == 0) goto L_0x0265
            X.8Xv r0 = r4.version_     // Catch:{ all -> 0x0cb8 }
            if (r0 != 0) goto L_0x0b74
            X.8Xv r0 = X.C164178Xv.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0b7a
            goto L_0x0b74
        L_0x0265:
            if (r59 == 0) goto L_0x0b7a
            goto L_0x0b6c
        L_0x0269:
            r1 = r25
            r0 = r24
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0cb8 }
            java.lang.String r23 = "Required value was null."
            if (r0 == 0) goto L_0x0ca7
            X.2lh r0 = (X.C59062lh) r0     // Catch:{ all -> 0x0cb8 }
            if (r59 == 0) goto L_0x03d1
            X.1TR r11 = r5.A08     // Catch:{ all -> 0x0cb8 }
            java.lang.String r9 = "SyncEncryptionHelper/validatePatchIntegrity: "
            r1 = 2
            X.C18070vi.A0d(r0, r1)     // Catch:{ all -> 0x0cb8 }
            int r1 = r2.bitField0_     // Catch:{ all -> 0x0cb8 }
            r7 = r1 & 8
            if (r7 == 0) goto L_0x03b8
            r1 = r1 & 4
            if (r1 == 0) goto L_0x039f
            X.DSQ r1 = r2.patchMac_     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            byte[] r1 = r1.A06()     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.DSQ r7 = r2.snapshotMac_     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            byte[] r39 = r7.A06()     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.4so r7 = X.C29431cG.A0V(r34)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.7Sa r8 = X.AnonymousClass1b2.A0B(r7)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.3Iw r7 = X.C71923Iw.A00     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.1b3 r7 = X.AnonymousClass1b2.A0C(r7, r8)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.1b4 r8 = new X.1b4     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            r8.<init>(r7)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            boolean r7 = r8.hasNext()     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            if (r7 != 0) goto L_0x02b2
            r10 = 0
            goto L_0x02c9
        L_0x02b2:
            java.lang.Object r10 = r8.next()     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
        L_0x02b6:
            boolean r7 = r8.hasNext()     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            if (r7 == 0) goto L_0x02c9
            java.lang.Object r7 = r8.next()     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            byte[] r7 = (byte[]) r7     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            byte[] r10 = (byte[]) r10     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            byte[] r10 = X.C200310o.A0A(r10, r7)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            goto L_0x02b6
        L_0x02c9:
            byte[] r10 = (byte[]) r10     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            if (r10 != 0) goto L_0x02cf
            byte[] r10 = new byte[r3]     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
        L_0x02cf:
            X.1TT r13 = r11.A08     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.8Xv r7 = r2.version_     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            if (r7 != 0) goto L_0x02d7
            X.8Xv r7 = X.C164178Xv.DEFAULT_INSTANCE     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
        L_0x02d7:
            long r7 = r7.version_     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.C18070vi.A0b(r39)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            r35 = r13
            r36 = r0
            r37 = r57
            r38 = r10
            r40 = r7
            byte[] r7 = r35.BDu(r36, r37, r38, r39, r40)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            boolean r8 = java.util.Arrays.equals(r1, r7)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            if (r8 == 0) goto L_0x02f7
            java.lang.String r1 = "SyncEncryptionHelper/validatePatchMac/patch mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            goto L_0x03d4
        L_0x02f7:
            X.DSQ r8 = r2.clientDebugData_     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            if (r8 == 0) goto L_0x0343
            X.2BU r6 = X.AnonymousClass2BU.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x033d }
            X.Bm6 r10 = X.C23577Bm6.A02(r8, r6)     // Catch:{ 1PN -> 0x033d }
            X.2BU r10 = (X.AnonymousClass2BU) r10     // Catch:{ 1PN -> 0x033d }
            X.C18070vi.A0X(r10)     // Catch:{ 1PN -> 0x033d }
            r6 = 4
            java.io.Serializable[] r8 = new java.io.Serializable[r6]     // Catch:{ 1PN -> 0x033d }
            X.DSQ r6 = r10.collectionName_     // Catch:{ 1PN -> 0x033d }
            r8[r3] = r6     // Catch:{ 1PN -> 0x033d }
            boolean r6 = r10.isSenderPrimary_     // Catch:{ 1PN -> 0x033d }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ 1PN -> 0x033d }
            r8[r18] = r6     // Catch:{ 1PN -> 0x033d }
            int r6 = r10.senderPlatform_     // Catch:{ 1PN -> 0x033d }
            X.2RF r13 = X.AnonymousClass2RF.A00(r6)     // Catch:{ 1PN -> 0x033d }
            if (r13 != 0) goto L_0x031f
            X.2RF r13 = X.AnonymousClass2RF.Android     // Catch:{ 1PN -> 0x033d }
        L_0x031f:
            r6 = 2
            r8[r6] = r13     // Catch:{ 1PN -> 0x033d }
            X.DSQ r10 = r10.patchVersion_     // Catch:{ 1PN -> 0x033d }
            r6 = 3
            java.util.List r10 = X.C18070vi.A0O(r10, r8, r6)     // Catch:{ 1PN -> 0x033d }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ 1PN -> 0x033d }
            java.lang.String r6 = "D:"
            r8.append(r6)     // Catch:{ 1PN -> 0x033d }
            java.lang.String r6 = ";"
            java.lang.String r6 = X.C29431cG.A0h(r6, r10, r12)     // Catch:{ 1PN -> 0x033d }
            java.lang.String r10 = X.AnonymousClass000.A0y(r6, r8)     // Catch:{ 1PN -> 0x033d }
            goto L_0x0345
        L_0x033d:
            r8 = move-exception
            java.lang.String r6 = "SyncEncryptionHelper/getLoggingStringForPatch: "
            com.whatsapp.util.Log.e(r6, r8)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
        L_0x0343:
            java.lang.String r10 = "D:null"
        L_0x0345:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            java.lang.String r6 = "SyncEncryptionHelper/validatePatchMac/patch mac mismatch: "
            X.C17900vP.A0e(r6, r10, r8)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.190 r8 = r11.A00     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            java.lang.String r6 = "mac-mismatch-patch"
            r8.A0G(r6, r10, r3)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.A2n r6 = r0.A01     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            X.2mC r3 = r0.A00     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            r39 = 34
            X.1Tq r31 = new X.1Tq     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            r37 = r12
            r32 = r3
            r33 = r6
            r34 = r57
            r35 = r12
            r36 = r7
            r38 = r1
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
            throw r31     // Catch:{ 2E3 -> 0x0387, 2Dz -> 0x036f }
        L_0x036f:
            r1 = move-exception
            com.whatsapp.util.Log.e(r9, r1)     // Catch:{ all -> 0x0cb8 }
            X.A2n r1 = r0.A01     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r0.A00     // Catch:{ all -> 0x0cb8 }
            r15 = 10
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r14 = r12
            r8 = r0
            r9 = r1
            r10 = r57
            r11 = r12
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x0387:
            r1 = move-exception
            com.whatsapp.util.Log.e(r9, r1)     // Catch:{ all -> 0x0cb8 }
            X.A2n r1 = r0.A01     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r0.A00     // Catch:{ all -> 0x0cb8 }
            r15 = 10
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r14 = r12
            r8 = r0
            r9 = r1
            r10 = r57
            r11 = r12
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x039f:
            java.lang.String r1 = "SyncEncryptionHelper/validatePatchMac/No snapshot mac"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0cb8 }
            X.A2n r1 = r0.A01     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r0.A00     // Catch:{ all -> 0x0cb8 }
            r15 = 47
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r14 = r12
            r8 = r0
            r9 = r1
            r10 = r57
            r11 = r12
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x03b8:
            java.lang.String r1 = "SyncEncryptionHelper/validatePatchMac/No patch mac"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0cb8 }
            X.A2n r1 = r0.A01     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r0.A00     // Catch:{ all -> 0x0cb8 }
            r15 = 48
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r14 = r12
            r8 = r0
            r9 = r1
            r10 = r57
            r11 = r12
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x03d1:
            r20 = r12
            goto L_0x03e4
        L_0x03d4:
            X.DSQ r1 = r2.patchMac_     // Catch:{ all -> 0x0cb8 }
            byte[] r8 = r1.A06()     // Catch:{ all -> 0x0cb8 }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x0cb8 }
            X.2m7 r20 = new X.2m7     // Catch:{ all -> 0x0cb8 }
            r1 = r20
            r1.<init>(r8, r7, r3)     // Catch:{ all -> 0x0cb8 }
        L_0x03e4:
            java.util.LinkedHashSet r8 = X.C17880vN.A14()     // Catch:{ all -> 0x0cb8 }
            java.util.LinkedHashSet r36 = X.C17880vN.A14()     // Catch:{ all -> 0x0cb8 }
            java.util.LinkedHashSet r7 = X.C17880vN.A14()     // Catch:{ all -> 0x0cb8 }
            java.util.ArrayList r35 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0cb8 }
            java.util.ArrayList r32 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0cb8 }
            java.util.ArrayList r31 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0cb8 }
            java.util.ArrayList r33 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0cb8 }
            java.util.LinkedHashMap r14 = X.C17880vN.A13()     // Catch:{ all -> 0x0cb8 }
            java.util.Iterator r16 = r34.iterator()     // Catch:{ all -> 0x0cb8 }
        L_0x0408:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x0cb8 }
            if (r1 == 0) goto L_0x055b
            java.lang.Object r9 = r16.next()     // Catch:{ all -> 0x0cb8 }
            X.2fa r9 = (X.C55322fa) r9     // Catch:{ all -> 0x0cb8 }
            X.A2n r15 = r9.A01     // Catch:{ all -> 0x0cb8 }
            r1 = r25
            java.lang.Object r1 = r1.get(r15)     // Catch:{ all -> 0x0cb8 }
            if (r1 == 0) goto L_0x0cb3
            X.2lh r1 = (X.C59062lh) r1     // Catch:{ all -> 0x0cb8 }
            X.1TT r10 = r5.A0C     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04ea }
            X.A6U r13 = r10.BIA(r9, r1)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04ea }
            java.lang.String r11 = r13.A04     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            byte[] r9 = r9.A03     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            r14.put(r11, r9)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            X.2rJ r10 = r13.A01     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            X.2rJ r9 = X.C62382rJ.A03     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            boolean r9 = X.C18070vi.A18(r10, r9)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            if (r9 == 0) goto L_0x0480
            r9 = r35
            r9.add(r13)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            r9 = r36
            boolean r9 = r9.add(r11)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            if (r9 != 0) goto L_0x0408
            java.lang.String r9 = "SyncResponseHandler/applyMutations same index for multi set mutations"
            com.whatsapp.util.Log.e((java.lang.String) r9)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            if (r59 == 0) goto L_0x0466
            X.2mC r9 = r1.A00     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e7 }
            r45 = 6
            X.1Tq r37 = new X.1Tq     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x0463 }
            r42 = r12
            r43 = r12
            r44 = r12
            r38 = r9
            r39 = r15
            r40 = r57
            r41 = r12
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x0463 }
            throw r37     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x0463 }
        L_0x0463:
            r9 = move-exception
            goto L_0x04eb
        L_0x0466:
            X.2mC r9 = r1.A00     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x047e }
            r45 = 68
            X.1Tq r37 = new X.1Tq     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x047e }
            r42 = r12
            r43 = r12
            r44 = r12
            r38 = r9
            r39 = r15
            r40 = r57
            r41 = r12
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x047e }
            throw r37     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x047e }
        L_0x047e:
            r9 = move-exception
            goto L_0x04eb
        L_0x0480:
            X.2rJ r9 = X.C62382rJ.A02     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e5 }
            boolean r9 = X.C18070vi.A18(r10, r9)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e5 }
            if (r9 == 0) goto L_0x04d8
            java.lang.String[] r9 = r13.A06     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e5 }
            r10 = r9[r3]     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e5 }
            java.lang.String r9 = "contact"
            boolean r10 = X.C18070vi.A18(r10, r9)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e5 }
            r9 = r32
            if (r10 == 0) goto L_0x0498
            r9 = r31
        L_0x0498:
            r9.add(r13)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e5 }
            boolean r9 = r7.add(r11)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e5 }
            if (r9 != 0) goto L_0x0408
            java.lang.String r9 = "SyncResponseHandler/applyMutations same index for multi remove mutations"
            com.whatsapp.util.Log.e((java.lang.String) r9)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e5 }
            if (r59 == 0) goto L_0x04c0
            X.2mC r9 = r1.A00     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e5 }
            r45 = 6
            X.1Tq r37 = new X.1Tq     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e3 }
            r42 = r12
            r43 = r12
            r44 = r12
            r38 = r9
            r39 = r15
            r40 = r57
            r41 = r12
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e3 }
            throw r37     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e3 }
        L_0x04c0:
            X.2mC r9 = r1.A00     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e3 }
            r45 = 68
            X.1Tq r37 = new X.1Tq     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e3 }
            r42 = r12
            r43 = r12
            r44 = r12
            r38 = r9
            r39 = r15
            r40 = r57
            r41 = r12
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e3 }
            throw r37     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e3 }
        L_0x04d8:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e3 }
            java.lang.String r9 = "SyncResponseHandler/applyMutations: Unknown operation "
            X.C17900vP.A0X(r10, r9, r11)     // Catch:{ ParseException -> 0x053c, 2Dz -> 0x051d, 2E3 -> 0x04fe, 2E2 -> 0x04e3 }
            goto L_0x0408
        L_0x04e3:
            r9 = move-exception
            goto L_0x04eb
        L_0x04e5:
            r9 = move-exception
            goto L_0x04eb
        L_0x04e7:
            r9 = move-exception
            r12 = 0
            goto L_0x04eb
        L_0x04ea:
            r9 = move-exception
        L_0x04eb:
            r1 = r57
            r5.A03(r9, r1)     // Catch:{ all -> 0x0cb8 }
            r1 = r33
            r1.add(r9)     // Catch:{ all -> 0x0cb8 }
            java.lang.String r1 = r9.index     // Catch:{ all -> 0x0cb8 }
            if (r1 == 0) goto L_0x0408
            r8.add(r1)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0408
        L_0x04fe:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r1.A00     // Catch:{ all -> 0x0cb8 }
            r39 = 7
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r37 = r12
            r38 = r12
            r31 = r7
            r32 = r0
            r33 = r15
            r34 = r57
            r35 = r12
            r36 = r12
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x051d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r1.A00     // Catch:{ all -> 0x0cb8 }
            r39 = 7
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r37 = r12
            r38 = r12
            r31 = r7
            r32 = r0
            r33 = r15
            r34 = r57
            r35 = r12
            r36 = r12
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x053c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r1.A00     // Catch:{ all -> 0x0cb8 }
            r39 = 7
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r37 = r12
            r38 = r12
            r31 = r7
            r32 = r0
            r33 = r15
            r34 = r57
            r35 = r12
            r36 = r12
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x055b:
            X.0ve r6 = r5.A0H     // Catch:{ all -> 0x0cb8 }
            r9 = 624(0x270, float:8.74E-43)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x0cb8 }
            boolean r6 = X.C18020vd.A05(r1, r6, r9)     // Catch:{ all -> 0x0cb8 }
            if (r6 == 0) goto L_0x05a2
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cb8 }
            java.lang.String r6 = "SyncResponseHandler/applyMutations:\n             REMOVE mutations: \n             "
            r13.append(r6)     // Catch:{ all -> 0x0cb8 }
            java.lang.String r11 = "\n"
            java.lang.String r10 = ""
            r6 = r32
            java.lang.String r6 = X.C29431cG.A0g(r11, r10, r10, r6, r12)     // Catch:{ all -> 0x0cb8 }
            r13.append(r6)     // Catch:{ all -> 0x0cb8 }
            java.lang.String r6 = "\n             "
            r13.append(r6)     // Catch:{ all -> 0x0cb8 }
            r6 = r31
            java.lang.String r6 = X.C29431cG.A0g(r11, r10, r10, r6, r12)     // Catch:{ all -> 0x0cb8 }
            r13.append(r6)     // Catch:{ all -> 0x0cb8 }
            java.lang.String r6 = "\n             SET mutations: \n             "
            r13.append(r6)     // Catch:{ all -> 0x0cb8 }
            r6 = r35
            java.lang.String r6 = X.C29431cG.A0g(r11, r10, r10, r6, r12)     // Catch:{ all -> 0x0cb8 }
            r13.append(r6)     // Catch:{ all -> 0x0cb8 }
            java.lang.String r6 = "\n          "
            java.lang.String r6 = X.AnonymousClass000.A0y(r6, r13)     // Catch:{ all -> 0x0cb8 }
            X.AnonymousClass1Y7.A01(r6)     // Catch:{ all -> 0x0cb8 }
        L_0x05a2:
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0cb8 }
            r11.addAll(r8)     // Catch:{ all -> 0x0cb8 }
            r6 = r36
            r11.addAll(r6)     // Catch:{ all -> 0x0cb8 }
            r11.addAll(r7)     // Catch:{ all -> 0x0cb8 }
            r8.size()     // Catch:{ all -> 0x0cb8 }
            r36.size()     // Catch:{ all -> 0x0cb8 }
            r7.size()     // Catch:{ all -> 0x0cb8 }
            X.1TR r10 = r5.A08     // Catch:{ all -> 0x0cb8 }
            java.lang.String[] r8 = X.C17890vO.A1b(r11, r3)     // Catch:{ all -> 0x0cb8 }
            r6 = 2
            X.C18070vi.A0d(r8, r6)     // Catch:{ all -> 0x0cb8 }
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0cb8 }
            java.util.ArrayList r14 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0cb8 }
            r13 = 4
            X.4so r11 = new X.4so     // Catch:{ all -> 0x0cb8 }
            r6 = r34
            r11.<init>(r6, r13)     // Catch:{ all -> 0x0cb8 }
            X.7Sa r11 = X.AnonymousClass1b2.A0B(r11)     // Catch:{ all -> 0x0cb8 }
            X.3Iu r6 = X.C71903Iu.A00     // Catch:{ all -> 0x0cb8 }
            X.7Sa r6 = X.AnonymousClass1b2.A09(r6, r11)     // Catch:{ all -> 0x0cb8 }
            r43 = 0
            X.7Rp r13 = new X.7Rp     // Catch:{ all -> 0x0cb8 }
            r13.<init>((X.C147157Sa) r6)     // Catch:{ all -> 0x0cb8 }
        L_0x05e5:
            boolean r6 = r13.hasNext()     // Catch:{ all -> 0x0cb8 }
            if (r6 == 0) goto L_0x05fc
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0cb8 }
            X.2fa r11 = (X.C55322fa) r11     // Catch:{ all -> 0x0cb8 }
            byte[] r6 = r11.A04     // Catch:{ all -> 0x0cb8 }
            r7.add(r6)     // Catch:{ all -> 0x0cb8 }
            byte[] r6 = r11.A03     // Catch:{ all -> 0x0cb8 }
            r14.add(r6)     // Catch:{ all -> 0x0cb8 }
            goto L_0x05e5
        L_0x05fc:
            X.1TS r11 = r10.A09     // Catch:{ all -> 0x0cb8 }
            r6 = r57
            byte[] r13 = r11.A07(r6)     // Catch:{ all -> 0x0cb8 }
            X.1Rs r11 = r10.A0A     // Catch:{ all -> 0x0cb8 }
            java.util.HashMap r11 = r11.A0E(r6, r8)     // Catch:{ all -> 0x0cb8 }
            X.0ve r6 = r10.A0B     // Catch:{ all -> 0x0cb8 }
            boolean r9 = X.C18020vd.A05(r1, r6, r9)     // Catch:{ all -> 0x0cb8 }
            if (r9 == 0) goto L_0x0619
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch:{ all -> 0x0cb8 }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x0cb8 }
        L_0x0619:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0cb8 }
            r8.<init>()     // Catch:{ all -> 0x0cb8 }
            java.util.Collection r8 = r11.values()     // Catch:{ all -> 0x0cb8 }
            java.util.List r8 = X.C29431cG.A0t(r8)     // Catch:{ all -> 0x0cb8 }
            byte[] r9 = X.AnonymousClass1TR.A0E     // Catch:{ all -> 0x0cb8 }
            byte[] r11 = X.AnonymousClass2TC.A00(r8, r13, r9, r3)     // Catch:{ all -> 0x0cb8 }
            X.C18070vi.A0X(r11)     // Catch:{ all -> 0x0cb8 }
            r8 = r18
            byte[] r42 = X.AnonymousClass2TC.A00(r7, r11, r9, r8)     // Catch:{ all -> 0x0cb8 }
            X.C18070vi.A0X(r42)     // Catch:{ all -> 0x0cb8 }
            if (r59 == 0) goto L_0x071b
            java.lang.String r9 = "SyncEncryptionHelper/validateSnapshotMac: "
            r7 = 2
            X.C18070vi.A0d(r0, r7)     // Catch:{ all -> 0x0cb8 }
            int r7 = r2.bitField0_     // Catch:{ all -> 0x0cb8 }
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0713
            X.DSQ r7 = r2.snapshotMac_     // Catch:{ all -> 0x0cb8 }
            byte[] r8 = r7.A06()     // Catch:{ all -> 0x0cb8 }
            X.1TT r11 = r10.A08     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            X.8Xv r7 = r2.version_     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            if (r7 != 0) goto L_0x0654
            X.8Xv r7 = X.C164178Xv.DEFAULT_INSTANCE     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
        L_0x0654:
            long r13 = r7.version_     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            r44 = r11
            r45 = r0
            r46 = r57
            r47 = r42
            r48 = r13
            byte[] r7 = r44.BDz(r45, r46, r47, r48)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            boolean r11 = java.util.Arrays.equals(r8, r7)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            if (r11 != 0) goto L_0x06dc
            java.lang.String r11 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch but do not throw fatal"
            com.whatsapp.util.Log.w((java.lang.String) r11)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            r11 = 1783(0x6f7, float:2.499E-42)
            boolean r1 = X.C18020vd.A05(r1, r6, r11)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            if (r1 == 0) goto L_0x067e
            r6 = 16
            r1 = r57
            X.AnonymousClass1TR.A01(r10, r1, r6)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
        L_0x067e:
            X.1TV r10 = r10.A05     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            X.1Pw r11 = r10.A01     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            android.content.SharedPreferences r1 = X.C25851Pw.A00(r11)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            java.lang.String r6 = "syncd_has_logged_snapshot_mac_mismatch_in_patch"
            int r13 = r1.getInt(r6, r3)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            int r1 = X.AnonymousClass1TV.A00(r57)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            int r1 = r18 << r1
            r1 = r1 & r13
            if (r1 != 0) goto L_0x06d0
            android.content.SharedPreferences r1 = X.C25851Pw.A00(r11)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            int r13 = r1.getInt(r6, r3)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            int r1 = X.AnonymousClass1TV.A00(r57)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            int r1 = r18 << r1
            r1 = r1 | r13
            android.content.SharedPreferences r11 = X.C25851Pw.A00(r11)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            X.C17880vN.A1C(r11, r6, r1)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            X.1Rw r10 = r10.A00     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            r1 = 60
            X.2FU r6 = new X.2FU     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            r6.<init>()     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            r6.A02 = r1     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            java.lang.Integer r1 = X.C26371Rw.A03(r57)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            r6.A01 = r1     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            r6.A00 = r1     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            X.18K r1 = r10.A08     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            r1.CC7(r6)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
        L_0x06d0:
            X.C18070vi.A0b(r8)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            X.2m7 r1 = new X.2m7     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            r6 = r18
            r1.<init>(r8, r7, r6)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            goto L_0x07b6
        L_0x06dc:
            java.lang.String r1 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 2E3 -> 0x06ff, 2Dz -> 0x06eb }
            X.C18070vi.A0b(r8)     // Catch:{ all -> 0x0cb8 }
            X.2m7 r1 = new X.2m7     // Catch:{ all -> 0x0cb8 }
            r1.<init>(r8, r7, r3)     // Catch:{ all -> 0x0cb8 }
            goto L_0x07b6
        L_0x06eb:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)     // Catch:{ all -> 0x0cb8 }
            r15 = 10
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r9 = r12
            r11 = r12
            r14 = r12
            r8 = r12
            r10 = r57
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x06ff:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)     // Catch:{ all -> 0x0cb8 }
            r15 = 10
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r9 = r12
            r11 = r12
            r14 = r12
            r8 = r12
            r10 = r57
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x0713:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0cb7
        L_0x071b:
            if (r60 == 0) goto L_0x07ac
            java.lang.String r1 = "SyncEncryptionHelper/validateSnapshotMac: "
            r6 = 2
            X.C18070vi.A0d(r0, r6)     // Catch:{ all -> 0x0cb8 }
            int r6 = r4.bitField0_     // Catch:{ all -> 0x0cb8 }
            r6 = r6 & 2
            if (r6 == 0) goto L_0x07a4
            X.DSQ r6 = r4.mac_     // Catch:{ all -> 0x0cb8 }
            byte[] r6 = r6.A06()     // Catch:{ all -> 0x0cb8 }
            X.1TT r9 = r10.A08     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            X.8Xv r7 = r4.version_     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            if (r7 != 0) goto L_0x0737
            X.8Xv r7 = X.C164178Xv.DEFAULT_INSTANCE     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
        L_0x0737:
            long r7 = r7.version_     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            r44 = r9
            r45 = r0
            r46 = r57
            r47 = r42
            r48 = r7
            byte[] r7 = r44.BDz(r45, r46, r47, r48)     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            boolean r8 = java.util.Arrays.equals(r6, r7)     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            if (r8 == 0) goto L_0x0753
            java.lang.String r8 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            goto L_0x07ae
        L_0x0753:
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            X.A2n r8 = r0.A01     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            X.2mC r3 = r0.A00     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            r39 = 61
            X.1Tq r31 = new X.1Tq     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            r32 = r3
            r33 = r8
            r34 = r57
            r35 = r42
            r36 = r12
            r37 = r7
            r38 = r6
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
            throw r31     // Catch:{ 2E3 -> 0x078b, 2Dz -> 0x0772 }
        L_0x0772:
            r3 = move-exception
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x0cb8 }
            X.A2n r1 = r0.A01     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r0.A00     // Catch:{ all -> 0x0cb8 }
            r15 = 10
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r8 = r0
            r9 = r1
            r10 = r57
            r11 = r42
            r13 = r12
            r14 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x078b:
            r3 = move-exception
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x0cb8 }
            X.A2n r1 = r0.A01     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r0.A00     // Catch:{ all -> 0x0cb8 }
            r15 = 10
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r8 = r0
            r9 = r1
            r10 = r57
            r11 = r42
            r13 = r12
            r14 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x07a4:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0cb7
        L_0x07ac:
            r1 = r12
            goto L_0x07b6
        L_0x07ae:
            X.C18070vi.A0b(r6)     // Catch:{ all -> 0x0cb8 }
            X.2m7 r1 = new X.2m7     // Catch:{ all -> 0x0cb8 }
            r1.<init>(r6, r7, r3)     // Catch:{ all -> 0x0cb8 }
        L_0x07b6:
            boolean r6 = X.C17880vN.A1X(r32)     // Catch:{ all -> 0x0cb8 }
            if (r6 == 0) goto L_0x080c
            X.1Rs r6 = r5.A0G     // Catch:{ all -> 0x0cb8 }
            X.1Oq r6 = r6.A00     // Catch:{ all -> 0x0cb8 }
            X.1au r11 = r6.A06()     // Catch:{ all -> 0x0cb8 }
            X.1xA r10 = r11.BD0()     // Catch:{ all -> 0x0803 }
            r6 = r11
            X.1av r6 = (X.C28801av) r6     // Catch:{ all -> 0x07f9 }
            X.1Ev r8 = r6.A02     // Catch:{ all -> 0x07f9 }
            java.util.LinkedHashSet r7 = X.C17880vN.A14()     // Catch:{ all -> 0x07f9 }
            java.util.Iterator r9 = r32.iterator()     // Catch:{ all -> 0x07f9 }
        L_0x07d5:
            boolean r6 = r9.hasNext()     // Catch:{ all -> 0x07f9 }
            if (r6 == 0) goto L_0x07e7
            java.lang.Object r6 = r9.next()     // Catch:{ all -> 0x07f9 }
            X.A6U r6 = (X.A6U) r6     // Catch:{ all -> 0x07f9 }
            java.lang.String r6 = r6.A04     // Catch:{ all -> 0x07f9 }
            r7.add(r6)     // Catch:{ all -> 0x07f9 }
            goto L_0x07d5
        L_0x07e7:
            java.lang.String[] r6 = X.C20068A5s.A00     // Catch:{ all -> 0x07f9 }
            java.lang.Object[] r6 = r7.toArray(r6)     // Catch:{ all -> 0x07f9 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x07f9 }
            X.C26331Rs.A07(r8, r6)     // Catch:{ all -> 0x07f9 }
            r10.A00()     // Catch:{ all -> 0x07f9 }
            r10.close()     // Catch:{ all -> 0x0803 }
            goto L_0x0809
        L_0x07f9:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x07fe }
            goto L_0x0802
        L_0x07fe:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0803 }
        L_0x0802:
            throw r1     // Catch:{ all -> 0x0803 }
        L_0x0803:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0ad7 }
            goto L_0x0cb7
        L_0x0809:
            r11.close()     // Catch:{ all -> 0x0cb8 }
        L_0x080c:
            java.util.ArrayList r34 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0cb8 }
            java.util.Iterator r9 = r31.iterator()     // Catch:{ all -> 0x0cb8 }
        L_0x0814:
            boolean r6 = r9.hasNext()     // Catch:{ all -> 0x0cb8 }
            if (r6 == 0) goto L_0x0842
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0cb8 }
            X.A6U r8 = (X.A6U) r8     // Catch:{ all -> 0x0cb8 }
            java.lang.String r7 = r8.A04     // Catch:{ 2E2 -> 0x0836 }
            r6 = r36
            boolean r6 = r6.contains(r7)     // Catch:{ 2E2 -> 0x0836 }
            if (r6 != 0) goto L_0x0814
            r6 = r19
            X.A8l r7 = r6.A02(r8)     // Catch:{ 2E2 -> 0x0836 }
            r6 = r34
            r6.add(r7)     // Catch:{ 2E2 -> 0x0836 }
            goto L_0x0814
        L_0x0836:
            r7 = move-exception
            r6 = r57
            r5.A03(r7, r6)     // Catch:{ all -> 0x0cb8 }
            r6 = r33
            r6.add(r7)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0814
        L_0x0842:
            java.util.Iterator r8 = r35.iterator()     // Catch:{ all -> 0x0cb8 }
        L_0x0846:
            boolean r6 = r8.hasNext()     // Catch:{ all -> 0x0cb8 }
            if (r6 == 0) goto L_0x086a
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x0cb8 }
            X.A6U r7 = (X.A6U) r7     // Catch:{ all -> 0x0cb8 }
            r6 = r19
            X.A8l r7 = r6.A02(r7)     // Catch:{ 2E2 -> 0x085e }
            r6 = r34
            r6.add(r7)     // Catch:{ 2E2 -> 0x085e }
            goto L_0x0846
        L_0x085e:
            r7 = move-exception
            r6 = r57
            r5.A03(r7, r6)     // Catch:{ all -> 0x0cb8 }
            r6 = r33
            r6.add(r7)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0846
        L_0x086a:
            X.1Rw r6 = r5.A05     // Catch:{ 2RK -> 0x0c62 }
            r35 = r6
            X.10w r6 = X.C61082p6.A00     // Catch:{ 2RK -> 0x0c62 }
            X.2qR r11 = new X.2qR     // Catch:{ 2RK -> 0x0c62 }
            r11.<init>()     // Catch:{ 2RK -> 0x0c62 }
            java.util.Iterator r9 = r34.iterator()     // Catch:{ 2RK -> 0x0c62 }
        L_0x0879:
            boolean r6 = r9.hasNext()     // Catch:{ 2RK -> 0x0c62 }
            if (r6 == 0) goto L_0x088f
            java.lang.Object r7 = r9.next()     // Catch:{ 2RK -> 0x0c62 }
            X.00O r6 = r11.A00     // Catch:{ 2RK -> 0x0c62 }
            boolean r8 = r6.containsKey(r7)     // Catch:{ 2RK -> 0x0c62 }
            if (r8 != 0) goto L_0x0879
            r6.put(r7, r12)     // Catch:{ 2RK -> 0x0c62 }
            goto L_0x0879
        L_0x088f:
            java.util.Iterator r32 = r34.iterator()     // Catch:{ 2RK -> 0x0c62 }
        L_0x0893:
            boolean r6 = r32.hasNext()     // Catch:{ 2RK -> 0x0c62 }
            if (r6 == 0) goto L_0x092f
            java.lang.Object r10 = r32.next()     // Catch:{ 2RK -> 0x0c62 }
            X.A8l r10 = (X.C20126A8l) r10     // Catch:{ 2RK -> 0x0c62 }
            X.10w r7 = X.C61082p6.A00     // Catch:{ 2RK -> 0x0c62 }
            java.lang.String r6 = r10.A0B()     // Catch:{ 2RK -> 0x0c62 }
            java.lang.Object r9 = r7.get(r6)     // Catch:{ 2RK -> 0x0c62 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ 2RK -> 0x0c62 }
            X.10w r7 = X.C61082p6.A01     // Catch:{ 2RK -> 0x0c62 }
            java.lang.String r6 = r10.A0B()     // Catch:{ 2RK -> 0x0c62 }
            java.lang.Object r8 = r7.get(r6)     // Catch:{ 2RK -> 0x0c62 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ 2RK -> 0x0c62 }
            java.util.Iterator r31 = r34.iterator()     // Catch:{ 2RK -> 0x0c62 }
        L_0x08bb:
            boolean r6 = r31.hasNext()     // Catch:{ 2RK -> 0x0c62 }
            if (r6 == 0) goto L_0x0893
            java.lang.Object r7 = r31.next()     // Catch:{ 2RK -> 0x0c62 }
            X.A8l r7 = (X.C20126A8l) r7     // Catch:{ 2RK -> 0x0c62 }
            r16 = 1
            if (r9 == 0) goto L_0x08f8
            java.lang.String r6 = r7.A0B()     // Catch:{ 2RK -> 0x0c62 }
            boolean r6 = r9.contains(r6)     // Catch:{ 2RK -> 0x0c62 }
            if (r6 == 0) goto L_0x08f8
            android.util.Pair r6 = X.C61082p6.A00(r7)     // Catch:{ 2RK -> 0x0c62 }
            java.lang.Object r15 = r6.first     // Catch:{ 2RK -> 0x0c62 }
            java.lang.Object r6 = r6.second     // Catch:{ 2RK -> 0x0c62 }
            X.205 r6 = (X.AnonymousClass205) r6     // Catch:{ 2RK -> 0x0c62 }
            android.util.Pair r13 = X.C61082p6.A00(r10)     // Catch:{ 2RK -> 0x0c62 }
            java.lang.Object r14 = r13.first     // Catch:{ 2RK -> 0x0c62 }
            java.lang.Object r13 = r13.second     // Catch:{ 2RK -> 0x0c62 }
            boolean r14 = X.C42171xk.A00(r15, r14)     // Catch:{ 2RK -> 0x0c62 }
            if (r14 == 0) goto L_0x08f8
            if (r6 == 0) goto L_0x08fa
            if (r13 == 0) goto L_0x08fa
            boolean r6 = r6.equals(r13)     // Catch:{ 2RK -> 0x0c62 }
            if (r6 == 0) goto L_0x08f8
            goto L_0x08fa
        L_0x08f8:
            r13 = 0
            goto L_0x08fb
        L_0x08fa:
            r13 = 1
        L_0x08fb:
            if (r8 == 0) goto L_0x0908
            java.lang.String r6 = r7.A0B()     // Catch:{ 2RK -> 0x0c62 }
            boolean r6 = r8.contains(r6)     // Catch:{ 2RK -> 0x0c62 }
            if (r6 == 0) goto L_0x0908
            goto L_0x090a
        L_0x0908:
            r16 = 0
        L_0x090a:
            if (r7 == r10) goto L_0x08bb
            if (r13 != 0) goto L_0x0910
            if (r16 == 0) goto L_0x08bb
        L_0x0910:
            long r15 = r7.A04     // Catch:{ 2RK -> 0x0c62 }
            long r13 = r10.A04     // Catch:{ 2RK -> 0x0c62 }
            int r6 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x091d
            boolean r6 = r11.A01(r10, r7)     // Catch:{ 2RK -> 0x0c62 }
            goto L_0x0921
        L_0x091d:
            boolean r6 = r11.A01(r7, r10)     // Catch:{ 2RK -> 0x0c62 }
        L_0x0921:
            if (r6 == 0) goto L_0x08bb
            r6 = r35
            X.1Pw r14 = r6.A03     // Catch:{ 2RK -> 0x0c62 }
            java.lang.String r13 = "cross_index_conflict_counter"
            r6 = 1
            r14.A06(r13, r6)     // Catch:{ 2RK -> 0x0c62 }
            goto L_0x08bb
        L_0x092f:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ 2RK -> 0x0c62 }
            java.util.HashSet r10 = X.C17880vN.A12()     // Catch:{ 2RK -> 0x0c62 }
            X.00O r9 = r11.A00     // Catch:{ 2RK -> 0x0c62 }
            int r8 = r9.size()     // Catch:{ 2RK -> 0x0c62 }
            r7 = 0
        L_0x093e:
            if (r7 >= r8) goto L_0x094a
            java.lang.Object r6 = r9.A04(r7)     // Catch:{ 2RK -> 0x0c62 }
            X.C61882qR.A00(r11, r6, r13, r10)     // Catch:{ 2RK -> 0x0c62 }
            int r7 = r7 + 1
            goto L_0x093e
        L_0x094a:
            java.util.Iterator r13 = r13.iterator()     // Catch:{ 2RK -> 0x0c62 }
        L_0x094e:
            boolean r6 = r13.hasNext()     // Catch:{ 2RK -> 0x0c62 }
            if (r6 == 0) goto L_0x0a39
            java.lang.Object r6 = r13.next()     // Catch:{ 2RK -> 0x0a36 }
            X.A8l r6 = (X.C20126A8l) r6     // Catch:{ 2RK -> 0x0a36 }
            X.C18070vi.A0b(r6)     // Catch:{ 2RK -> 0x0a36 }
            X.C18070vi.A0d(r6, r3)     // Catch:{ 2RK -> 0x0a36 }
            r7 = r19
            X.00H r7 = r7.A03     // Catch:{ 2RK -> 0x0a36 }
            java.lang.Object r8 = r7.get()     // Catch:{ 2RK -> 0x0a36 }
            X.2lN r8 = (X.C58862lN) r8     // Catch:{ 2RK -> 0x0a36 }
            java.lang.String r7 = r6.A0B()     // Catch:{ 2RK -> 0x0a36 }
            X.2nY r8 = r8.A00(r7)     // Catch:{ 2RK -> 0x0a36 }
            X.C17960vV.A07(r8)     // Catch:{ 2RK -> 0x0a36 }
            if (r8 == 0) goto L_0x0986
            r7 = r19
            X.1Rs r9 = r7.A01     // Catch:{ all -> 0x0a31 }
            java.lang.String r7 = r6.A0A()     // Catch:{ all -> 0x0a31 }
            X.A8l r7 = r9.A09(r7)     // Catch:{ all -> 0x0a31 }
            r8.A0I(r6, r7)     // Catch:{ all -> 0x0a31 }
        L_0x0986:
            r7 = r19
            r7.A04(r6)     // Catch:{ 2RK -> 0x0a36 }
            if (r59 == 0) goto L_0x0991
            r55 = 1
            if (r60 == 0) goto L_0x0993
        L_0x0991:
            r55 = 0
        L_0x0993:
            X.A2n r8 = r6.A00     // Catch:{ 2RK -> 0x0a36 }
            r7 = r25
            java.lang.Object r7 = r7.get(r8)     // Catch:{ 2RK -> 0x0a36 }
            X.2lh r7 = (X.C59062lh) r7     // Catch:{ 2RK -> 0x0a36 }
            if (r7 == 0) goto L_0x09a2
            X.2mC r11 = r7.A00     // Catch:{ 2RK -> 0x0c62 }
            goto L_0x09a3
        L_0x09a2:
            r11 = r12
        L_0x09a3:
            X.2rJ r10 = r6.A05     // Catch:{ 2RK -> 0x0a36 }
            java.lang.String r51 = r6.A0B()     // Catch:{ 2RK -> 0x0a36 }
            byte[] r9 = r6.A01     // Catch:{ 2RK -> 0x0a36 }
            byte[] r7 = r6.A0E()     // Catch:{ 2RK -> 0x0a36 }
            if (r7 == 0) goto L_0x09b7
            int r7 = r7.length     // Catch:{ 2RK -> 0x0c62 }
            java.lang.Long r49 = X.C17880vN.A0n(r7)     // Catch:{ 2RK -> 0x0c62 }
            goto L_0x09b9
        L_0x09b7:
            r49 = r12
        L_0x09b9:
            if (r55 == 0) goto L_0x09be
            if (r59 == 0) goto L_0x09ce
            goto L_0x09c5
        L_0x09be:
            if (r60 == 0) goto L_0x09ce
            X.DSQ r7 = r4.mac_     // Catch:{ 2RK -> 0x0c62 }
            if (r7 == 0) goto L_0x09ce
            goto L_0x09c9
        L_0x09c5:
            X.DSQ r7 = r2.patchMac_     // Catch:{ 2RK -> 0x0c62 }
            if (r7 == 0) goto L_0x09ce
        L_0x09c9:
            byte[] r53 = r7.A06()     // Catch:{ 2RK -> 0x0c62 }
            goto L_0x09d0
        L_0x09ce:
            r53 = r12
        L_0x09d0:
            X.2n0 r7 = new X.2n0     // Catch:{ 2RK -> 0x0a33 }
            r44 = r7
            r45 = r10
            r46 = r11
            r47 = r8
            r48 = r12
            r50 = r57
            r52 = r9
            r54 = r3
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ 2RK -> 0x0a33 }
            r8 = r30
            r8.add(r7)     // Catch:{ 2RK -> 0x0a33 }
            boolean r7 = r6 instanceof X.AnonymousClass8q1     // Catch:{ 2RK -> 0x0a33 }
            if (r7 == 0) goto L_0x09fb
            X.8q1 r6 = (X.AnonymousClass8q1) r6     // Catch:{ 2RK -> 0x0a33 }
            boolean r8 = r6.A00     // Catch:{ 2RK -> 0x0a33 }
            X.A5M r7 = r5.A01     // Catch:{ 2RK -> 0x0a33 }
            X.1BI r45 = r6.getChatJid()     // Catch:{ 2RK -> 0x0a33 }
            r50 = r8 ^ 1
            goto L_0x0a0f
        L_0x09fb:
            boolean r7 = r6 instanceof X.C170458pt     // Catch:{ 2RK -> 0x0a33 }
            if (r7 == 0) goto L_0x0a12
            X.8pt r6 = (X.C170458pt) r6     // Catch:{ 2RK -> 0x0a33 }
            boolean r8 = r6.A01     // Catch:{ 2RK -> 0x0a33 }
            X.A5M r7 = r5.A01     // Catch:{ 2RK -> 0x0a33 }
            X.1BI r45 = r6.getChatJid()     // Catch:{ 2RK -> 0x0a33 }
            r50 = 3
            if (r8 == 0) goto L_0x0a0f
            r50 = 2
        L_0x0a0f:
            r49 = 5
            goto L_0x0a22
        L_0x0a12:
            boolean r7 = r6 instanceof X.C170518pz     // Catch:{ 2RK -> 0x0a33 }
            if (r7 == 0) goto L_0x094e
            X.A5M r7 = r5.A01     // Catch:{ 2RK -> 0x0a33 }
            X.8qH r6 = (X.C170598qH) r6     // Catch:{ 2RK -> 0x0a33 }
            X.1BI r45 = r6.getChatJid()     // Catch:{ 2RK -> 0x0a33 }
            r49 = 5
            r50 = 4
        L_0x0a22:
            r47 = r12
            r52 = r3
            r44 = r7
            r46 = r12
            r51 = r3
            r44.A03(r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ 2RK -> 0x0a33 }
            goto L_0x094e
        L_0x0a31:
            r3 = move-exception
            throw r3     // Catch:{ 2RK -> 0x0a36 }
        L_0x0a33:
            r7 = move-exception
            goto L_0x0c63
        L_0x0a36:
            r7 = move-exception
            goto L_0x0c63
        L_0x0a39:
            java.util.Iterator r25 = r33.iterator()     // Catch:{ all -> 0x0cb8 }
        L_0x0a3d:
            boolean r6 = r25.hasNext()     // Catch:{ all -> 0x0cb8 }
            if (r6 == 0) goto L_0x0afa
            java.lang.Object r9 = r25.next()     // Catch:{ all -> 0x0cb8 }
            X.2E2 r9 = (X.AnonymousClass2E2) r9     // Catch:{ all -> 0x0cb8 }
            r7 = 6
            int r6 = r9.reason     // Catch:{ all -> 0x0cb8 }
            if (r7 != r6) goto L_0x0ae9
            X.1Rs r8 = r5.A0G     // Catch:{ all -> 0x0cb8 }
            int r14 = r9.version     // Catch:{ all -> 0x0cb8 }
            X.2rJ r10 = r9.operation     // Catch:{ all -> 0x0cb8 }
            java.lang.String r7 = r9.index     // Catch:{ all -> 0x0cb8 }
            if (r7 == 0) goto L_0x0ae3
            byte[] r13 = r9.mutationMac     // Catch:{ all -> 0x0cb8 }
            X.A2n r6 = r9.syncdKeyId     // Catch:{ all -> 0x0cb8 }
            if (r6 == 0) goto L_0x0add
            X.8cn r11 = r9.syncActionValue     // Catch:{ all -> 0x0cb8 }
            X.1Oq r9 = r8.A00     // Catch:{ all -> 0x0cb8 }
            X.1au r16 = r9.A06()     // Catch:{ all -> 0x0cb8 }
            X.1xA r15 = r16.BD0()     // Catch:{ all -> 0x0ad1 }
            X.2rJ r9 = X.C62382rJ.A02     // Catch:{ all -> 0x0ac7 }
            if (r10 != r9) goto L_0x0a94
            r6 = r16
            X.1av r6 = (X.C28801av) r6     // Catch:{ all -> 0x0ac7 }
            X.1Ev r9 = r6.A02     // Catch:{ all -> 0x0ac7 }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ac7 }
            java.lang.String r6 = "DELETE FROM syncd_mutations WHERE mutation_index IN "
            r8.append(r6)     // Catch:{ all -> 0x0ac7 }
            java.lang.String r6 = X.AnonymousClass1H2.A00(r18)     // Catch:{ all -> 0x0ac7 }
            java.lang.String r8 = X.AnonymousClass000.A0y(r6, r8)     // Catch:{ all -> 0x0ac7 }
            r6 = r18
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch:{ all -> 0x0ac7 }
            r10[r3] = r7     // Catch:{ all -> 0x0ac7 }
            java.lang.String r6 = "SyncdMutationsStore.addUnsupportedMutation"
            r9.A0F(r8, r6, r10)     // Catch:{ all -> 0x0ac7 }
        L_0x0a90:
            r15.A00()     // Catch:{ all -> 0x0ac7 }
            goto L_0x0abf
        L_0x0a94:
            X.2rJ r9 = X.C62382rJ.A03     // Catch:{ all -> 0x0ac7 }
            if (r10 != r9) goto L_0x0a90
            r9 = r16
            X.1av r9 = (X.C28801av) r9     // Catch:{ all -> 0x0ac7 }
            X.1Ev r9 = r9.A02     // Catch:{ all -> 0x0ac7 }
            X.C17960vV.A07(r11)     // Catch:{ all -> 0x0ac7 }
            byte[] r38 = r11.A0M()     // Catch:{ all -> 0x0ac7 }
            java.lang.String r37 = X.A4M.A00(r7)     // Catch:{ all -> 0x0ac7 }
            r31 = r9
            r32 = r8
            r33 = r6
            r34 = r12
            r35 = r7
            r36 = r57
            r39 = r13
            r40 = r14
            r41 = r18
            X.C26331Rs.A04(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0ac7 }
            goto L_0x0a90
        L_0x0abf:
            r15.close()     // Catch:{ all -> 0x0ad1 }
            r16.close()     // Catch:{ all -> 0x0cb8 }
            goto L_0x0a3d
        L_0x0ac7:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0acc }
            goto L_0x0ad0
        L_0x0acc:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0ad1 }
        L_0x0ad0:
            throw r1     // Catch:{ all -> 0x0ad1 }
        L_0x0ad1:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0ad7 }
            goto L_0x0cb7
        L_0x0ad7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0cb7
        L_0x0add:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r23)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0cb7
        L_0x0ae3:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r23)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0cb7
        L_0x0ae9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cb8 }
            java.lang.String r0 = "unexpected reason="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r6)     // Catch:{ all -> 0x0cb8 }
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0cb7
        L_0x0afa:
            X.2mC r9 = r0.A00     // Catch:{ all -> 0x0cb8 }
            r44 = 1
            if (r60 == 0) goto L_0x0b02
            r44 = 0
        L_0x0b02:
            if (r59 == 0) goto L_0x0b0d
            int r0 = r2.A0J(r12)     // Catch:{ all -> 0x0cb8 }
            java.lang.Long r34 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0b0f
        L_0x0b0d:
            r34 = r12
        L_0x0b0f:
            if (r60 == 0) goto L_0x0b1a
            int r0 = r4.A0J(r12)     // Catch:{ all -> 0x0cb8 }
            java.lang.Long r35 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0b1c
        L_0x0b1a:
            r35 = r12
        L_0x0b1c:
            if (r20 == 0) goto L_0x0b23
            r0 = r20
            byte[] r8 = r0.A01     // Catch:{ all -> 0x0cb8 }
            goto L_0x0b24
        L_0x0b23:
            r8 = r12
        L_0x0b24:
            if (r1 == 0) goto L_0x0b2b
            byte[] r3 = r1.A01     // Catch:{ all -> 0x0cb8 }
            byte[] r0 = r1.A02     // Catch:{ all -> 0x0cb8 }
            goto L_0x0b2d
        L_0x0b2b:
            r3 = r12
            r0 = r12
        L_0x0b2d:
            if (r60 == 0) goto L_0x0b38
            X.8Xv r6 = r4.version_     // Catch:{ all -> 0x0cb8 }
            if (r6 != 0) goto L_0x0b42
            X.8Xv r6 = X.C164178Xv.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
            if (r6 == 0) goto L_0x0b49
            goto L_0x0b42
        L_0x0b38:
            if (r59 == 0) goto L_0x0b49
            X.8Xv r6 = r2.version_     // Catch:{ all -> 0x0cb8 }
            if (r6 != 0) goto L_0x0b42
            X.8Xv r6 = X.C164178Xv.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
            if (r6 == 0) goto L_0x0b49
        L_0x0b42:
            long r6 = r6.version_     // Catch:{ all -> 0x0cb8 }
            java.lang.Long r36 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0b4b
        L_0x0b49:
            r36 = r12
        L_0x0b4b:
            if (r1 == 0) goto L_0x0b55
            boolean r6 = r1.A00     // Catch:{ all -> 0x0cb8 }
            r1 = r18
            if (r6 != r1) goto L_0x0b55
            java.lang.String r12 = "error: client_error message: 60 snapshot_mac_mismatch_in_patch"
        L_0x0b55:
            r1 = 0
            X.2n3 r6 = new X.2n3     // Catch:{ all -> 0x0cb8 }
            r31 = r6
            r32 = r9
            r33 = r24
            r37 = r57
            r38 = r12
            r39 = r8
            r40 = r3
            r41 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0b94
        L_0x0b6c:
            X.8Xv r0 = r2.version_     // Catch:{ all -> 0x0cb8 }
            if (r0 != 0) goto L_0x0b74
            X.8Xv r0 = X.C164178Xv.DEFAULT_INSTANCE     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0b7a
        L_0x0b74:
            long r0 = r0.version_     // Catch:{ all -> 0x0cb8 }
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0cb8 }
        L_0x0b7a:
            java.lang.String r38 = "error: client_error message: keyMap contains null value, retry"
            r32 = 0
            r1 = 0
            X.2n3 r6 = new X.2n3     // Catch:{ all -> 0x0cb8 }
            r41 = r32
            r42 = r32
            r31 = r6
            r33 = r24
            r36 = r12
            r37 = r57
            r40 = r32
            r43 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x0cb8 }
        L_0x0b94:
            byte[] r8 = r6.A0A     // Catch:{ all -> 0x0cb8 }
            if (r8 != 0) goto L_0x0ba3
            r28.A00()     // Catch:{ all -> 0x0cb8 }
            r28.close()     // Catch:{ all -> 0x0cc1 }
            r29.close()     // Catch:{ 1Tq -> 0x0cca }
            monitor-exit(r19)
            return r1
        L_0x0ba3:
            r9 = 0
            r7 = r56
            r3 = r57
            r0 = r26
            r7.A05(r3, r8, r0)     // Catch:{ all -> 0x0cb8 }
            r28.A00()     // Catch:{ all -> 0x0cb8 }
            if (r65 == 0) goto L_0x0c4e
            X.1Tb r3 = r5.A02     // Catch:{ all -> 0x0cb8 }
            if (r60 == 0) goto L_0x0bb7
            r9 = 1
        L_0x0bb7:
            X.2H1 r1 = new X.2H1     // Catch:{ all -> 0x0cb8 }
            r1.<init>()     // Catch:{ all -> 0x0cb8 }
            r8 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0cb8 }
            r1.A05 = r0     // Catch:{ all -> 0x0cb8 }
            java.util.Set r7 = X.C20126A8l.A09     // Catch:{ all -> 0x0cb8 }
            r0 = r57
            boolean r0 = r7.contains(r0)     // Catch:{ all -> 0x0cb8 }
            if (r0 != 0) goto L_0x0bce
            r8 = 2
        L_0x0bce:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0cb8 }
            r1.A04 = r0     // Catch:{ all -> 0x0cb8 }
            java.lang.String r0 = X.C26681Tb.A00(r3)     // Catch:{ all -> 0x0cb8 }
            r1.A0A = r0     // Catch:{ all -> 0x0cb8 }
            int r0 = r57.hashCode()     // Catch:{ all -> 0x0cb8 }
            switch(r0) {
                case -849492943: goto L_0x0c15;
                case -564602779: goto L_0x0c0a;
                case -498584183: goto L_0x0bff;
                case 207170541: goto L_0x0bf4;
                case 1086463900: goto L_0x0be9;
                default: goto L_0x0be1;
            }     // Catch:{ all -> 0x0cb8 }
        L_0x0be1:
            java.lang.String r0 = "CompanionSyncStatsLogger/convertToWamCollection received undefined collection name"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0cb7
        L_0x0be9:
            java.lang.String r7 = "regular"
            r0 = r57
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0be1
            goto L_0x0c20
        L_0x0bf4:
            java.lang.String r7 = "critical_block"
            r0 = r57
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0be1
            goto L_0x0c22
        L_0x0bff:
            java.lang.String r7 = "critical_unblock_low"
            r0 = r57
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0be1
            goto L_0x0c24
        L_0x0c0a:
            java.lang.String r7 = "regular_high"
            r0 = r57
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0be1
            goto L_0x0c26
        L_0x0c15:
            java.lang.String r7 = "regular_low"
            r0 = r57
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0be1
            goto L_0x0c28
        L_0x0c20:
            r0 = 1
            goto L_0x0c29
        L_0x0c22:
            r0 = 4
            goto L_0x0c29
        L_0x0c24:
            r0 = 5
            goto L_0x0c29
        L_0x0c26:
            r0 = 3
            goto L_0x0c29
        L_0x0c28:
            r0 = 2
        L_0x0c29:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0cb8 }
            r1.A02 = r0     // Catch:{ all -> 0x0cb8 }
            X.11P r0 = r3.A01     // Catch:{ all -> 0x0cb8 }
            long r7 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0cb8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0cb8 }
            r1.A09 = r0     // Catch:{ all -> 0x0cb8 }
            long r7 = r7 - r21
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0cb8 }
            r1.A08 = r0     // Catch:{ all -> 0x0cb8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0cb8 }
            r1.A01 = r0     // Catch:{ all -> 0x0cb8 }
            X.18K r0 = r3.A02     // Catch:{ all -> 0x0cb8 }
            r0.CC7(r1)     // Catch:{ all -> 0x0cb8 }
        L_0x0c4e:
            r28.close()     // Catch:{ all -> 0x0cc1 }
            r29.close()     // Catch:{ 1Tq -> 0x0cca }
            if (r66 == 0) goto L_0x0c60
            X.1Rw r1 = r5.A05     // Catch:{ 1Tq -> 0x0cca }
            r0 = r30
            r1.A0H(r0)     // Catch:{ 1Tq -> 0x0cca }
            r1.A0F(r6)     // Catch:{ 1Tq -> 0x0cca }
        L_0x0c60:
            monitor-exit(r19)
            return r18
        L_0x0c62:
            r7 = move-exception
        L_0x0c63:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cb8 }
            java.lang.String r3 = "SyncResponseHandler/applyMutations cyclic mutation e="
            X.C17900vP.A0X(r7, r3, r6)     // Catch:{ all -> 0x0cb8 }
            X.2mC r0 = r0.A00     // Catch:{ all -> 0x0cb8 }
            if (r20 == 0) goto L_0x0c75
            r3 = r20
            byte[] r3 = r3.A01     // Catch:{ all -> 0x0cb8 }
            goto L_0x0c76
        L_0x0c75:
            r3 = r12
        L_0x0c76:
            if (r1 == 0) goto L_0x0c79
            goto L_0x0c7b
        L_0x0c79:
            r1 = r12
            goto L_0x0c7f
        L_0x0c7b:
            byte[] r12 = r1.A01     // Catch:{ all -> 0x0cb8 }
            byte[] r1 = r1.A02     // Catch:{ all -> 0x0cb8 }
        L_0x0c7f:
            r39 = 39
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r31 = r7
            r32 = r0
            r33 = r24
            r34 = r57
            r35 = r42
            r36 = r3
            r37 = r12
            r38 = r1
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0ca6
        L_0x0c97:
            r8 = 0
            r15 = 12
            X.1Tq r7 = new X.1Tq     // Catch:{ all -> 0x0cb8 }
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r9 = r8
            r10 = r57
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0cb8 }
        L_0x0ca6:
            throw r7     // Catch:{ all -> 0x0cb8 }
        L_0x0ca7:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r23)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0cb7
        L_0x0cac:
            java.lang.String r0 = "patch XOR snapshot must be non null"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0cb8 }
            goto L_0x0cb7
        L_0x0cb3:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r23)     // Catch:{ all -> 0x0cb8 }
        L_0x0cb7:
            throw r1     // Catch:{ all -> 0x0cb8 }
        L_0x0cb8:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0cba }
        L_0x0cba:
            r1 = move-exception
            r0 = r28
            X.CDX.A00(r0, r3)     // Catch:{ all -> 0x0cc1 }
            throw r1     // Catch:{ all -> 0x0cc1 }
        L_0x0cc1:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0cc3 }
        L_0x0cc3:
            r1 = move-exception
            r0 = r29
            X.CDX.A00(r0, r3)     // Catch:{ 1Tq -> 0x0cca }
            throw r1     // Catch:{ 1Tq -> 0x0cca }
        L_0x0cca:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0d76 }
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches applyMutations ex="
            X.C17900vP.A0X(r6, r0, r1)     // Catch:{ all -> 0x0d76 }
            if (r59 == 0) goto L_0x0d0b
            int r0 = r2.bitField0_     // Catch:{ all -> 0x0d76 }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0d0b
            int r7 = r2.deviceIndex_     // Catch:{ all -> 0x0d76 }
            X.1RK r0 = r5.A0E     // Catch:{ all -> 0x0d76 }
            X.4Zh r3 = r0.A05(r7)     // Catch:{ all -> 0x0d76 }
            if (r3 == 0) goto L_0x0d0b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0d76 }
            java.lang.String r0 = "SyncResponseHandler/logCompanionInfo companion: "
            r1.append(r0)     // Catch:{ all -> 0x0d76 }
            r1.append(r7)     // Catch:{ all -> 0x0d76 }
            java.lang.String r0 = "; ["
            r1.append(r0)     // Catch:{ all -> 0x0d76 }
            X.2RG r0 = r3.A09     // Catch:{ all -> 0x0d76 }
            r1.append(r0)     // Catch:{ all -> 0x0d76 }
            r0 = 40
            r1.append(r0)     // Catch:{ all -> 0x0d76 }
            java.lang.String r0 = r3.A0A     // Catch:{ all -> 0x0d76 }
            r1.append(r0)     // Catch:{ all -> 0x0d76 }
            java.lang.String r0 = ")]"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0d76 }
        L_0x0d0b:
            if (r66 == 0) goto L_0x0d75
            X.1Rw r7 = r5.A05     // Catch:{ all -> 0x0d76 }
            r0 = r30
            r7.A0H(r0)     // Catch:{ all -> 0x0d76 }
            X.A2n r5 = r6.keyId     // Catch:{ all -> 0x0d76 }
            X.2mC r3 = r6.keyData     // Catch:{ all -> 0x0d76 }
            r33 = r17 ^ 1
            r8 = 0
            if (r59 == 0) goto L_0x0d26
            int r0 = r2.A0J(r8)     // Catch:{ all -> 0x0d76 }
            java.lang.Long r23 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0d76 }
            goto L_0x0d28
        L_0x0d26:
            r23 = r8
        L_0x0d28:
            if (r60 == 0) goto L_0x0d32
            int r0 = r4.A0J(r8)     // Catch:{ all -> 0x0d76 }
            java.lang.Long r8 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0d76 }
        L_0x0d32:
            byte[] r4 = r6.calculatedPatchMac     // Catch:{ all -> 0x0d76 }
            byte[] r2 = r6.calculatedSnapshotMac     // Catch:{ all -> 0x0d76 }
            byte[] r1 = r6.expectedMac     // Catch:{ all -> 0x0d76 }
            byte[] r0 = r6.ltHash     // Catch:{ all -> 0x0d76 }
            java.lang.Long r25 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0d76 }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0d76 }
            java.lang.String r9 = "error: fatal message: "
            r10.append(r9)     // Catch:{ all -> 0x0d76 }
            int r9 = r6.errorCode     // Catch:{ all -> 0x0d76 }
            r10.append(r9)     // Catch:{ all -> 0x0d76 }
            r9 = 32
            r10.append(r9)     // Catch:{ all -> 0x0d76 }
            java.lang.String r9 = r6.getMessage()     // Catch:{ all -> 0x0d76 }
            java.lang.String r27 = X.AnonymousClass000.A0y(r9, r10)     // Catch:{ all -> 0x0d76 }
            r32 = 0
            X.2n3 r9 = new X.2n3     // Catch:{ all -> 0x0d76 }
            r20 = r9
            r21 = r3
            r22 = r5
            r24 = r8
            r26 = r57
            r28 = r4
            r29 = r2
            r30 = r1
            r31 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0d76 }
            r7.A0F(r9)     // Catch:{ all -> 0x0d76 }
        L_0x0d75:
            throw r6     // Catch:{ all -> 0x0d76 }
        L_0x0d76:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        L_0x0d79:
            java.lang.String r0 = "patch XOR snapshot must be non null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63922tu.A05(X.2BT, X.2BK, java.lang.String, java.util.List, long, boolean, boolean):boolean");
    }
}
