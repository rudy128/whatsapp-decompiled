package X;

import com.whatsapp.util.Log;

/* renamed from: X.9xP  reason: invalid class name and case insensitive filesystem */
public class C197869xP {
    public final AnonymousClass1TM A00;
    public final AnonymousClass19T A01;

    public static void A00(C197869xP r3, String str, String str2) {
        if (!C18020vd.A05(C18040vf.A02, r3.A00.A01, 6076)) {
            Log.w("emitFailure suppressed");
            return;
        }
        AnonymousClass19T r32 = r3.A01;
        r32.markerStart(494345136);
        r32.markerAnnotate(494345136, "is_success", false);
        r32.markerAnnotate(494345136, "failure_type", str);
        if (str2 != null) {
            r32.markerAnnotate(494345136, "failure_payload", str2);
        }
        r32.markerEnd(494345136, 2);
    }

    public C197869xP(AnonymousClass1TM r1, AnonymousClass19T r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
