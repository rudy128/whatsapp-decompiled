package com.whatsapp.newsletter.multiadmin;

import X.AFC;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XK;
import X.AnonymousClass5OG;
import X.C137506vZ;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C24751Ln;
import X.C24921Me;
import X.C27201Vd;
import X.C29351c6;
import X.C72043Kk;
import X.C821943q;
import X.C85864Pa;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class NewsletterInvitedAdminsFragment extends Hilt_NewsletterInvitedAdminsFragment {
    public C85864Pa A00;
    public C72043Kk A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public C27201Vd A04;
    public C18000vb A05;
    public C24751Ln A06;
    public AnonymousClass3XK A07;
    public final C18100vl A08 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5OG(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626223, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        Toolbar toolbar = (Toolbar) view.findViewById(2131436270);
        C137506vZ.A00(toolbar);
        toolbar.setNavigationContentDescription(2131898718);
        toolbar.setTitle(2131894265);
        toolbar.setNavigationOnClickListener(new AFC(this, 3));
        RecyclerView A0Q = AnonymousClass3MX.A0Q(view, 2131433747);
        C85864Pa r6 = this.A00;
        if (r6 != null) {
            AnonymousClass1FL A1B = A1B();
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
            NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A1B;
            LayoutInflater A16 = A16();
            C18070vi.A0X(A16);
            C27201Vd r2 = this.A04;
            if (r2 != null) {
                this.A07 = r6.A00(A16, r2.A06(A14(), "newsletter-invited-admins"), newsletterInfoActivity, true);
                List A11 = AnonymousClass3MW.A11(this.A08);
                ArrayList A0D = C29351c6.A0D(A11);
                Iterator it = A11.iterator();
                while (it.hasNext()) {
                    AnonymousClass1BI A0Q2 = C17880vN.A0Q(it);
                    AnonymousClass1M9 r0 = this.A02;
                    if (r0 != null) {
                        A0D.add(new C821943q(r0.A0H(A0Q2)));
                    } else {
                        str = "contactManager";
                    }
                }
                AnonymousClass3XK r02 = this.A07;
                if (r02 != null) {
                    r02.A0U(A0D);
                    AnonymousClass3Ma.A15(A0Q.getContext(), A0Q);
                    AnonymousClass3XK r03 = this.A07;
                    if (r03 != null) {
                        A0Q.setAdapter(r03);
                        return;
                    }
                }
                C18070vi.A11("newsletterInvitedAdminsListAdapter");
                throw null;
            }
            str = "contactPhotos";
        } else {
            str = "newsletterInvitedAdminsListAdapterFactory";
        }
        C18070vi.A11(str);
        throw null;
    }
}
