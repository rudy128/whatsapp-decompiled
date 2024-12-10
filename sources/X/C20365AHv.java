package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AHv  reason: case insensitive filesystem */
public final class C20365AHv implements BD8 {
    public final AnonymousClass8JG A00;
    public final AnonymousClass8JH A01;
    public final C20076A6c A02;
    public final C19955A0m A03;
    public final C19955A0m A04;
    public final C19955A0m A05;
    public final C19955A0m A06;
    public final C19955A0m A07;
    public final C19955A0m A08;
    public final C19955A0m A09;
    public final C19955A0m A0A;
    public final C19955A0m A0B;
    public final C19955A0m A0C;
    public final C19955A0m A0D;
    public final C19955A0m A0E;
    public final C19955A0m A0F;
    public final C19955A0m A0G;
    public final C19955A0m A0H;

    public void BIB(String str) {
        C20076A6c a6c = this.A02;
        a6c.A06();
        C19955A0m a0m = this.A08;
        BDc A012 = C20076A6c.A01(a6c, a0m, str);
        try {
            AHW.A00(a6c, A012);
        } finally {
            C20076A6c.A02(a6c);
            a0m.A02(A012);
        }
    }

    public ArrayList BMr() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AHX A002 = A3D.A00("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        A002.BD9(1, 200);
        C20076A6c a6c = this.A02;
        a6c.A06();
        Cursor A003 = AnonymousClass9OB.A00(a6c, A002, false);
        try {
            int A012 = C196329ur.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = C196329ur.A01(A003, "state");
            int A014 = C196329ur.A01(A003, "worker_class_name");
            int A015 = C196329ur.A01(A003, "input_merger_class_name");
            int A016 = C196329ur.A01(A003, "input");
            int A017 = C196329ur.A01(A003, "output");
            int A018 = C196329ur.A01(A003, "initial_delay");
            int A019 = C196329ur.A01(A003, "interval_duration");
            int A0110 = C196329ur.A01(A003, "flex_duration");
            int A0111 = C196329ur.A01(A003, "run_attempt_count");
            int A0112 = C196329ur.A01(A003, "backoff_policy");
            int A0113 = C196329ur.A01(A003, "backoff_delay_duration");
            int A0114 = C196329ur.A01(A003, "last_enqueue_time");
            int A0115 = C196329ur.A01(A003, "minimum_retention_duration");
            int A0116 = C196329ur.A01(A003, "schedule_requested_at");
            int A0117 = C196329ur.A01(A003, "run_in_foreground");
            int A0118 = C196329ur.A01(A003, "out_of_quota_policy");
            int A0119 = C196329ur.A01(A003, "period_count");
            int A0120 = C196329ur.A01(A003, "generation");
            int A0121 = C196329ur.A01(A003, "next_schedule_time_override");
            int A0122 = C196329ur.A01(A003, "next_schedule_time_override_generation");
            int A0123 = C196329ur.A01(A003, "stop_reason");
            int A0124 = C196329ur.A01(A003, "required_network_type");
            int A0125 = C196329ur.A01(A003, "requires_charging");
            int A0126 = C196329ur.A01(A003, "requires_device_idle");
            int A0127 = C196329ur.A01(A003, "requires_battery_not_low");
            int A0128 = C196329ur.A01(A003, "requires_storage_not_low");
            int A0129 = C196329ur.A01(A003, "trigger_content_update_delay");
            int A0130 = C196329ur.A01(A003, "trigger_max_content_delay");
            int A0131 = C196329ur.A01(A003, "content_uri_triggers");
            ArrayList A0w = AnonymousClass8BV.A0w(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A012)) {
                    str = null;
                } else {
                    str = A003.getString(A012);
                }
                Integer A072 = C20137A8y.A07(A003, A013);
                if (A003.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A014);
                }
                if (A003.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A015);
                }
                if (A003.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A016);
                }
                A6Y A004 = A6Y.A00(bArr);
                if (A003.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A017);
                }
                A6Y A005 = A6Y.A00(bArr2);
                long j = A003.getLong(A018);
                long j2 = A003.getLong(A019);
                long j3 = A003.getLong(A0110);
                int i = A003.getInt(A0111);
                Integer A082 = C20137A8y.A08(A003, A0112);
                long j4 = A003.getLong(A0113);
                long j5 = A003.getLong(A0114);
                long j6 = A003.getLong(A0115);
                long j7 = A003.getLong(A0116);
                boolean A1O = AnonymousClass000.A1O(A003.getInt(A0117));
                Integer A042 = C20137A8y.A04(A003.getInt(A0118));
                int i2 = A003.getInt(A0119);
                int i3 = A003.getInt(A0120);
                long j8 = A003.getLong(A0121);
                int i4 = A003.getInt(A0122);
                int i5 = A003.getInt(A0123);
                Integer A062 = C20137A8y.A06(A003, A0124);
                boolean A1O2 = AnonymousClass000.A1O(A003.getInt(A0125));
                boolean A1O3 = AnonymousClass000.A1O(A003.getInt(A0126));
                boolean A1O4 = AnonymousClass000.A1O(A003.getInt(A0127));
                boolean A1O5 = AnonymousClass000.A1O(A003.getInt(A0128));
                long j9 = A003.getLong(A0129);
                long j10 = A003.getLong(A0130);
                if (A003.isNull(A0131)) {
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0131);
                }
                A0w.add(new A2t(new C20078A6e(A062, C20137A8y.A09(bArr3), j9, j10, A1O2, A1O3, A1O4, A1O5), A004, A005, A072, A082, A042, str, str2, str3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, A1O));
            }
            return A0w;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public ArrayList BYR() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AHX A002 = A3D.A00("SELECT * FROM workspec WHERE state=1", 0);
        C20076A6c a6c = this.A02;
        a6c.A06();
        Cursor A003 = AnonymousClass9OB.A00(a6c, A002, false);
        try {
            int A012 = C196329ur.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = C196329ur.A01(A003, "state");
            int A014 = C196329ur.A01(A003, "worker_class_name");
            int A015 = C196329ur.A01(A003, "input_merger_class_name");
            int A016 = C196329ur.A01(A003, "input");
            int A017 = C196329ur.A01(A003, "output");
            int A018 = C196329ur.A01(A003, "initial_delay");
            int A019 = C196329ur.A01(A003, "interval_duration");
            int A0110 = C196329ur.A01(A003, "flex_duration");
            int A0111 = C196329ur.A01(A003, "run_attempt_count");
            int A0112 = C196329ur.A01(A003, "backoff_policy");
            int A0113 = C196329ur.A01(A003, "backoff_delay_duration");
            int A0114 = C196329ur.A01(A003, "last_enqueue_time");
            int A0115 = C196329ur.A01(A003, "minimum_retention_duration");
            int A0116 = C196329ur.A01(A003, "schedule_requested_at");
            int A0117 = C196329ur.A01(A003, "run_in_foreground");
            int A0118 = C196329ur.A01(A003, "out_of_quota_policy");
            int A0119 = C196329ur.A01(A003, "period_count");
            int A0120 = C196329ur.A01(A003, "generation");
            int A0121 = C196329ur.A01(A003, "next_schedule_time_override");
            int A0122 = C196329ur.A01(A003, "next_schedule_time_override_generation");
            int A0123 = C196329ur.A01(A003, "stop_reason");
            int A0124 = C196329ur.A01(A003, "required_network_type");
            int A0125 = C196329ur.A01(A003, "requires_charging");
            int A0126 = C196329ur.A01(A003, "requires_device_idle");
            int A0127 = C196329ur.A01(A003, "requires_battery_not_low");
            int A0128 = C196329ur.A01(A003, "requires_storage_not_low");
            int A0129 = C196329ur.A01(A003, "trigger_content_update_delay");
            int A0130 = C196329ur.A01(A003, "trigger_max_content_delay");
            int A0131 = C196329ur.A01(A003, "content_uri_triggers");
            ArrayList A0w = AnonymousClass8BV.A0w(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A012)) {
                    str = null;
                } else {
                    str = A003.getString(A012);
                }
                Integer A072 = C20137A8y.A07(A003, A013);
                if (A003.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A014);
                }
                if (A003.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A015);
                }
                if (A003.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A016);
                }
                A6Y A004 = A6Y.A00(bArr);
                if (A003.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A017);
                }
                A6Y A005 = A6Y.A00(bArr2);
                long j = A003.getLong(A018);
                long j2 = A003.getLong(A019);
                long j3 = A003.getLong(A0110);
                int i = A003.getInt(A0111);
                Integer A082 = C20137A8y.A08(A003, A0112);
                long j4 = A003.getLong(A0113);
                long j5 = A003.getLong(A0114);
                long j6 = A003.getLong(A0115);
                long j7 = A003.getLong(A0116);
                boolean A1O = AnonymousClass000.A1O(A003.getInt(A0117));
                Integer A042 = C20137A8y.A04(A003.getInt(A0118));
                int i2 = A003.getInt(A0119);
                int i3 = A003.getInt(A0120);
                long j8 = A003.getLong(A0121);
                int i4 = A003.getInt(A0122);
                int i5 = A003.getInt(A0123);
                Integer A062 = C20137A8y.A06(A003, A0124);
                boolean A1O2 = AnonymousClass000.A1O(A003.getInt(A0125));
                boolean A1O3 = AnonymousClass000.A1O(A003.getInt(A0126));
                boolean A1O4 = AnonymousClass000.A1O(A003.getInt(A0127));
                boolean A1O5 = AnonymousClass000.A1O(A003.getInt(A0128));
                long j9 = A003.getLong(A0129);
                long j10 = A003.getLong(A0130);
                if (A003.isNull(A0131)) {
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0131);
                }
                A0w.add(new A2t(new C20078A6e(A062, C20137A8y.A09(bArr3), j9, j10, A1O2, A1O3, A1O4, A1O5), A004, A005, A072, A082, A042, str, str2, str3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, A1O));
            }
            return A0w;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public ArrayList BYc() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AHX A002 = A3D.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        C20076A6c a6c = this.A02;
        a6c.A06();
        Cursor A003 = AnonymousClass9OB.A00(a6c, A002, false);
        try {
            int A012 = C196329ur.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = C196329ur.A01(A003, "state");
            int A014 = C196329ur.A01(A003, "worker_class_name");
            int A015 = C196329ur.A01(A003, "input_merger_class_name");
            int A016 = C196329ur.A01(A003, "input");
            int A017 = C196329ur.A01(A003, "output");
            int A018 = C196329ur.A01(A003, "initial_delay");
            int A019 = C196329ur.A01(A003, "interval_duration");
            int A0110 = C196329ur.A01(A003, "flex_duration");
            int A0111 = C196329ur.A01(A003, "run_attempt_count");
            int A0112 = C196329ur.A01(A003, "backoff_policy");
            int A0113 = C196329ur.A01(A003, "backoff_delay_duration");
            int A0114 = C196329ur.A01(A003, "last_enqueue_time");
            int A0115 = C196329ur.A01(A003, "minimum_retention_duration");
            int A0116 = C196329ur.A01(A003, "schedule_requested_at");
            int A0117 = C196329ur.A01(A003, "run_in_foreground");
            int A0118 = C196329ur.A01(A003, "out_of_quota_policy");
            int A0119 = C196329ur.A01(A003, "period_count");
            int A0120 = C196329ur.A01(A003, "generation");
            int A0121 = C196329ur.A01(A003, "next_schedule_time_override");
            int A0122 = C196329ur.A01(A003, "next_schedule_time_override_generation");
            int A0123 = C196329ur.A01(A003, "stop_reason");
            int A0124 = C196329ur.A01(A003, "required_network_type");
            int A0125 = C196329ur.A01(A003, "requires_charging");
            int A0126 = C196329ur.A01(A003, "requires_device_idle");
            int A0127 = C196329ur.A01(A003, "requires_battery_not_low");
            int A0128 = C196329ur.A01(A003, "requires_storage_not_low");
            int A0129 = C196329ur.A01(A003, "trigger_content_update_delay");
            int A0130 = C196329ur.A01(A003, "trigger_max_content_delay");
            int A0131 = C196329ur.A01(A003, "content_uri_triggers");
            ArrayList A0w = AnonymousClass8BV.A0w(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A012)) {
                    str = null;
                } else {
                    str = A003.getString(A012);
                }
                Integer A072 = C20137A8y.A07(A003, A013);
                if (A003.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A014);
                }
                if (A003.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A015);
                }
                if (A003.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A016);
                }
                A6Y A004 = A6Y.A00(bArr);
                if (A003.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A017);
                }
                A6Y A005 = A6Y.A00(bArr2);
                long j = A003.getLong(A018);
                long j2 = A003.getLong(A019);
                long j3 = A003.getLong(A0110);
                int i = A003.getInt(A0111);
                Integer A082 = C20137A8y.A08(A003, A0112);
                long j4 = A003.getLong(A0113);
                long j5 = A003.getLong(A0114);
                long j6 = A003.getLong(A0115);
                long j7 = A003.getLong(A0116);
                boolean A1O = AnonymousClass000.A1O(A003.getInt(A0117));
                Integer A042 = C20137A8y.A04(A003.getInt(A0118));
                int i2 = A003.getInt(A0119);
                int i3 = A003.getInt(A0120);
                long j8 = A003.getLong(A0121);
                int i4 = A003.getInt(A0122);
                int i5 = A003.getInt(A0123);
                Integer A062 = C20137A8y.A06(A003, A0124);
                boolean A1O2 = AnonymousClass000.A1O(A003.getInt(A0125));
                boolean A1O3 = AnonymousClass000.A1O(A003.getInt(A0126));
                boolean A1O4 = AnonymousClass000.A1O(A003.getInt(A0127));
                boolean A1O5 = AnonymousClass000.A1O(A003.getInt(A0128));
                long j9 = A003.getLong(A0129);
                long j10 = A003.getLong(A0130);
                if (A003.isNull(A0131)) {
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0131);
                }
                A0w.add(new A2t(new C20078A6e(A062, C20137A8y.A09(bArr3), j9, j10, A1O2, A1O3, A1O4, A1O5), A004, A005, A072, A082, A042, str, str2, str3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, A1O));
            }
            return A0w;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public Integer BZd(String str) {
        AHX A022 = A3D.A02("SELECT state FROM workspec WHERE id=?", str);
        C20076A6c a6c = this.A02;
        a6c.A06();
        Integer num = null;
        Cursor A002 = AnonymousClass9OB.A00(a6c, A022, false);
        try {
            if (A002.moveToFirst() && !A002.isNull(0)) {
                int i = A002.getInt(0);
                if (Integer.valueOf(i) != null) {
                    num = C20137A8y.A05(i);
                }
            }
            return num;
        } finally {
            A002.close();
            A022.A00();
        }
    }

    public A2t Bbs(String str) {
        A2t a2t;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AHX A022 = A3D.A02("SELECT * FROM workspec WHERE id=?", str);
        C20076A6c a6c = this.A02;
        a6c.A06();
        Cursor A002 = AnonymousClass9OB.A00(a6c, A022, false);
        try {
            int A012 = C196329ur.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = C196329ur.A01(A002, "state");
            int A014 = C196329ur.A01(A002, "worker_class_name");
            int A015 = C196329ur.A01(A002, "input_merger_class_name");
            int A016 = C196329ur.A01(A002, "input");
            int A017 = C196329ur.A01(A002, "output");
            int A018 = C196329ur.A01(A002, "initial_delay");
            int A019 = C196329ur.A01(A002, "interval_duration");
            int A0110 = C196329ur.A01(A002, "flex_duration");
            int A0111 = C196329ur.A01(A002, "run_attempt_count");
            int A0112 = C196329ur.A01(A002, "backoff_policy");
            int A0113 = C196329ur.A01(A002, "backoff_delay_duration");
            int A0114 = C196329ur.A01(A002, "last_enqueue_time");
            int A0115 = C196329ur.A01(A002, "minimum_retention_duration");
            int A0116 = C196329ur.A01(A002, "schedule_requested_at");
            int A0117 = C196329ur.A01(A002, "run_in_foreground");
            int A0118 = C196329ur.A01(A002, "out_of_quota_policy");
            int A0119 = C196329ur.A01(A002, "period_count");
            int A0120 = C196329ur.A01(A002, "generation");
            int A0121 = C196329ur.A01(A002, "next_schedule_time_override");
            int A0122 = C196329ur.A01(A002, "next_schedule_time_override_generation");
            int A0123 = C196329ur.A01(A002, "stop_reason");
            int A0124 = C196329ur.A01(A002, "required_network_type");
            int A0125 = C196329ur.A01(A002, "requires_charging");
            int A0126 = C196329ur.A01(A002, "requires_device_idle");
            int A0127 = C196329ur.A01(A002, "requires_battery_not_low");
            int A0128 = C196329ur.A01(A002, "requires_storage_not_low");
            int A0129 = C196329ur.A01(A002, "trigger_content_update_delay");
            int A0130 = C196329ur.A01(A002, "trigger_max_content_delay");
            int A0131 = C196329ur.A01(A002, "content_uri_triggers");
            if (A002.moveToFirst()) {
                if (A002.isNull(A012)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(A012);
                }
                Integer A072 = C20137A8y.A07(A002, A013);
                if (A002.isNull(A014)) {
                    str3 = null;
                } else {
                    str3 = A002.getString(A014);
                }
                if (A002.isNull(A015)) {
                    str4 = null;
                } else {
                    str4 = A002.getString(A015);
                }
                if (A002.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = A002.getBlob(A016);
                }
                A6Y A003 = A6Y.A00(bArr);
                if (A002.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = A002.getBlob(A017);
                }
                A6Y A004 = A6Y.A00(bArr2);
                long j = A002.getLong(A018);
                long j2 = A002.getLong(A019);
                long j3 = A002.getLong(A0110);
                int i = A002.getInt(A0111);
                Integer A082 = C20137A8y.A08(A002, A0112);
                long j4 = A002.getLong(A0113);
                long j5 = A002.getLong(A0114);
                long j6 = A002.getLong(A0115);
                long j7 = A002.getLong(A0116);
                boolean A1O = AnonymousClass000.A1O(A002.getInt(A0117));
                Integer A042 = C20137A8y.A04(A002.getInt(A0118));
                int i2 = A002.getInt(A0119);
                int i3 = A002.getInt(A0120);
                long j8 = A002.getLong(A0121);
                int i4 = A002.getInt(A0122);
                int i5 = A002.getInt(A0123);
                Integer A062 = C20137A8y.A06(A002, A0124);
                boolean A1O2 = AnonymousClass000.A1O(A002.getInt(A0125));
                boolean A1O3 = AnonymousClass000.A1O(A002.getInt(A0126));
                boolean A1O4 = AnonymousClass000.A1O(A002.getInt(A0127));
                boolean A1O5 = AnonymousClass000.A1O(A002.getInt(A0128));
                long j9 = A002.getLong(A0129);
                long j10 = A002.getLong(A0130);
                if (A002.isNull(A0131)) {
                    bArr3 = null;
                } else {
                    bArr3 = A002.getBlob(A0131);
                }
                a2t = new A2t(new C20078A6e(A062, C20137A8y.A09(bArr3), j9, j10, A1O2, A1O3, A1O4, A1O5), A003, A004, A072, A082, A042, str2, str3, str4, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, A1O);
            } else {
                a2t = null;
            }
            return a2t;
        } finally {
            A002.close();
            A022.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.9O0, java.lang.Object] */
    public ArrayList Bbt(String str) {
        String str2;
        AHX A022 = A3D.A02("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str);
        C20076A6c a6c = this.A02;
        a6c.A06();
        Cursor A002 = AnonymousClass9OB.A00(a6c, A022, false);
        try {
            ArrayList A0w = AnonymousClass8BV.A0w(A002);
            while (A002.moveToNext()) {
                if (A002.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(0);
                }
                Integer A072 = C20137A8y.A07(A002, 1);
                C18070vi.A0e(str2, 1, A072);
                ? obj = new Object();
                obj.A01 = str2;
                obj.A00 = A072;
                A0w.add(obj);
            }
            return A0w;
        } finally {
            A002.close();
            A022.A00();
        }
    }

    public void Biq(String str, long j) {
        C20076A6c a6c = this.A02;
        a6c.A06();
        C19955A0m a0m = this.A0A;
        BDc A012 = a0m.A01();
        A012.BD9(1, j);
        if (str == null) {
            A012.BDA(2);
        } else {
            A012.BDB(2, str);
        }
        a6c.A07();
        try {
            AHW.A00(a6c, A012);
        } finally {
            C20076A6c.A02(a6c);
            a0m.A02(A012);
        }
    }

    public void CFq(String str, int i) {
        C20076A6c a6c = this.A02;
        a6c.A06();
        C19955A0m a0m = this.A0C;
        BDc A012 = a0m.A01();
        A012.BDB(1, str);
        A012.BD9(2, (long) i);
        a6c.A07();
        try {
            AHW.A00(a6c, A012);
        } finally {
            C20076A6c.A02(a6c);
            a0m.A02(A012);
        }
    }

    public void CJI(String str, long j) {
        C20076A6c a6c = this.A02;
        a6c.A06();
        C19955A0m a0m = this.A0D;
        BDc A012 = a0m.A01();
        A012.BD9(1, j);
        if (str == null) {
            A012.BDA(2);
        } else {
            A012.BDB(2, str);
        }
        a6c.A07();
        try {
            AHW.A00(a6c, A012);
        } finally {
            C20076A6c.A02(a6c);
            a0m.A02(A012);
        }
    }

    public void CJo(A6Y a6y, String str) {
        C20076A6c a6c = this.A02;
        a6c.A06();
        C19955A0m a0m = this.A0F;
        BDc A012 = a0m.A01();
        byte[] A013 = A6Y.A01(a6y);
        if (A013 == null) {
            A012.BDA(1);
        } else {
            A012.BD5(1, A013);
        }
        A012.BDB(2, str);
        a6c.A07();
        try {
            AHW.A00(a6c, A012);
        } finally {
            C20076A6c.A02(a6c);
            a0m.A02(A012);
        }
    }

    public void CKr(Integer num, String str) {
        C20076A6c a6c = this.A02;
        a6c.A06();
        C19955A0m a0m = this.A0G;
        BDc A012 = a0m.A01();
        A012.BD9(1, (long) C20137A8y.A01(num));
        if (str == null) {
            A012.BDA(2);
        } else {
            A012.BDB(2, str);
        }
        a6c.A07();
        try {
            AHW.A00(a6c, A012);
        } finally {
            C20076A6c.A02(a6c);
            a0m.A02(A012);
        }
    }

    public void CKt(String str, int i) {
        C20076A6c a6c = this.A02;
        a6c.A06();
        C19955A0m a0m = this.A0H;
        BDc A012 = a0m.A01();
        A012.BD9(1, (long) i);
        A012.BDB(2, str);
        a6c.A07();
        try {
            AHW.A00(a6c, A012);
        } finally {
            C20076A6c.A02(a6c);
            a0m.A02(A012);
        }
    }

    public C20365AHv(C20076A6c a6c) {
        this.A02 = a6c;
        this.A00 = new AnonymousClass8JE(a6c, this, 5);
        this.A01 = new AnonymousClass8JH(a6c, this, 12);
        this.A08 = new AnonymousClass8JH(a6c, this, 13);
        this.A0G = new AnonymousClass8JH(a6c, this, 14);
        this.A07 = new AnonymousClass8JH(a6c, this, 15);
        this.A03 = new AnonymousClass8JH(a6c, this, 16);
        this.A0F = new AnonymousClass8JH(a6c, this, 17);
        this.A0D = new AnonymousClass8JH(a6c, this, 18);
        this.A04 = new AnonymousClass8JH(a6c, this, 19);
        this.A06 = new AnonymousClass8JH(a6c, this, 4);
        this.A0E = new AnonymousClass8JH(a6c, this, 5);
        this.A0C = new AnonymousClass8JH(a6c, this, 6);
        this.A0A = new AnonymousClass8JH(a6c, this, 7);
        this.A05 = new AnonymousClass8JH(a6c, this, 8);
        this.A0B = new AnonymousClass8JH(a6c, this, 9);
        this.A09 = new AnonymousClass8JH(a6c, this, 10);
        this.A0H = new AnonymousClass8JH(a6c, this, 11);
    }

    public static void A00(C20365AHv aHv, HashMap hashMap) {
        byte[] bArr;
        int i;
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0:
            while (true) {
                i = 0;
                for (Object next : keySet) {
                    hashMap2.put(next, hashMap.get(next));
                    i++;
                    if (i == 999) {
                        A00(aHv, hashMap2);
                        hashMap2 = new HashMap(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                A00(aHv, hashMap2);
                return;
            }
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        for (int i2 = 0; i2 < size; i2++) {
            A10.append("?");
            if (i2 < size - 1) {
                A10.append(",");
            }
        }
        AHX A002 = A3D.A00(AnonymousClass8BU.A0q(A10), size);
        Iterator it = keySet.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (A0v == null) {
                A002.BDA(i3);
            } else {
                A002.BDB(i3, A0v);
            }
            i3++;
        }
        Cursor A003 = AnonymousClass9OB.A00(aHv.A02, A002, false);
        try {
            int A004 = C196329ur.A00(A003, "work_spec_id");
            if (A004 != -1) {
                while (A003.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(A003.getString(A004));
                    if (arrayList != null) {
                        if (A003.isNull(0)) {
                            bArr = null;
                        } else {
                            bArr = A003.getBlob(0);
                        }
                        arrayList.add(A6Y.A00(bArr));
                    }
                }
            }
        } finally {
            A003.close();
        }
    }

    public static void A01(C20365AHv aHv, HashMap hashMap) {
        String str;
        int i;
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0:
            while (true) {
                i = 0;
                for (Object next : keySet) {
                    hashMap2.put(next, hashMap.get(next));
                    i++;
                    if (i == 999) {
                        A01(aHv, hashMap2);
                        hashMap2 = new HashMap(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                A01(aHv, hashMap2);
                return;
            }
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        for (int i2 = 0; i2 < size; i2++) {
            A10.append("?");
            if (i2 < size - 1) {
                A10.append(",");
            }
        }
        AHX A002 = A3D.A00(AnonymousClass8BU.A0q(A10), size);
        Iterator it = keySet.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (A0v == null) {
                A002.BDA(i3);
            } else {
                A002.BDB(i3, A0v);
            }
            i3++;
        }
        Cursor A003 = AnonymousClass9OB.A00(aHv.A02, A002, false);
        try {
            int A004 = C196329ur.A00(A003, "work_spec_id");
            if (A004 != -1) {
                while (A003.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(A003.getString(A004));
                    if (arrayList != null) {
                        if (A003.isNull(0)) {
                            str = null;
                        } else {
                            str = A003.getString(0);
                        }
                        arrayList.add(str);
                    }
                }
            }
        } finally {
            A003.close();
        }
    }
}
