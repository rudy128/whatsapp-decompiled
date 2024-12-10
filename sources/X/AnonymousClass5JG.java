package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;

/* renamed from: X.5JG  reason: invalid class name */
public final class AnonymousClass5JG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ InviteNewsletterAdminSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5JG(InviteNewsletterAdminSelector inviteNewsletterAdminSelector) {
        super(0);
        this.this$0 = inviteNewsletterAdminSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return C72453Mb.A0x(this.this$0.getIntent(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }
}
