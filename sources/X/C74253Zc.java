package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.gallery.LinksGalleryFragment;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.Set;

/* renamed from: X.3Zc  reason: invalid class name and case insensitive filesystem */
public class C74253Zc extends C42011xT {
    public AnonymousClass206 A00;
    public String A01;
    public Set A02;
    public C80423x7 A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;
    public final WebPagePreviewView A08;
    public final LinearLayout A09;
    public final /* synthetic */ LinksGalleryFragment A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74253Zc(View view, LinksGalleryFragment linksGalleryFragment) {
        super(view);
        this.A0A = linksGalleryFragment;
        this.A06 = AnonymousClass3MW.A0J(view, 2131432683);
        View A062 = AnonymousClass1HF.A06(view, 2131432684);
        View A063 = AnonymousClass1HF.A06(view, 2131435579);
        this.A05 = A063;
        View A064 = AnonymousClass1HF.A06(view, 2131431907);
        this.A04 = A064;
        this.A09 = AnonymousClass3MX.A0K(view, 2131432667);
        TextView A0J = AnonymousClass3MW.A0J(view, 2131435948);
        this.A07 = A0J;
        this.A08 = (WebPagePreviewView) AnonymousClass1HF.A06(view, 2131432020);
        A064.setVisibility(8);
        A063.setVisibility(8);
        A0J.setVisibility(8);
        C89944dH.A00(A062, this, 26);
        C89944dH.A00(view, this, 27);
        C90274do.A00(view, this, 15);
    }

    public void A0B(AnonymousClass206 r19, int i) {
        int i2;
        AnonymousClass206 r15 = r19;
        this.A00 = r15;
        C80423x7 r0 = this.A03;
        if (r0 != null) {
            r0.A00.A01();
        }
        WebPagePreviewView webPagePreviewView = this.A08;
        if (r15 instanceof AnonymousClass210) {
            i2 = ((AnonymousClass210) r15).A01;
        } else {
            i2 = 0;
        }
        webPagePreviewView.A0L(i2);
        TextView textView = this.A06;
        AnonymousClass3MW.A1S(textView);
        webPagePreviewView.setLinkTitle((CharSequence) null);
        webPagePreviewView.A0K.setVisibility(8);
        View view = this.A05;
        view.setVisibility(8);
        View view2 = this.A04;
        view2.setVisibility(8);
        webPagePreviewView.setLinkHostname((String) null);
        webPagePreviewView.setLinkGifSize(0);
        TextView textView2 = this.A07;
        textView2.setVisibility(8);
        LinksGalleryFragment linksGalleryFragment = this.A0A;
        boolean Bfa = C72453Mb.A0j(linksGalleryFragment).Bfa(r15);
        View view3 = this.A0H;
        if (Bfa) {
            ((FrameLayout) view3).setForeground(new ColorDrawable(C19740yt.A00(linksGalleryFragment.A14(), 2131101945)));
            view3.setSelected(true);
        } else {
            ((FrameLayout) view3).setForeground((Drawable) null);
            view3.setSelected(false);
        }
        textView2.setVisibility(C72453Mb.A0F(this.A02));
        boolean z = true;
        if (1 != r15.A0C()) {
            z = false;
        }
        boolean z2 = r15.A0q;
        if (z) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
        if (z2) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        if (z && z2) {
            int dimensionPixelSize = AnonymousClass3MZ.A09(linksGalleryFragment).getDimensionPixelSize(2131167234);
            LinearLayout linearLayout = this.A09;
            linearLayout.setPadding(dimensionPixelSize, linearLayout.getPaddingTop(), 0, 0);
        }
        C37471pb r1 = linksGalleryFragment.A02;
        Context A14 = linksGalleryFragment.A14();
        C32011gU r14 = linksGalleryFragment.A08;
        C80423x7 r8 = new C80423x7(A14, textView, linksGalleryFragment.A05, linksGalleryFragment.A05, linksGalleryFragment.A06, r14, r15, C72453Mb.A0j(linksGalleryFragment).getSearchTerms(), i);
        this.A03 = r8;
        r1.A00(new C95244lv(this, 0), r8);
    }
}
