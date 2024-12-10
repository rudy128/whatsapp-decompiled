package com.whatsapp.conversation.conversationrow.album;

import X.A87;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1DD;
import X.AnonymousClass1E7;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1KW;
import X.AnonymousClass1W6;
import X.AnonymousClass1WR;
import X.AnonymousClass206;
import X.AnonymousClass247;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3SL;
import X.AnonymousClass3uU;
import X.AnonymousClass4FQ;
import X.AnonymousClass4PX;
import X.AnonymousClass4S9;
import X.AnonymousClass4UI;
import X.AnonymousClass4Yv;
import X.AnonymousClass4Z9;
import X.AnonymousClass4aU;
import X.AnonymousClass5ZZ;
import X.AnonymousClass727;
import X.AnonymousClass745;
import X.C000200d;
import X.C003401n;
import X.C106765Xc;
import X.C107055Yf;
import X.C107265Za;
import X.C108445bi;
import X.C108675c7;
import X.C108875cR;
import X.C111315jW;
import X.C1193267r;
import X.C17880vN;
import X.C17960vV;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C19740yt;
import X.C19880zA;
import X.C19890zB;
import X.C222219b;
import X.C22931Dv;
import X.C22971Dz;
import X.C23581Gv;
import X.C24494C6m;
import X.C24671Lf;
import X.C25161Nd;
import X.C25221Nj;
import X.C25931Qe;
import X.C26144Ct7;
import X.C28281Zt;
import X.C28741ap;
import X.C34531kd;
import X.C37891qK;
import X.C436420i;
import X.C49852Se;
import X.C51852Zw;
import X.C57662jR;
import X.C64052u8;
import X.C692236j;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C72653Mz;
import X.C73043Ot;
import X.C74873d3;
import X.C79573vg;
import X.C87564Wb;
import X.C90664eR;
import X.C90754ea;
import X.C91004ez;
import X.C91124fB;
import X.C91344fX;
import X.C91624fz;
import X.C94164k9;
import X.C94604kt;
import X.C95134lk;
import X.C95154lm;
import X.C95414mC;
import X.C95504mL;
import X.C96124nL;
import X.C96314ne;
import X.C98784ri;
import X.C98814rl;
import X.E8R;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.selection.ui.MessageSelectionBottomMenu;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MediaAlbumActivity extends AnonymousClass3uU implements C108875cR, E8R, C107055Yf {
    public Bundle A00;
    public View A01;
    public ListView A02;
    public Toolbar A03;
    public C19880zA A04;
    public AnonymousClass4PX A05;
    public C34531kd A06;
    public AnonymousClass247 A07;
    public C24671Lf A08;
    public MessageSelectionViewModel A09;
    public C73043Ot A0A;
    public C72653Mz A0B;
    public C91124fB A0C;
    public MessageSelectionBottomMenu A0D;
    public C74873d3 A0E;
    public C1193267r A0F;
    public AnonymousClass4UI A0G;
    public C25931Qe A0H;
    public AnonymousClass1BI A0I;
    public AnonymousClass1BI A0J;
    public C18010vc A0K;
    public AnonymousClass1DC A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public boolean A0Y;
    public final C106765Xc A0Z;
    public final HashSet A0a;
    public final HashSet A0b;
    public final C23581Gv A0c;
    public final C28741ap A0d;
    public final AnonymousClass1WR A0e;
    public final C25221Nj A0f;

    public MediaAlbumActivity() {
        this(0);
        this.A0a = C17880vN.A12();
        this.A0b = C17880vN.A12();
        this.A0e = new C95504mL(this, 6);
        this.A0c = new C94164k9(this, 15);
        this.A0d = new C95414mC(this, 9);
        this.A0f = new C96314ne(this, 14);
        this.A0Z = new C95154lm(this, 0);
    }

    public static void A10(MediaAlbumActivity mediaAlbumActivity) {
        MediaAlbumActivity mediaAlbumActivity2 = mediaAlbumActivity;
        List list = mediaAlbumActivity.A0A.A00;
        if (list != null && !list.isEmpty()) {
            Iterator it = mediaAlbumActivity.A0A.A00.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = C17880vN.A0Y(it).A0u;
                if (i3 == 1) {
                    i++;
                } else if (i3 == 3) {
                    i2++;
                }
            }
            AnonymousClass206 A0k = AnonymousClass3MW.A0k(mediaAlbumActivity.A0A.A00, 0);
            String A002 = C49852Se.A00(mediaAlbumActivity2, mediaAlbumActivity.A00, (long) i, (long) i2);
            long j = A0k.A0I;
            if (A87.A00(C17880vN.A0h(), System.currentTimeMillis(), j) != 0) {
                StringBuilder A11 = AnonymousClass000.A11(A002);
                A11.append("  ");
                C17880vN.A1A(mediaAlbumActivity2, A11, 2131898822);
                A11.append("  ");
                A002 = AnonymousClass000.A0y(C64052u8.A0B(mediaAlbumActivity2.A00, A0k.A0I), A11);
            }
            AnonymousClass3MY.A0J(mediaAlbumActivity2).A0R(A002);
        }
    }

    public int A31() {
        return 78318969;
    }

    public C24494C6m BqU(Bundle bundle) {
        AnonymousClass1W6 fMessageDatabase = getFMessageDatabase();
        C25931Qe r5 = this.A0H;
        long[] longArrayExtra = getIntent().getLongArrayExtra("message_ids");
        C17960vV.A07(longArrayExtra);
        return new C111315jW(this, r5, fMessageDatabase, longArrayExtra, getIntent().getLongExtra("album_message_id", 0));
    }

    public void Bx8() {
    }

    public AnonymousClass1F9 getLifecycleOwner() {
        return this;
    }

    public void onStart() {
        super.onStart();
        C18030ve r7 = this.A0E;
        AnonymousClass1KW r6 = this.A0D;
        this.A0C = new C79573vg((AnonymousClass1FY) this, (AnonymousClass5ZZ) this.A05.A00(this), (C107265Za) new C95134lk(), (C87564Wb) this.A0R.get(), this.A00, r6, r7, (Object) this, 1);
    }

    public static int A0y(MediaAlbumActivity mediaAlbumActivity) {
        if (C18020vd.A05(C18040vf.A02, mediaAlbumActivity.A0E, 6650)) {
            Rect A072 = AnonymousClass3MW.A07();
            AnonymousClass3MZ.A0F(mediaAlbumActivity).getWindowVisibleDisplayFrame(A072);
            return A072.top;
        }
        int identifier = mediaAlbumActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return AnonymousClass3MZ.A01(mediaAlbumActivity, identifier);
        }
        return 0;
    }

    public void A2y() {
        if (!this.A0Y) {
            this.A0Y = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r3 = A0K2.AAQ;
            C72483Me.A0q(r3, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass1FB.A0K(r3, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r3, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0K2.A63);
            this.A0Q = C000200d.A00(r3.AVb);
            this.A0X = C000200d.A00(r3.AmD);
            this.A06 = AnonymousClass3MZ.A0R(r3);
            this.A0F = AnonymousClass3MZ.A0t(r3);
            this.A0L = AnonymousClass3MZ.A13(r3);
            this.A0S = C000200d.A00(r3.A7C);
            this.A08 = AnonymousClass3Ma.A0S(r3);
            this.A0N = C000200d.A00(r3.A2A);
            this.A0V = C000200d.A00(r1.A4a);
            this.A0W = C000200d.A00(r1.A4e);
            this.A0K = AnonymousClass3Ma.A0r(r3);
            this.A0H = (C25931Qe) r3.A3z.get();
            this.A0P = C000200d.A00(r3.A4u);
            this.A0T = C000200d.A00(r3.Aau);
            this.A0U = C000200d.A00(r3.A2r);
            this.A0R = C000200d.A00(A0K2.A4c);
            this.A0M = C000200d.A00(r1.A5j);
            this.A04 = C19890zB.A00;
            this.A05 = (AnonymousClass4PX) A0K2.A2K.get();
            this.A0O = C000200d.A00(r1.A1h);
        }
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public /* bridge */ /* synthetic */ void BhI(Object obj) {
        this.A05.A00(this).BKp(1, Collections.singleton(obj));
    }

    public /* bridge */ /* synthetic */ void Bx0(Object obj) {
        Object obj2;
        Pair pair = (Pair) obj;
        if (pair == null || ((obj2 = pair.first) != null && ((List) obj2).isEmpty())) {
            finish();
            return;
        }
        this.A0A.A00((List) pair.first);
        this.A07 = (AnonymousClass247) pair.second;
        A10(this);
        C90664eR.A00(getListView().getViewTreeObserver(), this, 2);
    }

    public void C4z() {
        Log.i("MediaAlbumActivity/starred/onSelectionRequested");
        this.A09.A0U(C72453Mb.A03(C18020vd.A05(C18040vf.A01, ((AnonymousClass1DD) this.A0L).A02, 2889) ? 1 : 0));
    }

    public C108675c7 getConversationRowCustomizer() {
        return this.A00.A0M.A01;
    }

    public void onCreate(Bundle bundle) {
        int length;
        if (AnonymousClass745.A00) {
            getWindow().requestFeature(12);
            getWindow().requestFeature(13);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(220);
            autoTransition.setInterpolator(new AccelerateDecelerateInterpolator());
            getWindow().setSharedElementEnterTransition(autoTransition);
        }
        this.A00 = bundle;
        super.onCreate(bundle);
        A2Y();
        setContentView(2131625948);
        this.A03 = AnonymousClass3Ma.A0G(this);
        this.A01 = findViewById(2131434738);
        C003401n A0S2 = C72463Mc.A0S(this, this.A03);
        A0S2.A0W(true);
        this.A08.registerObserver(this.A0c);
        this.A00.A0W.registerObserver(this.A0e);
        C17880vN.A0V(this.A0N).registerObserver(this.A0d);
        C17880vN.A0V(this.A0P).registerObserver(this.A0f);
        AnonymousClass3MZ.A0F(this).setSystemUiVisibility(1792);
        C28281Zt.A05(this, AnonymousClass4Z9.A01(this, false));
        getWindow().addFlags(134217728);
        String stringExtra = getIntent().getStringExtra("chat_jid");
        C22931Dv r1 = AnonymousClass1BI.A00;
        this.A0I = r1.A02(stringExtra);
        AnonymousClass1BI A022 = r1.A02(C72453Mb.A0u(this));
        this.A0J = A022;
        if (A022 == null) {
            A0S2.A0M(2131898595);
        } else {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 6650)) {
                C98814rl.A00(this.A05, this, A0S2, 49);
            } else {
                C94604kt r0 = this.A00;
                A0S2.A0S(AnonymousClass3MY.A0p(r0.A09, r0.A0C, this.A0J));
            }
        }
        this.A0A = new C73043Ot(this);
        ListView listView = getListView();
        this.A02 = listView;
        listView.setFastScrollEnabled(false);
        this.A02.setScrollbarFadingEnabled(true);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setPadding(0, 0, 0, getResources().getDimensionPixelSize(2131165285));
        this.A02.addHeaderView(frameLayout, (Object) null, false);
        FrameLayout frameLayout2 = new FrameLayout(this);
        this.A02.addFooterView(frameLayout2, (Object) null, false);
        View findViewById = findViewById(2131436218);
        AnonymousClass1HF.A0g(this.A02, new C91344fX(frameLayout, frameLayout2, findViewById, this));
        C72653Mz r02 = new C72653Mz(AnonymousClass3MZ.A00(this));
        this.A0B = r02;
        A0S2.A0N(r02);
        int A002 = AnonymousClass3MZ.A00(this);
        int A003 = AnonymousClass3MZ.A00(this);
        this.A02.setOnScrollListener(new C90754ea(frameLayout, this, C19740yt.A00(this, 2131101852), A003, A002));
        A4b(this.A0A);
        View findViewById2 = findViewById(2131428018);
        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = new VerticalSwipeDismissBehavior(this);
        verticalSwipeDismissBehavior.A04 = new C96124nL(findViewById2, findViewById, this);
        ((C37891qK) this.A02.getLayoutParams()).A00(verticalSwipeDismissBehavior);
        MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) AnonymousClass3MW.A0N(this).A00(MessageSelectionViewModel.class);
        this.A09 = messageSelectionViewModel;
        C91624fz.A00(this, messageSelectionViewModel.A01, 42);
        long[] longArrayExtra = getIntent().getLongArrayExtra("message_ids");
        if (longArrayExtra == null || (length = longArrayExtra.length) == 0) {
            finish();
            return;
        }
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, length, 0);
        A0S2.A0R(this.A00.A0K(objArr, 2131755287, (long) length));
        C26144Ct7.A00(this).A03(this);
        A39(this.A00, this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (((X.C136906ub) r7.A0Q.get()).A01(r2, false) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A0z(com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r7) {
        /*
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.3Ot r0 = r7.A0A
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0054
            java.util.Iterator r6 = r0.iterator()
        L_0x000e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0054
            X.206 r4 = X.C17880vN.A0Y(r6)
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x000e
            r3 = r4
            X.21V r3 = (X.AnonymousClass21V) r3
            X.C17960vV.A07(r3)
            X.2rc r2 = r3.A02
            boolean r0 = X.AnonymousClass25A.A12(r3)
            if (r0 != 0) goto L_0x000e
            boolean r0 = r4 instanceof X.C438421d
            if (r0 == 0) goto L_0x0040
            X.00H r0 = r7.A0Q
            java.lang.Object r1 = r0.get()
            X.6ub r1 = (X.C136906ub) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            boolean r0 = r1.A01(r2, r0)
            if (r0 != 0) goto L_0x0050
        L_0x0040:
            X.00H r0 = r7.A0X
            java.lang.Object r1 = r0.get()
            X.6yx r1 = (X.C139506yx) r1
            X.0ve r0 = r7.A0E
            boolean r0 = X.C63652tT.A00(r0, r1, r4)
            if (r0 == 0) goto L_0x000e
        L_0x0050:
            r5.add(r3)
            goto L_0x000e
        L_0x0054:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A0z(com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity):java.util.ArrayList");
    }

    public static void A11(MediaAlbumActivity mediaAlbumActivity, AnonymousClass1E7 r5, AnonymousClass1BI r6, AnonymousClass206 r7) {
        if ((!r5.A0F() || mediaAlbumActivity.A00.A0U.A0J((GroupJid) r6)) && !mediaAlbumActivity.A00.A0u.A01(r5, r6)) {
            Intent A0A2 = C17880vN.A0A();
            A0A2.setClassName(mediaAlbumActivity.getPackageName(), "com.whatsapp.status.playback.MessageReplyActivity");
            A0A2.putExtra("isMediaViewReply", false);
            A0A2.setFlags(65536);
            mediaAlbumActivity.startActivity(AnonymousClass4aU.A00(A0A2, r7.A0v));
            return;
        }
        C17960vV.A0G(!(r7 instanceof C436420i), "should not reply to systemMessage");
        AnonymousClass1BI A0H2 = r7.A0H();
        C17960vV.A07(A0H2);
        ((C51852Zw) mediaAlbumActivity.A0U.get()).A00.put(A0H2, r7);
        new Object();
        Intent A0A3 = C72473Md.A0A(mediaAlbumActivity, A0H2, 0);
        A0A3.putExtra("extra_quoted_message_row_id", r7.A0F);
        mediaAlbumActivity.A01.A09(mediaAlbumActivity, A0A3);
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public void C2U(int i) {
        AnonymousClass4UI r1;
        super.C2U(i);
        if (i == 0 && (r1 = this.A0G) != null) {
            r1.A00(false);
        }
    }

    public void finishAfterTransition() {
        if (getIntent().hasExtra("start_index")) {
            A2j(new AnonymousClass3SL(this));
        }
        super.finishAfterTransition();
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.1LU, java.lang.Object] */
    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        C108445bi r0;
        super.onActivityResult(i, i2, intent);
        if (i != 2) {
            if (i == 906) {
                AnonymousClass4S9 r3 = (AnonymousClass4S9) this.A09.A00.A06();
                if (r3 != null && !r3.A03.isEmpty()) {
                    if (i2 == 2) {
                        AnonymousClass4Yv.A01(this, 106);
                    } else if (i2 == 3 && intent != null && (intExtra = intent.getIntExtra("RESULT_EXTRA_ACTION_ID", -1)) != -1 && this.A05.A00(this).BKp(intExtra, r3.A00()) && (r0 = (C108445bi) AnonymousClass000.A0w(AnonymousClass3MW.A12(((C87564Wb) this.A0R.get()).A00), intExtra)) != null && !r0.BRj()) {
                        return;
                    }
                }
                this.A09.A0T();
            }
        } else if (i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C19880zA r1 = this.A04;
                if (r1.A07()) {
                    r1.A03();
                    getForwardMessages();
                    throw AnonymousClass000.A0s("handleAdvertiseForwardClick");
                }
            } else {
                ArrayList A062 = this.A00.A06();
                if (!A062.isEmpty()) {
                    ArrayList A0r = C72463Mc.A0r(intent, AnonymousClass1BI.class);
                    boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                    String stringExtra = intent.getStringExtra("appended_message");
                    C692236j r6 = new C692236j();
                    if (C22971Dz.A01(A0r) != null) {
                        C17960vV.A07(intent);
                        Bundle extras = intent.getExtras();
                        C17960vV.A07(extras);
                        r6.A00(((AnonymousClass727) this.A0W.get()).A02(extras));
                    }
                    this.A00.A06.A0N(this.A06, r6, stringExtra, C25161Nd.A00(A062), A0r, booleanExtra);
                    if (A0r.size() != 1 || C22971Dz.A0a((Jid) A0r.get(0))) {
                        CPW(A0r, 1);
                    } else {
                        AnonymousClass1BI r2 = (AnonymousClass1BI) A0r.get(0);
                        if (r2 != null) {
                            this.A01.A09(this, AnonymousClass3MY.A06(this, new Object(), r2));
                        }
                    }
                } else {
                    Log.w("MediaAlbumActivity/forward/failed");
                    this.A05.A08(2131892058, 0);
                }
            }
            BLL();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        int size = A0z(this).size();
        if (size > 0) {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 4048)) {
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, size, 0);
                menu.add(0, 0, 0, getString(2131889564, objArr));
                return true;
            }
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A08.unregisterObserver(this.A0c);
        this.A00.A0W.unregisterObserver(this.A0e);
        C17880vN.A0V(this.A0N).unregisterObserver(this.A0d);
        C17880vN.A0V(this.A0P).unregisterObserver(this.A0f);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String obj;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 16908332) {
                AnonymousClass4FQ.A00(this);
            }
            return true;
        }
        C18030ve r2 = this.A0E;
        C18070vi.A0d(r2, 0);
        if (C18020vd.A05(C18040vf.A02, r2, 12555)) {
            AnonymousClass247 r0 = this.A07;
            if (r0 != null) {
                obj = r0.A0v.A01;
            } else {
                obj = toString();
            }
            this.A05.CGL(new C98784ri((Object) this, 43), AnonymousClass001.A1H("media-album-activity-", obj, AnonymousClass000.A10()));
            return true;
        }
        ((C57662jR) this.A0M.get()).A00(this, A0z(this), true);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ListView listView = getListView();
        bundle.putInt("top_index", listView.getFirstVisiblePosition());
        int i = 0;
        View childAt = listView.getChildAt(0);
        if (childAt != null) {
            i = childAt.getTop() - listView.getPaddingTop();
        }
        bundle.putInt("top_offset", i);
    }

    public MediaAlbumActivity(int i) {
        this.A0Y = false;
        C91004ez.A00(this, 28);
    }
}
