package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;

/* renamed from: X.6g8  reason: invalid class name */
public final class AnonymousClass6g8 {
    public final Intent A00;
    public final Drawable A01;
    public final CharSequence A02;

    public AnonymousClass6g8(Intent intent, ActivityInfo activityInfo, Drawable drawable, CharSequence charSequence) {
        C18070vi.A0d(intent, 1);
        Intent intent2 = new Intent(intent);
        intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        this.A00 = intent2;
        this.A01 = drawable;
        this.A02 = charSequence;
    }
}
