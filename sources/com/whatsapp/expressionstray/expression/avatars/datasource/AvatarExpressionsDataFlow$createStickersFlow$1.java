package com.whatsapp.expressionstray.expression.avatars.datasource;

import X.AnonymousClass20I;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$createStickersFlow$1", f = "AvatarExpressionsDataFlow.kt", i = {0, 0, 0, 0}, l = {202}, m = "invokeSuspend", n = {"allStickerViewItems", "socialStickersItems", "recentsViewItems", "starredViewItems"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class AvatarExpressionsDataFlow$createStickersFlow$1 extends C30431dv implements AnonymousClass20I {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public /* synthetic */ Object L$4;
    public int label;
    public final /* synthetic */ AvatarExpressionsDataFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$createStickersFlow$1(AvatarExpressionsDataFlow avatarExpressionsDataFlow, C30391dr r3) {
        super(6, r3);
        this.this$0 = avatarExpressionsDataFlow;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        AvatarExpressionsDataFlow$createStickersFlow$1 avatarExpressionsDataFlow$createStickersFlow$1 = new AvatarExpressionsDataFlow$createStickersFlow$1(this.this$0, (C30391dr) obj6);
        avatarExpressionsDataFlow$createStickersFlow$1.L$0 = obj;
        avatarExpressionsDataFlow$createStickersFlow$1.L$1 = obj2;
        avatarExpressionsDataFlow$createStickersFlow$1.L$2 = obj3;
        avatarExpressionsDataFlow$createStickersFlow$1.L$3 = obj4;
        avatarExpressionsDataFlow$createStickersFlow$1.L$4 = obj5;
        return avatarExpressionsDataFlow$createStickersFlow$1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r14.label
            r8 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r8) goto L_0x0228
            java.lang.Object r3 = r14.L$3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r6 = r14.L$2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r11 = r14.L$1
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r7 = r14.L$0
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            X.C30691eM.A01(r15)
        L_0x001c:
            boolean r0 = X.AnonymousClass000.A1Y(r15)
            if (r0 == 0) goto L_0x0047
            X.6Do r2 = X.C120406Do.A00
            java.lang.String r0 = r2.toString()
            X.612 r1 = new X.612
            r1.<init>(r2, r0)
            X.60i r0 = new X.60i
            r0.<init>(r1)
            java.util.List r0 = X.C18070vi.A0M(r0)
        L_0x0036:
            java.util.ArrayList r0 = X.C29431cG.A0k(r6, r0)
            java.util.ArrayList r0 = X.C29431cG.A0k(r3, r0)
            java.util.ArrayList r0 = X.C29431cG.A0k(r11, r0)
            java.util.ArrayList r0 = X.C29431cG.A0k(r7, r0)
            return r0
        L_0x0047:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0036
        L_0x004a:
            X.C30691eM.A01(r15)
            java.lang.Object r11 = r14.L$0
            X.6T7 r11 = (X.AnonymousClass6T7) r11
            java.lang.Object r10 = r14.L$1
            java.lang.Object r6 = r14.L$2
            X.6Tu r6 = (X.C123276Tu) r6
            java.lang.Object r5 = r14.L$3
            X.6Tv r5 = (X.C123286Tv) r5
            java.lang.Object r7 = r14.L$4
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r0 = r14.this$0
            X.00H r0 = r0.A04
            java.lang.Object r12 = r0.get()
            X.72p r12 = (X.C1406972p) r12
            X.C108975cc.A12(r11, r10, r8)
            boolean r0 = r11 instanceof X.C117365zf
            if (r0 != 0) goto L_0x0224
            X.6Dr r4 = X.C120436Dr.A00
            java.lang.String r0 = r4.toString()
            X.612 r3 = new X.612
            r3.<init>(r4, r0)
            boolean r2 = r10 instanceof X.AnonymousClass6EQ
            boolean r1 = r11 instanceof X.C117345zd
            boolean r0 = r10 instanceof X.AnonymousClass6ER
            if (r0 != 0) goto L_0x0224
            if (r2 != 0) goto L_0x01d4
            if (r1 != 0) goto L_0x01d4
            X.5ze r11 = (X.C117355ze) r11
            java.util.List r1 = r11.A00
            java.lang.String r0 = r12.A03(r4)
            X.DcQ r11 = X.C1406972p.A02(r4, r0, r1)
        L_0x0093:
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r0 = r14.this$0
            X.00H r0 = r0.A04
            java.lang.Object r13 = r0.get()
            X.72p r13 = (X.C1406972p) r13
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.6Do r12 = X.C120406Do.A00
            java.lang.String r0 = r12.toString()
            X.612 r4 = new X.612
            r4.<init>(r12, r0)
            boolean r3 = r10 instanceof X.AnonymousClass6ER
            if (r3 != 0) goto L_0x01d0
            boolean r0 = r6 instanceof X.AnonymousClass6I0
            if (r0 != 0) goto L_0x01d0
            boolean r0 = r10 instanceof X.AnonymousClass6EP
            if (r0 == 0) goto L_0x0170
            boolean r0 = r6 instanceof X.C121166Hz
            if (r0 == 0) goto L_0x0170
            X.6Hz r6 = (X.C121166Hz) r6
            java.util.List r1 = r6.A00
            java.lang.String r0 = r13.A03(r12)
            X.DcQ r6 = X.C1406972p.A02(r12, r0, r1)
        L_0x00c8:
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r0 = r14.this$0
            X.00H r0 = r0.A04
            java.lang.Object r2 = r0.get()
            X.72p r2 = (X.C1406972p) r2
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.6Dq r12 = X.C120426Dq.A00
            java.lang.String r0 = r12.toString()
            X.612 r4 = new X.612
            r4.<init>(r12, r0)
            if (r3 != 0) goto L_0x016d
            boolean r0 = r5 instanceof X.AnonymousClass6I3
            if (r0 != 0) goto L_0x016d
            boolean r0 = r10 instanceof X.AnonymousClass6EP
            if (r0 == 0) goto L_0x010e
            boolean r0 = r5 instanceof X.AnonymousClass6I2
            if (r0 == 0) goto L_0x010e
            X.6I2 r5 = (X.AnonymousClass6I2) r5
            java.util.List r1 = r5.A00
            java.lang.String r0 = r2.A03(r12)
            X.DcQ r3 = X.C1406972p.A02(r12, r0, r1)
        L_0x00fb:
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r0 = r14.this$0
            r14.L$0 = r7
            r14.L$1 = r11
            r14.L$2 = r6
            r14.L$3 = r3
            r14.label = r8
            java.lang.Object r15 = r0.A01(r14)
            if (r15 != r9) goto L_0x001c
            return r9
        L_0x010e:
            boolean r0 = r10 instanceof X.AnonymousClass6EQ
            if (r0 == 0) goto L_0x013d
            boolean r0 = r5 instanceof X.AnonymousClass6I2
            if (r0 == 0) goto L_0x013d
            X.DcQ r10 = X.AnonymousClass1ZT.A01()
            X.6I2 r5 = (X.AnonymousClass6I2) r5
            java.util.List r1 = r5.A00
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0168
            X.C138756xd.A01(r2, r4, r12, r10)
            java.util.Iterator r1 = r1.iterator()
        L_0x012b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0168
            X.77d r0 = X.C108945cZ.A0x(r1)
            java.lang.String r0 = X.C1406972p.A01(r12, r0)
            X.C1177160r.A00(r4, r0, r10)
            goto L_0x012b
        L_0x013d:
            X.DcQ r10 = X.AnonymousClass1ZT.A01()
            X.C138756xd.A01(r2, r4, r12, r10)
            X.0ve r0 = r2.A00
            int r3 = X.C108995ce.A04(r0)
            r2 = 0
        L_0x014b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "loading-avatar-sticker-"
            r1.append(r0)
            r1.append(r12)
            r0 = 45
            r1.append(r0)
            java.lang.String r0 = X.C17880vN.A0t(r1, r2)
            X.C1177160r.A00(r4, r0, r10)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0168
            goto L_0x014b
        L_0x0168:
            X.DcQ r3 = X.AnonymousClass1ZT.A02(r10)
            goto L_0x00fb
        L_0x016d:
            X.0wS r3 = X.C18460wS.A00
            goto L_0x00fb
        L_0x0170:
            boolean r0 = r10 instanceof X.AnonymousClass6EQ
            if (r0 == 0) goto L_0x019f
            boolean r0 = r6 instanceof X.C121166Hz
            if (r0 == 0) goto L_0x019f
            X.DcQ r2 = X.AnonymousClass1ZT.A01()
            X.6Hz r6 = (X.C121166Hz) r6
            java.util.List r1 = r6.A00
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x01ca
            X.C138756xd.A01(r13, r4, r12, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x018d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ca
            X.77d r0 = X.C108945cZ.A0x(r1)
            java.lang.String r0 = X.C1406972p.A01(r12, r0)
            X.C1177160r.A00(r4, r0, r2)
            goto L_0x018d
        L_0x019f:
            X.DcQ r2 = X.AnonymousClass1ZT.A01()
            X.C138756xd.A01(r13, r4, r12, r2)
            X.0ve r0 = r13.A00
            int r6 = X.C108995ce.A04(r0)
            r1 = 0
        L_0x01ad:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r0 = "loading-avatar-sticker-"
            r13.append(r0)
            r13.append(r12)
            r0 = 45
            r13.append(r0)
            java.lang.String r0 = X.C17880vN.A0t(r13, r1)
            X.C1177160r.A00(r4, r0, r2)
            int r1 = r1 + 1
            if (r1 >= r6) goto L_0x01ca
            goto L_0x01ad
        L_0x01ca:
            X.DcQ r6 = X.AnonymousClass1ZT.A02(r2)
            goto L_0x00c8
        L_0x01d0:
            X.0wS r6 = X.C18460wS.A00
            goto L_0x00c8
        L_0x01d4:
            X.DcQ r2 = X.AnonymousClass1ZT.A01()
            X.C138756xd.A01(r12, r3, r4, r2)
            if (r1 == 0) goto L_0x0200
            r0 = r11
            X.5zd r0 = (X.C117345zd) r0
            int r12 = r0.A00
            r1 = 0
        L_0x01e3:
            if (r1 >= r12) goto L_0x0200
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r0 = "loading-avatar-sticker-"
            r13.append(r0)
            r13.append(r4)
            r0 = 45
            r13.append(r0)
            java.lang.String r0 = X.C17880vN.A0t(r13, r1)
            X.C1177160r.A00(r3, r0, r2)
            int r1 = r1 + 1
            goto L_0x01e3
        L_0x0200:
            boolean r0 = r11 instanceof X.C117355ze
            if (r0 == 0) goto L_0x021e
            X.5ze r11 = (X.C117355ze) r11
            java.util.List r0 = r11.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x020c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x021e
            X.77d r0 = X.C108945cZ.A0x(r1)
            java.lang.String r0 = X.C1406972p.A01(r4, r0)
            X.C1177160r.A00(r3, r0, r2)
            goto L_0x020c
        L_0x021e:
            X.DcQ r11 = X.AnonymousClass1ZT.A02(r2)
            goto L_0x0093
        L_0x0224:
            X.0wS r11 = X.C18460wS.A00
            goto L_0x0093
        L_0x0228:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$createStickersFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
