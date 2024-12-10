package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.79t  reason: invalid class name and case insensitive filesystem */
public class C1425179t implements AnonymousClass84Y {
    public int A00;
    public RemoteViews A01;
    public final Notification.Builder A02;
    public final Context A03;
    public final Bundle A04 = C17880vN.A0D();
    public final C1409673t A05;
    public final List A06 = AnonymousClass000.A13();

    public C1425179t(C1409673t r25) {
        Notification.Builder builder;
        Icon A0A;
        ArrayList arrayList;
        int i;
        Bundle[] bundleArr;
        int i2;
        Notification.Action.Builder A002;
        Icon icon;
        Bitmap A07;
        C1409673t r7 = r25;
        this.A05 = r7;
        Context context = r7.A0C;
        this.A03 = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = C1408273f.A00(context, r7.A0M);
        } else {
            builder = new Notification.Builder(context);
        }
        this.A02 = builder;
        Notification notification = r7.A08;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing(AnonymousClass000.A1O(notification.flags & 2)).setOnlyAlertOnce(AnonymousClass000.A1O(notification.flags & 8)).setAutoCancel(AnonymousClass000.A1O(notification.flags & 16)).setDefaults(notification.defaults).setContentTitle(r7.A0J).setContentText(r7.A0I).setContentInfo((CharSequence) null).setContentIntent(r7.A0A).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(r7.A0B, AnonymousClass000.A1O(notification.flags & 128)).setNumber(r7.A02).setProgress(r7.A05, r7.A04, r7.A0X);
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builder2 = this.A02;
        IconCompat iconCompat = r7.A0H;
        if (i3 < 23) {
            if (iconCompat == null) {
                A07 = null;
            } else {
                A07 = iconCompat.A07();
            }
            builder2.setLargeIcon(A07);
        } else {
            if (iconCompat == null) {
                A0A = null;
            } else {
                A0A = iconCompat.A0A(context);
            }
            C1401470b.A01(builder2, A0A);
        }
        this.A02.setSubText((CharSequence) null).setUsesChronometer(r7.A0a).setPriority(r7.A03);
        Iterator it = r7.A0Q.iterator();
        while (it.hasNext()) {
            C139316yd r8 = (C139316yd) it.next();
            IconCompat A003 = r8.A00();
            if (Build.VERSION.SDK_INT >= 23) {
                if (A003 != null) {
                    icon = A003.A09();
                } else {
                    icon = null;
                }
                A002 = C1401470b.A00(r8.A01, icon, r8.A02);
            } else {
                if (A003 != null) {
                    i2 = A003.A05();
                } else {
                    i2 = 0;
                }
                A002 = A00(r8.A01, r8.A02, i2);
            }
            C129536hx[] r12 = r8.A08;
            if (r12 != null) {
                int length = r12.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i4 = 0; i4 < length; i4++) {
                    remoteInputArr[i4] = C137046up.A00(r12[i4]);
                }
                for (int i5 = 0; i5 < length; i5++) {
                    A03(A002, remoteInputArr[i5]);
                }
            }
            Bundle bundle = new Bundle(r8.A07);
            boolean z = r8.A03;
            bundle.putBoolean("android.support.allowGeneratedReplies", z);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                C1401570c.A00(A002, z);
            }
            int i7 = r8.A06;
            bundle.putInt("android.support.action.semanticAction", i7);
            if (i6 >= 28) {
                C137026un.A00(A002, i7);
                if (i6 >= 29) {
                    C1401670d.A00(A002);
                    if (i6 >= 31) {
                        AnonymousClass6V9.A00(A002);
                    }
                }
            }
            bundle.putBoolean("android.support.action.showsUserInterface", r8.A04);
            A04(A002, bundle);
            A05(A01(A002), this.A02);
        }
        Bundle bundle2 = r7.A0D;
        if (bundle2 != null) {
            this.A04.putAll(bundle2);
        }
        this.A01 = r7.A0E;
        this.A02.setShowWhen(r7.A0Y);
        int i8 = Build.VERSION.SDK_INT;
        A0F(this.A02, r7.A0W);
        A0C(this.A02, r7.A0N);
        A0D(this.A02, r7.A0P);
        A0E(this.A02, r7.A0V);
        this.A00 = r7.A01;
        A0B(this.A02, r7.A0L);
        A06(this.A02, r7.A00);
        A07(this.A02, r7.A06);
        A08(this.A02, r7.A09);
        A09(this.A02, notification.sound, notification.audioAttributes);
        if (i8 < 28) {
            ArrayList arrayList2 = r7.A0T;
            ArrayList A0g = C108975cc.A0g(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C136826uT r1 = (C136826uT) it2.next();
                String str = r1.A03;
                if (str == null) {
                    CharSequence charSequence = r1.A01;
                    if (charSequence != null) {
                        str = AnonymousClass001.A1E(charSequence, "name:", AnonymousClass000.A10());
                    } else {
                        str = "";
                    }
                }
                A0g.add(str);
            }
            ArrayList arrayList3 = r7.A0S;
            AnonymousClass016 r0 = new AnonymousClass016(A0g.size() + arrayList3.size());
            r0.addAll(A0g);
            r0.addAll(arrayList3);
            arrayList = C17880vN.A10(r0);
        } else {
            arrayList = r7.A0S;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                A0A(this.A02, C17880vN.A0v(it3));
            }
        }
        ArrayList arrayList4 = r7.A0R;
        if (arrayList4.size() > 0) {
            Bundle bundle3 = r7.A0D;
            if (bundle3 == null) {
                bundle3 = C17880vN.A0D();
                r7.A0D = bundle3;
            }
            Bundle bundle4 = bundle3.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? C17880vN.A0D() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle A0D = C17880vN.A0D();
            for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                String num = Integer.toString(i9);
                C139316yd r11 = (C139316yd) arrayList4.get(i9);
                Bundle A0D2 = C17880vN.A0D();
                IconCompat A004 = r11.A00();
                if (A004 != null) {
                    i = A004.A05();
                } else {
                    i = 0;
                }
                A0D2.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i);
                A0D2.putCharSequence("title", r11.A02);
                A0D2.putParcelable("actionIntent", r11.A01);
                Bundle bundle6 = new Bundle(r11.A07);
                bundle6.putBoolean("android.support.allowGeneratedReplies", r11.A03);
                A0D2.putBundle("extras", bundle6);
                C129536hx[] r02 = r11.A08;
                C129536hx[] r16 = r02;
                if (r02 == null) {
                    bundleArr = null;
                } else {
                    int length2 = r02.length;
                    int i10 = length2;
                    bundleArr = new Bundle[length2];
                    for (int i11 = 0; i11 < i10; i11++) {
                        C129536hx r15 = r16[i11];
                        Bundle A0D3 = C17880vN.A0D();
                        A0D3.putString("resultKey", r15.A02);
                        A0D3.putCharSequence("label", r15.A01);
                        A0D3.putCharSequenceArray("choices", r15.A04);
                        A0D3.putBoolean("allowFreeFormInput", true);
                        A0D3.putBundle("extras", r15.A00);
                        Set set = r15.A03;
                        Set<Object> set2 = set;
                        if (!set.isEmpty()) {
                            ArrayList A0z = C17880vN.A0z(set2.size());
                            for (Object add : set2) {
                                A0z.add(add);
                            }
                            A0D3.putStringArrayList("allowedDataTypes", A0z);
                        }
                        bundleArr[i11] = A0D3;
                    }
                }
                A0D2.putParcelableArray("remoteInputs", bundleArr);
                A0D2.putBoolean("showsUserInterface", r11.A04);
                A0D2.putInt("semanticAction", r11.A06);
                A0D.putBundle(num, A0D2);
            }
            Bundle bundle7 = A0D;
            bundle4.putBundle("invisible_actions", bundle7);
            bundle5.putBundle("invisible_actions", bundle7);
            Bundle bundle8 = r7.A0D;
            if (bundle8 == null) {
                bundle8 = C17880vN.A0D();
                r7.A0D = bundle8;
            }
            String str2 = "android.car.EXTENSIONS";
            bundle8.putBundle(str2, bundle4);
            this.A04.putBundle(str2, bundle5);
        }
        if (i8 >= 23) {
            Object obj = r7.A0K;
            if (obj != null) {
                C1401470b.A02(this.A02, obj);
            }
            if (i8 >= 24) {
                this.A02.setExtras(r7.A0D);
                C1401570c.A01(this.A02);
                RemoteViews remoteViews = r7.A0E;
                if (remoteViews != null) {
                    C1401570c.A02(this.A02, remoteViews);
                }
                if (i8 >= 26) {
                    C1408273f.A01(this.A02);
                    C1408273f.A02(this.A02);
                    C1408273f.A05(this.A02, r7.A0O);
                    C1408273f.A04(this.A02, r7.A07);
                    C1408273f.A03(this.A02, r7.A01);
                    if (!TextUtils.isEmpty(r7.A0M)) {
                        this.A02.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
                    }
                    if (i8 >= 28) {
                        Iterator it4 = r7.A0T.iterator();
                        while (it4.hasNext()) {
                            C137026un.A01(this.A02, ((C136826uT) it4.next()).A00());
                        }
                        if (i8 >= 29) {
                            C1401670d.A02(this.A02, r7.A0U);
                            C1401670d.A01(C128226fe.A00(r7.A0F), this.A02);
                        }
                    }
                }
            }
        }
        if (r7.A0Z) {
            if (this.A05.A0V) {
                this.A00 = 2;
            } else {
                this.A00 = 1;
            }
            this.A02.setVibrate((long[]) null);
            this.A02.setSound((Uri) null);
            int i12 = notification.defaults & -2;
            notification.defaults = i12;
            int i13 = i12 & -3;
            notification.defaults = i13;
            this.A02.setDefaults(i13);
            if (i8 >= 26) {
                if (TextUtils.isEmpty(this.A05.A0N)) {
                    A0C(this.A02, "silent");
                }
                C1408273f.A03(this.A02, this.A00);
            }
        }
    }

    public static Notification.Action.Builder A00(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static void A09(Notification.Builder builder, Uri uri, Object obj) {
        builder.setSound(uri, (AudioAttributes) obj);
    }

    public Notification A0G() {
        RemoteViews remoteViews;
        Notification build;
        C1409673t r3 = this.A05;
        AnonymousClass72G r2 = r3.A0G;
        if (r2 != null) {
            r2.A06(this);
            remoteViews = r2.A04();
        } else {
            remoteViews = null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            build = this.A02.build();
        } else {
            Notification.Builder builder = this.A02;
            if (i >= 24) {
                build = builder.build();
            } else {
                builder.setExtras(this.A04);
                build = builder.build();
                RemoteViews remoteViews2 = this.A01;
                if (remoteViews2 != null) {
                    build.contentView = remoteViews2;
                }
            }
            int i2 = this.A00;
            if (i2 != 0) {
                if (!(A02(build) == null || (build.flags & 512) == 0 || i2 != 2)) {
                    build.sound = null;
                    build.vibrate = null;
                    int i3 = build.defaults & -2;
                    build.defaults = i3;
                    build.defaults = i3 & -3;
                }
                if (A02(build) != null && (build.flags & 512) == 0 && i2 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    int i4 = build.defaults & -2;
                    build.defaults = i4;
                    build.defaults = i4 & -3;
                }
            }
        }
        if (!(remoteViews == null && (remoteViews = r3.A0E) == null)) {
            build.contentView = remoteViews;
        }
        if (r2 != null) {
            RemoteViews A032 = r2.A03();
            if (A032 != null) {
                build.bigContentView = A032;
            }
            Bundle bundle = build.extras;
            if (bundle != null) {
                r2.A05(bundle);
            }
        }
        return build;
    }

    public static Notification.Action A01(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static String A02(Notification notification) {
        return notification.getGroup();
    }

    public static void A03(Notification.Action.Builder builder, RemoteInput remoteInput) {
        builder.addRemoteInput(remoteInput);
    }

    public static void A04(Notification.Action.Builder builder, Bundle bundle) {
        builder.addExtras(bundle);
    }

    public static void A05(Notification.Action action, Notification.Builder builder) {
        builder.addAction(action);
    }

    public static void A06(Notification.Builder builder, int i) {
        builder.setColor(i);
    }

    public static void A07(Notification.Builder builder, int i) {
        builder.setVisibility(i);
    }

    public static void A08(Notification.Builder builder, Notification notification) {
        builder.setPublicVersion(notification);
    }

    public static void A0A(Notification.Builder builder, String str) {
        builder.addPerson(str);
    }

    public static void A0B(Notification.Builder builder, String str) {
        builder.setCategory(str);
    }

    public static void A0C(Notification.Builder builder, String str) {
        builder.setGroup(str);
    }

    public static void A0D(Notification.Builder builder, String str) {
        builder.setSortKey(str);
    }

    public static void A0E(Notification.Builder builder, boolean z) {
        builder.setGroupSummary(z);
    }

    public static void A0F(Notification.Builder builder, boolean z) {
        builder.setLocalOnly(z);
    }
}
