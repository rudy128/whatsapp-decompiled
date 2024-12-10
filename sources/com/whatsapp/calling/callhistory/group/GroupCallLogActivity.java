package com.whatsapp.calling.callhistory.group;

import X.A4u;
import X.A69;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HS;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1NG;
import X.AnonymousClass1TD;
import X.AnonymousClass1V7;
import X.AnonymousClass1VP;
import X.AnonymousClass1VW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XM;
import X.AnonymousClass4ZN;
import X.AnonymousClass4aR;
import X.AnonymousClass4aX;
import X.AnonymousClass74H;
import X.C000200d;
import X.C178109Bv;
import X.C178119Bw;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C192619oh;
import X.C19740yt;
import X.C23581Gv;
import X.C24261Jm;
import X.C24671Lf;
import X.C24921Me;
import X.C27201Vd;
import X.C27831Xu;
import X.C37451pZ;
import X.C40751vD;
import X.C40811vJ;
import X.C42971z2;
import X.C59292m4;
import X.C62792s0;
import X.C64052u8;
import X.C72043Kk;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73173Rg;
import X.C88584aA;
import X.C89444cT;
import X.C89724cv;
import X.C89994dM;
import X.C90254dm;
import X.C90994ey;
import X.C94164k9;
import X.C94224kF;
import X.C98874rr;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.contact.photos.MultiContactThumbnail;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GroupCallLogActivity extends AnonymousClass1FY {
    public C72043Kk A00;
    public C40751vD A01;
    public AnonymousClass3XM A02;
    public AnonymousClass1VP A03;
    public AnonymousClass1V7 A04;
    public A4u A05;
    public AnonymousClass1HS A06;
    public AnonymousClass1VW A07;
    public AnonymousClass1M9 A08;
    public C24671Lf A09;
    public C24921Me A0A;
    public C37451pZ A0B;
    public C37451pZ A0C;
    public C27201Vd A0D;
    public AnonymousClass1TD A0E;
    public AnonymousClass1DC A0F;
    public C178119Bw A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public boolean A0M;
    public final C42971z2 A0N;
    public final C23581Gv A0O;

    public GroupCallLogActivity() {
        this(0);
        this.A0O = new C94164k9(this, 3);
        this.A0N = new C94224kF(this);
    }

    public static void A03(GroupCallLogActivity groupCallLogActivity) {
        Boolean valueOf;
        C192619oh r4 = (C192619oh) groupCallLogActivity.A0H.get();
        Integer A0i = C17880vN.A0i();
        Integer A0g = AnonymousClass3MY.A0g();
        C178119Bw r0 = groupCallLogActivity.A0G;
        if (r0 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(r0.A0J);
        }
        r4.A01((GroupJid) null, valueOf, A0i, A0g);
        groupCallLogActivity.finish();
    }

    public static void A0Q(GroupCallLogActivity groupCallLogActivity, boolean z, boolean z2) {
        C192619oh r4 = (C192619oh) groupCallLogActivity.A0H.get();
        int i = 2;
        Integer valueOf = Integer.valueOf(C72453Mb.A03(z ? 1 : 0));
        if (z2) {
            i = 3;
        }
        r4.A01((GroupJid) null, Boolean.valueOf(z2), valueOf, Integer.valueOf(i));
    }

    public void A2y() {
        if (!this.A0M) {
            this.A0M = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r1 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L2, r1, this, r1.A5A);
            this.A01 = C72453Mb.A0d(A0L2);
            this.A03 = AnonymousClass3MZ.A0W(A0L2);
            this.A0D = AnonymousClass3MZ.A0i(A0L2);
            this.A07 = AnonymousClass3MZ.A0e(A0L2);
            this.A06 = AnonymousClass3MZ.A0Z(A0L2);
            this.A0A = AnonymousClass3MZ.A0g(A0L2);
            this.A08 = AnonymousClass10E.A4z(A0L2);
            this.A0F = AnonymousClass3MZ.A13(A0L2);
            this.A09 = AnonymousClass3Ma.A0S(A0L2);
            this.A0E = (AnonymousClass1TD) A0L2.A1m.get();
            this.A04 = (AnonymousClass1V7) A0L2.A97.get();
            this.A05 = (A4u) A0L2.A1k.get();
            this.A0L = C000200d.A00(A0L2.ABc);
            this.A0J = AnonymousClass3MX.A11(A0L2);
            this.A00 = AnonymousClass3MZ.A0T(r1);
            this.A0K = C000200d.A00(A0L2.ABV);
            this.A0I = C000200d.A00(A0L2.A22);
            this.A0H = C000200d.A00(r1.A0p);
        }
    }

    public void A3K() {
        AnonymousClass3MX.A0u(this.A0J).A02((AnonymousClass1BI) null, 15);
    }

    public /* synthetic */ boolean A4b(String str, boolean z) {
        int i = 2131887686;
        if (z) {
            i = 2131887685;
        }
        String A0q = C17880vN.A0q(this, AnonymousClass74H.A07(str, z), new Object[1], 0, i);
        if (Build.VERSION.SDK_INT < 22) {
            this.A05.A03(AnonymousClass74H.A02((String) null, 2, 2, z));
        }
        startActivity(AnonymousClass74H.A00(this, A0q, getString(2131887683), 2, z));
        return true;
    }

    public void onCreate(Bundle bundle) {
        C178119Bw r0;
        int i;
        int i2;
        CharSequence string;
        super.onCreate(bundle);
        boolean A1T = C72473Md.A1T(this);
        setTitle(2131887628);
        setContentView(2131625475);
        C89444cT r1 = (C89444cT) getIntent().getParcelableExtra("call_log_key");
        if (r1 != null) {
            r0 = C72483Me.A0U(this.A0E, r1);
        } else {
            r0 = null;
        }
        this.A0G = r0;
        if (r0 == null) {
            Log.i("call log missing");
            finish();
            return;
        }
        this.A0C = this.A0D.A06(this, "group-call-log-activity");
        this.A0B = this.A0D.A08("group-call-log-multi-contact", 0.0f, getResources().getDimensionPixelSize(2131166936));
        RecyclerView recyclerView = (RecyclerView) findViewById(2131433449);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, A1T ? 1 : 0, false));
        C178109Bv r8 = null;
        AnonymousClass3XM r02 = new AnonymousClass3XM(this);
        this.A02 = r02;
        recyclerView.setAdapter(r02);
        ArrayList A0B2 = this.A0G.A0B();
        UserJid userJid = this.A0G.A04.A01;
        Iterator it = A0B2.iterator();
        C178109Bv r5 = null;
        while (it.hasNext()) {
            C178109Bv r2 = (C178109Bv) it.next();
            UserJid userJid2 = r2.A00;
            if (userJid2.equals(userJid)) {
                r5 = r2;
            } else if (this.A02.A0O(userJid2)) {
                r8 = r2;
            }
        }
        if (r8 != null) {
            A0B2.remove(r8);
        }
        if (r5 != null) {
            A0B2.remove(r5);
            A0B2.add(0, r5);
        }
        Collections.sort(A0B2.subList(!this.A0G.A04.A03 ? 1 : 0, A0B2.size()), new C98874rr(this.A08, this.A0A));
        AnonymousClass3XM r12 = this.A02;
        r12.A00 = C17880vN.A10(A0B2);
        r12.notifyDataSetChanged();
        C178119Bw r22 = this.A0G;
        TextView A0L2 = AnonymousClass3MX.A0L(this, 2131428754);
        ImageView A0I2 = AnonymousClass3MX.A0I(this, 2131428749);
        if (r22.A0B != null) {
            AnonymousClass4ZN A042 = AnonymousClass74H.A04(this.A08, this.A0A, C62792s0.A01(this.A02, r22), 3, false, false);
            C17960vV.A07(A042);
            string = A042.A03(this);
            i = 2131233226;
        } else {
            if (r22.A04.A03) {
                i = 2131233227;
                i2 = 2131893425;
            } else if (r22.A06 == 5) {
                i = 2131233228;
                i2 = 2131891320;
            } else if (r22.A0R()) {
                i = 2131233228;
                i2 = 2131887846;
            } else if (r22.A0T()) {
                string = getString(2131887751);
                i = 2131233383;
            } else {
                i = 2131233228;
                i2 = 2131892251;
            }
            string = getString(i2);
        }
        A0L2.setText(string);
        A0I2.setImageResource(i);
        AnonymousClass4aX.A0D(A0I2, C19740yt.A00(this, AnonymousClass4aR.A02(r22)));
        AnonymousClass3MX.A0L(this, 2131428672).setText(C64052u8.A0D(this.A00, (String) null, (long) r22.A08));
        AnonymousClass3MX.A0L(this, 2131428661).setText(C88584aA.A04(this.A00, r22.A0A));
        AnonymousClass3MX.A0L(this, 2131428664).setText(C64052u8.A08(this.A00, this.A05.A09(r22.A01)));
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it2 = A0B2.iterator();
        while (it2.hasNext()) {
            AnonymousClass1BI r13 = ((C178109Bv) it2.next()).A00;
            AnonymousClass1BI A012 = ((AnonymousClass1NG) this.A0I.get()).A01(r13);
            if (A012 != null) {
                r13 = A012;
            }
            AnonymousClass3MY.A1O(this.A08, r13, A13);
        }
        ((MultiContactThumbnail) findViewById(2131432836)).A00(this.A0N, this.A0B, A13);
        C59292m4 r14 = this.A0G.A0B;
        C178119Bw r03 = this.A0G;
        if (r14 != null) {
            C59292m4 r7 = r03.A0B;
            boolean z = this.A0G.A0J;
            C72463Mc.A19(this, 2131430073);
            AnonymousClass3MX.A1H(this, 2131428696, 0);
            TextView A0L3 = AnonymousClass3MX.A0L(this, 2131428699);
            TextView A0L4 = AnonymousClass3MX.A0L(this, 2131431864);
            int i3 = 2131231735;
            if (z) {
                i3 = 2131231736;
            }
            Drawable A002 = C24261Jm.A00(this, i3);
            if (A002 != null) {
                Drawable A022 = C27831Xu.A02(A002);
                C27831Xu.A0C(A022, AnonymousClass3Ma.A00(this, 2130970823, 2131102228));
                A0L4.setCompoundDrawablesWithIntrinsicBounds(A022, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            String str = r7.A02;
            A0L3.setText(AnonymousClass74H.A07(str, z));
            A0L3.setOnClickListener(new C89724cv(this, str, z));
            A0L3.setOnLongClickListener(new C90254dm(this, str, z));
            A0L4.setOnClickListener(new C89724cv(this, str, z));
        } else {
            ArrayList A0B3 = r03.A0B();
            if (!A0B3.isEmpty()) {
                if (C18020vd.A05(C18040vf.A02, this.A0E, 8626)) {
                    AnonymousClass3MX.A0G(this, 2131428649).inflate();
                    View inflate = AnonymousClass3MX.A0G(this, 2131436861).inflate();
                    inflate.setBackgroundResource(2131231201);
                    C89994dM.A00(inflate, this, A0B3, 22);
                    View inflate2 = AnonymousClass3MX.A0G(this, 2131436739).inflate();
                    inflate2.setBackgroundResource(2131231201);
                    C89994dM.A00(inflate2, this, A0B3, 23);
                }
            }
        }
        this.A09.registerObserver(this.A0O);
        BVe().A09(new C73173Rg(this, A1T), this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass3MX.A07(menu, 2131432537, 2131888327).setIcon(2131231847);
        C18030ve r1 = this.A0E;
        this.A0L.get();
        C40811vJ.A0B(r1);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.unregisterObserver(this.A0O);
        C37451pZ r0 = this.A0C;
        if (r0 != null) {
            r0.A02();
        }
        C37451pZ r02 = this.A0B;
        if (r02 != null) {
            r02.A02();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Boolean valueOf;
        if (menuItem.getItemId() == 2131432537) {
            Log.i("calllog/delete");
            C192619oh r5 = (C192619oh) this.A0H.get();
            Integer A0i = C17880vN.A0i();
            C178119Bw r0 = this.A0G;
            if (r0 == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(r0.A0J);
            }
            r5.A01((GroupJid) null, valueOf, A0i, 46);
            this.A0E.A0C(Collections.singletonList(this.A0G));
            finish();
            return true;
        } else if (menuItem.getItemId() == 16908332) {
            A03(this);
            return true;
        } else if (menuItem.getItemId() != 2131432534) {
            return false;
        } else {
            startActivity(AnonymousClass1LU.A0P(this, (Uri) null, getIntent().getParcelableExtra("call_log_key"), (String) null, true));
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A06.A02()) {
            this.A04.A00(new A69("show_voip_activity"));
        }
    }

    public GroupCallLogActivity(int i) {
        this.A0M = false;
        C90994ey.A00(this, 26);
    }
}
