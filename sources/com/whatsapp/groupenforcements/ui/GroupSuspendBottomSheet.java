package com.whatsapp.groupenforcements.ui;

import X.AnonymousClass11C;
import X.AnonymousClass1EC;
import X.AnonymousClass1FL;
import X.AnonymousClass1YL;
import X.AnonymousClass2QF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6gB;
import X.AnonymousClass7R0;
import X.C106965Xw;
import X.C146507Pj;
import X.C18030ve;
import X.C18070vi;
import X.C36401np;
import X.C39261sm;
import X.C39281so;
import X.C39401t1;
import X.C42941yz;
import X.C72453Mb;
import X.C89984dL;
import X.C90044dR;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public final class GroupSuspendBottomSheet extends Hilt_GroupSuspendBottomSheet {
    public AnonymousClass11C A00;
    public C18030ve A01;
    public C106965Xw A02;
    public AnonymousClass6gB A03;
    public C36401np A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625526, viewGroup, false);
        AnonymousClass1FL A0Z = C72453Mb.A0Z(this);
        Bundle A15 = A15();
        C42941yz r0 = AnonymousClass1EC.A01;
        AnonymousClass1EC A012 = C42941yz.A01(A15.getString("suspendedEntityId"));
        boolean z = A15.getBoolean("hasMe");
        boolean z2 = A15.getBoolean("isMeAdmin");
        C18070vi.A0b(inflate);
        ((WDSProfilePhoto) C18070vi.A05(inflate, 2131431308)).setProfileBadge(new AnonymousClass2QF(new C39281so(2131168782, 2131168784, 2131168785, 2131168787), new C39261sm(AnonymousClass1YL.A00(A0Z, 2130971948, 2131103048), AnonymousClass1YL.A00(A0Z, 2130971878, 2131103028), 0, 0), 2131231719, false));
        TextView A0E = AnonymousClass3Ma.A0E(inflate, 2131431306);
        C36401np r11 = this.A04;
        if (r11 != null) {
            A0E.setText(AnonymousClass3MY.A0A(A0E.getContext(), r11, new C146507Pj(this, A0Z, 14), AnonymousClass3MX.A16(this, "learn-more", AnonymousClass3MW.A1a(), 0, 2131891160), "learn-more"));
            C18030ve r02 = this.A01;
            if (r02 != null) {
                AnonymousClass3Ma.A1I(A0E, r02);
                Rect rect = C39401t1.A0A;
                AnonymousClass11C r03 = this.A00;
                if (r03 != null) {
                    AnonymousClass3MZ.A1Q(A0E, r03);
                    if (z2 && z) {
                        TextView A0E2 = AnonymousClass3Ma.A0E(inflate, 2131431310);
                        A0E2.setVisibility(0);
                        C36401np r4 = this.A04;
                        if (r4 != null) {
                            A0E2.setText(AnonymousClass3MY.A0A(A0E2.getContext(), r4, new AnonymousClass7R0(this, A0Z, A012, 3), AnonymousClass3MY.A0o(this, "learn-more", 0, 2131891159), "learn-more"));
                            C18030ve r04 = this.A01;
                            if (r04 != null) {
                                AnonymousClass3Ma.A1I(A0E2, r04);
                                AnonymousClass11C r05 = this.A00;
                                if (r05 != null) {
                                    AnonymousClass3MZ.A1Q(A0E2, r05);
                                }
                            }
                        }
                    }
                    AnonymousClass3Ma.A0E(inflate, 2131431307).setText(2131891161);
                    C89984dL.A00(C18070vi.A05(inflate, 2131431305), this, 8, z);
                    C90044dR.A00(C18070vi.A05(inflate, 2131431309), this, 35);
                    return inflate;
                }
                str = "systemServices";
                C18070vi.A11(str);
                throw null;
            }
            str = "abProps";
            C18070vi.A11(str);
            throw null;
        }
        str = "linkifier";
        C18070vi.A11(str);
        throw null;
    }
}
