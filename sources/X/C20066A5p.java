package X;

import android.database.Cursor;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.A5p  reason: case insensitive filesystem */
public abstract class C20066A5p {
    public static final String A00 = A5Z.A01("Schedulers");

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0058, code lost:
        if (r2 == null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C22531BBo A00(android.content.Context r7, X.AnonymousClass00I r8, androidx.work.impl.WorkDatabase r9) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r3 = 1
            if (r1 < r0) goto L_0x001d
            X.AHk r2 = new X.AHk
            r2.<init>(r7, r8, r9)
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r0 = androidx.work.impl.background.systemjob.SystemJobService.class
            X.C197039w3.A00(r7, r0, r3)
            X.A5Z r1 = X.A5Z.A00()
            java.lang.String r4 = A00
            java.lang.String r0 = "Created SystemJobScheduler and enabled SystemJobService"
        L_0x0019:
            r1.A03(r4, r0)
        L_0x001c:
            return r2
        L_0x001d:
            X.E0T r6 = r8.A03
            java.lang.String r0 = "androidx.work.impl.background.gcm.GcmScheduler"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x004b }
            r4 = 2
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ all -> 0x004b }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x004b }
            java.lang.Class<X.E0T> r0 = X.E0T.class
            r2[r3] = r0     // Catch:{ all -> 0x004b }
            java.lang.reflect.Constructor r1 = r5.getConstructor(r2)     // Catch:{ all -> 0x004b }
            java.lang.Object[] r0 = X.C108945cZ.A1a(r7, r6, r4, r3)     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ all -> 0x004b }
            X.BBo r2 = (X.C22531BBo) r2     // Catch:{ all -> 0x004b }
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ all -> 0x004b }
            java.lang.String r4 = A00     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "Created androidx.work.impl.background.gcm.GcmScheduler"
            r1.A03(r4, r0)     // Catch:{ all -> 0x004b }
            goto L_0x0058
        L_0x004b:
            r2 = move-exception
            X.A5Z r1 = X.A5Z.A00()
            java.lang.String r4 = A00
            java.lang.String r0 = "Unable to create GCM Scheduler"
            r1.A07(r4, r0, r2)
            goto L_0x005a
        L_0x0058:
            if (r2 != 0) goto L_0x001c
        L_0x005a:
            X.AHj r2 = new X.AHj
            r2.<init>(r7)
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r0 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            X.C197039w3.A00(r7, r0, r3)
            X.A5Z r1 = X.A5Z.A00()
            java.lang.String r0 = "Created SystemAlarmScheduler"
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20066A5p.A00(android.content.Context, X.00I, androidx.work.impl.WorkDatabase):X.BBo");
    }

    public static void A01(AnonymousClass00I r78, WorkDatabase workDatabase, List list) {
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AHX A002;
        Cursor A003;
        String str4;
        String str5;
        String str6;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        if (list != null && list.size() != 0) {
            BD8 A0E = workDatabase.A0E();
            workDatabase.A07();
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    A002 = A3D.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
                    C20076A6c a6c = ((C20365AHv) A0E).A02;
                    a6c.A06();
                    A003 = AnonymousClass9OB.A00(a6c, A002, false);
                    int A01 = C196329ur.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A012 = C196329ur.A01(A003, "state");
                    int A013 = C196329ur.A01(A003, "worker_class_name");
                    int A014 = C196329ur.A01(A003, "input_merger_class_name");
                    int A015 = C196329ur.A01(A003, "input");
                    int A016 = C196329ur.A01(A003, "output");
                    int A017 = C196329ur.A01(A003, "initial_delay");
                    int A018 = C196329ur.A01(A003, "interval_duration");
                    int A019 = C196329ur.A01(A003, "flex_duration");
                    int A0110 = C196329ur.A01(A003, "run_attempt_count");
                    int A0111 = C196329ur.A01(A003, "backoff_policy");
                    int A0112 = C196329ur.A01(A003, "backoff_delay_duration");
                    int A0113 = C196329ur.A01(A003, "last_enqueue_time");
                    int A0114 = C196329ur.A01(A003, "minimum_retention_duration");
                    int A0115 = C196329ur.A01(A003, "schedule_requested_at");
                    int A0116 = C196329ur.A01(A003, "run_in_foreground");
                    int A0117 = C196329ur.A01(A003, "out_of_quota_policy");
                    int A0118 = C196329ur.A01(A003, "period_count");
                    int A0119 = C196329ur.A01(A003, "generation");
                    int A0120 = C196329ur.A01(A003, "next_schedule_time_override");
                    int A0121 = C196329ur.A01(A003, "next_schedule_time_override_generation");
                    int A0122 = C196329ur.A01(A003, "stop_reason");
                    int A0123 = C196329ur.A01(A003, "required_network_type");
                    int A0124 = C196329ur.A01(A003, "requires_charging");
                    int A0125 = C196329ur.A01(A003, "requires_device_idle");
                    int A0126 = C196329ur.A01(A003, "requires_battery_not_low");
                    int A0127 = C196329ur.A01(A003, "requires_storage_not_low");
                    int A0128 = C196329ur.A01(A003, "trigger_content_update_delay");
                    int A0129 = C196329ur.A01(A003, "trigger_max_content_delay");
                    int A0130 = C196329ur.A01(A003, "content_uri_triggers");
                    arrayList = AnonymousClass8BV.A0w(A003);
                    while (A003.moveToNext()) {
                        if (A003.isNull(A01)) {
                            str4 = null;
                        } else {
                            str4 = A003.getString(A01);
                        }
                        Integer A07 = C20137A8y.A07(A003, A012);
                        if (A003.isNull(A013)) {
                            str5 = null;
                        } else {
                            str5 = A003.getString(A013);
                        }
                        if (A003.isNull(A014)) {
                            str6 = null;
                        } else {
                            str6 = A003.getString(A014);
                        }
                        if (A003.isNull(A015)) {
                            bArr4 = null;
                        } else {
                            bArr4 = A003.getBlob(A015);
                        }
                        A6Y A004 = A6Y.A00(bArr4);
                        if (A003.isNull(A016)) {
                            bArr5 = null;
                        } else {
                            bArr5 = A003.getBlob(A016);
                        }
                        A6Y A005 = A6Y.A00(bArr5);
                        long j = A003.getLong(A017);
                        long j2 = A003.getLong(A018);
                        long j3 = A003.getLong(A019);
                        int i = A003.getInt(A0110);
                        Integer A08 = C20137A8y.A08(A003, A0111);
                        long j4 = A003.getLong(A0112);
                        long j5 = A003.getLong(A0113);
                        long j6 = A003.getLong(A0114);
                        long j7 = A003.getLong(A0115);
                        boolean A1O = AnonymousClass000.A1O(A003.getInt(A0116));
                        Integer A04 = C20137A8y.A04(A003.getInt(A0117));
                        int i2 = A003.getInt(A0118);
                        int i3 = A003.getInt(A0119);
                        long j8 = A003.getLong(A0120);
                        int i4 = A003.getInt(A0121);
                        int i5 = A003.getInt(A0122);
                        Integer A06 = C20137A8y.A06(A003, A0123);
                        boolean A1O2 = AnonymousClass000.A1O(A003.getInt(A0124));
                        boolean A1O3 = AnonymousClass000.A1O(A003.getInt(A0125));
                        boolean A1O4 = AnonymousClass000.A1O(A003.getInt(A0126));
                        boolean A1O5 = AnonymousClass000.A1O(A003.getInt(A0127));
                        long j9 = A003.getLong(A0128);
                        long j10 = A003.getLong(A0129);
                        if (A003.isNull(A0130)) {
                            bArr6 = null;
                        } else {
                            bArr6 = A003.getBlob(A0130);
                        }
                        arrayList.add(new A2t(new C20078A6e(A06, C20137A8y.A09(bArr6), j9, j10, A1O2, A1O3, A1O4, A1O5), A004, A005, A07, A08, A04, str4, str5, str6, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, A1O));
                    }
                    A003.close();
                    A002.A00();
                    A02(A0E, arrayList);
                } else {
                    arrayList = null;
                }
                int i6 = r78.A00;
                AHX A006 = A3D.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
                A006.BD9(1, (long) i6);
                C20076A6c a6c2 = ((C20365AHv) A0E).A02;
                a6c2.A06();
                Cursor A007 = AnonymousClass9OB.A00(a6c2, A006, false);
                try {
                    int A0131 = C196329ur.A01(A007, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A0132 = C196329ur.A01(A007, "state");
                    int A0133 = C196329ur.A01(A007, "worker_class_name");
                    int A0134 = C196329ur.A01(A007, "input_merger_class_name");
                    int A0135 = C196329ur.A01(A007, "input");
                    int A0136 = C196329ur.A01(A007, "output");
                    int A0137 = C196329ur.A01(A007, "initial_delay");
                    int A0138 = C196329ur.A01(A007, "interval_duration");
                    int A0139 = C196329ur.A01(A007, "flex_duration");
                    int A0140 = C196329ur.A01(A007, "run_attempt_count");
                    int A0141 = C196329ur.A01(A007, "backoff_policy");
                    int A0142 = C196329ur.A01(A007, "backoff_delay_duration");
                    int A0143 = C196329ur.A01(A007, "last_enqueue_time");
                    int A0144 = C196329ur.A01(A007, "minimum_retention_duration");
                    int A0145 = C196329ur.A01(A007, "schedule_requested_at");
                    int A0146 = C196329ur.A01(A007, "run_in_foreground");
                    int A0147 = C196329ur.A01(A007, "out_of_quota_policy");
                    int A0148 = C196329ur.A01(A007, "period_count");
                    int A0149 = C196329ur.A01(A007, "generation");
                    int A0150 = C196329ur.A01(A007, "next_schedule_time_override");
                    int A0151 = C196329ur.A01(A007, "next_schedule_time_override_generation");
                    int A0152 = C196329ur.A01(A007, "stop_reason");
                    int A0153 = C196329ur.A01(A007, "required_network_type");
                    int A0154 = C196329ur.A01(A007, "requires_charging");
                    int A0155 = C196329ur.A01(A007, "requires_device_idle");
                    int A0156 = C196329ur.A01(A007, "requires_battery_not_low");
                    int A0157 = C196329ur.A01(A007, "requires_storage_not_low");
                    int A0158 = C196329ur.A01(A007, "trigger_content_update_delay");
                    int A0159 = C196329ur.A01(A007, "trigger_max_content_delay");
                    int A0160 = C196329ur.A01(A007, "content_uri_triggers");
                    ArrayList A0w = AnonymousClass8BV.A0w(A007);
                    while (A007.moveToNext()) {
                        if (A007.isNull(A0131)) {
                            str = null;
                        } else {
                            str = A007.getString(A0131);
                        }
                        Integer A072 = C20137A8y.A07(A007, A0132);
                        if (A007.isNull(A0133)) {
                            str2 = null;
                        } else {
                            str2 = A007.getString(A0133);
                        }
                        if (A007.isNull(A0134)) {
                            str3 = null;
                        } else {
                            str3 = A007.getString(A0134);
                        }
                        if (A007.isNull(A0135)) {
                            bArr = null;
                        } else {
                            bArr = A007.getBlob(A0135);
                        }
                        A6Y A008 = A6Y.A00(bArr);
                        if (A007.isNull(A0136)) {
                            bArr2 = null;
                        } else {
                            bArr2 = A007.getBlob(A0136);
                        }
                        A6Y A009 = A6Y.A00(bArr2);
                        long j11 = A007.getLong(A0137);
                        long j12 = A007.getLong(A0138);
                        long j13 = A007.getLong(A0139);
                        int i7 = A007.getInt(A0140);
                        Integer A082 = C20137A8y.A08(A007, A0141);
                        long j14 = A007.getLong(A0142);
                        long j15 = A007.getLong(A0143);
                        long j16 = A007.getLong(A0144);
                        long j17 = A007.getLong(A0145);
                        boolean A1O6 = AnonymousClass000.A1O(A007.getInt(A0146));
                        Integer A042 = C20137A8y.A04(A007.getInt(A0147));
                        int i8 = A007.getInt(A0148);
                        int i9 = A007.getInt(A0149);
                        long j18 = A007.getLong(A0150);
                        int i10 = A007.getInt(A0151);
                        int i11 = A007.getInt(A0152);
                        Integer A062 = C20137A8y.A06(A007, A0153);
                        boolean A1O7 = AnonymousClass000.A1O(A007.getInt(A0154));
                        boolean A1O8 = AnonymousClass000.A1O(A007.getInt(A0155));
                        boolean A1O9 = AnonymousClass000.A1O(A007.getInt(A0156));
                        boolean A1O10 = AnonymousClass000.A1O(A007.getInt(A0157));
                        long j19 = A007.getLong(A0158);
                        long j20 = A007.getLong(A0159);
                        if (A007.isNull(A0160)) {
                            bArr3 = null;
                        } else {
                            bArr3 = A007.getBlob(A0160);
                        }
                        A0w.add(new A2t(new C20078A6e(A062, C20137A8y.A09(bArr3), j19, j20, A1O7, A1O8, A1O9, A1O10), A008, A009, A072, A082, A042, str, str2, str3, i7, i8, i9, i10, i11, j11, j12, j13, j14, j15, j16, j17, j18, A1O6));
                    }
                    A007.close();
                    A006.A00();
                    A02(A0E, A0w);
                    if (arrayList != null) {
                        A0w.addAll(arrayList);
                    }
                    ArrayList BMr = A0E.BMr();
                    workDatabase.A08();
                    C20076A6c.A02(workDatabase);
                    if (A0w.size() > 0) {
                        A2t[] a2tArr = (A2t[]) A0w.toArray(new A2t[A0w.size()]);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C22531BBo bBo = (C22531BBo) it.next();
                            if (bBo.Bcf()) {
                                bBo.CGu(a2tArr);
                            }
                        }
                    }
                    if (BMr.size() > 0) {
                        A2t[] a2tArr2 = (A2t[]) BMr.toArray(new A2t[BMr.size()]);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C22531BBo bBo2 = (C22531BBo) it2.next();
                            if (!bBo2.Bcf()) {
                                bBo2.CGu(a2tArr2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    A007.close();
                    A006.A00();
                    throw th;
                }
            } catch (Throwable th2) {
                C20076A6c.A02(workDatabase);
                throw th2;
            }
        }
    }

    public static void A02(BD8 bd8, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bd8.Biq(((A2t) it.next()).A0M, currentTimeMillis);
            }
        }
    }
}
