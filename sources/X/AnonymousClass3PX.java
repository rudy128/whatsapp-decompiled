package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.3PX  reason: invalid class name */
public final class AnonymousClass3PX extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass1LU A00;
    public C36401np A01;
    public AnonymousClass00H A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public final WDSBanner A05;

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setParentGroupObservers(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWaIntents(AnonymousClass1LU r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public final AnonymousClass00H getParentGroupObservers() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("parentGroupObservers");
        throw null;
    }

    public final AnonymousClass1LU getWaIntents() {
        AnonymousClass1LU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public AnonymousClass3PX(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A01 = AnonymousClass3MY.A0e(A0O.A00);
            this.A02 = C000200d.A00(A0O.A7s);
            this.A00 = AnonymousClass3MY.A0Z(A0O);
        }
        View.inflate(getContext(), 2131626964, this);
        setId(2131435458);
        C72473Md.A10(this);
        setPadding(getResources().getDimensionPixelSize(2131168774), 0, AnonymousClass3Ma.A02(this, 2131168774), 0);
        WDSBanner wDSBanner = (WDSBanner) C18070vi.A05(this, 2131435457);
        this.A05 = wDSBanner;
        SpannableStringBuilder A0A = AnonymousClass3MY.A0A(context, getLinkifier(), new C21422Ajp(11), getResources().getString(2131896152), "open-creation");
        AnonymousClass4XT r2 = new AnonymousClass4XT();
        r2.A02 = new AnonymousClass4AB(new AnonymousClass4AG(2131233343));
        AnonymousClass4XT.A00(wDSBanner, r2, A0A);
        C89894dC.A00(wDSBanner, this, 42);
        wDSBanner.setOnDismissListener((C18090vk) new AnonymousClass5FT(this));
    }
}
