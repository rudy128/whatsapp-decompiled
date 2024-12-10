package X;

import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;

/* renamed from: X.DtD  reason: case insensitive filesystem */
public final class C28195DtD extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C22821Di $onContactClick;
    public final /* synthetic */ C18090vk $onOpenPermissionClick;
    public final /* synthetic */ C18090vk $onRenderedCallback;
    public final /* synthetic */ C18090vk $onShareLinkClick;
    public final /* synthetic */ C36711oL $scrollPerfLoggerManager;
    public final /* synthetic */ boolean $shouldHideShareLink;
    public final /* synthetic */ InviteNonWhatsAppContactPickerViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28195DtD(InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel, C36711oL r3, C18090vk r4, C18090vk r5, C18090vk r6, C22821Di r7, int i, boolean z) {
        super(2);
        this.$viewModel = inviteNonWhatsAppContactPickerViewModel;
        this.$onContactClick = r7;
        this.$onShareLinkClick = r4;
        this.$onOpenPermissionClick = r5;
        this.$scrollPerfLoggerManager = r3;
        this.$onRenderedCallback = r6;
        this.$shouldHideShareLink = z;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn A0b = AnonymousClass000.A0b(obj, obj2);
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.$viewModel;
        C22821Di r7 = this.$onContactClick;
        C18090vk r4 = this.$onShareLinkClick;
        C18090vk r5 = this.$onOpenPermissionClick;
        C24638CCy.A00(A0b, inviteNonWhatsAppContactPickerViewModel, this.$scrollPerfLoggerManager, r4, r5, this.$onRenderedCallback, r7, AnonymousClass0L8.A00(this.$$changed), this.$shouldHideShareLink);
        return C27621Wu.A00;
    }
}
