package X;

import com.whatsapp.areffects.viewmodel.savedstate.SavedStateHandleStateSaver$getStateToRestore$2;
import java.util.Set;

/* renamed from: X.4hM  reason: invalid class name and case insensitive filesystem */
public final class C92474hM implements C108205bJ {
    public final C37361pP A00;
    public final Set A01 = C17880vN.A14();
    public final C18600wl A02;

    public boolean BjK(C108345bY r4, Integer num) {
        boolean A17 = C18070vi.A17(r4, num);
        if (num != AnonymousClass00R.A01) {
            return false;
        }
        this.A01.add(new C89504cZ(r4));
        return A17;
    }

    public void CGl(Integer num, String str) {
        C18070vi.A0d(num, 0);
        if (num == AnonymousClass00R.A01) {
            Set set = this.A01;
            if (!set.isEmpty()) {
                C17960vV.A02();
                this.A00.A04("ar_effects_saved_state", C29431cG.A0t(set));
                set.clear();
            }
        }
    }

    public Object BZe(String str, C30391dr r5) {
        return C30451dy.A00(r5, this.A02, new SavedStateHandleStateSaver$getStateToRestore$2(this, (C30391dr) null));
    }

    public C92474hM(C37361pP r2, C18600wl r3) {
        this.A00 = r2;
        this.A02 = r3;
    }
}
