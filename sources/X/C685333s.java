package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.33s  reason: invalid class name and case insensitive filesystem */
public class C685333s implements C22554BCn {
    public final /* synthetic */ AnonymousClass192 A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ void Bpi(String str) {
    }

    public /* synthetic */ void Bpq() {
    }

    public C685333s(AnonymousClass192 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void Bqr(long j) {
    }

    public void Bt0(String str) {
        C17900vP.A0e("app/CrashLogs/uploadCrashData/error received: ", str, AnonymousClass000.A10());
        AnonymousClass192.A08(this.A00, "upload-error-from-server", this.A01);
    }

    public void C3W(String str, Map map) {
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            A15.next();
        }
    }
}
