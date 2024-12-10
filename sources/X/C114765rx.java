package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.voipcalling.VoipDialogManagerActivity$DialogWrapperFragment;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5rx  reason: invalid class name and case insensitive filesystem */
public abstract class C114765rx extends C166678dR {
    public final Map A00 = C17880vN.A13();

    public final void A4f(C010105w r4, String str) {
        C18070vi.A0d(r4, 0);
        A4g(new VoipDialogManagerActivity$DialogWrapperFragment(r4), new C139876za(false, true), str);
    }

    public final void A4g(DialogFragment dialogFragment, C139876za r5, String str) {
        Fragment fragment;
        C18070vi.A0d(dialogFragment, 0);
        Map map = this.A00;
        AnonymousClass1D6 r0 = (AnonymousClass1D6) map.get(str);
        if (r0 == null || (fragment = (Fragment) r0.first) == null || !fragment.A1b()) {
            map.put(str, AnonymousClass1D6.A01(dialogFragment, r5));
            CMm(dialogFragment, str);
        }
    }

    public final void A4h(DialogFragment dialogFragment, String str) {
        A4g(dialogFragment, new C139876za(false, true), str);
    }

    public final void A4i(Integer num) {
        boolean z;
        Map map = this.A00;
        Iterator A15 = AnonymousClass000.A15(AnonymousClass1D7.A0F(map));
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            AnonymousClass1D6 r0 = (AnonymousClass1D6) A16.getValue();
            DialogFragment dialogFragment = (DialogFragment) r0.first;
            C139876za r2 = (C139876za) r0.second;
            if (dialogFragment.A1b()) {
                int intValue = num.intValue();
                if (intValue != 2) {
                    if (intValue == 3) {
                        z = r2.A01;
                    }
                    dialogFragment.A29();
                } else {
                    z = r2.A00;
                }
                if (!z) {
                }
                dialogFragment.A29();
            }
            if (!r2.A01) {
                map.remove(key);
            }
        }
    }

    public final boolean A4k() {
        Fragment fragment;
        AnonymousClass1D6 r0 = (AnonymousClass1D6) this.A00.get("ParticipantListBottomSheetDialog");
        if (r0 == null || (fragment = (Fragment) r0.first) == null) {
            return false;
        }
        return C108975cc.A1B(fragment.A1b() ? 1 : 0);
    }

    public final void A4j(String str) {
        A41(str);
        this.A00.remove(str);
    }
}
