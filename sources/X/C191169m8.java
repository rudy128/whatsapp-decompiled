package X;

import android.database.SQLException;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.9m8  reason: invalid class name and case insensitive filesystem */
public final class C191169m8 {
    public final AnonymousClass11S A00;
    public final C33251iW A01;
    public final C26811To A02;
    public final AnonymousClass9XQ A03;

    public final void A00(String str) {
        Set A0D;
        C28791au A05;
        String str2 = str;
        C18070vi.A0d(str, 0);
        C26811To r3 = this.A02;
        C169718mm r0 = (C169718mm) ((C58862lN) r3.A0a.get()).A00("setting_pushName");
        if (r0 == null) {
            A0D = Collections.emptySet();
        } else {
            A0D = r3.A0D(Collections.singletonList(new AnonymousClass8q6((C19999A2n) null, (String) null, str2, AnonymousClass11P.A01(r0.A01))));
        }
        C18070vi.A0X(A0D);
        this.A00.A0L(str);
        try {
            A05 = this.A03.A00.A05();
            C28341Zz.A03(((C28801av) A05).A02, "user_push_name", str, AnonymousClass9XQ.class.getName());
            A05.close();
        } catch (SQLException e) {
            Log.e("UserSettingsStore/updatePushName/Error updating push name", e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        r3.A0R(A0D);
        C17880vN.A0U(this.A01.A1P).A0M(Message.obtain((Handler) null, 0, 3, 0, str));
        return;
        throw th;
    }

    public C191169m8(AnonymousClass11S r1, C33251iW r2, C26811To r3, AnonymousClass9XQ r4) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
