package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.A3w  reason: case insensitive filesystem */
public final class C20027A3w {
    public final A6T A00;

    public C20027A3w(A6T a6t) {
        C18070vi.A0d(a6t, 1);
        this.A00 = a6t;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.9O2] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.9O2] */
    public static final AnonymousClass9O2 A01(C29621ca r8) {
        int i;
        AnonymousClass9O2 r0;
        boolean z = false;
        String str = null;
        if (r8 == null) {
            ? obj = new Object();
            obj.A00 = 0;
            obj.A03 = false;
            obj.A02 = null;
            r0 = obj;
        } else {
            C29621ca A0K = r8.A0K("status");
            C29621ca A0K2 = r8.A0K("can_appeal");
            C29621ca A0K3 = r8.A0K("reject_reason");
            C29621ca A0K4 = r8.A0K("commerce_url");
            String A0o = AnonymousClass8BU.A0o(A0K);
            if (AnonymousClass1EG.A0H(A0o) || "approved".equalsIgnoreCase(A0o)) {
                i = 0;
            } else {
                i = C72453Mb.A03("rejected".equalsIgnoreCase(A0o) ? 1 : 0);
            }
            String A0o2 = AnonymousClass8BU.A0o(A0K3);
            if (A0K4 != null) {
                str = A0K4.A0M();
            }
            if (A0K2 != null && Boolean.parseBoolean(A0K2.A0M())) {
                z = true;
            }
            ? obj2 = new Object();
            obj2.A00 = i;
            obj2.A03 = z;
            obj2.A02 = A0o2;
            r0 = obj2;
        }
        r0.A01 = str;
        return r0;
    }

    public static final C195129sq A00(C20027A3w a3w, C29621ca r8) {
        C20287AEv A03;
        List A0R = r8.A0R("product");
        ArrayList A0t = C108965cb.A0t(A0R);
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            C29621ca A0a = C17880vN.A0a(it);
            if (!(A0a == null || (A03 = a3w.A00.A03(A0a)) == null)) {
                A0t.add(A03);
            }
        }
        C29621ca A0K = r8.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29621ca A0K2 = r8.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C29621ca A0K3 = r8.A0K("status_info");
        String A0o = AnonymousClass8BU.A0o(A0K);
        String A0o2 = AnonymousClass8BU.A0o(A0K2);
        if (A0o != null && A0o2 != null) {
            return new C195129sq(A01(A0K3), (Integer) null, A0o, A0o2, A0t);
        }
        Log.e("CollectionParser/parseCollectionNode/required fields missing");
        return null;
    }
}
