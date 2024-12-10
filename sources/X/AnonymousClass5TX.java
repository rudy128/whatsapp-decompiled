package X;

import com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment;
import java.util.List;

/* renamed from: X.5TX  reason: invalid class name */
public final class AnonymousClass5TX extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoMembersSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TX(NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment) {
        super(1);
        this.this$0 = newsletterInfoMembersSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = this.this$0;
        C73073Ow r1 = newsletterInfoMembersSearchFragment.A07;
        if (r1 != null) {
            C76823oU r0 = newsletterInfoMembersSearchFragment.A06;
            if (r0 == null) {
                str = "newsletterInfoViewModel";
            } else {
                C46162Dk r02 = r0.A00;
                if (r02 == null) {
                    str = "newsletterInfo";
                } else {
                    r1.A01(r02.A02, list);
                    return C27621Wu.A00;
                }
            }
        } else {
            str = "adapter";
        }
        C18070vi.A11(str);
        throw null;
    }
}
