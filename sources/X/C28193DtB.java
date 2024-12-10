package X;

import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;

/* renamed from: X.DtB  reason: case insensitive filesystem */
public final class C28193DtB extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $onContactClick;
    public final /* synthetic */ C18090vk $onOpenPermissionClick;
    public final /* synthetic */ C18090vk $onRenderedCallback;
    public final /* synthetic */ C18090vk $onShareLinkClick;
    public final /* synthetic */ C36711oL $scrollPerfLoggerManager;
    public final /* synthetic */ boolean $shouldHideShareLink = false;
    public final /* synthetic */ InviteNonWhatsAppContactPickerViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28193DtB(InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel, C36711oL r3, C18090vk r4, C18090vk r5, C18090vk r6, C22821Di r7) {
        super(2);
        this.$viewModel = inviteNonWhatsAppContactPickerViewModel;
        this.$onContactClick = r7;
        this.$onShareLinkClick = r4;
        this.$onOpenPermissionClick = r5;
        this.$scrollPerfLoggerManager = r3;
        this.$onRenderedCallback = r6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn r10 = (C17130tn) obj;
        if (BE7.A07(obj2) != 2 || !r10.BZO()) {
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.$viewModel;
            C22821Di r7 = this.$onContactClick;
            C25349Ce8.A00(r10, AnonymousClass0LC.A00(r10, new C28192DtA(inviteNonWhatsAppContactPickerViewModel, this.$scrollPerfLoggerManager, this.$onShareLinkClick, this.$onOpenPermissionClick, this.$onRenderedCallback, r7, this.$shouldHideShareLink), -153484167), 6);
        } else {
            r10.CNR();
        }
        return C27621Wu.A00;
    }
}
