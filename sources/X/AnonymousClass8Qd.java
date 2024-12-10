package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8Qd  reason: invalid class name */
public abstract class AnonymousClass8Qd extends C180859Of {
    public final A8B A00;
    public final List A01;
    public final Set A02;

    private void A00(Context context) {
        if (context != null) {
            Set set = this.A02;
            if (!set.isEmpty()) {
                synchronized (set) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.9Lo] */
    public C180209Lo A01(Context context, Intent intent) {
        if (context == null) {
            return null;
        }
        List list = this.A01;
        if (list.isEmpty()) {
            return null;
        }
        if (TextUtils.isEmpty(intent.getStringExtra("MSF_INTENT_METADATA_ID"))) {
            String encodeToString = Base64.encodeToString(AnonymousClass8BX.A1Y(), 8);
            long currentTimeMillis = System.currentTimeMillis();
            String packageName = context.getPackageName();
            intent.putExtra("MSF_INTENT_METADATA_ID", encodeToString);
            intent.putExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", currentTimeMillis);
            intent.putExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME", packageName);
        } else {
            intent.getLongExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", -1);
            intent.getStringExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME");
        }
        ? obj = new Object();
        new Intent(intent);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
            try {
                throw AnonymousClass000.A0s("shouldObserve");
            } catch (Exception unused) {
            }
        }
        return obj;
    }

    public void A03(Context context, Intent intent, Intent intent2, C180209Lo r6) {
        if (context != null && r6 != null) {
            List list = this.A01;
            if (!list.isEmpty()) {
                new Intent(intent);
                new Intent(intent2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    try {
                        throw AnonymousClass000.A0s("shouldObserve");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public AnonymousClass8Qd(A8B a8b, List list, Set set) {
        this.A00 = a8b;
        this.A02 = set;
        this.A01 = list;
    }

    public void A02(Activity activity, Intent intent, int i) {
        C180209Lo A012 = A01(activity, intent);
        A8B a8b = this.A00;
        Intent A08 = a8b.A08(activity, intent);
        if (A08 != null) {
            A00(activity);
            A03(activity, intent, A08, A012);
            Bundle bundle = null;
            if (Build.VERSION.SDK_INT >= 34) {
                ActivityOptions makeBasic = ActivityOptions.makeBasic();
                makeBasic.setShareIdentityEnabled(a8b.A0B());
                bundle = makeBasic.toBundle();
            }
            activity.startActivityForResult(A08, i, bundle);
        }
    }

    public void A04(Intent intent, Fragment fragment, int i) {
        Context A1n = fragment.A1n();
        C180209Lo A012 = A01(A1n, intent);
        A8B a8b = this.A00;
        Intent A08 = a8b.A08(A1n, intent);
        if (A08 != null) {
            A00(A1n);
            A03(A1n, intent, A08, A012);
            Bundle bundle = null;
            if (Build.VERSION.SDK_INT >= 34) {
                ActivityOptions makeBasic = ActivityOptions.makeBasic();
                makeBasic.setShareIdentityEnabled(a8b.A0B());
                bundle = makeBasic.toBundle();
            }
            fragment.A1P(A08, i, bundle);
        }
    }

    public boolean A05(Context context, Intent intent) {
        C180209Lo A012 = A01(context, intent);
        A8B a8b = this.A00;
        Intent A08 = a8b.A08(context, intent);
        if (A08 == null) {
            return false;
        }
        A00(context);
        if ((intent.getFlags() & 268435456) == 0 && !C180859Of.A01(context)) {
            intent.addFlags(268435456);
            a8b.A01.CFL();
        }
        A03(context, intent, A08, A012);
        Bundle bundle = null;
        if (Build.VERSION.SDK_INT >= 34) {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            makeBasic.setShareIdentityEnabled(a8b.A0B());
            bundle = makeBasic.toBundle();
        }
        context.startActivity(A08, bundle);
        return true;
    }
}
