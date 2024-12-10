package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass3MY;
import X.AnonymousClass72R;
import X.AnonymousClass745;
import X.AnonymousClass77G;
import X.AnonymousClass7JX;
import X.C108965cb;
import X.C1417376t;
import X.C142717An;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C196089uR;
import X.C219217x;
import X.C42741yf;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class LinkedAccountMediaViewFragment extends Hilt_LinkedAccountMediaViewFragment {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass1L9 A04;
    public AnonymousClass72R A05;
    public C1417376t A06;
    public AnonymousClass1M9 A07;
    public AnonymousClass1PM A08;
    public AnonymousClass11P A09;
    public C219217x A0A;
    public C18000vb A0B;
    public C18030ve A0C;
    public AnonymousClass1LU A0D;
    public UserJid A0E;
    public C196089uR A0F;
    public AnonymousClass00H A0G;
    public List A0H;
    public boolean A0I = false;
    public boolean A0J;

    public void A22(Menu menu, MenuInflater menuInflater) {
        menu.add(0, 1, 0, 2131891247);
    }

    public static void A02(LinkedAccountMediaViewFragment linkedAccountMediaViewFragment, long j) {
        String A0q = C108965cb.A0q(linkedAccountMediaViewFragment.A09, linkedAccountMediaViewFragment.A0B, j);
        int i = 2131899087;
        if (linkedAccountMediaViewFragment.A00 == 0) {
            i = 2131899027;
        }
        StringBuilder A11 = AnonymousClass000.A11(linkedAccountMediaViewFragment.A1H(i));
        A11.append(" ");
        A11.append(8226);
        String A1H = AnonymousClass001.A1H(" ", A0q, A11);
        TextView textView = linkedAccountMediaViewFragment.A05;
        if (textView != null) {
            textView.setText(A1H);
        }
    }

    public void A20(Bundle bundle) {
        bundle.putInt("extra_target_post_index", this.A09.getCurrentItem());
    }

    public void A1z(Bundle bundle) {
        int i;
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("extra_business_jid");
            C17960vV.A07(parcelable);
            this.A0E = (UserJid) parcelable;
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("extra_post_list");
            C17960vV.A07(parcelableArrayList);
            this.A0H = parcelableArrayList;
            this.A00 = bundle2.getInt("extra_account_type");
            this.A0J = bundle2.getBoolean("extra_is_v2_5_enabled", false);
            if (bundle != null) {
                i = bundle.getInt("extra_target_post_index", 0);
            } else {
                i = bundle2.getInt("extra_target_post_index", 0);
            }
            this.A03 = i;
            this.A01 = i;
            this.A06 = (C1417376t) bundle2.getParcelable("extra_common_fields_for_analytics");
            this.A02 = bundle2.getInt("extra_entry_point");
            A2I(new AnonymousClass7JX(this));
            this.A09.A0J(this.A03, false);
            this.A09.A0K(new C142717An(this));
            this.A09.setScrollEnabled(this.A0J);
            if (this.A02 == 1) {
                A1Z(true);
            }
        }
    }

    public void A21(Bundle bundle, View view) {
        AnonymousClass745 r2;
        Bundle bundle2;
        super.A21(bundle, view);
        if (!(bundle != null || (r2 = this.A0B) == null || (bundle2 = this.A00) == null)) {
            this.A0F = true;
            r2.A0D(bundle2, this);
        }
        this.A01.setVisibility(8);
        AnonymousClass1HF.A06(view, 2131436230).setClickable(false);
        C42741yf A022 = this.A08.A02(this.A0E);
        if (A022 != null) {
            String str = A022.A08;
            TextEmojiLabel textEmojiLabel = this.A06;
            if (textEmojiLabel != null) {
                textEmojiLabel.setText(str);
            }
        }
        A02(this, ((AnonymousClass77G) this.A0H.get(this.A03)).A00);
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return false;
        }
        Uri parse = Uri.parse("https://help.instagram.com/contact/383679321740945");
        String str = ((AnonymousClass77G) this.A0H.get(this.A01)).A03;
        if (!TextUtils.isEmpty(str)) {
            parse = Uri.parse(str);
        }
        if (A1n() != null) {
            this.A04.A08(A1n(), AnonymousClass3MY.A07(parse));
        }
        return true;
    }
}
