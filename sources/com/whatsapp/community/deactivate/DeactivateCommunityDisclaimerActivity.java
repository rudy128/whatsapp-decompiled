package com.whatsapp.community.deactivate;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4W3;
import X.AnonymousClass5XD;
import X.C000200d;
import X.C003401n;
import X.C110885hR;
import X.C17880vN;
import X.C18070vi;
import X.C24921Me;
import X.C27201Vd;
import X.C37451pZ;
import X.C42941yz;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C89894dC;
import X.C91004ez;
import X.C92054gg;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public final class DeactivateCommunityDisclaimerActivity extends AnonymousClass1FY implements AnonymousClass5XD {
    public View A00;
    public AnonymousClass1M9 A01;
    public C24921Me A02;
    public C27201Vd A03;
    public AnonymousClass1E7 A04;
    public AnonymousClass1EC A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public boolean A08;

    public DeactivateCommunityDisclaimerActivity() {
        this(0);
    }

    public static final void A03(DeactivateCommunityDisclaimerActivity deactivateCommunityDisclaimerActivity) {
        DeactivateCommunityDisclaimerActivity deactivateCommunityDisclaimerActivity2 = deactivateCommunityDisclaimerActivity;
        if (!AnonymousClass3MW.A1Y(deactivateCommunityDisclaimerActivity)) {
            deactivateCommunityDisclaimerActivity2.A3v(new C92054gg(deactivateCommunityDisclaimerActivity2, 1), 0, 2131889205, 2131889206, 2131889204);
            return;
        }
        AnonymousClass1EC r3 = deactivateCommunityDisclaimerActivity.A05;
        if (r3 == null) {
            C18070vi.A11("parentGroupJid");
            throw null;
        }
        Hilt_DeactivateCommunityConfirmationFragment hilt_DeactivateCommunityConfirmationFragment = new Hilt_DeactivateCommunityConfirmationFragment();
        C72463Mc.A11(C17880vN.A0D(), hilt_DeactivateCommunityConfirmationFragment, r3, "parent_group_jid");
        deactivateCommunityDisclaimerActivity.CMk(hilt_DeactivateCommunityConfirmationFragment, "DeactivateCommunityDisclaimerActivity");
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A06 = C000200d.A00(A0L.A2M);
            this.A01 = AnonymousClass10E.A4z(A0L);
            this.A03 = AnonymousClass3MZ.A0i(A0L);
            this.A07 = C000200d.A00(A0L.A6N);
            this.A02 = AnonymousClass3MZ.A0g(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624033);
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        A0G.setTitle(2131889188);
        C003401n A0S = C72463Mc.A0S(this, A0G);
        C18070vi.A0X(A0S);
        A0S.A0W(true);
        String stringExtra = getIntent().getStringExtra("parent_group_jid");
        C42941yz r0 = AnonymousClass1EC.A01;
        AnonymousClass1EC A012 = C42941yz.A01(stringExtra);
        this.A05 = A012;
        AnonymousClass1M9 r02 = this.A01;
        if (r02 != null) {
            this.A04 = r02.A0H(A012);
            this.A00 = AnonymousClass3MY.A0C(this, 2131429820);
            ImageView imageView = (ImageView) AnonymousClass3MY.A0C(this, 2131429817);
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131166395);
            C27201Vd r1 = this.A03;
            if (r1 != null) {
                C37451pZ A062 = r1.A06(this, "deactivate-community-disclaimer");
                AnonymousClass1E7 r03 = this.A04;
                if (r03 != null) {
                    A062.A0A(imageView, r03, dimensionPixelSize);
                    C89894dC.A00(C110885hR.A0A(this, 2131429225), this, 28);
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131429819);
                    Object[] objArr = new Object[1];
                    C24921Me r12 = this.A02;
                    if (r12 != null) {
                        AnonymousClass1E7 r04 = this.A04;
                        if (r04 != null) {
                            textEmojiLabel.A0S(C17880vN.A0q(this, r12.A0I(r04), objArr, 0, 2131889201), (List) null, 0, false);
                            AnonymousClass4W3.A00(AnonymousClass3MY.A0C(this, 2131429226), (ScrollView) AnonymousClass3MY.A0C(this, 2131429818));
                            return;
                        }
                    } else {
                        str = "waContactNames";
                    }
                }
                C18070vi.A11("parentGroupContact");
                throw null;
            }
            str = "contactPhotos";
        } else {
            str = "contactManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public DeactivateCommunityDisclaimerActivity(int i) {
        this.A08 = false;
        C91004ez.A00(this, 11);
    }
}
