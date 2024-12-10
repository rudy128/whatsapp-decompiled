package com.whatsapp.newsletter.ui.multiadmin;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass4DG;
import X.AnonymousClass4O9;
import X.AnonymousClass4XL;
import X.AnonymousClass5OK;
import X.AnonymousClass5OL;
import X.AnonymousClass5PU;
import X.AnonymousClass9IF;
import X.B8S;
import X.C107595aH;
import X.C18070vi;
import X.C18100vl;
import X.C29681ch;
import X.C72453Mb;
import X.C86164Qm;
import X.C88414Zp;
import X.C96854oW;
import X.C96934oe;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.lang.ref.WeakReference;
import java.util.List;

public final class NewsletterRevokeAdminInviteSheet extends Hilt_NewsletterRevokeAdminInviteSheet implements B8S, C107595aH {
    public AnonymousClass1KB A00;
    public WaImageView A01;
    public AnonymousClass11C A02;
    public AnonymousClass11P A03;
    public WDSButton A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public WaImageView A08;
    public WaTextView A09;
    public WaTextView A0A;
    public WDSButton A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F = C88414Zp.A02(this, "newsletter_name");

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131626255, viewGroup);
        this.A08 = AnonymousClass3MW.A0R(inflate, 2131433130);
        this.A0A = AnonymousClass3MW.A0T(inflate, 2131427683);
        this.A09 = AnonymousClass3MW.A0T(inflate, 2131430716);
        this.A04 = AnonymousClass3MW.A0q(inflate, 2131434059);
        this.A0B = AnonymousClass3MW.A0q(inflate, 2131436792);
        this.A01 = AnonymousClass3MW.A0R(inflate, 2131429138);
        return inflate;
    }

    public void A1s() {
        this.A0A = null;
        this.A09 = null;
        this.A01 = null;
        super.A1s();
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaTextView waTextView = this.A0A;
        if (waTextView != null) {
            C72453Mb.A1G(waTextView, this.A0F);
        }
        WaTextView waTextView2 = this.A09;
        if (waTextView2 != null) {
            AnonymousClass00H r0 = this.A07;
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
        WDSButton wDSButton = this.A04;
        if (wDSButton != null) {
            wDSButton.setText(2131892894);
            wDSButton.setAction(AnonymousClass4DG.DESTRUCTIVE);
            AnonymousClass3Ma.A19(wDSButton, this, 17);
        }
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            AnonymousClass3Ma.A19(waImageView, this, 18);
        }
        AnonymousClass00H r02 = this.A06;
        if (r02 != null) {
            AnonymousClass4O9 r1 = (AnonymousClass4O9) r02.get();
            C29681ch A0o = AnonymousClass3MX.A0o(this.A0E);
            WaImageView waImageView2 = this.A08;
            if (A0o != null && waImageView2 != null) {
                r1.A03.A01(A0o, new C96854oW(waImageView2, r1, 1), (String) null, true, true);
                return;
            }
            return;
        }
        str = "newsletterAdminInviteSheetPhotoLoader";
        C18070vi.A11(str);
        throw null;
    }

    public void C48(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        Activity A002 = AnonymousClass1L9.A00(A1n());
        AnonymousClass3MW.A1W(A002);
        WeakReference A0z = AnonymousClass3MW.A0z(A002);
        C29681ch A0o = AnonymousClass3MX.A0o(this.A0E);
        if (A0o != null) {
            AnonymousClass00H r0 = this.A05;
            if (r0 != null) {
                ((C86164Qm) r0.get()).A00(A0o, userJid, new C96934oe(A0z, this, 1));
            } else {
                C18070vi.A11("newsletterAdminInvitationHandler");
                throw null;
            }
        }
    }

    public NewsletterRevokeAdminInviteSheet() {
        Integer num = AnonymousClass00R.A0C;
        this.A0E = AnonymousClass1DF.A00(num, new AnonymousClass5OK(this));
        this.A0C = AnonymousClass1DF.A00(num, new AnonymousClass5OL(this));
        this.A0D = AnonymousClass1DF.A00(num, new AnonymousClass5PU(this, "invite_expiration_ts"));
    }

    public void C9M(AnonymousClass9IF r3, String str, List list) {
        boolean A15 = C18070vi.A15(list, r3);
        if (r3 == AnonymousClass9IF.REVOKE) {
            C48((UserJid) list.get(A15 ? 1 : 0));
        }
    }
}
