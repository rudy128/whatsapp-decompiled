package X;

import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9ja  reason: invalid class name and case insensitive filesystem */
public abstract class C189649ja {
    public final C222119a A00;

    public void A00(Intent intent) {
        if (intent != null) {
            long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
            String stringExtra = intent.getStringExtra("perf_origin");
            if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                this.A00.A0D(stringExtra, longExtra);
                return;
            }
        }
        Log.e("Expect to have origin for perf tracking.");
        this.A00.A0D("unknown", -1);
    }

    public C189649ja(AnonymousClass11P r13, AnonymousClass118 r14, C18030ve r15, AnonymousClass18K r16, AnonymousClass19V r17, AnonymousClass19Y r18, AnonymousClass19T r19, AnonymousClass198 r20, AnonymousClass10I r21, String str, int i) {
        C222119a r0 = new C222119a(r13, r14, r15, r16, r17, r18, r19, r20, r21, str, i);
        this.A00 = r0;
        r0.A05.A04 = true;
    }
}
