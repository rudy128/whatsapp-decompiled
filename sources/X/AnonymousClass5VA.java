package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.product.newsletterenforcements.userreports.list.NewsletterUserReportsListFragment;
import java.util.List;

/* renamed from: X.5VA  reason: invalid class name */
public final class AnonymousClass5VA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ View $rootView;
    public final /* synthetic */ NewsletterUserReportsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VA(View view, NewsletterUserReportsListFragment newsletterUserReportsListFragment) {
        super(1);
        this.this$0 = newsletterUserReportsListFragment;
        this.$rootView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C28931bI r0;
        AnonymousClass5YG r7 = (AnonymousClass5YG) obj;
        NewsletterUserReportsListFragment newsletterUserReportsListFragment = this.this$0;
        C28931bI r02 = newsletterUserReportsListFragment.A05;
        if (r02 != null) {
            r02.A04(8);
        }
        C28931bI r03 = newsletterUserReportsListFragment.A04;
        if (r03 != null) {
            r03.A04(8);
        }
        C28931bI r04 = newsletterUserReportsListFragment.A03;
        if (r04 != null) {
            r04.A04(8);
        }
        RecyclerView recyclerView = newsletterUserReportsListFragment.A00;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        if (r7 instanceof C97244p9) {
            r0 = this.this$0.A05;
        } else {
            if (r7 instanceof C97214p6) {
                RecyclerView recyclerView2 = this.this$0.A00;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
                NewsletterUserReportsListFragment newsletterUserReportsListFragment2 = this.this$0;
                List list = ((C97214p6) r7).A00;
                AnonymousClass4KE r05 = newsletterUserReportsListFragment2.A01;
                if (r05 != null) {
                    C105915Tv r3 = new C105915Tv(newsletterUserReportsListFragment2);
                    AnonymousClass10E r06 = r05.A00.A02;
                    C73533Wi r2 = new C73533Wi(AnonymousClass10E.A6Q(r06), AnonymousClass3Ma.A0d(r06), r3);
                    RecyclerView recyclerView3 = newsletterUserReportsListFragment2.A00;
                    if (recyclerView3 != null) {
                        recyclerView3.setAdapter(r2);
                        AnonymousClass3Ma.A15(newsletterUserReportsListFragment2.A14(), recyclerView3);
                    }
                    r2.A00 = C98924rw.A00(list, 14);
                    r2.notifyDataSetChanged();
                } else {
                    C18070vi.A11("reportsListAdapterFactory");
                    throw null;
                }
            } else if (r7 instanceof C97254pA) {
                r0 = this.this$0.A04;
            } else if ((r7 instanceof C97224p7) || (r7 instanceof C97234p8)) {
                C28931bI r07 = this.this$0.A03;
                if (r07 != null) {
                    r07.A04(0);
                }
                TextView A0E = C17880vN.A0E(this.$rootView, 2131430780);
                int i = 2131892757;
                if (r7 instanceof C97234p8) {
                    i = 2131892758;
                }
                A0E.setText(i);
                C89964dJ.A00(this.$rootView.findViewById(2131430781), this.this$0, 28);
            }
            return C27621Wu.A00;
        }
        if (r0 != null) {
            r0.A04(0);
        }
        return C27621Wu.A00;
    }
}
