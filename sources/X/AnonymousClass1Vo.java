package X;

import android.app.Notification;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.DeadObjectException;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.1Vo  reason: invalid class name */
public class AnonymousClass1Vo implements C27301Vn {
    public final C27311Vp A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final C18030ve A03;
    public final C27291Vm A04;
    public final C18150vq A05;

    public void BEJ(int i, String str) {
        BEK(i, (String) null, str);
    }

    public void BkR(int i, Notification notification) {
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        BkT(notification, (String) null, i, z);
    }

    public void BkS(String str, int i, Notification notification) {
        BkT(notification, str, i, true);
    }

    public static void A01(AnonymousClass1Vo r1, String str, String str2, int i) {
        try {
            r1.A00.A00.cancel(str, i);
            if (i == 1) {
                r1.BEK(59, str, str2);
            }
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                Log.e("wanotificationmanager/cancelfailed", e);
                return;
            }
            throw e;
        }
    }

    public void BES(String str) {
        BEK(27, str, "joinable call");
    }

    public String BHf(AnonymousClass1BI r4) {
        if (r4 == null) {
            return null;
        }
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(r4.getRawString().getBytes()), 0);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public void BkT(Notification notification, String str, int i, boolean z) {
        Notification notification2 = notification;
        if (Build.VERSION.SDK_INT < 26 || !TextUtils.isEmpty(notification.getChannelId())) {
            String str2 = str;
            int i2 = i;
            boolean z2 = z;
            if (C22781De.A03()) {
                if (C18020vd.A05(C18040vf.A02, this.A03, 11598)) {
                    ((C200710s) this.A05.get()).execute(new AnonymousClass3CC(notification2, this, str2, i2, z2));
                    return;
                }
            }
            A00(notification, this, str, i, z);
            return;
        }
        Log.e("wanotificationmanager/notifyfailed/channelId empty");
    }

    public AnonymousClass1Vo(AnonymousClass11P r4, AnonymousClass118 r5, C19830z4 r6, C18030ve r7, C27291Vm r8, AnonymousClass10I r9) {
        this.A01 = r4;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r8;
        this.A00 = new C27311Vp(r5.A00);
        this.A05 = new C18150vq((Object) null, new C70943Dc(r9, 4));
    }

    public static void A00(Notification notification, AnonymousClass1Vo r6, String str, int i, boolean z) {
        try {
            r6.A00.A00(str, i, notification);
            C19830z4 r2 = r6.A02;
            ((SharedPreferences) r2.A00.get()).edit().putLong("last_notif_posted_timestamp", AnonymousClass11P.A01(r6.A01)).apply();
            if (z) {
                r6.A04.A00(i, notification.getGroup());
            }
        } catch (IllegalStateException | SecurityException e) {
            e = e;
            Log.e("wanotificationmanager/notifyfailed", e);
        } catch (RuntimeException e2) {
            e = e2;
            if (!(e.getCause() instanceof DeadObjectException)) {
                throw e;
            }
            Log.e("wanotificationmanager/notifyfailed", e);
        }
    }

    public void BEK(int i, String str, String str2) {
        C22781De.A03();
        int i2 = i;
        String str3 = str;
        String str4 = str2;
        if (C22781De.A03()) {
            if (C18020vd.A05(C18040vf.A02, this.A03, 11598)) {
                ((C200710s) this.A05.get()).execute(new AnonymousClass3CA(this, str3, str4, i2, 1));
                return;
            }
        }
        A01(this, str, str2, i);
    }

    public void BER(AnonymousClass1BI r3, String str) {
        int i = 1;
        if (C22971Dz.A0V(r3)) {
            i = 59;
        }
        BEK(i, BHf(r3), str);
    }
}
