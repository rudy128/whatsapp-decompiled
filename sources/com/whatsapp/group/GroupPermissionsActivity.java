package com.whatsapp.group;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass18K;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass8GZ;
import X.C000200d;
import X.C106945Xu;
import X.C108655c5;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C56362hL;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C83694Gh;
import X.C84364Jf;
import X.C91014f0;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class GroupPermissionsActivity extends AnonymousClass1FY implements C106945Xu {
    public C56362hL A00;
    public C84364Jf A01;
    public AnonymousClass1CJ A02;
    public AnonymousClass18K A03;
    public GroupPermissionsLayout A04;
    public C108655c5 A05;
    public AnonymousClass1EC A06;
    public AnonymousClass1EC A07;
    public AnonymousClass00H A08;
    public boolean A09;
    public final C18100vl A0A;

    public GroupPermissionsActivity() {
        this(0);
        this.A0A = C83694Gh.A00(this, "entry_point", 6);
    }

    public static final void A03(Bundle bundle, GroupPermissionsActivity groupPermissionsActivity) {
        C18070vi.A0d(bundle, 2);
        boolean z = bundle.getBoolean("is_approve_all_pending_requests");
        C108655c5 r0 = groupPermissionsActivity.A05;
        if (z) {
            if (r0 != null) {
                r0.BpY();
                return;
            }
        } else if (r0 != null) {
            r0.C2q();
            return;
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public static final void A0Q(Bundle bundle, GroupPermissionsActivity groupPermissionsActivity) {
        C18070vi.A0d(bundle, 2);
        boolean z = bundle.getBoolean("is_approve_all_pending_requests");
        C108655c5 r0 = groupPermissionsActivity.A05;
        if (z) {
            if (r0 != null) {
                r0.Bpa();
                return;
            }
        } else if (r0 != null) {
            r0.C2s();
            return;
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public static final void A0V(Bundle bundle, GroupPermissionsActivity groupPermissionsActivity) {
        C18070vi.A0d(bundle, 2);
        boolean z = bundle.getBoolean("clear_all_admin_reviews");
        C108655c5 r0 = groupPermissionsActivity.A05;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else {
            r0.C3I(z);
        }
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A02 = AnonymousClass3Ma.A0d(r2);
            this.A08 = C000200d.A00(r2.A2L);
            this.A00 = (C56362hL) A0K.A1r.get();
            this.A01 = (C84364Jf) A0K.A2r.get();
            this.A03 = AnonymousClass3Ma.A0g(r2);
        }
    }

    public void onBackPressed() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 7889)) {
            C108655c5 r0 = this.A05;
            if (r0 != null) {
                if (r0 instanceof AnonymousClass8GZ) {
                    Intent A0A2 = C17880vN.A0A();
                    C108655c5 r02 = this.A05;
                    if (r02 != null) {
                        A0A2.putExtra("has_permissions_changed", ((AnonymousClass8GZ) r02).A05);
                        setResult(-1, A0A2);
                    }
                }
            }
            C18070vi.A11("viewModel");
            throw null;
        }
        super.onBackPressed();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 17 && intent != null && i2 == -1) {
            ArrayList A0r = C72463Mc.A0r(intent, UserJid.class);
            C108655c5 r0 = this.A05;
            if (r0 == null) {
                AnonymousClass3MW.A1H();
                throw null;
            } else {
                r0.BJp(this, A0r);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r0 = 2131625516(0x7f0e062c, float:1.8878242E38)
            r9.setContentView((int) r0)
            r0 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r3 = X.AnonymousClass3MY.A0C(r9, r0)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r9.setSupportActionBar(r3)
            X.C72473Md.A17(r9)
            r0 = 2131431303(0x7f0b0f87, float:1.8484331E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r9, r0)
            com.whatsapp.group.GroupPermissionsLayout r0 = (com.whatsapp.group.GroupPermissionsLayout) r0
            r9.A04 = r0
            X.1yz r2 = X.AnonymousClass1EC.A01
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "gid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.1EC r0 = r2.A02(r0)
            r9.A06 = r0
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "parent_gid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.1EC r0 = r2.A02(r0)
            r9.A07 = r0
            r8 = 0
            if (r0 != 0) goto L_0x0056
            X.1EC r1 = r9.A06
            if (r1 == 0) goto L_0x0115
            X.00H r0 = r9.A08
            if (r0 == 0) goto L_0x02f3
            X.1EC r0 = X.C72453Mb.A0n(r1, r0)
        L_0x0054:
            r9.A07 = r0
        L_0x0056:
            X.0vl r0 = r9.A0A
            int r0 = X.C72453Mb.A0I(r0)
            X.3yv r2 = new X.3yv
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            X.1EC r1 = r9.A06
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = r1.user
            boolean r0 = X.C36321nh.A02(r0)
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = r1.getRawString()
            r2.A01 = r0
        L_0x0079:
            X.18K r0 = r9.A03
            if (r0 == 0) goto L_0x02ef
            r0.CC7(r2)
            X.1EC r4 = r9.A06
            r0 = 2131891125(0x7f1213b5, float:1.9416961E38)
            r9.setTitle(r0)
            X.0ve r2 = r9.A0E
            r1 = 7180(0x1c0c, float:1.0061E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00b7
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "group_subject"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x00d8
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = r0.getStringExtra(r1)
        L_0x00a8:
            if (r1 == 0) goto L_0x00b7
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00b7
            androidx.appcompat.widget.Toolbar r0 = r9.A02
            if (r0 == 0) goto L_0x00b7
            r0.setSubtitle((java.lang.CharSequence) r1)
        L_0x00b7:
            if (r4 == 0) goto L_0x00e3
            X.2hL r2 = r9.A00
            if (r2 == 0) goto L_0x02df
            X.1EC r1 = r9.A07
            r0 = 3
            X.1It r1 = X.C91784gF.A00(r9, r4, r2, r1, r0)
            java.lang.Class<X.8GZ> r0 = X.AnonymousClass8GZ.class
            X.1J2 r0 = r1.A00(r0)
            X.5c5 r0 = (X.C108655c5) r0
            r9.A05 = r0
        L_0x00ce:
            X.5c5 r0 = r9.A05
            java.lang.String r7 = "viewModel"
            if (r0 != 0) goto L_0x0118
            X.C18070vi.A11(r7)
            throw r8
        L_0x00d8:
            if (r4 == 0) goto L_0x00e3
            X.1CJ r0 = r9.A02
            if (r0 == 0) goto L_0x02e5
            java.lang.String r1 = r0.A0F(r4)
            goto L_0x00a8
        L_0x00e3:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r5 = "setting_values"
            android.os.Bundle r4 = r0.getBundleExtra(r5)
            X.C17960vV.A07(r4)
            X.C18070vi.A0X(r4)
            X.4Jf r2 = r9.A01
            if (r2 == 0) goto L_0x02e9
            X.1EC r1 = r9.A07
            r0 = 5
            X.1It r1 = X.C91784gF.A00(r9, r4, r2, r1, r0)
            java.lang.Class<X.3Vb> r0 = X.C73363Vb.class
            X.1J2 r0 = r1.A00(r0)
            X.5c5 r0 = (X.C108655c5) r0
            r9.A05 = r0
            android.content.Intent r0 = X.C17880vN.A0A()
            android.content.Intent r1 = r0.putExtra(r5, r4)
            r0 = -1
            r9.setResult(r0, r1)
            goto L_0x00ce
        L_0x0115:
            r0 = r8
            goto L_0x0054
        L_0x0118:
            X.1DS r1 = r0.BYB()
            X.5Sf r0 = new X.5Sf
            r0.<init>(r9)
            r6 = 34
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x012e
            X.C18070vi.A11(r7)
            throw r8
        L_0x012e:
            X.1DS r1 = r0.BZF()
            X.5Sg r0 = new X.5Sg
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x0142
            X.C18070vi.A11(r7)
            throw r8
        L_0x0142:
            X.1DT r1 = r0.BTL()
            X.5Sh r0 = new X.5Sh
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x0156
            X.C18070vi.A11(r7)
            throw r8
        L_0x0156:
            X.1DT r1 = r0.BTM()
            X.5Si r0 = new X.5Si
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x016a
            X.C18070vi.A11(r7)
            throw r8
        L_0x016a:
            X.3TB r1 = r0.BP4()
            X.5Sj r0 = new X.5Sj
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x017e
            X.C18070vi.A11(r7)
            throw r8
        L_0x017e:
            X.1DT r1 = r0.BTR()
            X.5Sk r0 = new X.5Sk
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x0192
            X.C18070vi.A11(r7)
            throw r8
        L_0x0192:
            X.1DT r1 = r0.BTG()
            X.5Sl r0 = new X.5Sl
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x01a6
            X.C18070vi.A11(r7)
            throw r8
        L_0x01a6:
            X.1DS r1 = r0.BTF()
            X.5Sm r0 = new X.5Sm
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x01ba
            X.C18070vi.A11(r7)
            throw r8
        L_0x01ba:
            X.1DS r1 = r0.BMe()
            X.5SX r0 = new X.5SX
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x01ce
            X.C18070vi.A11(r7)
            throw r8
        L_0x01ce:
            X.1wy r1 = r0.BZE()
            X.5SY r0 = new X.5SY
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x01e2
            X.C18070vi.A11(r7)
            throw r8
        L_0x01e2:
            X.1wy r1 = r0.BZG()
            X.5SZ r0 = new X.5SZ
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x01f6
            X.C18070vi.A11(r7)
            throw r8
        L_0x01f6:
            X.1DS r1 = r0.BTH()
            X.5Sa r0 = new X.5Sa
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x020a
            X.C18070vi.A11(r7)
            throw r8
        L_0x020a:
            X.1DS r1 = r0.BTS()
            X.5Sb r0 = new X.5Sb
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x021e
            X.C18070vi.A11(r7)
            throw r8
        L_0x021e:
            X.1DS r1 = r0.BTK()
            X.5Sc r0 = new X.5Sc
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x0232
            X.C18070vi.A11(r7)
            throw r8
        L_0x0232:
            X.1DS r1 = r0.BTQ()
            X.5Sd r0 = new X.5Sd
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x0246
            X.C18070vi.A11(r7)
            throw r8
        L_0x0246:
            X.1DS r1 = r0.BTP()
            X.5Se r0 = new X.5Se
            r0.<init>(r9)
            X.C91644g1.A00(r9, r1, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x025a
            X.C18070vi.A11(r7)
            throw r8
        L_0x025a:
            X.1DS r4 = r0.BTJ()
            com.whatsapp.group.GroupPermissionsLayout r2 = r9.A04
            java.lang.String r5 = "groupPermissionsLayout"
            if (r2 != 0) goto L_0x0268
            X.C18070vi.A11(r5)
            throw r8
        L_0x0268:
            r1 = 2
            X.5Aj r0 = new X.5Aj
            r0.<init>(r2, r1)
            X.C91644g1.A00(r9, r4, r0, r6)
            X.5c5 r0 = r9.A05
            if (r0 != 0) goto L_0x0279
            X.C18070vi.A11(r7)
            throw r8
        L_0x0279:
            X.1DS r4 = r0.BTI()
            com.whatsapp.group.GroupPermissionsLayout r2 = r9.A04
            if (r2 != 0) goto L_0x0285
            X.C18070vi.A11(r5)
            throw r8
        L_0x0285:
            r1 = 3
            X.5Aj r0 = new X.5Aj
            r0.<init>(r2, r1)
            X.C91644g1.A00(r9, r4, r0, r6)
            com.whatsapp.group.GroupPermissionsLayout r0 = r9.A04
            if (r0 != 0) goto L_0x0296
            X.C18070vi.A11(r5)
            throw r8
        L_0x0296:
            r0.setClickEventListener(r9)
            r0 = 2131432256(0x7f0b1340, float:1.8486264E38)
            android.view.View r1 = X.C110885hR.A0A(r9, r0)
            r0 = 31
            X.C825148g.A00(r1, r9, r0)
            X.1GP r2 = r9.getSupportFragmentManager()
            r0 = 21
            X.4fa r1 = new X.4fa
            r1.<init>(r9, r0)
            java.lang.String r0 = "group_join_request_approve_all_pending_requests"
            r2.A0t(r1, r9, r0)
            X.1GP r2 = r9.getSupportFragmentManager()
            r0 = 22
            X.4fa r1 = new X.4fa
            r1.<init>(r9, r0)
            java.lang.String r0 = "group_join_request_group_too_full"
            r2.A0t(r1, r9, r0)
            X.1GP r2 = r9.getSupportFragmentManager()
            r0 = 23
            X.4fa r1 = new X.4fa
            r1.<init>(r9, r0)
            java.lang.String r0 = "confirm_clear_admin_reviews_dialog_result"
            r2.A0t(r1, r9, r0)
            r1 = 7
            X.4dR r0 = new X.4dR
            r0.<init>((java.lang.Object) r9, (int) r1)
            r3.setNavigationOnClickListener(r0)
            return
        L_0x02df:
            java.lang.String r0 = "existingGroupPermissionsViewModelFactory"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02e5:
            X.AnonymousClass3MW.A1I()
            throw r8
        L_0x02e9:
            java.lang.String r0 = "newGroupPermissionsViewModelFactory"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02ef:
            X.AnonymousClass3MW.A1J()
            throw r8
        L_0x02f3:
            java.lang.String r0 = "communityChatManager"
            X.C18070vi.A11(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupPermissionsActivity.onCreate(android.os.Bundle):void");
    }

    public GroupPermissionsActivity(int i) {
        this.A09 = false;
        C91014f0.A00(this, 19);
    }
}
