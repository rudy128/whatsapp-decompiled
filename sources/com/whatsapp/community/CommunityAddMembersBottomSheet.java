package com.whatsapp.community;

import X.A2B;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11E;
import X.AnonymousClass126;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1KB;
import X.AnonymousClass1YH;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48l;
import X.AnonymousClass4a6;
import X.C103945Mg;
import X.C107515Zz;
import X.C17880vN;
import X.C17900vP;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C200410p;
import X.C34511kb;
import X.C72453Mb;
import X.C73203Rj;
import X.C84064Hs;
import X.C85894Pd;
import X.C90004dN;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

public final class CommunityAddMembersBottomSheet extends Hilt_CommunityAddMembersBottomSheet implements C107515Zz {
    public LinearLayout A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C85894Pd A06;
    public AnonymousClass1KB A07;
    public AnonymousClass11E A08;
    public C19830z4 A09;
    public C18030ve A0A;
    public AnonymousClass126 A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public String A0F;
    public final C18100vl A0G = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103945Mg(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624569, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        LinearLayout linearLayout;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Context A1n = A1n();
        if (A1n != null) {
            AnonymousClass11E r0 = this.A08;
            if (r0 == null) {
                str = "connectivityStateProvider";
                C18070vi.A11(str);
                throw null;
            } else if (!r0.A09()) {
                Log.e("CommunityAddMembersBottomSheet/ no network access");
                C73203Rj A002 = AnonymousClass4a6.A00(A1n);
                A002.A0S(A1H(2131892928));
                C73203Rj.A04(this, A002);
                A28();
                return;
            }
        }
        C17880vN.A0E(view, 2131429224).setText(2131886467);
        AnonymousClass3MW.A0H(view, 2131427611).setImageResource(2131232176);
        TextView A0E2 = C17880vN.A0E(A17(), 2131427614);
        this.A03 = A0E2;
        if (A0E2 != null) {
            A0E2.setText(2131886489);
        }
        this.A00 = (LinearLayout) A17().findViewById(2131427612);
        AnonymousClass00H r02 = this.A0D;
        if (r02 != null) {
            C34511kb A0Z = AnonymousClass3MW.A0Z(r02);
            C18100vl r3 = this.A0G;
            A2B A012 = A0Z.A01(AnonymousClass3MX.A0p(r3));
            GroupJid groupJid = null;
            if (A012 != null) {
                groupJid = A012.A02;
            }
            if (!(!(groupJid instanceof AnonymousClass1EC) || groupJid == null || (linearLayout = this.A00) == null)) {
                C90004dN.A00(linearLayout, this, groupJid, 5);
            }
            AnonymousClass126 r03 = this.A0B;
            if (r03 != null) {
                String A0s = C17880vN.A0s(r3.getValue(), r03.A1E);
                if (A0s == null) {
                    Log.i("CommunityAddMembersBottomSheet/invitelink/sendgetlink");
                    C85894Pd r1 = this.A06;
                    if (r1 != null) {
                        r1.A00(this, false).A06(AnonymousClass3MX.A0p(r3));
                        return;
                    }
                    str = "getInviteLinkProtocolHelper";
                } else {
                    A00(A0s);
                    return;
                }
            } else {
                str = "groupChatManager";
            }
        } else {
            str = "communityChatManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    private final void A00(String str) {
        if (this.A0B != null) {
            this.A0F = AnonymousClass001.A1H("https://chat.whatsapp.com/", str, AnonymousClass000.A10());
            TextView A0E2 = C17880vN.A0E(A17(), 2131431999);
            this.A04 = A0E2;
            if (A0E2 != null) {
                String str2 = this.A0F;
                if (str2 != null) {
                    A0E2.setText(str2);
                }
                C18070vi.A11("linkUri");
                throw null;
            }
            this.A01 = (LinearLayout) A17().findViewById(2131432010);
            int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168781);
            LinearLayout linearLayout = this.A01;
            if (linearLayout != null) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), dimensionPixelSize);
            }
            LinearLayout linearLayout2 = this.A01;
            if (linearLayout2 != null) {
                AnonymousClass48l.A00(linearLayout2, this, 44);
            }
            this.A05 = C17880vN.A0E(A17(), 2131435367);
            String A0n = AnonymousClass3MY.A0n(this, 2131899103);
            TextView textView = this.A05;
            if (textView != null) {
                textView.setText(AnonymousClass3MY.A0o(this, A0n, 0, 2131896097));
            }
            this.A02 = (LinearLayout) A17().findViewById(2131435404);
            Object[] objArr = new Object[1];
            String str3 = this.A0F;
            if (str3 != null) {
                String A16 = AnonymousClass3MX.A16(this, str3, objArr, 0, 2131896090);
                C18070vi.A0X(A16);
                LinearLayout linearLayout3 = this.A02;
                if (linearLayout3 != null) {
                    AnonymousClass3Ma.A1G(linearLayout3, this, A16, 9);
                    return;
                }
                return;
            }
            C18070vi.A11("linkUri");
            throw null;
        }
    }

    public void A1r() {
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        this.A04 = null;
        LinearLayout linearLayout2 = this.A00;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        this.A03 = null;
        LinearLayout linearLayout3 = this.A02;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        this.A05 = null;
        super.A1r();
    }

    public void A1w(int i, int i2, Intent intent) {
        if ((i == 105 || i == 106) && i2 == -1) {
            A28();
        }
    }

    public void Bwi(int i, String str, boolean z) {
        String str2;
        Resources.Theme theme;
        StringBuilder A10 = AnonymousClass000.A10();
        if (str != null) {
            C17900vP.A0f("CommunityAddMembersBottomSheet/invitelink/gotcode/", str, A10);
            AnonymousClass126 r2 = this.A0B;
            if (r2 != null) {
                r2.A1E.put(this.A0G.getValue(), str);
                A00(str);
                return;
            }
            str2 = "groupChatManager";
        } else {
            C17900vP.A0i("CommunityAddMembersBottomSheet/invitelink/failed/", A10, i);
            Integer[] numArr = new Integer[2];
            boolean A1b = C72453Mb.A1b(numArr, 401);
            numArr[1] = 404;
            if (C200410p.A0S(numArr).contains(Integer.valueOf(i))) {
                A28();
            } else {
                LinearLayout linearLayout = (LinearLayout) A17().findViewById(2131432010);
                this.A01 = linearLayout;
                C72453Mb.A1D(linearLayout);
                TextView A0E2 = C17880vN.A0E(A17(), 2131435367);
                this.A05 = A0E2;
                if (A0E2 != null) {
                    A0E2.setText(2131889968);
                }
                TextView textView = this.A05;
                if (textView != null) {
                    Resources A092 = AnonymousClass3MZ.A09(this);
                    Context A1n = A1n();
                    if (A1n != null) {
                        theme = A1n.getTheme();
                    } else {
                        theme = null;
                    }
                    textView.setTextColor(AnonymousClass1YH.A00(theme, A092, 2131103028));
                }
            }
            int A002 = C84064Hs.A00(i, true);
            AnonymousClass1KB r0 = this.A07;
            if (r0 != null) {
                r0.A06(A002, A1b ? 1 : 0);
                return;
            }
            str2 = "globalUI";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        A28();
    }
}
