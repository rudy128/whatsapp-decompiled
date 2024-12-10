package X;

import android.app.assist.AssistContent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3tk  reason: invalid class name and case insensitive filesystem */
public class C78843tk extends C79113uV implements C108865cQ, AnonymousClass3KJ {
    public AnonymousClass1FD A00;
    public AnonymousClass1FE A01;
    public C52892be A02;
    public C85884Pc A03;
    public AnonymousClass4aY A04;
    public C79443vR A05;
    public C18030ve A06;
    public C200710s A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public boolean A0A;
    public boolean A0B;
    public final List A0C = AnonymousClass000.A13();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78843tk(Context context) {
        super(context);
        A02();
        C74813cq.A00(this);
        A02();
        this.A01 = AnonymousClass000.A13();
        this.A00.A0J = this;
        A02();
        View.inflate(getContext(), getCurrentLayout(), this);
        AnonymousClass4aY r1 = this.A04;
        r1.A2Q = this;
        this.A05 = this.A03.A00(r1);
        C52892be r5 = this.A02;
        Intent intent = A01(this).getIntent();
        C18070vi.A0d(intent, 1);
        long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
        String stringExtra = intent.getStringExtra("perf_origin");
        if (r5.A01.A01(this, new C689335g(this, 0), stringExtra == null ? "Conversation" : stringExtra, longExtra)) {
            intent.putExtra("key_perf_tracked", true);
        }
    }

    public /* synthetic */ void BCn() {
    }

    public void CE4(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        ((C29831cw) this.A08.get()).A01(A01(this), broadcastReceiver, intentFilter, true);
    }

    public void overridePendingTransition(int i, int i2) {
        A01(this).overridePendingTransition(0, i2);
    }

    private int getCurrentLayout() {
        if (C18020vd.A05(C18040vf.A02, this.A06, 3792)) {
            return 2131624715;
        }
        return 2131624698;
    }

    public void A02() {
        if (!this.A0B) {
            this.A0B = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass1K1 r2 = A0O.A0z;
            this.A01 = (AnonymousClass4SD) r2.A63.get();
            this.A00 = r2.AHp();
            AnonymousClass10E r1 = A0O.A10;
            this.A06 = AnonymousClass10E.A8r(r1);
            this.A04 = r2.AHq();
            this.A09 = C000200d.A00(r1.A00.A4a);
            this.A08 = C000200d.A00(r1.A9c);
            this.A03 = (C85884Pc) r2.A3Q.get();
            this.A02 = C27691Xc.A06(A0O);
        }
    }

    public void A03(AssistContent assistContent) {
        this.A04.A2i(assistContent);
    }

    public void BBc(AnonymousClass1E7 r2) {
        this.A04.A2t(r2);
    }

    public void BBl() {
        this.A04.A2L();
    }

    public void BBm(AnonymousClass1E7 r3, AnonymousClass1BI r4) {
        AnonymousClass4aY.A1T(this.A04, r3, r4, false);
    }

    public void BC4(Drawable drawable, View view) {
        this.A04.A2k(drawable, view);
    }

    public void BCm() {
        this.A04.A2B.A0Q = true;
    }

    public void BIf() {
        ConversationListView conversationListView = this.A04.A2B;
        if (conversationListView.A0M) {
            conversationListView.A0M = false;
            conversationListView.setTranscriptMode(0);
        }
    }

    public void BIi(AnonymousClass205 r2) {
        this.A00.A0G.A02(r2);
    }

    public C74873d3 BRC(Integer num) {
        C117015z4 r0 = this.A04.A3K;
        if (r0 == null) {
            return null;
        }
        r0.A0D = num;
        return r0;
    }

    public void BcU(AnonymousClass1E7 r2, boolean z) {
        this.A04.A2w(r2, z);
    }

    public boolean Bci() {
        return AnonymousClass000.A1R(AnonymousClass3MX.A0c(this.A04).getCount());
    }

    public boolean Bcj() {
        return this.A04.A6g;
    }

    public boolean Bct() {
        return this.A04.A3G();
    }

    public void Bcy() {
        this.A04.A2O();
    }

    public void BdQ(AnonymousClass206 r9, AnonymousClass205 r10, AnonymousClass4QM r11, String str, String str2, Bitmap[] bitmapArr, int i) {
        this.A04.A34(r9, r10, r11, str, str2, bitmapArr, i);
    }

    public boolean BfZ() {
        return AnonymousClass000.A1W(this.A04.A2b.A0G);
    }

    public boolean Bfy() {
        AnonymousClass74M r0 = this.A04.A4h;
        if (r0 == null || !r0.A0a()) {
            return false;
        }
        return true;
    }

    public boolean Bg7() {
        return this.A04.A3H();
    }

    public boolean BgA() {
        AnonymousClass74M r0 = this.A04.A4h;
        if (r0 == null || !r0.A0b()) {
            return false;
        }
        return true;
    }

    public boolean Bgb() {
        return this.A04.A35.A0j;
    }

    public boolean Bgo(AnonymousClass206 r2) {
        return this.A04.A3N(r2);
    }

    public boolean Bgu() {
        VCOverscrollEntryPointView vCOverscrollEntryPointView;
        AnonymousClass4aY r1 = this.A04;
        if (!r1.A6r || (vCOverscrollEntryPointView = ((C84694Km) r1.A6C.get()).A00) == null || !vCOverscrollEntryPointView.A0A()) {
            return false;
        }
        return true;
    }

    public void BhD(C178119Bw r2) {
        this.A04.A3C(r2);
    }

    public /* bridge */ /* synthetic */ void BhI(Object obj) {
        this.A05.BKp(1, Collections.singleton(obj));
    }

    public void Biu(short s) {
        this.A02.A01.A01.A0C(3);
    }

    public void Biz(String str) {
        this.A02.A01.A01.A08(str);
    }

    public void BjO() {
        this.A04.A2S();
    }

    public void BjP(int i) {
        AnonymousClass4aY r4 = this.A04;
        r4.A4c.CGF(new C21470Akb((Object) r4, i, 43, (Object) r4.A3R));
    }

    public void BjQ() {
        ((C108615c0) this.A04.A4q.get()).BjQ();
    }

    public void Bje(boolean z, boolean z2) {
        AnonymousClass4aY r2 = this.A04;
        C87464Vr.A01(r2, new C95574mS(r2, z, z2), AnonymousClass00R.A18);
    }

    public void Bjf() {
        AnonymousClass4aY r2 = this.A04;
        C87464Vr.A01(r2, new C95544mP(r2, 13), AnonymousClass00R.A15);
    }

    public void Bjg() {
        AnonymousClass4aY r2 = this.A04;
        C87464Vr.A01(r2, new C95544mP(r2, 12), AnonymousClass00R.A06);
    }

    public void Bjh() {
        AnonymousClass4aY r2 = this.A04;
        C87464Vr.A01(r2, new C95544mP(r2, 9), AnonymousClass00R.A19);
    }

    public void Bji(String str) {
        AnonymousClass4aY r2 = this.A04;
        C87464Vr.A01(r2, new C95554mQ(r2, str), AnonymousClass00R.A0B);
    }

    public boolean Bjq() {
        return this.A04.A3I();
    }

    public void Bl8(UserJid userJid, boolean z) {
        AnonymousClass4aY.A1X(this.A04, userJid, false, z);
    }

    public void Bln() {
        AnonymousClass4aY r2 = this.A04;
        r2.A2x(r2.A35, false, false, false);
    }

    public void BmU() {
        this.A02.A01.A01.A07("data_load");
    }

    public void BqL(C54242dp r2, AnonymousClass206 r3, int i) {
        this.A04.A2r(r2, r3, i);
    }

    public void BqM(C87064Ud r2) {
        this.A04.A2q(r2);
    }

    public void BqW(UserJid userJid, boolean z) {
        AnonymousClass4aY.A1X(this.A04, userJid, true, z);
    }

    public void Bqk() {
        this.A02.A01.A01.A06("data_load");
    }

    public void Bqx() {
        this.A04.A2W();
    }

    public void BsX(AnonymousClass737 r3) {
        this.A04.A7e.BsW(r3.A00);
    }

    public void BuB(UserJid userJid, int i) {
        AnonymousClass3TA r2 = this.A04.A2d;
        AnonymousClass3TA.A03(r2.A00, r2, AnonymousClass4DX.LOADING_FAILED);
    }

    public void BuC(UserJid userJid, boolean z, boolean z2) {
        this.A04.A2z(userJid);
    }

    public void BvB() {
    }

    public void BvC() {
        AnonymousClass4aY r2 = this.A04;
        C98834rn.A01(AnonymousClass3MX.A0w(r2), r2, 24);
    }

    public void BvF(AnonymousClass77J r3) {
        AnonymousClass4aY r1 = this.A04;
        if (!r1.A2Q.getWaPermissionsHelper().A0D()) {
            r1.A3N = r3;
            AnonymousClass74O.A07(AnonymousClass3MW.A0P(r1), 811);
            return;
        }
        AnonymousClass4aY.A1V(r1, r3);
    }

    public void C0a(PickerSearchDialogFragment pickerSearchDialogFragment) {
        AnonymousClass4aY r1 = this.A04;
        r1.A3v.A02(pickerSearchDialogFragment);
        if (r1.A3G()) {
            AnonymousClass74M r12 = r1.A4h;
            C17960vV.A07(r12);
            r12.A0U((File) null, (File) null);
        }
    }

    public void C2j() {
        this.A04.A24.A0C();
    }

    public void C3A() {
        this.A02.A01.A01.A0C(230);
    }

    public void C3D(AnonymousClass206 r2, boolean z) {
        this.A04.A39(r2, z);
    }

    public void C4z() {
        AnonymousClass4aY r3 = this.A04;
        r3.A2J.A0U(C72453Mb.A03(C18020vd.A05(C18040vf.A01, ((AnonymousClass1DD) r3.A4L).A02, 2889) ? 1 : 0));
    }

    public void C7q(Bundle bundle) {
        C94604kt r0 = this.A00;
        if (r0 != null) {
            r0.A0J = this;
            List list = this.A01;
            if (list == null || 0 >= list.size()) {
                C74813cq.A00(this);
                this.A00.A07();
                return;
            }
            list.get(0);
            throw AnonymousClass000.A0s("onCreate");
        }
    }

    public void C8O() {
        this.A04.A24.A0B();
    }

    public void C9u() {
        AnonymousClass4aY r3 = this.A04;
        r3.A2x(r3.A35, true, false, false);
    }

    public void CAz(C106795Xf r2, C20285AEt aEt) {
        this.A04.A2p(r2, aEt);
    }

    public void CCR(AnonymousClass1E7 r2, boolean z, boolean z2, boolean z3) {
        this.A04.A2x(r2, z, z2, z3);
    }

    public void CDo() {
        AnonymousClass4aY.A1E(this.A04);
    }

    public void CFM() {
        AnonymousClass3VQ r0 = this.A04.A2b;
        AnonymousClass3VQ.A07(r0);
        AnonymousClass3VQ.A06(r0);
    }

    public void CFj() {
        AnonymousClass4aY r2 = this.A04;
        r2.A2b.A0b((AnonymousClass206) null);
        AnonymousClass4aY.A0d(r2);
    }

    public void CFp(C441822l r7, long j) {
        AnonymousClass4aY r5 = this.A04;
        if (r5.A08 == r7.A0x) {
            r5.A2B.removeCallbacks(r5.A6O);
            r5.A2B.postDelayed(r5.A6O, j);
        }
    }

    public void CH3(AnonymousClass206 r2) {
        this.A04.A32(r2);
    }

    public void CH4(ViewGroup viewGroup, AnonymousClass206 r3, AnonymousClass206 r4) {
        this.A04.A2n(viewGroup, r3, r4);
    }

    public void CHL(AnonymousClass206 r2, C195309t8 r3) {
        this.A04.A35(r2, r3);
    }

    public void CHX(long j, String str, String str2) {
        AnonymousClass4aY r0 = this.A04;
        C33251iW A0X = AnonymousClass3MX.A0X(r0);
        AnonymousClass1BI r2 = r0.A3R;
        C17960vV.A07(r2);
        A0X.A0U(r2, (Integer) null, str, "address_message", str2, (String) null, j);
    }

    public void CHY(AnonymousClass206 r2, String str, String str2) {
        this.A04.A38(r2, str, str2);
    }

    public void CHZ(AnonymousClass206 r2, C61762qD r3) {
        this.A04.A37(r2, r3);
    }

    public void CHc(AnonymousClass206 r2, AEF aef) {
        this.A04.A36(r2, aef);
    }

    public boolean CMM() {
        return true;
    }

    public void CMe(AnonymousClass206 r2) {
        this.A04.A2b.A0a(r2);
    }

    public void CMj(DialogFragment dialogFragment) {
        this.A04.A2Q.CMl(dialogFragment);
    }

    public void CMm(DialogFragment dialogFragment, String str) {
        A01(this).CMm(dialogFragment, "BrazilPaymentIncomeCollectionBottomSheet");
    }

    public boolean CMu() {
        return true;
    }

    public void CNJ(C59822mw r2) {
        this.A04.A2s(r2);
    }

    public void CNj(AnonymousClass1E7 r2) {
        this.A04.A2v(r2);
    }

    public void CO4(C59822mw r4) {
        AnonymousClass4aY r0 = this.A04;
        r0.A1k.CO2(AnonymousClass3MW.A0P(r0), r4, 9);
    }

    public void COU(AnonymousClass1BI r3) {
        AnonymousClass4aY r1 = this.A04;
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
        AnonymousClass4aY r1 = this.A04;
        ((C108615c0) r1.A4q.get()).CQn(r3);
        AnonymousClass4aY.A15(r1);
    }

    public void CRY(C441822l r2, long j, boolean z) {
        this.A04.A3B(r2, j, z);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A04.A3M(motionEvent);
    }

    public C20005A2v getCatalogLoadSession() {
        return (C20005A2v) this.A04.A2K().get();
    }

    public AnonymousClass1BI getChatJid() {
        return this.A04.A3R;
    }

    public AnonymousClass1E7 getContact() {
        return this.A04.A35;
    }

    public C37451pZ getContactPhotosLoader() {
        C108865cQ r0 = this.A04.A2Q;
        return r0.getConversationRowInflater().A04(r0.CFa());
    }

    public C86414Rn getConversationBanners() {
        return this.A04.A2G;
    }

    public C108675c7 getConversationRowCustomizer() {
        return (C108675c7) this.A04.A7m.get();
    }

    public AnonymousClass4NU getFirstDrawMonitor() {
        return this.A02.A01.A00;
    }

    public C108645c3 getInlineVideoPlaybackHandler() {
        return this.A04.A4e;
    }

    public AnonymousClass1HB getInteractionPerfTracker() {
        return this.A02.A01;
    }

    public AnonymousClass1BI getJid() {
        return this.A04.A3R;
    }

    public C23381Fv getLifecycle() {
        Fragment fragment = this.A00;
        C17960vV.A07(fragment);
        return fragment.A0L;
    }

    public AnonymousClass1F9 getLifecycleOwner() {
        Fragment fragment = this.A00;
        C17960vV.A07(fragment);
        return fragment;
    }

    public C41761x1 getPreferredLabel() {
        return null;
    }

    public AnonymousClass19T getQuickPerformanceLogger() {
        return this.A02.A01.A01.A07;
    }

    public AnonymousClass206 getQuotedMessage() {
        return this.A04.A2b.A0G;
    }

    public AnonymousClass1FE getSavedStateRegistryOwner() {
        AnonymousClass1FE r0 = this.A01;
        if (r0 == null) {
            return A01(this);
        }
        return r0;
    }

    public ArrayList getSearchTerms() {
        AnonymousClass3UY r0 = this.A04.A2Z;
        if (r0 == null) {
            return AnonymousClass000.A13();
        }
        return r0.A03;
    }

    public String getSearchText() {
        AnonymousClass3UY r0 = this.A04.A2Z;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public Long getSimilarChannelsSessionId() {
        return this.A04.A6N;
    }

    public EditText getTextEntryField() {
        return this.A04.A3Z;
    }

    public Toolbar getToolbar() {
        return this.A04.A0f;
    }

    public AnonymousClass1FD getViewModelStoreOwner() {
        AnonymousClass1FD r0 = this.A00;
        if (r0 == null) {
            return A01(this);
        }
        return r0;
    }

    public AnonymousClass118 getWAContext() {
        return this.A00.A0Q;
    }

    public boolean isFinishing() {
        Fragment fragment = this.A00;
        C17960vV.A07(fragment);
        return fragment.A0j;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A04.A3K(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A04.A3L(i, keyEvent);
    }

    public void onWindowFocusChanged(boolean z) {
        this.A04.A3F(z);
    }

    public void setCustomActionBarEnabled(boolean z) {
        this.A04.A6d = z;
    }

    public void setInputLayoutBackground(int i) {
        this.A04.A2g(i);
    }

    public void setMessageFilter(C106785Xe r3) {
        AnonymousClass4aY r1 = this.A04;
        AnonymousClass3MX.A0c(r1).A08 = r3;
        AnonymousClass3MX.A0c(r1).notifyDataSetChanged();
    }

    public void setQuotedMessage(AnonymousClass206 r2) {
        this.A04.A2b.A0b(r2);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        ((C29831cw) this.A08.get()).A02(broadcastReceiver, A01(this));
    }

    public static AnonymousClass1FY A01(C74813cq r0) {
        AnonymousClass1FY waBaseActivity = r0.getWaBaseActivity();
        C17960vV.A07(waBaseActivity);
        return waBaseActivity;
    }

    public boolean BFo(AnonymousClass206 r2, boolean z, boolean z2) {
        if (getWaBaseActivity() == null) {
            return false;
        }
        return this.A04.A3O(r2, z, z2);
    }

    public void Bc0() {
        A01(this).runOnUiThread(new C27080DTf((Object) this, 46));
    }

    public boolean Be3() {
        return AnonymousClass000.A1W(getWaBaseActivity());
    }

    public boolean Bed() {
        return A01(this).Bed();
    }

    public void BhQ(int i) {
        A01(this).BhQ(i);
    }

    public void BhR(String str) {
        A01(this).BhR(str);
    }

    public void BhS(String str, String str2) {
        A01(this).BhS(str, str2);
    }

    public void BhT(C72033Kj r7, Object[] objArr, int i, int i2, int i3) {
        A01(this).BhT(r7, objArr, i, i2, 2131891847);
    }

    public void BhU(Object[] objArr, int i, int i2) {
        A01(this).BhU(objArr, i, i2);
    }

    public void C2U(int i) {
        super.C2U(i);
        this.A04.A2f(i);
    }

    public void CEx() {
        A01(this).CEx();
    }

    public AnonymousClass1FY CFa() {
        return A01(this);
    }

    public void CMk(DialogFragment dialogFragment, String str) {
        A01(this).CMk(dialogFragment, str);
    }

    public void CMl(DialogFragment dialogFragment) {
        A01(this).CMl(dialogFragment);
    }

    public void CNA(int i) {
        A01(this).CNA(i);
    }

    public void CNB(int i, int i2) {
        A01(this).CNB(i, i2);
    }

    public void CNh(Intent intent, int i) {
        A01(this).CNh(intent, i);
    }

    public AnonymousClass02B COJ(AnonymousClass02H r2) {
        return A01(this).COJ(r2);
    }

    public boolean COm(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void CPW(List list, int i) {
        A01(this).CPW(list, i);
    }

    public void CRG(String str) {
        A01(this).CRG(str);
    }

    public void finish() {
        A01(this).finish();
    }

    public void finishAndRemoveTask() {
        A01(this).finishAndRemoveTask();
    }

    public C18030ve getAbProps() {
        return A01(this).getAbProps();
    }

    public AnonymousClass1FY getActivityNullable() {
        return getWaBaseActivity();
    }

    public AnonymousClass1L9 getActivityUtils() {
        return A01(this).A01;
    }

    public View getContentView() {
        return A01(this).A00;
    }

    public AnonymousClass190 getCrashLogs() {
        return A01(this).A03;
    }

    public AnonymousClass1KW getEmojiLoader() {
        return A01(this).A0D;
    }

    public C218617r getFMessageIO() {
        return A01(this).A04;
    }

    public AnonymousClass1KB getGlobalUI() {
        return A01(this).A05;
    }

    public AnonymousClass1L4 getImeUtils() {
        return A01(this).A09;
    }

    public Intent getIntent() {
        return A01(this).getIntent();
    }

    public LayoutInflater getLayoutInflater() {
        return A01(this).getLayoutInflater();
    }

    public String getLocalClassName() {
        return A01(this).getLocalClassName();
    }

    public AnonymousClass11S getMeManager() {
        return A01(this).A02;
    }

    public AnonymousClass1CM getRegistrationStateManager() {
        return A01(this).A07;
    }

    public AnonymousClass1LD getScreenLockStateProvider() {
        return A01(this).A08;
    }

    public AnonymousClass18O getServerProps() {
        return A01(this).A06;
    }

    public AnonymousClass1Bd getStartupTracker() {
        if (getWaBaseActivity() == null) {
            return null;
        }
        return getWaBaseActivity().A02;
    }

    public AnonymousClass11Z getStorageUtils() {
        return A01(this).getStorageUtils();
    }

    public String getString(int i, Object... objArr) {
        return A01(this).getString(i, objArr);
    }

    public C003401n getSupportActionBar() {
        return A01(this).getSupportActionBar();
    }

    public AnonymousClass1GP getSupportFragmentManager() {
        return A01(this).getSupportFragmentManager();
    }

    public AnonymousClass11C getSystemServices() {
        return A01(this).A08;
    }

    public AnonymousClass11P getTime() {
        return A01(this).A05;
    }

    public C19830z4 getWaSharedPreferences() {
        return A01(this).A0A;
    }

    public AnonymousClass10I getWaWorkers() {
        return A01(this).A05;
    }

    public C18000vb getWhatsAppLocale() {
        return A01(this).A00;
    }

    public Window getWindow() {
        return A01(this).getWindow();
    }

    public WindowManager getWindowManager() {
        return A01(this).getWindowManager();
    }

    public void invalidateOptionsMenu() {
        A01(this).invalidateOptionsMenu();
    }

    public boolean isInMultiWindowMode() {
        return A01(this).isInMultiWindowMode();
    }

    public boolean isTaskRoot() {
        return A01(this).isTaskRoot();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A04.A2j(configuration);
    }

    public void setActivityPerfAsserts(boolean z) {
        A01(this);
    }

    public void setContentView(int i) {
        if (i != getCurrentLayout() && AnonymousClass3MX.A0j(this.A09).A07()) {
            A01(this).setContentView(i);
        }
    }

    public void setConversationDelegate(AnonymousClass4aY r1) {
        this.A04 = r1;
    }

    public void setSavedStateRegistryOwner(AnonymousClass1FE r1) {
        this.A01 = r1;
    }

    public void setSelectedMessages(AnonymousClass4S9 r1) {
        super.setSelectedMessages(r1);
    }

    public void setSelectionActionMode(AnonymousClass02B r1) {
        super.setSelectionActionMode(r1);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        A01(this).setSupportActionBar(toolbar);
    }

    public void setViewModelStoreOwner(AnonymousClass1FD r1) {
        this.A00 = r1;
    }

    public void startActivity(Intent intent) {
        A01(this).startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        A01(this).startActivityForResult(intent, i);
    }

    public int getMarkerId() {
        return 703926750;
    }

    public String getString(int i) {
        return A01(this).getString(i);
    }
}
