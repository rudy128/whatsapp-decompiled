package X;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.9od  reason: invalid class name and case insensitive filesystem */
public final class C192579od {
    public final C26031Qo A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass18K A02;
    public final HashMap A03 = C17880vN.A11();

    public final void A00(String str) {
        C18070vi.A0d(str, 0);
        HashMap hashMap = this.A03;
        if (hashMap.containsKey(str)) {
            this.A00.A00(AnonymousClass8oD.A00, (String) null);
        }
        hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void A01(String str, String str2) {
        C18070vi.A0d(str, 0);
        HashMap hashMap = this.A03;
        Number A1D = C108945cZ.A1D(str, hashMap);
        if (A1D == null) {
            this.A00.A00(AnonymousClass8oD.A01, (String) null);
            return;
        }
        hashMap.remove(str);
        C22681Cu r4 = new C22681Cu();
        r4.A02 = C17900vP.A0A(str, str2);
        r4.A00 = C108945cZ.A1B(SystemClock.elapsedRealtime(), A1D.longValue());
        this.A02.CC7(r4);
    }

    public C192579od(AnonymousClass11P r2, C26031Qo r3, AnonymousClass18K r4) {
        C18070vi.A0o(r4, r2, r3);
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = r3;
    }
}
