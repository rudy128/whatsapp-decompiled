package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7MB  reason: invalid class name */
public final class AnonymousClass7MB implements B9S {
    public static final Set A04 = C200410p.A0S(new String[]{"com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareDefaultAlias", "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasActionClarify", "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasFamilyConsistency"});
    public final AnonymousClass118 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass178 A02;
    public final AnonymousClass12C A03;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.6gX] */
    public C128696gX BZ9(Context context, String str, List list) {
        Object obj;
        Intent intent;
        Intent intent2;
        Object obj2;
        C17960vV.A00();
        ? obj3 = new Object();
        C138106wX A002 = C138106wX.A02.A00(context, this.A03, list);
        int i = A002.A00;
        if (i != 0) {
            Map map = A002.A01;
            ArrayList A13 = AnonymousClass000.A13();
            Iterator A0l = C17890vO.A0l(map);
            while (A0l.hasNext()) {
                try {
                    obj2 = FileProvider.A00(this.A00.A00, ((C127786ev) A0l.next()).A00, C19620yd.A06);
                } catch (Throwable th) {
                    obj2 = C108945cZ.A1J(th);
                }
                if (C30671eK.A00(obj2) != null) {
                    this.A01.A0J(new AnonymousClass7RS(16, str, this.A02));
                    Log.w("getSharingIntent: Attempting to share file failed");
                    return null;
                } else if (obj2 != null) {
                    A13.add(obj2);
                }
            }
            Intent A0A = C17880vN.A0A();
            String str2 = "*/*";
            switch (i) {
                case 1:
                case 4:
                    str2 = "image/png";
                    break;
                case 2:
                case 5:
                    str2 = "audio/ogg; codecs=opus";
                    break;
                case 7:
                    break;
                default:
                    str2 = "video/mp4";
                    break;
            }
            Intent type = A0A.setType(str2);
            C18070vi.A0X(type);
            if (A13.size() == 1) {
                type.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", (Parcelable) A13.get(0));
            } else if (A13.size() > 1) {
                type.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", A13);
            }
            ArrayList A132 = AnonymousClass000.A13();
            try {
                obj = this.A00.A00.getPackageManager().queryIntentActivities(type, 65536);
            } catch (Throwable th2) {
                obj = C108945cZ.A1J(th2);
            }
            Object obj4 = C18460wS.A00;
            if (obj instanceof AnonymousClass1IU) {
                obj = obj4;
            }
            List<ResolveInfo> list2 = (List) obj;
            if (!list2.isEmpty()) {
                if (Build.VERSION.SDK_INT < 29) {
                    int size = list2.size();
                    boolean z = false;
                    for (ResolveInfo resolveInfo : list2) {
                        String str3 = resolveInfo.activityInfo.name;
                        C18070vi.A0b(str3);
                        if (!AnonymousClass1YE.A0A(str3, "com.facebook.", false)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            C18070vi.A0W(activityInfo);
                            Intent intent3 = new Intent(type);
                            intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                            A132.add(intent3);
                        } else if (!z && A04.contains(str3)) {
                            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                            C18070vi.A0W(activityInfo2);
                            Intent intent4 = new Intent(type);
                            intent4.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                            A132.add(intent4);
                            z = true;
                        }
                    }
                    if (size != A132.size() && z) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 29) {
                            intent = Intent.createChooser(type, (CharSequence) null);
                            C18070vi.A0X(intent);
                        } else {
                            if (i2 >= 23) {
                                intent2 = C17880vN.A0A();
                            } else {
                                intent2 = (Intent) A132.remove(0);
                            }
                            intent = Intent.createChooser(intent2, (CharSequence) null);
                            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) A132.toArray(new Parcelable[0]));
                        }
                        intent.addFlags(268435456);
                        obj3.A02 = A13;
                        obj3.A01 = intent;
                        return obj3;
                    }
                }
                intent = Intent.createChooser(type, (CharSequence) null);
                if (intent == null) {
                    return obj3;
                }
                intent.addFlags(268435456);
                obj3.A02 = A13;
                obj3.A01 = intent;
                return obj3;
            }
        }
        return obj3;
    }

    public AnonymousClass7MB(AnonymousClass1KB r1, AnonymousClass118 r2, AnonymousClass178 r3, AnonymousClass12C r4) {
        C108985cd.A1D(r3, r4);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
