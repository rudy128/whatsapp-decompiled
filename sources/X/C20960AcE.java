package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AcE  reason: case insensitive filesystem */
public final class C20960AcE implements AnonymousClass1O5 {
    public final AnonymousClass9XZ A00;

    public C20960AcE(AnonymousClass9XZ r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void C7Z(C29621ca r7, String str) {
        AnonymousClass1FU r3;
        Runnable runnable;
        C29621ca A0K;
        List A0R;
        C18070vi.A0d(r7, 1);
        if (r7.A0F(AnonymousClass1EC.class, "from") == null || (A0K = r7.A0K("unlink")) == null || (A0R = A0K.A0R("group")) == null || A0R.isEmpty()) {
            C20039A4i a4i = this.A00.A00;
            r3 = a4i.A00;
            if (r3 != null) {
                runnable = new AnonymousClass7RM((Object) a4i, -3, 11);
            } else {
                return;
            }
        } else {
            HashSet A12 = C17880vN.A12();
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                C29621ca A0a = C17880vN.A0a(it);
                Jid A0F = A0a.A0F(GroupJid.class, "jid");
                if (A0F != null) {
                    C108965cb.A1Q(A0F, Integer.valueOf(A0a.A0A("error", -1)), A12);
                }
            }
            C20039A4i a4i2 = this.A00.A00;
            r3 = a4i2.A00;
            if (r3 != null) {
                runnable = new C146507Pj(a4i2, A12, 8);
            } else {
                return;
            }
        }
        r3.runOnUiThread(runnable);
    }

    public void BrD(String str) {
        C20039A4i a4i = this.A00.A00;
        AnonymousClass1FU r2 = a4i.A00;
        if (r2 != null) {
            r2.runOnUiThread(new C21355Aik(a4i, 32));
        }
    }

    public void Bt9(C29621ca r6, String str) {
        int A01 = AnonymousClass8BW.A01(r6);
        C20039A4i a4i = this.A00.A00;
        AnonymousClass1FU r2 = a4i.A00;
        if (r2 != null) {
            r2.runOnUiThread(new AnonymousClass7RM((Object) a4i, A01, 11));
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
