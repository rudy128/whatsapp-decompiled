package X;

/* renamed from: X.3Bs  reason: invalid class name and case insensitive filesystem */
public class C70593Bs implements Runnable {
    public final int A00;
    public final Object A01;

    public C70593Bs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v6, types: [java.lang.Object, X.2k5] */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03ac, code lost:
        if (X.C17900vP.A02(r9).getInt("account_sync_blocklist_num_retries", 0) > 0) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04fc, code lost:
        X.AnonymousClass34U.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04ff, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0672, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0676, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0679, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x067d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0742, code lost:
        com.whatsapp.migration.export.ui.ExportMigrationActivity.A03(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0745, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0776, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0777, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x07a6, code lost:
        X.C18070vi.A11(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x07aa, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x02bf;
                case 1: goto L_0x02d1;
                case 2: goto L_0x02bf;
                case 3: goto L_0x02df;
                case 4: goto L_0x000d;
                case 5: goto L_0x02ef;
                case 6: goto L_0x03b9;
                case 7: goto L_0x008a;
                case 8: goto L_0x0472;
                case 9: goto L_0x010c;
                case 10: goto L_0x04e9;
                case 11: goto L_0x04f1;
                case 12: goto L_0x04f7;
                case 13: goto L_0x0500;
                case 14: goto L_0x0508;
                case 15: goto L_0x051c;
                case 16: goto L_0x0524;
                case 17: goto L_0x052c;
                case 18: goto L_0x053c;
                case 19: goto L_0x0549;
                case 20: goto L_0x0134;
                case 21: goto L_0x0578;
                case 22: goto L_0x0155;
                case 23: goto L_0x0583;
                case 24: goto L_0x05bb;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x05e2;
                case 28: goto L_0x05fe;
                case 29: goto L_0x01c5;
                case 30: goto L_0x01e2;
                case 31: goto L_0x0205;
                case 32: goto L_0x06ad;
                case 33: goto L_0x021a;
                case 34: goto L_0x0242;
                case 35: goto L_0x06b5;
                case 36: goto L_0x06c5;
                case 37: goto L_0x06d1;
                case 38: goto L_0x06db;
                case 39: goto L_0x06e5;
                case 40: goto L_0x06ed;
                case 41: goto L_0x06f5;
                case 42: goto L_0x0709;
                case 43: goto L_0x072e;
                case 44: goto L_0x0746;
                case 45: goto L_0x026b;
                case 46: goto L_0x074e;
                case 47: goto L_0x03c7;
                case 48: goto L_0x029a;
                case 49: goto L_0x0758;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            X.1fG r0 = (X.C31251fG) r0
            r0.A05()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r7 = r14.A01
            X.2si r7 = (X.C63222si) r7
            X.00H r0 = r7.A0R
            X.11S r0 = X.C17880vN.A0H(r0)
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A01(r0)
            java.lang.String r0 = r0.user
            java.lang.String r6 = X.C181659Ri.A00(r0)
            X.0ve r2 = r7.A06
            r1 = 693(0x2b5, float:9.71E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0056
            X.00H r0 = r7.A0s
            android.content.SharedPreferences r1 = X.C17900vP.A02(r0)
            java.lang.String r0 = "pref_deprecate_rc"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x000c
            X.00H r0 = r7.A0m
            java.lang.Object r0 = r0.get()
            X.1Mn r0 = (X.C25011Mn) r0
            byte[] r3 = X.C17970vW.A0H()
            r2 = 0
        L_0x0048:
            X.00H r0 = r0.A01
            X.1OZ r1 = X.C17880vN.A0U(r0)
            android.os.Message r0 = X.C63902ts.A04(r6, r3, r2)
            r1.A0M(r0)
            return
        L_0x0056:
            X.118 r0 = r7.A05
            android.content.Context r5 = r0.A00
            java.lang.Boolean r0 = X.C17970vW.A03
            java.io.File r1 = r5.getFilesDir()
            java.lang.String r0 = "rc2"
            java.io.File r1 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x007c
            long r3 = r1.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007c
            byte[] r0 = X.C17970vW.A0J(r5, r6)
            if (r0 != 0) goto L_0x000c
        L_0x007c:
            X.00H r0 = r7.A0m
            java.lang.Object r0 = r0.get()
            X.1Mn r0 = (X.C25011Mn) r0
            byte[] r3 = X.C17970vW.A0H()
            r2 = 1
            goto L_0x0048
        L_0x008a:
            java.lang.Object r3 = r14.A01
            X.1U4 r3 = (X.AnonymousClass1U4) r3
            boolean r0 = X.AnonymousClass1U4.A02(r3)
            if (r0 == 0) goto L_0x000c
            X.11P r0 = r3.A01
            long r12 = X.AnonymousClass11P.A01(r0)
            X.0z4 r0 = r3.A02
            X.00H r9 = r0.A00
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r9)
            java.lang.String r0 = "adv_key_index_list_require_update"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x0104
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.2jQ r0 = (X.C57652jQ) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "update_key_index_list_chatd_connect"
            X.AnonymousClass1U4.A01(r3, r0)
            return
        L_0x00bf:
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r9)
            java.lang.String r0 = "adv_key_index_list_last_failure_time"
            long r10 = X.C17890vO.A05(r1, r0)
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r9)
            java.lang.String r0 = "adv_key_index_list_update_retry_count"
            int r8 = X.C17890vO.A00(r1, r0)
            long[] r1 = X.AnonymousClass1U4.A0B
            r0 = 3
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r8 > r0) goto L_0x0108
            if (r8 <= 0) goto L_0x0108
            int r0 = r8 + -1
            r4 = r1[r0]
        L_0x00e1:
            long r1 = r12 - r10
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x000c
            if (r8 > 0) goto L_0x0104
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r9)
            java.lang.String r0 = "adv_key_index_list_last_update_time"
            long r0 = X.C17890vO.A05(r1, r0)
            long r12 = r12 - r0
            X.0ve r2 = r3.A04
            r1 = 477(0x1dd, float:6.68E-43)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            long r1 = (long) r0
            long r1 = r1 * r6
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x000c
        L_0x0104:
            r3.A03()
            return
        L_0x0108:
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x00e1
        L_0x010c:
            java.lang.Object r0 = r14.A01
            X.2si r0 = (X.C63222si) r0
            X.00H r0 = r0.A0f
            java.lang.Object r2 = r0.get()
            X.1Rj r2 = (X.C26241Rj) r2
            java.util.Set r1 = r2.A0D
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r1.clear()
            java.util.Iterator r1 = r0.iterator()
        L_0x0126:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000c
            X.1BI r0 = X.C17880vN.A0Q(r1)
            r2.A0B(r0)
            goto L_0x0126
        L_0x0134:
            java.lang.Object r8 = r14.A01
            X.1gL r8 = (X.C31921gL) r8
            java.util.Map r7 = r8.A02
            int r0 = r7.size()
            if (r0 == 0) goto L_0x000c
            java.util.Iterator r6 = X.C17890vO.A0l(r7)
            r4 = 0
        L_0x0146:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0760
            long r2 = X.C17890vO.A07(r6)
            r0 = 1
            long r2 = r2 - r0
            long r4 = r4 + r2
            goto L_0x0146
        L_0x0155:
            java.lang.Object r4 = r14.A01
            X.1fW r4 = (X.C31411fW) r4
            X.0ve r2 = r4.A0B
            X.0vf r1 = X.C18040vf.A01
            r0 = 8832(0x2280, float:1.2376E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x000c
            monitor-enter(r4)
            X.0vl r5 = r4.A0E     // Catch:{ all -> 0x0778 }
            android.content.SharedPreferences r3 = X.C17880vN.A0C(r5)     // Catch:{ all -> 0x0778 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0778 }
            java.lang.String r2 = "attempt_metrics_list_proto"
            r0 = 0
            r1 = 0
            java.lang.String r0 = r3.getString(r2, r0)     // Catch:{ all -> 0x0778 }
            if (r0 == 0) goto L_0x0776
            byte[] r1 = android.util.Base64.decode(r0, r1)     // Catch:{ all -> 0x0778 }
            if (r1 == 0) goto L_0x0776
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A0A(r5)     // Catch:{ all -> 0x0778 }
            X.C17880vN.A1B(r0, r2)     // Catch:{ all -> 0x0778 }
            monitor-exit(r4)
            X.2B7 r0 = X.AnonymousClass2B7.DEFAULT_INSTANCE
            X.Bm6 r3 = X.C23577Bm6.A07(r0, r1)
            X.2B7 r3 = (X.AnonymousClass2B7) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OfflineResumeMetrics/logPersistedMetricsAsAppRestarted count="
            r2.append(r0)
            X.EE9 r0 = r3.attemptMetrics_
            int r0 = r0.size()
            r2.append(r0)
            java.lang.String r0 = " persistedAt="
            r2.append(r0)
            long r0 = r3.lastPersistedAtUptimeMillis_
            X.C17890vO.A16(r2, r0)
            X.EE9 r0 = r3.attemptMetrics_
            java.util.Iterator r2 = r0.iterator()
        L_0x01b1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r1 = r2.next()
            X.2BZ r1 = (X.AnonymousClass2BZ) r1
            X.C18070vi.A0b(r1)
            r0 = 4
            X.C31411fW.A02(r4, r1, r0)
            goto L_0x01b1
        L_0x01c5:
            java.lang.Object r4 = r14.A01
            X.352 r4 = (X.AnonymousClass352) r4
            X.1fG r0 = r4.A01
            X.2mG r3 = r0.A02()
            if (r3 == 0) goto L_0x000c
            java.lang.String r0 = "PreacksQueueOfflineResume/onOfflineResumeCompleted/confirm-pending-acks-received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1cq r2 = r4.A00
            r1 = 0
            X.AkP r0 = new X.AkP
            r0.<init>(r4, r3, r1)
            r2.A0B(r0)
            return
        L_0x01e2:
            java.lang.Object r1 = r14.A01
            X.1dT r1 = (X.C30151dT) r1
            r0 = 0
            r1.A01 = r0
            X.1dn r6 = r1.A00
            if (r6 == 0) goto L_0x000c
            java.lang.Long r1 = r6.A05
            X.19T r0 = r6.A09
            long r4 = r0.currentMonotonicTimestampNanos()
            if (r1 == 0) goto L_0x000c
            long r2 = r6.A03
            long r0 = r1.longValue()
            long r4 = r4 - r0
            long r2 = r2 + r4
            r6.A03 = r2
            r0 = 0
            r6.A05 = r0
            return
        L_0x0205:
            java.lang.Object r1 = r14.A01
            X.1dT r1 = (X.C30151dT) r1
            X.C30151dT.A01(r1)
            X.1dn r3 = r1.A00
            if (r3 == 0) goto L_0x000c
            java.lang.Integer r0 = r3.A04
            if (r0 == 0) goto L_0x077b
            java.lang.String r0 = "log_invalid_conn_double_start"
            X.C30151dT.A03(r1, r0)
            return
        L_0x021a:
            java.lang.Object r0 = r14.A01
            X.6AT r0 = (X.AnonymousClass6AT) r0
            X.17r r0 = r0.A02
            java.lang.String r1 = "tmpi"
            java.io.File r0 = r0.A0G()
            java.io.File r2 = X.C218617r.A02(r0, r1)
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x000c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MetaAiVoiceImageResponseComponent/failed-delete-file"
            r1.append(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            X.C17890vO.A1B(r1, r0)
            return
        L_0x0242:
            java.lang.Object r4 = r14.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r4 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r4
            X.00H r0 = r4.A0R
            java.lang.Object r0 = r0.get()
            X.1Ps r0 = (X.C25811Ps) r0
            X.1E7 r0 = r0.A02()
            if (r0 == 0) goto L_0x000c
            X.1BI r0 = r0.A0J
            if (r0 == 0) goto L_0x000c
            java.lang.String r3 = r0.getRawString()
            if (r3 == 0) goto L_0x000c
            X.1KB r2 = r4.A0H
            r1 = 35
            X.7Qs r0 = new X.7Qs
            r0.<init>(r1, r3, r4)
            r2.A0J(r0)
            return
        L_0x026b:
            java.lang.Object r3 = r14.A01
            X.1FY r3 = (X.AnonymousClass1FY) r3
            X.0ve r2 = r3.A0E
            r1 = 1374(0x55e, float:1.925E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            long r5 = (long) r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r0
            X.00H r0 = r3.A0C
            java.lang.Object r0 = r0.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r7 = r0.A02()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x000c
            X.1KB r0 = r3.A05
            r4 = 0
            X.Aio r2 = new X.Aio
            r2.<init>(r3, r4, r5, r7)
            r0.A0J(r2)
            return
        L_0x029a:
            java.lang.Object r0 = r14.A01
            com.whatsapp.migration.transfer.ui.ChatTransferActivity r0 = (com.whatsapp.migration.transfer.ui.ChatTransferActivity) r0
            X.00H r0 = r0.A0A
            if (r0 == 0) goto L_0x07a4
            java.lang.Object r1 = r0.get()
            X.9xw r1 = (X.C198189xw) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x000c
            X.00H r0 = r1.A01
            java.lang.Object r3 = r0.get()
            X.A8V r3 = (X.A8V) r3
            java.lang.String r2 = "qr_code_device_switching_having_issues"
            java.lang.String r1 = "view"
            java.lang.String r0 = "qr_code_device_switching"
            r3.A0J(r0, r2, r1)
            return
        L_0x02bf:
            java.lang.Object r0 = r14.A01
            X.2si r0 = (X.C63222si) r0
            X.00H r0 = r0.A0P
            java.lang.Object r2 = r0.get()
            X.1Do r2 = (X.C22881Do) r2
            r1 = 1
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x02d1:
            java.lang.Object r0 = r14.A01
            X.2si r0 = (X.C63222si) r0
            X.1KB r2 = r0.A03
            r1 = 0
            r0 = 2131891827(0x7f121673, float:1.9418385E38)
            r2.A07(r1, r0)
            return
        L_0x02df:
            java.lang.Object r0 = r14.A01
            X.2si r0 = (X.C63222si) r0
            X.00H r0 = r0.A0f
            java.lang.Object r0 = r0.get()
            X.1Rj r0 = (X.C26241Rj) r0
            r0.A09()
            return
        L_0x02ef:
            java.lang.Object r3 = r14.A01
            X.2si r3 = (X.C63222si) r3
            X.00H r0 = r3.A0X
            java.lang.Object r0 = r0.get()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x034d
            X.118 r0 = r3.A05
            android.content.Context r0 = r0.A00
            boolean r0 = X.A85.A05(r0)
            if (r0 == 0) goto L_0x034d
            X.00H r0 = r3.A0R
            X.11S r0 = X.C17880vN.A0H(r0)
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x034d
            r0 = 16
            byte[] r6 = X.C17970vW.A0I(r0)
            byte[] r5 = X.A8L.A05(r6)
            if (r5 == 0) goto L_0x034d
            X.190 r4 = r3.A02
            X.A8L.A02(r4, r5)
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r2 = 1
            int r1 = r6.length
            r0 = 16
            if (r1 == r0) goto L_0x0339
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "crypto-iq-incorrect-account-salt-size"
            r4.A0G(r0, r1, r2)
        L_0x0339:
            X.00H r0 = r3.A0C
            java.lang.Object r2 = r0.get()
            X.1Vs r2 = (X.C27341Vs) r2
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            r0 = 0
            r2.A01(r1, r0, r5, r6)
            java.util.Arrays.toString(r6)
            java.util.Arrays.toString(r5)
        L_0x034d:
            X.00H r0 = r3.A0A
            java.lang.Object r7 = r0.get()
            X.11b r7 = (X.C201611b) r7
            X.2k5 r8 = new X.2k5
            r8.<init>()
            r6 = 1
            r8.A00 = r6
            X.00H r9 = r3.A0s
            android.content.SharedPreferences r1 = X.C17900vP.A02(r9)
            java.lang.String r0 = "account_sync_status_num_retries"
            r2 = 0
            int r0 = r1.getInt(r0, r2)
            r5 = 0
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r8.A06 = r0
            android.content.SharedPreferences r1 = X.C17900vP.A02(r9)
            java.lang.String r0 = "account_sync_picture_num_retries"
            int r0 = r1.getInt(r0, r2)
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r8.A04 = r0
            android.content.SharedPreferences r1 = X.C17900vP.A02(r9)
            java.lang.String r0 = "account_sync_privacy_num_retries"
            int r0 = r1.getInt(r0, r2)
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r8.A05 = r0
            android.content.SharedPreferences r1 = X.C17900vP.A02(r9)
            java.lang.String r0 = "block_list_receive_time"
            r3 = 0
            long r1 = r1.getLong(r0, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x03ae
            android.content.SharedPreferences r1 = X.C17900vP.A02(r9)
            java.lang.String r0 = "account_sync_blocklist_num_retries"
            int r1 = r1.getInt(r0, r5)
            r0 = 0
            if (r1 <= 0) goto L_0x03af
        L_0x03ae:
            r0 = 1
        L_0x03af:
            r8.A01 = r0
            X.2gi r0 = r8.A00()
            r7.A01(r0, r5, r6, r6)
            return
        L_0x03b9:
            java.lang.Object r0 = r14.A01
            X.7Mz r0 = (X.C145887Mz) r0
            r2 = 0
            X.10I r1 = r0.A07
            java.lang.Runnable r0 = r0.A0A
            r1.CGv(r0, r2)
            return
        L_0x03c7:
            java.lang.Object r2 = r14.A01
            com.whatsapp.migration.transfer.ui.ChatTransferActivity r2 = (com.whatsapp.migration.transfer.ui.ChatTransferActivity) r2
            X.11E r1 = r2.A07
            r0 = 1
            int r0 = r1.A03(r0)
            java.lang.String r1 = "chatTransferViewModel"
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r3 = r2.A06
            if (r0 != 0) goto L_0x03ef
            if (r3 == 0) goto L_0x07a6
            X.A7P r2 = r3.A0H
            java.lang.String r1 = "network_connection_check"
            java.lang.String r0 = "failed"
            r2.A07(r1, r0)
            X.1DT r1 = r3.A0D
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0E(r0)
            return
        L_0x03ef:
            if (r3 == 0) goto L_0x07a6
            java.lang.Integer r0 = r3.A02
            r5 = 1
            if (r0 == 0) goto L_0x0461
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0461
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0461
            X.6wq r1 = r3.A0I
            X.00H r0 = r1.A02
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            X.0z4 r2 = r1.A00
            r0 = 84600000(0x50ae4c0, double:4.17979536E-316)
            java.lang.String r6 = "chat_transfer_intent_to_migrate_last_set_timestamp"
            boolean r0 = r2.A2b(r6, r0)
            if (r0 == 0) goto L_0x0461
            X.1DT r1 = r3.A0F
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A0E(r0)
            X.A7P r1 = r3.A0H
            java.lang.String r0 = "intent_to_migrate_flag_set"
            r1.A06(r0)
            X.AMY r1 = r3.A0F
            X.9Xk r0 = new X.9Xk
            r0.<init>(r3)
            X.6wq r4 = r1.A0E
            X.AWA r3 = new X.AWA
            r3.<init>(r1, r0)
            X.00H r0 = r4.A02
            r0.get()
            X.0z4 r2 = r4.A00
            r0 = 84600000(0x50ae4c0, double:4.17979536E-316)
            boolean r0 = r2.A2b(r6, r0)
            if (r0 == 0) goto L_0x0458
            java.util.Random r7 = new java.util.Random
            r7.<init>()
            r8 = 3
            r10 = 200(0xc8, double:9.9E-322)
            r12 = 1000(0x3e8, double:4.94E-321)
            X.1NV r6 = new X.1NV
            r6.<init>(r7, r8, r10, r12)
            X.C138296wq.A00(r3, r4, r6, r5)
            return
        L_0x0458:
            java.lang.String r0 = "p2p/fpm/IntentToMigrateHandler/setIntentToMigrateFlagOnServer/skipping bc intent to migrate flag was already set"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.onSuccess()
            return
        L_0x0461:
            X.1DT r1 = r3.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A0E(r0)
            X.A7P r1 = r3.A0H
            java.lang.String r0 = "permissions_check"
            r1.A06(r0)
            return
        L_0x0472:
            java.lang.Object r1 = r14.A01
            X.2si r1 = (X.C63222si) r1
            X.00H r0 = r1.A0l
            java.lang.Object r5 = r0.get()
            X.1hs r5 = (X.C32861hs) r5
            r0 = 46
            X.3Br r4 = new X.3Br
            r4.<init>(r1, r0)
            r7 = 1
            X.1hk r1 = r5.A0K
            monitor-enter(r1)
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x04e6 }
            r0.clear()     // Catch:{ all -> 0x04e6 }
            monitor-exit(r1)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.Object r8 = r5.A0R
            monitor-enter(r8)
            java.util.WeakHashMap r0 = r5.A0S     // Catch:{ all -> 0x04e3 }
            java.util.Iterator r9 = X.C17890vO.A0i(r0)     // Catch:{ all -> 0x04e3 }
        L_0x049c:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x04e3 }
            if (r0 == 0) goto L_0x04cb
            java.util.Map$Entry r6 = X.AnonymousClass000.A16(r9)     // Catch:{ all -> 0x04e3 }
            X.1Sg r2 = r5.A0I     // Catch:{ all -> 0x04e3 }
            java.lang.Object r1 = r6.getValue()     // Catch:{ all -> 0x04e3 }
            X.85B r1 = (X.AnonymousClass85B) r1     // Catch:{ all -> 0x04e3 }
            monitor-enter(r2)     // Catch:{ all -> 0x04e3 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x04c8 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x04c8 }
            monitor-exit(r2)     // Catch:{ all -> 0x04e3 }
            if (r0 == 0) goto L_0x049c
            java.lang.Object r0 = r6.getKey()     // Catch:{ all -> 0x04e3 }
            X.2tS r0 = (X.C63642tS) r0     // Catch:{ all -> 0x04e3 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A03     // Catch:{ all -> 0x04e3 }
            java.util.List r0 = X.C29431cG.A0t(r0)     // Catch:{ all -> 0x04e3 }
            r3.addAll(r0)     // Catch:{ all -> 0x04e3 }
            goto L_0x049c
        L_0x04c8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04e3 }
            throw r0     // Catch:{ all -> 0x04e3 }
        L_0x04cb:
            monitor-exit(r8)     // Catch:{ all -> 0x04e3 }
            r0 = 0
            X.2Bs r2 = new X.2Bs
            r2.<init>(r5, r3, r7, r0)
            X.10I r0 = r5.A0M
            r0.CGF(r2)
            r0 = 3
            X.3AW r1 = new X.3AW
            r1.<init>(r4, r5, r3, r0)
            java.util.concurrent.Executor r0 = r5.A0T
            r2.A0A(r1, r0)
            return
        L_0x04e3:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x04e3 }
            throw r0
        L_0x04e6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x04e9:
            java.lang.Object r0 = r14.A01
            X.1dI r0 = (X.C30041dI) r0
            r0.A00()
            return
        L_0x04f1:
            java.lang.Object r1 = r14.A01
            X.34U r1 = (X.AnonymousClass34U) r1
            r0 = 0
            goto L_0x04fc
        L_0x04f7:
            java.lang.Object r1 = r14.A01
            X.34U r1 = (X.AnonymousClass34U) r1
            r0 = 1
        L_0x04fc:
            X.AnonymousClass34U.A00(r1, r0)
            return
        L_0x0500:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            X.C29631cb.A00(r0)
            return
        L_0x0508:
            java.lang.Object r2 = r14.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = "messageservice/stopService"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Class<com.whatsapp.messaging.MessageService> r1 = com.whatsapp.messaging.MessageService.class
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r2.stopService(r0)
            return
        L_0x051c:
            java.lang.Object r0 = r14.A01
            X.1To r0 = (X.C26811To) r0
            r0.A0J()
            return
        L_0x0524:
            java.lang.Object r0 = r14.A01
            X.2Ko r0 = (X.C47942Ko) r0
            r0.A01()
            return
        L_0x052c:
            java.lang.Object r1 = r14.A01
            X.1kN r1 = (X.C34371kN) r1
            X.120 r0 = r1.A00
            r0.A03()
            X.0z4 r1 = r1.A02
            r0 = 0
            r1.A2A(r0)
            return
        L_0x053c:
            java.lang.Object r0 = r14.A01
            X.2kG r0 = (X.C58172kG) r0
            X.1lt r2 = r0.A00
            X.2sw r1 = r0.A01
            r0 = 0
            X.C35241lt.A00(r2, r0, r1)
            return
        L_0x0549:
            java.lang.Object r1 = r14.A01
            X.2kG r1 = (X.C58172kG) r1
            X.1lt r0 = r1.A00
            X.2sw r6 = r1.A01
            X.1WM r5 = r0.A05
            X.205 r1 = r6.A0B
            long r3 = r6.A0X
            r0 = 11
            X.2M1 r2 = new X.2M1
            r2.<init>(r1, r0, r3)
            r2.A1A(r3)
            com.whatsapp.jid.Jid r0 = r6.A0Y
            X.1BI r0 = X.C22971Dz.A00(r0)
            r2.A0d(r0)
            r0 = -1
            r2.A02 = r0
            r0 = 16
            r2.A0a(r0)
            r0 = 0
            X.AnonymousClass1WM.A00(r5, r2, r0)
            return
        L_0x0578:
            java.lang.Object r0 = r14.A01
            X.1ft r0 = (X.C31641ft) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A02
            r0 = 0
            r1.set(r0)
            return
        L_0x0583:
            java.lang.Object r4 = r14.A01
            X.1fW r4 = (X.C31411fW) r4
            monitor-enter(r4)
            r3 = 1
            X.C31411fW.A03(r4, r3)     // Catch:{ all -> 0x06aa }
            java.util.Map r1 = r4.A0D     // Catch:{ all -> 0x06aa }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x06aa }
            if (r0 != 0) goto L_0x0776
            r1.size()     // Catch:{ all -> 0x06aa }
            java.util.Iterator r2 = X.C17890vO.A0l(r1)     // Catch:{ all -> 0x06aa }
        L_0x059b:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x06aa }
            if (r0 == 0) goto L_0x05b6
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x06aa }
            X.2B0 r0 = (X.AnonymousClass2B0) r0     // Catch:{ all -> 0x06aa }
            X.2BZ r1 = X.C17880vN.A0W(r0)     // Catch:{ all -> 0x06aa }
            int r0 = X.AnonymousClass2BZ.ACTIVE_MODE_UPTIME_MILLIS_FIELD_NUMBER     // Catch:{ all -> 0x06aa }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x06aa }
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0     // Catch:{ all -> 0x06aa }
            r1.disconnected_ = r3     // Catch:{ all -> 0x06aa }
            goto L_0x059b
        L_0x05b6:
            X.C31411fW.A00(r4)     // Catch:{ all -> 0x06aa }
            goto L_0x0776
        L_0x05bb:
            java.lang.Object r4 = r14.A01
            X.2jl r4 = (X.C57862jl) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.1fG r0 = r4.A01
            X.2mG r1 = r0.A02()
            if (r1 != 0) goto L_0x05cf
            r4.A00()
            return
        L_0x05cf:
            java.lang.String r0 = "PreacksPingManager/sendPingAndClearPreacks/sending ping to clear preacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1cq r3 = r4.A00
            r0 = 4
            X.37G r2 = new X.37G
            r2.<init>(r1, r4, r0)
            r0 = 32000(0x7d00, double:1.581E-319)
            r3.A0A(r2, r0)
            return
        L_0x05e2:
            java.lang.Object r1 = r14.A01
            X.1fG r1 = (X.C31251fG) r1
            r1.A05()
            X.0vl r0 = r1.A02
            java.lang.Object r3 = r0.getValue()
            X.10s r3 = (X.C200710s) r3
            r0 = 27
            X.3Bs r2 = new X.3Bs
            r2.<init>(r1, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.A05(r2, r0)
            return
        L_0x05fe:
            java.lang.Object r4 = r14.A01
            X.1fG r4 = (X.C31251fG) r4
            X.1fF r6 = r4.A00
            java.lang.String r0 = "PreacksStore/loadAll"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C31241fF.A00(r6)     // Catch:{ Exception -> 0x067e }
            if (r0 == 0) goto L_0x0612
            X.0wS r8 = X.C18460wS.A00     // Catch:{ Exception -> 0x067e }
            goto L_0x068f
        L_0x0612:
            X.00H r0 = r6.A03     // Catch:{ Exception -> 0x067e }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x067e }
            X.1MH r0 = (X.AnonymousClass1MH) r0     // Catch:{ Exception -> 0x067e }
            X.1at r7 = r0.get()     // Catch:{ Exception -> 0x067e }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0677 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0677 }
            java.lang.String r2 = "\n      SELECT _id, ptn \n      FROM preacks\n      ORDER BY _id\n    "
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0677 }
            java.lang.String r0 = "PreacksStore/LOAD_ALL"
            android.database.Cursor r10 = X.C18070vi.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x0677 }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0670 }
            java.lang.String r0 = "_id"
            int r12 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0670 }
            java.lang.String r0 = "ptn"
            int r11 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0670 }
            X.1en r1 = r6.A02     // Catch:{ all -> 0x0670 }
            r0 = 0
            X.1eo r9 = new X.1eo     // Catch:{ all -> 0x0670 }
            r9.<init>(r0, r1, r0)     // Catch:{ all -> 0x0670 }
        L_0x0646:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0670 }
            if (r0 == 0) goto L_0x0669
            byte[] r0 = r10.getBlob(r11)     // Catch:{ all -> 0x0670 }
            X.1ca r5 = X.C60632oM.A00(r9, r0)     // Catch:{ all -> 0x0670 }
            if (r5 == 0) goto L_0x0646
            long r0 = r10.getLong(r12)     // Catch:{ all -> 0x0670 }
            r2 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0670 }
            X.2mG r0 = new X.2mG     // Catch:{ all -> 0x0670 }
            r0.<init>(r5, r1, r2)     // Catch:{ all -> 0x0670 }
            r8.add(r0)     // Catch:{ all -> 0x0670 }
            goto L_0x0646
        L_0x0669:
            r10.close()     // Catch:{ all -> 0x0677 }
            r7.close()     // Catch:{ Exception -> 0x067e }
            goto L_0x068f
        L_0x0670:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0672 }
        L_0x0672:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x0677 }
            throw r0     // Catch:{ all -> 0x0677 }
        L_0x0677:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0679 }
        L_0x0679:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ Exception -> 0x067e }
            throw r0     // Catch:{ Exception -> 0x067e }
        L_0x067e:
            r3 = move-exception
            java.lang.String r0 = "PreacksStore/loadAll/failed_to_load_pre_acks"
            X.C17960vV.A09(r0, r3)
            X.190 r2 = r6.A00
            java.lang.String r1 = "exception"
            java.lang.String r0 = "failed_to_load_pre_acks"
            r2.A0E(r0, r1, r3)
            X.0wS r8 = X.C18460wS.A00
        L_0x068f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PreacksQueue/loadDataFromDb loaded "
            X.C17890vO.A15(r0, r1, r8)
            java.lang.String r0 = " pre-acks"
            X.C17890vO.A1A(r1, r0)
            monitor-enter(r4)
            X.1JD r0 = r4.A04     // Catch:{ all -> 0x06aa }
            r0.addAll(r8)     // Catch:{ all -> 0x06aa }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.A01
            r0.countDown()
            return
        L_0x06aa:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x06ad:
            java.lang.Object r0 = r14.A01
            X.4jJ r0 = (X.C93644jJ) r0
            X.C93644jJ.A00(r0)
            return
        L_0x06b5:
            java.lang.Object r0 = r14.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r0
            X.00H r0 = r0.A0U
            java.lang.Object r0 = r0.get()
            X.4jJ r0 = (X.C93644jJ) r0
            r0.A01()
            return
        L_0x06c5:
            java.lang.Object r1 = r14.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.run()
            return
        L_0x06d1:
            java.lang.Object r0 = r14.A01
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r0
            X.A7w r0 = r0.A02
            r0.A07()
            return
        L_0x06db:
            java.lang.Object r0 = r14.A01
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r0
            X.A7w r0 = r0.A02
            r0.A0A()
            return
        L_0x06e5:
            java.lang.Object r0 = r14.A01
            X.A7R r0 = (X.A7R) r0
            r0.A06()
            return
        L_0x06ed:
            java.lang.Object r0 = r14.A01
            X.A7R r0 = (X.A7R) r0
            r0.A04()
            return
        L_0x06f5:
            java.lang.Object r1 = r14.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r1 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r1
            X.00H r0 = r1.A0K
            java.lang.Object r2 = r0.get()
            X.9pX r2 = (X.C193099pX) r2
            java.lang.String r1 = r1.A0L
            r0 = 9
            r2.A00(r1, r0)
            return
        L_0x0709:
            java.lang.Object r3 = r14.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r3 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r3
            X.00H r0 = r3.A0K
            java.lang.Object r2 = r0.get()
            X.9pX r2 = (X.C193099pX) r2
            java.lang.String r1 = r3.A0L
            r0 = 14
            r2.A00(r1, r0)
            X.00H r0 = r3.A0K
            java.lang.Object r2 = r0.get()
            X.9pX r2 = (X.C193099pX) r2
            java.lang.String r1 = r3.A0L
            r0 = 22
            r2.A02(r1, r0)
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0742
        L_0x072e:
            java.lang.Object r3 = r14.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r3 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r3
            X.00H r0 = r3.A0K
            java.lang.Object r2 = r0.get()
            X.9pX r2 = (X.C193099pX) r2
            java.lang.String r1 = r3.A0L
            r0 = 9
            r2.A02(r1, r0)
            r0 = 0
        L_0x0742:
            com.whatsapp.migration.export.ui.ExportMigrationActivity.A03(r3, r0)
            return
        L_0x0746:
            java.lang.Object r0 = r14.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r0 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r0
            r0.A4b()
            return
        L_0x074e:
            java.lang.Object r0 = r14.A01
            com.whatsapp.migration.export.ui.ExportMigrationDataExportedActivity r0 = (com.whatsapp.migration.export.ui.ExportMigrationDataExportedActivity) r0
            X.A7R r0 = r0.A01
            r0.A05()
            return
        L_0x0758:
            java.lang.Object r0 = r14.A01
            X.AWI r0 = (X.AWI) r0
            r0.A02()
            return
        L_0x0760:
            X.1Rw r2 = r8.A01
            X.2Ep r1 = new X.2Ep
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.A00 = r0
            X.18K r0 = r2.A08
            r0.CC7(r1)
            r7.clear()
            return
        L_0x0776:
            monitor-exit(r4)
            return
        L_0x0778:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x077b:
            X.19Y r2 = X.C30151dT.A00(r1)
            java.lang.Integer r0 = r3.A04
            if (r0 != 0) goto L_0x079f
            int r1 = r3.A01
            int r0 = r1 + 1
            r3.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A04 = r0
            if (r0 != 0) goto L_0x079f
            r1 = 0
        L_0x0792:
            java.lang.String r0 = "chatd_connection_start"
            java.lang.String r1 = X.AnonymousClass2U8.A00(r1, r0)
            r0 = 125908665(0x78136b9, float:1.9441926E-34)
            r2.markerPoint(r0, r1)
            return
        L_0x079f:
            int r1 = r0.intValue()
            goto L_0x0792
        L_0x07a4:
            java.lang.String r1 = "accountTransferLoggingManager"
        L_0x07a6:
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70593Bs.run():void");
    }
}
