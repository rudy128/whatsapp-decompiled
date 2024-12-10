package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass11T;
import X.AnonymousClass129;
import X.AnonymousClass1EC;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass3TJ;
import X.AnonymousClass48l;
import X.AnonymousClass4K3;
import X.AnonymousClass86E;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C21422Ajp;
import X.C36401np;
import X.C42941yz;
import X.C43421zm;
import X.C89894dC;
import X.C91774gE;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;

public class AboutCommunityBottomSheetFragment extends Hilt_AboutCommunityBottomSheetFragment implements AnonymousClass86E {
    public AnonymousClass4K3 A00;
    public AnonymousClass11C A01;
    public C18030ve A02;
    public AnonymousClass1EC A03;
    public AnonymousClass129 A04;
    public C36401np A05;
    public AnonymousClass00H A06;

    public void A21(Bundle bundle, View view) {
        View view2 = view;
        super.A21(bundle, view2);
        C89894dC.A00(AnonymousClass1HF.A06(view2, 2131428346), this, 7);
        C43421zm.A04(AnonymousClass3MW.A0J(view2, 2131427356));
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(view2, 2131427353);
        C18030ve r0 = this.A02;
        C18040vf r3 = C18040vf.A02;
        if (C18020vd.A05(r3, r0, 2356)) {
            A0V.setText(2131886163);
        } else {
            String[] strArr = {this.A04.A04("570221114584995").toString()};
            Runnable[] runnableArr = {new C21422Ajp(8)};
            SpannableString A042 = this.A05.A04(A0V.getContext(), AnonymousClass3MX.A16(this, "learn-more", new Object[1], 0, 2131886162), runnableArr, new String[]{"learn-more"}, strArr);
            AnonymousClass3Ma.A1K(A0V, this.A01);
            AnonymousClass3Ma.A1L(this.A02, A0V);
            A0V.setText(A042);
        }
        TextEmojiLabel A0V2 = AnonymousClass3MX.A0V(view2, 2131427660);
        if (C18020vd.A05(r3, this.A02, 2356)) {
            String[] strArr2 = {this.A04.A04("812356880201038").toString()};
            Runnable[] runnableArr2 = {new C21422Ajp(9)};
            SpannableString A043 = this.A05.A04(A0V2.getContext(), AnonymousClass3MX.A16(this, "learn-more", new Object[1], 0, 2131886165), runnableArr2, new String[]{"learn-more"}, strArr2);
            AnonymousClass3Ma.A1K(A0V2, this.A01);
            AnonymousClass3Ma.A1L(this.A02, A0V2);
            A0V2.setText(A043);
        } else {
            A0V2.setText(2131886164);
        }
        AnonymousClass48l.A00(AnonymousClass1HF.A06(view2, 2131427354), this, 43);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131623967);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        String string = A15().getString("EXTRA_PARENT_GROUP_JID");
        try {
            C42941yz r0 = AnonymousClass1EC.A01;
            AnonymousClass1EC A012 = C42941yz.A01(string);
            this.A03 = A012;
            AnonymousClass4K3 r1 = this.A00;
            C18070vi.A0d(r1, 1);
            AnonymousClass3TJ r02 = (AnonymousClass3TJ) C91774gE.A00(this, r1, A012, 2).A00(AnonymousClass3TJ.class);
            r02.A01.A00("community_home", r02.A00);
        } catch (AnonymousClass11T e) {
            throw new RuntimeException(e);
        }
    }
}
