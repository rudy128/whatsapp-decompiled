package X;

import android.animation.TimeInterpolator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import com.whatsapp.base.WaFragment;
import com.whatsapp.glasses.SUPBottomSheetView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.DOq  reason: case insensitive filesystem */
public final class C26994DOq implements C160958At, C72203La {
    public A99 A00;
    public final int A01;
    public final ViewStub A02;
    public final C26995DOr A03;
    public final AnonymousClass1DS A04;
    public final AnonymousClass1V7 A05;
    public final C18030ve A06;

    public void C5F(A99 a99) {
        C18070vi.A0d(a99, 0);
        Log.i("VoipGlassesManagerImpl.kt Bound to service");
        this.A00 = a99;
        this.A03.A05(this.A02, a99, this.A01);
    }

    public void C5G() {
        this.A00 = null;
    }

    public WaFragment BNY() {
        return this.A03.BNY();
    }

    public SUPBottomSheetView BNe() {
        return this.A03.A03;
    }

    public AnonymousClass1DS BZH() {
        return this.A04;
    }

    public C139936zg BZh() {
        return this.A03.BZh();
    }

    public View BZs() {
        return this.A03.BZs();
    }

    public boolean Be0() {
        return this.A03.Be0();
    }

    public boolean Be1() {
        return this.A03.Be1();
    }

    public void BlA() {
        this.A03.BlA();
    }

    public void BmB() {
        this.A03.BmB();
    }

    public void But() {
        this.A03.But();
    }

    public void C0f(TimeInterpolator timeInterpolator, long j, boolean z) {
        this.A03.C0f(timeInterpolator, j, z);
    }

    public void C50(boolean z) {
        this.A03.C50(z);
    }

    public void C9P(CallInfo callInfo) {
        this.A03.C9P(callInfo);
    }

    public void CFn() {
        this.A03.CFn();
    }

    public void CIy(float f) {
        this.A03.CIy(f);
    }

    public void CJ9(boolean z) {
        this.A03.CJ9(z);
    }

    public void CNW() {
        this.A03.CNW();
    }

    public boolean CSB(MotionEvent motionEvent) {
        return this.A03.CSB(motionEvent);
    }

    public void onDestroy() {
        Log.i("VoipGlassesManagerImpl.kt Unbinding from service");
        this.A03.onDestroy();
        this.A05.A02(this);
        this.A00 = null;
    }

    public C26994DOq(ViewStub viewStub, C61872qQ r3, AnonymousClass1V7 r4, C18030ve r5, int i) {
        C18070vi.A0o(r5, r4, r3);
        this.A06 = r5;
        this.A05 = r4;
        this.A02 = viewStub;
        this.A01 = i;
        C26995DOr A012 = r3.A01((C28597E9o) null);
        this.A03 = A012;
        r4.A01(this);
        this.A04 = A012.A0O;
    }
}
