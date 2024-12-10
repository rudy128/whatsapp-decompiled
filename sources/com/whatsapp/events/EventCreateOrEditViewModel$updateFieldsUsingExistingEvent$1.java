package com.whatsapp.events;

import X.AnonymousClass1OS;
import X.AnonymousClass3VY;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1", f = "EventCreateOrEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass3VY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1(AnonymousClass3VY r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r2 = r24
            int r0 = r2.label
            if (r0 != 0) goto L_0x012a
            X.C30691eM.A01(r25)
            X.3VY r1 = r2.this$0
            X.1W6 r0 = r1.A0G
            X.205 r1 = r1.A0F
            X.1W2 r0 = r0.A01
            X.206 r1 = r0.A05(r1)
            X.23z r1 = (X.C445823z) r1
            if (r1 == 0) goto L_0x011c
            r8 = 0
            X.3VY r0 = r2.this$0
            X.4Yr r0 = r0.A0A
            java.lang.String r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0056
            r9 = 0
            r17 = 0
            r23 = 0
            com.whatsapp.location.PlaceInfo r8 = new com.whatsapp.location.PlaceInfo
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r21 = r17
            r10 = r9
            r19 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23)
            X.9rg r3 = r1.A01
            if (r3 == 0) goto L_0x0127
            java.lang.String r0 = r3.A02
        L_0x0040:
            r8.A06 = r0
            if (r3 == 0) goto L_0x0124
            java.lang.String r0 = r3.A01
        L_0x0046:
            r8.A04 = r0
            if (r3 == 0) goto L_0x0056
            X.9qf r0 = r3.A00
            if (r0 == 0) goto L_0x0056
            double r3 = r0.A00
            r8.A01 = r3
            double r3 = r0.A01
            r8.A02 = r3
        L_0x0056:
            r15 = 1
            r14 = 1
            X.3VY r0 = r2.this$0
            X.4Yk r0 = r0.A0B
            X.0ve r4 = r0.A03
            r3 = 7420(0x1cfc, float:1.0398E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r3)
            r7 = 0
            if (r0 == 0) goto L_0x0094
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0094
            java.util.List r3 = r1.A18()
            if (r3 == 0) goto L_0x0094
            X.3VY r0 = r2.this$0
            X.4Yk r5 = r0.A0B
            java.util.Iterator r4 = r3.iterator()
        L_0x007b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r4.next()
            X.24H r0 = (X.AnonymousClass24H) r0
            X.2Qx r3 = r0.A02
            if (r3 == 0) goto L_0x007b
            int r0 = r0.A00
            boolean r0 = r5.A03(r3, r0)
            if (r0 == 0) goto L_0x007b
            r14 = 0
        L_0x0094:
            X.3VY r0 = r2.this$0
            X.1G4 r6 = r0.A0L
        L_0x0098:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.4YY r0 = (X.AnonymousClass4YY) r0
            X.23z r4 = r0.A00
            java.lang.Integer r3 = r0.A03
            X.4YY r0 = new X.4YY
            r9 = r0
            r10 = r1
            r11 = r4
            r12 = r8
            r13 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            boolean r0 = r6.BFK(r5, r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String r3 = r1.A05
            if (r3 == 0) goto L_0x00ea
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00ea
            X.3VY r0 = r2.this$0
            X.1i4 r0 = r0.A09
            boolean r0 = r0.A0I(r3)
            if (r0 == 0) goto L_0x00ea
            X.3VY r5 = r2.this$0
            X.1G4 r4 = r5.A0K
        L_0x00cb:
            java.lang.Object r3 = r4.getValue()
            java.lang.Integer r11 = X.AnonymousClass00R.A00
            java.lang.String r12 = r1.A05
            long r13 = r1.A00
            X.1i4 r0 = r5.A09
            boolean r0 = r0.A0L(r12)
            if (r0 == 0) goto L_0x0121
            X.4CW r10 = X.AnonymousClass4CW.WA_VIDEO_CALL
        L_0x00df:
            X.4Zf r9 = new X.4Zf
            r9.<init>(r10, r11, r12, r13, r15)
            boolean r0 = r4.BFK(r3, r9)
            if (r0 == 0) goto L_0x00cb
        L_0x00ea:
            X.3VY r0 = r2.this$0
            X.1Qe r4 = r0.A0C
            X.25F[] r3 = new X.AnonymousClass25F[r15]
            X.25F r0 = r1.A09
            r3[r7] = r0
            r4.A0A(r3)
            X.21d r4 = r1.A17()
            if (r4 == 0) goto L_0x011c
            X.3VY r1 = r2.this$0
            X.1G1 r3 = r1.A0N
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<com.whatsapp.events.EventCreateOrEditViewModel.CoverImageState>"
            X.C18070vi.A0z(r3, r0)
            X.1G3 r3 = (X.AnonymousClass1G3) r3
            X.2il r0 = r1.A0D
            boolean r2 = r0.A00()
            X.2rc r0 = r4.A02
            if (r0 == 0) goto L_0x011f
            java.io.File r1 = r0.A0G
        L_0x0114:
            X.4Tb r0 = new X.4Tb
            r0.<init>(r1, r2)
            r3.CPw(r0)
        L_0x011c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x011f:
            r1 = 0
            goto L_0x0114
        L_0x0121:
            X.4CW r10 = X.AnonymousClass4CW.WA_VOICE_CALL
            goto L_0x00df
        L_0x0124:
            r0 = 0
            goto L_0x0046
        L_0x0127:
            r0 = 0
            goto L_0x0040
        L_0x012a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
