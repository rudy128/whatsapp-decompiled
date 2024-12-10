package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;

/* renamed from: X.Cmf  reason: case insensitive filesystem */
public final class C25828Cmf {
    public final C25040CUt A00;
    public final /* synthetic */ C26275CwR A01;

    public final C25195Cam A01(SplitInfo splitInfo) {
        C18070vi.A0d(splitInfo, 0);
        List activities = splitInfo.getPrimaryActivityStack().getActivities();
        C18070vi.A0X(activities);
        C25149Ca0 ca0 = new C25149Ca0(activities, splitInfo.getPrimaryActivityStack().isEmpty());
        List activities2 = splitInfo.getSecondaryActivityStack().getActivities();
        C18070vi.A0X(activities2);
        C25149Ca0 ca02 = new C25149Ca0(activities2, splitInfo.getSecondaryActivityStack().isEmpty());
        C25645CjY cjY = C25645CjY.A03;
        C25785Clw clw = C25785Clw.A04;
        float splitRatio = splitInfo.getSplitRatio();
        C25785Clw clw2 = C25785Clw.A03;
        if (splitRatio != 0.0f) {
            clw2 = C24508C7c.A00(splitRatio);
        }
        C18070vi.A0d(cjY, 0);
        return new C25195Cam(C26275CwR.A03, ca0, ca02, new C25773Clk(cjY, clw2));
    }

    public final ActivityRule A02(C22726BMn bMn, Class cls) {
        C18070vi.A0d(bMn, 0);
        Class[] clsArr = new Class[2];
        clsArr[0] = cls;
        Constructor A0w = BE6.A0w(ActivityRule.Builder.class, cls, clsArr, 1);
        Set set = bMn.A00;
        C25040CUt cUt = this.A00;
        ActivityRule build = ((ActivityRule.Builder) A0w.newInstance(new Object[]{cUt.A00(new C27925DoN(set), AnonymousClass3MW.A15(Activity.class)), cUt.A00(new C27926DoO(set), AnonymousClass3MW.A15(Intent.class))})).setShouldAlwaysExpand(true).build();
        C18070vi.A0X(build);
        return build;
    }

    public final SplitPairRule A03(Context context, C22727BMo bMo, Class cls) {
        C18070vi.A0d(bMo, 1);
        Class[] clsArr = new Class[3];
        clsArr[0] = cls;
        clsArr[1] = cls;
        Constructor A0w = BE6.A0w(SplitPairRule.Builder.class, cls, clsArr, 2);
        Set set = bMo.A02;
        C25040CUt cUt = this.A00;
        Class<Activity> cls2 = Activity.class;
        C22723BMk bMk = new C22723BMk(new C28158DsN(set), AnonymousClass3MW.A15(cls2), AnonymousClass3MW.A15(cls2));
        ClassLoader classLoader = cUt.A00;
        Object newInstance = A0w.newInstance(new Object[]{BEA.A0e(classLoader, "java.util.function.Predicate", bMk, new Class[1]), BEA.A0e(classLoader, "java.util.function.Predicate", new C22723BMk(new C28157DsM(set), AnonymousClass3MW.A15(cls2), AnonymousClass3MW.A15(Intent.class)), new Class[1]), cUt.A00(new C28035DqA(context, bMo), AnonymousClass3MW.A15(WindowMetrics.class))});
        C18070vi.A0X(newInstance);
        SplitPairRule.Builder builder = (SplitPairRule.Builder) newInstance;
        AnonymousClass1D6 A002 = A00(bMo.A02);
        float A04 = AnonymousClass000.A04(A002.first);
        int A09 = C108955ca.A09(A002);
        builder.setSplitRatio(A04);
        builder.setLayoutDirection(A09);
        SplitPairRule build = builder.setShouldClearTop(true).setFinishPrimaryWithSecondary(C26275CwR.A00(bMo.A00)).setFinishSecondaryWithPrimary(C26275CwR.A00(bMo.A01)).build();
        C18070vi.A0X(build);
        return build;
    }

    public final SplitPlaceholderRule A04(Context context, C22728BMp bMp, Class cls) {
        C18070vi.A0d(bMp, 1);
        Class[] clsArr = new Class[4];
        Class<Intent> cls2 = Intent.class;
        clsArr[0] = cls2;
        clsArr[1] = cls;
        clsArr[2] = cls;
        Constructor A0w = BE6.A0w(SplitPlaceholderRule.Builder.class, cls, clsArr, 3);
        Set set = bMp.A02;
        C25040CUt cUt = this.A00;
        SplitPlaceholderRule.Builder finishPrimaryWithSecondary = ((SplitPlaceholderRule.Builder) A0w.newInstance(new Object[]{bMp.A00, cUt.A00(new C27925DoN(set), AnonymousClass3MW.A15(Activity.class)), cUt.A00(new C27926DoO(set), AnonymousClass3MW.A15(cls2)), cUt.A00(new C28035DqA(context, bMp), AnonymousClass3MW.A15(WindowMetrics.class))})).setSticky(false).setFinishPrimaryWithSecondary(C26275CwR.A00(bMp.A01));
        C18070vi.A0X(finishPrimaryWithSecondary);
        AnonymousClass1D6 A002 = A00(bMp.A02);
        float A04 = AnonymousClass000.A04(A002.first);
        int A09 = C108955ca.A09(A002);
        finishPrimaryWithSecondary.setSplitRatio(A04);
        finishPrimaryWithSecondary.setLayoutDirection(A09);
        SplitPlaceholderRule build = finishPrimaryWithSecondary.build();
        C18070vi.A0X(build);
        return build;
    }

    public C25828Cmf(C25040CUt cUt, C26275CwR cwR) {
        this.A01 = cwR;
        this.A00 = cUt;
    }

    private final AnonymousClass1D6 A00(C25773Clk clk) {
        Float valueOf;
        float f = clk.A01.A00;
        double d = (double) f;
        boolean z = false;
        if (0.0d <= d && d <= 1.0d && f != 1.0f) {
            if (C200410p.A0U(clk.A00, new C25645CjY[]{C25645CjY.A02, C25645CjY.A04, C25645CjY.A03})) {
                z = true;
            }
        }
        int i = 3;
        if (!z) {
            valueOf = BE7.A0W();
        } else {
            valueOf = Float.valueOf(f);
            C25645CjY cjY = clk.A00;
            if (!C18070vi.A18(cjY, C25645CjY.A03)) {
                if (C18070vi.A18(cjY, C25645CjY.A02)) {
                    i = 0;
                } else if (C18070vi.A18(cjY, C25645CjY.A04)) {
                    i = 1;
                } else {
                    throw AnonymousClass000.A0n("Unsupported layout direction must be covered in @isSplitAttributesSupported!");
                }
            }
        }
        return AnonymousClass1D6.A00(valueOf, i);
    }
}
