package com.whatsapp.community.communitysettings;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass4CR;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C41111vp;
import X.C85674Oh;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.communitysettings.AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1", f = "AllowNonAdminGroupCreationManager.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41111vp $allowUiState;
    public final /* synthetic */ AnonymousClass4CR $currentSetting;
    public final /* synthetic */ AnonymousClass4CR $desiredSetting;
    public final /* synthetic */ boolean $isNonAdminSubgroupCreationAllowed;
    public final /* synthetic */ AnonymousClass1EC $parentGroupJid;
    public int label;
    public final /* synthetic */ C85674Oh this$0;

    @DebugMetadata(c = "com.whatsapp.community.communitysettings.AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1$1", f = "AllowNonAdminGroupCreationManager.kt", i = {}, l = {69, 75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.communitysettings.AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r10) {
            C85674Oh r1 = C85674Oh.this;
            AnonymousClass1EC r4 = r7;
            boolean z = z;
            return new AnonymousClass1(r5, r6, r4, r8, r10, z);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r6.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L_0x005b
                if (r0 == r4) goto L_0x0083
                if (r0 != r5) goto L_0x009e
                X.C30691eM.A01(r7)
            L_0x000f:
                X.3or r0 = X.C76943or.A00
            L_0x0011:
                boolean r0 = X.C18070vi.A18(r7, r0)
                X.1vp r2 = r8
                if (r0 == 0) goto L_0x0053
                X.4CR r1 = r5
                java.lang.Integer r0 = X.AnonymousClass00R.A0C
                X.C88274Za.A01(r2, r1, r0)
                X.4Oh r4 = X.C85674Oh.this
                boolean r2 = r10
                X.1EC r1 = r7
                X.00H r0 = r4.A04
                java.lang.Object r3 = r0.get()
                X.1ub r3 = (X.C40371ub) r3
                X.1gd r0 = r4.A00
                int r0 = r0.BVA(r1)
                java.lang.Integer r0 = X.C40371ub.A01(r0)
                if (r2 == 0) goto L_0x004a
                if (r0 == 0) goto L_0x0047
                int r2 = r0.intValue()
                r1 = 19
            L_0x0042:
                r0 = 8
                X.C40371ub.A03(r3, r1, r0, r2)
            L_0x0047:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x004a:
                if (r0 == 0) goto L_0x0047
                int r2 = r0.intValue()
                r1 = 18
                goto L_0x0042
            L_0x0053:
                X.4CR r1 = r6
                java.lang.Integer r0 = X.AnonymousClass00R.A0N
                X.C88274Za.A01(r2, r1, r0)
                goto L_0x0047
            L_0x005b:
                X.C30691eM.A01(r7)
                X.4Oh r0 = X.C85674Oh.this
                X.0ve r2 = r0.A01
                r1 = 7609(0x1db9, float:1.0662E-41)
                X.0vf r0 = X.C18040vf.A02
                boolean r1 = X.C18020vd.A05(r0, r2, r1)
                X.4Oh r0 = X.C85674Oh.this
                if (r1 == 0) goto L_0x0089
                X.00H r0 = r0.A02
                java.lang.Object r2 = r0.get()
                com.whatsapp.community.mex.AllowNonAdminSubGroupCreationGraphQlHandler r2 = (com.whatsapp.community.mex.AllowNonAdminSubGroupCreationGraphQlHandler) r2
                X.1EC r1 = r7
                boolean r0 = r10
                r6.label = r4
                java.lang.Object r7 = r2.A00(r1, r6, r0)
                if (r7 != r3) goto L_0x0086
                return r3
            L_0x0083:
                X.C30691eM.A01(r7)
            L_0x0086:
                X.3ps r0 = X.C77343ps.A00
                goto L_0x0011
            L_0x0089:
                X.00H r0 = r0.A03
                java.lang.Object r2 = r0.get()
                com.whatsapp.community.AllowNonAdminSubGroupCreationProtocolHelper r2 = (com.whatsapp.community.AllowNonAdminSubGroupCreationProtocolHelper) r2
                X.1EC r1 = r7
                boolean r0 = r10
                r6.label = r5
                java.lang.Object r7 = r2.A00(r1, r6, r0)
                if (r7 != r3) goto L_0x000f
                return r3
            L_0x009e:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.communitysettings.AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1(C85674Oh r2, AnonymousClass4CR r3, AnonymousClass4CR r4, AnonymousClass1EC r5, C41111vp r6, C30391dr r7, boolean z) {
        super(2, r7);
        this.this$0 = r2;
        this.$parentGroupJid = r5;
        this.$isNonAdminSubgroupCreationAllowed = z;
        this.$allowUiState = r6;
        this.$desiredSetting = r3;
        this.$currentSetting = r4;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        C85674Oh r1 = this.this$0;
        AnonymousClass1EC r4 = this.$parentGroupJid;
        boolean z = this.$isNonAdminSubgroupCreationAllowed;
        return new AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1(r1, this.$desiredSetting, this.$currentSetting, r4, this.$allowUiState, r10, z);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C85674Oh r4 = this.this$0;
            C18600wl r0 = r4.A05;
            final AnonymousClass1EC r7 = this.$parentGroupJid;
            final boolean z = this.$isNonAdminSubgroupCreationAllowed;
            final C41111vp r8 = this.$allowUiState;
            final AnonymousClass4CR r5 = this.$desiredSetting;
            final AnonymousClass4CR r6 = this.$currentSetting;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
