package X;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5dx  reason: invalid class name and case insensitive filesystem */
public class C109755dx extends GestureDetector.SimpleOnGestureListener {
    public Fragment A00;
    public RootHostView A01;
    public C25813CmQ A02;
    public C186529eL A03;
    public CXY A04;
    public BloksDialogFragment A05;
    public AnonymousClass6bI A06;
    public Map A07;
    public Bundle A08;
    public AnonymousClass01E A09;
    public HashMap A0A;

    public void A00() {
        BloksDialogFragment bloksDialogFragment;
        C25813CmQ cmQ = this.A02;
        if (cmQ != null && (bloksDialogFragment = this.A05) != null) {
            bloksDialogFragment.A07 = AnonymousClass000.A0i();
            RootHostView rootHostView = this.A01;
            if (rootHostView != null) {
                cmQ.A03(rootHostView);
            }
            this.A05.A07 = AnonymousClass000.A0h();
        }
    }

    public void A01(Bundle bundle, AnonymousClass01E r8, Fragment fragment, CXY cxy, BloksDialogFragment bloksDialogFragment, AnonymousClass6bI r12, String str, HashMap hashMap) {
        this.A09 = r8;
        this.A00 = fragment;
        this.A05 = bloksDialogFragment;
        this.A06 = r12;
        C143137Cd r3 = new C143137Cd(this);
        this.A08 = bundle;
        this.A0A = hashMap;
        this.A04 = cxy;
        bundle.getBoolean("hot_reload");
        C186529eL r5 = this.A03;
        C18070vi.A0d(str, 0);
        C17960vV.A0G(!C64062u9.A0V(str), AnonymousClass001.A1H("BloksPayloadHelperImpl/getBloks/invalid screen name: ", str, AnonymousClass000.A10()));
        r5.A00.A07(0, 2131891797);
        r5.A03.CGN(new C21459AkQ(r5, r3, str, 43));
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }
}
