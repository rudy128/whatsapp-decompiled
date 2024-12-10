package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.conversation.carousel.CarouselView;
import java.util.ArrayList;

/* renamed from: X.3to  reason: invalid class name and case insensitive filesystem */
public final class C78863to extends C78723tS {
    public C32951i1 A00;
    public AnonymousClass00H A01;
    public ArrayList A02;

    public void A2o() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C79103uS.A1G(this);
    }

    public final void setBotGating(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setChatMessageCounts(C32951i1 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass00H getBotGating() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("botGating");
        throw null;
    }

    public final C32951i1 getChatMessageCounts() {
        C32951i1 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatMessageCounts");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78863to(Context context, C108875cR r4, AnonymousClass210 r5) {
        super(context, r4, r5);
        C18070vi.A0j(context, r5);
        A1M();
        CarouselView providerLinkCarousel = getProviderLinkCarousel();
        providerLinkCarousel.setVisibility(0);
        providerLinkCarousel.setAdapter(this.A06);
        providerLinkCarousel.A14();
        this.A00 = providerLinkCarousel;
        A2u();
        A2i();
        A2v(r5);
    }

    private final CarouselView getProviderLinkCarousel() {
        ViewStub A0F = AnonymousClass3MW.A0F(this, 2131428855);
        if (A0F != null) {
            A0F.inflate();
        }
        return (CarouselView) AnonymousClass3MX.A0C(this, 2131429575);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2i() {
        /*
            r10 = this;
            super.A2i()
            r0 = 2131428855(0x7f0b05f7, float:1.8479366E38)
            android.view.ViewStub r0 = X.AnonymousClass3MW.A0F(r10, r0)
            if (r0 == 0) goto L_0x000f
            r0.inflate()
        L_0x000f:
            X.206 r0 = r10.A0I
            X.C18070vi.A0X(r0)
            X.36i r3 = X.AnonymousClass2UX.A00(r0)
            if (r3 == 0) goto L_0x00e6
            X.9Ic r7 = r3.A01
            if (r7 == 0) goto L_0x00e6
            r0 = 2131434214(0x7f0b1ae6, float:1.8490236E38)
            android.widget.ImageView r2 = X.AnonymousClass3MW.A0H(r10, r0)
            if (r2 == 0) goto L_0x00e6
            r0 = 2131434971(0x7f0b1ddb, float:1.849177E38)
            android.widget.TextView r9 = X.C17880vN.A0E(r10, r0)
            if (r9 == 0) goto L_0x00e6
            r2.clearColorFilter()
            r8 = 0
            r2.setPadding(r8, r8, r8, r8)
            X.9Ic r0 = X.C179479Ic.BING
            if (r7 != r0) goto L_0x007e
            r1 = 2131231101(0x7f08017d, float:1.8078274E38)
        L_0x003e:
            r2.setImageResource(r1)
        L_0x0041:
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x0048
            r9.setText(r0)
        L_0x0048:
            X.4rF r6 = X.C98494rF.A00()
            X.206 r0 = r10.A0I
            X.C18070vi.A0X(r0)
            X.36i r0 = X.AnonymousClass2UX.A00(r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x00e6
            r6.element = r0
            r0 = 2131429127(0x7f0b0707, float:1.8479918E38)
            android.view.View r5 = r10.findViewById(r0)
            if (r5 == 0) goto L_0x00e6
            android.content.Context r3 = r10.getContext()
            int r2 = r7.ordinal()
            r0 = -1
            r1 = 2
            r4 = 1
            if (r2 == r0) goto L_0x00c0
            if (r2 == r4) goto L_0x00c4
            if (r2 == r8) goto L_0x00bc
            if (r2 == r1) goto L_0x00c0
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x007e:
            X.9Ic r0 = X.C179479Ic.GOOGLE
            if (r7 != r0) goto L_0x0041
            X.00H r0 = r10.getBotGating()
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            X.0ve r4 = r0.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 10665(0x29a9, float:1.4945E-41)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            r1 = 2131231539(0x7f080333, float:1.8079162E38)
            if (r0 == 0) goto L_0x003e
            r0 = 2131233425(0x7f080a91, float:1.8082987E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r10.getContext()
            r0 = 2131101293(0x7f06066d, float:1.7814992E38)
            int r0 = X.C19740yt.A00(r1, r0)
            X.AnonymousClass4aX.A0D(r2, r0)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131168558(0x7f070d2e, float:1.7951421E38)
            int r0 = X.AnonymousClass3MW.A01(r1, r0)
            r2.setPadding(r0, r0, r0, r0)
            goto L_0x0041
        L_0x00bc:
            r0 = 2131892114(0x7f121792, float:1.9418967E38)
            goto L_0x00c7
        L_0x00c0:
            r0 = 2131892206(0x7f1217ee, float:1.9419154E38)
            goto L_0x00c7
        L_0x00c4:
            r0 = 2131892120(0x7f121798, float:1.941898E38)
        L_0x00c7:
            java.lang.String r0 = X.C18070vi.A0F(r3, r0)
            android.content.Context r3 = r10.getContext()
            r2 = 2131892205(0x7f1217ed, float:1.9419152E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r0
            java.lang.CharSequence r0 = r9.getText()
            java.lang.String r0 = X.C17880vN.A0q(r3, r0, r1, r4, r2)
            r5.setContentDescription(r0)
            r0 = 43
            X.C90084dV.A00(r5, r10, r7, r6, r0)
        L_0x00e6:
            r0 = 2131429582(0x7f0b08ce, float:1.848084E38)
            android.view.View r0 = r10.findViewById(r0)
            X.C72453Mb.A1D(r0)
            X.206 r0 = r10.A0I
            X.C18070vi.A0X(r0)
            r10.A2K(r0)
            X.3s1 r0 = r10.A06
            if (r0 == 0) goto L_0x0102
            r0.notifyDataSetChanged()
            r10.A2t()
        L_0x0102:
            java.util.ArrayList r0 = r10.A02
            if (r0 == 0) goto L_0x0109
            r10.A2s(r0)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78863to.A2i():void");
    }

    public TextView getDateView() {
        return C17880vN.A0E(this, 2131433901);
    }
}
