package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.calling.PeerAvatarLayout;
import com.whatsapp.calling.controls.view.CallControlCard;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4qo  reason: invalid class name and case insensitive filesystem */
public class C98244qo implements C38531rR {
    public final int A00;

    public C98244qo(int i) {
        this.A00 = i;
    }

    public static void A00(C28931bI r1, int i) {
        r1.A07(new C98244qo(i));
    }

    public final void Bvu(View view) {
        CircularProgressBar circularProgressBar;
        switch (this.A00) {
            case 0:
                CallControlCard.setupOnAttach$lambda$11((PeerAvatarLayout) view);
                return;
            case 1:
                ((WDSButton) view).setSize(AnonymousClass4D1.LARGE);
                return;
            case 2:
                ((ThumbnailButton) view).A01 = -1.0f;
                return;
            case 3:
            case 5:
                circularProgressBar = (CircularProgressBar) view;
                circularProgressBar.setMax(100);
                break;
            case 7:
                ProgressBar progressBar = (ProgressBar) view;
                progressBar.setProgress(0);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(8);
                return;
            case 10:
                AnonymousClass4aY.A0S((ViewGroup) view);
                return;
            default:
                circularProgressBar = (CircularProgressBar) view;
                break;
        }
        circularProgressBar.A0B = 0;
    }
}
