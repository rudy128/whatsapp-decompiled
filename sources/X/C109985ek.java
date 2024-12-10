package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.5ek  reason: invalid class name and case insensitive filesystem */
public class C109985ek extends ViewOutlineProvider {
    public final /* synthetic */ VoipCallControlBottomSheetV2 A00;

    public C109985ek(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A00 = voipCallControlBottomSheetV2;
    }

    public void getOutline(View view, Outline outline) {
        float dimension = AnonymousClass000.A0Y(this.A00.A07).getDimension(2131165608);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) dimension), dimension);
    }
}
