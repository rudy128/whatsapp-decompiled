package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver;
import com.whatsapp.events.EventStartAlarmReceiver;

/* renamed from: X.268  reason: invalid class name */
public abstract class AnonymousClass268 extends BroadcastReceiver {
    public final Object A00 = C17880vN.A0p();
    public volatile boolean A01 = false;

    public void A00(Context context) {
        if (this instanceof EventStartAlarmReceiver) {
            EventStartAlarmReceiver eventStartAlarmReceiver = (EventStartAlarmReceiver) this;
            if (!eventStartAlarmReceiver.A04) {
                synchronized (eventStartAlarmReceiver.A03) {
                    if (!eventStartAlarmReceiver.A04) {
                        AnonymousClass10G r2 = ((AnonymousClass10E) ((C000100c) C02800Fk.A00(context))).Ao8.A00;
                        AnonymousClass10E r1 = r2.AJU;
                        eventStartAlarmReceiver.A01 = (C18030ve) r1.A04.get();
                        eventStartAlarmReceiver.A00 = (AnonymousClass2Z3) r2.A1r.get();
                        eventStartAlarmReceiver.A02 = (AnonymousClass10I) r1.AC1.get();
                        eventStartAlarmReceiver.A04 = true;
                    }
                }
            }
        } else if (this instanceof CompanionDeviceVerificationReceiver) {
            CompanionDeviceVerificationReceiver companionDeviceVerificationReceiver = (CompanionDeviceVerificationReceiver) this;
            if (!companionDeviceVerificationReceiver.A04) {
                synchronized (companionDeviceVerificationReceiver.A03) {
                    if (!companionDeviceVerificationReceiver.A04) {
                        AnonymousClass10G r22 = ((AnonymousClass10E) ((C000100c) C02800Fk.A00(context))).Ao8.A00;
                        AnonymousClass10E r12 = r22.AJU;
                        companionDeviceVerificationReceiver.A01 = (C19830z4) r12.ABl.get();
                        companionDeviceVerificationReceiver.A02 = (AnonymousClass1RK) r12.A2R.get();
                        companionDeviceVerificationReceiver.A00 = (C47992Kt) r22.A0x.get();
                        companionDeviceVerificationReceiver.A04 = true;
                    }
                }
            }
        } else if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    C02800Fk.A00(context);
                    this.A01 = true;
                }
            }
        }
    }
}
