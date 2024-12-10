package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

/* renamed from: X.Bnu  reason: case insensitive filesystem */
public final class C23687Bnu extends BV6 {
    public SeekBar.OnSeekBarChangeListener A00;
    public BJ9 A01;

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        C18070vi.A0d(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        C108965cb.A12(frameLayout, -1);
        frameLayout.addView(new AppCompatSeekBar(context));
        return frameLayout;
    }
}
