package X;

import com.whatsapp.util.Log;

/* renamed from: X.7El  reason: invalid class name and case insensitive filesystem */
public class C143697El implements C23501Gn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C143697El(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A00(C143697El r3) {
        ((long[]) r3.A02)[0] = -2;
    }

    public void C2V() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass70C) this.A01).A00.CGP(new C146757Qm(this.A02, 49));
                return;
            case 1:
                throw AnonymousClass000.A0n("DebugInfoBuilder/getDebugInfoForSupportPayload/must not be called/external-storage-readonly");
            default:
                throw AnonymousClass000.A0n("must not be called");
        }
    }

    public void C2W() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass70C) this.A01).A00.CGP(new C146517Pk(this, this.A02, 11));
                return;
            case 1:
                throw AnonymousClass000.A0n("DebugInfoBuilder/getDebugInfoForSupportPayload/must not be called/external-storage-readonly/permission denied/");
            default:
                throw AnonymousClass000.A0n("must not be called");
        }
    }

    public void C9R() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass70C) this.A01).A00.CGP(new AnonymousClass7RB(this.A02, 0));
                return;
            case 1:
                A00(this);
                Log.i("DebugInfoBuilder/getDebugInfoForSupportPayload/error-external-storage-unavailable");
                return;
            default:
                A00(this);
                return;
        }
    }

    public void C9S() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass70C) this.A01).A00.CGP(new C146517Pk(this, this.A02, 10));
                return;
            case 1:
                A00(this);
                Log.i("DebugInfoBuilder/getDebugInfoForSupportPayload/error-external-storage-unavailable/permission denied");
                return;
            default:
                A00(this);
                return;
        }
    }
}
