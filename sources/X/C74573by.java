package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ListView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.util.Log;

/* renamed from: X.3by  reason: invalid class name and case insensitive filesystem */
public final class C74573by extends C90704eV {
    public final int A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final ListView A03;
    public final KeyboardPopupLayout A04;

    public void onAnimationEnd(Animation animation) {
        Log.i("conversation/hideinputextension/end");
        this.A01.setVisibility(8);
        ViewGroup viewGroup = this.A02;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C90394e0(viewGroup));
        this.A04.setClipChildren(true);
        this.A03.setTranscriptMode(this.A00);
    }

    public C74573by(ViewGroup viewGroup, ViewGroup viewGroup2, ListView listView, KeyboardPopupLayout keyboardPopupLayout, int i) {
        this.A00 = i;
        this.A01 = viewGroup;
        this.A04 = keyboardPopupLayout;
        this.A03 = listView;
        this.A02 = viewGroup2;
    }
}
