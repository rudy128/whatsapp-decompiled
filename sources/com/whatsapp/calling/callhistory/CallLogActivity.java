package com.whatsapp.calling.callhistory;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02B;
import X.AnonymousClass02H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11X;
import X.AnonymousClass12E;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DC;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1J8;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1TD;
import X.AnonymousClass1VP;
import X.AnonymousClass1VW;
import X.AnonymousClass1Xr;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass48Z;
import X.AnonymousClass48q;
import X.AnonymousClass4SO;
import X.AnonymousClass4Yv;
import X.AnonymousClass4Z9;
import X.AnonymousClass4ZR;
import X.AnonymousClass4a6;
import X.AnonymousClass4aR;
import X.AnonymousClass4aq;
import X.C000200d;
import X.C110885hR;
import X.C123736Vq;
import X.C178119Bw;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19880zA;
import X.C21459AkQ;
import X.C222219b;
import X.C22941Dw;
import X.C23581Gv;
import X.C24671Lf;
import X.C24921Me;
import X.C25181Nf;
import X.C25221Nj;
import X.C27081Uq;
import X.C27191Vc;
import X.C28281Zt;
import X.C28741ap;
import X.C31191fA;
import X.C34241kA;
import X.C36451nu;
import X.C36931oh;
import X.C40811vJ;
import X.C42141xh;
import X.C43421zm;
import X.C59822mw;
import X.C63982u1;
import X.C64782vK;
import X.C72043Kk;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73023Or;
import X.C73203Rj;
import X.C76873oZ;
import X.C825348i;
import X.C89444cT;
import X.C90584eJ;
import X.C90994ey;
import X.C91094f8;
import X.C93754jU;
import X.C94164k9;
import X.C95414mC;
import X.C96314ne;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CallLogActivity extends AnonymousClass1FY {
    public Parcelable A00;
    public ImageView A01;
    public ListView A02;
    public TextView A03;
    public AnonymousClass02B A04;
    public C72043Kk A05;
    public C36931oh A06;
    public AnonymousClass1VP A07;
    public C31191fA A08;
    public AnonymousClass1VW A09;
    public AnonymousClass1M9 A0A;
    public C24671Lf A0B;
    public C24921Me A0C;
    public C27191Vc A0D;
    public AnonymousClass12E A0E;
    public AnonymousClass1TD A0F;
    public AnonymousClass1CJ A0G;
    public C25181Nf A0H;
    public AnonymousClass1MZ A0I;
    public C59822mw A0J;
    public C27081Uq A0K;
    public AnonymousClass1E7 A0L;
    public AnonymousClass1LU A0M;
    public AnonymousClass1BI A0N;
    public C36451nu A0O;
    public AnonymousClass1DC A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public ArrayList A0d;
    public boolean A0e;
    public View A0f;
    public ImageButton A0g;
    public ImageButton A0h;
    public C42141xh A0i;
    public AnonymousClass48q A0j;
    public boolean A0k;
    public boolean A0l;
    public final AnonymousClass02H A0m;
    public final C73023Or A0n;
    public final C34241kA A0o;
    public final HashSet A0p;
    public final C23581Gv A0q;
    public final C28741ap A0r;
    public final C25221Nj A0s;

    public CallLogActivity() {
        this(0);
        this.A04 = null;
        this.A0p = C17880vN.A12();
        this.A0n = new C73023Or(this);
        this.A0m = new C91094f8(this, 0);
        this.A0q = new C94164k9(this, 2);
        this.A0r = new C95414mC(this, 1);
        this.A0s = new C96314ne(this, 1);
        this.A0o = new C93754jU(this, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r0 == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0c(com.whatsapp.calling.callhistory.CallLogActivity r7, boolean r8) {
        /*
            r4 = r7
            X.00H r0 = r7.A0a
            X.C72453Mb.A1P(r0)
            X.1E7 r3 = r7.A0L
            X.1MZ r2 = r7.A0I
            X.11S r1 = r7.A02
            X.1M9 r0 = r7.A0A
            java.util.List r6 = X.C63982u1.A04(r1, r0, r2, r3)
            X.1E7 r0 = r7.A0L
            if (r0 == 0) goto L_0x0065
            X.1BI r0 = r0.A0J
            com.whatsapp.jid.GroupJid r3 = X.AnonymousClass3MW.A0f(r0)
        L_0x001c:
            boolean r0 = r7.A0l
            if (r0 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x0033
            X.0ve r2 = r7.A0E
            X.11S r1 = r7.A02
            X.1MZ r0 = r7.A0I
            int r0 = X.AnonymousClass3MW.A03(r0, r3)
            boolean r0 = X.C40811vJ.A0H(r1, r2, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r8 != 0) goto L_0x0055
            X.1VP r2 = r7.A07
            X.1BI r0 = r7.A0N
            X.1EC r1 = X.AnonymousClass3MW.A0i(r0)
            r0 = 4
            boolean r0 = r2.BjS(r7, r1, r6, r0)
            if (r0 == 0) goto L_0x0055
            X.0ve r2 = r7.A0E
            r1 = 5429(0x1535, float:7.608E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
        L_0x004f:
            if (r0 != 0) goto L_0x0054
            r4.finish()
        L_0x0054:
            return
        L_0x0055:
            if (r3 != 0) goto L_0x0054
            X.1VP r3 = r7.A07
            X.1BI r0 = r7.A0N
            com.whatsapp.jid.GroupJid r5 = X.AnonymousClass3MW.A0f(r0)
            r7 = 4
            int r0 = r3.CNy(r4, r5, r6, r7, r8)
            goto L_0x004f
        L_0x0065:
            r3 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.CallLogActivity.A0c(com.whatsapp.calling.callhistory.CallLogActivity, boolean):void");
    }

    public int A31() {
        return 78318969;
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r3;
        if (i == 1) {
            Log.i("calllog/dialog-add-contact");
            r3 = AnonymousClass4a6.A00(this);
            r3.A0D(2131886468);
            C73203Rj.A09(r3, this, 22, 2131892464);
            r3.A0Y(new AnonymousClass4aq(this, 23), 2131890163);
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            Log.w("calllog/add to contacts: activity not found, probably tablet");
            r3 = AnonymousClass4a6.A00(this);
            r3.A0D(2131886448);
            C73203Rj.A09(r3, this, 24, 2131899286);
        }
        return r3.create();
    }

    public static void A03(CallLogActivity callLogActivity) {
        Log.i("calllog/new_conversation");
        callLogActivity.A01.A09(callLogActivity, AnonymousClass3MY.A06(callLogActivity, callLogActivity.A0M, callLogActivity.A0L.A0J));
        callLogActivity.finish();
    }

    public static void A0Q(CallLogActivity callLogActivity) {
        GroupJid A0f2;
        Log.i("calllog/update");
        AnonymousClass1E7 A012 = callLogActivity.A0H.A01(callLogActivity.A0N);
        callLogActivity.A0L = A012;
        callLogActivity.A09.A0C(callLogActivity.A01, A012);
        callLogActivity.A0i.A05(callLogActivity.A0L);
        String str = callLogActivity.A0L.A0Z;
        if (str == null || str.isEmpty()) {
            callLogActivity.A03.setVisibility(8);
        } else {
            callLogActivity.A03.setVisibility(0);
            callLogActivity.A03.setText(callLogActivity.A0L.A0Z);
        }
        AnonymousClass48q r1 = callLogActivity.A0j;
        if (r1 != null) {
            r1.A0B(true);
        }
        AnonymousClass48q r12 = new AnonymousClass48q(callLogActivity, callLogActivity);
        callLogActivity.A0j = r12;
        C17890vO.A0u(r12, callLogActivity.A05);
        boolean z = !AnonymousClass3MX.A0i(callLogActivity.A0Z).A02(callLogActivity.A0L);
        AnonymousClass4aR.A09(callLogActivity.A0g, z);
        AnonymousClass1E7 r0 = callLogActivity.A0L;
        if (!(r0 == null || (A0f2 = AnonymousClass3MW.A0f(r0.A0J)) == null)) {
            int A032 = AnonymousClass3MW.A03(callLogActivity.A0I, A0f2);
            if (C40811vJ.A0I(callLogActivity.A02, callLogActivity.A0E, A032)) {
                callLogActivity.A0g.setImageResource(2131233309);
                AnonymousClass4aR.A09(callLogActivity.A0g, z);
                ImageButton imageButton = callLogActivity.A0g;
                float f = 0.4f;
                if (C40811vJ.A0J(callLogActivity.A02, callLogActivity.A0E, A032, false)) {
                    f = 1.0f;
                }
                imageButton.setAlpha(f);
            }
            if (!C63982u1.A07((C19880zA) callLogActivity.A0X.get(), callLogActivity.A0G, callLogActivity.A0I, callLogActivity.A0L, callLogActivity.A0E, A0f2)) {
                callLogActivity.A0h.setVisibility(8);
                return;
            }
        }
        AnonymousClass4aR.A09(callLogActivity.A0h, z);
    }

    public static void A0V(CallLogActivity callLogActivity) {
        int i;
        View A0F2 = AnonymousClass3MY.A0F(callLogActivity.A02);
        if (A0F2 == null) {
            return;
        }
        if (callLogActivity.A02.getWidth() > callLogActivity.A02.getHeight()) {
            if (callLogActivity.A02.getFirstVisiblePosition() == 0) {
                i = A0F2.getTop();
            } else {
                i = (-callLogActivity.A0f.getHeight()) + 1;
            }
            View view = callLogActivity.A0f;
            view.offsetTopAndBottom(i - view.getTop());
        } else if (callLogActivity.A0f.getTop() != 0) {
            View view2 = callLogActivity.A0f;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }

    public static boolean A0d(CallLogActivity callLogActivity, C178119Bw r4) {
        boolean z;
        HashSet hashSet = callLogActivity.A0p;
        if (hashSet.contains(r4)) {
            hashSet.remove(r4);
            z = false;
        } else {
            hashSet.add(r4);
            z = true;
        }
        boolean A1R = AnonymousClass000.A1R(hashSet.size());
        AnonymousClass02B r0 = callLogActivity.A04;
        if (!A1R) {
            if (r0 != null) {
                r0.A05();
            }
            return z;
        } else if (r0 == null) {
            callLogActivity.A04 = callLogActivity.COJ(callLogActivity.A0m);
            return z;
        } else {
            r0.A06();
            return z;
        }
    }

    public void A2y() {
        if (!this.A0k) {
            this.A0k = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K2.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r3 = r1.A00;
            AnonymousClass1FB.A0K(r1, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r1, r3, this, r3.A5A);
            this.A0M = AnonymousClass3MY.A0Z(r1);
            this.A0G = AnonymousClass3Ma.A0d(r1);
            this.A07 = AnonymousClass3MZ.A0W(r1);
            this.A09 = AnonymousClass3MZ.A0e(r1);
            this.A0A = AnonymousClass10E.A4z(r1);
            this.A0C = AnonymousClass3MZ.A0g(r1);
            this.A0T = C000200d.A00(r1.A24);
            this.A0P = AnonymousClass3MZ.A13(r1);
            this.A08 = AnonymousClass3MY.A0S(r1);
            this.A0R = C000200d.A00(r1.A0x);
            this.A0B = AnonymousClass3Ma.A0S(r1);
            this.A0Z = C000200d.A00(r1.AAd);
            this.A0Q = C000200d.A00(r1.A0F);
            this.A0F = (AnonymousClass1TD) r1.A1m.get();
            this.A0O = (C36451nu) r1.A0G.get();
            this.A0S = C000200d.A00(r1.A1h);
            this.A0U = C000200d.A00(r1.A2A);
            this.A0E = (AnonymousClass12E) r1.A2k.get();
            this.A0K = (C27081Uq) r1.A9g.get();
            this.A0I = AnonymousClass3MY.A0V(r1);
            this.A0D = AnonymousClass3MZ.A0j(r1);
            this.A0H = AnonymousClass3MZ.A0m(r1);
            this.A0W = C000200d.A00(r1.A4u);
            this.A0b = C000200d.A00(r1.ABc);
            this.A0Y = AnonymousClass3MX.A11(r1);
            this.A05 = AnonymousClass3MZ.A0T(r3);
            this.A06 = (C36931oh) A0K2.A3o.get();
            this.A0a = C000200d.A00(r1.ABV);
            this.A0X = C000200d.A00(r1.A7f);
            this.A0c = C000200d.A00(r1.ABj);
            this.A0V = C000200d.A00(r1.A2b);
        }
    }

    public void A3K() {
        AnonymousClass3MX.A0u(this.A0Y).A02((AnonymousClass1BI) null, 15);
    }

    public /* synthetic */ void A4b(String str, Bundle bundle) {
        if (str.equals("request_bottom_sheet_fragment")) {
            if (bundle.getBoolean("is_contact_saved")) {
                this.A0E.A0D((Integer) null);
            }
            C72453Mb.A1O(this.A0Q);
        }
        getSupportFragmentManager().A0u("request_bottom_sheet_fragment");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 11 || i == 10) {
            if (i2 == -1) {
                this.A0E.A0D((Integer) null);
            }
            C72453Mb.A1O(this.A0Q);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean A0P2 = AnonymousClass3MW.A0V(this.A0R).A0P(AnonymousClass3MZ.A0x(this.A0L));
        MenuItem findItem = menu.findItem(2131432645);
        if (findItem != null) {
            findItem.setVisible(A0P2);
        }
        MenuItem findItem2 = menu.findItem(2131432532);
        if (findItem2 != null) {
            findItem2.setVisible(!A0P2);
        }
        return true;
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public void C81(AnonymousClass02B r2) {
        super.C81(r2);
        C28281Zt.A05(this, AnonymousClass4Z9.A01(this, false));
    }

    public void C82(AnonymousClass02B r1) {
        super.C82(r1);
        C72473Md.A0o(this);
    }

    public AnonymousClass02B COJ(AnonymousClass02H r4) {
        AnonymousClass02B COJ = super.COJ(r4);
        View findViewById = findViewById(2131427512);
        if (findViewById instanceof ImageView) {
            ((ImageView) findViewById).setImageResource(2131230921);
        }
        return COJ;
    }

    public void onCreate(Bundle bundle) {
        String formatDateTime;
        super.onCreate(bundle);
        boolean A1T = C72473Md.A1T(this);
        setTitle(2131887628);
        setContentView(2131624636);
        AnonymousClass1BI A0l2 = AnonymousClass3MX.A0l(C72453Mb.A0u(this));
        C17960vV.A07(A0l2);
        this.A0N = A0l2;
        this.A0l = getIntent().getBooleanExtra("is_voice_chat", false);
        this.A02 = (ListView) findViewById(16908298);
        View inflate = getLayoutInflater().inflate(2131624635, this.A02, false);
        inflate.setImportantForAccessibility(2);
        this.A02.addHeaderView(inflate, (Object) null, false);
        View findViewById = findViewById(2131431358);
        this.A0f = findViewById;
        findViewById.setClickable(A1T);
        findViewById(2131429413).setFocusable(A1T);
        this.A0i = this.A05.BGE(this, (TextEmojiLabel) findViewById(2131429556));
        if (!AnonymousClass1J8.A09(this.A0E)) {
            C43421zm.A04(this.A0i.A01);
        }
        this.A03 = AnonymousClass3MX.A0L(this, 2131429560);
        View findViewById2 = findViewById(2131430073);
        C18000vb r1 = this.A00;
        C17960vV.A07(this);
        findViewById2.setBackground(AnonymousClass3NL.A00(this, r1, 2131232556));
        this.A02.setOnScrollListener(new C64782vK(this, A1T ? 1 : 0));
        C90584eJ.A00(this.A02.getViewTreeObserver(), this, 6);
        this.A01 = AnonymousClass3MX.A0I(this, 2131433801);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(AnonymousClass4ZR.A01(this));
        String A0y = AnonymousClass000.A0y("-avatar", A10);
        AnonymousClass1Xr.A04(this.A01, A0y);
        this.A01.setOnClickListener(new C825348i(2, A0y, this));
        this.A0g = (ImageButton) C110885hR.A0A(this, 2131428646);
        this.A0h = (ImageButton) C110885hR.A0A(this, 2131436740);
        this.A0g.setOnClickListener(new AnonymousClass48Z(A1T, this, false));
        this.A0h.setOnClickListener(new AnonymousClass48Z(A1T, this, A1T));
        ListView listView = this.A02;
        C73023Or r4 = this.A0n;
        listView.setAdapter(r4);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("calls");
        if (parcelableArrayListExtra == null) {
            this.A00 = null;
        } else {
            this.A0d = AnonymousClass000.A13();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                C89444cT r2 = (C89444cT) ((Parcelable) it.next());
                C178119Bw A0U2 = C72483Me.A0U(this.A0F, r2);
                if (A0U2 != null) {
                    this.A0d.add(A0U2);
                }
                if (this.A00 == null) {
                    this.A00 = r2;
                }
            }
            int size = parcelableArrayListExtra.size();
            ArrayList arrayList = this.A0d;
            if (size != arrayList.size()) {
                StringBuilder A102 = AnonymousClass000.A10();
                C17890vO.A14("CallLogActivity/onCreate:missingKeys: ", A102, arrayList);
                C17890vO.A14(" out of ", A102, parcelableArrayListExtra);
                C17890vO.A19(A102, " fetched");
            }
            r4.A01 = this.A0d;
            r4.notifyDataSetChanged();
            ArrayList arrayList2 = this.A0d;
            if (!arrayList2.isEmpty()) {
                C178119Bw r42 = (C178119Bw) arrayList2.get(0);
                long A092 = this.A05.A09(r42.A01);
                TextView A0L2 = AnonymousClass3MX.A0L(this, 2131428774);
                if (DateUtils.isToday(A092)) {
                    formatDateTime = AnonymousClass11X.A00(this.A00);
                } else if (DateUtils.isToday(86400000 + A092)) {
                    formatDateTime = AnonymousClass11X.A00.A05(this.A00);
                } else {
                    formatDateTime = DateUtils.formatDateTime(this, A092, 16);
                }
                A0L2.setText(formatDateTime);
                if (!(r42.A0F == null || r42.A0C == null || !C40811vJ.A0W(this.A0E))) {
                    this.A05.CGN(new C21459AkQ(this, r42, r42.A0F.A00, 49));
                }
            } else {
                finish();
            }
        }
        A0Q(this);
        this.A0B.registerObserver(this.A0q);
        C17880vN.A0V(this.A0U).registerObserver(this.A0r);
        C17880vN.A0V(this.A0W).registerObserver(this.A0s);
        A39(this.A00, this.A05);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2131432598, 0, 2131892000).setIcon(2131233235).setAlphabeticShortcut('n').setShowAsAction(2);
        menu.add(0, 2131432537, 0, 2131888327).setIcon(2131231847);
        if (!(this.A0N instanceof GroupJid)) {
            if (!this.A0L.A0B() && (!AnonymousClass3MX.A1V(this))) {
                menu.add(0, 2131432524, 0, 2131898687);
            }
            menu.add(0, 2131432645, 0, 2131897273);
            menu.add(0, 2131432532, 0, 2131887168);
        }
        C18030ve r1 = this.A0E;
        this.A0b.get();
        C40811vJ.A0B(r1);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0B.unregisterObserver(this.A0q);
        C17880vN.A0V(this.A0U).unregisterObserver(this.A0r);
        C17880vN.A0V(this.A0W).unregisterObserver(this.A0s);
        if (this.A0e) {
            this.A0e = false;
            this.A08.A03 = false;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent A0P2;
        if (menuItem.getItemId() != 16908332) {
            if (menuItem.getItemId() == 2131432537) {
                Log.i("calllog/delete");
                ArrayList arrayList = this.A0d;
                if (arrayList != null) {
                    this.A0F.A0C(arrayList);
                }
                return true;
            } else if (menuItem.getItemId() == 2131432598) {
                AnonymousClass1BI r1 = this.A0L.A0J;
                if (r1 == null || !this.A08.A0L() || !this.A08.A0M(r1)) {
                    A03(this);
                    return true;
                }
                this.A08.A0A(this, new C76873oZ(r1, true), this.A0o, 5);
                return true;
            } else if (menuItem.getItemId() == 2131432524) {
                AnonymousClass4Yv.A01(this, 1);
                return true;
            } else if (menuItem.getItemId() == 2131432645) {
                AnonymousClass3MW.A0V(this.A0R).A0H(this, this.A0L, "call_log_block", true);
                return true;
            } else {
                boolean z = false;
                if (menuItem.getItemId() == 2131432532) {
                    AnonymousClass1E7 r0 = this.A0L;
                    if (r0 != null && r0.A0C()) {
                        z = true;
                    }
                    UserJid A002 = C22941Dw.A00(this.A0N);
                    C17960vV.A07(A002);
                    if (z) {
                        C18030ve r2 = this.A0E;
                        C18070vi.A0d(r2, 0);
                        A0P2 = AnonymousClass1LU.A1E(this, A002, "biz_call_log_block", true, C18020vd.A05(C18040vf.A02, r2, 6185), false, false);
                    } else {
                        AnonymousClass4SO BGI = this.A06.BGI(A002, "call_log_block");
                        BGI.A05 = true;
                        BGI.A04 = true;
                        CMl(C123736Vq.A00(BGI.A00()));
                        return true;
                    }
                } else if (menuItem.getItemId() != 2131432534) {
                    return false;
                } else {
                    A0P2 = AnonymousClass1LU.A0P(this, (Uri) null, this.A00, (String) null, true);
                }
                startActivity(A0P2);
                return true;
            }
        }
        finish();
        return true;
    }

    public CallLogActivity(int i) {
        this.A0k = false;
        C90994ey.A00(this, 24);
    }
}
