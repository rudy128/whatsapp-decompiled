package X;

import android.util.Pair;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4pd  reason: invalid class name and case insensitive filesystem */
public final class C97534pd implements AnonymousClass1O5 {
    public final AnonymousClass5a0 A00;

    public void Bt9(C29621ca r3, String str) {
        C18070vi.A0d(r3, 1);
        this.A00.onError(C60482o6.A00(r3));
    }

    public void C7Z(C29621ca r11, String str) {
        C29621ca A0K;
        C29621ca A0K2;
        List<C29621ca> A0R;
        C18070vi.A0d(r11, 1);
        if (r11.A0F(AnonymousClass1EC.class, "from") == null || (A0K = r11.A0K("links")) == null || (A0K2 = A0K.A0K("link")) == null || (A0R = A0K2.A0R("group")) == null || A0R.isEmpty()) {
            this.A00.onError(-1);
            return;
        }
        HashSet A12 = C17880vN.A12();
        HashSet A122 = C17880vN.A12();
        for (C29621ca r2 : A0R) {
            Jid A0F = r2.A0F(GroupJid.class, "jid");
            if (A0F != null) {
                A12.add(C17890vO.A0E(A0F, r2.A0A("error", -1)));
                List<C29621ca> A0R2 = r2.A0R("participant");
                C18070vi.A0X(A0R2);
                for (C29621ca r22 : A0R2) {
                    Jid A0F2 = r22.A0F(UserJid.class, "jid");
                    if (A0F2 != null) {
                        A122.add(C17890vO.A0E(A0F2, r22.A0A("error", -1)));
                    }
                }
            }
        }
        AnonymousClass5a0 r4 = this.A00;
        AnonymousClass41D r1 = new AnonymousClass41D(A12, A122);
        C96444nr r42 = (C96444nr) r4;
        if (r42.A00 != 0) {
            Set set = r1.A00;
            ArrayList<Pair> A13 = AnonymousClass000.A13();
            for (Object next : set) {
                Number number = (Number) ((Pair) next).second;
                if (number != null && -1 == number.intValue()) {
                    A13.add(next);
                }
            }
            ArrayList<Object> A132 = AnonymousClass000.A13();
            for (Pair pair : A13) {
                Object obj = pair.first;
                if (obj != null) {
                    A132.add(obj);
                }
            }
            AnonymousClass4X4 r3 = (AnonymousClass4X4) r42.A01;
            for (Object remove : A132) {
                r3.A0H.remove(remove);
            }
            AnonymousClass4X4.A00(r3, r3.A0I.decrementAndGet());
            return;
        }
        Log.e("LinkExistingGroupsUseCase/LinkSubgroupsProtocolHelper/response");
        ((C30391dr) r42.A01).resumeWith(r1);
    }

    public void BrD(String str) {
        C96444nr r1 = (C96444nr) this.A00;
        if (r1.A00 != 0) {
            AnonymousClass4X4 r12 = (AnonymousClass4X4) r1.A01;
            AnonymousClass4X4.A00(r12, r12.A0I.decrementAndGet());
            return;
        }
        Log.e("LinkExistingGroupsUseCase/LinkSubgroupsProtocolHelper/timeout");
        ((C30391dr) r1.A01).resumeWith(new AnonymousClass41A(-2));
    }

    public C97534pd(AnonymousClass5a0 r1) {
        this.A00 = r1;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
