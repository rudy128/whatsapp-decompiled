package com.whatsapp.conversation.comments;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1MZ;
import X.AnonymousClass1PM;
import X.AnonymousClass1RK;
import X.AnonymousClass1W2;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MX;
import X.AnonymousClass4aU;
import X.AnonymousClass5GH;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C19830z4;
import X.C19880zA;
import X.C22941Dw;
import X.C24751Ln;
import X.C24921Me;
import X.C25241Nl;
import X.C25491Ok;
import X.C32091gc;
import X.C32981i4;
import X.C33251iW;
import X.C72453Mb;
import X.C87794Wz;
import X.C89904dD;
import X.C90074dU;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.jid.UserJid;

public final class CommentActionsBottomSheet extends Hilt_CommentActionsBottomSheet {
    public C19880zA A00;
    public AnonymousClass1KB A01;
    public ListItemWithLeftIcon A02;
    public ListItemWithLeftIcon A03;
    public ListItemWithLeftIcon A04;
    public ListItemWithLeftIcon A05;
    public AnonymousClass11S A06;
    public C33251iW A07;
    public AnonymousClass1M9 A08;
    public AnonymousClass1PM A09;
    public C24921Me A0A;
    public C25491Ok A0B;
    public AnonymousClass11C A0C;
    public AnonymousClass11P A0D;
    public C19830z4 A0E;
    public C18000vb A0F;
    public AnonymousClass1CJ A0G;
    public AnonymousClass1MZ A0H;
    public C24751Ln A0I;
    public AnonymousClass1RK A0J;
    public C32981i4 A0K;
    public AnonymousClass1KW A0L;
    public C18030ve A0M;
    public AnonymousClass18K A0N;
    public C25241Nl A0O;
    public AnonymousClass1MB A0P;
    public C32091gc A0Q;
    public C87794Wz A0R;
    public C18010vc A0S;
    public AnonymousClass206 A0T;
    public AnonymousClass10I A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public C18600wl A0d;
    public C18600wl A0e;
    public final C18100vl A0f = AnonymousClass1DF.A01(new AnonymousClass5GH(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624558, false);
    }

    public void A21(Bundle bundle, View view) {
        AnonymousClass205 A032;
        ListItemWithLeftIcon listItemWithLeftIcon;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (!(bundle2 == null || (A032 = AnonymousClass4aU.A03(bundle2, "")) == null)) {
            AnonymousClass00H r0 = this.A0X;
            if (r0 != null) {
                AnonymousClass206 A012 = AnonymousClass1W2.A01(A032, r0);
                if (A012 != null) {
                    this.A0T = A012;
                    this.A05 = (ListItemWithLeftIcon) view.findViewById(2131436813);
                    this.A04 = (ListItemWithLeftIcon) view.findViewById(2131434531);
                    this.A03 = (ListItemWithLeftIcon) view.findViewById(2131429884);
                    this.A02 = (ListItemWithLeftIcon) view.findViewById(2131429667);
                    AnonymousClass206 r02 = this.A0T;
                    if (r02 != null) {
                        boolean z = r02.A0v.A02;
                        ListItemWithLeftIcon listItemWithLeftIcon2 = this.A05;
                        if (z) {
                            C72453Mb.A1D(listItemWithLeftIcon2);
                        } else {
                            C72453Mb.A1C(listItemWithLeftIcon2);
                            C22941Dw r03 = UserJid.Companion;
                            AnonymousClass206 r04 = this.A0T;
                            if (r04 != null) {
                                UserJid A013 = C22941Dw.A01(r04.A0H());
                                if (!(A013 == null || (listItemWithLeftIcon = this.A05) == null)) {
                                    C90074dU.A01(listItemWithLeftIcon, this, A013, 1);
                                }
                            }
                        }
                        AnonymousClass206 r05 = this.A0T;
                        if (r05 != null) {
                            boolean z2 = r05.A0v.A02;
                            ListItemWithLeftIcon listItemWithLeftIcon3 = this.A04;
                            if (z2) {
                                C72453Mb.A1D(listItemWithLeftIcon3);
                            } else {
                                C72453Mb.A1C(listItemWithLeftIcon3);
                                ListItemWithLeftIcon listItemWithLeftIcon4 = this.A04;
                                if (listItemWithLeftIcon4 != null) {
                                    C89904dD.A00(listItemWithLeftIcon4, this, 16);
                                }
                            }
                            ListItemWithLeftIcon listItemWithLeftIcon5 = this.A03;
                            if (listItemWithLeftIcon5 != null) {
                                C89904dD.A00(listItemWithLeftIcon5, this, 15);
                            }
                            ListItemWithLeftIcon listItemWithLeftIcon6 = this.A02;
                            if (listItemWithLeftIcon6 != null) {
                                C89904dD.A00(listItemWithLeftIcon6, this, 17);
                                return;
                            }
                            return;
                        }
                    }
                    C18070vi.A11("message");
                    throw null;
                }
            } else {
                C18070vi.A11("fMessageDatabase");
                throw null;
            }
        }
        A28();
    }

    public void A1r() {
        super.A1r();
        ListItemWithLeftIcon listItemWithLeftIcon = this.A03;
        if (listItemWithLeftIcon != null) {
            listItemWithLeftIcon.setOnClickListener((View.OnClickListener) null);
        }
        this.A03 = null;
    }
}
