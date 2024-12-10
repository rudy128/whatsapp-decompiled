package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ajx  reason: case insensitive filesystem */
public class C21430Ajx implements Runnable {
    public final C113975oM A00;
    public final /* synthetic */ A7W A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21430Ajx(A7W a7w, String str) {
        this();
        this.A01 = a7w;
        this.A02 = str;
    }

    public void run() {
        Cursor A002;
        String str;
        byte[] bArr;
        byte[] bArr2;
        try {
            C20365AHv aHv = (C20365AHv) this.A01.A04.A0E();
            AHX A022 = A3D.A02("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", this.A02);
            C20076A6c a6c = aHv.A02;
            a6c.A06();
            a6c.A07();
            try {
                A002 = AnonymousClass9OB.A00(a6c, A022, true);
                HashMap A11 = C17880vN.A11();
                HashMap A112 = C17880vN.A11();
                while (A002.moveToNext()) {
                    AnonymousClass8BY.A0g(A002, A11);
                    AnonymousClass8BY.A0g(A002, A112);
                }
                A002.moveToPosition(-1);
                C20365AHv.A01(aHv, A11);
                C20365AHv.A00(aHv, A112);
                ArrayList A0w = AnonymousClass8BV.A0w(A002);
                while (A002.moveToNext()) {
                    if (A002.isNull(0)) {
                        str = null;
                    } else {
                        str = A002.getString(0);
                    }
                    Integer A07 = C20137A8y.A07(A002, 1);
                    if (A002.isNull(2)) {
                        bArr = null;
                    } else {
                        bArr = A002.getBlob(2);
                    }
                    A6Y A003 = A6Y.A00(bArr);
                    int i = A002.getInt(3);
                    int i2 = A002.getInt(4);
                    long j = A002.getLong(13);
                    long j2 = A002.getLong(14);
                    long j3 = A002.getLong(15);
                    Integer A08 = C20137A8y.A08(A002, 16);
                    long j4 = A002.getLong(17);
                    long j5 = A002.getLong(18);
                    int i3 = A002.getInt(19);
                    long j6 = A002.getLong(20);
                    int i4 = A002.getInt(21);
                    Integer A06 = C20137A8y.A06(A002, 5);
                    boolean A1O = AnonymousClass000.A1O(A002.getInt(6));
                    boolean A1O2 = AnonymousClass000.A1O(A002.getInt(7));
                    boolean A1O3 = AnonymousClass000.A1O(A002.getInt(8));
                    boolean A1O4 = AnonymousClass000.A1O(A002.getInt(9));
                    long j7 = A002.getLong(10);
                    long j8 = A002.getLong(11);
                    if (A002.isNull(12)) {
                        bArr2 = null;
                    } else {
                        bArr2 = A002.getBlob(12);
                    }
                    A0w.add(new C196099uS(new C20078A6e(A06, C20137A8y.A09(bArr2), j7, j8, A1O, A1O2, A1O3, A1O4), A003, A07, A08, str, AnonymousClass8BY.A0a(A002, A11), AnonymousClass8BY.A0a(A002, A112), i, i3, i2, i4, j, j2, j3, j4, j5, j6));
                }
                a6c.A08();
                A002.close();
                A022.A00();
                C20076A6c.A02(a6c);
                this.A00.A05((List) A2t.A0N.apply(A0w));
            } catch (Throwable th) {
                C20076A6c.A02(a6c);
                throw th;
            }
        } catch (Throwable th2) {
            this.A00.A06(th2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5oM, java.lang.Object] */
    public C21430Ajx() {
        this.A00 = new Object();
    }
}
