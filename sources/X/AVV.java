package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;

public final /* synthetic */ class AVV implements B8D {
    public final /* synthetic */ C186009dV A00;
    public final /* synthetic */ AnonymousClass99o A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9fc] */
    public final A88 CGA(C191779nA r13) {
        C186009dV r4 = this.A00;
        String str = this.A02;
        AnonymousClass99o r5 = this.A01;
        String str2 = this.A03;
        ? obj = new Object();
        if (str != null) {
            boolean z = r5.A03;
            C17960vV.A0F(z, "Should only set final hash for streaming uploads");
            r5.A00 = AnonymousClass1EG.A0A(str);
            C18070vi.A0d(r13, 0);
            C17960vV.A0F(z, "Should only finalize for streaming uploads");
            C17960vV.A0F(AnonymousClass000.A1W(r5.A00), "Must set final hash before finalizing streaming upload");
            Uri.Builder A002 = AnonymousClass99o.A00(r13, r5);
            A002.appendQueryParameter("final_hash", r5.A00);
            String A0H = C18070vi.A0H(A002.build());
            A7N A003 = r4.A00.A00(new C20668AUa(obj, r4, 2), (C184599bD) null, A0H, str2, (String) null, 0, AnonymousClass000.A1P(r13.A00));
            try {
                int A04 = A003.A04(r13);
                String str3 = A003.A03;
                long j = A003.A00;
                long j2 = A003.A01;
                obj.A01 = new C129746iI(A003.A02, str3, j, j2, (long) A04);
                obj.A00 = A04;
                if (A04 == 200) {
                    obj.A04 = true;
                }
            } catch (IOException e) {
                Log.e("Error while finalizing upload", e);
            }
        }
        if (obj.A04) {
            return A88.A02(obj);
        }
        return A88.A03(obj, obj.A00);
    }

    public /* synthetic */ AVV(C186009dV r1, AnonymousClass99o r2, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
        this.A03 = str2;
    }
}
