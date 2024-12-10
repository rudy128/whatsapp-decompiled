package com.whatsapp.group.newgroup;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass122;
import X.AnonymousClass126;
import X.AnonymousClass129;
import X.AnonymousClass18K;
import X.AnonymousClass18O;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1M9;
import X.AnonymousClass1NN;
import X.AnonymousClass1PQ;
import X.AnonymousClass1PS;
import X.AnonymousClass1YL;
import X.AnonymousClass25I;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3X9;
import X.AnonymousClass48A;
import X.AnonymousClass4D7;
import X.AnonymousClass4QD;
import X.AnonymousClass4Sn;
import X.AnonymousClass4XG;
import X.AnonymousClass4a6;
import X.C000200d;
import X.C107405Zo;
import X.C107415Zp;
import X.C107845ai;
import X.C110885hR;
import X.C1193267r;
import X.C137186v3;
import X.C1418577f;
import X.C17880vN;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18090vk;
import X.C19740yt;
import X.C19760yx;
import X.C21355Aik;
import X.C22821Di;
import X.C22851Dl;
import X.C22971Dz;
import X.C23391Fw;
import X.C23401Fx;
import X.C24261Jm;
import X.C24791Lr;
import X.C24921Me;
import X.C25111Mx;
import X.C25231Nk;
import X.C25704CkZ;
import X.C26881Tv;
import X.C27071Up;
import X.C27191Vc;
import X.C27201Vd;
import X.C27641Ww;
import X.C34441kU;
import X.C36401np;
import X.C37451pZ;
import X.C43391zj;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C73413Vs;
import X.C74793cj;
import X.C74873d3;
import X.C86874Tk;
import X.C87094Ug;
import X.C91014f0;
import X.C91074f6;
import X.C91604fx;
import X.C92094gk;
import X.C95444mF;
import X.C99154sM;
import X.C99244sV;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class NewGroup extends AnonymousClass1FY implements C107415Zp, C107405Zo {
    public int A00;
    public Bundle A01;
    public Bundle A02;
    public Bundle A03;
    public TextView A04;
    public C19760yx A05;
    public RecyclerView A06;
    public WaEditText A07;
    public WaEditText A08;
    public AnonymousClass1M9 A09;
    public C25111Mx A0A;
    public C24921Me A0B;
    public C24791Lr A0C;
    public C26881Tv A0D;
    public C37451pZ A0E;
    public C27201Vd A0F;
    public C27191Vc A0G;
    public AnonymousClass1CJ A0H;
    public AnonymousClass1NN A0I;
    public AnonymousClass122 A0J;
    public AnonymousClass4XG A0K;
    public AnonymousClass1PS A0L;
    public C74873d3 A0M;
    public C1193267r A0N;
    public AnonymousClass4QD A0O;
    public AnonymousClass18K A0P;
    public AnonymousClass126 A0Q;
    public AnonymousClass3X9 A0R;
    public AnonymousClass1EC A0S;
    public C34441kU A0T;
    public C18010vc A0U;
    public C27071Up A0V;
    public AnonymousClass1PQ A0W;
    public AnonymousClass129 A0X;
    public C36401np A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public Integer A0h;
    public String A0i;
    public List A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public int A0p;
    public ImageView A0q;
    public KeyboardPopupLayout A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public final AnonymousClass02n A0v;
    public final C107845ai A0w;
    public final AnonymousClass1E7 A0x;
    public final AtomicReference A0y;
    public final C18090vk A0z;
    public final C22821Di A10;
    public final C25231Nk A11;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.02h] */
    public NewGroup() {
        this(0);
        this.A0y = new AtomicReference();
        this.A0x = new AnonymousClass25I();
        this.A00 = -1;
        this.A0m = false;
        this.A0v = C91074f6.A00(this, new Object(), 10);
        this.A0w = new C92094gk(this, 8);
        this.A11 = new C95444mF(this, 15);
        this.A0z = new C99154sM(this, 25);
        this.A10 = C99244sV.A00(this, 32);
    }

    private void A0Q() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168470);
        this.A0q.setImageBitmap(this.A0G.A04(this, this.A0x, "NewGroup.updateAddPhotoButtonWithSelectedProfilePhoto", 0.0f, dimensionPixelSize, false));
    }

    public static File A03(NewGroup newGroup) {
        File A002 = newGroup.A0C.A00(newGroup.A0x);
        if (A002 == null || !A002.exists()) {
            return null;
        }
        return A002;
    }

    private void A0V(int i) {
        int A002;
        AnonymousClass4D7 r0;
        this.A00 = i;
        if (i <= 0) {
            A002 = 2131101222;
        } else {
            A002 = AnonymousClass1YL.A00(this, 2130970098, 2131101221);
        }
        C18030ve r2 = this.A0E;
        boolean z = false;
        if (r2 != null) {
            z = C18020vd.A05(C18040vf.A02, r2, 12551);
        }
        boolean z2 = false;
        if (z) {
            if (i > 0) {
                z2 = true;
            }
            WDSListItem wDSListItem = (WDSListItem) C110885hR.A0A(this, 2131431256);
            C25704CkZ ckZ = wDSListItem.A0B;
            if (z2) {
                r0 = AnonymousClass4D7.NORMAL;
            } else {
                r0 = AnonymousClass4D7.NEUTRAL;
            }
            if (ckZ != null) {
                ckZ.A01(r0);
                wDSListItem.A0B = ckZ;
            }
            wDSListItem.setSubText((CharSequence) C43391zj.A00.A09(this, i, false, false));
            wDSListItem.setVisibility(0);
            return;
        }
        C74793cj r1 = (C74793cj) C110885hR.A0A(this, 2131431256);
        r1.setIconColor(C19740yt.A00(this, A002));
        r1.setDescription((CharSequence) C43391zj.A00.A09(this, i, false, false));
        r1.setVisibility(0);
    }

    private void A0c(WaEditText waEditText, int i, int i2, int i3) {
        WaEditText waEditText2 = waEditText;
        C27641Ww.A09(waEditText2, this.A00);
        int i4 = i2;
        waEditText2.setFilters(new InputFilter[]{new C1418577f(i4)});
        C18030ve r8 = this.A0E;
        AnonymousClass1KW r7 = this.A0D;
        AnonymousClass11C r4 = this.A08;
        C18000vb r5 = this.A00;
        C18010vc r9 = this.A0U;
        waEditText2.addTextChangedListener(new AnonymousClass48A(waEditText2, AnonymousClass3MW.A0I(this, i), r4, r5, this.A0C, r7, r8, r9, i4, i3, false, false, false));
    }

    public static void A0d(NewGroup newGroup) {
        Editable text;
        String A12 = AnonymousClass3Ma.A12(newGroup.A08);
        WaEditText waEditText = newGroup.A07;
        if (!(waEditText == null || (text = waEditText.getText()) == null)) {
            text.toString();
        }
        if (!A0w(newGroup, A12)) {
            Editable text2 = newGroup.A07.getText();
            if (text2 == null) {
                text2 = "";
            }
            String A0q2 = C72463Mc.A0q(text2);
            if (!AnonymousClass3MW.A1Y(newGroup)) {
                Log.i("newgroup/no network access, fail to suggest group");
                String string = newGroup.getString(2131892439);
                C73203Rj A002 = AnonymousClass4a6.A00(newGroup);
                A002.A0S(string);
                A002.A0g(newGroup, new C91604fx(newGroup, 40), 2131899286);
                A002.A0C();
                return;
            }
            Log.i("newgroup/go suggest group:");
            Intent A0A2 = C17880vN.A0A();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putString("extra_group_name", A12);
            A0D2.putString("extra_parent_group_jid", C22971Dz.A06(newGroup.A0S));
            A0D2.putString("extra_group_description", A0q2);
            if (C18020vd.A05(C18040vf.A02, newGroup.A0E, 7180)) {
                A0D2.putBundle("extra_group_settings_bundle", newGroup.A03);
                A0D2.putBoolean("extra_is_hidden_subgroup_bundle", newGroup.A0m);
            }
            A0A2.putExtra("group_suggested", A0D2);
            C72453Mb.A16(newGroup, A0A2);
        }
    }

    public static void A0q(NewGroup newGroup) {
        AnonymousClass3X9 r5 = newGroup.A0R;
        ArrayList A13 = AnonymousClass000.A13();
        if (newGroup.A0o) {
            A13.add(new C86874Tk(1, new AnonymousClass4Sn(newGroup.A0z)));
        }
        Iterator it = newGroup.A0j.iterator();
        while (it.hasNext()) {
            A13.add(new C86874Tk(2, new C87094Ug(newGroup.A0E, C17880vN.A0O(it), newGroup.A10, newGroup.A0o)));
        }
        ArrayList A132 = AnonymousClass000.A13();
        A132.addAll(A13);
        A132.add(new C86874Tk(3, (Object) null));
        List list = r5.A00;
        C72473Md.A1B(new C73413Vs(list, A132), r5, A132, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0r(com.whatsapp.group.newgroup.NewGroup r6) {
        /*
            java.util.List r0 = r6.A0j
            int r5 = r0.size()
            if (r5 != 0) goto L_0x0011
            android.widget.TextView r1 = r6.A04
            r0 = 2131892478(0x7f1218fe, float:1.9419705E38)
            r1.setText(r0)
            return
        L_0x0011:
            java.util.concurrent.atomic.AtomicReference r1 = r6.A0y
            java.lang.Object r0 = r1.get()
            r4 = 0
            if (r0 == 0) goto L_0x0055
            X.126 r2 = r6.A0Q
            java.lang.Object r1 = r1.get()
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.1M9 r0 = r2.A08
            X.1E7 r0 = r0.A0G(r1)
            if (r0 == 0) goto L_0x0055
            X.1MZ r0 = r2.A0O
            int r0 = r0.A02(r1)
            int r3 = r0 + -1
        L_0x0032:
            r2 = 1
            if (r3 <= 0) goto L_0x004c
            r1 = 2131892477(0x7f1218fd, float:1.9419703E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1b()
            X.C17880vN.A1T(r0, r5, r4)
            X.C17880vN.A1T(r0, r3, r2)
        L_0x0042:
            java.lang.String r1 = r6.getString(r1, r0)
            android.widget.TextView r0 = r6.A04
            r0.setText(r1)
            return
        L_0x004c:
            r1 = 2131892476(0x7f1218fc, float:1.9419701E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.C17880vN.A1T(r0, r5, r4)
            goto L_0x0042
        L_0x0055:
            r3 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.A0r(com.whatsapp.group.newgroup.NewGroup):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0t(java.lang.String r5, java.util.List r6, boolean r7) {
        /*
            r4 = this;
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r1 = r0.A02(r5)
            r4.A0S = r1
            boolean r0 = r4.A0k
            if (r0 != 0) goto L_0x000f
            r0 = 0
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r4.A0l = r0
            X.00H r0 = r4.A0Z
            X.1kb r2 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r4.A0S
            r1 = 0
            if (r0 == 0) goto L_0x0024
            boolean r0 = r2.A0V(r0)
            if (r0 != 0) goto L_0x0024
            r1 = 1
        L_0x0024:
            r4.A0n = r1
            X.1EC r1 = r4.A0S
            if (r1 == 0) goto L_0x0062
            X.1CJ r0 = r4.A0H
            java.lang.String r0 = r0.A0F(r1)
        L_0x0030:
            r4.A0i = r0
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.ArrayList r1 = X.C22971Dz.A0A(r0, r6)
            int r0 = r1.size()
            java.util.ArrayList r0 = X.C17880vN.A0z(r0)
            r4.A0j = r0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x006d
            java.util.Iterator r3 = r1.iterator()
        L_0x004c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006d
            X.1BI r2 = X.C17880vN.A0Q(r3)
            java.util.List r1 = r4.A0j
            X.1M9 r0 = r4.A09
            X.1E7 r0 = r0.A0H(r2)
            r1.add(r0)
            goto L_0x004c
        L_0x0062:
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "community_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            goto L_0x0030
        L_0x006d:
            A0r(r4)
            A0q(r4)
            r4.A0t = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.A0t(java.lang.String, java.util.List, boolean):void");
    }

    private void A0u(boolean z) {
        int i;
        int i2;
        AnonymousClass4D7 r0;
        this.A0m = z;
        C18030ve r2 = this.A0E;
        if (r2 == null || !C18020vd.A05(C18040vf.A02, r2, 12551)) {
            C74793cj r1 = (C74793cj) C110885hR.A0A(this, 2131431317);
            if (z) {
                r1.setIcon(2131233483);
                r1.setIconColor(C19740yt.A00(this, 2131101221));
                i = 2131891171;
            } else {
                r1.setIcon(2131233484);
                r1.setIconColor(C19740yt.A00(this, 2131101222));
                i = 2131891173;
            }
            r1.setDescription(i);
            return;
        }
        WDSListItem wDSListItem = (WDSListItem) C110885hR.A0A(this, 2131431317);
        if (z) {
            wDSListItem.setEndAddonIcon(C24261Jm.A00(this, 2131233483));
            i2 = 2131891171;
        } else {
            wDSListItem.setEndAddonIcon(C24261Jm.A00(this, 2131233484));
            i2 = 2131891173;
        }
        wDSListItem.setSubText((CharSequence) C19740yt.A07(this, i2));
        C25704CkZ ckZ = wDSListItem.A0B;
        if (z) {
            r0 = AnonymousClass4D7.NORMAL;
        } else {
            r0 = AnonymousClass4D7.NEUTRAL;
        }
        if (ckZ != null) {
            ckZ.A01(r0);
            wDSListItem.A0B = ckZ;
        }
    }

    private boolean A0v() {
        int size = this.A0j.size();
        if (!this.A0l && !this.A0s && !this.A0t && size > 0) {
            if (size > C18020vd.A00(C18040vf.A02, this.A0E, 4118)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A2y() {
        if (!this.A0u) {
            this.A0u = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r3 = A0K2.AAQ;
            C72483Me.A0q(r3, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass1FB.A0K(r3, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r3, r1, this, r1.A5A);
            this.A0Y = AnonymousClass3MY.A0e(r1);
            this.A0g = AnonymousClass3MW.A0s(r3);
            this.A0H = AnonymousClass3Ma.A0d(r3);
            this.A0P = AnonymousClass3Ma.A0g(r3);
            this.A0N = AnonymousClass3MZ.A0t(r3);
            this.A0F = AnonymousClass3MZ.A0i(r3);
            this.A0e = C000200d.A00(r3.A6N);
            this.A09 = AnonymousClass10E.A4z(r3);
            this.A0X = AnonymousClass3Ma.A0t(r3);
            this.A0B = AnonymousClass3MZ.A0g(r3);
            this.A0J = AnonymousClass3MZ.A0n(r3);
            this.A0Q = AnonymousClass3MY.A0X(r3);
            this.A0A = (C25111Mx) r3.A8k.get();
            this.A0T = AnonymousClass10E.AFe(r3);
            this.A0C = (C24791Lr) r3.A2h.get();
            this.A0D = (C26881Tv) r3.AIX.get();
            this.A0a = C000200d.A00(r1.A1c);
            this.A0V = C72453Mb.A0p(r3);
            this.A0Z = C000200d.A00(r3.A2L);
            this.A0W = (AnonymousClass1PQ) r3.AAn.get();
            this.A0I = AnonymousClass3Ma.A0e(r3);
            this.A0U = AnonymousClass3Ma.A0r(r3);
            this.A0d = C000200d.A00(r3.AUl);
            this.A0G = AnonymousClass3MZ.A0j(r3);
            this.A0f = AnonymousClass3MX.A11(r3);
            this.A0b = C000200d.A00(r1.A1h);
            this.A0K = (AnonymousClass4XG) r3.AAX.get();
            this.A0L = (AnonymousClass1PS) r3.A3T.get();
            this.A0c = C000200d.A00(A0K2.A48);
            this.A0O = (AnonymousClass4QD) r1.A42.get();
        }
    }

    public void A3K() {
        AnonymousClass3MX.A0u(this.A0f).A02((AnonymousClass1BI) null, 92);
    }

    public /* synthetic */ void A4b(Bundle bundle) {
        A0u(bundle.getBoolean("is_hidden_subgroup_result"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A0E, 7180) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A4c(X.AnonymousClass1EB r25, java.lang.String r26, java.util.List r27) {
        /*
            r24 = this;
            r1 = r24
            int r12 = r1.A00
            X.1EC r7 = r1.A0S
            java.lang.String r0 = "newgroup/invokeCreateGroupApi"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.126 r0 = r1.A0Q
            java.util.Set r0 = r0.A1F
            r8 = r25
            r0.add(r8)
            r10 = 0
            r16 = 0
            r3 = 0
            r18 = 0
            r2 = 1
            X.C18070vi.A0d(r8, r2)
            r17 = 1
            r15 = 1
            if (r7 == 0) goto L_0x002f
            X.0ve r5 = r1.A0E
            r4 = 7180(0x1c0c, float:1.0061E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 == 0) goto L_0x0051
        L_0x002f:
            android.os.Bundle r3 = r1.A03
            java.lang.String r0 = "add_other_participants"
            boolean r16 = r3.getBoolean(r0)
            android.os.Bundle r3 = r1.A03
            java.lang.String r0 = "require_membership_approval"
            boolean r18 = r3.getBoolean(r0)
            android.os.Bundle r3 = r1.A03
            java.lang.String r0 = "edit_group_info"
            boolean r15 = r3.getBoolean(r0, r2)
            android.os.Bundle r3 = r1.A03
            java.lang.String r0 = "send_messages"
            boolean r17 = r3.getBoolean(r0, r2)
            boolean r3 = r1.A0m
        L_0x0051:
            X.1EC r0 = r1.A0S
            if (r0 == 0) goto L_0x0063
            com.whatsapp.WaEditText r0 = r1.A07
            if (r0 == 0) goto L_0x0063
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0063
            java.lang.String r10 = r0.toString()
        L_0x0063:
            r13 = 0
            X.9ho r6 = new X.9ho
            r9 = r26
            r11 = r27
            r14 = r13
            r20 = r3
            r19 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.11P r5 = r1.A05
            X.122 r4 = r1.A0J
            X.126 r3 = r1.A0Q
            X.1PQ r2 = r1.A0W
            X.1NN r0 = r1.A0I
            X.414 r8 = new X.414
            r13 = r8
            r14 = r5
            r15 = r0
            r16 = r4
            r17 = r3
            r18 = r6
            r19 = r1
            r20 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.11P r7 = r1.A05
            X.0ve r6 = r1.A0E
            X.190 r14 = r1.A03
            X.11S r5 = r1.A02
            X.00H r0 = r1.A0e
            X.1OZ r23 = X.C17880vN.A0U(r0)
            X.126 r4 = r1.A0Q
            X.1Mx r3 = r1.A0A
            X.1PS r2 = r1.A0L
            X.9ho r0 = r8.A00
            X.Acg r13 = new X.Acg
            r20 = r4
            r21 = r8
            r22 = r0
            r15 = r5
            r16 = r3
            r17 = r7
            r18 = r2
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r13.A00()
            X.3zA r2 = new X.3zA
            r2.<init>()
            java.lang.Integer r0 = r1.A0h
            r2.A01 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r12)
            r2.A02 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            X.18K r0 = r1.A0P
            r0.CC7(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.A4c(X.1EB, java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        com.whatsapp.util.Log.i("newgroup/photopicked");
        A0Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        super.onActivityResult(r10, r11, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            java.lang.String r3 = "newgroup/photopicked"
            r2 = -1
            r5 = r9
            r4 = r12
            switch(r10) {
                case 12: goto L_0x000c;
                case 13: goto L_0x0041;
                case 14: goto L_0x0058;
                default: goto L_0x0008;
            }
        L_0x0008:
            super.onActivityResult(r10, r11, r12)
        L_0x000b:
            return
        L_0x000c:
            if (r11 != r2) goto L_0x000b
            r1 = 0
            if (r12 == 0) goto L_0x008c
            java.lang.String r0 = "is_reset"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "newgroup/resetphoto"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Lr r0 = r9.A0C
            X.1E7 r1 = r9.A0x
            java.io.File r0 = r0.A00(r1)
            X.C17960vV.A07(r0)
            r0.delete()
            X.1Lr r0 = r9.A0C
            java.io.File r0 = r0.A01(r1)
            X.C17960vV.A07(r0)
            r0.delete()
            android.widget.ImageView r1 = r9.A0q
            r0 = 2131231659(0x7f0803ab, float:1.8079405E38)
            r1.setImageResource(r0)
            return
        L_0x0041:
            X.1Up r1 = r9.A0V
            X.1E7 r0 = r9.A0x
            java.io.File r0 = r1.A02(r0)
            r0.delete()
            if (r11 == r2) goto L_0x0085
            if (r11 != 0) goto L_0x000b
            if (r12 == 0) goto L_0x000b
            X.1Up r0 = r9.A0V
            r0.A03(r12, r9)
            return
        L_0x0058:
            if (r11 != r2) goto L_0x0008
            if (r12 == 0) goto L_0x0008
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r2 = r12.getStringExtra(r0)
            java.lang.String r0 = "selected"
            java.util.ArrayList r1 = r12.getStringArrayListExtra(r0)
            java.lang.String r0 = "duplicate_ug_exists"
            boolean r0 = X.AnonymousClass3MY.A1a(r12, r0)
            r9.A0t(r2, r1, r0)
            goto L_0x0008
        L_0x0072:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x008c
            X.1Up r1 = r9.A0V
            X.1E7 r0 = r9.A0x
            java.io.File r0 = r1.A02(r0)
            r0.delete()
        L_0x0085:
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r9.A0Q()
            return
        L_0x008c:
            java.lang.String r0 = "newgroup/cropphoto"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Up r3 = r9.A0V
            X.1E7 r7 = r9.A0x
            r8 = 13
            r6 = r9
            r3.A05(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        C74873d3 r0 = this.A0M;
        if (r0 == null || !r0.isShowing()) {
            super.onBackPressed();
        } else {
            this.A0M.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0421, code lost:
        if (X.C18020vd.A05(r3, r1, 12551) == false) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x047e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 12551) == false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02f5, code lost:
        if (r12.A0S != null) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r1 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03d6, code lost:
        if (X.C18020vd.A05(r3, r1, 12551) == false) goto L_0x03d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r36) {
        /*
            r35 = this;
            r12 = r35
            r4 = r36
            super.onCreate(r4)
            if (r36 == 0) goto L_0x0019
            java.lang.String r0 = "saved_state_is_hidden_group"
            boolean r0 = r4.getBoolean(r0)
            r12.A0m = r0
            java.lang.String r0 = "saved_state_ephemeral_duration"
            int r0 = r4.getInt(r0)
            r12.A00 = r0
        L_0x0019:
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "messages_to_forward_bundle"
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            r12.A01 = r0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0034
            boolean r1 = r0.isEmpty()
            r16 = 1
            r0 = 2131890526(0x7f12115e, float:1.9415746E38)
            if (r1 == 0) goto L_0x0039
        L_0x0034:
            r16 = 0
            r0 = 2131892466(0x7f1218f2, float:1.9419681E38)
        L_0x0039:
            r12.setTitle(r0)
            X.01n r11 = X.AnonymousClass3MY.A0J(r12)
            r11.A0W(r2)
            r11.A0G()
            r0 = 2131626150(0x7f0e08a6, float:1.8879528E38)
            r12.setContentView((int) r0)
            X.1Vd r1 = r12.A0F
            java.lang.String r0 = "new-group-activity"
            X.1pZ r0 = r1.A06(r12, r0)
            r12.A0E = r0
            r0 = 2131428998(0x7f0b0686, float:1.8479656E38)
            android.widget.ImageView r1 = X.AnonymousClass3MX.A0I(r12, r0)
            r12.A0q = r1
            r0 = 27
            X.C90044dR.A00(r1, r12, r0)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "optional_participants"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            r12.A0o = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "create_group_for_community"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            r12.A0k = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "create_group_for_xfamily"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            r12.A0s = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "prefill_group_name"
            java.lang.String r10 = r1.getStringExtra(r0)
            r0 = 2131435109(0x7f0b1e65, float:1.849205E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0I(r12, r0)
            r12.A04 = r0
            X.AnonymousClass1HF.A0q(r0, r2)
            r0 = 2131435110(0x7f0b1e66, float:1.8492053E38)
            android.view.View r1 = X.C110885hR.A0A(r12, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r12.A06 = r1
            X.5nX r0 = new X.5nX
            r0.<init>()
            r1.setItemAnimator(r0)
            androidx.recyclerview.widget.RecyclerView r2 = r12.A06
            java.util.ArrayList r0 = r2.A11
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00c4
            r1 = 1
            X.28L r0 = new X.28L
            r0.<init>(r12, r1)
            r2.A0r(r0)
        L_0x00c4:
            X.3X9 r1 = new X.3X9
            r1.<init>()
            r12.A0R = r1
            androidx.recyclerview.widget.RecyclerView r0 = r12.A06
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r2 = r12.A06
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131168007(0x7f070b07, float:1.7950304E38)
            int r1 = r1.getDimensionPixelSize(r0)
            com.whatsapp.collections.AutoFitGridLayoutManager r0 = new com.whatsapp.collections.AutoFitGridLayoutManager
            r0.<init>(r12, r1)
            r2.setLayoutManager(r0)
            if (r36 != 0) goto L_0x04b9
            r12.A0p = r3
            X.1Lr r0 = r12.A0C
            X.1E7 r1 = r12.A0x
            java.io.File r0 = r0.A00(r1)
            X.C17960vV.A07(r0)
            r0.delete()
            X.1Lr r0 = r12.A0C
            java.io.File r0 = r0.A01(r1)
            X.C17960vV.A07(r0)
            r0.delete()
            android.content.Intent r4 = r12.getIntent()
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r2 = r4.getStringExtra(r0)
            java.lang.String r0 = "selected"
            java.util.ArrayList r1 = r4.getStringArrayListExtra(r0)
            java.lang.String r0 = "duplicate_ug_exists"
            boolean r0 = r4.getBooleanExtra(r0, r3)
            r12.A0t(r2, r1, r0)
        L_0x011c:
            android.os.Bundle r0 = r12.A03
            if (r0 != 0) goto L_0x0153
            X.1EC r0 = r12.A0S
            if (r0 == 0) goto L_0x04ad
            X.0ve r2 = r12.A0E
            r1 = 7180(0x1c0c, float:1.0061E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x04ad
            android.os.Bundle r4 = X.C17880vN.A0D()
            X.0ve r0 = r12.A0E
            boolean r2 = X.AnonymousClass3MX.A1Y(r0)
            java.lang.String r0 = "add_other_participants"
            r1 = 1
            if (r2 != 0) goto L_0x04b4
            r4.putBoolean(r0, r3)
        L_0x0142:
            java.lang.String r0 = "send_messages"
            r4.putBoolean(r0, r1)
            java.lang.String r0 = "edit_group_info"
            r4.putBoolean(r0, r1)
            java.lang.String r0 = "require_membership_approval"
            r4.putBoolean(r0, r3)
            r12.A03 = r4
        L_0x0153:
            r0 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r0 = r12.findViewById(r0)
            com.whatsapp.KeyboardPopupLayout r0 = (com.whatsapp.KeyboardPopupLayout) r0
            r12.A0r = r0
            r0 = 2131430310(0x7f0b0ba6, float:1.8482317E38)
            android.view.View r19 = r12.findViewById(r0)
            r0 = 2131431270(0x7f0b0f66, float:1.8484264E38)
            android.view.View r0 = r12.findViewById(r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r12.A08 = r0
            X.0ve r0 = r12.A0E
            r17 = r0
            X.1L4 r15 = r12.A09
            X.190 r14 = r12.A03
            X.1KW r13 = r12.A0D
            X.67r r9 = r12.A0N
            X.11C r8 = r12.A08
            X.0vb r7 = r12.A00
            X.00H r0 = r12.A0a
            java.lang.Object r6 = r0.get()
            com.whatsapp.emoji.search.EmojiSearchProvider r6 = (com.whatsapp.emoji.search.EmojiSearchProvider) r6
            X.0z4 r5 = r12.A0A
            X.0vc r4 = r12.A0U
            com.whatsapp.KeyboardPopupLayout r3 = r12.A0r
            com.whatsapp.WaEditText r2 = r12.A08
            r0 = 18
            java.lang.Integer r33 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r34 = X.C17880vN.A0i()
            X.00H r0 = r12.A0b
            java.lang.Object r1 = r0.get()
            X.A59 r1 = (X.A59) r1
            X.3d3 r0 = new X.3d3
            r25 = r7
            r26 = r1
            r27 = r9
            r28 = r13
            r29 = r6
            r30 = r17
            r31 = r4
            r32 = r15
            r22 = r2
            r23 = r8
            r24 = r5
            r20 = r14
            r21 = r3
            r17 = r0
            r18 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r12.A0M = r0
            X.5ai r1 = r12.A0w
            r0.A0J(r1)
            r0 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r1 = r12.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = (com.whatsapp.emoji.search.EmojiSearchContainer) r1
            X.3d3 r0 = r12.A0M
            X.4UI r3 = new X.4UI
            r3.<init>(r12, r0, r1)
            r1 = 5
            X.4n0 r0 = new X.4n0
            r0.<init>(r12, r1)
            r3.A00 = r0
            X.3d3 r2 = r12.A0M
            r1 = 41
            X.Aik r0 = new X.Aik
            r0.<init>(r3, r1)
            r2.A0E = r0
            android.widget.ImageView r1 = r12.A0q
            r0 = 2131231659(0x7f0803ab, float:1.8079405E38)
            r1.setImageResource(r0)
            java.io.File r0 = A03(r12)
            if (r0 == 0) goto L_0x0200
            r12.A0Q()
        L_0x0200:
            X.18O r1 = r12.A06
            X.18Q r0 = X.AnonymousClass18O.A1O
            int r0 = r1.A04(r0)
            r4 = 0
            int r2 = java.lang.Math.max(r4, r0)
            com.whatsapp.WaEditText r1 = r12.A08
            r0 = 2131435876(0x7f0b2164, float:1.8493607E38)
            r12.A0c(r1, r0, r2, r2)
            boolean r2 = r12.A0v()
            com.whatsapp.WaEditText r1 = r12.A08
            r0 = 2131889238(0x7f120c56, float:1.9413134E38)
            if (r2 == 0) goto L_0x0223
            r0 = 2131891088(0x7f121390, float:1.9416886E38)
        L_0x0223:
            r1.setHint(r0)
            if (r16 == 0) goto L_0x022e
            r0 = 2131888696(0x7f120a38, float:1.9412035E38)
            r11.A0L(r0)
        L_0x022e:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0239
            com.whatsapp.WaEditText r0 = r12.A08
            r0.setText(r10)
        L_0x0239:
            com.whatsapp.WaEditText r0 = r12.A08
            r0.requestFocus()
            r0 = 2131433259(0x7f0b172b, float:1.8488299E38)
            android.view.View r6 = X.C110885hR.A0A(r12, r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r16 == 0) goto L_0x0251
            X.0vb r1 = r12.A00
            r0 = 2131232506(0x7f0806fa, float:1.8081123E38)
            X.AnonymousClass3NL.A01(r12, r6, r1, r0)
        L_0x0251:
            X.1NN r1 = r12.A0I
            X.1Nk r0 = r12.A11
            r1.registerObserver(r0)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "entry_point"
            r2 = -1
            int r1 = r1.getIntExtra(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 != r2) goto L_0x026a
            r0 = 0
        L_0x026a:
            r12.A0h = r0
            boolean r0 = r12.A0n
            if (r0 != 0) goto L_0x0274
            X.1EC r0 = r12.A0S
            if (r0 == 0) goto L_0x0326
        L_0x0274:
            X.1EC r0 = r12.A0S
            if (r0 == 0) goto L_0x02d4
            r0 = 2131431246(0x7f0b0f4e, float:1.8484216E38)
            X.1bI r0 = X.C72453Mb.A0r(r12, r0)
            android.view.View r3 = X.AnonymousClass3MY.A0I(r0, r4)
            com.whatsapp.wds.components.list.footer.WDSSectionFooter r3 = (com.whatsapp.wds.components.list.footer.WDSSectionFooter) r3
            r0 = 2131890957(0x7f12130d, float:1.941662E38)
            java.lang.String r0 = r12.getString(r0)
            r3.setFooterText((java.lang.String) r0)
            boolean r0 = r12.A0n
            if (r0 == 0) goto L_0x02c6
            r0 = 2131432975(0x7f0b160f, float:1.8487723E38)
            X.1bI r8 = X.C72453Mb.A0r(r12, r0)
            android.view.View r7 = X.AnonymousClass3MY.A0I(r8, r4)
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.1np r5 = r12.A0Y
            r0 = 2131891158(0x7f1213d6, float:1.9417028E38)
            java.lang.String r2 = r12.getString(r0)
            r0 = 36
            X.Aik r1 = new X.Aik
            r1.<init>(r12, r0)
            java.lang.String r0 = "learn-more"
            android.text.SpannableStringBuilder r0 = r5.A05(r12, r1, r2, r0)
            r7.setText(r0)
            X.0ve r2 = r12.A0E
            X.11C r1 = r12.A08
            android.view.View r0 = r8.A02()
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            X.AnonymousClass1Y5.A0C(r0, r1, r2)
        L_0x02c6:
            X.11C r2 = r12.A08
            X.4Ne r0 = r3.A01
            com.whatsapp.WaTextView r1 = r0.A01
            X.1t2 r0 = new X.1t2
            r0.<init>(r1, r2)
            X.AnonymousClass1HF.A0f(r3, r0)
        L_0x02d4:
            r0 = 2131431297(0x7f0b0f81, float:1.848432E38)
            android.view.View r1 = X.C110885hR.A0A(r12, r0)
            r0 = 2131431249(0x7f0b0f51, float:1.8484222E38)
            X.1bI r0 = X.C72453Mb.A0s(r1, r0)
            r0.A04(r4)
            r0 = 2131429936(0x7f0b0a30, float:1.8481559E38)
            android.widget.TextView r2 = X.AnonymousClass3MW.A0I(r12, r0)
            boolean r0 = r12.A0n
            if (r0 != 0) goto L_0x02f7
            X.1EC r1 = r12.A0S
            r0 = 2131890960(0x7f121310, float:1.9416627E38)
            if (r1 == 0) goto L_0x02fa
        L_0x02f7:
            r0 = 2131890959(0x7f12130f, float:1.9416625E38)
        L_0x02fa:
            r2.setHint(r0)
            r0 = 26
            X.C90044dR.A00(r2, r12, r0)
            r0 = 2131431243(0x7f0b0f4b, float:1.848421E38)
            android.view.View r0 = X.C110885hR.A0A(r12, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r12.A07 = r0
            X.18O r1 = r12.A06
            X.C18070vi.A0d(r1, r4)
            X.18Q r0 = X.AnonymousClass18O.A1V
            int r0 = r1.A04(r0)
            int r3 = java.lang.Math.max(r4, r0)
            com.whatsapp.WaEditText r2 = r12.A07
            r1 = 2131429934(0x7f0b0a2e, float:1.8481555E38)
            int r0 = r3 / 10
            r12.A0c(r2, r1, r3, r0)
        L_0x0326:
            boolean r0 = r12.A0n
            r5 = 8
            if (r0 == 0) goto L_0x045e
            android.widget.TextView r0 = r12.A04
            r0.setVisibility(r5)
            r1 = 28
            X.4dR r0 = new X.4dR
            r0.<init>((java.lang.Object) r12, (int) r1)
            X.AnonymousClass4WJ.A00(r0, r6)
            android.widget.ImageView r1 = r12.A0q
            r0 = 2131231053(0x7f08014d, float:1.8078176E38)
            r1.setImageResource(r0)
            android.widget.ImageView r1 = r12.A0q
            r0 = 29
            X.C90044dR.A00(r1, r12, r0)
        L_0x034a:
            X.1EC r1 = r12.A0S
            if (r1 == 0) goto L_0x0389
            X.1CJ r0 = r12.A0H
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r1)
            if (r0 == 0) goto L_0x0389
            boolean r0 = r0.A0r
            if (r0 != 0) goto L_0x0389
            java.lang.String r0 = r12.A0i
            if (r0 == 0) goto L_0x0451
            r0 = 2131892470(0x7f1218f6, float:1.941969E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = " "
            java.lang.String r3 = r1.concat(r0)
            r2 = 2131892469(0x7f1218f5, float:1.9419687E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.String r0 = r12.A0i
            java.lang.String r0 = X.C17880vN.A0q(r12, r0, r1, r4, r2)
            java.lang.String r1 = r3.concat(r0)
        L_0x037c:
            r0 = 2131432974(0x7f0b160e, float:1.848772E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0I(r12, r0)
            r0.setVisibility(r4)
            r0.setText(r1)
        L_0x0389:
            boolean r0 = r12.A0k
            if (r0 != 0) goto L_0x0391
            boolean r0 = r12.A0s
            if (r0 == 0) goto L_0x03a3
        L_0x0391:
            X.0vb r1 = r12.A00
            r0 = 2131231900(0x7f08049c, float:1.8079894E38)
            X.AnonymousClass3NL.A01(r12, r6, r1, r0)
            r0 = 2131435109(0x7f0b1e65, float:1.849205E38)
            android.view.View r0 = X.C110885hR.A0A(r12, r0)
            r0.setVisibility(r5)
        L_0x03a3:
            X.0ve r0 = r12.A0E
            r1 = 7180(0x1c0c, float:1.0061E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r0, r1)
            if (r0 == 0) goto L_0x03b6
            java.lang.String r0 = r12.A0i
            if (r0 == 0) goto L_0x03b6
            r12.A42(r0)
        L_0x03b6:
            X.1EC r0 = r12.A0S
            if (r0 == 0) goto L_0x03c2
            X.0ve r0 = r12.A0E
            boolean r0 = X.C18020vd.A05(r3, r0, r1)
            if (r0 == 0) goto L_0x0401
        L_0x03c2:
            r0 = 2131431279(0x7f0b0f6f, float:1.8484283E38)
            android.view.ViewStub r2 = X.AnonymousClass3MX.A0G(r12, r0)
            X.0ve r1 = r12.A0E
            if (r1 == 0) goto L_0x03d8
            r0 = 12551(0x3107, float:1.7588E-41)
            boolean r1 = X.C18020vd.A05(r3, r1, r0)
            r0 = 2131626155(0x7f0e08ab, float:1.8879538E38)
            if (r1 != 0) goto L_0x03db
        L_0x03d8:
            r0 = 2131626154(0x7f0e08aa, float:1.8879536E38)
        L_0x03db:
            r2.setLayoutResource(r0)
            r2.inflate()
            r0 = 2131431278(0x7f0b0f6e, float:1.848428E38)
            android.view.View r2 = X.C110885hR.A0A(r12, r0)
            r2.setVisibility(r4)
            r0 = 25
            X.C90044dR.A00(r2, r12, r0)
            X.0ve r1 = r12.A0E
            if (r1 == 0) goto L_0x03fc
            r0 = 12551(0x3107, float:1.7588E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 != 0) goto L_0x0401
        L_0x03fc:
            com.whatsapp.ListItemWithRightIcon r2 = (com.whatsapp.ListItemWithRightIcon) r2
            r2.setDescriptionVisibility(r5)
        L_0x0401:
            X.1EC r0 = r12.A0S
            if (r0 == 0) goto L_0x0450
            X.0ve r0 = r12.A0E
            boolean r0 = X.AnonymousClass3MX.A1Z(r0)
            if (r0 == 0) goto L_0x0450
            r0 = 2131431316(0x7f0b0f94, float:1.8484358E38)
            android.view.ViewStub r2 = X.AnonymousClass3MX.A0G(r12, r0)
            X.0ve r1 = r12.A0E
            if (r1 == 0) goto L_0x0423
            r0 = 12551(0x3107, float:1.7588E-41)
            boolean r1 = X.C18020vd.A05(r3, r1, r0)
            r0 = 2131626157(0x7f0e08ad, float:1.8879542E38)
            if (r1 != 0) goto L_0x0426
        L_0x0423:
            r0 = 2131626156(0x7f0e08ac, float:1.887954E38)
        L_0x0426:
            r2.setLayoutResource(r0)
            r2.inflate()
            r0 = 2131431317(0x7f0b0f95, float:1.848436E38)
            android.view.View r3 = X.C110885hR.A0A(r12, r0)
            r3.setVisibility(r4)
            boolean r0 = r12.A0m
            r12.A0u(r0)
            X.1GP r2 = r12.getSupportFragmentManager()
            r0 = 24
            X.4fa r1 = new X.4fa
            r1.<init>(r12, r0)
            java.lang.String r0 = "RESULT_KEY"
            r2.A0t(r1, r12, r0)
            r0 = 33
            X.C825148g.A00(r3, r12, r0)
        L_0x0450:
            return
        L_0x0451:
            boolean r0 = r12.A0l
            if (r0 == 0) goto L_0x0389
            r0 = 2131892470(0x7f1218f6, float:1.941969E38)
            java.lang.String r1 = r12.getString(r0)
            goto L_0x037c
        L_0x045e:
            r1 = 30
            X.4dR r0 = new X.4dR
            r0.<init>((java.lang.Object) r12, (int) r1)
            X.AnonymousClass4WJ.A00(r0, r6)
            r0 = 2131431257(0x7f0b0f59, float:1.8484238E38)
            android.view.ViewStub r3 = X.AnonymousClass3MX.A0G(r12, r0)
            X.0ve r2 = r12.A0E
            if (r2 == 0) goto L_0x0480
            r1 = 12551(0x3107, float:1.7588E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 2131626153(0x7f0e08a9, float:1.8879534E38)
            if (r1 != 0) goto L_0x0483
        L_0x0480:
            r0 = 2131626152(0x7f0e08a8, float:1.8879532E38)
        L_0x0483:
            r3.setLayoutResource(r0)
            r3.inflate()
            r0 = 2131431256(0x7f0b0f58, float:1.8484236E38)
            android.view.View r2 = X.C110885hR.A0A(r12, r0)
            r2.setVisibility(r4)
            int r1 = r12.A00
            r0 = -1
            if (r1 != r0) goto L_0x04a0
            X.1PS r0 = r12.A0L
            int r1 = r0.A00()
            r12.A00 = r1
        L_0x04a0:
            r12.A0V(r1)
            r0 = 34
            X.C825148g.A00(r2, r12, r0)
            X.AnonymousClass3MW.A1Q(r2)
            goto L_0x034a
        L_0x04ad:
            android.os.Bundle r4 = X.C17880vN.A0D()
            java.lang.String r0 = "add_other_participants"
            r1 = 1
        L_0x04b4:
            r4.putBoolean(r0, r1)
            goto L_0x0142
        L_0x04b9:
            java.lang.String r0 = "input_method"
            int r0 = r4.getInt(r0)
            r12.A0p = r0
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r2 = r4.getString(r0)
            java.lang.String r0 = "selected"
            java.util.ArrayList r1 = r4.getStringArrayList(r0)
            java.lang.String r0 = "duplicate_ug_exists"
            boolean r0 = r4.getBoolean(r0, r3)
            r12.A0t(r2, r1, r0)
            java.lang.String r0 = "setting_values"
            android.os.Bundle r0 = r4.getBundle(r0)
            r12.A03 = r0
            goto L_0x011c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.newgroup.NewGroup.onCreate(android.os.Bundle):void");
    }

    public static void A0s(NewGroup newGroup, AnonymousClass1EC r4) {
        Intent A0A2 = C17880vN.A0A();
        AnonymousClass3MY.A12(A0A2, r4, "group_jid");
        A0A2.putExtra("parent_group_jid_to_link", C22971Dz.A06(newGroup.A0S));
        if (newGroup.A02 != null) {
            newGroup.A08.A0H();
            A0A2.putExtra("new_group_result_bundle", newGroup.A02);
        }
        newGroup.setResult(-1, A0A2);
    }

    public static boolean A0w(NewGroup newGroup, String str) {
        C73203Rj A002;
        String A0k2;
        if (str.trim().length() == 0) {
            if (!newGroup.A0v()) {
                int i = 2131892471;
                if (newGroup.A0n) {
                    i = 2131896615;
                }
                A0k2 = newGroup.getString(i);
                A002 = AnonymousClass4a6.A00(newGroup);
            }
            return false;
        }
        int A003 = C137186v3.A00(str);
        int A042 = newGroup.A06.A04(AnonymousClass18O.A1O);
        if (A003 > A042) {
            A002 = AnonymousClass4a6.A00(newGroup);
            A0k2 = C72473Md.A0k(newGroup.getResources(), A042, 2131755175);
        }
        return false;
        A002.A0S(A0k2);
        A002.A0g(newGroup, (C22851Dl) null, 2131899286);
        A002.A0C();
        return true;
    }

    public void Bsk(int i) {
        A0V(i);
    }

    public void BzN() {
        if (((C23391Fw) getLifecycle()).A02.A00(C23401Fx.CREATED)) {
            ChangeEphemeralSettingsDialog.A00(getSupportFragmentManager(), this.A00, 1);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0I.unregisterObserver(this.A11);
        C37451pZ r0 = this.A0E;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        if (this.A0M.isShowing()) {
            i = 1;
        } else {
            i = 2;
            if (AnonymousClass1L4.A00(this.A0r)) {
                i = 0;
            }
        }
        this.A0p = i;
        bundle.putInt("input_method", i);
        bundle.putStringArrayList("selected", C22971Dz.A0B(AnonymousClass1E7.A02(this.A0j)));
        AnonymousClass1EC r1 = this.A0S;
        if (r1 != null) {
            AnonymousClass3MY.A15(bundle, r1, "parent_group_jid_to_link");
        }
        bundle.putBoolean("duplicate_ug_exists", this.A0t);
        bundle.putBundle("setting_values", this.A03);
        bundle.putInt("saved_state_ephemeral_duration", this.A00);
        bundle.putBoolean("saved_state_is_hidden_group", this.A0m);
    }

    public void onStart() {
        super.onStart();
        int i = this.A0p;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (!this.A0M.isShowing()) {
                this.A0r.post(new C21355Aik(this, 37));
            }
            getWindow().setSoftInputMode(2);
            return;
        }
        getWindow().setSoftInputMode(4);
    }

    public NewGroup(int i) {
        this.A0u = false;
        C91014f0.A00(this, 22);
    }
}
