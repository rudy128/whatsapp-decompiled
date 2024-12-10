package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;

/* renamed from: X.1wH  reason: invalid class name and case insensitive filesystem */
public class C41381wH extends GoogleApiAvailabilityLight {
    public static final C41381wH A00 = new Object();
    public static final Object A01 = new Object();

    public static final AlertDialog A00(Context context, DialogInterface.OnCancelListener onCancelListener, C64172uL r7, int i) {
        AlertDialog.Builder builder;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C63692tX.A01(context, i));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = context.getResources();
        int i2 = 2131898791;
        if (i != 1) {
            i2 = 2131898798;
            if (i != 2) {
                i2 = 2131898788;
                if (i != 3) {
                    i2 = 17039370;
                }
            }
        }
        String string = resources.getString(i2);
        if (string != null) {
            builder.setPositiveButton(string, r7);
        }
        String A02 = C63692tX.A02(context, i);
        if (A02 != null) {
            builder.setTitle(A02);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    public final void A05(PendingIntent pendingIntent, Context context, int i) {
        String A02;
        String format;
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            new C23289Bed(context, this).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i == 6) {
                A02 = C63692tX.A03(context, "common_google_play_services_resolution_required_title");
            } else {
                A02 = C63692tX.A02(context, i);
            }
            if (A02 == null) {
                A02 = context.getResources().getString(2131898795);
            }
            if (i == 6 || i == 19) {
                Object A002 = C63692tX.A00(context);
                Resources resources = context.getResources();
                String A03 = C63692tX.A03(context, "common_google_play_services_resolution_required_text");
                if (A03 == null) {
                    A03 = resources.getString(2131898796);
                }
                format = String.format(resources.getConfiguration().locale, A03, new Object[]{A002});
            } else {
                format = C63692tX.A01(context, i);
            }
            Resources resources2 = context.getResources();
            Object systemService = context.getSystemService("notification");
            C18210vx.A00(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C1409673t r2 = new C1409673t(context, (String) null);
            r2.A0W = true;
            r2.A0G(true);
            r2.A0E(A02);
            ? r0 = new AnonymousClass72G();
            r0.A07(format);
            r2.A0B(r0);
            PackageManager packageManager = context.getPackageManager();
            Boolean bool = DeviceProperties.A00;
            if (bool == null) {
                boolean z = false;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                DeviceProperties.A00 = bool;
            }
            if (bool.booleanValue()) {
                r2.A08.icon = context.getApplicationInfo().icon;
                r2.A03 = 2;
                if (DeviceProperties.A00(context)) {
                    r2.A08(2131231242, resources2.getString(2131898803), pendingIntent);
                } else {
                    r2.A0A = pendingIntent;
                }
            } else {
                r2.A08.icon = 17301642;
                r2.A0F(resources2.getString(2131898795));
                r2.A09(System.currentTimeMillis());
                r2.A0A = pendingIntent;
                r2.A0D(format);
            }
            if (C25333Cde.A00()) {
                synchronized (A01) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(2131898794);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                } else {
                    if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                    }
                    r2.A0M = "com.google.android.gms.availability";
                }
                notificationManager.createNotificationChannel(notificationChannel);
                r2.A0M = "com.google.android.gms.availability";
            }
            Notification A05 = r2.A05();
            if (i == 1 || i == 2 || i == 3) {
                GooglePlayServicesUtil.A02.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, A05);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.25t, android.app.DialogFragment] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.common.SupportErrorDialogFragment, androidx.fragment.app.DialogFragment] */
    public static final void A01(Activity activity, Dialog dialog, DialogInterface.OnCancelListener onCancelListener, String str) {
        try {
            if (activity instanceof AnonymousClass1FL) {
                AnonymousClass1GP r2 = ((AnonymousClass1FL) activity).A03.A00.A03;
                ? dialogFragment = new DialogFragment();
                C18210vx.A02(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                dialogFragment.A00 = dialog;
                dialogFragment.A01 = onCancelListener;
                dialogFragment.A2C(r2, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ? dialogFragment2 = new android.app.DialogFragment();
        C18210vx.A02(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dialogFragment2.A00 = dialog;
        dialogFragment2.A01 = onCancelListener;
        dialogFragment2.show(fragmentManager, str);
    }

    public final AnonymousClass26E A04(Context context, AnonymousClass2S2 r6) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        AnonymousClass26E r2 = new AnonymousClass26E(r6);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(r2, intentFilter, 2);
        } else {
            context.registerReceiver(r2, intentFilter);
        }
        r2.A00 = context;
        if (GooglePlayServicesUtil.A03(context)) {
            return r2;
        }
        r6.A00();
        r2.A00();
        return null;
    }
}
