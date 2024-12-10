package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0QD  reason: invalid class name */
public abstract class AnonymousClass0QD {
    public static final Map A00 = new LinkedHashMap();

    public static final Recomposer A02(View view, C18560wh r10) {
        C18560wh r0;
        C23381Fv lifecycle;
        if (r10.get(C18590wk.A00) == null || r10.get(C17860vL.A00) == null) {
            r10 = C15290qO.A0A.A01().plus(r10);
        }
        C17860vL r02 = (C17860vL) r10.get(C17860vL.A00);
        PausableMonotonicFrameClock pausableMonotonicFrameClock = null;
        if (r02 != null) {
            pausableMonotonicFrameClock = new PausableMonotonicFrameClock(r02);
            pausableMonotonicFrameClock.A00();
        }
        C98494rF r7 = new C98494rF();
        C18560wh r1 = r10.get(C17870vM.A00);
        if (r1 == null) {
            r1 = new AnonymousClass0WE();
            r7.element = r1;
        }
        if (pausableMonotonicFrameClock != null) {
            r0 = pausableMonotonicFrameClock;
        } else {
            r0 = AnonymousClass1OR.A00;
        }
        C18560wh plus = r10.plus(r0).plus(r1);
        Recomposer recomposer = new Recomposer(plus);
        synchronized (recomposer.A0B) {
            recomposer.A04 = true;
        }
        AnonymousClass1OY A02 = AnonymousClass1OW.A02(plus);
        View view2 = view;
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(view);
        if (A002 == null || (lifecycle = A002.getLifecycle()) == null) {
            throw AnonymousClass000.A0n(AnonymousClass001.A1E(view, "ViewTreeLifecycleOwner not found from ", AnonymousClass000.A10()));
        }
        view.addOnAttachStateChangeListener(new AnonymousClass0RZ(view, recomposer, 1));
        lifecycle.A05(new AnonymousClass0Y6(view2, pausableMonotonicFrameClock, recomposer, r7, A02));
        return recomposer;
    }

    public static final AnonymousClass1G1 A04(Context context) {
        AnonymousClass1G1 r0;
        Map map = A00;
        synchronized (map) {
            Context context2 = context;
            Object obj = map.get(context);
            if (obj == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                C27178DXn A002 = AnonymousClass4W8.A01(C25691Pg.A04, -1);
                C28243Du4 A01 = AnonymousClass4WA.A01(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, context2, uriFor, new AnonymousClass04O(AnonymousClass9O8.A00(Looper.getMainLooper()), A002), (C30391dr) null, A002));
                obj = A03(Float.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f)), AnonymousClass1OW.A01(), A01, C99654tF.A00());
                map.put(context2, obj);
            }
            r0 = (AnonymousClass1G1) obj;
        }
        return r0;
    }

    public static final AnonymousClass0D1 A00(View view) {
        Object tag = view.getTag(2131427797);
        if (tag instanceof AnonymousClass0D1) {
            return (AnonymousClass0D1) tag;
        }
        return null;
    }

    public static final C34081jt A03(Object obj, AnonymousClass1OX r1, C23421Fz r2, C108705cA r3) {
        return AnonymousClass4Z7.A01(obj, r1, r2, r3);
    }
}
