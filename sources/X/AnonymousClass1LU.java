package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: X.1LU  reason: invalid class name */
public final class AnonymousClass1LU {
    public static Intent A05(Context context) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.phonenumberentry.RegisterPhone");
        className.putExtra("com.whatsapp.registration.RegisterPhone.resetstate", true);
        className.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        return className;
    }

    public static final Intent A07(Context context) {
        C18070vi.A0d(context, 0);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity");
        return intent;
    }

    public static final Intent A09(Context context) {
        C18070vi.A0d(context, 0);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.interopui.setting.InteropSettingsActivity");
        return intent;
    }

    public static final Intent A0A(Context context) {
        C18070vi.A0d(context, 0);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.Main");
        return intent;
    }

    public static Intent A0H(Context context, int i, long j, long j2, boolean z, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen");
        intent.putExtra("flash_type", i);
        intent.putExtra("sms_retry_time", j);
        intent.putExtra("voice_retry_time", j2);
        intent.putExtra("change_number", z);
        intent.putExtra("use_silent_auth_fallback", false);
        intent.putExtra("should_show_dbs_on_back_pressed", z2);
        return intent;
    }

    public static Intent A0J(Context context, int i, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("changenumber", z);
        className.putExtra("use_sms_retriever", z2);
        className.putExtra("wa_old_eligible", 0);
        className.putExtra("code_verification_mode", i);
        return className;
    }

    public static Intent A0K(Context context, long j) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity");
        intent.putExtra("allowSkipKey", false);
        intent.putExtra("spaceNeededInBytes", j);
        return intent;
    }

    public static Intent A0M(Context context, long j, long j2, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("sms_retry_time", j);
        className.putExtra("voice_retry_time", j2);
        className.putExtra("use_sms_retriever", z);
        className.putExtra("show_request_code_progress_dialog", true);
        className.putExtra("changenumber", z2);
        className.putExtra("EXTRA_SHOULD_REQUEST_VOICE_CALL", true);
        return className;
    }

    public static final Intent A0N(Context context, Rect rect, Uri uri, Uri uri2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.crop.CropImage");
        intent.setData(uri);
        intent.putExtra("output", uri2);
        intent.putExtra("outputFormat", str);
        intent.putExtra("circleCrop", (String) null);
        intent.putExtra("aspectX", i);
        intent.putExtra("aspectY", i2);
        intent.putExtra("outputX", i3);
        intent.putExtra("outputY", i4);
        intent.putExtra("minCrop", i5);
        intent.putExtra("maxCrop", i6);
        intent.putExtra("initialRect", rect);
        intent.putExtra("cropByOutputSize", z);
        intent.putExtra("scale", true);
        intent.putExtra("scaleUpIfNeeded", false);
        intent.putExtra("maxFileSize", 0);
        intent.putExtra("flattenRotation", z2);
        intent.putExtra("rotation", i7);
        intent.putExtra("flipH", z3);
        intent.putExtra("flipV", false);
        intent.putExtra("webImageSource", str2);
        intent.putExtra("doodle", str3);
        intent.putExtra("filter", i8);
        intent.putExtra("rotateAspect", z4);
        intent.putExtra("composerToolToOpenOnComplete", -1);
        return intent;
    }

    public static final Intent A0O(Context context, Uri uri, int i) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(uri, 1);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.deeplink.DeepLinkActivity");
        intent.setData(uri);
        intent.putExtra("source", i);
        return intent;
    }

    public static Intent A0R(Context context, Bundle bundle, AnonymousClass1BI r6, AnonymousClass1EC r7, ArrayList arrayList, boolean z) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity");
        className.putExtra("edit_mode", true);
        className.putExtra("jid", C22971Dz.A06(r6));
        className.putExtra("quoted_message", bundle);
        className.putExtra("quoted_group_jid", C22971Dz.A06(r7));
        className.putExtra("has_number_from_url", z);
        className.putStringArrayListExtra("vcard_array", arrayList);
        return className;
    }

    public static final Intent A0S(Context context, AnonymousClass77K r5, Integer num, Integer num2, Integer num3, String str, String str2, int i, int i2, int i3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity");
        intent.putExtra("status_composer_mode", i);
        intent.putExtra("jid", str);
        intent.putExtra("camera_origin", num);
        intent.putExtra("is_coming_from_chat", false);
        intent.putExtra("selected_uris", (Serializable) null);
        intent.putExtra("media_sharing_user_journey_origin", i2);
        intent.putExtra("media_sharing_user_journey_start_target", i3);
        if (num2 != null) {
            intent.putExtra("media_sharing_user_journey_chat_type", num2.intValue());
        }
        intent.putExtra("status_distribution", r5);
        intent.putExtra("android.intent.extra.TEXT", str2);
        if (num3 != null) {
            intent.putExtra("entry_point", num3.intValue());
        }
        return intent;
    }

    public static final Intent A0T(Context context, AnonymousClass77K r4, Integer num, String str) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(str, 1);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.textstatuscomposer.TextStatusComposerActivityV2");
        intent.putExtra("status_distribution", r4);
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("entry_point", num.intValue());
        return intent;
    }

    public static final Intent A0W(Context context, AnonymousClass6RG r4, String str, String str2) {
        C18070vi.A0d(context, 0);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity");
        intent.putExtra("sticker_pack_id", str);
        intent.putExtra("sticker_pack_preview_source", r4.ordinal());
        if (str2 != null) {
            intent.putExtra("sticker_pack_raw_chat_jid", str2);
        }
        return intent;
    }

    public static Intent A0b(Context context, AnonymousClass1BI r6, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.gallery.MediaGalleryActivity");
        intent.putExtra("pos", -1);
        intent.putExtra("jid", C22971Dz.A06(r6));
        intent.putExtra("alert", true);
        intent.putExtra("key", i);
        return intent;
    }

    public static Intent A0d(Context context, AnonymousClass1BI r4, AnonymousClass1EC r5, Integer num, Integer num2, String str, List list, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity");
        intent.setAction("android.intent.action.PICK");
        intent.setData(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        intent.putExtra("max_items", i);
        intent.putExtra("skip_max_items_new_limit", false);
        intent.putExtra("jid", r4.getRawString());
        intent.putExtra("quoted_message_row_id", j);
        intent.putExtra("quoted_group_jid", C22971Dz.A06(r5));
        intent.putExtra("number_from_url", z);
        intent.putExtra("send", true);
        intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
        intent.putExtra("origin", i2);
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("mentions", AnonymousClass4aJ.A01(list));
        intent.putExtra("is_coming_from_chat", z2);
        intent.putExtra("is_send_as_document", z3);
        intent.putExtra("media_sharing_user_journey_origin", i3);
        if (num != null) {
            intent.putExtra("media_sharing_user_journey_chat_type", num);
        }
        intent.putExtra("should_set_gallery_result", true);
        intent.putExtra("picker_redesign", z4);
        if (num2 != null) {
            intent.putExtra("gallery_picker_action", num2);
        }
        return intent;
    }

    public static final Intent A0f(Context context, AnonymousClass1BI r4, Integer num) {
        C18070vi.A0d(context, 0);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingActivity");
        if (r4 != null) {
            intent.putExtra("extra_chat_jid", r4.getRawString());
        }
        intent.putExtra("extra_action_source", num.intValue());
        return intent;
    }

    public static final Intent A0m(Context context, GroupJid groupJid) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(groupJid, 1);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityAdminPickerActivity");
        intent.putExtra("community_admin_picker_parent_jid", groupJid.getRawString());
        return intent;
    }

    public static final Intent A0t(Context context, Jid jid) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(jid, 1);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.settings.SettingsJidNotificationActivity");
        intent.putExtra("jid", jid.getRawString());
        return intent;
    }

    public static final Intent A0v(Context context, Jid jid, AnonymousClass444 r5) {
        C18070vi.A0d(r5, 2);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoActivity");
        intent.putExtra("jid", C22971Dz.A06(jid));
        intent.putExtra("arg_enforcement", r5);
        intent.setFlags(603979776);
        return intent;
    }

    public static final Intent A0x(Context context, Jid jid, AnonymousClass442 r5) {
        C18070vi.A0d(r5, 2);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.product.newsletterenforcements.profilepicturedeletion.NewsletterProfilePictureDeletionInfoActivity");
        intent.putExtra("jid", C22971Dz.A06(jid));
        intent.putExtra("appeal_data", r5);
        intent.addFlags(603979776);
        return intent;
    }

    public static final Intent A0y(Context context, Jid jid, AnonymousClass443 r5) {
        C18070vi.A0d(r5, 2);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity");
        intent.putExtra("jid", C22971Dz.A06(jid));
        intent.putExtra("arg_enforcement", r5);
        intent.addFlags(603979776);
        return intent;
    }

    public static final Intent A14(Context context, C29681ch r5) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(r5, 1);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity");
        intent.putExtra("jid", r5.getRawString());
        return intent;
    }

    public static final Intent A16(Context context, C29681ch r5, int i) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(r5, 1);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity");
        intent.putExtra("jid", r5.getRawString());
        intent.putExtra("entry_point", i);
        return intent;
    }

    public static final Intent A17(Context context, C29681ch r4, C89494cY r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        Intent intent = new Intent();
        intent.putExtra("arg_jid", r4.getRawString());
        intent.putExtra("arg_enforcement", r5);
        intent.setClassName(context.getPackageName(), "com.whatsapp.product.newsletterenforcements.disputesettlement.NewsletterEnforcementSelectActionActivity");
        return intent;
    }

    public static Intent A1E(Context context, UserJid userJid, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C18070vi.A0d(context, 1);
        C18070vi.A0d(userJid, 2);
        return C83864Gy.A00(context, userJid, str, false, false, z3, z4, z2, z);
    }

    public static Intent A1I(Context context, Integer num, String str, String str2, int i, int i2, int i3, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.camera.CameraActivity");
        intent.putExtra("jid", str);
        intent.putExtra("camera_origin", i);
        intent.putExtra("is_coming_from_chat", z);
        intent.putExtra("selected_uris", (Serializable) null);
        intent.putExtra("media_sharing_user_journey_origin", i2);
        intent.putExtra("media_sharing_user_journey_start_target", i3);
        if (num != null) {
            intent.putExtra("media_sharing_user_journey_chat_type", num);
        }
        if (str2 != null) {
            intent.putExtra("ar_effects", str2);
        }
        return intent;
    }

    public static Intent A1R(Context context, String str, int i, int i2, int i3, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("server_start_message", (String) null);
        className.putExtra("flash_type", i);
        className.putExtra("sms_retry_time", j);
        className.putExtra("voice_retry_time", j2);
        className.putExtra("wa_old_retry_time", j3);
        className.putExtra("email_otp_retry_time", j4);
        className.putExtra("use_sms_retriever", z);
        className.putExtra("show_request_code_progress_dialog", true);
        className.putExtra("changenumber", z2);
        className.putExtra("should_request_flash_call", false);
        className.putExtra("wa_old_eligible", i2);
        className.putExtra("wa_old_device_name", str);
        className.putExtra("silent_auth_eligible", i3);
        className.putExtra("code_verification_mode", 0);
        className.putExtra("should_show_dbs_on_back_pressed", z3);
        return className;
    }

    public static Intent A1T(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.wabloks.ui.WaBloksActivity");
        intent.putExtra("screen_name", str);
        intent.putExtra("screen_params", str2);
        intent.putExtra("screen_cache_config", (Parcelable) null);
        return intent;
    }

    public static final Intent A1V(Context context, String str, String str2, int i) {
        C18070vi.A0d(context, 0);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.backup.google.SettingsGoogleDrive");
        intent.putExtra("entry_point", i);
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        if (str2 != null) {
            intent.putExtra("search_result_key", str2);
        }
        return intent;
    }

    public static Intent A1X(Context context, String str, String str2, int i, int i2, long j) {
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        C17960vV.A0C(z);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
        intent.putExtra("request_type", 4);
        intent.putExtra("remove_account_lid", str);
        intent.putExtra("number_of_accounts", i - 1);
        intent.putExtra("source", i2);
        intent.putExtra("switching_start_time_ms", j);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("account_language", str2);
        }
        intent.addFlags(268468224);
        return intent;
    }

    public static Intent A1Y(Context context, String str, String str2, int i, boolean z) {
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        C17960vV.A0C(z2);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
        intent.putExtra("request_type", 3);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("switch_to_account_lid", str);
        }
        intent.putExtra("number_of_accounts", i - 1);
        intent.putExtra("source", 12);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("account_language", str2);
        }
        intent.putExtra("abandon_add_account_from_back_press", z);
        intent.addFlags(268468224);
        return intent;
    }

    public static final Intent A1b(Context context, String str, String str2, int i, boolean z) {
        C18070vi.A0d(context, 0);
        Intent putExtra = new Intent().setClassName(context.getPackageName(), "com.whatsapp.migration.transfer.ui.ChatTransferActivity").putExtra("is_donor", z).putExtra("entry_point", i).putExtra("qr_code_data", str).putExtra("donor_device_name", str2);
        C18070vi.A0X(putExtra);
        return putExtra;
    }

    public static Intent A1f(Context context, String str, String str2, String str3, String str4, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.MessageWithLinkWebViewActivity");
        C17960vV.A07(str);
        intent.putExtra("webview_url", str);
        intent.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("webview_callback", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("webview_cancel_callback", str3);
        }
        intent.putExtra("webview_should_ask_before_close", true);
        intent.putExtra("webview_hide_url", false);
        intent.putExtra("webview_open_new_tab_in_external_browser", true);
        intent.putExtra("webview_title_show_domain_only", false);
        intent.putExtra("webview_toolbar_v2", false);
        intent.putExtra("extra_toolbar_show_advance_iab_menu", true);
        intent.putExtra("extra_learn_mode_action", true);
        intent.putExtra("webview_can_navigate_back", true);
        intent.putExtra("allow_file_download", true);
        intent.putExtra("allow_image_file_upload", true);
        intent.putExtra("allow_document_file_upload", true);
        intent.putExtra("webview_fallback_to_external_browser_on_webview_errors", z);
        intent.putExtra("deep_link_type_support", 1);
        intent.putExtra("webview_deeplink_enabled", true);
        intent.putExtra("webview_session_id", str4);
        intent.putExtra("webview_navigation_bar_enabled", true);
        intent.putExtra("webview_pull_to_refresh_enabled", true);
        return intent;
    }

    public static Intent A1g(Context context, String str, String str2, boolean z, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.webview.ui.WaInAppBrowsingActivity");
        C17960vV.A07(str);
        intent.putExtra("webview_url", str);
        intent.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("webview_callback", str2);
        }
        intent.putExtra("webview_hide_url", z);
        intent.putExtra("webview_javascript_enabled", true);
        intent.putExtra("webview_can_navigate_back", z2);
        return intent;
    }

    public static Intent A1k(Context context, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.RegisterName");
        intent.putExtra("debug", false);
        intent.putExtra("is_from_backup_otp_screen", z);
        return intent;
    }

    public static final Intent A1m(Context context, boolean z) {
        C18070vi.A0d(context, 0);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.twofactor.SettingsTwoFactorAuthActivity");
        intent.putExtra("isEntryPointSecurityCheckup", z);
        return intent;
    }

    public static final Intent A1p(Uri uri) {
        C18070vi.A0d(uri, 0);
        return new Intent("android.intent.action.VIEW", uri);
    }

    public Intent A1s(Context context, Bundle bundle, AnonymousClass1BI r6, String str, int i, boolean z, boolean z2, boolean z3) {
        Intent A1w = A1w(context, r6, 0);
        A1w.putExtra("wa_type", i);
        A1w.putExtra("has_share", true);
        A1w.putExtra("confirm", z);
        A1w.putExtra("text_from_url", z2);
        A1w.putExtra("number_from_url", z3);
        A1w.putExtra("iq_code", str);
        A1w.putExtra("ctwa_deeplink_content", bundle);
        C60392nx.A00(context, A1w);
        return A1w;
    }

    public Intent A1t(Context context, Bundle bundle, ArrayList arrayList) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.inappsupport.ui.SupportTopicsActivity");
        className.putParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", arrayList);
        className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        className.putExtra("from_contact_us_ai_fallback_email_screen", false);
        if (bundle != null) {
            className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle", bundle);
        }
        return className;
    }

    public Intent A1y(Context context, AnonymousClass1BI r10, String str) {
        return A1z(context, r10, str, 0, true, true, true);
    }

    public Intent A1z(Context context, AnonymousClass1BI r5, String str, int i, boolean z, boolean z2, boolean z3) {
        Intent A1w = A1w(context, r5, 0);
        A1w.putExtra("wa_type", i);
        A1w.putExtra("share_msg", str);
        A1w.putExtra("has_share", true);
        A1w.putExtra("confirm", z);
        A1w.putExtra("text_from_url", z2);
        A1w.putExtra("number_from_url", z3);
        C60392nx.A00(context, A1w);
        return A1w;
    }

    public static Intent A00(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.ChangeNumberOverview");
        return intent;
    }

    public static Intent A01(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.EULA");
        intent.setFlags(268468224);
        return intent;
    }

    public static Intent A02(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.HomeActivity");
        return intent;
    }

    public static Intent A03(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.RegisterName");
        return intent;
    }

    public static Intent A04(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.phonenumberentry.RegisterPhone");
    }

    public static Intent A06(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.status.audienceselector.StatusPrivacyActivity");
        return intent;
    }

    public static final Intent A08(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiContactPicker");
        intent.putExtra("for_payments", true);
        return intent;
    }

    public static Intent A0B(Context context, int i) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity");
        className.putExtra("blocking_type", i);
        return className;
    }

    public static Intent A0C(Context context, int i) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.Conversation").putExtra("mat_entry_point", i);
    }

    public static Intent A0D(Context context, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.backup.encryptedbackup.EncBackupMainActivity");
        intent.putExtra("user_action", i);
        return intent;
    }

    public static Intent A0E(Context context, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.gallerypicker.GalleryPickerLauncher");
        intent.putExtra("media_sharing_user_journey_origin", i);
        return intent;
    }

    public static Intent A0F(Context context, int i) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity");
        className.putExtra("invite_source", i);
        return className;
    }

    public static Intent A0G(Context context, int i, int i2, long j, long j2, long j3, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("changenumber", z);
        className.putExtra("sms_retry_time", j);
        className.putExtra("voice_retry_time", j2);
        className.putExtra("wa_old_retry_time", j3);
        className.putExtra("use_sms_retriever", z2);
        className.putExtra("wa_old_eligible", i);
        className.putExtra("code_verification_mode", i2);
        return className;
    }

    public static final Intent A0I(Context context, int i, boolean z) {
        String str;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.settings.SettingsTabActivity");
        if (z) {
            str = "account_switcher_add_account";
        } else {
            str = "account_switcher";
        }
        intent.putExtra(str, true);
        intent.putExtra("source", i);
        return intent;
    }

    public static Intent A0L(Context context, long j, long j2, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity");
        className.putExtra("change_number", z);
        className.putExtra("sms_retry_time", j);
        className.putExtra("voice_retry_time", j2);
        className.putExtra("use_sms_retriever", z2);
        return className;
    }

    public static Intent A0P(Context context, Uri uri, Parcelable parcelable, String str, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.inappbugreporting.InAppBugReportingActivity");
        if (uri != null) {
            intent.putExtra("extra_screenshot_uri", uri.toString());
        }
        if (parcelable != null) {
            intent.putExtra("extra_call_log_key", parcelable);
        }
        intent.putExtra("extra_is_calling_bug", z);
        if (str != null) {
            intent.putExtra("extra_bug_reporting_endpoint", str);
        }
        return intent;
    }

    public static Intent A0Q(Context context, Uri uri, AnonymousClass1BI r5, String str, String str2, boolean z) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.documentpicker.DocumentPreviewActivity").putExtra("jid", r5.getRawString()).putExtra("uri", uri).putExtra("caption", str).putExtra("mentions", str2).putExtra("send", z).putExtra("clear_message_after_send", !TextUtils.isEmpty(str));
    }

    public static Intent A0U(Context context, C82984Cx r4, AnonymousClass1BI r5) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.event.EventsActivity");
        intent.putExtra("chat_jid", r5.getRawString());
        intent.putExtra("source", r4.ordinal());
        return intent;
    }

    public static Intent A0V(Context context, C138126wZ r4, Integer num, String str, boolean z) {
        int i;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity");
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        intent.putExtra("disclosure_id", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("surface", str);
        }
        Integer num2 = r4.A00;
        if (num2 != null) {
            intent.putExtra("trigger", num2.intValue());
        }
        intent.addFlags(65536);
        intent.putExtra("should_return_results", z);
        return intent;
    }

    public static final Intent A0X(Context context, AnonymousClass4CZ r4, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.favorites.picker.FavoritesPickerActivity");
        intent.putExtra("suggestion_mode", r4);
        intent.putExtra("ENTRY_POINT", i);
        return intent;
    }

    public static Intent A0Y(Context context, AnonymousClass1BI r4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.gallery.MediaGalleryActivity");
        intent.putExtra("jid", C22971Dz.A06(r4));
        return intent;
    }

    public static Intent A0Z(Context context, AnonymousClass1BI r4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity");
        intent.putExtra("jid", r4.getRawString());
        return intent;
    }

    public static final Intent A0a(Context context, AnonymousClass1BI r4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.settings.chat.theme.ChatThemeActivity");
        intent.putExtra("chat_jid", C22971Dz.A06(r4));
        return intent;
    }

    public static Intent A0c(Context context, AnonymousClass1BI r4, int i, int i2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.ephemeral.ChangeEphemeralSettingActivity");
        className.putExtra("jid", r4.getRawString());
        className.putExtra("current_setting", i);
        className.putExtra("entry_point", i2);
        return className;
    }

    public static final Intent A0e(Context context, AnonymousClass1BI r4, Boolean bool, Integer num, ArrayList arrayList, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.calling.callhistory.calllog.CallLogActivityV2");
        intent.putExtra("jid", C22971Dz.A06(r4));
        if (arrayList != null) {
            intent.putExtra("calls", arrayList);
        }
        intent.putExtra("is_video_call_log_group", bool);
        intent.putExtra("call_size_type", num);
        intent.putExtra("is_call_info_optimized", z);
        return intent;
    }

    public static Intent A0g(Context context, AnonymousClass1BI r3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, List list, int i, long j, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.camera.CameraActivity");
        intent.putExtra("jid", C22971Dz.A06(r3));
        intent.putExtra("quoted_message_row_id", j);
        intent.putExtra("quoted_group_jid", str);
        intent.putExtra("chat_opened_from_url", z);
        intent.putExtra("camera_origin", i);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.putExtra("mentions", AnonymousClass4aJ.A01(list));
        if (num != null) {
            intent.putExtra("media_sharing_user_journey_origin", num);
        }
        if (num2 != null) {
            intent.putExtra("media_sharing_user_journey_start_target", num2);
        }
        if (num3 != null) {
            intent.putExtra("media_sharing_user_journey_chat_type", num3);
        }
        if (num4 != null) {
            intent.putExtra("include", num4);
        }
        if (num5 != null) {
            intent.putExtra("max_items", num5);
        }
        return intent;
    }

    public static final Intent A0h(Context context, AnonymousClass1BI r4, Integer num, String str, int i, int i2) {
        Intent intent = new Intent();
        intent.addFlags(335544320);
        intent.putExtra("jid", C22971Dz.A06(r4));
        intent.setClassName(context.getPackageName(), "com.whatsapp.Conversation");
        intent.putExtra("mat_entry_point", i);
        intent.putExtra("referrer_action", i2);
        if (!(num == null || str == null)) {
            intent.putExtra("bot_metrics_entrypoint", C196839vj.A01(num));
            intent.putExtra("bot_metrics_destination_id", str);
        }
        return intent;
    }

    public static Intent A0i(Context context, AnonymousClass1BI r4, String str, List list, boolean z) {
        String str2;
        Intent intent = new Intent();
        String packageName = context.getPackageName();
        if (z) {
            str2 = "com.whatsapp.documentpicker.DocumentPickerBottomSheetActivity";
        } else {
            str2 = "com.whatsapp.documentpicker.DocumentPickerActivity";
        }
        intent.setClassName(packageName, str2);
        intent.putExtra("jid", r4.getRawString());
        intent.putExtra("caption", str);
        intent.putExtra("clear_message_after_send", !TextUtils.isEmpty(str));
        intent.putExtra("mentions", AnonymousClass4aJ.A01(list));
        return intent;
    }

    public static Intent A0j(Context context, AnonymousClass1BI r4, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.status.playback.StatusPlaybackActivity");
        intent.putExtra("jid", C22971Dz.A06(r4));
        intent.putExtra("single_contact_update", z);
        intent.putExtra("should_chain_viewed_statuses", z2);
        intent.putExtra("from_playback_activity", z3);
        return intent;
    }

    public static Intent A0k(Context context, GroupJid groupJid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityNavigationActivity");
        intent.putExtra("parent_group_jid", groupJid.getRawString());
        StringBuilder sb = new StringBuilder();
        sb.append("whatsapp://communityNavigation/");
        sb.append(groupJid.hashCode());
        intent.setData(Uri.parse(sb.toString()));
        intent.setFlags(603979776);
        return intent;
    }

    public static Intent A0l(Context context, GroupJid groupJid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.ManageGroupsInCommunityActivity");
        intent.putExtra("parent_group_jid", groupJid.getRawString());
        return intent;
    }

    public static Intent A0n(Context context, GroupJid groupJid, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityHomeActivity");
        intent.putExtra("parent_group_jid", groupJid.getRawString());
        intent.putExtra("tab_start_position", i);
        StringBuilder sb = new StringBuilder();
        sb.append("whatsapp://community/");
        sb.append(groupJid.hashCode());
        intent.setData(Uri.parse(sb.toString()));
        intent.setFlags(603979776);
        return intent;
    }

    public static Intent A0o(Context context, GroupJid groupJid, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.group.GroupPermissionsActivity");
        intent.putExtra("gid", groupJid.getRawString());
        intent.putExtra("entry_point", i);
        return intent;
    }

    public static Intent A0p(Context context, GroupJid groupJid, Long l, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.invites.InviteGroupParticipantsActivity");
        intent.putExtra("sms_invites_jids", arrayList3);
        intent.putExtra("jids", arrayList);
        intent.putExtra("invite_hashes", arrayList2);
        intent.putExtra("invite_expiration", l);
        intent.putExtra("group_jid", groupJid.getRawString());
        intent.putExtra("invite_trigger_source", i);
        return intent;
    }

    public static Intent A0q(Context context, GroupJid groupJid, ArrayList arrayList, int i, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.invites.SMSPreviewInviteGroupParticipantsActivity");
        intent.putExtra("sms_invites_jids", arrayList);
        intent.putExtra("group_jid", groupJid.getRawString());
        intent.putExtra("all_participants_non_wa_in_request", z);
        intent.putExtra("invite_trigger_source", i);
        return intent;
    }

    public static Intent A0r(Context context, GroupJid groupJid, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityMembersActivity");
        intent.putExtra("extra_community_jid", C22971Dz.A06(groupJid));
        intent.putExtra("extra_non_cag_members_view", z);
        return intent;
    }

    public static Intent A0s(Context context, Jid jid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
        intent.putExtra("jid", C22971Dz.A06(jid));
        return intent;
    }

    public static final Intent A0u(Context context, Jid jid, AnonymousClass445 r5, List list) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoActivity");
        intent.putExtra("jid", C22971Dz.A06(jid));
        intent.putParcelableArrayListExtra("arg_enforcements", new ArrayList(list));
        intent.putExtra("arg_selected_enforcement", r5);
        intent.addFlags(603979776);
        return intent;
    }

    public static final Intent A0w(Context context, Jid jid, AnonymousClass446 r5, List list) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity");
        intent.putExtra("jid", C22971Dz.A06(jid));
        intent.putParcelableArrayListExtra("arg_enforcement", new ArrayList(list));
        intent.putExtra("arg_selected_enforcement", r5);
        intent.addFlags(603979776);
        return intent;
    }

    public static Intent A0z(Context context, Jid jid, Integer num, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.biz.catalog.view.activity.CatalogListActivity");
        intent.putExtra("cache_jid", jid.getRawString());
        intent.putExtra("source", num);
        intent.putExtra("entry_point", i);
        return intent;
    }

    public static final Intent A10(Context context, Jid jid, Long l, int i, int i2, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.newsletter.NewsletterInfoActivity");
        intent.putExtra("jid", C22971Dz.A06(jid));
        intent.putExtra("circular_transition", z);
        intent.putExtra("mat_entry_point", i);
        intent.putExtra("extra_forwarded_message_thread_type", i2);
        intent.putExtra("similar_newsletters_session_id", l);
        return intent;
    }

    public static Intent A11(Context context, Jid jid, String str, float f, int i, int i2, int i3, int i4, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.profile.ViewProfilePhoto");
        intent.putExtra("jid", jid.getRawString());
        intent.putExtra("circular_transition", z);
        if (str != null) {
            intent.putExtra("circular_return_name", str);
        }
        intent.putExtra("start_transition_alpha", f);
        intent.putExtra("start_transition_status_bar_color", i);
        intent.putExtra("return_transition_status_bar_color", i2);
        intent.putExtra("start_transition_navigation_bar_color", i3);
        intent.putExtra("return_transition_navigation_bar_color", i4);
        return intent;
    }

    public static Intent A12(Context context, Jid jid, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.chatinfo.ListChatInfoActivity");
        intent.putExtra("gid", C22971Dz.A06(jid));
        intent.putExtra("circular_transition", z);
        return intent;
    }

    public static Intent A13(Context context, Jid jid, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.group.GroupChatInfoActivity");
        intent.putExtra("gid", C22971Dz.A06(jid));
        intent.putExtra("circular_transition", z);
        intent.putExtra("show_description", z2);
        intent.putExtra("show_chat_action", z3);
        return intent;
    }

    public static final Intent A15(Context context, C29681ch r5, int i) {
        C18070vi.A0d(r5, 1);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity");
        intent.putExtra("jid", r5.getRawString());
        intent.putExtra("mv_referral_surface", i);
        return intent;
    }

    public static final Intent A18(Context context, C29681ch r5, String str, List list) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(list, 3);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector");
        intent.putExtra("jid", r5.getRawString());
        intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        intent.putExtra("invited_admins_jids", C22971Dz.A0B(list));
        return intent;
    }

    public static Intent A19(Context context, AnonymousClass1EC r4) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.community.CommunitySettingsActivity");
        className.putExtra("parent_jid", r4.getRawString());
        return className;
    }

    public static Intent A1A(Context context, AnonymousClass1EC r4) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity");
        className.putExtra("parent_jid", r4.getRawString());
        className.setFlags(335544320);
        return className;
    }

    public static Intent A1B(Context context, UserJid userJid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.identity.IdentityVerificationActivity");
        intent.putExtra("jid", userJid.getRawString());
        return intent;
    }

    public static Intent A1C(Context context, UserJid userJid, Integer num, Integer num2, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.businesscollection.view.activity.CollectionProductListActivity");
        intent.putExtra("collection_id", str);
        intent.putExtra("collection_name", str2);
        intent.putExtra("cache_jid", userJid.getRawString());
        intent.putExtra("collection_index", str3);
        if (num != null) {
            intent.putExtra("category_browsing_entry_point", num);
        }
        if (num2 != null) {
            intent.putExtra("category_level", num2);
        }
        return intent;
    }

    public static Intent A1D(Context context, UserJid userJid, Integer num, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.chatinfo.ContactInfoActivity");
        className.putExtra("jid", userJid.getRawString());
        className.putExtra("circular_transition", z);
        className.putExtra("should_show_chat_action", z2);
        className.putExtra("profile_entry_point", num);
        return className;
    }

    public static final Intent A1F(Context context, UserJid userJid, boolean z, boolean z2) {
        C18070vi.A0d(userJid, 1);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity");
        intent.putExtra("jid", userJid.getRawString());
        intent.putExtra("showMyPreview", z);
        intent.putExtra("startWithAvatar", z2);
        return intent;
    }

    public static Intent A1G(Context context, C59772mr r4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.parole.CustomRegistrationBlockActivity");
        if (r4 != null) {
            intent.putExtra("show_custom_fields", true);
            intent.putExtra("title_text", r4.A05);
            intent.putExtra("body_text", r4.A00);
            intent.putExtra("button_primary_text", r4.A02);
            intent.putExtra("button_primary_link", r4.A01);
            intent.putExtra("button_secondary_text", r4.A04);
            intent.putExtra("button_secondary_link", r4.A03);
        }
        return intent;
    }

    public static Intent A1H(Context context, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
        if (list != null) {
            className.putStringArrayListExtra("jid", C22971Dz.A0B(list));
        }
        if (bool != null) {
            className.putExtra("isTaskRoot", bool);
        }
        if (bool4 != null) {
            className.putExtra("newCall", bool4);
        }
        if (bool2 != null) {
            className.putExtra("video_call", bool2);
        }
        if (bool3 != null || C18050vg.A00(context) == null) {
            className.setFlags(268435456);
        }
        return className;
    }

    public static Intent A1J(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.contact.picker.ContactPicker");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent A1K(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.whatsapp.contextualhelp.ContextualHelpActivity");
        intent.putExtra("webview_url", str);
        intent.putExtra("webview_hide_url", true);
        intent.putExtra("webview_javascript_enabled", true);
        intent.putExtra("webview_avoid_external", true);
        intent.putExtra("webview_deeplink_enabled", true);
        return intent;
    }

    public static Intent A1L(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.whatsapp.inappsupport.ui.SupportBloksActivity");
        try {
            intent.putExtra("screen_params", new JSONObject().put("params", new JSONObject().put("server_params", new JSONObject().put("entrypointid", str))).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        intent.putExtra("screen_name", "com.bloks.www.cxthelp.whatsapp");
        return intent;
    }

    public static Intent A1M(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.backup.google.GoogleBackupService");
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        return intent;
    }

    public static Intent A1N(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.identity.IdentityVerificationActivity");
        intent.putExtra("jid", str);
        return intent;
    }

    public static Intent A1O(Context context, String str, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.email.EmailVerificationActivity");
        intent.putExtra("entrypoint", i);
        intent.putExtra("session_id", str);
        return intent;
    }

    public static Intent A1P(Context context, String str, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.email.RegisterEmail");
        intent.putExtra("entrypoint", i);
        intent.putExtra("session_id", str);
        boolean z = false;
        if (i == 6) {
            z = true;
        }
        intent.putExtra("challenge_flow", z);
        return intent;
    }

    public static Intent A1Q(Context context, String str, int i, int i2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.email.UpdateEmailActivity");
        intent.putExtra("state", i);
        intent.putExtra("entrypoint", i2);
        intent.putExtra("session_id", str);
        return intent;
    }

    public static Intent A1S(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.phonematching.CountryPicker");
        intent.putExtra("country_iso", str);
        intent.putExtra("country_display_name", str2);
        return intent;
    }

    public static Intent A1U(Context context, String str, String str2, int i) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.storage.StorageUsageActivity");
        className.putExtra("session_id", str);
        className.putExtra("entry_point", i);
        if (str2 != null) {
            className.putExtra("search_result_key", str2);
        }
        return className;
    }

    public static Intent A1W(Context context, String str, String str2, int i, int i2, int i3, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("server_start_message", str);
        className.putExtra("flash_type", i);
        className.putExtra("sms_retry_time", j);
        className.putExtra("voice_retry_time", j2);
        className.putExtra("wa_old_retry_time", j3);
        className.putExtra("email_otp_retry_time", j4);
        className.putExtra("use_sms_retriever", z);
        className.putExtra("show_request_code_progress_dialog", z2);
        className.putExtra("changenumber", z3);
        className.putExtra("should_request_flash_call", z4);
        className.putExtra("wa_old_eligible", i2);
        className.putExtra("wa_old_device_name", str2);
        className.putExtra("silent_auth_eligible", i3);
        className.putExtra("code_verification_mode", 0);
        return className;
    }

    public static Intent A1Z(Context context, String str, String str2, int i, boolean z) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.sendsmstowa.SendSmsToWa");
        className.putExtra("sendSmsNumber", str);
        className.putExtra("sendSmsCode", str2);
        className.putExtra("changeNumber", z);
        className.putExtra("intentType", i);
        return className;
    }

    public static final Intent A1a(Context context, String str, String str2, int i, boolean z) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.routing.AccountSwitchingRoutingActivity");
        intent.putExtra("switch_to_account_lid", str);
        intent.putExtra("switch_to_account_dir_id", str2);
        intent.putExtra("is_missed_call_notification", z);
        intent.putExtra("source", i);
        return intent;
    }

    public static Intent A1c(Context context, String str, String str2, String str3, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.PaymentWebViewActivity");
        C17960vV.A07(str);
        intent.putExtra("webview_url", str);
        intent.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("webview_callback", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("webview_cancel_callback", str3);
        }
        intent.putExtra("webview_toolbar_v2", true);
        intent.putExtra("webview_hide_url", false);
        intent.putExtra("webview_title_show_domain_only", true);
        intent.putExtra("webview_open_new_tab_in_external_browser", true);
        intent.putExtra("deep_link_type_support", i);
        intent.putExtra("webview_deeplink_enabled", true);
        intent.putExtra("webview_fallback_to_external_browser_on_webview_errors", true);
        return intent;
    }

    public static Intent A1d(Context context, String str, String str2, String str3, int i, int i2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.email.VerifyEmailActivity");
        intent.putExtra("email", str);
        intent.putExtra("state", i);
        intent.putExtra("entrypoint", i2);
        intent.putExtra("session_id", str3);
        if (str2 != null) {
            intent.putExtra("email_otp", str2);
        }
        return intent;
    }

    public static Intent A1e(Context context, String str, String str2, String str3, String str4, List list, int i, int i2, boolean z, boolean z2) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.gifvideopreview.GifVideoPreviewActivity").putExtra("preview_media_url", str).putExtra("media_url", str2).putExtra("static_preview_url", str3).putExtra("jids", C22971Dz.A0B(list)).putExtra("send", z2).putExtra("provider", i).putExtra("number_from_url", z).putExtra("origin", i2).putExtra("content_description", str4);
    }

    public static Intent A1h(Context context, String str, int[] iArr, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.twofactor.TwoFactorAuthActivity");
        intent.putExtra("primaryCTA", str);
        intent.putExtra("workflows", iArr);
        intent.putExtra("isEntryPointSecurityCheckup", z);
        return intent;
    }

    public static Intent A1i(Context context, Collection collection, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.group.GroupMembersSelector");
        intent.putExtra("entry_point", i);
        if (collection != null && !collection.isEmpty()) {
            intent.putExtra("selected", new ArrayList(collection));
        }
        return intent;
    }

    public static Intent A1j(Context context, Set set) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.contact.picker.BroadcastListMembersSelector");
        if (!set.isEmpty()) {
            intent.putExtra("selected", C22971Dz.A0B(set));
        }
        return intent;
    }

    public static final Intent A1l(Context context, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.consent.ConsentFlowActivity");
        intent.putExtra("isAccountTransfer", z);
        return intent;
    }

    public static Intent A1n(Context context, boolean z, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.biz.product.view.activity.ProductDetailActivity");
        intent.putExtra("is_from_product_detail_screen", z);
        intent.putExtra("go_back_to_catalog_from_deeplink", z2);
        return intent;
    }

    public static Intent A1o(Context context, boolean z, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.VerifyTwoFactorAuth");
        intent.putExtra("changenumber", z);
        intent.putExtra("isaccounttransfer", z2);
        return intent;
    }

    public static void A1r(Intent intent, Rect rect, Bundle bundle, int i, int i2, int i3, int i4) {
        intent.putExtra("EXTRA_INITIAL_TOP_MARGIN", i);
        intent.putExtra("EXTRA_START_MARGIN", i2);
        intent.putExtra("EXTRA_MSG_PADDING_START", rect.left);
        intent.putExtra("EXTRA_MSG_PADDING_TOP", rect.top);
        intent.putExtra("EXTRA_MSG_PADDING_END", rect.right);
        intent.putExtra("EXTRA_CUSTOMIZER_ID", i4);
        intent.putExtra("EXTRA_MSG_PADDING_BOTTOM", rect.bottom);
        intent.putExtra("EXTRA_PROFILE_PICTURE_WIDTH", i3);
        intent.putExtra("EXTRA_SAVE_STATE_BUNDLE", bundle);
    }

    @Deprecated
    public Intent A1u(Context context, AnonymousClass1E7 r5) {
        Jid A06 = r5.A06(UserJid.class);
        C17960vV.A07(A06);
        return A1D(context, (UserJid) A06, (Integer) null, true, true);
    }

    public Intent A1v(Context context, AnonymousClass1E7 r4, Integer num) {
        Jid A06 = r4.A06(UserJid.class);
        C17960vV.A07(A06);
        return A1D(context, (UserJid) A06, num, true, true);
    }

    public Intent A20(Context context, UserJid userJid, Boolean bool) {
        ArrayList arrayList = new ArrayList();
        if (userJid != null) {
            arrayList.add(userJid);
        }
        return A1H(context, bool, (Boolean) null, (Boolean) null, (Boolean) null, arrayList);
    }

    public Intent A21(Context context, AnonymousClass206 r7) {
        AnonymousClass205 r4 = r7.A0v;
        Intent putExtra = A1x(context, r4.A00, 0).putExtra("row_id", r7.A0x).putExtra("sort_id", r7.A0y);
        AnonymousClass4aU.A00(putExtra, r4);
        return putExtra;
    }

    public Intent A23(Context context, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, List list, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.support.faq.SearchFAQActivity");
        intent.putExtra("com.whatsapp.support.faq.SearchFAQ.from", str);
        intent.putExtra("com.whatsapp.support.faq.SearchFAQ.problem", str2);
        intent.putExtra("com.whatsapp.support.faq.SearchFAQ.status", str3);
        intent.putExtra("com.whatsapp.support.faq.SearchFAQ.count", i);
        intent.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.titles", arrayList2);
        intent.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.descriptions", arrayList3);
        intent.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.urls", arrayList4);
        intent.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.ids", arrayList5);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        List list2 = list;
        if (list != null) {
            String[] strArr = new String[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                Pair pair = (Pair) list2.get(i2);
                StringBuilder sb = new StringBuilder();
                sb.append((String) pair.first);
                sb.append(":");
                sb.append((String) pair.second);
                strArr[i2] = sb.toString();
            }
            intent.putExtra("com.whatsapp.support.faq.SearchFAQ.additionalDetails", strArr);
        }
        return intent;
    }

    public static void A1q(Context context, Intent intent, int i) {
        intent.setClassName(context.getPackageName(), "com.whatsapp.dmsetting.ChangeDMSettingActivity");
        intent.putExtra("entry_point", i);
    }

    public Intent A1w(Context context, AnonymousClass1BI r5, int i) {
        return A0C(context, i).putExtra("jid", C22971Dz.A06(r5)).addFlags(335544320);
    }

    public Intent A1x(Context context, AnonymousClass1BI r6, int i) {
        return A1w(context, r6, i).putExtra("start_t", SystemClock.uptimeMillis());
    }

    public Intent A22(Context context, String str, String str2, int i, boolean z) {
        Intent A1H = A1H(context, Boolean.valueOf(z), (Boolean) null, (Boolean) null, (Boolean) null, (List) null);
        A1H.setAction(str);
        A1H.putExtra("call_ui_action", i);
        A1H.putExtra("call_id", str2);
        A1H.putExtra("isTaskRoot", z);
        return A1H;
    }
}
