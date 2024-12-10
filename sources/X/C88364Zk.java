package X;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment;
import com.whatsapp.Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment;
import com.whatsapp.Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment;
import com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment;
import com.whatsapp.registration.accountdefence.ui.Hilt_DeviceConfirmationRegAlertDialogFragment;

/* renamed from: X.4Zk  reason: invalid class name and case insensitive filesystem */
public abstract class C88364Zk {
    public static boolean A00(AnonymousClass1FR r5, C59242lz r6) {
        if (r5 == null || r5.Bed() || !(r5 instanceof AnonymousClass1FU) || !(!(r5 instanceof C106485Wa))) {
            return false;
        }
        DialogFragment A3V = ((AnonymousClass1FU) r5).A3V(DeviceConfirmationRegAlertDialogFragment.class);
        if (A3V instanceof DeviceConfirmationRegAlertDialogFragment) {
            DeviceConfirmationRegAlertDialogFragment deviceConfirmationRegAlertDialogFragment = (DeviceConfirmationRegAlertDialogFragment) A3V;
            Button button = deviceConfirmationRegAlertDialogFragment.A02;
            if (button != null) {
                button.setVisibility(4);
            }
            Button button2 = deviceConfirmationRegAlertDialogFragment.A01;
            if (button2 != null) {
                button2.setVisibility(4);
            }
            AnonymousClass3MY.A1A(deviceConfirmationRegAlertDialogFragment.A00, 2131432808, 4);
            AnonymousClass1HF.A06(deviceConfirmationRegAlertDialogFragment.A00, 2131432159).setVisibility(0);
            deviceConfirmationRegAlertDialogFragment.A00.postDelayed(new C146517Pk(deviceConfirmationRegAlertDialogFragment, r6, 38), 1000);
            return true;
        }
        Hilt_DeviceConfirmationRegAlertDialogFragment hilt_DeviceConfirmationRegAlertDialogFragment = new Hilt_DeviceConfirmationRegAlertDialogFragment();
        DeviceConfirmationRegAlertDialogFragment.A08 = r6;
        r5.CMl(hilt_DeviceConfirmationRegAlertDialogFragment);
        return true;
    }

    public static boolean A01(AnonymousClass1FR r4, C29491cN r5, C18030ve r6, C22881Do r7) {
        Context context;
        Intent A0A;
        String packageName;
        String str;
        if (r4.Bed() || !(r4 instanceof AnonymousClass1FU) || ((r4 instanceof AnonymousClass5YV) && !((AnonymousClass5YV) r4).C5Z())) {
            return false;
        }
        boolean z = !r5.A0E();
        if (r7.A00 == 1) {
            context = (Context) r4;
            A0A = C72463Mc.A0G(context);
            packageName = context.getPackageName();
            str = "com.whatsapp.loginfailure.PCRLogoutMessageActivity";
        } else if (!z || !C18020vd.A05(C18040vf.A02, r6, 6719)) {
            AnonymousClass1FU r2 = (AnonymousClass1FU) r4;
            DialogFragment A3V = r2.A3V(DeviceConfirmationRegAlertDialogFragment.class);
            if (A3V instanceof DeviceConfirmationRegAlertDialogFragment) {
                A3V.A28();
            }
            r2.A41("DoNotShareCodeDialogTag");
            r4.CMk(new Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment(), "login_failed");
            return true;
        } else {
            context = (Context) r4;
            A0A = C17880vN.A0A();
            packageName = context.getPackageName();
            str = "com.whatsapp.loginfailure.LogoutMessageActivity";
        }
        A0A.setClassName(packageName, str);
        context.startActivity(A0A);
        return true;
    }

    public static boolean A02(AnonymousClass1FR r2, C219017v r3, C32291gx r4) {
        if (r2.Bed() || !(r2 instanceof AnonymousClass1FU)) {
            return false;
        }
        r4.A01 = true;
        r3.A0F(true, 17);
        r2.CMl(new DisplayExceptionDialogFactory$ClockWrongDialogFragment());
        return true;
    }

    public static boolean A03(AnonymousClass1FR r2, C219017v r3, C32291gx r4) {
        if (r2.Bed() || !(r2 instanceof AnonymousClass1FU)) {
            return false;
        }
        r4.A01 = true;
        r3.A0F(true, 17);
        r2.CMl(new Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment());
        return true;
    }
}
