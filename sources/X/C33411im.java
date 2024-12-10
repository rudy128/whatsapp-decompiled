package X;

import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1im  reason: invalid class name and case insensitive filesystem */
public final class C33411im implements AnonymousClass1RJ {
    public final AnonymousClass00H A00;

    public C33411im(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public int[] BSG() {
        return new int[]{249};
    }

    public boolean BcT(Message message, int i) {
        C29621ca r1;
        C18070vi.A0d(message, 1);
        if (i == 249) {
            Object obj = message.obj;
            if ((obj instanceof C29621ca) && (r1 = (C29621ca) obj) != null) {
                List<C29621ca> A0R = r1.A0R("notice");
                C18070vi.A0X(A0R);
                ArrayList arrayList = new ArrayList();
                for (C29621ca A0Q : A0R) {
                    String A0Q2 = A0Q.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                    if (A0Q2 != null) {
                        arrayList.add(A0Q2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    if (((String) next).length() > 0) {
                        arrayList2.add(next);
                    }
                }
                C145887Mz.A00((C145887Mz) this.A00.get(), arrayList2, 0);
                return true;
            }
        }
        return false;
    }
}
