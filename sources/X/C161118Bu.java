package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import org.npci.upi.security.pinactivitycomponent.GetCredential;
import org.npci.upi.security.pinactivitycomponent.u;

/* renamed from: X.8Bu  reason: invalid class name and case insensitive filesystem */
public class C161118Bu extends BroadcastReceiver {
    public final /* synthetic */ GetCredential A00;

    public C161118Bu(GetCredential getCredential) {
        this.A00 = getCredential;
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        try {
            if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED") && (extras = intent.getExtras()) != null) {
                Object[] objArr = (Object[]) extras.get("pdus");
                int length = objArr.length;
                SmsMessage[] smsMessageArr = new SmsMessage[length];
                for (int i = 0; i < length; i++) {
                    SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) objArr[i]);
                    smsMessageArr[i] = createFromPdu;
                    String upperCase = createFromPdu.getOriginatingAddress().toUpperCase();
                    String upperCase2 = smsMessageArr[i].getMessageBody().toUpperCase();
                    smsMessageArr[i].getTimestampMillis();
                    GetCredential getCredential = this.A00;
                    C190839lb A01 = new u(getCredential.A0K).A01(upperCase, upperCase2, getCredential.A01);
                    if (A01 != null) {
                        getCredential.A0F.A27(A01);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
