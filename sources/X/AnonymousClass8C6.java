package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.8C6  reason: invalid class name */
public final class AnonymousClass8C6 extends BroadcastReceiver {
    public final AnonymousClass11C A00;
    public final C219217x A01;
    public final Object A02;
    public final AnonymousClass99E A03;
    public final String A04;
    public final WeakReference A05;
    public volatile boolean A06;

    public void onReceive(Context context, Intent intent) {
        String str;
        boolean z;
        if (!this.A06) {
            synchronized (this.A02) {
                if (!this.A06) {
                    C02800Fk.A00(context);
                    this.A06 = true;
                }
            }
        }
        boolean A16 = C18070vi.A16(context, intent);
        Log.i("FlashCallReceiver/onReceive");
        if (C18070vi.A18(TelephonyManager.EXTRA_STATE_RINGING, intent.getStringExtra("state")) && intent.hasExtra("incoming_number")) {
            String stringExtra = intent.getStringExtra("incoming_number");
            if (stringExtra != null) {
                str = C108985cd.A0o(stringExtra, "\\D");
            } else {
                str = null;
            }
            B9O b9o = (B9O) this.A05.get();
            if (b9o != null) {
                if (str == null || str.length() == 0) {
                    Log.i("FlashCallReceiver/incomingCallPhoneNumber empty");
                    this.A03.A02 = Boolean.valueOf(A16);
                } else if (A9B.A0X(str, this.A04)) {
                    Log.i("FlashCallReceiver/sending code for verification");
                    AnonymousClass99E r6 = this.A03;
                    if (!this.A01.A0C()) {
                        Log.i("FlashCallReceiver/Cannot end call");
                    } else {
                        int i = Build.VERSION.SDK_INT;
                        AnonymousClass11C r0 = this.A00;
                        if (i >= 28) {
                            TelecomManager A0I = r0.A0I();
                            if (A0I != null) {
                                A0I.endCall();
                                Log.i("FlashCallReceiver/End call successful");
                            }
                        } else {
                            TelephonyManager A0K = r0.A0K();
                            if (A0K != null) {
                                try {
                                    Method declaredMethod = A0K.getClass().getDeclaredMethod("getITelephony", new Class[0]);
                                    declaredMethod.setAccessible(A16);
                                    Object invoke = declaredMethod.invoke(A0K, new Object[0]);
                                    invoke.getClass().getDeclaredMethod("endCall", new Class[0]).invoke(invoke, new Object[0]);
                                    Log.i("FlashCallReceiver/End call successful");
                                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                                    Log.i("FlashCallReceiver/Cannot end call", e);
                                }
                            }
                        }
                        z = true;
                        r6.A00 = Boolean.valueOf(z);
                        Log.i("FlashCallReceiver/incoming phone number matches CLI");
                        b9o.C2d(str);
                        return;
                    }
                    z = false;
                    r6.A00 = Boolean.valueOf(z);
                    Log.i("FlashCallReceiver/incoming phone number matches CLI");
                    b9o.C2d(str);
                    return;
                } else {
                    Log.i("FlashCallReceiver/incoming phone number does not match CLI");
                    this.A03.A01 = Boolean.valueOf(A16);
                }
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) b9o;
                verifyPhoneNumber.A1T = false;
                VerifyPhoneNumber.A1h(verifyPhoneNumber);
                if (AnonymousClass8BR.A1M(verifyPhoneNumber)) {
                    Log.i("VerifyPhoneNumber/receive-primary-flash-call/invalid-phone-number");
                    VerifyPhoneNumber.A1o(verifyPhoneNumber, verifyPhoneNumber.A0v.A02("sms", -1), verifyPhoneNumber.A0v.A02("voice", -1));
                    return;
                }
                Log.i("VerifyPhoneNumber/receive-secondary-flash-call");
            }
        }
    }

    public AnonymousClass8C6(AnonymousClass11C r2, C219217x r3, AnonymousClass99E r4, B9O b9o, String str) {
        this();
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = str;
        this.A03 = r4;
        this.A05 = AnonymousClass3MW.A0z(b9o);
    }

    public AnonymousClass8C6() {
        this.A06 = false;
        this.A02 = C17880vN.A0p();
    }
}
