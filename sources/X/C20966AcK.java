package X;

import com.whatsapp.util.Log;

/* renamed from: X.AcK  reason: case insensitive filesystem */
public final class C20966AcK implements AnonymousClass1O5 {
    public C189419jD A00;
    public final AnonymousClass1OZ A01;

    public C20966AcK(AnonymousClass1OZ r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void Bt9(C29621ca r5, String str) {
        C189419jD r2;
        C18070vi.A0d(r5, 1);
        C29621ca A0K = r5.A0K("error");
        if (A0K != null && (r2 = this.A00) != null) {
            r2.A00(A0K.A0A("code", 0));
        }
    }

    public void BrD(String str) {
        Log.e("delivery failure when setting member add mode");
        C189419jD r1 = this.A00;
        if (r1 != null) {
            r1.A00(500);
        }
    }

    public void C7Z(C29621ca r2, String str) {
        Log.i("successfully set member add mode");
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
