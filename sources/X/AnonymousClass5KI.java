package X;

import com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoActivity;

/* renamed from: X.5KI  reason: invalid class name */
public final class AnonymousClass5KI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ NewsletterCopyrightSuspensionInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5KI(NewsletterCopyrightSuspensionInfoActivity newsletterCopyrightSuspensionInfoActivity) {
        super(0);
        this.this$0 = newsletterCopyrightSuspensionInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        NewsletterCopyrightSuspensionInfoActivity newsletterCopyrightSuspensionInfoActivity = this.this$0;
        AnonymousClass5KH r11 = new AnonymousClass5KH(newsletterCopyrightSuspensionInfoActivity);
        C105885Ts r12 = new C105885Ts(newsletterCopyrightSuspensionInfoActivity);
        AnonymousClass5ZI r2 = newsletterCopyrightSuspensionInfoActivity.A01;
        if (r2 != null) {
            C88524a2 BGL = r2.BGL(newsletterCopyrightSuspensionInfoActivity, newsletterCopyrightSuspensionInfoActivity.getSupportFragmentManager(), AnonymousClass68H.A01(newsletterCopyrightSuspensionInfoActivity.A05));
            AnonymousClass4SX r0 = newsletterCopyrightSuspensionInfoActivity.A02;
            if (r0 != null) {
                C94584kr r6 = new C94584kr(newsletterCopyrightSuspensionInfoActivity, r0);
                C27201Vd r4 = newsletterCopyrightSuspensionInfoActivity.A00;
                if (r4 != null) {
                    C18030ve r7 = newsletterCopyrightSuspensionInfoActivity.A0E;
                    C18070vi.A0W(r7);
                    C36401np r10 = newsletterCopyrightSuspensionInfoActivity.A06;
                    if (r10 != null) {
                        AnonymousClass1LU r8 = newsletterCopyrightSuspensionInfoActivity.A04;
                        if (r8 != null) {
                            return new AnonymousClass3X8(newsletterCopyrightSuspensionInfoActivity, r4, BGL, r6, r7, r8, AnonymousClass3MX.A0o(newsletterCopyrightSuspensionInfoActivity.A0A), r10, r11, r12);
                        }
                        str = "waIntents";
                    } else {
                        str = "linkifier";
                    }
                } else {
                    str = "contactPhotos";
                }
            } else {
                str = "conversationRowCustomizers";
            }
        } else {
            str = "conversationRowInflaterFactory";
        }
        C18070vi.A11(str);
        throw null;
    }
}
