package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass190;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1HF;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1MZ;
import X.AnonymousClass1VU;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3VM;
import X.AnonymousClass48m;
import X.AnonymousClass4K4;
import X.AnonymousClass5XA;
import X.AnonymousClass86E;
import X.C17880vN;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C203411t;
import X.C22941Dw;
import X.C24071It;
import X.C27201Vd;
import X.C28931bI;
import X.C36401np;
import X.C37451pZ;
import X.C40751vD;
import X.C42141xh;
import X.C42941yz;
import X.C43421zm;
import X.C54832em;
import X.C678531c;
import X.C72043Kk;
import X.C72453Mb;
import X.C91584fv;
import X.C91764gD;
import X.C98754rf;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.ArrayList;
import java.util.List;

public class JoinGroupBottomSheetFragment extends Hilt_JoinGroupBottomSheetFragment implements AnonymousClass86E {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public ImageView A09;
    public ProgressBar A0A;
    public ScrollView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public AnonymousClass1L9 A0G;
    public AnonymousClass190 A0H;
    public AnonymousClass4K4 A0I;
    public TextEmojiLabel A0J;
    public TextEmojiLabel A0K;
    public C72043Kk A0L;
    public C42141xh A0M;
    public C40751vD A0N;
    public AnonymousClass5XA A0O;
    public AnonymousClass3VM A0P;
    public C678531c A0Q;
    public C203411t A0R;
    public AnonymousClass1VW A0S;
    public C37451pZ A0T;
    public C27201Vd A0U;
    public AnonymousClass11C A0V;
    public AnonymousClass11P A0W;
    public C18000vb A0X;
    public AnonymousClass1CJ A0Y;
    public AnonymousClass1MZ A0Z;
    public C54832em A0a;
    public AnonymousClass1VU A0b;
    public AnonymousClass1KW A0c;
    public C18030ve A0d;
    public AnonymousClass1LU A0e;
    public AnonymousClass1EC A0f;
    public C18010vc A0g;
    public ReadMoreTextView A0h;
    public C36401np A0i;
    public C28931bI A0j;
    public AnonymousClass10I A0k;
    public WDSButton A0l;
    public WDSButton A0m;
    public WDSProfilePhoto A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public String A0q;
    public List A0r;
    public FrameLayout A0s;
    public ImageButton A0t;
    public TextView A0u;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.community.Hilt_JoinGroupBottomSheetFragment, androidx.fragment.app.Fragment, com.whatsapp.community.JoinGroupBottomSheetFragment] */
    public static JoinGroupBottomSheetFragment A01(AnonymousClass1EC r5, UserJid userJid, String str, long j) {
        ? hilt_JoinGroupBottomSheetFragment = new Hilt_JoinGroupBottomSheetFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putInt("use_case", 7);
        A0D2.putInt("surface_type", 2);
        A0D2.putString("invite_link_code", str);
        AnonymousClass3MY.A15(A0D2, r5, "arg_group_jid");
        AnonymousClass3MY.A15(A0D2, userJid, "group_admin_jid");
        A0D2.putLong("personal_invite_code_expiration", j);
        A0D2.putBoolean("invite_from_referrer", true);
        hilt_JoinGroupBottomSheetFragment.A1R(A0D2);
        return hilt_JoinGroupBottomSheetFragment;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.community.Hilt_JoinGroupBottomSheetFragment, androidx.fragment.app.Fragment, com.whatsapp.community.JoinGroupBottomSheetFragment] */
    public static JoinGroupBottomSheetFragment A00(GroupJid groupJid, GroupJid groupJid2, int i, int i2) {
        ? hilt_JoinGroupBottomSheetFragment = new Hilt_JoinGroupBottomSheetFragment();
        Bundle A0D2 = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D2, groupJid, "arg_parent_group_jid");
        AnonymousClass3MY.A15(A0D2, groupJid2, "arg_group_jid");
        A0D2.putInt("surface_type", i);
        int i3 = 3;
        if (i2 != 3) {
            i3 = 4;
            if (i2 == 6) {
                i3 = 8;
            }
        }
        A0D2.putInt("use_case", i3);
        hilt_JoinGroupBottomSheetFragment.A1R(A0D2);
        return hilt_JoinGroupBottomSheetFragment;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.community.Hilt_JoinGroupBottomSheetFragment, androidx.fragment.app.Fragment, com.whatsapp.community.JoinGroupBottomSheetFragment] */
    public static JoinGroupBottomSheetFragment A02(String str, int i, int i2, boolean z) {
        ? hilt_JoinGroupBottomSheetFragment = new Hilt_JoinGroupBottomSheetFragment();
        Bundle A0D2 = C17880vN.A0D();
        int i3 = 2;
        if (i != 1) {
            if (i == 2) {
                i3 = 1;
            } else if (i != 3) {
                i3 = 9;
                if (i != 6) {
                    i3 = 0;
                }
            } else {
                i3 = 5;
            }
        }
        A0D2.putInt("use_case", i3);
        A0D2.putInt("surface_type", i2);
        A0D2.putString("invite_link_code", str);
        A0D2.putBoolean("invite_from_referrer", z);
        hilt_JoinGroupBottomSheetFragment.A1R(A0D2);
        return hilt_JoinGroupBottomSheetFragment;
    }

    public static void A03(JoinGroupBottomSheetFragment joinGroupBottomSheetFragment, int i) {
        if (i > 0) {
            TextView textView = joinGroupBottomSheetFragment.A0u;
            Context context = textView.getContext();
            Object[] A1a = AnonymousClass3MW.A1a();
            boolean A1b = C72453Mb.A1b(A1a, i);
            AnonymousClass3MY.A0y(context, textView, A1a, 2131886534);
            joinGroupBottomSheetFragment.A0u.setVisibility(A1b ? 1 : 0);
            return;
        }
        joinGroupBottomSheetFragment.A0u.setVisibility(8);
    }

    public static void A04(JoinGroupBottomSheetFragment joinGroupBottomSheetFragment, boolean z) {
        joinGroupBottomSheetFragment.A0J.setVisibility(C72453Mb.A07(z ? 1 : 0));
        FrameLayout frameLayout = joinGroupBottomSheetFragment.A0s;
        int paddingLeft = frameLayout.getPaddingLeft();
        int paddingTop = joinGroupBottomSheetFragment.A0s.getPaddingTop();
        int paddingRight = joinGroupBottomSheetFragment.A0s.getPaddingRight();
        Resources A092 = AnonymousClass3MZ.A09(joinGroupBottomSheetFragment);
        int i = 2131168777;
        if (z) {
            i = 2131168774;
        }
        frameLayout.setPadding(paddingLeft, paddingTop, paddingRight, A092.getDimensionPixelOffset(i));
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0A2 = AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131624584);
        this.A0B = (ScrollView) AnonymousClass1HF.A06(A0A2, 2131431875);
        this.A0s = (FrameLayout) AnonymousClass1HF.A06(A0A2, 2131431874);
        this.A02 = AnonymousClass1HF.A06(A0A2, 2131431883);
        this.A04 = AnonymousClass1HF.A06(A0A2, 2131435867);
        this.A03 = AnonymousClass1HF.A06(A0A2, 2131435866);
        this.A00 = AnonymousClass1HF.A06(A0A2, 2131435864);
        this.A0D = AnonymousClass3MW.A0J(A0A2, 2131435865);
        this.A0E = AnonymousClass3MW.A0J(A0A2, 2131431886);
        this.A0K = AnonymousClass3MX.A0V(A0A2, 2131431881);
        this.A0M = C42141xh.A01(A0A2, this.A0L, 2131431881);
        C43421zm.A04(this.A0K);
        this.A0n = (WDSProfilePhoto) AnonymousClass1HF.A06(A0A2, 2131431878);
        this.A0F = AnonymousClass3MW.A0J(A0A2, 2131431880);
        this.A0C = AnonymousClass3MW.A0J(A0A2, 2131431879);
        this.A0h = (ReadMoreTextView) AnonymousClass1HF.A06(A0A2, 2131431876);
        this.A0J = AnonymousClass3MX.A0V(A0A2, 2131431877);
        this.A0l = AnonymousClass3MW.A0q(A0A2, 2131431882);
        this.A0A = (ProgressBar) AnonymousClass1HF.A06(A0A2, 2131431884);
        this.A0m = AnonymousClass3MW.A0q(A0A2, 2131431887);
        this.A0j = C28931bI.A00(A0A2, 2131431885);
        this.A0t = (ImageButton) AnonymousClass1HF.A06(A0A2, 2131431869);
        this.A01 = AnonymousClass1HF.A06(A0A2, 2131431889);
        this.A05 = AnonymousClass3MW.A0G(A0A2, 2131431890);
        this.A06 = AnonymousClass3MW.A0G(A0A2, 2131431891);
        this.A07 = AnonymousClass3MW.A0G(A0A2, 2131431892);
        this.A08 = AnonymousClass3MW.A0G(A0A2, 2131431893);
        this.A09 = AnonymousClass3MW.A0G(A0A2, 2131431894);
        ArrayList A13 = AnonymousClass000.A13();
        this.A0r = A13;
        A13.add(this.A05);
        A13.add(this.A06);
        A13.add(this.A07);
        A13.add(this.A08);
        this.A0r.add(this.A09);
        this.A0u = AnonymousClass3MW.A0J(A0A2, 2131431888);
        return A0A2;
    }

    public void A1x(Context context) {
        super.A1x(context);
        if (context instanceof AnonymousClass5XA) {
            this.A0O = (AnonymousClass5XA) context;
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        String string = A15().getString("arg_parent_group_jid");
        C42941yz r2 = AnonymousClass1EC.A01;
        this.A0f = r2.A02(string);
        AnonymousClass4K4 r4 = this.A0I;
        int i = A15().getInt("use_case");
        int i2 = A15().getInt("surface_type");
        AnonymousClass3VM r0 = (AnonymousClass3VM) new C24071It(new C91764gD(r4, this.A0f, r2.A02(A15().getString("arg_group_jid")), C22941Dw.A02(A15().getString("group_admin_jid")), A15().getString("invite_link_code"), i, i2, A15().getLong("personal_invite_code_expiration", 0), A15().getBoolean("invite_from_referrer")), this).A00(AnonymousClass3VM.class);
        this.A0P = r0;
        C91584fv.A00(this, r0.A0d, 28);
        C91584fv.A00(this, this.A0P.A0E, 29);
        C91584fv.A00(this, this.A0P.A0F, 30);
        C91584fv.A00(this, this.A0P.A0D, 31);
        C91584fv.A00(this, this.A0P.A0e, 32);
        C91584fv.A00(this, this.A0P.A0G, 33);
        C91584fv.A00(this, this.A0P.A0C, 34);
        AnonymousClass3VM r22 = this.A0P;
        C98754rf.A01(r22.A0f, r22, 45);
        this.A0T = this.A0U.A06(A14(), "join-group-bottom-sheet");
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        C91584fv.A00(this, this.A0h.A0A, 35);
        AnonymousClass48m.A00(this.A0t, this, 0);
    }
}
