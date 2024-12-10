package com.google.android.gms.common.api;

import X.AnonymousClass000;
import X.C23203Bcx;
import X.C23214BdQ;
import X.C26377Cyd;
import X.C41381wH;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Object obj = extras.get("error_code");
                if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.A00 = 1;
                        return;
                    } catch (ActivityNotFoundException e) {
                        if (extras.getBoolean("notify_manager", true)) {
                            C26377Cyd.A01(this).A06(new C23203Bcx(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String obj2 = pendingIntent.toString();
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Activity not found while launching ");
                            A10.append(obj2);
                            String A0y = AnonymousClass000.A0y(".", A10);
                            if (Build.FINGERPRINT.contains("generic")) {
                                A0y = A0y.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", A0y, e);
                        }
                        this.A00 = 1;
                    } catch (IntentSender.SendIntentException e2) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                        finish();
                        return;
                    }
                } else if (obj != null) {
                    int A0M = AnonymousClass000.A0M(obj);
                    AlertDialog A002 = C41381wH.A00(this, this, new C23214BdQ(this, C41381wH.A00.A03(this, "d", A0M), 2), A0M);
                    if (A002 != null) {
                        C41381wH.A01(this, A002, this, "GooglePlayServicesErrorDialog");
                    }
                    this.A00 = 1;
                    return;
                } else {
                    str = "Activity started without resolution";
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C26377Cyd A01 = C26377Cyd.A01(this);
                if (i2 == -1) {
                    Handler handler = A01.A06;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    A01.A06(new C23203Bcx(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }
}
