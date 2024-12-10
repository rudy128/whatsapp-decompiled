package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.2z3  reason: invalid class name and case insensitive filesystem */
public final class C66982z3 implements AnonymousClass5ZX {
    public final C34811l7 A00;

    public C66982z3(C34811l7 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CBR(Context context, AnonymousClass5XY r9, AnonymousClass206 r10, C20285AEt aEt, int i) {
        C20277AEk aEk;
        if ((aEt.A03() || (context instanceof Activity)) && (aEk = aEt.A06) != null) {
            try {
                this.A00.A03(AnonymousClass1L9.A00(context), r9, r10, ((C20253ADl) aEk.A03.get(i)).A01, i);
            } catch (JSONException e) {
                Log.e("NativeFlowAction/handleRequest : ConversationRow exception processing NFM message", e);
            }
        }
    }
}
