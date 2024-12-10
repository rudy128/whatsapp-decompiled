package X;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6pG  reason: invalid class name and case insensitive filesystem */
public class C133656pG {
    public final C19880zA A00;
    public final AnonymousClass1KB A01;
    public final C18030ve A02;
    public final AnonymousClass707 A03;

    public boolean A00(Context context, Intent intent, AnonymousClass1FR r11, String str, boolean z) {
        Intent A012;
        if (z) {
            ArrayList A13 = AnonymousClass000.A13();
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str2 = activityInfo.name;
                    String str3 = activityInfo.applicationInfo.packageName;
                    Intent intent2 = new Intent(intent);
                    intent2.setClassName(str3, str2);
                    intent2.setPackage(str3);
                    if (str3.contains("gm") || str3.contains("email") || str3.contains("fsck.k9") || str3.contains("maildroid") || str3.contains("hotmail") || str3.contains("android.mail") || str3.contains("com.baydin.boomerang") || str3.contains("yandex.mail") || str3.contains("com.google.android.apps.inbox") || str3.contains("com.microsoft.office.outlook") || str3.contains("com.asus.email") || str3.equals("org.kman.AquaMail")) {
                        A13.add(intent2);
                    }
                }
            }
            int size = A13.size();
            if (size != 0) {
                if (size == 1) {
                    A012 = (Intent) A13.get(0);
                } else {
                    Object obj = A13.get(size - 1);
                    A13.remove(size - 1);
                    A13.add(0, obj);
                    A012 = AnonymousClass4aU.A01((IntentSender) null, str, A13);
                }
                context.startActivity(A012);
                return true;
            } else if (r11 != null) {
                r11.BhQ(2131889994);
                return false;
            } else {
                this.A01.A08(2131889994, 0);
                return false;
            }
        } else {
            try {
                context.startActivity(Intent.createChooser(intent, str));
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("email-sender/start-activity ", e);
                this.A01.A08(2131889994, 0);
                return false;
            }
        }
    }

    public boolean A01(AnonymousClass1FU r16, File file, String str, String str2, String str3, String str4, ArrayList arrayList, boolean z) {
        boolean z2;
        String str5;
        String str6;
        Uri A022;
        AnonymousClass1FU r10 = r16;
        String str7 = str4;
        if (str4 == null) {
            str7 = r10.getString(2131889710);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        String str8 = str;
        if (str != null) {
            A10.append(str8);
        }
        String str9 = str2;
        if (!TextUtils.isEmpty(str9)) {
            A10.append(str9);
        } else {
            A10.append("\n");
        }
        StringBuilder sb = new StringBuilder(A10.toString());
        ArrayList arrayList2 = arrayList;
        if (arrayList == null || arrayList2.isEmpty()) {
            z2 = false;
            str5 = "android.intent.action.SEND";
        } else {
            z2 = true;
            str5 = "android.intent.action.SEND_MULTIPLE";
        }
        Intent A0G = C108945cZ.A0G(str5);
        File file2 = file;
        if (file == null) {
            A0G.setType("plain/text");
            sb.append("No log file to attach.\n");
        } else {
            if (z2) {
                str6 = "*/*";
            } else {
                str6 = "application/zip";
            }
            A0G.setType(str6);
            A0G.setFlags(1);
            if (this.A03.A04()) {
                A022 = MediaProvider.A05("support", "logs");
            } else {
                A022 = C64062u9.A02(r10, file2);
            }
            if (z2) {
                arrayList2.add(A022);
            } else {
                A0G.putExtra("android.intent.extra.STREAM", A022);
            }
        }
        if (str3 != null || z) {
            String[] strArr = new String[1];
            if (str3 == null) {
                str3 = "android@support.whatsapp.com";
            }
            strArr[0] = str3;
            A0G.putExtra("android.intent.extra.EMAIL", strArr);
        }
        A0G.putExtra("android.intent.extra.SUBJECT", str7);
        A0G.putExtra("android.intent.extra.TEXT", sb.toString());
        if (z) {
            if (C18020vd.A05(C18040vf.A02, this.A02, 1664)) {
                A0G.putExtra("android.intent.extra.CC", new String[]{"bugs@whatsapp.com"});
            }
        }
        if (z2) {
            A0G.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
            ArrayList A102 = C17880vN.A10(arrayList2);
            String[] A1Z = C17880vN.A1Z();
            A1Z[0] = "application/zip";
            A1Z[1] = "image/*";
            ClipData clipData = new ClipData(str7, A1Z, new ClipData.Item((Uri) A102.get(0)));
            A102.remove(0);
            Iterator it = A102.iterator();
            while (it.hasNext()) {
                clipData.addItem(new ClipData.Item(C108945cZ.A0M(it)));
            }
            A0G.setClipData(clipData);
            A0G.setFlags(1);
        }
        return A00(r10, A0G, r10, r10.getString(2131888866), true);
    }

    public C133656pG(C19880zA r1, AnonymousClass1KB r2, C18030ve r3, AnonymousClass707 r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
