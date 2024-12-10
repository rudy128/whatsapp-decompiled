package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;

public class A6D {
    public final /* synthetic */ WorkDatabase_Impl A00;

    public static A2E A00(String str, String str2, String str3, int i) {
        return new A2E(str, str2, str3, i, 1, true);
    }

    public AnonymousClass9ZT A03(BE3 be3) {
        String A1E;
        StringBuilder A10;
        String str;
        HashMap hashMap = new HashMap(2);
        A02("work_spec_id", hashMap);
        hashMap.put("prerequisite_id", A00("prerequisite_id", "TEXT", (String) null, 2));
        HashSet hashSet = new HashSet(2);
        String str2 = "WorkSpec";
        String str3 = "CASCADE";
        hashSet.add(new C195089sm(str2, "CASCADE", str3, AnonymousClass8BR.A15("work_spec_id", new String[1], 0), AnonymousClass8BR.A15(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new String[1], 0)));
        hashSet.add(new C195089sm(str2, "CASCADE", str3, AnonymousClass8BT.A10("prerequisite_id"), AnonymousClass8BT.A10(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C194709sA("index_Dependency_work_spec_id", AnonymousClass8BT.A10("work_spec_id"), AnonymousClass8BR.A15("ASC", new String[1], 0), false));
        hashSet2.add(new C194709sA("index_Dependency_prerequisite_id", AnonymousClass8BT.A10("prerequisite_id"), AnonymousClass8BT.A10("ASC"), false));
        C194719sB r8 = new C194719sB("Dependency", hashMap, hashSet, hashSet2);
        BE3 be32 = be3;
        C194719sB A01 = A01(be32, "Dependency");
        if (!r8.equals(A01)) {
            A10 = AnonymousClass000.A10();
            str = "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n";
        } else {
            HashMap hashMap2 = new HashMap(30);
            A02(PublicKeyCredentialControllerUtility.JSON_KEY_ID, hashMap2);
            hashMap2.put("state", A00("state", "INTEGER", (String) null, 0));
            hashMap2.put("worker_class_name", A00("worker_class_name", "TEXT", (String) null, 0));
            hashMap2.put("input_merger_class_name", A00("input_merger_class_name", "TEXT", (String) null, 0));
            hashMap2.put("input", A00("input", "BLOB", (String) null, 0));
            hashMap2.put("output", A00("output", "BLOB", (String) null, 0));
            hashMap2.put("initial_delay", A00("initial_delay", "INTEGER", (String) null, 0));
            hashMap2.put("interval_duration", A00("interval_duration", "INTEGER", (String) null, 0));
            hashMap2.put("flex_duration", A00("flex_duration", "INTEGER", (String) null, 0));
            hashMap2.put("run_attempt_count", A00("run_attempt_count", "INTEGER", (String) null, 0));
            hashMap2.put("backoff_policy", A00("backoff_policy", "INTEGER", (String) null, 0));
            hashMap2.put("backoff_delay_duration", A00("backoff_delay_duration", "INTEGER", (String) null, 0));
            String str4 = "last_enqueue_time";
            hashMap2.put(str4, A00(str4, "INTEGER", "-1", 0));
            hashMap2.put("minimum_retention_duration", A00("minimum_retention_duration", "INTEGER", (String) null, 0));
            hashMap2.put("schedule_requested_at", A00("schedule_requested_at", "INTEGER", (String) null, 0));
            hashMap2.put("run_in_foreground", A00("run_in_foreground", "INTEGER", (String) null, 0));
            hashMap2.put("out_of_quota_policy", A00("out_of_quota_policy", "INTEGER", (String) null, 0));
            hashMap2.put("period_count", A00("period_count", "INTEGER", "0", 0));
            hashMap2.put("generation", A00("generation", "INTEGER", "0", 0));
            hashMap2.put("next_schedule_time_override", A00("next_schedule_time_override", "INTEGER", "9223372036854775807", 0));
            hashMap2.put("next_schedule_time_override_generation", A00("next_schedule_time_override_generation", "INTEGER", "0", 0));
            hashMap2.put("stop_reason", A00("stop_reason", "INTEGER", "-256", 0));
            hashMap2.put("required_network_type", A00("required_network_type", "INTEGER", (String) null, 0));
            hashMap2.put("requires_charging", A00("requires_charging", "INTEGER", (String) null, 0));
            hashMap2.put("requires_device_idle", A00("requires_device_idle", "INTEGER", (String) null, 0));
            hashMap2.put("requires_battery_not_low", A00("requires_battery_not_low", "INTEGER", (String) null, 0));
            hashMap2.put("requires_storage_not_low", A00("requires_storage_not_low", "INTEGER", (String) null, 0));
            hashMap2.put("trigger_content_update_delay", A00("trigger_content_update_delay", "INTEGER", (String) null, 0));
            hashMap2.put("trigger_max_content_delay", A00("trigger_max_content_delay", "INTEGER", (String) null, 0));
            hashMap2.put("content_uri_triggers", A00("content_uri_triggers", "BLOB", (String) null, 0));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C194709sA("index_WorkSpec_schedule_requested_at", AnonymousClass8BT.A10("schedule_requested_at"), AnonymousClass8BT.A10("ASC"), false));
            hashSet4.add(new C194709sA("index_WorkSpec_last_enqueue_time", AnonymousClass8BT.A10("last_enqueue_time"), AnonymousClass8BT.A10("ASC"), false));
            String str5 = "WorkSpec";
            r8 = new C194719sB(str5, hashMap2, hashSet3, hashSet4);
            A01 = A01(be32, str5);
            if (!r8.equals(A01)) {
                A10 = AnonymousClass000.A10();
                str = "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n";
            } else {
                HashMap hashMap3 = new HashMap(2);
                A02("tag", hashMap3);
                hashMap3.put("work_spec_id", A00("work_spec_id", "TEXT", (String) null, 2));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new C195089sm(str2, "CASCADE", str3, AnonymousClass8BT.A10("work_spec_id"), AnonymousClass8BT.A10(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new C194709sA("index_WorkTag_work_spec_id", AnonymousClass8BT.A10("work_spec_id"), AnonymousClass8BT.A10("ASC"), false));
                r8 = new C194719sB("WorkTag", hashMap3, hashSet5, hashSet6);
                A01 = A01(be32, "WorkTag");
                if (!r8.equals(A01)) {
                    A10 = AnonymousClass000.A10();
                    str = "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n";
                } else {
                    HashMap hashMap4 = new HashMap(3);
                    A02("work_spec_id", hashMap4);
                    hashMap4.put("generation", A00("generation", "INTEGER", "0", 2));
                    hashMap4.put("system_id", A00("system_id", "INTEGER", (String) null, 0));
                    HashSet hashSet7 = new HashSet(1);
                    hashSet7.add(new C195089sm(str2, "CASCADE", str3, AnonymousClass8BT.A10("work_spec_id"), AnonymousClass8BT.A10(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                    r8 = new C194719sB("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                    A01 = A01(be32, "SystemIdInfo");
                    if (!r8.equals(A01)) {
                        A10 = AnonymousClass000.A10();
                        str = "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n";
                    } else {
                        HashMap hashMap5 = new HashMap(2);
                        A02(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, hashMap5);
                        hashMap5.put("work_spec_id", A00("work_spec_id", "TEXT", (String) null, 2));
                        HashSet hashSet8 = new HashSet(1);
                        hashSet8.add(new C195089sm(str2, "CASCADE", str3, AnonymousClass8BT.A10("work_spec_id"), AnonymousClass8BT.A10(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                        HashSet hashSet9 = new HashSet(1);
                        hashSet9.add(new C194709sA("index_WorkName_work_spec_id", AnonymousClass8BT.A10("work_spec_id"), AnonymousClass8BT.A10("ASC"), false));
                        r8 = new C194719sB("WorkName", hashMap5, hashSet8, hashSet9);
                        A01 = A01(be32, "WorkName");
                        if (!r8.equals(A01)) {
                            A10 = AnonymousClass000.A10();
                            str = "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n";
                        } else {
                            HashMap hashMap6 = new HashMap(2);
                            A02("work_spec_id", hashMap6);
                            hashMap6.put("progress", A00("progress", "BLOB", (String) null, 0));
                            HashSet hashSet10 = new HashSet(1);
                            String str6 = "CASCADE";
                            hashSet10.add(new C195089sm("WorkSpec", str6, str6, AnonymousClass8BT.A10("work_spec_id"), AnonymousClass8BT.A10(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                            C194719sB r4 = new C194719sB("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                            A01 = A01(be32, "WorkProgress");
                            if (!r4.equals(A01)) {
                                A10 = AnonymousClass000.A10();
                                A10.append("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
                                A10.append(r4);
                                A10.append("\n Found:\n");
                                A10.append(A01);
                                A1E = A10.toString();
                                return new AnonymousClass9ZT(false, A1E);
                            }
                            HashMap hashMap7 = new HashMap(2);
                            A02("key", hashMap7);
                            hashMap7.put("long_value", new A2E("long_value", "INTEGER", (String) null, 0, 1, false));
                            C194719sB r42 = new C194719sB("Preference", hashMap7, new HashSet(0), new HashSet(0));
                            C194719sB A012 = A01(be32, "Preference");
                            if (r42.equals(A012)) {
                                return new AnonymousClass9ZT(true, (String) null);
                            }
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                            A102.append(r42);
                            A1E = AnonymousClass001.A1E(A012, "\n Found:\n", A102);
                            return new AnonymousClass9ZT(false, A1E);
                        }
                    }
                }
            }
        }
        A10.append(str);
        A10.append(r8);
        A10.append("\n Found:\n");
        A10.append(A01);
        A1E = A10.toString();
        return new AnonymousClass9ZT(false, A1E);
    }

    public A6D(WorkDatabase_Impl workDatabase_Impl) {
        this.A00 = workDatabase_Impl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0263, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0267, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x027d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x027e, code lost:
        X.CDX.A00(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0281, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0284, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0285, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0288, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C194719sB A01(X.BE3 r31, java.lang.String r32) {
        /*
            r2 = r31
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PRAGMA table_info(`"
            r3.append(r0)
            r0 = r32
            r3.append(r0)
            java.lang.String r1 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0y(r1, r3)
            X.AHQ r2 = (X.AHQ) r2
            android.database.Cursor r4 = X.AHY.A00(r2, r0)
            java.lang.String r10 = "dflt_value"
            java.lang.String r9 = "pk"
            java.lang.String r5 = "notnull"
            java.lang.String r3 = "type"
            java.lang.String r25 = "name"
            int r0 = r4.getColumnCount()     // Catch:{ all -> 0x0282 }
            if (r0 > 0) goto L_0x0031
            X.1CQ r24 = X.AnonymousClass1D7.A0I()     // Catch:{ all -> 0x0282 }
            goto L_0x007e
        L_0x0031:
            r0 = r25
            int r8 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0282 }
            int r7 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x0282 }
            int r6 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x0282 }
            int r5 = r4.getColumnIndex(r9)     // Catch:{ all -> 0x0282 }
            int r3 = r4.getColumnIndex(r10)     // Catch:{ all -> 0x0282 }
            X.DVM r0 = new X.DVM     // Catch:{ all -> 0x0282 }
            r0.<init>()     // Catch:{ all -> 0x0282 }
        L_0x004c:
            boolean r9 = r4.moveToNext()     // Catch:{ all -> 0x0282 }
            if (r9 == 0) goto L_0x007a
            java.lang.String r10 = r4.getString(r8)     // Catch:{ all -> 0x0282 }
            java.lang.String r11 = r4.getString(r7)     // Catch:{ all -> 0x0282 }
            int r9 = r4.getInt(r6)     // Catch:{ all -> 0x0282 }
            boolean r15 = X.AnonymousClass000.A1O(r9)
            int r13 = r4.getInt(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r12 = r4.getString(r3)     // Catch:{ all -> 0x0282 }
            X.C18070vi.A0X(r10)     // Catch:{ all -> 0x0282 }
            X.C18070vi.A0X(r11)     // Catch:{ all -> 0x0282 }
            r14 = 2
            X.A2E r9 = new X.A2E     // Catch:{ all -> 0x0282 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0282 }
            r0.put(r10, r9)     // Catch:{ all -> 0x0282 }
            goto L_0x004c
        L_0x007a:
            X.DVM r24 = X.C200610r.A05(r0)     // Catch:{ all -> 0x0282 }
        L_0x007e:
            r4.close()
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "PRAGMA foreign_key_list(`"
            r0 = r32
            X.C17890vO.A10(r3, r0, r1, r4)
            java.lang.String r0 = r4.toString()
            android.database.Cursor r4 = X.AHY.A00(r2, r0)
            r3 = -1
            java.lang.String r8 = "on_update"
            java.lang.String r7 = "on_delete"
            java.lang.String r6 = "table"
            java.lang.String r5 = "seq"
            java.lang.String r0 = "id"
            int r18 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0282 }
            int r17 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x0282 }
            int r16 = r4.getColumnIndex(r6)     // Catch:{ all -> 0x0282 }
            int r7 = r4.getColumnIndex(r7)     // Catch:{ all -> 0x0282 }
            int r6 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x0282 }
            int r15 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0282 }
            int r14 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "from"
            int r13 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "to"
            int r12 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0282 }
            X.DcQ r11 = X.AnonymousClass1ZT.A01()     // Catch:{ all -> 0x0282 }
        L_0x00cb:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x00ea
            int r10 = r4.getInt(r15)     // Catch:{ all -> 0x0282 }
            int r9 = r4.getInt(r14)     // Catch:{ all -> 0x0282 }
            java.lang.String r8 = X.AnonymousClass8BS.A0c(r4, r13)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = X.AnonymousClass8BS.A0c(r4, r12)     // Catch:{ all -> 0x0282 }
            X.AiW r0 = new X.AiW     // Catch:{ all -> 0x0282 }
            r0.<init>(r10, r9, r8, r5)     // Catch:{ all -> 0x0282 }
            r11.add(r0)     // Catch:{ all -> 0x0282 }
            goto L_0x00cb
        L_0x00ea:
            X.DcQ r0 = X.AnonymousClass1ZT.A02(r11)     // Catch:{ all -> 0x0282 }
            java.util.List r14 = X.C29431cG.A0s(r0)     // Catch:{ all -> 0x0282 }
            r4.moveToPosition(r3)     // Catch:{ all -> 0x0282 }
            X.DcS r5 = new X.DcS     // Catch:{ all -> 0x0282 }
            r5.<init>()     // Catch:{ all -> 0x0282 }
        L_0x00fa:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x016b
            r0 = r17
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x00fa
            r0 = r18
            int r13 = r4.getInt(r0)     // Catch:{ all -> 0x0282 }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0282 }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0282 }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0282 }
            java.util.Iterator r11 = r14.iterator()     // Catch:{ all -> 0x0282 }
        L_0x011e:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x0133
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0282 }
            r0 = r10
            X.AiW r0 = (X.C21343AiW) r0     // Catch:{ all -> 0x0282 }
            int r0 = r0.A00     // Catch:{ all -> 0x0282 }
            if (r0 != r13) goto L_0x011e
            r12.add(r10)     // Catch:{ all -> 0x0282 }
            goto L_0x011e
        L_0x0133:
            java.util.Iterator r11 = r12.iterator()     // Catch:{ all -> 0x0282 }
        L_0x0137:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x014e
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0282 }
            X.AiW r10 = (X.C21343AiW) r10     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x0282 }
            r9.add(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = r10.A03     // Catch:{ all -> 0x0282 }
            r8.add(r0)     // Catch:{ all -> 0x0282 }
            goto L_0x0137
        L_0x014e:
            r0 = r16
            java.lang.String r27 = X.AnonymousClass8BS.A0c(r4, r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r28 = X.AnonymousClass8BS.A0c(r4, r7)     // Catch:{ all -> 0x0282 }
            java.lang.String r29 = X.AnonymousClass8BS.A0c(r4, r6)     // Catch:{ all -> 0x0282 }
            X.9sm r0 = new X.9sm     // Catch:{ all -> 0x0282 }
            r26 = r0
            r30 = r9
            r31 = r8
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0282 }
            r5.add(r0)     // Catch:{ all -> 0x0282 }
            goto L_0x00fa
        L_0x016b:
            X.DcS r23 = X.AnonymousClass1AO.A00(r5)     // Catch:{ all -> 0x0282 }
            r4.close()
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "PRAGMA index_list(`"
            r0 = r32
            X.C17890vO.A10(r4, r0, r1, r5)
            java.lang.String r0 = r5.toString()
            android.database.Cursor r12 = X.AHY.A00(r2, r0)
            java.lang.String r22 = "c"
            java.lang.String r5 = "unique"
            java.lang.String r4 = "origin"
            r11 = 0
            r0 = r25
            int r10 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x027b }
            int r9 = r12.getColumnIndex(r4)     // Catch:{ all -> 0x027b }
            int r8 = r12.getColumnIndex(r5)     // Catch:{ all -> 0x027b }
            if (r10 == r3) goto L_0x026c
            if (r9 == r3) goto L_0x026c
            if (r8 == r3) goto L_0x026c
            X.DcS r21 = new X.DcS     // Catch:{ all -> 0x027b }
            r21.<init>()     // Catch:{ all -> 0x027b }
        L_0x01a5:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x027b }
            if (r0 == 0) goto L_0x0268
            java.lang.String r3 = r12.getString(r9)     // Catch:{ all -> 0x027b }
            r0 = r22
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x027b }
            if (r0 == 0) goto L_0x01a5
            java.lang.String r13 = r12.getString(r10)     // Catch:{ all -> 0x027b }
            int r3 = r12.getInt(r8)     // Catch:{ all -> 0x027b }
            r0 = 1
            boolean r20 = X.AnonymousClass000.A1T(r3, r0)
            java.lang.StringBuilder r3 = X.C108955ca.A15(r13)     // Catch:{ all -> 0x027b }
            java.lang.String r0 = "PRAGMA index_xinfo(`"
            X.C17890vO.A10(r0, r13, r1, r3)     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x027b }
            android.database.Cursor r7 = X.AHY.A00(r2, r0)     // Catch:{ all -> 0x027b }
            java.lang.String r19 = "DESC"
            java.lang.String r18 = "ASC"
            java.lang.String r4 = "desc"
            java.lang.String r5 = "cid"
            java.lang.String r0 = "seqno"
            r3 = -1
            int r14 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0261 }
            int r6 = r7.getColumnIndex(r5)     // Catch:{ all -> 0x0261 }
            r0 = r25
            int r5 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0261 }
            int r4 = r7.getColumnIndex(r4)     // Catch:{ all -> 0x0261 }
            if (r14 == r3) goto L_0x0254
            if (r6 == r3) goto L_0x0254
            if (r5 == r3) goto L_0x0254
            if (r4 == r3) goto L_0x0254
            java.util.TreeMap r17 = new java.util.TreeMap     // Catch:{ all -> 0x0261 }
            r17.<init>()     // Catch:{ all -> 0x0261 }
            java.util.TreeMap r16 = new java.util.TreeMap     // Catch:{ all -> 0x0261 }
            r16.<init>()     // Catch:{ all -> 0x0261 }
        L_0x0204:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0261 }
            if (r0 == 0) goto L_0x0236
            int r0 = r7.getInt(r6)     // Catch:{ all -> 0x0261 }
            if (r0 < 0) goto L_0x0204
            int r3 = r7.getInt(r14)     // Catch:{ all -> 0x0261 }
            java.lang.String r15 = r7.getString(r5)     // Catch:{ all -> 0x0261 }
            int r0 = r7.getInt(r4)     // Catch:{ all -> 0x0261 }
            r26 = r18
            if (r0 <= 0) goto L_0x0222
            r26 = r19
        L_0x0222:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0261 }
            X.C18070vi.A0X(r15)     // Catch:{ all -> 0x0261 }
            r0 = r17
            r0.put(r3, r15)     // Catch:{ all -> 0x0261 }
            r15 = r26
            r0 = r16
            r0.put(r3, r15)     // Catch:{ all -> 0x0261 }
            goto L_0x0204
        L_0x0236:
            java.util.Collection r0 = r17.values()     // Catch:{ all -> 0x0261 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0261 }
            java.util.List r4 = X.C29431cG.A0t(r0)     // Catch:{ all -> 0x0261 }
            java.util.Collection r0 = r16.values()     // Catch:{ all -> 0x0261 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0261 }
            java.util.List r3 = X.C29431cG.A0t(r0)     // Catch:{ all -> 0x0261 }
            X.9sA r5 = new X.9sA     // Catch:{ all -> 0x0261 }
            r0 = r20
            r5.<init>(r13, r4, r3, r0)     // Catch:{ all -> 0x0261 }
            goto L_0x0255
        L_0x0254:
            r5 = 0
        L_0x0255:
            r7.close()     // Catch:{ all -> 0x027b }
            if (r5 == 0) goto L_0x026c
            r0 = r21
            r0.add(r5)     // Catch:{ all -> 0x027b }
            goto L_0x01a5
        L_0x0261:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0263 }
        L_0x0263:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x027b }
            throw r0     // Catch:{ all -> 0x027b }
        L_0x0268:
            X.DcS r11 = X.AnonymousClass1AO.A00(r21)     // Catch:{ all -> 0x027b }
        L_0x026c:
            r12.close()
            X.9sB r3 = new X.9sB
            r2 = r24
            r1 = r23
            r0 = r32
            r3.<init>(r0, r2, r1, r11)
            return r3
        L_0x027b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x027d }
        L_0x027d:
            r1 = move-exception
            X.CDX.A00(r12, r0)
            throw r1
        L_0x0282:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0284 }
        L_0x0284:
            r1 = move-exception
            X.CDX.A00(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6D.A01(X.BE3, java.lang.String):X.9sB");
    }

    public static void A02(String str, AbstractMap abstractMap) {
        String str2 = str;
        abstractMap.put(str2, new A2E(str2, "TEXT", (String) null, 1, 1, true));
    }

    public void A04(BE3 be3) {
        be3.BKj("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        be3.BKj("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        be3.BKj("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        be3.BKj("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        be3.BKj("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        be3.BKj("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        be3.BKj("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        be3.BKj("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        be3.BKj("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        be3.BKj("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        be3.BKj("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        be3.BKj("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        be3.BKj("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        be3.BKj("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        be3.BKj("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }
}
