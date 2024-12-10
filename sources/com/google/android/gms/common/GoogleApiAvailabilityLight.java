package com.google.android.gms.common;

import X.C41401wK;
import X.C41411wL;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;

public class GoogleApiAvailabilityLight {
    public static final GoogleApiAvailabilityLight A00 = new Object();

    public Intent A03(Context context, String str, int i) {
        if (i == 1 || i == 2) {
            if (context == null || !DeviceProperties.A00(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("gcore_");
                sb.append(12451000);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        C41411wL A002 = C41401wK.A00(context);
                        sb.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String obj = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "com.google.android.gms");
                if (!TextUtils.isEmpty(obj)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", obj);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage(SearchActionVerificationClientUtil.ANDROID_WEAR_PACKAGE);
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public int A02(Context context, int i) {
        int A002 = GooglePlayServicesUtil.A00(context, i);
        if (A002 != 1 || !GooglePlayServicesUtil.A03(context)) {
            return A002;
        }
        return 18;
    }
}
