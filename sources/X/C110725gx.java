package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/* renamed from: X.5gx  reason: invalid class name and case insensitive filesystem */
public class C110725gx extends C005302h {
    public /* bridge */ /* synthetic */ Object A05(Intent intent, int i) {
        if (i != -1 || intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            return C29431cG.A0c(AnonymousClass6WR.A00(intent));
        }
        return data;
    }

    public /* bridge */ /* synthetic */ Intent A03(Context context, Object obj) {
        Intent A0G;
        Long l;
        String str;
        C138436x4 r9 = (C138436x4) obj;
        char A17 = C18070vi.A17(context, r9);
        if (C137226v7.A01()) {
            A0G = C108945cZ.A0G("android.provider.action.PICK_IMAGES");
            A0G.setType(C137226v7.A00(r9.A01));
            A0G.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", (r9.A00 instanceof AnonymousClass65P) ^ true ? 1 : 0);
            l = r9.A03;
            if (l != null) {
                str = "android.provider.extra.PICK_IMAGES_ACCENT_COLOR";
            }
            return A0G;
        }
        boolean A1W = AnonymousClass000.A1W(context.getPackageManager().resolveActivity(C108945cZ.A0G("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112));
        PackageManager packageManager = context.getPackageManager();
        if (A1W) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(C108945cZ.A0G("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            if (resolveActivity != null) {
                A0G = C138436x4.A00(resolveActivity, r9, "androidx.activity.result.contract.action.PICK_IMAGES");
                A0G.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", (r9.A00 instanceof AnonymousClass65P) ^ true ? 1 : 0);
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
                return C138436x4.A00(resolveActivity2, r9, "com.google.android.gms.provider.action.PICK_IMAGES");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        } else {
            A0G = C108945cZ.A0G("android.intent.action.OPEN_DOCUMENT");
            A0G.setType(C137226v7.A00(r9.A01));
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

    public /* bridge */ /* synthetic */ C03160Gv A04(Context context, Object obj) {
        return null;
    }
}
