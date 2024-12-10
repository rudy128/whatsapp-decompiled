package com.whatsapp.community.deactivate;

import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FL;
import X.AnonymousClass1M9;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass4bA;
import X.AnonymousClass5XD;
import X.C010105w;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C24921Me;
import X.C42941yz;
import X.C43421zm;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public final class DeactivateCommunityConfirmationFragment extends Hilt_DeactivateCommunityConfirmationFragment {
    public AnonymousClass5XD A00;
    public AnonymousClass1M9 A01;
    public C24921Me A02;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        C17960vV.A07(context);
        this.A00 = (AnonymousClass5XD) context;
    }

    public void A1v() {
        super.A1v();
        Dialog dialog = this.A03;
        if (dialog instanceof C010105w) {
            Button button = ((C010105w) dialog).A00.A0H;
            C72463Mc.A0w(A1n(), button.getContext(), button, 2130970927, 2131102371);
        }
    }

    public Dialog A27(Bundle bundle) {
        String str;
        String string = A15().getString("parent_group_jid");
        C17960vV.A07(string);
        C18070vi.A0X(string);
        C42941yz r0 = AnonymousClass1EC.A01;
        AnonymousClass1EC A012 = C42941yz.A01(string);
        AnonymousClass1M9 r02 = this.A01;
        if (r02 != null) {
            AnonymousClass1E7 A0H = r02.A0H(A012);
            AnonymousClass1FL A1D = A1D();
            View inflate = LayoutInflater.from(A1D).inflate(2131625057, (ViewGroup) null);
            Object[] objArr = new Object[1];
            C24921Me r03 = this.A02;
            if (r03 != null) {
                String A10 = AnonymousClass3Ma.A10(A1D, r03.A0I(A0H), objArr, 0, 2131889192);
                Object[] objArr2 = new Object[1];
                C24921Me r04 = this.A02;
                if (r04 != null) {
                    Spanned fromHtml = Html.fromHtml(C17880vN.A0q(A1D, Html.escapeHtml(r04.A0I(A0H)), objArr2, 0, 2131889191));
                    C18070vi.A0X(fromHtml);
                    TextEmojiLabel A0c = C72453Mb.A0c(inflate, 2131429816);
                    A0c.A0S(A10, (List) null, 0, false);
                    C43421zm.A04(A0c);
                    C72453Mb.A0c(inflate, 2131429815).A0S(fromHtml, (List) null, 0, false);
                    C73203Rj A002 = AnonymousClass4a6.A00(A1D);
                    A002.A0c(inflate);
                    A002.A0T(true);
                    A002.A0X(new AnonymousClass4bA(this, 5), 2131898766);
                    C73203Rj.A08(A002, this, 6, 2131889190);
                    return AnonymousClass3MY.A0L(A002);
                }
                str = "waContactNames";
            } else {
                C18070vi.A11("waContactNames");
                throw null;
            }
        } else {
            str = "contactManager";
        }
        C18070vi.A11(str);
        throw null;
    }
}
