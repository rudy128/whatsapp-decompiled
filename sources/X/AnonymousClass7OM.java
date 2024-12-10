package X;

import com.whatsapp.util.Log;

/* renamed from: X.7OM  reason: invalid class name */
public class AnonymousClass7OM implements C1603488c {
    public final int A00;

    public AnonymousClass7OM(int i) {
        this.A00 = i;
    }

    public void BpJ(AnonymousClass6U4 r2) {
        String str;
        switch (this.A00) {
            case 1:
                str = "SupportBloksActivity - Completed language update async action";
                break;
            case 2:
                if (!(r2 instanceof AnonymousClass6N8)) {
                    Log.w("CareCsatSurveyLauncherProxy - failed to launch Care CSAT survey via Bloks async action");
                    return;
                }
                return;
            case 3:
                str = "SettingsHelpV2 - Completed language update async action";
                break;
            default:
                return;
        }
        Log.i(str);
    }
}
