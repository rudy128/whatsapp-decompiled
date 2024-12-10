package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity;

/* renamed from: X.5JJ  reason: invalid class name */
public final class AnonymousClass5JJ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ NewsletterTransferOwnershipActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5JJ(NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity) {
        super(0);
        this.this$0 = newsletterTransferOwnershipActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return UserJid.Companion.A04(this.this$0.getIntent().getStringExtra("transfer_ownership_admin_jid"));
    }
}
