package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AcR  reason: case insensitive filesystem */
public final class C20973AcR implements AnonymousClass1O5 {
    public final C189879k0 A00;
    public final AnonymousClass1OZ A01;
    public final C24521Kq A02;

    public void C7Z(C29621ca r5, String str) {
        C182969Wk r1;
        String A0M;
        C18070vi.A0d(r5, 1);
        Log.e("GetCustomUrlsByJidProtocol/onSuccess");
        C29621ca A0K = r5.A0K("custom_urls");
        if (A0K != null) {
            List A0R = A0K.A0R("custom_url");
            ArrayList A0t = C108965cb.A0t(A0R);
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                C29621ca A0K2 = C17880vN.A0a(it).A0K("path");
                if (!(A0K2 == null || (A0M = A0K2.A0M()) == null || A0M.length() == 0)) {
                    A0t.add(A0M);
                }
            }
            r1 = new C182969Wk(A0t);
        } else {
            r1 = new C182969Wk((List) null);
        }
        this.A00.A00(r1);
    }

    public void BrD(String str) {
        Log.e("GetCustomUrlsByJidProtocol/onDeliveryFailure");
        this.A00.A00(new C182969Wk((List) null));
    }

    public void Bt9(C29621ca r3, String str) {
        Log.e("GetCustomUrlsByJidProtocol/onError");
        this.A00.A00(new C182969Wk((List) null));
    }

    public C20973AcR(C189879k0 r1, C24521Kq r2, AnonymousClass1OZ r3) {
        C18070vi.A0j(r3, r2);
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = r1;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
