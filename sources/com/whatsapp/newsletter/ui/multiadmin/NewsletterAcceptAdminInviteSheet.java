package com.whatsapp.newsletter.ui.multiadmin;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass4KI;
import X.AnonymousClass4O9;
import X.AnonymousClass4RH;
import X.AnonymousClass4XL;
import X.AnonymousClass5OJ;
import X.AnonymousClass5PU;
import X.AnonymousClass5Y9;
import X.AnonymousClass9IF;
import X.B8S;
import X.C107095Yj;
import X.C175098y3;
import X.C18070vi;
import X.C18100vl;
import X.C20131A8r;
import X.C28931bI;
import X.C29681ch;
import X.C36341nj;
import X.C72453Mb;
import X.C86164Qm;
import X.C88414Zp;
import X.C96854oW;
import X.C96934oe;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class NewsletterAcceptAdminInviteSheet extends Hilt_NewsletterAcceptAdminInviteSheet implements B8S {
    public AnonymousClass1KB A00;
    public AnonymousClass11S A01;
    public WaImageView A02;
    public AnonymousClass11P A03;
    public C36341nj A04;
    public WDSButton A05;
    public WDSButton A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public WaImageView A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G = C88414Zp.A02(this, "newsletter_name");

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131626255, viewGroup);
        this.A0A = AnonymousClass3MW.A0R(inflate, 2131433130);
        this.A0C = AnonymousClass3MW.A0T(inflate, 2131427683);
        this.A0B = AnonymousClass3MW.A0T(inflate, 2131430716);
        this.A05 = AnonymousClass3MW.A0q(inflate, 2131434059);
        this.A06 = AnonymousClass3MW.A0q(inflate, 2131436792);
        this.A02 = AnonymousClass3MW.A0R(inflate, 2131429138);
        return inflate;
    }

    public void A1s() {
        this.A0C = null;
        this.A0B = null;
        this.A05 = null;
        this.A06 = null;
        this.A02 = null;
        super.A1s();
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaTextView waTextView = this.A0C;
        if (waTextView != null) {
            C72453Mb.A1G(waTextView, this.A0G);
        }
        WaTextView waTextView2 = this.A0B;
        if (waTextView2 != null) {
            AnonymousClass00H r0 = this.A09;
            if (r0 != null) {
                r0.get();
                AnonymousClass11P r2 = this.A03;
                if (r2 != null) {
                    AnonymousClass4XL.A00(waTextView2, r2, C72453Mb.A0K(this.A0D));
                } else {
                    str = "time";
                }
            } else {
                str = "newsletterMultiAdminUtils";
            }
            C18070vi.A11(str);
            throw null;
        }
        C18100vl r22 = this.A0E;
        if (!C72453Mb.A1a(r22)) {
            C28931bI.A00(view, 2131431414).A02().setVisibility(0);
        }
        WDSButton wDSButton = this.A05;
        if (wDSButton != null) {
            wDSButton.setText(2131892868);
            AnonymousClass3Ma.A19(wDSButton, this, 14);
        }
        WDSButton wDSButton2 = this.A06;
        if (wDSButton2 != null) {
            wDSButton2.setVisibility(0);
            AnonymousClass3Ma.A19(wDSButton2, this, 15);
        }
        WaImageView waImageView = this.A02;
        if (waImageView != null) {
            AnonymousClass3Ma.A19(waImageView, this, 16);
        }
        AnonymousClass00H r02 = this.A08;
        if (r02 != null) {
            AnonymousClass4O9 r1 = (AnonymousClass4O9) r02.get();
            C29681ch A0o = AnonymousClass3MX.A0o(this.A0F);
            WaImageView waImageView2 = this.A0A;
            if (!(A0o == null || waImageView2 == null)) {
                r1.A03.A01(A0o, new C96854oW(waImageView2, r1, 1), (String) null, true, true);
            }
            r22.getValue();
            return;
        }
        str = "newsletterAdminInviteSheetPhotoLoader";
        C18070vi.A11(str);
        throw null;
    }

    public void C9M(AnonymousClass9IF r2, String str, List list) {
        C18070vi.A0d(r2, 1);
        if (r2 == AnonymousClass9IF.ACCEPT_INVITE) {
            A00(this);
        }
    }

    public static final void A00(NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet) {
        String str;
        C175098y3 r4;
        C29681ch A0o = AnonymousClass3MX.A0o(newsletterAcceptAdminInviteSheet.A0F);
        if (A0o != null) {
            AnonymousClass00H r0 = newsletterAcceptAdminInviteSheet.A07;
            if (r0 != null) {
                C86164Qm r2 = (C86164Qm) r0.get();
                C96934oe r42 = new C96934oe(A0o, newsletterAcceptAdminInviteSheet, 0);
                C107095Yj r02 = r2.A00;
                if (r02 != null) {
                    r02.cancel();
                }
                r2.A01.A07(2131886176, 2131891463);
                AnonymousClass4RH r1 = r2.A02;
                C96854oW r7 = new C96854oW(r42, r2, 0);
                if (!C72453Mb.A1X(r1.A06)) {
                    r4 = null;
                } else {
                    AnonymousClass4KI r03 = r1.A00;
                    if (r03 != null) {
                        AnonymousClass10E r12 = r03.A00.A00;
                        r4 = new C175098y3(AnonymousClass3Ma.A0l(r12), A0o, r7, (AnonymousClass5Y9) r12.A7S.get(), (C20131A8r) r12.A7I.get(), AnonymousClass10E.AL1(r12));
                        r4.A01();
                    } else {
                        str = "newsletterAcceptAdminInviteHandler";
                    }
                }
                r2.A00 = r4;
                return;
            }
            str = "newsletterAdminInvitationHandler";
            C18070vi.A11(str);
            throw null;
        }
    }

    public NewsletterAcceptAdminInviteSheet() {
        Integer num = AnonymousClass00R.A0C;
        this.A0F = AnonymousClass1DF.A00(num, new AnonymousClass5OJ(this));
        this.A0D = AnonymousClass1DF.A00(num, new AnonymousClass5PU(this, "invite_expiration_ts"));
        this.A0E = C88414Zp.A00(this, "from_tos_accepted");
    }
}
