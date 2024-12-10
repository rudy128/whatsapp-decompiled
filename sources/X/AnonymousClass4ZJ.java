package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation;

/* renamed from: X.4ZJ  reason: invalid class name */
public final class AnonymousClass4ZJ {
    public int A00;
    public PushToRecordIconAnimation A01;
    public AnonymousClass4VS A02;
    public C28931bI A03;
    public final AnonymousClass1F9 A04;
    public final AnonymousClass3V4 A05;
    public final AnonymousClass3V0 A06;
    public final C18000vb A07;

    public static final View A01(AnonymousClass4ZJ r2) {
        AnonymousClass4VS r0 = r2.A02;
        if ((r0 == null || !r0.A01()) && r2.A03.A00 == null) {
            return null;
        }
        return r2.A03.A02();
    }

    public AnonymousClass4ZJ(AnonymousClass1F9 r1, AnonymousClass3V4 r2, AnonymousClass3V0 r3, C18000vb r4, C28931bI r5) {
        this.A07 = r4;
        this.A04 = r1;
        this.A03 = r5;
        this.A05 = r2;
        this.A06 = r3;
    }

    public static final float A00(AnonymousClass4ZJ r0, int i) {
        Context context;
        Resources resources;
        View A012 = A01(r0);
        if (A012 == null || (context = A012.getContext()) == null || (resources = context.getResources()) == null) {
            return 0.0f;
        }
        return AnonymousClass3MW.A00(resources, i);
    }
}
