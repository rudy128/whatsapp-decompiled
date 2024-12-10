package com.whatsapp.product.searchtheweb;

import X.AnonymousClass00H;
import X.AnonymousClass12Q;
import X.AnonymousClass18K;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass46o;
import X.AnonymousClass46p;
import X.AnonymousClass4X7;
import X.AnonymousClass4aX;
import X.AnonymousClass5KO;
import X.AnonymousClass5KP;
import X.AnonymousClass5KQ;
import X.AnonymousClass5KR;
import X.C104545Oo;
import X.C105925Tw;
import X.C146757Qm;
import X.C1776399u;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C29431cG;
import X.C38541rS;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C81423zD;
import X.C88414Zp;
import X.C89964dJ;
import X.C90024dP;
import X.C91634g0;
import X.C99274sY;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class GoogleSearchContentBottomSheet extends Hilt_GoogleSearchContentBottomSheet {
    public AnonymousClass1KB A00;
    public C18030ve A01;
    public AnonymousClass1LU A02;
    public C38541rS A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public boolean A06;
    public final AnonymousClass4X7 A07 = ((AnonymousClass4X7) AnonymousClass12Q.A01(16430));
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final int A0D = 2131625468;

    public void A21(Bundle bundle, View view) {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextView A0E = C17880vN.A0E(view, 2131435853);
        if (C72453Mb.A1a(this.A08)) {
            AnonymousClass3MX.A0C(view, 2131435854).setVisibility(8);
            i = 2131895503;
        } else {
            i = 2131895504;
        }
        C38541rS r5 = this.A03;
        if (r5 != null) {
            Context A14 = A14();
            String A16 = AnonymousClass3MX.A16(this, "clickable-span", new Object[1], 0, i);
            C18070vi.A0X(A16);
            A0E.setText(r5.A04(A14, new C146757Qm((Object) this, 9), A16, "clickable-span", C72463Mc.A02(A14())));
            C18030ve r0 = this.A01;
            if (r0 != null) {
                AnonymousClass3Ma.A1I(A0E, r0);
                C91634g0.A00(A1G(), ((GoogleSearchContentBottomSheetViewModel) this.A0C.getValue()).A00, new C105925Tw(this), 17);
                C18100vl r6 = this.A09;
                if (C72463Mc.A0D(r6) == 1) {
                    Object A0b = C29431cG.A0b(AnonymousClass3MW.A11(r6));
                    C18070vi.A0X(A0b);
                    C28931bI A0s = C72453Mb.A0s(view, 2131435460);
                    View findViewById = AnonymousClass3MY.A0I(A0s, 0).findViewById(2131435855);
                    View findViewById2 = A0s.A02().findViewById(2131435852);
                    C90024dP.A00(findViewById, this, A0b, 16);
                    C89964dJ.A00(findViewById2, this, 30);
                    C72473Md.A11(view, 0);
                }
                if (C72463Mc.A0D(r6) > 1) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (Object next : AnonymousClass3MW.A11(r6)) {
                        if (next instanceof AnonymousClass46p) {
                            i2 = 2131233335;
                            i3 = 2131895509;
                            i4 = 13;
                        } else if (next instanceof AnonymousClass46o) {
                            i2 = 2131233459;
                            i3 = 2131895507;
                            i4 = 14;
                        } else if (next instanceof C1776399u) {
                            i2 = 2131233308;
                            i3 = 2131895506;
                            i4 = 15;
                        } else {
                            throw AnonymousClass3MW.A14();
                        }
                        C90024dP r52 = new C90024dP(this, next, i4);
                        View A0D2 = AnonymousClass3MY.A0D(LayoutInflater.from(A1n()), 2131626826);
                        Context context = A0D2.getContext();
                        Drawable A052 = AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, i2), 2131103154);
                        C18070vi.A0X(A052);
                        ImageView A0H = AnonymousClass3MW.A0H(A0D2, 2131434945);
                        TextView A0E2 = C17880vN.A0E(A0D2, 2131434947);
                        A0H.setImageDrawable(A052);
                        A0E2.setText(i3);
                        A0D2.setOnClickListener(r52);
                        viewGroup.addView(A0D2);
                    }
                }
                A00(this, 1);
                return;
            }
            str = "abProps";
        } else {
            str = "linkifierUtils";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        if (this.A06) {
            A00(this, 6);
        }
    }

    public static final void A00(GoogleSearchContentBottomSheet googleSearchContentBottomSheet, int i) {
        C81423zD r1 = new C81423zD();
        r1.A00 = Integer.valueOf(C72453Mb.A0I(googleSearchContentBottomSheet.A0A));
        r1.A02 = Integer.valueOf(i);
        r1.A01 = (Integer) googleSearchContentBottomSheet.A0B.getValue();
        AnonymousClass00H r0 = googleSearchContentBottomSheet.A05;
        if (r0 != null) {
            ((AnonymousClass18K) r0.get()).CC7(r1);
        } else {
            AnonymousClass3MW.A1J();
            throw null;
        }
    }

    public int A2F() {
        return this.A0D;
    }

    public GoogleSearchContentBottomSheet() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(GoogleSearchContentBottomSheetViewModel.class);
        this.A0C = C99274sY.A00(new AnonymousClass5KP(this), new AnonymousClass5KQ(this), new C104545Oo(this), A15);
        this.A09 = AnonymousClass1DF.A01(new AnonymousClass5KO(this));
        this.A0A = C88414Zp.A03(this, "arg-entry-point", -1);
        this.A0B = AnonymousClass1DF.A01(new AnonymousClass5KR(this));
        this.A08 = C88414Zp.A00(this, "arg-is-channel-update");
        this.A06 = true;
    }
}
