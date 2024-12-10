package com.whatsapp;

import X.AEF;
import X.AnonymousClass000;
import X.AnonymousClass00E;
import X.AnonymousClass00R;
import X.AnonymousClass02B;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass17U;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DD;
import X.AnonymousClass1E7;
import X.AnonymousClass1F9;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3M7;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3T0;
import X.AnonymousClass3TA;
import X.AnonymousClass3VQ;
import X.AnonymousClass4DX;
import X.AnonymousClass4QM;
import X.AnonymousClass4RK;
import X.AnonymousClass4YG;
import X.AnonymousClass4aY;
import X.AnonymousClass5X8;
import X.AnonymousClass737;
import X.AnonymousClass74M;
import X.AnonymousClass74O;
import X.AnonymousClass77J;
import X.AnonymousClass7FJ;
import X.AnonymousClass8B4;
import X.AnonymousClass8F7;
import X.C000400h;
import X.C006602x;
import X.C106675Wt;
import X.C106795Xf;
import X.C108185bH;
import X.C108605by;
import X.C108615c0;
import X.C108645c3;
import X.C108675c7;
import X.C108865cQ;
import X.C131296kr;
import X.C178119Bw;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18180vt;
import X.C195309t8;
import X.C19620yd;
import X.C20005A2v;
import X.C20285AEt;
import X.C21470Akb;
import X.C218617r;
import X.C222219b;
import X.C22971Dz;
import X.C23191Fb;
import X.C23241Fg;
import X.C23291Fl;
import X.C23341Fq;
import X.C23391Fw;
import X.C23401Fx;
import X.C23581Gv;
import X.C24671Lf;
import X.C24681Lg;
import X.C27081DTg;
import X.C29831cw;
import X.C33251iW;
import X.C37451pZ;
import X.C441822l;
import X.C54242dp;
import X.C59822mw;
import X.C61762qD;
import X.C62762rw;
import X.C72453Mb;
import X.C78833ti;
import X.C79443vR;
import X.C85884Pc;
import X.C86414Rn;
import X.C86634Sk;
import X.C87064Ud;
import X.C87464Vr;
import X.C89334cI;
import X.C90594eK;
import X.C90604eL;
import X.C94164k9;
import X.C95544mP;
import X.C95554mQ;
import X.C95574mS;
import X.C98834rn;
import android.app.Dialog;
import android.app.assist.AssistContent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.android.di.BaseEntryPoint;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conversation extends C78833ti implements C108865cQ, C23291Fl, C23191Fb, C23341Fq, C23241Fg, AnonymousClass8B4, C106675Wt, AnonymousClass5X8 {
    public C131296kr A00;
    public C85884Pc A01;
    public C24671Lf A02;
    public AnonymousClass4aY A03;
    public C79443vR A04;
    public C29831cw A05;
    public AnonymousClass1CJ A06;
    public C24681Lg A07;
    public AnonymousClass7FJ A08;
    public BaseEntryPoint A09;
    public final List A0A = AnonymousClass000.A13();
    public final C23581Gv A0B = new C94164k9(this, 0);

    public /* synthetic */ void BCn() {
    }

    public boolean Be3() {
        return true;
    }

    public void By8(ArrayList arrayList) {
    }

    public void CE4(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.A05.A01(this, broadcastReceiver, intentFilter, true);
    }

    public void onCreate(Bundle bundle) {
        this.A07 = false;
        Log.i("Conversation/creating delegate");
        Log.i("Conversation/created delegate factory");
        this.A03 = ((C006602x) C000400h.A00(C006602x.class, this)).AHq();
        Log.i("Conversation/created delegate");
        this.A03.A2Q = this;
        List list = this.A0A;
        if (list == null || 0 >= list.size()) {
            this.A03.A2l(bundle);
            this.A04 = this.A01.A00(this.A03);
            C24681Lg r1 = this.A07;
            AnonymousClass7FJ r0 = this.A08;
            if (r0 == null) {
                r0 = this.A00.A00(this, this);
                this.A08 = r0;
            }
            r1.registerObserver(r0);
            this.A02.registerObserver(this.A0B);
            if (!this.A06.A00) {
                View findViewById = findViewById(16908290);
                if (findViewById == null) {
                    Log.i("Conversation/keepSplashscreen/no root, cannot keep splashscreen");
                }
                C90604eL r3 = new C90604eL(0);
                findViewById.getViewTreeObserver().addOnPreDrawListener(r3);
                this.A05.CGN(new C27081DTg(r3, this, findViewById, 41));
                return;
            }
            return;
        }
        list.get(0);
        throw AnonymousClass000.A0s("onCreate");
    }

    public C222219b A33() {
        BaseEntryPoint baseEntryPoint = this.A09;
        if (!(baseEntryPoint == null || baseEntryPoint.BAL() == null)) {
            this.A09.BAL().A0N(5233);
        }
        C222219b A33 = super.A33();
        A33.A02 = true;
        A33.A04 = true;
        return A33;
    }

    public void A35() {
        this.A03.A2Y();
    }

    public boolean A3G() {
        return C18020vd.A05(C18040vf.A02, this.A0E, 10359);
    }

    public void A3H() {
        this.A03.A2T();
    }

    public void A3I() {
        this.A03.A2U();
        super.A3I();
    }

    public void A3J() {
        AnonymousClass4aY r1 = this.A03;
        Resources.Theme theme = getTheme();
        AnonymousClass1BI r12 = r1.A3R;
        if (!((C108605by) r1.A5F.get()).CB2(theme, r12, C22971Dz.A0S(r12))) {
            super.A3J();
        }
    }

    public void A3K() {
        this.A03.A2R();
    }

    public void A3h(int i) {
        AnonymousClass4aY r1 = this.A03;
        AnonymousClass3T0 r0 = r1.A1X;
        if (r0 != null) {
            r0.A00.A00();
        }
        AnonymousClass8F7 r02 = r1.A1c;
        if (r02 != null) {
            r02.A0V();
        }
    }

    public void BBc(AnonymousClass1E7 r2) {
        this.A03.A2t(r2);
    }

    public void BBl() {
        this.A03.A2L();
    }

    public void BBm(AnonymousClass1E7 r3, AnonymousClass1BI r4) {
        AnonymousClass4aY.A1T(this.A03, r3, r4, false);
    }

    public void BCm() {
        this.A03.A2B.A0Q = true;
    }

    public boolean BFo(AnonymousClass206 r2, boolean z, boolean z2) {
        return this.A03.A3O(r2, z, z2);
    }

    public void BIf() {
        ConversationListView conversationListView = this.A03.A2B;
        if (conversationListView.A0M) {
            conversationListView.A0M = false;
            conversationListView.setTranscriptMode(0);
        }
    }

    public void BIi(AnonymousClass205 r2) {
        this.A00.A0G.A02(r2);
    }

    public String BSb() {
        return "conversation_activity";
    }

    public C18180vt BYS() {
        return C19620yd.A01;
    }

    public C90594eK BZQ(int i, int i2, boolean z) {
        return this.A03.A2J(getString(i), i2, z);
    }

    public void BcU(AnonymousClass1E7 r2, boolean z) {
        this.A03.A2w(r2, z);
    }

    public boolean Bci() {
        return AnonymousClass000.A1R(AnonymousClass3MX.A0c(this.A03).getCount());
    }

    public boolean Bcj() {
        return this.A03.A6g;
    }

    public boolean Bct() {
        return this.A03.A3G();
    }

    public void BdQ(AnonymousClass206 r9, AnonymousClass205 r10, AnonymousClass4QM r11, String str, String str2, Bitmap[] bitmapArr, int i) {
        this.A03.A34(r9, r10, r11, str, str2, bitmapArr, i);
    }

    public boolean Bg7() {
        return this.A03.A3H();
    }

    public boolean BgA() {
        AnonymousClass74M r0 = this.A03.A4h;
        if (r0 == null || !r0.A0b()) {
            return false;
        }
        return true;
    }

    public boolean Bgb() {
        return this.A03.A35.A0j;
    }

    public void BhD(C178119Bw r2) {
        this.A03.A3C(r2);
    }

    public /* bridge */ /* synthetic */ void BhI(Object obj) {
        this.A04.BKp(1, Collections.singleton(obj));
    }

    public void BjO() {
        this.A03.A2S();
    }

    public void BjP(int i) {
        AnonymousClass4aY r4 = this.A03;
        r4.A4c.CGF(new C21470Akb((Object) r4, i, 43, (Object) r4.A3R));
    }

    public void BjQ() {
        ((C108615c0) this.A03.A4q.get()).BjQ();
    }

    public void Bje(boolean z, boolean z2) {
        AnonymousClass4aY r2 = this.A03;
        C87464Vr.A01(r2, new C95574mS(r2, z, z2), AnonymousClass00R.A18);
    }

    public void Bjf() {
        AnonymousClass4aY r2 = this.A03;
        C87464Vr.A01(r2, new C95544mP(r2, 13), AnonymousClass00R.A15);
    }

    public void Bjg() {
        AnonymousClass4aY r2 = this.A03;
        C87464Vr.A01(r2, new C95544mP(r2, 12), AnonymousClass00R.A06);
    }

    public void Bjh() {
        AnonymousClass4aY r2 = this.A03;
        C87464Vr.A01(r2, new C95544mP(r2, 9), AnonymousClass00R.A19);
    }

    public void Bji(String str) {
        AnonymousClass4aY r2 = this.A03;
        C87464Vr.A01(r2, new C95554mQ(r2, str), AnonymousClass00R.A0B);
    }

    public void Bl8(UserJid userJid, boolean z) {
        AnonymousClass4aY.A1X(this.A03, userJid, false, z);
    }

    public void Bln() {
        AnonymousClass4aY r2 = this.A03;
        r2.A2x(r2.A35, false, false, false);
    }

    public void Bpu(AnonymousClass1BI r2, int i) {
        this.A03.A2y(r2, i);
    }

    public void BqL(C54242dp r2, AnonymousClass206 r3, int i) {
        this.A03.A2r(r2, r3, i);
    }

    public void BqM(C87064Ud r2) {
        this.A03.A2q(r2);
    }

    public void BqW(UserJid userJid, boolean z) {
        AnonymousClass4aY.A1X(this.A03, userJid, true, z);
    }

    public void Bqx() {
        this.A03.A2W();
    }

    public void BsX(AnonymousClass737 r3) {
        this.A03.A7e.BsW(r3.A00);
    }

    public void BuB(UserJid userJid, int i) {
        AnonymousClass3TA r2 = this.A03.A2d;
        AnonymousClass3TA.A03(r2.A00, r2, AnonymousClass4DX.LOADING_FAILED);
    }

    public void BuC(UserJid userJid, boolean z, boolean z2) {
        this.A03.A2z(userJid);
    }

    public void BvB() {
    }

    public void BvC() {
        AnonymousClass4aY r2 = this.A03;
        C98834rn.A01(AnonymousClass3MX.A0w(r2), r2, 24);
    }

    public void BvF(AnonymousClass77J r3) {
        AnonymousClass4aY r1 = this.A03;
        if (!r1.A2Q.getWaPermissionsHelper().A0D()) {
            r1.A3N = r3;
            AnonymousClass74O.A07(AnonymousClass3MW.A0P(r1), 811);
            return;
        }
        AnonymousClass4aY.A1V(r1, r3);
    }

    public void C0a(PickerSearchDialogFragment pickerSearchDialogFragment) {
        AnonymousClass4aY r1 = this.A03;
        r1.A3v.A02(pickerSearchDialogFragment);
        if (r1.A3G()) {
            AnonymousClass74M r12 = r1.A4h;
            C17960vV.A07(r12);
            r12.A0U((File) null, (File) null);
        }
    }

    public void C2j() {
        this.A03.A24.A0C();
    }

    public void C4z() {
        AnonymousClass4aY r3 = this.A03;
        r3.A2J.A0U(C72453Mb.A03(C18020vd.A05(C18040vf.A01, ((AnonymousClass1DD) r3.A4L).A02, 2889) ? 1 : 0));
    }

    public void C8O() {
        this.A03.A24.A0B();
    }

    public void C9u() {
        AnonymousClass4aY r3 = this.A03;
        r3.A2x(r3.A35, true, false, false);
    }

    public void CAz(C106795Xf r2, C20285AEt aEt) {
        this.A03.A2p(r2, aEt);
    }

    public void CBt(String str) {
        if (str.equals(String.valueOf(14))) {
            AnonymousClass4aY r2 = this.A03;
            C98834rn.A01(r2.A4c, r2, 30);
        }
    }

    public void CCR(AnonymousClass1E7 r2, boolean z, boolean z2, boolean z3) {
        this.A03.A2x(r2, z, z2, z3);
    }

    public void CDo() {
        AnonymousClass4aY.A1E(this.A03);
    }

    public void CFM() {
        AnonymousClass3VQ r0 = this.A03.A2b;
        AnonymousClass3VQ.A07(r0);
        AnonymousClass3VQ.A06(r0);
    }

    public void CFj() {
        AnonymousClass4aY r2 = this.A03;
        r2.A2b.A0b((AnonymousClass206) null);
        AnonymousClass4aY.A0d(r2);
    }

    public void CFp(C441822l r7, long j) {
        AnonymousClass4aY r5 = this.A03;
        if (r5.A08 == r7.A0x) {
            r5.A2B.removeCallbacks(r5.A6O);
            r5.A2B.postDelayed(r5.A6O, j);
        }
    }

    public void CH3(AnonymousClass206 r2) {
        this.A03.A32(r2);
    }

    public void CH4(ViewGroup viewGroup, AnonymousClass206 r3, AnonymousClass206 r4) {
        this.A03.A2n(viewGroup, r3, r4);
    }

    public void CHL(AnonymousClass206 r2, C195309t8 r3) {
        this.A03.A35(r2, r3);
    }

    public void CHX(long j, String str, String str2) {
        AnonymousClass4aY r0 = this.A03;
        C33251iW A0X = AnonymousClass3MX.A0X(r0);
        AnonymousClass1BI r2 = r0.A3R;
        C17960vV.A07(r2);
        A0X.A0U(r2, (Integer) null, str, "address_message", str2, (String) null, j);
    }

    public void CHY(AnonymousClass206 r2, String str, String str2) {
        this.A03.A38(r2, str, str2);
    }

    public void CHZ(AnonymousClass206 r2, C61762qD r3) {
        this.A03.A37(r2, r3);
    }

    public void CHc(AnonymousClass206 r2, AEF aef) {
        this.A03.A36(r2, aef);
    }

    public void CMj(DialogFragment dialogFragment) {
        this.A03.A2Q.CMl(dialogFragment);
    }

    public void CNJ(C59822mw r2) {
        this.A03.A2s(r2);
    }

    public void CNj(AnonymousClass1E7 r2) {
        this.A03.A2v(r2);
    }

    public void CO4(C59822mw r4) {
        AnonymousClass4aY r0 = this.A03;
        r0.A1k.CO2(AnonymousClass3MW.A0P(r0), r4, 9);
    }

    public void COU(AnonymousClass1BI r3) {
        AnonymousClass4aY r1 = this.A03;
        if (r1.A2Q.getScreenLockStateProvider().A01()) {
            r1.A75 = true;
            if (!r3.equals(r1.A3R)) {
                r1.A6u = false;
            }
        }
    }

    public Object COn(Class cls) {
        return this.A00.BPO(cls);
    }

    public void CQq(C178119Bw r3) {
        AnonymousClass4aY r1 = this.A03;
        ((C108615c0) r1.A4q.get()).CQn(r3);
        AnonymousClass4aY.A15(r1);
    }

    public void CRY(C441822l r2, long j, boolean z) {
        this.A03.A3B(r2, j, z);
    }

    public void attachBaseContext(Context context) {
        if (context != null) {
            this.A09 = (BaseEntryPoint) AnonymousClass00E.A00(context, BaseEntryPoint.class);
        }
        super.attachBaseContext(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A03.A3M(motionEvent);
    }

    public C18030ve getAbProps() {
        return this.A0E;
    }

    public C20005A2v getCatalogLoadSession() {
        return (C20005A2v) this.A03.A2K().get();
    }

    public AnonymousClass1BI getChatJid() {
        return this.A03.A3R;
    }

    public AnonymousClass1E7 getContact() {
        return this.A03.A35;
    }

    public C37451pZ getContactPhotosLoader() {
        C108865cQ r0 = this.A03.A2Q;
        return r0.getConversationRowInflater().A04(r0.CFa());
    }

    public C86414Rn getConversationBanners() {
        return this.A03.A2G;
    }

    public C108675c7 getConversationRowCustomizer() {
        return (C108675c7) this.A03.A7m.get();
    }

    public C218617r getFMessageIO() {
        return this.A04;
    }

    public C108645c3 getInlineVideoPlaybackHandler() {
        return this.A03.A4e;
    }

    public AnonymousClass1F9 getLifecycleOwner() {
        return this;
    }

    public AnonymousClass206 getQuotedMessage() {
        return this.A03.A2b.A0G;
    }

    public Long getSimilarChannelsSessionId() {
        return this.A03.A6N;
    }

    public AnonymousClass118 getWAContext() {
        return this.A00.A0Q;
    }

    public void onBackPressed() {
        this.A03.A2V();
    }

    public Dialog onCreateDialog(int i) {
        return this.A03.A2I(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass4aY r2 = this.A03;
        for (C108185bH BqX : r2.A7q) {
            BqX.BqX(menu);
        }
        return r2.A2Q.C7s(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A03.A3K(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A03.A3L(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        for (C108185bH Bze : this.A03.A7q) {
            if (Bze.Bze(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        AnonymousClass4aY r2 = this.A03;
        for (C108185bH C1Y : r2.A7q) {
            C1Y.C1Y(menu);
        }
        return r2.A2Q.C7w(menu);
    }

    public void onResume() {
        this.A03.A2b();
    }

    public boolean onSearchRequested() {
        return this.A03.A3J();
    }

    public void onStart() {
        this.A03.A2c();
    }

    public void onWindowFocusChanged(boolean z) {
        this.A03.A3F(z);
    }

    public void scrollBy(int i, int i2) {
        AnonymousClass3VQ r0 = this.A03.A2b;
        r0.A17.A0F(new C86634Sk(i));
    }

    public Point BPP() {
        return C62762rw.A02(AnonymousClass11C.A01(this));
    }

    public C23401Fx BPx() {
        return ((C23391Fw) getLifecycle()).A02;
    }

    public AnonymousClass4YG Bb1() {
        return new AnonymousClass4YG(this.A03.A3Z, AnonymousClass000.A13());
    }

    public void C2U(int i) {
        super.C2U(i);
        this.A03.A2f(i);
    }

    public void C7q(Bundle bundle) {
        super.onCreate(bundle);
    }

    public boolean C7s(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean C7u(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean C7v(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public boolean C7w(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public void C81(AnonymousClass02B r3) {
        super.C81(r3);
        AnonymousClass17U r0 = (AnonymousClass17U) this.A03.A1s;
        r0.A02 = false;
        AnonymousClass3M7 r02 = r0.A00;
        if (r02 != null) {
            r02.setShouldHideBanner(false);
        }
    }

    public void C82(AnonymousClass02B r3) {
        super.C82(r3);
        AnonymousClass17U r0 = (AnonymousClass17U) this.A03.A1s;
        r0.A02 = true;
        AnonymousClass3M7 r02 = r0.A00;
        if (r02 != null) {
            r02.setShouldHideBanner(true);
        }
    }

    public boolean COm(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A03.A2h(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03.A2j(configuration);
    }

    public void onDestroy() {
        super.onDestroy();
        C24681Lg r1 = this.A07;
        AnonymousClass7FJ r0 = this.A08;
        if (r0 == null) {
            r0 = this.A00.A00(this, this);
            this.A08 = r0;
        }
        r1.unregisterObserver(r0);
        this.A02.unregisterObserver(this.A0B);
        this.A03.A2X();
        this.A0A.clear();
    }

    public void onNewIntent(Intent intent) {
        ArrayList parcelableArrayListExtra;
        super.onNewIntent(intent);
        AnonymousClass4aY r3 = this.A03;
        AnonymousClass4RK r0 = r3.A2A;
        if (intent == null || !r0.A00.A00(intent, true)) {
            r3.A2Q.finish();
        } else if (AnonymousClass4aY.A25(r3) && intent.getExtras() != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM")) != null && !parcelableArrayListExtra.isEmpty()) {
            AnonymousClass4aY.A0O(intent.getExtras(), r3, Collections.singletonList(new C89334cI(false, (Uri) parcelableArrayListExtra.get(0))));
        }
    }

    public void onPause() {
        super.onPause();
        this.A03.A2Z();
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        this.A03.A2i(assistContent);
    }

    public void onRestart() {
        super.onRestart();
        this.A03.A2a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A03.A2m(bundle);
    }

    public void onStop() {
        super.onStop();
        this.A03.A2d();
    }

    public int A31() {
        return 703926750;
    }

    public void Bc0() {
        finish();
    }

    public void C7p() {
        super.onBackPressed();
    }

    public void C7y() {
        super.onResume();
    }

    public void C7z() {
        super.onStart();
    }
}
