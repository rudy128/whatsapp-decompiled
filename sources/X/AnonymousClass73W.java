package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.73W  reason: invalid class name */
public final class AnonymousClass73W {
    public int A00 = -1;
    public int A01;
    public int A02 = 8388613;
    public int A03;
    public int A04 = 0;
    public int A05 = 1;
    public int A06 = 80;
    public int A07;
    public PendingIntent A08;
    public Bitmap A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C = AnonymousClass000.A13();
    public ArrayList A0D = AnonymousClass000.A13();

    public static Notification.Action.Builder A00(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        AnonymousClass73W r1 = new AnonymousClass73W();
        r1.A0C = C17880vN.A10(this.A0C);
        r1.A05 = this.A05;
        r1.A08 = this.A08;
        r1.A0D = C17880vN.A10(this.A0D);
        r1.A09 = this.A09;
        r1.A01 = this.A01;
        r1.A02 = this.A02;
        r1.A00 = this.A00;
        r1.A04 = this.A04;
        r1.A03 = this.A03;
        r1.A06 = this.A06;
        r1.A07 = this.A07;
        r1.A0B = this.A0B;
        r1.A0A = this.A0A;
        return r1;
    }

    public static Notification.Action A01(Notification.Action.Builder builder) {
        return builder.build();
    }

    public void A04(C1409673t r11) {
        int i;
        Notification.Action.Builder A002;
        Icon A092;
        Bundle A0D2 = C17880vN.A0D();
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            ArrayList A0g = C108975cc.A0g(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C139316yd r7 = (C139316yd) it.next();
                int i2 = Build.VERSION.SDK_INT;
                IconCompat A003 = r7.A00();
                if (i2 >= 23) {
                    if (A003 == null) {
                        A092 = null;
                    } else {
                        A092 = A003.A09();
                    }
                    A002 = AnonymousClass6V5.A00(r7.A01, A092, r7.A02);
                } else {
                    if (A003 == null || A003.A06() != 2) {
                        i = 0;
                    } else {
                        i = A003.A05();
                    }
                    A002 = A00(r7.A01, r7.A02, i);
                }
                Bundle bundle = new Bundle(r7.A07);
                boolean z = r7.A03;
                bundle.putBoolean("android.support.allowGeneratedReplies", z);
                if (i2 >= 24) {
                    AnonymousClass6V6.A00(A002, z);
                    if (i2 >= 31) {
                        AnonymousClass6V7.A00(A002);
                    }
                }
                A03(A002, bundle);
                C129536hx[] r72 = r7.A08;
                if (r72 != null) {
                    int length = r72.length;
                    RemoteInput[] remoteInputArr = new RemoteInput[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        remoteInputArr[i3] = C137046up.A00(r72[i3]);
                    }
                    for (int i4 = 0; i4 < length; i4++) {
                        A02(A002, remoteInputArr[i4]);
                    }
                }
                A0g.add(A01(A002));
            }
            A0D2.putParcelableArrayList("actions", A0g);
        }
        int i5 = this.A05;
        if (i5 != 1) {
            A0D2.putInt("flags", i5);
        }
        PendingIntent pendingIntent = this.A08;
        if (pendingIntent != null) {
            A0D2.putParcelable("displayIntent", pendingIntent);
        }
        ArrayList arrayList2 = this.A0D;
        if (!arrayList2.isEmpty()) {
            A0D2.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
        }
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            A0D2.putParcelable("background", bitmap);
        }
        int i6 = this.A01;
        if (i6 != 0) {
            A0D2.putInt("contentIcon", i6);
        }
        int i7 = this.A02;
        if (i7 != 8388613) {
            A0D2.putInt("contentIconGravity", i7);
        }
        int i8 = this.A00;
        if (i8 != -1) {
            A0D2.putInt("contentActionIndex", i8);
        }
        int i9 = this.A04;
        if (i9 != 0) {
            A0D2.putInt("customSizePreset", i9);
        }
        int i10 = this.A03;
        if (i10 != 0) {
            A0D2.putInt("customContentHeight", i10);
        }
        int i11 = this.A06;
        if (i11 != 80) {
            A0D2.putInt("gravity", i11);
        }
        int i12 = this.A07;
        if (i12 != 0) {
            A0D2.putInt("hintScreenTimeout", i12);
        }
        String str = this.A0B;
        if (str != null) {
            A0D2.putString("dismissalId", str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            A0D2.putString("bridgeTag", str2);
        }
        Bundle bundle2 = r11.A0D;
        if (bundle2 == null) {
            bundle2 = C17880vN.A0D();
            r11.A0D = bundle2;
        }
        bundle2.putBundle("android.wearable.EXTENSIONS", A0D2);
    }

    public static void A02(Notification.Action.Builder builder, RemoteInput remoteInput) {
        builder.addRemoteInput(remoteInput);
    }

    public static void A03(Notification.Action.Builder builder, Bundle bundle) {
        builder.addExtras(bundle);
    }
}
