package X;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.CwR  reason: case insensitive filesystem */
public final class C26275CwR {
    public static final Binder A03 = new Binder();
    public static final Binder A04 = new Binder();
    public final C25828Cmf A00;
    public final C25041CUu A01 = new C25041CUu(this);
    public final C25040CUt A02;

    public static final int A00(C25644CjX cjX) {
        C18070vi.A0d(cjX, 0);
        if (cjX.equals(C25644CjX.A03)) {
            return 0;
        }
        if (cjX.equals(C25644CjX.A02)) {
            return 1;
        }
        if (cjX.equals(C25644CjX.A01)) {
            return 2;
        }
        throw AnonymousClass8BX.A0V(cjX, "Unknown finish behavior:", AnonymousClass000.A10());
    }

    public static final C25773Clk A01(SplitAttributes splitAttributes) {
        C25785Clw A002;
        C25645CjY cjY;
        C25785Clw clw = C25785Clw.A04;
        SplitAttributes.SplitType.RatioSplitType splitType = splitAttributes.getSplitType();
        C18070vi.A0X(splitType);
        if (splitType instanceof SplitAttributes.SplitType.HingeSplitType) {
            A002 = C25785Clw.A04;
        } else if (splitType instanceof SplitAttributes.SplitType.ExpandContainersSplitType) {
            A002 = C25785Clw.A03;
        } else if (splitType instanceof SplitAttributes.SplitType.RatioSplitType) {
            A002 = C24508C7c.A00(splitType.getRatio());
        } else {
            throw AnonymousClass8BX.A0V(splitType, "Unknown split type: ", AnonymousClass000.A10());
        }
        int layoutDirection = splitAttributes.getLayoutDirection();
        if (layoutDirection == 0) {
            cjY = C25645CjY.A02;
        } else if (layoutDirection == 1) {
            cjY = C25645CjY.A04;
        } else if (layoutDirection == 3) {
            cjY = C25645CjY.A03;
        } else if (layoutDirection == 4) {
            cjY = C25645CjY.A05;
        } else if (layoutDirection == 5) {
            cjY = C25645CjY.A01;
        } else {
            throw AnonymousClass001.A13("Unknown layout direction: ", AnonymousClass000.A10(), layoutDirection);
        }
        C18070vi.A0d(cjY, 0);
        return new C25773Clk(cjY, A002);
    }

    public static /* synthetic */ boolean A06(Context context, WindowMetrics windowMetrics, C22727BMo bMo) {
        C18070vi.A0d(bMo, 0);
        C18070vi.A0Y(windowMetrics);
        return bMo.A01(context, windowMetrics);
    }

    public static /* synthetic */ boolean A07(Context context, WindowMetrics windowMetrics, C22728BMp bMp) {
        C18070vi.A0d(bMp, 0);
        C18070vi.A0Y(windowMetrics);
        return bMp.A01(context, windowMetrics);
    }

    public final SplitAttributes A08(C25773Clk clk) {
        int i;
        C18070vi.A0d(clk, 0);
        if (C25864CnX.A00() >= 2) {
            SplitAttributes.Builder splitType = new SplitAttributes.Builder().setSplitType(A03(clk.A01));
            C25645CjY cjY = clk.A00;
            if (C18070vi.A18(cjY, C25645CjY.A03)) {
                i = 3;
            } else if (C18070vi.A18(cjY, C25645CjY.A02)) {
                i = 0;
            } else if (C18070vi.A18(cjY, C25645CjY.A04)) {
                i = 1;
            } else if (C18070vi.A18(cjY, C25645CjY.A05)) {
                i = 4;
            } else if (C18070vi.A18(cjY, C25645CjY.A01)) {
                i = 5;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Unsupported layoutDirection:");
                A10.append(clk);
                throw AnonymousClass001.A12(".layoutDirection", A10);
            }
            SplitAttributes build = splitType.setLayoutDirection(i).build();
            C18070vi.A0X(build);
            return build;
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }

    public final List A09(List list) {
        C25195Cam A012;
        C18070vi.A0d(list, 0);
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SplitInfo splitInfo = (SplitInfo) it.next();
            int A002 = C25864CnX.A00();
            if (A002 == 1) {
                A012 = this.A00.A01(splitInfo);
            } else if (A002 != 2) {
                ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
                C18070vi.A0X(primaryActivityStack);
                ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
                C18070vi.A0X(secondaryActivityStack);
                List activities = primaryActivityStack.getActivities();
                C18070vi.A0X(activities);
                C25149Ca0 ca0 = new C25149Ca0(activities, primaryActivityStack.isEmpty());
                List activities2 = secondaryActivityStack.getActivities();
                C18070vi.A0X(activities2);
                C25149Ca0 ca02 = new C25149Ca0(activities2, secondaryActivityStack.isEmpty());
                SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
                C18070vi.A0X(splitAttributes);
                C25773Clk A013 = A01(splitAttributes);
                IBinder token = splitInfo.getToken();
                C18070vi.A0X(token);
                A012 = new C25195Cam(token, ca0, ca02, A013);
            } else {
                A012 = this.A01.A00(splitInfo);
            }
            A0D.add(A012);
        }
        return A0D;
    }

    public final Set A0A(Context context, Set set) {
        Class cls;
        SplitPairRule A022;
        try {
            cls = BE7.A0V(this.A02.A00, "java.util.function.Predicate");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return C25511Om.A00;
        }
        ArrayList A0D = C29351c6.A0D(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C24470C5k c5k = (C24470C5k) it.next();
            if (c5k instanceof C22727BMo) {
                A022 = A04(context, (C22727BMo) c5k, cls);
            } else if (c5k instanceof C22728BMp) {
                A022 = A05(context, (C22728BMp) c5k, cls);
            } else if (c5k instanceof C22726BMn) {
                A022 = A02((C22726BMn) c5k, cls);
            } else {
                throw AnonymousClass000.A0k("Unsupported rule type");
            }
            A0D.add(A022);
        }
        return C29431cG.A12(A0D);
    }

    public C26275CwR(C25040CUt cUt) {
        this.A02 = cUt;
        this.A00 = new C25828Cmf(cUt, this);
    }

    private final ActivityRule A02(C22726BMn bMn, Class cls) {
        if (C25864CnX.A00() < 2) {
            return this.A00.A02(bMn, cls);
        }
        ActivityRule.Builder shouldAlwaysExpand = new ActivityRule.Builder(new D7L(bMn, 4), new D7L(bMn, 5)).setShouldAlwaysExpand(true);
        C18070vi.A0X(shouldAlwaysExpand);
        ActivityRule build = shouldAlwaysExpand.build();
        C18070vi.A0X(build);
        return build;
    }

    private final SplitAttributes.SplitType A03(C25785Clw clw) {
        SplitAttributes.SplitType.HingeSplitType ratioSplitType;
        if (C25864CnX.A00() >= 2) {
            if (C18070vi.A18(clw, C25785Clw.A04)) {
                ratioSplitType = new SplitAttributes.SplitType.HingeSplitType(A03(C25785Clw.A02));
            } else if (C18070vi.A18(clw, C25785Clw.A03)) {
                ratioSplitType = new SplitAttributes.SplitType.ExpandContainersSplitType();
            } else {
                float f = clw.A00;
                double d = (double) f;
                if (d <= 0.0d || d >= 1.0d) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Unsupported SplitType: ");
                    A10.append(clw);
                    A10.append(" with value: ");
                    A10.append(f);
                    throw AnonymousClass000.A0j(A10);
                }
                ratioSplitType = new SplitAttributes.SplitType.RatioSplitType(f);
            }
            return (SplitAttributes.SplitType) ratioSplitType;
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }

    private final SplitPairRule A04(Context context, C22727BMo bMo, Class cls) {
        if (C25864CnX.A00() < 2) {
            return this.A00.A03(context, bMo, cls);
        }
        SplitPairRule.Builder shouldClearTop = new SplitPairRule.Builder(new D7L(bMo, 2), new D7L(bMo, 3), new D7K(context, bMo)).setDefaultSplitAttributes(A08(bMo.A02)).setFinishPrimaryWithSecondary(A00(bMo.A00)).setFinishSecondaryWithPrimary(A00(bMo.A01)).setShouldClearTop(true);
        C18070vi.A0X(shouldClearTop);
        SplitPairRule build = shouldClearTop.build();
        C18070vi.A0X(build);
        return build;
    }

    private final SplitPlaceholderRule A05(Context context, C22728BMp bMp, Class cls) {
        if (C25864CnX.A00() < 2) {
            return this.A00.A04(context, bMp, cls);
        }
        SplitPlaceholderRule.Builder finishPrimaryWithPlaceholder = new SplitPlaceholderRule.Builder(bMp.A00, new D7L(bMp, 0), new D7L(bMp, 1), new D7J(context, bMp)).setSticky(false).setDefaultSplitAttributes(A08(bMp.A02)).setFinishPrimaryWithPlaceholder(A00(bMp.A01));
        C18070vi.A0X(finishPrimaryWithPlaceholder);
        SplitPlaceholderRule build = finishPrimaryWithPlaceholder.build();
        C18070vi.A0X(build);
        return build;
    }
}
