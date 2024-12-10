package com.whatsapp.conversation.conversationrow.message;

import X.A87;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1E9;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1W2;
import X.AnonymousClass1WR;
import X.AnonymousClass1WX;
import X.AnonymousClass1YL;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass2H8;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3N1;
import X.AnonymousClass3uP;
import X.AnonymousClass4R1;
import X.AnonymousClass4aU;
import X.AnonymousClass4aW;
import X.AnonymousClass5YT;
import X.AnonymousClass5ZI;
import X.AnonymousClass68H;
import X.C000200d;
import X.C003401n;
import X.C108875cR;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C19880zA;
import X.C19890zB;
import X.C222219b;
import X.C22971Dz;
import X.C23581Gv;
import X.C24671Lf;
import X.C24681Lg;
import X.C24921Me;
import X.C25221Nj;
import X.C27201Vd;
import X.C28741ap;
import X.C31131f4;
import X.C32011gU;
import X.C33251iW;
import X.C34531kd;
import X.C37451pZ;
import X.C64002u3;
import X.C692236j;
import X.C72043Kk;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73013Oq;
import X.C73063Ov;
import X.C78983u2;
import X.C86034Px;
import X.C88524a2;
import X.C90584eJ;
import X.C90734eY;
import X.C91004ez;
import X.C91624fz;
import X.C94164k9;
import X.C95414mC;
import X.C95504mL;
import X.C95674mc;
import X.C96314ne;
import X.C98704ra;
import X.C98784ri;
import X.C98834rn;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MessageDetailsActivity extends AnonymousClass1FY implements AnonymousClass5YT {
    public long A00;
    public BaseAdapter A01;
    public ListView A02;
    public C19880zA A03;
    public C19880zA A04;
    public C19880zA A05;
    public C19880zA A06;
    public C34531kd A07;
    public C72043Kk A08;
    public C33251iW A09;
    public AnonymousClass1M9 A0A;
    public C24671Lf A0B;
    public C24921Me A0C;
    public C37451pZ A0D;
    public C27201Vd A0E;
    public AnonymousClass3uP A0F;
    public AnonymousClass5ZI A0G;
    public C31131f4 A0H;
    public MessageDetailsViewModel A0I;
    public AnonymousClass118 A0J;
    public AnonymousClass122 A0K;
    public C24681Lg A0L;
    public AnonymousClass1WX A0M;
    public AnonymousClass1LU A0N;
    public C32011gU A0O;
    public C95674mc A0P;
    public AnonymousClass206 A0Q;
    public AnonymousClass4aW A0R;
    public C86034Px A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public boolean A0Z;
    public C88524a2 A0a;
    public final List A0b;
    public final C23581Gv A0c;
    public final C28741ap A0d;
    public final AnonymousClass1WR A0e;
    public final C25221Nj A0f;
    public final Runnable A0g;

    public MessageDetailsActivity() {
        this(0);
        this.A0b = AnonymousClass000.A13();
        this.A0e = new C95504mL(this, 8);
        this.A0c = new C94164k9(this, 16);
        this.A0d = new C95414mC(this, 10);
        this.A0f = new C96314ne(this, 15);
        this.A0g = new C98834rn((Object) this, 15);
    }

    public int A31() {
        return 154478781;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C692236j r5;
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C19880zA r1 = this.A03;
                if (r1.A07()) {
                    r1.A03();
                    throw AnonymousClass000.A0s("handleAdvertiseForwardClick");
                }
                return;
            }
            ArrayList A0r = C72463Mc.A0r(intent, AnonymousClass1BI.class);
            boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
            String stringExtra = intent.getStringExtra("appended_message");
            if (C22971Dz.A01(A0r) != null) {
                C17960vV.A07(intent);
                Bundle extras = intent.getExtras();
                r5 = new C692236j();
                C72473Md.A0v(extras, r5, this.A0Y);
            } else {
                r5 = null;
            }
            this.A09.A0N(this.A07, r5, stringExtra, Collections.singletonList(this.A0Q), A0r, booleanExtra);
            if (A0r.size() != 1 || C22971Dz.A0a((Jid) A0r.get(0))) {
                CPW(A0r, 1);
            } else {
                C72473Md.A0q(this, this.A01, this.A0N, A0r);
            }
        }
    }

    public static void A03(MessageDetailsActivity messageDetailsActivity) {
        ListView listView = messageDetailsActivity.A02;
        Runnable runnable = messageDetailsActivity.A0g;
        listView.removeCallbacks(runnable);
        long j = messageDetailsActivity.A00;
        if (j != Long.MAX_VALUE) {
            messageDetailsActivity.A02.postDelayed(runnable, (A87.A01(j) - System.currentTimeMillis()) + 1000);
        }
    }

    public void A2y() {
        if (!this.A0Z) {
            this.A0Z = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r4 = A0K2.AAQ;
            C72483Me.A0q(r4, this);
            AnonymousClass10G r1 = r4.A00;
            AnonymousClass1FB.A0K(r4, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r4, r1, this, r1.A5A);
            this.A0J = AnonymousClass3MZ.A0l(r4);
            this.A0N = AnonymousClass3MY.A0Z(r4);
            this.A07 = AnonymousClass3MZ.A0R(r4);
            this.A0O = AnonymousClass3MY.A0d(r4);
            this.A09 = AnonymousClass3MZ.A0U(r4);
            this.A0E = AnonymousClass3MZ.A0i(r4);
            this.A0A = AnonymousClass10E.A4z(r4);
            this.A0M = (AnonymousClass1WX) r4.A9N.get();
            this.A0C = AnonymousClass3MZ.A0g(r4);
            this.A0B = AnonymousClass3Ma.A0S(r4);
            this.A0K = AnonymousClass3MZ.A0n(r4);
            this.A0W = C000200d.A00(A0K2.A5l);
            this.A0U = AnonymousClass3MX.A12(r4);
            this.A0L = AnonymousClass3MZ.A0o(r4);
            this.A0R = (AnonymousClass4aW) r1.A5C.get();
            C19890zB r2 = C19890zB.A00;
            this.A05 = r2;
            this.A0T = C000200d.A00(r4.A2A);
            this.A0X = C000200d.A00(r4.AA1);
            this.A04 = AnonymousClass3MZ.A0M(r4.A13);
            this.A0Y = C000200d.A00(r1.A4e);
            this.A0V = C000200d.A00(r4.A4u);
            this.A0H = (C31131f4) r4.A6M.get();
            this.A06 = r2;
            this.A0G = (AnonymousClass5ZI) A0K2.A2I.get();
            this.A0S = (C86034Px) r1.A58.get();
            this.A03 = r2;
            this.A08 = AnonymousClass3MZ.A0T(r1);
            this.A0P = (C95674mc) r1.ABo.get();
        }
    }

    public C37451pZ getContactPhotosLoader() {
        return this.A0a.A04(this);
    }

    public void onCreate(Bundle bundle) {
        BaseAdapter r1;
        String str;
        A2r(9);
        requestWindowFeature(9);
        super.onCreate(bundle);
        A3D("on_create");
        this.A0a = this.A0G.BGL(this, getSupportFragmentManager(), AnonymousClass68H.A01(this.A05));
        A3D("get_message_key_from_intent");
        AnonymousClass205 A022 = AnonymousClass4aU.A02(getIntent());
        if (A022 != null) {
            this.A0Q = AnonymousClass1W2.A01(A022, this.A0U);
        }
        A3C("get_message_key_from_intent");
        setTitle(2131892056);
        getSupportActionBar().A0W(true);
        setContentView(2131626031);
        C003401n supportActionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(AnonymousClass3MZ.A00(this));
        supportActionBar.A0N(colorDrawable);
        supportActionBar.A0X(false);
        Intent intent = getIntent();
        if (intent == null) {
            str = "intent_is_null";
        } else {
            this.A0D = this.A0E.A06(this, "message-details-activity");
            if (this.A0Q == null) {
                A3D("get_message_creating_message_key");
                this.A0Q = AnonymousClass1W2.A01(new AnonymousClass205(AnonymousClass3MX.A0l(intent.getStringExtra("key_remote_jid")), intent.getStringExtra("key_id"), true), this.A0U);
                A3C("get_message_creating_message_key");
            }
            AnonymousClass206 r2 = this.A0Q;
            if (r2 == null) {
                str = "message_is_null";
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("MessageDetailsActivity/key: ");
                C17900vP.A0b(r2.A0v, A10);
                this.A02 = (ListView) findViewById(16908298);
                AnonymousClass3uP A052 = this.A0a.A05((C108875cR) null, this.A0Q);
                this.A0F = A052;
                A052.setOnLongClickListener((View.OnLongClickListener) null);
                this.A0F.A2Z = new C98834rn((Object) this, 13);
                List A002 = ((AnonymousClass4R1) this.A0W.get()).A00(this.A0Q);
                AnonymousClass3uP r22 = this.A0F;
                if (A002 != null) {
                    r22.A2a = new C98704ra(this, A002, 7);
                } else {
                    r22.A2a = new C98834rn((Object) this, 14);
                }
                r22.A2i = false;
                ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(2131626036, (ViewGroup) null, false);
                ViewGroup A0D2 = AnonymousClass3MW.A0D(viewGroup, 2131429593);
                A0D2.addView(this.A0F, -1, -2);
                Point A0D3 = C72483Me.A0D(this);
                AnonymousClass3MY.A1C(A0D2, -2, 0, View.MeasureSpec.makeMeasureSpec(A0D3.x, 1073741824));
                int i = A0D3.y / 2;
                boolean z = false;
                if (A0D2.getMeasuredHeight() > i) {
                    z = true;
                    C90584eJ.A00(this.A02.getViewTreeObserver(), this, 19);
                }
                this.A02.addHeaderView(viewGroup, (Object) null, false);
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(2131231368);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.A02.addHeaderView(imageView, (Object) null, false);
                View view = new View(this);
                view.setLayoutParams(new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(2131165755)));
                this.A02.addFooterView(view, (Object) null, false);
                MessageDetailsViewModel messageDetailsViewModel = (MessageDetailsViewModel) AnonymousClass3MW.A0N(this).A00(MessageDetailsViewModel.class);
                this.A0I = messageDetailsViewModel;
                AnonymousClass206 r12 = this.A0Q;
                AnonymousClass1BI r3 = r12.A0v.A00;
                if (messageDetailsViewModel.A0T(r12)) {
                    r1 = new C73063Ov(this);
                } else {
                    r1 = new C73013Oq(this);
                }
                this.A01 = r1;
                this.A02.setAdapter(r1);
                Drawable A0B2 = this.A0R.A0B(this.A0R.A0E(this, r3));
                if (A0B2 != null) {
                    viewGroup.setBackground(new AnonymousClass3N1(A0B2, viewGroup, this));
                } else {
                    viewGroup.setBackgroundResource(AnonymousClass1YL.A00(this, 2130971972, 2131103141));
                }
                this.A02.setOnScrollListener(new C90734eY(colorDrawable, A0D2, this, i, z));
                this.A0H.A06();
                this.A0B.registerObserver(this.A0c);
                this.A0L.registerObserver(this.A0e);
                C17880vN.A0V(this.A0T).registerObserver(this.A0d);
                C17880vN.A0V(this.A0V).registerObserver(this.A0f);
                this.A0X.get();
                C91624fz.A00(this, this.A0I.A00, 43);
                MessageDetailsViewModel messageDetailsViewModel2 = this.A0I;
                C98704ra.A00(messageDetailsViewModel2.A07, messageDetailsViewModel2, this.A0Q, 8);
                A3C("on_create");
                return;
            }
        }
        Biz(str);
        A3C("on_create");
        Biu(3);
        finish();
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        A33.A04 = true;
        A33.A00((String) null, 8);
        return A33;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0D.A02();
        C88524a2 r1 = this.A0a;
        C37451pZ r0 = r1.A00;
        if (r0 != null) {
            r0.A02();
        }
        r1.A0E.A04();
        r1.A0F.A0A();
        this.A0H.A06();
        this.A0B.unregisterObserver(this.A0c);
        this.A0L.unregisterObserver(this.A0e);
        C17880vN.A0V(this.A0T).unregisterObserver(this.A0d);
        C17880vN.A0V(this.A0V).unregisterObserver(this.A0f);
        this.A02.removeCallbacks(this.A0g);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.A0S.A00();
        if (this.A0H.A0B()) {
            this.A0H.A03();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0H.A0B()) {
            this.A0H.A05();
        }
        AnonymousClass3uP r3 = this.A0F;
        if (r3 instanceof C78983u2) {
            r3.A0S.A0J(new C98784ri((Object) r3, 12));
        }
    }

    public void onStart() {
        super.onStart();
        AnonymousClass2H8 A32 = A32();
        AnonymousClass206 r1 = this.A0Q;
        AnonymousClass1BI r0 = r1.A0v.A00;
        int i = r1.A0A;
        if (A32 != null && (r0 instanceof AnonymousClass1E9) && i > 0) {
            long j = (long) i;
            long j2 = 32;
            if (j > 32) {
                j2 = j;
            }
            A32.A0A = Long.valueOf(j2);
            A32.A03 = Integer.valueOf(C64002u3.A00(i));
        }
        C3A();
    }

    public MessageDetailsActivity(int i) {
        this.A0Z = false;
        C91004ez.A00(this, 30);
    }
}
