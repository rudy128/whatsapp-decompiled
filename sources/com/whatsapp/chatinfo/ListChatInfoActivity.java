package com.whatsapp.chatinfo;

import X.A59;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass12E;
import X.AnonymousClass17K;
import X.AnonymousClass18O;
import X.AnonymousClass190;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1L4;
import X.AnonymousClass1LU;
import X.AnonymousClass1NI;
import X.AnonymousClass1QS;
import X.AnonymousClass1ST;
import X.AnonymousClass1WR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass3Of;
import X.AnonymousClass48V;
import X.AnonymousClass48l;
import X.AnonymousClass4FQ;
import X.AnonymousClass4MY;
import X.AnonymousClass4S6;
import X.AnonymousClass4Yv;
import X.AnonymousClass4ZR;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.AnonymousClass6n9;
import X.AnonymousClass745;
import X.AnonymousClass7RL;
import X.C000200d;
import X.C1193267r;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C20099A7c;
import X.C22941Dw;
import X.C22971Dz;
import X.C23581Gv;
import X.C24671Lf;
import X.C24681Lg;
import X.C24921Me;
import X.C25221Nj;
import X.C25491Ok;
import X.C27201Vd;
import X.C28521aN;
import X.C28741ap;
import X.C28931bI;
import X.C36451nu;
import X.C36741oO;
import X.C37451pZ;
import X.C43251zV;
import X.C47712Jo;
import X.C57172ie;
import X.C64052u8;
import X.C64782vK;
import X.C72043Kk;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C74763cR;
import X.C74803cp;
import X.C76733o2;
import X.C76753oA;
import X.C76783oH;
import X.C76793oR;
import X.C84244Is;
import X.C84254It;
import X.C85474Nn;
import X.C88124Yk;
import X.C88194Yr;
import X.C89884dB;
import X.C90584eJ;
import X.C90814eg;
import X.C90994ey;
import X.C91574fu;
import X.C91774gE;
import X.C94164k9;
import X.C95414mC;
import X.C95504mL;
import X.C95864mv;
import X.C96314ne;
import X.C98044qU;
import X.C98084qY;
import X.C98754rf;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.group.view.custom.GroupDetailsCard;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class ListChatInfoActivity extends C76733o2 {
    public TextView A00;
    public TextView A01;
    public C19880zA A02;
    public C19880zA A03;
    public C84244Is A04;
    public C84254It A05;
    public C72043Kk A06;
    public AnonymousClass3Of A07;
    public C76793oR A08;
    public C24671Lf A09;
    public C24921Me A0A;
    public C25491Ok A0B;
    public C37451pZ A0C;
    public C27201Vd A0D;
    public AnonymousClass12E A0E;
    public C18000vb A0F;
    public AnonymousClass1NI A0G;
    public C24681Lg A0H;
    public AnonymousClass1E7 A0I;
    public AnonymousClass1E7 A0J;
    public C1193267r A0K;
    public AnonymousClass1LU A0L;
    public C18010vc A0M;
    public AnonymousClass4S6 A0N;
    public C36451nu A0O;
    public C36741oO A0P;
    public C28931bI A0Q;
    public C28931bI A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public View A0Z;
    public ListView A0a;
    public TextView A0b;
    public C76753oA A0c;
    public C76783oH A0d;
    public GroupDetailsCard A0e;
    public boolean A0f;
    public final ArrayList A0g;
    public final C23581Gv A0h;
    public final C28741ap A0i;
    public final AnonymousClass1WR A0j;
    public final C25221Nj A0k;

    public ListChatInfoActivity() {
        this(0);
        this.A0g = AnonymousClass000.A13();
        this.A0h = new C94164k9(this, 6);
        this.A0i = new C95414mC(this, 3);
        this.A0k = new C96314ne(this, 5);
        this.A0j = new C95504mL(this, 5);
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        UserJid A022;
        A2r(5);
        super.onCreate(bundle);
        this.A0C = this.A0D.A06(this, "list-chat-info");
        A2Y();
        setTitle(2131891715);
        setContentView(2131624335);
        this.A0d = C72453Mb.A0h(this);
        Toolbar A0G2 = AnonymousClass3Ma.A0G(this);
        A0G2.setTitle((CharSequence) "");
        A0G2.A0L();
        AnonymousClass3MY.A0K(this, A0G2).A0W(true);
        AnonymousClass3NL.A02(this, A0G2, this.A0F, 2131231712);
        this.A0a = getListView();
        this.A0d.A0E(2131624337);
        this.A0Z = findViewById(2131431358);
        this.A0e = (GroupDetailsCard) findViewById(2131431252);
        this.A0d.A0A();
        this.A0d.setColor(AnonymousClass3MZ.A00(this));
        View inflate = C74803cp.A03(this, this.A0d).inflate(2131624336, this.A0a, false);
        this.A0a.addFooterView(inflate, (Object) null, false);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setVisibility(4);
        linearLayout.setPadding(0, 0, 0, C72483Me.A0D(this).y);
        this.A0a.addFooterView(linearLayout, (Object) null, false);
        C47712Jo A002 = C47712Jo.A00(getIntent().getStringExtra("gid"));
        if (A002 == null) {
            Log.e("list_chat_info/on_create: exiting due to null listChat jid object");
            finish();
            return;
        }
        this.A0I = this.A0E.A0H(A002);
        this.A07 = new AnonymousClass3Of(this, this, this.A0g);
        this.A0Z = findViewById(2131431358);
        this.A0a.setOnScrollListener(new C64782vK(this, 2));
        C90584eJ.A00(this.A0a.getViewTreeObserver(), this, 8);
        C90814eg.A00(this.A0a, this, 1);
        this.A0I.toString();
        findViewById(2131427627);
        C89884dB.A00(findViewById(2131427624), this, 29);
        this.A0b = AnonymousClass3MX.A0L(this, 2131429560);
        A4f();
        this.A00 = AnonymousClass3MX.A0L(this, 2131433448);
        this.A01 = AnonymousClass3MX.A0L(this, 2131433452);
        C84254It r1 = this.A05;
        C47712Jo A4l = A4l();
        C17960vV.A07(A4l);
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(A4l, 1);
        C76793oR r0 = (C76793oR) C91774gE.A00(this, r1, A4l, 1).A00(C76793oR.class);
        this.A08 = r0;
        A4i(r0);
        C91574fu.A00(this, this.A08.A00, 38);
        C91574fu.A00(this, this.A08.A07, 39);
        C76793oR r12 = this.A08;
        C98754rf.A01(r12.A0H, r12, 0);
        ((AnonymousClass48V) this.A0O.A02()).setTopShadowVisibility(8);
        this.A0a.setAdapter(this.A07);
        registerForContextMenu(this.A0a);
        this.A0I.toString();
        A4j(2131231046);
        View findViewById2 = findViewById(2131430652);
        C89884dB.A00(findViewById2, this, 30);
        AnonymousClass3MW.A1Q(findViewById2);
        if (C72453Mb.A1W(this.A0X)) {
            View findViewById3 = findViewById(2131432073);
            findViewById3.setVisibility(0);
            C89884dB.A00(findViewById3, this, 31);
        }
        A10(this);
        if (this.A0N.A01()) {
            C28931bI r02 = this.A0R;
            if (r02 == null) {
                r02 = C28931bI.A00(this.A00, 2131436384);
                this.A0R = r02;
            }
            r02.A04(0);
            this.A0N.A00(this, (ListItemWithLeftIcon) this.A0R.A02(), A4l());
        }
        C19880zA r13 = this.A03;
        if (r13.A07()) {
            r13.A03();
            A4l();
            throw AnonymousClass000.A0s("initSmbLabelScroller");
        }
        findViewById(2131435576).setOnClickListener(new AnonymousClass48l(this, 39));
        this.A09.registerObserver(this.A0h);
        this.A0H.registerObserver(this.A0j);
        C17880vN.A0V(this.A0T).registerObserver(this.A0i);
        C17880vN.A0V(this.A0W).registerObserver(this.A0k);
        if (!(bundle == null || (A022 = C22941Dw.A02(bundle.getString("selected_jid"))) == null)) {
            this.A0J = this.A0E.A0H(A022);
        }
        AnonymousClass4ZR r2 = new AnonymousClass4ZR(this);
        if (getIntent().getBooleanExtra("circular_transition", false)) {
            findViewById = this.A0Z;
        } else {
            findViewById = findViewById(2131433831);
        }
        findViewById.setTransitionName(r2.A02(2131899529));
        this.A0d.A0H(inflate, linearLayout, this.A07);
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj A002;
        int i2;
        int i3;
        AnonymousClass1E7 r3;
        int i4 = i;
        if (i4 == 2) {
            if (TextUtils.isEmpty(this.A0A.A0I(this.A0I))) {
                getString(2131889313);
            } else {
                Object[] objArr = new Object[1];
                AnonymousClass3MX.A1N(this.A0A, this.A0I, objArr, 0);
                getString(2131889311, objArr);
            }
            return this.A0P.A00(this, new C98084qY(new C98044qU(this, 0), 1), 1, 1, 0, false).create();
        } else if (i4 != 3) {
            if (i4 == 4) {
                Log.w("listchatinfo/add existing contact: activity not found, probably tablet");
                A002 = AnonymousClass4a6.A00(this);
                A002.A0D(2131886448);
                i2 = 2131899286;
                i3 = 38;
            } else if (i4 != 6 || (r3 = this.A0J) == null) {
                return super.onCreateDialog(i4);
            } else {
                Object[] objArr2 = new Object[1];
                AnonymousClass3MX.A1N(this.A0A, r3, objArr2, 0);
                String string = getString(2131895139, objArr2);
                A002 = AnonymousClass4a6.A00(this);
                A002.A0S(C43251zV.A05(this, this.A0D, string));
                A002.A0T(true);
                A002.A0X(new AnonymousClass4aq(this, 36), 2131898766);
                i2 = 2131899286;
                i3 = 37;
            }
            C73203Rj.A09(A002, this, i3, i2);
            return A002.create();
        } else {
            C95864mv r7 = new C95864mv(this, 0);
            AnonymousClass11P r18 = this.A05;
            C18030ve r17 = this.A0E;
            AnonymousClass1KB r16 = this.A05;
            AnonymousClass1L4 r15 = this.A09;
            AnonymousClass190 r12 = this.A03;
            AnonymousClass1KW r11 = this.A0D;
            C1193267r r10 = this.A0K;
            AnonymousClass11C r6 = this.A08;
            C18000vb r5 = this.A0F;
            C19830z4 r32 = this.A0A;
            C18010vc r2 = this.A0M;
            AnonymousClass1L2 r0 = this.A0C;
            AnonymousClass1E7 A0G2 = this.A0E.A0G(A4l());
            C17960vV.A07(A0G2);
            EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) this.A0U.get();
            C18030ve r27 = r17;
            C18010vc r28 = r2;
            AnonymousClass1L4 r29 = r15;
            return new C74763cR(this, r12, r16, r6, r18, r32, r5, r7, r0, (A59) this.A0V.get(), r10, r11, emojiSearchProvider, r27, r28, r29, A0G2.A0K(), 3, 2131889631, Math.max(0, this.A06.A04(AnonymousClass18O.A1O)), 0, 0, 16385);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, 2131886465).setIcon(2131231621).setShowAsAction(0);
        menu.add(0, 3, 0, 2131889630).setShowAsAction(0);
        return super.onCreateOptionsMenu(menu);
    }

    public static void A0y(ListChatInfoActivity listChatInfoActivity) {
        C19880zA r1 = listChatInfoActivity.A02;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("logBroadcastSmbJourneyEditBroadcastClick");
        }
        List A0V2 = listChatInfoActivity.A08.A0V();
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(listChatInfoActivity.getPackageName(), "com.whatsapp.conversation.EditBroadcastRecipientsSelector");
        A0A2.putExtra("selected", C22971Dz.A0B(A0V2));
        listChatInfoActivity.startActivityForResult(A0A2, 12);
    }

    public static void A0z(ListChatInfoActivity listChatInfoActivity) {
        int i;
        View A0F2 = AnonymousClass3MY.A0F(listChatInfoActivity.A0a);
        if (A0F2 == null) {
            return;
        }
        if (listChatInfoActivity.A0a.getWidth() > listChatInfoActivity.A0a.getHeight()) {
            if (listChatInfoActivity.A0a.getFirstVisiblePosition() == 0) {
                i = A0F2.getTop();
            } else {
                i = (-listChatInfoActivity.A0Z.getHeight()) + 1;
            }
            View view = listChatInfoActivity.A0Z;
            view.offsetTopAndBottom(i - view.getTop());
        } else if (listChatInfoActivity.A0Z.getTop() != 0) {
            View view2 = listChatInfoActivity.A0Z;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }

    public static void A10(ListChatInfoActivity listChatInfoActivity) {
        TextView textView;
        ListChatInfoActivity listChatInfoActivity2 = listChatInfoActivity;
        long A042 = C20099A7c.A04(listChatInfoActivity2.A0I.A0X, Long.MIN_VALUE);
        if (A042 != Long.MIN_VALUE || (textView = listChatInfoActivity2.A0b) == null) {
            String A0E2 = C64052u8.A0E(listChatInfoActivity2.A0F, new Object[0], 2131890933, 2131890934, 2131890932, A042, true);
            GroupDetailsCard groupDetailsCard = listChatInfoActivity2.A0e;
            C17960vV.A05(groupDetailsCard);
            groupDetailsCard.setSecondSubtitleText(A0E2);
        } else {
            textView.setVisibility(8);
        }
        C76753oA r2 = listChatInfoActivity2.A0c;
        if (r2 != null) {
            r2.A0B(true);
        }
        listChatInfoActivity2.A08.A0U();
        listChatInfoActivity2.A2v(true);
        C84244Is r22 = listChatInfoActivity2.A04;
        C76793oR r6 = listChatInfoActivity2.A08;
        C47712Jo A4l = listChatInfoActivity2.A4l();
        AnonymousClass10E r3 = r22.A00.A01;
        AnonymousClass1QS A0z = AnonymousClass3MZ.A0z(r3);
        AnonymousClass10G r4 = r3.A00;
        AnonymousClass4MY r8 = (AnonymousClass4MY) r4.A2u.get();
        AnonymousClass6n9 r9 = (AnonymousClass6n9) r3.A5i.get();
        AnonymousClass1ST r10 = (AnonymousClass1ST) r3.A6C.get();
        C88194Yr r12 = (C88194Yr) r3.A3m.get();
        C28521aN r11 = (C28521aN) r3.AA6.get();
        C76753oA r42 = new C76753oA(AnonymousClass10E.A12(r3), r6, (C57172ie) r4.A1Y.get(), r8, r9, r10, r11, r12, (C88124Yk) r3.A3n.get(), A4l, AnonymousClass3Ma.A0q(r3), A0z);
        listChatInfoActivity2.A0c = r42;
        AnonymousClass3MW.A1T(r42, listChatInfoActivity2.A05, 0);
    }

    public static void A11(ListChatInfoActivity listChatInfoActivity) {
        String A0K2;
        int i;
        int i2;
        if (AnonymousClass3MZ.A1X(listChatInfoActivity.A0I)) {
            A0K2 = listChatInfoActivity.getString(2131897362);
            i = 2130971673;
            i2 = 2131102765;
        } else {
            A0K2 = listChatInfoActivity.A0I.A0K();
            i = 2130971674;
            i2 = 2131102766;
        }
        int A002 = AnonymousClass3Ma.A00(listChatInfoActivity, i, i2);
        listChatInfoActivity.A0d.setTitleText(A0K2);
        GroupDetailsCard groupDetailsCard = listChatInfoActivity.A0e;
        C17960vV.A05(groupDetailsCard);
        groupDetailsCard.A06(A0K2, false);
        listChatInfoActivity.A0e.setTitleColor(A002);
        GroupDetailsCard groupDetailsCard2 = listChatInfoActivity.A0e;
        Resources resources = listChatInfoActivity.getResources();
        int size = AnonymousClass3MW.A10(listChatInfoActivity.A08.A06).size();
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, AnonymousClass3MW.A10(listChatInfoActivity.A08.A06).size(), 0);
        groupDetailsCard2.setSubtitleText(resources.getQuantityString(2131755027, size, A1a));
    }

    private void A12(boolean z) {
        String str;
        boolean z2;
        AnonymousClass1E7 r1 = this.A0J;
        if (r1 == null) {
            this.A05.A08(2131890877, 0);
            return;
        }
        C36451nu r3 = this.A0O;
        String A022 = AnonymousClass17K.A02(r1);
        if (r1.A0C()) {
            str = r1.A0L();
            z2 = true;
        } else {
            str = null;
            z2 = false;
        }
        try {
            startActivityForResult(C36451nu.A00(r3, A022, str, z, z2), 10);
            AnonymousClass3MW.A0m(this.A0S).A06(z, 9);
        } catch (ActivityNotFoundException unused) {
            AnonymousClass4Yv.A01(this, 4);
        }
    }

    public void A2y() {
        if (!this.A0f) {
            this.A0f = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r4 = A0K2.AAQ;
            C72483Me.A0q(r4, this);
            AnonymousClass10G r1 = r4.A00;
            AnonymousClass1FB.A0K(r4, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r4, r1, this, r1.A5A);
            C74803cp.A0v(A0K2, r4, this);
            C74803cp.A0w(r4, r1, this, r4.ABA);
            C74803cp.A0r(A0K2, r4, r1, this);
            this.A0L = AnonymousClass3MY.A0Z(r4);
            this.A0K = AnonymousClass3MZ.A0t(r4);
            this.A0X = AnonymousClass3MX.A0z(r4);
            this.A0D = AnonymousClass3MZ.A0i(r4);
            this.A0G = (AnonymousClass1NI) r4.A4i.get();
            this.A0F = AnonymousClass10E.A6Q(r4);
            this.A0A = AnonymousClass3MZ.A0g(r4);
            this.A09 = AnonymousClass3Ma.A0S(r4);
            this.A0B = AnonymousClass3MZ.A0h(r4);
            this.A0P = (C36741oO) r1.A1L.get();
            this.A0H = AnonymousClass3MZ.A0o(r4);
            C19890zB r2 = C19890zB.A00;
            this.A03 = r2;
            this.A0S = C000200d.A00(r4.A0F);
            this.A0O = (C36451nu) r4.A0G.get();
            this.A0T = C000200d.A00(r4.A2A);
            this.A0E = (AnonymousClass12E) r4.A2k.get();
            this.A0U = C000200d.A00(r1.A1c);
            this.A0M = AnonymousClass3Ma.A0r(r4);
            this.A04 = (C84244Is) A0K2.A1R.get();
            this.A0W = C000200d.A00(r4.A4u);
            this.A0Y = C000200d.A00(r1.A3t);
            this.A0V = C000200d.A00(r1.A1h);
            this.A02 = r2;
            this.A05 = (C84254It) A0K2.A4X.get();
            this.A0N = (AnonymousClass4S6) r1.AI8.get();
            this.A06 = AnonymousClass3MZ.A0T(r1);
        }
    }

    public C47712Jo A4l() {
        Class<C47712Jo> cls = C47712Jo.class;
        Jid A062 = this.A0I.A06(cls);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("jid is not broadcast jid: ");
        C17960vV.A08(A062, C17890vO.A0V(this.A0I.A06(cls), A10));
        return (C47712Jo) A062;
    }

    public void finishAfterTransition() {
        if (AnonymousClass745.A00) {
            this.A0Z.setTransitionName((String) null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A0Z);
            transitionSet.addTransition(slide);
            C74803cp.A0d(this, new Slide(80), transitionSet, this.A0a);
        }
        super.finishAfterTransition();
    }

    public void A4e() {
        super.A4e();
        C76753oA r1 = this.A0c;
        if (r1 != null) {
            r1.A0B(true);
            this.A0c = null;
        }
    }

    public void A4g(long j) {
        super.A4g(j);
        findViewById(2131427547).setVisibility(C72453Mb.A02((j > 0 ? 1 : (j == 0 ? 0 : -1))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r4.isEmpty() != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4k(java.util.List r4) {
        /*
            r3 = this;
            super.A4k(r4)
            r0 = 2131431363(0x7f0b0fc3, float:1.8484453E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x0016
            boolean r1 = r4.isEmpty()
            r0 = 8
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.setVisibility(r0)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ListChatInfoActivity.A4k(java.util.List):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 10:
            case 11:
                this.A0E.A0D((Integer) null);
                C72453Mb.A1O(this.A0S);
                return;
            case 12:
                if (i2 == -1) {
                    this.A05.CGF(new AnonymousClass7RL(this, C22971Dz.A0A(UserJid.class, intent.getStringArrayListExtra("contacts")), 25));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Intent intent;
        AnonymousClass1E7 r3 = ((C85474Nn) ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag()).A03;
        this.A0J = r3;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                Intent A062 = AnonymousClass3MY.A06(this, this.A0L, r3.A0J);
                A062.putExtra("entry_point_conversion_source", "broadcast_list_context_menu");
                A062.putExtra("entry_point_conversion_app", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME);
                this.A01.A09(this, A062);
                return true;
            } else if (itemId == 2) {
                A12(true);
                return true;
            } else if (itemId == 3) {
                A12(false);
                return true;
            } else if (itemId == 5) {
                AnonymousClass4Yv.A01(this, 6);
                return true;
            } else if (itemId != 6) {
                return false;
            } else {
                intent = AnonymousClass1LU.A1B(this, AnonymousClass3MZ.A0x(this.A0J));
            }
        } else if (r3.A0H == null) {
            return true;
        } else {
            intent = this.A0L.A1v(this, r3, 7);
        }
        startActivity(intent);
        return true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AnonymousClass1E7 r5 = ((C85474Nn) ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView.getTag()).A03;
        if (r5 != null) {
            String A0q = AnonymousClass3MY.A0q(this.A0A, r5);
            contextMenu.add(0, 1, 0, C43251zV.A05(this, this.A0D, C17880vN.A0q(this, A0q, new Object[1], 0, 2131892049)));
            if (r5.A0H == null) {
                contextMenu.add(0, 2, 0, 2131898687);
                contextMenu.add(0, 3, 0, 2131886477);
            } else {
                contextMenu.add(0, 0, 0, C43251zV.A05(this, this.A0D, C17890vO.A0R(this, A0q, 1, 0, 2131897877)));
            }
            if (AnonymousClass3MW.A10(this.A08.A06).size() > 2) {
                contextMenu.add(0, 5, 0, C43251zV.A05(this, this.A0D, C17890vO.A0R(this, A0q, 1, 0, 2131895120)));
            }
            contextMenu.add(0, 6, 0, 2131899571);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0C.A02();
        this.A09.unregisterObserver(this.A0h);
        this.A0H.unregisterObserver(this.A0j);
        C17880vN.A0V(this.A0T).unregisterObserver(this.A0i);
        C17880vN.A0V(this.A0W).unregisterObserver(this.A0k);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId != 2) {
                if (itemId == 3) {
                    AnonymousClass4Yv.A01(this, 3);
                    return true;
                } else if (itemId != 16908332) {
                    return super.onOptionsItemSelected(menuItem);
                } else {
                    AnonymousClass4FQ.A00(this);
                }
            }
            return true;
        }
        A0y(this);
        return true;
    }

    public void onResume() {
        super.onResume();
        this.A05.CGF(new AnonymousClass7RL(this, A4l(), 26));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass1E7 r0 = this.A0J;
        if (r0 != null) {
            bundle.putString("selected_jid", C22971Dz.A06(r0.A0J));
        }
    }

    public ListChatInfoActivity(int i) {
        this.A0f = false;
        C90994ey.A00(this, 37);
    }
}
