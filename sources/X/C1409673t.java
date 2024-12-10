package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: X.73t  reason: invalid class name and case insensitive filesystem */
public class C1409673t {
    public int A00 = 0;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 0;
    public long A07;
    public Notification A08;
    public Notification A09;
    public PendingIntent A0A;
    public PendingIntent A0B;
    public Context A0C;
    public Bundle A0D;
    public RemoteViews A0E;
    public C128226fe A0F;
    public AnonymousClass72G A0G;
    public IconCompat A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public Object A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public ArrayList A0Q = AnonymousClass000.A13();
    public ArrayList A0R = AnonymousClass000.A13();
    @Deprecated
    public ArrayList A0S;
    public ArrayList A0T = AnonymousClass000.A13();
    public boolean A0U;
    public boolean A0V;
    public boolean A0W = false;
    public boolean A0X;
    public boolean A0Y = true;
    public boolean A0Z;
    public boolean A0a;

    public static AudioAttributes.Builder A01(AudioAttributes.Builder builder) {
        return builder.setContentType(4);
    }

    public static AudioAttributes.Builder A02(AudioAttributes.Builder builder) {
        return builder.setUsage(5);
    }

    public void A0H(boolean z) {
        Notification notification = this.A08;
        int i = notification.flags;
        int i2 = 2 | i;
        if (!z) {
            i2 = -3 & i;
        }
        notification.flags = i2;
    }

    public static AudioAttributes.Builder A00() {
        return new AudioAttributes.Builder();
    }

    public static CharSequence A04(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 5120) {
            return charSequence;
        }
        return charSequence.subSequence(0, 5120);
    }

    public Notification A05() {
        return new C1425179t(this).A0G();
    }

    public void A06(int i) {
        Notification notification = this.A08;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public void A07(int i, int i2, boolean z) {
        this.A05 = i;
        this.A04 = i2;
        this.A0X = z;
    }

    public void A08(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.A0Q.add(new C139316yd(i, charSequence, pendingIntent));
    }

    public void A09(long j) {
        this.A08.when = j;
    }

    public void A0A(Uri uri) {
        Notification notification = this.A08;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = A03(A02(A01(A00())));
    }

    public void A0B(AnonymousClass72G r2) {
        if (this.A0G != r2) {
            this.A0G = r2;
            if (r2.A00 != this) {
                r2.A00 = this;
                A0B(r2);
            }
        }
    }

    public void A0C(IconCompat iconCompat) {
        this.A0K = iconCompat.A0A(this.A0C);
    }

    public void A0F(CharSequence charSequence) {
        this.A08.tickerText = A04(charSequence);
    }

    public void A0G(boolean z) {
        Notification notification = this.A08;
        int i = notification.flags;
        int i2 = 16 | i;
        if (!z) {
            i2 = -17 & i;
        }
        notification.flags = i2;
    }

    public C1409673t(Context context, String str) {
        Notification notification = new Notification();
        this.A08 = notification;
        this.A0C = context;
        this.A0M = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.A03 = 0;
        this.A0S = AnonymousClass000.A13();
        this.A0U = true;
    }

    public static AudioAttributes A03(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public void A0D(CharSequence charSequence) {
        this.A0I = A04(charSequence);
    }

    public void A0E(CharSequence charSequence) {
        this.A0J = A04(charSequence);
    }
}
