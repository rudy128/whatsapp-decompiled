package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.SectionHeaderView;
import com.whatsapp.newsletter.insights.NewsletterInsightsActivity;
import com.whatsapp.newsletter.insights.view.InsightsItemView;
import com.whatsapp.newsletter.insights.view.chart.LineChartView;

/* renamed from: X.3Ws  reason: invalid class name and case insensitive filesystem */
public final class C73633Ws extends C38391rD {
    public final /* synthetic */ NewsletterInsightsActivity A00;

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        C18070vi.A0d(r10, 0);
        NewsletterInsightsActivity newsletterInsightsActivity = this.A00;
        AnonymousClass4VW r7 = (AnonymousClass4VW) AnonymousClass000.A0w(AnonymousClass3MW.A12(newsletterInsightsActivity.A0A), i);
        if (r7 != null) {
            View view = r10.A0H;
            C18070vi.A0W(view);
            AnonymousClass3VG r8 = newsletterInsightsActivity.A06;
            if (r8 == null) {
                C18070vi.A11("newsletterInsightsViewModel");
                throw null;
            }
            C90054dS r4 = new C90054dS(newsletterInsightsActivity, 49);
            if (r7 instanceof AnonymousClass43Z) {
                SectionHeaderView sectionHeaderView = (SectionHeaderView) view.findViewById(2131431686);
                C18070vi.A0b(sectionHeaderView);
                r7.A05(newsletterInsightsActivity, sectionHeaderView, 1, 3);
                SectionHeaderView sectionHeaderView2 = (SectionHeaderView) view.findViewById(2131431693);
                C18070vi.A0b(sectionHeaderView2);
                r7.A05(newsletterInsightsActivity, sectionHeaderView2, 3, 4);
            } else if (r7 instanceof AnonymousClass43a) {
                AnonymousClass43a r3 = (AnonymousClass43a) r7;
                r3.A03 = (InsightsItemView) view.findViewById(2131431677);
                r3.A02 = (InsightsItemView) view.findViewById(2131431674);
                r3.A04 = (InsightsItemView) view.findViewById(2131431679);
                r3.A05 = (LineChartView) view.findViewById(2131431676);
                r3.A00 = view.findViewById(2131431672);
                r3.A01 = C17880vN.A0E(view, 2131431673);
                SectionHeaderView sectionHeaderView3 = (SectionHeaderView) view.findViewById(2131431675);
                C18070vi.A0b(sectionHeaderView3);
                r3.A05(newsletterInsightsActivity, sectionHeaderView3, 2, 5);
                LineChartView lineChartView = r3.A05;
                if (lineChartView != null) {
                    lineChartView.A0A = r3;
                }
            } else {
                SectionHeaderView sectionHeaderView4 = (SectionHeaderView) view.findViewById(2131431695);
                C18070vi.A0b(sectionHeaderView4);
                r7.A05(newsletterInsightsActivity, sectionHeaderView4, 5, 10);
                SectionHeaderView sectionHeaderView5 = (SectionHeaderView) view.findViewById(2131431693);
                C18070vi.A0b(sectionHeaderView5);
                r7.A05(newsletterInsightsActivity, sectionHeaderView5, 4, 6);
            }
            C91634g0.A00(newsletterInsightsActivity, r8.A00, new AnonymousClass5VY(r4, view, newsletterInsightsActivity, r7, r8), 3);
        }
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        int i2;
        C18070vi.A0d(viewGroup, 0);
        NewsletterInsightsActivity newsletterInsightsActivity = this.A00;
        AnonymousClass4VW r2 = (AnonymousClass4VW) AnonymousClass000.A0w(AnonymousClass3MW.A12(newsletterInsightsActivity.A0A), i);
        if (r2 != null) {
            LayoutInflater layoutInflater = newsletterInsightsActivity.getLayoutInflater();
            if (r2 instanceof AnonymousClass43Z) {
                i2 = 2131626222;
            } else if (r2 instanceof AnonymousClass43a) {
                i2 = 2131626221;
            } else {
                i2 = 2131626220;
            }
            return new C74033Yg(AnonymousClass3MY.A0E(layoutInflater, viewGroup, i2), this);
        }
        throw AnonymousClass001.A13("Invalid tab type: ", AnonymousClass000.A10(), i);
    }

    public int getItemViewType(int i) {
        return i;
    }

    public C73633Ws(NewsletterInsightsActivity newsletterInsightsActivity) {
        this.A00 = newsletterInsightsActivity;
    }

    public int A0Q() {
        return AnonymousClass3MW.A12(this.A00.A0A).size();
    }
}
