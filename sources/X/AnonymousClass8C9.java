package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;

/* renamed from: X.8C9  reason: invalid class name */
public class AnonymousClass8C9 extends BroadcastReceiver {
    public boolean A00;
    public final Object A01;
    public final C19830z4 A02;
    public final WeakReference A03;
    public volatile boolean A04;

    public static String A00(C183619Yy r1, String str) {
        Matcher matcher = r1.A00.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(matcher.group(1));
        return AnonymousClass000.A0y(matcher.group(2), A10);
    }

    public void onReceive(Context context, Intent intent) {
        SmsMessage smsMessage;
        String str;
        if (!this.A04) {
            synchronized (this.A01) {
                if (!this.A04) {
                    C02800Fk.A00(context);
                    this.A04 = true;
                }
            }
        }
        Log.i("receivedtextreceiver/text/intent");
        if (this.A00) {
            str = "receivedtextreceiver/already received";
        } else {
            VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A03.get();
            if (verifyPhoneNumber == null) {
                str = "receivedtextreceiver/activity is null";
            } else if (verifyPhoneNumber.Bed()) {
                str = "receivedtextreceiver/destroyed";
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    str = "receivedtextreceiver/bundle-null";
                } else {
                    Object[] objArr = (Object[]) extras.get("pdus");
                    if (objArr == null) {
                        str = "receivedtextreceiver/pdus-null";
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("receivedtextreceiver/pdus-length/");
                        C17900vP.A0o(A10, r4);
                        C183619Yy r3 = new C183619Yy(verifyPhoneNumber.getString(2131899103));
                        for (Object obj : objArr) {
                            String str2 = null;
                            try {
                                if (AnonymousClass112.A01()) {
                                    smsMessage = SmsMessage.createFromPdu((byte[]) obj, extras.getString("format"));
                                } else {
                                    smsMessage = SmsMessage.createFromPdu((byte[]) obj);
                                }
                                if (smsMessage != null) {
                                    try {
                                        str2 = smsMessage.getMessageBody();
                                        C17900vP.A0f("verifysms/getMessageBody ", str2, AnonymousClass000.A10());
                                        StringBuilder A102 = AnonymousClass000.A10();
                                        A102.append("verifysms/displayMessageBody ");
                                        C17890vO.A1A(A102, smsMessage.getDisplayMessageBody());
                                        StringBuilder A103 = AnonymousClass000.A10();
                                        A103.append("verifysms/displayOriginatingAddress ");
                                        C17890vO.A1A(A103, smsMessage.getDisplayOriginatingAddress());
                                        StringBuilder A104 = AnonymousClass000.A10();
                                        A104.append("verifysms/emailBody ");
                                        C17890vO.A1A(A104, smsMessage.getEmailBody());
                                        StringBuilder A105 = AnonymousClass000.A10();
                                        A105.append("verifysms/emailFrom ");
                                        C17890vO.A1A(A105, smsMessage.getEmailFrom());
                                        StringBuilder A106 = AnonymousClass000.A10();
                                        A106.append("verifysms/getOriginatingAddress ");
                                        C17890vO.A1A(A106, smsMessage.getOriginatingAddress());
                                        StringBuilder A107 = AnonymousClass000.A10();
                                        A107.append("verifysms/getPseudoSubject ");
                                        C17890vO.A1A(A107, smsMessage.getPseudoSubject());
                                        StringBuilder A108 = AnonymousClass000.A10();
                                        A108.append("verifysms/getServiceCenterAddress ");
                                        C17890vO.A1A(A108, smsMessage.getServiceCenterAddress());
                                    } catch (NullPointerException e) {
                                        Log.e("verifysms", e);
                                    }
                                    if (str2 == null) {
                                        Log.i("receivedtextreceiver/message-null");
                                    } else {
                                        C17900vP.A0f("verifysms/text-receiver/", str2, AnonymousClass000.A10());
                                        String A002 = A00(r3, str2);
                                        if (A002 == null) {
                                            Log.w("verifysms/text-receiver/not_sms_verification");
                                        } else if (C20099A7c.A01(A002, -1) != -1) {
                                            this.A00 = true;
                                            abortBroadcast();
                                            verifyPhoneNumber.A4l(A002);
                                        } else {
                                            Log.w("verifysms/text-receiver/no-code");
                                            A9B.A0U(this.A02, "server-send-mismatch-empty");
                                        }
                                    }
                                }
                            } catch (OutOfMemoryError e2) {
                                Log.e("verifysms/text/out-of-memory ", e2);
                            }
                        }
                        return;
                    }
                }
            }
        }
        Log.i(str);
    }

    public AnonymousClass8C9(C19830z4 r2, VerifyPhoneNumber verifyPhoneNumber) {
        this();
        this.A03 = AnonymousClass3MW.A0z(verifyPhoneNumber);
        this.A02 = r2;
    }

    public AnonymousClass8C9() {
        this.A04 = false;
        this.A01 = C17880vN.A0p();
    }
}
