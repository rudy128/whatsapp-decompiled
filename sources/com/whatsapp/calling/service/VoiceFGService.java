package com.whatsapp.calling.service;

import X.A69;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass112;
import X.AnonymousClass18K;
import X.AnonymousClass195;
import X.AnonymousClass1LU;
import X.AnonymousClass1V7;
import X.AnonymousClass3MY;
import X.AnonymousClass62G;
import X.AnonymousClass6Fx;
import X.AnonymousClass7KP;
import X.AnonymousClass7KX;
import X.C108945cZ;
import X.C108955ca;
import X.C137046up;
import X.C139916ze;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C196309up;
import X.C22941Dw;
import X.C72453Mb;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.DirectReplyService;
import com.whatsapp.util.Log;
import java.util.Locale;

public final class VoiceFGService extends AnonymousClass6Fx {
    public static volatile Notification A06;
    public static volatile Bundle A07;
    public AnonymousClass195 A00;
    public AnonymousClass1V7 A01;
    public AnonymousClass18K A02;
    public AnonymousClass1LU A03;
    public AnonymousClass00H A04;
    public boolean A05 = false;

    private void A00(Notification notification, Bundle bundle, int i) {
        boolean A062;
        int i2;
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (notification == null || bundle == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voicefgservice/handleStartService failed, null vars -- notif ");
            A10.append(AnonymousClass000.A1X(notification));
            A10.append(", extras: ");
            if (bundle != null) {
                z2 = false;
            }
            A10.append(z2);
            C17890vO.A0w(A10);
            return;
        }
        if (bundle.getBoolean("com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", false) && i != -1) {
            Log.i("voicefgservice/handleStartService stopForegroundState");
            AnonymousClass7KX.A00(C17880vN.A0V(this.A04), 6);
            stopForeground(true);
        }
        int i3 = bundle.getInt("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23);
        if (AnonymousClass112.A0A()) {
            boolean z4 = bundle.getBoolean("com.whatsapp.service.VoiceFgService.EXTRA_IS_CALL_ACCEPTED_VIA_BT", false);
            int i4 = 4;
            if (!this.A00.A00) {
                if (z4) {
                    i4 = 132;
                }
                z = false;
            } else {
                i2 = 132;
                if (bundle.getBoolean("com.whatsapp.service.VoiceFgService.EXTRA_IS_VIDEO_ENABLED", false)) {
                    i2 = 196;
                }
                z = bundle.getBoolean("com.whatsapp.service.VoiceFgService.EXTRA_IS_MEDIA_PROJECTION", false);
                if (z) {
                    i2 |= 32;
                }
            }
            Locale locale = Locale.US;
            Integer valueOf = Integer.valueOf(i2);
            C108955ca.A1X("voicefgservice/handleStartService: Starting fg service. Type: %d", locale, new Object[]{valueOf});
            C18030ve r6 = this.A02;
            C18040vf r3 = C18040vf.A01;
            if ((C18020vd.A00(r3, r6, 11757) & 1) == 0 || (C18020vd.A00(r3, r6, 11757) & 2) == 0) {
                A062 = A06(A06, valueOf, i, i3);
            } else {
                A062 = A02(bundle, i, i2, z4);
            }
            z3 = z;
        } else {
            A062 = A06(notification, (Integer) null, i, i3);
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voicefgservice/handleStartService -- isStarted: ");
        A102.append(A062);
        C17900vP.A0j(", notificationId: ", A102, i3);
        if (A062) {
            C17880vN.A0V(this.A04).notifyAllObservers(new AnonymousClass7KP(z3, 0));
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        AnonymousClass1V7 r2;
        A69 a69;
        if (intent == null) {
            Log.i("voicefgservice/onStartCommand: null");
            return 2;
        }
        String action = intent.getAction();
        C17900vP.A0f("voicefgservice/onStartCommand: ", action, AnonymousClass000.A10());
        if ("hangup_call".equals(action) || "reject_call".equals(action) || "reject_group_reminder".equals(action)) {
            if (!(intent.getData() == null || C137046up.A01(intent) == null)) {
                Log.i("voicefgservice/handling remoteInput");
                Intent intent2 = new Intent(intent);
                intent2.setAction("com.whatsapp.intent.action.DIRECT_REPLY_FROM_INCOMING_CALL");
                intent2.setClass(this, DirectReplyService.class);
                startService(intent2);
            }
            UserJid A022 = C22941Dw.A02(intent.getStringExtra("open_custom_message_chat_jid"));
            if (A022 != null) {
                Log.i("voicefgservice/handling custom messsage reply");
                Intent A062 = AnonymousClass3MY.A06(this, this.A03, A022);
                A062.putExtra("show_keyboard", true);
                startActivity(A062);
            }
            r2 = this.A01;
            a69 = new A69(action, intent.getExtras());
        } else if ("recreate_notification".equals(action)) {
            r2 = this.A01;
            a69 = new A69("refresh_notification");
        } else if (!"com.whatsapp.service.VoiceFgService.START".equals(action) || A06 == null) {
            Log.e("voicefgservice/onStartCommand service started with unknown action or empty notification");
            return 2;
        } else {
            A00(A06, intent.getExtras(), i2);
            return 2;
        }
        r2.A00(a69);
        return 2;
    }

    public VoiceFGService() {
        super("voicefgservice", true);
    }

    public static boolean A01(Notification notification, Context context, C139916ze r6, boolean z, boolean z2, boolean z3, boolean z4) {
        C17900vP.A0Y(notification, "voicefgservice/start-service notification:", AnonymousClass000.A10());
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23);
        A0D.putBoolean("com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", z);
        A0D.putBoolean("com.whatsapp.service.VoiceFgService.EXTRA_IS_VIDEO_ENABLED", z2);
        A0D.putBoolean("com.whatsapp.service.VoiceFgService.EXTRA_IS_CALL_ACCEPTED_VIA_BT", z4);
        if (z3) {
            A0D.putBoolean("com.whatsapp.service.VoiceFgService.EXTRA_IS_MEDIA_PROJECTION", true);
        }
        A06 = notification;
        A07 = A0D;
        return r6.A02(context, C108945cZ.A0G("com.whatsapp.service.VoiceFgService.START").putExtras(A0D), VoiceFGService.class);
    }

    private boolean A02(Bundle bundle, int i, int i2, boolean z) {
        try {
            return A06(A06, Integer.valueOf(i2), i, bundle.getInt("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23));
        } catch (SecurityException e) {
            AnonymousClass62G r3 = new AnonymousClass62G();
            r3.A00 = "calling_fg_service_security_exception";
            StringBuilder sb = new StringBuilder("PermissionChecker ");
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            boolean A1b = C72453Mb.A1b(objArr, C196309up.A00(this, "android.permission.RECORD_AUDIO"));
            sb.append(String.format(locale, "microphone: %d, ", objArr));
            if (z) {
                sb.append("btAccept, ");
            }
            if ((i2 & 64) != 0) {
                Object[] objArr2 = new Object[1];
                C17880vN.A1T(objArr2, C196309up.A00(this, "android.permission.CAMERA"), A1b ? 1 : 0);
                sb.append(String.format(locale, "camera: %d", objArr2));
            }
            String obj = sb.toString();
            r3.A01 = obj;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voicefgservice/securityException/ ");
            C17900vP.A0X(e, obj, A10);
            this.A02.CC7(r3);
            return A06(A06, C17880vN.A0k(), i, bundle.getInt("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23));
        }
    }

    public void onCreate() {
        Log.i("voicefgservice/onCreate");
        A04();
        super.onCreate();
        if ((C18020vd.A00(C18040vf.A02, this.A02, 11776) & 1) != 0) {
            A00(A06, A07, -1);
        }
    }

    public void onDestroy() {
        Log.i("voicefgservice/onDestroy");
        AnonymousClass7KX.A00(C17880vN.A0V(this.A04), 6);
        stopForeground(true);
        super.onDestroy();
    }
}
