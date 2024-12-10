package X;

/* renamed from: X.4VJ  reason: invalid class name */
public final class AnonymousClass4VJ {
    public final int A00;
    public final C18030ve A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7, 5292) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r8 == 2) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7, 5317) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4VJ(X.C18030ve r7, int r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            r6 = this;
            r3 = 1
            r6.<init>()
            r6.A01 = r7
            r6.A06 = r9
            r6.A05 = r10
            r6.A00 = r8
            r6.A07 = r11
            r6.A0H = r12
            r6.A0B = r13
            r6.A08 = r14
            r5 = 2
            r4 = 0
            if (r8 == r3) goto L_0x001b
            r2 = 0
            if (r8 != r5) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            r6.A09 = r2
            if (r2 == 0) goto L_0x002b
            r1 = 5317(0x14c5, float:7.451E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r7, r1)
            r0 = 1
            if (r1 != 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r6.A0A = r0
            if (r2 == 0) goto L_0x003b
            r1 = 5292(0x14ac, float:7.416E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r7, r1)
            r0 = 1
            if (r1 != 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r6.A0C = r0
            r0 = 6091(0x17cb, float:8.535E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r7, r0)
            r6.A0G = r0
            r0 = 6089(0x17c9, float:8.533E-42)
            boolean r0 = X.C18020vd.A05(r2, r7, r0)
            r6.A0F = r0
            r1 = 7397(0x1ce5, float:1.0365E-41)
            int r0 = X.C18020vd.A00(r2, r7, r1)
            boolean r0 = X.AnonymousClass000.A1T(r0, r3)
            r6.A0D = r0
            int r0 = X.C18020vd.A00(r2, r7, r1)
            if (r0 != r5) goto L_0x0063
            r4 = 1
        L_0x0063:
            r6.A0E = r4
            r0 = 36
            X.0vm r0 = X.C99144sL.A01(r6, r0)
            r6.A03 = r0
            r0 = 37
            X.0vm r0 = X.C99144sL.A01(r6, r0)
            r6.A02 = r0
            r0 = 38
            X.0vm r0 = X.C99144sL.A01(r6, r0)
            r6.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VJ.<init>(X.0ve, int, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VJ) {
                AnonymousClass4VJ r5 = (AnonymousClass4VJ) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A00 == r5.A00 && this.A07 == r5.A07 && this.A0H == r5.A0H && this.A0B == r5.A0B && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A06), this.A05) + this.A00) * 31, this.A07), this.A0H), this.A0B), this.A08);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PushToRecordConfig(abProps=");
        A10.append(this.A01);
        A10.append(", canSendVoiceMessages=");
        A10.append(this.A06);
        A10.append(", canSendPushToVideoMessages=");
        A10.append(this.A05);
        A10.append(", conversationEntryActionButtonTapAction=");
        A10.append(this.A00);
        A10.append(", isCameraButtonEntryEnabled=");
        A10.append(this.A07);
        A10.append(", recorderModeMenuHasTitle=");
        A10.append(this.A0H);
        A10.append(", isConversationEntryActionButtonRecorderModeChangedTooltipEnabled=");
        A10.append(this.A0B);
        A10.append(", isCameraButtonInstantLock=");
        return C17900vP.A0F(A10, this.A08);
    }
}
