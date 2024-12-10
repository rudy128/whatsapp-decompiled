package androidx.core.app;

import X.AnonymousClass000;
import X.AnonymousClass6V2;
import X.AnonymousClass72G;
import X.AnonymousClass84Y;
import X.C139316yd;
import X.C1409673t;
import X.C1425179t;
import X.C72453Mb;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCompat$DecoratedCustomViewStyle extends AnonymousClass72G {
    private RemoteViews A00(RemoteViews remoteViews, boolean z) {
        boolean z2;
        int min;
        long j;
        long j2;
        int i;
        int i2 = 0;
        Resources resources = this.A00.A0C.getResources();
        RemoteViews remoteViews2 = new RemoteViews(this.A00.A0C.getPackageName(), 2131626278);
        int i3 = 1;
        int i4 = 0;
        C1409673t r1 = this.A00;
        if (r1.A0H != null) {
            remoteViews2.setViewVisibility(2131431496, 0);
            remoteViews2.setImageViewBitmap(2131431496, AnonymousClass72G.A02(this, this.A00.A0H, 0, 0));
            if (this.A00.A08.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(2131168079);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(2131168081) * 2);
                C1409673t r5 = this.A00;
                remoteViews2.setImageViewBitmap(2131434715, AnonymousClass72G.A01(this, r5.A08.icon, dimensionPixelSize, dimensionPixelSize2, r5.A00));
                remoteViews2.setViewVisibility(2131434715, 0);
            }
        } else if (r1.A08.icon != 0) {
            remoteViews2.setViewVisibility(2131431496, 0);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(2131168076) - resources.getDimensionPixelSize(2131168073);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(2131168082);
            C1409673t r52 = this.A00;
            remoteViews2.setImageViewBitmap(2131431496, AnonymousClass72G.A01(this, r52.A08.icon, dimensionPixelSize3, dimensionPixelSize4, r52.A00));
        }
        CharSequence charSequence = this.A00.A0J;
        if (charSequence != null) {
            remoteViews2.setTextViewText(2131436208, charSequence);
        }
        CharSequence charSequence2 = this.A00.A0I;
        if (charSequence2 != null) {
            remoteViews2.setTextViewText(2131436044, charSequence2);
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = 0;
        if (this.A00.A02 > 0) {
            if (this.A00.A02 > resources.getInteger(2131492939)) {
                i = 2131431625;
                remoteViews2.setTextViewText(2131431625, resources.getString(2131899442));
            } else {
                i = 2131431625;
                remoteViews2.setTextViewText(2131431625, NumberFormat.getIntegerInstance().format((long) this.A00.A02));
            }
            remoteViews2.setViewVisibility(i, 0);
            z2 = true;
            i5 = 1;
        } else {
            remoteViews2.setViewVisibility(2131431625, 8);
        }
        C1409673t r6 = this.A00;
        if (!r6.A0Y || r6.A08.when == 0) {
            i3 = i5;
        } else if (r6.A0a) {
            remoteViews2.setViewVisibility(2131429108, 0);
            C1409673t r12 = this.A00;
            if (r12.A0Y) {
                j2 = r12.A08.when;
            } else {
                j2 = 0;
            }
            remoteViews2.setLong(2131429108, "setBase", j2 + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
            remoteViews2.setBoolean(2131429108, "setStarted", true);
        } else {
            remoteViews2.setViewVisibility(2131436190, 0);
            C1409673t r13 = this.A00;
            if (r13.A0Y) {
                j = r13.A08.when;
            } else {
                j = 0;
            }
            remoteViews2.setLong(2131436190, "setTime", j);
        }
        remoteViews2.setViewVisibility(2131434720, C72453Mb.A07(i3));
        if (!z2) {
            i4 = 8;
        }
        remoteViews2.setViewVisibility(2131431992, i4);
        remoteViews2.removeAllViews(2131427546);
        ArrayList arrayList = this.A00.A0Q;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A13.add(it.next());
        }
        if (!z || (min = Math.min(A13.size(), 3)) <= 0) {
            i2 = 8;
        } else {
            int i6 = 0;
            do {
                C139316yd r11 = (C139316yd) A13.get(i6);
                PendingIntent pendingIntent = r11.A01;
                boolean A1X = AnonymousClass000.A1X(pendingIntent);
                String packageName = this.A00.A0C.getPackageName();
                int i7 = 2131626270;
                if (A1X) {
                    i7 = 2131626271;
                }
                RemoteViews remoteViews3 = new RemoteViews(packageName, i7);
                IconCompat A00 = r11.A00();
                if (A00 != null) {
                    remoteViews3.setImageViewBitmap(2131427498, AnonymousClass72G.A02(this, A00, 2131101980, 0));
                }
                CharSequence charSequence3 = r11.A02;
                remoteViews3.setTextViewText(2131427528, charSequence3);
                if (!A1X) {
                    remoteViews3.setOnClickPendingIntent(2131427490, pendingIntent);
                }
                remoteViews3.setContentDescription(2131427490, charSequence3);
                remoteViews2.addView(2131427546, remoteViews3);
                i6++;
            } while (i6 < min);
        }
        remoteViews2.setViewVisibility(2131427546, i2);
        remoteViews2.setViewVisibility(2131427492, i2);
        remoteViews2.setViewVisibility(2131436208, 8);
        remoteViews2.setViewVisibility(2131436046, 8);
        remoteViews2.setViewVisibility(2131436044, 8);
        remoteViews2.removeAllViews(2131433209);
        remoteViews2.addView(2131433209, remoteViews.clone());
        remoteViews2.setViewVisibility(2131433209, 0);
        Resources resources2 = this.A00.A0C.getResources();
        int dimensionPixelSize5 = resources2.getDimensionPixelSize(2131168084);
        int dimensionPixelSize6 = resources2.getDimensionPixelSize(2131168085);
        float f = resources2.getConfiguration().fontScale;
        if (f < 1.0f) {
            f = 1.0f;
        } else if (f > 1.3f) {
            f = 1.3f;
        }
        float f2 = (f - 1.0f) / 0.29999995f;
        remoteViews2.setViewPadding(2131433210, 0, Math.round(((1.0f - f2) * ((float) dimensionPixelSize5)) + (f2 * ((float) dimensionPixelSize6))), 0, 0);
        return remoteViews2;
    }

    public RemoteViews A03() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.A00.A0E) == null) {
            return null;
        }
        return A00(remoteViews, true);
    }

    public RemoteViews A04() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.A00.A0E) == null) {
            return null;
        }
        return A00(remoteViews, false);
    }

    public void A06(AnonymousClass84Y r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((C1425179t) r3).A02.setStyle(AnonymousClass6V2.A00());
        }
    }
}
