package X;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1ac  reason: invalid class name and case insensitive filesystem */
public abstract class C28611ac {
    public List A01(Context context) {
        String str;
        String[] strArr;
        char c;
        String str2;
        if (this instanceof C28651ag) {
            strArr = new String[3];
            strArr[0] = "com.miui.miuilite";
            strArr[1] = "com.miui.miuihome";
            c = 2;
            str2 = "com.miui.miuihome2";
        } else if (this instanceof C28661ah) {
            strArr = new String[3];
            strArr[0] = "com.sonyericsson.home";
            strArr[1] = "com.sonymobile.home";
            c = 2;
            str2 = "com.sonymobile.launcher";
        } else if (this instanceof C28621ad) {
            return null;
        } else {
            if (this instanceof C28641af) {
                strArr = new String[4];
                strArr[0] = "com.sec.android.app.launcher";
                strArr[1] = "com.sec.android.app.twlauncher";
                strArr[2] = "com.sec.android.app.easylauncher";
                c = 3;
                str2 = "com.sec.android.emergencylauncher";
            } else {
                if (this instanceof C28691ak) {
                    C28691ak r5 = (C28691ak) this;
                    String str3 = Build.MANUFACTURER;
                    if (str3.equalsIgnoreCase("OPPO") || str3.equalsIgnoreCase("realme")) {
                        String str4 = Build.BRAND;
                        if (str4.equalsIgnoreCase("oppo") || str4.equalsIgnoreCase("realme")) {
                            boolean z = false;
                            try {
                                z = !TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.build.version.oplusrom"}));
                            } catch (Exception e) {
                                Log.e("Error while checking oppo launcher information", e);
                            }
                            if (z) {
                                if (C18020vd.A05(C18040vf.A02, r5.A00, 503)) {
                                    str = "com.android.launcher";
                                }
                            }
                        }
                    }
                    str = "com.oppo.launcher";
                } else if (this instanceof C28681aj) {
                    List singletonList = Collections.singletonList("com.huawei.android.launcher");
                    C18070vi.A0X(singletonList);
                    return singletonList;
                } else if (this instanceof C28671ai) {
                    if (C28671ai.A00(context, (C28671ai) this) < 4.0f) {
                        return new ArrayList();
                    }
                    str = "com.htc.launcher";
                } else if (this instanceof C28701al) {
                    if (!C18020vd.A05(C18040vf.A02, ((C28701al) this).A00, 2337)) {
                        return Collections.emptyList();
                    }
                    str = "com.hihonor.android.launcher";
                } else {
                    strArr = new String[4];
                    strArr[0] = "com.asus.launcher";
                    strArr[1] = "com.lge.launcher";
                    strArr[2] = "com.lge.launcher2";
                    c = 3;
                    str2 = "com.lge.launcher3";
                }
                return Collections.singletonList(str);
            }
        }
        strArr[c] = str2;
        return Arrays.asList(strArr);
    }

    public void A02(int i, Notification notification) {
        if ((this instanceof C28651ag) && Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused) {
                Log.e("XiaomiBadger/update could not set badge for Xiaomi notification");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5 A[SYNTHETIC, Splitter:B:29:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2 A[Catch:{ Exception -> 0x03a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.content.Context r23, X.AnonymousClass11C r24, int r25) {
        /*
            r22 = this;
            r3 = r22
            boolean r0 = r3 instanceof X.C28651ag
            r10 = r23
            r9 = r25
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "android.app.MiuiNotification"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.Object r2 = r0.newInstance()     // Catch:{ Exception -> 0x002a }
            java.lang.Class r1 = r2.getClass()     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "messageCount"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x002a }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x002a }
            r1.set(r2, r0)     // Catch:{ Exception -> 0x002a }
            return
        L_0x002a:
            java.lang.String r0 = "android.intent.action.APPLICATION_MESSAGE_UPDATE"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r10.getPackageName()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = "com.whatsapp.Main"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "android.intent.extra.update_application_component_name"
            r2.putExtra(r0, r1)
            if (r25 != 0) goto L_0x005f
            java.lang.String r0 = ""
        L_0x0054:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "android.intent.extra.update_application_message_text"
            r2.putExtra(r0, r1)
            goto L_0x0110
        L_0x005f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x0054
        L_0x0064:
            boolean r0 = r3 instanceof X.C28711am
            r2 = r24
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = "android.intent.action.MAIN"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            java.lang.String r0 = "android.intent.category.HOME"
            r3.addCategory(r0)
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ RuntimeException -> 0x0089 }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r3, r0)     // Catch:{ RuntimeException -> 0x0089 }
            if (r0 == 0) goto L_0x008f
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ RuntimeException -> 0x0089 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r5 = r0.packageName     // Catch:{ RuntimeException -> 0x0089 }
            goto L_0x0091
        L_0x0089:
            r1 = move-exception
            java.lang.String r0 = "Exception while getting launcher name"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x008f:
            java.lang.String r5 = ""
        L_0x0091:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = "package"
            java.lang.String r0 = r10.getPackageName()
            r4.putString(r1, r0)
            java.lang.String r1 = "class"
            java.lang.String r0 = "com.whatsapp.Main"
            r4.putString(r1, r0)
            java.lang.String r0 = "badgenumber"
            r4.putInt(r0, r9)
            java.lang.String r0 = "com.transsion.XOSLauncher"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x03a4 }
            java.lang.String r3 = "change_badge"
            if (r0 == 0) goto L_0x00c2
            X.11B r1 = r2.A0O()     // Catch:{ Exception -> 0x03a4 }
            X.C17960vV.A07(r1)     // Catch:{ Exception -> 0x03a4 }
            android.net.Uri r0 = X.C28711am.A01     // Catch:{ Exception -> 0x03a4 }
            r1.A05(r0, r4, r3)     // Catch:{ Exception -> 0x03a4 }
            return
        L_0x00c2:
            java.lang.String r0 = "com.transsion.hilauncher"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x03a4 }
            if (r0 == 0) goto L_0x03bd
            X.11B r1 = r2.A0O()     // Catch:{ Exception -> 0x03a4 }
            X.C17960vV.A07(r1)     // Catch:{ Exception -> 0x03a4 }
            android.net.Uri r0 = X.C28711am.A00     // Catch:{ Exception -> 0x03a4 }
            r1.A05(r0, r4, r3)     // Catch:{ Exception -> 0x03a4 }
            return
        L_0x00d7:
            boolean r0 = r3 instanceof X.C28661ah
            if (r0 == 0) goto L_0x0114
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r0 = "com.sonymobile.home.resourceprovider"
            r4 = 0
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r0, r4)
            if (r0 != 0) goto L_0x01e9
            java.lang.String r0 = "com.sonyericsson.home.action.UPDATE_BADGE"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME"
            java.lang.String r0 = r10.getPackageName()
            r2.putExtra(r1, r0)
            java.lang.String r1 = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME"
            java.lang.String r0 = "com.whatsapp.Main"
            r2.putExtra(r1, r0)
            if (r25 <= 0) goto L_0x0102
            r4 = 1
        L_0x0102:
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE"
            r2.putExtra(r0, r4)
            java.lang.String r1 = "com.sonyericsson.home.intent.extra.badge.MESSAGE"
            java.lang.String r0 = java.lang.String.valueOf(r9)
        L_0x010d:
            r2.putExtra(r1, r0)
        L_0x0110:
            r10.sendBroadcast(r2)
            return
        L_0x0114:
            boolean r0 = r3 instanceof X.C28621ad
            if (r0 == 0) goto L_0x011b
            java.lang.Boolean r0 = X.C17960vV.A01
            return
        L_0x011b:
            boolean r0 = r3 instanceof X.C28691ak
            if (r0 == 0) goto L_0x0132
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "app_badge_count"
            r3.putInt(r0, r9)
            java.lang.String r1 = "app_badge_packageName"
            java.lang.String r0 = "com.whatsapp"
            r3.putString(r1, r0)
            goto L_0x0224
        L_0x0132:
            boolean r0 = r3 instanceof X.C28681aj
            if (r0 == 0) goto L_0x0167
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            java.lang.String r4 = "com.huawei.android.launcher"
            long r7 = X.C24211Jh.A00(r10, r4)
            r5 = 63006(0xf61e, double:3.1129E-319)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x03bd
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r1 = "package"
            java.lang.String r0 = r10.getPackageName()
            r3.putString(r1, r0)
            java.lang.String r1 = "class"
            java.lang.String r0 = "com.whatsapp.Main"
            r3.putString(r1, r0)
            java.lang.String r0 = "badgenumber"
            r3.putInt(r0, r9)
            goto L_0x0238
        L_0x0167:
            boolean r0 = r3 instanceof X.C28671ai
            if (r0 == 0) goto L_0x01a0
            X.1ai r3 = (X.C28671ai) r3
            float r1 = X.C28671ai.A00(r10, r3)
            r0 = 1084227584(0x40a00000, float:5.0)
            r8 = 16
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x026c
            java.lang.String r0 = "com.htc.launcher.action.SET_NOTIFICATION"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r3.setFlags(r8)
            java.lang.String r2 = r10.getPackageName()
            java.lang.String r1 = "com.whatsapp.Main"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            java.lang.String r1 = "com.htc.launcher.extra.COMPONENT"
            java.lang.String r0 = r0.flattenToShortString()
            r3.putExtra(r1, r0)
            java.lang.String r0 = "com.htc.launcher.extra.COUNT"
            r3.putExtra(r0, r9)
            r10.sendBroadcast(r3)
            return
        L_0x01a0:
            boolean r0 = r3 instanceof X.C28701al
            if (r0 == 0) goto L_0x01ce
            X.1al r3 = (X.C28701al) r3
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = "package"
            java.lang.String r0 = r10.getPackageName()
            r4.putString(r1, r0)
            java.lang.String r1 = "class"
            java.lang.String r0 = "com.whatsapp.Main"
            r4.putString(r1, r0)
            java.lang.String r0 = "badgenumber"
            r4.putInt(r0, r9)
            X.0ve r3 = r3.A00
            r1 = 2337(0x921, float:3.275E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x03bd
            goto L_0x0386
        L_0x01ce:
            java.lang.String r0 = "android.intent.action.BADGE_COUNT_UPDATE"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r0 = "badge_count"
            r2.putExtra(r0, r9)
            java.lang.String r1 = "badge_count_package_name"
            java.lang.String r0 = r10.getPackageName()
            r2.putExtra(r1, r0)
            java.lang.String r1 = "badge_count_class_name"
            java.lang.String r0 = "com.whatsapp.Main"
            goto L_0x010d
        L_0x01e9:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r1 = "badge_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3.put(r1, r0)
            java.lang.String r1 = "package_name"
            java.lang.String r0 = r10.getPackageName()
            r3.put(r1, r0)
            java.lang.String r1 = "activity_name"
            java.lang.String r0 = "com.whatsapp.Main"
            r3.put(r1, r0)
            X.11B r2 = r2.A0O()
            X.C17960vV.A07(r2)     // Catch:{ Exception -> 0x021f }
            java.lang.String r0 = "content://com.sonymobile.home.resourceprovider/badge"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x021f }
            X.C18070vi.A0d(r1, r4)     // Catch:{ Exception -> 0x021f }
            android.content.ContentResolver r0 = X.AnonymousClass11B.A00(r2)     // Catch:{ Exception -> 0x021f }
            r0.insert(r1, r3)     // Catch:{ Exception -> 0x021f }
            return
        L_0x021f:
            r1 = move-exception
            java.lang.String r0 = "badger/sony/updatebadge"
            goto L_0x03a0
        L_0x0224:
            X.11B r2 = r2.A0O()     // Catch:{ Exception -> 0x039d }
            X.C17960vV.A07(r2)     // Catch:{ Exception -> 0x039d }
            java.lang.String r0 = "content://com.android.badge/badge"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x039d }
            java.lang.String r0 = "setAppBadgeCount"
            r2.A05(r1, r3, r0)     // Catch:{ Exception -> 0x039d }
            return
        L_0x0238:
            X.11B r2 = r2.A0O()     // Catch:{ Exception -> 0x0252 }
            if (r2 == 0) goto L_0x024a
            java.lang.String r0 = "content://com.huawei.android.launcher.settings/badge/"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r0 = "change_badge"
            r2.A05(r1, r3, r0)     // Catch:{ Exception -> 0x0252 }
            return
        L_0x024a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0252 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0252 }
            throw r0     // Catch:{ Exception -> 0x0252 }
        L_0x0252:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Unexpected exception, launcher version = "
            r2.append(r0)
            long r0 = X.C24211Jh.A00(r10, r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e(r0, r3)
            return
        L_0x026c:
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x03bd
            java.lang.String r7 = "com.htc.launcher.action.UPDATE_SHORTCUT"
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r7)
            r6.setFlags(r8)
            java.lang.String r0 = r10.getPackageName()
            java.lang.String r5 = "packagename"
            r6.putExtra(r5, r0)
            java.lang.String r4 = "count"
            r6.putExtra(r4, r9)
            r10.sendBroadcast(r6)
            X.11B r16 = r2.A0O()
            X.C17960vV.A07(r16)
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            java.lang.String r0 = "content://com.htc.launcher.settings/favorites"
            android.net.Uri r17 = android.net.Uri.parse(r0)
            r0 = 2
            java.lang.String[] r11 = new java.lang.String[r0]
            r3 = 0
            java.lang.String r1 = "_id"
            r11[r3] = r1
            r2 = 1
            java.lang.String r0 = "intent"
            r11[r2] = r0
            java.lang.String[] r14 = new java.lang.String[r2]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "%"
            r13.append(r2)
            java.lang.String r12 = r10.getPackageName()
            r13.append(r12)
            r13.append(r2)
            java.lang.String r12 = r13.toString()
            r14[r3] = r12
            r21 = 0
            java.lang.String r19 = "intent LIKE ?"
            r20 = r14
            r18 = r11
            android.database.Cursor r11 = r16.A03(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x032b
            int r1 = r11.getColumnIndex(r1)     // Catch:{ all -> 0x031e }
            int r12 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x031e }
            r11.moveToFirst()     // Catch:{ all -> 0x031e }
        L_0x02e1:
            boolean r0 = r11.isAfterLast()     // Catch:{ all -> 0x031e }
            if (r0 != 0) goto L_0x0328
            java.lang.String r0 = r11.getString(r12)     // Catch:{ all -> 0x031e }
            android.content.Intent r0 = android.content.Intent.parseUri(r0, r3)     // Catch:{ URISyntaxException -> 0x031a }
            android.content.ComponentName r14 = r0.getComponent()     // Catch:{ all -> 0x031e }
            if (r14 == 0) goto L_0x031a
            java.lang.String r13 = r10.getPackageName()     // Catch:{ all -> 0x031e }
            java.lang.String r0 = r14.getPackageName()     // Catch:{ all -> 0x031e }
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x031e }
            if (r0 == 0) goto L_0x031a
            java.lang.String r13 = "com.whatsapp.Main"
            java.lang.String r0 = r14.getClassName()     // Catch:{ all -> 0x031e }
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x031e }
            if (r0 == 0) goto L_0x031a
            int r0 = r11.getInt(r1)     // Catch:{ all -> 0x031e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x031e }
            r15.add(r0)     // Catch:{ all -> 0x031e }
        L_0x031a:
            r11.moveToNext()     // Catch:{ all -> 0x031e }
            goto L_0x02e1
        L_0x031e:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0323 }
            throw r1
        L_0x0323:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0328:
            r11.close()
        L_0x032b:
            java.util.Iterator r14 = r15.iterator()
        L_0x032f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x03bd
            java.lang.Object r1 = r14.next()
            java.lang.Number r1 = (java.lang.Number) r1
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r7)
            r6.setFlags(r8)
            java.lang.String r0 = r10.getPackageName()
            r11.putExtra(r5, r0)
            java.lang.String r12 = "favorite_item_id"
            long r0 = r1.longValue()
            r11.putExtra(r12, r0)
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r0 = "com.whatsapp.Main"
            android.content.ComponentName r13 = new android.content.ComponentName
            r13.<init>(r1, r0)
            r0 = 1
            java.lang.String[] r12 = new java.lang.String[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = r13.flattenToShortString()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r12[r3] = r0
            java.lang.String r0 = "selectArgs"
            r11.putExtra(r0, r12)
            r11.putExtra(r4, r9)
            r10.sendBroadcast(r11)
            goto L_0x032f
        L_0x0386:
            X.11B r2 = r2.A0O()     // Catch:{ Exception -> 0x0399 }
            X.C17960vV.A07(r2)     // Catch:{ Exception -> 0x0399 }
            java.lang.String r0 = "content://com.hihonor.android.launcher.settings/badge/"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0399 }
            java.lang.String r0 = "change_badge"
            r2.A05(r1, r4, r0)     // Catch:{ Exception -> 0x0399 }
            return
        L_0x0399:
            r1 = move-exception
            java.lang.String r0 = "Unexpected exception while honor badging"
            goto L_0x03a0
        L_0x039d:
            r1 = move-exception
            java.lang.String r0 = "cannot update badge"
        L_0x03a0:
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x03a4:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "badger/getbadger "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x03bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28611ac.A03(android.content.Context, X.11C, int):void");
    }
}
