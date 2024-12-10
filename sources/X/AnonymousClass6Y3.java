package X;

import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import com.whatsapp.wabloks.base.BkFragment;

/* renamed from: X.6Y3  reason: invalid class name */
public abstract class AnonymousClass6Y3 {
    public static final BkFcsPreloadingScreenFragment A00(ADL adl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C18070vi.A0d(str, 0);
        C18070vi.A0o(str2, str3, str4);
        C108965cb.A1P(str7, 7, str8);
        BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment = new BkFcsPreloadingScreenFragment();
        bkFcsPreloadingScreenFragment.A2A(str);
        if (bkFcsPreloadingScreenFragment.A06 == null) {
            bkFcsPreloadingScreenFragment.A1R(C17880vN.A0D());
        }
        bkFcsPreloadingScreenFragment.A15().putString("config_prefixed_state_name", str2);
        C108995ce.A1F(bkFcsPreloadingScreenFragment, adl, str6, str5);
        BkFragment.A03(bkFcsPreloadingScreenFragment);
        bkFcsPreloadingScreenFragment.A15().putString("data_module_job_id", str3);
        bkFcsPreloadingScreenFragment.A15().putString("data_module_namespace", str4);
        if (bkFcsPreloadingScreenFragment.A06 == null) {
            bkFcsPreloadingScreenFragment.A1R(C17880vN.A0D());
        }
        bkFcsPreloadingScreenFragment.A15().putString("fds_manager_id", str7);
        if (bkFcsPreloadingScreenFragment.A06 == null) {
            bkFcsPreloadingScreenFragment.A1R(C17880vN.A0D());
        }
        bkFcsPreloadingScreenFragment.A15().putString("observer_id", str8);
        return bkFcsPreloadingScreenFragment;
    }
}
