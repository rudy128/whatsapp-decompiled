package com.whatsapp.community;

import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.SelectCommunityForGroupViewModel$linkGroup$1", f = "SelectCommunityForGroupViewModel.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
public final class SelectCommunityForGroupViewModel$linkGroup$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ AnonymousClass1EC $parentGroupJid;
    public final /* synthetic */ boolean $shouldBeHiddenSubgroup;
    public int label;
    public final /* synthetic */ SelectCommunityForGroupViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectCommunityForGroupViewModel$linkGroup$1(SelectCommunityForGroupViewModel selectCommunityForGroupViewModel, AnonymousClass1EC r3, AnonymousClass1EC r4, C30391dr r5, boolean z) {
        super(2, r5);
        this.$shouldBeHiddenSubgroup = z;
        this.$groupJid = r3;
        this.this$0 = selectCommunityForGroupViewModel;
        this.$parentGroupJid = r4;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        boolean z = this.$shouldBeHiddenSubgroup;
        return new SelectCommunityForGroupViewModel$linkGroup$1(this.this$0, this.$groupJid, this.$parentGroupJid, r8, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d5, code lost:
        if (r3.intValue() == -1) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r4 = 1
            if (r0 == 0) goto L_0x0109
            if (r0 != r4) goto L_0x0136
            X.C30691eM.A01(r9)
        L_0x000c:
            X.4Eb r9 = (X.C83164Eb) r9
            com.whatsapp.community.SelectCommunityForGroupViewModel r0 = r8.this$0
            X.1CJ r1 = r0.A03
            X.1EC r0 = r8.$groupJid
            java.lang.String r7 = r1.A0F(r0)
            boolean r2 = r9 instanceof X.AnonymousClass41A
            if (r2 == 0) goto L_0x005b
            r0 = r9
            X.41A r0 = (X.AnonymousClass41A) r0
            int r1 = r0.A00
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L_0x005b
            com.whatsapp.community.SelectCommunityForGroupViewModel r0 = r8.this$0
            X.1G4 r6 = r0.A05
        L_0x0029:
            java.lang.Object r5 = r6.getValue()
            r3 = r5
            X.4FI r3 = (X.AnonymousClass4FI) r3
            r2 = 0
            if (r7 != 0) goto L_0x0053
            r1 = 2131886652(0x7f12023c, float:1.9407889E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
        L_0x0038:
            X.6IR r0 = X.C1402670q.A02(r0, r1)
            X.4Sh r2 = new X.4Sh
            r2.<init>(r0)
            X.4Y9 r1 = r3.A00()
            X.3pW r0 = new X.3pW
            r0.<init>(r1, r2)
            boolean r0 = r6.BFK(r5, r0)
            if (r0 == 0) goto L_0x0029
        L_0x0050:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0053:
            r1 = 2131886651(0x7f12023b, float:1.9407887E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r2] = r7
            goto L_0x0038
        L_0x005b:
            r5 = 0
            if (r2 == 0) goto L_0x00af
            X.41A r9 = (X.AnonymousClass41A) r9
            int r1 = r9.A00
            r0 = 419(0x1a3, float:5.87E-43)
            if (r1 == r0) goto L_0x00a6
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 != r0) goto L_0x00d7
            r1 = 2131896803(0x7f1229e3, float:1.9428478E38)
        L_0x006d:
            java.lang.Object[] r0 = new java.lang.Object[r5]
        L_0x006f:
            X.6IR r0 = X.C1402670q.A02(r0, r1)
            X.4Sh r6 = new X.4Sh
            r6.<init>(r0)
        L_0x0078:
            com.whatsapp.community.SelectCommunityForGroupViewModel r7 = r8.this$0
            X.1G4 r5 = r7.A05
        L_0x007c:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.4FI r3 = (X.AnonymousClass4FI) r3
            X.1ub r0 = r7.A01
            if (r6 != 0) goto L_0x009b
            r0.A06()
            r2 = 0
            X.4Y9 r1 = r3.A00()
            X.3pV r0 = new X.3pV
            r0.<init>(r1, r2)
        L_0x0094:
            boolean r0 = r5.BFK(r4, r0)
            if (r0 == 0) goto L_0x007c
            goto L_0x0050
        L_0x009b:
            r0.A05()
            r1 = 0
            X.5Vr r0 = X.C106395Vr.A00
            X.3pX r0 = r3.A01(r6, r1, r0, r1)
            goto L_0x0094
        L_0x00a6:
            r1 = 2131890315(0x7f12108b, float:1.9415318E38)
            if (r7 == 0) goto L_0x006d
            r1 = 2131890314(0x7f12108a, float:1.9415316E38)
            goto L_0x00df
        L_0x00af:
            boolean r0 = r9 instanceof X.AnonymousClass41D
            if (r0 == 0) goto L_0x00d7
            X.41D r9 = (X.AnonymousClass41D) r9
            java.util.Set r1 = r9.A00
            java.lang.Object r0 = X.C29431cG.A0Y(r1)
            android.util.Pair r0 = (android.util.Pair) r0
            r6 = 0
            if (r0 == 0) goto L_0x0107
            java.lang.Object r3 = r0.second
            java.lang.Number r3 = (java.lang.Number) r3
        L_0x00c4:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00e4
        L_0x00ce:
            if (r3 == 0) goto L_0x00d7
            int r1 = r3.intValue()
            r0 = -1
            if (r1 == r0) goto L_0x0078
        L_0x00d7:
            r1 = 2131890318(0x7f12108e, float:1.9415324E38)
            if (r7 == 0) goto L_0x006d
            r1 = 2131890319(0x7f12108f, float:1.9415326E38)
        L_0x00df:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r7
            goto L_0x006f
        L_0x00e4:
            java.util.Iterator r2 = r1.iterator()
        L_0x00e8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r2.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00e8
            int r1 = r0.intValue()
            r0 = 433(0x1b1, float:6.07E-43)
            if (r1 != r0) goto L_0x00e8
            r1 = 2131894266(0x7f121ffa, float:1.9423332E38)
            goto L_0x006d
        L_0x0107:
            r3 = r6
            goto L_0x00c4
        L_0x0109:
            X.C30691eM.A01(r9)
            boolean r0 = r8.$shouldBeHiddenSubgroup
            if (r0 == 0) goto L_0x0133
            X.1EC r0 = r8.$groupJid
            java.lang.String r0 = r0.getRawString()
            java.util.List r3 = X.C18070vi.A0M(r0)
        L_0x011a:
            com.whatsapp.community.SelectCommunityForGroupViewModel r0 = r8.this$0
            X.4Xg r2 = r0.A00
            X.1EC r1 = r8.$parentGroupJid
            X.1EC r0 = r8.$groupJid
            java.lang.String r0 = r0.getRawString()
            java.util.List r0 = X.C18070vi.A0M(r0)
            r8.label = r4
            java.lang.Object r9 = r2.A01(r1, r0, r3, r8)
            if (r9 != r5) goto L_0x000c
            return r5
        L_0x0133:
            X.0wS r3 = X.C18460wS.A00
            goto L_0x011a
        L_0x0136:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.SelectCommunityForGroupViewModel$linkGroup$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SelectCommunityForGroupViewModel$linkGroup$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
