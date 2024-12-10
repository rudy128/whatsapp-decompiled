package com.whatsapp.pancake;

import X.AnonymousClass000;
import X.AnonymousClass1OQ;
import X.AnonymousClass1OS;
import X.C145167Kf;
import X.C18560wh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pancake.CommonPearDelegate$pollParentConsentVerification$1", f = "CommonPearDelegate.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
public final class CommonPearDelegate$pollParentConsentVerification$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C145167Kf this$0;

    @DebugMetadata(c = "com.whatsapp.pancake.CommonPearDelegate$pollParentConsentVerification$1$1", f = "CommonPearDelegate.kt", i = {}, l = {77, 109}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.pancake.CommonPearDelegate$pollParentConsentVerification$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0023 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r5.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0011
                if (r0 == r2) goto L_0x0024
                if (r0 == r3) goto L_0x0011
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0011:
                X.C30691eM.A01(r6)
            L_0x0014:
                java.lang.System.currentTimeMillis()
                X.7Kf r0 = X.C145167Kf.this
                X.1Pd r0 = r0.A01
                r5.label = r2
                java.lang.Object r6 = r0.BMf(r5)
                if (r6 != r4) goto L_0x0027
                return r4
            L_0x0024:
                X.C30691eM.A01(r6)
            L_0x0027:
                X.84z r6 = (X.C1595584z) r6
                boolean r0 = r6 instanceof X.C143967Fm
                if (r0 != 0) goto L_0x0041
                boolean r0 = r6 instanceof X.C144007Fq
                if (r0 != 0) goto L_0x0041
                boolean r0 = r6 instanceof X.C143917Fh
                if (r0 == 0) goto L_0x0053
                X.7Fh r6 = (X.C143917Fh) r6
                java.lang.Integer r1 = r6.A00
                java.lang.Integer r0 = X.AnonymousClass00R.A0C
                if (r1 == r0) goto L_0x0041
                java.lang.Integer r0 = X.AnonymousClass00R.A0N
                if (r1 != r0) goto L_0x0053
            L_0x0041:
                X.7Kf r0 = X.C145167Kf.this
                X.1OD r0 = r0.A08
                r0.A10()
                X.7Kf r0 = X.C145167Kf.this
                java.util.concurrent.atomic.AtomicBoolean r1 = r0.A04
                r0 = 0
                r1.set(r0)
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0053:
                r5.label = r3
                r0 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r0 = X.C62882s9.A00(r5, r0)
                if (r0 != r4) goto L_0x0014
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pancake.CommonPearDelegate$pollParentConsentVerification$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonPearDelegate$pollParentConsentVerification$1(C145167Kf r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommonPearDelegate$pollParentConsentVerification$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommonPearDelegate$pollParentConsentVerification$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C145167Kf r0 = this.this$0;
            C18560wh A03 = AnonymousClass1OQ.A03(r0.A07, r0.A08);
            final C145167Kf r2 = this.this$0;
            AnonymousClass1 r02 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, A03, r02) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
