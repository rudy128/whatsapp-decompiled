package com.whatsapp.group;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C161478Eq;
import X.C18070vi;
import X.C42941yz;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;

public final class GroupPendingParticipantsActivity extends AnonymousClass1FY {
    public AnonymousClass1MZ A00;
    public boolean A01;

    public GroupPendingParticipantsActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MY.A0V(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131891124);
        setContentView(2131625514);
        String stringExtra = getIntent().getStringExtra("gid");
        if (stringExtra != null) {
            AnonymousClass1MZ r1 = this.A00;
            if (r1 != null) {
                C42941yz r0 = AnonymousClass1EC.A01;
                boolean A0K = r1.A0K(C42941yz.A01(stringExtra));
                C72473Md.A18(this);
                ((ViewPager) AnonymousClass3MY.A0H(this, 2131433756)).setAdapter(new C161478Eq(this, AnonymousClass3MX.A0O(this), stringExtra, A0K));
                return;
            }
            C18070vi.A11("groupParticipantsManager");
            throw null;
        }
    }

    public GroupPendingParticipantsActivity(int i) {
        this.A01 = false;
        C91014f0.A00(this, 18);
    }
}
