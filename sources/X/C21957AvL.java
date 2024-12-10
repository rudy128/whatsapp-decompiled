package X;

import com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto;

/* renamed from: X.AvL  reason: case insensitive filesystem */
public final class C21957AvL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ViewNewsletterProfilePhoto this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21957AvL(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto) {
        super(0);
        this.this$0 = viewNewsletterProfilePhoto;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.setResult(-1);
        ViewNewsletterProfilePhoto viewNewsletterProfilePhoto = this.this$0;
        ViewNewsletterProfilePhoto.A0V(viewNewsletterProfilePhoto, viewNewsletterProfilePhoto.getIntent().getBooleanExtra("open_pic_selection_sheet", false));
        if (this.this$0.getIntent().getBooleanExtra("open_pic_selection_sheet", false)) {
            AnonymousClass4FQ.A00(this.this$0);
        }
        return C27621Wu.A00;
    }
}
