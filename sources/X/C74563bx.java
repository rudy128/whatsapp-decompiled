package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.whatsapp.util.Log;

/* renamed from: X.3bx  reason: invalid class name and case insensitive filesystem */
public class C74563bx extends C90704eV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ AnonymousClass4aY A03;
    public final /* synthetic */ boolean A04;

    public C74563bx(View view, ViewGroup viewGroup, AnonymousClass4aY r3, int i, boolean z) {
        this.A03 = r3;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A04 = z;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        Log.i("conversation/hideinputextension/end");
        ViewGroup viewGroup = this.A02;
        viewGroup.setVisibility(8);
        AnonymousClass4aY r4 = this.A03;
        C85814Ov r3 = r4.A27;
        r3.A02.getViewTreeObserver().addOnGlobalLayoutListener(new C90574eI(new C90484e9(this.A01, viewGroup, this, this.A04), r3, 0));
        r4.A1M.setClipChildren(true);
        r4.A2B.setTranscriptMode(this.A00);
    }
}
