package X;

import android.view.View;
import com.whatsapp.areffects.tray.ArEffectsTrayFragment;
import java.util.List;

/* renamed from: X.3Vk  reason: invalid class name */
public final class AnonymousClass3Vk extends C37981qV {
    public final /* synthetic */ ArEffectsTrayFragment A00;

    public long A09() {
        return 125;
    }

    public boolean A0G(C42011xT r4, List list) {
        C18070vi.A0d(list, 1);
        if (!C18070vi.A18(C29431cG.A0c(list), "none_selected_drawable_changed")) {
            return A0J(r4);
        }
        if (r4.A01 == 1) {
            return true;
        }
        throw AnonymousClass000.A0n("Check failed.");
    }

    public AnonymousClass3Vk(ArEffectsTrayFragment arEffectsTrayFragment) {
        this.A00 = arEffectsTrayFragment;
    }

    public boolean A0J(C42011xT r4) {
        int i = r4.A01;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            View A0A = AnonymousClass3MW.A0A(((AnonymousClass3ZF) r4).A02);
            AnonymousClass00H r0 = this.A00.A03;
            if (r0 != null) {
                r0.get();
                C18070vi.A0d(A0A, 0);
                Object tag = A0A.getTag(2131432149);
                if (C18070vi.A18(tag, "default_true") || C18070vi.A18(tag, "default_false")) {
                    return false;
                }
                return true;
            }
            C18070vi.A11("thumbnailLoader");
            throw null;
        }
        return false;
    }
}
