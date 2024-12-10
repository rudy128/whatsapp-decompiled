package X;

import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;

/* renamed from: X.5JE  reason: invalid class name */
public final class AnonymousClass5JE extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ InviteNewsletterAdminSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5JE(InviteNewsletterAdminSelector inviteNewsletterAdminSelector) {
        super(0);
        this.this$0 = inviteNewsletterAdminSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return C22971Dz.A0A(AnonymousClass1BI.class, this.this$0.getIntent().getStringArrayListExtra("invited_admins_jids"));
    }
}
