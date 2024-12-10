package com.whatsapp.xfamily.groups.ui;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3gf;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C30101dO;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C90984ex;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

public final class GroupMembersSelectorActivity extends AnonymousClass3gf {
    public int A00;
    public AnonymousClass1MZ A01;
    public C30101dO A02;
    public AnonymousClass00H A03;
    public String A04;
    public List A05;
    public Map A06;
    public boolean A07;

    public GroupMembersSelectorActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A01 = AnonymousClass3MY.A0V(r2);
            this.A03 = AnonymousClass3MW.A0s(r2);
            this.A06 = r1.A0A();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
                return;
            } else if (i2 != -1) {
                Log.i("GroupMembersSelectorActivity/contact access permissions denied");
            } else {
                return;
            }
        } else if (i2 == -1) {
            Log.i("GroupMembersSelectorActivity/create new group result ok");
            setResult(-1, intent);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Map map = this.A06;
        if (map != null) {
            Object A0w = AnonymousClass000.A0w(map, 1004342578);
            if (A0w != null) {
                this.A02 = (C30101dO) A0w;
                if (!C18020vd.A05(C18040vf.A02, this.A0E, 3989)) {
                    C72453Mb.A16(this, C17880vN.A0A().putExtra("is_success", false));
                }
                if (getIntent() != null) {
                    this.A00 = getIntent().getIntExtra("entry_point", 11);
                    this.A04 = getIntent().getStringExtra("event_name");
                }
                if (bundle == null && !C72463Mc.A1W(this.A0L)) {
                    C72453Mb.A15(this, 2131894317, 2131894316);
                }
                C30101dO r1 = this.A02;
                if (r1 == null) {
                    str = "xFamilyUserFlowLogger";
                } else {
                    r1.A04("SEE_ADD_PARTICIPANTS");
                    return;
                }
            } else {
                throw C17880vN.A0g();
            }
        } else {
            str = "xFamilyUserFlowLoggers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public GroupMembersSelectorActivity(int i) {
        this.A07 = false;
        A2L(new C90984ex(this, 0));
    }
}
