package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.community.subgroup.views.CommunityNavigationItem;

/* renamed from: X.27A  reason: invalid class name */
public final class AnonymousClass27A extends LinearLayout implements AnonymousClass009 {
    public C18000vb A00;
    public C18030ve A01;
    public AnonymousClass4ZS A02;
    public AnonymousClass00H A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final C28931bI A06;
    public final C28931bI A07;

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setLargeNumberFormatter(AnonymousClass4ZS r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWaIntents(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public static final void A00(C87184Up r6, AnonymousClass27A r7, C28931bI r8) {
        int i;
        Integer num = r6.A03;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        CommunityNavigationItem communityNavigationItem = (CommunityNavigationItem) r8.A02();
        communityNavigationItem.setVisibility(0);
        communityNavigationItem.setIcon(2131233223);
        communityNavigationItem.setTitle(2131888614);
        Resources A0Y = AnonymousClass000.A0Y(communityNavigationItem);
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, i, 0);
        communityNavigationItem.setDescription(A0Y.getQuantityString(2131755067, i, objArr));
        communityNavigationItem.setOnClickListener(new AnonymousClass48j(communityNavigationItem, r7, r6, 12));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final AnonymousClass4ZS getLargeNumberFormatter() {
        AnonymousClass4ZS r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("largeNumberFormatter");
        throw null;
    }

    public final AnonymousClass00H getWaIntents() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waIntents");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("whatsAppLocale");
        throw null;
    }

    public AnonymousClass27A(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            this.A01 = AnonymousClass10E.A8r(r1);
            this.A02 = (AnonymousClass4ZS) r1.A00.A2v.get();
            this.A03 = C000200d.A00(r1.ABd);
            this.A00 = AnonymousClass10E.A6Q(r1);
        }
        View.inflate(getContext(), 2131624596, this);
        setId(2131429266);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167078);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A06 = C28931bI.A00(this, 2131430882);
        this.A07 = C28931bI.A00(this, 2131434997);
    }
}
