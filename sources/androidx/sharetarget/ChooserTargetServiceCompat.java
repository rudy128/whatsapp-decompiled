package androidx.sharetarget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8BS;
import X.AnonymousClass9UK;
import X.C108945cZ;
import X.C139656zE;
import X.C17880vN;
import X.C17890vO;
import X.C185299cM;
import X.C185309cN;
import X.C197439wh;
import X.C21341AiU;
import X.C21491Al0;
import X.C21499Al8;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ChooserTargetServiceCompat extends ChooserTargetService {
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Bitmap bitmap;
        C185299cM r0;
        Context applicationContext = getApplicationContext();
        if (C197439wh.A01 == null) {
            synchronized (C197439wh.A00) {
                if (C197439wh.A01 == null) {
                    ArrayList A13 = AnonymousClass000.A13();
                    Intent A0G = C108945cZ.A0G("android.intent.action.MAIN");
                    A0G.addCategory("android.intent.category.LAUNCHER");
                    A0G.setPackage(applicationContext.getPackageName());
                    List<ResolveInfo> queryIntentActivities = applicationContext.getPackageManager().queryIntentActivities(A0G, 128);
                    if (queryIntentActivities != null) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            Bundle bundle = activityInfo.metaData;
                            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                                ArrayList A132 = AnonymousClass000.A13();
                                XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(applicationContext.getPackageManager(), "android.app.shortcuts");
                                if (loadXmlMetaData == null) {
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    A10.append("Failed to open android.app.shortcuts meta-data resource of ");
                                    throw AnonymousClass001.A12(activityInfo.name, A10);
                                }
                                while (true) {
                                    try {
                                        int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break;
                                        } else if (next == 2 && loadXmlMetaData.getName().equals("share-target")) {
                                            String A00 = C197439wh.A00(loadXmlMetaData, "targetClass");
                                            ArrayList A133 = AnonymousClass000.A13();
                                            ArrayList A134 = AnonymousClass000.A13();
                                            while (true) {
                                                int next2 = loadXmlMetaData.next();
                                                if (next2 != 1) {
                                                    if (next2 != 2) {
                                                        if (next2 == 3 && loadXmlMetaData.getName().equals("share-target")) {
                                                            break;
                                                        }
                                                    } else {
                                                        String name = loadXmlMetaData.getName();
                                                        if (name.equals("data")) {
                                                            C197439wh.A00(loadXmlMetaData, "scheme");
                                                            C197439wh.A00(loadXmlMetaData, "host");
                                                            C197439wh.A00(loadXmlMetaData, "port");
                                                            C197439wh.A00(loadXmlMetaData, "path");
                                                            C197439wh.A00(loadXmlMetaData, "pathPattern");
                                                            C197439wh.A00(loadXmlMetaData, "pathPrefix");
                                                            A133.add(new AnonymousClass9UK(C197439wh.A00(loadXmlMetaData, "mimeType")));
                                                        } else if (name.equals("category")) {
                                                            A134.add(C197439wh.A00(loadXmlMetaData, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            if (A133.isEmpty() || A00 == null || A134.isEmpty()) {
                                                r0 = null;
                                            } else {
                                                r0 = new C185299cM(A00, (AnonymousClass9UK[]) A133.toArray(new AnonymousClass9UK[A133.size()]), C17890vO.A1b(A134, A134.size()));
                                            }
                                            if (r0 != null) {
                                                A132.add(r0);
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                                    }
                                }
                                loadXmlMetaData.close();
                                A13.addAll(A132);
                            }
                        }
                    }
                    C197439wh.A01 = A13;
                }
            }
        }
        ArrayList arrayList = C197439wh.A01;
        ArrayList A135 = AnonymousClass000.A13();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C185299cM r4 = (C185299cM) it.next();
            if (r4.A00.equals(componentName.getClassName())) {
                AnonymousClass9UK[] r3 = r4.A01;
                int length = r3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(r3[i].A00)) {
                        A135.add(r4);
                        break;
                    }
                    i++;
                }
            }
        }
        if (!A135.isEmpty()) {
            ShortcutInfoCompatSaverImpl instance = ShortcutInfoCompatSaverImpl.getInstance(applicationContext);
            try {
                List<C139656zE> A002 = instance.A00();
                if (A002 != null && !A002.isEmpty()) {
                    ArrayList A136 = AnonymousClass000.A13();
                    for (C139656zE r5 : A002) {
                        Iterator it2 = A135.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C185299cM r42 = (C185299cM) it2.next();
                            if (r5.A0F.containsAll(Arrays.asList(r42.A02))) {
                                A136.add(new C21341AiU(new ComponentName(applicationContext.getPackageName(), r42.A00), r5));
                                break;
                            }
                        }
                    }
                    if (A136.isEmpty()) {
                        return AnonymousClass000.A13();
                    }
                    Collections.sort(A136);
                    ArrayList A137 = AnonymousClass000.A13();
                    int i2 = ((C21341AiU) AnonymousClass8BS.A0Y(A136)).A01.A02;
                    Iterator it3 = A136.iterator();
                    float f = 1.0f;
                    while (it3.hasNext()) {
                        C21341AiU aiU = (C21341AiU) it3.next();
                        C139656zE r7 = aiU.A01;
                        Icon icon = null;
                        try {
                            C185309cN r9 = (C185309cN) instance.A05.submit(new C21491Al0(0, r7.A0D, instance)).get();
                            iconCompat = null;
                            if (r9 != null) {
                                String str = r9.A02;
                                if (!TextUtils.isEmpty(str)) {
                                    try {
                                        Context context = instance.A00;
                                        int identifier = context.getResources().getIdentifier(str, (String) null, (String) null);
                                        if (identifier != 0) {
                                            iconCompat = IconCompat.A02(context.getResources(), context.getPackageName(), identifier);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                if (!TextUtils.isEmpty(r9.A01) && (bitmap = (Bitmap) instance.A06.submit(new C21499Al8(r9, instance, 0)).get()) != null) {
                                    iconCompat = IconCompat.A03(bitmap);
                                }
                            }
                        } catch (Exception e2) {
                            Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e2);
                            iconCompat = null;
                        }
                        Bundle A0D = C17880vN.A0D();
                        A0D.putString("android.intent.extra.shortcut.ID", r7.A0D);
                        int i3 = r7.A02;
                        if (i2 != i3) {
                            f -= 0.01f;
                            i2 = i3;
                        }
                        CharSequence charSequence = r7.A0B;
                        if (iconCompat != null) {
                            icon = iconCompat.A09();
                        }
                        A137.add(new ChooserTarget(charSequence, icon, f, aiU.A00, A0D));
                    }
                    return A137;
                }
            } catch (Exception e3) {
                Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e3);
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }
}
