package X;

import androidx.appcompat.widget.SearchView;
import com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment;

/* renamed from: X.5O9  reason: invalid class name */
public final class AnonymousClass5O9 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ SearchView $searchView;
    public final /* synthetic */ NewsletterInfoMembersSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5O9(SearchView searchView, NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment) {
        super(0);
        this.this$0 = newsletterInfoMembersSearchFragment;
        this.$searchView = searchView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = this.this$0;
        SearchView searchView = this.$searchView;
        C18070vi.A0b(searchView);
        if (newsletterInfoMembersSearchFragment.A09) {
            searchView.A0H();
            newsletterInfoMembersSearchFragment.A09 = false;
        } else {
            AnonymousClass1L4 r0 = newsletterInfoMembersSearchFragment.A08;
            if (r0 != null) {
                r0.A01(searchView);
            } else {
                C18070vi.A11("imeUtils");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
