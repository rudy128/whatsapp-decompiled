package com.google.android.play.core.common;

import X.C17880vN;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {
    public ResultReceiver A00;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r2 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r2 != null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r3 = r10
            android.content.Intent r1 = r10.getIntent()
            r0 = 0
            java.lang.String r2 = "window_flags"
            int r1 = r1.getIntExtra(r2, r0)
            if (r1 == 0) goto L_0x0063
            android.view.View r0 = X.AnonymousClass3MZ.A0F(r10)
            r0.setSystemUiVisibility(r1)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r6.putExtra(r2, r1)
        L_0x001d:
            super.onCreate(r11)
            java.lang.String r1 = "result_receiver"
            if (r11 != 0) goto L_0x0066
            android.content.Intent r0 = r10.getIntent()
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            android.os.ResultReceiver r0 = (android.os.ResultReceiver) r0
            r10.A00 = r0
            android.content.Intent r0 = r10.getIntent()
            android.os.Bundle r1 = r0.getExtras()
            if (r1 != 0) goto L_0x004a
            android.os.ResultReceiver r2 = r10.A00
            if (r2 == 0) goto L_0x0046
        L_0x003e:
            android.os.Bundle r1 = X.C17880vN.A0D()
            r0 = 3
            r2.send(r0, r1)
        L_0x0046:
            r10.finish()
            return
        L_0x004a:
            java.lang.String r0 = "confirmation_intent"
            java.lang.Object r0 = r1.get(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            android.content.IntentSender r4 = r0.getIntentSender()     // Catch:{ SendIntentException -> 0x005e }
            r5 = 0
            r8 = r5
            r9 = r5
            r7 = r5
            r3.startIntentSenderForResult(r4, r5, r6, r7, r8, r9)     // Catch:{ SendIntentException -> 0x005e }
            goto L_0x0065
        L_0x005e:
            android.os.ResultReceiver r2 = r10.A00
            if (r2 == 0) goto L_0x0046
            goto L_0x003e
        L_0x0063:
            r6 = 0
            goto L_0x001d
        L_0x0065:
            return
        L_0x0066:
            android.os.Parcelable r0 = r11.getParcelable(r1)
            android.os.ResultReceiver r0 = (android.os.ResultReceiver) r0
            r10.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.common.PlayCoreDialogWrapperActivity.onCreate(android.os.Bundle):void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.A00);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle A0D;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.A00) != null) {
            if (i2 == -1) {
                A0D = C17880vN.A0D();
                i3 = 1;
            } else if (i2 == 0) {
                A0D = C17880vN.A0D();
                i3 = 2;
            }
            resultReceiver.send(i3, A0D);
        }
        finish();
    }
}
