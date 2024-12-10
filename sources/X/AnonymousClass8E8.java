package X;

import com.whatsapp.AlarmService;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.8E8  reason: invalid class name */
public abstract class AnonymousClass8E8 extends AnonymousClass8EC implements AnonymousClass009 {
    public boolean A00 = false;
    public final Object A01 = C17880vN.A0p();
    public volatile C008203r A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C008203r(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            AlarmService alarmService = (AlarmService) this;
            C31221fD r2 = (C31221fD) ((C008503u) generatedComponent());
            alarmService.A00 = (WhatsAppLibLoader) r2.A07.ABy.get();
            alarmService.A01 = C000200d.A00(r2.A06);
        }
        super.onCreate();
    }
}
