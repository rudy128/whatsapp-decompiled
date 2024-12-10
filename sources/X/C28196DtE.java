package X;

import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;

/* renamed from: X.DtE  reason: case insensitive filesystem */
public final class C28196DtE extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onContactClick;
    public final /* synthetic */ C18090vk $onShareLinkClick;
    public final /* synthetic */ C36711oL $scrollPerfLoggerManager;
    public final /* synthetic */ boolean $shouldHideShareLink;
    public final /* synthetic */ InviteNonWhatsAppContactPickerViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28196DtE(C17090tj r2, InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel, C36711oL r4, C18090vk r5, C22821Di r6, int i, int i2, boolean z) {
        super(2);
        this.$viewModel = inviteNonWhatsAppContactPickerViewModel;
        this.$onContactClick = r6;
        this.$onShareLinkClick = r5;
        this.$modifier = r2;
        this.$shouldHideShareLink = z;
        this.$scrollPerfLoggerManager = r4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn A0b = AnonymousClass000.A0b(obj, obj2);
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.$viewModel;
        C22821Di r6 = this.$onContactClick;
        C18090vk r5 = this.$onShareLinkClick;
        CD0.A00(A0b, this.$modifier, inviteNonWhatsAppContactPickerViewModel, this.$scrollPerfLoggerManager, r5, r6, AnonymousClass0L8.A00(this.$$changed), this.$$default, this.$shouldHideShareLink);
        return C27621Wu.A00;
    }
}
