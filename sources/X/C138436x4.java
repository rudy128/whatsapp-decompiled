package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* renamed from: X.6x4  reason: invalid class name and case insensitive filesystem */
public final class C138436x4 {
    public AnonymousClass6TP A00 = AnonymousClass65Q.A00;
    public AnonymousClass855 A01 = AnonymousClass7HC.A00;
    public Integer A02;
    public Long A03;
    public boolean A04;

    public static Intent A00(ResolveInfo resolveInfo, C138436x4 r4, String str) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        Intent intent = new Intent(str);
        intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent.setType(C137226v7.A00(r4.A01));
        return intent;
    }
}
