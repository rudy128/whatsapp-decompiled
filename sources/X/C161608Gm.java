package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.ListPreference;
import com.whatsapp.settings.SettingsJidNotificationFragment;

/* renamed from: X.8Gm  reason: invalid class name and case insensitive filesystem */
public class C161608Gm extends ListPreference {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SettingsJidNotificationFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161608Gm(Context context, SettingsJidNotificationFragment settingsJidNotificationFragment, int i) {
        super(context, (AttributeSet) null);
        this.A01 = settingsJidNotificationFragment;
        this.A00 = i;
    }

    public void A0G(AnonymousClass8J3 r4) {
        super.A0G(r4);
        View view = r4.A0H;
        TextView A0E = C17880vN.A0E(view, 16908310);
        TextView A0E2 = C17880vN.A0E(view, 16908304);
        int i = this.A00;
        A0E.setTextColor(i);
        A0E2.setTextColor(i);
        r4.A00 = true;
        r4.A01 = true;
    }
}
