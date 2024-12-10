package com.whatsapp.community.suspend;

import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1FL;
import X.AnonymousClass1MB;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4RD;
import X.AnonymousClass5FU;
import X.AnonymousClass5N1;
import X.C132896np;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C34511kb;
import X.C36401np;
import X.C36531o3;
import X.C39401t1;
import X.C70773Cl;
import X.C72453Mb;
import X.C89894dC;
import X.C98804rk;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class CommunityIntegritySuspendBottomSheet extends Hilt_CommunityIntegritySuspendBottomSheet {
    public C34511kb A00;
    public AnonymousClass4RD A01;
    public C36531o3 A02;
    public AnonymousClass11C A03;
    public AnonymousClass1MZ A04;
    public C18030ve A05;
    public AnonymousClass1MB A06;
    public C132896np A07;
    public C36401np A08;
    public final C18100vl A09 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5N1(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18070vi.A0d(layoutInflater, 0);
        View A0B = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624583, false);
        AnonymousClass1FL A0Z = C72453Mb.A0Z(this);
        TextView A0E = AnonymousClass3Ma.A0E(A0B, 2131429288);
        C36401np r6 = this.A08;
        if (r6 != null) {
            A0E.setText(AnonymousClass3MY.A0A(A0E.getContext(), r6, new C98804rk(this, A0Z, 36), AnonymousClass3MX.A16(this, "learn-more", AnonymousClass3MW.A1a(), 0, 2131888601), "learn-more"));
            C18030ve r0 = this.A05;
            if (r0 != null) {
                AnonymousClass3Ma.A1I(A0E, r0);
                Rect rect = C39401t1.A0A;
                AnonymousClass11C r02 = this.A03;
                if (r02 != null) {
                    AnonymousClass3MZ.A1Q(A0E, r02);
                    AnonymousClass1MZ r1 = this.A04;
                    if (r1 != null) {
                        C18100vl r7 = this.A09;
                        if (r1.A0J((GroupJid) r7.getValue())) {
                            AnonymousClass1MZ r12 = this.A04;
                            if (r12 != null) {
                                if (r12.A0K((GroupJid) r7.getValue())) {
                                    C34511kb r13 = this.A00;
                                    if (r13 != null) {
                                        AnonymousClass1EC A042 = r13.A04(AnonymousClass3MX.A0p(r7));
                                        if (A042 != null) {
                                            TextView A0E2 = AnonymousClass3Ma.A0E(A0B, 2131429293);
                                            A0E2.setVisibility(0);
                                            C36401np r4 = this.A08;
                                            if (r4 != null) {
                                                A0E2.setText(AnonymousClass3MY.A0A(A0E2.getContext(), r4, new C70773Cl(this, A0Z, A042, 2), AnonymousClass3MY.A0o(this, "learn-more", 0, 2131888600), "learn-more"));
                                                C18030ve r03 = this.A05;
                                                if (r03 != null) {
                                                    AnonymousClass3Ma.A1I(A0E2, r03);
                                                    AnonymousClass11C r04 = this.A03;
                                                    if (r04 != null) {
                                                        AnonymousClass3MZ.A1Q(A0E2, r04);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        str = "communityChatManager";
                                        C18070vi.A11(str);
                                        throw null;
                                    }
                                }
                            }
                        }
                        AnonymousClass3Ma.A0E(A0B, 2131429289).setText(2131888602);
                        WDSButton wDSButton = (WDSButton) C18070vi.A05(A0B, 2131429290);
                        AnonymousClass4RD r3 = this.A01;
                        if (r3 != null) {
                            r3.A00(A1D(), AnonymousClass3MX.A0p(r7), wDSButton, new AnonymousClass5FU(this));
                            C89894dC.A00(C18070vi.A05(A0B, 2131429292), this, 43);
                            return A0B;
                        }
                        str = "communityIntegritySuspendUIHelper";
                        C18070vi.A11(str);
                        throw null;
                    }
                    str = "groupParticipantsManager";
                    C18070vi.A11(str);
                    throw null;
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
