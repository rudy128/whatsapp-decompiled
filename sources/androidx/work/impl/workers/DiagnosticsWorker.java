package androidx.work.impl.workers;

import X.A2t;
import X.A3D;
import X.A5Z;
import X.A6Y;
import X.A7W;
import X.AHX;
import X.AnonymousClass000;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass9OB;
import X.B4S;
import X.BA3;
import X.BA4;
import X.BD8;
import X.C162178Jk;
import X.C17880vN;
import X.C180129Lg;
import X.C18070vi;
import X.C196329ur;
import X.C197069w6;
import X.C20076A6c;
import X.C20078A6e;
import X.C20137A8y;
import X.C20365AHv;
import android.content.Context;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: finally extract failed */
    public C180129Lg A0B() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        A7W A00 = A7W.A00(this.A00);
        C18070vi.A0X(A00);
        WorkDatabase workDatabase = A00.A04;
        C18070vi.A0X(workDatabase);
        BD8 A0E = workDatabase.A0E();
        B4S A0C = workDatabase.A0C();
        BA4 A0F = workDatabase.A0F();
        BA3 A0B = workDatabase.A0B();
        AHX A002 = A3D.A00("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        A002.BD9(1, System.currentTimeMillis() - AnonymousClass8BW.A05());
        C20076A6c a6c = ((C20365AHv) A0E).A02;
        a6c.A06();
        Cursor A003 = AnonymousClass9OB.A00(a6c, A002, false);
        try {
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
            ArrayList A0w = AnonymousClass8BV.A0w(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A01)) {
                    str = null;
                } else {
                    str = A003.getString(A01);
                }
                Integer A07 = C20137A8y.A07(A003, A012);
                if (A003.isNull(A013)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A013);
                }
                if (A003.isNull(A014)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A014);
                }
                if (A003.isNull(A015)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A015);
                }
                A6Y A004 = A6Y.A00(bArr);
                if (A003.isNull(A016)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A016);
                }
                A6Y A005 = A6Y.A00(bArr2);
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
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0130);
                }
                A0w.add(new A2t(new C20078A6e(A06, C20137A8y.A09(bArr3), j9, j10, A1O2, A1O3, A1O4, A1O5), A004, A005, A07, A08, A04, str, str2, str3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, A1O));
            }
            A003.close();
            A002.A00();
            ArrayList BYR = A0E.BYR();
            ArrayList BMr = A0E.BMr();
            if (C17880vN.A1X(A0w)) {
                A5Z A006 = A5Z.A00();
                String str4 = C197069w6.A00;
                A006.A05(str4, "Recently completed work:\n\n");
                A5Z.A00().A05(str4, C197069w6.A00(A0B, A0C, A0F, A0w));
            }
            if (C17880vN.A1X(BYR)) {
                A5Z A007 = A5Z.A00();
                String str5 = C197069w6.A00;
                A007.A05(str5, "Running work:\n\n");
                A5Z.A00().A05(str5, C197069w6.A00(A0B, A0C, A0F, BYR));
            }
            if (C17880vN.A1X(BMr)) {
                A5Z A008 = A5Z.A00();
                String str6 = C197069w6.A00;
                A008.A05(str6, "Enqueued work:\n\n");
                A5Z.A00().A05(str6, C197069w6.A00(A0B, A0C, A0F, BMr));
            }
            return new C162178Jk();
        } catch (Throwable th) {
            A003.close();
            A002.A00();
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
    }
}
