package com.whatsapp.registration.accountdefence;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass1CM;
import X.AnonymousClass1J2;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.C134076py;
import X.C17890vO;
import X.C17960vV;
import X.C192309o9;
import X.C19830z4;
import X.C19880zA;
import X.C21015Ad7;
import X.C218317o;
import X.C27301Vn;
import X.C27581Wq;
import X.C33641j9;
import X.C33841jT;
import X.C41731wy;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.util.Log;

public class NewDeviceConfirmationRegistrationViewModel extends AnonymousClass1J2 implements C218317o {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C19880zA A05;
    public final AnonymousClass118 A06;
    public final C27301Vn A07;
    public final C19830z4 A08;
    public final C33841jT A09;
    public final AnonymousClass1CM A0A;
    public final C33641j9 A0B;
    public final C134076py A0C;
    public final C41731wy A0D = AnonymousClass3MW.A0o();
    public final C41731wy A0E = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass11P A0J;
    public final AnonymousClass1LU A0K;

    public long A0T() {
        C192309o9 r1 = this.A0C.A05;
        Log.i("AccountDefenceLocalDataRepository/getRetryTimeForResendingNotice");
        long A042 = C17890vO.A04(r1.A00.A05("AccountDefenceLocalDataRepository_prefs"), "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountDefenceLocalDataRepository/getRetryTimeForResendingNotice/result ");
        A10.append(A042);
        A10.append(" cur_time=");
        C17890vO.A16(A10, System.currentTimeMillis());
        long currentTimeMillis = System.currentTimeMillis();
        if (A042 > currentTimeMillis) {
            return A042 - currentTimeMillis;
        }
        return -1;
    }

    public void A0U() {
        C41731wy r1;
        int i;
        Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration");
        this.A0C.A00();
        if (this.A03) {
            Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration/changenumber");
            C33841jT r2 = this.A09;
            C33841jT.A03(r2, 3, true);
            r2.A0F();
            r1 = this.A0E;
            i = 5;
        } else {
            Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration/resetting registration");
            this.A09.A0A();
            r1 = this.A0E;
            i = 6;
        }
        AnonymousClass3MX.A1K(r1, i);
    }

    @OnLifecycleEvent(C27581Wq.ON_PAUSE)
    public void onActivityPaused() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecyclePause");
        this.A02 = false;
        C134076py r1 = this.A0C;
        Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
        r1.A04.A01();
    }

    @OnLifecycleEvent(C27581Wq.ON_RESUME)
    public void onActivityResumed() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecycleResume");
        this.A02 = true;
        C134076py r4 = this.A0C;
        String str = this.A00;
        C17960vV.A07(str);
        String str2 = this.A01;
        C17960vV.A07(str2);
        r4.A01(new C21015Ad7(this, 1), str, str2);
    }

    @OnLifecycleEvent(C27581Wq.ON_START)
    public void onActivityStarted() {
        AnonymousClass8BR.A0q(this.A0G).A0C("device_confirm");
    }

    @OnLifecycleEvent(C27581Wq.ON_STOP)
    public void onActivityStopped() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecycleStop");
        AnonymousClass8BU.A1F(this.A0I);
    }

    public NewDeviceConfirmationRegistrationViewModel(C19880zA r2, AnonymousClass11P r3, AnonymousClass118 r4, C27301Vn r5, C19830z4 r6, AnonymousClass1LU r7, C33841jT r8, AnonymousClass1CM r9, C33641j9 r10, C134076py r11, AnonymousClass10I r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        this.A0J = r3;
        this.A06 = r4;
        this.A0K = r7;
        this.A0F = r12;
        this.A0C = r11;
        this.A0G = r13;
        this.A0H = r14;
        this.A0I = r15;
        this.A09 = r8;
        this.A08 = r6;
        this.A0B = r10;
        this.A07 = r5;
        this.A05 = r2;
        this.A0A = r9;
    }
}
