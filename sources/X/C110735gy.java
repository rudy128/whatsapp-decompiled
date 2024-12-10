package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.provider.MediaStore;

/* renamed from: X.5gy  reason: invalid class name and case insensitive filesystem */
public class C110735gy extends C005302h {
    public final int A00;

    public /* bridge */ /* synthetic */ Object A05(Intent intent, int i) {
        if (i != -1 || intent == null) {
            return C18460wS.A00;
        }
        return AnonymousClass6WR.A00(intent);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [boolean] */
    public /* bridge */ /* synthetic */ Intent A03(Context context, Object obj) {
        Intent A0G;
        int i;
        Long l;
        String str;
        int i2;
        C138436x4 r9 = (C138436x4) obj;
        ? A17 = C18070vi.A17(context, r9);
        if (C137226v7.A01()) {
            A0G = C108945cZ.A0G("android.provider.action.PICK_IMAGES");
            A0G.setType(C137226v7.A00(r9.A01));
            Integer num = r9.A02;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = this.A00;
            }
            int min = Math.min(i2, MediaStore.getPickImagesMaxLimit());
            if (min <= MediaStore.getPickImagesMaxLimit()) {
                A0G.putExtra("android.provider.extra.PICK_IMAGES_MAX", min);
                A0G.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", (r9.A00 instanceof AnonymousClass65P) ^ true ? 1 : 0);
                A0G.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", r9.A04);
                l = r9.A03;
                if (l != null) {
                    str = "android.provider.extra.PICK_IMAGES_ACCENT_COLOR";
                }
                return A0G;
            }
            throw AnonymousClass000.A0k("Max items must be less or equalsMediaStore.getPickImagesMaxLimit()");
        }
        boolean A1W = AnonymousClass000.A1W(context.getPackageManager().resolveActivity(C108945cZ.A0G("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112));
        PackageManager packageManager = context.getPackageManager();
        if (A1W) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(C108945cZ.A0G("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            if (resolveActivity != null) {
                A0G = C138436x4.A00(resolveActivity, r9, "androidx.activity.result.contract.action.PICK_IMAGES");
                Integer num2 = r9.A02;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = this.A00;
                }
                A0G.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", i);
                A0G.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", (r9.A00 instanceof AnonymousClass65P) ^ true ? 1 : 0);
                A0G.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", r9.A04);
                l = r9.A03;
                if (l != null) {
                    str = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR";
                }
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        } else if (packageManager.resolveActivity(C108945cZ.A0G("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112) != null) {
            ResolveInfo resolveActivity2 = context.getPackageManager().resolveActivity(C108945cZ.A0G("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
            if (resolveActivity2 != null) {
                ActivityInfo activityInfo = resolveActivity2.activityInfo;
                Intent A0G2 = C108945cZ.A0G("com.google.android.gms.provider.action.PICK_IMAGES");
                A0G2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                A0G2.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.A00);
                return A0G2;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        } else {
            A0G = C108945cZ.A0G("android.intent.action.OPEN_DOCUMENT");
            A0G.setType(C137226v7.A00(r9.A01));
            A0G.putExtra("android.intent.extra.ALLOW_MULTIPLE", A17);
            if (A0G.getType() == null) {
                A0G.setType("*/*");
                String[] A1Z = C17880vN.A1Z();
                A1Z[0] = "image/*";
                A1Z[A17] = "video/*";
                A0G.putExtra("android.intent.extra.MIME_TYPES", A1Z);
                return A0G;
            }
        }
        return A0G;
        A0G.putExtra(str, l);
        return A0G;
    }

    public C110735gy(int i) {
        this.A00 = i;
        if (i <= 1) {
            throw AnonymousClass000.A0k("Max items must be higher than 1");
        }
    }

    public /* bridge */ /* synthetic */ C03160Gv A04(Context context, Object obj) {
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110735gy() {
        /*
            r1 = this;
            boolean r0 = X.C137226v7.A01()
            if (r0 == 0) goto L_0x000e
            int r0 = android.provider.MediaStore.getPickImagesMaxLimit()
        L_0x000a:
            r1.<init>(r0)
            return
        L_0x000e:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110735gy.<init>():void");
    }
}
