package X;

import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;

/* renamed from: X.CUu  reason: case insensitive filesystem */
public final class C25041CUu {
    public final /* synthetic */ C26275CwR A00;

    public final C25195Cam A00(SplitInfo splitInfo) {
        C18070vi.A0d(splitInfo, 0);
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        C18070vi.A0X(primaryActivityStack);
        List activities = primaryActivityStack.getActivities();
        C18070vi.A0X(activities);
        C25149Ca0 ca0 = new C25149Ca0(activities, primaryActivityStack.isEmpty());
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        C18070vi.A0X(secondaryActivityStack);
        List activities2 = secondaryActivityStack.getActivities();
        C18070vi.A0X(activities2);
        C25149Ca0 ca02 = new C25149Ca0(activities2, secondaryActivityStack.isEmpty());
        SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
        C18070vi.A0X(splitAttributes);
        return new C25195Cam(C26275CwR.A03, ca0, ca02, C26275CwR.A01(splitAttributes));
    }

    public C25041CUu(C26275CwR cwR) {
        this.A00 = cwR;
    }
}
