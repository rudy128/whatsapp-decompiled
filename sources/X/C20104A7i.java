package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.A7i  reason: case insensitive filesystem */
public final class C20104A7i {
    public final C18030ve A00;
    public final AnonymousClass19A A01;
    public final C28623EAw A02;
    public volatile ConcurrentHashMap A03;
    public volatile ConcurrentHashMap A04;

    public static short A01(JSONArray jSONArray) {
        int i = jSONArray.getInt(1);
        if (2 != i) {
            return 1 == i ? (short) 1 : -1;
        }
        return 2;
    }

    public static final void A02(C20104A7i a7i) {
        if (a7i.A04 == null || a7i.A03 == null) {
            synchronized (a7i) {
                if (a7i.A04 == null) {
                    a7i.A04 = AnonymousClass8BR.A17();
                    try {
                        a7i.A03(C17880vN.A16(" {\"action\":[\n     [\"1029385268\",1,\"BLOKS_BILLING_CCT_NEXT_BUTTON\", 1029385268,[]],\n     [\"1029378693\",1,\"BLOKS_BILLING_CCT_BOTTOM_SHEET_LOAD\", 1029378693,[]],\n     [\"1029383357\",1,\"BLOKS_BILLING_SCREEN_LOAD\", 1029383357,[]],\n     [\"78315521\",1,\"TTRC_LONG_CANCEL\",78315521,[[\"duration\",1]]],\n     [\"78315522\",1,\"TTRC_FAILURE\",78315522,[[\"duration\",1],[\"message\",1]]],\n     [\"231937006\",1,\"TTRC_CHOICE_PREVIEW_IMG\",231937006,[[\"bloks_display_name\",1],[\"category_id\",1],[\"choice_id\",1],[\"session_id\",1]]],\n     [\"231933580\",1,\"TTRC\",231933580,[[\"bloks_display_name\",1],[\"session_id\",1],[\"app_id\",1],[\"end_reason\",1],[\"category_id\",1],[\"ttrc_source\",1],[\"ttrc_source_for_bloks_query\",1],[\"recency_threshold_for_bloks_query\",1],[\"ttrc_tracking_version\",1],[\"cache_and_network_queries\",1],[\"network_only_queries\",1],[\"steps\",1],[\"cds_bottomsheet\",1],[\"ttrc_back_start_on_touch_up\",1],[\"using_backup_start_time\",1],[\"using_capped_backup_start_time\",1],[\"revoked_queries\",1],[\"revoked_steps\",1],[\"ttrc_cache_rendered\",1]]],\n     [\"914163517\",1,\"AVATAR_MARKETPLACE_TABBED_FLOW_OPEN\",914163517,[]],\n     [\"551491402\",1,\"WA_WFL_AL_LOAD_LATENCY\",551491402,[]],\n     [\"946811835\",1,\"WHATSAPP_BLOKS_ANDROID\",946811835,[[\"duration\",1],[\"app_id\",1]]],\n     [\"376777540\",1,\"OPEN_HELP_CENTER\",376777540,[]],\n     [\"376777108\",1,\"OPEN_CONTEXTUAL_HELP\",376777108,[]],\n     [\"1029387332\",1,\"CTWA_UI_TTRC\",\"1029387332\",[],false],\n     [\"857808852\",1,\"MAIN_SETTINGS_LOAD_FROM_SETTINGS\",857808852,[]],\n     [\"444794589\",1,\"MAIN_SETTINGS_LOAD\",444794589,[]],\n     [\"857811602\",1,\"MAIN_SETTINGS_NODE_LOAD\",857811602,[]],\n     [\"444800256\",1,\"LINKING_FLOW_INITIATED\",444800256,[]],\n     [\"444795951\",1,\"NTA_FLOW_INITIATED\",444795951,[]],\n     [\"444796249\",1,\"NTA_FLOW_ACCEPT\",444796249,[]],\n     [\"857804516\",1,\"DO_UNLINK_MUTATION\",857804516,[]],\n     [\"857802604\",1,\"DO_LINK_MUTATION\",857802604,[]]\n]}"));
                        a7i.A03(a7i.A00.A0J(2620));
                    } catch (Exception e) {
                        ConcurrentHashMap concurrentHashMap = a7i.A04;
                        if (concurrentHashMap != null) {
                            concurrentHashMap.clear();
                        }
                        a7i.A01.BKX(C17900vP.A0C("Couldn't parse bloks config (actions): ", AnonymousClass000.A10(), e));
                    }
                }
                if (a7i.A03 == null) {
                    a7i.A03 = AnonymousClass8BR.A17();
                    try {
                        a7i.A04(C17880vN.A16("{\"ttrc\":[\n      [\"com.bloks.www.avatar.editor.cds.launcher\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.launcher.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.choice.preview.pagination\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.choice.preview.pagination.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.save.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.delete.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.update-main-preview-zoom.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.exit.log\",1,231933580],\n      [\"com.bloks.www.avatar.editor.exit.log.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.exit.log.setup\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.exit.log.setup.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.editor_screen\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.editor_screen.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.end_nux_screen\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.end_nux_screen.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.skin_tone\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.skin_tone.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.skin_tone_new_nav\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.deletion_screen\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.deletion_screen.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.end_preview_screen\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.end_preview_screen.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.preview.fetch.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.save_click.log.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.delegation_launcher\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.delegation_launcher.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.screen_delegation.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.editor_new_nav_screen\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.new-nav-update-zoom.async\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.end_preview_screen_new_nav\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.presets\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.whatsapp.notice\",1,231933580],\n      [\"com.bloks.www.avatar.editor.cds.wa_notice.accept.async\",1,231933580],\n      [\"avatar_editor_new_nav_screen\",1,231933580],\n      [\"com.bloks.www.ctwa.messaging.hub\",1,1029389270],\n      \n      [\"com.bloks.www.bloks.mv_for_b.onboarding.value_screen.controller\",1,946811835],\n      [\"com.bloks.www.bloks.mv_for_b.onboarding.business_selection.controller\",1,946811835],\n      [\"com.bloks.www.bloks.mv_for_b.onboarding.payment.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.payment_details.bottomsheet\",1,946811835],\n      [\"com.bloks.www.mv_for_b.payment_failures.bottomsheet\",1,946811835],\n      [\"com.bloks.www.bloks.mv_for_b.onboarding.join_waitlist.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.payment_management.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.management.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.detailed_benefit_page.controller\",1,946811835],\n      [\"com.bloks.www.whatsapp.mv_for_b.management.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.cancel_subscription.bottomsheet.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.wa.support.menu.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.wa.support.menu.detailed.view\",1,946811835],\n      [\"com.bloks.www.mv_for_b.wa.payments.support\",1,946811835],\n      [\"com.bloks.www.bloks.mv_for_b.action.payments_support.submit_email\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.verification_transition.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.retry_verification_transition.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.pending_verification.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.application_rejected.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.login_asset_not_in_application.controller\",1,946811835],\n      [\"com.bloks.www.bloks.mv_for_b.onboarding.subscription_active.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.viewer_is_not_payer.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.manage_subscription.mbs.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.tier_selection_screen.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.can_not_manage_subscribed_asset.controller\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.tier_benefits_screen.controller\",1,946811835],\n      [\"com.bloks.www.bloks.mv_for_b.onboarding.in_app_purchase.fetch.price.response\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.in_app_purchase.pay_button\",1,946811835],\n      [\"com.bloks.www.mv_for_b.onboarding.in_app_purchase.pay_button.callback\",1,946811835],\n      [\"com.bloks.www.mv_for_b.wa.biz_waterfall.logging\",1,946811835],\n      [\"com.bloks.www.mv.unified_entry_point.controller\",1,946811835],\n      [\"com.bloks.www.whatsapp.meta.verified.privacy.interstitial.bottomsheet.controller\",1,946811835],\n      [\"com.bloks.www.whatsapp.meta.verified.privacy.interstitial.controller\",1,946811835],\n      [\"com.bloks.www.whatsapp.meta.verified.privacy.interstitial.bottomsheet.xmds.controller\",1,946811835],\n      [\"com.bloks.www.whatsapp.ai.biz.meta_ai.entrypoint\",1,812974081],\n   \n      [\"com.bloks.www.fxcal.link.wa.disclosures\",1,444797653],\n      [\"com.bloks.www.fxcal.link.start\",1,444808231],\n      [\"com.bloks.www.fxcal.link.wa_crossposting.auto_sharing\",1,444796983],\n      [\"com.bloks.www.fxcal.link.wa_crossposting.destination_selection\",1,444797594]\n  ]}"));
                        a7i.A04(a7i.A00.A0J(2621));
                    } catch (Exception e2) {
                        ConcurrentHashMap concurrentHashMap2 = a7i.A03;
                        if (concurrentHashMap2 != null) {
                            concurrentHashMap2.clear();
                        }
                        a7i.A01.BKX(C17900vP.A0C("Couldn't parse bloks config (ttrc): ", AnonymousClass000.A10(), e2));
                    }
                }
            }
        }
    }

    private final void A03(JSONObject jSONObject) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.A04;
        if (concurrentHashMap != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("action");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                int i2 = jSONArray2.getInt(0);
                short A012 = A01(jSONArray2);
                String string = jSONArray2.getString(2);
                int i3 = jSONArray2.getInt(3);
                ConcurrentHashMap A17 = AnonymousClass8BR.A17();
                if (jSONArray2.length() > 4) {
                    JSONArray jSONArray3 = jSONArray2.getJSONArray(4);
                    int length2 = jSONArray3.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        JSONArray jSONArray4 = jSONArray3.getJSONArray(i4);
                        C17890vO.A0z(jSONArray4.getString(0), A17, A01(jSONArray4));
                    }
                }
                if (jSONArray2.length() > 5) {
                    z = jSONArray2.getBoolean(5);
                } else {
                    z = true;
                }
                Integer valueOf = Integer.valueOf(i2);
                C18070vi.A0b(string);
                concurrentHashMap.put(valueOf, new C187539fy(string, A17, A012, i3, z));
            }
        }
    }

    private final void A04(JSONObject jSONObject) {
        int i;
        ConcurrentHashMap concurrentHashMap = this.A03;
        if (concurrentHashMap != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("ttrc");
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                String string = jSONArray2.getString(0);
                short A012 = A01(jSONArray2);
                if (jSONArray2.length() > 2) {
                    i = jSONArray2.getInt(2);
                } else {
                    i = 812974081;
                }
                C18070vi.A0b(string);
                concurrentHashMap.put(string, new C194679s7(string, A012, i));
            }
        }
    }

    public C20104A7i(C18030ve r1, AnonymousClass19A r2, C28623EAw eAw) {
        C72473Md.A1I(r1, r2);
        this.A00 = r1;
        this.A02 = eAw;
        this.A01 = r2;
    }

    public static final C187539fy A00(C20104A7i a7i, int i) {
        C187539fy r1;
        A02(a7i);
        ConcurrentHashMap concurrentHashMap = a7i.A04;
        if (concurrentHashMap == null || (r1 = (C187539fy) AnonymousClass8BT.A0r(concurrentHashMap, i)) == null) {
            int i2 = i >> 16;
            ConcurrentHashMap concurrentHashMap2 = a7i.A04;
            if (concurrentHashMap2 == null || (r1 = (C187539fy) AnonymousClass8BT.A0r(concurrentHashMap2, i2)) == null) {
                r1 = new C187539fy("na", (ConcurrentHashMap) null, -1, 812974081, true);
            }
            ConcurrentHashMap concurrentHashMap3 = a7i.A04;
            if (concurrentHashMap3 != null) {
                C108955ca.A1V(r1, concurrentHashMap3, i);
            }
        }
        return r1;
    }
}
