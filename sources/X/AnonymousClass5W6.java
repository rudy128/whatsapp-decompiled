package X;

import com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet;

/* renamed from: X.5W6  reason: invalid class name */
public final class AnonymousClass5W6 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5W6(AdhocParticipantBottomSheet adhocParticipantBottomSheet) {
        super(2);
        this.this$0 = adhocParticipantBottomSheet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        if (X.AnonymousClass000.A0M(r3.getValue()) < r5.A04) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            boolean r6 = X.AnonymousClass000.A1Y(r13)
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet r0 = r11.this$0
            X.0vl r0 = r0.A0B
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r5 = (com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel) r5
            X.1G4 r4 = r5.A0I
            java.lang.Object r0 = r4.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x001e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.4UT r1 = (X.AnonymousClass4UT) r1
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.1E7 r0 = r1.A02
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0w(r0)
            boolean r0 = X.C18070vi.A18(r0, r12)
            if (r0 == 0) goto L_0x001e
        L_0x0039:
            X.4UT r2 = (X.AnonymousClass4UT) r2
            if (r2 == 0) goto L_0x003f
            r2.A01 = r6
        L_0x003f:
            X.1G4 r3 = r5.A0H
            java.lang.Object r1 = r4.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x00ac
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ac
        L_0x0055:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.setValue(r0)
            java.lang.Object r0 = r4.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r9 = X.C29351c6.A0D(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x006a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r7 = r10.next()
            X.4UT r7 = (X.AnonymousClass4UT) r7
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.1E7 r8 = r7.A02
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0w(r8)
            boolean r0 = X.C18070vi.A18(r0, r12)
            if (r0 == 0) goto L_0x0090
            java.lang.String r1 = r7.A03
            r0 = 1
            X.4UT r7 = new X.4UT
            r7.<init>(r8, r1, r6, r0)
        L_0x008c:
            r9.add(r7)
            goto L_0x006a
        L_0x0090:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x00a1
            java.lang.Object r0 = r3.getValue()
            int r1 = X.AnonymousClass000.A0M(r0)
            int r0 = r5.A04
            r2 = 0
            if (r1 >= r0) goto L_0x00a2
        L_0x00a1:
            r2 = 1
        L_0x00a2:
            java.lang.String r1 = r7.A03
            boolean r0 = r7.A01
            X.4UT r7 = new X.4UT
            r7.<init>(r8, r1, r0, r2)
            goto L_0x008c
        L_0x00ac:
            java.util.Iterator r1 = r1.iterator()
        L_0x00b0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r1.next()
            X.4UT r0 = (X.AnonymousClass4UT) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00b0
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x00b0
            X.AnonymousClass1ZU.A0A()
            r0 = 0
            throw r0
        L_0x00c9:
            r2 = 0
            goto L_0x0039
        L_0x00cc:
            r4.setValue(r9)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5W6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
