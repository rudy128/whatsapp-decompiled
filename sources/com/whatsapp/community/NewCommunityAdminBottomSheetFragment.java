package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass1EC;
import X.AnonymousClass1LC;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3V5;
import X.AnonymousClass48m;
import X.AnonymousClass86E;
import X.C18030ve;
import X.C18070vi;
import X.C21422Ajp;
import X.C36401np;
import X.C43421zm;
import X.C72453Mb;
import X.C82894Co;
import X.C89894dC;
import X.C99244sV;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public final class NewCommunityAdminBottomSheetFragment extends Hilt_NewCommunityAdminBottomSheetFragment implements AnonymousClass86E {
    public AnonymousClass1LC A00;
    public C18030ve A01;
    public C36401np A02;
    public AnonymousClass00H A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        AnonymousClass1EC r1 = (AnonymousClass1EC) A15().getParcelable("parent_group_jid");
        if (r1 != null) {
            AnonymousClass00H r0 = this.A03;
            if (r0 != null) {
                ((AnonymousClass3V5) r0.get()).A00 = r1;
                return AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131626146);
            }
            AnonymousClass3MW.A1H();
            throw null;
        }
        Log.e("NewCommunityAdminBottomSheetFragment/onCreateView parent jid was null");
        A28();
        return null;
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C89894dC.A00(C18070vi.A05(view, 2131428346), this, 20);
        C43421zm.A04(AnonymousClass3Ma.A0E(view, 2131432950));
        TextEmojiLabel A0c = C72453Mb.A0c(view, 2131432948);
        C18030ve r0 = this.A01;
        if (r0 != null) {
            AnonymousClass3Ma.A1L(r0, A0c);
            C36401np r6 = this.A02;
            if (r6 != null) {
                Context A1n = A1n();
                String A16 = AnonymousClass3MX.A16(this, "learn-more", new Object[1], 0, 2131892446);
                String[] strArr = {"learn-more"};
                String[] strArr2 = new String[1];
                AnonymousClass1LC r1 = this.A00;
                if (r1 != null) {
                    strArr2[0] = r1.A00("https://www.whatsapp.com/communities/learning").toString();
                    A0c.setText(r6.A04(A1n, A16, new Runnable[]{new C21422Ajp(10)}, strArr, strArr2));
                    AnonymousClass48m.A00(C18070vi.A05(view, 2131432947), this, 10);
                    AnonymousClass48m.A00(C18070vi.A05(view, 2131432949), this, 11);
                    return;
                }
                str = "waLinkFactory";
            } else {
                str = "linkifier";
            }
        } else {
            str = "abProps";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass3V5 r1 = (AnonymousClass3V5) r0.get();
            AnonymousClass3V5.A03(r1);
            AnonymousClass3V5.A00(C82894Co.DISMISS, r1);
            return;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass3MY.A1K(this, ((AnonymousClass3V5) r0.get()).A01, C99244sV.A00(this, 16), 34);
        } else {
            AnonymousClass3MW.A1H();
            throw null;
        }
    }
}
