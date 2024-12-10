package X;

import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import com.whatsapp.wabloks.ui.bottomsheet.Hilt_BkBottomSheetContainerFragment;
import java.util.Stack;
import java.util.UUID;

/* renamed from: X.6xk  reason: invalid class name and case insensitive filesystem */
public final class C138816xk {
    public static final Stack A01 = new Stack();
    public final AnonymousClass00H A00;

    public C138816xk(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment, androidx.fragment.app.Fragment, java.lang.Object, com.whatsapp.wabloks.ui.bottomsheet.Hilt_BkBottomSheetContainerFragment, androidx.fragment.app.DialogFragment] */
    public final void A00(AnonymousClass1FL r5, C133336oa r6) {
        C18070vi.A0d(r5, 0);
        if (r6.A00() != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("bottom_sheet_fragment_tag");
            String A0V = C17890vO.A0V(UUID.randomUUID(), A10);
            C17960vV.A07(r6);
            BkBottomSheetContentFragment A002 = BkBottomSheetContentFragment.A06.A00(r6, (C20000A2o) C18070vi.A0E(this.A00), A0V, false);
            ? hilt_BkBottomSheetContainerFragment = new Hilt_BkBottomSheetContainerFragment();
            hilt_BkBottomSheetContainerFragment.A00 = new C19760yx(A002, A0V);
            if (!hilt_BkBottomSheetContainerFragment.A1e()) {
                AnonymousClass1GP supportFragmentManager = r5.getSupportFragmentManager();
                C17960vV.A07(supportFragmentManager);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("bottom_sheet_container_tag");
                hilt_BkBottomSheetContainerFragment.A2C(supportFragmentManager, C17890vO.A0V(UUID.randomUUID(), A102));
                A01.push(hilt_BkBottomSheetContainerFragment);
                return;
            }
            return;
        }
        throw new AnonymousClass6SR();
    }
}
