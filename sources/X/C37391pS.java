package X;

import android.app.Application;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import com.whatsapp.authgraphql.ui.CommonViewModel;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler;
import com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.banner.SettingsBannerViewModelImpl;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel;
import com.whatsapp.biz.catalog.viewmodel.ShareProductViewModel;
import com.whatsapp.biz.product.view.viewmodel.OrderCatalogPickerViewModel;
import com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.bot.botmemory.MemoryViewModel;
import com.whatsapp.bot.botmemory.bottomsheet.MemoryBottomSheetViewModel;
import com.whatsapp.bot.botmemory.data.MemoryRepository;
import com.whatsapp.bot.metaai.imagineme.ImagineMeConsentViewModel;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel;
import com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel;
import com.whatsapp.bot.metaai.premium.MetaAiPremiumViewModel;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerViewModel;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel;
import com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel;
import com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;
import com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel;
import com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel;
import com.whatsapp.calling.dialer.DialerHelper;
import com.whatsapp.calling.dialer.DialerRepository;
import com.whatsapp.calling.dialer.DialerViewModel;
import com.whatsapp.calling.favorite.FavoritePickerViewModel;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;
import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.chatinfo.FavoriteActionViewModel;
import com.whatsapp.chatinfo.SharePhoneNumberViewModel;
import com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheetViewModel;
import com.whatsapp.community.AllowNonAdminSubGroupCreationProtocolHelper;
import com.whatsapp.community.CommunityAdminPickerViewModel;
import com.whatsapp.community.CommunityMembersDirectory;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.community.SelectCommunityForGroupViewModel;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.community.mex.AllowNonAdminSubGroupCreationGraphQlHandler;
import com.whatsapp.companiondevice.LinkedDeviceEditDeviceViewModel;
import com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.companiondevice.LinkedDevicesViewModel;
import com.whatsapp.companionmode.registration.CompanionRegistrationViewModel;
import com.whatsapp.consent.ConsentAgeBanViewModel;
import com.whatsapp.consent.ConsentNavigationViewModel;
import com.whatsapp.consent.DateOfBirthCollectionViewModel;
import com.whatsapp.consent.DateOfBirthRemediationViewModel;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.contact.picker.viewmodels.ReachoutTimelockViewModel;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsViewModel;
import com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.conversation.ctwa.CtwaQualitySurveyViewModel;
import com.whatsapp.conversation.selection.SelectedImageAlbumViewModel;
import com.whatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.conversationslist.InteropUnifiedInboxViewModel;
import com.whatsapp.conversationslist.InteropViewModel;
import com.whatsapp.conversationslist.filter.ConversationFilterViewModel;
import com.whatsapp.countries.CountryListViewModel;
import com.whatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel;
import com.whatsapp.dobverification.DosaRepository;
import com.whatsapp.dobverification.WaConsentRepository;
import com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel;
import com.whatsapp.dogfood.DogfooderDiagnosticsViewModel;
import com.whatsapp.dogfood.MuteDiagnosticsDialogViewModel;
import com.whatsapp.expressionstray.ExpressionsTrayViewModel;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.favorite.FavoriteManager;
import com.whatsapp.favorite.FavoritesChatsSuggestionManager;
import com.whatsapp.favorites.FavoriteListViewModel;
import com.whatsapp.favorites.picker.FavoritesPickerViewModel;
import com.whatsapp.flows.downloadresponse.viewmodel.FlowsDownloadResponseViewModel;
import com.whatsapp.flows.phoenix.viewmodel.FlowsFooterViewModel;
import com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.gallery.viewmodel.GalleryViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryViewModel;
import com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.group.HistorySettingViewModel;
import com.whatsapp.group.KeyboardControllerViewModel;
import com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel;
import com.whatsapp.group.membersuggestions.data.GroupMemberSuggestionsManager;
import com.whatsapp.grouphistory.xmpp.EnableGroupHistoryProtocolHelper;
import com.whatsapp.home.HomeViewModel;
import com.whatsapp.imagineme.ImagineMeOnboardingRequester;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper;
import com.whatsapp.inappsupport.ui.SupportAiViewModel;
import com.whatsapp.inappsupport.ui.SupportBkLayoutViewModel;
import com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel;
import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel;
import com.whatsapp.interopui.notification.InteropNotifOptInViewModel;
import com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel;
import com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel;
import com.whatsapp.interopui.setting.InteropSettingsViewModel;
import com.whatsapp.lists.ListsConversationsManagementViewModel;
import com.whatsapp.lists.ListsManagerViewModel;
import com.whatsapp.lists.ListsRepository;
import com.whatsapp.lists.home.ui.main.ListsHomeViewModel;
import com.whatsapp.lists.picker.ListsContactPickerViewModel;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.media.share.ShareMediaViewModel;
import com.whatsapp.media.utwonet.UTwoNetViewModel;
import com.whatsapp.mediacomposer.viewmodel.GifComposerViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel;
import com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel;
import com.whatsapp.mediaview.MediaViewCurrentMessageViewModel;
import com.whatsapp.messagetranslation.onboarding.TranslationViewModel;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;
import com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel;
import com.whatsapp.migration.export.ui.ExportMigrationViewModel;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.ml.v2.storageusage.MLModelStorageUsageViewModel;
import com.whatsapp.music.viewmodels.MusicAttributionViewModel;
import com.whatsapp.mute.ui.MuteDialogViewModel;
import com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient;
import com.whatsapp.pancake.PomegranatePancakeViewModel;
import com.whatsapp.pancake.dosa.DosaAgeBanViewModel;
import com.whatsapp.pancake.dosa.DosaAgeRemediationPassViewModel;
import com.whatsapp.pancake.dosa.DosaCollectionViewModel;
import com.whatsapp.pancake.dosa.DosaNavigationViewModel;
import com.whatsapp.pancake.dosa.DosaPearPancakeViewModel;
import com.whatsapp.pancake.dosa.DosaRemediationViewModel;
import com.whatsapp.passkeys.PasskeyExistsCache;
import com.whatsapp.passkeys.PasskeyServerApiImpl;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPayNumberContactPickerViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiSendPaymentViewModel;
import com.whatsapp.payments.ui.viewmodel.MessageWithLinkViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import com.whatsapp.polls.creator.PollCreatorViewModel;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import com.whatsapp.product.newsletterenforcements.disputesettlement.NewsletterEnforcementSelectActionViewModel;
import com.whatsapp.product.newsletterenforcements.integrityappeals.NewsletterRequestReviewViewModel;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoViewModel;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;
import com.whatsapp.product.searchtheweb.GoogleSearchContentBottomSheetViewModel;
import com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;
import com.whatsapp.productinfra.avatar.liveediting.viewmodel.SparkViewModel;
import com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheetViewModel;
import com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel;
import com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinEntryViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinSetViewModel;
import com.whatsapp.profile.viewmodel.UsernameSetSuccessDialogViewModel;
import com.whatsapp.profile.viewmodel.UsernameSetViewModel;
import com.whatsapp.profile.viewmodel.UsernameSettingsViewModel;
import com.whatsapp.profile.viewmodel.UsernameShareViewModel;
import com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel;
import com.whatsapp.profile.viewmodel.UsernameViewModel;
import com.whatsapp.quickactionbar.viewmodel.QuickActionBarViewModel;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.registration.AccountTransferManager;
import com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel;
import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel;
import com.whatsapp.registration.autoconf.AutoconfUseCase;
import com.whatsapp.registration.entercode.EnterCodeViewModel;
import com.whatsapp.registration.flashcall.FlashCallViewModel;
import com.whatsapp.registration.passkey.PasskeyUseCase;
import com.whatsapp.registration.passkey.PasskeyVerifier;
import com.whatsapp.registration.phonenumberentry.EnterPhoneNumberViewModel;
import com.whatsapp.registration.phonenumberentry.RegisterPhoneViewModel;
import com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel;
import com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel;
import com.whatsapp.registration.sendsmstowa.SendSmsToWaViewModel;
import com.whatsapp.registration.silentauth.VerifySilentAuthUseCase;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel;
import com.whatsapp.registration.viewmodel.ProfileCreationViewModel;
import com.whatsapp.settings.SettingsAccountViewModel;
import com.whatsapp.settings.SettingsChatViewModel;
import com.whatsapp.settings.SettingsDataUsageViewModel;
import com.whatsapp.settings.SettingsPasskeysViewModel;
import com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel;
import com.whatsapp.settings.SettingsSetupUserProxyViewModel;
import com.whatsapp.settings.SettingsUserProxyViewModel;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel;
import com.whatsapp.settings.securitycheckup.SecurityCheckupBannerViewModel;
import com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupViewModel;
import com.whatsapp.shareselection.ShareActionsViewModel;
import com.whatsapp.shops.ShopsBkLayoutViewModel;
import com.whatsapp.shops.ShopsProductPreviewFragmentViewModel;
import com.whatsapp.spamreport.ReportSpamDialogViewModel;
import com.whatsapp.status.advertise.CtwaStatusUpsellBottomSheetTriggerViewModel;
import com.whatsapp.status.advertise.UpdatesAdvertiseViewModel;
import com.whatsapp.status.archive.StatusArchiveSettingsViewModel;
import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel;
import com.whatsapp.storage.viewmodel.StorageUsageMediaGalleryViewModel;
import com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel;
import com.whatsapp.suggestions.SuggestionsEngine;
import com.whatsapp.suggestions.networking.SuggestedContactsFetcher;
import com.whatsapp.tosgating.viewmodel.ToSGatingViewModel;
import com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel;
import com.whatsapp.usercontrol.viewmodel.UserControlStopResumeViewModel;
import com.whatsapp.viewmodel.GifVideoPreviewViewModel;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModel;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkFlowsLayoutViewModel;
import com.whatsapp.waffle.wfac.ui.WfacBanViewModel;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1pS  reason: invalid class name and case insensitive filesystem */
public final class C37391pS implements AnonymousClass00S {
    public final AnonymousClass10E A00;
    public final C37381pR A01;
    public final int A02;
    public final C24331Jt A03;

    public C37391pS(C24331Jt r1, AnonymousClass10E r2, C37381pR r3, int i) {
        this.A00 = r2;
        this.A03 = r1;
        this.A01 = r3;
        this.A02 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0d03, code lost:
        return new X.C172218t4(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0d0a, code lost:
        return new X.AnonymousClass36Y(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object A0A() {
        /*
            r39 = this;
            r0 = r39
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x12bd;
                case 1: goto L_0x12b7;
                case 2: goto L_0x1249;
                case 3: goto L_0x120e;
                case 4: goto L_0x11e6;
                case 5: goto L_0x118c;
                case 6: goto L_0x1157;
                case 7: goto L_0x1129;
                case 8: goto L_0x110b;
                case 9: goto L_0x10e9;
                case 10: goto L_0x10d7;
                case 11: goto L_0x1096;
                case 12: goto L_0x1084;
                case 13: goto L_0x1072;
                case 14: goto L_0x1032;
                case 15: goto L_0x0fb7;
                case 16: goto L_0x0f40;
                case 17: goto L_0x0f06;
                case 18: goto L_0x0eee;
                case 19: goto L_0x0e6b;
                case 20: goto L_0x0e51;
                case 21: goto L_0x0e00;
                case 22: goto L_0x0dc1;
                case 23: goto L_0x0dbb;
                case 24: goto L_0x0d79;
                case 25: goto L_0x0d3d;
                case 26: goto L_0x0d21;
                case 27: goto L_0x0d1b;
                case 28: goto L_0x0d0b;
                case 29: goto L_0x0d04;
                case 30: goto L_0x0cfc;
                case 31: goto L_0x0cf6;
                case 32: goto L_0x0c78;
                case 33: goto L_0x0c66;
                case 34: goto L_0x0c20;
                case 35: goto L_0x0c04;
                case 36: goto L_0x0bfe;
                case 37: goto L_0x0bee;
                case 38: goto L_0x0beb;
                case 39: goto L_0x0be7;
                case 40: goto L_0x0b8e;
                case 41: goto L_0x0b41;
                case 42: goto L_0x0b3b;
                case 43: goto L_0x0b35;
                case 44: goto L_0x0b2f;
                case 45: goto L_0x0a98;
                case 46: goto L_0x0a68;
                case 47: goto L_0x0a2b;
                case 48: goto L_0x0a0f;
                case 49: goto L_0x098a;
                case 50: goto L_0x097a;
                case 51: goto L_0x0956;
                case 52: goto L_0x08fc;
                case 53: goto L_0x08a5;
                case 54: goto L_0x086c;
                case 55: goto L_0x082b;
                case 56: goto L_0x07af;
                case 57: goto L_0x0755;
                case 58: goto L_0x06ff;
                case 59: goto L_0x06e1;
                case 60: goto L_0x06c1;
                case 61: goto L_0x068d;
                case 62: goto L_0x0667;
                case 63: goto L_0x0651;
                case 64: goto L_0x05eb;
                case 65: goto L_0x05e4;
                case 66: goto L_0x05dd;
                case 67: goto L_0x05d6;
                case 68: goto L_0x05cf;
                case 69: goto L_0x05c8;
                case 70: goto L_0x05c1;
                case 71: goto L_0x05ba;
                case 72: goto L_0x05b3;
                case 73: goto L_0x05ac;
                case 74: goto L_0x0559;
                case 75: goto L_0x0552;
                case 76: goto L_0x0468;
                case 77: goto L_0x0461;
                case 78: goto L_0x045a;
                case 79: goto L_0x0453;
                case 80: goto L_0x042b;
                case 81: goto L_0x0403;
                case 82: goto L_0x03c6;
                case 83: goto L_0x03b4;
                case 84: goto L_0x030a;
                case 85: goto L_0x0303;
                case 86: goto L_0x026d;
                case 87: goto L_0x0266;
                case 88: goto L_0x0260;
                case 89: goto L_0x0207;
                case 90: goto L_0x0201;
                case 91: goto L_0x01fb;
                case 92: goto L_0x01f5;
                case 93: goto L_0x01ef;
                case 94: goto L_0x01e9;
                case 95: goto L_0x01e3;
                case 96: goto L_0x01d1;
                case 97: goto L_0x00bf;
                case 98: goto L_0x003d;
                case 99: goto L_0x000d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x000d:
            X.10E r5 = r0.A00
            X.00S r1 = r5.A04
            java.lang.Object r4 = r1.get()
            X.0ve r4 = (X.C18030ve) r4
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A1J
            X.00H r3 = X.C000200d.A00(r0)
            X.00S r0 = r5.ABX
            java.lang.Object r2 = r0.get()
            X.1Me r2 = (X.C24921Me) r2
            X.00S r0 = r5.A4x
            java.lang.Object r0 = r0.get()
            X.1UL r0 = (X.AnonymousClass1UL) r0
            X.9lp r1 = new X.9lp
            r1.<init>(r2, r4, r0, r3)
            return r1
        L_0x003d:
            X.10E r2 = r0.A00
            X.00S r1 = r2.A04
            java.lang.Object r11 = r1.get()
            X.0ve r11 = (X.C18030ve) r11
            X.00S r1 = r2.A4b
            java.lang.Object r10 = r1.get()
            X.1KB r10 = (X.AnonymousClass1KB) r10
            X.00S r1 = r2.A63
            java.lang.Object r9 = r1.get()
            X.11S r9 = (X.AnonymousClass11S) r9
            X.00S r1 = r2.AC1
            java.lang.Object r8 = r1.get()
            X.10I r8 = (X.AnonymousClass10I) r8
            X.00S r1 = r2.A1R
            java.lang.Object r7 = r1.get()
            X.8yP r7 = (X.C175258yP) r7
            X.00S r1 = r2.A2f
            java.lang.Object r6 = r1.get()
            X.1M9 r6 = (X.AnonymousClass1M9) r6
            X.00S r1 = r2.ABz
            java.lang.Object r5 = r1.get()
            X.0vb r5 = (X.C18000vb) r5
            X.00S r1 = r2.ABX
            java.lang.Object r4 = r1.get()
            X.1Me r4 = (X.C24921Me) r4
            X.00S r1 = r2.A9g
            java.lang.Object r3 = r1.get()
            X.1Uq r3 = (X.C27081Uq) r3
            X.00S r1 = r2.ABM
            java.lang.Object r2 = r1.get()
            X.1PM r2 = (X.AnonymousClass1PM) r2
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A46
            X.00H r18 = X.C000200d.A00(r0)
            com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel r1 = new com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel
            r13 = r4
            r14 = r5
            r15 = r3
            r16 = r11
            r17 = r8
            r8 = r10
            r10 = r7
            r11 = r6
            r12 = r2
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L_0x00bf:
            X.10E r1 = r0.A00
            r20 = r1
            X.00S r1 = r20.A04
            java.lang.Object r18 = r1.get()
            r1 = r18
            X.0ve r1 = (X.C18030ve) r1
            r18 = r1
            X.00S r1 = r20.A63
            java.lang.Object r17 = r1.get()
            r1 = r17
            X.11S r1 = (X.AnonymousClass11S) r1
            r17 = r1
            X.00S r1 = r20.ABY
            java.lang.Object r15 = r1.get()
            X.118 r15 = (X.AnonymousClass118) r15
            X.00S r1 = r20.AC1
            java.lang.Object r14 = r1.get()
            X.10I r14 = (X.AnonymousClass10I) r14
            X.00S r1 = r20.AA5
            java.lang.Object r13 = r1.get()
            X.1Mc r13 = (X.C24901Mc) r13
            X.1Hd r26 = X.AnonymousClass10E.A84(r20)
            X.00S r1 = r20.A0E
            java.lang.Object r12 = r1.get()
            X.1L9 r12 = (X.AnonymousClass1L9) r12
            X.00S r1 = r20.A1R
            java.lang.Object r11 = r1.get()
            X.8yP r11 = (X.C175258yP) r11
            X.10G r16 = r20.A00
            X.00S r1 = r16.AFD
            java.lang.Object r10 = r1.get()
            X.7Fc r10 = (X.C143867Fc) r10
            X.00S r1 = r20.A95
            java.lang.Object r9 = r1.get()
            X.1DC r9 = (X.AnonymousClass1DC) r9
            X.00S r1 = r20.A2f
            java.lang.Object r8 = r1.get()
            X.1M9 r8 = (X.AnonymousClass1M9) r8
            X.00S r1 = r20.ABX
            java.lang.Object r7 = r1.get()
            X.1Me r7 = (X.C24921Me) r7
            X.00S r1 = r20.A4h
            java.lang.Object r6 = r1.get()
            X.126 r6 = (X.AnonymousClass126) r6
            X.00S r1 = r20.ABO
            java.lang.Object r5 = r1.get()
            X.AfC r5 = (X.C21141AfC) r5
            X.00S r1 = r20.ABQ
            java.lang.Object r4 = r1.get()
            com.whatsapp.voipcalling.camera.VoipCameraManager r4 = (com.whatsapp.voipcalling.camera.VoipCameraManager) r4
            X.00S r1 = r20.ABM
            r1.get()
            X.00S r1 = r20.A1e
            java.lang.Object r3 = r1.get()
            X.1V9 r3 = (X.AnonymousClass1V9) r3
            X.00S r1 = r20.A4t
            java.lang.Object r2 = r1.get()
            X.1MZ r2 = (X.AnonymousClass1MZ) r2
            X.00S r1 = r20.A9k
            X.00H r33 = X.C000200d.A00(r1)
            X.00S r35 = r20.A8t
            X.00S r36 = r16.AFR
            X.00S r37 = r20.Aej
            X.00S r38 = r20.Aek
            X.00S r1 = r20.A7t
            X.00H r34 = X.C000200d.A00(r1)
            X.1pR r0 = r0.A01
            X.6ih r19 = r0.A0l()
            X.00S r0 = r20.A31
            java.lang.Object r0 = r0.get()
            X.190 r0 = (X.AnonymousClass190) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = new com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel
            r25 = r2
            r27 = r18
            r28 = r6
            r29 = r13
            r30 = r9
            r31 = r14
            r32 = r4
            r20 = r3
            r21 = r5
            r22 = r8
            r23 = r7
            r24 = r15
            r14 = r12
            r15 = r0
            r16 = r17
            r17 = r11
            r18 = r10
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r1
        L_0x01d1:
            X.10E r0 = r0.A00
            X.00S r0 = r0.A1R
            java.lang.Object r0 = r0.get()
            X.8yP r0 = (X.C175258yP) r0
            com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel r1 = new com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel
            r1.<init>(r0)
            return r1
        L_0x01e3:
            X.4Ka r1 = new X.4Ka
            r1.<init>(r0)
            return r1
        L_0x01e9:
            X.4KZ r1 = new X.4KZ
            r1.<init>(r0)
            return r1
        L_0x01ef:
            X.4KY r1 = new X.4KY
            r1.<init>(r0)
            return r1
        L_0x01f5:
            X.4KX r1 = new X.4KX
            r1.<init>(r0)
            return r1
        L_0x01fb:
            X.4KW r1 = new X.4KW
            r1.<init>(r0)
            return r1
        L_0x0201:
            X.4KV r1 = new X.4KV
            r1.<init>(r0)
            return r1
        L_0x0207:
            X.1pR r7 = r0.A01
            X.1pP r8 = r7.A7D
            X.10E r1 = r0.A00
            X.00S r0 = r1.A63
            java.lang.Object r6 = r0.get()
            X.11S r6 = (X.AnonymousClass11S) r6
            X.00S r0 = r1.A1l
            java.lang.Object r5 = r0.get()
            X.1VP r5 = (X.AnonymousClass1VP) r5
            X.00S r0 = r1.A2f
            java.lang.Object r4 = r0.get()
            X.1M9 r4 = (X.AnonymousClass1M9) r4
            X.00S r0 = r1.A7u
            java.lang.Object r3 = r0.get()
            X.1MW r3 = (X.AnonymousClass1MW) r3
            X.00S r0 = r1.A4t
            java.lang.Object r2 = r0.get()
            X.1MZ r2 = (X.AnonymousClass1MZ) r2
            X.00S r0 = r1.A9F
            java.lang.Object r0 = r0.get()
            X.0wl r0 = (X.C18600wl) r0
            X.4XV r10 = r7.A0i()
            X.1Ho r16 = X.C27011Uj.A00()
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r1 = new com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel
            r13 = r2
            r14 = r3
            r15 = r0
            r9 = r6
            r11 = r5
            r12 = r4
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x0260:
            X.4KU r1 = new X.4KU
            r1.<init>(r0)
            return r1
        L_0x0266:
            r2 = 1
            X.4hY r1 = new X.4hY
            r1.<init>(r0, r2)
            return r1
        L_0x026d:
            X.1pR r2 = r0.A01
            X.1pP r16 = r2.A7D
            X.10E r6 = r0.A00
            X.10G r1 = r6.A00
            com.whatsapp.areffects.util.ArEffectsGatingUtil r19 = X.AnonymousClass10G.A1S(r1)
            X.9Zt r18 = X.AnonymousClass10G.A1Q(r1)
            X.00S r0 = r2.A2h
            java.lang.Object r5 = r0.get()
            X.5Wi r5 = (X.C106565Wi) r5
            com.whatsapp.calling.areffects.StickyEffectsStateSaver r22 = r2.A0g()
            X.00S r0 = r6.A9F
            java.lang.Object r4 = r0.get()
            X.0wl r4 = (X.C18600wl) r4
            com.whatsapp.calling.areffects.CallSessionEffectsStateSaver r21 = r2.A0e()
            X.00S r0 = r1.A0C
            X.00H r25 = X.C000200d.A00(r0)
            X.00S r0 = r2.A2i
            java.lang.Object r3 = r0.get()
            X.4KU r3 = (X.AnonymousClass4KU) r3
            X.00S r0 = r6.ABc
            X.00H r26 = X.C000200d.A00(r0)
            X.1Ho r31 = X.C27011Uj.A00()
            X.00S r0 = r6.A04
            java.lang.Object r2 = r0.get()
            X.0ve r2 = (X.C18030ve) r2
            X.00S r0 = r6.A1R
            java.lang.Object r1 = r0.get()
            X.8yP r1 = (X.C175258yP) r1
            X.00S r0 = r6.ABQ
            X.00H r27 = X.C000200d.A00(r0)
            X.00S r0 = r6.A1Q
            X.00H r28 = X.C000200d.A00(r0)
            X.00S r0 = r6.A9E
            java.lang.Object r0 = r0.get()
            X.0wl r0 = (X.C18600wl) r0
            X.00S r6 = r6.AGq
            X.00H r29 = X.C000200d.A00(r6)
            com.whatsapp.calling.areffects.CallArEffectsViewModel r15 = new com.whatsapp.calling.areffects.CallArEffectsViewModel
            r17 = r3
            r20 = r5
            r23 = r1
            r24 = r2
            r30 = r4
            r32 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r15
        L_0x0303:
            r2 = 1
            X.4nm r1 = new X.4nm
            r1.<init>(r0, r2)
            return r1
        L_0x030a:
            X.10E r1 = r0.A00
            X.00S r2 = r1.A04
            java.lang.Object r13 = r2.get()
            X.0ve r13 = (X.C18030ve) r13
            X.00S r2 = r1.A4b
            java.lang.Object r12 = r2.get()
            X.1KB r12 = (X.AnonymousClass1KB) r12
            X.00S r2 = r1.AC1
            java.lang.Object r11 = r2.get()
            X.10I r11 = (X.AnonymousClass10I) r11
            X.00S r2 = r1.A2H
            java.lang.Object r10 = r2.get()
            X.1CJ r10 = (X.AnonymousClass1CJ) r10
            X.00S r2 = r1.A2f
            java.lang.Object r9 = r2.get()
            X.1M9 r9 = (X.AnonymousClass1M9) r9
            X.00S r2 = r1.A4p
            java.lang.Object r8 = r2.get()
            X.1Pv r8 = (X.C25841Pv) r8
            X.00S r2 = r1.ABX
            java.lang.Object r7 = r2.get()
            X.1Me r7 = (X.C24921Me) r7
            X.00S r2 = r1.A25
            java.lang.Object r6 = r2.get()
            X.1fA r6 = (X.C31191fA) r6
            X.00S r2 = r1.A4w
            java.lang.Object r5 = r2.get()
            X.12M r5 = (X.AnonymousClass12M) r5
            X.00S r2 = r1.A6Y
            java.lang.Object r4 = r2.get()
            X.1Lg r4 = (X.C24681Lg) r4
            X.00S r2 = r1.A7u
            java.lang.Object r3 = r2.get()
            X.1MW r3 = (X.AnonymousClass1MW) r3
            X.00S r2 = r1.A2q
            java.lang.Object r2 = r2.get()
            X.1NN r2 = (X.AnonymousClass1NN) r2
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A2g
            java.lang.Object r14 = r0.get()
            X.5Zy r14 = (X.C107505Zy) r14
            X.00S r0 = r1.A4m
            X.00H r24 = X.C000200d.A00(r0)
            com.whatsapp.community.communityInfo.CAGInfoViewModel r1 = new com.whatsapp.community.communityInfo.CAGInfoViewModel
            r22 = r14
            r23 = r11
            r16 = r2
            r17 = r4
            r18 = r3
            r19 = r13
            r20 = r8
            r21 = r5
            r11 = r12
            r12 = r6
            r13 = r9
            r14 = r7
            r15 = r10
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r1
        L_0x03b4:
            X.10E r0 = r0.A00
            X.00S r0 = r0.A2q
            java.lang.Object r0 = r0.get()
            X.1NN r0 = (X.AnonymousClass1NN) r0
            com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel r1 = new com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel
            r1.<init>(r0)
            return r1
        L_0x03c6:
            X.10E r2 = r0.A00
            X.00V r1 = r2.Ao9
            android.app.Application r3 = X.AnonymousClass0YX.A00(r1)
            X.1pR r0 = r0.A01
            X.ATl r4 = X.C37381pR.A0U(r0)
            X.9og r5 = r0.A0W()
            X.10G r1 = r2.A00
            X.00S r0 = r1.A8v
            java.lang.Object r2 = r0.get()
            X.A4k r2 = (X.C20041A4k) r2
            X.00S r0 = r1.A1W
            X.00H r8 = X.C000200d.A00(r0)
            X.00S r0 = r1.A0d
            java.lang.Object r0 = r0.get()
            X.1XN r0 = (X.AnonymousClass1XN) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel r1 = new com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel
            r6 = r2
            r7 = r0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0403:
            X.10E r4 = r0.A00
            X.00V r1 = r4.Ao9
            android.app.Application r3 = X.AnonymousClass0YX.A00(r1)
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A76
            X.00H r2 = X.C000200d.A00(r0)
            X.10G r0 = r4.A00
            X.00S r0 = r0.A1W
            java.lang.Object r0 = r0.get()
            X.AM7 r0 = (X.AM7) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryFrequentContactedViewModel r1 = new com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryFrequentContactedViewModel
            r1.<init>(r3, r0, r2)
            return r1
        L_0x042b:
            X.10E r1 = r0.A00
            X.00V r0 = r1.Ao9
            android.app.Application r3 = X.AnonymousClass0YX.A00(r0)
            X.10G r1 = r1.A00
            X.00S r0 = r1.A1V
            java.lang.Object r2 = r0.get()
            X.AM5 r2 = (X.AM5) r2
            X.00S r0 = r1.A0f
            java.lang.Object r0 = r0.get()
            X.8ve r0 = (X.C173738ve) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryEducationNuxViewModel r1 = new com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryEducationNuxViewModel
            r1.<init>(r3, r2, r0)
            return r1
        L_0x0453:
            r2 = 1
            X.2yB r1 = new X.2yB
            r1.<init>(r0, r2)
            return r1
        L_0x045a:
            r2 = 1
            X.APL r1 = new X.APL
            r1.<init>(r0, r2)
            return r1
        L_0x0461:
            r2 = 1
            X.2yC r1 = new X.2yC
            r1.<init>(r0, r2)
            return r1
        L_0x0468:
            X.10E r2 = r0.A00
            X.00S r1 = r2.AAv
            java.lang.Object r14 = r1.get()
            X.11P r14 = (X.AnonymousClass11P) r14
            X.00S r1 = r2.A4b
            java.lang.Object r13 = r1.get()
            X.1KB r13 = (X.AnonymousClass1KB) r13
            X.00V r1 = r2.Ao9
            android.app.Application r16 = X.AnonymousClass0YX.A00(r1)
            X.1pR r0 = r0.A01
            X.1pP r17 = r0.A7D
            X.10G r15 = r2.A00
            X.00S r1 = r15.A0d
            java.lang.Object r12 = r1.get()
            X.1XN r12 = (X.AnonymousClass1XN) r12
            X.ATl r22 = X.C37381pR.A0U(r0)
            X.00S r1 = r0.A2e
            java.lang.Object r11 = r1.get()
            X.B7p r11 = (X.C22433B7p) r11
            X.9x1 r27 = r0.A0Y()
            X.00S r1 = r15.A4P
            java.lang.Object r10 = r1.get()
            X.A5L r10 = (X.A5L) r10
            X.A2L r29 = r0.A0a()
            X.00S r1 = r15.A1l
            java.lang.Object r9 = r1.get()
            X.9it r9 = (X.C189319it) r9
            X.00S r1 = r15.A9F
            java.lang.Object r8 = r1.get()
            X.9yU r8 = (X.C198529yU) r8
            X.00S r1 = r15.A1P
            java.lang.Object r7 = r1.get()
            X.9d0 r7 = (X.C185699d0) r7
            X.00S r1 = r0.A2d
            java.lang.Object r6 = r1.get()
            X.B7q r6 = (X.C22434B7q) r6
            X.00S r1 = r15.A1R
            X.00H r36 = X.C000200d.A00(r1)
            X.00S r1 = r15.A0f
            java.lang.Object r5 = r1.get()
            X.8ve r5 = (X.C173738ve) r5
            X.00S r1 = r15.A8v
            java.lang.Object r4 = r1.get()
            X.A4k r4 = (X.C20041A4k) r4
            X.00S r1 = r15.A1V
            java.lang.Object r3 = r1.get()
            X.AM5 r3 = (X.AM5) r3
            X.00S r1 = r15.A1W
            X.00H r37 = X.C000200d.A00(r1)
            X.00S r1 = r15.A1S
            java.lang.Object r2 = r1.get()
            X.1og r2 = (X.C36921og) r2
            X.00S r0 = r0.A2f
            java.lang.Object r1 = r0.get()
            X.B7j r1 = (X.C22427B7j) r1
            X.00S r0 = r15.A0e
            java.lang.Object r0 = r0.get()
            X.7CB r0 = (X.AnonymousClass7CB) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r15 = new com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel
            r30 = r11
            r31 = r6
            r32 = r14
            r33 = r12
            r34 = r0
            r35 = r2
            r25 = r10
            r26 = r4
            r28 = r1
            r23 = r8
            r24 = r5
            r20 = r7
            r21 = r3
            r18 = r9
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r15
        L_0x0552:
            r2 = 1
            X.APO r1 = new X.APO
            r1.<init>(r0, r2)
            return r1
        L_0x0559:
            X.10E r1 = r0.A00
            X.00S r0 = r1.AC1
            java.lang.Object r6 = r0.get()
            X.10I r6 = (X.AnonymousClass10I) r6
            X.00S r0 = r1.A2f
            java.lang.Object r5 = r0.get()
            X.1M9 r5 = (X.AnonymousClass1M9) r5
            X.00S r0 = r1.A0x
            X.00H r12 = X.C000200d.A00(r0)
            X.00S r0 = r1.ABm
            java.lang.Object r4 = r0.get()
            X.1hL r4 = (X.C32531hL) r4
            X.00S r0 = r1.AUB
            java.lang.Object r3 = r0.get()
            X.1Qq r3 = (X.C26051Qq) r3
            X.00S r0 = r1.A1J
            java.lang.Object r2 = r0.get()
            X.1Ty r2 = (X.C26911Ty) r2
            X.00S r0 = r1.A4t
            java.lang.Object r0 = r0.get()
            X.1MZ r0 = (X.AnonymousClass1MZ) r0
            X.6o8 r1 = new X.6o8
            r11 = r6
            r6 = r4
            r7 = r2
            r8 = r5
            r9 = r3
            r10 = r0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x05ac:
            r2 = 1
            X.AOr r1 = new X.AOr
            r1.<init>(r0, r2)
            return r1
        L_0x05b3:
            r2 = 1
            X.AOv r1 = new X.AOv
            r1.<init>(r0, r2)
            return r1
        L_0x05ba:
            r2 = 2
            X.AOu r1 = new X.AOu
            r1.<init>(r0, r2)
            return r1
        L_0x05c1:
            r2 = 1
            X.AOw r1 = new X.AOw
            r1.<init>(r0, r2)
            return r1
        L_0x05c8:
            r2 = 1
            X.AOs r1 = new X.AOs
            r1.<init>(r0, r2)
            return r1
        L_0x05cf:
            r2 = 1
            X.AOt r1 = new X.AOt
            r1.<init>(r0, r2)
            return r1
        L_0x05d6:
            r2 = 1
            X.2yA r1 = new X.2yA
            r1.<init>(r0, r2)
            return r1
        L_0x05dd:
            r2 = 1
            X.AOy r1 = new X.AOy
            r1.<init>(r0, r2)
            return r1
        L_0x05e4:
            r2 = 1
            X.AOx r1 = new X.AOx
            r1.<init>(r0, r2)
            return r1
        L_0x05eb:
            X.10E r2 = r0.A00
            X.00V r1 = r2.Ao9
            android.app.Application r9 = X.AnonymousClass0YX.A00(r1)
            X.10G r8 = r2.A00
            X.00S r1 = r8.A0d
            java.lang.Object r7 = r1.get()
            X.1XN r7 = (X.AnonymousClass1XN) r7
            X.1pR r1 = r0.A01
            X.AP6 r14 = r1.A0c()
            X.00S r0 = r8.A4P
            java.lang.Object r6 = r0.get()
            X.A5L r6 = (X.A5L) r6
            X.00S r0 = r1.A2d
            java.lang.Object r5 = r0.get()
            X.B7q r5 = (X.C22434B7q) r5
            X.00S r0 = r8.A0f
            java.lang.Object r4 = r0.get()
            X.8ve r4 = (X.C173738ve) r4
            X.00S r0 = r8.A8v
            java.lang.Object r3 = r0.get()
            X.A4k r3 = (X.C20041A4k) r3
            X.00S r0 = r8.A1V
            java.lang.Object r2 = r0.get()
            X.AM5 r2 = (X.AM5) r2
            X.00S r0 = r8.A1W
            X.00H r17 = X.C000200d.A00(r0)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel r1 = new com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel
            r15 = r5
            r16 = r7
            r10 = r2
            r11 = r4
            r12 = r6
            r13 = r3
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x0651:
            X.10E r0 = r0.A00
            X.10G r0 = r0.A00
            X.00S r0 = r0.A0f
            java.lang.Object r0 = r0.get()
            X.8ve r0 = (X.C173738ve) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r1 = new com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel
            r1.<init>(r0)
            return r1
        L_0x0667:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A04
            java.lang.Object r3 = r0.get()
            X.0ve r3 = (X.C18030ve) r3
            X.00S r0 = r1.A90
            java.lang.Object r2 = r0.get()
            X.12L r2 = (X.AnonymousClass12L) r2
            X.00S r0 = r1.AAb
            java.lang.Object r0 = r0.get()
            X.1MB r0 = (X.AnonymousClass1MB) r0
            X.4QR r1 = new X.4QR
            r1.<init>(r3, r2, r0)
            return r1
        L_0x068d:
            X.10E r5 = r0.A00
            X.00S r1 = r5.A63
            java.lang.Object r4 = r1.get()
            X.11S r4 = (X.AnonymousClass11S) r4
            X.00S r1 = r5.ABM
            java.lang.Object r3 = r1.get()
            X.1PM r3 = (X.AnonymousClass1PM) r3
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A5H
            java.lang.Object r2 = r0.get()
            X.4QR r2 = (X.AnonymousClass4QR) r2
            X.10G r0 = r5.A00
            X.00S r0 = r0.A0n
            X.00H r0 = X.C000200d.A00(r0)
            com.whatsapp.biz.viewmodel.BusinessDetailsViewModel r1 = new com.whatsapp.biz.viewmodel.BusinessDetailsViewModel
            r1.<init>(r4, r2, r3, r0)
            return r1
        L_0x06c1:
            X.10E r1 = r0.A00
            X.00S r0 = r1.AC1
            java.lang.Object r2 = r0.get()
            X.10I r2 = (X.AnonymousClass10I) r2
            X.10G r0 = r1.A00
            X.00S r0 = r0.A7J
            java.lang.Object r0 = r0.get()
            X.9a5 r0 = (X.AnonymousClass9a5) r0
            com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel r1 = new com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel
            r1.<init>(r0, r2)
            return r1
        L_0x06e1:
            X.10E r1 = r0.A00
            X.00V r0 = r1.Ao9
            android.app.Application r2 = X.AnonymousClass0YX.A00(r0)
            X.10G r0 = r1.A00
            X.00S r0 = r0.A7I
            java.lang.Object r0 = r0.get()
            X.0IN r0 = (X.AnonymousClass0IN) r0
            com.whatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel r1 = new com.whatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel
            r1.<init>(r2, r0)
            return r1
        L_0x06ff:
            X.10E r2 = r0.A00
            X.00V r1 = r2.Ao9
            android.app.Application r7 = X.AnonymousClass0YX.A00(r1)
            X.00S r1 = r2.A4b
            java.lang.Object r6 = r1.get()
            X.1KB r6 = (X.AnonymousClass1KB) r6
            X.00S r1 = r2.AC1
            java.lang.Object r5 = r1.get()
            X.10I r5 = (X.AnonymousClass10I) r5
            X.00S r1 = r2.ABl
            java.lang.Object r4 = r1.get()
            X.0z4 r4 = (X.C19830z4) r4
            X.00S r1 = r2.AG6
            java.lang.Object r3 = r1.get()
            X.1nU r3 = (X.C36191nU) r3
            X.00S r1 = r2.AG7
            java.lang.Object r2 = r1.get()
            X.1nV r2 = (X.C36201nV) r2
            X.1pR r0 = r0.A01
            X.7LR r13 = r0.A1n()
            X.7LQ r12 = r0.A1l()
            X.7LS r14 = r0.A1p()
            com.whatsapp.report.BusinessActivityReportViewModel r1 = new com.whatsapp.report.BusinessActivityReportViewModel
            r15 = r5
            r8 = r6
            r9 = r4
            r10 = r3
            r11 = r2
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x0755:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A63
            java.lang.Object r7 = r0.get()
            X.11S r7 = (X.AnonymousClass11S) r7
            X.00S r0 = r1.AC1
            java.lang.Object r6 = r0.get()
            X.10I r6 = (X.AnonymousClass10I) r6
            X.00S r0 = r1.ABA
            java.lang.Object r5 = r0.get()
            X.1iW r5 = (X.C33251iW) r5
            X.00S r0 = r1.A94
            java.lang.Object r4 = r0.get()
            X.1KH r4 = (X.AnonymousClass1KH) r4
            X.00S r0 = r1.A80
            java.lang.Object r3 = r0.get()
            X.1KI r3 = (X.AnonymousClass1KI) r3
            X.00S r0 = r1.AcC
            java.lang.Object r2 = r0.get()
            X.2Kz r2 = (X.C48052Kz) r2
            X.10G r0 = r1.A00
            X.00S r0 = r0.A0V
            java.lang.Object r0 = r0.get()
            X.BD4 r0 = (X.BD4) r0
            com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel r1 = new com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel
            r11 = r0
            r12 = r6
            r6 = r7
            r7 = r5
            r8 = r3
            r9 = r4
            r10 = r2
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x07af:
            X.10E r10 = r0.A00
            X.00S r1 = r10.A4b
            java.lang.Object r9 = r1.get()
            X.1KB r9 = (X.AnonymousClass1KB) r9
            X.00S r1 = r10.AC1
            java.lang.Object r8 = r1.get()
            X.10I r8 = (X.AnonymousClass10I) r8
            X.00S r1 = r10.A94
            java.lang.Object r7 = r1.get()
            X.1KH r7 = (X.AnonymousClass1KH) r7
            X.00S r1 = r10.A8J
            java.lang.Object r6 = r1.get()
            X.1QS r6 = (X.AnonymousClass1QS) r6
            X.00S r1 = r10.A89
            java.lang.Object r5 = r1.get()
            X.1QD r5 = (X.AnonymousClass1QD) r5
            X.10G r2 = r10.A00
            X.00S r1 = r2.A0V
            java.lang.Object r4 = r1.get()
            X.BD4 r4 = (X.BD4) r4
            X.00S r1 = r10.AcC
            java.lang.Object r3 = r1.get()
            X.2Kz r3 = (X.C48052Kz) r3
            X.8zc r13 = r2.A8P()
            X.00S r1 = r2.A7B
            java.lang.Object r2 = r1.get()
            X.A5Y r2 = (X.A5Y) r2
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A0u
            X.00H r17 = X.C000200d.A00(r0)
            X.00S r0 = r10.AcU
            X.00H r18 = X.C000200d.A00(r0)
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r1 = new com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel
            r14 = r4
            r15 = r2
            r16 = r8
            r8 = r9
            r9 = r7
            r10 = r3
            r11 = r5
            r12 = r6
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L_0x082b:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A6N
            X.00H r9 = X.C000200d.A00(r0)
            X.10G r0 = r1.A00
            X.00S r0 = r0.AEZ
            java.lang.Object r4 = r0.get()
            X.A2C r4 = (X.A2C) r4
            X.00S r0 = r1.A04
            java.lang.Object r3 = r0.get()
            X.0ve r3 = (X.C18030ve) r3
            X.00S r0 = r1.AC1
            java.lang.Object r2 = r0.get()
            X.10I r2 = (X.AnonymousClass10I) r2
            X.00S r0 = r1.ABe
            java.lang.Object r0 = r0.get()
            X.1Ln r0 = (X.C24751Ln) r0
            com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel r1 = new com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel
            r5 = r0
            r6 = r3
            r7 = r4
            r8 = r2
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            return r1
        L_0x086c:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A4b
            java.lang.Object r4 = r0.get()
            X.1KB r4 = (X.AnonymousClass1KB) r4
            X.00S r0 = r1.A6N
            X.00H r7 = X.C000200d.A00(r0)
            X.00S r0 = r1.A89
            java.lang.Object r3 = r0.get()
            X.1QD r3 = (X.AnonymousClass1QD) r3
            X.00S r0 = r1.ABl
            java.lang.Object r2 = r0.get()
            X.0z4 r2 = (X.C19830z4) r2
            X.00S r0 = r1.A84
            X.00H r8 = X.C000200d.A00(r0)
            com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel r1 = new com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel
            r5 = r2
            r6 = r3
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        L_0x08a5:
            X.10E r7 = r0.A00
            X.00S r0 = r7.A6N
            X.00H r13 = X.C000200d.A00(r0)
            X.10G r1 = r7.A00
            X.00S r0 = r1.A6y
            java.lang.Object r6 = r0.get()
            X.AXR r6 = (X.AXR) r6
            X.00S r0 = r7.A8E
            java.lang.Object r5 = r0.get()
            X.1ex r5 = (X.C31061ex) r5
            X.00S r0 = r1.AEZ
            java.lang.Object r4 = r0.get()
            X.A2C r4 = (X.A2C) r4
            X.00S r0 = r7.A04
            java.lang.Object r3 = r0.get()
            X.0ve r3 = (X.C18030ve) r3
            X.00S r0 = r7.AC1
            java.lang.Object r2 = r0.get()
            X.10I r2 = (X.AnonymousClass10I) r2
            X.00S r0 = r7.ABe
            java.lang.Object r0 = r0.get()
            X.1Ln r0 = (X.C24751Ln) r0
            com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel r1 = new com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel
            r12 = r2
            r7 = r0
            r8 = r3
            r9 = r6
            r10 = r5
            r11 = r4
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r1
        L_0x08fc:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A04
            java.lang.Object r7 = r0.get()
            X.0ve r7 = (X.C18030ve) r7
            X.00S r0 = r1.AC1
            java.lang.Object r6 = r0.get()
            X.10I r6 = (X.AnonymousClass10I) r6
            X.00S r0 = r1.ABe
            java.lang.Object r5 = r0.get()
            X.1Ln r5 = (X.C24751Ln) r5
            X.00S r0 = r1.A6N
            java.lang.Object r4 = r0.get()
            X.1OZ r4 = (X.AnonymousClass1OZ) r4
            X.00S r0 = r1.AAp
            java.lang.Object r3 = r0.get()
            X.11C r3 = (X.AnonymousClass11C) r3
            X.10G r0 = r1.A00
            X.00S r0 = r0.A0V
            java.lang.Object r2 = r0.get()
            X.BD4 r2 = (X.BD4) r2
            X.00S r0 = r1.An8
            java.lang.Object r0 = r0.get()
            X.9lB r0 = (X.C190579lB) r0
            com.whatsapp.payments.ui.viewmodel.BrazilGetPixInfoViewModel r1 = new com.whatsapp.payments.ui.viewmodel.BrazilGetPixInfoViewModel
            r13 = r2
            r14 = r6
            r8 = r3
            r9 = r5
            r10 = r7
            r11 = r0
            r12 = r4
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x0956:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A8E
            java.lang.Object r3 = r0.get()
            X.1ex r3 = (X.C31061ex) r3
            X.00S r0 = r1.A6H
            java.lang.Object r2 = r0.get()
            X.1ey r2 = (X.C31071ey) r2
            X.00S r0 = r1.A84
            X.00H r0 = X.C000200d.A00(r0)
            X.9dc r1 = new X.9dc
            r1.<init>(r3, r2, r0)
            return r1
        L_0x097a:
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A0u
            X.00H r0 = X.C000200d.A00(r0)
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixSelectionViewModel r1 = new com.whatsapp.payments.ui.viewmodel.BrazilAddPixSelectionViewModel
            r1.<init>(r0)
            return r1
        L_0x098a:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A4b
            java.lang.Object r9 = r0.get()
            X.1KB r9 = (X.AnonymousClass1KB) r9
            X.00S r0 = r1.A6N
            X.00H r17 = X.C000200d.A00(r0)
            X.00S r0 = r1.A8J
            java.lang.Object r8 = r0.get()
            X.1QS r8 = (X.AnonymousClass1QS) r8
            X.00S r0 = r1.A81
            java.lang.Object r7 = r0.get()
            X.1ek r7 = (X.C30931ek) r7
            X.00S r0 = r1.A89
            java.lang.Object r6 = r0.get()
            X.1QD r6 = (X.AnonymousClass1QD) r6
            X.10G r10 = r1.A00
            X.00S r0 = r10.AEm
            X.00H r18 = X.C000200d.A00(r0)
            X.00S r0 = r1.A8E
            java.lang.Object r5 = r0.get()
            X.1ex r5 = (X.C31061ex) r5
            X.00S r0 = r1.AcC
            java.lang.Object r4 = r0.get()
            X.2Kz r4 = (X.C48052Kz) r4
            X.00S r0 = r1.A6H
            java.lang.Object r3 = r0.get()
            X.1ey r3 = (X.C31071ey) r3
            X.00S r0 = r10.A0V
            java.lang.Object r2 = r0.get()
            X.BD4 r2 = (X.BD4) r2
            X.00S r0 = r10.AEl
            X.00H r19 = X.C000200d.A00(r0)
            X.00S r0 = r1.AcU
            X.00H r20 = X.C000200d.A00(r0)
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r1 = new com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel
            r14 = r2
            r15 = r3
            r16 = r7
            r10 = r4
            r11 = r6
            r12 = r5
            r13 = r8
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0a0f:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A1R
            java.lang.Object r2 = r0.get()
            X.8yP r2 = (X.C175258yP) r2
            X.00S r0 = r1.AAp
            java.lang.Object r0 = r0.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r1 = new com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel
            r1.<init>(r2, r0)
            return r1
        L_0x0a2b:
            X.10E r1 = r0.A00
            X.00S r0 = r1.AC1
            java.lang.Object r5 = r0.get()
            X.10I r5 = (X.AnonymousClass10I) r5
            X.00S r0 = r1.A9b
            java.lang.Object r4 = r0.get()
            X.1NK r4 = (X.AnonymousClass1NK) r4
            X.00S r0 = r1.ABA
            java.lang.Object r3 = r0.get()
            X.1iW r3 = (X.C33251iW) r3
            X.00S r0 = r1.A6Y
            java.lang.Object r2 = r0.get()
            X.1Lg r2 = (X.C24681Lg) r2
            X.00S r0 = r1.A19
            X.00H r10 = X.C000200d.A00(r0)
            com.whatsapp.bot.prompts.BonsaiPromptsViewModel r1 = new com.whatsapp.bot.prompts.BonsaiPromptsViewModel
            r6 = r3
            r7 = r2
            r8 = r4
            r9 = r5
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        L_0x0a68:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A04
            java.lang.Object r4 = r0.get()
            X.0ve r4 = (X.C18030ve) r4
            X.00S r0 = r1.A63
            java.lang.Object r3 = r0.get()
            X.11S r3 = (X.AnonymousClass11S) r3
            X.00S r0 = r1.AC1
            java.lang.Object r2 = r0.get()
            X.10I r2 = (X.AnonymousClass10I) r2
            X.00S r0 = r1.A9B
            java.lang.Object r0 = r0.get()
            X.18K r0 = (X.AnonymousClass18K) r0
            X.2ps r1 = new X.2ps
            r1.<init>(r3, r4, r0, r2)
            return r1
        L_0x0a98:
            X.10E r1 = r0.A00
            X.00V r2 = r1.Ao9
            android.app.Application r11 = X.AnonymousClass0YX.A00(r2)
            X.00S r2 = r1.AAv
            java.lang.Object r9 = r2.get()
            X.11P r9 = (X.AnonymousClass11P) r9
            X.00S r2 = r1.A04
            java.lang.Object r8 = r2.get()
            X.0ve r8 = (X.C18030ve) r8
            X.00S r2 = r1.A4b
            java.lang.Object r7 = r2.get()
            X.1KB r7 = (X.AnonymousClass1KB) r7
            X.00S r2 = r1.AC1
            java.lang.Object r6 = r2.get()
            X.10I r6 = (X.AnonymousClass10I) r6
            X.00S r2 = r1.A7q
            X.00H r21 = X.C000200d.A00(r2)
            X.00S r2 = r1.ABA
            java.lang.Object r5 = r2.get()
            X.1iW r5 = (X.C33251iW) r5
            X.00S r2 = r1.A90
            java.lang.Object r4 = r2.get()
            X.12L r4 = (X.AnonymousClass12L) r4
            X.00S r2 = r1.A2f
            java.lang.Object r3 = r2.get()
            X.1M9 r3 = (X.AnonymousClass1M9) r3
            X.00S r2 = r1.A5f
            java.lang.Object r2 = r2.get()
            X.1R3 r2 = (X.AnonymousClass1R3) r2
            X.00S r10 = r1.A0x
            X.00H r22 = X.C000200d.A00(r10)
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A0j
            X.00H r23 = X.C000200d.A00(r0)
            X.10G r0 = r1.A00
            X.00S r0 = r0.AHR
            java.lang.Object r0 = r0.get()
            X.6uY r0 = (X.C136876uY) r0
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel r1 = new com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel
            r16 = r9
            r17 = r2
            r18 = r8
            r19 = r4
            r20 = r6
            r12 = r7
            r13 = r5
            r14 = r3
            r15 = r0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        L_0x0b2f:
            X.6b6 r1 = new X.6b6
            r1.<init>(r0)
            return r1
        L_0x0b35:
            X.6b5 r1 = new X.6b5
            r1.<init>(r0)
            return r1
        L_0x0b3b:
            X.6bE r1 = new X.6bE
            r1.<init>(r0)
            return r1
        L_0x0b41:
            X.10E r7 = r0.A00
            X.00S r1 = r7.AC1
            java.lang.Object r6 = r1.get()
            X.10I r6 = (X.AnonymousClass10I) r6
            X.1pR r1 = r0.A01
            X.00S r0 = r1.A3I
            java.lang.Object r5 = r0.get()
            X.6bE r5 = (X.C125536bE) r5
            X.00S r0 = r7.ATW
            java.lang.Object r4 = r0.get()
            X.1nT r4 = (X.C36181nT) r4
            X.00S r0 = r1.A2R
            java.lang.Object r3 = r0.get()
            X.6b5 r3 = (X.C125446b5) r3
            X.00S r0 = r1.A2S
            java.lang.Object r2 = r0.get()
            X.6b6 r2 = (X.C125456b6) r2
            X.00S r0 = r7.AG6
            java.lang.Object r0 = r0.get()
            X.1nU r0 = (X.C36191nU) r0
            com.whatsapp.report.activity.banreport.BanReportViewModel r1 = new com.whatsapp.report.activity.banreport.BanReportViewModel
            r11 = r6
            r6 = r3
            r7 = r2
            r8 = r5
            r9 = r4
            r10 = r0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r1
        L_0x0b8e:
            X.10E r8 = r0.A00
            X.00S r0 = r8.AEP
            java.lang.Object r7 = r0.get()
            X.6u2 r7 = (X.C136576u2) r7
            X.10G r1 = r8.A00
            X.00S r0 = r1.A4S
            java.lang.Object r6 = r0.get()
            X.6mP r6 = (X.C132216mP) r6
            X.00S r0 = r1.A5B
            java.lang.Object r5 = r0.get()
            X.1LC r5 = (X.AnonymousClass1LC) r5
            X.00S r0 = r8.A4I
            java.lang.Object r4 = r0.get()
            X.129 r4 = (X.AnonymousClass129) r4
            X.00S r0 = r8.AEO
            java.lang.Object r3 = r0.get()
            X.71O r3 = (X.AnonymousClass71O) r3
            X.00S r0 = r8.A9T
            java.lang.Object r2 = r0.get()
            X.1jT r2 = (X.C33841jT) r2
            X.00S r0 = r8.A9A
            java.lang.Object r0 = r0.get()
            X.1Vn r0 = (X.C27301Vn) r0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r1 = new com.whatsapp.userban.ui.viewmodel.BanAppealViewModel
            r11 = r7
            r12 = r3
            r7 = r5
            r8 = r0
            r9 = r2
            r10 = r4
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x0be7:
            r2 = 21
            goto L_0x0cfe
        L_0x0beb:
            r2 = 4
            goto L_0x0d05
        L_0x0bee:
            X.10E r0 = r0.A00
            X.00S r0 = r0.A0V
            X.00H r0 = X.C000200d.A00(r0)
            X.66s r1 = new X.66s
            r1.<init>(r0)
            return r1
        L_0x0bfe:
            X.2ZP r1 = new X.2ZP
            r1.<init>(r0)
            return r1
        L_0x0c04:
            X.1pR r1 = r0.A01
            X.00S r0 = r1.A3G
            java.lang.Object r2 = r0.get()
            X.2ZP r2 = (X.AnonymousClass2ZP) r2
            X.00S r0 = r1.A3H
            java.lang.Object r0 = r0.get()
            X.87k r0 = (X.C1601687k) r0
            X.2d3 r1 = new X.2d3
            r1.<init>(r2, r0)
            return r1
        L_0x0c20:
            X.10E r5 = r0.A00
            X.00S r1 = r5.A04
            java.lang.Object r4 = r1.get()
            X.0ve r4 = (X.C18030ve) r4
            X.00S r1 = r5.A4b
            java.lang.Object r3 = r1.get()
            X.1KB r3 = (X.AnonymousClass1KB) r3
            X.00S r1 = r5.AC1
            java.lang.Object r2 = r1.get()
            X.10I r2 = (X.AnonymousClass10I) r2
            X.00S r1 = r5.ADv
            X.00H r6 = X.C000200d.A00(r1)
            X.00S r1 = r5.ADu
            X.00H r7 = X.C000200d.A00(r1)
            X.00S r1 = r5.ADf
            X.00H r8 = X.C000200d.A00(r1)
            X.1pR r0 = r0.A01
            X.00S r9 = r0.A0Y
            X.6xL r1 = new X.6xL
            r5 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r1
        L_0x0c66:
            X.10E r0 = r0.A00
            X.00S r0 = r0.ABY
            java.lang.Object r0 = r0.get()
            X.118 r0 = (X.AnonymousClass118) r0
            X.6w4 r1 = new X.6w4
            r1.<init>(r0)
            return r1
        L_0x0c78:
            X.10E r2 = r0.A00
            X.00S r1 = r2.A4b
            java.lang.Object r7 = r1.get()
            X.1KB r7 = (X.AnonymousClass1KB) r7
            X.00S r1 = r2.A63
            java.lang.Object r6 = r1.get()
            X.11S r6 = (X.AnonymousClass11S) r6
            X.00S r1 = r2.AC1
            java.lang.Object r5 = r1.get()
            X.10I r5 = (X.AnonymousClass10I) r5
            X.00S r1 = r2.A0V
            X.00H r11 = X.C000200d.A00(r1)
            X.00S r1 = r2.Ae9
            java.lang.Object r4 = r1.get()
            X.1Up r4 = (X.C27071Up) r4
            X.00S r1 = r2.ADn
            X.00H r12 = X.C000200d.A00(r1)
            X.00S r1 = r2.A0R
            X.00H r13 = X.C000200d.A00(r1)
            X.00S r1 = r2.A9E
            java.lang.Object r3 = r1.get()
            X.0wl r3 = (X.C18600wl) r3
            X.00S r1 = r2.ADu
            X.00H r14 = X.C000200d.A00(r1)
            X.00S r1 = r2.A9C
            java.lang.Object r2 = r1.get()
            X.1OX r2 = (X.AnonymousClass1OX) r2
            X.1pR r1 = r0.A01
            X.00S r0 = r1.A0c
            X.00H r15 = X.C000200d.A00(r0)
            X.00S r0 = r1.A0d
            X.00H r16 = X.C000200d.A00(r0)
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r1 = new com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel
            r18 = r2
            r17 = r3
            r8 = r6
            r9 = r4
            r10 = r5
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L_0x0cf6:
            X.2UU r1 = new X.2UU
            r1.<init>()
            return r1
        L_0x0cfc:
            r2 = 20
        L_0x0cfe:
            X.8t4 r1 = new X.8t4
            r1.<init>(r0, r2)
            return r1
        L_0x0d04:
            r2 = 3
        L_0x0d05:
            X.36Y r1 = new X.36Y
            r1.<init>(r0, r2)
            return r1
        L_0x0d0b:
            X.10E r0 = r0.A00
            X.00S r0 = r0.A0V
            X.00H r0 = X.C000200d.A00(r0)
            X.66r r1 = new X.66r
            r1.<init>(r0)
            return r1
        L_0x0d1b:
            X.6b7 r1 = new X.6b7
            r1.<init>(r0)
            return r1
        L_0x0d21:
            X.1pR r1 = r0.A01
            X.00S r0 = r1.A2l
            java.lang.Object r2 = r0.get()
            X.6b7 r2 = (X.C125466b7) r2
            X.00S r0 = r1.A36
            java.lang.Object r0 = r0.get()
            X.87k r0 = (X.C1601687k) r0
            X.6ee r1 = new X.6ee
            r1.<init>(r2, r0)
            return r1
        L_0x0d3d:
            X.10E r4 = r0.A00
            X.00S r1 = r4.A4b
            java.lang.Object r3 = r1.get()
            X.1KB r3 = (X.AnonymousClass1KB) r3
            X.00S r1 = r4.AC1
            java.lang.Object r2 = r1.get()
            X.10I r2 = (X.AnonymousClass10I) r2
            X.00S r1 = r4.ADv
            X.00H r5 = X.C000200d.A00(r1)
            X.00S r1 = r4.ADf
            X.00H r6 = X.C000200d.A00(r1)
            X.1pR r0 = r0.A01
            X.00S r8 = r0.A0X
            X.00S r0 = r0.A0a
            X.00H r7 = X.C000200d.A00(r0)
            X.6xE r1 = new X.6xE
            r4 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0d79:
            X.1pR r3 = r0.A01
            X.00S r1 = r3.A0V
            java.lang.Object r2 = r1.get()
            X.4OC r2 = (X.AnonymousClass4OC) r2
            X.10E r1 = r0.A00
            X.00S r0 = r1.A0V
            X.00H r4 = X.C000200d.A00(r0)
            X.00S r0 = r1.A0W
            X.00H r5 = X.C000200d.A00(r0)
            X.00S r0 = r1.A0R
            X.00H r6 = X.C000200d.A00(r0)
            X.00S r0 = r3.A0b
            X.00H r7 = X.C000200d.A00(r0)
            X.00S r0 = r1.ADv
            X.00H r8 = X.C000200d.A00(r0)
            X.1Ho r9 = X.C27011Uj.A00()
            com.whatsapp.avatar.home.AvatarHomeViewModel r1 = new com.whatsapp.avatar.home.AvatarHomeViewModel
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r1
        L_0x0dbb:
            X.2ZO r1 = new X.2ZO
            r1.<init>(r0)
            return r1
        L_0x0dc1:
            X.10E r5 = r0.A00
            X.10G r1 = r5.A00
            X.00S r1 = r1.AFk
            java.lang.Object r4 = r1.get()
            X.6jw r4 = (X.C130746jw) r4
            X.1pR r0 = r0.A01
            X.6eh r7 = r0.A1M()
            X.00S r0 = r5.AE8
            java.lang.Object r3 = r0.get()
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r3 = (com.whatsapp.productinfra.avatar.data.AvatarStickersRepository) r3
            X.00S r0 = r5.AED
            java.lang.Object r2 = r0.get()
            X.6uQ r2 = (X.C136796uQ) r2
            X.00S r0 = r5.A0Y
            java.lang.Object r0 = r0.get()
            X.6y1 r0 = (X.C138986y1) r0
            X.6jG r1 = new X.6jG
            r5 = r3
            r6 = r0
            r8 = r2
            r9 = r4
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            return r1
        L_0x0e00:
            X.10E r2 = r0.A00
            X.00S r0 = r2.A0V
            X.00H r6 = X.C000200d.A00(r0)
            X.00S r0 = r2.AEw
            java.lang.Object r4 = r0.get()
            X.6jj r4 = (X.C130616jj) r4
            X.10G r1 = r2.A00
            X.00S r0 = r1.AFk
            java.lang.Object r3 = r0.get()
            X.6jw r3 = (X.C130746jw) r3
            X.00S r0 = r2.ADu
            X.00H r7 = X.C000200d.A00(r0)
            X.00S r0 = r2.AE8
            X.00H r8 = X.C000200d.A00(r0)
            X.00S r0 = r2.A9F
            java.lang.Object r2 = r0.get()
            X.0wl r2 = (X.C18600wl) r2
            X.00S r0 = r1.A6T
            X.00H r9 = X.C000200d.A00(r0)
            X.1Ho r11 = X.C27011Uj.A00()
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r1 = new com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers
            r10 = r2
            r5 = r3
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L_0x0e51:
            X.10E r1 = r0.A00
            X.00S r0 = r1.ADn
            X.00H r2 = X.C000200d.A00(r0)
            X.00S r0 = r1.A9F
            java.lang.Object r0 = r0.get()
            X.0wl r0 = (X.C18600wl) r0
            X.4OC r1 = new X.4OC
            r1.<init>(r2, r0)
            return r1
        L_0x0e6b:
            X.10E r1 = r0.A00
            X.00S r2 = r1.A0V
            X.00H r11 = X.C000200d.A00(r2)
            X.00S r2 = r1.AAS
            java.lang.Object r4 = r2.get()
            X.1SB r4 = (X.AnonymousClass1SB) r4
            X.1pR r6 = r0.A01
            X.00S r0 = r6.A0V
            X.00H r12 = X.C000200d.A00(r0)
            X.10G r7 = r1.A00
            X.00S r0 = r7.AHW
            java.lang.Object r5 = r0.get()
            X.6xU r5 = (X.C138666xU) r5
            X.00S r0 = r7.AGS
            X.00H r13 = X.C000200d.A00(r0)
            X.00S r0 = r7.AFk
            java.lang.Object r3 = r0.get()
            X.6jw r3 = (X.C130746jw) r3
            X.00S r0 = r1.ADx
            java.lang.Object r2 = r0.get()
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r2 = (com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration) r2
            X.00S r0 = r6.A02
            X.00H r14 = X.C000200d.A00(r0)
            X.00S r0 = r1.A0R
            X.00H r15 = X.C000200d.A00(r0)
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r6 = r6.A17()
            X.00S r0 = r1.AE3
            X.00H r16 = X.C000200d.A00(r0)
            X.00S r0 = r7.A1h
            X.00H r17 = X.C000200d.A00(r0)
            X.00S r0 = r1.A0Y
            X.00H r18 = X.C000200d.A00(r0)
            X.1Ho r19 = X.C27011Uj.A00()
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r1 = new com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel
            r7 = r2
            r8 = r4
            r9 = r3
            r10 = r5
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x0eee:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A0V
            X.00H r2 = X.C000200d.A00(r0)
            X.00S r0 = r1.ABh
            X.00H r0 = X.C000200d.A00(r0)
            com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester r1 = new com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester
            r1.<init>(r2, r0)
            return r1
        L_0x0f06:
            X.10E r3 = r0.A00
            X.00S r1 = r3.A04
            java.lang.Object r2 = r1.get()
            X.0ve r2 = (X.C18030ve) r2
            X.1Ho r8 = X.C27011Uj.A00()
            X.00S r1 = r3.ADi
            X.00H r4 = X.C000200d.A00(r1)
            X.00S r1 = r3.ADu
            X.00H r5 = X.C000200d.A00(r1)
            X.00S r1 = r3.ADf
            X.00H r6 = X.C000200d.A00(r1)
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A0S
            X.00H r7 = X.C000200d.A00(r0)
            com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository r1 = new com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0f40:
            X.10E r2 = r0.A00
            X.00S r1 = r2.A63
            java.lang.Object r5 = r1.get()
            X.11S r5 = (X.AnonymousClass11S) r5
            X.00S r1 = r2.ABY
            java.lang.Object r4 = r1.get()
            X.118 r4 = (X.AnonymousClass118) r4
            X.00S r1 = r2.A0V
            X.00H r7 = X.C000200d.A00(r1)
            X.00S r1 = r2.A2g
            X.00H r8 = X.C000200d.A00(r1)
            X.00S r1 = r2.ADn
            X.00H r9 = X.C000200d.A00(r1)
            X.00S r1 = r2.A0R
            X.00H r10 = X.C000200d.A00(r1)
            X.00S r1 = r2.A2i
            X.00H r11 = X.C000200d.A00(r1)
            X.00S r1 = r2.A9E
            java.lang.Object r3 = r1.get()
            X.0wl r3 = (X.C18600wl) r3
            X.00S r1 = r2.ADu
            X.00H r12 = X.C000200d.A00(r1)
            X.00S r1 = r2.AaK
            X.00H r13 = X.C000200d.A00(r1)
            X.00S r1 = r2.A9C
            java.lang.Object r2 = r1.get()
            X.1OX r2 = (X.AnonymousClass1OX) r2
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A0T
            X.00H r14 = X.C000200d.A00(r0)
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r1 = new com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel
            r16 = r2
            r15 = r3
            r6 = r4
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x0fb7:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A04
            java.lang.Object r10 = r0.get()
            X.0ve r10 = (X.C18030ve) r10
            X.00S r0 = r1.A97
            java.lang.Object r9 = r0.get()
            X.1V7 r9 = (X.AnonymousClass1V7) r9
            X.00S r0 = r1.A1R
            java.lang.Object r8 = r0.get()
            X.8yP r8 = (X.C175258yP) r8
            X.00S r0 = r1.A31
            java.lang.Object r7 = r0.get()
            X.190 r7 = (X.AnonymousClass190) r7
            X.00S r0 = r1.A63
            java.lang.Object r6 = r0.get()
            X.11S r6 = (X.AnonymousClass11S) r6
            X.00S r0 = r1.ABX
            java.lang.Object r5 = r0.get()
            X.1Me r5 = (X.C24921Me) r5
            X.00S r0 = r1.A2f
            java.lang.Object r4 = r0.get()
            X.1M9 r4 = (X.AnonymousClass1M9) r4
            X.00S r0 = r1.A4t
            java.lang.Object r3 = r0.get()
            X.1MZ r3 = (X.AnonymousClass1MZ) r3
            X.00S r0 = r1.AAp
            java.lang.Object r2 = r0.get()
            X.11C r2 = (X.AnonymousClass11C) r2
            X.00S r0 = r1.A1e
            java.lang.Object r0 = r0.get()
            X.1V9 r0 = (X.AnonymousClass1V9) r0
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = new com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel
            r15 = r4
            r16 = r5
            r17 = r2
            r18 = r3
            r19 = r10
            r10 = r7
            r11 = r6
            r12 = r8
            r13 = r0
            r14 = r9
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x1032:
            X.10E r1 = r0.A00
            X.00S r0 = r1.A04
            java.lang.Object r5 = r0.get()
            X.0ve r5 = (X.C18030ve) r5
            X.00S r0 = r1.A2H
            java.lang.Object r4 = r0.get()
            X.1CJ r4 = (X.AnonymousClass1CJ) r4
            X.00S r0 = r1.ABz
            java.lang.Object r3 = r0.get()
            X.0vb r3 = (X.C18000vb) r3
            X.00S r0 = r1.ABl
            java.lang.Object r2 = r0.get()
            X.0z4 r2 = (X.C19830z4) r2
            X.00S r0 = r1.A2v
            java.lang.Object r0 = r0.get()
            X.1Nd r0 = (X.C25161Nd) r0
            com.whatsapp.conversationslist.ArchiveHeaderViewModel r1 = new com.whatsapp.conversationslist.ArchiveHeaderViewModel
            r6 = r0
            r7 = r2
            r8 = r3
            r9 = r4
            r10 = r5
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        L_0x1072:
            X.10E r0 = r0.A00
            X.00S r0 = r0.AAp
            java.lang.Object r0 = r0.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            com.whatsapp.calling.answercall.AnswerCallViewModel r1 = new com.whatsapp.calling.answercall.AnswerCallViewModel
            r1.<init>(r0)
            return r1
        L_0x1084:
            X.10E r0 = r0.A00
            X.00S r0 = r0.AFt
            java.lang.Object r0 = r0.get()
            X.1rr r0 = (X.C38771rr) r0
            X.2Zb r1 = new X.2Zb
            r1.<init>(r0)
            return r1
        L_0x1096:
            X.10E r3 = r0.A00
            X.00S r1 = r3.AAv
            X.00H r6 = X.C000200d.A00(r1)
            X.1pR r1 = r0.A01
            X.6fk r5 = r1.A0M()
            X.00S r0 = r1.A0H
            java.lang.Object r2 = r0.get()
            com.whatsapp.bot.home.AiHomeFetchService r2 = (com.whatsapp.bot.home.AiHomeFetchService) r2
            X.00S r0 = r3.A0o
            X.00H r7 = X.C000200d.A00(r0)
            X.71I r4 = r1.A0K()
            X.00S r0 = r3.A19
            X.00H r8 = X.C000200d.A00(r0)
            X.00S r0 = r3.A9E
            java.lang.Object r0 = r0.get()
            X.0wl r0 = (X.C18600wl) r0
            com.whatsapp.bot.home.AiHomeViewModel r1 = new com.whatsapp.bot.home.AiHomeViewModel
            r9 = r0
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r1
        L_0x10d7:
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A0H
            java.lang.Object r0 = r0.get()
            com.whatsapp.bot.home.AiHomeFetchService r0 = (com.whatsapp.bot.home.AiHomeFetchService) r0
            com.whatsapp.bot.home.AiHomeViewAllViewModel r1 = new com.whatsapp.bot.home.AiHomeViewAllViewModel
            r1.<init>(r0)
            return r1
        L_0x10e9:
            X.10E r1 = r0.A00
            X.00S r0 = r1.ABh
            X.00H r3 = X.C000200d.A00(r0)
            X.00S r0 = r1.A14
            X.00H r2 = X.C000200d.A00(r0)
            X.00S r0 = r1.A9E
            java.lang.Object r0 = r0.get()
            X.0wl r0 = (X.C18600wl) r0
            com.whatsapp.bot.home.AiHomeFetchService r1 = new com.whatsapp.bot.home.AiHomeFetchService
            r1.<init>(r3, r2, r0)
            return r1
        L_0x110b:
            X.10E r1 = r0.A00
            X.00S r1 = r1.A14
            java.lang.Object r2 = r1.get()
            X.1UD r2 = (X.AnonymousClass1UD) r2
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A0H
            java.lang.Object r0 = r0.get()
            com.whatsapp.bot.home.AiHomeFetchService r0 = (com.whatsapp.bot.home.AiHomeFetchService) r0
            com.whatsapp.bot.home.AiHomeSearchViewModel r1 = new com.whatsapp.bot.home.AiHomeSearchViewModel
            r1.<init>(r0, r2)
            return r1
        L_0x1129:
            X.1pR r1 = r0.A01
            com.whatsapp.bot.creation.service.AiCreationService r4 = r1.A0I()
            X.1pP r3 = r1.A7D
            X.10E r1 = r0.A00
            X.00S r0 = r1.A19
            X.00H r5 = X.C000200d.A00(r0)
            X.00S r0 = r1.A9E
            java.lang.Object r2 = r0.get()
            X.0wl r2 = (X.C18600wl) r2
            X.00S r0 = r1.AAv
            X.00H r6 = X.C000200d.A00(r0)
            com.whatsapp.bot.creation.viewmodel.AiCreationViewModel r1 = new com.whatsapp.bot.creation.viewmodel.AiCreationViewModel
            r7 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        L_0x1157:
            X.10E r1 = r0.A00
            X.00S r0 = r1.AC1
            java.lang.Object r3 = r0.get()
            X.10I r3 = (X.AnonymousClass10I) r3
            X.00V r0 = r1.Ao9
            android.app.Application r4 = X.AnonymousClass0YX.A00(r0)
            X.00S r0 = r1.AKI
            java.lang.Object r2 = r0.get()
            X.1MQ r2 = (X.AnonymousClass1MQ) r2
            X.0zB r5 = X.C19880zA.A00()
            X.00S r0 = r1.AA1
            X.00H r10 = X.C000200d.A00(r0)
            com.whatsapp.qrcode.AgentDeviceLoginViewModel r1 = new com.whatsapp.qrcode.AgentDeviceLoginViewModel
            r7 = r5
            r6 = r5
            r9 = r3
            r8 = r2
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r1
        L_0x118c:
            X.10E r1 = r0.A00
            X.00S r0 = r1.ABd
            java.lang.Object r7 = r0.get()
            X.1LU r7 = (X.AnonymousClass1LU) r7
            X.00S r0 = r1.ABY
            java.lang.Object r6 = r0.get()
            X.118 r6 = (X.AnonymousClass118) r6
            X.00S r0 = r1.A4I
            java.lang.Object r5 = r0.get()
            X.129 r5 = (X.AnonymousClass129) r5
            X.00S r0 = r1.A9E
            java.lang.Object r4 = r0.get()
            X.0wl r4 = (X.C18600wl) r4
            X.00S r0 = r1.A9C
            java.lang.Object r3 = r0.get()
            X.1OX r3 = (X.AnonymousClass1OX) r3
            X.10G r0 = r1.A00
            X.00S r0 = r0.AJ5
            java.lang.Object r2 = r0.get()
            X.8BA r2 = (X.AnonymousClass8BA) r2
            X.00S r0 = r1.A63
            java.lang.Object r0 = r0.get()
            X.11S r0 = (X.AnonymousClass11S) r0
            com.whatsapp.consent.AgeRemediationFailViewModel r1 = new com.whatsapp.consent.AgeRemediationFailViewModel
            r13 = r4
            r14 = r3
            r8 = r0
            r9 = r6
            r10 = r2
            r11 = r7
            r12 = r5
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x11e6:
            X.10E r1 = r0.A00
            X.00S r0 = r1.AAJ
            java.lang.Object r3 = r0.get()
            X.1Le r3 = (X.C24661Le) r3
            X.00S r0 = r1.AAF
            java.lang.Object r2 = r0.get()
            X.1TG r2 = (X.AnonymousClass1TG) r2
            X.10G r0 = r1.A00
            X.00S r0 = r0.A03
            X.00H r0 = X.C000200d.A00(r0)
            X.2D9 r1 = new X.2D9
            r1.<init>(r2, r3, r0)
            return r1
        L_0x120e:
            X.10E r4 = r0.A00
            X.00S r1 = r4.AC1
            java.lang.Object r3 = r1.get()
            X.10I r3 = (X.AnonymousClass10I) r3
            X.1pR r1 = r0.A01
            X.00S r12 = r1.A3c
            X.00S r0 = r4.ABl
            java.lang.Object r2 = r0.get()
            X.0z4 r2 = (X.C19830z4) r2
            X.1pP r5 = r1.A7D
            X.10G r0 = r4.A00
            X.00S r0 = r0.A03
            X.00H r11 = X.C000200d.A00(r0)
            X.0zB r6 = X.C19880zA.A00()
            com.whatsapp.status.advertise.AdvertiseViewModel r1 = new com.whatsapp.status.advertise.AdvertiseViewModel
            r8 = r6
            r7 = r6
            r10 = r3
            r9 = r2
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x1249:
            X.10E r2 = r0.A00
            X.00S r1 = r2.A04
            java.lang.Object r9 = r1.get()
            X.0ve r9 = (X.C18030ve) r9
            X.00S r1 = r2.AGb
            java.lang.Object r8 = r1.get()
            X.1TB r8 = (X.AnonymousClass1TB) r8
            X.1Ho r19 = X.C27011Uj.A00()
            X.00S r1 = r2.A2f
            java.lang.Object r7 = r1.get()
            X.1M9 r7 = (X.AnonymousClass1M9) r7
            X.00S r1 = r2.ABX
            java.lang.Object r6 = r1.get()
            X.1Me r6 = (X.C24921Me) r6
            X.00S r1 = r2.A63
            java.lang.Object r5 = r1.get()
            X.11S r5 = (X.AnonymousClass11S) r5
            X.00S r1 = r2.A1l
            java.lang.Object r4 = r1.get()
            X.1VP r4 = (X.AnonymousClass1VP) r4
            X.00S r1 = r2.A1k
            java.lang.Object r3 = r1.get()
            X.A4u r3 = (X.A4u) r3
            X.00S r1 = r2.ABY
            java.lang.Object r2 = r1.get()
            X.118 r2 = (X.AnonymousClass118) r2
            X.1pR r0 = r0.A01
            X.1pP r10 = r0.A7D
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r1 = new com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel
            r15 = r6
            r16 = r2
            r17 = r8
            r18 = r9
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r7
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x12b7:
            X.4KT r1 = new X.4KT
            r1.<init>(r0)
            return r1
        L_0x12bd:
            X.10E r1 = r0.A00
            X.00S r2 = r1.A4b
            java.lang.Object r4 = r2.get()
            X.1KB r4 = (X.AnonymousClass1KB) r4
            X.00S r2 = r1.A63
            java.lang.Object r3 = r2.get()
            X.11S r3 = (X.AnonymousClass11S) r3
            X.00S r2 = r1.A04
            X.00H r11 = X.C000200d.A00(r2)
            X.00S r2 = r1.AC1
            java.lang.Object r2 = r2.get()
            X.10I r2 = (X.AnonymousClass10I) r2
            X.00S r5 = r1.A5n
            X.00H r12 = X.C000200d.A00(r5)
            X.00S r5 = r1.A5l
            X.00H r13 = X.C000200d.A00(r5)
            X.00S r5 = r1.A5m
            X.00H r14 = X.C000200d.A00(r5)
            X.00S r5 = r1.A5d
            X.00H r15 = X.C000200d.A00(r5)
            X.1pR r0 = r0.A01
            X.00S r0 = r0.A2Q
            java.lang.Object r5 = r0.get()
            X.4KT r5 = (X.AnonymousClass4KT) r5
            X.00S r0 = r1.AJ2
            X.00H r16 = X.C000200d.A00(r0)
            X.00S r0 = r1.A2q
            X.00H r17 = X.C000200d.A00(r0)
            X.00V r0 = r1.Ao9
            android.app.Application r6 = X.AnonymousClass0YX.A00(r0)
            com.whatsapp.labelitem.view.AddToListViewModel r1 = new com.whatsapp.labelitem.view.AddToListViewModel
            r7 = r5
            r8 = r4
            r9 = r3
            r10 = r2
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37391pS.A0A():java.lang.Object");
    }

    private Object A0B() {
        int i = this.A02;
        switch (i) {
            case 100:
                AnonymousClass10E r1 = this.A00;
                return new C184269ag((AnonymousClass11S) r1.A63.get(), (C18000vb) r1.ABz.get());
            case 101:
                C37381pR r12 = this.A01;
                C37361pP A002 = r12.A7D;
                AnonymousClass6h1 A0q = r12.A0p();
                AnonymousClass10E r13 = this.A00;
                return new CallLinkViewModel(A002, AnonymousClass10E.A3a(r13), A0q, (AnonymousClass11E) r13.A2X.get());
            case 102:
                AnonymousClass10E r21 = this.A00;
                C18030ve r19 = (C18030ve) r21.A04.get();
                AnonymousClass1VP r18 = (AnonymousClass1VP) r21.A1l.get();
                AnonymousClass1TB r17 = (AnonymousClass1TB) r21.AGb.get();
                AnonymousClass1TD r16 = (AnonymousClass1TD) r21.A1m.get();
                AnonymousClass00H A003 = C000200d.A00(r21.A0E);
                AnonymousClass00H A004 = C000200d.A00(r21.A25);
                AnonymousClass00H A005 = C000200d.A00(r21.A24);
                AnonymousClass00H A006 = C000200d.A00(r21.ABd);
                AnonymousClass00H A007 = C000200d.A00(r21.A22);
                C23771Ho A008 = C27011Uj.A00();
                C37361pP A009 = this.A01.A7D;
                AnonymousClass1TB r30 = r17;
                AnonymousClass1TD r31 = r16;
                AnonymousClass1CJ r32 = (AnonymousClass1CJ) r21.A2H.get();
                AnonymousClass1MZ r33 = (AnonymousClass1MZ) r21.A4t.get();
                C27081Uq r34 = (C27081Uq) r21.A9g.get();
                C18030ve r35 = r19;
                C42211xo r36 = (C42211xo) r21.AAd.get();
                AnonymousClass1DC r37 = (AnonymousClass1DC) r21.A95.get();
                AnonymousClass1HQ r23 = (AnonymousClass1HQ) r21.A99.get();
                AnonymousClass1VP r24 = r18;
                C42571yO r25 = (C42571yO) r21.A1h.get();
                AnonymousClass1M9 r26 = (AnonymousClass1M9) r21.A2f.get();
                C24921Me r27 = (C24921Me) r21.ABX.get();
                AnonymousClass11P r28 = (AnonymousClass11P) r21.AAv.get();
                C18000vb r29 = (C18000vb) r21.ABz.get();
                return new CallLogActivityViewModel(A009, (C19880zA) r21.A7f.get(), (AnonymousClass11S) r21.A63.get(), r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, A003, A004, A005, A006, A007, C000200d.A00(r21.A00.A0p), (C18600wl) r21.A9E.get(), A008, (C18600wl) r21.A9F.get());
            case 103:
                AnonymousClass10E r14 = this.A00;
                C23771Ho A0010 = C27011Uj.A00();
                AnonymousClass00H A0011 = C000200d.A00(r14.A1h);
                A4u a4u = (A4u) r14.A1k.get();
                AnonymousClass1M9 r192 = (AnonymousClass1M9) r14.A2f.get();
                C24921Me r20 = (C24921Me) r14.ABX.get();
                AnonymousClass118 r212 = (AnonymousClass118) r14.ABY.get();
                C18000vb r22 = (C18000vb) r14.ABz.get();
                AnonymousClass1TB r232 = (AnonymousClass1TB) r14.AGb.get();
                AnonymousClass1MZ r242 = (AnonymousClass1MZ) r14.A4t.get();
                return new CallLogMessageParticipantBottomSheetViewModel(this.A01.A7D, (AnonymousClass11S) r14.A63.get(), (AnonymousClass1VP) r14.A1l.get(), a4u, r192, r20, r212, r22, r232, r242, (C18030ve) r14.A04.get(), (AnonymousClass126) r14.A4h.get(), (C24901Mc) r14.AA5.get(), A0011, A0010, (C18600wl) r14.A9F.get());
            case 104:
                AnonymousClass10E r15 = this.A00;
                A8A a8a = (A8A) r15.ABU.get();
                A4u a4u2 = (A4u) r15.A1k.get();
                return new CallRatingViewModel((AnonymousClass1VE) r15.ABT.get(), a4u2, a8a, (C18030ve) r15.A04.get());
            case 105:
                AnonymousClass10E r6 = this.A00;
                return new CallSuggestionsViewModel((C175258yP) r6.A1R.get(), (C107185Ys) this.A01.A2z.get(), (AnonymousClass11P) r6.AAv.get(), (C18030ve) r6.A04.get(), (C18600wl) r6.A9E.get());
            case 106:
                return new C66592yQ(this);
            case 107:
                return new AnonymousClass4Q1((AnonymousClass190) this.A00.A31.get());
            case AnonymousClass74N.A03 /*108*/:
                return new AnonymousClass9WC(this);
            case 109:
                return new C132226mR((AnonymousClass1TD) this.A00.A1m.get(), C000200d.A00(this.A01.A6W));
            case 110:
                AnonymousClass10E r2 = this.A00;
                return new A11((AnonymousClass1M9) r2.A2f.get(), (AnonymousClass1MW) r2.A7u.get(), C000200d.A00(this.A01.A08));
            case 111:
                return new AnonymousClass9WD(this);
            case 112:
                return new AnonymousClass9WE(this);
            case 113:
                return new AnonymousClass9WF(this);
            case 114:
                return new AnonymousClass9WG(this);
            case 115:
                return new AnonymousClass9WH(this);
            case 116:
                return new AnonymousClass9WI(this);
            case 117:
                return new AnonymousClass9WJ(this);
            case 118:
                return new AnonymousClass9WK(this);
            case 119:
                AnonymousClass10E r202 = this.A00;
                AnonymousClass11P r193 = (AnonymousClass11P) r202.AAv.get();
                C18030ve r182 = (C18030ve) r202.A04.get();
                AnonymousClass11S r172 = (AnonymousClass11S) r202.A63.get();
                AnonymousClass10I r162 = (AnonymousClass10I) r202.AC1.get();
                C37381pR r0 = this.A01;
                C37381pR r110 = r0;
                C40971vb A0o = r0.A0n();
                AnonymousClass00H A0012 = C000200d.A00(r202.AAd);
                AnonymousClass00H A0013 = C000200d.A00(r110.A1M);
                AnonymousClass00H A0014 = C000200d.A00(r202.A00.A3U);
                AnonymousClass00H A0015 = C000200d.A00(r202.A2b);
                return new CallsHistoryFragmentViewModel((C19880zA) r202.A7f.get(), r172, (AnonymousClass18O) r202.A9p.get(), r110.A05(), r110.A07(), A0o, (AnonymousClass1HR) r202.ABR.get(), (AnonymousClass1M9) r202.A2f.get(), (C24921Me) r202.ABX.get(), r193, (C18000vb) r202.ABz.get(), (AnonymousClass1TD) r202.A1m.get(), (AnonymousClass1CJ) r202.A2H.get(), (AnonymousClass1MZ) r202.A4t.get(), (C27081Uq) r202.A9g.get(), (C39521tD) r202.A4K.get(), r182, (AnonymousClass126) r202.A4h.get(), (C41001ve) r202.A4k.get(), (C24901Mc) r202.AA5.get(), (AnonymousClass1DC) r202.A95.get(), r162, A0012, A0013, A0014, A0015);
            case 120:
                return new C61472pk((AnonymousClass18K) this.A00.A9B.get());
            case 121:
                AnonymousClass10E r111 = this.A00;
                return new C36631oD((C18030ve) r111.A04.get(), (AnonymousClass18K) r111.A9B.get(), (C36561o6) r111.AmT.get());
            case 122:
                AnonymousClass10E r112 = this.A00;
                return new C36651oF((C18030ve) r112.A04.get(), (AnonymousClass18K) r112.A9B.get(), (C36561o6) r112.AmT.get());
            case 123:
                AnonymousClass10E r113 = this.A00;
                return new C36661oG((C18030ve) r113.A04.get(), (AnonymousClass18K) r113.A9B.get(), (C36561o6) r113.AmT.get());
            case 124:
                AnonymousClass10E r4 = this.A00;
                return new CatalogAllCategoryViewModel(this.A01.A0v(), (AnonymousClass10I) r4.AC1.get(), C000200d.A00(r4.A00.A0r));
            case 125:
                AnonymousClass10E r42 = this.A00;
                return new CatalogCategoryGroupsViewModel(this.A01.A0v(), (AnonymousClass10I) r42.AC1.get(), C000200d.A00(r42.A00.A0r));
            case 126:
                AnonymousClass10E r43 = this.A00;
                return new CatalogCategoryTabsViewModel(this.A01.A0v(), (AnonymousClass10I) r43.AC1.get(), C000200d.A00(r43.A00.A0r));
            case StringTreeSet.OFFSET_BASE_ENCODING /*127*/:
                AnonymousClass00H A0016 = C000200d.A00(this.A01.A1S);
                AnonymousClass10E r114 = this.A00;
                return new CatalogSearchViewModel(A0016, C000200d.A00(r114.A00.AF3), C000200d.A00(r114.A1r));
            case 128:
                return new C198309y8(this.A01.A0x());
            case 129:
                C37381pR r115 = this.A01;
                C182909We A0D = r115.A09();
                C51742Zl A10 = r115.A0z();
                AnonymousClass10E r116 = this.A00;
                AnonymousClass00H A0017 = C000200d.A00(r116.A3P);
                C18030ve r132 = (C18030ve) r116.A04.get();
                AnonymousClass10I r142 = (AnonymousClass10I) r116.AC1.get();
                return new C198689yk((AnonymousClass190) r116.A31.get(), (C26911Ty) r116.A1J.get(), (A8Q) r116.A1p.get(), A0D, A10, r132, r142, A0017, C000200d.A00(r116.A1y));
            case 130:
                AnonymousClass10E r117 = this.A00;
                return new ChatLockHelperBottomSheetViewModel((C31191fA) r117.A25.get(), C000200d.A00(r117.A24));
            case 131:
                AnonymousClass10E r143 = this.A00;
                AnonymousClass10G A11 = r143.A00;
                AnonymousClass00H A0018 = C000200d.A00(r143.A5t);
                AnonymousClass00H A0019 = C000200d.A00(r143.A0m);
                C37381pR r02 = this.A01;
                AccountTransferManager A1P = r02.A1O();
                AnonymousClass00H A0020 = C000200d.A00(A11.ADM);
                AnonymousClass00H A0021 = C000200d.A00(r143.AZe);
                C25509Ch7 A1F = r02.A1E();
                AnonymousClass00H A0022 = C000200d.A00(r143.ABc);
                AnonymousClass00H A0023 = C000200d.A00(A11.A5a);
                C175248yO r282 = (C175248yO) A11.A3g.get();
                C138296wq r272 = (C138296wq) A11.ACW.get();
                A7P a7p = (A7P) A11.A32.get();
                C198749yq r252 = (C198749yq) A11.A2f.get();
                AMY amy = (AMY) A11.A1f.get();
                C196129uV r233 = (C196129uV) r143.A6q.get();
                C18030ve r222 = (C18030ve) r143.A04.get();
                AnonymousClass19D r213 = (AnonymousClass19D) r143.A02.get();
                C18000vb r203 = (C18000vb) r143.ABz.get();
                C19830z4 r194 = (C19830z4) r143.ABl.get();
                AnonymousClass118 r183 = (AnonymousClass118) r143.ABY.get();
                AnonymousClass11C r173 = (AnonymousClass11C) r143.AAp.get();
                return new ChatTransferViewModel((AnonymousClass9WL) r02.A30.get(), (AnonymousClass9WM) r02.A31.get(), r173, r183, r194, r203, r213, r222, r233, amy, r252, a7p, r272, r282, A1F, A1P, (AnonymousClass10I) r143.AC1.get(), A0018, A0019, A0020, A0021, A0022, A0023);
            case 132:
                return new AnonymousClass9WL(this);
            case 133:
                return new AnonymousClass9WM(this);
            case 134:
                AnonymousClass10E r118 = this.A00;
                return new CoinFlipEditBottomSheetViewModel((C218617r) r118.A8v.get(), C000200d.A00(r118.A63), C000200d.A00(r118.A0V), C000200d.A00(r118.A0W), (C18600wl) r118.A9E.get());
            case 135:
                AnonymousClass10E r119 = this.A00;
                return new CoinFlipPreviewViewModel((AnonymousClass1M9) r119.A2f.get(), (C27191Vc) r119.A2i.get(), (ContactAvatarCoinFlipRepository) r119.A2c.get(), (MyAvatarCoinFlipRepository) r119.AaK.get(), (AnonymousClass4OC) this.A01.A0V.get(), (C27071Up) r119.Ae9.get(), (AnonymousClass4YE) r119.A00.AD4.get(), (C18600wl) r119.A9E.get());
            case 136:
                AnonymousClass10E r120 = this.A00;
                return new CoinFlipProfilePicViewModel((AnonymousClass11S) r120.A63.get(), (C27191Vc) r120.A2i.get(), (MyAvatarCoinFlipRepository) r120.AaK.get(), (C27021Uk) r120.A0R.get(), (C18600wl) r120.A9E.get());
            case 137:
                return new CommonViewModel(C000200d.A00(this.A00.A0y));
            case 138:
                return new CommunityAdminPickerViewModel((C24921Me) this.A00.ABX.get());
            case 139:
                AnonymousClass10E r44 = this.A00;
                AnonymousClass00H A0024 = C000200d.A00(r44.A6N);
                return new CommunitySettingsViewModel((AnonymousClass1M9) r44.A2f.get(), (AnonymousClass10I) r44.AC1.get(), A0024, C000200d.A00(r44.A2L), C000200d.A00(r44.A4m), C000200d.A00(r44.A6F), C000200d.A00(this.A01.A0L));
            case 140:
                AnonymousClass10E r45 = this.A00;
                AnonymousClass00H A0025 = C000200d.A00(r45.A2P);
                CommunityMembersDirectory A47 = AnonymousClass10E.A46(r45);
                C37381pR r121 = this.A01;
                return new C85674Oh(A47, (C18030ve) r45.A04.get(), A0025, C000200d.A00(r121.A0M), C000200d.A00(r121.A0N), (C18600wl) r45.A9E.get());
            case 141:
                return new AllowNonAdminSubGroupCreationGraphQlHandler(C000200d.A00(this.A00.ABh));
            case 142:
                return new AllowNonAdminSubGroupCreationProtocolHelper(C000200d.A00(this.A00.A6N));
            case 143:
                AnonymousClass10E r122 = this.A00;
                AnonymousClass10I r10 = (AnonymousClass10I) r122.AC1.get();
                return new CompanionRegistrationViewModel((C26721Tf) r122.A2V.get(), (AnonymousClass11E) r122.A2X.get(), (AnonymousClass11Q) r122.A2T.get(), (C18030ve) r122.A04.get(), (A15) r122.AHu.get(), r10);
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                AnonymousClass10E r123 = this.A00;
                AnonymousClass00H A0026 = C000200d.A00(r123.A1s);
                return new ComplianceInfoViewModel((A8Q) r123.A1p.get(), (AnonymousClass10I) r123.AC1.get(), A0026, C000200d.A00(r123.A1q));
            case 145:
                AnonymousClass10E r124 = this.A00;
                return new ConsentAgeBanViewModel((AnonymousClass11S) r124.A63.get(), (C128356fr) this.A01.A1h.get(), (AnonymousClass118) r124.ABY.get(), (WaConsentRepository) r124.A00.AJ5.get(), (AnonymousClass1LU) r124.ABd.get(), (AnonymousClass1CM) r124.A9V.get(), (AnonymousClass129) r124.A4I.get(), (C18600wl) r124.A9E.get(), (AnonymousClass1OX) r124.A9C.get());
            case 146:
                AnonymousClass10E r125 = this.A00;
                return new C128356fr((AnonymousClass11P) r125.AAv.get(), (AnonymousClass8BA) r125.A00.AJ5.get(), (AnonymousClass1CM) r125.A9V.get());
            case 147:
                AnonymousClass10E r126 = this.A00;
                AnonymousClass10G A112 = r126.A00;
                C143907Fg A59 = A112.A58();
                return new ConsentNavigationViewModel((AnonymousClass1KB) r126.A4b.get(), (C19830z4) r126.ABl.get(), A59, (WaConsentRepository) A112.AJ5.get(), (C37291pH) r126.A8f.get(), (C33501iv) r126.A8d.get(), (AnonymousClass1CM) r126.A9V.get(), (A8V) r126.A4U.get(), (C18600wl) r126.A9E.get(), (AnonymousClass1OX) r126.A9C.get());
            case 148:
                return new ConsumerDisclosureViewModel(C000200d.A00(this.A01.A1k));
            case 149:
                AnonymousClass10E r7 = this.A00;
                AnonymousClass1PQ r8 = (AnonymousClass1PQ) r7.AAn.get();
                AnonymousClass10I r9 = (AnonymousClass10I) r7.AC1.get();
                return new C192769ox((AnonymousClass11P) r7.AAv.get(), (C88504Zz) this.A01.A1j.get(), (AnonymousClass121) r7.A2y.get(), r8, r9, C000200d.A00(r7.AIL));
            case 150:
                AnonymousClass10E r127 = this.A00;
                AnonymousClass00H A0027 = C000200d.A00(r127.A04);
                AnonymousClass00H A0028 = C000200d.A00(r127.AIL);
                AnonymousClass00H A0029 = C000200d.A00(r127.AJY);
                AnonymousClass10I r133 = (AnonymousClass10I) r127.AC1.get();
                return new C88504Zz((C88654aI) r127.A8r.get(), (C84894Lg) r127.AJk.get(), (AnonymousClass4QB) r127.AJl.get(), (C58692l6) r127.AlJ.get(), (C85074Lz) r127.AIJ.get(), (C133736pP) r127.A2Y.get(), r133, A0027, A0028, A0029);
            case 151:
                AnonymousClass10E r128 = this.A00;
                AnonymousClass00H A0030 = C000200d.A00(r128.AFs);
                AnonymousClass00H A0031 = C000200d.A00(r128.A19);
                return new ContactPickerViewModel((AnonymousClass11E) r128.A2X.get(), (C18030ve) r128.A04.get(), A0030, A0031, (C18600wl) r128.A9E.get());
            case 152:
                AnonymousClass10E r129 = this.A00;
                AnonymousClass00H A0032 = C000200d.A00(r129.A2L);
                return new ConversationCommunityViewModel((AnonymousClass1MZ) r129.A4t.get(), (AnonymousClass126) r129.A4h.get(), (AnonymousClass10I) r129.AC1.get(), A0032);
            case 153:
                AnonymousClass10E r46 = this.A00;
                AnonymousClass00H A0033 = C000200d.A00(r46.A5n);
                AnonymousClass00H A0034 = C000200d.A00(r46.A5m);
                AnonymousClass00H A0035 = C000200d.A00(r46.AjO);
                AnonymousClass00H A0036 = C000200d.A00(r46.A59);
                return new ConversationFilterViewModel(C19880zA.A00(), (AnonymousClass118) r46.ABY.get(), A0033, A0034, A0035, A0036, C000200d.A00(this.A01.A1p), C000200d.A00(r46.AWz), C000200d.A00(r46.A2v), (C18600wl) r46.A9E.get());
            case 154:
                AnonymousClass10E r130 = this.A00;
                AnonymousClass00H A0037 = C000200d.A00(r130.A2x);
                AnonymousClass00H A0038 = C000200d.A00(r130.A4J);
                AnonymousClass00H A0039 = C000200d.A00(r130.AA1);
                C25181Nf r3 = (C25181Nf) r130.A2o.get();
                AnonymousClass00H A0040 = C000200d.A00(r130.A5n);
                C18600wl r102 = (C18600wl) r130.A9E.get();
                return new C58112kA((AnonymousClass1CJ) r130.A2H.get(), r3, (AnonymousClass1NH) r130.A5b.get(), (C18030ve) r130.A04.get(), A0037, A0038, A0039, A0040, r102);
            case 155:
                AnonymousClass10E r131 = this.A00;
                Application A0041 = AnonymousClass0YX.A00(r131.Ao9);
                C19890zB A0042 = C19880zA.A00();
                return new ConversationTitleViewModel(A0041, A0042, A0042, A0042, (AnonymousClass1CJ) r131.A2H.get(), (AnonymousClass10I) r131.AC1.get(), C000200d.A00(r131.AA1));
            case 156:
                AnonymousClass10E r103 = this.A00;
                AnonymousClass00H A0043 = C000200d.A00(r103.A0x);
                C37381pR r134 = this.A01;
                C57002iN A27 = r134.A26();
                AnonymousClass00H A0044 = C000200d.A00(r103.A8b);
                AnonymousClass00H A0045 = C000200d.A00(r134.A6X);
                AnonymousClass1M9 r104 = (AnonymousClass1M9) r103.A2f.get();
                C24671Lf r11 = (C24671Lf) r103.A2g.get();
                C19830z4 r1210 = (C19830z4) r103.ABl.get();
                C18030ve r135 = (C18030ve) r103.A04.get();
                return new ConversationsSuggestedContactsViewModel((C57892jo) r103.A00.A3r.get(), (C23651Hc) r103.ACD.get(), (C35751mk) r103.A2F.get(), r104, r11, r1210, r135, A27, r134.A28(), A0043, A0044, A0045, C000200d.A00(r134.A6V), (C18600wl) r103.A9E.get(), (C18600wl) r103.A9F.get());
            case 157:
                AnonymousClass10E r47 = this.A00;
                AnonymousClass00H A0046 = C000200d.A00(r47.AFO);
                AnonymousClass00H A0047 = C000200d.A00(r47.A25);
                AnonymousClass00H A0048 = C000200d.A00(r47.A0x);
                AnonymousClass00H A0049 = C000200d.A00(r47.AUB);
                C37381pR r03 = this.A01;
                return new SuggestionsEngine((AnonymousClass1M9) r47.A2f.get(), (C18030ve) r47.A04.get(), r03.A2A(), A0046, A0047, A0048, A0049, C000200d.A00(r03.A6U), C000200d.A00(r47.Ag3));
            case 158:
                AnonymousClass10E r136 = this.A00;
                return new SuggestedContactsFetcher((C18030ve) r136.A04.get(), C000200d.A00(r136.ABh));
            case 159:
                AnonymousClass10E r137 = this.A00;
                return new C37611pq((C18030ve) r137.A04.get(), (AnonymousClass18K) r137.A9B.get());
            case 160:
                AnonymousClass10E r138 = this.A00;
                return new CountryGatingViewModel((C18030ve) r138.A04.get(), C000200d.A00(r138.A00.ABT));
            case 161:
                AnonymousClass10E r139 = this.A00;
                C18000vb r210 = (C18000vb) r139.ABz.get();
                return new CountryListViewModel((AnonymousClass1LA) r139.AeS.get(), (AnonymousClass118) r139.ABY.get(), r210, (AnonymousClass1K3) r139.A30.get());
            case 162:
                AnonymousClass10E r140 = this.A00;
                return new CrossPostingUpdatesViewModel((C32741hg) r140.AAL.get(), C000200d.A00(r140.AC9), C000200d.A00(r140.ABv), C000200d.A00(r140.A00.AJS), C000200d.A00(r140.A34), C000200d.A00(r140.AJJ), C000200d.A00(r140.A9Q));
            case 163:
                C37381pR r211 = this.A01;
                AnonymousClass00H A0050 = C000200d.A00(r211.A1x);
                AnonymousClass00H A0051 = C000200d.A00(r211.A1w);
                AnonymousClass10E r141 = this.A00;
                return new CtwaQualitySurveyViewModel(A0050, A0051, C000200d.A00(r141.ABl), C000200d.A00(r141.A9B), C000200d.A00(r141.AAv), C000200d.A00(r141.A04), C000200d.A00(r141.A63), C000200d.A00(r141.Abj), C000200d.A00(r141.ABr), C000200d.A00(r141.AC1));
            case 164:
                AnonymousClass10E r144 = this.A00;
                return new C48132Lh((AnonymousClass190) r144.A31.get(), (C18010vc) r144.A9s.get());
            case 165:
                AnonymousClass10E r145 = this.A00;
                return new C55272fV((C18030ve) r145.A04.get(), (AnonymousClass18K) r145.A9B.get(), (C25241Nl) r145.ABr.get(), (C36561o6) r145.AmT.get(), (C18600wl) r145.A9E.get());
            case 166:
                AnonymousClass10E r146 = this.A00;
                AnonymousClass00H A0052 = C000200d.A00(r146.AmT);
                return new CtwaStatusUpsellBottomSheetTriggerViewModel(C19880zA.A00(), (AnonymousClass18K) r146.A9B.get(), (AnonymousClass10I) r146.AC1.get(), A0052);
            case 167:
                C37381pR r38 = this.A01;
                DateOfBirthCollectionViewModel A04 = A04((C131436l6) r38.A32.get(), r38.A11(), (AnonymousClass8BA) this.A00.A00.AJ5.get());
                r38.A4g(A04);
                return A04;
            case 168:
                return new C131436l6(this);
            case 169:
                C37381pR r39 = this.A01;
                DateOfBirthRemediationViewModel A05 = A05((C131446l7) r39.A33.get(), r39.A11(), (AnonymousClass8BA) this.A00.A00.AJ5.get());
                r39.A4i(A05);
                return A05;
            case 170:
                return new C131446l7(this);
            case 171:
                AnonymousClass10E r5 = this.A00;
                AnonymousClass00H A0053 = C000200d.A00(r5.A0E);
                AnonymousClass00H A0054 = C000200d.A00(r5.A2k);
                AnonymousClass00H A0055 = C000200d.A00(r5.A25);
                AnonymousClass10G A113 = r5.A00;
                AnonymousClass00H A0056 = C000200d.A00(A113.A2s);
                AnonymousClass00H A0057 = C000200d.A00(r5.ABd);
                C25585CiP A0u = this.A01.A0t();
                return new DialerViewModel((AnonymousClass11S) r5.A63.get(), (DialerHelper) A113.A98.get(), A0u, (DialerRepository) A113.A9A.get(), A0053, A0054, A0055, A0056, A0057, (C18600wl) r5.A9E.get());
            case 172:
                C37381pR r147 = this.A01;
                return new DogfooderDiagnosticsDetailReportViewModel((C87704Wq) this.A00.A00.A8q.get(), C000200d.A00(r147.A5k), C000200d.A00(r147.A41), C000200d.A00(r147.A42), C27011Uj.A00());
            case 173:
                AnonymousClass10E r148 = this.A00;
                return new ReportBugProtocolHelper(C000200d.A00(r148.A6N), C000200d.A00(r148.A00.ACF));
            case 174:
                AnonymousClass10E r149 = this.A00;
                return new C131956lw((AnonymousClass707) r149.AAc.get(), C000200d.A00(r149.A00.ACF));
            case 175:
                AnonymousClass10E r214 = this.A00;
                AnonymousClass10G A114 = r214.A00;
                AnonymousClass00H A0058 = C000200d.A00(A114.ACF);
                AnonymousClass1T6 r105 = (AnonymousClass1T6) r214.A6B.get();
                C26521Sl r1110 = (C26521Sl) r214.A69.get();
                AnonymousClass10I r1211 = (AnonymousClass10I) r214.AC1.get();
                return new C133116oC((AnonymousClass1KB) r214.A4b.get(), (AnonymousClass11C) r214.AAp.get(), (C18030ve) r214.A04.get(), r105, r1110, r1211, A0058, C000200d.A00(A114.A7H));
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                return new DogfooderDiagnosticsViewModel((C87704Wq) this.A00.A00.A8q.get());
            case 177:
                AnonymousClass10E r150 = this.A00;
                return new DosaAgeBanViewModel((AnonymousClass11S) r150.A63.get(), (AnonymousClass118) r150.ABY.get(), (DosaRepository) r150.A3W.get(), (AnonymousClass1LU) r150.ABd.get(), (AnonymousClass129) r150.A4I.get(), (C18600wl) r150.A9E.get(), (AnonymousClass1OX) r150.A9C.get());
            case 178:
                AnonymousClass10E r151 = this.A00;
                return new DosaAgeRemediationPassViewModel((DosaRepository) r151.A3W.get(), (C18600wl) r151.A9E.get());
            case 179:
                C37381pR r48 = this.A01;
                return new DosaCollectionViewModel((C131436l6) r48.A32.get(), (DosaRepository) this.A00.A3W.get(), r48.A1G());
            case 180:
                return new DosaNavigationViewModel((DosaRepository) this.A00.A3W.get());
            case 181:
                return new DosaPearPancakeViewModel((C131456l8) this.A01.A34.get(), (DosaRepository) this.A00.A3W.get());
            case 182:
                return new C131456l8(this);
            case 183:
                C37381pR r49 = this.A01;
                return new DosaRemediationViewModel((C131446l7) r49.A33.get(), (DosaRepository) this.A00.A3W.get(), r49.A1G());
            case 184:
                AnonymousClass10E r152 = this.A00;
                C1193267r r52 = (C1193267r) r152.A9P.get();
                AnonymousClass10G A115 = r152.A00;
                C1193167q r410 = (C1193167q) A115.ABP.get();
                AnonymousClass00H A0059 = C000200d.A00(A115.AGS);
                return new EmojiExpressionsViewModel((C19830z4) r152.ABl.get(), r410, r52, (AnonymousClass1KW) r152.A3d.get(), (C18030ve) r152.A04.get(), (C18010vc) r152.A9s.get(), A0059, C000200d.A00(this.A01.A2E), C000200d.A00(A115.A1h), C000200d.A00(A115.A9l), C27011Uj.A00());
            case 185:
                AnonymousClass10E r215 = this.A00;
                AnonymousClass1KW r62 = (AnonymousClass1KW) r215.A3d.get();
                C1193267r r53 = (C1193267r) r215.A9P.get();
                AnonymousClass10G A116 = r215.A00;
                C1193167q r411 = (C1193167q) A116.ABP.get();
                AnonymousClass00H A0060 = C000200d.A00(A116.A1c);
                return new C130796k1(r411, r53, r62, (C18030ve) r215.A04.get(), (C1193367s) r215.Afz.get(), (C18010vc) r215.A9s.get(), A0060, C000200d.A00(A116.A9l), C27011Uj.A00());
            case 186:
                AnonymousClass10E r92 = this.A00;
                AnonymousClass00H A0061 = C000200d.A00(r92.A6N);
                PasskeyBackupEnabler A042 = this.A01.A03();
                AnonymousClass10I r153 = (AnonymousClass10I) r92.AC1.get();
                return new EncBackupViewModel((AnonymousClass1NP) r92.A0j.get(), (AnonymousClass1NO) r92.A3e.get(), (AnonymousClass1NT) r92.A3f.get(), A042, (AnonymousClass11C) r92.AAp.get(), (C19830z4) r92.ABl.get(), (AnonymousClass18K) r92.A9B.get(), (C33841jT) r92.A9T.get(), r153, A0061);
            case 187:
                return new C688835b(this, 1);
            case 188:
                return new C688935c(this, 1);
            case 189:
                return new EnterCodeViewModel((AnonymousClass11P) this.A00.AAv.get());
            case 190:
                return new EnterPhoneNumberViewModel(this.A01.A1W());
            case 191:
                C37381pR r412 = this.A01;
                return new ExistViewModel(r412.A7D, C000200d.A00(r412.A2K), C000200d.A00(this.A00.A00.A5a));
            case 192:
                AnonymousClass10E r106 = this.A00;
                AnonymousClass10G A117 = r106.A00;
                AnonymousClass19D r107 = (AnonymousClass19D) r106.A02.get();
                AnonymousClass19F r1111 = (AnonymousClass19F) r106.A03.get();
                C139576z4 r1212 = (C139576z4) r106.A01.get();
                C26145Ct9 ct9 = (C26145Ct9) A117.A6G.get();
                AnonymousClass10I r1410 = (AnonymousClass10I) r106.AC1.get();
                return new C188719hs((AnonymousClass11P) r106.AAv.get(), (AnonymousClass118) r106.ABY.get(), (C19830z4) r106.ABl.get(), r107, r1111, r1212, ct9, r1410, C000200d.A00(A117.AEo), C000200d.A00(r106.Ag7));
            case 193:
                AnonymousClass10E r154 = this.A00;
                return new ExportMigrationViewModel((C18030ve) r154.A04.get(), (C47882Ki) r154.AZe.get());
            case 194:
                C37381pR r155 = this.A01;
                AnonymousClass10E r93 = this.A00;
                AnonymousClass10G A118 = r93.A00;
                AnonymousClass00H A0062 = C000200d.A00(r93.A0V);
                AnonymousClass00H A0063 = C000200d.A00(A118.AGS);
                AnonymousClass00H A0064 = C000200d.A00(r93.A0R);
                AnonymousClass18K r1112 = (AnonymousClass18K) r93.A9B.get();
                AnonymousClass4OC r1213 = (AnonymousClass4OC) r155.A0V.get();
                C130746jw r1310 = (C130746jw) A118.AFk.get();
                AnonymousClass71H r1411 = (AnonymousClass71H) r155.A0h.get();
                return new ExpressionsSearchViewModel((AnonymousClass11P) r93.AAv.get(), (C18000vb) r93.ABz.get(), (C18030ve) r93.A04.get(), r1112, r1213, r1310, r1411, A0062, A0063, A0064, C000200d.A00(r93.AE3), C000200d.A00(A118.A1h), C000200d.A00(r155.A2O), C27011Uj.A00());
            case 195:
                AnonymousClass71H A25 = this.A01.A24();
                AnonymousClass3BN.A00(A25);
                return A25;
            case 196:
                AnonymousClass10E r156 = this.A00;
                C27021Uk r94 = (C27021Uk) r156.A0R.get();
                return new C132766nY((AnonymousClass11S) r156.A63.get(), (C19830z4) r156.ABl.get(), (C18030ve) r156.A04.get(), r94, C27011Uj.A00());
            case 197:
                C37381pR r157 = this.A01;
                AnonymousClass10E r310 = this.A00;
                AnonymousClass10G A119 = r310.A00;
                AnonymousClass71H r195 = (AnonymousClass71H) r157.A0h.get();
                C18030ve r1214 = (C18030ve) r310.A04.get();
                AnonymousClass18K r1311 = (AnonymousClass18K) r310.A9B.get();
                C27021Uk r1412 = (C27021Uk) r310.A0R.get();
                AnonymousClass4OC r158 = (AnonymousClass4OC) r157.A0V.get();
                C136936ue r163 = (C136936ue) r310.A0V.get();
                C25271No r174 = (C25271No) r310.Ajn.get();
                C130746jw r184 = (C130746jw) A119.AFk.get();
                return new ExpressionsTrayViewModel((AnonymousClass11P) r310.AAv.get(), (A59) A119.A1h.get(), (C132766nY) r157.A2O.get(), r1214, r1311, r1412, r158, r163, r174, r184, r195, C27011Uj.A00());
            case 198:
                AnonymousClass10E r159 = this.A00;
                return new FavoriteActionViewModel((FavoriteManager) r159.A4J.get(), (C18600wl) r159.A9E.get());
            case 199:
                AnonymousClass10E r160 = this.A00;
                AnonymousClass00H A0065 = C000200d.A00(r160.ASw);
                AnonymousClass00H A0066 = C000200d.A00(r160.A4J);
                AnonymousClass00H A0067 = C000200d.A00(r160.A4K);
                AnonymousClass1M9 r108 = (AnonymousClass1M9) r160.A2f.get();
                AnonymousClass1CJ r1113 = (AnonymousClass1CJ) r160.A2H.get();
                AnonymousClass1MZ r1215 = (AnonymousClass1MZ) r160.A4t.get();
                C18030ve r1312 = (C18030ve) r160.A04.get();
                return new FavoriteCallListViewModel((C19880zA) r160.A7f.get(), (AnonymousClass11S) r160.A63.get(), (AnonymousClass1V9) r160.A1e.get(), r108, r1113, r1215, r1312, A0065, A0066, A0067, (C18600wl) r160.A9E.get(), (C18600wl) r160.A9F.get());
            default:
                throw new AssertionError(i);
        }
    }

    private Object A0C() {
        int i = this.A02;
        switch (i) {
            case 200:
                AnonymousClass10E r1 = this.A00;
                return new FavoriteListViewModel((AnonymousClass1M9) r1.A2f.get(), C000200d.A00(r1.A4J), C000200d.A00(r1.A4K), (C18600wl) r1.A9E.get());
            case 201:
                AnonymousClass10E r8 = this.A00;
                AnonymousClass00H A002 = C000200d.A00(r8.A4J);
                AnonymousClass00H A003 = C000200d.A00(r8.ASw);
                AnonymousClass11P r9 = (AnonymousClass11P) r8.AAv.get();
                AnonymousClass1MZ r10 = (AnonymousClass1MZ) r8.A4t.get();
                AnonymousClass1M9 r82 = (AnonymousClass1M9) r8.A2f.get();
                return new FavoritePickerViewModel((C107185Ys) this.A01.A2z.get(), (AnonymousClass1V9) r8.A1e.get(), r82, r9, r10, A002, A003, (C18600wl) r8.A9E.get(), (C18600wl) r8.A9F.get());
            case 202:
                AnonymousClass10E r92 = this.A00;
                AnonymousClass00H A004 = C000200d.A00(r92.A0x);
                AnonymousClass00H A005 = C000200d.A00(r92.A4t);
                C37381pR r12 = this.A01;
                FavoriteManager favoriteManager = (FavoriteManager) r92.A4J.get();
                C41901xH r93 = (C41901xH) r92.ASw.get();
                AnonymousClass1M9 r6 = (AnonymousClass1M9) r92.A2f.get();
                C24921Me r7 = (C24921Me) r92.ABX.get();
                return new FavoritesPickerViewModel((C107185Ys) r12.A2z.get(), r6, r7, (AnonymousClass11P) r92.AAv.get(), r93, favoriteManager, A004, A005, C000200d.A00(r12.A3N), (C18600wl) r92.A9E.get(), (C18600wl) r92.A9F.get());
            case 203:
                AnonymousClass10E r13 = this.A00;
                return new FavoritesChatsSuggestionManager(C000200d.A00(r13.AAv), C000200d.A00(r13.A2f), C000200d.A00(r13.A2v), C000200d.A00(r13.AUB), (C18600wl) r13.A9E.get());
            case 204:
                return new FlashCallViewModel((AnonymousClass19D) this.A00.A02.get());
            case 205:
                return new FlowsDownloadResponseViewModel(this.A01.A19(), (C18600wl) this.A00.A9E.get());
            case 206:
                AnonymousClass10E r14 = this.A00;
                AnonymousClass1PM r3 = (AnonymousClass1PM) r14.ABM.get();
                C27191Vc r2 = (C27191Vc) r14.A2i.get();
                return new FlowsFooterViewModel((AnonymousClass1M9) r14.A2f.get(), r3, r2, (C18030ve) r14.A04.get());
            case 207:
                AnonymousClass10E r15 = this.A00;
                AnonymousClass00H A006 = C000200d.A00(this.A01.A4j);
                AnonymousClass1Q5 r142 = (AnonymousClass1Q5) r15.A8O.get();
                C18030ve r122 = (C18030ve) r15.A04.get();
                WamediaManager wamediaManager = (WamediaManager) r15.ABs.get();
                AnonymousClass118 r102 = (AnonymousClass118) r15.ABY.get();
                C18000vb r11 = (C18000vb) r15.ABz.get();
                AnonymousClass11C r83 = (AnonymousClass11C) r15.AAp.get();
                return new GalleryPickerViewModel((C31191fA) r15.A25.get(), r83, (AnonymousClass11P) r15.AAv.get(), r102, r11, r122, wamediaManager, r142, A006, (C18600wl) r15.A9E.get(), (C18600wl) r15.A9F.get());
            case 208:
                AnonymousClass10E r16 = this.A00;
                C18030ve r84 = (C18030ve) r16.A04.get();
                WamediaManager wamediaManager2 = (WamediaManager) r16.ABs.get();
                return new C139176yM((AnonymousClass190) r16.A31.get(), (AnonymousClass11C) r16.AAp.get(), (C219217x) r16.ABj.get(), r84, wamediaManager2, (AnonymousClass1Q5) r16.A8O.get());
            case 209:
                AnonymousClass10E r5 = this.A00;
                return new GalleryTabsViewModel((C18030ve) r5.A04.get(), C000200d.A00(r5.ABd), C000200d.A00(this.A01.A4f), (C18600wl) r5.A9E.get());
            case 210:
                C37381pR r32 = this.A01;
                return C201110w.of(1, r32.A1w(), 0, r32.A1y());
            case 211:
                AnonymousClass10E r17 = this.A00;
                return new GalleryViewModel((AnonymousClass11P) r17.AAv.get(), (AnonymousClass1CL) r17.AZZ.get(), C000200d.A00(r17.A3w), (C18600wl) r17.A9E.get());
            case 212:
                return new GenericBkLayoutViewModelWithReload(C000200d.A00(this.A00.A0y));
            case 213:
                AnonymousClass10E r18 = this.A00;
                return new GenericBkLayoutViewModel((AnonymousClass11E) r18.A2X.get(), C000200d.A00(r18.A0y));
            case 214:
                AnonymousClass10E r19 = this.A00;
                return new GifComposerViewModel((C18600wl) r19.A9E.get(), (C18600wl) r19.A9F.get());
            case 215:
                AnonymousClass10E r4 = this.A00;
                AnonymousClass10G A11 = r4.A00;
                AnonymousClass00H A007 = C000200d.A00(A11.AGS);
                AnonymousClass00H A008 = C000200d.A00(A11.A1h);
                AnonymousClass00H A009 = C000200d.A00(r4.AUc);
                AnonymousClass00H A0010 = C000200d.A00(r4.AC1);
                return new GifExpressionsSearchViewModel((C18030ve) r4.A04.get(), (AnonymousClass18K) r4.A9B.get(), (C140126zz) A11.AFN.get(), A007, A008, A009, A0010);
            case 216:
                AnonymousClass10E r110 = this.A00;
                return new GifVideoPreviewViewModel(C000200d.A00(r110.AUc), (C18600wl) r110.A9E.get(), (C18600wl) r110.A9F.get());
            case 217:
                AnonymousClass10E r42 = this.A00;
                C196239ug r22 = (C196239ug) r42.A4d.get();
                return A02((AnonymousClass1NP) r42.A0j.get(), r22, (AnonymousClass11P) r42.AAv.get(), (C19830z4) r42.ABl.get());
            case 218:
                AnonymousClass10E r23 = this.A00;
                AnonymousClass00H A0011 = C000200d.A00(r23.A4U);
                AnonymousClass00H A0012 = C000200d.A00(r23.ATS);
                AnonymousClass00H A0013 = C000200d.A00(r23.A2b);
                AnonymousClass10G A112 = r23.A00;
                C20113A7w a7w = (C20113A7w) A112.ABj.get();
                AnonymousClass2LQ r103 = (AnonymousClass2LQ) A112.ABl.get();
                C219217x r85 = (C219217x) r23.ABj.get();
                return new GoogleMigrateImporterViewModel((AnonymousClass11E) r23.A2X.get(), (AnonymousClass118) r23.ABY.get(), r85, a7w, r103, (C33841jT) r23.A9T.get(), (C197959xY) A112.ABn.get(), A0011, A0012, A0013);
            case 219:
                return new GoogleSearchContentBottomSheetViewModel(C000200d.A00(this.A01.A3h));
            case 220:
                AnonymousClass10E r111 = this.A00;
                return new C187809gP((AnonymousClass181) r111.AA9.get(), (AnonymousClass11P) r111.AAv.get(), (AnonymousClass1KX) r111.Aml.get(), (C220418j) r111.A9d.get(), (C18600wl) r111.A9E.get());
            case 221:
                AnonymousClass10E r24 = this.A00;
                AnonymousClass1M9 r25 = (AnonymousClass1M9) r24.A2f.get();
                return new GroupCallParticipantSuggestionsViewModel((C107185Ys) this.A01.A2z.get(), r25, (AnonymousClass11P) r24.AAv.get());
            case 222:
                AnonymousClass10E r112 = this.A00;
                return new GroupCallPsaViewModel(r112.A00.A31(), (C24921Me) r112.ABX.get());
            case 223:
                AnonymousClass10E r52 = this.A00;
                C37381pR r113 = this.A01;
                return new GroupMemberSuggestionsViewModel((AnonymousClass1M9) r52.A2f.get(), C000200d.A00(r113.A3s), C000200d.A00(r113.A3k), (C18600wl) r52.A9E.get());
            case 224:
                C37381pR r26 = this.A01;
                return new GroupMemberSuggestionsManager(C000200d.A00(r26.A3r), C000200d.A00(r26.A3p), C000200d.A00(r26.A3o), C000200d.A00(r26.A3n), C000200d.A00(r26.A3q), (C18600wl) this.A00.A9E.get());
            case 225:
                return new C87554Wa((AnonymousClass18K) this.A00.A9B.get());
            case 226:
                AnonymousClass10E r27 = this.A00;
                C25161Nd r33 = (C25161Nd) r27.A2v.get();
                C37381pR r0 = this.A01;
                return new C96384nl(r33, (AnonymousClass11P) r27.AAv.get(), (AnonymousClass1MW) r27.A7u.get(), r0.A1C(), (C84964Ln) r0.A3q.get());
            case 227:
                return new C84964Ln((C18030ve) this.A00.A04.get());
            case 228:
                AnonymousClass10E r28 = this.A00;
                C25161Nd r34 = (C25161Nd) r28.A2v.get();
                C37381pR r02 = this.A01;
                return new C96374nk(r34, (AnonymousClass11P) r28.AAv.get(), r02.A1C(), (C84964Ln) r02.A3q.get());
            case 229:
                return new C96364nj(this.A01.A1C(), C000200d.A00(this.A00.AUB));
            case 230:
                AnonymousClass10E r114 = this.A00;
                return new C88474Zv((C189339iv) r114.A0K.get(), (C18030ve) r114.A04.get(), (AnonymousClass18K) r114.A9B.get(), (C52202aX) r114.A00.ABs.get());
            case 231:
                AnonymousClass10E r43 = this.A00;
                return new HistorySettingViewModel((AnonymousClass11E) r43.A2X.get(), (AnonymousClass1M9) r43.A2f.get(), (AnonymousClass1MZ) r43.A4t.get(), C000200d.A00(this.A01.A2G), C000200d.A00(r43.A4m), C000200d.A00(r43.A4u));
            case 232:
                return new EnableGroupHistoryProtocolHelper(C000200d.A00(this.A00.A6N));
            case 233:
                return new HomeViewModel(AnonymousClass0YX.A00(this.A00.Ao9));
            case 234:
                AnonymousClass10E r53 = this.A00;
                AnonymousClass10G A113 = r53.A00;
                return new ImagineMeConsentViewModel(C000200d.A00(A113.ACB), C000200d.A00(A113.ACC), C000200d.A00(A113.ACD), C000200d.A00(r53.AVc));
            case 235:
                AnonymousClass10E r62 = this.A00;
                AnonymousClass10G A114 = r62.A00;
                AnonymousClass00H A0014 = C000200d.A00(A114.ACB);
                AnonymousClass00H A0015 = C000200d.A00(A114.ACC);
                AnonymousClass00H A0016 = C000200d.A00(A114.ACD);
                AnonymousClass00H A0017 = C000200d.A00(r62.AVc);
                ImagineMeOnboardingRequester A5l = AnonymousClass10G.A5k(A114);
                C37381pR r03 = this.A01;
                AnonymousClass10I r132 = (AnonymousClass10I) r62.AC1.get();
                C192379oI r104 = (C192379oI) r62.AFi.get();
                C24681Lg r115 = (C24681Lg) r62.A6Y.get();
                C33221iT r63 = (C33221iT) r62.AKZ.get();
                return new ImagineMeOnboardingViewModel((C38731rn) r62.A6o.get(), r63, r03.A0O(), r03.A0Q(), r03.A0S(), r104, r115, A5l, r132, A0014, A0015, A0016, A0017, C000200d.A00(r62.A14));
            case 236:
                AnonymousClass10E r116 = this.A00;
                AnonymousClass10G A115 = r116.A00;
                return new ImagineMeSettingsViewModel((AnonymousClass1KB) r116.A4b.get(), (C38731rn) r116.A6o.get(), (C1408073d) r116.A11.get(), AnonymousClass10G.A5k(A115), (AnonymousClass2JU) A115.ACD.get());
            case 237:
                AnonymousClass10E r29 = this.A00;
                AnonymousClass00H A0018 = C000200d.A00(r29.A04);
                C37381pR r117 = this.A01;
                return new InAppBugReportingViewModel(A0018, C000200d.A00(r117.A40), C000200d.A00(r117.A42), C000200d.A00(r117.A5l), C000200d.A00(r29.A00.ACF));
            case 238:
                AnonymousClass10E r44 = this.A00;
                return new AnonymousClass4RM(C000500i.A00(r44.Ao9), (AnonymousClass1NM) r44.A6D.get(), (C35551mQ) r44.A3C.get(), C000200d.A00(r44.AAV), C000200d.A00(this.A01.A1K));
            case 239:
                AnonymousClass10E r118 = this.A00;
                return new C85734On((AnonymousClass1HQ) r118.A99.get(), (AnonymousClass1VE) r118.ABT.get(), (AnonymousClass11N) r118.A96.get(), (AnonymousClass1TD) r118.A1m.get());
            case 240:
                AnonymousClass10E r54 = this.A00;
                C23771Ho A0019 = C27011Uj.A00();
                C37381pR r119 = this.A01;
                C18600wl r1110 = (C18600wl) r54.A9F.get();
                return new AnonymousClass4X1(C000200d.A00(r119.A41), C000200d.A00(r119.A5k), C000200d.A00(r119.A40), C000200d.A00(r54.A00.A7H), (C18600wl) r54.A9E.get(), r1110, A0019, (AnonymousClass1OX) r54.A9C.get());
            case 241:
                AnonymousClass10E r210 = this.A00;
                AnonymousClass00H A0020 = C000200d.A00(r210.A04);
                AnonymousClass00H A0021 = C000200d.A00(r210.A63);
                C37381pR r04 = this.A01;
                return new InCallBannerViewModelV2((C175258yP) r210.A1R.get(), A0020, A0021, C000200d.A00(r04.A57), C000200d.A00(r210.A2f), C000200d.A00(r210.ABX), C000200d.A00(r04.A1G), C000200d.A00(r04.A5r), C000200d.A00(r04.A6i), C000200d.A00(r04.A6p), C000200d.A00(r04.A58), C000200d.A00(r210.ABT), C000200d.A00(r04.A6h), C000200d.A00(r04.A6o), C000200d.A00(r04.A56), C000200d.A00(r04.A5L), r210.A8t, C27011Uj.A00());
            case 242:
                AnonymousClass10E r120 = this.A00;
                return new C132246mT((AnonymousClass1M9) r120.A2f.get(), (C24921Me) r120.ABX.get(), r120.A8t);
            case 243:
                AnonymousClass10E r121 = this.A00;
                return new C133476op((C18030ve) r121.A04.get(), r121.A8t);
            case 244:
                AnonymousClass10E r123 = this.A00;
                return new C131886lp((C24921Me) r123.ABX.get(), r123.A8t);
            case 245:
                AnonymousClass10E r124 = this.A00;
                return new C132266mV((AnonymousClass1M9) r124.A2f.get(), (C24921Me) r124.ABX.get(), r124.A8t);
            case 246:
                AnonymousClass10E r125 = this.A00;
                return new C132286mX((AnonymousClass1M9) r125.A2f.get(), (C24921Me) r125.ABX.get(), r125.A8t);
            case 247:
                AnonymousClass10E r126 = this.A00;
                return new C133486oq((C18030ve) r126.A04.get(), r126.A8t);
            case 248:
                AnonymousClass10E r127 = this.A00;
                return new C132256mU((AnonymousClass1M9) r127.A2f.get(), (C24921Me) r127.ABX.get(), r127.A8t);
            case 249:
                AnonymousClass10E r128 = this.A00;
                return new C132276mW((AnonymousClass1M9) r128.A2f.get(), (C24921Me) r128.ABX.get(), r128.A8t);
            case 250:
                AnonymousClass10E r129 = this.A00;
                return new C132236mS((AnonymousClass1M9) r129.A2f.get(), (C24921Me) r129.ABX.get(), r129.A8t);
            case 251:
                AnonymousClass10E r130 = this.A00;
                return new AnonymousClass6p5((AnonymousClass1M9) r130.A2f.get(), (C24921Me) r130.ABX.get(), r130.A8t);
            case 252:
                AnonymousClass10E r72 = this.A00;
                AnonymousClass00S Axz = r72.A8t;
                C37381pR r05 = this.A01;
                C18030ve r105 = (C18030ve) r72.A04.get();
                AnonymousClass1M9 r86 = (AnonymousClass1M9) r72.A2f.get();
                C24921Me r94 = (C24921Me) r72.ABX.get();
                return new InCallBannerViewModel((AnonymousClass11S) r72.A63.get(), (AnonymousClass1VE) r72.ABT.get(), (C175258yP) r72.A1R.get(), r86, r94, r105, C000200d.A00(r05.A57), C000200d.A00(r05.A1G), C000200d.A00(r05.A5r), C000200d.A00(r05.A6i), C000200d.A00(r05.A6p), C000200d.A00(r05.A58), C000200d.A00(r05.A6h), C000200d.A00(r05.A6o), C000200d.A00(r05.A56), C000200d.A00(r05.A5L), Axz);
            case 253:
                AnonymousClass10E r131 = this.A00;
                AnonymousClass11P r162 = (AnonymousClass11P) r131.AAv.get();
                AZ6 az6 = (AZ6) r131.A5D.get();
                C184789bW r282 = (C184789bW) r131.A00.AEV.get();
                C20008A2y a2y = (C20008A2y) r131.AW4.get();
                C30901eh r30 = (C30901eh) r131.AB1.get();
                AnonymousClass10I r31 = (AnonymousClass10I) r131.AC1.get();
                AnonymousClass1QS r252 = (AnonymousClass1QS) r131.A8J.get();
                C33651jA r262 = (C33651jA) r131.A8B.get();
                AnonymousClass1QL r232 = (AnonymousClass1QL) r131.A7z.get();
                AnonymousClass1QD r242 = (AnonymousClass1QD) r131.A89.get();
                C18030ve r21 = (C18030ve) r131.A04.get();
                AXS axs = (AXS) r131.A5F.get();
                AnonymousClass1KI r192 = (AnonymousClass1KI) r131.A80.get();
                C32981i4 r20 = (C32981i4) r131.A3G.get();
                return new IndiaPaymentSettingsViewModel(r162, (C18000vb) r131.ABz.get(), (AnonymousClass1QR) r131.A8D.get(), r192, r20, r21, axs, r232, r242, r252, r262, az6, r282, a2y, r30, r31, C000200d.A00(this.A01.A5T));
            case 254:
                AnonymousClass10E r133 = this.A00;
                return new AnonymousClass2C4((C18030ve) r133.A04.get(), (AnonymousClass18K) r133.A9B.get(), (C36561o6) r133.AmT.get());
            case 255:
                AnonymousClass10E r55 = this.A00;
                Application A0022 = AnonymousClass0YX.A00(r55.Ao9);
                AZ6 az62 = (AZ6) r55.A5D.get();
                return new IndiaUpiInternationalActivationViewModel(A0022, (C18000vb) r55.ABz.get(), (A7U) r55.A5E.get(), az62, C000200d.A00(r55.A00.ACL), C000200d.A00(this.A01.A49));
            case 256:
                AnonymousClass10E r134 = this.A00;
                AnonymousClass00H A0023 = C000200d.A00(r134.A6N);
                AnonymousClass00H A0024 = C000200d.A00(r134.A00.ACL);
                return new C175608yz((A7U) r134.A5E.get(), (C31061ex) r134.A8E.get(), (C30931ek) r134.A81.get(), A0023, A0024);
            case 257:
                AnonymousClass10E r56 = this.A00;
                return new IndiaUpiInternationalValidateQrViewModel(AnonymousClass0YX.A00(r56.Ao9), (C18030ve) r56.A04.get(), (AZ6) r56.A5D.get(), C000200d.A00(this.A01.A49));
            case 258:
                AnonymousClass10E r135 = this.A00;
                return new IndiaUpiMandateHistoryViewModel((AnonymousClass1KB) r135.A4b.get(), (AnonymousClass118) r135.ABY.get(), (AnonymousClass1QR) r135.A8D.get(), (AZ6) r135.A5D.get(), (AnonymousClass10I) r135.AC1.get());
            case 259:
                AnonymousClass10E r45 = this.A00;
                return new IndiaUpiMapperLinkViewModel(AnonymousClass0YX.A00(r45.Ao9), (AnonymousClass11S) r45.A63.get(), (AXS) r45.A5F.get(), this.A01.A1I(), (C20008A2y) r45.AW4.get());
            case 260:
                return new IndiaUpiNumberSettingsViewModel((C20008A2y) this.A00.AW4.get());
            case 261:
                AnonymousClass10E r95 = this.A00;
                AnonymousClass1KB r73 = (AnonymousClass1KB) r95.A4b.get();
                AnonymousClass10I r143 = (AnonymousClass10I) r95.AC1.get();
                AnonymousClass1QS r1210 = (AnonymousClass1QS) r95.A8J.get();
                A8C a8c = (A8C) r95.A00.A2k.get();
                C18000vb r106 = (C18000vb) r95.ABz.get();
                AnonymousClass1KH r1111 = (AnonymousClass1KH) r95.A94.get();
                return new IndiaUpiPauseMandateViewModel(r73, (AnonymousClass11P) r95.AAv.get(), (AnonymousClass118) r95.ABY.get(), r106, r1111, r1210, a8c, r143, C000200d.A00(r95.A8C));
            case 262:
                AnonymousClass10E r136 = this.A00;
                AnonymousClass00H A0025 = C000200d.A00(r136.A6N);
                AnonymousClass10G A116 = r136.A00;
                AnonymousClass00H A0026 = C000200d.A00(r136.A84);
                C191339mR r163 = (C191339mR) A116.AEX.get();
                C31061ex r172 = (C31061ex) r136.A8E.get();
                C196199uc r144 = (C196199uc) A116.A2l.get();
                A7U a7u = (A7U) r136.A5E.get();
                AnonymousClass1KI r1211 = (AnonymousClass1KI) r136.A80.get();
                C18030ve r137 = (C18030ve) r136.A04.get();
                return new IndiaUpiPayNumberContactPickerViewModel((AnonymousClass1KB) r136.A4b.get(), (AnonymousClass11P) r136.AAv.get(), (AnonymousClass118) r136.ABY.get(), r1211, r137, r144, a7u, r163, r172, (AnonymousClass90Z) A116.A2n.get(), (C30931ek) r136.A81.get(), A0025, A0026);
            case 263:
                AnonymousClass10E r138 = this.A00;
                AnonymousClass1KB r139 = (AnonymousClass1KB) r138.A4b.get();
                A0B AGZ = r138.AGY();
                AnonymousClass10G A117 = r138.A00;
                C31061ex r243 = (C31061ex) r138.A8E.get();
                A7U a7u2 = (A7U) r138.A5E.get();
                C33711jG r233 = (C33711jG) r138.A84.get();
                AnonymousClass1OZ r202 = (AnonymousClass1OZ) r138.A6N.get();
                C196199uc r212 = (C196199uc) A117.A2l.get();
                AnonymousClass1KI r182 = (AnonymousClass1KI) r138.A80.get();
                C18030ve r193 = (C18030ve) r138.A04.get();
                AnonymousClass118 r164 = (AnonymousClass118) r138.ABY.get();
                AnonymousClass1QR r173 = (AnonymousClass1QR) r138.A8D.get();
                return new IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel(r139, (AnonymousClass11S) r138.A63.get(), (AnonymousClass11P) r138.AAv.get(), r164, r173, r182, r193, r202, r212, a7u2, r233, r243, AGZ, this.A01.A1K(), (AnonymousClass90Z) A117.A2n.get(), (C30931ek) r138.A81.get(), (AnonymousClass10I) r138.AC1.get());
            case 264:
                AnonymousClass10E r140 = this.A00;
                AnonymousClass00H A0027 = C000200d.A00(r140.A6N);
                AnonymousClass00H A0028 = C000200d.A00(r140.A84);
                AXS axs2 = (AXS) r140.A5F.get();
                C31061ex r165 = (C31061ex) r140.A8E.get();
                AnonymousClass118 r1310 = (AnonymousClass118) r140.ABY.get();
                AnonymousClass11O r145 = (AnonymousClass11O) r140.ABn.get();
                AnonymousClass18O r1112 = (AnonymousClass18O) r140.A9p.get();
                AnonymousClass11P r1212 = (AnonymousClass11P) r140.AAv.get();
                return new IndiaUpiSecureQrCodeViewModel((AnonymousClass1KB) r140.A4b.get(), r1112, r1212, r1310, r145, axs2, r165, (AnonymousClass1QJ) r140.A8F.get(), (AnonymousClass1QS) r140.A8J.get(), A0027, A0028);
            case 265:
                AnonymousClass10E r107 = this.A00;
                AnonymousClass00H A0029 = C000200d.A00(r107.A6N);
                AnonymousClass10G A118 = r107.A00;
                AnonymousClass00H A0030 = C000200d.A00(r107.A84);
                A7U a7u3 = (A7U) r107.A5E.get();
                C31061ex r152 = (C31061ex) r107.A8E.get();
                AnonymousClass1KI r1213 = (AnonymousClass1KI) r107.A80.get();
                C196199uc r1311 = (C196199uc) A118.A2l.get();
                return new IndiaUpiSendPaymentViewModel((AnonymousClass1KB) r107.A4b.get(), (AnonymousClass118) r107.ABY.get(), (C24751Ln) r107.ABe.get(), r1213, r1311, a7u3, r152, (AnonymousClass90Z) A118.A2n.get(), (C30931ek) r107.A81.get(), A0029, A0030);
            case 266:
                return new InteropComposeEnterInfoViewModel(C000200d.A00(this.A00.A5P));
            case 267:
                AnonymousClass10E r141 = this.A00;
                return new InteropComposeSelectIntegratorViewModel(C000200d.A00(r141.ABd), C000200d.A00(r141.A5P), (C18600wl) r141.A9E.get());
            case 268:
                return new InteropNotifOptInViewModel(C000200d.A00(this.A00.A5P));
            case 269:
                AnonymousClass10E r57 = this.A00;
                return new InteropOptInSelectInboxViewModel((AnonymousClass11P) r57.AAv.get(), C000200d.A00(r57.A5V), C000200d.A00(this.A01.A4M), C000200d.A00(r57.A5P));
            case 270:
                AnonymousClass10E r146 = this.A00;
                return new C86254Qx(C000200d.A00(r146.A8f), C000200d.A00(r146.A00.A2r), C000200d.A00(r146.A5U), C000200d.A00(r146.A5V), C000200d.A00(r146.ABd));
            case 271:
                AnonymousClass10E r211 = this.A00;
                return new InteropOptInSelectIntegratorsViewModel((AnonymousClass11P) r211.AAv.get(), C000200d.A00(r211.A5P), C000200d.A00(r211.A5V), C000200d.A00(r211.A00.A2r), C000200d.A00(r211.A5U), C000200d.A00(this.A01.A4M), C000200d.A00(r211.ABd));
            case 272:
                AnonymousClass10E r58 = this.A00;
                return new InteropSettingsViewModel((AnonymousClass11P) r58.AAv.get(), (C33501iv) r58.A8d.get(), C000200d.A00(r58.A5V), C000200d.A00(this.A01.A4M));
            case 273:
                AnonymousClass10E r147 = this.A00;
                return new InteropUnifiedInboxViewModel(C000200d.A00(r147.A5V), C000200d.A00(r147.A5U), C000200d.A00(r147.A00.A2r));
            case 274:
                AnonymousClass10E r148 = this.A00;
                return new InteropViewModel((C25161Nd) r148.A2v.get(), (C18000vb) r148.ABz.get(), C000200d.A00(r148.A5V), (C18600wl) r148.A9E.get());
            case 275:
                AnonymousClass10E r149 = this.A00;
                Application A0031 = AnonymousClass0YX.A00(r149.Ao9);
                C18000vb r96 = (C18000vb) r149.ABz.get();
                C18030ve r108 = (C18030ve) r149.A04.get();
                return new InviteNonWhatsAppContactPickerViewModel(A0031, (AnonymousClass1M9) r149.A2f.get(), (C24921Me) r149.ABX.get(), r96, r108, (CW0) r149.A00.A31.get());
            case 276:
                return new KeyboardControllerViewModel((AnonymousClass1KW) this.A00.A3d.get(), C27011Uj.A00());
            case 277:
                AnonymousClass10E r150 = this.A00;
                return new LinkedDeviceEditDeviceViewModel((AnonymousClass1RK) r150.A2R.get(), (AnonymousClass10I) r150.AC1.get());
            case 278:
                AnonymousClass10E r151 = this.A00;
                return new LinkedDeviceEnterNicknameViewModel((AnonymousClass1RK) r151.A2R.get(), (AnonymousClass10I) r151.AC1.get());
            case 279:
                AnonymousClass10E r06 = this.A00;
                Application A0032 = AnonymousClass0YX.A00(r06.Ao9);
                AnonymousClass00H A0033 = C000200d.A00(r06.A6x);
                AnonymousClass00H A0034 = C000200d.A00(r06.A00.A94);
                C19890zB A0035 = C19880zA.A00();
                AnonymousClass00H A0036 = C000200d.A00(r06.AHv);
                AnonymousClass1RK r234 = (AnonymousClass1RK) r06.A2R.get();
                AnonymousClass1MQ r244 = (AnonymousClass1MQ) r06.AKI.get();
                AnonymousClass11E r213 = (AnonymousClass11E) r06.A2X.get();
                C19830z4 r222 = (C19830z4) r06.ABl.get();
                C26811To r194 = (C26811To) r06.AAf.get();
                C26371Rw r203 = (C26371Rw) r06.AAg.get();
                return new LinkedDevicesSharedViewModel(A0032, A0035, C19880zA.A01(r06.A5J.get()), (AnonymousClass1KB) r06.A4b.get(), (AnonymousClass18O) r06.A9p.get(), r194, r203, r213, r222, r234, r244, (AnonymousClass1TH) r06.A6T.get(), (C18030ve) r06.A04.get(), (AnonymousClass1VD) r06.A9J.get(), (AnonymousClass10I) r06.AC1.get(), A0033, A0034, A0036);
            case 280:
                AnonymousClass10E r46 = this.A00;
                Application A0037 = AnonymousClass0YX.A00(r46.Ao9);
                AnonymousClass00H A0038 = C000200d.A00(r46.A6x);
                return new LinkedDevicesViewModel(A0037, C19880zA.A01(r46.A5J.get()), (AnonymousClass1KB) r46.A4b.get(), (AnonymousClass1RK) r46.A2R.get(), (AnonymousClass10I) r46.AC1.get(), A0038);
            case 281:
                AnonymousClass10E r64 = this.A00;
                AnonymousClass1M9 r47 = (AnonymousClass1M9) r64.A2f.get();
                C37381pR r153 = this.A01;
                C107185Ys r35 = (C107185Ys) r153.A2z.get();
                AnonymousClass00H A0039 = C000200d.A00(r153.A3N);
                return new ListsContactPickerViewModel(r35, r47, (AnonymousClass11P) r64.AAv.get(), (ListsRepository) r64.A5m.get(), A0039, (C18600wl) r64.A9E.get());
            case 282:
                return new ListsConversationsManagementViewModel(C000200d.A00(this.A00.A5m));
            case 283:
                AnonymousClass10E r154 = this.A00;
                return new ListsHomeViewModel((AnonymousClass118) r154.ABY.get(), C000200d.A00(r154.A5l), C000200d.A00(r154.A2f), C000200d.A00(r154.A5m), C000200d.A00(r154.ABX), (C18600wl) r154.A9E.get(), (C18600wl) r154.A9F.get());
            case 284:
                AnonymousClass10E r155 = this.A00;
                return new ListsManagerViewModel(C000200d.A00(r155.A5l), C000200d.A00(r155.A2f), C000200d.A00(r155.A5m), (C18600wl) r155.A9E.get());
            case 285:
                AnonymousClass10E r156 = this.A00;
                Application A0040 = AnonymousClass0YX.A00(r156.Ao9);
                AnonymousClass10G A119 = r156.A00;
                A5L a5l = (A5L) A119.A4P.get();
                AnonymousClass118 r1113 = (AnonymousClass118) r156.ABY.get();
                return new LocationOptionPickerViewModel(A0040, (AM5) A119.A1V.get(), (C173738ve) A119.A0f.get(), a5l, r1113, (C219217x) r156.ABj.get(), (AnonymousClass1XN) A119.A0d.get());
            case 286:
                AnonymousClass10E r157 = this.A00;
                return new MLModelStorageUsageViewModel((C1407873b) r157.AXd.get(), (C131606lN) r157.A60.get(), (C18600wl) r157.A9E.get());
            case 287:
                AnonymousClass00H A0041 = C000200d.A00(this.A01.A4c);
                AnonymousClass10E r158 = this.A00;
                return new MediaGalleryFragmentViewModel(A0041, (C18600wl) r158.AfH.get(), (C18600wl) r158.A9F.get());
            case 288:
                AnonymousClass10E r159 = this.A00;
                return new LoadSectionsUseCase((AnonymousClass11P) r159.AAv.get(), (C18600wl) r159.A9F.get());
            case 289:
                return new MediaGalleryViewModel((C18600wl) this.A00.A9E.get());
            case 290:
                AnonymousClass10E r214 = this.A00;
                return new MediaQualityViewModel(this.A01.A7D, C000200d.A00(r214.AVb), C000200d.A00(r214.AmD), C000200d.A00(r214.AlU), (C18600wl) r214.A9E.get());
            case 291:
                AnonymousClass10E r160 = this.A00;
                AnonymousClass00H A0042 = C000200d.A00(r160.A3w);
                C63272sn A1V = AnonymousClass10E.A1U(r160);
                C18600wl r97 = (C18600wl) r160.A9F.get();
                C88174Yp r74 = (C88174Yp) r160.AP1.get();
                return new MediaViewCurrentMessageViewModel((AnonymousClass11S) r160.A63.get(), A1V, (C24681Lg) r160.A6Y.get(), r74, A0042, r97, C27011Uj.A00());
            case 292:
                AnonymousClass10E r215 = this.A00;
                AnonymousClass1KB r36 = (AnonymousClass1KB) r215.A4b.get();
                return new MediaViewOnceViewModel(this.A01.A7D, r36, (C18030ve) r215.A04.get(), (AnonymousClass10I) r215.AC1.get());
            case 293:
                return new MemoryBottomSheetViewModel(C000200d.A00(this.A00.AFf));
            case 294:
                C37381pR r161 = this.A01;
                return new MemoryViewModel(C000200d.A00(r161.A4o), C000200d.A00(r161.A4v));
            case 295:
                return new MemoryRepository(this.A01.A0G());
            case 296:
                AnonymousClass10E r166 = this.A00;
                return new C139776zQ(C000200d.A00(r166.A9B), C000200d.A00(r166.A0K));
            case 297:
                AnonymousClass10E r59 = this.A00;
                AnonymousClass00S Axz2 = r59.A8t;
                return new MenuBottomSheetViewModel((AnonymousClass11S) r59.A63.get(), (C175258yP) r59.A1R.get(), (AnonymousClass1M9) r59.A2f.get(), (C24921Me) r59.ABX.get(), Axz2);
            case 298:
                AnonymousClass10E r87 = this.A00;
                AnonymousClass00H A0043 = C000200d.A00(r87.A2H);
                C23631Ha A012 = C19880zA.A01(r87.A13.get());
                Application A0044 = AnonymousClass0YX.A00(r87.Ao9);
                AnonymousClass00H A0045 = C000200d.A00(r87.A2L);
                C19890zB A0046 = C19880zA.A00();
                C19890zB r1312 = A0046;
                C19890zB r1214 = A0046;
                AnonymousClass10I r204 = (AnonymousClass10I) r87.AC1.get();
                AnonymousClass1WX r183 = (AnonymousClass1WX) r87.A9N.get();
                AnonymousClass1MQ r195 = (AnonymousClass1MQ) r87.AKI.get();
                C24921Me r167 = (C24921Me) r87.ABX.get();
                C18000vb r174 = (C18000vb) r87.ABz.get();
                return new MessageDetailsViewModel(A0044, A012, A0046, r1214, r1312, (AnonymousClass11S) r87.A63.get(), (AnonymousClass1M9) r87.A2f.get(), r167, r174, r183, r195, r204, A0043, A0045, C000200d.A00(r87.AA1));
            case 299:
                AnonymousClass10E r168 = this.A00;
                AnonymousClass00H A0047 = C000200d.A00(r168.A3w);
                AnonymousClass10G A1110 = r168.A00;
                AnonymousClass10I r65 = (AnonymousClass10I) r168.AC1.get();
                return new MessageRatingViewModel((AnonymousClass9XF) A1110.ADN.get(), (AnonymousClass122) r168.A2y.get(), (AnonymousClass9j9) A1110.ADO.get(), r65, A0047);
            default:
                throw new AssertionError(i);
        }
    }

    private Object A0D() {
        int i = this.A02;
        switch (i) {
            case 300:
                C37361pP A002 = this.A01.A7D;
                AnonymousClass10E r3 = this.A00;
                return new MessageSelectionViewModel(A002, (AnonymousClass1KB) r3.A4b.get(), (C24681Lg) r3.A6Y.get(), C000200d.A00(r3.A3w));
            case 301:
                return new MessageWithLinkViewModel(C000200d.A00(this.A00.A3w));
            case 302:
                AnonymousClass10E r2 = this.A00;
                return new MetaAiPremiumViewModel(C000200d.A00(r2.A9B), C000200d.A00(r2.A6n));
            case 303:
                AnonymousClass10E r1 = this.A00;
                AnonymousClass00H A003 = C000200d.A00(r1.ABP);
                AnonymousClass00H A004 = C000200d.A00(r1.A6o);
                AnonymousClass00H A005 = C000200d.A00(r1.AC1);
                AnonymousClass10G A11 = r1.A00;
                AnonymousClass00H A006 = C000200d.A00(A11.ADV);
                AnonymousClass00H A007 = C000200d.A00(r1.A12);
                return new MetaAiVoiceMultimodalComposerViewModel((AnonymousClass1KB) r1.A4b.get(), (C18030ve) r1.A04.get(), (C139286ya) A11.ADW.get(), (AnonymousClass4XB) A11.A3F.get(), (C130826k4) A11.ADY.get(), A003, A004, A005, A006, A007, C000200d.A00(r1.A14));
            case 304:
                AnonymousClass10E r32 = this.A00;
                return new MetaAiVoiceSettingViewModel((C38731rn) r32.A6o.get(), (C134056pw) r32.A00.ADa.get(), (AnonymousClass10I) r32.AC1.get());
            case 305:
                AnonymousClass10E r12 = this.A00;
                AnonymousClass00H A008 = C000200d.A00(r12.ABP);
                AnonymousClass00H A009 = C000200d.A00(r12.A6o);
                AnonymousClass00H A0010 = C000200d.A00(r12.AC1);
                AnonymousClass10G A112 = r12.A00;
                AnonymousClass00H A0011 = C000200d.A00(A112.ADV);
                AnonymousClass00H A0012 = C000200d.A00(r12.A12);
                return new MetaAiVoiceViewModel((AnonymousClass1KB) r12.A4b.get(), (C18030ve) r12.A04.get(), (C139286ya) A112.ADW.get(), (AnonymousClass4XB) A112.A3F.get(), (C130826k4) A112.ADY.get(), A008, A009, A0010, A0011, A0012, C000200d.A00(r12.A14));
            case 306:
                AnonymousClass10E r22 = this.A00;
                return new MinimizedCallBannerViewModel((AnonymousClass1HS) r22.A98.get(), C000200d.A00(r22.A00.A7b), C000200d.A00(r22.A1i), C000200d.A00(this.A01.A51), C27011Uj.A00());
            case 307:
                AnonymousClass10E r13 = this.A00;
                AnonymousClass00H A0013 = C000200d.A00(r13.A1i);
                AnonymousClass10G A113 = r13.A00;
                AnonymousClass00H A0014 = C000200d.A00(A113.AFc);
                AnonymousClass00H A0015 = C000200d.A00(A113.AFK);
                C37381pR r23 = this.A01;
                AnonymousClass00H A0016 = C000200d.A00(r23.A24);
                AnonymousClass00H A0017 = C000200d.A00(A113.AFJ);
                AnonymousClass00H A0018 = C000200d.A00(r23.A0O);
                AnonymousClass00H A0019 = C000200d.A00(r23.A27);
                AnonymousClass00H A0020 = C000200d.A00(r23.A5q);
                AnonymousClass00H A0021 = C000200d.A00(r23.A50);
                AnonymousClass00H A0022 = C000200d.A00(r13.A2u);
                return new MinimizedCallBannerUseCase((AnonymousClass4QQ) r23.A6z.get(), (AnonymousClass1TD) r13.A1m.get(), (AnonymousClass1TA) r13.A5X.get(), (C18030ve) r13.A04.get(), (AnonymousClass1DC) r13.A95.get(), A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022);
            case 308:
                AnonymousClass10E r33 = this.A00;
                return new AnonymousClass4ZU((AnonymousClass1M9) r33.A2f.get(), (C24921Me) r33.ABX.get(), (C18000vb) r33.ABz.get());
            case 309:
                return new AnimateBannerUseCase((AnonymousClass1VE) this.A00.ABT.get());
            case 310:
                AnonymousClass10E r24 = this.A00;
                return new AnonymousClass4XH((C24921Me) r24.ABX.get(), (AnonymousClass1MZ) r24.A4t.get());
            case 311:
                return new C84674Kk((AnonymousClass1VE) this.A00.ABT.get());
            case 312:
                AnonymousClass10E r25 = this.A00;
                AnonymousClass00H A0023 = C000200d.A00(r25.ABd);
                AnonymousClass00H A0024 = C000200d.A00(this.A01.A5q);
                AnonymousClass1V7 r9 = (AnonymousClass1V7) r25.A97.get();
                AnonymousClass1V9 r7 = (AnonymousClass1V9) r25.A1e.get();
                C195199sx r8 = (C195199sx) r25.ABV.get();
                return new C93634jI((C175258yP) r25.A1R.get(), r7, r8, r9, (AnonymousClass1DC) r25.A95.get(), A0023, A0024);
            case 313:
                AnonymousClass10E r34 = this.A00;
                return new AnonymousClass4QQ((C18030ve) r34.A04.get(), (AnonymousClass126) r34.A4h.get(), (C24901Mc) r34.AA5.get());
            case 314:
                return new MusicAttributionViewModel(C000200d.A00(this.A00.A00.A5i));
            case 315:
                AnonymousClass10E r35 = this.A00;
                return new MuteDiagnosticsDialogViewModel((AnonymousClass11P) r35.AAv.get(), (C24521Kq) r35.ABc.get(), (C87704Wq) r35.A00.A8q.get());
            case 316:
                AnonymousClass10E r14 = this.A00;
                AnonymousClass1KB r6 = (AnonymousClass1KB) r14.A4b.get();
                AnonymousClass11S r72 = (AnonymousClass11S) r14.A63.get();
                AnonymousClass00H A0025 = C000200d.A00(r14.A00.A55);
                AnonymousClass1M9 r82 = (AnonymousClass1M9) r14.A2f.get();
                AnonymousClass1Nb r142 = (AnonymousClass1Nb) r14.A2E.get();
                AnonymousClass00H A0026 = C000200d.A00(r14.A2A);
                AnonymousClass1NN r11 = (AnonymousClass1NN) r14.A2q.get();
                return new MuteDialogViewModel(r6, r72, r82, (AnonymousClass11P) r14.AAv.get(), (C19830z4) r14.ABl.get(), r11, (AnonymousClass1MZ) r14.A4t.get(), (C18030ve) r14.A04.get(), r142, (AnonymousClass10I) r14.AC1.get(), A0025, A0026);
            case 317:
                AnonymousClass10E r26 = this.A00;
                C37381pR r15 = this.A01;
                return new NewChatSuggestedContactsPrefetchViewModel((AnonymousClass11P) r26.AAv.get(), (C18030ve) r26.A04.get(), r15.A26(), C000200d.A00(r26.ACD), C000200d.A00(r15.A6X), C000200d.A00(r26.A9E), C000200d.A00(r15.A6Y));
            case 318:
                return new AnonymousClass713((C18010vc) this.A00.A9s.get());
            case 319:
                AnonymousClass10E r16 = this.A00;
                AnonymousClass00H A0027 = C000200d.A00(r16.A4U);
                AnonymousClass00H A0028 = C000200d.A00(r16.A5t);
                AnonymousClass00H A0029 = C000200d.A00(this.A01.A5j);
                C134076py r112 = (C134076py) r16.A00.A5R.get();
                C33841jT r83 = (C33841jT) r16.A9T.get();
                C19830z4 r62 = (C19830z4) r16.ABl.get();
                C33641j9 r10 = (C33641j9) r16.Am6.get();
                C27301Vn r5 = (C27301Vn) r16.A9A.get();
                return A07((C19880zA) r16.A7j.get(), (AnonymousClass11P) r16.AAv.get(), (AnonymousClass118) r16.ABY.get(), r5, r62, (AnonymousClass1LU) r16.ABd.get(), r83, (AnonymousClass1CM) r16.A9V.get(), r10, r112, (AnonymousClass10I) r16.AC1.get(), A0027, A0028, A0029);
            case 320:
                AnonymousClass10E r17 = this.A00;
                AnonymousClass181 r63 = (AnonymousClass181) r17.AA9.get();
                AnonymousClass129 r113 = (AnonymousClass129) r17.A4I.get();
                return new C58712l8(r63, (C18000vb) r17.ABz.get(), (C134036pu) r17.A00.AB8.get(), (AnonymousClass1D9) r17.A0n.get(), (AnonymousClass1LU) r17.ABd.get(), r113, (AnonymousClass10I) r17.AC1.get());
            case 321:
                AnonymousClass10E r36 = this.A00;
                return new NewsletterCopyrightSuspensionInfoViewModel((AnonymousClass1M9) r36.A2f.get(), (AnonymousClass1W6) r36.A3w.get(), (C18600wl) r36.A9E.get());
            case 322:
                return new NewsletterEnforcementSelectActionViewModel((AnonymousClass1CJ) this.A00.A2H.get());
            case 323:
                AnonymousClass10E r27 = this.A00;
                return new NewsletterRequestReviewViewModel(C000200d.A00(r27.A7E), (C18600wl) r27.A9E.get());
            case 324:
                AnonymousClass10E r4 = this.A00;
                return new NewsletterUserReportsViewModel((AnonymousClass11E) r4.A2X.get(), (AnonymousClass1M9) r4.A2f.get(), C000200d.A00(this.A01.A5E), (C18600wl) r4.A9E.get());
            case 325:
                return new NewsletterUserReportsNetworkClient(C000200d.A00(this.A00.AZr));
            case 326:
                AnonymousClass10E r18 = this.A00;
                AnonymousClass11S r64 = (AnonymousClass11S) r18.A63.get();
                AnonymousClass1CJ r73 = (AnonymousClass1CJ) r18.A2H.get();
                AnonymousClass1Nb r102 = (AnonymousClass1Nb) r18.A2E.get();
                AnonymousClass1MZ r84 = (AnonymousClass1MZ) r18.A4t.get();
                AnonymousClass00H A0030 = C000200d.A00(r18.A4u);
                return new NotificationsAndSoundsViewModel(r64, r73, r84, (C18030ve) r18.A04.get(), r102, (C55502fs) r18.A00.A89.get(), (AnonymousClass10I) r18.AC1.get(), A0030);
            case 327:
                C37361pP A0031 = this.A01.A7D;
                AnonymousClass10E r19 = this.A00;
                return new OneOnOneCallConfirmationSheetViewModel(A0031, (AnonymousClass1VP) r19.A1l.get(), (AnonymousClass1M9) r19.A2f.get(), (C24921Me) r19.ABX.get(), (C18600wl) r19.A9F.get(), C27011Uj.A00());
            case 328:
                return new OrderCatalogPickerViewModel(C000200d.A00(this.A00.A1q));
            case 329:
                AnonymousClass10E r110 = this.A00;
                AnonymousClass118 r74 = (AnonymousClass118) r110.ABY.get();
                return new OrientationViewModel((AnonymousClass1VE) r110.ABT.get(), r74, (C18030ve) r110.A04.get(), (AnonymousClass10I) r110.AC1.get(), r110.A00.AFR, r110.Aej);
            case 330:
                AnonymousClass10E r42 = this.A00;
                C175258yP r85 = (C175258yP) r42.A1R.get();
                AnonymousClass1M9 r114 = (AnonymousClass1M9) r42.A2f.get();
                C24921Me r132 = (C24921Me) r42.ABX.get();
                AnonymousClass00H A0032 = C000200d.A00(r42.A0x);
                C24671Lf r122 = (C24671Lf) r42.A2g.get();
                AnonymousClass00H A0033 = C000200d.A00(r42.A1g);
                AnonymousClass1V9 r103 = (AnonymousClass1V9) r42.A1e.get();
                return new ParticipantsListViewModel((AnonymousClass190) r42.A31.get(), (AnonymousClass11S) r42.A63.get(), r85, (AnonymousClass4XN) this.A01.A5Y.get(), r103, r114, r122, r132, (AnonymousClass1TB) r42.AGb.get(), (AnonymousClass1MW) r42.A7u.get(), (C18030ve) r42.A04.get(), (AnonymousClass1DC) r42.A95.get(), (AnonymousClass10I) r42.AC1.get(), A0032, A0033, r42.A8t);
            case 331:
                AnonymousClass10E r43 = this.A00;
                AnonymousClass1M9 r28 = (AnonymousClass1M9) r43.A2f.get();
                C24921Me r111 = (C24921Me) r43.ABX.get();
                return new AnonymousClass4XN((C108895cT) r43.A00.AFB.get(), r28, r111, (C18030ve) r43.A04.get());
            case 332:
                AnonymousClass10E r44 = this.A00;
                return new PasskeyLoginViewModel((AnonymousClass19D) r44.A02.get(), C000200d.A00(r44.A4U), C000200d.A00(this.A01.A5Q), C000200d.A00(r44.A00.A3h));
            case 333:
                AnonymousClass10E r29 = this.A00;
                return new PasskeyVerifier(AnonymousClass10G.A83(r29.A00), C000200d.A00(r29.A4U));
            case 334:
                AnonymousClass10E r115 = this.A00;
                AnonymousClass1QS r86 = (AnonymousClass1QS) r115.A8J.get();
                return new PaymentIncentiveViewModel((AnonymousClass11P) r115.AAv.get(), (C24751Ln) r115.ABe.get(), r86, (C33351ig) r115.A83.get(), (AnonymousClass10I) r115.AC1.get());
            case 335:
                AnonymousClass10E r116 = this.A00;
                AnonymousClass1QS r75 = (AnonymousClass1QS) r116.A8J.get();
                BD4 bd4 = (BD4) r116.A00.A0V.get();
                AnonymousClass00H A0034 = C000200d.A00(r116.AcC);
                C31071ey r92 = (C31071ey) r116.A6H.get();
                return new PaymentMerchantAccountViewModel((C31051ew) r116.Ace.get(), r75, bd4, r92, (AnonymousClass10I) r116.AC1.get(), A0034, C000200d.A00(r116.Ach));
            case 336:
                AnonymousClass10E r45 = this.A00;
                return new PinInChatBannerViewModel((AnonymousClass1KB) r45.A4b.get(), (AnonymousClass11P) r45.AAv.get(), C000200d.A00(r45.AdN), C000200d.A00(this.A01.A5V));
            case 337:
                AnonymousClass10E r46 = this.A00;
                return new C87714Wr((AnonymousClass1MZ) r46.A4t.get(), (AnonymousClass18K) r46.A9B.get(), (AnonymousClass1PU) r46.A4j.get(), C000200d.A00(r46.A6V));
            case 338:
                AnonymousClass10E r210 = this.A00;
                return new PollCreatorViewModel((C33251iW) r210.ABA.get(), (AnonymousClass11P) r210.AAv.get(), (C18030ve) r210.A04.get(), C000200d.A00(r210.A00.A3q), C000200d.A00(this.A01.A7A));
            case 339:
                AnonymousClass10E r117 = this.A00;
                return new C86064Qa(C19880zA.A00(), (AnonymousClass1c4) r117.A7C.get(), (C95424mD) r117.A00.A3T.get());
            case 340:
                AnonymousClass10E r211 = this.A00;
                return new PomegranatePancakeViewModel((C131456l8) this.A01.A34.get(), (AnonymousClass8BA) r211.A00.AJ5.get(), (AnonymousClass1CM) r211.A9V.get());
            case 341:
                AnonymousClass10E r118 = this.A00;
                return new PrivacyDisclosureContainerViewModel((AnonymousClass1KB) r118.A4b.get(), (C33501iv) r118.A8d.get(), (AnonymousClass10I) r118.AC1.get(), C000200d.A00(r118.A8g), C000200d.A00(r118.A00.A3s));
            case 342:
                AnonymousClass10E r212 = this.A00;
                Application A0035 = AnonymousClass0YX.A00(r212.Ao9);
                AnonymousClass00H A0036 = C000200d.A00(r212.A1q);
                AnonymousClass00H A0037 = C000200d.A00(r212.A1H);
                C37381pR r119 = this.A01;
                B7A b7a = (B7A) r119.A35.get();
                A8Q a8q = (A8Q) r212.A1p.get();
                AnonymousClass10G A114 = r212.A00;
                A78 a78 = (A78) r119.A0i.get();
                AnonymousClass00H A0038 = C000200d.A00(r212.A1s);
                AnonymousClass00H A0039 = C000200d.A00(r212.A1y);
                C187599g4 A0F = r119.A0E();
                AnonymousClass00H A0040 = C000200d.A00(r119.A1U);
                AnonymousClass00H A0041 = C000200d.A00(r212.AGs);
                AnonymousClass00H A0042 = C000200d.A00(this.A03.A01);
                AnonymousClass00H A0043 = C000200d.A00(r119.A1N);
                return new ProductBottomSheetViewModel(A0035, (AnonymousClass11S) r212.A63.get(), (C22417B6z) r119.A37.get(), (C195529tU) r212.A1t.get(), b7a, a8q, A0F, a78, (C18000vb) r212.ABz.get(), (AnonymousClass2UJ) A114.A3d.get(), (AnonymousClass10I) r212.AC1.get(), A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, C000200d.A00(r212.A8o), C000200d.A00(A114.A0n));
            case 343:
                return new C66302xx(this, 1);
            case 344:
                AnonymousClass10E r37 = this.A00;
                return new A78((AnonymousClass11S) r37.A63.get(), (C24751Ln) r37.ABe.get(), C000200d.A00(r37.ABc));
            case 345:
                return new A41((A8Q) this.A00.A1p.get());
            case 346:
                AnonymousClass10E r38 = this.A00;
                return new C185479ce((C26911Ty) r38.A1J.get(), (AnonymousClass1PM) r38.ABM.get(), (C18030ve) r38.A04.get());
            case 347:
                return new C65932xL(this, 1);
            case 348:
                AnonymousClass10E r120 = this.A00;
                C18000vb r93 = (C18000vb) r120.ABz.get();
                return new ProfileCreationViewModel(C19880zA.A00(), (AnonymousClass11S) r120.A63.get(), (C26911Ty) r120.A1J.get(), r93, (C18030ve) r120.A04.get(), C000200d.A00(r120.A1K));
            case 349:
                AnonymousClass10E r39 = this.A00;
                AnonymousClass10G A115 = r39.A00;
                C23771Ho A0044 = C29911d4.A00();
                return new QuickActionBarViewModel((AnonymousClass1KR) A115.AFb.get(), C000200d.A00(r39.A2f), C000200d.A00(A115.AFa), C000200d.A00(r39.A04), C000200d.A00(this.A01.A5d), (C18600wl) r39.A9F.get(), A0044);
            case 350:
                return new C24884COc(C000200d.A00(this.A00.A9s));
            case 351:
                return new ReachoutTimelockViewModel((AnonymousClass1VA) this.A00.Afo.get());
            case 352:
                C37381pR r121 = this.A01;
                AnonymousClass10E r213 = this.A00;
                AnonymousClass11S r310 = (AnonymousClass11S) r213.A63.get();
                AnonymousClass1CJ r65 = (AnonymousClass1CJ) r213.A2H.get();
                AnonymousClass11C r47 = (AnonymousClass11C) r213.AAp.get();
                C191569mo r104 = (C191569mo) r213.A00.AG1.get();
                C32731hf r94 = (C32731hf) r213.Afs.get();
                ReactionsTrayViewModel A06 = A06(r310, r47, (AnonymousClass11P) r213.AAv.get(), r65, (C18030ve) r213.A04.get(), (C18010vc) r213.A9s.get(), r94, r104, (AnonymousClass10I) r213.AC1.get(), C000200d.A00(r213.AP1));
                r121.A4k(A06);
                return A06;
            case 353:
                C37381pR r0 = this.A01;
                return new RegisterPhoneViewModel(r0.A1Q(), r0.A1U(), r0.A1W(), r0.A1Y(), r0.A1c());
            case 354:
                AnonymousClass10E r214 = this.A00;
                AnonymousClass118 r76 = (AnonymousClass118) r214.ABY.get();
                AnonymousClass00H A0045 = C000200d.A00(r214.A4U);
                AnonymousClass11C r66 = (AnonymousClass11C) r214.AAp.get();
                AnonymousClass10G A116 = r214.A00;
                AnonymousClass00H A0046 = C000200d.A00(A116.AEq);
                AnonymousClass00H A0047 = C000200d.A00(r214.A77);
                return new RegistrationAudioGuidanceViewModel(r66, r76, (C85244Mq) A116.AG7.get(), A0045, A0046, A0047, (C18600wl) r214.A9E.get(), (C18600wl) r214.AfH.get(), (AnonymousClass1OX) r214.A9C.get());
            case 355:
                AnonymousClass10E r215 = this.A00;
                AnonymousClass10G A117 = r215.A00;
                AnonymousClass1CJ r133 = (AnonymousClass1CJ) r215.A2H.get();
                AnonymousClass1M9 r77 = (AnonymousClass1M9) r215.A2f.get();
                AnonymousClass00H A0048 = C000200d.A00(r215.A5V);
                C24921Me r87 = (C24921Me) r215.ABX.get();
                C18000vb r1110 = (C18000vb) r215.ABz.get();
                C26031Qo r123 = (C26031Qo) r215.A32.get();
                AnonymousClass00H A0049 = C000200d.A00(r215.A3w);
                C136876uY r95 = (C136876uY) A117.AHR.get();
                AnonymousClass00H A0050 = C000200d.A00(r215.A2L);
                return new ReportSpamDialogViewModel(AnonymousClass0YX.A00(r215.Ao9), r77, r87, r95, (AnonymousClass11P) r215.AAv.get(), r1110, r123, r133, (AnonymousClass1MZ) r215.A4t.get(), (C18030ve) r215.A04.get(), (C36401np) A117.A30.get(), A0048, A0049, A0050, (C18600wl) r215.A9E.get());
            case 356:
                AnonymousClass10E r124 = this.A00;
                return new RequestPhoneNumberViewModel((C33251iW) r124.ABA.get(), (C24751Ln) r124.ABe.get(), (AnonymousClass1RL) r124.ABg.get(), (AnonymousClass129) r124.A4I.get(), (AnonymousClass10I) r124.AC1.get(), C000200d.A00(r124.An7));
            case 357:
                AnonymousClass10E r216 = this.A00;
                C218617r r67 = (C218617r) r216.A8v.get();
                C183839Zu r96 = (C183839Zu) r216.A00.AGJ.get();
                AnonymousClass19D r1111 = (AnonymousClass19D) r216.A02.get();
                C27431Wb r105 = (C27431Wb) r216.A6f.get();
                PasskeyBackupEnabler A04 = this.A01.A03();
                return new RestoreFromBackupViewModel(r67, (AnonymousClass1NO) r216.A3e.get(), A04, r96, r105, r1111, (AnonymousClass10I) r216.AC1.get(), C000200d.A00(r216.A0j));
            case 358:
                return new RetryCodeCountdownTimersViewModel((AnonymousClass1CM) this.A00.A9V.get());
            case 359:
                AnonymousClass10E r125 = this.A00;
                AnonymousClass11S r68 = (AnonymousClass11S) r125.A63.get();
                AnonymousClass118 r1112 = (AnonymousClass118) r125.ABY.get();
                AnonymousClass1HQ r78 = (AnonymousClass1HQ) r125.A99.get();
                C175258yP r88 = (C175258yP) r125.A1R.get();
                C21141AfC afC = (C21141AfC) r125.ABO.get();
                C23771Ho A0051 = C29911d4.A00();
                return new ScreenShareViewModel(r68, r78, r88, (AnonymousClass1V7) r125.A97.get(), afC, r1112, (C18030ve) r125.A04.get(), (AnonymousClass1DC) r125.A95.get(), (VoipCameraManager) r125.ABQ.get(), C000200d.A00(r125.A00.AIh), C000200d.A00(r125.A9k), A0051);
            case 360:
                AnonymousClass10E r126 = this.A00;
                AnonymousClass1KB r69 = (AnonymousClass1KB) r126.A4b.get();
                AnonymousClass00H A0052 = C000200d.A00(r126.Aju);
                AnonymousClass10G A118 = r126.A00;
                C121646Ky r97 = (C121646Ky) A118.A5K.get();
                C37381pR r217 = this.A01;
                AnonymousClass00H A0053 = C000200d.A00(r217.A3U);
                AnonymousClass00H A0054 = C000200d.A00(A118.ABS);
                C19830z4 r89 = (C19830z4) r126.ABl.get();
                AnonymousClass00H A0055 = C000200d.A00(A118.A2J);
                AnonymousClass00H A0056 = C000200d.A00(A118.A1c);
                AnonymousClass00H A0057 = C000200d.A00(r217.A3W);
                return new SearchFunStickersViewModel(r69, (AnonymousClass11E) r126.A2X.get(), r89, r97, (C18030ve) r126.A04.get(), (WamediaManager) r126.ABs.get(), (AnonymousClass1SB) r126.AAS.get(), A0052, A0053, A0054, A0055, A0056, A0057, C000200d.A00(r217.A3V), C000200d.A00(r126.A2o), (C18600wl) r126.A9E.get());
            case 361:
                AnonymousClass10E r218 = this.A00;
                AnonymousClass118 r79 = (AnonymousClass118) r218.ABY.get();
                AnonymousClass71H r98 = (AnonymousClass71H) this.A01.A0h.get();
                return new C134046pv((C25311Ns) r218.A9R.get(), r79, (C18030ve) r218.A04.get(), r98, C000200d.A00(r218.AAP), C000200d.A00(r218.Ajr), C000200d.A00(r218.A00.A2J), (C18600wl) r218.A9F.get());
            case 362:
                AnonymousClass10E r311 = this.A00;
                return new C128486g6((AnonymousClass11S) r311.A63.get(), (C18030ve) r311.A04.get(), C000200d.A00(r311.A00.A65));
            case 363:
                AnonymousClass10E r127 = this.A00;
                C34991lS r710 = (C34991lS) r127.A3v.get();
                return new C1404771o((AnonymousClass11P) r127.AAv.get(), r710, (C18030ve) r127.A04.get(), (AnonymousClass18K) r127.A9B.get(), (C18600wl) r127.A9E.get());
            case 364:
                C37381pR r02 = this.A01;
                return new SecurityCheckupBannerViewModel(r02.A1r(), r02.A1t());
            case 365:
                AnonymousClass10E r128 = this.A00;
                AnonymousClass1CJ r99 = (AnonymousClass1CJ) r128.A2H.get();
                C40371ub r711 = (C40371ub) r128.A2P.get();
                AnonymousClass1MZ r106 = (AnonymousClass1MZ) r128.A4t.get();
                AnonymousClass11E r810 = (AnonymousClass11E) r128.A2X.get();
                return new SelectCommunityForGroupViewModel((C87834Xg) r128.A00.A2x.get(), r711, r810, r99, r106, (C18600wl) r128.A9E.get());
            case 366:
                AnonymousClass10E r219 = this.A00;
                return new SelectedImageAlbumViewModel((C24681Lg) r219.A6Y.get(), C000200d.A00(r219.A3w));
            case 367:
                return new SendSmsToWaViewModel(this.A01.A1Y());
            case 368:
                AnonymousClass10E r129 = this.A00;
                AnonymousClass00H A0058 = C000200d.A00(r129.A51);
                C19890zB A0059 = C19880zA.A00();
                return new SettingsAccountViewModel(A0059, A0059, (AnonymousClass10I) r129.AC1.get(), A0058);
            case 369:
                C37381pR r220 = this.A01;
                return new SettingsBannerViewModelImpl(r220.A05(), (C36631oD) r220.A5z.get());
            case 370:
                AnonymousClass10E r221 = this.A00;
                return new SettingsChatViewModel((C27431Wb) r221.A6f.get(), (AnonymousClass10I) r221.AC1.get());
            case 371:
                AnonymousClass10E r130 = this.A00;
                return A08((AnonymousClass1KB) r130.A4b.get(), (AnonymousClass1HQ) r130.A99.get(), (AnonymousClass1L7) r130.A3t.get(), (C18030ve) r130.A04.get(), (AnonymousClass10I) r130.AC1.get(), C000200d.A00(r130.A00.AFq));
            case 372:
                AnonymousClass10E r131 = this.A00;
                AnonymousClass18K r134 = (AnonymousClass18K) r131.A9B.get();
                AnonymousClass1NT r312 = (AnonymousClass1NT) r131.A3f.get();
                C27431Wb r1113 = (C27431Wb) r131.A6f.get();
                C196239ug r52 = (C196239ug) r131.A4d.get();
                C19830z4 r107 = (C19830z4) r131.ABl.get();
                AnonymousClass00H A0060 = C000200d.A00(r131.A0j);
                AnonymousClass11E r910 = (AnonymousClass11E) r131.A2X.get();
                C199349zq r811 = (C199349zq) r131.A00.A3B.get();
                C36801oU r48 = (C36801oU) r131.A4c.get();
                C36861oa r712 = (C36861oa) r131.A4g.get();
                return A03((AnonymousClass1KB) r131.A4b.get(), r312, r48, r52, (C36841oY) r131.A4f.get(), r712, r811, r910, r107, r1113, (C18030ve) r131.A04.get(), r134, (AnonymousClass10I) r131.AC1.get(), A0060);
            case 373:
                AnonymousClass10E r313 = this.A00;
                AnonymousClass10G A119 = r313.A00;
                PasskeyExistsCache passkeyExistsCache = (PasskeyExistsCache) A119.A3i.get();
                C37381pR r135 = this.A01;
                B8U b8u = (B8U) r135.A5N.get();
                B8V b8v = (B8V) r135.A5O.get();
                return new SettingsPasskeysViewModel((AnonymousClass11P) r313.AAv.get(), passkeyExistsCache, b8u, b8v, (PasskeyServerApiImpl) A119.A0N.get());
            case 374:
                AnonymousClass10E r222 = this.A00;
                return new SettingsPrivacyCameraEffectsViewModel((ArEffectsFlmConsentManager) r222.A00.A0C.get(), (C18600wl) r222.A9E.get());
            case 375:
                AnonymousClass10E r314 = this.A00;
                return new SettingsSecurityCheckupViewModel((C192679on) r314.A00.A3h.get(), this.A01.A1t(), (C18600wl) r314.A9E.get());
            case 376:
                return new SettingsSetupUserProxyViewModel(C000200d.A00(this.A00.Am0));
            case 377:
                AnonymousClass10E r136 = this.A00;
                AnonymousClass1KB r610 = (AnonymousClass1KB) r136.A4b.get();
                C25011Mn r108 = (C25011Mn) r136.A9o.get();
                C219017v r911 = (C219017v) r136.A6S.get();
                C37381pR r223 = this.A01;
                AnonymousClass00H A0061 = C000200d.A00(r223.A6n);
                AnonymousClass00H A0062 = C000200d.A00(r136.Am0);
                AnonymousClass00H A0063 = C000200d.A00(r223.A4i);
                return new SettingsUserProxyViewModel(r610, (AnonymousClass11E) r136.A2X.get(), (C18030ve) r136.A04.get(), r911, r108, (AnonymousClass10I) r136.AC1.get(), A0061, A0062, A0063, C000200d.A00(r136.AfI), C000200d.A00(r136.A00.AFq));
            case 378:
                return new C85974Pq((AnonymousClass18K) this.A00.A9B.get());
            case 379:
                AnonymousClass10E r224 = this.A00;
                return new C87574Wc((AnonymousClass18K) r224.A9B.get(), (C220418j) r224.A9d.get());
            case 380:
                return new ShareActionsViewModel(this.A00.A00.ADT());
            case 381:
                AnonymousClass10E r225 = this.A00;
                AnonymousClass00H A0064 = C000200d.A00(r225.AAv);
                AnonymousClass00H A0065 = C000200d.A00(r225.A04);
                AnonymousClass00H A0066 = C000200d.A00(r225.A31);
                AnonymousClass00H A0067 = C000200d.A00(r225.Aju);
                AnonymousClass00H A0068 = C000200d.A00(r225.ABj);
                AnonymousClass00H A0069 = C000200d.A00(r225.AB9);
                AnonymousClass10G A1110 = r225.A00;
                return new ShareMediaViewModel(A0064, A0065, A0066, A0067, A0068, A0069, C000200d.A00(A1110.A6f), C000200d.A00(A1110.A7m), (C18600wl) r225.A9E.get(), (C18600wl) r225.A9F.get());
            case 382:
                AnonymousClass10E r137 = this.A00;
                return new SharePhoneNumberRowViewModel((AnonymousClass11S) r137.A63.get(), (AnonymousClass1M9) r137.A2f.get(), (C24921Me) r137.ABX.get(), (AnonymousClass1RL) r137.ABg.get(), (AnonymousClass10I) r137.AC1.get());
            case 383:
                AnonymousClass10E r49 = this.A00;
                return new SharePhoneNumberViewModel((AnonymousClass11S) r49.A63.get(), (C33251iW) r49.ABA.get(), (AnonymousClass129) r49.A4I.get(), C000200d.A00(r49.An7));
            case 384:
                return new ShareProductViewModel(C000200d.A00(this.A00.A1q));
            case 385:
                AnonymousClass10E r226 = this.A00;
                return A09((AnonymousClass11E) r226.A2X.get(), C000200d.A00(r226.A0y));
            case 386:
                AnonymousClass10E r227 = this.A00;
                return new ShopsProductPreviewFragmentViewModel((AnonymousClass18K) r227.A9B.get(), (C190369kp) r227.A9w.get());
            case 387:
                AnonymousClass10G A1111 = this.A00.A00;
                return new SparkViewModel((C55472fp) A1111.AIt.get(), (C24932CQf) A1111.AIr.get(), (C26027Cql) A1111.AHS.get());
            case 388:
                C37361pP A0070 = this.A01.A7D;
                AnonymousClass10E r138 = this.A00;
                new StatusArchiveSettingsViewModel(A0070, (AnonymousClass1TG) r138.AAF.get(), (AnonymousClass1TF) r138.AAA.get());
                throw null;
            case 389:
                AnonymousClass10E r410 = this.A00;
                return new StickerComposerViewModel((C218617r) r410.A8v.get(), C000200d.A00(this.A01.A6P), (C18600wl) r410.A9E.get(), (C18600wl) r410.A9F.get());
            case 390:
                return new C126536ct((C218617r) this.A00.A8v.get());
            case 391:
                AnonymousClass10E r315 = this.A00;
                AnonymousClass00H A0071 = C000200d.A00(r315.A4b);
                AnonymousClass00H A0072 = C000200d.A00(r315.A9m);
                C18000vb r812 = (C18000vb) r315.ABz.get();
                C37381pR r411 = this.A01;
                AnonymousClass00H A0073 = C000200d.A00(r411.A6R);
                AnonymousClass00H A0074 = C000200d.A00(r315.AAS);
                AnonymousClass00H A0075 = C000200d.A00(r411.A6M);
                AnonymousClass10G A1112 = r315.A00;
                AnonymousClass00H A0076 = C000200d.A00(A1112.AGS);
                AnonymousClass00H A0077 = C000200d.A00(A1112.A1c);
                C19830z4 r713 = (C19830z4) r315.ABl.get();
                AnonymousClass00H A0078 = C000200d.A00(A1112.ABd);
                AnonymousClass00H A0079 = C000200d.A00(r315.ABj);
                C125856bn A14 = r411.A13();
                C128986h4 A16 = r411.A15();
                AnonymousClass00H A0080 = C000200d.A00(r315.ADv);
                AnonymousClass00H A0081 = C000200d.A00(r315.Ak4);
                AnonymousClass00H A0082 = C000200d.A00(r315.Alk);
                AnonymousClass00H A0083 = C000200d.A00(A1112.A1h);
                AnonymousClass00H A0084 = C000200d.A00(A1112.ACV);
                return new StickerExpressionsViewModel((AnonymousClass11P) r315.AAv.get(), r713, r812, A14, A16, (C138646xS) r411.A6K.get(), (C18030ve) r315.A04.get(), (AnonymousClass18K) r315.A9B.get(), (AnonymousClass4OC) r411.A0V.get(), (C131016kN) A1112.AG4.get(), (C138666xU) A1112.AHW.get(), (AnonymousClass71H) r411.A0h.get(), A0071, A0072, A0073, A0074, A0075, A0076, A0077, A0078, A0079, A0080, A0081, A0082, A0083, A0084, C000200d.A00(A1112.AH5), C000200d.A00(r411.A6Q), C000200d.A00(A1112.AHg), (C18600wl) r315.A9E.get(), C27011Uj.A00());
            case 392:
                AnonymousClass10E r412 = this.A00;
                return new C1405271v((C218617r) r412.A8v.get(), (AnonymousClass11P) r412.AAv.get(), (AnonymousClass18K) r412.A9B.get(), C000200d.A00(r412.Ajt));
            case 393:
                AnonymousClass10E r316 = this.A00;
                return new AnonymousClass71F((C18000vb) r316.ABz.get(), (C18030ve) r316.A04.get(), C000200d.A00(r316.ABl));
            case 394:
                C37381pR r317 = this.A01;
                StickerPackFlow A23 = r317.A22();
                AnonymousClass10G A1113 = this.A00.A00;
                AnonymousClass00H A0085 = C000200d.A00(this.A03.A00);
                AnonymousClass00H A0086 = C000200d.A00(A1113.AG2);
                return new C138646xS(r317.A20(), A23, A1113.ADh(), (C138666xU) A1113.AHW.get(), A0085, A0086, C27011Uj.A00());
            case 395:
                AnonymousClass10E r139 = this.A00;
                return new C130626jk(C000200d.A00(r139.A04), C000200d.A00(r139.Ak9), C000200d.A00(r139.AAN), C000200d.A00(r139.Ajr), C000200d.A00(r139.Ak0), C000200d.A00(r139.AAT), (C18600wl) r139.A9E.get());
            case 396:
                return new C131556lI((AnonymousClass118) this.A00.ABY.get());
            case 397:
                AnonymousClass10E r140 = this.A00;
                AnonymousClass00H A0087 = C000200d.A00(r140.A8v);
                AnonymousClass00H A0088 = C000200d.A00(r140.A5v);
                AnonymousClass00H A0089 = C000200d.A00(r140.ABt);
                AnonymousClass00H A0090 = C000200d.A00(r140.AAN);
                AnonymousClass00H A0091 = C000200d.A00(r140.AC1);
                AnonymousClass00H A0092 = C000200d.A00(r140.A00.A7m);
                AnonymousClass00H A0093 = C000200d.A00(r140.A2f);
                AnonymousClass00H A0094 = C000200d.A00(this.A01.A6N);
                AnonymousClass00H A0095 = C000200d.A00(r140.Ag2);
                AnonymousClass00H A0096 = C000200d.A00(r140.A0R);
                AnonymousClass00H A0097 = C000200d.A00(r140.Aev);
                AnonymousClass00H A0098 = C000200d.A00(r140.AeJ);
                C26811To r813 = (C26811To) r140.AAf.get();
                C33251iW r714 = (C33251iW) r140.AB9.get();
                return new StickerInfoViewModel((C25311Ns) r140.A9R.get(), r714, r813, (C18030ve) r140.A04.get(), (AnonymousClass1SB) r140.AAS.get(), A0087, A0088, A0089, A0090, A0091, A0092, A0093, A0094, A0095, A0096, A0097, A0098, C000200d.A00(r140.Aju), (C18600wl) r140.A9E.get());
            case 398:
                AnonymousClass10E r413 = this.A00;
                return new C129286hY((AnonymousClass11S) r413.A63.get(), (C18030ve) r413.A04.get(), C000200d.A00(r413.A00.A2J), C000200d.A00(r413.A0Y));
            case 399:
                AnonymousClass10E r141 = this.A00;
                AnonymousClass1SB r912 = (AnonymousClass1SB) r141.AAS.get();
                C25311Ns r611 = (C25311Ns) r141.A9R.get();
                AnonymousClass00H A0099 = C000200d.A00(r141.A3w);
                return new StickerStorePackPreviewViewModel(r611, (C32431hB) r141.A66.get(), (C1185864a) r141.Ak1.get(), r912, (AnonymousClass10I) r141.AC1.get(), A0099, C000200d.A00(r141.AAN), C000200d.A00(r141.A31), C000200d.A00(r141.Ajt), (C18600wl) r141.A9E.get());
            default:
                throw new AssertionError(i);
        }
    }

    private Object A0E() {
        int i = this.A02;
        switch (i) {
            case 400:
                return new StorageUsageMediaGalleryViewModel((C18600wl) this.A00.A9E.get());
            case 401:
                AnonymousClass10E r8 = this.A00;
                AnonymousClass00H A002 = C000200d.A00(this.A01.A1n);
                C18030ve r82 = (C18030ve) r8.A04.get();
                C132636nD r9 = (C132636nD) r8.A00.A7p.get();
                AnonymousClass10I r10 = (AnonymousClass10I) r8.AC1.get();
                return new SupportAiViewModel((AnonymousClass1KB) r8.A4b.get(), (AnonymousClass1CJ) r8.A2H.get(), (AnonymousClass1NN) r8.A2q.get(), (AnonymousClass121) r8.A2y.get(), r82, r9, r10, A002, C000200d.A00(r8.AkJ));
            case 402:
                AnonymousClass10E r3 = this.A00;
                return new C130586jg(C000500i.A00(r3.Ao9), (AnonymousClass1NM) r3.A6D.get(), (C35551mQ) r3.A3C.get(), C000200d.A00(r3.AAV), C000200d.A00(r3.AkJ));
            case 403:
                AnonymousClass10E r1 = this.A00;
                return new SupportBkLayoutViewModel(C000200d.A00(r1.A0y), C000200d.A00(r1.AkJ));
            case 404:
                AnonymousClass10E r12 = this.A00;
                return new ToSGatingViewModel(C000200d.A00(r12.A04), C000200d.A00(r12.A63), C000200d.A00(r12.A00.ABT), C000200d.A00(r12.A5f), C000200d.A00(r12.AlK), C000200d.A00(r12.AAx));
            case 405:
                AnonymousClass10E r6 = this.A00;
                C18600wl r83 = (C18600wl) r6.A9E.get();
                AnonymousClass1OX r92 = (AnonymousClass1OX) r6.A9C.get();
                return new TranslationViewModel((AnonymousClass1NN) r6.A2q.get(), (AnonymousClass4RU) r6.AB0.get(), (AnonymousClass1W6) r6.A3w.get(), C000200d.A00(r6.ABl), r83, r92);
            case 406:
                AnonymousClass10E r13 = this.A00;
                AnonymousClass190 r4 = (AnonymousClass190) r13.A31.get();
                AnonymousClass10G A11 = r13.A00;
                return new UTwoNetViewModel(r4, (C18030ve) r13.A04.get(), (C25291Nq) r13.A6E.get(), C000200d.A00(A11.AIG), C000200d.A00(A11.AIH), (C18600wl) r13.A9E.get());
            case 407:
                AnonymousClass10E r14 = this.A00;
                AnonymousClass10I r15 = (AnonymousClass10I) r14.AC1.get();
                return new UpcomingActivityViewModel((AnonymousClass11S) r14.A63.get(), (AnonymousClass1M9) r14.A2f.get(), (AnonymousClass11P) r14.AAv.get(), (C18000vb) r14.ABz.get(), (AnonymousClass1MZ) r14.A4t.get(), (C27081Uq) r14.A9g.get(), (C25191Ng) r14.A4u.get(), (C40951vZ) r14.A9f.get(), r15);
            case 408:
                AnonymousClass10E r42 = this.A00;
                C37361pP A003 = this.A01.A7D;
                C19890zB A004 = C19880zA.A00();
                return new UpdatesAdvertiseViewModel(A003, A004, A004, (C19830z4) r42.ABl.get(), (AnonymousClass719) r42.A00.AHY.get(), (C32741hg) r42.AAL.get());
            case 409:
                AnonymousClass10E r102 = this.A00;
                AnonymousClass00H A005 = C000200d.A00(r102.A3w);
                C37381pR r16 = this.A01;
                AnonymousClass00H A006 = C000200d.A00(r16.A6j);
                AnonymousClass00H A007 = C000200d.A00(r102.ABM);
                AnonymousClass00H A008 = C000200d.A00(r16.A6f);
                AnonymousClass00H A009 = C000200d.A00(r102.A0x);
                C18600wl r18 = (C18600wl) r102.A9E.get();
                AnonymousClass1OX r19 = (AnonymousClass1OX) r102.A9C.get();
                AnonymousClass10I r122 = (AnonymousClass10I) r102.AC1.get();
                return new UserControlMessageLevelViewModel((AnonymousClass1KB) r102.A4b.get(), (C35761ml) r102.Als.get(), (AnonymousClass11E) r102.A2X.get(), (C18030ve) r102.A04.get(), (AnonymousClass1LU) r102.ABd.get(), (C138056wS) r16.A6m.get(), r122, A005, A006, A007, A008, A009, r18, r19);
            case 410:
                C37381pR r0 = this.A01;
                C52672bI A2G = r0.A2F();
                return new C55122fF(r0.A2D(), A2G, (C32021gV) this.A00.A6k.get());
            case 411:
                AnonymousClass10E r17 = this.A00;
                return new C128786gg(C000200d.A00(r17.A6N), C000200d.A00(r17.A4b), (C18600wl) r17.A9E.get());
            case 412:
                AnonymousClass10E r110 = this.A00;
                return new C138056wS((C18030ve) r110.A04.get(), C000200d.A00(r110.AFD));
            case 413:
                AnonymousClass10E r111 = this.A00;
                AnonymousClass00H A0010 = C000200d.A00(r111.AFD);
                return new UserControlStopResumeViewModel((C35761ml) r111.Als.get(), C000200d.A00(r111.ABM), A0010, (C18600wl) r111.A9E.get());
            case 414:
                AnonymousClass10E r112 = this.A00;
                return new UsernameNavigationViewModel((C47802Ka) r112.Am4.get(), (AnonymousClass4bI) r112.Am5.get());
            case 415:
                AnonymousClass10E r113 = this.A00;
                return new UsernamePinEntryViewModel((C678831f) r113.A00.A10.get(), (AnonymousClass118) r113.ABY.get(), (AnonymousClass1LU) r113.ABd.get(), (AnonymousClass4bI) r113.Am5.get(), (C18600wl) r113.A9E.get());
            case 416:
                AnonymousClass10E r114 = this.A00;
                C87674Wm r2 = (C87674Wm) r114.A00.ADe.get();
                return new UsernamePinSetViewModel((AnonymousClass118) r114.ABY.get(), r2, (AnonymousClass4bI) r114.Am5.get());
            case 417:
                AnonymousClass10E r115 = this.A00;
                return new UsernameSetSuccessDialogViewModel((AnonymousClass11S) r115.A63.get(), (C27191Vc) r115.A2i.get(), (AnonymousClass118) r115.ABY.get());
            case 418:
                AnonymousClass10E r116 = this.A00;
                return new UsernameSetViewModel((AnonymousClass11S) r116.A63.get(), (AnonymousClass118) r116.ABY.get(), C000200d.A00(r116.Am4), C000200d.A00(r116.Af8));
            case 419:
                AnonymousClass10E r117 = this.A00;
                return new UsernameSettingsViewModel((AnonymousClass11S) r117.A63.get(), (AnonymousClass4bI) r117.Am5.get(), C000200d.A00(r117.Am4));
            case 420:
                AnonymousClass10E r43 = this.A00;
                return new UsernameShareViewModel((AnonymousClass11S) r43.A63.get(), (AnonymousClass118) r43.ABY.get(), (AnonymousClass1LU) r43.ABd.get(), C000200d.A00(this.A01.A1X), C000200d.A00(r43.Am4), C000200d.A00(r43.Am5));
            case 421:
                AnonymousClass10E r118 = this.A00;
                return new C85374Nd(C000200d.A00(r118.A4b), C000200d.A00(r118.AAp), C000200d.A00(r118.ABY));
            case 422:
                AnonymousClass10E r119 = this.A00;
                return new UsernameStartConversationWithSettingsViewModel((AnonymousClass11S) r119.A63.get(), C000200d.A00(r119.AAf), C000200d.A00(r119.Am4), C000200d.A00(r119.Am5), (C18600wl) r119.A9E.get());
            case 423:
                AnonymousClass10E r22 = this.A00;
                return new UsernameViewModel((AnonymousClass11S) r22.A63.get(), (C108425bg) r22.Af8.get(), C000200d.A00(r22.Am4), C000200d.A00(this.A01.A79));
            case 424:
                return new C84924Lj((AnonymousClass18K) this.A00.A9B.get());
            case 425:
                AnonymousClass00H A0011 = C000200d.A00(this.A00.A1q);
                C37381pR r120 = this.A01;
                return new VariantsCarouselFragmentViewModel(A0011, C000200d.A00(r120.A71), C000200d.A00(r120.A1U));
            case 426:
                return new C182939Wh((C18030ve) this.A00.A04.get());
            case 427:
                C37381pR r02 = this.A01;
                AnonymousClass99I A1k = r02.A1j();
                AnonymousClass99H A1i = r02.A1h();
                AutoconfUseCase A1R = r02.A1Q();
                VerifySilentAuthUseCase A1d = r02.A1c();
                PasskeyUseCase A1X = r02.A1W();
                return new VerifyPhoneNumberViewModel(A1R, r02.A1S(), r02.A1U(), A1X, r02.A1Y(), A1d, A1i, A1k);
            case 428:
                AnonymousClass10E r62 = this.A00;
                AnonymousClass10G A112 = r62.A00;
                AnonymousClass00H A0012 = C000200d.A00(A112.AId);
                return new VideoComposerViewModel((C1403571b) A112.ABJ.get(), (C26431Sc) r62.AlU.get(), (C24641Lc) r62.AAB.get(), A0012, (C18600wl) r62.A9E.get(), (C18600wl) r62.A9F.get());
            case 429:
                AnonymousClass10E r121 = this.A00;
                AnonymousClass00H A0013 = C000200d.A00(r121.A8X);
                C18030ve r23 = (C18030ve) r121.A04.get();
                AnonymousClass10I r24 = (AnonymousClass10I) r121.AC1.get();
                C18600wl r26 = (C18600wl) r121.A9F.get();
                AnonymousClass1M9 r162 = (AnonymousClass1M9) r121.A2f.get();
                C24671Lf r172 = (C24671Lf) r121.A2g.get();
                C24921Me r182 = (C24921Me) r121.ABX.get();
                AnonymousClass1RW r192 = (AnonymousClass1RW) r121.A2u.get();
                AnonymousClass1TB r20 = (AnonymousClass1TB) r121.AGb.get();
                AnonymousClass1MZ r21 = (AnonymousClass1MZ) r121.A4t.get();
                AnonymousClass1TA r222 = (AnonymousClass1TA) r121.A5X.get();
                return new VoiceChatBottomSheetViewModel((AnonymousClass11S) r121.A63.get(), (C175258yP) r121.A1R.get(), (AnonymousClass1VP) r121.A1l.get(), (AnonymousClass1V7) r121.A97.get(), r162, r172, r182, r192, r20, r21, r222, r23, r24, A0013, r26, C27011Uj.A00());
            case 430:
                AnonymousClass10E r202 = this.A00;
                C18030ve r193 = (C18030ve) r202.A04.get();
                AnonymousClass11S r183 = (AnonymousClass11S) r202.A63.get();
                AnonymousClass118 r173 = (AnonymousClass118) r202.ABY.get();
                AnonymousClass10I r163 = (AnonymousClass10I) r202.AC1.get();
                C23661Hd A85 = AnonymousClass10E.A84(r202);
                AnonymousClass10G A113 = r202.A00;
                AnonymousClass00H A0014 = C000200d.A00(r202.A9k);
                AnonymousClass00S Axz = r202.A8t;
                AnonymousClass00S AIJ = A113.AFR;
                AnonymousClass00S APo = r202.Aej;
                AnonymousClass00S ASv = r202.Aek;
                AnonymousClass00H A0015 = C000200d.A00(r202.A7t);
                C129986ih A0m = this.A01.A0l();
                C143867Fc r203 = (C143867Fc) A113.AFD.get();
                AnonymousClass1V9 r223 = (AnonymousClass1V9) r202.A1e.get();
                C21141AfC afC = (C21141AfC) r202.ABO.get();
                AnonymousClass1M9 r242 = (AnonymousClass1M9) r202.A2f.get();
                AnonymousClass1PM r25 = (AnonymousClass1PM) r202.ABM.get();
                C24921Me r262 = (C24921Me) r202.ABX.get();
                return new VoiceChatGridViewModel((AnonymousClass1L9) r202.A0E.get(), (AnonymousClass190) r202.A31.get(), r183, (C175258yP) r202.A1R.get(), r203, A0m, r223, afC, r242, r25, r262, (AnonymousClass1RW) r202.A2u.get(), r173, (AnonymousClass1MZ) r202.A4t.get(), A85, r193, (AnonymousClass126) r202.A4h.get(), (C24901Mc) r202.AA5.get(), (AnonymousClass1DC) r202.A95.get(), r163, (VoipCameraManager) r202.ABQ.get(), A0014, A0015, Axz, AIJ, APo, ASv);
            case 431:
                AnonymousClass10E r123 = this.A00;
                return new WaBkFlowsLayoutViewModel((AnonymousClass11E) r123.A2X.get(), (C18030ve) r123.A04.get(), C000200d.A00(r123.A0y), C000200d.A00(r123.ABc));
            case 432:
                AnonymousClass10E r03 = this.A00;
                AnonymousClass00H A0016 = C000200d.A00(r03.ATv);
                C37381pR r27 = this.A01;
                AnonymousClass00H A0017 = C000200d.A00(r27.A3T);
                AnonymousClass00H A0018 = C000200d.A00(r03.AU0);
                AnonymousClass00H A0019 = C000200d.A00(r27.A3Q);
                AnonymousClass00H A0020 = C000200d.A00(r03.An3);
                C18600wl r272 = (C18600wl) r03.A9E.get();
                AnonymousClass1PM r124 = (AnonymousClass1PM) r03.ABM.get();
                AnonymousClass11P r132 = (AnonymousClass11P) r03.AAv.get();
                AnonymousClass122 r142 = (AnonymousClass122) r03.A2y.get();
                C18030ve r152 = (C18030ve) r03.A04.get();
                AnonymousClass18K r164 = (AnonymousClass18K) r03.A9B.get();
                C20051A4x a4x = (C20051A4x) r03.ATz.get();
                return new WaFlowsViewModel((C125506bB) r27.A3B.get(), (C125516bC) r27.A3C.get(), (C125526bD) r27.A3D.get(), (C33251iW) r03.ABA.get(), r124, r132, r142, r152, r164, a4x, A0016, A0017, A0018, A0019, A0020, C000200d.A00(r03.ATr), C000200d.A00(r03.An4), C000200d.A00(r03.A1O), C000200d.A00(r03.AmQ), r272);
            case 433:
                AnonymousClass10E r04 = this.A00;
                AnonymousClass00H A0021 = C000200d.A00(r04.ATf);
                AnonymousClass00H A0022 = C000200d.A00(r04.ATe);
                AnonymousClass00H A0023 = C000200d.A00(r04.Akv);
                AnonymousClass00H A0024 = C000200d.A00(r04.AdF);
                AnonymousClass00H A0025 = C000200d.A00(r04.ATv);
                AnonymousClass00H A0026 = C000200d.A00(r04.ATw);
                AnonymousClass00H A0027 = C000200d.A00(r04.A3w);
                AnonymousClass00H A0028 = C000200d.A00(r04.ATs);
                AnonymousClass00H A0029 = C000200d.A00(r04.AU0);
                AnonymousClass00H A0030 = C000200d.A00(r04.ATu);
                AnonymousClass118 r125 = (AnonymousClass118) r04.ABY.get();
                C196109uT r133 = (C196109uT) r04.AmQ.get();
                C19830z4 r143 = (C19830z4) r04.ABl.get();
                C30801eX r153 = (C30801eX) r04.AL8.get();
                C18030ve r165 = (C18030ve) r04.A04.get();
                C191319mO r174 = (C191319mO) r04.ATb.get();
                return new FlowsWebViewDataRepository((AnonymousClass1M9) r04.A2f.get(), (AnonymousClass1PM) r04.ABM.get(), (C27191Vc) r04.A2i.get(), (AnonymousClass11P) r04.AAv.get(), r125, r133, r143, r153, r165, r174, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, C000200d.A00(r04.ATt), (C18600wl) r04.A9E.get());
            case 434:
                C37381pR r126 = this.A01;
                return new AnonymousClass6g5((C125476b8) r126.A38.get(), (C125486b9) r126.A39.get(), (C125496bA) r126.A3A.get());
            case 435:
                return new C125476b8(this);
            case 436:
                return new C125486b9(this);
            case 437:
                return new C125496bA(this);
            case 438:
                return new C125506bB(this);
            case 439:
                return new C125516bC(this);
            case 440:
                return new C86364Ri((AnonymousClass73F) this.A00.A2Z.get());
            case 441:
                return new C125526bD(this);
            case 442:
                AnonymousClass10E r44 = this.A00;
                AnonymousClass00H A0031 = C000200d.A00(r44.AnJ);
                C27301Vn r28 = (C27301Vn) r44.A9A.get();
                AnonymousClass00H A0032 = C000200d.A00(r44.ABu);
                return new WfacBanViewModel(r28, (C33841jT) r44.A9T.get(), (AnonymousClass10I) r44.AC1.get(), A0031, A0032, C000200d.A00(r44.ABd));
            case 443:
                return new C37401pT(this);
            case 444:
                return new C37411pU(this);
            case 445:
                return new AnonymousClass34I(this, 1);
            default:
                throw new AssertionError(i);
        }
    }

    public Object get() {
        int i = this.A02;
        int i2 = i / 100;
        if (i2 == 0) {
            return A0A();
        }
        if (i2 == 1) {
            return A0B();
        }
        if (i2 == 2) {
            return A0C();
        }
        if (i2 == 3) {
            return A0D();
        }
        if (i2 == 4) {
            return A0E();
        }
        throw new AssertionError(i);
    }

    public static GoogleDriveNewUserSetupViewModel A02(AnonymousClass1NP r1, C196239ug r2, AnonymousClass11P r3, C19830z4 r4) {
        return new GoogleDriveNewUserSetupViewModel(r1, r2, r3, r4);
    }

    public static SettingsGoogleDriveViewModel A03(AnonymousClass1KB r1, AnonymousClass1NT r2, C36801oU r3, C196239ug r4, C36841oY r5, C36861oa r6, C199349zq r7, AnonymousClass11E r8, C19830z4 r9, C27431Wb r10, C18030ve r11, AnonymousClass18K r12, AnonymousClass10I r13, AnonymousClass00H r14) {
        return new SettingsGoogleDriveViewModel(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    }

    public static DateOfBirthCollectionViewModel A04(C131436l6 r1, AnonymousClass7Dh r2, AnonymousClass8BA r3) {
        return new DateOfBirthCollectionViewModel(r1, r2, r3);
    }

    public static DateOfBirthRemediationViewModel A05(C131446l7 r1, AnonymousClass7Dh r2, AnonymousClass8BA r3) {
        return new DateOfBirthRemediationViewModel(r1, r2, r3);
    }

    public static ReactionsTrayViewModel A06(AnonymousClass11S r1, AnonymousClass11C r2, AnonymousClass11P r3, AnonymousClass1CJ r4, C18030ve r5, C18010vc r6, C32731hf r7, C191569mo r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        return new ReactionsTrayViewModel(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    public static NewDeviceConfirmationRegistrationViewModel A07(C19880zA r1, AnonymousClass11P r2, AnonymousClass118 r3, C27301Vn r4, C19830z4 r5, AnonymousClass1LU r6, C33841jT r7, AnonymousClass1CM r8, C33641j9 r9, C134076py r10, AnonymousClass10I r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        return new NewDeviceConfirmationRegistrationViewModel(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    }

    public static SettingsDataUsageViewModel A08(AnonymousClass1KB r1, AnonymousClass1HQ r2, AnonymousClass1L7 r3, C18030ve r4, AnonymousClass10I r5, AnonymousClass00H r6) {
        return new SettingsDataUsageViewModel(r1, r2, r3, r4, r5, r6);
    }

    public static ShopsBkLayoutViewModel A09(AnonymousClass11E r1, AnonymousClass00H r2) {
        return new ShopsBkLayoutViewModel(r1, r2);
    }
}
