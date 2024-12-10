package X;

import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.73L  reason: invalid class name */
public final class AnonymousClass73L {
    public final List A00;

    public static C144247Go A01(C160998Ax r2, Object obj, String str, int i) {
        return new C144247Go(r2, new C144257Gp(4, str, obj), i);
    }

    public AnonymousClass73L() {
        try {
            C128466g3[] r4 = new C128466g3[21];
            C128456g2[] r5 = new C128456g2[2];
            r5[0] = new C128456g2(A02(12158, (Object) null), 2500, "control");
            r4[0] = new C128466g3(A01(new C144257Gp(4, "platform", "android"), "beta", "release_channel", 0), "android_audio_guidance_offline_universe1", C18070vi.A0M(new C129676iB((C160998Ax) null, "android_audio_guidance_offline_aa_test1", C18070vi.A0O(new C128456g2(A02(12158, (Object) null), 2500, "test"), r5, 1), 1732317093, 1733731200)));
            C128456g2[] r8 = new C128456g2[2];
            A03("control", A02(11568, (Object) null), r8, 500);
            r4[1] = new C128466g3(new C144247Go(new C144257Gp(4, "platform", "android"), new C144257Gp(4, "release_channel", "release"), 0), "android_back_nav_pre_pn_prod_universe", C18070vi.A0M(new C129676iB(new C144257Gp(9, "app_version", "2.24.23.78"), "android_back_nav_pre_pn_prod", C18070vi.A0O(new C128456g2(A02(11568, 1), 500, "test"), r8, 1), 1732055071, 1738299600)));
            C18460wS r21 = C18460wS.A00;
            String[] A1Z = C17880vN.A1Z();
            A1Z[0] = "android";
            C144257Gp r3 = new C144257Gp("platform", C18070vi.A0O("smba", A1Z, 1));
            String[] strArr = new String[3];
            strArr[0] = "alpha";
            strArr[1] = "beta";
            r4[2] = new C128466g3(new C144247Go(r3, new C144257Gp("release_channel", C18070vi.A0O("release", strArr, 2)), 0), "android_confluence_tos_pp_link_update_universe", r21);
            C128456g2[] r10 = new C128456g2[2];
            A03("control", A02(9458, 1), r10, 5000);
            r4[3] = new C128466g3(A00(new C144257Gp(4, "platform", "android"), "2.24.12.36", "app_version", 9), "android_project_crust_v1_universe", C18070vi.A0M(new C129676iB((C160998Ax) null, "android_project_crust_enabled_v2", C18070vi.A0O(new C128456g2(A02(9458, 1), 5000, "test"), r10, 1), 1718341200, 1727758800)));
            C128456g2[] r82 = new C128456g2[2];
            A03("control", A02(7228, (Object) null), r82, 5000);
            r4[4] = new C128466g3(A00(new C144257Gp(4, "platform", "android"), "release", "release_channel", 4), "android_rollout_quebec_tos_reg_universe", C18070vi.A0M(new C129676iB(new C144257Gp(7, "app_version", "2.24.4.18"), "android_rollout_ca_tos_reg_experiment", C18070vi.A0O(new C128456g2(A02(7228, 1), 5000, "test"), r82, 1), 1709258400, 1712127600)));
            C128456g2[] r102 = new C128456g2[2];
            A03("control", A02(7228, (Object) null), r102, 2500);
            List A0M = C18070vi.A0M(new C129676iB(new C144257Gp(7, "app_version", "2.24.4.18"), "android_rollout_ca_tos_reg_experiment_2", C18070vi.A0O(new C128456g2(A02(7228, 1), 2500, "test"), r102, 1), 1712300400, 1713855600));
            C144257Gp r11 = new C144257Gp("platform", C18070vi.A0M("android"));
            String[] strArr2 = new String[3];
            strArr2[0] = "alpha";
            strArr2[1] = "beta";
            r4[5] = new C128466g3(new C144247Go(r11, new C144257Gp("release_channel", C18070vi.A0O("release", strArr2, 2)), 0), "android_rollout_quebec_tos_reg_universe_2", A0M);
            C128456g2[] r103 = new C128456g2[2];
            A03("control", A02(7228, (Object) null), r103, 5000);
            r4[6] = new C128466g3(new C144247Go(new C144257Gp("release_channel", C18070vi.A0N("alpha", "beta", new String[2], 0, 1)), new C144257Gp(4, "platform", "android"), 0), "android_test_quebec_tos_reg_universe", C18070vi.A0M(new C129676iB(new C144257Gp(7, "app_version", "2.24.4.18"), "android_test_ca_tos_reg_experiment", C18070vi.A0O(new C128456g2(A02(7228, 1), 5000, "test"), r103, 1), 1707897600, 1708934400)));
            r4[7] = new C128466g3(A00(A01(new C144257Gp("platform", C18070vi.A0N("android", "smba", new String[2], 0, 1)), "beta", "release_channel", 0), "2.24.20.35", "app_version", 9), "document_page_count_background_thread_universe", r21);
            r4[8] = new C128466g3(new C144257Gp("platform", C18070vi.A0M("android")), "dummy_aa_prod_universe", r21);
            C128456g2[] r83 = new C128456g2[4];
            A03("10min", A02(10067, 600), r83, 2500);
            r83[1] = new C128456g2(A02(10067, 3600), 2500, "1hour");
            r83[2] = new C128456g2(A02(10067, 86400), 2500, "24hours");
            r4[9] = new C128466g3(A01(new C144247Go(A01(new C144257Gp(4, "platform", "android"), "smba", "platform", 1), new C144257Gp(9, "app_version", "2.24.16.14"), 0), "beta", "release_channel", 0), "enter_phone_number_notif_android_beta_offline_universe", C18070vi.A0M(new C129676iB((C160998Ax) null, "enter_phone_number_notif_android_beta_offline_experiment", C18070vi.A0O(new C128456g2(A02(10067, (Object) null), 2500, "control"), r83, 3), 1722582000, 1730358000)));
            C128456g2[] r104 = new C128456g2[4];
            A03("10min", A02(10067, 600), r104, 2500);
            r104[1] = new C128456g2(A02(10067, 3600), 2500, "1hour");
            r104[2] = new C128456g2(A02(10067, 86400), 2500, "24hours");
            r4[10] = new C128466g3(A01(new C144247Go(A01(new C144257Gp(4, "platform", "android"), "smba", "platform", 1), new C144257Gp(9, "app_version", "2.24.16"), 0), "release", "release_channel", 0), "enter_phone_number_notif_android_prod_offline_universe", C18070vi.A0M(new C129676iB((C160998Ax) null, "enter_phone_number_notif_android_prod_offline_experiment", C18070vi.A0O(new C128456g2(A02(10067, (Object) null), 2500, "control"), r104, 3), 1723532400, 1730358000)));
            C128456g2[] r84 = new C128456g2[2];
            A03("v1", A02(10066, 1), r84, 5000);
            r4[11] = new C128466g3(A01(new C144247Go(A01(new C144257Gp(4, "platform", "android"), "smba", "platform", 1), new C144257Gp(9, "app_version", "2.24.16.14"), 0), "beta", "release_channel", 0), "enter_phone_number_notif_content_android_beta_offline_universe", C18070vi.A0M(new C129676iB((C160998Ax) null, "enter_phone_number_notif_content_android_beta_offline_experiment", C18070vi.A0O(new C128456g2(A02(10066, 2), 5000, "v2"), r84, 1), 1722582000, 1730358000)));
            C128456g2[] r7 = new C128456g2[2];
            A03("v1", A02(10066, 1), r7, 5000);
            r4[12] = new C128466g3(A01(new C144247Go(A01(new C144257Gp(4, "platform", "android"), "smba", "platform", 1), new C144257Gp(9, "app_version", "2.24.16"), 0), "release", "release_channel", 0), "enter_phone_number_notif_content_android_prod_offline_universe", C18070vi.A0M(new C129676iB((C160998Ax) null, "enter_phone_number_notif_content_android_prod_offline_experiment", C18070vi.A0O(new C128456g2(A02(10066, 2), 5000, "v2"), r7, 1), 1723532400, 1730358000)));
            C128456g2[] r112 = new C128456g2[2];
            A03("control", A02(12266, (Object) null), r112, 5000);
            r4[13] = new C128466g3(A00(new C144257Gp("platform", C18070vi.A0N("android", "smba", new String[2], 0, 1)), "beta", "release_channel", 4), "google_phone_number_hint_beta_universe", C18070vi.A0M(new C129676iB((C160998Ax) null, "google_phone_number_hint_beta_experiment", C18070vi.A0O(new C128456g2(A02(12266, 1), 5000, "test"), r112, 1), 1729800669, 1738310400)));
            C128456g2[] r85 = new C128456g2[2];
            A03("control", A02(12266, (Object) null), r85, 1000);
            r4[14] = new C128466g3(A01(new C144257Gp("platform", C18070vi.A0N("android", "smba", new String[2], 0, 1)), "release", "release_channel", 0), "google_phone_number_hint_prod_universe", C18070vi.A0M(new C129676iB((C160998Ax) null, "google_phone_number_hint_prod_experiment", C18070vi.A0O(new C128456g2(A02(12266, 1), 1000, "test"), r85, 1), 1729801247, 1738310400)));
            C128456g2[] r113 = new C128456g2[2];
            A03("control", A02(11814, (Object) null), r113, 5000);
            r4[15] = new C128466g3(new C144247Go(A00(new C144257Gp("platform", C18070vi.A0N("android", "smba", new String[2], 0, 1)), "beta", "release_channel", 4), new C144257Gp(9, "app_version", "2.24.22.3"), 0), "libexecutorch_async_init", C18070vi.A0M(new C129676iB(new C144247Go(A00(new C144257Gp("platform", C18070vi.A0N("android", "smba", new String[2], 0, 1)), "beta", "release_channel", 4), new C144257Gp(9, "app_version", "2.24.22.3"), 0), "libexecutorch_async_init_beta_1014", C18070vi.A0O(new C128456g2(A02(11814, 1), 5000, "test"), r113, 1), 1728947894, 1730707200)));
            r4[16] = new C128466g3(A01(new C144257Gp(4, "platform", "android"), "beta", "release_channel", 0), "reg_back_nav_support_for_pre_pn_beta", r21);
            C128456g2[] r6 = new C128456g2[2];
            A03("control", A02(5920, (Object) null), r6, 5000);
            r4[17] = new C128466g3(new C144257Gp("platform", C18070vi.A0M("android")), "reg_phone_number_update_colors_prod_universe", C18070vi.A0M(new C129676iB(A00(new C144257Gp("release_channel", C18070vi.A0M("release")), "2.23.21.3", "app_version", 9), "reg_phone_number_update_colors_prod_experiment", C18070vi.A0O(new C128456g2(A02(5920, 1), 5000, "test"), r6, 1), 1696921200, 1714374000)));
            r4[18] = new C128466g3(new C144257Gp(4, "platform", "smba"), "universe_smb_onboarding_prechatd_logging_enabled_code", r21);
            r4[19] = new C128466g3(new C144257Gp("platform", C18070vi.A0M("android")), "wfs_offline_cache_beta_universe", r21);
            this.A00 = C18070vi.A0O(new C128466g3(new C144257Gp("platform", C18070vi.A0M("android")), "wfs_offline_cache_prod_universe", r21), r4, 20);
        } catch (JSONException e) {
            C17900vP.A0Z(e, "ABConfig/invalid json format for ab property from code gen:", AnonymousClass000.A10());
            throw new RuntimeException(AnonymousClass001.A1E(e, "ABConfig/invalid json format for ab property from code gen:", AnonymousClass000.A10()));
        }
    }

    public static C144247Go A00(C160998Ax r3, Object obj, String str, int i) {
        return new C144247Go(r3, new C144257Gp(i, str, obj), 0);
    }

    public static List A02(int i, Object obj) {
        List singletonList = Collections.singletonList(new C127266e4(obj, i));
        C18070vi.A0X(singletonList);
        return singletonList;
    }

    public static void A03(String str, List list, Object[] objArr, int i) {
        objArr[0] = new C128456g2(list, i, str);
    }
}
