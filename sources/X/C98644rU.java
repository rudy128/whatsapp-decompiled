package X;

import android.widget.LinearLayout;
import com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment;
import java.util.List;

/* renamed from: X.4rU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98644rU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ LinearLayout A02;
    public final /* synthetic */ GroupMemberSuggestionsDebugDialogFragment A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            android.widget.LinearLayout r2 = r10.A02
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment r7 = r10.A03
            java.util.List r9 = r10.A04
            long r0 = r10.A01
            java.util.List r8 = r10.A05
            int r5 = r10.A00
            r4 = 2
            r2.removeAllViews()
            X.1CJ r3 = r7.A04
            if (r3 == 0) goto L_0x0117
            X.1EC r2 = r7.A07
            int r3 = r3.A06(r2)
            if (r3 == r4) goto L_0x009f
            r2 = 3
            if (r3 == r2) goto L_0x009c
            r2 = 6
            if (r3 != r2) goto L_0x0039
            java.lang.String r4 = "general group"
        L_0x0024:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "This is a "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ", group member suggestions are not available, still showing for testing purpose."
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r3)
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment.A00(r7, r2)
        L_0x0039:
            X.1EC r2 = r7.A07
            if (r2 == 0) goto L_0x0052
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "* Excluded "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = " contacts in this group"
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r3)
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment.A00(r7, r2)
        L_0x0052:
            java.lang.String r2 = "Final Suggested Results"
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment.A01(r7, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r6 = "Result count: "
            X.C17890vO.A15(r6, r2, r9)
            java.lang.String r5 = ", query latency ms: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment.A00(r7, r0)
            java.util.Iterator r4 = r9.iterator()
            r3 = 0
        L_0x0074:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a2
            int r3 = r3 + 1
            X.1E7 r2 = X.C17880vN.A0O(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r3)
            java.lang.String r0 = ". "
            r1.append(r0)
            java.lang.String r0 = r2.A0K()
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = r2.A0c
        L_0x0094:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment.A00(r7, r0)
            goto L_0x0074
        L_0x009c:
            java.lang.String r4 = "CAG"
            goto L_0x0024
        L_0x009f:
            java.lang.String r4 = "subgroup"
            goto L_0x0024
        L_0x00a2:
            if (r8 == 0) goto L_0x0116
            java.util.Iterator r8 = r8.iterator()
        L_0x00a8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r0 = r8.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r2 = r0.first
            X.4DU r2 = (X.AnonymousClass4DU) r2
            java.lang.Object r3 = r0.second
            X.4Ti r3 = (X.C86854Ti) r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Bucket: "
            r1.append(r0)
            java.lang.String r0 = r2.name()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment.A01(r7, r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r6)
            java.util.List r1 = r3.A01
            int r0 = r1.size()
            r2.append(r0)
            r2.append(r5)
            java.lang.Long r0 = r3.A00
            java.lang.String r0 = X.C17890vO.A0V(r0, r2)
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment.A00(r7, r0)
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        L_0x00ee:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a8
            int r3 = r3 + 1
            X.1E7 r2 = X.C17880vN.A0O(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r3)
            java.lang.String r0 = ". "
            r1.append(r0)
            java.lang.String r0 = r2.A0K()
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = r2.A0c
        L_0x010e:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment.A00(r7, r0)
            goto L_0x00ee
        L_0x0116:
            return
        L_0x0117:
            X.AnonymousClass3MW.A1I()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98644rU.run():void");
    }

    public /* synthetic */ C98644rU(LinearLayout linearLayout, GroupMemberSuggestionsDebugDialogFragment groupMemberSuggestionsDebugDialogFragment, List list, List list2, int i, long j) {
        this.A02 = linearLayout;
        this.A03 = groupMemberSuggestionsDebugDialogFragment;
        this.A04 = list;
        this.A01 = j;
        this.A05 = list2;
        this.A00 = i;
    }
}
