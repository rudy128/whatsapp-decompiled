package com.whatsapp.bizintegrity.smbsuspicious;

import X.A5M;
import X.AnonymousClass03S;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1L8;
import X.AnonymousClass1W6;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass5BK;
import X.AnonymousClass5BL;
import X.C107895an;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C21445AkC;
import X.C84644Kh;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.Jid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.concurrent.atomic.AtomicReference;

public final class SMBSuspiciousSenderUrlClickWarningSheet extends Hilt_SMBSuspiciousSenderUrlClickWarningSheet {
    public AnonymousClass1L8 A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public A5M A04;
    public C107895an A05;
    public C84644Kh A06;
    public AnonymousClass1W6 A07;
    public AnonymousClass10I A08;
    public WDSButton A09;
    public WDSButton A0A;
    public final C18100vl A0B = AnonymousClass1DF.A01(new AnonymousClass5BK(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new AnonymousClass5BL(this));
    public final AtomicReference A0D = new AtomicReference();

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626975, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A03 = AnonymousClass3MW.A0T(view, 2131428136);
        this.A02 = AnonymousClass3MW.A0T(view, 2131428131);
        this.A01 = AnonymousClass3MW.A0R(view, 2131428130);
        this.A09 = AnonymousClass3MW.A0q(view, 2131428127);
        this.A0A = AnonymousClass3MW.A0q(view, 2131428133);
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            waImageView.setImageDrawable(AnonymousClass03S.A01(waImageView.getContext(), 2131233114));
        }
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            waTextView.setText(2131897664);
        }
        WaTextView waTextView2 = this.A02;
        if (waTextView2 != null) {
            waTextView2.setText(2131897663);
        }
        WDSButton wDSButton = this.A0A;
        if (wDSButton != null) {
            wDSButton.setText(2131897662);
            AnonymousClass3MZ.A1I(wDSButton, this, 24);
        }
        WDSButton wDSButton2 = this.A09;
        if (wDSButton2 != null) {
            wDSButton2.setText(2131897661);
            wDSButton2.setBackground((Drawable) null);
            AnonymousClass3MZ.A1I(wDSButton2, this, 25);
        }
        AnonymousClass10I r2 = this.A08;
        if (r2 != null) {
            r2.CGF(new C21445AkC(this, 11));
        } else {
            AnonymousClass3MW.A1G();
            throw null;
        }
    }

    public static final AnonymousClass206 A00(SMBSuspiciousSenderUrlClickWarningSheet sMBSuspiciousSenderUrlClickWarningSheet) {
        AtomicReference atomicReference = sMBSuspiciousSenderUrlClickWarningSheet.A0D;
        if (atomicReference.get() == null) {
            AnonymousClass1W6 r2 = sMBSuspiciousSenderUrlClickWarningSheet.A07;
            if (r2 != null) {
                atomicReference.set(r2.A01.A05((AnonymousClass205) sMBSuspiciousSenderUrlClickWarningSheet.A0C.getValue()));
            } else {
                C18070vi.A11("fMessageDatabase");
                throw null;
            }
        }
        return (AnonymousClass206) atomicReference.get();
    }

    public static final void A01(SMBSuspiciousSenderUrlClickWarningSheet sMBSuspiciousSenderUrlClickWarningSheet) {
        String str;
        Jid A0h = AnonymousClass3MW.A0h(sMBSuspiciousSenderUrlClickWarningSheet.A0B);
        if (A0h != null) {
            C84644Kh r0 = sMBSuspiciousSenderUrlClickWarningSheet.A06;
            if (r0 != null) {
                SharedPreferences A052 = r0.A00.A05("smb_suspicious_warning_banner");
                C18070vi.A0X(A052);
                C17880vN.A1F(A052.edit(), A0h.getRawString(), true);
            } else {
                str = "smbSuspiciousWarningBannerStore";
                C18070vi.A11(str);
                throw null;
            }
        }
        AnonymousClass10I r2 = sMBSuspiciousSenderUrlClickWarningSheet.A08;
        if (r2 != null) {
            r2.CGF(new C21445AkC(sMBSuspiciousSenderUrlClickWarningSheet, 12));
            C107895an r02 = sMBSuspiciousSenderUrlClickWarningSheet.A05;
            if (r02 == null) {
                str = "callBack";
            } else {
                r02.BzY();
                super.A28();
                return;
            }
        } else {
            str = "waWorkers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A02(SMBSuspiciousSenderUrlClickWarningSheet sMBSuspiciousSenderUrlClickWarningSheet) {
        C107895an r0 = sMBSuspiciousSenderUrlClickWarningSheet.A05;
        if (r0 == null) {
            C18070vi.A11("callBack");
            throw null;
        }
        r0.onDismiss();
        super.A28();
    }
}
