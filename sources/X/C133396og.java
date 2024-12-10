package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.mediacomposer.doodle.penmode.PenModeView;
import java.util.Iterator;

/* renamed from: X.6og  reason: invalid class name and case insensitive filesystem */
public final class C133396og {
    public final /* synthetic */ C109205cz A00;

    public C133396og(C109205cz r1) {
        this.A00 = r1;
    }

    public void A00(int i) {
        PenModeView penModeView = this.A00.A0A;
        if (penModeView == null) {
            C18070vi.A11("penModeView");
            throw null;
        }
        Iterator it = penModeView.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass3MX.A0E(it).setBackground((Drawable) null);
        }
        int i2 = 2131433743;
        if (i != 1) {
            i2 = 2131433741;
            if (i != 2) {
                i2 = 2131433742;
                if (i != 3) {
                    if (i == 4) {
                        i2 = 2131433739;
                    } else {
                        return;
                    }
                }
            }
        }
        AnonymousClass1HF.A06(penModeView, i2).setBackgroundResource(2131232809);
    }

    public void A01(int i) {
        C109455dT r1 = this.A00.A09;
        if (r1 == null) {
            C18070vi.A11("penButtonBackground");
            throw null;
        }
        r1.A02 = i;
        r1.A00 = 1.0f;
        r1.invalidateSelf();
    }
}
